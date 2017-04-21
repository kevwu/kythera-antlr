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

	private KytheraTypeVisitor typeVisitor;


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


		this.typeVisitor = new KytheraTypeVisitor(this);
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
		if (ctx.fnCallExpression() != null) {
			return ctx.fnCallExpression().accept(this);
		}

		if (ctx.BOOLEAN_COMPARISON() != null) {
			// there is no sub-rule for a boolean op, handle it here
			Value lhs = visit(ctx.expression(0));
			Value rhs = visit(ctx.expression(1));

			if(lhs == null || rhs == null) {
				System.out.println("One or more variables were null (probably due to an error.)");
				return null;
			}

			String op = ctx.BOOLEAN_COMPARISON().getText();

			if(op.equals("==")) {
				return new Value.BoolVal(lhs.equals(rhs));
			}

			if(op.equals("!=")) {
				return new Value.BoolVal(!(lhs.equals(rhs)));
			}

			// all other comparisons require Comparable
			if(lhs.getVal() instanceof Comparable && rhs.getVal() instanceof Comparable) {
				if(op.equals("<")) {
					return new Value.BoolVal(((Comparable) lhs.getVal()).compareTo(rhs.getVal()) < 0);
				}

				if(op.equals(">")) {
					return new Value.BoolVal(((Comparable) lhs.getVal()).compareTo(rhs.getVal()) > 0);
				}

				if(op.equals("<=")) {
					return new Value.BoolVal(((Comparable) lhs.getVal()).compareTo(rhs.getVal()) <= 0);
				}

				if(op.equals(">=")) {
					return new Value.BoolVal(((Comparable) lhs.getVal()).compareTo(rhs.getVal()) >= 0);
				}
			} else {
				System.out.println("ERROR: Boolean operator overloading is not yet supported.");
				return null;
			}

			System.out.println("Unimplemented boolean operator.");
			assert(false);
			return null;
		}

		if(ctx.BOOLEAN_OPERATOR() != null) {
			assert(ctx.expression().size() == 2);

			Value lhs = ctx.expression(0).accept(this);
			Value rhs = ctx.expression(1).accept(this);


			if(lhs == null || rhs == null) {
				System.out.println("One or more variables were null (probably due to an error.)");
				return null;
			}

			if(!lhs.type.equals(Type.boolType) && !rhs.type.equals(Type.boolType)){
				System.out.println("ERROR: Boolean expected, got " + lhs.type.toString() + ", " + rhs.type.toString());
				return null;
			}

			String op = ctx.BOOLEAN_OPERATOR().getText();

			if(op.equals("&&")) {
				return new Value.BoolVal(
					(((Boolean) lhs.value) && ((Boolean) rhs.value))
				);
			}

			if(op.equals("||")) {
				return new Value.BoolVal(
					(((Boolean) lhs.value) || ((Boolean) rhs.value))
				);
			}

			System.out.println("Unimplemented boolean operation.");
			return null;
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
				return new Value.IntVal(Integer.valueOf((int) resultVal));
			} else if(resultType.equals(Type.floatType)){
				return new Value.FloatVal(Double.valueOf(resultVal));
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

			Value.BoolVal boolVal = (Value.BoolVal) val;
			if(boolVal.value) {
				return Values.FALSE;
			} else {
				return Values.TRUE;
			}
		}
//
//		if(ctx.parenExp() != null) {
//			return ctx.parenExp().accept(this);
//		}

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

		// check for literals/raw expression last
		if (ctx.literal() != null) {
			if (ctx.literal().IntLiteral() != null) {
				return new Value.IntVal(
					Integer.parseInt(ctx.literal().IntLiteral().getText())
				);
			}

			if (ctx.literal().FloatLiteral() != null) {
				return new Value.FloatVal(
					Double.parseDouble(ctx.literal().FloatLiteral().getText())
				);
			}

			if (ctx.literal().StrLiteral() != null) {
				return new Value.StrVal(
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

		if(ctx.expression().size() == 1) {
			return ctx.expression(0).accept(this);
		}

		System.out.println("Unhandled expression: " + ctx.getText());
		return null;
	}

	// gets a Value from a type.
	// to get a Type from a type, use KytheraTypeVisitor.
	@Override
	public Value visitType(KytheraParser.TypeContext ctx) {
		Type type = ctx.accept(this.typeVisitor);

		if(type == null) {
			System.out.println("Couldn't find type.");
			return null;
		}

		return new Value(type, null);

/*		// TODO find a proper default value to set for uninitialized variables
		if(type.equals(Type.intType)) {
			return new Value.IntVal(null);
		}

		if(type.equals(Type.floatType)) {
			return new Value.FloatVal(null);
		}

		if(type.equals(Type.boolType)) {
			return new Value.BoolVal(null);
		}

		if (type.equals(Type.nullType)) {
			return new Value.Null();
		}

		if (type.equals(Type.strType)) {
			return new Value.StrVal(null);
		}

		if (ctx.fnType() != null) {
			System.out.println("Function type is not supported here.");
			return null;
		}

		if (ctx.objType() != null) {
			System.out.println("Object type is not supported here.");
			return new Value.ObjVal(null);
		}

		System.out.println("ERROR: Invalid type");
		return null;*/
	}

//
//	@Override
//	public Value visitParenExp(KytheraParser.ParenExpContext ctx) {
//		return ctx.expression().accept(this);
//	}

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
			return ctx.nameStatement().accept(this);
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
//			result = Value.fromTypeContext(declStatement.type(), null, this.typeVisitor);
			result = declStatement.type().accept(this);
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
		if(ctx.returnStatement() != null) {
			return ctx.returnStatement().accept(this);
		}

		if(ctx.ifStatement() != null) {
			return ctx.ifStatement().accept(this);
		}

		if(ctx.whileStatement() != null) {
			return ctx.whileStatement().accept(this);
		}

		return null;
	}

	@Override
	public Value visitNameStatement(KytheraParser.NameStatementContext ctx) {
		System.out.println("Name Statement");

		String name = ctx.identifier().getText();

		if(this.currentScope.hasName(name)) {
			System.out.println("ERROR: Name " + name + " is already set.");
			return null;
		}

		Type type = ctx.type().accept(this.typeVisitor);

		this.currentScope.setName(name, type);

		return new Value.TypeVal(type);
	}

	@Override public Value visitIfStatement(KytheraParser.IfStatementContext ctx) {
		Value condRaw = ctx.expression().accept(this);

		if(!condRaw.type.equals(Type.boolType)) {
			System.out.println("ERROR: Boolean expression expected, got " + condRaw.type.toString());
			return null;
		}

		Value.BoolVal conditional = (Value.BoolVal) condRaw;

		if(conditional.equals(Values.TRUE)) {
			ctx.expBlock(0).accept(this);
		} else if(conditional.equals(Values.FALSE)) {
			if(ctx.ELSE() != null) {
				// else-if
				if(ctx.ifStatement() != null) {
					ctx.ifStatement().accept(this);
				} else if(ctx.expBlock().size() == 2) {
					assert(ctx.expBlock(1) != null);
					ctx.expBlock(1).accept(this);
				} else {
					System.out.println("ELSE was given, but no if statement or exp block...");
					return null;
				}
			} else {
			}
		} else {
			assert(false);
		}

		// if statements evaluate to the value of their conditional
		return conditional;
	}

	@Override
	public Value visitWhileStatement(KytheraParser.WhileStatementContext ctx) {
		while(ctx.expression().accept(this).type.equals(Type.boolType) && ctx.expression().accept(this).equals(Values.TRUE)) {
			ctx.expBlock().accept(this);
		}

		if(!ctx.expression().accept(this).type.equals(Type.boolType)) {
			System.out.println("ERROR: Boolean expression expected for conditional, got " + ctx.expression().accept(this).type.toString());
			return null;
		}

		// while statements don't return anything yet (until ExpBlock evaluations are implemented)
		System.out.println("(While statement returning null)");
		return Values.NULL;
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
//				val = Value.fromTypeContext(entry.type(), null, this.typeVisitor);
				val = entry.type().accept(this);
			}

			Identifier id = new Identifier(identifString, val.type);
			identifiers.put(identifString, id);
			values.put(id, val);
		}

		return new Value.ObjVal(values);
	}

	@Override
	public Value visitFnLiteral(KytheraParser.FnLiteralContext ctx) {
		ArrayList<Identifier> arguments = new ArrayList<>();
		if(ctx.fnLiteralArg() != null && ctx.fnLiteralArg().size() != 0) {
			for(KytheraParser.FnLiteralArgContext fnArg : ctx.fnLiteralArg()) {
				assert(fnArg.identifier() != null);
				assert(fnArg.type() != null);
				arguments.add(new Identifier(fnArg.identifier().getText(), fnArg.type().accept(this.typeVisitor)));
			}
		}

		assert(ctx.expBlock() != null);
		assert(ctx.type() != null);

		Type returnType = ctx.type().accept(this.typeVisitor);

		return new Value.FnVal(arguments, ctx.expBlock(), returnType);
	}

	@Override
	public Value visitFnCallExpression(KytheraParser.FnCallExpressionContext ctx) {
		System.out.println("Function call expression.");

		Value.FnVal function = null;

		if(ctx.identifier() != null) {
			if(!this.currentScope.hasVar(ctx.identifier().getText())) {
				// TODO throw exception
				System.out.println("ERROR: Calling a function identifier that has not been defined.");
				return null;
			}
			function = (Value.FnVal) this.currentScope.getVar(ctx.identifier().getText());
			if(!function.type.equals(Type.fnBaseType)) {
				System.out.println("ERROR: " + ctx.identifier().getText() + " is not a function");
				return null;
			}
		} else if(ctx.fnLiteral() != null) {
			function = (Value.FnVal) ctx.fnLiteral().accept(this);
		}

		ArrayList<Value> argList = new ArrayList<>();

		if(ctx.fnCallParamList() != null && ctx.fnCallParamList().expression().size() != 0) {
			for(KytheraParser.ExpressionContext expr : ctx.fnCallParamList().expression()) {
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

	@Override
	public Value visitExpBlock(KytheraParser.ExpBlockContext ctx) {
		for (KytheraParser.ExpressionContext exp : ctx.expression()) {
			if(!this.currentScope.returnFlag) {
				Value result = exp.accept(this);
				if(result != null) {
					System.out.println("exp: [[[ " + result.toString() + " ]]]");
				} else {
					System.out.println("exp: Expression resulted in null");
				}
			} else {
				System.out.println(this.currentScope.returnVal.toString());
				break;
			}
		}

		/*
		TODO allow ExpBlocks to return and evaluate to values
		If/For/While loops can evaluate to the return values of their ExpBlocks
		 */
		return null;
	}

	@Override
	public Value visitReturnStatement(KytheraParser.ReturnStatementContext ctx) {
		assert(ctx.expression() != null);

		this.currentScope.returnFlag = true;
		this.currentScope.returnVal = ctx.expression().accept(this);

		// it doesn't really matter what a return statement evaluates to since its value is never used
		return this.currentScope.returnVal;
	}
}