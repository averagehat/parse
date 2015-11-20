grammar Pileup;
//upper case is lexer rule; lower case is parser rule; only parser rules can have `returns`
// parser rules need to be declared before lexer rules
//del returns [String bases] : '-' INT BASES {$bases = $BASES.text.substring(0, $INT.int) ; } ;


a : pos+ ;
pos : del | ins | MATCH | BASE | ENDBASE ;

del: '-' indel[$INT.int] ;
ins: '+' indel[$INT.int] ; 
indel[int n] locals [int i = 1] : ( {$i<=$n}? (BASE | ENDBASE) {$i = $i + 1} )* ;


ENDBASE : BASE '$' ;
BASE : [ACGT] ;
INT : [0-9]+ ;
MATCH : '.' | ',' ;

