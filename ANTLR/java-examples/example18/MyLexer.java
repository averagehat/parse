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
		COMMA=1, NL=2, WS=3, SEPARATOR=4, STRING=5, KEY=6, EQ=7, NL2=8, WS2=9, 
		SEPARATOR2=10, VALUE=11;
	public static final int PAIRS = 1;
	public static String[] modeNames = {
		"DEFAULT_MODE", "PAIRS"
	};

	public static final String[] ruleNames = {
		"COMMA", "NL", "WS", "SEPARATOR", "STRING", "SEP", "KEY", "EQ", "NL2", 
		"WS2", "SEPARATOR2", "VALUE", "SEP2"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "','", null, null, null, null, null, "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "COMMA", "NL", "WS", "SEPARATOR", "STRING", "KEY", "EQ", "NL2", 
		"WS2", "SEPARATOR2", "VALUE"
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\ro\b\1\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\3\5\3\"\n\3\3\3\3\3\3\4\6\4"+
		"\'\n\4\r\4\16\4(\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\6\6\63\n\6\r\6\16\6\64"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bO\n\b\3\t\3\t\3\n\5\nT\n\n\3\n\3\n\3\13"+
		"\6\13Y\n\13\r\13\16\13Z\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\6\re\n\r\r\r"+
		"\16\rf\3\16\3\16\3\16\3\16\3\16\3\16\3\16\2\2\17\4\3\6\4\b\5\n\6\f\7\16"+
		"\2\20\b\22\t\24\n\26\13\30\f\32\r\34\2\4\2\3\5\5\2\13\f\17\17\"\"\5\2"+
		"\f\f\17\17..\5\2\f\f\17\17??r\2\4\3\2\2\2\2\6\3\2\2\2\2\b\3\2\2\2\2\n"+
		"\3\2\2\2\2\f\3\2\2\2\3\20\3\2\2\2\3\22\3\2\2\2\3\24\3\2\2\2\3\26\3\2\2"+
		"\2\3\30\3\2\2\2\3\32\3\2\2\2\4\36\3\2\2\2\6!\3\2\2\2\b&\3\2\2\2\n,\3\2"+
		"\2\2\f\62\3\2\2\2\16\66\3\2\2\2\20N\3\2\2\2\22P\3\2\2\2\24S\3\2\2\2\26"+
		"X\3\2\2\2\30^\3\2\2\2\32d\3\2\2\2\34h\3\2\2\2\36\37\7.\2\2\37\5\3\2\2"+
		"\2 \"\7\17\2\2! \3\2\2\2!\"\3\2\2\2\"#\3\2\2\2#$\7\f\2\2$\7\3\2\2\2%\'"+
		"\t\2\2\2&%\3\2\2\2\'(\3\2\2\2(&\3\2\2\2()\3\2\2\2)*\3\2\2\2*+\b\4\2\2"+
		"+\t\3\2\2\2,-\5\16\7\2-.\3\2\2\2./\b\5\2\2/\60\b\5\3\2\60\13\3\2\2\2\61"+
		"\63\n\3\2\2\62\61\3\2\2\2\63\64\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65"+
		"\r\3\2\2\2\66\67\7/\2\2\678\7/\2\289\7/\2\29:\7/\2\2:;\3\2\2\2;<\5\6\3"+
		"\2<\17\3\2\2\2=>\7H\2\2>?\7k\2\2?@\7t\2\2@A\7u\2\2AB\7v\2\2BC\7P\2\2C"+
		"D\7c\2\2DE\7o\2\2EO\7g\2\2FG\7N\2\2GH\7c\2\2HI\7u\2\2IJ\7v\2\2JK\7P\2"+
		"\2KL\7c\2\2LM\7o\2\2MO\7g\2\2N=\3\2\2\2NF\3\2\2\2O\21\3\2\2\2PQ\7?\2\2"+
		"Q\23\3\2\2\2RT\7\17\2\2SR\3\2\2\2ST\3\2\2\2TU\3\2\2\2UV\7\f\2\2V\25\3"+
		"\2\2\2WY\t\2\2\2XW\3\2\2\2YZ\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[\\\3\2\2\2\\"+
		"]\b\13\2\2]\27\3\2\2\2^_\5\34\16\2_`\3\2\2\2`a\b\f\2\2ab\b\f\4\2b\31\3"+
		"\2\2\2ce\n\4\2\2dc\3\2\2\2ef\3\2\2\2fd\3\2\2\2fg\3\2\2\2g\33\3\2\2\2h"+
		"i\7/\2\2ij\7/\2\2jk\7/\2\2kl\7/\2\2lm\3\2\2\2mn\5\24\n\2n\35\3\2\2\2\13"+
		"\2\3!(\64NSZf\5\b\2\2\7\3\2\6\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}