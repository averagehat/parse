parser grammar MyParser;    			

options { tokenVocab=MyLexer; }	

money : currency amount ;

currency : Currency ;

amount : Amount ;