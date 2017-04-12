package io.kwu.kythera;

public class Variable {
	private final String identifier;
	private Value value;

	public Variable(final Type type, final String identifier, Object value) {
		this.identifier = identifier;
		this.value = new Value(type, value);
	}

	public String toString() {
		return value.toString();
	}

	public void setVal(Value value) {
		this.value = value;
	}

	public Value getVal() {
		return this.value;
	}
}
