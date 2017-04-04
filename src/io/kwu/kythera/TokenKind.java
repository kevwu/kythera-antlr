package io.kwu.kythera;

public enum TokenKind {
	KEYWORD, // language keyword, e.g. let, return, etc. Requires unique handling.
	NUMBER,
	STRING,
	BOOL, // true or false
	OPERATOR, // +, -, =, etc. binary operators
	VARIABLE, // user-named, user-defined variable. Includes functions.
	LAMBDA, // (){} block.
}
