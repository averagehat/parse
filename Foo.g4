grammar Foo;
ins returns [String b] : i=INT  {$b = "foo" ; } ;
INT : [0-9]+ ;
