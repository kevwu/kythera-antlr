package io.kwu.kythera;

import io.kwu.kythera.antlr.KytheraBaseVisitor;
import io.kwu.kythera.antlr.KytheraParser;

import java.util.*;

public abstract class Value<V> implements Comparable<Value> {
	protected final V value;
	protected final Type type;

	public Value(final Type type, final V value) {
		this.value = value;
		this.type = type;
	}

	@Override
	public String toString() {
		return type.toString() + ": " + (value != null ? value.toString() : "null");
	}

	public V getVal() {
		return this.value;
	}

	@Override
	public boolean equals(Object other) {
		if(!(other instanceof Value)) {
			return false;
		}

		Value otherVal = (Value) other;
		return value.equals(otherVal.value) && type.equals(otherVal.type);
	}

	@Override
	public int compareTo(Value o) {
		if(!(o.value instanceof Comparable)) {
			throw new ClassCastException();
		}

		if(!(this.value instanceof  Comparable)) {
			throw new ClassCastException();
		}

		return ((Comparable) this.value).compareTo(o.value);
	}

	public static class IntVal extends Value<Integer> {
		public IntVal(Integer val) {
			super(Type.intType, val);
		}

		public IntVal(int val) {
			super(Type.intType, val);
		}
	}

	public static class FloatVal extends Value<Double> {
		public FloatVal(Double val) {
			super(Type.floatType, val);
		}

		public FloatVal(double val) {
			super(Type.floatType, val);
		}
	}

	public static class StrVal extends Value<String> {
		public StrVal(String val) {
			super(Type.strType, val);
		}

		@Override
		public String toString() {
			return this.type + ": \"" + this.value + "\"";
		}
	}

	// type implementations
	public static class BoolVal extends Value<Boolean> {
		public BoolVal(Boolean val) {
			super(Type.boolType, val);
		}

		// ez creation from Java boolean primitive
		public BoolVal(boolean val) {
			super(Type.boolType, val);
		}
	}

	public static class Null extends Value<Void> {
		public Null() {
			super(Type.nullType, null);
		}
	}

	// functions handle equality differently
	public static class FnVal extends Value {
		private ArrayList<Identifier> args;
		private KytheraParser.ExpBlockContext expBlock;
		private Type returnType;

		public FnVal(ArrayList<Identifier> args, KytheraParser.ExpBlockContext expBlock, Type returnType) {
			super(new Type.FnType(args, returnType), expBlock);
			this.args = args;
			this.expBlock = expBlock;
			this.returnType = returnType;
		}

		@Override
		public String toString() {
			StringBuilder out = new StringBuilder("fn: (");
			for(Identifier arg : this.args) {
				// TODO get those commas right
				out.append(arg.type.toString()).append(" ").append(arg.name).append(", ");
			}
			out.append(") [").append(returnType.toString()).append("]");

			return out.toString();
		}

		@Override
		public boolean equals(Object other) {
			if(!(other instanceof Value)) {
				return false;
			}

			Value otherVal = (Value) other;
			return value.equals(otherVal.value) && type.equals(otherVal.type);
		}

		@Override
		public int compareTo(Value o) {
			// functions can't be numerically compared.
			throw new ClassCastException();
		}

		// run the function
		public Value call(ArrayList<Value> arguments, KytheraVisitor visitor) {
			if(arguments.size() != this.args.size()) {
				// TODO throw error
				System.out.println("ERROR: Incorrect number of arguments: got " + arguments.size() + ", expected " + this.args.size());
				return null;
			}

			Scope fnScope = new Scope(visitor.currentScope);
			Value returnVal = Values.NULL;

			visitor.currentScope = fnScope;

			// bring arguments into scope
			if(this.args.size() >= 1) {
				for(int i = 0; i < arguments.size(); i += 1) {
					// type check
					if(!arguments.get(i).type.equals(this.args.get(i).type)) {
						// TODO throw error
						System.out.println("ERROR: Invalid type for parameter " + i +": Got " + arguments.get(i).type.toString() + ", expected " + this.args.get(i).type.toString());
						return null;
					}

					fnScope.setVar(this.args.get(i).name, arguments.get(i));
				}
			}

			this.expBlock.accept(visitor);

			if(fnScope.returnFlag) {
				returnVal = visitor.currentScope.returnVal;
			}

			// return scope to before
			visitor.currentScope = fnScope.parent();

			if(!fnScope.returnFlag) {
				System.out.println("ERROR: Function never returned!");
				return null;
			}

			return returnVal;
		}
	}

	// objects handle equality differently
	public static class ObjVal extends Value<HashMap<Identifier, Value>> {
		public ObjVal(HashMap<String, Identifier> identifiers, HashMap<Identifier, Value> values) {
			super(new Type.ObjType(identifiers), values);
		}

		@Override
		public String toString() {
			String out = "obj: {\n";

			Set<Map.Entry<Identifier, Value>> entries = value.entrySet();
			for(Map.Entry<Identifier, Value> entry : entries) {
				Identifier id = entry.getKey();
				Value val = entry.getValue();

				out += id.name + " = " + val + "\n";
			}

			out += "}";

			return out;
		}

		@Override
		public boolean equals(Object other) {
			if(!(other instanceof Value)) {
				return false;
			}

			Value otherVal = (Value) other;
			return value.equals(otherVal.value) && type.equals(otherVal.type);
		}

		@Override
		public int compareTo(Value o) {
			// objects can't be numerically compared
			throw new ClassCastException();
		}
	}

	public static class TypeVal extends Value<Type> {

		public TypeVal(Type type) {
			super(Type.typeType, type);
		}
	}
}
