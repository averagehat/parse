@echo off

set PATH=../../jdk1.7.0_76/bin;../../Python27/Scripts;../../Python27;%PATH%
set CLASSPATH=.;../../antlr-jar/antlr-complete.jar;%CLASSPATH%

echo.
echo.
echo.
echo **********************************************

echo Running ANTLR on the lexer: MyLexer.g4
java org.antlr.v4.Tool -Dlanguage=Python2 MyLexer.g4 -no-listener -no-visitor
echo.
echo.

echo Running ANTLR on the parser: MyParser.g4
java org.antlr.v4.Tool -Dlanguage=Python2 MyParser.g4 -no-listener -no-visitor
echo.
echo.

echo Show the tree
echo python pygrun.py -t My received input.txt 
python pygrun.py -t My received input.txt

rem echo Show the tokens
rem echo python pygrun.py -k My received input.txt 
rem python pygrun.py -k My received input.txt

rem echo Show the trace
rem echo python pygrun.py -a My received input.txt 
rem python pygrun.py -a My received input.txt
