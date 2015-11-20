parser grammar MyParser;    			

options { tokenVocab=MyLexer; }			

input : comment ;

comment : COMMENT ;