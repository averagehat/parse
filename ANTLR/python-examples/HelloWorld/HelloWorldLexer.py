# Generated from HelloWorld.g4 by ANTLR 4.5.1
# encoding: utf-8
from __future__ import print_function
from antlr4 import *
from io import StringIO


def serializedATN():
    with StringIO() as buf:
        buf.write(u"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2")
        buf.write(u"\5\33\b\1\4\2\t\2\4\3\t\3\4\4\t\4\3\2\3\2\3\2\3\2\3\2")
        buf.write(u"\3\2\3\3\6\3\21\n\3\r\3\16\3\22\3\4\6\4\26\n\4\r\4\16")
        buf.write(u"\4\27\3\4\3\4\2\2\5\3\3\5\4\7\5\3\2\4\4\2C\\c|\5\2\13")
        buf.write(u"\f\17\17\"\"\34\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\3")
        buf.write(u"\t\3\2\2\2\5\20\3\2\2\2\7\25\3\2\2\2\t\n\7J\2\2\n\13")
        buf.write(u"\7g\2\2\13\f\7n\2\2\f\r\7n\2\2\r\16\7q\2\2\16\4\3\2\2")
        buf.write(u"\2\17\21\t\2\2\2\20\17\3\2\2\2\21\22\3\2\2\2\22\20\3")
        buf.write(u"\2\2\2\22\23\3\2\2\2\23\6\3\2\2\2\24\26\t\3\2\2\25\24")
        buf.write(u"\3\2\2\2\26\27\3\2\2\2\27\25\3\2\2\2\27\30\3\2\2\2\30")
        buf.write(u"\31\3\2\2\2\31\32\b\4\2\2\32\b\3\2\2\2\5\2\22\27\3\b")
        buf.write(u"\2\2")
        return buf.getvalue()


class HelloWorldLexer(Lexer):

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]


    GREETING = 1
    NAME = 2
    WS = 3

    modeNames = [ u"DEFAULT_MODE" ]

    literalNames = [ u"<INVALID>",
            u"'Hello'" ]

    symbolicNames = [ u"<INVALID>",
            u"GREETING", u"NAME", u"WS" ]

    ruleNames = [ u"GREETING", u"NAME", u"WS" ]

    grammarFileName = u"HelloWorld.g4"

    def __init__(self, input=None):
        super(HelloWorldLexer, self).__init__(input)
        self.checkVersion("4.5.1")
        self._interp = LexerATNSimulator(self, self.atn, self.decisionsToDFA, PredictionContextCache())
        self._actions = None
        self._predicates = None


