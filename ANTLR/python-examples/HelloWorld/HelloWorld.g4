grammar HelloWorld;  			

message   : GREETING NAME;

GREETING : 'Hello' ;	
NAME     : [a-zA-Z]+ ;						
WS       : [ \t\r\n]+ -> skip ;  			