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
FOR: 'for';
WHILE: 'while';
RETURN: 'return';
BREAK: 'break';
CONTINUE: 'continue';

// built-in types
NEW: 'new';

BOOL: 'bool';
INT: 'int';
FLOAT: 'float';
STR: 'str';
FN: 'fn';
OBJ: 'obj';
ARR: 'arr';

objType: OBJ '{' (type identifier)*? '}';

fnType: FN '(' (type)*? ')' '[' (type) (',' type)*? ']';

// operators
ASSIGNMENT_OPERATOR: '=';
BOOLEAN_OPERATOR: '==' | '!=' | '<' | '>' | '<=' | '>=';
NOT_OPERATOR: '!';
ARITH_OPERATOR: '+' | '-' | '*' | '/' | '%';

// OOP keywords
EXTENDS: 'extends';
IMPLEMENTS: 'implements';
INTERFACE: 'interface';
THIS: 'this';

// Structural punctuation
PUNCT: '{' | '}' | '[' | ']'| '(' | ')' | '.' | '<' | '>';

TRUE: 'true';
FALSE: 'false';

/*** Literals ***/
IntLiteral: ('0'..'9')+;

FloatLiteral: ('0'..'9')+ ('.' ('0'..'9')+)?;

StrLiteral:	'"' (.)+? '"';

objLiteral: '{' (objLiteralEntry)+ '}';

objLiteralEntry: (type identifier) | (identifier ASSIGNMENT_OPERATOR expression);

// multiple returns are not yet supported.
fnLiteral: FN '(' (fnLiteralArg)+ ')' '[' type ']' expBlock;

fnLiteralArg: type identifier;

//arrLiteral: type '[' (literal)*? ']';

NULL: 'null';

literal: IntLiteral | FloatLiteral | StrLiteral | NULL | TRUE | FALSE | objLiteral | fnLiteral;

/* Type */
type: BOOL | INT | FLOAT | STR | fnType | objType | Identifier ;

identifier: Identifier;
//identifier: Identifier | Identifier '[' IntLiteral ']' | Identifier '.' Identifier

// lexically, identifiers are the same as types
Identifier: ('a'..'z' | 'A'..'Z') ('a'..'z' | 'A'..'Z' | '0'..'9' | '-'  | '_')*;

/* Statements and Expressions */

// An expression is anything that evaluates to a value.
// Since everything evaluates to a value, everything is an expression.

// some of these are inline by necessity (otherwise we get left recursion problems)
expression
    :   statement // statements evaluate as expressions
    |   identifier
    |   literal
    |   expression BOOLEAN_OPERATOR expression // boolean expression
    |   expression ARITH_OPERATOR expression // arithmetic
    |   NOT_OPERATOR expression // !
    |   fnCallExpression
//    |   expBlock
    ;

expBlock: '{' (expression)+ '}';

fnCallExpression: (identifier | fnLiteral) '(' ((expression) (',' expression)*)? ')';

// statements
statement
    :   variableStatement
    |   controlFlowStatement
    |   packageStatement
    ;

// package management statements
packageStatement: importStatement | includeStatement | exportStatement;
importStatement: 'import' StrLiteral;
includeStatement: 'include' StrLiteral;
exportStatement: 'export' identifier;

// statements involving variables
variableStatement: declarationStatement | assignmentStatement | nameStatement;
declarationStatement
    :   LET identifier ASSIGNMENT_OPERATOR expression
    |   LET identifier ASSIGNMENT_OPERATOR NEW type
    ;
assignmentStatement: identifier ASSIGNMENT_OPERATOR expression;
nameStatement // like "typedef" in C/C++
    : NAME identifier type
    | NAME identifier IMPLEMENTS (identifier)+ objType
    | NAME identifier EXTENDS identifier objType
    | NAME identifier EXTENDS identifier IMPLEMENTS (identifier)+ objType
    | NAME identifier INTERFACE identifier objType
    ;

// control flow statements
controlFlowStatement: ifStatement | forStatement | whileStatement | breakStatement | continueStatement | returnStatement;
ifStatement:
    IF expression
    expBlock
    (
        ELSE (ifStatement | expBlock)
    )?
    ;
forStatement: FOR expression ';' expression ';' expression expBlock;
whileStatement: WHILE expression expBlock;
breakStatement: BREAK;
continueStatement: CONTINUE;
returnStatement: RETURN expression;

/* Top-level */
program: (expression)+;

WHITESPACE: (' ' | '\t' | '\r' | '\n') -> skip;