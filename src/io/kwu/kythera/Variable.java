package io.kwu.kythera;

// messy and probably dangerous.
// variable typing needs a thoughtful rework.
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

	public void setVar(Value value) {
		this.value = value;
	}

	public Object getVar() {
		return this.value;
	}
}
