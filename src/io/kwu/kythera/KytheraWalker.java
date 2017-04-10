package io.kwu.kythera;

import io.kwu.kythera.antlr.KytheraBaseListener;
import io.kwu.kythera.antlr.KytheraParser;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.HashMap;

public class KytheraWalker extends KytheraBaseListener {
	KytheraParser parser;
	Scope rootScope;
	Scope currentScope;
	HashMap<ParserRuleContext, Scope> scopes;

	public KytheraWalker(KytheraParser parser) {
		this.parser = parser;

		// we must create the root scope level here, before any traversing begins
		this.rootScope = new Scope(null);

		// changes as we go in and out of functions
		// scopes work kind of like a tree, except we don't really need to care about siblings
		this.currentScope = rootScope;

		// stores all scopes
		scopes = new HashMap<>();
		// the root scope is not connected to any context
		scopes.put(null, rootScope);
	}

	@Override
	public void enterAssignmentStatement(KytheraParser.AssignmentStatementContext ctx) {
		System.out.println("Assignment: " + ctx.toStringTree(parser));
	}

	@Override
	public void enterFnLiteral(KytheraParser.FnLiteralContext ctx) {
		System.out.println("Entered FN literal: " + ctx);
		Scope fnScope = new Scope(this.currentScope);
		this.scopes.put(ctx, fnScope);
		this.currentScope = fnScope;
	}

	@Override
	public void exitFnLiteral(KytheraParser.FnLiteralContext ctx) {
		System.out.println("Exited FN literal: " + ctx);
		// switch back to parent scope
		Scope fnScope = this.scopes.get(ctx);
		this.currentScope = fnScope.parent();
	}

}
