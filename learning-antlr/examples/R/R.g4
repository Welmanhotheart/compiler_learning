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