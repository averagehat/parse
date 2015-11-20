parser grammar MyParser;    			

options { tokenVocab=MyLexer; }			

messages  : (message NL)* message (NL)? EOF;
message   : GREETING ID;				