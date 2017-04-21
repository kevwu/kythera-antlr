package io.kwu.kythera;

import io.kwu.kythera.antlr.KytheraBaseVisitor;
import io.kwu.kythera.antlr.KytheraParser;

public class KytheraTypeVisitor extends KytheraBaseVisitor<Type> {
	private KytheraVisitor visitor;

	public KytheraTypeVisitor(KytheraVisitor visitor) {
		super();
		this.visitor = visitor;
	}

	@Override
	public Type visitType(KytheraParser.TypeContext ctx) {
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
			return ctx.objType().accept(this);
		}

		System.out.println("Internal error: Unhandled type");
		return null;
	}

	@Override
	public Type visitObjType(KytheraParser.ObjTypeContext ctx) {
		System.out.println("Object type (not yet implemented)");
		return null;
	}

	@Override
	public Type visitFnType(KytheraParser.FnTypeContext ctx) {
		System.out.println("FnVal type: " + ctx.getText());
		return null;
	}
}
