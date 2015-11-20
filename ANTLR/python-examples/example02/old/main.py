import sys
from antlr4 import *
from MyLexer import MyLexer
from MyParser import MyParser


def main(argv):
    input = FileStream(argv[1])
    lexer = MyLexer(input)
    stream = CommonTokenStream(lexer)
    parser = MyParser(stream)
    tree = parser.message()
    print(tree.toStringTree(recog=parser))

if __name__ == '__main__':
    main(sys.argv)