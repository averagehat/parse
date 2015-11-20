# Generated from MyLexer.g4 by ANTLR 4.5.1
# encoding: utf-8
from __future__ import print_function
from antlr4 import *
from io import StringIO


def serializedATN():
    with StringIO() as buf:
        buf.write(u"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2")
        buf.write(u"\5%\b\1\4\2\t\2\4\3\t\3\4\4\t\4\3\2\3\2\3\2\3\2\3\2\3")
        buf.write(u"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\30\n\2\3\3\6\3")
        buf.write(u"\33\n\3\r\3\16\3\34\3\4\6\4 \n\4\r\4\16\4!\3\4\3\4\2")
        buf.write(u"\2\5\3\3\5\4\7\5\3\2\4\4\2C\\c|\5\2\13\f\17\17\"\"\'")
        buf.write(u"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\3\27\3\2\2\2\5\32")
        buf.write(u"\3\2\2\2\7\37\3\2\2\2\t\n\7J\2\2\n\13\7g\2\2\13\f\7n")
        buf.write(u"\2\2\f\r\7n\2\2\r\30\7q\2\2\16\17\7I\2\2\17\20\7t\2\2")
        buf.write(u"\20\21\7g\2\2\21\22\7g\2\2\22\23\7v\2\2\23\24\7k\2\2")
        buf.write(u"\24\25\7p\2\2\25\26\7i\2\2\26\30\7u\2\2\27\t\3\2\2\2")
        buf.write(u"\27\16\3\2\2\2\30\4\3\2\2\2\31\33\t\2\2\2\32\31\3\2\2")
        buf.write(u"\2\33\34\3\2\2\2\34\32\3\2\2\2\34\35\3\2\2\2\35\6\3\2")
        buf.write(u"\2\2\36 \t\3\2\2\37\36\3\2\2\2 !\3\2\2\2!\37\3\2\2\2")
        buf.write(u"!\"\3\2\2\2\"#\3\2\2\2#$\b\4\2\2$\b\3\2\2\2\6\2\27\34")
        buf.write(u"!\3\b\2\2")
        return buf.getvalue()


class MyLexer(Lexer):

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]


    GREETING = 1
    ID = 2
    WS = 3

    modeNames = [ u"DEFAULT_MODE" ]

    literalNames = [ u"<INVALID>",
 ]

    symbolicNames = [ u"<INVALID>",
            u"GREETING", u"ID", u"WS" ]

    ruleNames = [ u"GREETING", u"ID", u"WS" ]

    grammarFileName = u"MyLexer.g4"

    def __init__(self, input=None):
        super(MyLexer, self).__init__(input)
        self.checkVersion("4.5.1")
        self._interp = LexerATNSimulator(self, self.atn, self.decisionsToDFA, PredictionContextCache())
        self._actions = None
        self._predicates = None


