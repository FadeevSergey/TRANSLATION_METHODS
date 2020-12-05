// Generated from /Users/Fadeev/Desktop/github/translatorToC/src/Expression.g4 by ANTLR 4.8

    import TreeNodes.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExpressionParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FOR=1, WHILE=2, IN=3, RANGE=4, COLON=5, IF=6, ELSE=7, CLB_TOKEN=8, CRB_TOKEN=9, 
		RLB_TOKEN=10, RRB_TOKEN=11, NOT_TOKEN=12, OR_TOKEN=13, NEW_LINE=14, VAR_TOKEN=15, 
		WHITE_SPACE=16, LOG_CONDITION=17;
	public static final int
		RULE_program = 0, RULE_structsBlock = 1, RULE_funcsBlock = 2, RULE_mainBlock = 3, 
		RULE_mainSubBlock = 4, RULE_forBlock = 5, RULE_whileBlock = 6, RULE_ifBlock = 7, 
		RULE_justIf = 8, RULE_ifElse = 9, RULE_range = 10, RULE_variable = 11, 
		RULE_condition = 12, RULE_newLine = 13, RULE_maybeNewLine = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "structsBlock", "funcsBlock", "mainBlock", "mainSubBlock", 
			"forBlock", "whileBlock", "ifBlock", "justIf", "ifElse", "range", "variable", 
			"condition", "newLine", "maybeNewLine"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'for'", "'while'", "'in'", "'range'", "'..'", "'if'", "'else'", 
			"'{'", "'}'", "'('", "')'", "'!'", "'|'", "'\n'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "FOR", "WHILE", "IN", "RANGE", "COLON", "IF", "ELSE", "CLB_TOKEN", 
			"CRB_TOKEN", "RLB_TOKEN", "RRB_TOKEN", "NOT_TOKEN", "OR_TOKEN", "NEW_LINE", 
			"VAR_TOKEN", "WHITE_SPACE", "LOG_CONDITION"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "Expression.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExpressionParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public Node node;
		public StructsBlockContext structs;
		public FuncsBlockContext funcs;
		public MainBlockContext main;
		public StructsBlockContext structsBlock() {
			return getRuleContext(StructsBlockContext.class,0);
		}
		public FuncsBlockContext funcsBlock() {
			return getRuleContext(FuncsBlockContext.class,0);
		}
		public MainBlockContext mainBlock() {
			return getRuleContext(MainBlockContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			((ProgramContext)_localctx).structs = structsBlock();
			setState(31);
			((ProgramContext)_localctx).funcs = funcsBlock();
			setState(32);
			((ProgramContext)_localctx).main = mainBlock();
			_localctx.node=new Program(((ProgramContext)_localctx).structs.node, ((ProgramContext)_localctx).funcs.node, ((ProgramContext)_localctx).main.node)
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

	public static class StructsBlockContext extends ParserRuleContext {
		public Node node;
		public StructsBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structsBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterStructsBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitStructsBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitStructsBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructsBlockContext structsBlock() throws RecognitionException {
		StructsBlockContext _localctx = new StructsBlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_structsBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	public static class FuncsBlockContext extends ParserRuleContext {
		public Node node;
		public FuncsBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcsBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterFuncsBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitFuncsBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitFuncsBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncsBlockContext funcsBlock() throws RecognitionException {
		FuncsBlockContext _localctx = new FuncsBlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_funcsBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	public static class MainBlockContext extends ParserRuleContext {
		public Node node;
		public MainSubBlockContext subBlock;
		public MainBlockContext mainTail;
		public List<MaybeNewLineContext> maybeNewLine() {
			return getRuleContexts(MaybeNewLineContext.class);
		}
		public MaybeNewLineContext maybeNewLine(int i) {
			return getRuleContext(MaybeNewLineContext.class,i);
		}
		public MainSubBlockContext mainSubBlock() {
			return getRuleContext(MainSubBlockContext.class,0);
		}
		public MainBlockContext mainBlock() {
			return getRuleContext(MainBlockContext.class,0);
		}
		public MainBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterMainBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitMainBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitMainBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainBlockContext mainBlock() throws RecognitionException {
		MainBlockContext _localctx = new MainBlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_mainBlock);
		try {
			setState(46);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(39);
				maybeNewLine();
				setState(40);
				((MainBlockContext)_localctx).subBlock = mainSubBlock();
				setState(41);
				((MainBlockContext)_localctx).mainTail = mainBlock();
				setState(42);
				maybeNewLine();
				_localctx.node=((MainBlockContext)_localctx).subBlock.node
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class MainSubBlockContext extends ParserRuleContext {
		public Node node;
		public ForBlockContext for;
		public WhileBlockContext while;
		public IfBlockContext if;
		public List<MaybeNewLineContext> maybeNewLine() {
			return getRuleContexts(MaybeNewLineContext.class);
		}
		public MaybeNewLineContext maybeNewLine(int i) {
			return getRuleContext(MaybeNewLineContext.class,i);
		}
		public ForBlockContext forBlock() {
			return getRuleContext(ForBlockContext.class,0);
		}
		public WhileBlockContext whileBlock() {
			return getRuleContext(WhileBlockContext.class,0);
		}
		public IfBlockContext ifBlock() {
			return getRuleContext(IfBlockContext.class,0);
		}
		public MainSubBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainSubBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterMainSubBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitMainSubBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitMainSubBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainSubBlockContext mainSubBlock() throws RecognitionException {
		MainSubBlockContext _localctx = new MainSubBlockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_mainSubBlock);
		try {
			setState(63);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				maybeNewLine();
				setState(49);
				((MainSubBlockContext)_localctx).for = forBlock();
				setState(50);
				maybeNewLine();
				_localctx.node=((MainSubBlockContext)_localctx).for.node
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(53);
				maybeNewLine();
				setState(54);
				((MainSubBlockContext)_localctx).while = whileBlock();
				setState(55);
				maybeNewLine();
				_localctx.node=((MainSubBlockContext)_localctx).while.node
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(58);
				maybeNewLine();
				setState(59);
				((MainSubBlockContext)_localctx).if = ifBlock();
				setState(60);
				maybeNewLine();
				_localctx.node=((MainSubBlockContext)_localctx).if.node
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

	public static class ForBlockContext extends ParserRuleContext {
		public Node node;
		public VariableContext var;
		public RangeContext rng;
		public MainBlockContext main;
		public TerminalNode FOR() { return getToken(ExpressionParser.FOR, 0); }
		public List<TerminalNode> WHITE_SPACE() { return getTokens(ExpressionParser.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(ExpressionParser.WHITE_SPACE, i);
		}
		public TerminalNode IN() { return getToken(ExpressionParser.IN, 0); }
		public TerminalNode RANGE() { return getToken(ExpressionParser.RANGE, 0); }
		public MaybeNewLineContext maybeNewLine() {
			return getRuleContext(MaybeNewLineContext.class,0);
		}
		public TerminalNode CLB_TOKEN() { return getToken(ExpressionParser.CLB_TOKEN, 0); }
		public TerminalNode CRB_TOKEN() { return getToken(ExpressionParser.CRB_TOKEN, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public RangeContext range() {
			return getRuleContext(RangeContext.class,0);
		}
		public MainBlockContext mainBlock() {
			return getRuleContext(MainBlockContext.class,0);
		}
		public ForBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterForBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitForBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitForBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForBlockContext forBlock() throws RecognitionException {
		ForBlockContext _localctx = new ForBlockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_forBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(FOR);
			setState(66);
			match(WHITE_SPACE);
			setState(67);
			((ForBlockContext)_localctx).var = variable();
			setState(68);
			match(WHITE_SPACE);
			setState(69);
			match(IN);
			setState(70);
			match(WHITE_SPACE);
			setState(71);
			match(RANGE);
			setState(72);
			match(WHITE_SPACE);
			setState(73);
			((ForBlockContext)_localctx).rng = range();
			setState(74);
			maybeNewLine();
			setState(75);
			match(CLB_TOKEN);
			setState(76);
			((ForBlockContext)_localctx).main = mainBlock();
			setState(77);
			match(CRB_TOKEN);
			((ForBlockContext)_localctx).node =  new ForBlock(((ForBlockContext)_localctx).var.node, ((ForBlockContext)_localctx).rng.node, ((ForBlockContext)_localctx).main.node);
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

	public static class WhileBlockContext extends ParserRuleContext {
		public Node node;
		public ConditionContext cnd;
		public MainBlockContext main;
		public TerminalNode WHILE() { return getToken(ExpressionParser.WHILE, 0); }
		public TerminalNode WHITE_SPACE() { return getToken(ExpressionParser.WHITE_SPACE, 0); }
		public MaybeNewLineContext maybeNewLine() {
			return getRuleContext(MaybeNewLineContext.class,0);
		}
		public TerminalNode CLB_TOKEN() { return getToken(ExpressionParser.CLB_TOKEN, 0); }
		public TerminalNode CRB_TOKEN() { return getToken(ExpressionParser.CRB_TOKEN, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public MainBlockContext mainBlock() {
			return getRuleContext(MainBlockContext.class,0);
		}
		public WhileBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterWhileBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitWhileBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitWhileBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileBlockContext whileBlock() throws RecognitionException {
		WhileBlockContext _localctx = new WhileBlockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_whileBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(WHILE);
			setState(81);
			match(WHITE_SPACE);
			setState(82);
			((WhileBlockContext)_localctx).cnd = condition();
			setState(83);
			maybeNewLine();
			setState(84);
			match(CLB_TOKEN);
			setState(85);
			((WhileBlockContext)_localctx).main = mainBlock();
			setState(86);
			match(CRB_TOKEN);
			_localctx.node=new WhileBlock(((WhileBlockContext)_localctx).cnd.node, ((WhileBlockContext)_localctx).main.node)
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

	public static class IfBlockContext extends ParserRuleContext {
		public Node node;
		public JustIfContext if;
		public IfElseContext ifAndElse;
		public IfElseContext ifElse;
		public List<MaybeNewLineContext> maybeNewLine() {
			return getRuleContexts(MaybeNewLineContext.class);
		}
		public MaybeNewLineContext maybeNewLine(int i) {
			return getRuleContext(MaybeNewLineContext.class,i);
		}
		public JustIfContext justIf() {
			return getRuleContext(JustIfContext.class,0);
		}
		public IfElseContext ifElse() {
			return getRuleContext(IfElseContext.class,0);
		}
		public IfBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterIfBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitIfBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitIfBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfBlockContext ifBlock() throws RecognitionException {
		IfBlockContext _localctx = new IfBlockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ifBlock);
		try {
			setState(99);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				maybeNewLine();
				setState(90);
				((IfBlockContext)_localctx).if = justIf();
				setState(91);
				maybeNewLine();
				_localctx.node=new JustIf(((IfBlockContext)_localctx).if.node)
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				maybeNewLine();
				setState(95);
				((IfBlockContext)_localctx).ifAndElse = ((IfBlockContext)_localctx).ifElse = ifElse();
				setState(96);
				maybeNewLine();
				_localctx.node=new IfAndElse(((IfBlockContext)_localctx).ifElse.node)
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

	public static class JustIfContext extends ParserRuleContext {
		public JustIf node;
		public ConditionContext cnd;
		public MainBlockContext body;
		public TerminalNode IF() { return getToken(ExpressionParser.IF, 0); }
		public TerminalNode WHITE_SPACE() { return getToken(ExpressionParser.WHITE_SPACE, 0); }
		public List<MaybeNewLineContext> maybeNewLine() {
			return getRuleContexts(MaybeNewLineContext.class);
		}
		public MaybeNewLineContext maybeNewLine(int i) {
			return getRuleContext(MaybeNewLineContext.class,i);
		}
		public TerminalNode CLB_TOKEN() { return getToken(ExpressionParser.CLB_TOKEN, 0); }
		public TerminalNode CRB_TOKEN() { return getToken(ExpressionParser.CRB_TOKEN, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public MainBlockContext mainBlock() {
			return getRuleContext(MainBlockContext.class,0);
		}
		public JustIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_justIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterJustIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitJustIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitJustIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JustIfContext justIf() throws RecognitionException {
		JustIfContext _localctx = new JustIfContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_justIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(IF);
			setState(102);
			match(WHITE_SPACE);
			setState(103);
			((JustIfContext)_localctx).cnd = condition();
			setState(104);
			maybeNewLine();
			setState(105);
			match(CLB_TOKEN);
			setState(106);
			((JustIfContext)_localctx).body = mainBlock();
			setState(107);
			match(CRB_TOKEN);
			setState(108);
			maybeNewLine();
			_localctx.node=new JustIf(((JustIfContext)_localctx).cnd.node, ((JustIfContext)_localctx).body.node)
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

	public static class IfElseContext extends ParserRuleContext {
		public Node node;
		public JustIfContext if;
		public MainBlockContext body;
		public TerminalNode ELSE() { return getToken(ExpressionParser.ELSE, 0); }
		public MaybeNewLineContext maybeNewLine() {
			return getRuleContext(MaybeNewLineContext.class,0);
		}
		public TerminalNode CLB_TOKEN() { return getToken(ExpressionParser.CLB_TOKEN, 0); }
		public TerminalNode CRB_TOKEN() { return getToken(ExpressionParser.CRB_TOKEN, 0); }
		public JustIfContext justIf() {
			return getRuleContext(JustIfContext.class,0);
		}
		public MainBlockContext mainBlock() {
			return getRuleContext(MainBlockContext.class,0);
		}
		public IfElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifElse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterIfElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitIfElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitIfElse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfElseContext ifElse() throws RecognitionException {
		IfElseContext _localctx = new IfElseContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ifElse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			((IfElseContext)_localctx).if = justIf();
			setState(112);
			match(ELSE);
			setState(113);
			maybeNewLine();
			setState(114);
			match(CLB_TOKEN);
			setState(115);
			((IfElseContext)_localctx).body = mainBlock();
			setState(116);
			match(CRB_TOKEN);
			_localctx.node=new EfElseBlock(((IfElseContext)_localctx).if.node.getCondition(), ((IfElseContext)_localctx).if.node.body(), ((IfElseContext)_localctx).body.node)
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

	public static class RangeContext extends ParserRuleContext {
		public Node node;
		public VariableContext leftVar;
		public VariableContext rightVar;
		public TerminalNode RLB_TOKEN() { return getToken(ExpressionParser.RLB_TOKEN, 0); }
		public TerminalNode COLON() { return getToken(ExpressionParser.COLON, 0); }
		public TerminalNode RRB_TOKEN() { return getToken(ExpressionParser.RRB_TOKEN, 0); }
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public RangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitRange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitRange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeContext range() throws RecognitionException {
		RangeContext _localctx = new RangeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_range);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(RLB_TOKEN);
			setState(120);
			((RangeContext)_localctx).leftVar = variable();
			setState(121);
			match(COLON);
			setState(122);
			((RangeContext)_localctx).rightVar = variable();
			setState(123);
			match(RRB_TOKEN);
			_localctx.node=new range(((RangeContext)_localctx).leftVar.node, ((RangeContext)_localctx).rightVar.node)
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

	public static class VariableContext extends ParserRuleContext {
		public Node node;
		public Token VAR_TOKEN;
		public TerminalNode VAR_TOKEN() { return getToken(ExpressionParser.VAR_TOKEN, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			((VariableContext)_localctx).VAR_TOKEN = match(VAR_TOKEN);
			((VariableContext)_localctx).node =  new Var((((VariableContext)_localctx).VAR_TOKEN!=null?((VariableContext)_localctx).VAR_TOKEN.getText():null));
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

	public static class ConditionContext extends ParserRuleContext {
		public Node node;
		public Token LOG_CONDITION;
		public TerminalNode LOG_CONDITION() { return getToken(ExpressionParser.LOG_CONDITION, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			((ConditionContext)_localctx).LOG_CONDITION = match(LOG_CONDITION);
			((ConditionContext)_localctx).node =  new Condition((((ConditionContext)_localctx).LOG_CONDITION!=null?((ConditionContext)_localctx).LOG_CONDITION.getText():null));
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

	public static class NewLineContext extends ParserRuleContext {
		public TerminalNode NEW_LINE() { return getToken(ExpressionParser.NEW_LINE, 0); }
		public NewLineContext newLine() {
			return getRuleContext(NewLineContext.class,0);
		}
		public TerminalNode WHITE_SPACE() { return getToken(ExpressionParser.WHITE_SPACE, 0); }
		public NewLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterNewLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitNewLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitNewLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewLineContext newLine() throws RecognitionException {
		return newLine(0);
	}

	private NewLineContext newLine(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NewLineContext _localctx = new NewLineContext(_ctx, _parentState);
		NewLineContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_newLine, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				}
				break;
			case 2:
				{
				setState(133);
				match(NEW_LINE);
				}
				break;
			case 3:
				{
				setState(134);
				match(NEW_LINE);
				setState(135);
				newLine(3);
				}
				break;
			case 4:
				{
				setState(136);
				match(WHITE_SPACE);
				setState(137);
				newLine(2);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(144);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new NewLineContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_newLine);
					setState(140);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(141);
					match(WHITE_SPACE);
					}
					} 
				}
				setState(146);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class MaybeNewLineContext extends ParserRuleContext {
		public NewLineContext newLine() {
			return getRuleContext(NewLineContext.class,0);
		}
		public MaybeNewLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_maybeNewLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterMaybeNewLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitMaybeNewLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitMaybeNewLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MaybeNewLineContext maybeNewLine() throws RecognitionException {
		MaybeNewLineContext _localctx = new MaybeNewLineContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_maybeNewLine);
		try {
			setState(149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				newLine(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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
		case 13:
			return newLine_sempred((NewLineContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean newLine_sempred(NewLineContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\23\u009a\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\2\3"+
		"\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\61\n\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6B\n\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tf\n\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\5\17\u008d\n\17\3\17\3\17\7\17\u0091\n\17\f\17\16"+
		"\17\u0094\13\17\3\20\3\20\5\20\u0098\n\20\3\20\2\3\34\21\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36\2\2\2\u0093\2 \3\2\2\2\4%\3\2\2\2\6\'\3\2\2\2"+
		"\b\60\3\2\2\2\nA\3\2\2\2\fC\3\2\2\2\16R\3\2\2\2\20e\3\2\2\2\22g\3\2\2"+
		"\2\24q\3\2\2\2\26y\3\2\2\2\30\u0080\3\2\2\2\32\u0083\3\2\2\2\34\u008c"+
		"\3\2\2\2\36\u0097\3\2\2\2 !\5\4\3\2!\"\5\6\4\2\"#\5\b\5\2#$\b\2\1\2$\3"+
		"\3\2\2\2%&\3\2\2\2&\5\3\2\2\2\'(\3\2\2\2(\7\3\2\2\2)*\5\36\20\2*+\5\n"+
		"\6\2+,\5\b\5\2,-\5\36\20\2-.\b\5\1\2.\61\3\2\2\2/\61\3\2\2\2\60)\3\2\2"+
		"\2\60/\3\2\2\2\61\t\3\2\2\2\62\63\5\36\20\2\63\64\5\f\7\2\64\65\5\36\20"+
		"\2\65\66\b\6\1\2\66B\3\2\2\2\678\5\36\20\289\5\16\b\29:\5\36\20\2:;\b"+
		"\6\1\2;B\3\2\2\2<=\5\36\20\2=>\5\20\t\2>?\5\36\20\2?@\b\6\1\2@B\3\2\2"+
		"\2A\62\3\2\2\2A\67\3\2\2\2A<\3\2\2\2B\13\3\2\2\2CD\7\3\2\2DE\7\22\2\2"+
		"EF\5\30\r\2FG\7\22\2\2GH\7\5\2\2HI\7\22\2\2IJ\7\6\2\2JK\7\22\2\2KL\5\26"+
		"\f\2LM\5\36\20\2MN\7\n\2\2NO\5\b\5\2OP\7\13\2\2PQ\b\7\1\2Q\r\3\2\2\2R"+
		"S\7\4\2\2ST\7\22\2\2TU\5\32\16\2UV\5\36\20\2VW\7\n\2\2WX\5\b\5\2XY\7\13"+
		"\2\2YZ\b\b\1\2Z\17\3\2\2\2[\\\5\36\20\2\\]\5\22\n\2]^\5\36\20\2^_\b\t"+
		"\1\2_f\3\2\2\2`a\5\36\20\2ab\5\24\13\2bc\5\36\20\2cd\b\t\1\2df\3\2\2\2"+
		"e[\3\2\2\2e`\3\2\2\2f\21\3\2\2\2gh\7\b\2\2hi\7\22\2\2ij\5\32\16\2jk\5"+
		"\36\20\2kl\7\n\2\2lm\5\b\5\2mn\7\13\2\2no\5\36\20\2op\b\n\1\2p\23\3\2"+
		"\2\2qr\5\22\n\2rs\7\t\2\2st\5\36\20\2tu\7\n\2\2uv\5\b\5\2vw\7\13\2\2w"+
		"x\b\13\1\2x\25\3\2\2\2yz\7\f\2\2z{\5\30\r\2{|\7\7\2\2|}\5\30\r\2}~\7\r"+
		"\2\2~\177\b\f\1\2\177\27\3\2\2\2\u0080\u0081\7\21\2\2\u0081\u0082\b\r"+
		"\1\2\u0082\31\3\2\2\2\u0083\u0084\7\23\2\2\u0084\u0085\b\16\1\2\u0085"+
		"\33\3\2\2\2\u0086\u008d\b\17\1\2\u0087\u008d\7\20\2\2\u0088\u0089\7\20"+
		"\2\2\u0089\u008d\5\34\17\5\u008a\u008b\7\22\2\2\u008b\u008d\5\34\17\4"+
		"\u008c\u0086\3\2\2\2\u008c\u0087\3\2\2\2\u008c\u0088\3\2\2\2\u008c\u008a"+
		"\3\2\2\2\u008d\u0092\3\2\2\2\u008e\u008f\f\3\2\2\u008f\u0091\7\22\2\2"+
		"\u0090\u008e\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093"+
		"\3\2\2\2\u0093\35\3\2\2\2\u0094\u0092\3\2\2\2\u0095\u0098\5\34\17\2\u0096"+
		"\u0098\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0096\3\2\2\2\u0098\37\3\2\2"+
		"\2\b\60Ae\u008c\u0092\u0097";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}