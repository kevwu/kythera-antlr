package io.kwu.kythera;

// stores handle for a value
public class Identifier {
	public final String name;
	public final Type type;

	public Identifier(String name, Type type) {
		this.name = name;
		this.type = type;
	}

	@Override
	public boolean equals(Object other) {
		if(!(other instanceof Identifier)) {
			return false;
		}

		Identifier otherId = (Identifier) other;

		return this.name.equals(otherId.name) && this.type.equals(otherId.type);
	}

	@Override
	public int hashCode() {
		return this.name.hashCode() + this.type.hashCode();
	}

	@Override
	public String toString() {
		return type.toString() + " " + name;
	}
}
