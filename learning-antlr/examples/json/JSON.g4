grammar JSON;

json: object
| array
;


object
: '{' pair (',' pair)* '}'
| '{' '}' // empty object
;
pair: STRING ':' value ;
array
: '[' value (',' value)* ']'
| '[' ']' // empty array
;

value
: STRING
| NUMBER
| object // recursion
| array // recursion
| 'true' // keywords
| 'false'
| 'null'
;

STRING : '"' ('""'|~'"')* '"' ; // quote-quote is an escaped quote
IDENTIFIER: [A-Z|a-z]+;

INT : DIGIT+ ;

FLOAT
: DIGIT+ '.' DIGIT*
| '.' DIGIT+
;

NUMBER:
    INT | FLOAT | EXPONENTIAL;

EXPONENTIAL: DIGIT+ E DIGIT+;

fragment ID_LETTER : 'a'..'z'|'A'..'Z'|'_' ;
fragment DIGIT : '0'..'9' ;
fragment E:[eE];


