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
			setState(155);
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
					_localctx.myDeclareAST += '((=)op,(%s)var,%s)myEpxer'%((((MyDeclareContext)_localctx).id1!=null?((MyDeclareContext)_localctx).id1.getText():null), ((MyDeclareContext)_localctx).myExpr.myExprAST)
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
						_localctx.myDeclareAST += '((=)op,(%s)var,%s)myEpxer'%((((MyDeclareContext)_localctx).id2!=null?((MyDeclareContext)_localctx).id2.getText():null), ((MyDeclareContext)_localctx).myExpr.myExprAST)
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
				_localctx.myDeclareAST += '((%s)type,((%s)arrayName,(%s'%(((MyDeclareContext)_localctx).myType.myTypeAST, (((MyDeclareContext)_localctx).ID!=null?((MyDeclareContext)_localctx).ID.getText():null), (((MyDeclareContext)_localctx).IntegerConstant!=null?((MyDeclareContext)_localctx).IntegerConstant.getText():null))
				setState(102);
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
					_localctx.myDeclareAST += ',%s'%((((MyDeclareContext)_localctx).IntegerConstant!=null?((MyDeclareContext)_localctx).IntegerConstant.getText():null))
					}
					}
					setState(104);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				_localctx.myDeclareAST += ')arraySize)arrayVar'
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Assign) {
					{
					setState(106);
					match(Assign);
					setState(107);
					match(LeftBrace);
					_localctx.myDeclareAST += '('
					setState(109);
					((MyDeclareContext)_localctx).int1 = match(IntegerConstant);
					_localctx.myDeclareAST += '%s'%((((MyDeclareContext)_localctx).int1!=null?((MyDeclareContext)_localctx).int1.getText():null))
					setState(116);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Comma) {
						{
						{
						setState(111);
						match(Comma);
						setState(112);
						((MyDeclareContext)_localctx).int2 = match(IntegerConstant);
						_localctx.myDeclareAST += ',%s'%((((MyDeclareContext)_localctx).int2!=null?((MyDeclareContext)_localctx).int2.getText():null))
						}
						}
						setState(118);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(119);
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
				setState(125);
				myType();
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LeftParen) {
					{
					setState(126);
					match(LeftParen);
					}
				}

				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Star) {
					{
					setState(129);
					match(Star);
					}
				}

				setState(132);
				match(ID);
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RightParen) {
					{
					setState(133);
					match(RightParen);
					}
				}

				setState(136);
				match(LeftParen);
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << VOID) | (1L << STRUCT))) != 0)) {
					{
					setState(137);
					myFuncInputPara();
					setState(142);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Comma) {
						{
						{
						setState(138);
						match(Comma);
						setState(139);
						myFuncInputPara();
						}
						}
						setState(144);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(147);
				match(RightParen);
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
			setState(157);
			((MyFuncDefinitionContext)_localctx).myType = myType();
			setState(158);
			((MyFuncDefinitionContext)_localctx).ID = match(ID);
			setState(159);
			match(LeftParen);
			_localctx.myFuncDefinitionAST += '(%s)returnType,(%s)funcName,('%(((MyFuncDefinitionContext)_localctx).myType.myTypeAST, (((MyFuncDefinitionContext)_localctx).ID!=null?((MyFuncDefinitionContext)_localctx).ID.getText():null))
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << VOID) | (1L << STRUCT))) != 0)) {
				{
				setState(161);
				((MyFuncDefinitionContext)_localctx).myFuncInputPara = myFuncInputPara();
				_localctx.myFuncDefinitionAST += '%s'%(((MyFuncDefinitionContext)_localctx).myFuncInputPara.myFuncInputParaAST)
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(163);
					match(Comma);
					setState(164);
					((MyFuncDefinitionContext)_localctx).myFuncInputPara = myFuncInputPara();
					_localctx.myFuncDefinitionAST += ',%s'%(((MyFuncDefinitionContext)_localctx).myFuncInputPara.myFuncInputParaAST)
					}
					}
					setState(171);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			_localctx.myFuncDefinitionAST += ')myFuncInputPara,'
			setState(175);
			match(RightParen);
			setState(176);
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
			setState(207);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(179);
				((MyFuncInputParaContext)_localctx).myType = myType();
				_localctx.myFuncInputParaAST += '((%s'%(((MyFuncInputParaContext)_localctx).myType.myTypeAST)
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Star) {
					{
					{
					setState(181);
					match(Star);
					_localctx.myFuncInputParaAST += '*'
					}
					}
					setState(187);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(188);
				((MyFuncInputParaContext)_localctx).ID = match(ID);
				_localctx.myFuncInputParaAST +=')type,(%s)var)myDeclare'%((((MyFuncInputParaContext)_localctx).ID!=null?((MyFuncInputParaContext)_localctx).ID.getText():null))
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(191);
				myType();
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LeftParen) {
					{
					setState(192);
					match(LeftParen);
					}
				}

				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Star) {
					{
					setState(195);
					match(Star);
					}
				}

				setState(198);
				match(ID);
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RightParen) {
					{
					setState(199);
					match(RightParen);
					}
				}

				setState(202);
				match(LeftParen);
				setState(203);
				myType();
				setState(204);
				match(RightParen);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(206);
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
			setState(246);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(209);
					((MyStatementContext)_localctx).myNL = myNL();
					_localctx.myStatementAST += '%s'%(((MyStatementContext)_localctx).myNL.myNLAST)
					}
					}
					setState(216);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(217);
				match(LeftBrace);
				setState(223);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(218);
						((MyStatementContext)_localctx).myNL = myNL();
						_localctx.myStatementAST += '%s'%(((MyStatementContext)_localctx).myNL.myNLAST)
						}
						} 
					}
					setState(225);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				}
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << INT) | (1L << VOID) | (1L << RETURN) | (1L << STRUCT) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << LeftParen) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << And) | (1L << Not) | (1L << Tilde) | (1L << IntegerConstant) | (1L << ID))) != 0)) {
					{
					{
					setState(226);
					((MyStatementContext)_localctx).myFuncBodyCode = myFuncBodyCode();
					_localctx.myStatementAST += '%s'%(((MyStatementContext)_localctx).myFuncBodyCode.myFuncBodyCodeAST)
					}
					}
					setState(233);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(234);
				match(RightBrace);
				setState(240);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(235);
						((MyStatementContext)_localctx).myNL = myNL();
						_localctx.myStatementAST += '%s'%(((MyStatementContext)_localctx).myNL.myNLAST)
						}
						} 
					}
					setState(242);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(243);
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
			setState(269);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case VOID:
			case STRUCT:
				enterOuterAlt(_localctx, 1);
				{
				setState(248);
				((MyFuncBodyCodeContext)_localctx).myDeclare = myDeclare();
				setState(249);
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
				setState(252);
				((MyFuncBodyCodeContext)_localctx).myExpr = myExpr(0);
				setState(253);
				match(Semi);
				_localctx.myFuncBodyCodeAST += '%s'%(((MyFuncBodyCodeContext)_localctx).myExpr.myExprAST)
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 3);
				{
				setState(256);
				((MyFuncBodyCodeContext)_localctx).myReturn = myReturn();
				setState(257);
				match(Semi);
				_localctx.myFuncBodyCodeAST += '%s'%(((MyFuncBodyCodeContext)_localctx).myReturn.myReturnAST)
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 4);
				{
				setState(260);
				((MyFuncBodyCodeContext)_localctx).mySelection = mySelection();
				_localctx.myFuncBodyCodeAST += '%s'%(((MyFuncBodyCodeContext)_localctx).mySelection.mySelectionAST)
				}
				break;
			case FOR:
			case WHILE:
				enterOuterAlt(_localctx, 5);
				{
				setState(263);
				((MyFuncBodyCodeContext)_localctx).myIteration = myIteration();
				_localctx.myFuncBodyCodeAST += '%s'%(((MyFuncBodyCodeContext)_localctx).myIteration.myIterationAST)
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 6);
				{
				setState(266);
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
			setState(340);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(272);
				((MyExprContext)_localctx).ID = match(ID);
				setState(273);
				match(LeftParen);
				_localctx.myExprAST += '((%s)myFuncName('%((((MyExprContext)_localctx).ID!=null?((MyExprContext)_localctx).ID.getText():null))
				setState(288);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LeftParen) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << And) | (1L << Not) | (1L << Tilde) | (1L << IntegerConstant) | (1L << ID))) != 0)) {
					{
					{
					setState(275);
					((MyExprContext)_localctx).myExpr = myExpr(0);
					_localctx.myExprAST += '%s'%(((MyExprContext)_localctx).myExpr.myExprAST)
					setState(283);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Comma) {
						{
						{
						setState(277);
						match(Comma);
						setState(278);
						((MyExprContext)_localctx).myExpr = myExpr(0);
						_localctx.myExprAST += '%s'%(((MyExprContext)_localctx).myExpr.myExprAST)
						}
						}
						setState(285);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(290);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				_localctx.myExprAST += ')inputPara)myFuncCall'
				setState(292);
				match(RightParen);
				}
				break;
			case 2:
				{
				setState(293);
				((MyExprContext)_localctx).ID = match(ID);
				setState(294);
				match(LeftBracket);
				setState(295);
				((MyExprContext)_localctx).myExpr = myExpr(0);
				setState(296);
				match(RightBracket);
				_localctx.myExprAST += '((%s)arrayName,(%s)arrayIndex)myArrayVar'%((((MyExprContext)_localctx).ID!=null?((MyExprContext)_localctx).ID.getText():null), ((MyExprContext)_localctx).myExpr.myExprAST)
				}
				break;
			case 3:
				{
				setState(299);
				match(Plus);
				setState(300);
				((MyExprContext)_localctx).myExpr = myExpr(21);
				_localctx.myExprAST += '%s'%(((MyExprContext)_localctx).myExpr.myExprAST)
				}
				break;
			case 4:
				{
				setState(303);
				match(Minus);
				setState(304);
				((MyExprContext)_localctx).myExpr = myExpr(20);
				_localctx.myExprAST += '((*)op,%s,-1)myExpr'%(((MyExprContext)_localctx).myExpr.myExprAST)
				}
				break;
			case 5:
				{
				setState(307);
				match(Not);
				setState(308);
				((MyExprContext)_localctx).myExpr = myExpr(19);
				}
				break;
			case 6:
				{
				setState(309);
				match(Tilde);
				setState(310);
				((MyExprContext)_localctx).myExpr = myExpr(18);
				}
				break;
			case 7:
				{
				setState(311);
				match(LeftParen);
				setState(312);
				((MyExprContext)_localctx).myType = myType();
				setState(316);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Star) {
					{
					{
					setState(313);
					match(Star);
					}
					}
					setState(318);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(319);
				match(RightParen);
				setState(320);
				((MyExprContext)_localctx).myExpr = myExpr(17);
				_localctx.myExprAST += '((%s)castingType,%s)myCasting'%(((MyExprContext)_localctx).myType.myTypeAST, ((MyExprContext)_localctx).myExpr.myExprAST)
				}
				break;
			case 8:
				{
				setState(323);
				match(Star);
				setState(324);
				((MyExprContext)_localctx).myExpr = myExpr(16);
				_localctx.myExprAST += '(%s)addrContent'%(((MyExprContext)_localctx).myExpr.myExprAST)
				}
				break;
			case 9:
				{
				setState(327);
				match(And);
				setState(328);
				((MyExprContext)_localctx).myExpr = myExpr(15);
				_localctx.myExprAST += '(%s)varAddr'%(((MyExprContext)_localctx).myExpr.myExprAST)
				}
				break;
			case 10:
				{
				setState(331);
				match(LeftParen);
				setState(332);
				((MyExprContext)_localctx).myExpr = myExpr(0);
				setState(333);
				match(RightParen);
				_localctx.myExprAST += '%s'%(myExpr.myExprAST)
				}
				break;
			case 11:
				{
				setState(336);
				((MyExprContext)_localctx).ID = match(ID);
				_localctx.myExprAST += '(%s)ID'%((((MyExprContext)_localctx).ID!=null?((MyExprContext)_localctx).ID.getText():null))
				}
				break;
			case 12:
				{
				setState(338);
				((MyExprContext)_localctx).IntegerConstant = match(IntegerConstant);
				_localctx.myExprAST += '(%s)intConst'%((((MyExprContext)_localctx).IntegerConstant!=null?((MyExprContext)_localctx).IntegerConstant.getText():null))
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(413);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(411);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
					case 1:
						{
						_localctx = new MyExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_myExpr);
						setState(342);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(343);
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
						setState(344);
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
						setState(347);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(348);
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
						setState(349);
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
						setState(352);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(353);
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
						setState(354);
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
						setState(357);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(358);
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
						setState(359);
						((MyExprContext)_localctx).e2 = ((MyExprContext)_localctx).myExpr = myExpr(12);
						_localctx.myExprAST += '((%s)op,%s,%s)myExpr'%((((MyExprContext)_localctx).op!=null?((MyExprContext)_localctx).op.getText():null), ((MyExprContext)_localctx).e1.myExprAST, ((MyExprContext)_localctx).e2.myExprAST)
						}
						break;
					case 5:
						{
						_localctx = new MyExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_myExpr);
						setState(362);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(363);
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
						setState(364);
						((MyExprContext)_localctx).e2 = ((MyExprContext)_localctx).myExpr = myExpr(11);
						_localctx.myExprAST += '((%s)op,%s,%s)myExpr'%((((MyExprContext)_localctx).op!=null?((MyExprContext)_localctx).op.getText():null), ((MyExprContext)_localctx).e1.myExprAST, ((MyExprContext)_localctx).e2.myExprAST)
						}
						break;
					case 6:
						{
						_localctx = new MyExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_myExpr);
						setState(367);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(368);
						((MyExprContext)_localctx).op = match(And);
						setState(369);
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
						setState(372);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(373);
						((MyExprContext)_localctx).op = match(Caret);
						setState(374);
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
						setState(377);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(378);
						((MyExprContext)_localctx).op = match(Or);
						setState(379);
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
						setState(382);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(383);
						((MyExprContext)_localctx).op = match(AndAnd);
						setState(384);
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
						setState(387);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(388);
						((MyExprContext)_localctx).op = match(OrOr);
						setState(389);
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
						setState(392);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(393);
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
						setState(394);
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
						setState(397);
						if (!(precpred(_ctx, 27))) throw new FailedPredicateException(this, "precpred(_ctx, 27)");
						setState(398);
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
						setState(400);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(401);
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
						setState(403);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(404);
						match(Dot);
						setState(405);
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
						setState(407);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(408);
						match(Arrow);
						setState(409);
						((MyExprContext)_localctx).ID = match(ID);
						_localctx.myExprAST += '(%s(%s)myStructMember)myPtrVar' %(((MyExprContext)_localctx).e1.myExprAST, (((MyExprContext)_localctx).ID!=null?((MyExprContext)_localctx).ID.getText():null))
						}
						break;
					}
					} 
				}
				setState(415);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
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
			setState(416);
			match(IF);
			setState(417);
			match(LeftParen);
			_localctx.mySelectionAST += '(('
			setState(419);
			((MySelectionContext)_localctx).myExpr = myExpr(0);
			_localctx.mySelectionAST +='%s'%(((MySelectionContext)_localctx).myExpr.myExprAST)
			setState(421);
			match(RightParen);
			_localctx.mySelectionAST +=')ifCondi'
			setState(423);
			((MySelectionContext)_localctx).myStatement = myStatement();
			_localctx.mySelectionAST += '(%s)ifBody'%(((MySelectionContext)_localctx).myStatement.myStatementAST)
			setState(429);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(425);
				match(ELSE);
				setState(426);
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
			setState(449);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(433);
				match(FOR);
				setState(434);
				match(LeftParen);
				_localctx.myIterationAST += '('
				setState(436);
				((MyIterationContext)_localctx).myForCondi = myForCondi();
				setState(437);
				match(RightParen);
				_localctx.myIterationAST += '%s'%(((MyIterationContext)_localctx).myForCondi.myForCondiAST)
				setState(439);
				((MyIterationContext)_localctx).myStatement = myStatement();
				_localctx.myIterationAST += '(%s)myForBody)myFor'%(((MyIterationContext)_localctx).myStatement.myStatementAST)
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(442);
				match(WHILE);
				setState(443);
				match(LeftParen);
				setState(445);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LeftParen) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << And) | (1L << Not) | (1L << Tilde) | (1L << IntegerConstant) | (1L << ID))) != 0)) {
					{
					setState(444);
					myExpr(0);
					}
				}

				setState(447);
				match(RightParen);
				setState(448);
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
			setState(458);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case VOID:
			case STRUCT:
				{
				setState(452);
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
				setState(455);
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
			setState(461);
			match(Semi);
			setState(465);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LeftParen) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << And) | (1L << Not) | (1L << Tilde) | (1L << IntegerConstant) | (1L << ID))) != 0)) {
				{
				setState(462);
				((MyForCondiContext)_localctx).myExpr = myExpr(0);
				_localctx.myForCondiAST += '%s'%(((MyForCondiContext)_localctx).myExpr.myExprAST)
				}
			}

			_localctx.myForCondiAST += ')forCondi('
			setState(468);
			match(Semi);
			setState(472);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LeftParen) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << And) | (1L << Not) | (1L << Tilde) | (1L << IntegerConstant) | (1L << ID))) != 0)) {
				{
				setState(469);
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
			setState(476);
			match(RETURN);
			_localctx.myReturnAST += '('
			setState(481);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LeftParen) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << And) | (1L << Not) | (1L << Tilde) | (1L << IntegerConstant) | (1L << ID))) != 0)) {
				{
				setState(478);
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
			setState(492);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(485);
				match(INT);
				_localctx.myTypeAST += 'int'
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(487);
				match(VOID);
				_localctx.myTypeAST += 'void'
				}
				break;
			case STRUCT:
				enterOuterAlt(_localctx, 3);
				{
				setState(489);
				match(STRUCT);
				setState(490);
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
			setState(494);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3<\u01f5\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\2\7\2#\n\2\f\2\16"+
		"\2&\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\64\n\3\3"+
		"\4\3\4\3\4\3\4\7\4:\n\4\f\4\16\4=\13\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4E\n"+
		"\4\3\4\3\4\3\4\3\4\7\4K\n\4\f\4\16\4N\13\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4"+
		"V\n\4\7\4X\n\4\f\4\16\4[\13\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\7\4g\n\4\f\4\16\4j\13\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4u\n\4"+
		"\f\4\16\4x\13\4\3\4\3\4\5\4|\n\4\3\4\3\4\3\4\3\4\5\4\u0082\n\4\3\4\5\4"+
		"\u0085\n\4\3\4\3\4\5\4\u0089\n\4\3\4\3\4\3\4\3\4\7\4\u008f\n\4\f\4\16"+
		"\4\u0092\13\4\5\4\u0094\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u009e"+
		"\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u00aa\n\5\f\5\16\5\u00ad"+
		"\13\5\5\5\u00af\n\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\7\6\u00ba\n\6"+
		"\f\6\16\6\u00bd\13\6\3\6\3\6\3\6\3\6\3\6\5\6\u00c4\n\6\3\6\5\6\u00c7\n"+
		"\6\3\6\3\6\5\6\u00cb\n\6\3\6\3\6\3\6\3\6\3\6\5\6\u00d2\n\6\3\7\3\7\3\7"+
		"\7\7\u00d7\n\7\f\7\16\7\u00da\13\7\3\7\3\7\3\7\3\7\7\7\u00e0\n\7\f\7\16"+
		"\7\u00e3\13\7\3\7\3\7\3\7\7\7\u00e8\n\7\f\7\16\7\u00eb\13\7\3\7\3\7\3"+
		"\7\3\7\7\7\u00f1\n\7\f\7\16\7\u00f4\13\7\3\7\3\7\3\7\5\7\u00f9\n\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\5\b\u0110\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u011c"+
		"\n\t\f\t\16\t\u011f\13\t\7\t\u0121\n\t\f\t\16\t\u0124\13\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\7\t\u013d\n\t\f\t\16\t\u0140\13\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0157\n"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7"+
		"\t\u019e\n\t\f\t\16\t\u01a1\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\5\n\u01b0\n\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\5\13\u01c0\n\13\3\13\3\13\5\13\u01c4\n\13\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u01cd\n\f\3\f\3\f\3\f\3\f\3\f\5\f\u01d4"+
		"\n\f\3\f\3\f\3\f\3\f\3\f\5\f\u01db\n\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\5\r"+
		"\u01e4\n\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u01ef\n\16"+
		"\3\17\3\17\3\17\3\17\3\17\2\3\20\20\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\2\b\3\2\36 \3\2\32\33\3\2\26\27\3\2\22\25\3\2\30\31\3\2*\64\2\u0232\2"+
		"\36\3\2\2\2\4\63\3\2\2\2\6\u009d\3\2\2\2\b\u009f\3\2\2\2\n\u00d1\3\2\2"+
		"\2\f\u00f8\3\2\2\2\16\u010f\3\2\2\2\20\u0156\3\2\2\2\22\u01a2\3\2\2\2"+
		"\24\u01c3\3\2\2\2\26\u01c5\3\2\2\2\30\u01de\3\2\2\2\32\u01ee\3\2\2\2\34"+
		"\u01f0\3\2\2\2\36$\b\2\1\2\37 \5\4\3\2 !\b\2\1\2!#\3\2\2\2\"\37\3\2\2"+
		"\2#&\3\2\2\2$\"\3\2\2\2$%\3\2\2\2%\'\3\2\2\2&$\3\2\2\2\'(\b\2\1\2(\3\3"+
		"\2\2\2)*\5\6\4\2*+\7)\2\2+,\b\3\1\2,\64\3\2\2\2-.\5\b\5\2./\b\3\1\2/\64"+
		"\3\2\2\2\60\61\5\34\17\2\61\62\b\3\1\2\62\64\3\2\2\2\63)\3\2\2\2\63-\3"+
		"\2\2\2\63\60\3\2\2\2\64\5\3\2\2\2\65\66\5\32\16\2\66;\b\4\1\2\678\7\36"+
		"\2\28:\b\4\1\29\67\3\2\2\2:=\3\2\2\2;9\3\2\2\2;<\3\2\2\2<>\3\2\2\2=;\3"+
		"\2\2\2>?\7:\2\2?D\b\4\1\2@A\7*\2\2AB\5\20\t\2BC\b\4\1\2CE\3\2\2\2D@\3"+
		"\2\2\2DE\3\2\2\2EY\3\2\2\2FG\7(\2\2GL\b\4\1\2HI\7\36\2\2IK\b\4\1\2JH\3"+
		"\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MO\3\2\2\2NL\3\2\2\2OP\7:\2\2PU\b"+
		"\4\1\2QR\7*\2\2RS\5\20\t\2ST\b\4\1\2TV\3\2\2\2UQ\3\2\2\2UV\3\2\2\2VX\3"+
		"\2\2\2WF\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\u009e\3\2\2\2[Y\3\2\2"+
		"\2\\]\5\32\16\2]^\7:\2\2^_\7\16\2\2_`\7\67\2\2`a\7\17\2\2ah\b\4\1\2bc"+
		"\7\16\2\2cd\7\67\2\2de\7\17\2\2eg\b\4\1\2fb\3\2\2\2gj\3\2\2\2hf\3\2\2"+
		"\2hi\3\2\2\2ik\3\2\2\2jh\3\2\2\2k{\b\4\1\2lm\7*\2\2mn\7\20\2\2no\b\4\1"+
		"\2op\7\67\2\2pv\b\4\1\2qr\7(\2\2rs\7\67\2\2su\b\4\1\2tq\3\2\2\2ux\3\2"+
		"\2\2vt\3\2\2\2vw\3\2\2\2wy\3\2\2\2xv\3\2\2\2yz\7\21\2\2z|\b\4\1\2{l\3"+
		"\2\2\2{|\3\2\2\2|}\3\2\2\2}~\b\4\1\2~\u009e\3\2\2\2\177\u0081\5\32\16"+
		"\2\u0080\u0082\7\f\2\2\u0081\u0080\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0084"+
		"\3\2\2\2\u0083\u0085\7\36\2\2\u0084\u0083\3\2\2\2\u0084\u0085\3\2\2\2"+
		"\u0085\u0086\3\2\2\2\u0086\u0088\7:\2\2\u0087\u0089\7\r\2\2\u0088\u0087"+
		"\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u0093\7\f\2\2\u008b"+
		"\u0090\5\n\6\2\u008c\u008d\7(\2\2\u008d\u008f\5\n\6\2\u008e\u008c\3\2"+
		"\2\2\u008f\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091"+
		"\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0093\u008b\3\2\2\2\u0093\u0094\3\2"+
		"\2\2\u0094\u0095\3\2\2\2\u0095\u0096\7\r\2\2\u0096\u009e\3\2\2\2\u0097"+
		"\u0098\7\7\2\2\u0098\u0099\7:\2\2\u0099\u009a\b\4\1\2\u009a\u009b\5\f"+
		"\7\2\u009b\u009c\b\4\1\2\u009c\u009e\3\2\2\2\u009d\65\3\2\2\2\u009d\\"+
		"\3\2\2\2\u009d\177\3\2\2\2\u009d\u0097\3\2\2\2\u009e\7\3\2\2\2\u009f\u00a0"+
		"\5\32\16\2\u00a0\u00a1\7:\2\2\u00a1\u00a2\7\f\2\2\u00a2\u00ae\b\5\1\2"+
		"\u00a3\u00a4\5\n\6\2\u00a4\u00ab\b\5\1\2\u00a5\u00a6\7(\2\2\u00a6\u00a7"+
		"\5\n\6\2\u00a7\u00a8\b\5\1\2\u00a8\u00aa\3\2\2\2\u00a9\u00a5\3\2\2\2\u00aa"+
		"\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00af\3\2"+
		"\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00a3\3\2\2\2\u00ae\u00af\3\2\2\2\u00af"+
		"\u00b0\3\2\2\2\u00b0\u00b1\b\5\1\2\u00b1\u00b2\7\r\2\2\u00b2\u00b3\5\f"+
		"\7\2\u00b3\u00b4\b\5\1\2\u00b4\t\3\2\2\2\u00b5\u00b6\5\32\16\2\u00b6\u00bb"+
		"\b\6\1\2\u00b7\u00b8\7\36\2\2\u00b8\u00ba\b\6\1\2\u00b9\u00b7\3\2\2\2"+
		"\u00ba\u00bd\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00be"+
		"\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\u00bf\7:\2\2\u00bf\u00c0\b\6\1\2\u00c0"+
		"\u00d2\3\2\2\2\u00c1\u00c3\5\32\16\2\u00c2\u00c4\7\f\2\2\u00c3\u00c2\3"+
		"\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c6\3\2\2\2\u00c5\u00c7\7\36\2\2\u00c6"+
		"\u00c5\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00ca\7:"+
		"\2\2\u00c9\u00cb\7\r\2\2\u00ca\u00c9\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb"+
		"\u00cc\3\2\2\2\u00cc\u00cd\7\f\2\2\u00cd\u00ce\5\32\16\2\u00ce\u00cf\7"+
		"\r\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00d2\7\5\2\2\u00d1\u00b5\3\2\2\2\u00d1"+
		"\u00c1\3\2\2\2\u00d1\u00d0\3\2\2\2\u00d2\13\3\2\2\2\u00d3\u00d4\5\34\17"+
		"\2\u00d4\u00d5\b\7\1\2\u00d5\u00d7\3\2\2\2\u00d6\u00d3\3\2\2\2\u00d7\u00da"+
		"\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00db\3\2\2\2\u00da"+
		"\u00d8\3\2\2\2\u00db\u00e1\7\20\2\2\u00dc\u00dd\5\34\17\2\u00dd\u00de"+
		"\b\7\1\2\u00de\u00e0\3\2\2\2\u00df\u00dc\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1"+
		"\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e9\3\2\2\2\u00e3\u00e1\3\2"+
		"\2\2\u00e4\u00e5\5\16\b\2\u00e5\u00e6\b\7\1\2\u00e6\u00e8\3\2\2\2\u00e7"+
		"\u00e4\3\2\2\2\u00e8\u00eb\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2"+
		"\2\2\u00ea\u00ec\3\2\2\2\u00eb\u00e9\3\2\2\2\u00ec\u00f2\7\21\2\2\u00ed"+
		"\u00ee\5\34\17\2\u00ee\u00ef\b\7\1\2\u00ef\u00f1\3\2\2\2\u00f0\u00ed\3"+
		"\2\2\2\u00f1\u00f4\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3"+
		"\u00f9\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f5\u00f6\5\16\b\2\u00f6\u00f7\b"+
		"\7\1\2\u00f7\u00f9\3\2\2\2\u00f8\u00d8\3\2\2\2\u00f8\u00f5\3\2\2\2\u00f9"+
		"\r\3\2\2\2\u00fa\u00fb\5\6\4\2\u00fb\u00fc\7)\2\2\u00fc\u00fd\b\b\1\2"+
		"\u00fd\u0110\3\2\2\2\u00fe\u00ff\5\20\t\2\u00ff\u0100\7)\2\2\u0100\u0101"+
		"\b\b\1\2\u0101\u0110\3\2\2\2\u0102\u0103\5\30\r\2\u0103\u0104\7)\2\2\u0104"+
		"\u0105\b\b\1\2\u0105\u0110\3\2\2\2\u0106\u0107\5\22\n\2\u0107\u0108\b"+
		"\b\1\2\u0108\u0110\3\2\2\2\u0109\u010a\5\24\13\2\u010a\u010b\b\b\1\2\u010b"+
		"\u0110\3\2\2\2\u010c\u010d\5\34\17\2\u010d\u010e\b\b\1\2\u010e\u0110\3"+
		"\2\2\2\u010f\u00fa\3\2\2\2\u010f\u00fe\3\2\2\2\u010f\u0102\3\2\2\2\u010f"+
		"\u0106\3\2\2\2\u010f\u0109\3\2\2\2\u010f\u010c\3\2\2\2\u0110\17\3\2\2"+
		"\2\u0111\u0112\b\t\1\2\u0112\u0113\7:\2\2\u0113\u0114\7\f\2\2\u0114\u0122"+
		"\b\t\1\2\u0115\u0116\5\20\t\2\u0116\u011d\b\t\1\2\u0117\u0118\7(\2\2\u0118"+
		"\u0119\5\20\t\2\u0119\u011a\b\t\1\2\u011a\u011c\3\2\2\2\u011b\u0117\3"+
		"\2\2\2\u011c\u011f\3\2\2\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e"+
		"\u0121\3\2\2\2\u011f\u011d\3\2\2\2\u0120\u0115\3\2\2\2\u0121\u0124\3\2"+
		"\2\2\u0122\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0125\3\2\2\2\u0124"+
		"\u0122\3\2\2\2\u0125\u0126\b\t\1\2\u0126\u0157\7\r\2\2\u0127\u0128\7:"+
		"\2\2\u0128\u0129\7\16\2\2\u0129\u012a\5\20\t\2\u012a\u012b\7\17\2\2\u012b"+
		"\u012c\b\t\1\2\u012c\u0157\3\2\2\2\u012d\u012e\7\32\2\2\u012e\u012f\5"+
		"\20\t\27\u012f\u0130\b\t\1\2\u0130\u0157\3\2\2\2\u0131\u0132\7\33\2\2"+
		"\u0132\u0133\5\20\t\26\u0133\u0134\b\t\1\2\u0134\u0157\3\2\2\2\u0135\u0136"+
		"\7&\2\2\u0136\u0157\5\20\t\25\u0137\u0138\7\'\2\2\u0138\u0157\5\20\t\24"+
		"\u0139\u013a\7\f\2\2\u013a\u013e\5\32\16\2\u013b\u013d\7\36\2\2\u013c"+
		"\u013b\3\2\2\2\u013d\u0140\3\2\2\2\u013e\u013c\3\2\2\2\u013e\u013f\3\2"+
		"\2\2\u013f\u0141\3\2\2\2\u0140\u013e\3\2\2\2\u0141\u0142\7\r\2\2\u0142"+
		"\u0143\5\20\t\23\u0143\u0144\b\t\1\2\u0144\u0157\3\2\2\2\u0145\u0146\7"+
		"\36\2\2\u0146\u0147\5\20\t\22\u0147\u0148\b\t\1\2\u0148\u0157\3\2\2\2"+
		"\u0149\u014a\7!\2\2\u014a\u014b\5\20\t\21\u014b\u014c\b\t\1\2\u014c\u0157"+
		"\3\2\2\2\u014d\u014e\7\f\2\2\u014e\u014f\5\20\t\2\u014f\u0150\7\r\2\2"+
		"\u0150\u0151\b\t\1\2\u0151\u0157\3\2\2\2\u0152\u0153\7:\2\2\u0153\u0157"+
		"\b\t\1\2\u0154\u0155\7\67\2\2\u0155\u0157\b\t\1\2\u0156\u0111\3\2\2\2"+
		"\u0156\u0127\3\2\2\2\u0156\u012d\3\2\2\2\u0156\u0131\3\2\2\2\u0156\u0135"+
		"\3\2\2\2\u0156\u0137\3\2\2\2\u0156\u0139\3\2\2\2\u0156\u0145\3\2\2\2\u0156"+
		"\u0149\3\2\2\2\u0156\u014d\3\2\2\2\u0156\u0152\3\2\2\2\u0156\u0154\3\2"+
		"\2\2\u0157\u019f\3\2\2\2\u0158\u0159\f\20\2\2\u0159\u015a\t\2\2\2\u015a"+
		"\u015b\5\20\t\21\u015b\u015c\b\t\1\2\u015c\u019e\3\2\2\2\u015d\u015e\f"+
		"\17\2\2\u015e\u015f\t\3\2\2\u015f\u0160\5\20\t\20\u0160\u0161\b\t\1\2"+
		"\u0161\u019e\3\2\2\2\u0162\u0163\f\16\2\2\u0163\u0164\t\4\2\2\u0164\u0165"+
		"\5\20\t\17\u0165\u0166\b\t\1\2\u0166\u019e\3\2\2\2\u0167\u0168\f\r\2\2"+
		"\u0168\u0169\t\5\2\2\u0169\u016a\5\20\t\16\u016a\u016b\b\t\1\2\u016b\u019e"+
		"\3\2\2\2\u016c\u016d\f\f\2\2\u016d\u016e\t\6\2\2\u016e\u016f\5\20\t\r"+
		"\u016f\u0170\b\t\1\2\u0170\u019e\3\2\2\2\u0171\u0172\f\13\2\2\u0172\u0173"+
		"\7!\2\2\u0173\u0174\5\20\t\f\u0174\u0175\b\t\1\2\u0175\u019e\3\2\2\2\u0176"+
		"\u0177\f\n\2\2\u0177\u0178\7%\2\2\u0178\u0179\5\20\t\13\u0179\u017a\b"+
		"\t\1\2\u017a\u019e\3\2\2\2\u017b\u017c\f\t\2\2\u017c\u017d\7\"\2\2\u017d"+
		"\u017e\5\20\t\n\u017e\u017f\b\t\1\2\u017f\u019e\3\2\2\2\u0180\u0181\f"+
		"\b\2\2\u0181\u0182\7#\2\2\u0182\u0183\5\20\t\t\u0183\u0184\b\t\1\2\u0184"+
		"\u019e\3\2\2\2\u0185\u0186\f\7\2\2\u0186\u0187\7$\2\2\u0187\u0188\5\20"+
		"\t\b\u0188\u0189\b\t\1\2\u0189\u019e\3\2\2\2\u018a\u018b\f\6\2\2\u018b"+
		"\u018c\t\7\2\2\u018c\u018d\5\20\t\7\u018d\u018e\b\t\1\2\u018e\u019e\3"+
		"\2\2\2\u018f\u0190\f\35\2\2\u0190\u0191\7\34\2\2\u0191\u019e\b\t\1\2\u0192"+
		"\u0193\f\34\2\2\u0193\u0194\7\35\2\2\u0194\u019e\b\t\1\2\u0195\u0196\f"+
		"\31\2\2\u0196\u0197\7\65\2\2\u0197\u0198\7:\2\2\u0198\u019e\b\t\1\2\u0199"+
		"\u019a\f\30\2\2\u019a\u019b\7\66\2\2\u019b\u019c\7:\2\2\u019c\u019e\b"+
		"\t\1\2\u019d\u0158\3\2\2\2\u019d\u015d\3\2\2\2\u019d\u0162\3\2\2\2\u019d"+
		"\u0167\3\2\2\2\u019d\u016c\3\2\2\2\u019d\u0171\3\2\2\2\u019d\u0176\3\2"+
		"\2\2\u019d\u017b\3\2\2\2\u019d\u0180\3\2\2\2\u019d\u0185\3\2\2\2\u019d"+
		"\u018a\3\2\2\2\u019d\u018f\3\2\2\2\u019d\u0192\3\2\2\2\u019d\u0195\3\2"+
		"\2\2\u019d\u0199\3\2\2\2\u019e\u01a1\3\2\2\2\u019f\u019d\3\2\2\2\u019f"+
		"\u01a0\3\2\2\2\u01a0\21\3\2\2\2\u01a1\u019f\3\2\2\2\u01a2\u01a3\7\b\2"+
		"\2\u01a3\u01a4\7\f\2\2\u01a4\u01a5\b\n\1\2\u01a5\u01a6\5\20\t\2\u01a6"+
		"\u01a7\b\n\1\2\u01a7\u01a8\7\r\2\2\u01a8\u01a9\b\n\1\2\u01a9\u01aa\5\f"+
		"\7\2\u01aa\u01af\b\n\1\2\u01ab\u01ac\7\t\2\2\u01ac\u01ad\5\f\7\2\u01ad"+
		"\u01ae\b\n\1\2\u01ae\u01b0\3\2\2\2\u01af\u01ab\3\2\2\2\u01af\u01b0\3\2"+
		"\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01b2\b\n\1\2\u01b2\23\3\2\2\2\u01b3\u01b4"+
		"\7\n\2\2\u01b4\u01b5\7\f\2\2\u01b5\u01b6\b\13\1\2\u01b6\u01b7\5\26\f\2"+
		"\u01b7\u01b8\7\r\2\2\u01b8\u01b9\b\13\1\2\u01b9\u01ba\5\f\7\2\u01ba\u01bb"+
		"\b\13\1\2\u01bb\u01c4\3\2\2\2\u01bc\u01bd\7\13\2\2\u01bd\u01bf\7\f\2\2"+
		"\u01be\u01c0\5\20\t\2\u01bf\u01be\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c1"+
		"\3\2\2\2\u01c1\u01c2\7\r\2\2\u01c2\u01c4\5\f\7\2\u01c3\u01b3\3\2\2\2\u01c3"+
		"\u01bc\3\2\2\2\u01c4\25\3\2\2\2\u01c5\u01cc\b\f\1\2\u01c6\u01c7\5\6\4"+
		"\2\u01c7\u01c8\b\f\1\2\u01c8\u01cd\3\2\2\2\u01c9\u01ca\5\20\t\2\u01ca"+
		"\u01cb\b\f\1\2\u01cb\u01cd\3\2\2\2\u01cc\u01c6\3\2\2\2\u01cc\u01c9\3\2"+
		"\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce\u01cf\b\f\1\2\u01cf"+
		"\u01d3\7)\2\2\u01d0\u01d1\5\20\t\2\u01d1\u01d2\b\f\1\2\u01d2\u01d4\3\2"+
		"\2\2\u01d3\u01d0\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5"+
		"\u01d6\b\f\1\2\u01d6\u01da\7)\2\2\u01d7\u01d8\5\20\t\2\u01d8\u01d9\b\f"+
		"\1\2\u01d9\u01db\3\2\2\2\u01da\u01d7\3\2\2\2\u01da\u01db\3\2\2\2\u01db"+
		"\u01dc\3\2\2\2\u01dc\u01dd\b\f\1\2\u01dd\27\3\2\2\2\u01de\u01df\7\6\2"+
		"\2\u01df\u01e3\b\r\1\2\u01e0\u01e1\5\20\t\2\u01e1\u01e2\b\r\1\2\u01e2"+
		"\u01e4\3\2\2\2\u01e3\u01e0\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01e5\3\2"+
		"\2\2\u01e5\u01e6\b\r\1\2\u01e6\31\3\2\2\2\u01e7\u01e8\7\4\2\2\u01e8\u01ef"+
		"\b\16\1\2\u01e9\u01ea\7\5\2\2\u01ea\u01ef\b\16\1\2\u01eb\u01ec\7\7\2\2"+
		"\u01ec\u01ed\7:\2\2\u01ed\u01ef\b\16\1\2\u01ee\u01e7\3\2\2\2\u01ee\u01e9"+
		"\3\2\2\2\u01ee\u01eb\3\2\2\2\u01ef\33\3\2\2\2\u01f0\u01f1\7\3\2\2\u01f1"+
		"\u01f2\b\17\1\2\u01f2\u01f3\b\17\1\2\u01f3\35\3\2\2\2-$\63;DLUYhv{\u0081"+
		"\u0084\u0088\u0090\u0093\u009d\u00ab\u00ae\u00bb\u00c3\u00c6\u00ca\u00d1"+
		"\u00d8\u00e1\u00e9\u00f2\u00f8\u010f\u011d\u0122\u013e\u0156\u019d\u019f"+
		"\u01af\u01bf\u01c3\u01cc\u01d3\u01da\u01e3\u01ee";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}