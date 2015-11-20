parser grammar MyParser;    			

options { tokenVocab=MyLexer; }			

name  : (ken | other)+ ;

ken   : KEN ;

other : OTHER ;