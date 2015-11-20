parser grammar MyParser;    			

options { tokenVocab=MyLexer; }	

ipfix : version EOF ;

version : VERSION ;