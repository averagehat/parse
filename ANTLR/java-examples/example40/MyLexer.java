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
		LCurly=1, RCurly=2, EQ=3, UnquotedString=4, QuotedString=5, WS=6;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"LCurly", "RCurly", "EQ", "UnquotedString", "QuotedString", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "LCurly", "RCurly", "EQ", "UnquotedString", "QuotedString", "WS"
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
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 4:
			QuotedString_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void QuotedString_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			 
			       // Get the string
			       String theString = getText();  // This gets "John"
			       int firstLetter = 1;
			       int lastLetter = theString.length() - 1;
			       // Extract the text within the quotes
			       String theNewString = theString.substring(firstLetter, lastLetter); 
			       // Set the string
			       setText(theNewString);  // This sets the token value to be sent to the parser rule
			      
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\b&\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\3\3\3\3\4\3\4\3\5\6\5"+
		"\27\n\5\r\5\16\5\30\3\6\3\6\3\6\3\6\3\6\3\7\6\7!\n\7\r\7\16\7\"\3\7\3"+
		"\7\2\2\b\3\3\5\4\7\5\t\6\13\7\r\b\3\2\4\4\2C\\c|\5\2\13\f\17\17\"\"\'"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\3\17\3\2\2\2\5\21\3\2\2\2\7\23\3\2\2\2\t\26\3\2\2\2\13\32\3\2\2\2"+
		"\r \3\2\2\2\17\20\7}\2\2\20\4\3\2\2\2\21\22\7\177\2\2\22\6\3\2\2\2\23"+
		"\24\7?\2\2\24\b\3\2\2\2\25\27\t\2\2\2\26\25\3\2\2\2\27\30\3\2\2\2\30\26"+
		"\3\2\2\2\30\31\3\2\2\2\31\n\3\2\2\2\32\33\7$\2\2\33\34\5\t\5\2\34\35\7"+
		"$\2\2\35\36\b\6\2\2\36\f\3\2\2\2\37!\t\3\2\2 \37\3\2\2\2!\"\3\2\2\2\""+
		" \3\2\2\2\"#\3\2\2\2#$\3\2\2\2$%\b\7\3\2%\16\3\2\2\2\5\2\30\"\4\3\6\2"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}