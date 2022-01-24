// Generated from Cymbol.g4 by ANTLR 4.0
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CymbolLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__20=1, T__19=2, T__18=3, T__17=4, T__16=5, T__15=6, T__14=7, T__13=8, 
		T__12=9, T__11=10, T__10=11, T__9=12, T__8=13, T__7=14, T__6=15, T__5=16, 
		T__4=17, T__3=18, T__2=19, T__1=20, T__0=21, ID=22;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'return'", "'float'", "'['", "'{'", "'void'", "';'", "'=='", "']'", "'}'", 
		"'='", "'if'", "'!'", "'int'", "'else'", "'('", "')'", "'*'", "'+'", "'then'", 
		"','", "'-'", "ID"
	};
	public static final String[] ruleNames = {
		"T__20", "T__19", "T__18", "T__17", "T__16", "T__15", "T__14", "T__13", 
		"T__12", "T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", 
		"T__3", "T__2", "T__1", "T__0", "ID", "INT"
	};


	public CymbolLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Cymbol.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\2\4\30\u0080\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b"+
		"\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n"+
		"\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\26\3\26\3\27\6\27s\n\27\r\27\16\27t\3\30\3\30\3\30\7\30z"+
		"\n\30\f\30\16\30}\13\30\5\30\177\n\30\2\31\3\3\1\5\4\1\7\5\1\t\6\1\13"+
		"\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1"+
		"\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27\1-\30\1/\2\1\3\2\5\3c|\3\63"+
		";\3\62;\u0081\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\3\61\3\2\2\2\58\3\2\2\2\7>\3\2\2\2\t@\3\2\2\2\13B\3\2\2\2\rG\3\2\2"+
		"\2\17I\3\2\2\2\21L\3\2\2\2\23N\3\2\2\2\25P\3\2\2\2\27R\3\2\2\2\31U\3\2"+
		"\2\2\33W\3\2\2\2\35[\3\2\2\2\37`\3\2\2\2!b\3\2\2\2#d\3\2\2\2%f\3\2\2\2"+
		"\'h\3\2\2\2)m\3\2\2\2+o\3\2\2\2-r\3\2\2\2/~\3\2\2\2\61\62\7t\2\2\62\63"+
		"\7g\2\2\63\64\7v\2\2\64\65\7w\2\2\65\66\7t\2\2\66\67\7p\2\2\67\4\3\2\2"+
		"\289\7h\2\29:\7n\2\2:;\7q\2\2;<\7c\2\2<=\7v\2\2=\6\3\2\2\2>?\7]\2\2?\b"+
		"\3\2\2\2@A\7}\2\2A\n\3\2\2\2BC\7x\2\2CD\7q\2\2DE\7k\2\2EF\7f\2\2F\f\3"+
		"\2\2\2GH\7=\2\2H\16\3\2\2\2IJ\7?\2\2JK\7?\2\2K\20\3\2\2\2LM\7_\2\2M\22"+
		"\3\2\2\2NO\7\177\2\2O\24\3\2\2\2PQ\7?\2\2Q\26\3\2\2\2RS\7k\2\2ST\7h\2"+
		"\2T\30\3\2\2\2UV\7#\2\2V\32\3\2\2\2WX\7k\2\2XY\7p\2\2YZ\7v\2\2Z\34\3\2"+
		"\2\2[\\\7g\2\2\\]\7n\2\2]^\7u\2\2^_\7g\2\2_\36\3\2\2\2`a\7*\2\2a \3\2"+
		"\2\2bc\7+\2\2c\"\3\2\2\2de\7,\2\2e$\3\2\2\2fg\7-\2\2g&\3\2\2\2hi\7v\2"+
		"\2ij\7j\2\2jk\7g\2\2kl\7p\2\2l(\3\2\2\2mn\7.\2\2n*\3\2\2\2op\7/\2\2p,"+
		"\3\2\2\2qs\t\2\2\2rq\3\2\2\2st\3\2\2\2tr\3\2\2\2tu\3\2\2\2u.\3\2\2\2v"+
		"\177\7\62\2\2w{\t\3\2\2xz\t\4\2\2yx\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2"+
		"\2\2|\177\3\2\2\2}{\3\2\2\2~v\3\2\2\2~w\3\2\2\2\177\60\3\2\2\2\6\2t{~";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}