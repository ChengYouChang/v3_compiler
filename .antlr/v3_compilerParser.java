// Generated from d:\meeting\thesis\myCompiler\Antlr8.1\v3_compiler\v3_compiler.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class v3_compilerParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT=1, VOID=2, RETURN=3, STRUCT=4, IF=5, ELSE=6, FOR=7, WHILE=8, LeftParen=9, 
		RightParen=10, LeftBracket=11, RightBracket=12, LeftBrace=13, RightBrace=14, 
		Less=15, LessEqual=16, Greater=17, GreaterEqual=18, LeftShift=19, RightShift=20, 
		Equal=21, NotEqual=22, Plus=23, Minus=24, PlusPlus=25, MinusMinus=26, 
		Star=27, Div=28, Mod=29, And=30, Or=31, AndAnd=32, OrOr=33, Caret=34, 
		Not=35, Tilde=36, Comma=37, Semi=38, Assign=39, StarAssign=40, DivAssign=41, 
		ModAssign=42, PlusAssign=43, MinusAssign=44, LeftShiftAssign=45, RightShiftAssign=46, 
		AndAssign=47, XorAssign=48, OrAssign=49, Dot=50, Arrow=51, IntegerConstant=52, 
		DecimalConstant=53, HexConstant=54, ID=55, Newline=56, WhiteSpace=57, 
		LineComment=58;
	public static final int
		RULE_globalSpace = 0, RULE_myGlobalCode = 1, RULE_myDeclare = 2, RULE_myFuncDefinition = 3, 
		RULE_myFuncInputPara = 4, RULE_myStatement = 5, RULE_myFuncBodyCode = 6, 
		RULE_myExpr = 7, RULE_mySelection = 8, RULE_myIteration = 9, RULE_myForCondi = 10, 
		RULE_myReturn = 11, RULE_myType = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"globalSpace", "myGlobalCode", "myDeclare", "myFuncDefinition", "myFuncInputPara", 
			"myStatement", "myFuncBodyCode", "myExpr", "mySelection", "myIteration", 
			"myForCondi", "myReturn", "myType"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'int'", "'void'", "'return'", "'struct'", "'if'", "'else'", "'for'", 
			"'while'", "'('", "')'", "'['", "']'", "'{'", "'}'", "'<'", "'<='", "'>'", 
			"'>='", "'<<'", "'>>'", "'=='", "'!='", "'+'", "'-'", "'++'", "'--'", 
			"'*'", "'/'", "'%'", "'&'", "'|'", "'&&'", "'||'", "'^'", "'!'", "'~'", 
			"','", "';'", "'='", "'*='", "'/='", "'%='", "'+='", "'-='", "'<<='", 
			"'>>='", "'&='", "'^='", "'|='", "'.'", "'->'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT", "VOID", "RETURN", "STRUCT", "IF", "ELSE", "FOR", "WHILE", 
			"LeftParen", "RightParen", "LeftBracket", "RightBracket", "LeftBrace", 
			"RightBrace", "Less", "LessEqual", "Greater", "GreaterEqual", "LeftShift", 
			"RightShift", "Equal", "NotEqual", "Plus", "Minus", "PlusPlus", "MinusMinus", 
			"Star", "Div", "Mod", "And", "Or", "AndAnd", "OrOr", "Caret", "Not", 
			"Tilde", "Comma", "Semi", "Assign", "StarAssign", "DivAssign", "ModAssign", 
			"PlusAssign", "MinusAssign", "LeftShiftAssign", "RightShiftAssign", "AndAssign", 
			"XorAssign", "OrAssign", "Dot", "Arrow", "IntegerConstant", "DecimalConstant", 
			"HexConstant", "ID", "Newline", "WhiteSpace", "LineComment"
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
	public String getGrammarFileName() { return "v3_compiler.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public v3_compilerParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class GlobalSpaceContext extends ParserRuleContext {
		public  finalAST = '';
		public MyGlobalCodeContext g;
		public List<MyGlobalCodeContext> myGlobalCode() {
			return getRuleContexts(MyGlobalCodeContext.class);
		}
		public MyGlobalCodeContext myGlobalCode(int i) {
			return getRuleContext(MyGlobalCodeContext.class,i);
		}
		public GlobalSpaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalSpace; }
	}

	public final GlobalSpaceContext globalSpace() throws RecognitionException {
		GlobalSpaceContext _localctx = new GlobalSpaceContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_globalSpace);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			_localctx.finalAST += '('
			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << VOID) | (1L << STRUCT))) != 0)) {
				{
				{
				setState(27);
				((GlobalSpaceContext)_localctx).g = myGlobalCode();
				_localctx.finalAST += '%s'%(((GlobalSpaceContext)_localctx).g.myGlobalAST)
				}
				}
				setState(34);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			_localctx.finalAST += ')myGlobal'
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

	public static class MyGlobalCodeContext extends ParserRuleContext {
		public  myGlobalAST = '';
		public MyDeclareContext d;
		public MyFuncDefinitionContext myFuncDefinition;
		public TerminalNode Semi() { return getToken(v3_compilerParser.Semi, 0); }
		public MyDeclareContext myDeclare() {
			return getRuleContext(MyDeclareContext.class,0);
		}
		public MyFuncDefinitionContext myFuncDefinition() {
			return getRuleContext(MyFuncDefinitionContext.class,0);
		}
		public MyGlobalCodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_myGlobalCode; }
	}

	public final MyGlobalCodeContext myGlobalCode() throws RecognitionException {
		MyGlobalCodeContext _localctx = new MyGlobalCodeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_myGlobalCode);
		try {
			setState(44);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(37);
				((MyGlobalCodeContext)_localctx).d = myDeclare();
				setState(38);
				match(Semi);
				_localctx.myGlobalAST += '(%s)myDeclare'%(((MyGlobalCodeContext)_localctx).d.myDeclareAST)
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(41);
				((MyGlobalCodeContext)_localctx).myFuncDefinition = myFuncDefinition();
				_localctx.myGlobalAST += '(%s)myFuncDefinition'%(((MyGlobalCodeContext)_localctx).myFuncDefinition.myFuncDefinitionAST)
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

	public static class MyDeclareContext extends ParserRuleContext {
		public  myDeclareAST = '';
		public MyTypeContext myType;
		public Token id1;
		public MyExprContext myExpr;
		public Token id2;
		public Token ID;
		public Token IntegerConstant;
		public Token int1;
		public Token int2;
		public MyTypeContext myType() {
			return getRuleContext(MyTypeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(v3_compilerParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(v3_compilerParser.ID, i);
		}
		public List<TerminalNode> Star() { return getTokens(v3_compilerParser.Star); }
		public TerminalNode Star(int i) {
			return getToken(v3_compilerParser.Star, i);
		}
		public List<TerminalNode> Assign() { return getTokens(v3_compilerParser.Assign); }
		public TerminalNode Assign(int i) {
			return getToken(v3_compilerParser.Assign, i);
		}
		public List<MyExprContext> myExpr() {
			return getRuleContexts(MyExprContext.class);
		}
		public MyExprContext myExpr(int i) {
			return getRuleContext(MyExprContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(v3_compilerParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(v3_compilerParser.Comma, i);
		}
		public List<TerminalNode> LeftBracket() { return getTokens(v3_compilerParser.LeftBracket); }
		public TerminalNode LeftBracket(int i) {
			return getToken(v3_compilerParser.LeftBracket, i);
		}
		public List<TerminalNode> IntegerConstant() { return getTokens(v3_compilerParser.IntegerConstant); }
		public TerminalNode IntegerConstant(int i) {
			return getToken(v3_compilerParser.IntegerConstant, i);
		}
		public List<TerminalNode> RightBracket() { return getTokens(v3_compilerParser.RightBracket); }
		public TerminalNode RightBracket(int i) {
			return getToken(v3_compilerParser.RightBracket, i);
		}
		public TerminalNode LeftBrace() { return getToken(v3_compilerParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(v3_compilerParser.RightBrace, 0); }
		public List<TerminalNode> LeftParen() { return getTokens(v3_compilerParser.LeftParen); }
		public TerminalNode LeftParen(int i) {
			return getToken(v3_compilerParser.LeftParen, i);
		}
		public List<TerminalNode> RightParen() { return getTokens(v3_compilerParser.RightParen); }
		public TerminalNode RightParen(int i) {
			return getToken(v3_compilerParser.RightParen, i);
		}
		public List<MyFuncInputParaContext> myFuncInputPara() {
			return getRuleContexts(MyFuncInputParaContext.class);
		}
		public MyFuncInputParaContext myFuncInputPara(int i) {
			return getRuleContext(MyFuncInputParaContext.class,i);
		}
		public TerminalNode STRUCT() { return getToken(v3_compilerParser.STRUCT, 0); }
		public MyStatementContext myStatement() {
			return getRuleContext(MyStatementContext.class,0);
		}
		public MyDeclareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_myDeclare; }
	}

	public final MyDeclareContext myDeclare() throws RecognitionException {
		MyDeclareContext _localctx = new MyDeclareContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_myDeclare);
		int _la;
		try {
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				((MyDeclareContext)_localctx).myType = myType();
				_localctx.myDeclareAST += '((%s'%(((MyDeclareContext)_localctx).myType.myTypeAST)
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Star) {
					{
					{
					setState(48);
					match(Star);
					_localctx.myDeclareAST += '*'
					}
					}
					setState(54);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(55);
				((MyDeclareContext)_localctx).id1 = match(ID);
				_localctx.myDeclareAST += ')type,(%s)var)myDeclare'%((((MyDeclareContext)_localctx).id1!=null?((MyDeclareContext)_localctx).id1.getText():null))
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Assign) {
					{
					setState(57);
					match(Assign);
					setState(58);
					((MyDeclareContext)_localctx).myExpr = myExpr(0);
					_localctx.myDeclareAST += '((=)op,(%s)var,%s)myEpxer'%((((MyDeclareContext)_localctx).id1!=null?((MyDeclareContext)_localctx).id1.getText():null), ((MyDeclareContext)_localctx).myExpr.myExprAST)
					}
				}

				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(63);
					match(Comma);
					_localctx.myDeclareAST += '((%s'%(((MyDeclareContext)_localctx).myType.myTypeAST)
					setState(69);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Star) {
						{
						{
						setState(65);
						match(Star);
						_localctx.myDeclareAST += '*'
						}
						}
						setState(71);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(72);
					((MyDeclareContext)_localctx).id2 = match(ID);
					_localctx.myDeclareAST += ')type,(%s)var)myDeclare'%((((MyDeclareContext)_localctx).id2!=null?((MyDeclareContext)_localctx).id2.getText():null))
					setState(78);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Assign) {
						{
						setState(74);
						match(Assign);
						setState(75);
						((MyDeclareContext)_localctx).myExpr = myExpr(0);
						_localctx.myDeclareAST += '((=)op,(%s)var,%s)myEpxer'%((((MyDeclareContext)_localctx).id2!=null?((MyDeclareContext)_localctx).id2.getText():null), ((MyDeclareContext)_localctx).myExpr.myExprAST)
						}
					}

					}
					}
					setState(84);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				((MyDeclareContext)_localctx).myType = myType();
				setState(86);
				((MyDeclareContext)_localctx).ID = match(ID);
				setState(87);
				match(LeftBracket);
				setState(88);
				((MyDeclareContext)_localctx).IntegerConstant = match(IntegerConstant);
				setState(89);
				match(RightBracket);
				_localctx.myDeclareAST += '((%s)type,((%s)arrayName,(%s'%(((MyDeclareContext)_localctx).myType.myTypeAST, (((MyDeclareContext)_localctx).ID!=null?((MyDeclareContext)_localctx).ID.getText():null), (((MyDeclareContext)_localctx).IntegerConstant!=null?((MyDeclareContext)_localctx).IntegerConstant.getText():null))
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LeftBracket) {
					{
					{
					setState(91);
					match(LeftBracket);
					setState(92);
					((MyDeclareContext)_localctx).IntegerConstant = match(IntegerConstant);
					setState(93);
					match(RightBracket);
					_localctx.myDeclareAST += ',%s'%((((MyDeclareContext)_localctx).IntegerConstant!=null?((MyDeclareContext)_localctx).IntegerConstant.getText():null))
					}
					}
					setState(99);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				_localctx.myDeclareAST += ')arraySize)arrayVar'
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Assign) {
					{
					setState(101);
					match(Assign);
					setState(102);
					match(LeftBrace);
					_localctx.myDeclareAST += '('
					setState(104);
					((MyDeclareContext)_localctx).int1 = match(IntegerConstant);
					_localctx.myDeclareAST += '%s'%((((MyDeclareContext)_localctx).int1!=null?((MyDeclareContext)_localctx).int1.getText():null))
					setState(111);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Comma) {
						{
						{
						setState(106);
						match(Comma);
						setState(107);
						((MyDeclareContext)_localctx).int2 = match(IntegerConstant);
						_localctx.myDeclareAST += ',%s'%((((MyDeclareContext)_localctx).int2!=null?((MyDeclareContext)_localctx).int2.getText():null))
						}
						}
						setState(113);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(114);
					match(RightBrace);
					_localctx.myDeclareAST += ')initValue'
					}
				}

				_localctx.myDeclareAST += ')myDeclare'
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(120);
				myType();
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LeftParen) {
					{
					setState(121);
					match(LeftParen);
					}
				}

				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Star) {
					{
					setState(124);
					match(Star);
					}
				}

				setState(127);
				match(ID);
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RightParen) {
					{
					setState(128);
					match(RightParen);
					}
				}

				setState(131);
				match(LeftParen);
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << VOID) | (1L << STRUCT))) != 0)) {
					{
					setState(132);
					myFuncInputPara();
					setState(137);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Comma) {
						{
						{
						setState(133);
						match(Comma);
						setState(134);
						myFuncInputPara();
						}
						}
						setState(139);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(142);
				match(RightParen);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(144);
				match(STRUCT);
				setState(145);
				match(ID);
				setState(146);
				myStatement();
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

	public static class MyFuncDefinitionContext extends ParserRuleContext {
		public  myFuncDefinitionAST = '';
		public MyTypeContext myType;
		public Token ID;
		public MyFuncInputParaContext myFuncInputPara;
		public MyStatementContext myStatement;
		public MyTypeContext myType() {
			return getRuleContext(MyTypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(v3_compilerParser.ID, 0); }
		public TerminalNode LeftParen() { return getToken(v3_compilerParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(v3_compilerParser.RightParen, 0); }
		public MyStatementContext myStatement() {
			return getRuleContext(MyStatementContext.class,0);
		}
		public List<MyFuncInputParaContext> myFuncInputPara() {
			return getRuleContexts(MyFuncInputParaContext.class);
		}
		public MyFuncInputParaContext myFuncInputPara(int i) {
			return getRuleContext(MyFuncInputParaContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(v3_compilerParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(v3_compilerParser.Comma, i);
		}
		public MyFuncDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_myFuncDefinition; }
	}

	public final MyFuncDefinitionContext myFuncDefinition() throws RecognitionException {
		MyFuncDefinitionContext _localctx = new MyFuncDefinitionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_myFuncDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			((MyFuncDefinitionContext)_localctx).myType = myType();
			setState(150);
			((MyFuncDefinitionContext)_localctx).ID = match(ID);
			setState(151);
			match(LeftParen);
			_localctx.myFuncDefinitionAST += '(%s)returnType,(%s)funcName,('%(((MyFuncDefinitionContext)_localctx).myType.myTypeAST, (((MyFuncDefinitionContext)_localctx).ID!=null?((MyFuncDefinitionContext)_localctx).ID.getText():null))
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << VOID) | (1L << STRUCT))) != 0)) {
				{
				setState(153);
				((MyFuncDefinitionContext)_localctx).myFuncInputPara = myFuncInputPara();
				_localctx.myFuncDefinitionAST += '%s'%(((MyFuncDefinitionContext)_localctx).myFuncInputPara.myFuncInputParaAST)
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(155);
					match(Comma);
					setState(156);
					((MyFuncDefinitionContext)_localctx).myFuncInputPara = myFuncInputPara();
					_localctx.myFuncDefinitionAST += ',%s'%(((MyFuncDefinitionContext)_localctx).myFuncInputPara.myFuncInputParaAST)
					}
					}
					setState(163);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			_localctx.myFuncDefinitionAST += ')myFuncInputPara,'
			setState(167);
			match(RightParen);
			setState(168);
			((MyFuncDefinitionContext)_localctx).myStatement = myStatement();
			_localctx.myFuncDefinitionAST += '(%s)myFuncBody'%(((MyFuncDefinitionContext)_localctx).myStatement.myStatementAST)
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

	public static class MyFuncInputParaContext extends ParserRuleContext {
		public  myFuncInputParaAST = '';
		public MyTypeContext myType;
		public Token ID;
		public List<MyTypeContext> myType() {
			return getRuleContexts(MyTypeContext.class);
		}
		public MyTypeContext myType(int i) {
			return getRuleContext(MyTypeContext.class,i);
		}
		public TerminalNode ID() { return getToken(v3_compilerParser.ID, 0); }
		public List<TerminalNode> Star() { return getTokens(v3_compilerParser.Star); }
		public TerminalNode Star(int i) {
			return getToken(v3_compilerParser.Star, i);
		}
		public List<TerminalNode> LeftParen() { return getTokens(v3_compilerParser.LeftParen); }
		public TerminalNode LeftParen(int i) {
			return getToken(v3_compilerParser.LeftParen, i);
		}
		public List<TerminalNode> RightParen() { return getTokens(v3_compilerParser.RightParen); }
		public TerminalNode RightParen(int i) {
			return getToken(v3_compilerParser.RightParen, i);
		}
		public TerminalNode VOID() { return getToken(v3_compilerParser.VOID, 0); }
		public MyFuncInputParaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_myFuncInputPara; }
	}

	public final MyFuncInputParaContext myFuncInputPara() throws RecognitionException {
		MyFuncInputParaContext _localctx = new MyFuncInputParaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_myFuncInputPara);
		int _la;
		try {
			setState(199);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				((MyFuncInputParaContext)_localctx).myType = myType();
				_localctx.myFuncInputParaAST += '((%s'%(((MyFuncInputParaContext)_localctx).myType.myTypeAST)
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Star) {
					{
					{
					setState(173);
					match(Star);
					_localctx.myFuncInputParaAST += '*'
					}
					}
					setState(179);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(180);
				((MyFuncInputParaContext)_localctx).ID = match(ID);
				_localctx.myFuncInputParaAST +=')type,(%s)var)myDeclare'%((((MyFuncInputParaContext)_localctx).ID!=null?((MyFuncInputParaContext)_localctx).ID.getText():null))
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				myType();
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LeftParen) {
					{
					setState(184);
					match(LeftParen);
					}
				}

				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Star) {
					{
					setState(187);
					match(Star);
					}
				}

				setState(190);
				match(ID);
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RightParen) {
					{
					setState(191);
					match(RightParen);
					}
				}

				setState(194);
				match(LeftParen);
				setState(195);
				myType();
				setState(196);
				match(RightParen);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(198);
				match(VOID);
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

	public static class MyStatementContext extends ParserRuleContext {
		public  myStatementAST = '';
		public MyFuncBodyCodeContext myFuncBodyCode;
		public TerminalNode LeftBrace() { return getToken(v3_compilerParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(v3_compilerParser.RightBrace, 0); }
		public List<MyFuncBodyCodeContext> myFuncBodyCode() {
			return getRuleContexts(MyFuncBodyCodeContext.class);
		}
		public MyFuncBodyCodeContext myFuncBodyCode(int i) {
			return getRuleContext(MyFuncBodyCodeContext.class,i);
		}
		public MyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_myStatement; }
	}

	public final MyStatementContext myStatement() throws RecognitionException {
		MyStatementContext _localctx = new MyStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_myStatement);
		int _la;
		try {
			setState(214);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftBrace:
				enterOuterAlt(_localctx, 1);
				{
				setState(201);
				match(LeftBrace);
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << VOID) | (1L << RETURN) | (1L << STRUCT) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << LeftParen) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << And) | (1L << Not) | (1L << Tilde) | (1L << IntegerConstant) | (1L << ID))) != 0)) {
					{
					{
					setState(202);
					((MyStatementContext)_localctx).myFuncBodyCode = myFuncBodyCode();
					_localctx.myStatementAST += '%s'%(((MyStatementContext)_localctx).myFuncBodyCode.myFuncBodyCodeAST)
					}
					}
					setState(209);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(210);
				match(RightBrace);
				}
				break;
			case INT:
			case VOID:
			case RETURN:
			case STRUCT:
			case IF:
			case FOR:
			case WHILE:
			case LeftParen:
			case Plus:
			case Minus:
			case Star:
			case And:
			case Not:
			case Tilde:
			case IntegerConstant:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
				((MyStatementContext)_localctx).myFuncBodyCode = myFuncBodyCode();
				_localctx.myStatementAST += '%s'%(((MyStatementContext)_localctx).myFuncBodyCode.myFuncBodyCodeAST)
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

	public static class MyFuncBodyCodeContext extends ParserRuleContext {
		public  myFuncBodyCodeAST = '';
		public MyDeclareContext myDeclare;
		public MyExprContext myExpr;
		public MyReturnContext myReturn;
		public MySelectionContext mySelection;
		public MyDeclareContext myDeclare() {
			return getRuleContext(MyDeclareContext.class,0);
		}
		public TerminalNode Semi() { return getToken(v3_compilerParser.Semi, 0); }
		public MyExprContext myExpr() {
			return getRuleContext(MyExprContext.class,0);
		}
		public MyReturnContext myReturn() {
			return getRuleContext(MyReturnContext.class,0);
		}
		public MySelectionContext mySelection() {
			return getRuleContext(MySelectionContext.class,0);
		}
		public MyIterationContext myIteration() {
			return getRuleContext(MyIterationContext.class,0);
		}
		public MyFuncBodyCodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_myFuncBodyCode; }
	}

	public final MyFuncBodyCodeContext myFuncBodyCode() throws RecognitionException {
		MyFuncBodyCodeContext _localctx = new MyFuncBodyCodeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_myFuncBodyCode);
		try {
			setState(232);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case VOID:
			case STRUCT:
				enterOuterAlt(_localctx, 1);
				{
				setState(216);
				((MyFuncBodyCodeContext)_localctx).myDeclare = myDeclare();
				setState(217);
				match(Semi);
				_localctx.myFuncBodyCodeAST += '%s'%(((MyFuncBodyCodeContext)_localctx).myDeclare.myDeclareAST)
				}
				break;
			case LeftParen:
			case Plus:
			case Minus:
			case Star:
			case And:
			case Not:
			case Tilde:
			case IntegerConstant:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(220);
				((MyFuncBodyCodeContext)_localctx).myExpr = myExpr(0);
				setState(221);
				match(Semi);
				_localctx.myFuncBodyCodeAST += '%s'%(((MyFuncBodyCodeContext)_localctx).myExpr.myExprAST)
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 3);
				{
				setState(224);
				((MyFuncBodyCodeContext)_localctx).myReturn = myReturn();
				setState(225);
				match(Semi);
				_localctx.myFuncBodyCodeAST += '%s'%(((MyFuncBodyCodeContext)_localctx).myReturn.myReturnAST)
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 4);
				{
				setState(228);
				((MyFuncBodyCodeContext)_localctx).mySelection = mySelection();
				_localctx.myFuncBodyCodeAST += '%s'%(((MyFuncBodyCodeContext)_localctx).mySelection.mySelectionAST)
				}
				break;
			case FOR:
			case WHILE:
				enterOuterAlt(_localctx, 5);
				{
				setState(231);
				myIteration();
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

	public static class MyExprContext extends ParserRuleContext {
		public  myExprAST = '';
		public MyExprContext e1;
		public Token ID;
		public Token IntegerConstant;
		public Token op;
		public MyExprContext e2;
		public List<TerminalNode> ID() { return getTokens(v3_compilerParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(v3_compilerParser.ID, i);
		}
		public TerminalNode LeftParen() { return getToken(v3_compilerParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(v3_compilerParser.RightParen, 0); }
		public List<MyExprContext> myExpr() {
			return getRuleContexts(MyExprContext.class);
		}
		public MyExprContext myExpr(int i) {
			return getRuleContext(MyExprContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(v3_compilerParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(v3_compilerParser.Comma, i);
		}
		public TerminalNode LeftBracket() { return getToken(v3_compilerParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(v3_compilerParser.RightBracket, 0); }
		public TerminalNode Arrow() { return getToken(v3_compilerParser.Arrow, 0); }
		public TerminalNode Plus() { return getToken(v3_compilerParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(v3_compilerParser.Minus, 0); }
		public TerminalNode Not() { return getToken(v3_compilerParser.Not, 0); }
		public TerminalNode Tilde() { return getToken(v3_compilerParser.Tilde, 0); }
		public MyTypeContext myType() {
			return getRuleContext(MyTypeContext.class,0);
		}
		public List<TerminalNode> Star() { return getTokens(v3_compilerParser.Star); }
		public TerminalNode Star(int i) {
			return getToken(v3_compilerParser.Star, i);
		}
		public TerminalNode And() { return getToken(v3_compilerParser.And, 0); }
		public TerminalNode IntegerConstant() { return getToken(v3_compilerParser.IntegerConstant, 0); }
		public TerminalNode Div() { return getToken(v3_compilerParser.Div, 0); }
		public TerminalNode Mod() { return getToken(v3_compilerParser.Mod, 0); }
		public TerminalNode LeftShift() { return getToken(v3_compilerParser.LeftShift, 0); }
		public TerminalNode RightShift() { return getToken(v3_compilerParser.RightShift, 0); }
		public TerminalNode Less() { return getToken(v3_compilerParser.Less, 0); }
		public TerminalNode LessEqual() { return getToken(v3_compilerParser.LessEqual, 0); }
		public TerminalNode Greater() { return getToken(v3_compilerParser.Greater, 0); }
		public TerminalNode GreaterEqual() { return getToken(v3_compilerParser.GreaterEqual, 0); }
		public TerminalNode Equal() { return getToken(v3_compilerParser.Equal, 0); }
		public TerminalNode NotEqual() { return getToken(v3_compilerParser.NotEqual, 0); }
		public TerminalNode Caret() { return getToken(v3_compilerParser.Caret, 0); }
		public TerminalNode Or() { return getToken(v3_compilerParser.Or, 0); }
		public TerminalNode AndAnd() { return getToken(v3_compilerParser.AndAnd, 0); }
		public TerminalNode OrOr() { return getToken(v3_compilerParser.OrOr, 0); }
		public TerminalNode Assign() { return getToken(v3_compilerParser.Assign, 0); }
		public TerminalNode PlusAssign() { return getToken(v3_compilerParser.PlusAssign, 0); }
		public TerminalNode MinusAssign() { return getToken(v3_compilerParser.MinusAssign, 0); }
		public TerminalNode StarAssign() { return getToken(v3_compilerParser.StarAssign, 0); }
		public TerminalNode DivAssign() { return getToken(v3_compilerParser.DivAssign, 0); }
		public TerminalNode ModAssign() { return getToken(v3_compilerParser.ModAssign, 0); }
		public TerminalNode LeftShiftAssign() { return getToken(v3_compilerParser.LeftShiftAssign, 0); }
		public TerminalNode RightShiftAssign() { return getToken(v3_compilerParser.RightShiftAssign, 0); }
		public TerminalNode AndAssign() { return getToken(v3_compilerParser.AndAssign, 0); }
		public TerminalNode XorAssign() { return getToken(v3_compilerParser.XorAssign, 0); }
		public TerminalNode OrAssign() { return getToken(v3_compilerParser.OrAssign, 0); }
		public TerminalNode PlusPlus() { return getToken(v3_compilerParser.PlusPlus, 0); }
		public TerminalNode MinusMinus() { return getToken(v3_compilerParser.MinusMinus, 0); }
		public TerminalNode Dot() { return getToken(v3_compilerParser.Dot, 0); }
		public MyExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_myExpr; }
	}

	public final MyExprContext myExpr() throws RecognitionException {
		return myExpr(0);
	}

	private MyExprContext myExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MyExprContext _localctx = new MyExprContext(_ctx, _parentState);
		MyExprContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_myExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(235);
				((MyExprContext)_localctx).ID = match(ID);
				setState(236);
				match(LeftParen);
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LeftParen) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << And) | (1L << Not) | (1L << Tilde) | (1L << IntegerConstant) | (1L << ID))) != 0)) {
					{
					{
					setState(237);
					myExpr(0);
					setState(242);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Comma) {
						{
						{
						setState(238);
						match(Comma);
						setState(239);
						myExpr(0);
						}
						}
						setState(244);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(249);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(250);
				match(RightParen);
				}
				break;
			case 2:
				{
				setState(251);
				((MyExprContext)_localctx).ID = match(ID);
				setState(252);
				match(LeftBracket);
				setState(253);
				myExpr(0);
				setState(254);
				match(RightBracket);
				}
				break;
			case 3:
				{
				setState(256);
				((MyExprContext)_localctx).ID = match(ID);
				setState(257);
				match(Arrow);
				setState(258);
				((MyExprContext)_localctx).ID = match(ID);
				}
				break;
			case 4:
				{
				setState(259);
				match(Plus);
				setState(260);
				myExpr(21);
				}
				break;
			case 5:
				{
				setState(261);
				match(Minus);
				setState(262);
				myExpr(20);
				}
				break;
			case 6:
				{
				setState(263);
				match(Not);
				setState(264);
				myExpr(19);
				}
				break;
			case 7:
				{
				setState(265);
				match(Tilde);
				setState(266);
				myExpr(18);
				}
				break;
			case 8:
				{
				setState(267);
				match(LeftParen);
				setState(268);
				myType();
				setState(272);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Star) {
					{
					{
					setState(269);
					match(Star);
					}
					}
					setState(274);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(275);
				match(RightParen);
				setState(276);
				myExpr(17);
				}
				break;
			case 9:
				{
				setState(278);
				match(Star);
				setState(279);
				myExpr(16);
				}
				break;
			case 10:
				{
				setState(280);
				match(And);
				setState(281);
				myExpr(15);
				}
				break;
			case 11:
				{
				setState(282);
				match(LeftParen);
				setState(283);
				myExpr(0);
				setState(284);
				match(RightParen);
				_localctx.myExprAST += '%s'%(myExpr.myExprAST)
				}
				break;
			case 12:
				{
				setState(287);
				((MyExprContext)_localctx).ID = match(ID);
				_localctx.myExprAST += '(%s)ID'%((((MyExprContext)_localctx).ID!=null?((MyExprContext)_localctx).ID.getText():null))
				}
				break;
			case 13:
				{
				setState(289);
				((MyExprContext)_localctx).IntegerConstant = match(IntegerConstant);
				_localctx.myExprAST += '(%s)intConst'%((((MyExprContext)_localctx).IntegerConstant!=null?((MyExprContext)_localctx).IntegerConstant.getText():null))
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(359);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(357);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
					case 1:
						{
						_localctx = new MyExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_myExpr);
						setState(293);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(294);
						((MyExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Star) | (1L << Div) | (1L << Mod))) != 0)) ) {
							((MyExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(295);
						((MyExprContext)_localctx).e2 = myExpr(15);
						_localctx.myExprAST += '((%s)op,%s,%s)myExpr'%((((MyExprContext)_localctx).op!=null?((MyExprContext)_localctx).op.getText():null), ((MyExprContext)_localctx).e1.myExprAST, ((MyExprContext)_localctx).e2.myExprAST)
						}
						break;
					case 2:
						{
						_localctx = new MyExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_myExpr);
						setState(298);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(299);
						((MyExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==Plus || _la==Minus) ) {
							((MyExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(300);
						((MyExprContext)_localctx).e2 = myExpr(14);
						_localctx.myExprAST += '((%s)op,%s,%s)myExpr'%((((MyExprContext)_localctx).op!=null?((MyExprContext)_localctx).op.getText():null), ((MyExprContext)_localctx).e1.myExprAST, ((MyExprContext)_localctx).e2.myExprAST)
						}
						break;
					case 3:
						{
						_localctx = new MyExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_myExpr);
						setState(303);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(304);
						((MyExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==LeftShift || _la==RightShift) ) {
							((MyExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(305);
						((MyExprContext)_localctx).e2 = myExpr(13);
						_localctx.myExprAST += '((%s)op,%s,%s)myExpr'%((((MyExprContext)_localctx).op!=null?((MyExprContext)_localctx).op.getText():null), ((MyExprContext)_localctx).e1.myExprAST, ((MyExprContext)_localctx).e2.myExprAST)
						}
						break;
					case 4:
						{
						_localctx = new MyExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_myExpr);
						setState(308);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(309);
						((MyExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Less) | (1L << LessEqual) | (1L << Greater) | (1L << GreaterEqual))) != 0)) ) {
							((MyExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(310);
						((MyExprContext)_localctx).e2 = myExpr(12);
						_localctx.myExprAST += '((%s)op,%s,%s)myExpr'%((((MyExprContext)_localctx).op!=null?((MyExprContext)_localctx).op.getText():null), ((MyExprContext)_localctx).e1.myExprAST, ((MyExprContext)_localctx).e2.myExprAST)
						}
						break;
					case 5:
						{
						_localctx = new MyExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_myExpr);
						setState(313);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(314);
						((MyExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==Equal || _la==NotEqual) ) {
							((MyExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(315);
						((MyExprContext)_localctx).e2 = myExpr(11);
						_localctx.myExprAST += '((%s)op,%s,%s)myExpr'%((((MyExprContext)_localctx).op!=null?((MyExprContext)_localctx).op.getText():null), ((MyExprContext)_localctx).e1.myExprAST, ((MyExprContext)_localctx).e2.myExprAST)
						}
						break;
					case 6:
						{
						_localctx = new MyExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_myExpr);
						setState(318);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(319);
						((MyExprContext)_localctx).op = match(And);
						setState(320);
						((MyExprContext)_localctx).e2 = myExpr(10);
						_localctx.myExprAST += '((%s)op,%s,%s)myExpr'%((((MyExprContext)_localctx).op!=null?((MyExprContext)_localctx).op.getText():null), ((MyExprContext)_localctx).e1.myExprAST, ((MyExprContext)_localctx).e2.myExprAST)
						}
						break;
					case 7:
						{
						_localctx = new MyExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_myExpr);
						setState(323);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(324);
						((MyExprContext)_localctx).op = match(Caret);
						setState(325);
						((MyExprContext)_localctx).e2 = myExpr(9);
						_localctx.myExprAST += '((%s)op,%s,%s)myExpr'%((((MyExprContext)_localctx).op!=null?((MyExprContext)_localctx).op.getText():null), ((MyExprContext)_localctx).e1.myExprAST, ((MyExprContext)_localctx).e2.myExprAST)
						}
						break;
					case 8:
						{
						_localctx = new MyExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_myExpr);
						setState(328);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(329);
						((MyExprContext)_localctx).op = match(Or);
						setState(330);
						((MyExprContext)_localctx).e2 = myExpr(8);
						_localctx.myExprAST += '((%s)op,%s,%s)myExpr'%((((MyExprContext)_localctx).op!=null?((MyExprContext)_localctx).op.getText():null), ((MyExprContext)_localctx).e1.myExprAST, ((MyExprContext)_localctx).e2.myExprAST)
						}
						break;
					case 9:
						{
						_localctx = new MyExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_myExpr);
						setState(333);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(334);
						((MyExprContext)_localctx).op = match(AndAnd);
						setState(335);
						((MyExprContext)_localctx).e2 = myExpr(7);
						_localctx.myExprAST += '((%s)op,%s,%s)myExpr'%((((MyExprContext)_localctx).op!=null?((MyExprContext)_localctx).op.getText():null), ((MyExprContext)_localctx).e1.myExprAST, ((MyExprContext)_localctx).e2.myExprAST)
						}
						break;
					case 10:
						{
						_localctx = new MyExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_myExpr);
						setState(338);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(339);
						((MyExprContext)_localctx).op = match(OrOr);
						setState(340);
						((MyExprContext)_localctx).e2 = myExpr(6);
						_localctx.myExprAST += '((%s)op,%s,%s)myExpr'%((((MyExprContext)_localctx).op!=null?((MyExprContext)_localctx).op.getText():null), ((MyExprContext)_localctx).e1.myExprAST, ((MyExprContext)_localctx).e2.myExprAST)
						}
						break;
					case 11:
						{
						_localctx = new MyExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_myExpr);
						setState(343);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(344);
						((MyExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Assign) | (1L << StarAssign) | (1L << DivAssign) | (1L << ModAssign) | (1L << PlusAssign) | (1L << MinusAssign) | (1L << LeftShiftAssign) | (1L << RightShiftAssign) | (1L << AndAssign) | (1L << XorAssign) | (1L << OrAssign))) != 0)) ) {
							((MyExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(345);
						((MyExprContext)_localctx).e2 = myExpr(5);
						_localctx.myExprAST += '((%s)op,%s,%s)myExpr'%((((MyExprContext)_localctx).op!=null?((MyExprContext)_localctx).op.getText():null),((MyExprContext)_localctx).e1.myExprAST,((MyExprContext)_localctx).e2.myExprAST)
						}
						break;
					case 12:
						{
						_localctx = new MyExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_myExpr);
						setState(348);
						if (!(precpred(_ctx, 27))) throw new FailedPredicateException(this, "precpred(_ctx, 27)");
						setState(349);
						match(PlusPlus);
						_localctx.myExprAST += '((=)op,%s,((+)op,%s,(1)intConst)myExpr)myExpr'%(((MyExprContext)_localctx).e1.myExprAST, ((MyExprContext)_localctx).e1.myExprAST)
						}
						break;
					case 13:
						{
						_localctx = new MyExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_myExpr);
						setState(351);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(352);
						match(MinusMinus);
						_localctx.myExprAST += '((=)op,%s,((-)op,%s,(1)intConst)myExpr)myExpr'%(((MyExprContext)_localctx).e1.myExprAST, ((MyExprContext)_localctx).e1.myExprAST)
						}
						break;
					case 14:
						{
						_localctx = new MyExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_myExpr);
						setState(354);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(355);
						match(Dot);
						setState(356);
						((MyExprContext)_localctx).ID = match(ID);
						}
						break;
					}
					} 
				}
				setState(361);
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

	public static class MySelectionContext extends ParserRuleContext {
		public  mySelectionAST = '';
		public MyExprContext myExpr;
		public MyStatementContext myStatement;
		public TerminalNode IF() { return getToken(v3_compilerParser.IF, 0); }
		public TerminalNode LeftParen() { return getToken(v3_compilerParser.LeftParen, 0); }
		public MyExprContext myExpr() {
			return getRuleContext(MyExprContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(v3_compilerParser.RightParen, 0); }
		public List<MyStatementContext> myStatement() {
			return getRuleContexts(MyStatementContext.class);
		}
		public MyStatementContext myStatement(int i) {
			return getRuleContext(MyStatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(v3_compilerParser.ELSE, 0); }
		public MySelectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mySelection; }
	}

	public final MySelectionContext mySelection() throws RecognitionException {
		MySelectionContext _localctx = new MySelectionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_mySelection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			match(IF);
			setState(363);
			match(LeftParen);
			_localctx.mySelectionAST += '(('
			setState(365);
			((MySelectionContext)_localctx).myExpr = myExpr(0);
			_localctx.mySelectionAST +='%s'%(((MySelectionContext)_localctx).myExpr.myExprAST)
			setState(367);
			match(RightParen);
			_localctx.mySelectionAST +=')ifCondi'
			setState(369);
			((MySelectionContext)_localctx).myStatement = myStatement();
			_localctx.mySelectionAST += '(%s)ifBody'%(((MySelectionContext)_localctx).myStatement.myStatementAST)
			setState(375);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(371);
				match(ELSE);
				setState(372);
				((MySelectionContext)_localctx).myStatement = myStatement();
				_localctx.mySelectionAST += '(%s)elseBody'%(((MySelectionContext)_localctx).myStatement.myStatementAST)
				}
				break;
			}
			_localctx.mySelectionAST +=')mySelection'
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

	public static class MyIterationContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(v3_compilerParser.FOR, 0); }
		public TerminalNode LeftParen() { return getToken(v3_compilerParser.LeftParen, 0); }
		public MyForCondiContext myForCondi() {
			return getRuleContext(MyForCondiContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(v3_compilerParser.RightParen, 0); }
		public MyStatementContext myStatement() {
			return getRuleContext(MyStatementContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(v3_compilerParser.WHILE, 0); }
		public MyExprContext myExpr() {
			return getRuleContext(MyExprContext.class,0);
		}
		public MyIterationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_myIteration; }
	}

	public final MyIterationContext myIteration() throws RecognitionException {
		MyIterationContext _localctx = new MyIterationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_myIteration);
		int _la;
		try {
			setState(392);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(379);
				match(FOR);
				setState(380);
				match(LeftParen);
				setState(381);
				myForCondi();
				setState(382);
				match(RightParen);
				setState(383);
				myStatement();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(385);
				match(WHILE);
				setState(386);
				match(LeftParen);
				setState(388);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LeftParen) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << And) | (1L << Not) | (1L << Tilde) | (1L << IntegerConstant) | (1L << ID))) != 0)) {
					{
					setState(387);
					myExpr(0);
					}
				}

				setState(390);
				match(RightParen);
				setState(391);
				myStatement();
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

	public static class MyForCondiContext extends ParserRuleContext {
		public List<TerminalNode> Semi() { return getTokens(v3_compilerParser.Semi); }
		public TerminalNode Semi(int i) {
			return getToken(v3_compilerParser.Semi, i);
		}
		public MyDeclareContext myDeclare() {
			return getRuleContext(MyDeclareContext.class,0);
		}
		public List<MyExprContext> myExpr() {
			return getRuleContexts(MyExprContext.class);
		}
		public MyExprContext myExpr(int i) {
			return getRuleContext(MyExprContext.class,i);
		}
		public MyForCondiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_myForCondi; }
	}

	public final MyForCondiContext myForCondi() throws RecognitionException {
		MyForCondiContext _localctx = new MyForCondiContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_myForCondi);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case VOID:
			case STRUCT:
				{
				setState(394);
				myDeclare();
				}
				break;
			case LeftParen:
			case Plus:
			case Minus:
			case Star:
			case And:
			case Not:
			case Tilde:
			case Semi:
			case IntegerConstant:
			case ID:
				{
				setState(396);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LeftParen) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << And) | (1L << Not) | (1L << Tilde) | (1L << IntegerConstant) | (1L << ID))) != 0)) {
					{
					setState(395);
					myExpr(0);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(400);
			match(Semi);
			setState(402);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LeftParen) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << And) | (1L << Not) | (1L << Tilde) | (1L << IntegerConstant) | (1L << ID))) != 0)) {
				{
				setState(401);
				myExpr(0);
				}
			}

			setState(404);
			match(Semi);
			setState(406);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LeftParen) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << And) | (1L << Not) | (1L << Tilde) | (1L << IntegerConstant) | (1L << ID))) != 0)) {
				{
				setState(405);
				myExpr(0);
				}
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

	public static class MyReturnContext extends ParserRuleContext {
		public  myReturnAST = '';
		public MyExprContext myExpr;
		public TerminalNode RETURN() { return getToken(v3_compilerParser.RETURN, 0); }
		public MyExprContext myExpr() {
			return getRuleContext(MyExprContext.class,0);
		}
		public MyReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_myReturn; }
	}

	public final MyReturnContext myReturn() throws RecognitionException {
		MyReturnContext _localctx = new MyReturnContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_myReturn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			match(RETURN);
			_localctx.myReturnAST += '('
			setState(413);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LeftParen) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << And) | (1L << Not) | (1L << Tilde) | (1L << IntegerConstant) | (1L << ID))) != 0)) {
				{
				setState(410);
				((MyReturnContext)_localctx).myExpr = myExpr(0);
				_localctx.myReturnAST += '%s'%(((MyReturnContext)_localctx).myExpr.myExprAST)
				}
			}

			_localctx.myReturnAST += ')myReturn'
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

	public static class MyTypeContext extends ParserRuleContext {
		public  myTypeAST = '';
		public TerminalNode INT() { return getToken(v3_compilerParser.INT, 0); }
		public TerminalNode VOID() { return getToken(v3_compilerParser.VOID, 0); }
		public TerminalNode STRUCT() { return getToken(v3_compilerParser.STRUCT, 0); }
		public TerminalNode ID() { return getToken(v3_compilerParser.ID, 0); }
		public MyTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_myType; }
	}

	public final MyTypeContext myType() throws RecognitionException {
		MyTypeContext _localctx = new MyTypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_myType);
		try {
			setState(423);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(417);
				match(INT);
				_localctx.myTypeAST += 'int'
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(419);
				match(VOID);
				_localctx.myTypeAST += 'void'
				}
				break;
			case STRUCT:
				enterOuterAlt(_localctx, 3);
				{
				setState(421);
				match(STRUCT);
				setState(422);
				match(ID);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 7:
			return myExpr_sempred((MyExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean myExpr_sempred(MyExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 14);
		case 1:
			return precpred(_ctx, 13);
		case 2:
			return precpred(_ctx, 12);
		case 3:
			return precpred(_ctx, 11);
		case 4:
			return precpred(_ctx, 10);
		case 5:
			return precpred(_ctx, 9);
		case 6:
			return precpred(_ctx, 8);
		case 7:
			return precpred(_ctx, 7);
		case 8:
			return precpred(_ctx, 6);
		case 9:
			return precpred(_ctx, 5);
		case 10:
			return precpred(_ctx, 4);
		case 11:
			return precpred(_ctx, 27);
		case 12:
			return precpred(_ctx, 26);
		case 13:
			return precpred(_ctx, 23);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3<\u01ac\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\7\2!\n\2\f\2\16\2$\13\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3/\n\3\3\4\3\4\3\4\3\4\7\4\65\n"+
		"\4\f\4\16\48\13\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4@\n\4\3\4\3\4\3\4\3\4\7\4"+
		"F\n\4\f\4\16\4I\13\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4Q\n\4\7\4S\n\4\f\4\16"+
		"\4V\13\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4b\n\4\f\4\16\4e\13"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4p\n\4\f\4\16\4s\13\4\3\4\3\4"+
		"\5\4w\n\4\3\4\3\4\3\4\3\4\5\4}\n\4\3\4\5\4\u0080\n\4\3\4\3\4\5\4\u0084"+
		"\n\4\3\4\3\4\3\4\3\4\7\4\u008a\n\4\f\4\16\4\u008d\13\4\5\4\u008f\n\4\3"+
		"\4\3\4\3\4\3\4\3\4\5\4\u0096\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\7\5\u00a2\n\5\f\5\16\5\u00a5\13\5\5\5\u00a7\n\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\7\6\u00b2\n\6\f\6\16\6\u00b5\13\6\3\6\3\6\3\6\3\6\3\6"+
		"\5\6\u00bc\n\6\3\6\5\6\u00bf\n\6\3\6\3\6\5\6\u00c3\n\6\3\6\3\6\3\6\3\6"+
		"\3\6\5\6\u00ca\n\6\3\7\3\7\3\7\3\7\7\7\u00d0\n\7\f\7\16\7\u00d3\13\7\3"+
		"\7\3\7\3\7\3\7\5\7\u00d9\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\5\b\u00eb\n\b\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00f3"+
		"\n\t\f\t\16\t\u00f6\13\t\7\t\u00f8\n\t\f\t\16\t\u00fb\13\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7"+
		"\t\u0111\n\t\f\t\16\t\u0114\13\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0126\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\7\t\u0168\n\t\f\t\16\t\u016b\13\t\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u017a\n\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0187\n\13\3\13\3\13\5\13\u018b\n"+
		"\13\3\f\3\f\5\f\u018f\n\f\5\f\u0191\n\f\3\f\3\f\5\f\u0195\n\f\3\f\3\f"+
		"\5\f\u0199\n\f\3\r\3\r\3\r\3\r\3\r\5\r\u01a0\n\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\5\16\u01aa\n\16\3\16\2\3\20\17\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\2\b\3\2\35\37\3\2\31\32\3\2\25\26\3\2\21\24\3\2\27\30\3\2)\63"+
		"\2\u01e5\2\34\3\2\2\2\4.\3\2\2\2\6\u0095\3\2\2\2\b\u0097\3\2\2\2\n\u00c9"+
		"\3\2\2\2\f\u00d8\3\2\2\2\16\u00ea\3\2\2\2\20\u0125\3\2\2\2\22\u016c\3"+
		"\2\2\2\24\u018a\3\2\2\2\26\u0190\3\2\2\2\30\u019a\3\2\2\2\32\u01a9\3\2"+
		"\2\2\34\"\b\2\1\2\35\36\5\4\3\2\36\37\b\2\1\2\37!\3\2\2\2 \35\3\2\2\2"+
		"!$\3\2\2\2\" \3\2\2\2\"#\3\2\2\2#%\3\2\2\2$\"\3\2\2\2%&\b\2\1\2&\3\3\2"+
		"\2\2\'(\5\6\4\2()\7(\2\2)*\b\3\1\2*/\3\2\2\2+,\5\b\5\2,-\b\3\1\2-/\3\2"+
		"\2\2.\'\3\2\2\2.+\3\2\2\2/\5\3\2\2\2\60\61\5\32\16\2\61\66\b\4\1\2\62"+
		"\63\7\35\2\2\63\65\b\4\1\2\64\62\3\2\2\2\658\3\2\2\2\66\64\3\2\2\2\66"+
		"\67\3\2\2\2\679\3\2\2\28\66\3\2\2\29:\79\2\2:?\b\4\1\2;<\7)\2\2<=\5\20"+
		"\t\2=>\b\4\1\2>@\3\2\2\2?;\3\2\2\2?@\3\2\2\2@T\3\2\2\2AB\7\'\2\2BG\b\4"+
		"\1\2CD\7\35\2\2DF\b\4\1\2EC\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2HJ\3"+
		"\2\2\2IG\3\2\2\2JK\79\2\2KP\b\4\1\2LM\7)\2\2MN\5\20\t\2NO\b\4\1\2OQ\3"+
		"\2\2\2PL\3\2\2\2PQ\3\2\2\2QS\3\2\2\2RA\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3"+
		"\2\2\2U\u0096\3\2\2\2VT\3\2\2\2WX\5\32\16\2XY\79\2\2YZ\7\r\2\2Z[\7\66"+
		"\2\2[\\\7\16\2\2\\c\b\4\1\2]^\7\r\2\2^_\7\66\2\2_`\7\16\2\2`b\b\4\1\2"+
		"a]\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2df\3\2\2\2ec\3\2\2\2fv\b\4\1\2"+
		"gh\7)\2\2hi\7\17\2\2ij\b\4\1\2jk\7\66\2\2kq\b\4\1\2lm\7\'\2\2mn\7\66\2"+
		"\2np\b\4\1\2ol\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2rt\3\2\2\2sq\3\2\2"+
		"\2tu\7\20\2\2uw\b\4\1\2vg\3\2\2\2vw\3\2\2\2wx\3\2\2\2xy\b\4\1\2y\u0096"+
		"\3\2\2\2z|\5\32\16\2{}\7\13\2\2|{\3\2\2\2|}\3\2\2\2}\177\3\2\2\2~\u0080"+
		"\7\35\2\2\177~\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0083"+
		"\79\2\2\u0082\u0084\7\f\2\2\u0083\u0082\3\2\2\2\u0083\u0084\3\2\2\2\u0084"+
		"\u0085\3\2\2\2\u0085\u008e\7\13\2\2\u0086\u008b\5\n\6\2\u0087\u0088\7"+
		"\'\2\2\u0088\u008a\5\n\6\2\u0089\u0087\3\2\2\2\u008a\u008d\3\2\2\2\u008b"+
		"\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2"+
		"\2\2\u008e\u0086\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090\3\2\2\2\u0090"+
		"\u0091\7\f\2\2\u0091\u0096\3\2\2\2\u0092\u0093\7\6\2\2\u0093\u0094\79"+
		"\2\2\u0094\u0096\5\f\7\2\u0095\60\3\2\2\2\u0095W\3\2\2\2\u0095z\3\2\2"+
		"\2\u0095\u0092\3\2\2\2\u0096\7\3\2\2\2\u0097\u0098\5\32\16\2\u0098\u0099"+
		"\79\2\2\u0099\u009a\7\13\2\2\u009a\u00a6\b\5\1\2\u009b\u009c\5\n\6\2\u009c"+
		"\u00a3\b\5\1\2\u009d\u009e\7\'\2\2\u009e\u009f\5\n\6\2\u009f\u00a0\b\5"+
		"\1\2\u00a0\u00a2\3\2\2\2\u00a1\u009d\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3"+
		"\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a3\3\2"+
		"\2\2\u00a6\u009b\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8"+
		"\u00a9\b\5\1\2\u00a9\u00aa\7\f\2\2\u00aa\u00ab\5\f\7\2\u00ab\u00ac\b\5"+
		"\1\2\u00ac\t\3\2\2\2\u00ad\u00ae\5\32\16\2\u00ae\u00b3\b\6\1\2\u00af\u00b0"+
		"\7\35\2\2\u00b0\u00b2\b\6\1\2\u00b1\u00af\3\2\2\2\u00b2\u00b5\3\2\2\2"+
		"\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b6\3\2\2\2\u00b5\u00b3"+
		"\3\2\2\2\u00b6\u00b7\79\2\2\u00b7\u00b8\b\6\1\2\u00b8\u00ca\3\2\2\2\u00b9"+
		"\u00bb\5\32\16\2\u00ba\u00bc\7\13\2\2\u00bb\u00ba\3\2\2\2\u00bb\u00bc"+
		"\3\2\2\2\u00bc\u00be\3\2\2\2\u00bd\u00bf\7\35\2\2\u00be\u00bd\3\2\2\2"+
		"\u00be\u00bf\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c2\79\2\2\u00c1\u00c3"+
		"\7\f\2\2\u00c2\u00c1\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4"+
		"\u00c5\7\13\2\2\u00c5\u00c6\5\32\16\2\u00c6\u00c7\7\f\2\2\u00c7\u00ca"+
		"\3\2\2\2\u00c8\u00ca\7\4\2\2\u00c9\u00ad\3\2\2\2\u00c9\u00b9\3\2\2\2\u00c9"+
		"\u00c8\3\2\2\2\u00ca\13\3\2\2\2\u00cb\u00d1\7\17\2\2\u00cc\u00cd\5\16"+
		"\b\2\u00cd\u00ce\b\7\1\2\u00ce\u00d0\3\2\2\2\u00cf\u00cc\3\2\2\2\u00d0"+
		"\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d4\3\2"+
		"\2\2\u00d3\u00d1\3\2\2\2\u00d4\u00d9\7\20\2\2\u00d5\u00d6\5\16\b\2\u00d6"+
		"\u00d7\b\7\1\2\u00d7\u00d9\3\2\2\2\u00d8\u00cb\3\2\2\2\u00d8\u00d5\3\2"+
		"\2\2\u00d9\r\3\2\2\2\u00da\u00db\5\6\4\2\u00db\u00dc\7(\2\2\u00dc\u00dd"+
		"\b\b\1\2\u00dd\u00eb\3\2\2\2\u00de\u00df\5\20\t\2\u00df\u00e0\7(\2\2\u00e0"+
		"\u00e1\b\b\1\2\u00e1\u00eb\3\2\2\2\u00e2\u00e3\5\30\r\2\u00e3\u00e4\7"+
		"(\2\2\u00e4\u00e5\b\b\1\2\u00e5\u00eb\3\2\2\2\u00e6\u00e7\5\22\n\2\u00e7"+
		"\u00e8\b\b\1\2\u00e8\u00eb\3\2\2\2\u00e9\u00eb\5\24\13\2\u00ea\u00da\3"+
		"\2\2\2\u00ea\u00de\3\2\2\2\u00ea\u00e2\3\2\2\2\u00ea\u00e6\3\2\2\2\u00ea"+
		"\u00e9\3\2\2\2\u00eb\17\3\2\2\2\u00ec\u00ed\b\t\1\2\u00ed\u00ee\79\2\2"+
		"\u00ee\u00f9\7\13\2\2\u00ef\u00f4\5\20\t\2\u00f0\u00f1\7\'\2\2\u00f1\u00f3"+
		"\5\20\t\2\u00f2\u00f0\3\2\2\2\u00f3\u00f6\3\2\2\2\u00f4\u00f2\3\2\2\2"+
		"\u00f4\u00f5\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f7\u00ef"+
		"\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa"+
		"\u00fc\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fc\u0126\7\f\2\2\u00fd\u00fe\79"+
		"\2\2\u00fe\u00ff\7\r\2\2\u00ff\u0100\5\20\t\2\u0100\u0101\7\16\2\2\u0101"+
		"\u0126\3\2\2\2\u0102\u0103\79\2\2\u0103\u0104\7\65\2\2\u0104\u0126\79"+
		"\2\2\u0105\u0106\7\31\2\2\u0106\u0126\5\20\t\27\u0107\u0108\7\32\2\2\u0108"+
		"\u0126\5\20\t\26\u0109\u010a\7%\2\2\u010a\u0126\5\20\t\25\u010b\u010c"+
		"\7&\2\2\u010c\u0126\5\20\t\24\u010d\u010e\7\13\2\2\u010e\u0112\5\32\16"+
		"\2\u010f\u0111\7\35\2\2\u0110\u010f\3\2\2\2\u0111\u0114\3\2\2\2\u0112"+
		"\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0115\3\2\2\2\u0114\u0112\3\2"+
		"\2\2\u0115\u0116\7\f\2\2\u0116\u0117\5\20\t\23\u0117\u0126\3\2\2\2\u0118"+
		"\u0119\7\35\2\2\u0119\u0126\5\20\t\22\u011a\u011b\7 \2\2\u011b\u0126\5"+
		"\20\t\21\u011c\u011d\7\13\2\2\u011d\u011e\5\20\t\2\u011e\u011f\7\f\2\2"+
		"\u011f\u0120\b\t\1\2\u0120\u0126\3\2\2\2\u0121\u0122\79\2\2\u0122\u0126"+
		"\b\t\1\2\u0123\u0124\7\66\2\2\u0124\u0126\b\t\1\2\u0125\u00ec\3\2\2\2"+
		"\u0125\u00fd\3\2\2\2\u0125\u0102\3\2\2\2\u0125\u0105\3\2\2\2\u0125\u0107"+
		"\3\2\2\2\u0125\u0109\3\2\2\2\u0125\u010b\3\2\2\2\u0125\u010d\3\2\2\2\u0125"+
		"\u0118\3\2\2\2\u0125\u011a\3\2\2\2\u0125\u011c\3\2\2\2\u0125\u0121\3\2"+
		"\2\2\u0125\u0123\3\2\2\2\u0126\u0169\3\2\2\2\u0127\u0128\f\20\2\2\u0128"+
		"\u0129\t\2\2\2\u0129\u012a\5\20\t\21\u012a\u012b\b\t\1\2\u012b\u0168\3"+
		"\2\2\2\u012c\u012d\f\17\2\2\u012d\u012e\t\3\2\2\u012e\u012f\5\20\t\20"+
		"\u012f\u0130\b\t\1\2\u0130\u0168\3\2\2\2\u0131\u0132\f\16\2\2\u0132\u0133"+
		"\t\4\2\2\u0133\u0134\5\20\t\17\u0134\u0135\b\t\1\2\u0135\u0168\3\2\2\2"+
		"\u0136\u0137\f\r\2\2\u0137\u0138\t\5\2\2\u0138\u0139\5\20\t\16\u0139\u013a"+
		"\b\t\1\2\u013a\u0168\3\2\2\2\u013b\u013c\f\f\2\2\u013c\u013d\t\6\2\2\u013d"+
		"\u013e\5\20\t\r\u013e\u013f\b\t\1\2\u013f\u0168\3\2\2\2\u0140\u0141\f"+
		"\13\2\2\u0141\u0142\7 \2\2\u0142\u0143\5\20\t\f\u0143\u0144\b\t\1\2\u0144"+
		"\u0168\3\2\2\2\u0145\u0146\f\n\2\2\u0146\u0147\7$\2\2\u0147\u0148\5\20"+
		"\t\13\u0148\u0149\b\t\1\2\u0149\u0168\3\2\2\2\u014a\u014b\f\t\2\2\u014b"+
		"\u014c\7!\2\2\u014c\u014d\5\20\t\n\u014d\u014e\b\t\1\2\u014e\u0168\3\2"+
		"\2\2\u014f\u0150\f\b\2\2\u0150\u0151\7\"\2\2\u0151\u0152\5\20\t\t\u0152"+
		"\u0153\b\t\1\2\u0153\u0168\3\2\2\2\u0154\u0155\f\7\2\2\u0155\u0156\7#"+
		"\2\2\u0156\u0157\5\20\t\b\u0157\u0158\b\t\1\2\u0158\u0168\3\2\2\2\u0159"+
		"\u015a\f\6\2\2\u015a\u015b\t\7\2\2\u015b\u015c\5\20\t\7\u015c\u015d\b"+
		"\t\1\2\u015d\u0168\3\2\2\2\u015e\u015f\f\35\2\2\u015f\u0160\7\33\2\2\u0160"+
		"\u0168\b\t\1\2\u0161\u0162\f\34\2\2\u0162\u0163\7\34\2\2\u0163\u0168\b"+
		"\t\1\2\u0164\u0165\f\31\2\2\u0165\u0166\7\64\2\2\u0166\u0168\79\2\2\u0167"+
		"\u0127\3\2\2\2\u0167\u012c\3\2\2\2\u0167\u0131\3\2\2\2\u0167\u0136\3\2"+
		"\2\2\u0167\u013b\3\2\2\2\u0167\u0140\3\2\2\2\u0167\u0145\3\2\2\2\u0167"+
		"\u014a\3\2\2\2\u0167\u014f\3\2\2\2\u0167\u0154\3\2\2\2\u0167\u0159\3\2"+
		"\2\2\u0167\u015e\3\2\2\2\u0167\u0161\3\2\2\2\u0167\u0164\3\2\2\2\u0168"+
		"\u016b\3\2\2\2\u0169\u0167\3\2\2\2\u0169\u016a\3\2\2\2\u016a\21\3\2\2"+
		"\2\u016b\u0169\3\2\2\2\u016c\u016d\7\7\2\2\u016d\u016e\7\13\2\2\u016e"+
		"\u016f\b\n\1\2\u016f\u0170\5\20\t\2\u0170\u0171\b\n\1\2\u0171\u0172\7"+
		"\f\2\2\u0172\u0173\b\n\1\2\u0173\u0174\5\f\7\2\u0174\u0179\b\n\1\2\u0175"+
		"\u0176\7\b\2\2\u0176\u0177\5\f\7\2\u0177\u0178\b\n\1\2\u0178\u017a\3\2"+
		"\2\2\u0179\u0175\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u017b\3\2\2\2\u017b"+
		"\u017c\b\n\1\2\u017c\23\3\2\2\2\u017d\u017e\7\t\2\2\u017e\u017f\7\13\2"+
		"\2\u017f\u0180\5\26\f\2\u0180\u0181\7\f\2\2\u0181\u0182\5\f\7\2\u0182"+
		"\u018b\3\2\2\2\u0183\u0184\7\n\2\2\u0184\u0186\7\13\2\2\u0185\u0187\5"+
		"\20\t\2\u0186\u0185\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u0188\3\2\2\2\u0188"+
		"\u0189\7\f\2\2\u0189\u018b\5\f\7\2\u018a\u017d\3\2\2\2\u018a\u0183\3\2"+
		"\2\2\u018b\25\3\2\2\2\u018c\u0191\5\6\4\2\u018d\u018f\5\20\t\2\u018e\u018d"+
		"\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u0191\3\2\2\2\u0190\u018c\3\2\2\2\u0190"+
		"\u018e\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u0194\7(\2\2\u0193\u0195\5\20"+
		"\t\2\u0194\u0193\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u0196\3\2\2\2\u0196"+
		"\u0198\7(\2\2\u0197\u0199\5\20\t\2\u0198\u0197\3\2\2\2\u0198\u0199\3\2"+
		"\2\2\u0199\27\3\2\2\2\u019a\u019b\7\5\2\2\u019b\u019f\b\r\1\2\u019c\u019d"+
		"\5\20\t\2\u019d\u019e\b\r\1\2\u019e\u01a0\3\2\2\2\u019f\u019c\3\2\2\2"+
		"\u019f\u01a0\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a2\b\r\1\2\u01a2\31"+
		"\3\2\2\2\u01a3\u01a4\7\3\2\2\u01a4\u01aa\b\16\1\2\u01a5\u01a6\7\4\2\2"+
		"\u01a6\u01aa\b\16\1\2\u01a7\u01a8\7\6\2\2\u01a8\u01aa\79\2\2\u01a9\u01a3"+
		"\3\2\2\2\u01a9\u01a5\3\2\2\2\u01a9\u01a7\3\2\2\2\u01aa\33\3\2\2\2+\"."+
		"\66?GPTcqv|\177\u0083\u008b\u008e\u0095\u00a3\u00a6\u00b3\u00bb\u00be"+
		"\u00c2\u00c9\u00d1\u00d8\u00ea\u00f4\u00f9\u0112\u0125\u0167\u0169\u0179"+
		"\u0186\u018a\u018e\u0190\u0194\u0198\u019f\u01a9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}