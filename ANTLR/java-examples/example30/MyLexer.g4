lexer grammar MyLexer; 

//NAME : ('López' | 'Lecœur' | 'Muñoz') ;

//NAME : ('L\u00F3pez' | 'Lec\u0153ur' | 'Mu\u00F1oz') ;

NAME : '\u0052\u006F\u0067\u0065\u0072' ;

WS : [ \r\n\t]+   -> skip ;