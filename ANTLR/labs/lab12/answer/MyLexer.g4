lexer grammar MyLexer; 

SURNAME : (~[.\r\n]+) | ((~[.\r\n]+) '\\.' (~[.\r\n]+)) ;

SEPARATOR : '.' -> skip ;

NEWLINE: ('\r' ? '\n') -> skip ;