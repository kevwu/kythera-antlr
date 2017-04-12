package io.kwu.kythera;

import io.kwu.kythera.antlr.KytheraBaseVisitor;
import io.kwu.kythera.antlr.KytheraParser;

import java.util.List;

public class KytheraVisitor {
	public static class ProgramVisitor extends KytheraBaseVisitor<Void> {
		@Override
		public Void visitProgram(KytheraParser.ProgramContext ctx) {
			System.out.println("Program.");
			List<KytheraParser.ExpressionContext> expressions = ctx.expression();
			for(KytheraParser.ExpressionContext exp : expressions) {
				exp.accept(new ExpressionVisitor());
			}
			return null;
		}
	}

	public static class ExpressionVisitor extends KytheraBaseVisitor<Variable> {
		@Override
		public Variable visitExpression(KytheraParser.ExpressionContext ctx) {
			System.out.println("Expression: " + ctx.getText());
			return null;
		}
	}
}
