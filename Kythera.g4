/* Draft EBNF for Kythera */
/* This grammar built using version ANTLR 4.6. */
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
BOOL: 'bool';
INT: 'int';
FLOAT: 'float';
FN: 'fn';
OBJ: 'obj';

// operators
OPERATOR: BOOLEAN_OPERATOR | ASSIGNMENT_OPERATOR | NOT_OPERATOR | ARITH_OPERATOR;

BOOLEAN_OPERATOR: '==' | '<' | '>' | '<=' | '>=';
ASSIGNMENT_OPERATOR: '=';
NOT_OPERATOR: '!';
ARITH_OPERATOR: '+' | '-' | '*' | '/' | '%';

// OOP keywords
EXTENDS: 'extends';
IMPLEMENTS: 'implements';
INTERFACE: 'interface';

/*** Literals ***/
IntLiteral: ('0'..'9')+;

FloatLiteral: ('0'..'9')+ ('.' ('0'..'9')+)?;

StrLiteral:	'"' (.)+? '"';

//objLiteral: '{' ((Type Identifier) | (Identifier '=' expression))+ '}';

//fnLiteral: '(' (Type Identifier)+ ')' '{' (statement)+ '}';

Literal: IntLiteral | FloatLiteral | StrLiteral;

/* Type */
Type: BOOL | INT | FLOAT | FN | OBJ | NamedType;

LINE_COMMENT: '//' (.)+? '\n' -> skip;
BLOCK_COMMENT: '/*' (.)+?  '*/' -> skip;
WHITESPACE: (' ' | '\t' | '\r' | '\n') -> skip;
// valid identifier for type or variable

fragment Letter: [a-zA-Z$_];
fragment Alphanum: [a-zA-Z0-9$_];

NamedType: Letter (Alphanum)+;

Identifier: Letter (Alphanum)+;

/* Statements and Expressions */

// An expression is anything that evaluates to a value.
// Since everything evaluates to a value, everything is an expression.

// some of these are inline by necessity (otherwise we get left recursion problems)
expression
    :   statement // statements evaluate as expressions
    |   Identifier
    |   Literal
    |   expression BOOLEAN_OPERATOR expression // boolean expression
    |   expression ARITH_OPERATOR expression // arithmetic
    |   NOT_OPERATOR expression // !
    |   fnExpression
    ;

fnExpression: Identifier '(' (Identifier | Literal)+ ')'; // TODO this is wrong

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
exportStatement: 'export' StrLiteral;

// statements involving variables
variableStatement: declarationStatement | assignmentStatement | nameStatement;
declarationStatement: LET Identifier ASSIGNMENT_OPERATOR expression;
assignmentStatement: Identifier ASSIGNMENT_OPERATOR expression;
nameStatement // like "typedef" in C/C++
    : NAME Identifier Type
    | NAME Identifier IMPLEMENTS (Identifier)+ Type
    | NAME Identifier EXTENDS Identifier Type
    | NAME Identifier EXTENDS Identifier IMPLEMENTS (Identifier)+ Type
    ;

// control flow statements
controlFlowStatement: ifStatement | forStatement | whileStatement | breakStatement | continueStatement | returnStatement;
ifStatement: IF '(' expression ')'
    '{' (expression)+ '}'
    (
        // multiple possible else-if blocks
        (
            ELSE IF '(' expression ')'
            '{' (expression)+ '}'
        )+
        // one final else
        (ELSE '{' (expression)+ '}')?
    )?;
forStatement: FOR '(' expression ';' expression ';' expression ')' '{' (expression)+ '}';
whileStatement: WHILE '(' expression ')' '{' (expression)+ '}';
breakStatement: BREAK;
continueStatement: CONTINUE;
returnStatement: RETURN expression;


/* Top-level */
program: (expression)+;