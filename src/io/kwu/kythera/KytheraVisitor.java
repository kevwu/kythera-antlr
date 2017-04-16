package io.kwu.kythera;

import io.kwu.kythera.antlr.KytheraBaseVisitor;
import io.kwu.kythera.antlr.KytheraParser;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* TODO consider separating each visitor into its own class
(did this at first, was messier, may be more useful as complexity increases)
 */
public class KytheraVisitor extends KytheraBaseVisitor<Value> {
	private KytheraParser parser;
	protected Scope rootScope;
	protected Scope currentScope;
	protected HashMap<ParserRuleContext, Scope> scopes;


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

	@Override
	public Value visitProgram(KytheraParser.ProgramContext ctx) {
		List<KytheraParser.ExpressionContext> expressions = ctx.expression();
		for (KytheraParser.ExpressionContext exp : expressions) {
			System.out.println("{{{ " + exp.getText() + " }}}");
			Value result = exp.accept(this);
			if (result != null) {
				System.out.println("[[[ " + result.toString() + " ]]]");
			} else {
				System.out.println("Expression resulted in null, probably due to an error");
			}
		}
		return null;
	}

	@Override
	public Value visitExpression(KytheraParser.ExpressionContext ctx) {
		if (ctx.BOOLEAN_OPERATOR() != null) {
			// there is no sub-rule for a boolean op, handle it here
			System.out.println("Boolean expression: " + ctx.expression(0).getText() + ctx.BOOLEAN_OPERATOR().getText() + ctx.expression(1).getText());
			Value lhs = visit(ctx.expression(0));
			Value rhs = visit(ctx.expression(1));

			if(lhs == null || rhs == null) {
				System.out.println("One or more variables were null (probably due to an error.)");
				return null;
			}

			switch (ctx.BOOLEAN_OPERATOR().getText()) {
				case "==":
					return new Value.Bool(lhs.equals(rhs));
				case "!=":
					return new Value.Bool(!(lhs.equals(rhs)));
				case "<":
					if (lhs.getVal() instanceof Comparable && rhs.getVal() instanceof Comparable) {
						return new Value.Bool(((Comparable) lhs.getVal()).compareTo(rhs.getVal()) < 0);
					} else {
						System.out.println("ERROR: Boolean operator overloading is not yet supported.");
						return null;
					}
				case ">":
					if (lhs.getVal() instanceof Comparable && rhs.getVal() instanceof Comparable) {
						return new Value.Bool(((Comparable) lhs.getVal()).compareTo(rhs.getVal()) > 0);
					} else {
						System.out.println("ERROR: Boolean operator overloading is not yet supported.");
						return null;
					}
				case "<=":
					if (lhs.getVal() instanceof Comparable && rhs.getVal() instanceof Comparable) {
						return new Value.Bool(((Comparable) lhs.getVal()).compareTo(rhs.getVal()) <= 0);
					} else {
						System.out.println("ERROR: Boolean operator overloading is not yet supported.");
						return null;
					}
				case ">=":
					if (lhs.getVal() instanceof Comparable && rhs.getVal() instanceof Comparable) {
						return new Value.Bool(((Comparable) lhs.getVal()).compareTo(rhs.getVal()) >= 0);
					} else {
						System.out.println("ERROR: Boolean operator overloading is not yet supported.");
						return null;
					}
				default:
					System.out.println("Unimplemented boolean statement.");
			}
		}

		if(ctx.ARITH_OPERATOR() != null) {
			// no sub-rule for arithmetic, evaluate it here
			assert(ctx.expression().size() == 2);

			Value lhs = ctx.expression(0).accept(this);
			Value rhs = ctx.expression(1).accept(this);

			if(lhs == null || rhs == null) {
				System.out.println("One or more variables were null (probably due to an error.)");
				return null;
			}

			if(!lhs.type.equals(rhs.type)) {
				// TODO throw exception
				System.out.println("ERROR: Cannot use " + ctx.ARITH_OPERATOR().getText() + " on variables of different type: " + lhs.type.toString() + " vs " + rhs.type.toString());
				return null;
			}

			if(!lhs.type.equals(Type.intType) && !lhs.type.equals(Type.floatType)) {
				System.out.println("Operator overloading is not yet implemented.");
				// TODO throw exception
				System.out.println("ERROR: Cannot use " + ctx.ARITH_OPERATOR().getText() + " on type " + lhs.type.toString());
				return null;
			}

			/*
			This is a stopgap implementation. It is very messy and unpleasant.
			It will (hopefully) change when operator overloading is implemented.
			*/

			Type resultType = lhs.type;
			double lhsVal = (Double) ((Number) lhs.getVal()).doubleValue();
			double rhsVal = (Double) ((Number) rhs.getVal()).doubleValue();

			double resultVal;

			String op = ctx.ARITH_OPERATOR().getText();
			// cheating here by casting doubles back to ints. very bad. will be removed.
			switch(op) {
				case "+":
					resultVal = lhsVal + rhsVal;
					break;
				case "-":
					resultVal = lhsVal - rhsVal;
					break;
				case "*":
					resultVal = lhsVal - rhsVal;
					break;
				case "/":
					// integer division SHOULD be preserved when converting back
					resultVal = lhsVal / rhsVal;
					break;
				case "%":
					resultVal = lhsVal % rhsVal;
					break;
				default:
					return null;
			}

			if(resultType.equals(Type.intType)) {
				return new Value.Int(Integer.valueOf((int) resultVal));
			} else if(resultType.equals(Type.floatType)){
				return new Value.Float(Double.valueOf(resultVal));
			} else {
				return null;
			}
		}

		if(ctx.NOT_OPERATOR() != null) {
			System.out.println("Boolean operator");
			assert(ctx.expression().size() == 1);

			Value val = ctx.expression(0).accept(this);
			if(!val.type.equals(Type.boolType)) {
				// TODO throw error
				System.out.println("Cannot boolean negate a non-boolean type: " + val.type.toString());
				return null;
			}

			Value.Bool boolVal = (Value.Bool) val;
			if(boolVal.value) {
				return Values.FALSE;
			} else {
				return Values.TRUE;
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

		if (ctx.fnCallExpression() != null) {
			return ctx.fnCallExpression().accept(this);
		}

		// check for literals/raw expression last
		if (ctx.literal() != null) {
			if (ctx.literal().IntLiteral() != null) {
				return new Value.Int(
					Integer.parseInt(ctx.literal().IntLiteral().getText())
				);
			}

			if (ctx.literal().FloatLiteral() != null) {
				return new Value.Float(
					Double.parseDouble(ctx.literal().FloatLiteral().getText())
				);
			}

			if (ctx.literal().StrLiteral() != null) {
				return new Value.Str(
					ctx.literal().StrLiteral().getText().replaceAll("\"", "")
				);
			}

			if (ctx.literal().NULL() != null) {
				return Values.NULL;
			}

			if (ctx.literal().TRUE() != null) {
				return Values.TRUE;
			}

			if (ctx.literal().FALSE() != null) {
				return Values.FALSE;
			}

			if (ctx.literal().objLiteral() != null) {
				return ctx.literal().objLiteral().accept(this);
			}

			if (ctx.literal().fnLiteral() != null) {
				return ctx.literal().fnLiteral().accept(this);
			}

			return null;
		}

		if (ctx.identifier() != null) {
			if (this.currentScope.hasVar(ctx.identifier().getText())) {
				return this.currentScope.getVar(ctx.identifier().getText());
			} else {
				// TODO throw a proper exception
				System.out.println("ERROR: Accessing a variable that is not set: " + ctx.identifier().getText());
				return null;
			}
		}

		System.out.println("Unhandled expression: " + ctx.getText());
		return null;
	}

	@Override
	public Value visitAssignmentStatement(KytheraParser.AssignmentStatementContext ctx) {
		assert (ctx.identifier() != null);
		assert (ctx.expression() != null);

		String identifier = ctx.identifier().getText();

		if (!this.currentScope.hasVar(identifier)) {
			// TODO throw actual exception
			System.out.println("ERROR: Assigning to variable that does not exist" + identifier);
			return null;
		} else {
			// TODO type check before assignment. Do shallow type check only
			Value currentValue = this.currentScope.getVar(identifier);

			Value newValue = ctx.expression().accept(this);

			if (!currentValue.type.equals(newValue.type)) {
				System.out.println("ERROR: Assigning type " + newValue.type.toString() + " to variable of type " + currentValue.type.toString());
				return null;
			}

			this.currentScope.setVar(identifier, newValue);

			// an assignment statement (as an expression) returns the new value that the variable has taken.
			return newValue;
		}
	}

	@Override
	public Value visitVariableStatement(KytheraParser.VariableStatementContext ctx) {
		if (ctx.assignmentStatement() != null) {
			return ctx.assignmentStatement().accept(this);
		}

		if (ctx.declarationStatement() != null) {
			return ctx.declarationStatement().accept(this);
		}

		if (ctx.nameStatement() != null) {
			System.out.println("name statement");
			return null;
		}

		System.out.println("Unhandled variable statement: " + ctx.getText());
		return null;
	}

	@Override
	public Value visitDeclarationStatement(KytheraParser.DeclarationStatementContext declStatement) {
		assert (declStatement.LET() != null);
		String identifier = declStatement.identifier().getText();

		if(this.currentScope.hasVar(identifier)) {
			System.out.println("ERROR: Identifier " + identifier + " has already been declared.");
			return null;
		}

		Value result;

		// either "new [type]" or expression
		if (declStatement.NEW() != null) {
			// get the type
			assert (declStatement.type() != null);
			result = Value.fromTypeText(declStatement.type().getText(), null);
		} else {
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

		if(ctx.returnStatement() != null) {
			return ctx.returnStatement().accept(this);
		}

		if(ctx.ifStatement() != null) {
			return ctx.ifStatement().accept(this);
		}

		if(ctx.whileStatement() != null) {
			return ctx.whileStatement().accept(this);
		}

		if(ctx.forStatement() != null) {
			return ctx.forStatement().accept(this);
		}

		return null;
	}

	@Override public Value visitIfStatement(KytheraParser.IfStatementContext ctx) {
		// must be at least two statements - the if-expression, and at least one statement inside the braces.

		assert(ctx.expression().size() >= 2);

//		Value conditional =
		return null;
	}

	@Override
	public Value visitObjLiteral(KytheraParser.ObjLiteralContext ctx) {
		System.out.println("Object literal");

		List<KytheraParser.ObjLiteralEntryContext> objLiteralEntryContexts = ctx.objLiteralEntry();

		HashMap<String, Identifier> identifiers = new HashMap<>();
		HashMap<Identifier, Value> values = new HashMap<>();

		for (KytheraParser.ObjLiteralEntryContext entry : objLiteralEntryContexts) {
			assert (entry.identifier() != null);
			String identifString = entry.identifier().getText();

			Value val;

			if (entry.ASSIGNMENT_OPERATOR() != null) {
				assert (entry.expression() != null);
				val = entry.expression().accept(this);
			} else {
				assert (entry.type() != null);
				val = Value.fromTypeText(entry.type().getText(), null);
			}

			Identifier id = new Identifier(identifString, val.type);
			identifiers.put(identifString, id);
			values.put(id, val);
		}

		return new Value.Obj(identifiers, values);
	}

	@Override
	public Value visitFnLiteral(KytheraParser.FnLiteralContext ctx) {
		ArrayList<Identifier> arguments = new ArrayList<>();
		if(ctx.fnLiteralArg() != null && ctx.fnLiteralArg().size() != 0) {
			for(KytheraParser.FnLiteralArgContext fnArg : ctx.fnLiteralArg()) {
				assert(fnArg.identifier() != null);
				assert(fnArg.type() != null);
				arguments.add(new Identifier(fnArg.identifier().getText(), Type.getTypeFromText(fnArg.type().getText())));
			}
		}

		assert(ctx.expression() != null);
		assert(ctx.expression().size() >=1);

		ArrayList<KytheraParser.ExpressionContext> expressions = new ArrayList<>(ctx.expression());

		assert(ctx.type() != null);
		Type returnType = Type.getTypeFromText(ctx.type().getText());

		return new Value.Fn(arguments, expressions, returnType);
	}

	@Override
	public Value visitFnCallExpression(KytheraParser.FnCallExpressionContext ctx) {
		System.out.println("Function call expression.");

		Value.Fn function = null;

		if(ctx.identifier() != null) {
			if(!this.currentScope.hasVar(ctx.identifier().getText())) {
				// TODO throw exception
				System.out.println("ERROR: Calling a function identifier that has not been defined.");
				return null;
			}
			function = (Value.Fn) this.currentScope.getVar(ctx.identifier().getText());
			if(!function.type.equals(Type.fnBaseType)) {
				System.out.println("ERROR: " + ctx.identifier().getText() + " is not a function");
				return null;
			}
		} else if(ctx.fnLiteral() != null) {
			function = (Value.Fn) ctx.fnLiteral().accept(this);
		}

		ArrayList<Value> argList = new ArrayList<>();

		if(ctx.expression() != null && ctx.expression().size() != 0) {
			for(KytheraParser.ExpressionContext expr : ctx.expression()) {
				argList.add(expr.accept(this));
			}
		}

		if(function != null) {
			return function.call(argList, this);
		} else {
			System.out.println("Function was somehow not set...");
			return null;
		}

	}

	@Override public Value visitReturnStatement(KytheraParser.ReturnStatementContext ctx) {
		assert(ctx.expression() != null);

		this.currentScope.returnFlag = true;
		this.currentScope.returnVal = ctx.expression().accept(this);

		// it doesn't really matter what a return statement evaluates to since its value is never used
		return this.currentScope.returnVal;
	}

	private static class KytheraTypeVisitor extends KytheraBaseVisitor<Type> {
		@Override
		public Type visitObjType(KytheraParser.ObjTypeContext ctx) {
			System.out.println("Object type (not yet implemented)");
			return null;
		}

		@Override
		public Type visitFnType(KytheraParser.FnTypeContext ctx) {
			System.out.println("Fn type: " + ctx.getText());
			return null;
		}
	}
}