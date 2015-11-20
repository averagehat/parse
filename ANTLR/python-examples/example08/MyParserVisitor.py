# Generated from MyParser.g4 by ANTLR 4.5.1
from antlr4 import *

# This class defines a complete generic visitor for a parse tree produced by MyParser.

class MyParserVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by MyParser#intfile.
    def visitIntfile(self, ctx):
        return self.visitChildren(ctx)


