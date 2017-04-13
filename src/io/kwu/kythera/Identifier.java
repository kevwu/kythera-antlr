package io.kwu.kythera;

// stores handle for a value
public class Identifier {
	public final String name;
	public final Type type;

	public Identifier(String name, Type type) {
		this.name = name;
		this.type = type;
	}
}
