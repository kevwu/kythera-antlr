package io.kwu.kythera;

import io.kwu.kythera.antlr.KytheraBaseListener;
import io.kwu.kythera.antlr.KytheraParser;

public class KytheraWalker extends KytheraBaseListener {
	KytheraParser parser;
	Scope rootScope;

	public KytheraWalker(KytheraParser parser) {
		this.parser = parser;
		this.rootScope = new Scope(null);
	}

	@Override
	public void enterExpression(KytheraParser.ExpressionContext ctx) {
		// don't want to do anything here, too general
	}

	@Override
	public void enterAssignmentStatement(KytheraParser.AssignmentStatementContext ctx) {
		System.out.println("Assignment: " + ctx.toStringTree(parser));
	}

	@Override
	public void enterFnLiteral(KytheraParser.FnLiteralContext ctx) {
		System.out.println("Entered FN literal: " + ctx.toStringTree(parser));
	}


}
