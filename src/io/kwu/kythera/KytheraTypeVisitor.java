package io.kwu.kythera;

import io.kwu.kythera.antlr.KytheraBaseVisitor;
import io.kwu.kythera.antlr.KytheraParser;

import java.util.ArrayList;
import java.util.HashMap;
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
		System.out.println("Finding type.");
		String typeString = ctx.getText();

		if (typeString.equals("int")) {
			return Type.intType;
		}

		if (typeString.equals("float")) {
			return Type.floatType;
		}

		if (typeString.equals("str")) {
			return Type.strType;
		}

		if (typeString.equals("bool")) {
			return Type.strType;
		}

		if (typeString.equals("null")) {
			return Type.nullType;
		}

		if (ctx.fnType() != null) {
			return ctx.fnType().accept(this);
		}

		if (ctx.objType() != null) {
//			return ctx.objType().accept(this);
			return Type.objBaseType;
		}

		if (this.visitor.currentScope.hasName(typeString)) {
			return this.visitor.currentScope.getName(typeString);
		}

		System.out.println("Internal error: Unhandled type");
		return null;
	}

	@Override
	public Type visitObjType(KytheraParser.ObjTypeContext ctx) {
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

		return new Type.ObjType(identifiers);
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
