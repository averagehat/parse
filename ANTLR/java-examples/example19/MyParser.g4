parser grammar MyParser;    			

options { tokenVocab=MyLexer; }			

pairs     : (pair)* ;
pair      : key EQ value ;
key       : KEY ;
value     : VALUE ;		