# Generated from MyParser.g4 by ANTLR 4.5.1
# encoding: utf-8
from __future__ import print_function
from antlr4 import *
from io import StringIO

def serializedATN():
    with StringIO() as buf:
        buf.write(u"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3")
        buf.write(u"\4\24\4\2\t\2\4\3\t\3\3\2\3\2\3\2\6\2\n\n\2\r\2\16\2")
        buf.write(u"\13\3\2\3\2\3\3\3\3\3\3\3\3\3\3\2\2\4\2\4\2\2\22\2\t")
        buf.write(u"\3\2\2\2\4\17\3\2\2\2\6\7\5\4\3\2\7\b\b\2\1\2\b\n\3\2")
        buf.write(u"\2\2\t\6\3\2\2\2\n\13\3\2\2\2\13\t\3\2\2\2\13\f\3\2\2")
        buf.write(u"\2\f\r\3\2\2\2\r\16\7\2\2\3\16\3\3\2\2\2\17\20\7\3\2")
        buf.write(u"\2\20\21\b\3\1\2\21\22\7\4\2\2\22\5\3\2\2\2\3\13")
        return buf.getvalue()


class MyParser ( Parser ):

    grammarFileName = "MyParser.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [  ]

    symbolicNames = [ u"<INVALID>", u"A_STRING", u"NL" ]

    RULE_afile = 0
    RULE_line = 1

    ruleNames =  [ u"afile", u"line" ]

    EOF = Token.EOF
    A_STRING=1
    NL=2

    def __init__(self, input):
        super(MyParser, self).__init__(input)
        self.checkVersion("4.5.1")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None



    class AfileContext(ParserRuleContext):

        def __init__(self, parser, parent=None, invokingState=-1):
            super(MyParser.AfileContext, self).__init__(parent, invokingState)
            self.parser = parser
            self._line = None # LineContext

        def EOF(self):
            return self.getToken(MyParser.EOF, 0)

        def line(self, i=None):
            if i is None:
                return self.getTypedRuleContexts(MyParser.LineContext)
            else:
                return self.getTypedRuleContext(MyParser.LineContext,i)


        def getRuleIndex(self):
            return MyParser.RULE_afile




    def afile(self):

        localctx = MyParser.AfileContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_afile)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 7 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 4
                localctx._line = self.line()
                 
                if len((None if localctx._line is None else self._input.getText((localctx._line.start,localctx._line.stop)))) > 20:
                   print("Line is too long: " + str(len((None if localctx._line is None else self._input.getText((localctx._line.start,localctx._line.stop))))) + " characters!")
                          
                self.state = 9 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not (_la==MyParser.A_STRING):
                    break

            self.state = 11
            self.match(MyParser.EOF)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx

    class LineContext(ParserRuleContext):

        def __init__(self, parser, parent=None, invokingState=-1):
            super(MyParser.LineContext, self).__init__(parent, invokingState)
            self.parser = parser
            self.lineLength = None
            self.s = None # Token

        def NL(self):
            return self.getToken(MyParser.NL, 0)

        def A_STRING(self):
            return self.getToken(MyParser.A_STRING, 0)

        def getRuleIndex(self):
            return MyParser.RULE_line




    def line(self):

        localctx = MyParser.LineContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_line)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 13
            localctx.s = self.match(MyParser.A_STRING)
             
            lineLength = len((None if localctx.s is None else localctx.s.text))
            localctx.lineLength = lineLength
                      
            self.state = 15
            self.match(MyParser.NL)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





