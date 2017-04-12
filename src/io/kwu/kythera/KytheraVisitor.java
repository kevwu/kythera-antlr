package io.kwu.kythera;

import io.kwu.kythera.antlr.KytheraBaseVisitor;
import io.kwu.kythera.antlr.KytheraParser;

import java.util.List;

/* TODO consider separating each visitor into its own class
(did this at first, was messier, may be more useful as complexity increases)
 */
public class KytheraVisitor extends KytheraBaseVisitor<Value> {
	private KytheraParser parser;

	public KytheraVisitor(KytheraParser parser) {
		this.parser = parser;
	}

	@Override
	public Value visitProgram(KytheraParser.ProgramContext ctx) {
		System.out.println("Beginning program");
		List<KytheraParser.ExpressionContext> expressions = ctx.expression();
		for (KytheraParser.ExpressionContext exp : expressions) {
			exp.accept(this);
		}
		return null;
	}

	@Override
	public Value visitExpression(KytheraParser.ExpressionContext ctx) {
		System.out.println("{{{" + ctx.getText() + "}}}");

		if (ctx.identifier() != null) {
			System.out.println("Identifier-only expression");
//			return this.visit(ctx.identifier());
		}

		if (ctx.literal() != null) {
			System.out.println("Literal");
		}

		if (ctx.BOOLEAN_OPERATOR() != null) {
			// terminal, evaluate this here
			System.out.println("Boolean expression: " + ctx.expression(0).getText() + ctx.BOOLEAN_OPERATOR().getText() + ctx.expression(1).getText());
			Value lhs = visit(ctx.expression(0));
			Value rhs = visit(ctx.expression(1));

			switch(ctx.BOOLEAN_OPERATOR().getText()) {
				case "==": {

				}
			}
		}

		if (ctx.statement() != null) {
			KytheraParser.StatementContext statement = ctx.statement();
			if (statement.variableStatement() != null) {
				statement.variableStatement().accept(this);
			} else if (statement.controlFlowStatement() != null) {
				statement.controlFlowStatement().accept(this);
			} else if (statement.packageStatement() != null) {
				statement.packageStatement().accept(this);
			} else {
				System.out.println("Unhandled statement.");
			}
		}

		return null;
	}

	@Override
	public Value visitAssignmentStatement(KytheraParser.AssignmentStatementContext ctx) {
		System.out.println("Assignment statement.");
		return null;
	}

	@Override
	public Value visitVariableStatement(KytheraParser.VariableStatementContext ctx) {
		System.out.println("Variable statement");
		return null;
	}

	@Override
	public Value visitControlFlowStatement(KytheraParser.ControlFlowStatementContext ctx) {
		System.out.println("Control flow statement");
		return null;
	}
}