parser grammar MyParser;    			

options { tokenVocab=MyLexer; }			

file: (INT)+ ;