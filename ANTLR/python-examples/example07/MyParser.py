# Generated from MyParser.g4 by ANTLR 4.5.1
# encoding: utf-8
from __future__ import print_function
from antlr4 import *
from io import StringIO

def serializedATN():
    with StringIO() as buf:
        buf.write(u"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3")
        buf.write(u"\n%\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3")
        buf.write(u"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3")
        buf.write(u"\5\3\5\3\6\3\6\3\7\6\7!\n\7\r\7\16\7\"\3\7\2\2\b\2\4")
        buf.write(u"\6\b\n\f\2\2\37\2\16\3\2\2\2\4\27\3\2\2\2\6\31\3\2\2")
        buf.write(u"\2\b\33\3\2\2\2\n\35\3\2\2\2\f \3\2\2\2\16\17\7\3\2\2")
        buf.write(u"\17\20\5\4\3\2\20\21\5\6\4\2\21\22\5\b\5\2\22\23\5\n")
        buf.write(u"\6\2\23\24\7\4\2\2\24\25\5\f\7\2\25\26\7\2\2\3\26\3\3")
        buf.write(u"\2\2\2\27\30\7\5\2\2\30\5\3\2\2\2\31\32\7\6\2\2\32\7")
        buf.write(u"\3\2\2\2\33\34\7\7\2\2\34\t\3\2\2\2\35\36\7\b\2\2\36")
        buf.write(u"\13\3\2\2\2\37!\7\t\2\2 \37\3\2\2\2!\"\3\2\2\2\" \3\2")
        buf.write(u"\2\2\"#\3\2\2\2#\r\3\2\2\2\3\"")
        return buf.getvalue()


class MyParser ( Parser ):

    grammarFileName = "MyParser.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ u"<INVALID>", u"'Received: '", u"';'" ]

    symbolicNames = [ u"<INVALID>", u"Received", u"SemiColon", u"FromText", 
                      u"ByText", u"WithText", u"IdText", u"DateContents", 
                      u"Whitespace" ]

    RULE_received = 0
    RULE_fromToken = 1
    RULE_byToken = 2
    RULE_withToken = 3
    RULE_idToken = 4
    RULE_date = 5

    ruleNames =  [ u"received", u"fromToken", u"byToken", u"withToken", 
                   u"idToken", u"date" ]

    EOF = Token.EOF
    Received=1
    SemiColon=2
    FromText=3
    ByText=4
    WithText=5
    IdText=6
    DateContents=7
    Whitespace=8

    def __init__(self, input):
        super(MyParser, self).__init__(input)
        self.checkVersion("4.5.1")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None



    class ReceivedContext(ParserRuleContext):

        def __init__(self, parser, parent=None, invokingState=-1):
            super(MyParser.ReceivedContext, self).__init__(parent, invokingState)
            self.parser = parser

        def Received(self):
            return self.getToken(MyParser.Received, 0)

        def fromToken(self):
            return self.getTypedRuleContext(MyParser.FromTokenContext,0)


        def byToken(self):
            return self.getTypedRuleContext(MyParser.ByTokenContext,0)


        def withToken(self):
            return self.getTypedRuleContext(MyParser.WithTokenContext,0)


        def idToken(self):
            return self.getTypedRuleContext(MyParser.IdTokenContext,0)


        def SemiColon(self):
            return self.getToken(MyParser.SemiColon, 0)

        def date(self):
            return self.getTypedRuleContext(MyParser.DateContext,0)


        def EOF(self):
            return self.getToken(MyParser.EOF, 0)

        def getRuleIndex(self):
            return MyParser.RULE_received




    def received(self):

        localctx = MyParser.ReceivedContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_received)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 12
            self.match(MyParser.Received)
            self.state = 13
            self.fromToken()
            self.state = 14
            self.byToken()
            self.state = 15
            self.withToken()
            self.state = 16
            self.idToken()
            self.state = 17
            self.match(MyParser.SemiColon)
            self.state = 18
            self.date()
            self.state = 19
            self.match(MyParser.EOF)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx

    class FromTokenContext(ParserRuleContext):

        def __init__(self, parser, parent=None, invokingState=-1):
            super(MyParser.FromTokenContext, self).__init__(parent, invokingState)
            self.parser = parser

        def FromText(self):
            return self.getToken(MyParser.FromText, 0)

        def getRuleIndex(self):
            return MyParser.RULE_fromToken




    def fromToken(self):

        localctx = MyParser.FromTokenContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_fromToken)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 21
            self.match(MyParser.FromText)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx

    class ByTokenContext(ParserRuleContext):

        def __init__(self, parser, parent=None, invokingState=-1):
            super(MyParser.ByTokenContext, self).__init__(parent, invokingState)
            self.parser = parser

        def ByText(self):
            return self.getToken(MyParser.ByText, 0)

        def getRuleIndex(self):
            return MyParser.RULE_byToken




    def byToken(self):

        localctx = MyParser.ByTokenContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_byToken)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 23
            self.match(MyParser.ByText)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx

    class WithTokenContext(ParserRuleContext):

        def __init__(self, parser, parent=None, invokingState=-1):
            super(MyParser.WithTokenContext, self).__init__(parent, invokingState)
            self.parser = parser

        def WithText(self):
            return self.getToken(MyParser.WithText, 0)

        def getRuleIndex(self):
            return MyParser.RULE_withToken




    def withToken(self):

        localctx = MyParser.WithTokenContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_withToken)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 25
            self.match(MyParser.WithText)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx

    class IdTokenContext(ParserRuleContext):

        def __init__(self, parser, parent=None, invokingState=-1):
            super(MyParser.IdTokenContext, self).__init__(parent, invokingState)
            self.parser = parser

        def IdText(self):
            return self.getToken(MyParser.IdText, 0)

        def getRuleIndex(self):
            return MyParser.RULE_idToken




    def idToken(self):

        localctx = MyParser.IdTokenContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_idToken)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 27
            self.match(MyParser.IdText)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx

    class DateContext(ParserRuleContext):

        def __init__(self, parser, parent=None, invokingState=-1):
            super(MyParser.DateContext, self).__init__(parent, invokingState)
            self.parser = parser

        def DateContents(self, i=None):
            if i is None:
                return self.getTokens(MyParser.DateContents)
            else:
                return self.getToken(MyParser.DateContents, i)

        def getRuleIndex(self):
            return MyParser.RULE_date




    def date(self):

        localctx = MyParser.DateContext(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_date)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 30 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 29
                self.match(MyParser.DateContents)
                self.state = 32 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not (_la==MyParser.DateContents):
                    break

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





