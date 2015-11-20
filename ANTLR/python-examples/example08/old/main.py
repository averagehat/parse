from antlr4 import *
from MyLexer import MyLexer
from MyParser import MyParser
import sys
import stdio

def main(argv):

    input = FileStream(argv[1])

    lexer = MyLexer(input)

    stream = CommonTokenStream(lexer)

    parser = MyParser(stream)

    tree = parser.intfile()   # changed parser.StartRule() to parser.intfile()
	
    print(tree.toStringTree(recog=parser))
	
    # printer = KeyPrinter()

    # walker = ParseTreeWalker()

    # walker.walk(printer, tree)

 

if __name__ == '__main__':
    main(sys.argv)


