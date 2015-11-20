lexer grammar MyLexer; 

Sentence : (.)+?('.') ; 

NL : ('\r')?('\n') -> skip ;