// Generated from MyLexer.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MyLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Received=1, SemiColon=2, FromText=3, ByText=4, WithText=5, IdText=6, DateContents=7, 
		Whitespace=8;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"Received", "SemiColon", "FromText", "ByText", "WithText", "IdText", "DateContents", 
		"Letter", "Number", "Special", "Whitespace"
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


	public MyLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MyLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return FromText_sempred((RuleContext)_localctx, predIndex);
		case 3:
			return ByText_sempred((RuleContext)_localctx, predIndex);
		case 4:
			return WithText_sempred((RuleContext)_localctx, predIndex);
		case 5:
			return IdText_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean FromText_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return 
		       // Use lookahead to look for specific characters
		       // More on LA(1): http://www.antlr.org/api/Java/index.html?org/antlr/v4/runtime/IntStream.html
		       (_input.LA(1) == 'b') &&
		       (_input.LA(2) == 'y')
		      ;
		}
		return true;
	}
	private boolean ByText_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return 
		       (_input.LA(1) == 'w') &&
		       (_input.LA(2) == 'i') &&
		       (_input.LA(3) == 't') &&
		       (_input.LA(4) == 'h')
		      ;
		}
		return true;
	}
	private boolean WithText_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return 
		       (_input.LA(1) == 'i') &&
		       (_input.LA(2) == 'd')
		      ;
		}
		return true;
	}
	private boolean IdText_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return 
		       (_input.LA(1) == ';')
		      ;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\n\u0081\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\6\4.\n\4\r\4\16\4/\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\5\6\59\n\5\r\5\16\5:\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\6\6F\n\6\r\6"+
		"\16\6G\3\6\3\6\3\7\3\7\3\7\3\7\3\7\6\7Q\n\7\r\7\16\7R\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\5\bl\n\b\3\b\3\b\3\b\6\bq\n\b\r\b\16\br\3\t\3\t\3\n\3\n\3\13\3"+
		"\13\3\f\6\f|\n\f\r\f\16\f}\3\f\3\f\6/:GR\2\r\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\2\23\2\25\2\27\n\3\2\5\4\2C\\c|\f\2\"\"&&*+-\61<<??]]__aa\u0080"+
		"\u0080\4\2\13\f\17\17\u008b\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\27\3\2\2\2\3\31\3\2\2\2"+
		"\5$\3\2\2\2\7&\3\2\2\2\t\63\3\2\2\2\13>\3\2\2\2\rK\3\2\2\2\17k\3\2\2\2"+
		"\21t\3\2\2\2\23v\3\2\2\2\25x\3\2\2\2\27{\3\2\2\2\31\32\7T\2\2\32\33\7"+
		"g\2\2\33\34\7e\2\2\34\35\7g\2\2\35\36\7k\2\2\36\37\7x\2\2\37 \7g\2\2 "+
		"!\7f\2\2!\"\7<\2\2\"#\7\"\2\2#\4\3\2\2\2$%\7=\2\2%\6\3\2\2\2&\'\7h\2\2"+
		"\'(\7t\2\2()\7q\2\2)*\7o\2\2*+\7\"\2\2+-\3\2\2\2,.\13\2\2\2-,\3\2\2\2"+
		"./\3\2\2\2/\60\3\2\2\2/-\3\2\2\2\60\61\3\2\2\2\61\62\6\4\2\2\62\b\3\2"+
		"\2\2\63\64\7d\2\2\64\65\7{\2\2\65\66\7\"\2\2\668\3\2\2\2\679\13\2\2\2"+
		"8\67\3\2\2\29:\3\2\2\2:;\3\2\2\2:8\3\2\2\2;<\3\2\2\2<=\6\5\3\2=\n\3\2"+
		"\2\2>?\7y\2\2?@\7k\2\2@A\7v\2\2AB\7j\2\2BC\7\"\2\2CE\3\2\2\2DF\13\2\2"+
		"\2ED\3\2\2\2FG\3\2\2\2GH\3\2\2\2GE\3\2\2\2HI\3\2\2\2IJ\6\6\4\2J\f\3\2"+
		"\2\2KL\7k\2\2LM\7f\2\2MN\7\"\2\2NP\3\2\2\2OQ\13\2\2\2PO\3\2\2\2QR\3\2"+
		"\2\2RS\3\2\2\2RP\3\2\2\2ST\3\2\2\2TU\6\7\5\2U\16\3\2\2\2VW\7O\2\2WX\7"+
		"q\2\2Xl\7p\2\2YZ\7V\2\2Z[\7w\2\2[l\7g\2\2\\]\7Y\2\2]^\7g\2\2^l\7f\2\2"+
		"_`\7V\2\2`a\7j\2\2al\7w\2\2bc\7H\2\2cd\7t\2\2dl\7k\2\2ef\7U\2\2fg\7c\2"+
		"\2gl\7v\2\2hi\7U\2\2ij\7w\2\2jl\7p\2\2kV\3\2\2\2kY\3\2\2\2k\\\3\2\2\2"+
		"k_\3\2\2\2kb\3\2\2\2ke\3\2\2\2kh\3\2\2\2lp\3\2\2\2mq\5\21\t\2nq\5\23\n"+
		"\2oq\5\25\13\2pm\3\2\2\2pn\3\2\2\2po\3\2\2\2qr\3\2\2\2rp\3\2\2\2rs\3\2"+
		"\2\2s\20\3\2\2\2tu\t\2\2\2u\22\3\2\2\2vw\4\62;\2w\24\3\2\2\2xy\t\3\2\2"+
		"y\26\3\2\2\2z|\t\4\2\2{z\3\2\2\2|}\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\177\3"+
		"\2\2\2\177\u0080\b\f\2\2\u0080\30\3\2\2\2\13\2/:GRkpr}\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}