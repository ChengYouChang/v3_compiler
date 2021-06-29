// Generated from d:\meeting\thesis\myCompiler\Antlr8.1\v3_compiler\v3_compiler.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class v3_myCompilerLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"INT", "VOID", "RETURN", "STRUCT", "IF", "ELSE", "FOR", "WHILE", "LeftParen", 
			"RightParen", "LeftBracket", "RightBracket", "LeftBrace", "RightBrace", 
			"Less", "LessEqual", "Greater", "GreaterEqual", "LeftShift", "RightShift", 
			"Equal", "NotEqual", "Plus", "Minus", "PlusPlus", "MinusMinus", "Star", 
			"Div", "Mod", "And", "Or", "AndAnd", "OrOr", "Caret", "Not", "Tilde", 
			"Comma", "Semi", "Assign", "StarAssign", "DivAssign", "ModAssign", "PlusAssign", 
			"MinusAssign", "LeftShiftAssign", "RightShiftAssign", "AndAssign", "XorAssign", 
			"OrAssign", "Dot", "Arrow", "IntegerConstant", "DecimalConstant", "HexConstant", 
			"ID", "Newline", "WhiteSpace", "LineComment"
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


	public v3_myCompilerLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "v3_compiler.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2<\u013f\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\3\2\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20"+
		"\3\20\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3"+
		"!\3\"\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3)\3*\3*\3*"+
		"\3+\3+\3+\3,\3,\3,\3-\3-\3-\3.\3.\3.\3.\3/\3/\3/\3/\3\60\3\60\3\60\3\61"+
		"\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\65\5\65"+
		"\u0111\n\65\3\66\3\66\7\66\u0115\n\66\f\66\16\66\u0118\13\66\3\67\3\67"+
		"\3\67\6\67\u011d\n\67\r\67\16\67\u011e\38\38\78\u0123\n8\f8\168\u0126"+
		"\138\39\39\59\u012a\n9\39\59\u012d\n9\39\39\3:\3:\3:\3:\3;\3;\3;\3;\7"+
		";\u0139\n;\f;\16;\u013c\13;\3;\3;\2\2<\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.["+
		"/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<\3\2\n\3\2\63;\3\2\62;\4\2"+
		"ZZzz\5\2\62;CHch\5\2C\\aac|\6\2\62;C\\aac|\4\2\13\13\"\"\4\2\f\f\17\17"+
		"\2\u0146\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S"+
		"\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2"+
		"\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2"+
		"\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\3w\3\2\2\2\5{"+
		"\3\2\2\2\7\u0080\3\2\2\2\t\u0087\3\2\2\2\13\u008e\3\2\2\2\r\u0091\3\2"+
		"\2\2\17\u0096\3\2\2\2\21\u009a\3\2\2\2\23\u00a0\3\2\2\2\25\u00a2\3\2\2"+
		"\2\27\u00a4\3\2\2\2\31\u00a6\3\2\2\2\33\u00a8\3\2\2\2\35\u00aa\3\2\2\2"+
		"\37\u00ac\3\2\2\2!\u00ae\3\2\2\2#\u00b1\3\2\2\2%\u00b3\3\2\2\2\'\u00b6"+
		"\3\2\2\2)\u00b9\3\2\2\2+\u00bc\3\2\2\2-\u00bf\3\2\2\2/\u00c2\3\2\2\2\61"+
		"\u00c4\3\2\2\2\63\u00c6\3\2\2\2\65\u00c9\3\2\2\2\67\u00cc\3\2\2\29\u00ce"+
		"\3\2\2\2;\u00d0\3\2\2\2=\u00d2\3\2\2\2?\u00d4\3\2\2\2A\u00d6\3\2\2\2C"+
		"\u00d9\3\2\2\2E\u00dc\3\2\2\2G\u00de\3\2\2\2I\u00e0\3\2\2\2K\u00e2\3\2"+
		"\2\2M\u00e4\3\2\2\2O\u00e6\3\2\2\2Q\u00e8\3\2\2\2S\u00eb\3\2\2\2U\u00ee"+
		"\3\2\2\2W\u00f1\3\2\2\2Y\u00f4\3\2\2\2[\u00f7\3\2\2\2]\u00fb\3\2\2\2_"+
		"\u00ff\3\2\2\2a\u0102\3\2\2\2c\u0105\3\2\2\2e\u0108\3\2\2\2g\u010a\3\2"+
		"\2\2i\u0110\3\2\2\2k\u0112\3\2\2\2m\u0119\3\2\2\2o\u0120\3\2\2\2q\u012c"+
		"\3\2\2\2s\u0130\3\2\2\2u\u0134\3\2\2\2wx\7k\2\2xy\7p\2\2yz\7v\2\2z\4\3"+
		"\2\2\2{|\7x\2\2|}\7q\2\2}~\7k\2\2~\177\7f\2\2\177\6\3\2\2\2\u0080\u0081"+
		"\7t\2\2\u0081\u0082\7g\2\2\u0082\u0083\7v\2\2\u0083\u0084\7w\2\2\u0084"+
		"\u0085\7t\2\2\u0085\u0086\7p\2\2\u0086\b\3\2\2\2\u0087\u0088\7u\2\2\u0088"+
		"\u0089\7v\2\2\u0089\u008a\7t\2\2\u008a\u008b\7w\2\2\u008b\u008c\7e\2\2"+
		"\u008c\u008d\7v\2\2\u008d\n\3\2\2\2\u008e\u008f\7k\2\2\u008f\u0090\7h"+
		"\2\2\u0090\f\3\2\2\2\u0091\u0092\7g\2\2\u0092\u0093\7n\2\2\u0093\u0094"+
		"\7u\2\2\u0094\u0095\7g\2\2\u0095\16\3\2\2\2\u0096\u0097\7h\2\2\u0097\u0098"+
		"\7q\2\2\u0098\u0099\7t\2\2\u0099\20\3\2\2\2\u009a\u009b\7y\2\2\u009b\u009c"+
		"\7j\2\2\u009c\u009d\7k\2\2\u009d\u009e\7n\2\2\u009e\u009f\7g\2\2\u009f"+
		"\22\3\2\2\2\u00a0\u00a1\7*\2\2\u00a1\24\3\2\2\2\u00a2\u00a3\7+\2\2\u00a3"+
		"\26\3\2\2\2\u00a4\u00a5\7]\2\2\u00a5\30\3\2\2\2\u00a6\u00a7\7_\2\2\u00a7"+
		"\32\3\2\2\2\u00a8\u00a9\7}\2\2\u00a9\34\3\2\2\2\u00aa\u00ab\7\177\2\2"+
		"\u00ab\36\3\2\2\2\u00ac\u00ad\7>\2\2\u00ad \3\2\2\2\u00ae\u00af\7>\2\2"+
		"\u00af\u00b0\7?\2\2\u00b0\"\3\2\2\2\u00b1\u00b2\7@\2\2\u00b2$\3\2\2\2"+
		"\u00b3\u00b4\7@\2\2\u00b4\u00b5\7?\2\2\u00b5&\3\2\2\2\u00b6\u00b7\7>\2"+
		"\2\u00b7\u00b8\7>\2\2\u00b8(\3\2\2\2\u00b9\u00ba\7@\2\2\u00ba\u00bb\7"+
		"@\2\2\u00bb*\3\2\2\2\u00bc\u00bd\7?\2\2\u00bd\u00be\7?\2\2\u00be,\3\2"+
		"\2\2\u00bf\u00c0\7#\2\2\u00c0\u00c1\7?\2\2\u00c1.\3\2\2\2\u00c2\u00c3"+
		"\7-\2\2\u00c3\60\3\2\2\2\u00c4\u00c5\7/\2\2\u00c5\62\3\2\2\2\u00c6\u00c7"+
		"\7-\2\2\u00c7\u00c8\7-\2\2\u00c8\64\3\2\2\2\u00c9\u00ca\7/\2\2\u00ca\u00cb"+
		"\7/\2\2\u00cb\66\3\2\2\2\u00cc\u00cd\7,\2\2\u00cd8\3\2\2\2\u00ce\u00cf"+
		"\7\61\2\2\u00cf:\3\2\2\2\u00d0\u00d1\7\'\2\2\u00d1<\3\2\2\2\u00d2\u00d3"+
		"\7(\2\2\u00d3>\3\2\2\2\u00d4\u00d5\7~\2\2\u00d5@\3\2\2\2\u00d6\u00d7\7"+
		"(\2\2\u00d7\u00d8\7(\2\2\u00d8B\3\2\2\2\u00d9\u00da\7~\2\2\u00da\u00db"+
		"\7~\2\2\u00dbD\3\2\2\2\u00dc\u00dd\7`\2\2\u00ddF\3\2\2\2\u00de\u00df\7"+
		"#\2\2\u00dfH\3\2\2\2\u00e0\u00e1\7\u0080\2\2\u00e1J\3\2\2\2\u00e2\u00e3"+
		"\7.\2\2\u00e3L\3\2\2\2\u00e4\u00e5\7=\2\2\u00e5N\3\2\2\2\u00e6\u00e7\7"+
		"?\2\2\u00e7P\3\2\2\2\u00e8\u00e9\7,\2\2\u00e9\u00ea\7?\2\2\u00eaR\3\2"+
		"\2\2\u00eb\u00ec\7\61\2\2\u00ec\u00ed\7?\2\2\u00edT\3\2\2\2\u00ee\u00ef"+
		"\7\'\2\2\u00ef\u00f0\7?\2\2\u00f0V\3\2\2\2\u00f1\u00f2\7-\2\2\u00f2\u00f3"+
		"\7?\2\2\u00f3X\3\2\2\2\u00f4\u00f5\7/\2\2\u00f5\u00f6\7?\2\2\u00f6Z\3"+
		"\2\2\2\u00f7\u00f8\7>\2\2\u00f8\u00f9\7>\2\2\u00f9\u00fa\7?\2\2\u00fa"+
		"\\\3\2\2\2\u00fb\u00fc\7@\2\2\u00fc\u00fd\7@\2\2\u00fd\u00fe\7?\2\2\u00fe"+
		"^\3\2\2\2\u00ff\u0100\7(\2\2\u0100\u0101\7?\2\2\u0101`\3\2\2\2\u0102\u0103"+
		"\7`\2\2\u0103\u0104\7?\2\2\u0104b\3\2\2\2\u0105\u0106\7~\2\2\u0106\u0107"+
		"\7?\2\2\u0107d\3\2\2\2\u0108\u0109\7\60\2\2\u0109f\3\2\2\2\u010a\u010b"+
		"\7/\2\2\u010b\u010c\7@\2\2\u010ch\3\2\2\2\u010d\u0111\7\62\2\2\u010e\u0111"+
		"\5k\66\2\u010f\u0111\5m\67\2\u0110\u010d\3\2\2\2\u0110\u010e\3\2\2\2\u0110"+
		"\u010f\3\2\2\2\u0111j\3\2\2\2\u0112\u0116\t\2\2\2\u0113\u0115\t\3\2\2"+
		"\u0114\u0113\3\2\2\2\u0115\u0118\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117"+
		"\3\2\2\2\u0117l\3\2\2\2\u0118\u0116\3\2\2\2\u0119\u011a\7\62\2\2\u011a"+
		"\u011c\t\4\2\2\u011b\u011d\t\5\2\2\u011c\u011b\3\2\2\2\u011d\u011e\3\2"+
		"\2\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011fn\3\2\2\2\u0120\u0124"+
		"\t\6\2\2\u0121\u0123\t\7\2\2\u0122\u0121\3\2\2\2\u0123\u0126\3\2\2\2\u0124"+
		"\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125p\3\2\2\2\u0126\u0124\3\2\2\2"+
		"\u0127\u0129\7\17\2\2\u0128\u012a\7\f\2\2\u0129\u0128\3\2\2\2\u0129\u012a"+
		"\3\2\2\2\u012a\u012d\3\2\2\2\u012b\u012d\7\f\2\2\u012c\u0127\3\2\2\2\u012c"+
		"\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u012f\b9\2\2\u012fr\3\2\2\2\u0130"+
		"\u0131\t\b\2\2\u0131\u0132\3\2\2\2\u0132\u0133\b:\2\2\u0133t\3\2\2\2\u0134"+
		"\u0135\7\61\2\2\u0135\u0136\7\61\2\2\u0136\u013a\3\2\2\2\u0137\u0139\n"+
		"\t\2\2\u0138\u0137\3\2\2\2\u0139\u013c\3\2\2\2\u013a\u0138\3\2\2\2\u013a"+
		"\u013b\3\2\2\2\u013b\u013d\3\2\2\2\u013c\u013a\3\2\2\2\u013d\u013e\b;"+
		"\2\2\u013ev\3\2\2\2\n\2\u0110\u0116\u011e\u0124\u0129\u012c\u013a\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}