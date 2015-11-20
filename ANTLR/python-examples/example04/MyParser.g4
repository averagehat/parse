grammar MyParser;
//upper case is lexer rule; lower case is parser rule; only parser rules can have `returns`
// parser rules need to be declared before lexer rules

options { tokenVocba=MyLexer; }

a : pos+  EOF;
pos : del | ins | MATCH | BASE | ENDBASE ; 
del: '-' indel[$INT.int] ;
ins: '+' indel[$INT.int] ; 
indel[int n] locals [int i = 1] : ( {$i<=$n}? (BASE | ENDBASE) {$i = $i + 1} )* ;
