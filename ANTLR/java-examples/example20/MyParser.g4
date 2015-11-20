parser grammar MyParser;    			

options { tokenVocab=MyLexer; }			

pairs     : (pair)* ;
pair      : key EQ (key | value) ;
key       : KEY ;
value     : VALUE ;	