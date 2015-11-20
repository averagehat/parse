@echo off

set PATH=../../jdk1.7.0_76/bin;../../Python27/Scripts;../../Python27;%PATH%
set CLASSPATH=.;../../antlr-jar/antlr-complete.jar;%CLASSPATH%

echo.
echo.
echo.
echo **********************************************
echo.

echo Running ANTLR on the grammar: 
java org.antlr.v4.Tool -Dlanguage=Python2 Hello.g4 -visitor
echo.
echo.

echo test_hello.py input.txt 
python test_hello.py input.txt
echo.
echo.