parser grammar MyParser;    			

options { tokenVocab=MyLexer; }			

test : (id | keyword) EOF ;

id   : ID ;

keyword : KEYWORDS ;