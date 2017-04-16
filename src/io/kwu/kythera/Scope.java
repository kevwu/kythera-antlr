package io.kwu.kythera;

import java.util.HashMap;

public class Scope extends HashMap<String, Value> {
	final private Scope parent;
	final private int level;

	protected boolean returnFlag;
	protected Value returnVal;

	public Scope(final Scope parent) {
		this.parent = parent;

		if(this.parent != null) {
			level = parent.level + 1;
		} else {
			level = 0;
		}

		this.returnFlag = false;
	}

	public boolean inScope(String var) {
		// my IDE tried to condense this into a one-liner 80 characters long
		// I'd rather be able to read my code, thanks
		if(this.containsKey(var)) {
			return true;
		} else if(this.parent != null) {
			return this.parent.inScope(var);
		} else {
			return false;
		}
	}

	public void setVar(String identifier, Value value) {
		if(this.hasVar(identifier) && !this.getVar(identifier).type.equals(value.type)) {
			System.out.println("ERROR: Cannot assign type " + value.type.toString() + " to " + identifier + ", which is of type " + this.getVar(identifier).type.toString());
			return;
		}

		this.put(identifier, value);
	}

	public Value getVar(String identifier) {
		if(this.containsKey(identifier)) {
			return this.get(identifier);
		} else if(this.parent != null) {
			return this.parent.getVar(identifier);
		} else {
			return null;
		}
	}

	public boolean hasVar(String identifier) {
		if(this.containsKey(identifier)) {
			return true;
		} else if(this.parent != null) {
			return this.parent.hasVar(identifier);
		} else {
			return false;
		}
	}

	public Scope parent() {
		return this.parent;
	}
}
