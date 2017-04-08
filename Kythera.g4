/* Draft EBNF for Kythera */
/* This grammar is built using ANTLR v4.6. */
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
BOOL: 'bool';
INT: 'int';
FLOAT: 'float';
FN: 'fn';
OBJ: 'obj';

// operators
ASSIGNMENT_OPERATOR: '=';
BOOLEAN_OPERATOR: '==' | '<' | '>' | '<=' | '>=';
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

objLiteral: '{' ((Type identifier) | (identifier '=' expression))+ '}';

fnLiteral: '(' (Type identifier)+ ')' '{' (statement)+ '}';

literal: IntLiteral | FloatLiteral | StrLiteral | objLiteral | fnLiteral;

/* Type */
Type: BOOL | INT | FLOAT | FN | OBJ;

identifier: Identifier;

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
    |   fnExpression
    ;

fnExpression: identifier '(' (identifier | literal)+ ')'; // TODO this is wrong

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
declarationStatement: LET identifier ASSIGNMENT_OPERATOR expression;
assignmentStatement: identifier ASSIGNMENT_OPERATOR expression;
nameStatement // like "typedef" in C/C++
    : NAME identifier Type
    | NAME identifier IMPLEMENTS (identifier)+ Type
    | NAME identifier EXTENDS identifier Type
    | NAME identifier EXTENDS identifier IMPLEMENTS (identifier)+ Type
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

WHITESPACE: (' ' | '\t' | '\r' | '\n') -> skip;