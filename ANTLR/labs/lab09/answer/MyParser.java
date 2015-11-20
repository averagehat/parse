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
		LeftBracket=1, RightBracket=2, LeftBrace=3, RightBrace=4, Name=5, Int=6, 
		Comma=7, Colon=8, WS=9;
	public static final int
		RULE_json = 0, RULE_array = 1, RULE_object = 2, RULE_name = 3, RULE_integer = 4;
	public static final String[] ruleNames = {
		"json", "array", "object", "name", "integer"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'['", "']'", "'{'", "'}'", null, null, "','", "':'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "LeftBracket", "RightBracket", "LeftBrace", "RightBrace", "Name", 
		"Int", "Comma", "Colon", "WS"
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
	public static class JsonContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(MyParser.EOF, 0); }
		public List<ArrayContext> array() {
			return getRuleContexts(ArrayContext.class);
		}
		public ArrayContext array(int i) {
			return getRuleContext(ArrayContext.class,i);
		}
		public List<ObjectContext> object() {
			return getRuleContexts(ObjectContext.class);
		}
		public ObjectContext object(int i) {
			return getRuleContext(ObjectContext.class,i);
		}
		public JsonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_json; }
	}

	public final JsonContext json() throws RecognitionException {
		JsonContext _localctx = new JsonContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_json);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(12); 
			_errHandler.sync(this);
			_alt = 1+1;
			do {
				switch (_alt) {
				case 1+1:
					{
					setState(12);
					switch (_input.LA(1)) {
					case LeftBracket:
						{
						setState(10);
						array();
						}
						break;
					case LeftBrace:
						{
						setState(11);
						object();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(14); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			} while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class ArrayContext extends ParserRuleContext {
		public TerminalNode LeftBracket() { return getToken(MyParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(MyParser.RightBracket, 0); }
		public List<ArrayContext> array() {
			return getRuleContexts(ArrayContext.class);
		}
		public ArrayContext array(int i) {
			return getRuleContext(ArrayContext.class,i);
		}
		public List<ObjectContext> object() {
			return getRuleContexts(ObjectContext.class);
		}
		public ObjectContext object(int i) {
			return getRuleContext(ObjectContext.class,i);
		}
		public List<IntegerContext> integer() {
			return getRuleContexts(IntegerContext.class);
		}
		public IntegerContext integer(int i) {
			return getRuleContext(IntegerContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(MyParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(MyParser.Comma, i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_array);
		int _la;
		try {
			setState(39);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(18);
				match(LeftBracket);
				setState(19);
				match(RightBracket);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(20);
				match(LeftBracket);
				setState(24);
				switch (_input.LA(1)) {
				case LeftBracket:
					{
					setState(21);
					array();
					}
					break;
				case LeftBrace:
					{
					setState(22);
					object();
					}
					break;
				case Int:
					{
					setState(23);
					integer();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(34);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(26);
					match(Comma);
					setState(30);
					switch (_input.LA(1)) {
					case LeftBracket:
						{
						setState(27);
						array();
						}
						break;
					case LeftBrace:
						{
						setState(28);
						object();
						}
						break;
					case Int:
						{
						setState(29);
						integer();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(36);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(37);
				match(RightBracket);
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

	public static class ObjectContext extends ParserRuleContext {
		public TerminalNode LeftBrace() { return getToken(MyParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(MyParser.RightBrace, 0); }
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public TerminalNode Colon() { return getToken(MyParser.Colon, 0); }
		public List<TerminalNode> Comma() { return getTokens(MyParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(MyParser.Comma, i);
		}
		public List<ArrayContext> array() {
			return getRuleContexts(ArrayContext.class);
		}
		public ArrayContext array(int i) {
			return getRuleContext(ArrayContext.class,i);
		}
		public List<ObjectContext> object() {
			return getRuleContexts(ObjectContext.class);
		}
		public ObjectContext object(int i) {
			return getRuleContext(ObjectContext.class,i);
		}
		public List<IntegerContext> integer() {
			return getRuleContexts(IntegerContext.class);
		}
		public IntegerContext integer(int i) {
			return getRuleContext(IntegerContext.class,i);
		}
		public ObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object; }
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_object);
		int _la;
		try {
			setState(66);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				match(LeftBrace);
				setState(42);
				match(RightBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
				match(LeftBrace);
				{
				setState(44);
				name();
				setState(45);
				match(Colon);
				setState(49);
				switch (_input.LA(1)) {
				case LeftBracket:
					{
					setState(46);
					array();
					}
					break;
				case LeftBrace:
					{
					setState(47);
					object();
					}
					break;
				case Int:
					{
					setState(48);
					integer();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(51);
					match(Comma);
					{
					setState(52);
					name();
					setState(53);
					match(Colon);
					setState(57);
					switch (_input.LA(1)) {
					case LeftBracket:
						{
						setState(54);
						array();
						}
						break;
					case LeftBrace:
						{
						setState(55);
						object();
						}
						break;
					case Int:
						{
						setState(56);
						integer();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					}
					setState(63);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(64);
				match(RightBrace);
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

	public static class NameContext extends ParserRuleContext {
		public TerminalNode Name() { return getToken(MyParser.Name, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(Name);
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

	public static class IntegerContext extends ParserRuleContext {
		public TerminalNode Int() { return getToken(MyParser.Int, 0); }
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_integer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(Int);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\13K\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\6\2\17\n\2\r\2\16\2\20\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\5\3\33\n\3\3\3\3\3\3\3\3\3\5\3!\n\3\7\3#\n\3\f\3"+
		"\16\3&\13\3\3\3\3\3\5\3*\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\64\n"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4<\n\4\7\4>\n\4\f\4\16\4A\13\4\3\4\3\4\5"+
		"\4E\n\4\3\5\3\5\3\6\3\6\3\6\3\20\2\7\2\4\6\b\n\2\2S\2\16\3\2\2\2\4)\3"+
		"\2\2\2\6D\3\2\2\2\bF\3\2\2\2\nH\3\2\2\2\f\17\5\4\3\2\r\17\5\6\4\2\16\f"+
		"\3\2\2\2\16\r\3\2\2\2\17\20\3\2\2\2\20\21\3\2\2\2\20\16\3\2\2\2\21\22"+
		"\3\2\2\2\22\23\7\2\2\3\23\3\3\2\2\2\24\25\7\3\2\2\25*\7\4\2\2\26\32\7"+
		"\3\2\2\27\33\5\4\3\2\30\33\5\6\4\2\31\33\5\n\6\2\32\27\3\2\2\2\32\30\3"+
		"\2\2\2\32\31\3\2\2\2\33$\3\2\2\2\34 \7\t\2\2\35!\5\4\3\2\36!\5\6\4\2\37"+
		"!\5\n\6\2 \35\3\2\2\2 \36\3\2\2\2 \37\3\2\2\2!#\3\2\2\2\"\34\3\2\2\2#"+
		"&\3\2\2\2$\"\3\2\2\2$%\3\2\2\2%\'\3\2\2\2&$\3\2\2\2\'(\7\4\2\2(*\3\2\2"+
		"\2)\24\3\2\2\2)\26\3\2\2\2*\5\3\2\2\2+,\7\5\2\2,E\7\6\2\2-.\7\5\2\2./"+
		"\5\b\5\2/\63\7\n\2\2\60\64\5\4\3\2\61\64\5\6\4\2\62\64\5\n\6\2\63\60\3"+
		"\2\2\2\63\61\3\2\2\2\63\62\3\2\2\2\64?\3\2\2\2\65\66\7\t\2\2\66\67\5\b"+
		"\5\2\67;\7\n\2\28<\5\4\3\29<\5\6\4\2:<\5\n\6\2;8\3\2\2\2;9\3\2\2\2;:\3"+
		"\2\2\2<>\3\2\2\2=\65\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@B\3\2\2\2A"+
		"?\3\2\2\2BC\7\6\2\2CE\3\2\2\2D+\3\2\2\2D-\3\2\2\2E\7\3\2\2\2FG\7\7\2\2"+
		"G\t\3\2\2\2HI\7\b\2\2I\13\3\2\2\2\f\16\20\32 $)\63;?D";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}