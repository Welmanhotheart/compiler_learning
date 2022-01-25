// Generated from R.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, NL=40, ID=41, INT=42, STRING=43;
	public static final int
		RULE_prog = 0, RULE_expr_or_assign = 1, RULE_expr = 2, RULE_formlist = 3, 
		RULE_form = 4, RULE_exprlist = 5, RULE_sublist = 6, RULE_sub = 7;
	public static final String[] ruleNames = {
		"prog", "expr_or_assign", "expr", "formlist", "form", "exprlist", "sublist", 
		"sub"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'<-'", "'='", "'<<-'", "'{'", "'}'", "'if'", "'('", "')'", 
		"'else'", "'for'", "'in'", "'while'", "'repeat'", "'?'", "'next'", "'break'", 
		"'[['", "']'", "'['", "'::'", "':::'", "'$'", "'@'", "'^'", "'-'", "'+'", 
		"':'", "'*'", "'/'", "'>'", "'>='", "'<'", "'<='", "'=='", "'!='", "'function'", 
		"','", "'NULL'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "NL", "ID", "INT", "STRING"
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

	@Override
	public String getGrammarFileName() { return "R.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(RParser.EOF, 0); }
		public List<Expr_or_assignContext> expr_or_assign() {
			return getRuleContexts(Expr_or_assignContext.class);
		}
		public Expr_or_assignContext expr_or_assign(int i) {
			return getRuleContext(Expr_or_assignContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(RParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(RParser.NL, i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RListener ) ((RListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RListener ) ((RListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__6) | (1L << T__10) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__25) | (1L << T__26) | (1L << T__36) | (1L << NL) | (1L << ID) | (1L << INT))) != 0)) {
				{
				setState(20);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__4:
				case T__6:
				case T__10:
				case T__12:
				case T__13:
				case T__14:
				case T__15:
				case T__16:
				case T__25:
				case T__26:
				case T__36:
				case ID:
				case INT:
					{
					setState(16);
					expr_or_assign();
					setState(17);
					_la = _input.LA(1);
					if ( !(_la==T__0 || _la==NL) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				case NL:
					{
					setState(19);
					match(NL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(24);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(25);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_or_assignContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr_or_assignContext expr_or_assign() {
			return getRuleContext(Expr_or_assignContext.class,0);
		}
		public Expr_or_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_or_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RListener ) ((RListener)listener).enterExpr_or_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RListener ) ((RListener)listener).exitExpr_or_assign(this);
		}
	}

	public final Expr_or_assignContext expr_or_assign() throws RecognitionException {
		Expr_or_assignContext _localctx = new Expr_or_assignContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expr_or_assign);
		int _la;
		try {
			setState(32);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(27);
				expr(0);
				setState(28);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(29);
				expr_or_assign();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(31);
				expr(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprlistContext exprlist() {
			return getRuleContext(ExprlistContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ID() { return getToken(RParser.ID, 0); }
		public FormlistContext formlist() {
			return getRuleContext(FormlistContext.class,0);
		}
		public TerminalNode INT() { return getToken(RParser.INT, 0); }
		public SublistContext sublist() {
			return getRuleContext(SublistContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RListener ) ((RListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RListener ) ((RListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(35);
				match(T__4);
				setState(36);
				exprlist();
				setState(37);
				match(T__5);
				}
				break;
			case 2:
				{
				setState(39);
				match(T__6);
				setState(40);
				match(T__7);
				setState(41);
				expr(0);
				setState(42);
				match(T__8);
				setState(43);
				expr(22);
				}
				break;
			case 3:
				{
				setState(45);
				match(T__6);
				setState(46);
				match(T__7);
				setState(47);
				expr(0);
				setState(48);
				match(T__8);
				setState(49);
				expr(0);
				setState(50);
				match(T__9);
				setState(51);
				expr(21);
				}
				break;
			case 4:
				{
				setState(53);
				match(T__10);
				setState(54);
				match(T__7);
				setState(55);
				match(ID);
				setState(56);
				match(T__11);
				setState(57);
				expr(0);
				setState(58);
				match(T__8);
				setState(59);
				expr(20);
				}
				break;
			case 5:
				{
				setState(61);
				match(T__12);
				setState(62);
				match(T__7);
				setState(63);
				expr(0);
				setState(64);
				match(T__8);
				setState(65);
				expr(19);
				}
				break;
			case 6:
				{
				setState(67);
				match(T__13);
				setState(68);
				expr(18);
				}
				break;
			case 7:
				{
				setState(69);
				match(T__14);
				setState(70);
				expr(17);
				}
				break;
			case 8:
				{
				setState(71);
				match(T__15);
				}
				break;
			case 9:
				{
				setState(72);
				match(T__16);
				}
				break;
			case 10:
				{
				setState(73);
				_la = _input.LA(1);
				if ( !(_la==T__25 || _la==T__26) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(74);
				expr(9);
				}
				break;
			case 11:
				{
				setState(75);
				match(T__36);
				setState(76);
				match(T__7);
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(77);
					formlist();
					}
				}

				setState(80);
				match(T__8);
				setState(81);
				expr(4);
				}
				break;
			case 12:
				{
				setState(82);
				match(ID);
				}
				break;
			case 13:
				{
				setState(83);
				match(INT);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(125);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(123);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(86);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(87);
						_la = _input.LA(1);
						if ( !(_la==T__20 || _la==T__21) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(88);
						expr(13);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(89);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(90);
						_la = _input.LA(1);
						if ( !(_la==T__22 || _la==T__23) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(91);
						expr(12);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(92);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(93);
						match(T__24);
						setState(94);
						expr(11);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(95);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(96);
						match(T__27);
						setState(97);
						expr(9);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(98);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(99);
						_la = _input.LA(1);
						if ( !(_la==T__28 || _la==T__29) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(100);
						expr(8);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(101);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(102);
						_la = _input.LA(1);
						if ( !(_la==T__25 || _la==T__26) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(103);
						expr(7);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(104);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(105);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(106);
						expr(6);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(107);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(108);
						match(T__17);
						setState(109);
						sublist();
						setState(110);
						match(T__18);
						setState(111);
						match(T__18);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(113);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(114);
						match(T__19);
						setState(115);
						sublist();
						setState(116);
						match(T__18);
						}
						break;
					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(118);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(119);
						match(T__7);
						setState(120);
						sublist();
						setState(121);
						match(T__8);
						}
						break;
					}
					} 
				}
				setState(127);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class FormlistContext extends ParserRuleContext {
		public List<FormContext> form() {
			return getRuleContexts(FormContext.class);
		}
		public FormContext form(int i) {
			return getRuleContext(FormContext.class,i);
		}
		public FormlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RListener ) ((RListener)listener).enterFormlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RListener ) ((RListener)listener).exitFormlist(this);
		}
	}

	public final FormlistContext formlist() throws RecognitionException {
		FormlistContext _localctx = new FormlistContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_formlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			form();
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__37) {
				{
				{
				setState(129);
				match(T__37);
				setState(130);
				form();
				}
				}
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(RParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FormContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_form; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RListener ) ((RListener)listener).enterForm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RListener ) ((RListener)listener).exitForm(this);
		}
	}

	public final FormContext form() throws RecognitionException {
		FormContext _localctx = new FormContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_form);
		try {
			setState(140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				match(ID);
				setState(138);
				match(T__2);
				setState(139);
				expr(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprlistContext extends ParserRuleContext {
		public List<Expr_or_assignContext> expr_or_assign() {
			return getRuleContexts(Expr_or_assignContext.class);
		}
		public Expr_or_assignContext expr_or_assign(int i) {
			return getRuleContext(Expr_or_assignContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(RParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(RParser.NL, i);
		}
		public ExprlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RListener ) ((RListener)listener).enterExprlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RListener ) ((RListener)listener).exitExprlist(this);
		}
	}

	public final ExprlistContext exprlist() throws RecognitionException {
		ExprlistContext _localctx = new ExprlistContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_exprlist);
		int _la;
		try {
			setState(153);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
			case T__6:
			case T__10:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__25:
			case T__26:
			case T__36:
			case ID:
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				expr_or_assign();
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0 || _la==NL) {
					{
					{
					setState(143);
					_la = _input.LA(1);
					if ( !(_la==T__0 || _la==NL) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(145);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__6) | (1L << T__10) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__25) | (1L << T__26) | (1L << T__36) | (1L << ID) | (1L << INT))) != 0)) {
						{
						setState(144);
						expr_or_assign();
						}
					}

					}
					}
					setState(151);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SublistContext extends ParserRuleContext {
		public List<SubContext> sub() {
			return getRuleContexts(SubContext.class);
		}
		public SubContext sub(int i) {
			return getRuleContext(SubContext.class,i);
		}
		public SublistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sublist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RListener ) ((RListener)listener).enterSublist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RListener ) ((RListener)listener).exitSublist(this);
		}
	}

	public final SublistContext sublist() throws RecognitionException {
		SublistContext _localctx = new SublistContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_sublist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			sub();
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__37) {
				{
				{
				setState(156);
				match(T__37);
				setState(157);
				sub();
				}
				}
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(RParser.ID, 0); }
		public TerminalNode STRING() { return getToken(RParser.STRING, 0); }
		public SubContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sub; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RListener ) ((RListener)listener).enterSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RListener ) ((RListener)listener).exitSub(this);
		}
	}

	public final SubContext sub() throws RecognitionException {
		SubContext _localctx = new SubContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_sub);
		try {
			setState(179);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(164);
				match(ID);
				setState(165);
				match(T__2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(166);
				match(ID);
				setState(167);
				match(T__2);
				setState(168);
				expr(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(169);
				match(STRING);
				setState(170);
				match(T__2);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(171);
				match(STRING);
				setState(172);
				match(T__2);
				setState(173);
				expr(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(174);
				match(T__38);
				setState(175);
				match(T__2);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(176);
				match(T__38);
				setState(177);
				match(T__2);
				setState(178);
				expr(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 12);
		case 1:
			return precpred(_ctx, 11);
		case 2:
			return precpred(_ctx, 10);
		case 3:
			return precpred(_ctx, 8);
		case 4:
			return precpred(_ctx, 7);
		case 5:
			return precpred(_ctx, 6);
		case 6:
			return precpred(_ctx, 5);
		case 7:
			return precpred(_ctx, 14);
		case 8:
			return precpred(_ctx, 13);
		case 9:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3-\u00b8\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\3\2"+
		"\7\2\27\n\2\f\2\16\2\32\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\5\3#\n\3\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4Q\n\4\3\4\3\4\3\4\3\4\5\4W\n\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\7\4~\n\4\f\4\16\4\u0081\13\4\3\5\3\5\3\5\7\5\u0086\n\5\f\5\16\5\u0089"+
		"\13\5\3\6\3\6\3\6\3\6\5\6\u008f\n\6\3\7\3\7\3\7\5\7\u0094\n\7\7\7\u0096"+
		"\n\7\f\7\16\7\u0099\13\7\3\7\5\7\u009c\n\7\3\b\3\b\3\b\7\b\u00a1\n\b\f"+
		"\b\16\b\u00a4\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\5\t\u00b6\n\t\3\t\2\3\6\n\2\4\6\b\n\f\16\20\2\t\4\2\3\3*"+
		"*\3\2\4\6\3\2\34\35\3\2\27\30\3\2\31\32\3\2\37 \3\2!&\2\u00d5\2\30\3\2"+
		"\2\2\4\"\3\2\2\2\6V\3\2\2\2\b\u0082\3\2\2\2\n\u008e\3\2\2\2\f\u009b\3"+
		"\2\2\2\16\u009d\3\2\2\2\20\u00b5\3\2\2\2\22\23\5\4\3\2\23\24\t\2\2\2\24"+
		"\27\3\2\2\2\25\27\7*\2\2\26\22\3\2\2\2\26\25\3\2\2\2\27\32\3\2\2\2\30"+
		"\26\3\2\2\2\30\31\3\2\2\2\31\33\3\2\2\2\32\30\3\2\2\2\33\34\7\2\2\3\34"+
		"\3\3\2\2\2\35\36\5\6\4\2\36\37\t\3\2\2\37 \5\4\3\2 #\3\2\2\2!#\5\6\4\2"+
		"\"\35\3\2\2\2\"!\3\2\2\2#\5\3\2\2\2$%\b\4\1\2%&\7\7\2\2&\'\5\f\7\2\'("+
		"\7\b\2\2(W\3\2\2\2)*\7\t\2\2*+\7\n\2\2+,\5\6\4\2,-\7\13\2\2-.\5\6\4\30"+
		".W\3\2\2\2/\60\7\t\2\2\60\61\7\n\2\2\61\62\5\6\4\2\62\63\7\13\2\2\63\64"+
		"\5\6\4\2\64\65\7\f\2\2\65\66\5\6\4\27\66W\3\2\2\2\678\7\r\2\289\7\n\2"+
		"\29:\7+\2\2:;\7\16\2\2;<\5\6\4\2<=\7\13\2\2=>\5\6\4\26>W\3\2\2\2?@\7\17"+
		"\2\2@A\7\n\2\2AB\5\6\4\2BC\7\13\2\2CD\5\6\4\25DW\3\2\2\2EF\7\20\2\2FW"+
		"\5\6\4\24GH\7\21\2\2HW\5\6\4\23IW\7\22\2\2JW\7\23\2\2KL\t\4\2\2LW\5\6"+
		"\4\13MN\7\'\2\2NP\7\n\2\2OQ\5\b\5\2PO\3\2\2\2PQ\3\2\2\2QR\3\2\2\2RS\7"+
		"\13\2\2SW\5\6\4\6TW\7+\2\2UW\7,\2\2V$\3\2\2\2V)\3\2\2\2V/\3\2\2\2V\67"+
		"\3\2\2\2V?\3\2\2\2VE\3\2\2\2VG\3\2\2\2VI\3\2\2\2VJ\3\2\2\2VK\3\2\2\2V"+
		"M\3\2\2\2VT\3\2\2\2VU\3\2\2\2W\177\3\2\2\2XY\f\16\2\2YZ\t\5\2\2Z~\5\6"+
		"\4\17[\\\f\r\2\2\\]\t\6\2\2]~\5\6\4\16^_\f\f\2\2_`\7\33\2\2`~\5\6\4\r"+
		"ab\f\n\2\2bc\7\36\2\2c~\5\6\4\13de\f\t\2\2ef\t\7\2\2f~\5\6\4\ngh\f\b\2"+
		"\2hi\t\4\2\2i~\5\6\4\tjk\f\7\2\2kl\t\b\2\2l~\5\6\4\bmn\f\20\2\2no\7\24"+
		"\2\2op\5\16\b\2pq\7\25\2\2qr\7\25\2\2r~\3\2\2\2st\f\17\2\2tu\7\26\2\2"+
		"uv\5\16\b\2vw\7\25\2\2w~\3\2\2\2xy\f\5\2\2yz\7\n\2\2z{\5\16\b\2{|\7\13"+
		"\2\2|~\3\2\2\2}X\3\2\2\2}[\3\2\2\2}^\3\2\2\2}a\3\2\2\2}d\3\2\2\2}g\3\2"+
		"\2\2}j\3\2\2\2}m\3\2\2\2}s\3\2\2\2}x\3\2\2\2~\u0081\3\2\2\2\177}\3\2\2"+
		"\2\177\u0080\3\2\2\2\u0080\7\3\2\2\2\u0081\177\3\2\2\2\u0082\u0087\5\n"+
		"\6\2\u0083\u0084\7(\2\2\u0084\u0086\5\n\6\2\u0085\u0083\3\2\2\2\u0086"+
		"\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\t\3\2\2\2"+
		"\u0089\u0087\3\2\2\2\u008a\u008f\7+\2\2\u008b\u008c\7+\2\2\u008c\u008d"+
		"\7\5\2\2\u008d\u008f\5\6\4\2\u008e\u008a\3\2\2\2\u008e\u008b\3\2\2\2\u008f"+
		"\13\3\2\2\2\u0090\u0097\5\4\3\2\u0091\u0093\t\2\2\2\u0092\u0094\5\4\3"+
		"\2\u0093\u0092\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0096\3\2\2\2\u0095\u0091"+
		"\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098"+
		"\u009c\3\2\2\2\u0099\u0097\3\2\2\2\u009a\u009c\3\2\2\2\u009b\u0090\3\2"+
		"\2\2\u009b\u009a\3\2\2\2\u009c\r\3\2\2\2\u009d\u00a2\5\20\t\2\u009e\u009f"+
		"\7(\2\2\u009f\u00a1\5\20\t\2\u00a0\u009e\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2"+
		"\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\17\3\2\2\2\u00a4\u00a2\3\2\2"+
		"\2\u00a5\u00b6\5\6\4\2\u00a6\u00a7\7+\2\2\u00a7\u00b6\7\5\2\2\u00a8\u00a9"+
		"\7+\2\2\u00a9\u00aa\7\5\2\2\u00aa\u00b6\5\6\4\2\u00ab\u00ac\7-\2\2\u00ac"+
		"\u00b6\7\5\2\2\u00ad\u00ae\7-\2\2\u00ae\u00af\7\5\2\2\u00af\u00b6\5\6"+
		"\4\2\u00b0\u00b1\7)\2\2\u00b1\u00b6\7\5\2\2\u00b2\u00b3\7)\2\2\u00b3\u00b4"+
		"\7\5\2\2\u00b4\u00b6\5\6\4\2\u00b5\u00a5\3\2\2\2\u00b5\u00a6\3\2\2\2\u00b5"+
		"\u00a8\3\2\2\2\u00b5\u00ab\3\2\2\2\u00b5\u00ad\3\2\2\2\u00b5\u00b0\3\2"+
		"\2\2\u00b5\u00b2\3\2\2\2\u00b6\21\3\2\2\2\20\26\30\"PV}\177\u0087\u008e"+
		"\u0093\u0097\u009b\u00a2\u00b5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}