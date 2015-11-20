lexer grammar MyLexer; 

TITLE : (~[\r\n]+) -> pushMode(LINES);

NL1 : [\r\n]+ -> skip ;

mode LINES ;

LINE : (~[\r\n]+) ;

NL2 : [\r\n]+ -> skip ;