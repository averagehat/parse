import sys
from antlr4 import *
from MyLexer import MyLexer
from MyParser import MyParser
from rewriter import RewriteListener
import stdio

def main(argv):
    istream = FileStream(argv[1])
    lexer = MyLexer(istream)
    stream = CommonTokenStream(lexer)
    parser = MyParser(stream)
    tree = parser.intfile()
    print(tree.toStringTree(recog=parser))

    walker = ParseTreeWalker()
    walker.walk(RewriteListener(), tree)
    print("Done")

if __name__ == '__main__':
    main(sys.argv)