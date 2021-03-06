package io.kwu.kythera;

import io.kwu.kythera.antlr.KytheraBaseVisitor;
import io.kwu.kythera.antlr.KytheraParser;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class KytheraTypeVisitor extends KytheraBaseVisitor<Type> {
	private KytheraVisitor visitor;

	public KytheraTypeVisitor(KytheraVisitor visitor) {
		super();
		this.visitor = visitor;
	}

	@Override
	public Type visitType(KytheraParser.TypeContext ctx) {
		if (ctx.INT() != null) {
			return Type.intType;
		}

		if (ctx.FLOAT() != null) {
			return Type.floatType;
		}

		if (ctx.STR() != null) {
			return Type.strType;
		}

		if (ctx.BOOL() != null) {
			return Type.boolType;
		}

		if (ctx.NULL() != null) {
			return Type.nullType;
		}

		if(ctx.OBJ() != null) {
			return Type.objFreeformType;
		}

		if (ctx.fnType() != null) {
			return ctx.fnType().accept(this);
		}

		if (ctx.objRigidType() != null) {
			return ctx.objRigidType().accept(this);
		}

		if (this.visitor.currentScope.hasName(ctx.getText())) {
			return this.visitor.currentScope.getName(ctx.getText());
		}

		System.out.println("Internal error: Unhandled type");
		return null;
	}

	@Override
	public Type visitObjRigidType(KytheraParser.ObjRigidTypeContext ctx) {
		List<KytheraParser.ObjTypeEntryContext> entryContexts = ctx.objTypeEntry();

		HashSet<Identifier> identifiers = new HashSet<>();

		for (KytheraParser.ObjTypeEntryContext entry : entryContexts) {
			assert (entry.identifier() != null);
			String identifString = entry.identifier().getText();

			assert (entry.type() != null);
			Type type = entry.type().accept(this);

			Identifier id = new Identifier(identifString, type);
			identifiers.add(id);
		}

		return new Type.ObjRigidType(identifiers);
	}

	@Override
	public Type visitFnType(KytheraParser.FnTypeContext ctx) {
		ArrayList<Type> argTypes = new ArrayList<>();
		if(ctx.fnTypeArg() != null && ctx.fnTypeArg().size() != 0) {
			for(KytheraParser.FnTypeArgContext fnArg : ctx.fnTypeArg()) {
				assert(fnArg.type() != null);
				argTypes.add(fnArg.type().accept(this));
			}
		}

		Type returnType = ctx.fnTypeReturn().accept(this);

		return new Type.FnType(argTypes, returnType);
	}
}
