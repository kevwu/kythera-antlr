package io.kwu.kythera;

// messy and probably dangerous.
// variable typing needs a thoughtful rework.
public abstract class Variable {
	protected final String identifier;
	protected Object value;

	public Variable(final String identifier, Object value) {
		this.identifier = identifier;
		this.value = value;
	}
	public String toString() {
		return value.toString();
	}
	public void setVar(Object value) {
		this.value = value;
	};
	public Object getVar() {
		return this.value;
	};
}