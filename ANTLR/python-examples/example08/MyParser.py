# Generated from MyParser.g4 by ANTLR 4.5.1
# encoding: utf-8
from __future__ import print_function
from antlr4 import *
from io import StringIO

def serializedATN():
    with StringIO() as buf:
        buf.write(u"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3")
        buf.write(u"\4\n\4\2\t\2\3\2\6\2\6\n\2\r\2\16\2\7\3\2\2\2\3\2\2\2")
        buf.write(u"\t\2\5\3\2\2\2\4\6\7\3\2\2\5\4\3\2\2\2\6\7\3\2\2\2\7")
        buf.write(u"\5\3\2\2\2\7\b\3\2\2\2\b\3\3\2\2\2\3\7")
        return buf.getvalue()


class MyParser ( Parser ):

    grammarFileName = "MyParser.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [  ]

    symbolicNames = [ u"<INVALID>", u"INT", u"WS" ]

    RULE_intfile = 0

    ruleNames =  [ u"intfile" ]

    EOF = Token.EOF
    INT=1
    WS=2

    def __init__(self, input):
        super(MyParser, self).__init__(input)
        self.checkVersion("4.5.1")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None



    class IntfileContext(ParserRuleContext):

        def __init__(self, parser, parent=None, invokingState=-1):
            super(MyParser.IntfileContext, self).__init__(parent, invokingState)
            self.parser = parser

        def INT(self, i=None):
            if i is None:
                return self.getTokens(MyParser.INT)
            else:
                return self.getToken(MyParser.INT, i)

        def getRuleIndex(self):
            return MyParser.RULE_intfile

        def enterRule(self, listener):
            if hasattr(listener, "enterIntfile"):
                listener.enterIntfile(self)

        def exitRule(self, listener):
            if hasattr(listener, "exitIntfile"):
                listener.exitIntfile(self)




    def intfile(self):

        localctx = MyParser.IntfileContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_intfile)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 3 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 2
                self.match(MyParser.INT)
                self.state = 5 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not (_la==MyParser.INT):
                    break

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





