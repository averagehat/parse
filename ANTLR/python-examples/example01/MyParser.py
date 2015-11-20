# Generated from MyParser.g4 by ANTLR 4.5.1
# encoding: utf-8
from __future__ import print_function
from antlr4 import *
from io import StringIO

def serializedATN():
    with StringIO() as buf:
        buf.write(u"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3")
        buf.write(u"\5\b\4\2\t\2\3\2\3\2\3\2\3\2\2\2\3\2\2\2\6\2\4\3\2\2")
        buf.write(u"\2\4\5\7\3\2\2\5\6\7\4\2\2\6\3\3\2\2\2\2")
        return buf.getvalue()


class MyParser ( Parser ):

    grammarFileName = "MyParser.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [  ]

    symbolicNames = [ u"<INVALID>", u"GREETING", u"ID", u"WS" ]

    RULE_message = 0

    ruleNames =  [ u"message" ]

    EOF = Token.EOF
    GREETING=1
    ID=2
    WS=3

    def __init__(self, input):
        super(MyParser, self).__init__(input)
        self.checkVersion("4.5.1")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None



    class MessageContext(ParserRuleContext):

        def __init__(self, parser, parent=None, invokingState=-1):
            super(MyParser.MessageContext, self).__init__(parent, invokingState)
            self.parser = parser

        def GREETING(self):
            return self.getToken(MyParser.GREETING, 0)

        def ID(self):
            return self.getToken(MyParser.ID, 0)

        def getRuleIndex(self):
            return MyParser.RULE_message




    def message(self):

        localctx = MyParser.MessageContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_message)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 2
            self.match(MyParser.GREETING)
            self.state = 3
            self.match(MyParser.ID)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





