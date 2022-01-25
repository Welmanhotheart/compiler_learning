grammar R;
prog: ( expr_or_assign (';'|NL)
| NL
)*
EOF
;

expr_or_assign
: expr ('<-'|'='|'<<-') expr_or_assign
| expr
;

expr:
 '{' exprlist '}' // compound statement
| 'if' '(' expr ')' expr
| 'if' '(' expr ')' expr 'else' expr
| 'for' '(' ID 'in' expr ')' expr
| 'while' '(' expr ')' expr
| 'repeat' expr
| '?' expr // get help on expr, usually string or ID
| 'next'
| 'break'
|  expr '[[' sublist ']' ']' // '[[' follows R's yacc grammar
| expr '[' sublist ']'
| expr ('::'|':::') expr
| expr ('$'|'@') expr
| expr '^'<assoc=right> expr
| ('-'|'+') expr
| expr ':' expr
//| expr USER_OP expr // anything wrappedin %: '%' .* '%'
| expr ('*'|'/') expr
| expr ('+'|'-') expr
| expr ('>'|'>='|'<'|'<='|'=='|'!=') expr
| 'function' '(' formlist? ')' expr // define function
| expr '(' sublist ')' // call function
| ID
| INT

;



formlist : form (',' form)* ;

form: ID
| ID '=' expr
;

exprlist
: expr_or_assign ((';'|NL) expr_or_assign?)*
|;






sublist : sub (',' sub)* ;

sub : expr
| ID '='
| ID '=' expr
| STRING '='
| STRING '=' expr
| 'NULL' '='
| 'NULL' '=' expr;



NL : '\r'? '\n' ;

ID : '.' (LETTER|'_'|'.') (LETTER|DIGIT|'_'|'.')*
| LETTER (LETTER|DIGIT|'_'|'.')*
;

INT :DIGIT+;
STRING : '"' ('""'|~'"')* '"' ; // quote-quote is an escaped quote
fragment DIGIT:[0-9];
fragment LETTER : [a-zA-Z] ;