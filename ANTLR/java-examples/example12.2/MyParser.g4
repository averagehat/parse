parser grammar MyParser;    			

options { tokenVocab=MyLexer; }			

input : (string | delimiter)* ;

string : STRING ;

delimiter : DELIMITER ;