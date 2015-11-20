parser grammar MyParser;    			

options { tokenVocab=MyLexer; }			

text : name EOF ;

name : NAME ;