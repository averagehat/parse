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
		CurrencySymbol=1, Space=2, Digit=3, Cents=4, NL=5;
	public static final int
		RULE_amounts = 0, RULE_amount = 1;
	public static final String[] ruleNames = {
		"amounts", "amount"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "' '"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "CurrencySymbol", "Space", "Digit", "Cents", "NL"
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
	public static class AmountsContext extends ParserRuleContext {
		public List<AmountContext> amount() {
			return getRuleContexts(AmountContext.class);
		}
		public AmountContext amount(int i) {
			return getRuleContext(AmountContext.class,i);
		}
		public TerminalNode EOF() { return getToken(MyParser.EOF, 0); }
		public List<TerminalNode> NL() { return getTokens(MyParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(MyParser.NL, i);
		}
		public AmountsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_amounts; }
	}

	public final AmountsContext amounts() throws RecognitionException {
		AmountsContext _localctx = new AmountsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_amounts);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(9);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(4);
					amount();
					setState(5);
					match(NL);
					}
					} 
				}
				setState(11);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(12);
			amount();
			setState(14);
			_la = _input.LA(1);
			if (_la==NL) {
				{
				setState(13);
				match(NL);
				}
			}

			setState(16);
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

	public static class AmountContext extends ParserRuleContext {
		public TerminalNode CurrencySymbol() { return getToken(MyParser.CurrencySymbol, 0); }
		public List<TerminalNode> Space() { return getTokens(MyParser.Space); }
		public TerminalNode Space(int i) {
			return getToken(MyParser.Space, i);
		}
		public List<TerminalNode> Digit() { return getTokens(MyParser.Digit); }
		public TerminalNode Digit(int i) {
			return getToken(MyParser.Digit, i);
		}
		public TerminalNode Cents() { return getToken(MyParser.Cents, 0); }
		public AmountContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_amount; }
	}

	public final AmountContext amount() throws RecognitionException {
		AmountContext _localctx = new AmountContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_amount);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			match(CurrencySymbol);
			setState(22);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Space) {
				{
				{
				setState(19);
				match(Space);
				}
				}
				setState(24);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(26); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(25);
				match(Digit);
				}
				}
				setState(28); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Digit );
			setState(31);
			_la = _input.LA(1);
			if (_la==Cents) {
				{
				setState(30);
				match(Cents);
				}
			}

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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\7$\4\2\t\2\4\3\t"+
		"\3\3\2\3\2\3\2\7\2\n\n\2\f\2\16\2\r\13\2\3\2\3\2\5\2\21\n\2\3\2\3\2\3"+
		"\3\3\3\7\3\27\n\3\f\3\16\3\32\13\3\3\3\6\3\35\n\3\r\3\16\3\36\3\3\5\3"+
		"\"\n\3\3\3\2\2\4\2\4\2\2&\2\13\3\2\2\2\4\24\3\2\2\2\6\7\5\4\3\2\7\b\7"+
		"\7\2\2\b\n\3\2\2\2\t\6\3\2\2\2\n\r\3\2\2\2\13\t\3\2\2\2\13\f\3\2\2\2\f"+
		"\16\3\2\2\2\r\13\3\2\2\2\16\20\5\4\3\2\17\21\7\7\2\2\20\17\3\2\2\2\20"+
		"\21\3\2\2\2\21\22\3\2\2\2\22\23\7\2\2\3\23\3\3\2\2\2\24\30\7\3\2\2\25"+
		"\27\7\4\2\2\26\25\3\2\2\2\27\32\3\2\2\2\30\26\3\2\2\2\30\31\3\2\2\2\31"+
		"\34\3\2\2\2\32\30\3\2\2\2\33\35\7\5\2\2\34\33\3\2\2\2\35\36\3\2\2\2\36"+
		"\34\3\2\2\2\36\37\3\2\2\2\37!\3\2\2\2 \"\7\6\2\2! \3\2\2\2!\"\3\2\2\2"+
		"\"\5\3\2\2\2\7\13\20\30\36!";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}