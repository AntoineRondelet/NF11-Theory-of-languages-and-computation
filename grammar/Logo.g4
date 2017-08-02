grammar Logo; 

@header {
  package logoparsing;
}

NB : '0' | [1-9][0-9]* | [0-9]*[.][0-9][0-9]* ;
WS : [ \t\r\n]+ -> skip ;
BOOLEAN : '<'|'>'|'<='|'>='|'='|'!=' ;
POUR : 'POUR'|'pour'|'Pour' ;
FIN : 'FIN'|'fin'|'Fin' ;
VAR : '"'[a-zA-Z][a-zA-Z0-9]* ;
VUSE : ':'[a-zA-Z][a-zA-Z0-9]* ;
NAME : [a-zA-Z][a-zA-Z0-9]* ;

programme : 
	fonction* liste_instructions
;

liste_instructions :
	(instruction)+
;

fonction :
	POUR NAME liste_variables? liste_instructions FIN
;

liste_variables:
	(VUSE)+
;

liste_expr:
	(expr)+
;

instruction :
	'av' expr # av
	| 'td' expr # td
	| 'tg' expr # tg
	| 'lc' # lc
	| 'bc' # bc
	| 've' # ve
	| 're' expr # re
	| 'fcc' expr # fcc
	| 'fpos' expr expr # fpos
	| 'repete' expr '['liste_instructions']' # repete
	| 'donne' VAR expr # donne
	| 'si' exprbool '['liste_instructions']' ('['liste_instructions']')? # si
	| 'tantque' exprbool '['liste_instructions']' # tantque
	| NAME liste_expr?  # appelproc
	| 'rends' expr #rends
;  

expr:
	expr '^' expr # power
	| expr ('*' | '/' ) expr # mult
	| expr ('+' | '-' ) expr # sum
	| NB # nb
	| VUSE # var
	| '('expr')' # parenthese
	| 'hasard' NB # hasard
	| 'loop' # loop
	| NAME liste_expr?  # appelfonc
;

exprbool: expr BOOLEAN expr ;