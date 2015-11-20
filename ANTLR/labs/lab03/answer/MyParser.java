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
		CurrencySymbol=1, Space=2, Digit=3, Cents=4;
	public static final int
		RULE_amount = 0;
	public static final String[] ruleNames = {
		"amount"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "' '"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "CurrencySymbol", "Space", "Digit", "Cents"
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
	public static class AmountContext extends ParserRuleContext {
		public TerminalNode CurrencySymbol() { return getToken(MyParser.CurrencySymbol, 0); }
		public TerminalNode EOF() { return getToken(MyParser.EOF, 0); }
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
		enterRule(_localctx, 0, RULE_amount);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2);
			match(CurrencySymbol);
			setState(6);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Space) {
				{
				{
				setState(3);
				match(Space);
				}
				}
				setState(8);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(10); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(9);
				match(Digit);
				}
				}
				setState(12); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Digit );
			setState(15);
			_la = _input.LA(1);
			if (_la==Cents) {
				{
				setState(14);
				match(Cents);
				}
			}

			setState(17);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\6\26\4\2\t\2\3\2"+
		"\3\2\7\2\7\n\2\f\2\16\2\n\13\2\3\2\6\2\r\n\2\r\2\16\2\16\3\2\5\2\22\n"+
		"\2\3\2\3\2\3\2\2\2\3\2\2\2\27\2\4\3\2\2\2\4\b\7\3\2\2\5\7\7\4\2\2\6\5"+
		"\3\2\2\2\7\n\3\2\2\2\b\6\3\2\2\2\b\t\3\2\2\2\t\f\3\2\2\2\n\b\3\2\2\2\13"+
		"\r\7\5\2\2\f\13\3\2\2\2\r\16\3\2\2\2\16\f\3\2\2\2\16\17\3\2\2\2\17\21"+
		"\3\2\2\2\20\22\7\6\2\2\21\20\3\2\2\2\21\22\3\2\2\2\22\23\3\2\2\2\23\24"+
		"\7\2\2\3\24\3\3\2\2\2\5\b\16\21";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}