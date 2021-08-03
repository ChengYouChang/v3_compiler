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
		RULE_globalSpace = 0, RULE_myGlobalCode = 1, RULE_myDeclare = 2, RULE_myFuncDeclare = 3, 
		RULE_myFuncDefinition = 4, RULE_myFuncInputPara = 5, RULE_myStatement = 6, 
		RULE_myFuncBodyCode = 7, RULE_myExpr = 8, RULE_mySelection = 9, RULE_myIteration = 10, 
		RULE_myForCondi = 11, RULE_myReturn = 12, RULE_myType = 13, RULE_myNL = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"globalSpace", "myGlobalCode", "myDeclare", "myFuncDeclare", "myFuncDefinition", 
			"myFuncInputPara", "myStatement", "myFuncBodyCode", "myExpr", "mySelection", 
			"myIteration", "myForCondi", "myReturn", "myType", "myNL"
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
			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << INT) | (1L << VOID) | (1L << STRUCT))) != 0)) {
				{
				{
				setState(31);
				((GlobalSpaceContext)_localctx).g = myGlobalCode();
				_localctx.finalAST += '%s'%(((GlobalSpaceContext)_localctx).g.myGlobalAST)
				}
				}
				setState(38);
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
		public MyFuncDeclareContext myFuncDeclare;
		public MyFuncDefinitionContext myFuncDefinition;
		public MyNLContext myNL;
		public TerminalNode Semi() { return getToken(v3_compilerParser.Semi, 0); }
		public MyDeclareContext myDeclare() {
			return getRuleContext(MyDeclareContext.class,0);
		}
		public MyFuncDeclareContext myFuncDeclare() {
			return getRuleContext(MyFuncDeclareContext.class,0);
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
			setState(54);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				((MyGlobalCodeContext)_localctx).d = myDeclare();
				setState(42);
				match(Semi);
				_localctx.myGlobalAST += '(%s)myDeclare'%(((MyGlobalCodeContext)_localctx).d.myDeclareAST)
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(45);
				((MyGlobalCodeContext)_localctx).myFuncDeclare = myFuncDeclare();
				_localctx.myGlobalAST += '(%s)myFuncDeclare'%(((MyGlobalCodeContext)_localctx).myFuncDeclare.myFuncDeclareAST)
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(48);
				((MyGlobalCodeContext)_localctx).myFuncDefinition = myFuncDefinition();
				_localctx.myGlobalAST += '(%s)myFuncDefinition'%(((MyGlobalCodeContext)_localctx).myFuncDefinition.myFuncDefinitionAST)
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(51);
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
			setState(155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				((MyDeclareContext)_localctx).myType = myType();
				_localctx.myDeclareAST += '((%s'%(((MyDeclareContext)_localctx).myType.myTypeAST)
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Star) {
					{
					{
					setState(58);
					match(Star);
					_localctx.myDeclareAST += '*'
					}
					}
					setState(64);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(65);
				((MyDeclareContext)_localctx).id1 = match(ID);
				_localctx.myDeclareAST += ')type,(%s)var)myDeclare'%((((MyDeclareContext)_localctx).id1!=null?((MyDeclareContext)_localctx).id1.getText():null))
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Assign) {
					{
					setState(67);
					match(Assign);
					setState(68);
					((MyDeclareContext)_localctx).myExpr = myExpr(0);
					_localctx.myDeclareAST += '((=)op,(%s)var,%s)myExpr'%((((MyDeclareContext)_localctx).id1!=null?((MyDeclareContext)_localctx).id1.getText():null), ((MyDeclareContext)_localctx).myExpr.myExprAST)
					}
				}

				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(73);
					match(Comma);
					_localctx.myDeclareAST += '((%s'%(((MyDeclareContext)_localctx).myType.myTypeAST)
					setState(79);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Star) {
						{
						{
						setState(75);
						match(Star);
						_localctx.myDeclareAST += '*'
						}
						}
						setState(81);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(82);
					((MyDeclareContext)_localctx).id2 = match(ID);
					_localctx.myDeclareAST += ')type,(%s)var)myDeclare'%((((MyDeclareContext)_localctx).id2!=null?((MyDeclareContext)_localctx).id2.getText():null))
					setState(88);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Assign) {
						{
						setState(84);
						match(Assign);
						setState(85);
						((MyDeclareContext)_localctx).myExpr = myExpr(0);
						_localctx.myDeclareAST += '((=)op,(%s)var,%s)myExpr'%((((MyDeclareContext)_localctx).id2!=null?((MyDeclareContext)_localctx).id2.getText():null), ((MyDeclareContext)_localctx).myExpr.myExprAST)
						}
					}

					}
					}
					setState(94);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				((MyDeclareContext)_localctx).myType = myType();
				setState(96);
				((MyDeclareContext)_localctx).ID = match(ID);
				setState(97);
				match(LeftBracket);
				setState(98);
				((MyDeclareContext)_localctx).IntegerConstant = match(IntegerConstant);
				setState(99);
				match(RightBracket);
				_localctx.myDeclareAST += '((%s[%s])type,(%s)var'%(((MyDeclareContext)_localctx).myType.myTypeAST, (((MyDeclareContext)_localctx).IntegerConstant!=null?((MyDeclareContext)_localctx).IntegerConstant.getText():null), (((MyDeclareContext)_localctx).ID!=null?((MyDeclareContext)_localctx).ID.getText():null))
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LeftBracket) {
					{
					{
					setState(101);
					match(LeftBracket);
					setState(102);
					((MyDeclareContext)_localctx).IntegerConstant = match(IntegerConstant);
					setState(103);
					match(RightBracket);
					}
					}
					setState(108);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Assign) {
					{
					setState(109);
					match(Assign);
					setState(110);
					match(LeftBrace);
					setState(111);
					((MyDeclareContext)_localctx).int1 = match(IntegerConstant);
					setState(116);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Comma) {
						{
						{
						setState(112);
						match(Comma);
						setState(113);
						((MyDeclareContext)_localctx).int2 = match(IntegerConstant);
						}
						}
						setState(118);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(119);
					match(RightBrace);
					}
				}

				_localctx.myDeclareAST += ')myDeclare'
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(124);
				((MyDeclareContext)_localctx).myType = myType();
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LeftParen) {
					{
					setState(125);
					match(LeftParen);
					}
				}

				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Star) {
					{
					setState(128);
					match(Star);
					}
				}

				setState(131);
				((MyDeclareContext)_localctx).ID = match(ID);
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RightParen) {
					{
					setState(132);
					match(RightParen);
					}
				}

				setState(135);
				match(LeftParen);
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << VOID) | (1L << STRUCT))) != 0)) {
					{
					setState(136);
					myFuncInputPara();
					setState(141);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Comma) {
						{
						{
						setState(137);
						match(Comma);
						setState(138);
						myFuncInputPara();
						}
						}
						setState(143);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(146);
				match(RightParen);
				_localctx.myDeclareAST += '(((%s)function_pointer)type,(%s)var)myDeclare'%(((MyDeclareContext)_localctx).myType.myTypeAST, (((MyDeclareContext)_localctx).ID!=null?((MyDeclareContext)_localctx).ID.getText():null))
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(149);
				match(STRUCT);
				setState(150);
				((MyDeclareContext)_localctx).ID = match(ID);
				_localctx.myDeclareAST += '((%s)myStructName' %((((MyDeclareContext)_localctx).ID!=null?((MyDeclareContext)_localctx).ID.getText():null))
				setState(152);
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

	public static class MyFuncDeclareContext extends ParserRuleContext {
		public  myFuncDeclareAST = '';
		public MyTypeContext myType() {
			return getRuleContext(MyTypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(v3_compilerParser.ID, 0); }
		public TerminalNode LeftParen() { return getToken(v3_compilerParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(v3_compilerParser.RightParen, 0); }
		public TerminalNode Semi() { return getToken(v3_compilerParser.Semi, 0); }
		public MyFuncDeclareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_myFuncDeclare; }
	}

	public final MyFuncDeclareContext myFuncDeclare() throws RecognitionException {
		MyFuncDeclareContext _localctx = new MyFuncDeclareContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_myFuncDeclare);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			myType();
			setState(158);
			match(ID);
			setState(159);
			match(LeftParen);
			setState(160);
			match(RightParen);
			setState(161);
			match(Semi);
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
		enterRule(_localctx, 8, RULE_myFuncDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			((MyFuncDefinitionContext)_localctx).myType = myType();
			setState(164);
			((MyFuncDefinitionContext)_localctx).ID = match(ID);
			setState(165);
			match(LeftParen);
			_localctx.myFuncDefinitionAST += '(%s)returnType,(%s)funcName,('%(((MyFuncDefinitionContext)_localctx).myType.myTypeAST, (((MyFuncDefinitionContext)_localctx).ID!=null?((MyFuncDefinitionContext)_localctx).ID.getText():null))
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << VOID) | (1L << STRUCT))) != 0)) {
				{
				setState(167);
				((MyFuncDefinitionContext)_localctx).myFuncInputPara = myFuncInputPara();
				_localctx.myFuncDefinitionAST += '%s'%(((MyFuncDefinitionContext)_localctx).myFuncInputPara.myFuncInputParaAST)
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(169);
					match(Comma);
					setState(170);
					((MyFuncDefinitionContext)_localctx).myFuncInputPara = myFuncInputPara();
					_localctx.myFuncDefinitionAST += ',%s'%(((MyFuncDefinitionContext)_localctx).myFuncInputPara.myFuncInputParaAST)
					}
					}
					setState(177);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			_localctx.myFuncDefinitionAST += ')myFuncInputPara,'
			setState(181);
			match(RightParen);
			setState(182);
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
		enterRule(_localctx, 10, RULE_myFuncInputPara);
		int _la;
		try {
			setState(213);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(185);
				((MyFuncInputParaContext)_localctx).myType = myType();
				_localctx.myFuncInputParaAST += '((%s'%(((MyFuncInputParaContext)_localctx).myType.myTypeAST)
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Star) {
					{
					{
					setState(187);
					match(Star);
					_localctx.myFuncInputParaAST += '*'
					}
					}
					setState(193);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(194);
				((MyFuncInputParaContext)_localctx).ID = match(ID);
				_localctx.myFuncInputParaAST +=')type,(%s)var)myDeclare'%((((MyFuncInputParaContext)_localctx).ID!=null?((MyFuncInputParaContext)_localctx).ID.getText():null))
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(197);
				myType();
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LeftParen) {
					{
					setState(198);
					match(LeftParen);
					}
				}

				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Star) {
					{
					setState(201);
					match(Star);
					}
				}

				setState(204);
				match(ID);
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RightParen) {
					{
					setState(205);
					match(RightParen);
					}
				}

				setState(208);
				match(LeftParen);
				setState(209);
				myType();
				setState(210);
				match(RightParen);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(212);
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
		enterRule(_localctx, 12, RULE_myStatement);
		int _la;
		try {
			int _alt;
			setState(244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(215);
					((MyStatementContext)_localctx).myNL = myNL();
					_localctx.myStatementAST += '%s'%(((MyStatementContext)_localctx).myNL.myNLAST)
					}
					}
					setState(222);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(223);
				match(LeftBrace);
				setState(229);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(224);
						((MyStatementContext)_localctx).myNL = myNL();
						_localctx.myStatementAST += '%s'%(((MyStatementContext)_localctx).myNL.myNLAST)
						}
						} 
					}
					setState(231);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				}
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << INT) | (1L << VOID) | (1L << RETURN) | (1L << STRUCT) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << LeftParen) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << And) | (1L << Not) | (1L << Tilde) | (1L << IntegerConstant) | (1L << ID))) != 0)) {
					{
					{
					setState(232);
					((MyStatementContext)_localctx).myFuncBodyCode = myFuncBodyCode();
					_localctx.myStatementAST += '%s'%(((MyStatementContext)_localctx).myFuncBodyCode.myFuncBodyCodeAST)
					}
					}
					setState(239);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(240);
				match(RightBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(241);
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
		enterRule(_localctx, 14, RULE_myFuncBodyCode);
		try {
			setState(267);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case VOID:
			case STRUCT:
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				((MyFuncBodyCodeContext)_localctx).myDeclare = myDeclare();
				setState(247);
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
				setState(250);
				((MyFuncBodyCodeContext)_localctx).myExpr = myExpr(0);
				setState(251);
				match(Semi);
				_localctx.myFuncBodyCodeAST += '%s'%(((MyFuncBodyCodeContext)_localctx).myExpr.myExprAST)
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 3);
				{
				setState(254);
				((MyFuncBodyCodeContext)_localctx).myReturn = myReturn();
				setState(255);
				match(Semi);
				_localctx.myFuncBodyCodeAST += '%s'%(((MyFuncBodyCodeContext)_localctx).myReturn.myReturnAST)
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 4);
				{
				setState(258);
				((MyFuncBodyCodeContext)_localctx).mySelection = mySelection();
				_localctx.myFuncBodyCodeAST += '%s'%(((MyFuncBodyCodeContext)_localctx).mySelection.mySelectionAST)
				}
				break;
			case FOR:
			case WHILE:
				enterOuterAlt(_localctx, 5);
				{
				setState(261);
				((MyFuncBodyCodeContext)_localctx).myIteration = myIteration();
				_localctx.myFuncBodyCodeAST += '%s'%(((MyFuncBodyCodeContext)_localctx).myIteration.myIterationAST)
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 6);
				{
				setState(264);
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
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_myExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(270);
				((MyExprContext)_localctx).ID = match(ID);
				setState(271);
				match(LeftParen);
				_localctx.myExprAST += '((%s)myFuncName('%((((MyExprContext)_localctx).ID!=null?((MyExprContext)_localctx).ID.getText():null))
				setState(286);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LeftParen) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << And) | (1L << Not) | (1L << Tilde) | (1L << IntegerConstant) | (1L << ID))) != 0)) {
					{
					{
					setState(273);
					((MyExprContext)_localctx).myExpr = myExpr(0);
					_localctx.myExprAST += '%s'%(((MyExprContext)_localctx).myExpr.myExprAST)
					setState(281);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Comma) {
						{
						{
						setState(275);
						match(Comma);
						setState(276);
						((MyExprContext)_localctx).myExpr = myExpr(0);
						_localctx.myExprAST += '%s'%(((MyExprContext)_localctx).myExpr.myExprAST)
						}
						}
						setState(283);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(288);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				_localctx.myExprAST += ')inputPara)myFuncCall'
				setState(290);
				match(RightParen);
				}
				break;
			case 2:
				{
				setState(291);
				((MyExprContext)_localctx).ID = match(ID);
				setState(292);
				match(LeftBracket);
				setState(293);
				((MyExprContext)_localctx).myExpr = myExpr(0);
				setState(294);
				match(RightBracket);
				_localctx.myExprAST += '((%s)arrayName,(%s)arrayIndex)myArrayVar'%((((MyExprContext)_localctx).ID!=null?((MyExprContext)_localctx).ID.getText():null), ((MyExprContext)_localctx).myExpr.myExprAST)
				}
				break;
			case 3:
				{
				setState(297);
				match(Plus);
				setState(298);
				((MyExprContext)_localctx).myExpr = myExpr(21);
				_localctx.myExprAST += '%s'%(((MyExprContext)_localctx).myExpr.myExprAST)
				}
				break;
			case 4:
				{
				setState(301);
				match(Minus);
				setState(302);
				((MyExprContext)_localctx).myExpr = myExpr(20);
				_localctx.myExprAST += '((*)op,%s,(-1)intConst)myExpr'%(((MyExprContext)_localctx).myExpr.myExprAST)
				}
				break;
			case 5:
				{
				setState(305);
				match(Not);
				setState(306);
				((MyExprContext)_localctx).myExpr = myExpr(19);
				}
				break;
			case 6:
				{
				setState(307);
				match(Tilde);
				setState(308);
				((MyExprContext)_localctx).myExpr = myExpr(18);
				}
				break;
			case 7:
				{
				setState(309);
				match(LeftParen);
				setState(310);
				((MyExprContext)_localctx).myType = myType();
				setState(314);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Star) {
					{
					{
					setState(311);
					match(Star);
					}
					}
					setState(316);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(317);
				match(RightParen);
				setState(318);
				((MyExprContext)_localctx).myExpr = myExpr(17);
				_localctx.myExprAST += '((%s)castingType,%s)myCasting'%(((MyExprContext)_localctx).myType.myTypeAST, ((MyExprContext)_localctx).myExpr.myExprAST)
				}
				break;
			case 8:
				{
				setState(321);
				match(Star);
				setState(322);
				((MyExprContext)_localctx).myExpr = myExpr(16);
				_localctx.myExprAST += '(%s)addrContent'%(((MyExprContext)_localctx).myExpr.myExprAST)
				}
				break;
			case 9:
				{
				setState(325);
				match(And);
				setState(326);
				((MyExprContext)_localctx).myExpr = myExpr(15);
				_localctx.myExprAST += '(%s)varAddr'%(((MyExprContext)_localctx).myExpr.myExprAST)
				}
				break;
			case 10:
				{
				setState(329);
				match(LeftParen);
				setState(330);
				((MyExprContext)_localctx).myExpr = myExpr(0);
				setState(331);
				match(RightParen);
				_localctx.myExprAST += '%s'%(((MyExprContext)_localctx).myExpr.myExprAST)
				}
				break;
			case 11:
				{
				setState(334);
				((MyExprContext)_localctx).ID = match(ID);
				_localctx.myExprAST += '(%s)var'%((((MyExprContext)_localctx).ID!=null?((MyExprContext)_localctx).ID.getText():null))
				}
				break;
			case 12:
				{
				setState(336);
				((MyExprContext)_localctx).IntegerConstant = match(IntegerConstant);
				_localctx.myExprAST += '(%s)intConst'%((((MyExprContext)_localctx).IntegerConstant!=null?((MyExprContext)_localctx).IntegerConstant.getText():null))
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(411);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(409);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
					case 1:
						{
						_localctx = new MyExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_myExpr);
						setState(340);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(341);
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
						setState(342);
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
						setState(345);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(346);
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
						setState(347);
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
						setState(350);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(351);
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
						setState(352);
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
						setState(355);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(356);
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
						setState(357);
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
						setState(360);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(361);
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
						setState(362);
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
						setState(365);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(366);
						((MyExprContext)_localctx).op = match(And);
						setState(367);
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
						setState(370);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(371);
						((MyExprContext)_localctx).op = match(Caret);
						setState(372);
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
						setState(375);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(376);
						((MyExprContext)_localctx).op = match(Or);
						setState(377);
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
						setState(380);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(381);
						((MyExprContext)_localctx).op = match(AndAnd);
						setState(382);
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
						setState(385);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(386);
						((MyExprContext)_localctx).op = match(OrOr);
						setState(387);
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
						setState(390);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(391);
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
						setState(392);
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
						setState(395);
						if (!(precpred(_ctx, 27))) throw new FailedPredicateException(this, "precpred(_ctx, 27)");
						setState(396);
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
						setState(398);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(399);
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
						setState(401);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(402);
						match(Dot);
						setState(403);
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
						setState(405);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(406);
						match(Arrow);
						setState(407);
						((MyExprContext)_localctx).ID = match(ID);
						_localctx.myExprAST += '(%s(%s)myStructMember)myPtrVar' %(((MyExprContext)_localctx).e1.myExprAST, (((MyExprContext)_localctx).ID!=null?((MyExprContext)_localctx).ID.getText():null))
						}
						break;
					}
					} 
				}
				setState(413);
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
		enterRule(_localctx, 18, RULE_mySelection);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			match(IF);
			setState(415);
			match(LeftParen);
			_localctx.mySelectionAST += '(('
			setState(417);
			((MySelectionContext)_localctx).myExpr = myExpr(0);
			_localctx.mySelectionAST +='%s'%(((MySelectionContext)_localctx).myExpr.myExprAST)
			setState(419);
			match(RightParen);
			_localctx.mySelectionAST +=')ifCondi'
			setState(421);
			((MySelectionContext)_localctx).myStatement = myStatement();
			_localctx.mySelectionAST += '(%s)ifBody'%(((MySelectionContext)_localctx).myStatement.myStatementAST)
			setState(428);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(423);
					((MySelectionContext)_localctx).myNL = myNL();
					_localctx.mySelectionAST += '%s'%(((MySelectionContext)_localctx).myNL.myNLAST)
					}
					} 
				}
				setState(430);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			}
			setState(435);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(431);
				match(ELSE);
				setState(432);
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
		enterRule(_localctx, 20, RULE_myIteration);
		int _la;
		try {
			setState(455);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(439);
				match(FOR);
				setState(440);
				match(LeftParen);
				_localctx.myIterationAST += '('
				setState(442);
				((MyIterationContext)_localctx).myForCondi = myForCondi();
				setState(443);
				match(RightParen);
				_localctx.myIterationAST += '%s'%(((MyIterationContext)_localctx).myForCondi.myForCondiAST)
				setState(445);
				((MyIterationContext)_localctx).myStatement = myStatement();
				_localctx.myIterationAST += '(%s)forBody)myIteration'%(((MyIterationContext)_localctx).myStatement.myStatementAST)
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(448);
				match(WHILE);
				setState(449);
				match(LeftParen);
				setState(451);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LeftParen) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << And) | (1L << Not) | (1L << Tilde) | (1L << IntegerConstant) | (1L << ID))) != 0)) {
					{
					setState(450);
					myExpr(0);
					}
				}

				setState(453);
				match(RightParen);
				setState(454);
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
		enterRule(_localctx, 22, RULE_myForCondi);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			_localctx.myForCondiAST += '('
			setState(464);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case VOID:
			case STRUCT:
				{
				setState(458);
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
				setState(461);
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
			setState(467);
			match(Semi);
			setState(471);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LeftParen) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << And) | (1L << Not) | (1L << Tilde) | (1L << IntegerConstant) | (1L << ID))) != 0)) {
				{
				setState(468);
				((MyForCondiContext)_localctx).myExpr = myExpr(0);
				_localctx.myForCondiAST += '%s'%(((MyForCondiContext)_localctx).myExpr.myExprAST)
				}
			}

			_localctx.myForCondiAST += ')forCondi('
			setState(474);
			match(Semi);
			setState(478);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LeftParen) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << And) | (1L << Not) | (1L << Tilde) | (1L << IntegerConstant) | (1L << ID))) != 0)) {
				{
				setState(475);
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
		enterRule(_localctx, 24, RULE_myReturn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(482);
			match(RETURN);
			_localctx.myReturnAST += '('
			setState(487);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LeftParen) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << And) | (1L << Not) | (1L << Tilde) | (1L << IntegerConstant) | (1L << ID))) != 0)) {
				{
				setState(484);
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
		enterRule(_localctx, 26, RULE_myType);
		try {
			setState(498);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(491);
				match(INT);
				_localctx.myTypeAST += 'int'
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(493);
				match(VOID);
				_localctx.myTypeAST += 'void'
				}
				break;
			case STRUCT:
				enterOuterAlt(_localctx, 3);
				{
				setState(495);
				match(STRUCT);
				setState(496);
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
		enterRule(_localctx, 28, RULE_myNL);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(500);
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
		case 8:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3<\u01fb\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\2\7\2"+
		"%\n\2\f\2\16\2(\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\5\39\n\3\3\4\3\4\3\4\3\4\7\4?\n\4\f\4\16\4B\13\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\5\4J\n\4\3\4\3\4\3\4\3\4\7\4P\n\4\f\4\16\4S\13\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\5\4[\n\4\7\4]\n\4\f\4\16\4`\13\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\7\4k\n\4\f\4\16\4n\13\4\3\4\3\4\3\4\3\4\3\4\7\4u\n"+
		"\4\f\4\16\4x\13\4\3\4\5\4{\n\4\3\4\3\4\3\4\3\4\5\4\u0081\n\4\3\4\5\4\u0084"+
		"\n\4\3\4\3\4\5\4\u0088\n\4\3\4\3\4\3\4\3\4\7\4\u008e\n\4\f\4\16\4\u0091"+
		"\13\4\5\4\u0093\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u009e\n\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u00b0"+
		"\n\6\f\6\16\6\u00b3\13\6\5\6\u00b5\n\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\7\7\u00c0\n\7\f\7\16\7\u00c3\13\7\3\7\3\7\3\7\3\7\3\7\5\7\u00ca\n"+
		"\7\3\7\5\7\u00cd\n\7\3\7\3\7\5\7\u00d1\n\7\3\7\3\7\3\7\3\7\3\7\5\7\u00d8"+
		"\n\7\3\b\3\b\3\b\7\b\u00dd\n\b\f\b\16\b\u00e0\13\b\3\b\3\b\3\b\3\b\7\b"+
		"\u00e6\n\b\f\b\16\b\u00e9\13\b\3\b\3\b\3\b\7\b\u00ee\n\b\f\b\16\b\u00f1"+
		"\13\b\3\b\3\b\3\b\3\b\5\b\u00f7\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u010e\n\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u011a\n\n\f\n\16\n\u011d\13\n\7"+
		"\n\u011f\n\n\f\n\16\n\u0122\13\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u013b\n\n\f"+
		"\n\16\n\u013e\13\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0155\n\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u019c\n\n\f\n\16\n\u019f"+
		"\13\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13"+
		"\u01ad\n\13\f\13\16\13\u01b0\13\13\3\13\3\13\3\13\3\13\5\13\u01b6\n\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u01c6\n"+
		"\f\3\f\3\f\5\f\u01ca\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u01d3\n\r\3\r"+
		"\3\r\3\r\3\r\3\r\5\r\u01da\n\r\3\r\3\r\3\r\3\r\3\r\5\r\u01e1\n\r\3\r\3"+
		"\r\3\16\3\16\3\16\3\16\3\16\5\16\u01ea\n\16\3\16\3\16\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\5\17\u01f5\n\17\3\20\3\20\3\20\3\20\3\20\2\3\22\21"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36\2\b\3\2\36 \3\2\32\33\3\2\26\27"+
		"\3\2\22\25\3\2\30\31\3\2*\64\2\u0238\2 \3\2\2\2\48\3\2\2\2\6\u009d\3\2"+
		"\2\2\b\u009f\3\2\2\2\n\u00a5\3\2\2\2\f\u00d7\3\2\2\2\16\u00f6\3\2\2\2"+
		"\20\u010d\3\2\2\2\22\u0154\3\2\2\2\24\u01a0\3\2\2\2\26\u01c9\3\2\2\2\30"+
		"\u01cb\3\2\2\2\32\u01e4\3\2\2\2\34\u01f4\3\2\2\2\36\u01f6\3\2\2\2 &\b"+
		"\2\1\2!\"\5\4\3\2\"#\b\2\1\2#%\3\2\2\2$!\3\2\2\2%(\3\2\2\2&$\3\2\2\2&"+
		"\'\3\2\2\2\')\3\2\2\2(&\3\2\2\2)*\b\2\1\2*\3\3\2\2\2+,\5\6\4\2,-\7)\2"+
		"\2-.\b\3\1\2.9\3\2\2\2/\60\5\b\5\2\60\61\b\3\1\2\619\3\2\2\2\62\63\5\n"+
		"\6\2\63\64\b\3\1\2\649\3\2\2\2\65\66\5\36\20\2\66\67\b\3\1\2\679\3\2\2"+
		"\28+\3\2\2\28/\3\2\2\28\62\3\2\2\28\65\3\2\2\29\5\3\2\2\2:;\5\34\17\2"+
		";@\b\4\1\2<=\7\36\2\2=?\b\4\1\2><\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2"+
		"\2AC\3\2\2\2B@\3\2\2\2CD\7:\2\2DI\b\4\1\2EF\7*\2\2FG\5\22\n\2GH\b\4\1"+
		"\2HJ\3\2\2\2IE\3\2\2\2IJ\3\2\2\2J^\3\2\2\2KL\7(\2\2LQ\b\4\1\2MN\7\36\2"+
		"\2NP\b\4\1\2OM\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2RT\3\2\2\2SQ\3\2\2"+
		"\2TU\7:\2\2UZ\b\4\1\2VW\7*\2\2WX\5\22\n\2XY\b\4\1\2Y[\3\2\2\2ZV\3\2\2"+
		"\2Z[\3\2\2\2[]\3\2\2\2\\K\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_\u009e"+
		"\3\2\2\2`^\3\2\2\2ab\5\34\17\2bc\7:\2\2cd\7\16\2\2de\7\67\2\2ef\7\17\2"+
		"\2fl\b\4\1\2gh\7\16\2\2hi\7\67\2\2ik\7\17\2\2jg\3\2\2\2kn\3\2\2\2lj\3"+
		"\2\2\2lm\3\2\2\2mz\3\2\2\2nl\3\2\2\2op\7*\2\2pq\7\20\2\2qv\7\67\2\2rs"+
		"\7(\2\2su\7\67\2\2tr\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2wy\3\2\2\2x"+
		"v\3\2\2\2y{\7\21\2\2zo\3\2\2\2z{\3\2\2\2{|\3\2\2\2|}\b\4\1\2}\u009e\3"+
		"\2\2\2~\u0080\5\34\17\2\177\u0081\7\f\2\2\u0080\177\3\2\2\2\u0080\u0081"+
		"\3\2\2\2\u0081\u0083\3\2\2\2\u0082\u0084\7\36\2\2\u0083\u0082\3\2\2\2"+
		"\u0083\u0084\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0087\7:\2\2\u0086\u0088"+
		"\7\r\2\2\u0087\u0086\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\3\2\2\2\u0089"+
		"\u0092\7\f\2\2\u008a\u008f\5\f\7\2\u008b\u008c\7(\2\2\u008c\u008e\5\f"+
		"\7\2\u008d\u008b\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u008f"+
		"\u0090\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u008a\3\2"+
		"\2\2\u0092\u0093\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0095\7\r\2\2\u0095"+
		"\u0096\b\4\1\2\u0096\u009e\3\2\2\2\u0097\u0098\7\7\2\2\u0098\u0099\7:"+
		"\2\2\u0099\u009a\b\4\1\2\u009a\u009b\5\16\b\2\u009b\u009c\b\4\1\2\u009c"+
		"\u009e\3\2\2\2\u009d:\3\2\2\2\u009da\3\2\2\2\u009d~\3\2\2\2\u009d\u0097"+
		"\3\2\2\2\u009e\7\3\2\2\2\u009f\u00a0\5\34\17\2\u00a0\u00a1\7:\2\2\u00a1"+
		"\u00a2\7\f\2\2\u00a2\u00a3\7\r\2\2\u00a3\u00a4\7)\2\2\u00a4\t\3\2\2\2"+
		"\u00a5\u00a6\5\34\17\2\u00a6\u00a7\7:\2\2\u00a7\u00a8\7\f\2\2\u00a8\u00b4"+
		"\b\6\1\2\u00a9\u00aa\5\f\7\2\u00aa\u00b1\b\6\1\2\u00ab\u00ac\7(\2\2\u00ac"+
		"\u00ad\5\f\7\2\u00ad\u00ae\b\6\1\2\u00ae\u00b0\3\2\2\2\u00af\u00ab\3\2"+
		"\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2"+
		"\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00a9\3\2\2\2\u00b4\u00b5\3\2"+
		"\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\b\6\1\2\u00b7\u00b8\7\r\2\2\u00b8"+
		"\u00b9\5\16\b\2\u00b9\u00ba\b\6\1\2\u00ba\13\3\2\2\2\u00bb\u00bc\5\34"+
		"\17\2\u00bc\u00c1\b\7\1\2\u00bd\u00be\7\36\2\2\u00be\u00c0\b\7\1\2\u00bf"+
		"\u00bd\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2"+
		"\2\2\u00c2\u00c4\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c5\7:\2\2\u00c5"+
		"\u00c6\b\7\1\2\u00c6\u00d8\3\2\2\2\u00c7\u00c9\5\34\17\2\u00c8\u00ca\7"+
		"\f\2\2\u00c9\u00c8\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cc\3\2\2\2\u00cb"+
		"\u00cd\7\36\2\2\u00cc\u00cb\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00ce\3"+
		"\2\2\2\u00ce\u00d0\7:\2\2\u00cf\u00d1\7\r\2\2\u00d0\u00cf\3\2\2\2\u00d0"+
		"\u00d1\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d3\7\f\2\2\u00d3\u00d4\5\34"+
		"\17\2\u00d4\u00d5\7\r\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d8\7\5\2\2\u00d7"+
		"\u00bb\3\2\2\2\u00d7\u00c7\3\2\2\2\u00d7\u00d6\3\2\2\2\u00d8\r\3\2\2\2"+
		"\u00d9\u00da\5\36\20\2\u00da\u00db\b\b\1\2\u00db\u00dd\3\2\2\2\u00dc\u00d9"+
		"\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df"+
		"\u00e1\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1\u00e7\7\20\2\2\u00e2\u00e3\5"+
		"\36\20\2\u00e3\u00e4\b\b\1\2\u00e4\u00e6\3\2\2\2\u00e5\u00e2\3\2\2\2\u00e6"+
		"\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00ef\3\2"+
		"\2\2\u00e9\u00e7\3\2\2\2\u00ea\u00eb\5\20\t\2\u00eb\u00ec\b\b\1\2\u00ec"+
		"\u00ee\3\2\2\2\u00ed\u00ea\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed\3\2"+
		"\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f2\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2"+
		"\u00f7\7\21\2\2\u00f3\u00f4\5\20\t\2\u00f4\u00f5\b\b\1\2\u00f5\u00f7\3"+
		"\2\2\2\u00f6\u00de\3\2\2\2\u00f6\u00f3\3\2\2\2\u00f7\17\3\2\2\2\u00f8"+
		"\u00f9\5\6\4\2\u00f9\u00fa\7)\2\2\u00fa\u00fb\b\t\1\2\u00fb\u010e\3\2"+
		"\2\2\u00fc\u00fd\5\22\n\2\u00fd\u00fe\7)\2\2\u00fe\u00ff\b\t\1\2\u00ff"+
		"\u010e\3\2\2\2\u0100\u0101\5\32\16\2\u0101\u0102\7)\2\2\u0102\u0103\b"+
		"\t\1\2\u0103\u010e\3\2\2\2\u0104\u0105\5\24\13\2\u0105\u0106\b\t\1\2\u0106"+
		"\u010e\3\2\2\2\u0107\u0108\5\26\f\2\u0108\u0109\b\t\1\2\u0109\u010e\3"+
		"\2\2\2\u010a\u010b\5\36\20\2\u010b\u010c\b\t\1\2\u010c\u010e\3\2\2\2\u010d"+
		"\u00f8\3\2\2\2\u010d\u00fc\3\2\2\2\u010d\u0100\3\2\2\2\u010d\u0104\3\2"+
		"\2\2\u010d\u0107\3\2\2\2\u010d\u010a\3\2\2\2\u010e\21\3\2\2\2\u010f\u0110"+
		"\b\n\1\2\u0110\u0111\7:\2\2\u0111\u0112\7\f\2\2\u0112\u0120\b\n\1\2\u0113"+
		"\u0114\5\22\n\2\u0114\u011b\b\n\1\2\u0115\u0116\7(\2\2\u0116\u0117\5\22"+
		"\n\2\u0117\u0118\b\n\1\2\u0118\u011a\3\2\2\2\u0119\u0115\3\2\2\2\u011a"+
		"\u011d\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011f\3\2"+
		"\2\2\u011d\u011b\3\2\2\2\u011e\u0113\3\2\2\2\u011f\u0122\3\2\2\2\u0120"+
		"\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0123\3\2\2\2\u0122\u0120\3\2"+
		"\2\2\u0123\u0124\b\n\1\2\u0124\u0155\7\r\2\2\u0125\u0126\7:\2\2\u0126"+
		"\u0127\7\16\2\2\u0127\u0128\5\22\n\2\u0128\u0129\7\17\2\2\u0129\u012a"+
		"\b\n\1\2\u012a\u0155\3\2\2\2\u012b\u012c\7\32\2\2\u012c\u012d\5\22\n\27"+
		"\u012d\u012e\b\n\1\2\u012e\u0155\3\2\2\2\u012f\u0130\7\33\2\2\u0130\u0131"+
		"\5\22\n\26\u0131\u0132\b\n\1\2\u0132\u0155\3\2\2\2\u0133\u0134\7&\2\2"+
		"\u0134\u0155\5\22\n\25\u0135\u0136\7\'\2\2\u0136\u0155\5\22\n\24\u0137"+
		"\u0138\7\f\2\2\u0138\u013c\5\34\17\2\u0139\u013b\7\36\2\2\u013a\u0139"+
		"\3\2\2\2\u013b\u013e\3\2\2\2\u013c\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d"+
		"\u013f\3\2\2\2\u013e\u013c\3\2\2\2\u013f\u0140\7\r\2\2\u0140\u0141\5\22"+
		"\n\23\u0141\u0142\b\n\1\2\u0142\u0155\3\2\2\2\u0143\u0144\7\36\2\2\u0144"+
		"\u0145\5\22\n\22\u0145\u0146\b\n\1\2\u0146\u0155\3\2\2\2\u0147\u0148\7"+
		"!\2\2\u0148\u0149\5\22\n\21\u0149\u014a\b\n\1\2\u014a\u0155\3\2\2\2\u014b"+
		"\u014c\7\f\2\2\u014c\u014d\5\22\n\2\u014d\u014e\7\r\2\2\u014e\u014f\b"+
		"\n\1\2\u014f\u0155\3\2\2\2\u0150\u0151\7:\2\2\u0151\u0155\b\n\1\2\u0152"+
		"\u0153\7\67\2\2\u0153\u0155\b\n\1\2\u0154\u010f\3\2\2\2\u0154\u0125\3"+
		"\2\2\2\u0154\u012b\3\2\2\2\u0154\u012f\3\2\2\2\u0154\u0133\3\2\2\2\u0154"+
		"\u0135\3\2\2\2\u0154\u0137\3\2\2\2\u0154\u0143\3\2\2\2\u0154\u0147\3\2"+
		"\2\2\u0154\u014b\3\2\2\2\u0154\u0150\3\2\2\2\u0154\u0152\3\2\2\2\u0155"+
		"\u019d\3\2\2\2\u0156\u0157\f\20\2\2\u0157\u0158\t\2\2\2\u0158\u0159\5"+
		"\22\n\21\u0159\u015a\b\n\1\2\u015a\u019c\3\2\2\2\u015b\u015c\f\17\2\2"+
		"\u015c\u015d\t\3\2\2\u015d\u015e\5\22\n\20\u015e\u015f\b\n\1\2\u015f\u019c"+
		"\3\2\2\2\u0160\u0161\f\16\2\2\u0161\u0162\t\4\2\2\u0162\u0163\5\22\n\17"+
		"\u0163\u0164\b\n\1\2\u0164\u019c\3\2\2\2\u0165\u0166\f\r\2\2\u0166\u0167"+
		"\t\5\2\2\u0167\u0168\5\22\n\16\u0168\u0169\b\n\1\2\u0169\u019c\3\2\2\2"+
		"\u016a\u016b\f\f\2\2\u016b\u016c\t\6\2\2\u016c\u016d\5\22\n\r\u016d\u016e"+
		"\b\n\1\2\u016e\u019c\3\2\2\2\u016f\u0170\f\13\2\2\u0170\u0171\7!\2\2\u0171"+
		"\u0172\5\22\n\f\u0172\u0173\b\n\1\2\u0173\u019c\3\2\2\2\u0174\u0175\f"+
		"\n\2\2\u0175\u0176\7%\2\2\u0176\u0177\5\22\n\13\u0177\u0178\b\n\1\2\u0178"+
		"\u019c\3\2\2\2\u0179\u017a\f\t\2\2\u017a\u017b\7\"\2\2\u017b\u017c\5\22"+
		"\n\n\u017c\u017d\b\n\1\2\u017d\u019c\3\2\2\2\u017e\u017f\f\b\2\2\u017f"+
		"\u0180\7#\2\2\u0180\u0181\5\22\n\t\u0181\u0182\b\n\1\2\u0182\u019c\3\2"+
		"\2\2\u0183\u0184\f\7\2\2\u0184\u0185\7$\2\2\u0185\u0186\5\22\n\b\u0186"+
		"\u0187\b\n\1\2\u0187\u019c\3\2\2\2\u0188\u0189\f\6\2\2\u0189\u018a\t\7"+
		"\2\2\u018a\u018b\5\22\n\7\u018b\u018c\b\n\1\2\u018c\u019c\3\2\2\2\u018d"+
		"\u018e\f\35\2\2\u018e\u018f\7\34\2\2\u018f\u019c\b\n\1\2\u0190\u0191\f"+
		"\34\2\2\u0191\u0192\7\35\2\2\u0192\u019c\b\n\1\2\u0193\u0194\f\31\2\2"+
		"\u0194\u0195\7\65\2\2\u0195\u0196\7:\2\2\u0196\u019c\b\n\1\2\u0197\u0198"+
		"\f\30\2\2\u0198\u0199\7\66\2\2\u0199\u019a\7:\2\2\u019a\u019c\b\n\1\2"+
		"\u019b\u0156\3\2\2\2\u019b\u015b\3\2\2\2\u019b\u0160\3\2\2\2\u019b\u0165"+
		"\3\2\2\2\u019b\u016a\3\2\2\2\u019b\u016f\3\2\2\2\u019b\u0174\3\2\2\2\u019b"+
		"\u0179\3\2\2\2\u019b\u017e\3\2\2\2\u019b\u0183\3\2\2\2\u019b\u0188\3\2"+
		"\2\2\u019b\u018d\3\2\2\2\u019b\u0190\3\2\2\2\u019b\u0193\3\2\2\2\u019b"+
		"\u0197\3\2\2\2\u019c\u019f\3\2\2\2\u019d\u019b\3\2\2\2\u019d\u019e\3\2"+
		"\2\2\u019e\23\3\2\2\2\u019f\u019d\3\2\2\2\u01a0\u01a1\7\b\2\2\u01a1\u01a2"+
		"\7\f\2\2\u01a2\u01a3\b\13\1\2\u01a3\u01a4\5\22\n\2\u01a4\u01a5\b\13\1"+
		"\2\u01a5\u01a6\7\r\2\2\u01a6\u01a7\b\13\1\2\u01a7\u01a8\5\16\b\2\u01a8"+
		"\u01ae\b\13\1\2\u01a9\u01aa\5\36\20\2\u01aa\u01ab\b\13\1\2\u01ab\u01ad"+
		"\3\2\2\2\u01ac\u01a9\3\2\2\2\u01ad\u01b0\3\2\2\2\u01ae\u01ac\3\2\2\2\u01ae"+
		"\u01af\3\2\2\2\u01af\u01b5\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b1\u01b2\7\t"+
		"\2\2\u01b2\u01b3\5\16\b\2\u01b3\u01b4\b\13\1\2\u01b4\u01b6\3\2\2\2\u01b5"+
		"\u01b1\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7\u01b8\b\13"+
		"\1\2\u01b8\25\3\2\2\2\u01b9\u01ba\7\n\2\2\u01ba\u01bb\7\f\2\2\u01bb\u01bc"+
		"\b\f\1\2\u01bc\u01bd\5\30\r\2\u01bd\u01be\7\r\2\2\u01be\u01bf\b\f\1\2"+
		"\u01bf\u01c0\5\16\b\2\u01c0\u01c1\b\f\1\2\u01c1\u01ca\3\2\2\2\u01c2\u01c3"+
		"\7\13\2\2\u01c3\u01c5\7\f\2\2\u01c4\u01c6\5\22\n\2\u01c5\u01c4\3\2\2\2"+
		"\u01c5\u01c6\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c8\7\r\2\2\u01c8\u01ca"+
		"\5\16\b\2\u01c9\u01b9\3\2\2\2\u01c9\u01c2\3\2\2\2\u01ca\27\3\2\2\2\u01cb"+
		"\u01d2\b\r\1\2\u01cc\u01cd\5\6\4\2\u01cd\u01ce\b\r\1\2\u01ce\u01d3\3\2"+
		"\2\2\u01cf\u01d0\5\22\n\2\u01d0\u01d1\b\r\1\2\u01d1\u01d3\3\2\2\2\u01d2"+
		"\u01cc\3\2\2\2\u01d2\u01cf\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3\u01d4\3\2"+
		"\2\2\u01d4\u01d5\b\r\1\2\u01d5\u01d9\7)\2\2\u01d6\u01d7\5\22\n\2\u01d7"+
		"\u01d8\b\r\1\2\u01d8\u01da\3\2\2\2\u01d9\u01d6\3\2\2\2\u01d9\u01da\3\2"+
		"\2\2\u01da\u01db\3\2\2\2\u01db\u01dc\b\r\1\2\u01dc\u01e0\7)\2\2\u01dd"+
		"\u01de\5\22\n\2\u01de\u01df\b\r\1\2\u01df\u01e1\3\2\2\2\u01e0\u01dd\3"+
		"\2\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e3\b\r\1\2\u01e3"+
		"\31\3\2\2\2\u01e4\u01e5\7\6\2\2\u01e5\u01e9\b\16\1\2\u01e6\u01e7\5\22"+
		"\n\2\u01e7\u01e8\b\16\1\2\u01e8\u01ea\3\2\2\2\u01e9\u01e6\3\2\2\2\u01e9"+
		"\u01ea\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01ec\b\16\1\2\u01ec\33\3\2\2"+
		"\2\u01ed\u01ee\7\4\2\2\u01ee\u01f5\b\17\1\2\u01ef\u01f0\7\5\2\2\u01f0"+
		"\u01f5\b\17\1\2\u01f1\u01f2\7\7\2\2\u01f2\u01f3\7:\2\2\u01f3\u01f5\b\17"+
		"\1\2\u01f4\u01ed\3\2\2\2\u01f4\u01ef\3\2\2\2\u01f4\u01f1\3\2\2\2\u01f5"+
		"\35\3\2\2\2\u01f6\u01f7\7\3\2\2\u01f7\u01f8\b\20\1\2\u01f8\u01f9\b\20"+
		"\1\2\u01f9\37\3\2\2\2-&8@IQZ^lvz\u0080\u0083\u0087\u008f\u0092\u009d\u00b1"+
		"\u00b4\u00c1\u00c9\u00cc\u00d0\u00d7\u00de\u00e7\u00ef\u00f6\u010d\u011b"+
		"\u0120\u013c\u0154\u019b\u019d\u01ae\u01b5\u01c5\u01c9\u01d2\u01d9\u01e0"+
		"\u01e9\u01f4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}