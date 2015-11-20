@echo off

set PATH=../../jdk1.7.0_76/bin;../../Python27/Scripts;../../Python27;%PATH%
set CLASSPATH=.;..;../../antlr-jar/antlr-complete.jar;%CLASSPATH%

echo.
echo.
echo.
echo **********************************************
echo.
echo Deleting old Python files (if any)
del *.py
echo.
echo.

echo Running ANTLR on the parser: HelloWorld.g4
java org.antlr.v4.Tool -Dlanguage=Python2 HelloWorld.g4 -visitor
echo.
echo.

echo ***Important*** 
echo The test rig only operates on Java .class files. It does
echo not operate on Python .py files. 
echo.
echo.
echo So we need to generate the Java files
java org.antlr.v4.Tool HelloWorld.g4 -no-listener -no-visitor
echo.
echo Then compile the .java files
javac *.java
echo.
echo Now run the test rig on the generated (Java) parser, using as input the string in: input.txt
echo And generating a GUI output (i.e., a parse tree graphic)
java org.antlr.v4.gui.TestRig HelloWorld message -gui < input.txt
echo.
echo Lastly, discard the .java and .class files
del *.java
del *.class
echo.
echo.