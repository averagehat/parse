# Generated from HelloWorld.g4 by ANTLR 4.5.1
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


class HelloWorldParser ( Parser ):

    grammarFileName = "HelloWorld.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ u"<INVALID>", u"'Hello'" ]

    symbolicNames = [ u"<INVALID>", u"GREETING", u"NAME", u"WS" ]

    RULE_message = 0

    ruleNames =  [ u"message" ]

    EOF = Token.EOF
    GREETING=1
    NAME=2
    WS=3

    def __init__(self, input):
        super(HelloWorldParser, self).__init__(input)
        self.checkVersion("4.5.1")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None



    class MessageContext(ParserRuleContext):

        def __init__(self, parser, parent=None, invokingState=-1):
            super(HelloWorldParser.MessageContext, self).__init__(parent, invokingState)
            self.parser = parser

        def GREETING(self):
            return self.getToken(HelloWorldParser.GREETING, 0)

        def NAME(self):
            return self.getToken(HelloWorldParser.NAME, 0)

        def getRuleIndex(self):
            return HelloWorldParser.RULE_message

        def enterRule(self, listener):
            if hasattr(listener, "enterMessage"):
                listener.enterMessage(self)

        def exitRule(self, listener):
            if hasattr(listener, "exitMessage"):
                listener.exitMessage(self)

        def accept(self, visitor):
            if hasattr(visitor, "visitMessage"):
                return visitor.visitMessage(self)
            else:
                return visitor.visitChildren(self)




    def message(self):

        localctx = HelloWorldParser.MessageContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_message)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 2
            self.match(HelloWorldParser.GREETING)
            self.state = 3
            self.match(HelloWorldParser.NAME)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





