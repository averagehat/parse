lexer grammar MyLexer; 

CurrencySymbol : '€' | '$' | '¥' | '£' ; 				

Space : ' ' ; 

Digit : [0-9] ;

Cents : '.' Digit Digit ;