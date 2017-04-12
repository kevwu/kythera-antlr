package io.kwu.kythera;

public class Value implements Comparable<Value> {
	private final Object value;
	private final Type type;

	public Value(final Type type, final Object value) {
		this.type = type;
		this.value = value;
	}

	@Override
	public String toString() {
		return type.toString() + ": " + (value != null ? value.toString() : "null");
	}

	public Object getVal() {
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

	// static values

	// null
	public static Value NULL = new Value(Type.nullType, null);

	// boolean true/false
	public static Value TRUE = new Value(Type.boolType, Boolean.TRUE);
	public static Value FALSE = new Value(Type.boolType, Boolean.FALSE);

	// ez creation from Java boolean primitive
	public static Value fromBool(boolean val) {
		if(val) {
			return Value.TRUE;
		} else {
			return Value.FALSE;
		}
	}
}
