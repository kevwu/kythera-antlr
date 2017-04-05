package io.kwu.kythera;

public enum TokenKind {
	PUNCT, // structural punctuation like [](){}
	NUMBER,
	STRING, // "string"
	KEYWORD, // language keyword
	VARIABLE, // user-defined names
	OPERATOR, // operators like =, ==, !, >=\
	EOL, // end-of-line, serves as statement end
}
