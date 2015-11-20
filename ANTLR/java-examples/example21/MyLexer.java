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
		COMMA=1, DASH=2, NL=3, WS=4, SEPARATOR=5, STRING=6, KEY=7, EQ=8, NL2=9, 
		WS2=10, SEPARATOR2=11, VALUE=12;
	public static final int PAIRS = 1;
	public static String[] modeNames = {
		"DEFAULT_MODE", "PAIRS"
	};

	public static final String[] ruleNames = {
		"COMMA", "DASH", "NL", "WS", "SEPARATOR", "STRING", "SEP", "KEY", "EQ", 
		"NL2", "WS2", "SEPARATOR2", "VALUE", "SEP2"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "','", "'-'", null, null, null, null, null, "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "COMMA", "DASH", "NL", "WS", "SEPARATOR", "STRING", "KEY", "EQ", 
		"NL2", "WS2", "SEPARATOR2", "VALUE"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\16k\b\1\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\3\3\3\3\4\5\4&\n\4"+
		"\3\4\3\4\3\5\6\5+\n\5\r\5\16\5,\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\6\7\67"+
		"\n\7\r\7\16\78\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\5\tO\n\t\3\n\3\n\3\13\5\13T\n\13\3\13\3\13\3"+
		"\f\6\fY\n\f\r\f\16\fZ\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\6\16e\n\16\r\16"+
		"\16\16f\3\17\3\17\3\17\2\2\20\4\3\6\4\b\5\n\6\f\7\16\b\20\2\22\t\24\n"+
		"\26\13\30\f\32\r\34\16\36\2\4\2\3\5\5\2\13\f\17\17\"\"\5\2\f\f\17\17."+
		".\5\2\f\f\17\17??n\2\4\3\2\2\2\2\6\3\2\2\2\2\b\3\2\2\2\2\n\3\2\2\2\2\f"+
		"\3\2\2\2\2\16\3\2\2\2\3\22\3\2\2\2\3\24\3\2\2\2\3\26\3\2\2\2\3\30\3\2"+
		"\2\2\3\32\3\2\2\2\3\34\3\2\2\2\4 \3\2\2\2\6\"\3\2\2\2\b%\3\2\2\2\n*\3"+
		"\2\2\2\f\60\3\2\2\2\16\66\3\2\2\2\20:\3\2\2\2\22N\3\2\2\2\24P\3\2\2\2"+
		"\26S\3\2\2\2\30X\3\2\2\2\32^\3\2\2\2\34d\3\2\2\2\36h\3\2\2\2 !\7.\2\2"+
		"!\5\3\2\2\2\"#\7/\2\2#\7\3\2\2\2$&\7\17\2\2%$\3\2\2\2%&\3\2\2\2&\'\3\2"+
		"\2\2\'(\7\f\2\2(\t\3\2\2\2)+\t\2\2\2*)\3\2\2\2+,\3\2\2\2,*\3\2\2\2,-\3"+
		"\2\2\2-.\3\2\2\2./\b\5\2\2/\13\3\2\2\2\60\61\5\20\b\2\61\62\3\2\2\2\62"+
		"\63\b\6\2\2\63\64\b\6\3\2\64\r\3\2\2\2\65\67\n\3\2\2\66\65\3\2\2\2\67"+
		"8\3\2\2\28\66\3\2\2\289\3\2\2\29\17\3\2\2\2:;\7/\2\2;<\5\b\4\2<\21\3\2"+
		"\2\2=>\7H\2\2>?\7k\2\2?@\7t\2\2@A\7u\2\2AB\7v\2\2BC\7P\2\2CD\7c\2\2DE"+
		"\7o\2\2EO\7g\2\2FG\7N\2\2GH\7c\2\2HI\7u\2\2IJ\7v\2\2JK\7P\2\2KL\7c\2\2"+
		"LM\7o\2\2MO\7g\2\2N=\3\2\2\2NF\3\2\2\2O\23\3\2\2\2PQ\7?\2\2Q\25\3\2\2"+
		"\2RT\7\17\2\2SR\3\2\2\2ST\3\2\2\2TU\3\2\2\2UV\7\f\2\2V\27\3\2\2\2WY\t"+
		"\2\2\2XW\3\2\2\2YZ\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[\\\3\2\2\2\\]\b\f\2\2]"+
		"\31\3\2\2\2^_\5\36\17\2_`\3\2\2\2`a\b\r\2\2ab\b\r\4\2b\33\3\2\2\2ce\n"+
		"\4\2\2dc\3\2\2\2ef\3\2\2\2fd\3\2\2\2fg\3\2\2\2g\35\3\2\2\2hi\7/\2\2ij"+
		"\5\26\13\2j\37\3\2\2\2\13\2\3%,8NSZf\5\b\2\2\7\3\2\6\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}