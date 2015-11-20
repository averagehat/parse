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
		CurrencySymbol=1, Space=2, Digit=3, Cents=4, NL=5, Separator=6, Product=7;
	public static final int
		RULE_purchases = 0, RULE_purchase = 1, RULE_product = 2, RULE_amount = 3;
	public static final String[] ruleNames = {
		"purchases", "purchase", "product", "amount"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "' '", null, null, null, "'/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "CurrencySymbol", "Space", "Digit", "Cents", "NL", "Separator", 
		"Product"
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
	public static class PurchasesContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(MyParser.EOF, 0); }
		public List<PurchaseContext> purchase() {
			return getRuleContexts(PurchaseContext.class);
		}
		public PurchaseContext purchase(int i) {
			return getRuleContext(PurchaseContext.class,i);
		}
		public PurchasesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_purchases; }
	}

	public final PurchasesContext purchases() throws RecognitionException {
		PurchasesContext _localctx = new PurchasesContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_purchases);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(11);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Product) {
				{
				{
				setState(8);
				purchase();
				}
				}
				setState(13);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(14);
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

	public static class PurchaseContext extends ParserRuleContext {
		public ProductContext product() {
			return getRuleContext(ProductContext.class,0);
		}
		public AmountContext amount() {
			return getRuleContext(AmountContext.class,0);
		}
		public PurchaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_purchase; }
	}

	public final PurchaseContext purchase() throws RecognitionException {
		PurchaseContext _localctx = new PurchaseContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_purchase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			product();
			setState(17);
			amount();
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

	public static class ProductContext extends ParserRuleContext {
		public TerminalNode Product() { return getToken(MyParser.Product, 0); }
		public ProductContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_product; }
	}

	public final ProductContext product() throws RecognitionException {
		ProductContext _localctx = new ProductContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_product);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			match(Product);
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
		enterRule(_localctx, 6, RULE_amount);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			match(CurrencySymbol);
			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Space) {
				{
				{
				setState(22);
				match(Space);
				}
				}
				setState(27);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(29); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(28);
				match(Digit);
				}
				}
				setState(31); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Digit );
			setState(34);
			_la = _input.LA(1);
			if (_la==Cents) {
				{
				setState(33);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\t\'\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\3\2\7\2\f\n\2\f\2\16\2\17\13\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\4\3\4\3\5\3\5\7\5\32\n\5\f\5\16\5\35\13\5\3\5\6\5 \n\5\r\5\16\5!\3"+
		"\5\5\5%\n\5\3\5\2\2\6\2\4\6\b\2\2&\2\r\3\2\2\2\4\22\3\2\2\2\6\25\3\2\2"+
		"\2\b\27\3\2\2\2\n\f\5\4\3\2\13\n\3\2\2\2\f\17\3\2\2\2\r\13\3\2\2\2\r\16"+
		"\3\2\2\2\16\20\3\2\2\2\17\r\3\2\2\2\20\21\7\2\2\3\21\3\3\2\2\2\22\23\5"+
		"\6\4\2\23\24\5\b\5\2\24\5\3\2\2\2\25\26\7\t\2\2\26\7\3\2\2\2\27\33\7\3"+
		"\2\2\30\32\7\4\2\2\31\30\3\2\2\2\32\35\3\2\2\2\33\31\3\2\2\2\33\34\3\2"+
		"\2\2\34\37\3\2\2\2\35\33\3\2\2\2\36 \7\5\2\2\37\36\3\2\2\2 !\3\2\2\2!"+
		"\37\3\2\2\2!\"\3\2\2\2\"$\3\2\2\2#%\7\6\2\2$#\3\2\2\2$%\3\2\2\2%\t\3\2"+
		"\2\2\6\r\33!$";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}