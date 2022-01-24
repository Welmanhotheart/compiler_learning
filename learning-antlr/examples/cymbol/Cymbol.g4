grammar Cymbol;
file: (functionDecl | varDecl)+ ;

varDecl
: type ID ('=' expr)? ';'
;
type: 'float' | 'int' | 'void' ; // user-defined types

functionDecl
: type ID '(' formalParameters? ')' block // "void f(int x) {...}"
;
formalParameters
: formalParameter (',' formalParameter)*
;
formalParameter
: type ID
;

block: '{' stat* '}' ; // possibly empty statement block
stat: block
| varDecl
| 'if' expr 'then' stat ('else' stat)?
| 'return' expr? ';'
| expr '=' expr ';' // assignment
| expr ';' // func call
;

expr: ID '(' exprList? ')' // func call like f(), f(x), f(1,2)
| expr '[' expr ']' // array index like a[i], a[i][j]
| '-' expr // unary minus
| '!' expr // boolean not
| expr '*' expr
| expr ('+'|'-') expr
| expr '==' expr // equality comparison (lowest priority op)
| ID // variable reference
| INT
| '(' expr ')'
;
exprList : expr (',' expr)* ; // arg list

ID : [a-z]+ ; // match lower-case identifiers

fragment INT : '0' | [1-9] [0-9]* ; // no leading zeros