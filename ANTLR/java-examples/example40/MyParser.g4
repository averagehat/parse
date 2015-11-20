parser grammar MyParser;    			

options { tokenVocab=MyLexer; }			

memberNamePair : '{' member '=' name '}' EOF ;

member : UnquotedString ;

name : (UnquotedString | QuotedString) ;