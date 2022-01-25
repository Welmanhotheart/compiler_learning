// Generated from PropertyFile.g4 by ANTLR 4.0
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PropertyFileLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__1=1, T__0=2, ID=3, STRING=4, WS=5;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'\n'", "'='", "ID", "STRING", "WS"
	};
	public static final String[] ruleNames = {
		"T__1", "T__0", "ID", "STRING", "WS", "ESC", "UNICODE", "HEX"
	};


	public PropertyFileLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PropertyFile.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 4: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\2\4\7:\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\3\2\3\2\3\3\3\3\3\4\6\4\31\n\4\r\4\16\4\32\3\5\3\5\3\5\7\5 \n\5"+
		"\f\5\16\5#\13\5\3\5\3\5\3\6\6\6(\n\6\r\6\16\6)\3\6\3\6\3\7\3\7\3\7\5\7"+
		"\61\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\2\n\3\3\1\5\4\1\7\5\1\t\6\1\13"+
		"\7\2\r\2\1\17\2\1\21\2\1\3\2\7\3c|\4$$^^\5\13\f\17\17\"\"\n$$\61\61^^"+
		"ddhhppttvv\5\62;CHch;\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\3\23\3\2\2\2\5\25\3\2\2\2\7\30\3\2\2\2\t\34\3\2\2\2\13\'"+
		"\3\2\2\2\r-\3\2\2\2\17\62\3\2\2\2\218\3\2\2\2\23\24\7\f\2\2\24\4\3\2\2"+
		"\2\25\26\7?\2\2\26\6\3\2\2\2\27\31\t\2\2\2\30\27\3\2\2\2\31\32\3\2\2\2"+
		"\32\30\3\2\2\2\32\33\3\2\2\2\33\b\3\2\2\2\34!\7$\2\2\35 \5\r\7\2\36 \n"+
		"\3\2\2\37\35\3\2\2\2\37\36\3\2\2\2 #\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\""+
		"$\3\2\2\2#!\3\2\2\2$%\7$\2\2%\n\3\2\2\2&(\t\4\2\2\'&\3\2\2\2()\3\2\2\2"+
		")\'\3\2\2\2)*\3\2\2\2*+\3\2\2\2+,\b\6\2\2,\f\3\2\2\2-\60\7^\2\2.\61\t"+
		"\5\2\2/\61\5\17\b\2\60.\3\2\2\2\60/\3\2\2\2\61\16\3\2\2\2\62\63\7w\2\2"+
		"\63\64\5\21\t\2\64\65\5\21\t\2\65\66\5\21\t\2\66\67\5\21\t\2\67\20\3\2"+
		"\2\289\t\6\2\29\22\3\2\2\2\b\2\32\37!)\60";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}