package io.kwu.kythera;

import io.kwu.kythera.antlr.KytheraParser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public abstract class Type {
	// string representing type as Kythera would see it
	public final String type;

	public Type(String type) {
		this.type = type;
	}

	/*
	In compound types (fn and obj), equals only checks that the root types are the same.
	This allows fn and obj variables to take on fns and objs with different signatures.
	For deep checking of signatures use subtypeEquals.
	 */
	@Override
	public boolean equals(Object other) {
		if (!(other instanceof Type)) {
			return false;
		}

		return ((Type) other).type.equals(this.type);
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

	// base types are for shallow type comparison.
	public static Type fnBaseType = new Type("fn") {};

	public static Type objBaseType = new Type("obj") {};

	public static class FnType extends Type {
		private final ArrayList<Type> argList;
		private final Type returnType;

		public FnType() {
			// root type is always "fn"
			super("fn");
			this.argList = new ArrayList<>();
			this.returnType = Type.nullType;
		}

		public FnType(ArrayList argList, Type returnType) {
			super("fn");

			// types don't matter if there are no arguments
			if(argList.size() == 0) {
				this.argList = new ArrayList<>();
			} else if(argList.get(0) instanceof Type) {
				this.argList = argList;
			} else if(argList.get(0) instanceof Identifier) {
				// build list of Types, we don't care about identifier names
				ArrayList<Type> typeList = new ArrayList<>();
				for(Object id : argList) {
					typeList.add(((Identifier) id).type);
				}
				this.argList = typeList;
			} else {
				// TODO throw real error
				System.out.println("Invalid type for argument list.");
				this.argList = new ArrayList<>();
			}

			this.returnType = returnType;
		}

		// check parameters and return type in addition to raw type
		// TODO Implement
		public boolean subtypeEquals(Object other) {
			return false;
		}
	}

	public static class ObjType extends Type {
		private HashMap<String, Identifier> identifiers;

		public ObjType() {
			super("obj");
			this.identifiers = new HashMap<>();
		}

		public ObjType(HashMap<String, Identifier> identifiers) {
			super("obj");
			this.identifiers = identifiers;
		}

		// check fields and names in addition to raw type
		// TODO implement
		public boolean subtypeEquals(Object other) {
			return false;
		}

		@Override
		public String toString() {
			// TODO print fields in addition to obj
			return "obj{}";
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
			System.out.println("Creating new fn type from text: " + text);
			return new Type.FnType();
		}

		if (text.startsWith("obj")) {
			System.out.println("Creating new obj type from text: " + text);
			return new Type.ObjType();
		}

		// TODO throw real error
		System.out.println("Parser somehow received invalid type.");
		return null;
	}
}
