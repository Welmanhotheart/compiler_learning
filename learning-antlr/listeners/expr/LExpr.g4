grammar LExpr;
s : e ;
e : e op=MULT e // MULT is '*'
| e op=ADD e // ADD is '+'
| INT
;


ADD : '+';
MULT : '*';

INT : '0' | [1-9] [0-9]* ; // no leading zeros