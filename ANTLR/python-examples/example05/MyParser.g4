parser grammar MyParser;    			

options { tokenVocab=MyLexer; }			

memberNamePair : LCurly member EQ name RCurly EOF ;

member : UnquotedString ;

name : (UnquotedString | QuotedString) ;