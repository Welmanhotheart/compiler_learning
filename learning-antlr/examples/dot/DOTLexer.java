// Generated from DOT.g4 by ANTLR 4.0
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DOTLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__9=1, T__8=2, T__7=3, T__6=4, T__5=5, T__4=6, T__3=7, T__2=8, T__1=9, 
		T__0=10, HTML_STRING=11, ID=12, NUMBER=13, DIGIT=14, STRICT=15, GRAPH=16, 
		DIGRAPH=17, NODE=18, EDGE=19, SUBGRAPH=20, STRING=21, PREPROC=22;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'->'", "':'", "'['", "';'", "'{'", "'--'", "','", "']'", "'='", "'}'", 
		"HTML_STRING", "ID", "NUMBER", "DIGIT", "STRICT", "GRAPH", "DIGRAPH", 
		"NODE", "EDGE", "SUBGRAPH", "STRING", "PREPROC"
	};
	public static final String[] ruleNames = {
		"T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", 
		"T__0", "HTML_STRING", "ID", "NUMBER", "DIGIT", "LETTER", "STRICT", "GRAPH", 
		"DIGRAPH", "NODE", "EDGE", "SUBGRAPH", "STRING", "PREPROC", "TAG"
	};


	public DOTLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "DOT.g4"; }

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
		case 22: PREPROC_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void PREPROC_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\2\4\30\u00c3\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b"+
		"\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6"+
		"\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\7\fM\n\f\f"+
		"\f\16\fP\13\f\3\f\3\f\3\r\3\r\3\r\7\rW\n\r\f\r\16\rZ\13\r\3\16\5\16]\n"+
		"\16\3\16\3\16\6\16a\n\16\r\16\16\16b\3\16\6\16f\n\16\r\16\16\16g\3\16"+
		"\3\16\7\16l\n\16\f\16\16\16o\13\16\5\16q\n\16\5\16s\n\16\3\17\3\17\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27"+
		"\3\27\3\27\3\27\7\27\u00a5\n\27\f\27\16\27\u00a8\13\27\3\27\3\27\3\30"+
		"\3\30\3\30\5\30\u00af\n\30\3\30\7\30\u00b2\n\30\f\30\16\30\u00b5\13\30"+
		"\3\30\3\30\3\30\3\30\3\31\3\31\7\31\u00bd\n\31\f\31\16\31\u00c0\13\31"+
		"\3\31\3\31\5\u00a6\u00b3\u00be\32\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1"+
		"\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\2\1!\21"+
		"\1#\22\1%\23\1\'\24\1)\25\1+\26\1-\27\1/\30\2\61\2\1\3\2\'\4>>@@\3\62"+
		";\6C\\aac|\u0082\u0101\4UUuu\4VVvv\4TTtt\4KKkk\4EEee\4VVvv\4IIii\4TTt"+
		"t\4CCcc\4RRrr\4JJjj\4FFff\4KKkk\4IIii\4TTtt\4CCcc\4RRrr\4JJjj\4PPpp\4"+
		"QQqq\4FFff\4GGgg\4GGgg\4FFff\4IIii\4GGgg\4UUuu\4WWww\4DDdd\4IIii\4TTt"+
		"t\4CCcc\4RRrr\4JJjj\u00cf\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\2/\3\2\2\2\3\63\3\2\2\2\5\66\3\2\2\2\78\3\2\2\2\t:\3\2\2\2\13<\3\2"+
		"\2\2\r>\3\2\2\2\17A\3\2\2\2\21C\3\2\2\2\23E\3\2\2\2\25G\3\2\2\2\27I\3"+
		"\2\2\2\31S\3\2\2\2\33\\\3\2\2\2\35t\3\2\2\2\37v\3\2\2\2!x\3\2\2\2#\177"+
		"\3\2\2\2%\u0085\3\2\2\2\'\u008d\3\2\2\2)\u0092\3\2\2\2+\u0097\3\2\2\2"+
		"-\u00a0\3\2\2\2/\u00ae\3\2\2\2\61\u00ba\3\2\2\2\63\64\7/\2\2\64\65\7@"+
		"\2\2\65\4\3\2\2\2\66\67\7<\2\2\67\6\3\2\2\289\7]\2\29\b\3\2\2\2:;\7=\2"+
		"\2;\n\3\2\2\2<=\7}\2\2=\f\3\2\2\2>?\7/\2\2?@\7/\2\2@\16\3\2\2\2AB\7.\2"+
		"\2B\20\3\2\2\2CD\7_\2\2D\22\3\2\2\2EF\7?\2\2F\24\3\2\2\2GH\7\177\2\2H"+
		"\26\3\2\2\2IN\7>\2\2JM\5\27\f\2KM\n\2\2\2LJ\3\2\2\2LK\3\2\2\2MP\3\2\2"+
		"\2NL\3\2\2\2NO\3\2\2\2OQ\3\2\2\2PN\3\2\2\2QR\7@\2\2R\30\3\2\2\2SX\5\37"+
		"\20\2TW\5\37\20\2UW\5\35\17\2VT\3\2\2\2VU\3\2\2\2WZ\3\2\2\2XV\3\2\2\2"+
		"XY\3\2\2\2Y\32\3\2\2\2ZX\3\2\2\2[]\7/\2\2\\[\3\2\2\2\\]\3\2\2\2]r\3\2"+
		"\2\2^`\7\60\2\2_a\5\35\17\2`_\3\2\2\2ab\3\2\2\2b`\3\2\2\2bc\3\2\2\2cs"+
		"\3\2\2\2df\5\35\17\2ed\3\2\2\2fg\3\2\2\2ge\3\2\2\2gh\3\2\2\2hp\3\2\2\2"+
		"im\7\60\2\2jl\5\35\17\2kj\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2nq\3\2"+
		"\2\2om\3\2\2\2pi\3\2\2\2pq\3\2\2\2qs\3\2\2\2r^\3\2\2\2re\3\2\2\2s\34\3"+
		"\2\2\2tu\t\3\2\2u\36\3\2\2\2vw\t\4\2\2w \3\2\2\2xy\t\5\2\2yz\t\6\2\2z"+
		"{\t\7\2\2{|\t\b\2\2|}\t\t\2\2}~\t\n\2\2~\"\3\2\2\2\177\u0080\t\13\2\2"+
		"\u0080\u0081\t\f\2\2\u0081\u0082\t\r\2\2\u0082\u0083\t\16\2\2\u0083\u0084"+
		"\t\17\2\2\u0084$\3\2\2\2\u0085\u0086\t\20\2\2\u0086\u0087\t\21\2\2\u0087"+
		"\u0088\t\22\2\2\u0088\u0089\t\23\2\2\u0089\u008a\t\24\2\2\u008a\u008b"+
		"\t\25\2\2\u008b\u008c\t\26\2\2\u008c&\3\2\2\2\u008d\u008e\t\27\2\2\u008e"+
		"\u008f\t\30\2\2\u008f\u0090\t\31\2\2\u0090\u0091\t\32\2\2\u0091(\3\2\2"+
		"\2\u0092\u0093\t\33\2\2\u0093\u0094\t\34\2\2\u0094\u0095\t\35\2\2\u0095"+
		"\u0096\t\36\2\2\u0096*\3\2\2\2\u0097\u0098\t\37\2\2\u0098\u0099\t \2\2"+
		"\u0099\u009a\t!\2\2\u009a\u009b\t\"\2\2\u009b\u009c\t#\2\2\u009c\u009d"+
		"\t$\2\2\u009d\u009e\t%\2\2\u009e\u009f\t&\2\2\u009f,\3\2\2\2\u00a0\u00a6"+
		"\7$\2\2\u00a1\u00a2\7^\2\2\u00a2\u00a5\7$\2\2\u00a3\u00a5\13\2\2\2\u00a4"+
		"\u00a1\3\2\2\2\u00a4\u00a3\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a7\3\2"+
		"\2\2\u00a6\u00a4\3\2\2\2\u00a7\u00a9\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9"+
		"\u00aa\7$\2\2\u00aa.\3\2\2\2\u00ab\u00af\7%\2\2\u00ac\u00ad\7\61\2\2\u00ad"+
		"\u00af\7\61\2\2\u00ae\u00ab\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b3\3"+
		"\2\2\2\u00b0\u00b2\13\2\2\2\u00b1\u00b0\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3"+
		"\u00b4\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00b6\3\2\2\2\u00b5\u00b3\3\2"+
		"\2\2\u00b6\u00b7\7\f\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\b\30\2\2\u00b9"+
		"\60\3\2\2\2\u00ba\u00be\7>\2\2\u00bb\u00bd\13\2\2\2\u00bc\u00bb\3\2\2"+
		"\2\u00bd\u00c0\3\2\2\2\u00be\u00bf\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf\u00c1"+
		"\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1\u00c2\7@\2\2\u00c2\62\3\2\2\2\22\2"+
		"LNVX\\bgmpr\u00a4\u00a6\u00ae\u00b3\u00be";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}