@echo off

set CLASSPATH=.;../../antlr-jar/antlr-complete.jar;%CLASSPATH%

java org.antlr.v4.Tool %1 -no-listener -no-visitor