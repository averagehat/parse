parser grammar MyParser;    			

options { tokenVocab=MyLexer; }			

file : (line 
          { 
              if ($line.lineLength > 20)
              {
                  System.out.println("Line is too long: " + $line.lineLength + " characters!"); 
              }
          }
         )+ EOF
    ;

line returns [int lineLength] 
    : s=A_STRING
      { 
        String line = $s.text;
        int lineLength = line.length();
        $lineLength = lineLength;
      }
      NL
    ;
