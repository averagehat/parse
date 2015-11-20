lexer grammar MyLexer;    	

MagicBytes       : '\u00DE' '\u00AD' '\u00BE' '\u00EF' -> pushMode(OTHERBYTES);

mode OTHERBYTES ;
Bytes            : [\u0000-\u00FF] -> skip ; 