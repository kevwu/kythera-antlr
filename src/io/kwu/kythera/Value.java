package io.kwu.kythera;

import io.kwu.kythera.antlr.KytheraParser;

import java.util.List;

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

	public Type getType() {
		return this.type;
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

	public static Value fromTypeText(String typeString, Object value) {
		Type type = Type.getTypeFromText(typeString);

		if(type.equals(Type.intType)) {
			return new Int((Integer) value);
		}

		if(type.equals(Type.floatType)) {
			return new Float((Double) value);
		}

		if(type.equals(Type.boolType)) {
			return new Bool((Boolean) value);
		}

		if (type.equals(Type.nullType)) {
			return new Null();
		}

		if (type.equals(Type.strType)) {
			return new Str((String) value);
		}

		if (typeString.startsWith("fn")) {
			// check function equality
			System.out.println("Function type not yet implemented.");
			return null;
		}

		if (typeString.startsWith("obj")) {
			// check object equality
			System.out.println("Object type not yet implemented.");
			return null;
		}

		System.out.println("ERROR: Invalid type");
		return null;
	}

	public static class Int extends Value {
		public Int(Integer val) {
			super(Type.intType, val);
		}

		public Int(int val) {
			super(Type.intType, val);
		}
	}

	public static class Float extends Value {
		public Float(Double val) {
			super(Type.floatType, val);
		}

		public Float(double val) {
			super(Type.floatType, val);
		}
	}

	public static class Str extends Value {
		public Str(String val) {
			super(Type.strType, val);
		}
	}

	// type implementations
	public static class Bool extends Value<Boolean> {
		public Bool(Boolean val) {
			super(Type.boolType, val);
		}

		// ez creation from Java boolean primitive
		public Bool(boolean val) {
			super(Type.boolType, val);
		}
	}

	public static class Null extends Value {
		public Null() {
			super(Type.nullType, null);
		}
	}

	// functions handle equality differently
	public static class Fn extends Value {
		public Fn(List<KytheraParser.ExpressionContext> expressions) {
//			super(new Type.FnType(expressions))
			super(null, null); // placeholder
		}

		@Override
		public String toString() {
			return type.toString() + ": " + (value != null ? value.toString() : "null");
		}

		public Type getType() {
			return this.type;
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
	}

	// objects handle equality differently
	public static class Obj extends Value {
		public Obj() {
			super(null, null); // placeholder
		}
		@Override
		public String toString() {
			return type.toString() + ": " + (value != null ? value.toString() : "null");
		}

		public Type getType() {
			return this.type;
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
	}
}
