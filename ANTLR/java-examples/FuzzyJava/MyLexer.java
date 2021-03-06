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
		Constant=1, Identifier=2, WS=3, OTHER=4;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"Constant", "Identifier", "WS", "OTHER"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "Constant", "Identifier", "WS", "OTHER"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\6\67\b\1\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\7\3"+
		"(\n\3\f\3\16\3+\13\3\3\4\6\4.\n\4\r\4\16\4/\3\4\3\4\3\5\3\5\3\5\3\5\2"+
		"\2\6\3\3\5\4\7\5\t\6\3\2\5\6\2&&C\\aac|\7\2&&\62;C\\aac|\5\2\13\f\16\17"+
		"\"\"8\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\3\13\3\2\2\2\5%"+
		"\3\2\2\2\7-\3\2\2\2\t\63\3\2\2\2\13\f\7r\2\2\f\r\7w\2\2\r\16\7d\2\2\16"+
		"\17\7n\2\2\17\20\7k\2\2\20\21\7e\2\2\21\22\3\2\2\2\22\23\7u\2\2\23\24"+
		"\7v\2\2\24\25\7c\2\2\25\26\7v\2\2\26\27\7k\2\2\27\30\7e\2\2\30\31\3\2"+
		"\2\2\31\32\7h\2\2\32\33\7k\2\2\33\34\7p\2\2\34\35\7c\2\2\35\36\7n\2\2"+
		"\36\37\3\2\2\2\37 \7k\2\2 !\7p\2\2!\"\7v\2\2\"#\3\2\2\2#$\5\5\3\2$\4\3"+
		"\2\2\2%)\t\2\2\2&(\t\3\2\2\'&\3\2\2\2(+\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*"+
		"\6\3\2\2\2+)\3\2\2\2,.\t\4\2\2-,\3\2\2\2./\3\2\2\2/-\3\2\2\2/\60\3\2\2"+
		"\2\60\61\3\2\2\2\61\62\b\4\2\2\62\b\3\2\2\2\63\64\13\2\2\2\64\65\3\2\2"+
		"\2\65\66\b\5\3\2\66\n\3\2\2\2\5\2)/\4\2\3\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}