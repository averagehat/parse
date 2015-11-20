// Generated from MyParser.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MyParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Received=1, SemiColon=2, FromText=3, ByText=4, WithText=5, IdText=6, DateContents=7, 
		Whitespace=8;
	public static final int
		RULE_received = 0, RULE_fromToken = 1, RULE_byToken = 2, RULE_withToken = 3, 
		RULE_idToken = 4, RULE_date = 5;
	public static final String[] ruleNames = {
		"received", "fromToken", "byToken", "withToken", "idToken", "date"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'Received: '", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "Received", "SemiColon", "FromText", "ByText", "WithText", "IdText", 
		"DateContents", "Whitespace"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "MyParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MyParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ReceivedContext extends ParserRuleContext {
		public TerminalNode Received() { return getToken(MyParser.Received, 0); }
		public FromTokenContext fromToken() {
			return getRuleContext(FromTokenContext.class,0);
		}
		public ByTokenContext byToken() {
			return getRuleContext(ByTokenContext.class,0);
		}
		public WithTokenContext withToken() {
			return getRuleContext(WithTokenContext.class,0);
		}
		public IdTokenContext idToken() {
			return getRuleContext(IdTokenContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(MyParser.SemiColon, 0); }
		public DateContext date() {
			return getRuleContext(DateContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MyParser.EOF, 0); }
		public ReceivedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_received; }
	}

	public final ReceivedContext received() throws RecognitionException {
		ReceivedContext _localctx = new ReceivedContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_received);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			match(Received);
			setState(13);
			fromToken();
			setState(14);
			byToken();
			setState(15);
			withToken();
			setState(16);
			idToken();
			setState(17);
			match(SemiColon);
			setState(18);
			date();
			setState(19);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FromTokenContext extends ParserRuleContext {
		public TerminalNode FromText() { return getToken(MyParser.FromText, 0); }
		public FromTokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromToken; }
	}

	public final FromTokenContext fromToken() throws RecognitionException {
		FromTokenContext _localctx = new FromTokenContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_fromToken);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			match(FromText);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ByTokenContext extends ParserRuleContext {
		public TerminalNode ByText() { return getToken(MyParser.ByText, 0); }
		public ByTokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_byToken; }
	}

	public final ByTokenContext byToken() throws RecognitionException {
		ByTokenContext _localctx = new ByTokenContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_byToken);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			match(ByText);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WithTokenContext extends ParserRuleContext {
		public TerminalNode WithText() { return getToken(MyParser.WithText, 0); }
		public WithTokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_withToken; }
	}

	public final WithTokenContext withToken() throws RecognitionException {
		WithTokenContext _localctx = new WithTokenContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_withToken);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			match(WithText);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdTokenContext extends ParserRuleContext {
		public TerminalNode IdText() { return getToken(MyParser.IdText, 0); }
		public IdTokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idToken; }
	}

	public final IdTokenContext idToken() throws RecognitionException {
		IdTokenContext _localctx = new IdTokenContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_idToken);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			match(IdText);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DateContext extends ParserRuleContext {
		public List<TerminalNode> DateContents() { return getTokens(MyParser.DateContents); }
		public TerminalNode DateContents(int i) {
			return getToken(MyParser.DateContents, i);
		}
		public DateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date; }
	}

	public final DateContext date() throws RecognitionException {
		DateContext _localctx = new DateContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_date);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(29);
				match(DateContents);
				}
				}
				setState(32); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DateContents );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\n%\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\6\7!\n\7\r\7\16\7\"\3\7\2\2\b\2\4"+
		"\6\b\n\f\2\2\37\2\16\3\2\2\2\4\27\3\2\2\2\6\31\3\2\2\2\b\33\3\2\2\2\n"+
		"\35\3\2\2\2\f \3\2\2\2\16\17\7\3\2\2\17\20\5\4\3\2\20\21\5\6\4\2\21\22"+
		"\5\b\5\2\22\23\5\n\6\2\23\24\7\4\2\2\24\25\5\f\7\2\25\26\7\2\2\3\26\3"+
		"\3\2\2\2\27\30\7\5\2\2\30\5\3\2\2\2\31\32\7\6\2\2\32\7\3\2\2\2\33\34\7"+
		"\7\2\2\34\t\3\2\2\2\35\36\7\b\2\2\36\13\3\2\2\2\37!\7\t\2\2 \37\3\2\2"+
		"\2!\"\3\2\2\2\" \3\2\2\2\"#\3\2\2\2#\r\3\2\2\2\3\"";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}