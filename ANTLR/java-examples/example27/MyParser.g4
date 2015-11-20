parser grammar MyParser;    			

options { tokenVocab=MyLexer; }			

text : name* ;

name : NAME ;