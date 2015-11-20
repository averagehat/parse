parser grammar MyParser;    			

options { tokenVocab=MyLexer; }			

afile : (line 
          { 
if len($line.text) > 20:
   print("Line is too long: " + str(len($line.text)) + " characters!")
          }
         )+ EOF
    ;

line returns [lineLength] 
    : s=A_STRING
          { 
lineLength = len($s.text)
$lineLength = lineLength
          }
      NL
    ;