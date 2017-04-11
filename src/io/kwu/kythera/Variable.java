package io.kwu.kythera;

// messy and probably dangerous.
// variable typing needs a thoughtful rework.
public class Variable {
	private final String identifier;
	private Object value;
	private final VarType type;

	public Variable(final VarType type, final String identifier, Object value) {
		this.type = type;
		this.identifier = identifier;
		this.value = value;
	}

	public String toString() {
		return value.toString();
	}

	public void setVar(Object value) {
		this.value = value;
	}

	public Object getVar() {
		return this.value;
	}
}
