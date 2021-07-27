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
		T__0=1, INT=2, VOID=3, RETURN=4, STRUCT=5, IF=6, ELSE=7, FOR=8, WHILE=9, 
		LeftParen=10, RightParen=11, LeftBracket=12, RightBracket=13, LeftBrace=14, 
		RightBrace=15, Less=16, LessEqual=17, Greater=18, GreaterEqual=19, LeftShift=20, 
		RightShift=21, Equal=22, NotEqual=23, Plus=24, Minus=25, PlusPlus=26, 
		MinusMinus=27, Star=28, Div=29, Mod=30, And=31, Or=32, AndAnd=33, OrOr=34, 
		Caret=35, Not=36, Tilde=37, Comma=38, Semi=39, Assign=40, StarAssign=41, 
		DivAssign=42, ModAssign=43, PlusAssign=44, MinusAssign=45, LeftShiftAssign=46, 
		RightShiftAssign=47, AndAssign=48, XorAssign=49, OrAssign=50, Dot=51, 
		Arrow=52, IntegerConstant=53, DecimalConstant=54, HexConstant=55, ID=56, 
		LineComment=57, WhiteSpace=58;
	public static final int
		RULE_globalSpace = 0, RULE_myGlobalCode = 1, RULE_myDeclare = 2, RULE_myFuncDefinition = 3, 
		RULE_myFuncInputPara = 4, RULE_myStatement = 5, RULE_myFuncBodyCode = 6, 
		RULE_myExpr = 7, RULE_mySelection = 8, RULE_myIteration = 9, RULE_myForCondi = 10, 
		RULE_myReturn = 11, RULE_myType = 12, RULE_myNL = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"globalSpace", "myGlobalCode", "myDeclare", "myFuncDefinition", "myFuncInputPara", 
			"myStatement", "myFuncBodyCode", "myExpr", "mySelection", "myIteration", 
			"myForCondi", "myReturn", "myType", "myNL"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\n'", "'int'", "'void'", "'return'", "'struct'", "'if'", "'else'", 
			"'for'", "'while'", "'('", "')'", "'['", "']'", "'{'", "'}'", "'<'", 
			"'<='", "'>'", "'>='", "'<<'", "'>>'", "'=='", "'!='", "'+'", "'-'", 
			"'++'", "'--'", "'*'", "'/'", "'%'", "'&'", "'|'", "'&&'", "'||'", "'^'", 
			"'!'", "'~'", "','", "';'", "'='", "'*='", "'/='", "'%='", "'+='", "'-='", 
			"'<<='", "'>>='", "'&='", "'^='", "'|='", "'.'", "'->'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "INT", "VOID", "RETURN", "STRUCT", "IF", "ELSE", "FOR", "WHILE", 
			"LeftParen", "RightParen", "LeftBracket", "RightBracket", "LeftBrace", 
			"RightBrace", "Less", "LessEqual", "Greater", "GreaterEqual", "LeftShift", 
			"RightShift", "Equal", "NotEqual", "Plus", "Minus", "PlusPlus", "MinusMinus", 
			"Star", "Div", "Mod", "And", "Or", "AndAnd", "OrOr", "Caret", "Not", 
			"Tilde", "Comma", "Semi", "Assign", "StarAssign", "DivAssign", "ModAssign", 
			"PlusAssign", "MinusAssign", "LeftShiftAssign", "RightShiftAssign", "AndAssign", 
			"XorAssign", "OrAssign", "Dot", "Arrow", "IntegerConstant", "DecimalConstant", 
			"HexConstant", "ID", "LineComment", "WhiteSpace"
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


	nl_count=0;

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
			setState(34);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << INT) | (1L << VOID) | (1L << STRUCT))) != 0)) {
				{
				{
				setState(29);
				((GlobalSpaceContext)_localctx).g = myGlobalCode();
				_localctx.finalAST += '%s'%(((GlobalSpaceContext)_localctx).g.myGlobalAST)
				}
				}
				setState(36);
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
		public MyNLContext myNL;
		public TerminalNode Semi() { return getToken(v3_compilerParser.Semi, 0); }
		public MyDeclareContext myDeclare() {
			return getRuleContext(MyDeclareContext.class,0);
		}
		public MyFuncDefinitionContext myFuncDefinition() {
			return getRuleContext(MyFuncDefinitionContext.class,0);
		}
		public MyNLContext myNL() {
			return getRuleContext(MyNLContext.class,0);
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
			setState(49);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(39);
				((MyGlobalCodeContext)_localctx).d = myDeclare();
				setState(40);
				match(Semi);
				_localctx.myGlobalAST += '(%s)myDeclare'%(((MyGlobalCodeContext)_localctx).d.myDeclareAST)
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
				((MyGlobalCodeContext)_localctx).myFuncDefinition = myFuncDefinition();
				_localctx.myGlobalAST += '(%s)myFuncDefinition'%(((MyGlobalCodeContext)_localctx).myFuncDefinition.myFuncDefinitionAST)
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(46);
				((MyGlobalCodeContext)_localctx).myNL = myNL();
				_localctx.myGlobalAST += '%s'%(((MyGlobalCodeContext)_localctx).myNL.myNLAST)
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
		public MyStatementContext myStatement;
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
			setState(149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				((MyDeclareContext)_localctx).myType = myType();
				_localctx.myDeclareAST += '((%s'%(((MyDeclareContext)_localctx).myType.myTypeAST)
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Star) {
					{
					{
					setState(53);
					match(Star);
					_localctx.myDeclareAST += '*'
					}
					}
					setState(59);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(60);
				((MyDeclareContext)_localctx).id1 = match(ID);
				_localctx.myDeclareAST += ')type,(%s)var)myDeclare'%((((MyDeclareContext)_localctx).id1!=null?((MyDeclareContext)_localctx).id1.getText():null))
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Assign) {
					{
					setState(62);
					match(Assign);
					setState(63);
					((MyDeclareContext)_localctx).myExpr = myExpr(0);
					_localctx.myDeclareAST += '((=)op,(%s)var,%s)myExpr'%((((MyDeclareContext)_localctx).id1!=null?((MyDeclareContext)_localctx).id1.getText():null), ((MyDeclareContext)_localctx).myExpr.myExprAST)
					}
				}

				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(68);
					match(Comma);
					_localctx.myDeclareAST += '((%s'%(((MyDeclareContext)_localctx).myType.myTypeAST)
					setState(74);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Star) {
						{
						{
						setState(70);
						match(Star);
						_localctx.myDeclareAST += '*'
						}
						}
						setState(76);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(77);
					((MyDeclareContext)_localctx).id2 = match(ID);
					_localctx.myDeclareAST += ')type,(%s)var)myDeclare'%((((MyDeclareContext)_localctx).id2!=null?((MyDeclareContext)_localctx).id2.getText():null))
					setState(83);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Assign) {
						{
						setState(79);
						match(Assign);
						setState(80);
						((MyDeclareContext)_localctx).myExpr = myExpr(0);
						_localctx.myDeclareAST += '((=)op,(%s)var,%s)myExpr'%((((MyDeclareContext)_localctx).id2!=null?((MyDeclareContext)_localctx).id2.getText():null), ((MyDeclareContext)_localctx).myExpr.myExprAST)
						}
					}

					}
					}
					setState(89);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				((MyDeclareContext)_localctx).myType = myType();
				setState(91);
				((MyDeclareContext)_localctx).ID = match(ID);
				setState(92);
				match(LeftBracket);
				setState(93);
				((MyDeclareContext)_localctx).IntegerConstant = match(IntegerConstant);
				setState(94);
				match(RightBracket);
				_localctx.myDeclareAST += '((%s[%s])type,(%s)var'%(((MyDeclareContext)_localctx).myType.myTypeAST, (((MyDeclareContext)_localctx).IntegerConstant!=null?((MyDeclareContext)_localctx).IntegerConstant.getText():null), (((MyDeclareContext)_localctx).ID!=null?((MyDeclareContext)_localctx).ID.getText():null))
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LeftBracket) {
					{
					{
					setState(96);
					match(LeftBracket);
					setState(97);
					((MyDeclareContext)_localctx).IntegerConstant = match(IntegerConstant);
					setState(98);
					match(RightBracket);
					}
					}
					setState(103);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Assign) {
					{
					setState(104);
					match(Assign);
					setState(105);
					match(LeftBrace);
					setState(106);
					((MyDeclareContext)_localctx).int1 = match(IntegerConstant);
					setState(111);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Comma) {
						{
						{
						setState(107);
						match(Comma);
						setState(108);
						((MyDeclareContext)_localctx).int2 = match(IntegerConstant);
						}
						}
						setState(113);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(114);
					match(RightBrace);
					}
				}

				_localctx.myDeclareAST += ')myDeclare'
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(119);
				myType();
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LeftParen) {
					{
					setState(120);
					match(LeftParen);
					}
				}

				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Star) {
					{
					setState(123);
					match(Star);
					}
				}

				setState(126);
				match(ID);
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RightParen) {
					{
					setState(127);
					match(RightParen);
					}
				}

				setState(130);
				match(LeftParen);
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << VOID) | (1L << STRUCT))) != 0)) {
					{
					setState(131);
					myFuncInputPara();
					setState(136);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Comma) {
						{
						{
						setState(132);
						match(Comma);
						setState(133);
						myFuncInputPara();
						}
						}
						setState(138);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(141);
				match(RightParen);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(143);
				match(STRUCT);
				setState(144);
				((MyDeclareContext)_localctx).ID = match(ID);
				_localctx.myDeclareAST += '((%s)myStructName' %((((MyDeclareContext)_localctx).ID!=null?((MyDeclareContext)_localctx).ID.getText():null))
				setState(146);
				((MyDeclareContext)_localctx).myStatement = myStatement();
				_localctx.myDeclareAST += '(%s)myStructBody)myStructDefinition' %(((MyDeclareContext)_localctx).myStatement.myStatementAST)
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
			setState(151);
			((MyFuncDefinitionContext)_localctx).myType = myType();
			setState(152);
			((MyFuncDefinitionContext)_localctx).ID = match(ID);
			setState(153);
			match(LeftParen);
			_localctx.myFuncDefinitionAST += '(%s)returnType,(%s)funcName,('%(((MyFuncDefinitionContext)_localctx).myType.myTypeAST, (((MyFuncDefinitionContext)_localctx).ID!=null?((MyFuncDefinitionContext)_localctx).ID.getText():null))
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << VOID) | (1L << STRUCT))) != 0)) {
				{
				setState(155);
				((MyFuncDefinitionContext)_localctx).myFuncInputPara = myFuncInputPara();
				_localctx.myFuncDefinitionAST += '%s'%(((MyFuncDefinitionContext)_localctx).myFuncInputPara.myFuncInputParaAST)
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(157);
					match(Comma);
					setState(158);
					((MyFuncDefinitionContext)_localctx).myFuncInputPara = myFuncInputPara();
					_localctx.myFuncDefinitionAST += ',%s'%(((MyFuncDefinitionContext)_localctx).myFuncInputPara.myFuncInputParaAST)
					}
					}
					setState(165);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			_localctx.myFuncDefinitionAST += ')myFuncInputPara,'
			setState(169);
			match(RightParen);
			setState(170);
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
			setState(201);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				((MyFuncInputParaContext)_localctx).myType = myType();
				_localctx.myFuncInputParaAST += '((%s'%(((MyFuncInputParaContext)_localctx).myType.myTypeAST)
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Star) {
					{
					{
					setState(175);
					match(Star);
					_localctx.myFuncInputParaAST += '*'
					}
					}
					setState(181);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(182);
				((MyFuncInputParaContext)_localctx).ID = match(ID);
				_localctx.myFuncInputParaAST +=')type,(%s)var)myDeclare'%((((MyFuncInputParaContext)_localctx).ID!=null?((MyFuncInputParaContext)_localctx).ID.getText():null))
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				myType();
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LeftParen) {
					{
					setState(186);
					match(LeftParen);
					}
				}

				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Star) {
					{
					setState(189);
					match(Star);
					}
				}

				setState(192);
				match(ID);
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RightParen) {
					{
					setState(193);
					match(RightParen);
					}
				}

				setState(196);
				match(LeftParen);
				setState(197);
				myType();
				setState(198);
				match(RightParen);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(200);
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
		public MyNLContext myNL;
		public MyFuncBodyCodeContext myFuncBodyCode;
		public TerminalNode LeftBrace() { return getToken(v3_compilerParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(v3_compilerParser.RightBrace, 0); }
		public List<MyNLContext> myNL() {
			return getRuleContexts(MyNLContext.class);
		}
		public MyNLContext myNL(int i) {
			return getRuleContext(MyNLContext.class,i);
		}
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
			int _alt;
			setState(232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(203);
					((MyStatementContext)_localctx).myNL = myNL();
					_localctx.myStatementAST += '%s'%(((MyStatementContext)_localctx).myNL.myNLAST)
					}
					}
					setState(210);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(211);
				match(LeftBrace);
				setState(217);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(212);
						((MyStatementContext)_localctx).myNL = myNL();
						_localctx.myStatementAST += '%s'%(((MyStatementContext)_localctx).myNL.myNLAST)
						}
						} 
					}
					setState(219);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				}
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << INT) | (1L << VOID) | (1L << RETURN) | (1L << STRUCT) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << LeftParen) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << And) | (1L << Not) | (1L << Tilde) | (1L << IntegerConstant) | (1L << ID))) != 0)) {
					{
					{
					setState(220);
					((MyStatementContext)_localctx).myFuncBodyCode = myFuncBodyCode();
					_localctx.myStatementAST += '%s'%(((MyStatementContext)_localctx).myFuncBodyCode.myFuncBodyCodeAST)
					}
					}
					setState(227);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(228);
				match(RightBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(229);
				((MyStatementContext)_localctx).myFuncBodyCode = myFuncBodyCode();
				_localctx.myStatementAST += '%s'%(((MyStatementContext)_localctx).myFuncBodyCode.myFuncBodyCodeAST)
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

	public static class MyFuncBodyCodeContext extends ParserRuleContext {
		public  myFuncBodyCodeAST = '';
		public MyDeclareContext myDeclare;
		public MyExprContext myExpr;
		public MyReturnContext myReturn;
		public MySelectionContext mySelection;
		public MyIterationContext myIteration;
		public MyNLContext myNL;
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
		public MyNLContext myNL() {
			return getRuleContext(MyNLContext.class,0);
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
			setState(255);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case VOID:
			case STRUCT:
				enterOuterAlt(_localctx, 1);
				{
				setState(234);
				((MyFuncBodyCodeContext)_localctx).myDeclare = myDeclare();
				setState(235);
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
				setState(238);
				((MyFuncBodyCodeContext)_localctx).myExpr = myExpr(0);
				setState(239);
				match(Semi);
				_localctx.myFuncBodyCodeAST += '%s'%(((MyFuncBodyCodeContext)_localctx).myExpr.myExprAST)
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 3);
				{
				setState(242);
				((MyFuncBodyCodeContext)_localctx).myReturn = myReturn();
				setState(243);
				match(Semi);
				_localctx.myFuncBodyCodeAST += '%s'%(((MyFuncBodyCodeContext)_localctx).myReturn.myReturnAST)
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 4);
				{
				setState(246);
				((MyFuncBodyCodeContext)_localctx).mySelection = mySelection();
				_localctx.myFuncBodyCodeAST += '%s'%(((MyFuncBodyCodeContext)_localctx).mySelection.mySelectionAST)
				}
				break;
			case FOR:
			case WHILE:
				enterOuterAlt(_localctx, 5);
				{
				setState(249);
				((MyFuncBodyCodeContext)_localctx).myIteration = myIteration();
				_localctx.myFuncBodyCodeAST += '%s'%(((MyFuncBodyCodeContext)_localctx).myIteration.myIterationAST)
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 6);
				{
				setState(252);
				((MyFuncBodyCodeContext)_localctx).myNL = myNL();
				_localctx.myFuncBodyCodeAST += '%s'%(((MyFuncBodyCodeContext)_localctx).myNL.myNLAST)
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
		public MyExprContext myExpr;
		public MyTypeContext myType;
		public Token IntegerConstant;
		public Token op;
		public MyExprContext e2;
		public TerminalNode ID() { return getToken(v3_compilerParser.ID, 0); }
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
		public TerminalNode Arrow() { return getToken(v3_compilerParser.Arrow, 0); }
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
			setState(326);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(258);
				((MyExprContext)_localctx).ID = match(ID);
				setState(259);
				match(LeftParen);
				_localctx.myExprAST += '((%s)myFuncName('%((((MyExprContext)_localctx).ID!=null?((MyExprContext)_localctx).ID.getText():null))
				setState(274);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LeftParen) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << And) | (1L << Not) | (1L << Tilde) | (1L << IntegerConstant) | (1L << ID))) != 0)) {
					{
					{
					setState(261);
					((MyExprContext)_localctx).myExpr = myExpr(0);
					_localctx.myExprAST += '%s'%(((MyExprContext)_localctx).myExpr.myExprAST)
					setState(269);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Comma) {
						{
						{
						setState(263);
						match(Comma);
						setState(264);
						((MyExprContext)_localctx).myExpr = myExpr(0);
						_localctx.myExprAST += '%s'%(((MyExprContext)_localctx).myExpr.myExprAST)
						}
						}
						setState(271);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(276);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				_localctx.myExprAST += ')inputPara)myFuncCall'
				setState(278);
				match(RightParen);
				}
				break;
			case 2:
				{
				setState(279);
				((MyExprContext)_localctx).ID = match(ID);
				setState(280);
				match(LeftBracket);
				setState(281);
				((MyExprContext)_localctx).myExpr = myExpr(0);
				setState(282);
				match(RightBracket);
				_localctx.myExprAST += '((%s)arrayName,(%s)arrayIndex)myArrayVar'%((((MyExprContext)_localctx).ID!=null?((MyExprContext)_localctx).ID.getText():null), ((MyExprContext)_localctx).myExpr.myExprAST)
				}
				break;
			case 3:
				{
				setState(285);
				match(Plus);
				setState(286);
				((MyExprContext)_localctx).myExpr = myExpr(21);
				_localctx.myExprAST += '%s'%(((MyExprContext)_localctx).myExpr.myExprAST)
				}
				break;
			case 4:
				{
				setState(289);
				match(Minus);
				setState(290);
				((MyExprContext)_localctx).myExpr = myExpr(20);
				_localctx.myExprAST += '((*)op,%s,(-1)intConst)myExpr'%(((MyExprContext)_localctx).myExpr.myExprAST)
				}
				break;
			case 5:
				{
				setState(293);
				match(Not);
				setState(294);
				((MyExprContext)_localctx).myExpr = myExpr(19);
				}
				break;
			case 6:
				{
				setState(295);
				match(Tilde);
				setState(296);
				((MyExprContext)_localctx).myExpr = myExpr(18);
				}
				break;
			case 7:
				{
				setState(297);
				match(LeftParen);
				setState(298);
				((MyExprContext)_localctx).myType = myType();
				setState(302);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Star) {
					{
					{
					setState(299);
					match(Star);
					}
					}
					setState(304);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(305);
				match(RightParen);
				setState(306);
				((MyExprContext)_localctx).myExpr = myExpr(17);
				_localctx.myExprAST += '((%s)castingType,%s)myCasting'%(((MyExprContext)_localctx).myType.myTypeAST, ((MyExprContext)_localctx).myExpr.myExprAST)
				}
				break;
			case 8:
				{
				setState(309);
				match(Star);
				setState(310);
				((MyExprContext)_localctx).myExpr = myExpr(16);
				_localctx.myExprAST += '(%s)addrContent'%(((MyExprContext)_localctx).myExpr.myExprAST)
				}
				break;
			case 9:
				{
				setState(313);
				match(And);
				setState(314);
				((MyExprContext)_localctx).myExpr = myExpr(15);
				_localctx.myExprAST += '(%s)varAddr'%(((MyExprContext)_localctx).myExpr.myExprAST)
				}
				break;
			case 10:
				{
				setState(317);
				match(LeftParen);
				setState(318);
				((MyExprContext)_localctx).myExpr = myExpr(0);
				setState(319);
				match(RightParen);
				_localctx.myExprAST += '%s'%(((MyExprContext)_localctx).myExpr.myExprAST)
				}
				break;
			case 11:
				{
				setState(322);
				((MyExprContext)_localctx).ID = match(ID);
				_localctx.myExprAST += '(%s)var'%((((MyExprContext)_localctx).ID!=null?((MyExprContext)_localctx).ID.getText():null))
				}
				break;
			case 12:
				{
				setState(324);
				((MyExprContext)_localctx).IntegerConstant = match(IntegerConstant);
				_localctx.myExprAST += '(%s)intConst'%((((MyExprContext)_localctx).IntegerConstant!=null?((MyExprContext)_localctx).IntegerConstant.getText():null))
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(399);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(397);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
					case 1:
						{
						_localctx = new MyExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_myExpr);
						setState(328);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(329);
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
						setState(330);
						((MyExprContext)_localctx).e2 = ((MyExprContext)_localctx).myExpr = myExpr(15);
						_localctx.myExprAST += '((%s)op,%s,%s)myExpr'%((((MyExprContext)_localctx).op!=null?((MyExprContext)_localctx).op.getText():null), ((MyExprContext)_localctx).e1.myExprAST, ((MyExprContext)_localctx).e2.myExprAST)
						}
						break;
					case 2:
						{
						_localctx = new MyExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_myExpr);
						setState(333);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(334);
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
						setState(335);
						((MyExprContext)_localctx).e2 = ((MyExprContext)_localctx).myExpr = myExpr(14);
						_localctx.myExprAST += '((%s)op,%s,%s)myExpr'%((((MyExprContext)_localctx).op!=null?((MyExprContext)_localctx).op.getText():null), ((MyExprContext)_localctx).e1.myExprAST, ((MyExprContext)_localctx).e2.myExprAST)
						}
						break;
					case 3:
						{
						_localctx = new MyExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_myExpr);
						setState(338);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(339);
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
						setState(340);
						((MyExprContext)_localctx).e2 = ((MyExprContext)_localctx).myExpr = myExpr(13);
						_localctx.myExprAST += '((%s)op,%s,%s)myExpr'%((((MyExprContext)_localctx).op!=null?((MyExprContext)_localctx).op.getText():null), ((MyExprContext)_localctx).e1.myExprAST, ((MyExprContext)_localctx).e2.myExprAST)
						}
						break;
					case 4:
						{
						_localctx = new MyExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_myExpr);
						setState(343);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(344);
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
						setState(345);
						((MyExprContext)_localctx).e2 = ((MyExprContext)_localctx).myExpr = myExpr(12);
						_localctx.myExprAST += '((%s)cmpOp,%s,%s)myExpr'%((((MyExprContext)_localctx).op!=null?((MyExprContext)_localctx).op.getText():null), ((MyExprContext)_localctx).e1.myExprAST, ((MyExprContext)_localctx).e2.myExprAST)
						}
						break;
					case 5:
						{
						_localctx = new MyExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_myExpr);
						setState(348);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(349);
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
						setState(350);
						((MyExprContext)_localctx).e2 = ((MyExprContext)_localctx).myExpr = myExpr(11);
						_localctx.myExprAST += '((%s)cmpOp,%s,%s)myExpr'%((((MyExprContext)_localctx).op!=null?((MyExprContext)_localctx).op.getText():null), ((MyExprContext)_localctx).e1.myExprAST, ((MyExprContext)_localctx).e2.myExprAST)
						}
						break;
					case 6:
						{
						_localctx = new MyExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_myExpr);
						setState(353);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(354);
						((MyExprContext)_localctx).op = match(And);
						setState(355);
						((MyExprContext)_localctx).e2 = ((MyExprContext)_localctx).myExpr = myExpr(10);
						_localctx.myExprAST += '((%s)op,%s,%s)myExpr'%((((MyExprContext)_localctx).op!=null?((MyExprContext)_localctx).op.getText():null), ((MyExprContext)_localctx).e1.myExprAST, ((MyExprContext)_localctx).e2.myExprAST)
						}
						break;
					case 7:
						{
						_localctx = new MyExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_myExpr);
						setState(358);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(359);
						((MyExprContext)_localctx).op = match(Caret);
						setState(360);
						((MyExprContext)_localctx).e2 = ((MyExprContext)_localctx).myExpr = myExpr(9);
						_localctx.myExprAST += '((%s)op,%s,%s)myExpr'%((((MyExprContext)_localctx).op!=null?((MyExprContext)_localctx).op.getText():null), ((MyExprContext)_localctx).e1.myExprAST, ((MyExprContext)_localctx).e2.myExprAST)
						}
						break;
					case 8:
						{
						_localctx = new MyExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_myExpr);
						setState(363);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(364);
						((MyExprContext)_localctx).op = match(Or);
						setState(365);
						((MyExprContext)_localctx).e2 = ((MyExprContext)_localctx).myExpr = myExpr(8);
						_localctx.myExprAST += '((%s)op,%s,%s)myExpr'%((((MyExprContext)_localctx).op!=null?((MyExprContext)_localctx).op.getText():null), ((MyExprContext)_localctx).e1.myExprAST, ((MyExprContext)_localctx).e2.myExprAST)
						}
						break;
					case 9:
						{
						_localctx = new MyExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_myExpr);
						setState(368);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(369);
						((MyExprContext)_localctx).op = match(AndAnd);
						setState(370);
						((MyExprContext)_localctx).e2 = ((MyExprContext)_localctx).myExpr = myExpr(7);
						_localctx.myExprAST += '((%s)op,%s,%s)myExpr'%((((MyExprContext)_localctx).op!=null?((MyExprContext)_localctx).op.getText():null), ((MyExprContext)_localctx).e1.myExprAST, ((MyExprContext)_localctx).e2.myExprAST)
						}
						break;
					case 10:
						{
						_localctx = new MyExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_myExpr);
						setState(373);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(374);
						((MyExprContext)_localctx).op = match(OrOr);
						setState(375);
						((MyExprContext)_localctx).e2 = ((MyExprContext)_localctx).myExpr = myExpr(6);
						_localctx.myExprAST += '((%s)op,%s,%s)myExpr'%((((MyExprContext)_localctx).op!=null?((MyExprContext)_localctx).op.getText():null), ((MyExprContext)_localctx).e1.myExprAST, ((MyExprContext)_localctx).e2.myExprAST)
						}
						break;
					case 11:
						{
						_localctx = new MyExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_myExpr);
						setState(378);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(379);
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
						setState(380);
						((MyExprContext)_localctx).e2 = ((MyExprContext)_localctx).myExpr = myExpr(5);
						_localctx.myExprAST += '((%s)op,%s,%s)myExpr'%((((MyExprContext)_localctx).op!=null?((MyExprContext)_localctx).op.getText():null),((MyExprContext)_localctx).e1.myExprAST,((MyExprContext)_localctx).e2.myExprAST)
						}
						break;
					case 12:
						{
						_localctx = new MyExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_myExpr);
						setState(383);
						if (!(precpred(_ctx, 27))) throw new FailedPredicateException(this, "precpred(_ctx, 27)");
						setState(384);
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
						setState(386);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(387);
						match(MinusMinus);
						_localctx.myExprAST += '((=)op,%s,((-)op,%s,(1)intConst)myExpr)myExpr'%(((MyExprContext)_localctx).e1.myExprAST, ((MyExprContext)_localctx).e1.myExprAST)
						}
						break;
					case 14:
						{
						_localctx = new MyExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_myExpr);
						setState(389);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(390);
						match(Dot);
						setState(391);
						((MyExprContext)_localctx).ID = match(ID);
						_localctx.myExprAST += '(%s(%s)myStructMember)myStructVar' %(((MyExprContext)_localctx).e1.myExprAST, (((MyExprContext)_localctx).ID!=null?((MyExprContext)_localctx).ID.getText():null))
						}
						break;
					case 15:
						{
						_localctx = new MyExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_myExpr);
						setState(393);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(394);
						match(Arrow);
						setState(395);
						((MyExprContext)_localctx).ID = match(ID);
						_localctx.myExprAST += '(%s(%s)myStructMember)myPtrVar' %(((MyExprContext)_localctx).e1.myExprAST, (((MyExprContext)_localctx).ID!=null?((MyExprContext)_localctx).ID.getText():null))
						}
						break;
					}
					} 
				}
				setState(401);
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

	public static class MySelectionContext extends ParserRuleContext {
		public  mySelectionAST = '';
		public MyExprContext myExpr;
		public MyStatementContext myStatement;
		public MyNLContext myNL;
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
		public List<MyNLContext> myNL() {
			return getRuleContexts(MyNLContext.class);
		}
		public MyNLContext myNL(int i) {
			return getRuleContext(MyNLContext.class,i);
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			match(IF);
			setState(403);
			match(LeftParen);
			_localctx.mySelectionAST += '(('
			setState(405);
			((MySelectionContext)_localctx).myExpr = myExpr(0);
			_localctx.mySelectionAST +='%s'%(((MySelectionContext)_localctx).myExpr.myExprAST)
			setState(407);
			match(RightParen);
			_localctx.mySelectionAST +=')ifCondi'
			setState(409);
			((MySelectionContext)_localctx).myStatement = myStatement();
			_localctx.mySelectionAST += '(%s)ifBody'%(((MySelectionContext)_localctx).myStatement.myStatementAST)
			setState(416);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(411);
					((MySelectionContext)_localctx).myNL = myNL();
					_localctx.mySelectionAST += '%s'%(((MySelectionContext)_localctx).myNL.myNLAST)
					}
					} 
				}
				setState(418);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			}
			setState(423);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(419);
				match(ELSE);
				setState(420);
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
		public  myIterationAST = '';
		public MyForCondiContext myForCondi;
		public MyStatementContext myStatement;
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
			setState(443);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(427);
				match(FOR);
				setState(428);
				match(LeftParen);
				_localctx.myIterationAST += '('
				setState(430);
				((MyIterationContext)_localctx).myForCondi = myForCondi();
				setState(431);
				match(RightParen);
				_localctx.myIterationAST += '%s'%(((MyIterationContext)_localctx).myForCondi.myForCondiAST)
				setState(433);
				((MyIterationContext)_localctx).myStatement = myStatement();
				_localctx.myIterationAST += '(%s)forBody)myIteration'%(((MyIterationContext)_localctx).myStatement.myStatementAST)
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(436);
				match(WHILE);
				setState(437);
				match(LeftParen);
				setState(439);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LeftParen) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << And) | (1L << Not) | (1L << Tilde) | (1L << IntegerConstant) | (1L << ID))) != 0)) {
					{
					setState(438);
					myExpr(0);
					}
				}

				setState(441);
				match(RightParen);
				setState(442);
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
		public  myForCondiAST = '';
		public MyDeclareContext myDeclare;
		public MyExprContext myExpr;
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
			_localctx.myForCondiAST += '('
			setState(452);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case VOID:
			case STRUCT:
				{
				setState(446);
				((MyForCondiContext)_localctx).myDeclare = myDeclare();
				_localctx.myForCondiAST += '%s'%(((MyForCondiContext)_localctx).myDeclare.myDeclareAST)
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
				{
				setState(449);
				((MyForCondiContext)_localctx).myExpr = myExpr(0);
				_localctx.myForCondiAST += '%s'%(((MyForCondiContext)_localctx).myExpr.myExprAST)
				}
				break;
			case Semi:
				break;
			default:
				break;
			}
			_localctx.myForCondiAST += ')forInit('
			setState(455);
			match(Semi);
			setState(459);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LeftParen) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << And) | (1L << Not) | (1L << Tilde) | (1L << IntegerConstant) | (1L << ID))) != 0)) {
				{
				setState(456);
				((MyForCondiContext)_localctx).myExpr = myExpr(0);
				_localctx.myForCondiAST += '%s'%(((MyForCondiContext)_localctx).myExpr.myExprAST)
				}
			}

			_localctx.myForCondiAST += ')forCondi('
			setState(462);
			match(Semi);
			setState(466);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LeftParen) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << And) | (1L << Not) | (1L << Tilde) | (1L << IntegerConstant) | (1L << ID))) != 0)) {
				{
				setState(463);
				((MyForCondiContext)_localctx).myExpr = myExpr(0);
				_localctx.myForCondiAST += '%s'%(((MyForCondiContext)_localctx).myExpr.myExprAST)
				}
			}

			_localctx.myForCondiAST += ')forIncrement'
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
			setState(470);
			match(RETURN);
			_localctx.myReturnAST += '('
			setState(475);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LeftParen) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << And) | (1L << Not) | (1L << Tilde) | (1L << IntegerConstant) | (1L << ID))) != 0)) {
				{
				setState(472);
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
		public Token ID;
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
			setState(486);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(479);
				match(INT);
				_localctx.myTypeAST += 'int'
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(481);
				match(VOID);
				_localctx.myTypeAST += 'void'
				}
				break;
			case STRUCT:
				enterOuterAlt(_localctx, 3);
				{
				setState(483);
				match(STRUCT);
				setState(484);
				((MyTypeContext)_localctx).ID = match(ID);
				_localctx.myTypeAST += '(%s)myStruct'%((((MyTypeContext)_localctx).ID!=null?((MyTypeContext)_localctx).ID.getText():null))
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

	public static class MyNLContext extends ParserRuleContext {
		public  myNLAST = '';
		public MyNLContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_myNL; }
	}

	public final MyNLContext myNL() throws RecognitionException {
		MyNLContext _localctx = new MyNLContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_myNL);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488);
			match(T__0);
			self.nl_count = self.nl_count+1
			_localctx.myNLAST='(%i)myNL'%(self.nl_count)
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
		case 14:
			return precpred(_ctx, 22);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3<\u01ef\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\2\7\2#\n\2\f\2\16"+
		"\2&\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\64\n\3\3"+
		"\4\3\4\3\4\3\4\7\4:\n\4\f\4\16\4=\13\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4E\n"+
		"\4\3\4\3\4\3\4\3\4\7\4K\n\4\f\4\16\4N\13\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4"+
		"V\n\4\7\4X\n\4\f\4\16\4[\13\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4"+
		"f\n\4\f\4\16\4i\13\4\3\4\3\4\3\4\3\4\3\4\7\4p\n\4\f\4\16\4s\13\4\3\4\5"+
		"\4v\n\4\3\4\3\4\3\4\3\4\5\4|\n\4\3\4\5\4\177\n\4\3\4\3\4\5\4\u0083\n\4"+
		"\3\4\3\4\3\4\3\4\7\4\u0089\n\4\f\4\16\4\u008c\13\4\5\4\u008e\n\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0098\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\7\5\u00a4\n\5\f\5\16\5\u00a7\13\5\5\5\u00a9\n\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\7\6\u00b4\n\6\f\6\16\6\u00b7\13\6\3\6\3\6\3\6"+
		"\3\6\3\6\5\6\u00be\n\6\3\6\5\6\u00c1\n\6\3\6\3\6\5\6\u00c5\n\6\3\6\3\6"+
		"\3\6\3\6\3\6\5\6\u00cc\n\6\3\7\3\7\3\7\7\7\u00d1\n\7\f\7\16\7\u00d4\13"+
		"\7\3\7\3\7\3\7\3\7\7\7\u00da\n\7\f\7\16\7\u00dd\13\7\3\7\3\7\3\7\7\7\u00e2"+
		"\n\7\f\7\16\7\u00e5\13\7\3\7\3\7\3\7\3\7\5\7\u00eb\n\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5"+
		"\b\u0102\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u010e\n\t\f\t"+
		"\16\t\u0111\13\t\7\t\u0113\n\t\f\t\16\t\u0116\13\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\7\t\u012f\n\t\f\t\16\t\u0132\13\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0149\n\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u0190"+
		"\n\t\f\t\16\t\u0193\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\7\n\u01a1\n\n\f\n\16\n\u01a4\13\n\3\n\3\n\3\n\3\n\5\n\u01aa\n\n\3\n"+
		"\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13"+
		"\u01ba\n\13\3\13\3\13\5\13\u01be\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f"+
		"\u01c7\n\f\3\f\3\f\3\f\3\f\3\f\5\f\u01ce\n\f\3\f\3\f\3\f\3\f\3\f\5\f\u01d5"+
		"\n\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\5\r\u01de\n\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\5\16\u01e9\n\16\3\17\3\17\3\17\3\17\3\17\2\3\20\20"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\2\b\3\2\36 \3\2\32\33\3\2\26\27\3"+
		"\2\22\25\3\2\30\31\3\2*\64\2\u022c\2\36\3\2\2\2\4\63\3\2\2\2\6\u0097\3"+
		"\2\2\2\b\u0099\3\2\2\2\n\u00cb\3\2\2\2\f\u00ea\3\2\2\2\16\u0101\3\2\2"+
		"\2\20\u0148\3\2\2\2\22\u0194\3\2\2\2\24\u01bd\3\2\2\2\26\u01bf\3\2\2\2"+
		"\30\u01d8\3\2\2\2\32\u01e8\3\2\2\2\34\u01ea\3\2\2\2\36$\b\2\1\2\37 \5"+
		"\4\3\2 !\b\2\1\2!#\3\2\2\2\"\37\3\2\2\2#&\3\2\2\2$\"\3\2\2\2$%\3\2\2\2"+
		"%\'\3\2\2\2&$\3\2\2\2\'(\b\2\1\2(\3\3\2\2\2)*\5\6\4\2*+\7)\2\2+,\b\3\1"+
		"\2,\64\3\2\2\2-.\5\b\5\2./\b\3\1\2/\64\3\2\2\2\60\61\5\34\17\2\61\62\b"+
		"\3\1\2\62\64\3\2\2\2\63)\3\2\2\2\63-\3\2\2\2\63\60\3\2\2\2\64\5\3\2\2"+
		"\2\65\66\5\32\16\2\66;\b\4\1\2\678\7\36\2\28:\b\4\1\29\67\3\2\2\2:=\3"+
		"\2\2\2;9\3\2\2\2;<\3\2\2\2<>\3\2\2\2=;\3\2\2\2>?\7:\2\2?D\b\4\1\2@A\7"+
		"*\2\2AB\5\20\t\2BC\b\4\1\2CE\3\2\2\2D@\3\2\2\2DE\3\2\2\2EY\3\2\2\2FG\7"+
		"(\2\2GL\b\4\1\2HI\7\36\2\2IK\b\4\1\2JH\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3"+
		"\2\2\2MO\3\2\2\2NL\3\2\2\2OP\7:\2\2PU\b\4\1\2QR\7*\2\2RS\5\20\t\2ST\b"+
		"\4\1\2TV\3\2\2\2UQ\3\2\2\2UV\3\2\2\2VX\3\2\2\2WF\3\2\2\2X[\3\2\2\2YW\3"+
		"\2\2\2YZ\3\2\2\2Z\u0098\3\2\2\2[Y\3\2\2\2\\]\5\32\16\2]^\7:\2\2^_\7\16"+
		"\2\2_`\7\67\2\2`a\7\17\2\2ag\b\4\1\2bc\7\16\2\2cd\7\67\2\2df\7\17\2\2"+
		"eb\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2hu\3\2\2\2ig\3\2\2\2jk\7*\2\2"+
		"kl\7\20\2\2lq\7\67\2\2mn\7(\2\2np\7\67\2\2om\3\2\2\2ps\3\2\2\2qo\3\2\2"+
		"\2qr\3\2\2\2rt\3\2\2\2sq\3\2\2\2tv\7\21\2\2uj\3\2\2\2uv\3\2\2\2vw\3\2"+
		"\2\2wx\b\4\1\2x\u0098\3\2\2\2y{\5\32\16\2z|\7\f\2\2{z\3\2\2\2{|\3\2\2"+
		"\2|~\3\2\2\2}\177\7\36\2\2~}\3\2\2\2~\177\3\2\2\2\177\u0080\3\2\2\2\u0080"+
		"\u0082\7:\2\2\u0081\u0083\7\r\2\2\u0082\u0081\3\2\2\2\u0082\u0083\3\2"+
		"\2\2\u0083\u0084\3\2\2\2\u0084\u008d\7\f\2\2\u0085\u008a\5\n\6\2\u0086"+
		"\u0087\7(\2\2\u0087\u0089\5\n\6\2\u0088\u0086\3\2\2\2\u0089\u008c\3\2"+
		"\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008e\3\2\2\2\u008c"+
		"\u008a\3\2\2\2\u008d\u0085\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\3\2"+
		"\2\2\u008f\u0090\7\r\2\2\u0090\u0098\3\2\2\2\u0091\u0092\7\7\2\2\u0092"+
		"\u0093\7:\2\2\u0093\u0094\b\4\1\2\u0094\u0095\5\f\7\2\u0095\u0096\b\4"+
		"\1\2\u0096\u0098\3\2\2\2\u0097\65\3\2\2\2\u0097\\\3\2\2\2\u0097y\3\2\2"+
		"\2\u0097\u0091\3\2\2\2\u0098\7\3\2\2\2\u0099\u009a\5\32\16\2\u009a\u009b"+
		"\7:\2\2\u009b\u009c\7\f\2\2\u009c\u00a8\b\5\1\2\u009d\u009e\5\n\6\2\u009e"+
		"\u00a5\b\5\1\2\u009f\u00a0\7(\2\2\u00a0\u00a1\5\n\6\2\u00a1\u00a2\b\5"+
		"\1\2\u00a2\u00a4\3\2\2\2\u00a3\u009f\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5"+
		"\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5\3\2"+
		"\2\2\u00a8\u009d\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa"+
		"\u00ab\b\5\1\2\u00ab\u00ac\7\r\2\2\u00ac\u00ad\5\f\7\2\u00ad\u00ae\b\5"+
		"\1\2\u00ae\t\3\2\2\2\u00af\u00b0\5\32\16\2\u00b0\u00b5\b\6\1\2\u00b1\u00b2"+
		"\7\36\2\2\u00b2\u00b4\b\6\1\2\u00b3\u00b1\3\2\2\2\u00b4\u00b7\3\2\2\2"+
		"\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b8\3\2\2\2\u00b7\u00b5"+
		"\3\2\2\2\u00b8\u00b9\7:\2\2\u00b9\u00ba\b\6\1\2\u00ba\u00cc\3\2\2\2\u00bb"+
		"\u00bd\5\32\16\2\u00bc\u00be\7\f\2\2\u00bd\u00bc\3\2\2\2\u00bd\u00be\3"+
		"\2\2\2\u00be\u00c0\3\2\2\2\u00bf\u00c1\7\36\2\2\u00c0\u00bf\3\2\2\2\u00c0"+
		"\u00c1\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c4\7:\2\2\u00c3\u00c5\7\r"+
		"\2\2\u00c4\u00c3\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6"+
		"\u00c7\7\f\2\2\u00c7\u00c8\5\32\16\2\u00c8\u00c9\7\r\2\2\u00c9\u00cc\3"+
		"\2\2\2\u00ca\u00cc\7\5\2\2\u00cb\u00af\3\2\2\2\u00cb\u00bb\3\2\2\2\u00cb"+
		"\u00ca\3\2\2\2\u00cc\13\3\2\2\2\u00cd\u00ce\5\34\17\2\u00ce\u00cf\b\7"+
		"\1\2\u00cf\u00d1\3\2\2\2\u00d0\u00cd\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2"+
		"\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d5\3\2\2\2\u00d4\u00d2\3\2"+
		"\2\2\u00d5\u00db\7\20\2\2\u00d6\u00d7\5\34\17\2\u00d7\u00d8\b\7\1\2\u00d8"+
		"\u00da\3\2\2\2\u00d9\u00d6\3\2\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9\3\2"+
		"\2\2\u00db\u00dc\3\2\2\2\u00dc\u00e3\3\2\2\2\u00dd\u00db\3\2\2\2\u00de"+
		"\u00df\5\16\b\2\u00df\u00e0\b\7\1\2\u00e0\u00e2\3\2\2\2\u00e1\u00de\3"+
		"\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4"+
		"\u00e6\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6\u00eb\7\21\2\2\u00e7\u00e8\5"+
		"\16\b\2\u00e8\u00e9\b\7\1\2\u00e9\u00eb\3\2\2\2\u00ea\u00d2\3\2\2\2\u00ea"+
		"\u00e7\3\2\2\2\u00eb\r\3\2\2\2\u00ec\u00ed\5\6\4\2\u00ed\u00ee\7)\2\2"+
		"\u00ee\u00ef\b\b\1\2\u00ef\u0102\3\2\2\2\u00f0\u00f1\5\20\t\2\u00f1\u00f2"+
		"\7)\2\2\u00f2\u00f3\b\b\1\2\u00f3\u0102\3\2\2\2\u00f4\u00f5\5\30\r\2\u00f5"+
		"\u00f6\7)\2\2\u00f6\u00f7\b\b\1\2\u00f7\u0102\3\2\2\2\u00f8\u00f9\5\22"+
		"\n\2\u00f9\u00fa\b\b\1\2\u00fa\u0102\3\2\2\2\u00fb\u00fc\5\24\13\2\u00fc"+
		"\u00fd\b\b\1\2\u00fd\u0102\3\2\2\2\u00fe\u00ff\5\34\17\2\u00ff\u0100\b"+
		"\b\1\2\u0100\u0102\3\2\2\2\u0101\u00ec\3\2\2\2\u0101\u00f0\3\2\2\2\u0101"+
		"\u00f4\3\2\2\2\u0101\u00f8\3\2\2\2\u0101\u00fb\3\2\2\2\u0101\u00fe\3\2"+
		"\2\2\u0102\17\3\2\2\2\u0103\u0104\b\t\1\2\u0104\u0105\7:\2\2\u0105\u0106"+
		"\7\f\2\2\u0106\u0114\b\t\1\2\u0107\u0108\5\20\t\2\u0108\u010f\b\t\1\2"+
		"\u0109\u010a\7(\2\2\u010a\u010b\5\20\t\2\u010b\u010c\b\t\1\2\u010c\u010e"+
		"\3\2\2\2\u010d\u0109\3\2\2\2\u010e\u0111\3\2\2\2\u010f\u010d\3\2\2\2\u010f"+
		"\u0110\3\2\2\2\u0110\u0113\3\2\2\2\u0111\u010f\3\2\2\2\u0112\u0107\3\2"+
		"\2\2\u0113\u0116\3\2\2\2\u0114\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115"+
		"\u0117\3\2\2\2\u0116\u0114\3\2\2\2\u0117\u0118\b\t\1\2\u0118\u0149\7\r"+
		"\2\2\u0119\u011a\7:\2\2\u011a\u011b\7\16\2\2\u011b\u011c\5\20\t\2\u011c"+
		"\u011d\7\17\2\2\u011d\u011e\b\t\1\2\u011e\u0149\3\2\2\2\u011f\u0120\7"+
		"\32\2\2\u0120\u0121\5\20\t\27\u0121\u0122\b\t\1\2\u0122\u0149\3\2\2\2"+
		"\u0123\u0124\7\33\2\2\u0124\u0125\5\20\t\26\u0125\u0126\b\t\1\2\u0126"+
		"\u0149\3\2\2\2\u0127\u0128\7&\2\2\u0128\u0149\5\20\t\25\u0129\u012a\7"+
		"\'\2\2\u012a\u0149\5\20\t\24\u012b\u012c\7\f\2\2\u012c\u0130\5\32\16\2"+
		"\u012d\u012f\7\36\2\2\u012e\u012d\3\2\2\2\u012f\u0132\3\2\2\2\u0130\u012e"+
		"\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0133\3\2\2\2\u0132\u0130\3\2\2\2\u0133"+
		"\u0134\7\r\2\2\u0134\u0135\5\20\t\23\u0135\u0136\b\t\1\2\u0136\u0149\3"+
		"\2\2\2\u0137\u0138\7\36\2\2\u0138\u0139\5\20\t\22\u0139\u013a\b\t\1\2"+
		"\u013a\u0149\3\2\2\2\u013b\u013c\7!\2\2\u013c\u013d\5\20\t\21\u013d\u013e"+
		"\b\t\1\2\u013e\u0149\3\2\2\2\u013f\u0140\7\f\2\2\u0140\u0141\5\20\t\2"+
		"\u0141\u0142\7\r\2\2\u0142\u0143\b\t\1\2\u0143\u0149\3\2\2\2\u0144\u0145"+
		"\7:\2\2\u0145\u0149\b\t\1\2\u0146\u0147\7\67\2\2\u0147\u0149\b\t\1\2\u0148"+
		"\u0103\3\2\2\2\u0148\u0119\3\2\2\2\u0148\u011f\3\2\2\2\u0148\u0123\3\2"+
		"\2\2\u0148\u0127\3\2\2\2\u0148\u0129\3\2\2\2\u0148\u012b\3\2\2\2\u0148"+
		"\u0137\3\2\2\2\u0148\u013b\3\2\2\2\u0148\u013f\3\2\2\2\u0148\u0144\3\2"+
		"\2\2\u0148\u0146\3\2\2\2\u0149\u0191\3\2\2\2\u014a\u014b\f\20\2\2\u014b"+
		"\u014c\t\2\2\2\u014c\u014d\5\20\t\21\u014d\u014e\b\t\1\2\u014e\u0190\3"+
		"\2\2\2\u014f\u0150\f\17\2\2\u0150\u0151\t\3\2\2\u0151\u0152\5\20\t\20"+
		"\u0152\u0153\b\t\1\2\u0153\u0190\3\2\2\2\u0154\u0155\f\16\2\2\u0155\u0156"+
		"\t\4\2\2\u0156\u0157\5\20\t\17\u0157\u0158\b\t\1\2\u0158\u0190\3\2\2\2"+
		"\u0159\u015a\f\r\2\2\u015a\u015b\t\5\2\2\u015b\u015c\5\20\t\16\u015c\u015d"+
		"\b\t\1\2\u015d\u0190\3\2\2\2\u015e\u015f\f\f\2\2\u015f\u0160\t\6\2\2\u0160"+
		"\u0161\5\20\t\r\u0161\u0162\b\t\1\2\u0162\u0190\3\2\2\2\u0163\u0164\f"+
		"\13\2\2\u0164\u0165\7!\2\2\u0165\u0166\5\20\t\f\u0166\u0167\b\t\1\2\u0167"+
		"\u0190\3\2\2\2\u0168\u0169\f\n\2\2\u0169\u016a\7%\2\2\u016a\u016b\5\20"+
		"\t\13\u016b\u016c\b\t\1\2\u016c\u0190\3\2\2\2\u016d\u016e\f\t\2\2\u016e"+
		"\u016f\7\"\2\2\u016f\u0170\5\20\t\n\u0170\u0171\b\t\1\2\u0171\u0190\3"+
		"\2\2\2\u0172\u0173\f\b\2\2\u0173\u0174\7#\2\2\u0174\u0175\5\20\t\t\u0175"+
		"\u0176\b\t\1\2\u0176\u0190\3\2\2\2\u0177\u0178\f\7\2\2\u0178\u0179\7$"+
		"\2\2\u0179\u017a\5\20\t\b\u017a\u017b\b\t\1\2\u017b\u0190\3\2\2\2\u017c"+
		"\u017d\f\6\2\2\u017d\u017e\t\7\2\2\u017e\u017f\5\20\t\7\u017f\u0180\b"+
		"\t\1\2\u0180\u0190\3\2\2\2\u0181\u0182\f\35\2\2\u0182\u0183\7\34\2\2\u0183"+
		"\u0190\b\t\1\2\u0184\u0185\f\34\2\2\u0185\u0186\7\35\2\2\u0186\u0190\b"+
		"\t\1\2\u0187\u0188\f\31\2\2\u0188\u0189\7\65\2\2\u0189\u018a\7:\2\2\u018a"+
		"\u0190\b\t\1\2\u018b\u018c\f\30\2\2\u018c\u018d\7\66\2\2\u018d\u018e\7"+
		":\2\2\u018e\u0190\b\t\1\2\u018f\u014a\3\2\2\2\u018f\u014f\3\2\2\2\u018f"+
		"\u0154\3\2\2\2\u018f\u0159\3\2\2\2\u018f\u015e\3\2\2\2\u018f\u0163\3\2"+
		"\2\2\u018f\u0168\3\2\2\2\u018f\u016d\3\2\2\2\u018f\u0172\3\2\2\2\u018f"+
		"\u0177\3\2\2\2\u018f\u017c\3\2\2\2\u018f\u0181\3\2\2\2\u018f\u0184\3\2"+
		"\2\2\u018f\u0187\3\2\2\2\u018f\u018b\3\2\2\2\u0190\u0193\3\2\2\2\u0191"+
		"\u018f\3\2\2\2\u0191\u0192\3\2\2\2\u0192\21\3\2\2\2\u0193\u0191\3\2\2"+
		"\2\u0194\u0195\7\b\2\2\u0195\u0196\7\f\2\2\u0196\u0197\b\n\1\2\u0197\u0198"+
		"\5\20\t\2\u0198\u0199\b\n\1\2\u0199\u019a\7\r\2\2\u019a\u019b\b\n\1\2"+
		"\u019b\u019c\5\f\7\2\u019c\u01a2\b\n\1\2\u019d\u019e\5\34\17\2\u019e\u019f"+
		"\b\n\1\2\u019f\u01a1\3\2\2\2\u01a0\u019d\3\2\2\2\u01a1\u01a4\3\2\2\2\u01a2"+
		"\u01a0\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a9\3\2\2\2\u01a4\u01a2\3\2"+
		"\2\2\u01a5\u01a6\7\t\2\2\u01a6\u01a7\5\f\7\2\u01a7\u01a8\b\n\1\2\u01a8"+
		"\u01aa\3\2\2\2\u01a9\u01a5\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ab\3\2"+
		"\2\2\u01ab\u01ac\b\n\1\2\u01ac\23\3\2\2\2\u01ad\u01ae\7\n\2\2\u01ae\u01af"+
		"\7\f\2\2\u01af\u01b0\b\13\1\2\u01b0\u01b1\5\26\f\2\u01b1\u01b2\7\r\2\2"+
		"\u01b2\u01b3\b\13\1\2\u01b3\u01b4\5\f\7\2\u01b4\u01b5\b\13\1\2\u01b5\u01be"+
		"\3\2\2\2\u01b6\u01b7\7\13\2\2\u01b7\u01b9\7\f\2\2\u01b8\u01ba\5\20\t\2"+
		"\u01b9\u01b8\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01bc"+
		"\7\r\2\2\u01bc\u01be\5\f\7\2\u01bd\u01ad\3\2\2\2\u01bd\u01b6\3\2\2\2\u01be"+
		"\25\3\2\2\2\u01bf\u01c6\b\f\1\2\u01c0\u01c1\5\6\4\2\u01c1\u01c2\b\f\1"+
		"\2\u01c2\u01c7\3\2\2\2\u01c3\u01c4\5\20\t\2\u01c4\u01c5\b\f\1\2\u01c5"+
		"\u01c7\3\2\2\2\u01c6\u01c0\3\2\2\2\u01c6\u01c3\3\2\2\2\u01c6\u01c7\3\2"+
		"\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01c9\b\f\1\2\u01c9\u01cd\7)\2\2\u01ca"+
		"\u01cb\5\20\t\2\u01cb\u01cc\b\f\1\2\u01cc\u01ce\3\2\2\2\u01cd\u01ca\3"+
		"\2\2\2\u01cd\u01ce\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01d0\b\f\1\2\u01d0"+
		"\u01d4\7)\2\2\u01d1\u01d2\5\20\t\2\u01d2\u01d3\b\f\1\2\u01d3\u01d5\3\2"+
		"\2\2\u01d4\u01d1\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6"+
		"\u01d7\b\f\1\2\u01d7\27\3\2\2\2\u01d8\u01d9\7\6\2\2\u01d9\u01dd\b\r\1"+
		"\2\u01da\u01db\5\20\t\2\u01db\u01dc\b\r\1\2\u01dc\u01de\3\2\2\2\u01dd"+
		"\u01da\3\2\2\2\u01dd\u01de\3\2\2\2\u01de\u01df\3\2\2\2\u01df\u01e0\b\r"+
		"\1\2\u01e0\31\3\2\2\2\u01e1\u01e2\7\4\2\2\u01e2\u01e9\b\16\1\2\u01e3\u01e4"+
		"\7\5\2\2\u01e4\u01e9\b\16\1\2\u01e5\u01e6\7\7\2\2\u01e6\u01e7\7:\2\2\u01e7"+
		"\u01e9\b\16\1\2\u01e8\u01e1\3\2\2\2\u01e8\u01e3\3\2\2\2\u01e8\u01e5\3"+
		"\2\2\2\u01e9\33\3\2\2\2\u01ea\u01eb\7\3\2\2\u01eb\u01ec\b\17\1\2\u01ec"+
		"\u01ed\b\17\1\2\u01ed\35\3\2\2\2-$\63;DLUYgqu{~\u0082\u008a\u008d\u0097"+
		"\u00a5\u00a8\u00b5\u00bd\u00c0\u00c4\u00cb\u00d2\u00db\u00e3\u00ea\u0101"+
		"\u010f\u0114\u0130\u0148\u018f\u0191\u01a2\u01a9\u01b9\u01bd\u01c6\u01cd"+
		"\u01d4\u01dd\u01e8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}