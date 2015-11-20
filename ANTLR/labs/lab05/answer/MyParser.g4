parser grammar MyParser;    			

options { tokenVocab=MyLexer; }	

purchases : (purchase)* EOF ;

purchase : product amount ;

product : Product ;

amount : CurrencySymbol Space* Digit+ Cents? ;