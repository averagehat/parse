from MyParserListener import MyParserListener

class RewriteListener(MyParserListener):
    # Enter a parse tree produced by MyParserParser#intfile.
    def enterIntfile(self, ctx):
        print("Entering intfile")

    # Exit a parse tree produced by MyParserParser#intfile.
    def exitIntfile(self, ctx):
        print("Exiting intfile")