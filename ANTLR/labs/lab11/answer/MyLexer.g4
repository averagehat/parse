lexer grammar MyLexer; 

TITLE : (~[\r\n]+) -> pushMode(LINES);

NL1 : [\r\n]+ -> skip ;

mode LINES ;

LINE : (~[\r\n]+) ;

NEWLINE: ('\r' ? '\n') -> skip ;

EMPTYLINE: ('\r' ? '\n')('\r' ? '\n') -> skip, popMode ;