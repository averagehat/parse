parser grammar MyParser;    			

options { tokenVocab=MyLexer; }			

json   : array EOF ;

array  : LB RB
       |
	     LB (array | INT) (COMMA (array | INT))* RB
       ;