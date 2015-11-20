# Generated from MyLexer.g4 by ANTLR 4.5.1
# encoding: utf-8
from __future__ import print_function
from antlr4 import *
from io import StringIO


def serializedATN():
    with StringIO() as buf:
        buf.write(u"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2")
        buf.write(u"\4\21\b\1\4\2\t\2\4\3\t\3\3\2\6\2\t\n\2\r\2\16\2\n\3")
        buf.write(u"\3\5\3\16\n\3\3\3\3\3\2\2\4\3\3\5\4\3\2\3\7\2\"\"..\60")
        buf.write(u"\60C\\c|\22\2\3\3\2\2\2\2\5\3\2\2\2\3\b\3\2\2\2\5\r\3")
        buf.write(u"\2\2\2\7\t\t\2\2\2\b\7\3\2\2\2\t\n\3\2\2\2\n\b\3\2\2")
        buf.write(u"\2\n\13\3\2\2\2\13\4\3\2\2\2\f\16\7\17\2\2\r\f\3\2\2")
        buf.write(u"\2\r\16\3\2\2\2\16\17\3\2\2\2\17\20\7\f\2\2\20\6\3\2")
        buf.write(u"\2\2\5\2\n\r\2")
        return buf.getvalue()


class MyLexer(Lexer):

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]


    A_STRING = 1
    NL = 2

    modeNames = [ u"DEFAULT_MODE" ]

    literalNames = [ u"<INVALID>",
 ]

    symbolicNames = [ u"<INVALID>",
            u"A_STRING", u"NL" ]

    ruleNames = [ u"A_STRING", u"NL" ]

    grammarFileName = u"MyLexer.g4"

    def __init__(self, input=None):
        super(MyLexer, self).__init__(input)
        self.checkVersion("4.5.1")
        self._interp = LexerATNSimulator(self, self.atn, self.decisionsToDFA, PredictionContextCache())
        self._actions = None
        self._predicates = None


