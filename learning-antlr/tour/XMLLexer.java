// Generated from XMLLexer.g4 by ANTLR 4.0
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class XMLLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OPEN=1, COMMENT=2, EntityRef=3, TEXT=4, CLOSE=5, SLASH_CLOSE=6, EQUALS=7, 
		STRING=8, SlashName=9, Name=10, S=11;
	public static final int INSIDE = 1;
	public static String[] modeNames = {
		"DEFAULT_MODE", "INSIDE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'<'", "COMMENT", "EntityRef", "TEXT", "'>'", "'/>'", "'='", "STRING", 
		"SlashName", "Name", "S"
	};
	public static final String[] ruleNames = {
		"OPEN", "COMMENT", "EntityRef", "TEXT", "CLOSE", "SLASH_CLOSE", "EQUALS", 
		"STRING", "SlashName", "Name", "S", "ALPHA", "DIGIT"
	};


	public XMLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "XMLLexer.g4"; }

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
		case 0: OPEN_action((RuleContext)_localctx, actionIndex); break;

		case 1: COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 4: CLOSE_action((RuleContext)_localctx, actionIndex); break;

		case 5: SLASH_CLOSE_action((RuleContext)_localctx, actionIndex); break;

		case 10: S_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void SLASH_CLOSE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3: popMode();  break;
		}
	}
	private void S_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4: skip();  break;
		}
	}
	private void CLOSE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2: popMode();  break;
		}
	}
	private void COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: skip();  break;
		}
	}
	private void OPEN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: pushMode(INSIDE);  break;
		}
	}

	public static final String _serializedATN =
		"\2\4\rg\b\1\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t"+
		"\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\7\3)\n\3\f\3\16\3,\13\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\4\3\4\6\4\66\n\4\r\4\16\4\67\3\4\3\4\3\5\6\5=\n\5\r\5\16\5>\3\6\3"+
		"\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\7\tN\n\t\f\t\16\tQ\13\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\7\13[\n\13\f\13\16\13^\13\13\3\f\3"+
		"\f\3\f\3\f\3\r\3\r\3\16\3\16\4*O\17\4\3\2\6\4\3\b\5\1\n\6\1\f\7\4\16\b"+
		"\5\20\t\1\22\n\1\24\13\1\26\f\1\30\r\6\32\2\1\34\2\1\4\2\3\7\3c|\4((>"+
		">\5\13\f\17\17\"\"\4C\\c|\3\62;i\2\4\3\2\2\2\2\6\3\2\2\2\2\b\3\2\2\2\2"+
		"\n\3\2\2\2\3\f\3\2\2\2\3\16\3\2\2\2\3\20\3\2\2\2\3\22\3\2\2\2\3\24\3\2"+
		"\2\2\3\26\3\2\2\2\3\30\3\2\2\2\4\36\3\2\2\2\6\"\3\2\2\2\b\63\3\2\2\2\n"+
		"<\3\2\2\2\f@\3\2\2\2\16D\3\2\2\2\20I\3\2\2\2\22K\3\2\2\2\24T\3\2\2\2\26"+
		"W\3\2\2\2\30_\3\2\2\2\32c\3\2\2\2\34e\3\2\2\2\36\37\7>\2\2\37 \3\2\2\2"+
		" !\b\2\2\2!\5\3\2\2\2\"#\7>\2\2#$\7#\2\2$%\7/\2\2%&\7/\2\2&*\3\2\2\2\'"+
		")\13\2\2\2(\'\3\2\2\2),\3\2\2\2*+\3\2\2\2*(\3\2\2\2+-\3\2\2\2,*\3\2\2"+
		"\2-.\7/\2\2./\7/\2\2/\60\7@\2\2\60\61\3\2\2\2\61\62\b\3\3\2\62\7\3\2\2"+
		"\2\63\65\7(\2\2\64\66\t\2\2\2\65\64\3\2\2\2\66\67\3\2\2\2\67\65\3\2\2"+
		"\2\678\3\2\2\289\3\2\2\29:\7=\2\2:\t\3\2\2\2;=\n\3\2\2<;\3\2\2\2=>\3\2"+
		"\2\2><\3\2\2\2>?\3\2\2\2?\13\3\2\2\2@A\7@\2\2AB\3\2\2\2BC\b\6\4\2C\r\3"+
		"\2\2\2DE\7\61\2\2EF\7@\2\2FG\3\2\2\2GH\b\7\5\2H\17\3\2\2\2IJ\7?\2\2J\21"+
		"\3\2\2\2KO\7$\2\2LN\13\2\2\2ML\3\2\2\2NQ\3\2\2\2OP\3\2\2\2OM\3\2\2\2P"+
		"R\3\2\2\2QO\3\2\2\2RS\7$\2\2S\23\3\2\2\2TU\7\61\2\2UV\5\26\13\2V\25\3"+
		"\2\2\2W\\\5\32\r\2X[\5\32\r\2Y[\5\34\16\2ZX\3\2\2\2ZY\3\2\2\2[^\3\2\2"+
		"\2\\Z\3\2\2\2\\]\3\2\2\2]\27\3\2\2\2^\\\3\2\2\2_`\t\4\2\2`a\3\2\2\2ab"+
		"\b\f\6\2b\31\3\2\2\2cd\t\5\2\2d\33\3\2\2\2ef\t\6\2\2f\35\3\2\2\2\n\2\3"+
		"*\67>OZ\\";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}