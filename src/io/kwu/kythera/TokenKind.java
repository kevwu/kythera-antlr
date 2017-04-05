package io.kwu.kythera;

public enum TokenKind {
	PUNC, // structural punctuation like [](){}
	NUMBER,
	STRING, // "string"
	KEYWORD, // language keyword
	VARIABLE, // user-defined names
	OPERATOR, // operators like =, ==, !, >=\
}
