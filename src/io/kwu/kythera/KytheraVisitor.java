package io.kwu.kythera;

import io.kwu.kythera.antlr.KytheraBaseVisitor;
import io.kwu.kythera.antlr.KytheraParser;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.HashMap;
import java.util.List;

/* TODO consider separating each visitor into its own class
(did this at first, was messier, may be more useful as complexity increases)
 */
public class KytheraVisitor extends KytheraBaseVisitor<Value> {
	private KytheraParser parser;
	private Scope rootScope;
	private Scope currentScope;
	private HashMap<ParserRuleContext, Scope> scopes;


	public KytheraVisitor(KytheraParser parser) {
		this.parser = parser;

		// we must create the root scope level here, before any traversing begins
		this.rootScope = new Scope(null);

		// changes as we go in and out of functions
		// scopes work kind of like a tree, except we don't really care about siblings
		this.currentScope = rootScope;

		// stores all scopes, keyed on the context that created them
		scopes = new HashMap<>();
		// the root scope is not connected to any context
		scopes.put(null, rootScope);
	}

	private Type getTypeFromText(String text) {
		if(text.equals("int")) {
			return Type.intType;
		}

		if(text.equals("float")) {
			return Type.floatType;
		}

		if(text.equals("str")) {
			return Type.strType;
		}

		if(text.equals("bool")) {
			return Type.strType;
		}

		if(text.equals("null")) {
			return Type.nullType;
		}

		if(text.startsWith("fn")) {
			return new Type.FnType(text);
		}

		if(text.startsWith("obj")) {
			return new Type.ObjType(text);
		}

		// TODO throw real error
		System.out.println("Parser somehow received invalid type.");
		return null;
	}

	@Override
	public Value visitProgram(KytheraParser.ProgramContext ctx) {
		List<KytheraParser.ExpressionContext> expressions = ctx.expression();
		for (KytheraParser.ExpressionContext exp : expressions) {
			System.out.println("{{{ " + exp.getText() + " }}}");
			System.out.println("[[[ " + exp.accept(this).toString() + " ]]]");
		}
		return null;
	}

	@Override
	public Value visitExpression(KytheraParser.ExpressionContext ctx) {
		if (ctx.identifier() != null) {
			if(this.currentScope.hasVar(ctx.identifier().getText())) {
				System.out.println(this.currentScope.getVar(ctx.identifier().getText()));
				return this.currentScope.getVar(ctx.identifier().getText());
			} else {
				// TODO throw a proper exception
				System.out.println("ERROR: Accessing a variable that is not set: " + ctx.identifier().getText());
				return null;
			}
		}

		if (ctx.literal() != null) {
			if(ctx.literal().IntLiteral() != null) {
				return new Value(
					Type.intType,
					Integer.parseInt(ctx.literal().IntLiteral().getText())
				);
			}

			if(ctx.literal().FloatLiteral() != null) {
				return new Value(
					Type.floatType,
					Double.parseDouble(ctx.literal().FloatLiteral().getText())
				);
			}

			if(ctx.literal().StrLiteral() != null) {
				return new Value(
					Type.strType,
					ctx.literal().StrLiteral().getText().replaceAll("\"", "")
				);
			}

			if(ctx.literal().NULL() != null) {
				return Value.NULL;
			}

			if(ctx.literal().TRUE() != null) {
				return Value.TRUE;
			}

			if(ctx.literal().FALSE() != null) {
				return Value.FALSE;
			}

			if(ctx.literal().objLiteral() != null) {
				System.out.println("Object literal (not yet implemented)");
				return ctx.literal().objLiteral().accept(this);
			}

			if(ctx.literal().fnLiteral() != null) {
				System.out.println("Function literal (not yet implemented)");
				return ctx.literal().fnLiteral().accept(this);
			}

			return null;
		}

		if (ctx.BOOLEAN_OPERATOR() != null) {
			// there is no sub-rule for a boolean op, handle it here
			System.out.println("Boolean expression: " + ctx.expression(0).getText() + ctx.BOOLEAN_OPERATOR().getText() + ctx.expression(1).getText());
			Value lhs = visit(ctx.expression(0));
			Value rhs = visit(ctx.expression(1));

			switch(ctx.BOOLEAN_OPERATOR().getText()) {
				case "==":
					return Value.fromBool(lhs.equals(rhs));
				case "!=":
					return Value.fromBool(!(lhs.equals(rhs)));
				case "<":
					if(lhs.getVal() instanceof Comparable && rhs.getVal() instanceof Comparable) {
						return Value.fromBool(((Comparable) lhs.getVal()).compareTo(rhs.getVal()) < 0);
					} else {
						System.out.println("ERROR: Boolean operator overloading is not yet supported.");
						return null;
					}
				case ">":
					if(lhs.getVal() instanceof Comparable && rhs.getVal() instanceof Comparable) {
						return Value.fromBool(((Comparable) lhs.getVal()).compareTo(rhs.getVal()) > 0);
					} else {
						System.out.println("ERROR: Boolean operator overloading is not yet supported.");
						return null;
					}
				case "<=":
					if(lhs.getVal() instanceof Comparable && rhs.getVal() instanceof Comparable) {
						return Value.fromBool(((Comparable) lhs.getVal()).compareTo(rhs.getVal()) <= 0);
					} else {
						System.out.println("ERROR: Boolean operator overloading is not yet supported.");
						return null;
					}
				case ">=":
					if(lhs.getVal() instanceof Comparable && rhs.getVal() instanceof Comparable) {
						return Value.fromBool(((Comparable) lhs.getVal()).compareTo(rhs.getVal()) >= 0);
					} else {
						System.out.println("ERROR: Boolean operator overloading is not yet supported.");
						return null;
					}
				default:
					System.out.println("Unimplemented boolean statement.");
			}
		}

		if (ctx.statement() != null) {
			KytheraParser.StatementContext statement = ctx.statement();
			if (statement.variableStatement() != null) {
				return statement.variableStatement().accept(this);
			} else if (statement.controlFlowStatement() != null) {
				return statement.controlFlowStatement().accept(this);
			} else if (statement.packageStatement() != null) {
				return statement.packageStatement().accept(this);
			} else {
				System.out.println("Unhandled statement.");
				return null;
			}
		}

		System.out.println("Unhandled expression: " + ctx.getText());
		return null;
	}

	@Override
	public Value visitAssignmentStatement(KytheraParser.AssignmentStatementContext ctx) {
		assert(ctx.identifier() != null);
		assert(ctx.expression() != null);

		String identifier = ctx.identifier().getText();

		if(!this.currentScope.hasVar(identifier)) {
			// TODO throw actual exception
			System.out.println("ERROR: Assigning to variable that does not exist" + identifier);
			return null;
		} else {
			Value newValue = ctx.expression().accept(this);
			this.currentScope.setVar(identifier, newValue);
			// an assignment statement (as an expression) returns the new value that the variable has taken.
			return newValue;
		}
	}

	@Override
	public Value visitVariableStatement(KytheraParser.VariableStatementContext ctx) {
		if(ctx.assignmentStatement() != null) {
			return ctx.assignmentStatement().accept(this);
		}

		if(ctx.declarationStatement() != null) {
			return ctx.declarationStatement().accept(this);
		}

		if(ctx.nameStatement() != null) {
			System.out.println("name statement");
			return null;
		}

		System.out.println("Unhandled variable statement: " + ctx.getText());
		return null;
	}

	@Override
	public Value visitDeclarationStatement(KytheraParser.DeclarationStatementContext declStatement) {
		assert(declStatement.LET() != null);
		String identifier = declStatement.identifier().getText();
		Value result;

		// either "new [type]" or expression
		if(declStatement.NEW() != null) {
			// get the type
			result = new Value(
				getTypeFromText(declStatement.type().getText()),
				null
			);
		} else  {
			// initialize from expression
			result = declStatement.expression().accept(this);
		}

		this.currentScope.setVar(identifier, result);

		// a declaration statement (as an expression) evaluates to the value that the newborn variable was set to.
		return result;
	}

	@Override
	public Value visitControlFlowStatement(KytheraParser.ControlFlowStatementContext ctx) {
		System.out.println("Control flow statement");
		return null;
	}
}