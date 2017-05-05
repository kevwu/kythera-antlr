/* Draft EBNF for Kythera */
/* This grammar is built using ANTLR v4.7. */
grammar Kythera;

options {
    language = Java;
}

@lexer::header {
    package io.kwu.kythera.antlr;
}

@parser::header {
    package io.kwu.kythera.antlr;
}

COMMENT
    :   ( '//' ~('\r' | '\n')* '\r'? '\n'
        | '/*' .*? '*/'
        ) -> skip
    ;

/*** Language keywords ***/
LET: 'let'; // variable assignment
NAME: 'name'; // typedef

// control flow
IF: 'if';
ELSE: 'else';
WHILE: 'while';
EACH: 'each';
RETURN: 'return';
BREAK: 'break';
CONTINUE: 'continue';

// casting
NEW: 'new';
AS: 'as';
TYPEOF: 'typeof';

// types
BOOL: 'bool';
INT: 'int';
FLOAT: 'float';
STR: 'str';
FN: 'fn';
OBJ: 'obj';
ARR: 'arr';

// object type
objType: OBJ '{' (objTypeEntry)*? '}';
objTypeEntry: type identifier;

// function type
// only one return value allowed right now
fnType: FN '(' (fnTypeArg (',' fnTypeArg)*? )? ')' ':' fnTypeReturn ;
fnTypeArg: type;
fnTypeReturn: type;

// packages
IMPORT: 'import';
EXPORT: 'export';
INCLUDE: 'include';

/*** operators ***/
ASSIGNMENT_OPERATOR: '=';
BOOLEAN_COMPARISON: '==' | '!=' | '<' | '>' | '<=' | '>=';
BOOLEAN_OPERATOR: '&&' | '||';
NOT_OPERATOR: '!';
ARITH_OPERATOR: '+' | '-' | '*' | '/' | '%';

// Structural punctuation
PUNCT: '{' | '}' | '[' | ']'| '(' | ')' | '<' | '>';

// object stuff
THIS: 'this';
DOT: '.';

/*** Literals ***/
IntLiteral: ('0'..'9')+;

FloatLiteral: ('0'..'9')+ ('.' ('0'..'9')+)?;

StrLiteral:	'"' (.)+? '"';

TRUE: 'true';
FALSE: 'false';

NULL: 'null';

objLiteral: '{' (objLiteralEntry)*? '}';
objLiteralEntry: identifier ASSIGNMENT_OPERATOR expression;

// multiple returns are not yet supported.
fnLiteral: FN '(' fnLiteralArg (',' fnLiteralArg)*? ')' ':' type expBlock;

fnLiteralArg: type Identifier;

literal: IntLiteral | FloatLiteral | StrLiteral | NULL | TRUE | FALSE | objLiteral | fnLiteral;

/* Type */
type: BOOL | INT | FLOAT | STR | NULL | OBJ | fnType | objType | Identifier ;

identifier: Identifier;

Identifier: ('a'..'z' | 'A'..'Z') ('a'..'z' | 'A'..'Z' | '0'..'9' | '_')*;

/* Statements and Expressions */

// An expression is anything that evaluates to a value.
// Since everything evaluates to a value, everything is an expression.

// some of these are inline by necessity (otherwise we get left recursion problems)
expression
    // function call. Must be before parenthetical expression
    :   expression '(' fnCallParamList ')'
    |   TYPEOF expression
    |   expression AS type
    |   expression BOOLEAN_COMPARISON expression // > < == etc
    |   expression BOOLEAN_OPERATOR expression // &&, ||
    |   expression ARITH_OPERATOR expression // arithmetic
    |   NOT_OPERATOR expression // !
    |   NEW type
    // object member retrieval
    |   expression DOT identifier
    // object member declaration
    |   LET expression DOT identifier ASSIGNMENT_OPERATOR expression
    // object member assignment
    |   expression DOT identifier ASSIGNMENT_OPERATOR expression
    |   statement // statements evaluate as expressions
    |   identifier
    |   literal
    // parenthetical expression
    |   '(' expression ')'
    ;

fnCallParamList: ((expression) (',' expression)*?)?;

expBlock: '{' (expression)+ '}';

// statements
statement
    :   variableStatement
    |   controlFlowStatement
    |   packageStatement
    ;

// package management statements
packageStatement: importStatement | includeStatement | exportStatement;
importStatement: IMPORT StrLiteral;
includeStatement: INCLUDE StrLiteral;
exportStatement: EXPORT identifier;

// statements involving variables
variableStatement: declarationStatement | assignmentStatement | nameStatement ;
declarationStatement: LET identifier ASSIGNMENT_OPERATOR expression;
assignmentStatement: identifier ASSIGNMENT_OPERATOR expression;

nameStatement: NAME Identifier type;

// control flow statements
controlFlowStatement: ifStatement | whileStatement | breakStatement | continueStatement | returnStatement;
ifStatement:
    IF expression
    expBlock
    (
        ELSE (ifStatement | expBlock)
    )?
    ;
whileStatement:
    WHILE expression
    expBlock;
breakStatement: BREAK;
continueStatement: CONTINUE;
returnStatement: RETURN expression;

/* Top-level */
program: (expression)+;

WHITESPACE: (' ' | '\t' | '\r' | '\n') -> skip;