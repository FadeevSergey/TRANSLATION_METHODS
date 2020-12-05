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
		INT_TYPE=1, DOUBLE_TYPE=2, CHAR_TYPE=3, BOOL_TYPE=4, READ_INT_TYPE=5, 
		READ_DOUBLE_TYPE=6, READ_CHAR_TYPE=7, READ_BOOL_TYPE=8, PRINT_TOKEN=9, 
		READ_TOKEN=10, VAR_TOKEN=11, LET_TOKEN=12, EQ_TOKEN=13, WHILE=14, FOR=15, 
		IN=16, RANGE=17, COLON_G_TOKEN=18, COLON_V_TOKEN=19, IF=20, ELSE=21, RLB_TOKEN=22, 
		RRB_TOKEN=23, CLB_TOKEN=24, CRB_TOKEN=25, AND_TOKEN=26, OR_TOKEN=27, NOT_TOKEN=28, 
		TRUE_TOKEN=29, FALSE_TOKEN=30, PLUS_TOKEN=31, MINUS_TOKEN=32, MUL_TOKEN=33, 
		DIV_TOKEN=34, MOD_TOKEN=35, GT_TOKEN=36, GE_TOKEN=37, LT_TOKEN=38, LE_TOKEN=39, 
		EQ_LOG_TOKEN=40, NOT_EQ_TOKEN=41, DECIMAL=42, VARIABLE_TOKEN=43, NEW_LINE=44, 
		WHITE_SPACE=45;
	public static final int
		RULE_program = 0, RULE_mainBlock = 1, RULE_mainSubBlock = 2, RULE_print = 3, 
		RULE_newVar = 4, RULE_equating = 5, RULE_eqRight = 6, RULE_forBlock = 7, 
		RULE_whileBlock = 8, RULE_ifBlock = 9, RULE_justIf = 10, RULE_ifElse = 11, 
		RULE_range = 12, RULE_variable = 13, RULE_newLine = 14, RULE_maybeNewLine = 15, 
		RULE_mathExpression = 16, RULE_logExpression = 17, RULE_readVar = 18, 
		RULE_constOrVar = 19, RULE_mathOperators = 20, RULE_comparator = 21, RULE_type = 22, 
		RULE_binary = 23, RULE_bool = 24;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "mainBlock", "mainSubBlock", "print", "newVar", "equating", 
			"eqRight", "forBlock", "whileBlock", "ifBlock", "justIf", "ifElse", "range", 
			"variable", "newLine", "maybeNewLine", "mathExpression", "logExpression", 
			"readVar", "constOrVar", "mathOperators", "comparator", "type", "binary", 
			"bool"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Int'", "'Double'", "'Char'", "'Bool'", "'readInt'", "'readDouble'", 
			"'readChar'", "'readBool'", "'print'", "'read'", "'var'", "'let'", "'='", 
			"'while'", "'for'", "'in'", "'range'", "'..'", "':'", "'if'", "'else'", 
			"'('", "')'", "'{'", "'}'", "'&&'", "'||'", "'!'", "'true'", "'false'", 
			"'+'", "'-'", "'*'", "'/'", "'%'", "'>'", "'>='", "'<'", "'<='", "'=='", 
			"'!='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT_TYPE", "DOUBLE_TYPE", "CHAR_TYPE", "BOOL_TYPE", "READ_INT_TYPE", 
			"READ_DOUBLE_TYPE", "READ_CHAR_TYPE", "READ_BOOL_TYPE", "PRINT_TOKEN", 
			"READ_TOKEN", "VAR_TOKEN", "LET_TOKEN", "EQ_TOKEN", "WHILE", "FOR", "IN", 
			"RANGE", "COLON_G_TOKEN", "COLON_V_TOKEN", "IF", "ELSE", "RLB_TOKEN", 
			"RRB_TOKEN", "CLB_TOKEN", "CRB_TOKEN", "AND_TOKEN", "OR_TOKEN", "NOT_TOKEN", 
			"TRUE_TOKEN", "FALSE_TOKEN", "PLUS_TOKEN", "MINUS_TOKEN", "MUL_TOKEN", 
			"DIV_TOKEN", "MOD_TOKEN", "GT_TOKEN", "GE_TOKEN", "LT_TOKEN", "LE_TOKEN", 
			"EQ_LOG_TOKEN", "NOT_EQ_TOKEN", "DECIMAL", "VARIABLE_TOKEN", "NEW_LINE", 
			"WHITE_SPACE"
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
		public Program node;
		public MainBlockContext main;
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
			setState(50);
			((ProgramContext)_localctx).main = mainBlock();
			_localctx.node=new Program(((ProgramContext)_localctx).main.main)
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
		public MainBlock main;
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
		enterRule(_localctx, 2, RULE_mainBlock);
		try {
			setState(63);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				maybeNewLine();
				setState(55);
				((MainBlockContext)_localctx).subBlock = mainSubBlock();
				setState(56);
				((MainBlockContext)_localctx).mainTail = mainBlock();
				setState(57);
				maybeNewLine();

				            _localctx.main=new MainBlock(((MainBlockContext)_localctx).subBlock.block, ((MainBlockContext)_localctx).mainTail.main)
				        
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(60);
				maybeNewLine();

				            _localctx.main=null
				        
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
		public Node block;
		public ForBlockContext forBlc;
		public WhileBlockContext whileBlc;
		public IfBlockContext ifBlc;
		public EquatingContext eqBlc;
		public NewVarContext newBlc;
		public NewVarContext newVar;
		public PrintContext pntBlc;
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
		public EquatingContext equating() {
			return getRuleContext(EquatingContext.class,0);
		}
		public NewVarContext newVar() {
			return getRuleContext(NewVarContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
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
		enterRule(_localctx, 4, RULE_mainSubBlock);
		try {
			setState(95);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				maybeNewLine();
				setState(66);
				((MainSubBlockContext)_localctx).forBlc = forBlock();
				setState(67);
				maybeNewLine();
				_localctx.block=((MainSubBlockContext)_localctx).forBlc.for
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				maybeNewLine();
				setState(71);
				((MainSubBlockContext)_localctx).whileBlc = whileBlock();
				setState(72);
				maybeNewLine();
				_localctx.block=((MainSubBlockContext)_localctx).whileBlc.node
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(75);
				maybeNewLine();
				setState(76);
				((MainSubBlockContext)_localctx).ifBlc = ifBlock();
				setState(77);
				maybeNewLine();
				_localctx.block=((MainSubBlockContext)_localctx).ifBlc.node
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(80);
				maybeNewLine();
				setState(81);
				((MainSubBlockContext)_localctx).eqBlc = equating();
				setState(82);
				maybeNewLine();
				_localctx.block=null
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(85);
				maybeNewLine();
				setState(86);
				((MainSubBlockContext)_localctx).newBlc = ((MainSubBlockContext)_localctx).newVar = newVar();
				setState(87);
				maybeNewLine();
				_localctx.block=((MainSubBlockContext)_localctx).newVar.expr
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(90);
				maybeNewLine();
				setState(91);
				((MainSubBlockContext)_localctx).pntBlc = print();
				setState(92);
				maybeNewLine();
				_localctx.block=((MainSubBlockContext)_localctx).pntBlc.pnt
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

	public static class PrintContext extends ParserRuleContext {
		public Print pnt;
		public VariableContext vr;
		public TerminalNode PRINT_TOKEN() { return getToken(ExpressionParser.PRINT_TOKEN, 0); }
		public TerminalNode RLB_TOKEN() { return getToken(ExpressionParser.RLB_TOKEN, 0); }
		public TerminalNode RRB_TOKEN() { return getToken(ExpressionParser.RRB_TOKEN, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(PRINT_TOKEN);
			setState(98);
			match(RLB_TOKEN);
			setState(99);
			((PrintContext)_localctx).vr = variable();
			setState(100);
			match(RRB_TOKEN);
			_localctx.pnt=new Print(((PrintContext)_localctx).vr.var)
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

	public static class NewVarContext extends ParserRuleContext {
		public NewVar expr;
		public ConstOrVarContext mut;
		public VariableContext var;
		public TypeContext t;
		public EqRightContext right;
		public List<TerminalNode> WHITE_SPACE() { return getTokens(ExpressionParser.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(ExpressionParser.WHITE_SPACE, i);
		}
		public TerminalNode COLON_V_TOKEN() { return getToken(ExpressionParser.COLON_V_TOKEN, 0); }
		public TerminalNode EQ_TOKEN() { return getToken(ExpressionParser.EQ_TOKEN, 0); }
		public ConstOrVarContext constOrVar() {
			return getRuleContext(ConstOrVarContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public EqRightContext eqRight() {
			return getRuleContext(EqRightContext.class,0);
		}
		public NewVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterNewVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitNewVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitNewVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewVarContext newVar() throws RecognitionException {
		NewVarContext _localctx = new NewVarContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_newVar);
		int _la;
		try {
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(103);
				((NewVarContext)_localctx).mut = constOrVar();
				setState(104);
				match(WHITE_SPACE);
				setState(105);
				((NewVarContext)_localctx).var = variable();
				setState(106);
				match(COLON_V_TOKEN);
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITE_SPACE) {
					{
					{
					setState(107);
					match(WHITE_SPACE);
					}
					}
					setState(112);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(113);
				((NewVarContext)_localctx).t = type();
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITE_SPACE) {
					{
					{
					setState(114);
					match(WHITE_SPACE);
					}
					}
					setState(119);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(120);
				match(EQ_TOKEN);
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITE_SPACE) {
					{
					{
					setState(121);
					match(WHITE_SPACE);
					}
					}
					setState(126);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(127);
				((NewVarContext)_localctx).right = eqRight();

				          _localctx.expr=new NewVar(((NewVarContext)_localctx).mut.mutable, ((NewVarContext)_localctx).var.var, ((NewVarContext)_localctx).t.t, ((NewVarContext)_localctx).right.right)
				      
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				((NewVarContext)_localctx).mut = constOrVar();
				setState(131);
				match(WHITE_SPACE);
				setState(132);
				((NewVarContext)_localctx).var = variable();
				setState(133);
				match(COLON_V_TOKEN);
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITE_SPACE) {
					{
					{
					setState(134);
					match(WHITE_SPACE);
					}
					}
					setState(139);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(140);
				((NewVarContext)_localctx).t = type();

				          _localctx.expr=new NewVar(((NewVarContext)_localctx).mut.mutable, ((NewVarContext)_localctx).var.var, ((NewVarContext)_localctx).t.t, null)
				      
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(143);
				((NewVarContext)_localctx).mut = constOrVar();
				setState(144);
				match(WHITE_SPACE);
				setState(145);
				((NewVarContext)_localctx).var = variable();
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITE_SPACE) {
					{
					{
					setState(146);
					match(WHITE_SPACE);
					}
					}
					setState(151);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(152);
				match(EQ_TOKEN);
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITE_SPACE) {
					{
					{
					setState(153);
					match(WHITE_SPACE);
					}
					}
					setState(158);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(159);
				((NewVarContext)_localctx).right = eqRight();

				          _localctx.expr=new NewVar(((NewVarContext)_localctx).mut.mutable, ((NewVarContext)_localctx).var.var, null, ((NewVarContext)_localctx).right.right)
				      
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

	public static class EquatingContext extends ParserRuleContext {
		public Equating equat;
		public VariableContext var;
		public EqRightContext right;
		public TerminalNode EQ_TOKEN() { return getToken(ExpressionParser.EQ_TOKEN, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public EqRightContext eqRight() {
			return getRuleContext(EqRightContext.class,0);
		}
		public List<TerminalNode> WHITE_SPACE() { return getTokens(ExpressionParser.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(ExpressionParser.WHITE_SPACE, i);
		}
		public EquatingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equating; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterEquating(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitEquating(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitEquating(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EquatingContext equating() throws RecognitionException {
		EquatingContext _localctx = new EquatingContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_equating);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			((EquatingContext)_localctx).var = variable();
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(165);
				match(WHITE_SPACE);
				}
				}
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(171);
			match(EQ_TOKEN);
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(172);
				match(WHITE_SPACE);
				}
				}
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(178);
			((EquatingContext)_localctx).right = eqRight();
			_localctx.equat=new Equating(((EquatingContext)_localctx).var.var, ((EquatingContext)_localctx).right.right)
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

	public static class EqRightContext extends ParserRuleContext {
		public EqRight right;
		public ReadVarContext vr;
		public MathExpressionContext mathExpression() {
			return getRuleContext(MathExpressionContext.class,0);
		}
		public ReadVarContext readVar() {
			return getRuleContext(ReadVarContext.class,0);
		}
		public EqRightContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eqRight; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterEqRight(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitEqRight(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitEqRight(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqRightContext eqRight() throws RecognitionException {
		EqRightContext _localctx = new EqRightContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_eqRight);
		try {
			setState(183);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RLB_TOKEN:
			case DECIMAL:
			case VARIABLE_TOKEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
				mathExpression(0);
				}
				break;
			case READ_INT_TYPE:
			case READ_DOUBLE_TYPE:
			case READ_CHAR_TYPE:
			case READ_BOOL_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(182);
				((EqRightContext)_localctx).vr = readVar();
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

	public static class ForBlockContext extends ParserRuleContext {
		public ForBlock for;
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
		enterRule(_localctx, 14, RULE_forBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(FOR);
			setState(186);
			match(WHITE_SPACE);
			setState(187);
			((ForBlockContext)_localctx).var = variable();
			setState(188);
			match(WHITE_SPACE);
			setState(189);
			match(IN);
			setState(190);
			match(WHITE_SPACE);
			setState(191);
			match(RANGE);
			setState(192);
			((ForBlockContext)_localctx).rng = range();
			setState(193);
			maybeNewLine();
			setState(194);
			match(CLB_TOKEN);
			setState(195);
			((ForBlockContext)_localctx).main = mainBlock();
			setState(196);
			match(CRB_TOKEN);
			((ForBlockContext)_localctx).for =  new ForBlock(((ForBlockContext)_localctx).var.var, ((ForBlockContext)_localctx).rng.rng, ((ForBlockContext)_localctx).main.main);
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
		public LogExpressionContext cnd;
		public MainBlockContext main;
		public TerminalNode WHILE() { return getToken(ExpressionParser.WHILE, 0); }
		public TerminalNode WHITE_SPACE() { return getToken(ExpressionParser.WHITE_SPACE, 0); }
		public MaybeNewLineContext maybeNewLine() {
			return getRuleContext(MaybeNewLineContext.class,0);
		}
		public TerminalNode CLB_TOKEN() { return getToken(ExpressionParser.CLB_TOKEN, 0); }
		public TerminalNode CRB_TOKEN() { return getToken(ExpressionParser.CRB_TOKEN, 0); }
		public LogExpressionContext logExpression() {
			return getRuleContext(LogExpressionContext.class,0);
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
		enterRule(_localctx, 16, RULE_whileBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(WHILE);
			setState(200);
			match(WHITE_SPACE);
			setState(201);
			((WhileBlockContext)_localctx).cnd = logExpression(0);
			setState(202);
			maybeNewLine();
			setState(203);
			match(CLB_TOKEN);
			setState(204);
			((WhileBlockContext)_localctx).main = mainBlock();
			setState(205);
			match(CRB_TOKEN);

			          _localctx.node=new WhileBlock((((WhileBlockContext)_localctx).cnd!=null?_input.getText(((WhileBlockContext)_localctx).cnd.start,((WhileBlockContext)_localctx).cnd.stop):null), ((WhileBlockContext)_localctx).main.main)
			      
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
		public JustIfContext ifBlc;
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
		enterRule(_localctx, 18, RULE_ifBlock);
		try {
			setState(218);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(208);
				maybeNewLine();
				setState(209);
				((IfBlockContext)_localctx).ifBlc = justIf();
				setState(210);
				maybeNewLine();
				_localctx.node=new JustIf(((IfBlockContext)_localctx).ifBlc.node)
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				maybeNewLine();
				setState(214);
				((IfBlockContext)_localctx).ifAndElse = ((IfBlockContext)_localctx).ifElse = ifElse();
				setState(215);
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
		public LogExpressionContext cnd;
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
		public LogExpressionContext logExpression() {
			return getRuleContext(LogExpressionContext.class,0);
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
		enterRule(_localctx, 20, RULE_justIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(IF);
			setState(221);
			match(WHITE_SPACE);
			setState(222);
			((JustIfContext)_localctx).cnd = logExpression(0);
			setState(223);
			maybeNewLine();
			setState(224);
			match(CLB_TOKEN);
			setState(225);
			((JustIfContext)_localctx).body = mainBlock();
			setState(226);
			match(CRB_TOKEN);
			setState(227);
			maybeNewLine();
			_localctx.node=new JustIf((((JustIfContext)_localctx).cnd!=null?_input.getText(((JustIfContext)_localctx).cnd.start,((JustIfContext)_localctx).cnd.stop):null), ((JustIfContext)_localctx).body.main)
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
		public JustIfContext ifBlc;
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
		enterRule(_localctx, 22, RULE_ifElse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			((IfElseContext)_localctx).ifBlc = justIf();
			setState(231);
			match(ELSE);
			setState(232);
			maybeNewLine();
			setState(233);
			match(CLB_TOKEN);
			setState(234);
			((IfElseContext)_localctx).body = mainBlock();
			setState(235);
			match(CRB_TOKEN);

			          _localctx.node=new EfElseBlock(((IfElseContext)_localctx).ifBlc.node.getCondition(), ((IfElseContext)_localctx).ifBlc.node.body(), ((IfElseContext)_localctx).body.main)
			      
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
		public Range rng;
		public MathExpressionContext leftVar;
		public MathExpressionContext rightVar;
		public TerminalNode RLB_TOKEN() { return getToken(ExpressionParser.RLB_TOKEN, 0); }
		public TerminalNode COLON_G_TOKEN() { return getToken(ExpressionParser.COLON_G_TOKEN, 0); }
		public TerminalNode RRB_TOKEN() { return getToken(ExpressionParser.RRB_TOKEN, 0); }
		public List<MathExpressionContext> mathExpression() {
			return getRuleContexts(MathExpressionContext.class);
		}
		public MathExpressionContext mathExpression(int i) {
			return getRuleContext(MathExpressionContext.class,i);
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
		enterRule(_localctx, 24, RULE_range);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(RLB_TOKEN);
			setState(239);
			((RangeContext)_localctx).leftVar = mathExpression(0);
			setState(240);
			match(COLON_G_TOKEN);
			setState(241);
			((RangeContext)_localctx).rightVar = mathExpression(0);
			setState(242);
			match(RRB_TOKEN);
			_localctx.rng=new Range(0, 100)
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
		public Var var;
		public Token VARIABLE_TOKEN;
		public TerminalNode VARIABLE_TOKEN() { return getToken(ExpressionParser.VARIABLE_TOKEN, 0); }
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
		enterRule(_localctx, 26, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			((VariableContext)_localctx).VARIABLE_TOKEN = match(VARIABLE_TOKEN);
			((VariableContext)_localctx).var =  new Var((((VariableContext)_localctx).VARIABLE_TOKEN!=null?((VariableContext)_localctx).VARIABLE_TOKEN.getText():null), Types.Unknown);
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
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_newLine, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				}
				break;
			case 2:
				{
				setState(249);
				match(NEW_LINE);
				}
				break;
			case 3:
				{
				setState(250);
				match(NEW_LINE);
				setState(251);
				newLine(3);
				}
				break;
			case 4:
				{
				setState(252);
				match(WHITE_SPACE);
				setState(253);
				newLine(2);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(260);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new NewLineContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_newLine);
					setState(256);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(257);
					match(WHITE_SPACE);
					}
					} 
				}
				setState(262);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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
		enterRule(_localctx, 30, RULE_maybeNewLine);
		try {
			setState(265);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(263);
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

	public static class MathExpressionContext extends ParserRuleContext {
		public Types tpe;
		public MathExpressionContext left;
		public MathOperatorsContext op;
		public MathExpressionContext right;
		public TerminalNode RLB_TOKEN() { return getToken(ExpressionParser.RLB_TOKEN, 0); }
		public List<MathExpressionContext> mathExpression() {
			return getRuleContexts(MathExpressionContext.class);
		}
		public MathExpressionContext mathExpression(int i) {
			return getRuleContext(MathExpressionContext.class,i);
		}
		public TerminalNode RRB_TOKEN() { return getToken(ExpressionParser.RRB_TOKEN, 0); }
		public List<TerminalNode> WHITE_SPACE() { return getTokens(ExpressionParser.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(ExpressionParser.WHITE_SPACE, i);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode DECIMAL() { return getToken(ExpressionParser.DECIMAL, 0); }
		public MathOperatorsContext mathOperators() {
			return getRuleContext(MathOperatorsContext.class,0);
		}
		public MathExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterMathExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitMathExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitMathExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MathExpressionContext mathExpression() throws RecognitionException {
		return mathExpression(0);
	}

	private MathExpressionContext mathExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MathExpressionContext _localctx = new MathExpressionContext(_ctx, _parentState);
		MathExpressionContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_mathExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RLB_TOKEN:
				{
				setState(268);
				match(RLB_TOKEN);
				setState(272);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITE_SPACE) {
					{
					{
					setState(269);
					match(WHITE_SPACE);
					}
					}
					setState(274);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(275);
				mathExpression(0);
				setState(279);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITE_SPACE) {
					{
					{
					setState(276);
					match(WHITE_SPACE);
					}
					}
					setState(281);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(282);
				match(RRB_TOKEN);

				}
				break;
			case VARIABLE_TOKEN:
				{
				setState(285);
				variable();
				}
				break;
			case DECIMAL:
				{
				setState(286);
				match(DECIMAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(307);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MathExpressionContext(_parentctx, _parentState);
					_localctx.left = _prevctx;
					_localctx.left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_mathExpression);
					setState(289);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(293);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WHITE_SPACE) {
						{
						{
						setState(290);
						match(WHITE_SPACE);
						}
						}
						setState(295);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(296);
					((MathExpressionContext)_localctx).op = mathOperators();
					setState(300);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WHITE_SPACE) {
						{
						{
						setState(297);
						match(WHITE_SPACE);
						}
						}
						setState(302);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(303);
					((MathExpressionContext)_localctx).right = mathExpression(4);
					}
					} 
				}
				setState(309);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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

	public static class LogExpressionContext extends ParserRuleContext {
		public LogExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logExpression; }
	 
		public LogExpressionContext() { }
		public void copyFrom(LogExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BinaryExpressionContext extends LogExpressionContext {
		public LogExpressionContext left;
		public BinaryContext op;
		public LogExpressionContext right;
		public List<LogExpressionContext> logExpression() {
			return getRuleContexts(LogExpressionContext.class);
		}
		public LogExpressionContext logExpression(int i) {
			return getRuleContext(LogExpressionContext.class,i);
		}
		public BinaryContext binary() {
			return getRuleContext(BinaryContext.class,0);
		}
		public List<TerminalNode> WHITE_SPACE() { return getTokens(ExpressionParser.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(ExpressionParser.WHITE_SPACE, i);
		}
		public BinaryExpressionContext(LogExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterBinaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitBinaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitBinaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DecimalExpressionContext extends LogExpressionContext {
		public TerminalNode DECIMAL() { return getToken(ExpressionParser.DECIMAL, 0); }
		public DecimalExpressionContext(LogExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterDecimalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitDecimalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitDecimalExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolExpressionContext extends LogExpressionContext {
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public BoolExpressionContext(LogExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterBoolExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitBoolExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitBoolExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdentifierExpressionContext extends LogExpressionContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public IdentifierExpressionContext(LogExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterIdentifierExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitIdentifierExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitIdentifierExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotExpressionContext extends LogExpressionContext {
		public TerminalNode NOT_TOKEN() { return getToken(ExpressionParser.NOT_TOKEN, 0); }
		public LogExpressionContext logExpression() {
			return getRuleContext(LogExpressionContext.class,0);
		}
		public List<TerminalNode> WHITE_SPACE() { return getTokens(ExpressionParser.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(ExpressionParser.WHITE_SPACE, i);
		}
		public NotExpressionContext(LogExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterNotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitNotExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitNotExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenExpressionContext extends LogExpressionContext {
		public TerminalNode RLB_TOKEN() { return getToken(ExpressionParser.RLB_TOKEN, 0); }
		public LogExpressionContext logExpression() {
			return getRuleContext(LogExpressionContext.class,0);
		}
		public TerminalNode RRB_TOKEN() { return getToken(ExpressionParser.RRB_TOKEN, 0); }
		public List<TerminalNode> WHITE_SPACE() { return getTokens(ExpressionParser.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(ExpressionParser.WHITE_SPACE, i);
		}
		public ParenExpressionContext(LogExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterParenExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitParenExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitParenExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MathhExpressionContext extends LogExpressionContext {
		public MathExpressionContext me;
		public MathExpressionContext mathExpression() {
			return getRuleContext(MathExpressionContext.class,0);
		}
		public MathhExpressionContext(LogExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterMathhExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitMathhExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitMathhExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComparatorExpressionContext extends LogExpressionContext {
		public LogExpressionContext left;
		public ComparatorContext op;
		public LogExpressionContext right;
		public List<LogExpressionContext> logExpression() {
			return getRuleContexts(LogExpressionContext.class);
		}
		public LogExpressionContext logExpression(int i) {
			return getRuleContext(LogExpressionContext.class,i);
		}
		public ComparatorContext comparator() {
			return getRuleContext(ComparatorContext.class,0);
		}
		public List<TerminalNode> WHITE_SPACE() { return getTokens(ExpressionParser.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(ExpressionParser.WHITE_SPACE, i);
		}
		public ComparatorExpressionContext(LogExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterComparatorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitComparatorExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitComparatorExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogExpressionContext logExpression() throws RecognitionException {
		return logExpression(0);
	}

	private LogExpressionContext logExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogExpressionContext _localctx = new LogExpressionContext(_ctx, _parentState);
		LogExpressionContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_logExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				_localctx = new ParenExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(311);
				match(RLB_TOKEN);
				setState(315);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITE_SPACE) {
					{
					{
					setState(312);
					match(WHITE_SPACE);
					}
					}
					setState(317);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(318);
				logExpression(0);
				setState(322);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITE_SPACE) {
					{
					{
					setState(319);
					match(WHITE_SPACE);
					}
					}
					setState(324);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(325);
				match(RRB_TOKEN);
				}
				break;
			case 2:
				{
				_localctx = new NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(327);
				match(NOT_TOKEN);
				setState(331);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITE_SPACE) {
					{
					{
					setState(328);
					match(WHITE_SPACE);
					}
					}
					setState(333);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(334);
				logExpression(7);
				}
				break;
			case 3:
				{
				_localctx = new BoolExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(335);
				bool();
				}
				break;
			case 4:
				{
				_localctx = new IdentifierExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(336);
				variable();
				}
				break;
			case 5:
				{
				_localctx = new DecimalExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(337);
				match(DECIMAL);
				}
				break;
			case 6:
				{
				_localctx = new MathhExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(338);
				((MathhExpressionContext)_localctx).me = mathExpression(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(375);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(373);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
					case 1:
						{
						_localctx = new ComparatorExpressionContext(new LogExpressionContext(_parentctx, _parentState));
						((ComparatorExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_logExpression);
						setState(341);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(345);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WHITE_SPACE) {
							{
							{
							setState(342);
							match(WHITE_SPACE);
							}
							}
							setState(347);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(348);
						((ComparatorExpressionContext)_localctx).op = comparator();
						setState(352);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WHITE_SPACE) {
							{
							{
							setState(349);
							match(WHITE_SPACE);
							}
							}
							setState(354);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(355);
						((ComparatorExpressionContext)_localctx).right = logExpression(7);
						}
						break;
					case 2:
						{
						_localctx = new BinaryExpressionContext(new LogExpressionContext(_parentctx, _parentState));
						((BinaryExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_logExpression);
						setState(357);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(361);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WHITE_SPACE) {
							{
							{
							setState(358);
							match(WHITE_SPACE);
							}
							}
							setState(363);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(364);
						((BinaryExpressionContext)_localctx).op = binary();
						setState(368);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WHITE_SPACE) {
							{
							{
							setState(365);
							match(WHITE_SPACE);
							}
							}
							setState(370);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(371);
						((BinaryExpressionContext)_localctx).right = logExpression(6);
						}
						break;
					}
					} 
				}
				setState(377);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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

	public static class ReadVarContext extends ParserRuleContext {
		public Types tpe;
		public TerminalNode READ_INT_TYPE() { return getToken(ExpressionParser.READ_INT_TYPE, 0); }
		public TerminalNode RLB_TOKEN() { return getToken(ExpressionParser.RLB_TOKEN, 0); }
		public TerminalNode RRB_TOKEN() { return getToken(ExpressionParser.RRB_TOKEN, 0); }
		public TerminalNode READ_DOUBLE_TYPE() { return getToken(ExpressionParser.READ_DOUBLE_TYPE, 0); }
		public TerminalNode READ_CHAR_TYPE() { return getToken(ExpressionParser.READ_CHAR_TYPE, 0); }
		public TerminalNode READ_BOOL_TYPE() { return getToken(ExpressionParser.READ_BOOL_TYPE, 0); }
		public ReadVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterReadVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitReadVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitReadVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadVarContext readVar() throws RecognitionException {
		ReadVarContext _localctx = new ReadVarContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_readVar);
		try {
			setState(394);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case READ_INT_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(378);
				match(READ_INT_TYPE);
				setState(379);
				match(RLB_TOKEN);
				setState(380);
				match(RRB_TOKEN);
				_localctx.tpe = Types.Int
				}
				break;
			case READ_DOUBLE_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(382);
				match(READ_DOUBLE_TYPE);
				setState(383);
				match(RLB_TOKEN);
				setState(384);
				match(RRB_TOKEN);
				_localctx.tpe = Types.Double
				}
				break;
			case READ_CHAR_TYPE:
				enterOuterAlt(_localctx, 3);
				{
				setState(386);
				match(READ_CHAR_TYPE);
				setState(387);
				match(RLB_TOKEN);
				setState(388);
				match(RRB_TOKEN);
				_localctx.tpe = Types.Char
				}
				break;
			case READ_BOOL_TYPE:
				enterOuterAlt(_localctx, 4);
				{
				setState(390);
				match(READ_BOOL_TYPE);
				setState(391);
				match(RLB_TOKEN);
				setState(392);
				match(RRB_TOKEN);
				_localctx.tpe = Types.Bool
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

	public static class ConstOrVarContext extends ParserRuleContext {
		public ConstOrVar mutable;
		public TerminalNode VAR_TOKEN() { return getToken(ExpressionParser.VAR_TOKEN, 0); }
		public TerminalNode LET_TOKEN() { return getToken(ExpressionParser.LET_TOKEN, 0); }
		public ConstOrVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constOrVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterConstOrVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitConstOrVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitConstOrVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstOrVarContext constOrVar() throws RecognitionException {
		ConstOrVarContext _localctx = new ConstOrVarContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_constOrVar);
		try {
			setState(400);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR_TOKEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(396);
				match(VAR_TOKEN);
				_localctx.mutable=ConstOrVar.VAR
				}
				break;
			case LET_TOKEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(398);
				match(LET_TOKEN);
				_localctx.mutable=ConstOrVar.LET
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

	public static class MathOperatorsContext extends ParserRuleContext {
		public TerminalNode PLUS_TOKEN() { return getToken(ExpressionParser.PLUS_TOKEN, 0); }
		public TerminalNode MINUS_TOKEN() { return getToken(ExpressionParser.MINUS_TOKEN, 0); }
		public TerminalNode MUL_TOKEN() { return getToken(ExpressionParser.MUL_TOKEN, 0); }
		public TerminalNode DIV_TOKEN() { return getToken(ExpressionParser.DIV_TOKEN, 0); }
		public TerminalNode MOD_TOKEN() { return getToken(ExpressionParser.MOD_TOKEN, 0); }
		public MathOperatorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathOperators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterMathOperators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitMathOperators(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitMathOperators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MathOperatorsContext mathOperators() throws RecognitionException {
		MathOperatorsContext _localctx = new MathOperatorsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_mathOperators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS_TOKEN) | (1L << MINUS_TOKEN) | (1L << MUL_TOKEN) | (1L << DIV_TOKEN) | (1L << MOD_TOKEN))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class ComparatorContext extends ParserRuleContext {
		public TerminalNode GT_TOKEN() { return getToken(ExpressionParser.GT_TOKEN, 0); }
		public TerminalNode GE_TOKEN() { return getToken(ExpressionParser.GE_TOKEN, 0); }
		public TerminalNode LT_TOKEN() { return getToken(ExpressionParser.LT_TOKEN, 0); }
		public TerminalNode LE_TOKEN() { return getToken(ExpressionParser.LE_TOKEN, 0); }
		public TerminalNode EQ_LOG_TOKEN() { return getToken(ExpressionParser.EQ_LOG_TOKEN, 0); }
		public TerminalNode NOT_EQ_TOKEN() { return getToken(ExpressionParser.NOT_EQ_TOKEN, 0); }
		public ComparatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterComparator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitComparator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitComparator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparatorContext comparator() throws RecognitionException {
		ComparatorContext _localctx = new ComparatorContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_comparator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT_TOKEN) | (1L << GE_TOKEN) | (1L << LT_TOKEN) | (1L << LE_TOKEN) | (1L << EQ_LOG_TOKEN) | (1L << NOT_EQ_TOKEN))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class TypeContext extends ParserRuleContext {
		public Types t;
		public TerminalNode INT_TYPE() { return getToken(ExpressionParser.INT_TYPE, 0); }
		public TerminalNode DOUBLE_TYPE() { return getToken(ExpressionParser.DOUBLE_TYPE, 0); }
		public TerminalNode CHAR_TYPE() { return getToken(ExpressionParser.CHAR_TYPE, 0); }
		public TerminalNode BOOL_TYPE() { return getToken(ExpressionParser.BOOL_TYPE, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_type);
		try {
			setState(414);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(406);
				match(INT_TYPE);
				_localctx.t=Types.Int
				}
				break;
			case DOUBLE_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(408);
				match(DOUBLE_TYPE);
				_localctx.t=Types.Double
				}
				break;
			case CHAR_TYPE:
				enterOuterAlt(_localctx, 3);
				{
				setState(410);
				match(CHAR_TYPE);
				_localctx.t=Types.Char
				}
				break;
			case BOOL_TYPE:
				enterOuterAlt(_localctx, 4);
				{
				setState(412);
				match(BOOL_TYPE);
				_localctx.t=Types.Bool
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

	public static class BinaryContext extends ParserRuleContext {
		public TerminalNode AND_TOKEN() { return getToken(ExpressionParser.AND_TOKEN, 0); }
		public TerminalNode OR_TOKEN() { return getToken(ExpressionParser.OR_TOKEN, 0); }
		public BinaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitBinary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryContext binary() throws RecognitionException {
		BinaryContext _localctx = new BinaryContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_binary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			_la = _input.LA(1);
			if ( !(_la==AND_TOKEN || _la==OR_TOKEN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class BoolContext extends ParserRuleContext {
		public TerminalNode TRUE_TOKEN() { return getToken(ExpressionParser.TRUE_TOKEN, 0); }
		public TerminalNode FALSE_TOKEN() { return getToken(ExpressionParser.FALSE_TOKEN, 0); }
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			_la = _input.LA(1);
			if ( !(_la==TRUE_TOKEN || _la==FALSE_TOKEN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 14:
			return newLine_sempred((NewLineContext)_localctx, predIndex);
		case 16:
			return mathExpression_sempred((MathExpressionContext)_localctx, predIndex);
		case 17:
			return logExpression_sempred((LogExpressionContext)_localctx, predIndex);
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
	private boolean mathExpression_sempred(MathExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean logExpression_sempred(LogExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3/\u01a7\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3B\n"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4b\n\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\7\6o\n\6\f\6\16\6r\13\6\3\6\3\6\7"+
		"\6v\n\6\f\6\16\6y\13\6\3\6\3\6\7\6}\n\6\f\6\16\6\u0080\13\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\7\6\u008a\n\6\f\6\16\6\u008d\13\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\7\6\u0096\n\6\f\6\16\6\u0099\13\6\3\6\3\6\7\6\u009d\n\6"+
		"\f\6\16\6\u00a0\13\6\3\6\3\6\3\6\5\6\u00a5\n\6\3\7\3\7\7\7\u00a9\n\7\f"+
		"\7\16\7\u00ac\13\7\3\7\3\7\7\7\u00b0\n\7\f\7\16\7\u00b3\13\7\3\7\3\7\3"+
		"\7\3\b\3\b\5\b\u00ba\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\5\13\u00dd\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0101\n\20"+
		"\3\20\3\20\7\20\u0105\n\20\f\20\16\20\u0108\13\20\3\21\3\21\5\21\u010c"+
		"\n\21\3\22\3\22\3\22\7\22\u0111\n\22\f\22\16\22\u0114\13\22\3\22\3\22"+
		"\7\22\u0118\n\22\f\22\16\22\u011b\13\22\3\22\3\22\3\22\3\22\3\22\5\22"+
		"\u0122\n\22\3\22\3\22\7\22\u0126\n\22\f\22\16\22\u0129\13\22\3\22\3\22"+
		"\7\22\u012d\n\22\f\22\16\22\u0130\13\22\3\22\3\22\7\22\u0134\n\22\f\22"+
		"\16\22\u0137\13\22\3\23\3\23\3\23\7\23\u013c\n\23\f\23\16\23\u013f\13"+
		"\23\3\23\3\23\7\23\u0143\n\23\f\23\16\23\u0146\13\23\3\23\3\23\3\23\3"+
		"\23\7\23\u014c\n\23\f\23\16\23\u014f\13\23\3\23\3\23\3\23\3\23\3\23\5"+
		"\23\u0156\n\23\3\23\3\23\7\23\u015a\n\23\f\23\16\23\u015d\13\23\3\23\3"+
		"\23\7\23\u0161\n\23\f\23\16\23\u0164\13\23\3\23\3\23\3\23\3\23\7\23\u016a"+
		"\n\23\f\23\16\23\u016d\13\23\3\23\3\23\7\23\u0171\n\23\f\23\16\23\u0174"+
		"\13\23\3\23\3\23\7\23\u0178\n\23\f\23\16\23\u017b\13\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24"+
		"\u018d\n\24\3\25\3\25\3\25\3\25\5\25\u0193\n\25\3\26\3\26\3\27\3\27\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u01a1\n\30\3\31\3\31\3\32"+
		"\3\32\3\32\2\5\36\"$\33\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*"+
		",.\60\62\2\6\3\2!%\3\2&+\3\2\34\35\3\2\37 \2\u01c1\2\64\3\2\2\2\4A\3\2"+
		"\2\2\6a\3\2\2\2\bc\3\2\2\2\n\u00a4\3\2\2\2\f\u00a6\3\2\2\2\16\u00b9\3"+
		"\2\2\2\20\u00bb\3\2\2\2\22\u00c9\3\2\2\2\24\u00dc\3\2\2\2\26\u00de\3\2"+
		"\2\2\30\u00e8\3\2\2\2\32\u00f0\3\2\2\2\34\u00f7\3\2\2\2\36\u0100\3\2\2"+
		"\2 \u010b\3\2\2\2\"\u0121\3\2\2\2$\u0155\3\2\2\2&\u018c\3\2\2\2(\u0192"+
		"\3\2\2\2*\u0194\3\2\2\2,\u0196\3\2\2\2.\u01a0\3\2\2\2\60\u01a2\3\2\2\2"+
		"\62\u01a4\3\2\2\2\64\65\5\4\3\2\65\66\b\2\1\2\66\3\3\2\2\2\67B\3\2\2\2"+
		"89\5 \21\29:\5\6\4\2:;\5\4\3\2;<\5 \21\2<=\b\3\1\2=B\3\2\2\2>?\5 \21\2"+
		"?@\b\3\1\2@B\3\2\2\2A\67\3\2\2\2A8\3\2\2\2A>\3\2\2\2B\5\3\2\2\2CD\5 \21"+
		"\2DE\5\20\t\2EF\5 \21\2FG\b\4\1\2Gb\3\2\2\2HI\5 \21\2IJ\5\22\n\2JK\5 "+
		"\21\2KL\b\4\1\2Lb\3\2\2\2MN\5 \21\2NO\5\24\13\2OP\5 \21\2PQ\b\4\1\2Qb"+
		"\3\2\2\2RS\5 \21\2ST\5\f\7\2TU\5 \21\2UV\b\4\1\2Vb\3\2\2\2WX\5 \21\2X"+
		"Y\5\n\6\2YZ\5 \21\2Z[\b\4\1\2[b\3\2\2\2\\]\5 \21\2]^\5\b\5\2^_\5 \21\2"+
		"_`\b\4\1\2`b\3\2\2\2aC\3\2\2\2aH\3\2\2\2aM\3\2\2\2aR\3\2\2\2aW\3\2\2\2"+
		"a\\\3\2\2\2b\7\3\2\2\2cd\7\13\2\2de\7\30\2\2ef\5\34\17\2fg\7\31\2\2gh"+
		"\b\5\1\2h\t\3\2\2\2ij\5(\25\2jk\7/\2\2kl\5\34\17\2lp\7\25\2\2mo\7/\2\2"+
		"nm\3\2\2\2or\3\2\2\2pn\3\2\2\2pq\3\2\2\2qs\3\2\2\2rp\3\2\2\2sw\5.\30\2"+
		"tv\7/\2\2ut\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2xz\3\2\2\2yw\3\2\2\2"+
		"z~\7\17\2\2{}\7/\2\2|{\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177"+
		"\u0081\3\2\2\2\u0080~\3\2\2\2\u0081\u0082\5\16\b\2\u0082\u0083\b\6\1\2"+
		"\u0083\u00a5\3\2\2\2\u0084\u0085\5(\25\2\u0085\u0086\7/\2\2\u0086\u0087"+
		"\5\34\17\2\u0087\u008b\7\25\2\2\u0088\u008a\7/\2\2\u0089\u0088\3\2\2\2"+
		"\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008e"+
		"\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u008f\5.\30\2\u008f\u0090\b\6\1\2\u0090"+
		"\u00a5\3\2\2\2\u0091\u0092\5(\25\2\u0092\u0093\7/\2\2\u0093\u0097\5\34"+
		"\17\2\u0094\u0096\7/\2\2\u0095\u0094\3\2\2\2\u0096\u0099\3\2\2\2\u0097"+
		"\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u009a\3\2\2\2\u0099\u0097\3\2"+
		"\2\2\u009a\u009e\7\17\2\2\u009b\u009d\7/\2\2\u009c\u009b\3\2\2\2\u009d"+
		"\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a1\3\2"+
		"\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a2\5\16\b\2\u00a2\u00a3\b\6\1\2\u00a3"+
		"\u00a5\3\2\2\2\u00a4i\3\2\2\2\u00a4\u0084\3\2\2\2\u00a4\u0091\3\2\2\2"+
		"\u00a5\13\3\2\2\2\u00a6\u00aa\5\34\17\2\u00a7\u00a9\7/\2\2\u00a8\u00a7"+
		"\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab"+
		"\u00ad\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00b1\7\17\2\2\u00ae\u00b0\7"+
		"/\2\2\u00af\u00ae\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1"+
		"\u00b2\3\2\2\2\u00b2\u00b4\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00b5\5\16"+
		"\b\2\u00b5\u00b6\b\7\1\2\u00b6\r\3\2\2\2\u00b7\u00ba\5\"\22\2\u00b8\u00ba"+
		"\5&\24\2\u00b9\u00b7\3\2\2\2\u00b9\u00b8\3\2\2\2\u00ba\17\3\2\2\2\u00bb"+
		"\u00bc\7\21\2\2\u00bc\u00bd\7/\2\2\u00bd\u00be\5\34\17\2\u00be\u00bf\7"+
		"/\2\2\u00bf\u00c0\7\22\2\2\u00c0\u00c1\7/\2\2\u00c1\u00c2\7\23\2\2\u00c2"+
		"\u00c3\5\32\16\2\u00c3\u00c4\5 \21\2\u00c4\u00c5\7\32\2\2\u00c5\u00c6"+
		"\5\4\3\2\u00c6\u00c7\7\33\2\2\u00c7\u00c8\b\t\1\2\u00c8\21\3\2\2\2\u00c9"+
		"\u00ca\7\20\2\2\u00ca\u00cb\7/\2\2\u00cb\u00cc\5$\23\2\u00cc\u00cd\5 "+
		"\21\2\u00cd\u00ce\7\32\2\2\u00ce\u00cf\5\4\3\2\u00cf\u00d0\7\33\2\2\u00d0"+
		"\u00d1\b\n\1\2\u00d1\23\3\2\2\2\u00d2\u00d3\5 \21\2\u00d3\u00d4\5\26\f"+
		"\2\u00d4\u00d5\5 \21\2\u00d5\u00d6\b\13\1\2\u00d6\u00dd\3\2\2\2\u00d7"+
		"\u00d8\5 \21\2\u00d8\u00d9\5\30\r\2\u00d9\u00da\5 \21\2\u00da\u00db\b"+
		"\13\1\2\u00db\u00dd\3\2\2\2\u00dc\u00d2\3\2\2\2\u00dc\u00d7\3\2\2\2\u00dd"+
		"\25\3\2\2\2\u00de\u00df\7\26\2\2\u00df\u00e0\7/\2\2\u00e0\u00e1\5$\23"+
		"\2\u00e1\u00e2\5 \21\2\u00e2\u00e3\7\32\2\2\u00e3\u00e4\5\4\3\2\u00e4"+
		"\u00e5\7\33\2\2\u00e5\u00e6\5 \21\2\u00e6\u00e7\b\f\1\2\u00e7\27\3\2\2"+
		"\2\u00e8\u00e9\5\26\f\2\u00e9\u00ea\7\27\2\2\u00ea\u00eb\5 \21\2\u00eb"+
		"\u00ec\7\32\2\2\u00ec\u00ed\5\4\3\2\u00ed\u00ee\7\33\2\2\u00ee\u00ef\b"+
		"\r\1\2\u00ef\31\3\2\2\2\u00f0\u00f1\7\30\2\2\u00f1\u00f2\5\"\22\2\u00f2"+
		"\u00f3\7\24\2\2\u00f3\u00f4\5\"\22\2\u00f4\u00f5\7\31\2\2\u00f5\u00f6"+
		"\b\16\1\2\u00f6\33\3\2\2\2\u00f7\u00f8\7-\2\2\u00f8\u00f9\b\17\1\2\u00f9"+
		"\35\3\2\2\2\u00fa\u0101\b\20\1\2\u00fb\u0101\7.\2\2\u00fc\u00fd\7.\2\2"+
		"\u00fd\u0101\5\36\20\5\u00fe\u00ff\7/\2\2\u00ff\u0101\5\36\20\4\u0100"+
		"\u00fa\3\2\2\2\u0100\u00fb\3\2\2\2\u0100\u00fc\3\2\2\2\u0100\u00fe\3\2"+
		"\2\2\u0101\u0106\3\2\2\2\u0102\u0103\f\3\2\2\u0103\u0105\7/\2\2\u0104"+
		"\u0102\3\2\2\2\u0105\u0108\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0107\3\2"+
		"\2\2\u0107\37\3\2\2\2\u0108\u0106\3\2\2\2\u0109\u010c\5\36\20\2\u010a"+
		"\u010c\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010a\3\2\2\2\u010c!\3\2\2\2"+
		"\u010d\u010e\b\22\1\2\u010e\u0112\7\30\2\2\u010f\u0111\7/\2\2\u0110\u010f"+
		"\3\2\2\2\u0111\u0114\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113"+
		"\u0115\3\2\2\2\u0114\u0112\3\2\2\2\u0115\u0119\5\"\22\2\u0116\u0118\7"+
		"/\2\2\u0117\u0116\3\2\2\2\u0118\u011b\3\2\2\2\u0119\u0117\3\2\2\2\u0119"+
		"\u011a\3\2\2\2\u011a\u011c\3\2\2\2\u011b\u0119\3\2\2\2\u011c\u011d\7\31"+
		"\2\2\u011d\u011e\b\22\1\2\u011e\u0122\3\2\2\2\u011f\u0122\5\34\17\2\u0120"+
		"\u0122\7,\2\2\u0121\u010d\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0120\3\2"+
		"\2\2\u0122\u0135\3\2\2\2\u0123\u0127\f\5\2\2\u0124\u0126\7/\2\2\u0125"+
		"\u0124\3\2\2\2\u0126\u0129\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0128\3\2"+
		"\2\2\u0128\u012a\3\2\2\2\u0129\u0127\3\2\2\2\u012a\u012e\5*\26\2\u012b"+
		"\u012d\7/\2\2\u012c\u012b\3\2\2\2\u012d\u0130\3\2\2\2\u012e\u012c\3\2"+
		"\2\2\u012e\u012f\3\2\2\2\u012f\u0131\3\2\2\2\u0130\u012e\3\2\2\2\u0131"+
		"\u0132\5\"\22\6\u0132\u0134\3\2\2\2\u0133\u0123\3\2\2\2\u0134\u0137\3"+
		"\2\2\2\u0135\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136#\3\2\2\2\u0137\u0135"+
		"\3\2\2\2\u0138\u0139\b\23\1\2\u0139\u013d\7\30\2\2\u013a\u013c\7/\2\2"+
		"\u013b\u013a\3\2\2\2\u013c\u013f\3\2\2\2\u013d\u013b\3\2\2\2\u013d\u013e"+
		"\3\2\2\2\u013e\u0140\3\2\2\2\u013f\u013d\3\2\2\2\u0140\u0144\5$\23\2\u0141"+
		"\u0143\7/\2\2\u0142\u0141\3\2\2\2\u0143\u0146\3\2\2\2\u0144\u0142\3\2"+
		"\2\2\u0144\u0145\3\2\2\2\u0145\u0147\3\2\2\2\u0146\u0144\3\2\2\2\u0147"+
		"\u0148\7\31\2\2\u0148\u0156\3\2\2\2\u0149\u014d\7\36\2\2\u014a\u014c\7"+
		"/\2\2\u014b\u014a\3\2\2\2\u014c\u014f\3\2\2\2\u014d\u014b\3\2\2\2\u014d"+
		"\u014e\3\2\2\2\u014e\u0150\3\2\2\2\u014f\u014d\3\2\2\2\u0150\u0156\5$"+
		"\23\t\u0151\u0156\5\62\32\2\u0152\u0156\5\34\17\2\u0153\u0156\7,\2\2\u0154"+
		"\u0156\5\"\22\2\u0155\u0138\3\2\2\2\u0155\u0149\3\2\2\2\u0155\u0151\3"+
		"\2\2\2\u0155\u0152\3\2\2\2\u0155\u0153\3\2\2\2\u0155\u0154\3\2\2\2\u0156"+
		"\u0179\3\2\2\2\u0157\u015b\f\b\2\2\u0158\u015a\7/\2\2\u0159\u0158\3\2"+
		"\2\2\u015a\u015d\3\2\2\2\u015b\u0159\3\2\2\2\u015b\u015c\3\2\2\2\u015c"+
		"\u015e\3\2\2\2\u015d\u015b\3\2\2\2\u015e\u0162\5,\27\2\u015f\u0161\7/"+
		"\2\2\u0160\u015f\3\2\2\2\u0161\u0164\3\2\2\2\u0162\u0160\3\2\2\2\u0162"+
		"\u0163\3\2\2\2\u0163\u0165\3\2\2\2\u0164\u0162\3\2\2\2\u0165\u0166\5$"+
		"\23\t\u0166\u0178\3\2\2\2\u0167\u016b\f\7\2\2\u0168\u016a\7/\2\2\u0169"+
		"\u0168\3\2\2\2\u016a\u016d\3\2\2\2\u016b\u0169\3\2\2\2\u016b\u016c\3\2"+
		"\2\2\u016c\u016e\3\2\2\2\u016d\u016b\3\2\2\2\u016e\u0172\5\60\31\2\u016f"+
		"\u0171\7/\2\2\u0170\u016f\3\2\2\2\u0171\u0174\3\2\2\2\u0172\u0170\3\2"+
		"\2\2\u0172\u0173\3\2\2\2\u0173\u0175\3\2\2\2\u0174\u0172\3\2\2\2\u0175"+
		"\u0176\5$\23\b\u0176\u0178\3\2\2\2\u0177\u0157\3\2\2\2\u0177\u0167\3\2"+
		"\2\2\u0178\u017b\3\2\2\2\u0179\u0177\3\2\2\2\u0179\u017a\3\2\2\2\u017a"+
		"%\3\2\2\2\u017b\u0179\3\2\2\2\u017c\u017d\7\7\2\2\u017d\u017e\7\30\2\2"+
		"\u017e\u017f\7\31\2\2\u017f\u018d\b\24\1\2\u0180\u0181\7\b\2\2\u0181\u0182"+
		"\7\30\2\2\u0182\u0183\7\31\2\2\u0183\u018d\b\24\1\2\u0184\u0185\7\t\2"+
		"\2\u0185\u0186\7\30\2\2\u0186\u0187\7\31\2\2\u0187\u018d\b\24\1\2\u0188"+
		"\u0189\7\n\2\2\u0189\u018a\7\30\2\2\u018a\u018b\7\31\2\2\u018b\u018d\b"+
		"\24\1\2\u018c\u017c\3\2\2\2\u018c\u0180\3\2\2\2\u018c\u0184\3\2\2\2\u018c"+
		"\u0188\3\2\2\2\u018d\'\3\2\2\2\u018e\u018f\7\r\2\2\u018f\u0193\b\25\1"+
		"\2\u0190\u0191\7\16\2\2\u0191\u0193\b\25\1\2\u0192\u018e\3\2\2\2\u0192"+
		"\u0190\3\2\2\2\u0193)\3\2\2\2\u0194\u0195\t\2\2\2\u0195+\3\2\2\2\u0196"+
		"\u0197\t\3\2\2\u0197-\3\2\2\2\u0198\u0199\7\3\2\2\u0199\u01a1\b\30\1\2"+
		"\u019a\u019b\7\4\2\2\u019b\u01a1\b\30\1\2\u019c\u019d\7\5\2\2\u019d\u01a1"+
		"\b\30\1\2\u019e\u019f\7\6\2\2\u019f\u01a1\b\30\1\2\u01a0\u0198\3\2\2\2"+
		"\u01a0\u019a\3\2\2\2\u01a0\u019c\3\2\2\2\u01a0\u019e\3\2\2\2\u01a1/\3"+
		"\2\2\2\u01a2\u01a3\t\4\2\2\u01a3\61\3\2\2\2\u01a4\u01a5\t\5\2\2\u01a5"+
		"\63\3\2\2\2%Aapw~\u008b\u0097\u009e\u00a4\u00aa\u00b1\u00b9\u00dc\u0100"+
		"\u0106\u010b\u0112\u0119\u0121\u0127\u012e\u0135\u013d\u0144\u014d\u0155"+
		"\u015b\u0162\u016b\u0172\u0177\u0179\u018c\u0192\u01a0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}