parser grammar MyParser;    			

options { tokenVocab=MyLexer; }	

amount : CurrencySymbol Space* Digit+ Cents? EOF ;