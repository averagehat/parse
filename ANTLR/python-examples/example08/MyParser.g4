parser grammar MyParser;    			

options { tokenVocab=MyLexer; }			

intfile: (INT)+ ;			