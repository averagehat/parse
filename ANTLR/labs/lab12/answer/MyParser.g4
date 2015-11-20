parser grammar MyParser;    			

options { tokenVocab=MyLexer; }	

surnames : (SURNAME)+ EOF ;