package io.kwu.kythera;

import io.kwu.kythera.antlr.KytheraBaseListener;
import io.kwu.kythera.antlr.KytheraParser;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.HashMap;

public class KytheraWalker extends KytheraBaseListener {
	private KytheraParser parser;
	private Scope rootScope;
	private Scope currentScope;
	private HashMap<ParserRuleContext, Scope> scopes;

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
	public void enterDeclarationStatement(KytheraParser.DeclarationStatementContext ctx) {
		System.out.println("Entering declaration: " + ctx.getText());
		assert (ctx.identifier() != null);
		String identifier = ctx.identifier().getText();
		if (ctx.NEW() == null) {
			System.out.println("Initialized by literal.");
			assert (ctx.expression() != null);
			System.out.println(ctx.expression());
		} else {
			System.out.println("Initialized by 'new'.");
			assert (ctx.type() != null);
			System.out.println("Type: " + ctx.type().getText());
		}
	}

	@Override
	public void enterAssignmentStatement(KytheraParser.AssignmentStatementContext ctx) {
		System.out.println("Assignment: " + ctx.toStringTree(parser));
	}

	@Override
	public void enterFnLiteral(KytheraParser.FnLiteralContext ctx) {
		System.out.println("Entered FN literal: " + ctx.getText());
		Scope fnScope = new Scope(this.currentScope);
		this.scopes.put(ctx, fnScope);
		this.currentScope = fnScope;
	}

	@Override
	public void exitFnLiteral(KytheraParser.FnLiteralContext ctx) {
		System.out.println("Exited FN literal: " + ctx.getText());
		// switch back to parent scope
		Scope fnScope = this.scopes.get(ctx);
		this.currentScope = fnScope.parent();
	}

}
