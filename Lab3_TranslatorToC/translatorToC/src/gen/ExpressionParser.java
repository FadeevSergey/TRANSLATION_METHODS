package gen;// Generated from /Users/Fadeev/Desktop/github/TRANSLATION_METHODS/Lab3_TranslatorToC/translatorToC/src/Expression.g4 by ANTLR 4.8

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
		READ_TOKEN=10, VAR_TOKEN=11, LET_TOKEN=12, EQ_TOKEN=13, DO=14, WHILE=15, 
		FOR=16, IN=17, RANGE=18, COLON_G_TOKEN=19, COLON_V_TOKEN=20, IF=21, ELSE=22, 
		RLB_TOKEN=23, RRB_TOKEN=24, CLB_TOKEN=25, CRB_TOKEN=26, AND_TOKEN=27, 
		OR_TOKEN=28, NOT_TOKEN=29, TRUE_TOKEN=30, FALSE_TOKEN=31, PLUS_TOKEN=32, 
		MINUS_TOKEN=33, MUL_TOKEN=34, DIV_TOKEN=35, MOD_TOKEN=36, GT_TOKEN=37, 
		GE_TOKEN=38, LT_TOKEN=39, LE_TOKEN=40, EQ_LOG_TOKEN=41, NOT_EQ_TOKEN=42, 
		INTEGER=43, DECIMAL=44, VARIABLE_TOKEN=45, NEW_LINE=46, WHITE_SPACE=47;
	public static final int
		RULE_program = 0, RULE_mainBlock = 1, RULE_mainSubBlock = 2, RULE_print = 3, 
		RULE_newVar = 4, RULE_equating = 5, RULE_eqRight = 6, RULE_forBlock = 7, 
		RULE_whileBlock = 8, RULE_doWhile = 9, RULE_ifBlock = 10, RULE_justIf = 11, 
		RULE_ifElse = 12, RULE_range = 13, RULE_variable = 14, RULE_newLine = 15, 
		RULE_maybeNewLine = 16, RULE_mathExpression = 17, RULE_logExpression = 18, 
		RULE_number = 19, RULE_readVar = 20, RULE_constOrVar = 21, RULE_mathOperators = 22, 
		RULE_comparator = 23, RULE_type = 24, RULE_binary = 25, RULE_bool = 26;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "mainBlock", "mainSubBlock", "print", "newVar", "equating", 
			"eqRight", "forBlock", "whileBlock", "doWhile", "ifBlock", "justIf", 
			"ifElse", "range", "variable", "newLine", "maybeNewLine", "mathExpression", 
			"logExpression", "number", "readVar", "constOrVar", "mathOperators", 
			"comparator", "type", "binary", "bool"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Int'", "'Double'", "'Char'", "'Bool'", "'readInt'", "'readDouble'", 
			"'readChar'", "'readBool'", "'print'", "'read'", "'var'", "'let'", "'='", 
			"'do'", "'while'", "'for'", "'in'", "'range'", "'..'", "':'", "'if'", 
			"'else'", "'('", "')'", "'{'", "'}'", "'&&'", "'||'", "'!'", "'true'", 
			"'false'", "'+'", "'-'", "'*'", "'/'", "'%'", "'>'", "'>='", "'<'", "'<='", 
			"'=='", "'!='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT_TYPE", "DOUBLE_TYPE", "CHAR_TYPE", "BOOL_TYPE", "READ_INT_TYPE", 
			"READ_DOUBLE_TYPE", "READ_CHAR_TYPE", "READ_BOOL_TYPE", "PRINT_TOKEN", 
			"READ_TOKEN", "VAR_TOKEN", "LET_TOKEN", "EQ_TOKEN", "DO", "WHILE", "FOR", 
			"IN", "RANGE", "COLON_G_TOKEN", "COLON_V_TOKEN", "IF", "ELSE", "RLB_TOKEN", 
			"RRB_TOKEN", "CLB_TOKEN", "CRB_TOKEN", "AND_TOKEN", "OR_TOKEN", "NOT_TOKEN", 
			"TRUE_TOKEN", "FALSE_TOKEN", "PLUS_TOKEN", "MINUS_TOKEN", "MUL_TOKEN", 
			"DIV_TOKEN", "MOD_TOKEN", "GT_TOKEN", "GE_TOKEN", "LT_TOKEN", "LE_TOKEN", 
			"EQ_LOG_TOKEN", "NOT_EQ_TOKEN", "INTEGER", "DECIMAL", "VARIABLE_TOKEN", 
			"NEW_LINE", "WHITE_SPACE"
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
			if ( listener instanceof ExpressionListener) ((ExpressionListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener) ((ExpressionListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor) return ((ExpressionVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			((ProgramContext)_localctx).main = mainBlock();
			((ProgramContext)_localctx).node = new Program(((ProgramContext)_localctx).main.main);
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
			if ( listener instanceof ExpressionListener) ((ExpressionListener)listener).enterMainBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener) ((ExpressionListener)listener).exitMainBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor) return ((ExpressionVisitor<? extends T>)visitor).visitMainBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainBlockContext mainBlock() throws RecognitionException {
		MainBlockContext _localctx = new MainBlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_mainBlock);
		try {
			setState(67);
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
				setState(58);
				maybeNewLine();
				setState(59);
				((MainBlockContext)_localctx).subBlock = mainSubBlock();
				setState(60);
				((MainBlockContext)_localctx).mainTail = mainBlock();
				setState(61);
				maybeNewLine();

				            ((MainBlockContext)_localctx).main = new MainBlock(((MainBlockContext)_localctx).subBlock.block, ((MainBlockContext)_localctx).mainTail.main);
				        
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(64);
				maybeNewLine();

				            ((MainBlockContext)_localctx).main = null;
				        
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
		public MainSubBlock block;
		public ForBlockContext forBlc;
		public WhileBlockContext whileBlc;
		public DoWhileContext doWhl;
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
		public DoWhileContext doWhile() {
			return getRuleContext(DoWhileContext.class,0);
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
			if ( listener instanceof ExpressionListener) ((ExpressionListener)listener).enterMainSubBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener) ((ExpressionListener)listener).exitMainSubBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor) return ((ExpressionVisitor<? extends T>)visitor).visitMainSubBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainSubBlockContext mainSubBlock() throws RecognitionException {
		MainSubBlockContext _localctx = new MainSubBlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_mainSubBlock);
		try {
			setState(104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				maybeNewLine();
				setState(70);
				((MainSubBlockContext)_localctx).forBlc = forBlock();
				setState(71);
				maybeNewLine();
				((MainSubBlockContext)_localctx).block = new MainSubBlock(((MainSubBlockContext)_localctx).forBlc.forr);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				maybeNewLine();
				setState(75);
				((MainSubBlockContext)_localctx).whileBlc = whileBlock();
				setState(76);
				maybeNewLine();
				((MainSubBlockContext)_localctx).block = new MainSubBlock(((MainSubBlockContext)_localctx).whileBlc.node);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(79);
				maybeNewLine();
				setState(80);
				((MainSubBlockContext)_localctx).doWhl = doWhile();
				setState(81);
				maybeNewLine();
				((MainSubBlockContext)_localctx).block = new MainSubBlock(((MainSubBlockContext)_localctx).doWhl.node);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(84);
				maybeNewLine();
				setState(85);
				((MainSubBlockContext)_localctx).ifBlc = ifBlock();
				setState(86);
				maybeNewLine();
				((MainSubBlockContext)_localctx).block = new MainSubBlock(((MainSubBlockContext)_localctx).ifBlc.node);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(89);
				maybeNewLine();
				setState(90);
				((MainSubBlockContext)_localctx).eqBlc = equating();
				setState(91);
				maybeNewLine();
				((MainSubBlockContext)_localctx).block = new MainSubBlock(((MainSubBlockContext)_localctx).eqBlc.equat);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(94);
				maybeNewLine();
				setState(95);
				((MainSubBlockContext)_localctx).newBlc = ((MainSubBlockContext)_localctx).newVar = newVar();
				setState(96);
				maybeNewLine();
				((MainSubBlockContext)_localctx).block = new MainSubBlock(((MainSubBlockContext)_localctx).newVar.expr);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(99);
				maybeNewLine();
				setState(100);
				((MainSubBlockContext)_localctx).pntBlc = print();
				setState(101);
				maybeNewLine();
				((MainSubBlockContext)_localctx).block = new MainSubBlock(((MainSubBlockContext)_localctx).pntBlc.pnt);
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
		public MathExpressionContext mathExpr;
		public LogExpressionContext logExpr;
		public TerminalNode PRINT_TOKEN() { return getToken(ExpressionParser.PRINT_TOKEN, 0); }
		public TerminalNode RLB_TOKEN() { return getToken(ExpressionParser.RLB_TOKEN, 0); }
		public TerminalNode RRB_TOKEN() { return getToken(ExpressionParser.RRB_TOKEN, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public MathExpressionContext mathExpression() {
			return getRuleContext(MathExpressionContext.class,0);
		}
		public LogExpressionContext logExpression() {
			return getRuleContext(LogExpressionContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener) ((ExpressionListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener) ((ExpressionListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor) return ((ExpressionVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_print);
		try {
			setState(124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				match(PRINT_TOKEN);
				setState(107);
				match(RLB_TOKEN);
				setState(108);
				((PrintContext)_localctx).vr = variable(Types.Unknown);
				setState(109);
				match(RRB_TOKEN);
				((PrintContext)_localctx).pnt = new Print(((PrintContext)_localctx).vr.var);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				match(PRINT_TOKEN);
				setState(113);
				match(RLB_TOKEN);
				setState(114);
				((PrintContext)_localctx).mathExpr = mathExpression(0);
				setState(115);
				match(RRB_TOKEN);
				((PrintContext)_localctx).pnt = new Print(((PrintContext)_localctx).mathExpr.expr);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(118);
				match(PRINT_TOKEN);
				setState(119);
				match(RLB_TOKEN);
				setState(120);
				((PrintContext)_localctx).logExpr = logExpression(0);
				setState(121);
				match(RRB_TOKEN);
				((PrintContext)_localctx).pnt = new Print(new Condition((((PrintContext)_localctx).logExpr!=null?_input.getText(((PrintContext)_localctx).logExpr.start,((PrintContext)_localctx).logExpr.stop):null)));
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
			if ( listener instanceof ExpressionListener) ((ExpressionListener)listener).enterNewVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener) ((ExpressionListener)listener).exitNewVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor) return ((ExpressionVisitor<? extends T>)visitor).visitNewVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewVarContext newVar() throws RecognitionException {
		NewVarContext _localctx = new NewVarContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_newVar);
		int _la;
		try {
			setState(185);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				((NewVarContext)_localctx).mut = constOrVar();
				setState(127);
				match(WHITE_SPACE);
				setState(128);
				((NewVarContext)_localctx).var = variable(Types.Unknown);
				setState(129);
				match(COLON_V_TOKEN);
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITE_SPACE) {
					{
					{
					setState(130);
					match(WHITE_SPACE);
					}
					}
					setState(135);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(136);
				((NewVarContext)_localctx).t = type();
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITE_SPACE) {
					{
					{
					setState(137);
					match(WHITE_SPACE);
					}
					}
					setState(142);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(143);
				match(EQ_TOKEN);
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITE_SPACE) {
					{
					{
					setState(144);
					match(WHITE_SPACE);
					}
					}
					setState(149);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(150);
				((NewVarContext)_localctx).right = eqRight(((NewVarContext)_localctx).var.var);

				          ((NewVarContext)_localctx).expr = new NewVar(((NewVarContext)_localctx).mut.mutable, ((NewVarContext)_localctx).var.var.setType(((NewVarContext)_localctx).t.t), ((NewVarContext)_localctx).t.t, ((NewVarContext)_localctx).right.right);
				      
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				((NewVarContext)_localctx).mut = constOrVar();
				setState(154);
				match(WHITE_SPACE);
				setState(155);
				((NewVarContext)_localctx).var = variable(Types.Unknown);
				setState(156);
				match(COLON_V_TOKEN);
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITE_SPACE) {
					{
					{
					setState(157);
					match(WHITE_SPACE);
					}
					}
					setState(162);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(163);
				((NewVarContext)_localctx).t = type();

				          ((NewVarContext)_localctx).expr = new NewVar(((NewVarContext)_localctx).mut.mutable, ((NewVarContext)_localctx).var.var.setType(((NewVarContext)_localctx).t.t), ((NewVarContext)_localctx).t.t, null);
				      
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(166);
				((NewVarContext)_localctx).mut = constOrVar();
				setState(167);
				match(WHITE_SPACE);
				setState(168);
				((NewVarContext)_localctx).var = variable(Types.Unknown);
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITE_SPACE) {
					{
					{
					setState(169);
					match(WHITE_SPACE);
					}
					}
					setState(174);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(175);
				match(EQ_TOKEN);
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITE_SPACE) {
					{
					{
					setState(176);
					match(WHITE_SPACE);
					}
					}
					setState(181);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(182);
				((NewVarContext)_localctx).right = eqRight(((NewVarContext)_localctx).var.var);

				          if(((NewVarContext)_localctx).right.right instanceof MathExpression) {
				              ((NewVarContext)_localctx).expr = new NewVar(((NewVarContext)_localctx).mut.mutable, ((NewVarContext)_localctx).var.var.setType(((NewVarContext)_localctx).right.right.getType()), ((NewVarContext)_localctx).right.right.getType(), ((NewVarContext)_localctx).right.right);
				          } else if(((NewVarContext)_localctx).right.right instanceof ReadVar) {
				              Types varType = ((ReadVar)((NewVarContext)_localctx).right.right).getType();
				              ((NewVarContext)_localctx).expr = new NewVar(((NewVarContext)_localctx).mut.mutable, ((NewVarContext)_localctx).var.var.setType(varType), varType, ((NewVarContext)_localctx).right.right);
				          } else {
				              ((NewVarContext)_localctx).expr = new NewVar(((NewVarContext)_localctx).mut.mutable, ((NewVarContext)_localctx).var.var, Types.Bool, ((NewVarContext)_localctx).right.right);
				          }
				      
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
			if ( listener instanceof ExpressionListener) ((ExpressionListener)listener).enterEquating(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener) ((ExpressionListener)listener).exitEquating(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor) return ((ExpressionVisitor<? extends T>)visitor).visitEquating(this);
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
			setState(187);
			((EquatingContext)_localctx).var = variable(Types.Unknown);
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(188);
				match(WHITE_SPACE);
				}
				}
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(194);
			match(EQ_TOKEN);
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(195);
				match(WHITE_SPACE);
				}
				}
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(201);
			((EquatingContext)_localctx).right = eqRight(((EquatingContext)_localctx).var.var);
			((EquatingContext)_localctx).equat = new Equating(((EquatingContext)_localctx).var.var, ((EquatingContext)_localctx).right.right);
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
		public Var var;
		public EqRight right;
		public MathExpressionContext mtExpr;
		public ReadVarContext vr;
		public LogExpressionContext logExpr;
		public MathExpressionContext mathExpression() {
			return getRuleContext(MathExpressionContext.class,0);
		}
		public ReadVarContext readVar() {
			return getRuleContext(ReadVarContext.class,0);
		}
		public LogExpressionContext logExpression() {
			return getRuleContext(LogExpressionContext.class,0);
		}
		public EqRightContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public EqRightContext(ParserRuleContext parent, int invokingState, Var var) {
			super(parent, invokingState);
			this.var = var;
		}
		@Override public int getRuleIndex() { return RULE_eqRight; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener) ((ExpressionListener)listener).enterEqRight(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener) ((ExpressionListener)listener).exitEqRight(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor) return ((ExpressionVisitor<? extends T>)visitor).visitEqRight(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqRightContext eqRight(Var var) throws RecognitionException {
		EqRightContext _localctx = new EqRightContext(_ctx, getState(), var);
		enterRule(_localctx, 12, RULE_eqRight);
		try {
			setState(213);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(204);
				((EqRightContext)_localctx).mtExpr = mathExpression(0);
				((EqRightContext)_localctx).right = ((EqRightContext)_localctx).mtExpr.expr;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(207);
				((EqRightContext)_localctx).vr = readVar(_localctx.var);
				((EqRightContext)_localctx).right = ((EqRightContext)_localctx).vr.tpe;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(210);
				((EqRightContext)_localctx).logExpr = logExpression(0);
				((EqRightContext)_localctx).right = new Condition((((EqRightContext)_localctx).logExpr!=null?_input.getText(((EqRightContext)_localctx).logExpr.start,((EqRightContext)_localctx).logExpr.stop):null));
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
		public ForBlock forr;
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
			if ( listener instanceof ExpressionListener) ((ExpressionListener)listener).enterForBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener) ((ExpressionListener)listener).exitForBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor) return ((ExpressionVisitor<? extends T>)visitor).visitForBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForBlockContext forBlock() throws RecognitionException {
		ForBlockContext _localctx = new ForBlockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_forBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(FOR);
			setState(216);
			match(WHITE_SPACE);
			setState(217);
			((ForBlockContext)_localctx).var = variable(Types.Int);
			setState(218);
			match(WHITE_SPACE);
			setState(219);
			match(IN);
			setState(220);
			match(WHITE_SPACE);
			setState(221);
			match(RANGE);
			setState(222);
			((ForBlockContext)_localctx).rng = range();
			setState(223);
			maybeNewLine();
			setState(224);
			match(CLB_TOKEN);
			setState(225);
			((ForBlockContext)_localctx).main = mainBlock();
			setState(226);
			match(CRB_TOKEN);
			((ForBlockContext)_localctx).forr =  new ForBlock(((ForBlockContext)_localctx).var.var, ((ForBlockContext)_localctx).rng.rng, ((ForBlockContext)_localctx).main.main);
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
			if ( listener instanceof ExpressionListener) ((ExpressionListener)listener).enterWhileBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener) ((ExpressionListener)listener).exitWhileBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor) return ((ExpressionVisitor<? extends T>)visitor).visitWhileBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileBlockContext whileBlock() throws RecognitionException {
		WhileBlockContext _localctx = new WhileBlockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_whileBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(WHILE);
			setState(230);
			match(WHITE_SPACE);
			setState(231);
			((WhileBlockContext)_localctx).cnd = logExpression(0);
			setState(232);
			maybeNewLine();
			setState(233);
			match(CLB_TOKEN);
			setState(234);
			((WhileBlockContext)_localctx).main = mainBlock();
			setState(235);
			match(CRB_TOKEN);

			          ((WhileBlockContext)_localctx).node = new WhileBlock((((WhileBlockContext)_localctx).cnd!=null?_input.getText(((WhileBlockContext)_localctx).cnd.start,((WhileBlockContext)_localctx).cnd.stop):null), ((WhileBlockContext)_localctx).main.main);
			      
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

	public static class DoWhileContext extends ParserRuleContext {
		public Node node;
		public MainBlockContext main;
		public LogExpressionContext cnd;
		public TerminalNode DO() { return getToken(ExpressionParser.DO, 0); }
		public MaybeNewLineContext maybeNewLine() {
			return getRuleContext(MaybeNewLineContext.class,0);
		}
		public TerminalNode CLB_TOKEN() { return getToken(ExpressionParser.CLB_TOKEN, 0); }
		public TerminalNode CRB_TOKEN() { return getToken(ExpressionParser.CRB_TOKEN, 0); }
		public TerminalNode WHILE() { return getToken(ExpressionParser.WHILE, 0); }
		public List<TerminalNode> WHITE_SPACE() { return getTokens(ExpressionParser.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(ExpressionParser.WHITE_SPACE, i);
		}
		public MainBlockContext mainBlock() {
			return getRuleContext(MainBlockContext.class,0);
		}
		public LogExpressionContext logExpression() {
			return getRuleContext(LogExpressionContext.class,0);
		}
		public DoWhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener) ((ExpressionListener)listener).enterDoWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener) ((ExpressionListener)listener).exitDoWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor) return ((ExpressionVisitor<? extends T>)visitor).visitDoWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoWhileContext doWhile() throws RecognitionException {
		DoWhileContext _localctx = new DoWhileContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_doWhile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(DO);
			setState(239);
			maybeNewLine();
			setState(240);
			match(CLB_TOKEN);
			setState(241);
			((DoWhileContext)_localctx).main = mainBlock();
			setState(242);
			match(CRB_TOKEN);
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(243);
				match(WHITE_SPACE);
				}
				}
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(249);
			match(WHILE);
			setState(250);
			match(WHITE_SPACE);
			setState(251);
			((DoWhileContext)_localctx).cnd = logExpression(0);

			          ((DoWhileContext)_localctx).node = new DoWhileBlock((((DoWhileContext)_localctx).cnd!=null?_input.getText(((DoWhileContext)_localctx).cnd.start,((DoWhileContext)_localctx).cnd.stop):null), ((DoWhileContext)_localctx).main.main);
			      
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
			if ( listener instanceof ExpressionListener) ((ExpressionListener)listener).enterIfBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener) ((ExpressionListener)listener).exitIfBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor) return ((ExpressionVisitor<? extends T>)visitor).visitIfBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfBlockContext ifBlock() throws RecognitionException {
		IfBlockContext _localctx = new IfBlockContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ifBlock);
		try {
			setState(264);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(254);
				maybeNewLine();
				setState(255);
				((IfBlockContext)_localctx).ifBlc = justIf();
				setState(256);
				maybeNewLine();
				((IfBlockContext)_localctx).node = ((IfBlockContext)_localctx).ifBlc.node;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(259);
				maybeNewLine();
				setState(260);
				((IfBlockContext)_localctx).ifAndElse = ifElse();
				setState(261);
				maybeNewLine();
				((IfBlockContext)_localctx).node = ((IfBlockContext)_localctx).ifAndElse.node;
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
		public JustIfBlock node;
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
			if ( listener instanceof ExpressionListener) ((ExpressionListener)listener).enterJustIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener) ((ExpressionListener)listener).exitJustIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor) return ((ExpressionVisitor<? extends T>)visitor).visitJustIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JustIfContext justIf() throws RecognitionException {
		JustIfContext _localctx = new JustIfContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_justIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(IF);
			setState(267);
			match(WHITE_SPACE);
			setState(268);
			((JustIfContext)_localctx).cnd = logExpression(0);
			setState(269);
			maybeNewLine();
			setState(270);
			match(CLB_TOKEN);
			setState(271);
			((JustIfContext)_localctx).body = mainBlock();
			setState(272);
			match(CRB_TOKEN);
			setState(273);
			maybeNewLine();
			((JustIfContext)_localctx).node = new JustIfBlock((((JustIfContext)_localctx).cnd!=null?_input.getText(((JustIfContext)_localctx).cnd.start,((JustIfContext)_localctx).cnd.stop):null), ((JustIfContext)_localctx).body.main);
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
		public IfElseBlock node;
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
			if ( listener instanceof ExpressionListener) ((ExpressionListener)listener).enterIfElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener) ((ExpressionListener)listener).exitIfElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor) return ((ExpressionVisitor<? extends T>)visitor).visitIfElse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfElseContext ifElse() throws RecognitionException {
		IfElseContext _localctx = new IfElseContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_ifElse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			((IfElseContext)_localctx).ifBlc = justIf();
			setState(277);
			match(ELSE);
			setState(278);
			maybeNewLine();
			setState(279);
			match(CLB_TOKEN);
			setState(280);
			((IfElseContext)_localctx).body = mainBlock();
			setState(281);
			match(CRB_TOKEN);

			          ((IfElseContext)_localctx).node = new IfElseBlock(((IfElseContext)_localctx).ifBlc.node.getCondition(), ((IfElseContext)_localctx).ifBlc.node.getBody(), ((IfElseContext)_localctx).body.main);
			      
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
		public MathExpressionContext left;
		public MathExpressionContext right;
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
			if ( listener instanceof ExpressionListener) ((ExpressionListener)listener).enterRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener) ((ExpressionListener)listener).exitRange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor) return ((ExpressionVisitor<? extends T>)visitor).visitRange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeContext range() throws RecognitionException {
		RangeContext _localctx = new RangeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_range);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(RLB_TOKEN);
			setState(285);
			((RangeContext)_localctx).left = mathExpression(0);
			setState(286);
			match(COLON_G_TOKEN);
			setState(287);
			((RangeContext)_localctx).right = mathExpression(0);
			setState(288);
			match(RRB_TOKEN);
			((RangeContext)_localctx).rng = new Range(((RangeContext)_localctx).left.expr, ((RangeContext)_localctx).right.expr);
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
		public Types tpe;
		public Var var;
		public Token VARIABLE_TOKEN;
		public TerminalNode VARIABLE_TOKEN() { return getToken(ExpressionParser.VARIABLE_TOKEN, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public VariableContext(ParserRuleContext parent, int invokingState, Types tpe) {
			super(parent, invokingState);
			this.tpe = tpe;
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener) ((ExpressionListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener) ((ExpressionListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor) return ((ExpressionVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable(Types tpe) throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState(), tpe);
		enterRule(_localctx, 28, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			((VariableContext)_localctx).VARIABLE_TOKEN = match(VARIABLE_TOKEN);
			((VariableContext)_localctx).var =  new Var((((VariableContext)_localctx).VARIABLE_TOKEN!=null?((VariableContext)_localctx).VARIABLE_TOKEN.getText():null), tpe);
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
			if ( listener instanceof ExpressionListener) ((ExpressionListener)listener).enterNewLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener) ((ExpressionListener)listener).exitNewLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor) return ((ExpressionVisitor<? extends T>)visitor).visitNewLine(this);
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
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_newLine, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				}
				break;
			case 2:
				{
				setState(295);
				match(NEW_LINE);
				}
				break;
			case 3:
				{
				setState(296);
				match(NEW_LINE);
				setState(297);
				newLine(3);
				}
				break;
			case 4:
				{
				setState(298);
				match(WHITE_SPACE);
				setState(299);
				newLine(2);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(306);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new NewLineContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_newLine);
					setState(302);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(303);
					match(WHITE_SPACE);
					}
					} 
				}
				setState(308);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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
			if ( listener instanceof ExpressionListener) ((ExpressionListener)listener).enterMaybeNewLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener) ((ExpressionListener)listener).exitMaybeNewLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor) return ((ExpressionVisitor<? extends T>)visitor).visitMaybeNewLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MaybeNewLineContext maybeNewLine() throws RecognitionException {
		MaybeNewLineContext _localctx = new MaybeNewLineContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_maybeNewLine);
		try {
			setState(311);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(309);
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
		public MathExpression expr;
		public MathExpressionContext left;
		public MathExpressionContext mtExpr;
		public VariableContext var;
		public Token INTEGER;
		public Token DECIMAL;
		public MathOperatorsContext op;
		public MathExpressionContext right;
		public TerminalNode RLB_TOKEN() { return getToken(ExpressionParser.RLB_TOKEN, 0); }
		public TerminalNode RRB_TOKEN() { return getToken(ExpressionParser.RRB_TOKEN, 0); }
		public List<MathExpressionContext> mathExpression() {
			return getRuleContexts(MathExpressionContext.class);
		}
		public MathExpressionContext mathExpression(int i) {
			return getRuleContext(MathExpressionContext.class,i);
		}
		public List<TerminalNode> WHITE_SPACE() { return getTokens(ExpressionParser.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(ExpressionParser.WHITE_SPACE, i);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode INTEGER() { return getToken(ExpressionParser.INTEGER, 0); }
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
			if ( listener instanceof ExpressionListener) ((ExpressionListener)listener).enterMathExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener) ((ExpressionListener)listener).exitMathExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor) return ((ExpressionVisitor<? extends T>)visitor).visitMathExpression(this);
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
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_mathExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RLB_TOKEN:
				{
				setState(314);
				match(RLB_TOKEN);
				setState(318);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITE_SPACE) {
					{
					{
					setState(315);
					match(WHITE_SPACE);
					}
					}
					setState(320);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(321);
				((MathExpressionContext)_localctx).mtExpr = mathExpression(0);
				setState(325);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITE_SPACE) {
					{
					{
					setState(322);
					match(WHITE_SPACE);
					}
					}
					setState(327);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(328);
				match(RRB_TOKEN);

				          ((MathExpressionContext)_localctx).expr = new MathExpression((((MathExpressionContext)_localctx).mtExpr!=null?_input.getText(((MathExpressionContext)_localctx).mtExpr.start,((MathExpressionContext)_localctx).mtExpr.stop):null), ((MathExpressionContext)_localctx).mtExpr.expr.getType());
				      
				}
				break;
			case VARIABLE_TOKEN:
				{
				setState(331);
				((MathExpressionContext)_localctx).var = variable(Types.Unknown);

				          ((MathExpressionContext)_localctx).expr = new MathExpression(((MathExpressionContext)_localctx).var.var.toString(0), Types.Unknown);
				      
				}
				break;
			case INTEGER:
				{
				setState(334);
				((MathExpressionContext)_localctx).INTEGER = match(INTEGER);

				          ((MathExpressionContext)_localctx).expr = new MathExpression((((MathExpressionContext)_localctx).INTEGER!=null?((MathExpressionContext)_localctx).INTEGER.getText():null), Types.Int);
				      
				}
				break;
			case DECIMAL:
				{
				setState(336);
				((MathExpressionContext)_localctx).DECIMAL = match(DECIMAL);

				          ((MathExpressionContext)_localctx).expr = new MathExpression((((MathExpressionContext)_localctx).DECIMAL!=null?((MathExpressionContext)_localctx).DECIMAL.getText():null), Types.Double);
				      
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(359);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MathExpressionContext(_parentctx, _parentState);
					_localctx.left = _prevctx;
					_localctx.left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_mathExpression);
					setState(340);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(344);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WHITE_SPACE) {
						{
						{
						setState(341);
						match(WHITE_SPACE);
						}
						}
						setState(346);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(347);
					((MathExpressionContext)_localctx).op = mathOperators();
					setState(351);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WHITE_SPACE) {
						{
						{
						setState(348);
						match(WHITE_SPACE);
						}
						}
						setState(353);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(354);
					((MathExpressionContext)_localctx).right = mathExpression(5);

					                    if(((MathExpressionContext)_localctx).left.expr.getType() == Types.Double || ((MathExpressionContext)_localctx).right.expr.getType() == Types.Double) {
					                        ((MathExpressionContext)_localctx).expr = new MathExpression((((MathExpressionContext)_localctx).left!=null?_input.getText(((MathExpressionContext)_localctx).left.start,((MathExpressionContext)_localctx).left.stop):null) + " " + (((MathExpressionContext)_localctx).op!=null?_input.getText(((MathExpressionContext)_localctx).op.start,((MathExpressionContext)_localctx).op.stop):null) + " " + (((MathExpressionContext)_localctx).right!=null?_input.getText(((MathExpressionContext)_localctx).right.start,((MathExpressionContext)_localctx).right.stop):null), Types.Double);
					                    } else {
					                        ((MathExpressionContext)_localctx).expr = new MathExpression((((MathExpressionContext)_localctx).left!=null?_input.getText(((MathExpressionContext)_localctx).left.start,((MathExpressionContext)_localctx).left.stop):null) + " " + (((MathExpressionContext)_localctx).op!=null?_input.getText(((MathExpressionContext)_localctx).op.start,((MathExpressionContext)_localctx).op.stop):null) + " " + (((MathExpressionContext)_localctx).right!=null?_input.getText(((MathExpressionContext)_localctx).right.start,((MathExpressionContext)_localctx).right.stop):null), Types.Int);
					                    }

					                
					}
					} 
				}
				setState(361);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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
			if ( listener instanceof ExpressionListener) ((ExpressionListener)listener).enterBinaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener) ((ExpressionListener)listener).exitBinaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor) return ((ExpressionVisitor<? extends T>)visitor).visitBinaryExpression(this);
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
			if ( listener instanceof ExpressionListener) ((ExpressionListener)listener).enterBoolExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener) ((ExpressionListener)listener).exitBoolExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor) return ((ExpressionVisitor<? extends T>)visitor).visitBoolExpression(this);
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
			if ( listener instanceof ExpressionListener) ((ExpressionListener)listener).enterIdentifierExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener) ((ExpressionListener)listener).exitIdentifierExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor) return ((ExpressionVisitor<? extends T>)visitor).visitIdentifierExpression(this);
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
			if ( listener instanceof ExpressionListener) ((ExpressionListener)listener).enterNotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener) ((ExpressionListener)listener).exitNotExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor) return ((ExpressionVisitor<? extends T>)visitor).visitNotExpression(this);
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
			if ( listener instanceof ExpressionListener) ((ExpressionListener)listener).enterParenExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener) ((ExpressionListener)listener).exitParenExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor) return ((ExpressionVisitor<? extends T>)visitor).visitParenExpression(this);
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
			if ( listener instanceof ExpressionListener) ((ExpressionListener)listener).enterMathhExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener) ((ExpressionListener)listener).exitMathhExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor) return ((ExpressionVisitor<? extends T>)visitor).visitMathhExpression(this);
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
			if ( listener instanceof ExpressionListener) ((ExpressionListener)listener).enterComparatorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener) ((ExpressionListener)listener).exitComparatorExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor) return ((ExpressionVisitor<? extends T>)visitor).visitComparatorExpression(this);
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
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_logExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				_localctx = new ParenExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(363);
				match(RLB_TOKEN);
				setState(367);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITE_SPACE) {
					{
					{
					setState(364);
					match(WHITE_SPACE);
					}
					}
					setState(369);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(370);
				logExpression(0);
				setState(374);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITE_SPACE) {
					{
					{
					setState(371);
					match(WHITE_SPACE);
					}
					}
					setState(376);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(377);
				match(RRB_TOKEN);
				}
				break;
			case 2:
				{
				_localctx = new NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(379);
				match(NOT_TOKEN);
				setState(383);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITE_SPACE) {
					{
					{
					setState(380);
					match(WHITE_SPACE);
					}
					}
					setState(385);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(386);
				logExpression(6);
				}
				break;
			case 3:
				{
				_localctx = new BoolExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(387);
				bool();
				}
				break;
			case 4:
				{
				_localctx = new IdentifierExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(388);
				variable(Types.Unknown);
				}
				break;
			case 5:
				{
				_localctx = new MathhExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(389);
				((MathhExpressionContext)_localctx).me = mathExpression(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(426);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(424);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
					case 1:
						{
						_localctx = new ComparatorExpressionContext(new LogExpressionContext(_parentctx, _parentState));
						((ComparatorExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_logExpression);
						setState(392);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(396);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WHITE_SPACE) {
							{
							{
							setState(393);
							match(WHITE_SPACE);
							}
							}
							setState(398);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(399);
						((ComparatorExpressionContext)_localctx).op = comparator();
						setState(403);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WHITE_SPACE) {
							{
							{
							setState(400);
							match(WHITE_SPACE);
							}
							}
							setState(405);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(406);
						((ComparatorExpressionContext)_localctx).right = logExpression(6);
						}
						break;
					case 2:
						{
						_localctx = new BinaryExpressionContext(new LogExpressionContext(_parentctx, _parentState));
						((BinaryExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_logExpression);
						setState(408);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(412);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WHITE_SPACE) {
							{
							{
							setState(409);
							match(WHITE_SPACE);
							}
							}
							setState(414);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(415);
						((BinaryExpressionContext)_localctx).op = binary();
						setState(419);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WHITE_SPACE) {
							{
							{
							setState(416);
							match(WHITE_SPACE);
							}
							}
							setState(421);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(422);
						((BinaryExpressionContext)_localctx).right = logExpression(5);
						}
						break;
					}
					} 
				}
				setState(428);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
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

	public static class NumberContext extends ParserRuleContext {
		public String str;
		public Token DECIMAL;
		public Token INTEGER;
		public TerminalNode DECIMAL() { return getToken(ExpressionParser.DECIMAL, 0); }
		public TerminalNode INTEGER() { return getToken(ExpressionParser.INTEGER, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener) ((ExpressionListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener) ((ExpressionListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor) return ((ExpressionVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			((NumberContext)_localctx).DECIMAL = match(DECIMAL);
			((NumberContext)_localctx).str = new String((((NumberContext)_localctx).DECIMAL!=null?((NumberContext)_localctx).DECIMAL.getText():null));
			setState(431);
			((NumberContext)_localctx).INTEGER = match(INTEGER);
			((NumberContext)_localctx).str = new String((((NumberContext)_localctx).INTEGER!=null?((NumberContext)_localctx).INTEGER.getText():null));
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

	public static class ReadVarContext extends ParserRuleContext {
		public Var var;
		public ReadVar tpe;
		public TerminalNode READ_INT_TYPE() { return getToken(ExpressionParser.READ_INT_TYPE, 0); }
		public TerminalNode RLB_TOKEN() { return getToken(ExpressionParser.RLB_TOKEN, 0); }
		public TerminalNode RRB_TOKEN() { return getToken(ExpressionParser.RRB_TOKEN, 0); }
		public TerminalNode READ_DOUBLE_TYPE() { return getToken(ExpressionParser.READ_DOUBLE_TYPE, 0); }
		public TerminalNode READ_CHAR_TYPE() { return getToken(ExpressionParser.READ_CHAR_TYPE, 0); }
		public TerminalNode READ_BOOL_TYPE() { return getToken(ExpressionParser.READ_BOOL_TYPE, 0); }
		public ReadVarContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ReadVarContext(ParserRuleContext parent, int invokingState, Var var) {
			super(parent, invokingState);
			this.var = var;
		}
		@Override public int getRuleIndex() { return RULE_readVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener) ((ExpressionListener)listener).enterReadVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener) ((ExpressionListener)listener).exitReadVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor) return ((ExpressionVisitor<? extends T>)visitor).visitReadVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadVarContext readVar(Var var) throws RecognitionException {
		ReadVarContext _localctx = new ReadVarContext(_ctx, getState(), var);
		enterRule(_localctx, 40, RULE_readVar);
		try {
			setState(450);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case READ_INT_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(434);
				match(READ_INT_TYPE);
				setState(435);
				match(RLB_TOKEN);
				setState(436);
				match(RRB_TOKEN);
				((ReadVarContext)_localctx).tpe =  new ReadVar(var, Types.Int);
				}
				break;
			case READ_DOUBLE_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(438);
				match(READ_DOUBLE_TYPE);
				setState(439);
				match(RLB_TOKEN);
				setState(440);
				match(RRB_TOKEN);
				((ReadVarContext)_localctx).tpe =  new ReadVar(var, Types.Double);
				}
				break;
			case READ_CHAR_TYPE:
				enterOuterAlt(_localctx, 3);
				{
				setState(442);
				match(READ_CHAR_TYPE);
				setState(443);
				match(RLB_TOKEN);
				setState(444);
				match(RRB_TOKEN);
				((ReadVarContext)_localctx).tpe =  new ReadVar(var, Types.Char);
				}
				break;
			case READ_BOOL_TYPE:
				enterOuterAlt(_localctx, 4);
				{
				setState(446);
				match(READ_BOOL_TYPE);
				setState(447);
				match(RLB_TOKEN);
				setState(448);
				match(RRB_TOKEN);
				((ReadVarContext)_localctx).tpe =  new ReadVar(var, Types.Bool);
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
			if ( listener instanceof ExpressionListener) ((ExpressionListener)listener).enterConstOrVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener) ((ExpressionListener)listener).exitConstOrVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor) return ((ExpressionVisitor<? extends T>)visitor).visitConstOrVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstOrVarContext constOrVar() throws RecognitionException {
		ConstOrVarContext _localctx = new ConstOrVarContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_constOrVar);
		try {
			setState(456);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR_TOKEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(452);
				match(VAR_TOKEN);
				((ConstOrVarContext)_localctx).mutable = ConstOrVar.VAR;
				}
				break;
			case LET_TOKEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(454);
				match(LET_TOKEN);
				((ConstOrVarContext)_localctx).mutable = ConstOrVar.LET;
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
			if ( listener instanceof ExpressionListener) ((ExpressionListener)listener).enterMathOperators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener) ((ExpressionListener)listener).exitMathOperators(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor) return ((ExpressionVisitor<? extends T>)visitor).visitMathOperators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MathOperatorsContext mathOperators() throws RecognitionException {
		MathOperatorsContext _localctx = new MathOperatorsContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_mathOperators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
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
			if ( listener instanceof ExpressionListener) ((ExpressionListener)listener).enterComparator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener) ((ExpressionListener)listener).exitComparator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor) return ((ExpressionVisitor<? extends T>)visitor).visitComparator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparatorContext comparator() throws RecognitionException {
		ComparatorContext _localctx = new ComparatorContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_comparator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
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
			if ( listener instanceof ExpressionListener) ((ExpressionListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener) ((ExpressionListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor) return ((ExpressionVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_type);
		try {
			setState(470);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(462);
				match(INT_TYPE);
				((TypeContext)_localctx).t = Types.Int;
				}
				break;
			case DOUBLE_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(464);
				match(DOUBLE_TYPE);
				((TypeContext)_localctx).t = Types.Double;
				}
				break;
			case CHAR_TYPE:
				enterOuterAlt(_localctx, 3);
				{
				setState(466);
				match(CHAR_TYPE);
				((TypeContext)_localctx).t = Types.Char;
				}
				break;
			case BOOL_TYPE:
				enterOuterAlt(_localctx, 4);
				{
				setState(468);
				match(BOOL_TYPE);
				((TypeContext)_localctx).t = Types.Bool;
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
			if ( listener instanceof ExpressionListener) ((ExpressionListener)listener).enterBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener) ((ExpressionListener)listener).exitBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor) return ((ExpressionVisitor<? extends T>)visitor).visitBinary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryContext binary() throws RecognitionException {
		BinaryContext _localctx = new BinaryContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_binary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(472);
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
			if ( listener instanceof ExpressionListener) ((ExpressionListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener) ((ExpressionListener)listener).exitBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor) return ((ExpressionVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
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
		case 15:
			return newLine_sempred((NewLineContext)_localctx, predIndex);
		case 17:
			return mathExpression_sempred((MathExpressionContext)_localctx, predIndex);
		case 18:
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
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean logExpression_sempred(LogExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61\u01df\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\5\3F\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\5\4k\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\177\n\5\3\6\3\6\3\6\3\6\3\6\7\6"+
		"\u0086\n\6\f\6\16\6\u0089\13\6\3\6\3\6\7\6\u008d\n\6\f\6\16\6\u0090\13"+
		"\6\3\6\3\6\7\6\u0094\n\6\f\6\16\6\u0097\13\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\7\6\u00a1\n\6\f\6\16\6\u00a4\13\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7"+
		"\6\u00ad\n\6\f\6\16\6\u00b0\13\6\3\6\3\6\7\6\u00b4\n\6\f\6\16\6\u00b7"+
		"\13\6\3\6\3\6\3\6\5\6\u00bc\n\6\3\7\3\7\7\7\u00c0\n\7\f\7\16\7\u00c3\13"+
		"\7\3\7\3\7\7\7\u00c7\n\7\f\7\16\7\u00ca\13\7\3\7\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\5\b\u00d8\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\7\13\u00f7\n\13\f\13\16\13\u00fa\13\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u010b\n\f\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\5\21\u012f\n\21\3\21\3\21\7\21\u0133\n\21\f\21\16\21"+
		"\u0136\13\21\3\22\3\22\5\22\u013a\n\22\3\23\3\23\3\23\7\23\u013f\n\23"+
		"\f\23\16\23\u0142\13\23\3\23\3\23\7\23\u0146\n\23\f\23\16\23\u0149\13"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0155\n\23"+
		"\3\23\3\23\7\23\u0159\n\23\f\23\16\23\u015c\13\23\3\23\3\23\7\23\u0160"+
		"\n\23\f\23\16\23\u0163\13\23\3\23\3\23\3\23\7\23\u0168\n\23\f\23\16\23"+
		"\u016b\13\23\3\24\3\24\3\24\7\24\u0170\n\24\f\24\16\24\u0173\13\24\3\24"+
		"\3\24\7\24\u0177\n\24\f\24\16\24\u017a\13\24\3\24\3\24\3\24\3\24\7\24"+
		"\u0180\n\24\f\24\16\24\u0183\13\24\3\24\3\24\3\24\3\24\5\24\u0189\n\24"+
		"\3\24\3\24\7\24\u018d\n\24\f\24\16\24\u0190\13\24\3\24\3\24\7\24\u0194"+
		"\n\24\f\24\16\24\u0197\13\24\3\24\3\24\3\24\3\24\7\24\u019d\n\24\f\24"+
		"\16\24\u01a0\13\24\3\24\3\24\7\24\u01a4\n\24\f\24\16\24\u01a7\13\24\3"+
		"\24\3\24\7\24\u01ab\n\24\f\24\16\24\u01ae\13\24\3\25\3\25\3\25\3\25\3"+
		"\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\5\26\u01c5\n\26\3\27\3\27\3\27\3\27\5\27\u01cb\n\27\3\30"+
		"\3\30\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u01d9\n\32"+
		"\3\33\3\33\3\34\3\34\3\34\2\5 $&\35\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\66\2\6\3\2\"&\3\2\',\3\2\35\36\3\2 !\2\u01fc\28"+
		"\3\2\2\2\4E\3\2\2\2\6j\3\2\2\2\b~\3\2\2\2\n\u00bb\3\2\2\2\f\u00bd\3\2"+
		"\2\2\16\u00d7\3\2\2\2\20\u00d9\3\2\2\2\22\u00e7\3\2\2\2\24\u00f0\3\2\2"+
		"\2\26\u010a\3\2\2\2\30\u010c\3\2\2\2\32\u0116\3\2\2\2\34\u011e\3\2\2\2"+
		"\36\u0125\3\2\2\2 \u012e\3\2\2\2\"\u0139\3\2\2\2$\u0154\3\2\2\2&\u0188"+
		"\3\2\2\2(\u01af\3\2\2\2*\u01c4\3\2\2\2,\u01ca\3\2\2\2.\u01cc\3\2\2\2\60"+
		"\u01ce\3\2\2\2\62\u01d8\3\2\2\2\64\u01da\3\2\2\2\66\u01dc\3\2\2\289\5"+
		"\4\3\29:\b\2\1\2:\3\3\2\2\2;F\3\2\2\2<=\5\"\22\2=>\5\6\4\2>?\5\4\3\2?"+
		"@\5\"\22\2@A\b\3\1\2AF\3\2\2\2BC\5\"\22\2CD\b\3\1\2DF\3\2\2\2E;\3\2\2"+
		"\2E<\3\2\2\2EB\3\2\2\2F\5\3\2\2\2GH\5\"\22\2HI\5\20\t\2IJ\5\"\22\2JK\b"+
		"\4\1\2Kk\3\2\2\2LM\5\"\22\2MN\5\22\n\2NO\5\"\22\2OP\b\4\1\2Pk\3\2\2\2"+
		"QR\5\"\22\2RS\5\24\13\2ST\5\"\22\2TU\b\4\1\2Uk\3\2\2\2VW\5\"\22\2WX\5"+
		"\26\f\2XY\5\"\22\2YZ\b\4\1\2Zk\3\2\2\2[\\\5\"\22\2\\]\5\f\7\2]^\5\"\22"+
		"\2^_\b\4\1\2_k\3\2\2\2`a\5\"\22\2ab\5\n\6\2bc\5\"\22\2cd\b\4\1\2dk\3\2"+
		"\2\2ef\5\"\22\2fg\5\b\5\2gh\5\"\22\2hi\b\4\1\2ik\3\2\2\2jG\3\2\2\2jL\3"+
		"\2\2\2jQ\3\2\2\2jV\3\2\2\2j[\3\2\2\2j`\3\2\2\2je\3\2\2\2k\7\3\2\2\2lm"+
		"\7\13\2\2mn\7\31\2\2no\5\36\20\2op\7\32\2\2pq\b\5\1\2q\177\3\2\2\2rs\7"+
		"\13\2\2st\7\31\2\2tu\5$\23\2uv\7\32\2\2vw\b\5\1\2w\177\3\2\2\2xy\7\13"+
		"\2\2yz\7\31\2\2z{\5&\24\2{|\7\32\2\2|}\b\5\1\2}\177\3\2\2\2~l\3\2\2\2"+
		"~r\3\2\2\2~x\3\2\2\2\177\t\3\2\2\2\u0080\u0081\5,\27\2\u0081\u0082\7\61"+
		"\2\2\u0082\u0083\5\36\20\2\u0083\u0087\7\26\2\2\u0084\u0086\7\61\2\2\u0085"+
		"\u0084\3\2\2\2\u0086\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2"+
		"\2\2\u0088\u008a\3\2\2\2\u0089\u0087\3\2\2\2\u008a\u008e\5\62\32\2\u008b"+
		"\u008d\7\61\2\2\u008c\u008b\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3"+
		"\2\2\2\u008e\u008f\3\2\2\2\u008f\u0091\3\2\2\2\u0090\u008e\3\2\2\2\u0091"+
		"\u0095\7\17\2\2\u0092\u0094\7\61\2\2\u0093\u0092\3\2\2\2\u0094\u0097\3"+
		"\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0098\3\2\2\2\u0097"+
		"\u0095\3\2\2\2\u0098\u0099\5\16\b\2\u0099\u009a\b\6\1\2\u009a\u00bc\3"+
		"\2\2\2\u009b\u009c\5,\27\2\u009c\u009d\7\61\2\2\u009d\u009e\5\36\20\2"+
		"\u009e\u00a2\7\26\2\2\u009f\u00a1\7\61\2\2\u00a0\u009f\3\2\2\2\u00a1\u00a4"+
		"\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a5\3\2\2\2\u00a4"+
		"\u00a2\3\2\2\2\u00a5\u00a6\5\62\32\2\u00a6\u00a7\b\6\1\2\u00a7\u00bc\3"+
		"\2\2\2\u00a8\u00a9\5,\27\2\u00a9\u00aa\7\61\2\2\u00aa\u00ae\5\36\20\2"+
		"\u00ab\u00ad\7\61\2\2\u00ac\u00ab\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00ac"+
		"\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b1\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1"+
		"\u00b5\7\17\2\2\u00b2\u00b4\7\61\2\2\u00b3\u00b2\3\2\2\2\u00b4\u00b7\3"+
		"\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b8\3\2\2\2\u00b7"+
		"\u00b5\3\2\2\2\u00b8\u00b9\5\16\b\2\u00b9\u00ba\b\6\1\2\u00ba\u00bc\3"+
		"\2\2\2\u00bb\u0080\3\2\2\2\u00bb\u009b\3\2\2\2\u00bb\u00a8\3\2\2\2\u00bc"+
		"\13\3\2\2\2\u00bd\u00c1\5\36\20\2\u00be\u00c0\7\61\2\2\u00bf\u00be\3\2"+
		"\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2"+
		"\u00c4\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c8\7\17\2\2\u00c5\u00c7\7"+
		"\61\2\2\u00c6\u00c5\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8"+
		"\u00c9\3\2\2\2\u00c9\u00cb\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00cc\5\16"+
		"\b\2\u00cc\u00cd\b\7\1\2\u00cd\r\3\2\2\2\u00ce\u00cf\5$\23\2\u00cf\u00d0"+
		"\b\b\1\2\u00d0\u00d8\3\2\2\2\u00d1\u00d2\5*\26\2\u00d2\u00d3\b\b\1\2\u00d3"+
		"\u00d8\3\2\2\2\u00d4\u00d5\5&\24\2\u00d5\u00d6\b\b\1\2\u00d6\u00d8\3\2"+
		"\2\2\u00d7\u00ce\3\2\2\2\u00d7\u00d1\3\2\2\2\u00d7\u00d4\3\2\2\2\u00d8"+
		"\17\3\2\2\2\u00d9\u00da\7\22\2\2\u00da\u00db\7\61\2\2\u00db\u00dc\5\36"+
		"\20\2\u00dc\u00dd\7\61\2\2\u00dd\u00de\7\23\2\2\u00de\u00df\7\61\2\2\u00df"+
		"\u00e0\7\24\2\2\u00e0\u00e1\5\34\17\2\u00e1\u00e2\5\"\22\2\u00e2\u00e3"+
		"\7\33\2\2\u00e3\u00e4\5\4\3\2\u00e4\u00e5\7\34\2\2\u00e5\u00e6\b\t\1\2"+
		"\u00e6\21\3\2\2\2\u00e7\u00e8\7\21\2\2\u00e8\u00e9\7\61\2\2\u00e9\u00ea"+
		"\5&\24\2\u00ea\u00eb\5\"\22\2\u00eb\u00ec\7\33\2\2\u00ec\u00ed\5\4\3\2"+
		"\u00ed\u00ee\7\34\2\2\u00ee\u00ef\b\n\1\2\u00ef\23\3\2\2\2\u00f0\u00f1"+
		"\7\20\2\2\u00f1\u00f2\5\"\22\2\u00f2\u00f3\7\33\2\2\u00f3\u00f4\5\4\3"+
		"\2\u00f4\u00f8\7\34\2\2\u00f5\u00f7\7\61\2\2\u00f6\u00f5\3\2\2\2\u00f7"+
		"\u00fa\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fb\3\2"+
		"\2\2\u00fa\u00f8\3\2\2\2\u00fb\u00fc\7\21\2\2\u00fc\u00fd\7\61\2\2\u00fd"+
		"\u00fe\5&\24\2\u00fe\u00ff\b\13\1\2\u00ff\25\3\2\2\2\u0100\u0101\5\"\22"+
		"\2\u0101\u0102\5\30\r\2\u0102\u0103\5\"\22\2\u0103\u0104\b\f\1\2\u0104"+
		"\u010b\3\2\2\2\u0105\u0106\5\"\22\2\u0106\u0107\5\32\16\2\u0107\u0108"+
		"\5\"\22\2\u0108\u0109\b\f\1\2\u0109\u010b\3\2\2\2\u010a\u0100\3\2\2\2"+
		"\u010a\u0105\3\2\2\2\u010b\27\3\2\2\2\u010c\u010d\7\27\2\2\u010d\u010e"+
		"\7\61\2\2\u010e\u010f\5&\24\2\u010f\u0110\5\"\22\2\u0110\u0111\7\33\2"+
		"\2\u0111\u0112\5\4\3\2\u0112\u0113\7\34\2\2\u0113\u0114\5\"\22\2\u0114"+
		"\u0115\b\r\1\2\u0115\31\3\2\2\2\u0116\u0117\5\30\r\2\u0117\u0118\7\30"+
		"\2\2\u0118\u0119\5\"\22\2\u0119\u011a\7\33\2\2\u011a\u011b\5\4\3\2\u011b"+
		"\u011c\7\34\2\2\u011c\u011d\b\16\1\2\u011d\33\3\2\2\2\u011e\u011f\7\31"+
		"\2\2\u011f\u0120\5$\23\2\u0120\u0121\7\25\2\2\u0121\u0122\5$\23\2\u0122"+
		"\u0123\7\32\2\2\u0123\u0124\b\17\1\2\u0124\35\3\2\2\2\u0125\u0126\7/\2"+
		"\2\u0126\u0127\b\20\1\2\u0127\37\3\2\2\2\u0128\u012f\b\21\1\2\u0129\u012f"+
		"\7\60\2\2\u012a\u012b\7\60\2\2\u012b\u012f\5 \21\5\u012c\u012d\7\61\2"+
		"\2\u012d\u012f\5 \21\4\u012e\u0128\3\2\2\2\u012e\u0129\3\2\2\2\u012e\u012a"+
		"\3\2\2\2\u012e\u012c\3\2\2\2\u012f\u0134\3\2\2\2\u0130\u0131\f\3\2\2\u0131"+
		"\u0133\7\61\2\2\u0132\u0130\3\2\2\2\u0133\u0136\3\2\2\2\u0134\u0132\3"+
		"\2\2\2\u0134\u0135\3\2\2\2\u0135!\3\2\2\2\u0136\u0134\3\2\2\2\u0137\u013a"+
		"\5 \21\2\u0138\u013a\3\2\2\2\u0139\u0137\3\2\2\2\u0139\u0138\3\2\2\2\u013a"+
		"#\3\2\2\2\u013b\u013c\b\23\1\2\u013c\u0140\7\31\2\2\u013d\u013f\7\61\2"+
		"\2\u013e\u013d\3\2\2\2\u013f\u0142\3\2\2\2\u0140\u013e\3\2\2\2\u0140\u0141"+
		"\3\2\2\2\u0141\u0143\3\2\2\2\u0142\u0140\3\2\2\2\u0143\u0147\5$\23\2\u0144"+
		"\u0146\7\61\2\2\u0145\u0144\3\2\2\2\u0146\u0149\3\2\2\2\u0147\u0145\3"+
		"\2\2\2\u0147\u0148\3\2\2\2\u0148\u014a\3\2\2\2\u0149\u0147\3\2\2\2\u014a"+
		"\u014b\7\32\2\2\u014b\u014c\b\23\1\2\u014c\u0155\3\2\2\2\u014d\u014e\5"+
		"\36\20\2\u014e\u014f\b\23\1\2\u014f\u0155\3\2\2\2\u0150\u0151\7-\2\2\u0151"+
		"\u0155\b\23\1\2\u0152\u0153\7.\2\2\u0153\u0155\b\23\1\2\u0154\u013b\3"+
		"\2\2\2\u0154\u014d\3\2\2\2\u0154\u0150\3\2\2\2\u0154\u0152\3\2\2\2\u0155"+
		"\u0169\3\2\2\2\u0156\u015a\f\6\2\2\u0157\u0159\7\61\2\2\u0158\u0157\3"+
		"\2\2\2\u0159\u015c\3\2\2\2\u015a\u0158\3\2\2\2\u015a\u015b\3\2\2\2\u015b"+
		"\u015d\3\2\2\2\u015c\u015a\3\2\2\2\u015d\u0161\5.\30\2\u015e\u0160\7\61"+
		"\2\2\u015f\u015e\3\2\2\2\u0160\u0163\3\2\2\2\u0161\u015f\3\2\2\2\u0161"+
		"\u0162\3\2\2\2\u0162\u0164\3\2\2\2\u0163\u0161\3\2\2\2\u0164\u0165\5$"+
		"\23\7\u0165\u0166\b\23\1\2\u0166\u0168\3\2\2\2\u0167\u0156\3\2\2\2\u0168"+
		"\u016b\3\2\2\2\u0169\u0167\3\2\2\2\u0169\u016a\3\2\2\2\u016a%\3\2\2\2"+
		"\u016b\u0169\3\2\2\2\u016c\u016d\b\24\1\2\u016d\u0171\7\31\2\2\u016e\u0170"+
		"\7\61\2\2\u016f\u016e\3\2\2\2\u0170\u0173\3\2\2\2\u0171\u016f\3\2\2\2"+
		"\u0171\u0172\3\2\2\2\u0172\u0174\3\2\2\2\u0173\u0171\3\2\2\2\u0174\u0178"+
		"\5&\24\2\u0175\u0177\7\61\2\2\u0176\u0175\3\2\2\2\u0177\u017a\3\2\2\2"+
		"\u0178\u0176\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u017b\3\2\2\2\u017a\u0178"+
		"\3\2\2\2\u017b\u017c\7\32\2\2\u017c\u0189\3\2\2\2\u017d\u0181\7\37\2\2"+
		"\u017e\u0180\7\61\2\2\u017f\u017e\3\2\2\2\u0180\u0183\3\2\2\2\u0181\u017f"+
		"\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0184\3\2\2\2\u0183\u0181\3\2\2\2\u0184"+
		"\u0189\5&\24\b\u0185\u0189\5\66\34\2\u0186\u0189\5\36\20\2\u0187\u0189"+
		"\5$\23\2\u0188\u016c\3\2\2\2\u0188\u017d\3\2\2\2\u0188\u0185\3\2\2\2\u0188"+
		"\u0186\3\2\2\2\u0188\u0187\3\2\2\2\u0189\u01ac\3\2\2\2\u018a\u018e\f\7"+
		"\2\2\u018b\u018d\7\61\2\2\u018c\u018b\3\2\2\2\u018d\u0190\3\2\2\2\u018e"+
		"\u018c\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u0191\3\2\2\2\u0190\u018e\3\2"+
		"\2\2\u0191\u0195\5\60\31\2\u0192\u0194\7\61\2\2\u0193\u0192\3\2\2\2\u0194"+
		"\u0197\3\2\2\2\u0195\u0193\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u0198\3\2"+
		"\2\2\u0197\u0195\3\2\2\2\u0198\u0199\5&\24\b\u0199\u01ab\3\2\2\2\u019a"+
		"\u019e\f\6\2\2\u019b\u019d\7\61\2\2\u019c\u019b\3\2\2\2\u019d\u01a0\3"+
		"\2\2\2\u019e\u019c\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a1\3\2\2\2\u01a0"+
		"\u019e\3\2\2\2\u01a1\u01a5\5\64\33\2\u01a2\u01a4\7\61\2\2\u01a3\u01a2"+
		"\3\2\2\2\u01a4\u01a7\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6"+
		"\u01a8\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a8\u01a9\5&\24\7\u01a9\u01ab\3\2"+
		"\2\2\u01aa\u018a\3\2\2\2\u01aa\u019a\3\2\2\2\u01ab\u01ae\3\2\2\2\u01ac"+
		"\u01aa\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\'\3\2\2\2\u01ae\u01ac\3\2\2\2"+
		"\u01af\u01b0\7.\2\2\u01b0\u01b1\b\25\1\2\u01b1\u01b2\7-\2\2\u01b2\u01b3"+
		"\b\25\1\2\u01b3)\3\2\2\2\u01b4\u01b5\7\7\2\2\u01b5\u01b6\7\31\2\2\u01b6"+
		"\u01b7\7\32\2\2\u01b7\u01c5\b\26\1\2\u01b8\u01b9\7\b\2\2\u01b9\u01ba\7"+
		"\31\2\2\u01ba\u01bb\7\32\2\2\u01bb\u01c5\b\26\1\2\u01bc\u01bd\7\t\2\2"+
		"\u01bd\u01be\7\31\2\2\u01be\u01bf\7\32\2\2\u01bf\u01c5\b\26\1\2\u01c0"+
		"\u01c1\7\n\2\2\u01c1\u01c2\7\31\2\2\u01c2\u01c3\7\32\2\2\u01c3\u01c5\b"+
		"\26\1\2\u01c4\u01b4\3\2\2\2\u01c4\u01b8\3\2\2\2\u01c4\u01bc\3\2\2\2\u01c4"+
		"\u01c0\3\2\2\2\u01c5+\3\2\2\2\u01c6\u01c7\7\r\2\2\u01c7\u01cb\b\27\1\2"+
		"\u01c8\u01c9\7\16\2\2\u01c9\u01cb\b\27\1\2\u01ca\u01c6\3\2\2\2\u01ca\u01c8"+
		"\3\2\2\2\u01cb-\3\2\2\2\u01cc\u01cd\t\2\2\2\u01cd/\3\2\2\2\u01ce\u01cf"+
		"\t\3\2\2\u01cf\61\3\2\2\2\u01d0\u01d1\7\3\2\2\u01d1\u01d9\b\32\1\2\u01d2"+
		"\u01d3\7\4\2\2\u01d3\u01d9\b\32\1\2\u01d4\u01d5\7\5\2\2\u01d5\u01d9\b"+
		"\32\1\2\u01d6\u01d7\7\6\2\2\u01d7\u01d9\b\32\1\2\u01d8\u01d0\3\2\2\2\u01d8"+
		"\u01d2\3\2\2\2\u01d8\u01d4\3\2\2\2\u01d8\u01d6\3\2\2\2\u01d9\63\3\2\2"+
		"\2\u01da\u01db\t\4\2\2\u01db\65\3\2\2\2\u01dc\u01dd\t\5\2\2\u01dd\67\3"+
		"\2\2\2\'Ej~\u0087\u008e\u0095\u00a2\u00ae\u00b5\u00bb\u00c1\u00c8\u00d7"+
		"\u00f8\u010a\u012e\u0134\u0139\u0140\u0147\u0154\u015a\u0161\u0169\u0171"+
		"\u0178\u0181\u0188\u018e\u0195\u019e\u01a5\u01aa\u01ac\u01c4\u01ca\u01d8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}