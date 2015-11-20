# Generated from MyLexer.g4 by ANTLR 4.5.1
# encoding: utf-8
from __future__ import print_function
from antlr4 import *
from io import StringIO


def serializedATN():
    with StringIO() as buf:
        buf.write(u"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2")
        buf.write(u"\b&\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t")
        buf.write(u"\7\3\2\3\2\3\3\3\3\3\4\3\4\3\5\6\5\27\n\5\r\5\16\5\30")
        buf.write(u"\3\6\3\6\3\6\3\6\3\6\3\7\6\7!\n\7\r\7\16\7\"\3\7\3\7")
        buf.write(u"\2\2\b\3\3\5\4\7\5\t\6\13\7\r\b\3\2\4\4\2C\\c|\5\2\13")
        buf.write(u"\f\17\17\"\"\'\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2")
        buf.write(u"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\3\17\3\2\2\2\5\21")
        buf.write(u"\3\2\2\2\7\23\3\2\2\2\t\26\3\2\2\2\13\32\3\2\2\2\r \3")
        buf.write(u"\2\2\2\17\20\7}\2\2\20\4\3\2\2\2\21\22\7\177\2\2\22\6")
        buf.write(u"\3\2\2\2\23\24\7?\2\2\24\b\3\2\2\2\25\27\t\2\2\2\26\25")
        buf.write(u"\3\2\2\2\27\30\3\2\2\2\30\26\3\2\2\2\30\31\3\2\2\2\31")
        buf.write(u"\n\3\2\2\2\32\33\7$\2\2\33\34\5\t\5\2\34\35\7$\2\2\35")
        buf.write(u"\36\b\6\2\2\36\f\3\2\2\2\37!\t\3\2\2 \37\3\2\2\2!\"\3")
        buf.write(u"\2\2\2\" \3\2\2\2\"#\3\2\2\2#$\3\2\2\2$%\b\7\3\2%\16")
        buf.write(u"\3\2\2\2\5\2\30\"\4\3\6\2\b\2\2")
        return buf.getvalue()


class MyLexer(Lexer):

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]


    LCurly = 1
    RCurly = 2
    EQ = 3
    UnquotedString = 4
    QuotedString = 5
    WS = 6

    modeNames = [ u"DEFAULT_MODE" ]

    literalNames = [ u"<INVALID>",
            u"'{'", u"'}'", u"'='" ]

    symbolicNames = [ u"<INVALID>",
            u"LCurly", u"RCurly", u"EQ", u"UnquotedString", u"QuotedString", 
            u"WS" ]

    ruleNames = [ u"LCurly", u"RCurly", u"EQ", u"UnquotedString", u"QuotedString", 
                  u"WS" ]

    grammarFileName = u"MyLexer.g4"

    def __init__(self, input=None):
        super(MyLexer, self).__init__(input)
        self.checkVersion("4.5.1")
        self._interp = LexerATNSimulator(self, self.atn, self.decisionsToDFA, PredictionContextCache())
        self._actions = None
        self._predicates = None


    def action(self, localctx, ruleIndex, actionIndex):
    	if self._actions is None:
    		actions = dict()
    		actions[4] = self.QuotedString_action 
    		self._actions = actions
    	action = self._actions.get(ruleIndex, None)
    	if action is not None:
    		action(localctx, actionIndex)
    	else:
    		raise Exception("No registered action for:" + str(ruleIndex))

    def QuotedString_action(self, localctx , actionIndex):
        if actionIndex == 0:
             
                   theString = self.text
                   firstLetter = 1
                   lastLetter = len(theString) - 1
                   theNewString = theString[firstLetter:lastLetter]
                   self.text = theNewString
                  
     


