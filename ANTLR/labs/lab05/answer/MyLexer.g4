lexer grammar MyLexer; 

CurrencySymbol : '€' | '$' | '¥' | '£' ; 				

Space : ' ' ; 

Digit : [0-9] ;

Cents : '.' Digit Digit ;

NL  : ('\r')?'\n' -> skip ;

Separator : '/' -> skip ;

Product : (~[/€$¥£0-9.\r\n]+) ;