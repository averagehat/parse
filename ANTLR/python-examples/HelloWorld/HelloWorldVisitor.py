# Generated from HelloWorld.g4 by ANTLR 4.5.1
from antlr4 import *

# This class defines a complete generic visitor for a parse tree produced by HelloWorldParser.

class HelloWorldVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by HelloWorldParser#message.
    def visitMessage(self, ctx):
        return self.visitChildren(ctx)


