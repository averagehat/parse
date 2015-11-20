# Generated from MyParser.g4 by ANTLR 4.5.1
# encoding: utf-8
from __future__ import print_function
from antlr4 import *
from io import StringIO

def serializedATN():
    with StringIO() as buf:
        buf.write(u"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3")
        buf.write(u"\b\24\4\2\t\2\4\3\t\3\4\4\t\4\3\2\3\2\3\2\3\2\3\2\3\2")
        buf.write(u"\3\2\3\3\3\3\3\4\3\4\3\4\2\2\5\2\4\6\2\3\3\2\6\7\20\2")
        buf.write(u"\b\3\2\2\2\4\17\3\2\2\2\6\21\3\2\2\2\b\t\7\3\2\2\t\n")
        buf.write(u"\5\4\3\2\n\13\7\5\2\2\13\f\5\6\4\2\f\r\7\4\2\2\r\16\7")
        buf.write(u"\2\2\3\16\3\3\2\2\2\17\20\7\6\2\2\20\5\3\2\2\2\21\22")
        buf.write(u"\t\2\2\2\22\7\3\2\2\2\2")
        return buf.getvalue()


class MyParser ( Parser ):

    grammarFileName = "MyParser.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ u"<INVALID>", u"'{'", u"'}'", u"'='" ]

    symbolicNames = [ u"<INVALID>", u"LCurly", u"RCurly", u"EQ", u"UnquotedString", 
                      u"QuotedString", u"WS" ]

    RULE_memberNamePair = 0
    RULE_member = 1
    RULE_name = 2

    ruleNames =  [ u"memberNamePair", u"member", u"name" ]

    EOF = Token.EOF
    LCurly=1
    RCurly=2
    EQ=3
    UnquotedString=4
    QuotedString=5
    WS=6

    def __init__(self, input):
        super(MyParser, self).__init__(input)
        self.checkVersion("4.5.1")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None



    class MemberNamePairContext(ParserRuleContext):

        def __init__(self, parser, parent=None, invokingState=-1):
            super(MyParser.MemberNamePairContext, self).__init__(parent, invokingState)
            self.parser = parser

        def LCurly(self):
            return self.getToken(MyParser.LCurly, 0)

        def member(self):
            return self.getTypedRuleContext(MyParser.MemberContext,0)


        def EQ(self):
            return self.getToken(MyParser.EQ, 0)

        def name(self):
            return self.getTypedRuleContext(MyParser.NameContext,0)


        def RCurly(self):
            return self.getToken(MyParser.RCurly, 0)

        def EOF(self):
            return self.getToken(MyParser.EOF, 0)

        def getRuleIndex(self):
            return MyParser.RULE_memberNamePair




    def memberNamePair(self):

        localctx = MyParser.MemberNamePairContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_memberNamePair)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 6
            self.match(MyParser.LCurly)
            self.state = 7
            self.member()
            self.state = 8
            self.match(MyParser.EQ)
            self.state = 9
            self.name()
            self.state = 10
            self.match(MyParser.RCurly)
            self.state = 11
            self.match(MyParser.EOF)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx

    class MemberContext(ParserRuleContext):

        def __init__(self, parser, parent=None, invokingState=-1):
            super(MyParser.MemberContext, self).__init__(parent, invokingState)
            self.parser = parser

        def UnquotedString(self):
            return self.getToken(MyParser.UnquotedString, 0)

        def getRuleIndex(self):
            return MyParser.RULE_member




    def member(self):

        localctx = MyParser.MemberContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_member)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 13
            self.match(MyParser.UnquotedString)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx

    class NameContext(ParserRuleContext):

        def __init__(self, parser, parent=None, invokingState=-1):
            super(MyParser.NameContext, self).__init__(parent, invokingState)
            self.parser = parser

        def UnquotedString(self):
            return self.getToken(MyParser.UnquotedString, 0)

        def QuotedString(self):
            return self.getToken(MyParser.QuotedString, 0)

        def getRuleIndex(self):
            return MyParser.RULE_name




    def name(self):

        localctx = MyParser.NameContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_name)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 15
            _la = self._input.LA(1)
            if not(_la==MyParser.UnquotedString or _la==MyParser.QuotedString):
                self._errHandler.recoverInline(self)
            else:
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





