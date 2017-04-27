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

// built-in types
NEW: 'new';

BOOL: 'bool';
INT: 'int';
FLOAT: 'float';
STR: 'str';
FN: 'fn';
OBJ: 'obj';
ARR: 'arr';

TYPEOF: 'typeof';

objType: OBJ '{' (objTypeEntry)*? '}';
objTypeEntry: type identifier;

// only one return value allowed right now
fnType: FN '(' (fnTypeArg (',' fnTypeArg)*? )? ')' ':' fnTypeReturn ;
fnTypeArg: type;
fnTypeReturn: type;

// operators
ASSIGNMENT_OPERATOR: '=';
BOOLEAN_COMPARISON: '==' | '!=' | '<' | '>' | '<=' | '>=';
BOOLEAN_OPERATOR: '&&' | '||';
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

objLiteral: '{' (objLiteralEntry)*? '}';

objLiteralEntry: identifier ASSIGNMENT_OPERATOR expression;

objAccess: identifier '.' identifier;

// multiple returns are not yet supported.
fnLiteral: FN '(' fnLiteralArg (',' fnLiteralArg)* ')' ':' type expBlock;

fnLiteralArg: type identifier;

//arrLiteral: type '[' (literal)*? ']';

NULL: 'null';

literal: IntLiteral | FloatLiteral | StrLiteral | NULL | TRUE | FALSE | objLiteral | fnLiteral;

/* Type */
type: BOOL | INT | FLOAT | STR | NULL | OBJ | fnType | objType | Identifier ;

identifier: Identifier;
//identifier: Identifier | Identifier '[' IntLiteral ']' | Identifier '.' Identifier

// lexically, identifiers are the same as types
Identifier: ('a'..'z' | 'A'..'Z') ('a'..'z' | 'A'..'Z' | '0'..'9' | '_')*;

/* Statements and Expressions */

// An expression is anything that evaluates to a value.
// Since everything evaluates to a value, everything is an expression.

// some of these are inline by necessity (otherwise we get left recursion problems)
expression
    :   fnCallExpression
    |   TYPEOF expression
    |   expression BOOLEAN_COMPARISON expression // boolean expression
    |   expression BOOLEAN_OPERATOR expression
    |   expression ARITH_OPERATOR expression // arithmetic
    |   NOT_OPERATOR expression // !
    |   NEW type
    |   statement // statements evaluate as expressions
    |   identifier
    |   objAccess
    |   literal
    |   '(' expression ')'
    ;

fnCallExpression: (identifier | fnLiteral) '(' fnCallParamList ')';

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
importStatement: 'import' StrLiteral;
includeStatement: 'include' StrLiteral;
exportStatement: 'export' identifier;

// statements involving variables
variableStatement: declarationStatement | assignmentStatement | nameStatement;
declarationStatement: LET identifier ASSIGNMENT_OPERATOR expression;
assignmentStatement: identifier ASSIGNMENT_OPERATOR expression;

nameStatement // like "typedef" in C/C++
    : NAME identifier type
    // OOP not supported yet
//    | NAME identifier IMPLEMENTS (identifier)+ type
//    | NAME identifier EXTENDS identifier type
//    | NAME identifier EXTENDS identifier IMPLEMENTS (identifier)+ type
//    | NAME identifier INTERFACE identifier objType
    ;

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