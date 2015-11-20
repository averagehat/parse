parser grammar MyParser;    			

options { tokenVocab=MyLexer; }			

address   : NUMBER ROAD ZIPCODE EOF
          | street zipcode EOF
          ;
street    : NUMBER ROAD ;
zipcode   : ZIPCODE ;	