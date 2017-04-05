package io.kwu.kythera;

public class Token {
	public final TokenKind kind;
	public final String value;

	public Token(final TokenKind kind, final String value) {
		this.kind = kind;
		this.value = value;
	}

	@Override
	public String toString() {
		return "" + this.kind + ": " + this.value;
	}
}