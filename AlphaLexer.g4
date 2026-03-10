lexer grammar AlphaLexer;
/******** lexer ********/
//keywords
IF      : 'if' ;
THEN    : 'then' ;
ELSE    : 'else' ;
WHILE   : 'while' ;
DO      : 'do' ;
LET     : 'let' ;
IN      : 'in' ;
BEGIN   : 'begin' ;
END     : 'end' ;
CONST   : 'const' ;
VAR     : 'var' ;

//symbols
SEMI    : ';' ;
ASSIGN  : ':=' ;
LEFTP   : '(' ;
RIGHTP  : ')' ;
TILDE   : '~' ;
COLON   : ':' ;
ADD     : '+' ;
SUB     : '-' ;
MUL     : '*' ;
DIV     : '/' ;
MOD     : '%' ;
EQEQ    : '==' ;
NOTEQ   : '!=' ;
LESS    : '<' ;
MORET   : '>' ;
LESSEQ  : '<=' ;
MOREEQ  : '>=' ;

//others

ID      : LETTER (LETTER | DIGIT)* ;
INTLIT  : DIGIT DIGIT* ;

WS      : [ \t\r\n]+ -> skip ;

fragment LETTER : [a-zA-Z] ;
fragment DIGIT : [0-9] ;