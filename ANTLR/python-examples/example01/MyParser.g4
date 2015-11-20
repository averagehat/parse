/**
 * Parser grammar for a simple greeting
 */
parser grammar MyParser;    			// Define a parser grammar called MyParser

options { tokenVocab=MyLexer; }			// Reuse the lexer grammar called MyLexer

/* Define one parser rule: a message is
   a greeting followed by a name.
*/
message   : GREETING ID;				// match a greeting followed by an identifier