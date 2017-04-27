package io.kwu.kythera;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public abstract class Type {
	// string representing type as Kythera would see it
	public final String type;

	public Type(String type) {
		this.type = type;
	}

	/*
	In compound types (fn and obj), equals only checks that the root types are the same.
	This allows fn and obj variables to take on fns and objs with different signatures.
	For deep checking of signatures, use subtypeEquals.
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

	// used when treating a type as a value.
	public static Type typeType = new Type("type") {};

	// base types are for shallow type comparison.
	public static Type fnBaseType = new Type("fn") {};

	public static Type objBaseType = new Type("obj") {};

	public static class FnType extends Type {
		final ArrayList<Type> argList;
		final Type returnType;

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

		@Override
		public boolean equals(Object other) {
			if(!super.equals(other)) {
				return false;
			}

			if(!(other instanceof FnType)) {
				return false;
			}

			FnType otherFnType = (FnType) other;

			return this.argList.equals(otherFnType.argList) && this.returnType.equals(otherFnType.returnType);
		}

		/*
		Does shallow type comparison. By default, fn types are compared with strict comparison (implemented in equals())
		 */
		public boolean baseTypeEquals(Object other) {
			return super.equals(other);
		}

		@Override
		public String toString() {
			StringBuilder out = new StringBuilder("fn: (");
			for(Type arg : this.argList) {
				// TODO get those commas right
				out.append(arg.type).append(", ");
			}
			out.append(") [").append(returnType.toString()).append("]");

			return out.toString();
		}
	}

	public static class ObjType extends Type {
		final HashSet<Identifier> identifiers;

		public ObjType() {
			super("obj");
			this.identifiers = new HashSet<>();
		}

		public ObjType(Set<Identifier> identifiers) {
			super("obj");
			this.identifiers = new HashSet<>(identifiers);
		}

		// check fields and names in addition to raw type
		public boolean subtypeEquals(Object other) {
			if(!this.equals(other)) {
				return false;
			}

			return this.identifiers.equals(((ObjType) other).identifiers);
		}

		@Override
		public String toString() {
			StringBuilder out = new StringBuilder("obj: {\n");

			for(Identifier arg : this.identifiers) {
				out.append(arg.type).append(" ").append(arg.name).append("\n");
			}

			out.append("}");

			return out.toString();
		}
	}
}
