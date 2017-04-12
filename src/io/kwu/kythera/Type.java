package io.kwu.kythera;

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
		private final ArrayList<Type> argList;
		private final Type returnType;

		public FnType(String type) {
			super(type);
			this.argList = new ArrayList<>();
			this.returnType = Type.nullType;
		}

		public FnType(String type, ArrayList<Type> argList, Type returnType) {
			super(type);
			this.argList = argList;
			this.returnType = returnType;
		}

		@Override
		public boolean equals(Object other) {
			if(!(other instanceof FnType)) {
				return false;
			}

			FnType otherVar = (FnType) other;
			return otherVar.argList.equals(this.argList) && otherVar.returnType.equals(this.returnType);
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
	}
}
