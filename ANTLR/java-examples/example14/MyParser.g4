parser grammar MyParser;    			

options { tokenVocab=MyLexer; }				

json   : array EOF ;		

array  : ARRAY ;