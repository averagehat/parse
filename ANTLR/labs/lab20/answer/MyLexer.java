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
		COMMA=1, NL=2, WS=3, FIELD=4;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"COMMA", "NL", "WS", "FIELD", "ANY_CHAR_EXCEPT_COMMA_AND_NL_AND_BACKSLASH", 
		"ESCAPED_COMMA", "ESCAPED_BACKSLASH", "ESCAPED_NL"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "COMMA", "NL", "WS", "FIELD"
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
		case 3:
			FIELD_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void FIELD_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:

			       String theString = getText(); 
			       String withoutEscapedComma = theString.replace("\\,", ",");
			       String withoutEscapedBackslash = withoutEscapedComma.replace("\\\\", "\\");
			       String withoutEscapedNL = withoutEscapedBackslash.replace("\\\r\n", " ");
			       setText(withoutEscapedNL); 
				
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\6\66\b\1\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\3\5"+
		"\3\27\n\3\3\3\3\3\3\4\6\4\34\n\4\r\4\16\4\35\3\4\3\4\3\5\3\5\3\5\3\5\6"+
		"\5&\n\5\r\5\16\5\'\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t"+
		"\2\2\n\3\3\5\4\7\5\t\6\13\2\r\2\17\2\21\2\3\2\4\5\2\13\f\17\17\"\"\6\2"+
		"\f\f\17\17..^^\67\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\3\23"+
		"\3\2\2\2\5\26\3\2\2\2\7\33\3\2\2\2\t%\3\2\2\2\13+\3\2\2\2\r-\3\2\2\2\17"+
		"\60\3\2\2\2\21\63\3\2\2\2\23\24\7.\2\2\24\4\3\2\2\2\25\27\7\17\2\2\26"+
		"\25\3\2\2\2\26\27\3\2\2\2\27\30\3\2\2\2\30\31\7\f\2\2\31\6\3\2\2\2\32"+
		"\34\t\2\2\2\33\32\3\2\2\2\34\35\3\2\2\2\35\33\3\2\2\2\35\36\3\2\2\2\36"+
		"\37\3\2\2\2\37 \b\4\2\2 \b\3\2\2\2!&\5\13\6\2\"&\5\r\7\2#&\5\17\b\2$&"+
		"\5\21\t\2%!\3\2\2\2%\"\3\2\2\2%#\3\2\2\2%$\3\2\2\2&\'\3\2\2\2\'%\3\2\2"+
		"\2\'(\3\2\2\2()\3\2\2\2)*\b\5\3\2*\n\3\2\2\2+,\n\3\2\2,\f\3\2\2\2-.\7"+
		"^\2\2./\7.\2\2/\16\3\2\2\2\60\61\7^\2\2\61\62\7^\2\2\62\20\3\2\2\2\63"+
		"\64\7^\2\2\64\65\5\5\3\2\65\22\3\2\2\2\7\2\26\35%\'\4\b\2\2\3\5\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}