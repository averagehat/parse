parser grammar MyParser;    			

options { tokenVocab=MyLexer; }			

text : string* ;

string : STRING ;