/**
 * Lexer grammar for a simple greeting
 */
lexer grammar MyLexer;    				// Define a lexer grammar called MyLexer

/* Define three token rules: one for
   the greeting, one for the person's name,
   and one for whitespaces.
*/
GREETING : ('Hello' | 'Greetings') ;	// Match either of these strings
ID  : [a-zA-Z]+ ;						// Match lower- and upper-case identifiers
WS  : [ \t\r\n]+ -> skip ;  			// Match any whitespaces and then discard them