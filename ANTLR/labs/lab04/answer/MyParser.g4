parser grammar MyParser;    			

options { tokenVocab=MyLexer; }	

amounts : (amount NL)* amount NL? EOF ;

amount : CurrencySymbol Space* Digit+ Cents? ;