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
		TITLE=1, NL1=2, LINE=3, NL2=4;
	public static final int LINES = 1;
	public static String[] modeNames = {
		"DEFAULT_MODE", "LINES"
	};

	public static final String[] ruleNames = {
		"TITLE", "NL1", "LINE", "NL2"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "TITLE", "NL1", "LINE", "NL2"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\6&\b\1\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\3\2\6\2\16\n\2\r\2\16\2\17\3\2\3\2\3\3\6\3"+
		"\25\n\3\r\3\16\3\26\3\3\3\3\3\4\6\4\34\n\4\r\4\16\4\35\3\5\6\5!\n\5\r"+
		"\5\16\5\"\3\5\3\5\2\2\6\4\3\6\4\b\5\n\6\4\2\3\3\4\2\f\f\17\17(\2\4\3\2"+
		"\2\2\2\6\3\2\2\2\3\b\3\2\2\2\3\n\3\2\2\2\4\r\3\2\2\2\6\24\3\2\2\2\b\33"+
		"\3\2\2\2\n \3\2\2\2\f\16\n\2\2\2\r\f\3\2\2\2\16\17\3\2\2\2\17\r\3\2\2"+
		"\2\17\20\3\2\2\2\20\21\3\2\2\2\21\22\b\2\2\2\22\5\3\2\2\2\23\25\t\2\2"+
		"\2\24\23\3\2\2\2\25\26\3\2\2\2\26\24\3\2\2\2\26\27\3\2\2\2\27\30\3\2\2"+
		"\2\30\31\b\3\3\2\31\7\3\2\2\2\32\34\n\2\2\2\33\32\3\2\2\2\34\35\3\2\2"+
		"\2\35\33\3\2\2\2\35\36\3\2\2\2\36\t\3\2\2\2\37!\t\2\2\2 \37\3\2\2\2!\""+
		"\3\2\2\2\" \3\2\2\2\"#\3\2\2\2#$\3\2\2\2$%\b\5\3\2%\13\3\2\2\2\b\2\3\17"+
		"\26\35\"\4\7\3\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}