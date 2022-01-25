grammar PropertyFile;
file : prop+ ;

prop : ID '=' STRING '\n' ;

ID : [a-z]+ ; // match lower-case identifiers

STRING : '"' (ESC | ~["\\])* '"' ;
WS : [ \t\n\r]+ -> skip ;
fragment ESC : '\\' (["\\/bfnrt] | UNICODE) ;
fragment UNICODE : 'u' HEX HEX HEX HEX ;
fragment HEX : [0-9a-fA-F] ;