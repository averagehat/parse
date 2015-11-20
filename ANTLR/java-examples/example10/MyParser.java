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
		ZIPCODE=1, NUMBER=2, ROAD=3, WS=4;
	public static final int
		RULE_address = 0, RULE_street = 1, RULE_zipcode = 2;
	public static final String[] ruleNames = {
		"address", "street", "zipcode"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ZIPCODE", "NUMBER", "ROAD", "WS"
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
	public static class AddressContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(MyParser.NUMBER, 0); }
		public TerminalNode ROAD() { return getToken(MyParser.ROAD, 0); }
		public TerminalNode ZIPCODE() { return getToken(MyParser.ZIPCODE, 0); }
		public TerminalNode EOF() { return getToken(MyParser.EOF, 0); }
		public StreetContext street() {
			return getRuleContext(StreetContext.class,0);
		}
		public ZipcodeContext zipcode() {
			return getRuleContext(ZipcodeContext.class,0);
		}
		public AddressContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_address; }
	}

	public final AddressContext address() throws RecognitionException {
		AddressContext _localctx = new AddressContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_address);
		try {
			setState(14);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(6);
				match(NUMBER);
				setState(7);
				match(ROAD);
				setState(8);
				match(ZIPCODE);
				setState(9);
				match(EOF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(10);
				street();
				setState(11);
				zipcode();
				setState(12);
				match(EOF);
				}
				break;
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

	public static class StreetContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(MyParser.NUMBER, 0); }
		public TerminalNode ROAD() { return getToken(MyParser.ROAD, 0); }
		public StreetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_street; }
	}

	public final StreetContext street() throws RecognitionException {
		StreetContext _localctx = new StreetContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_street);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			match(NUMBER);
			setState(17);
			match(ROAD);
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

	public static class ZipcodeContext extends ParserRuleContext {
		public TerminalNode ZIPCODE() { return getToken(MyParser.ZIPCODE, 0); }
		public ZipcodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_zipcode; }
	}

	public final ZipcodeContext zipcode() throws RecognitionException {
		ZipcodeContext _localctx = new ZipcodeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_zipcode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			match(ZIPCODE);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\6\30\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\21\n\2\3\3\3\3\3\3\3"+
		"\4\3\4\3\4\2\2\5\2\4\6\2\2\25\2\20\3\2\2\2\4\22\3\2\2\2\6\25\3\2\2\2\b"+
		"\t\7\4\2\2\t\n\7\5\2\2\n\13\7\3\2\2\13\21\7\2\2\3\f\r\5\4\3\2\r\16\5\6"+
		"\4\2\16\17\7\2\2\3\17\21\3\2\2\2\20\b\3\2\2\2\20\f\3\2\2\2\21\3\3\2\2"+
		"\2\22\23\7\4\2\2\23\24\7\5\2\2\24\5\3\2\2\2\25\26\7\3\2\2\26\7\3\2\2\2"+
		"\3\20";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}