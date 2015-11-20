# Generated from MyParser.g4 by ANTLR 4.5.1
# encoding: utf-8
from __future__ import print_function
from antlr4 import *
from io import StringIO

def serializedATN():
    with StringIO() as buf:
        buf.write(u"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3")
        buf.write(u"\4\31\4\2\t\2\4\3\t\3\4\4\t\4\3\2\6\2\n\n\2\r\2\16\2")
        buf.write(u"\13\3\3\3\3\3\3\3\4\3\4\3\4\7\4\24\n\4\f\4\16\4\27\13")
        buf.write(u"\4\3\4\2\2\5\2\4\6\2\2\27\2\t\3\2\2\2\4\r\3\2\2\2\6\25")
        buf.write(u"\3\2\2\2\b\n\5\4\3\2\t\b\3\2\2\2\n\13\3\2\2\2\13\t\3")
        buf.write(u"\2\2\2\13\f\3\2\2\2\f\3\3\2\2\2\r\16\7\3\2\2\16\17\5")
        buf.write(u"\6\4\2\17\5\3\2\2\2\20\21\6\4\2\3\21\22\7\3\2\2\22\24")
        buf.write(u"\b\4\1\2\23\20\3\2\2\2\24\27\3\2\2\2\25\23\3\2\2\2\25")
        buf.write(u"\26\3\2\2\2\26\7\3\2\2\2\27\25\3\2\2\2\4\13\25")
        return buf.getvalue()


class MyParser ( Parser ):

    grammarFileName = "MyParser.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [  ]

    symbolicNames = [ u"<INVALID>", u"INT", u"WS" ]

    RULE_file = 0
    RULE_group = 1
    RULE_sequence = 2

    ruleNames =  [ u"file", u"group", u"sequence" ]

    EOF = Token.EOF
    INT=1
    WS=2

    def __init__(self, input):
        super(MyParser, self).__init__(input)
        self.checkVersion("4.5.1")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None



    class FileContext(ParserRuleContext):

        def __init__(self, parser, parent=None, invokingState=-1):
            super(MyParser.FileContext, self).__init__(parent, invokingState)
            self.parser = parser

        def group(self, i=None):
            if i is None:
                return self.getTypedRuleContexts(MyParser.GroupContext)
            else:
                return self.getTypedRuleContext(MyParser.GroupContext,i)


        def getRuleIndex(self):
            return MyParser.RULE_file




    def file(self):

        localctx = MyParser.FileContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_file)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 7 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 6
                self.group()
                self.state = 9 
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

    class GroupContext(ParserRuleContext):

        def __init__(self, parser, parent=None, invokingState=-1):
            super(MyParser.GroupContext, self).__init__(parent, invokingState)
            self.parser = parser
            self._INT = None # Token

        def INT(self):
            return self.getToken(MyParser.INT, 0)

        def sequence(self):
            return self.getTypedRuleContext(MyParser.SequenceContext,0)


        def getRuleIndex(self):
            return MyParser.RULE_group




    def group(self):

        localctx = MyParser.GroupContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_group)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 11
            localctx._INT = self.match(MyParser.INT)
            self.state = 12
            self.sequence((0 if localctx._INT is None else int(localctx._INT.text)))
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx

    class SequenceContext(ParserRuleContext):

        def __init__(self, parser, parent=None, invokingState=-1, n=None):
            super(MyParser.SequenceContext, self).__init__(parent, invokingState)
            self.parser = parser
            self.n = None
            self.i =  1
            self.n = n

        def INT(self, i=None):
            if i is None:
                return self.getTokens(MyParser.INT)
            else:
                return self.getToken(MyParser.INT, i)

        def getRuleIndex(self):
            return MyParser.RULE_sequence




    def sequence(self, n):

        localctx = MyParser.SequenceContext(self, self._ctx, self.state, n)
        self.enterRule(localctx, 4, self.RULE_sequence)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 19
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,1,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    self.state = 14
                    if not localctx.i<=localctx.n:
                        from antlr4.error.Errors import FailedPredicateException
                        raise FailedPredicateException(self, "$i<=$n")
                    self.state = 15
                    self.match(MyParser.INT)
                    localctx.i++ 
                self.state = 21
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,1,self._ctx)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx



    def sempred(self, localctx, ruleIndex, predIndex):
        if self._predicates == None:
            self._predicates = dict()
        self._predicates[2] = self.sequence_sempred
        pred = self._predicates.get(ruleIndex, None)
        if pred is None:
            raise Exception("No predicate with index:" + str(ruleIndex))
        else:
            return pred(localctx, predIndex)

    def sequence_sempred(self, localctx, predIndex):
            if predIndex == 0:
                return localctx.i<=localctx.n
         




