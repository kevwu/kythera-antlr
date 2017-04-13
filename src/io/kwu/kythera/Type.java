package io.kwu.kythera;

import io.kwu.kythera.antlr.KytheraParser;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class Type {
	// string representing type as Kythera would see it
	public final String type;

	public Type(String type) {
		this.type = type;
	}

	@Override
	public boolean equals(Object other) {
			if(!(other instanceof Type)) {
				return false;
			}

			Type otherVar = (Type) other;
			return otherVar.type.equals(this.type);
	}

	@Override
	public String toString() {
		return this.type;
	}

	// types with the same form (e.g. all ints will be "int")

	public static Type intType = new Type("int") {};

	public static Type floatType = new Type("float") {};

	public static Type strType = new Type("str") {};

	public static Type boolType = new Type("bool") {};

	public static Type nullType = new Type("null") {};

	public static class FnType extends Type {
		private final ArrayList<KytheraParser.ExpressionContext> argList;
		private final Type returnType;

		public FnType(String type) {
			super("fn");
			this.argList = new ArrayList<>();
			this.returnType = Type.nullType;
		}

		public FnType(String type, ArrayList<KytheraParser.ExpressionContext> argList, Type returnType) {
			super("fn");
			this.argList = argList;
			this.returnType = returnType;
		}

		// check parameters and return in addition to raw type
		// TODO Implement
		public boolean subtypeEquals(Object other) {
			return false;
		}
	}

	public static class ObjType extends Type {
		private final HashMap<String, Type> fields;

		public ObjType(String type) {
			super(type);
			this.fields = null;
		}

		public ObjType(String type, HashMap<String, Type> fields) {
			super(type);
			this.fields = fields;
		}

		@Override
		public boolean equals(Object other) {
			if(!(other instanceof ObjType)) {
				return false;
			}

			ObjType otherVar = (ObjType) other;
			return otherVar.fields.equals(this.fields);
		}

		// check fields and names in addition to raw type
		public boolean subtypeEquals(Object other) {
			return false;
		}
	}

	public static Type getTypeFromText(String text) {
		if (text.equals("int")) {
			return Type.intType;
		}

		if (text.equals("float")) {
			return Type.floatType;
		}

		if (text.equals("str")) {
			return Type.strType;
		}

		if (text.equals("bool")) {
			return Type.strType;
		}

		if (text.equals("null")) {
			return Type.nullType;
		}

		if (text.startsWith("fn")) {
			return new Type.FnType(text);
		}

		if (text.startsWith("obj")) {
			return new Type.ObjType(text);
		}

		// TODO throw real error
		System.out.println("Parser somehow received invalid type.");
		return null;
	}
}
