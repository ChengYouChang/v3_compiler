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
public class v3_compilerLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "INT", "VOID", "RETURN", "STRUCT", "IF", "ELSE", "FOR", "WHILE", 
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


	public v3_compilerLexer(CharStream input) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2<\u0138\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20"+
		"\3\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33"+
		"\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3"+
		"\"\3\"\3\"\3#\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3*\3+"+
		"\3+\3+\3,\3,\3,\3-\3-\3-\3.\3.\3.\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\61"+
		"\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3\65\3\65\3\65\3\66"+
		"\3\66\3\66\5\66\u0113\n\66\3\67\3\67\7\67\u0117\n\67\f\67\16\67\u011a"+
		"\13\67\38\38\38\68\u011f\n8\r8\168\u0120\39\39\79\u0125\n9\f9\169\u0128"+
		"\139\3:\3:\3:\3:\7:\u012e\n:\f:\16:\u0131\13:\3:\3:\3;\3;\3;\3;\2\2<\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37="+
		" ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9"+
		"q:s;u<\3\2\n\3\2\63;\3\2\62;\4\2ZZzz\5\2\62;CHch\5\2C\\aac|\6\2\62;C\\"+
		"aac|\4\2\f\f\17\17\5\2\13\13\17\17\"\"\2\u013d\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2"+
		"\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2"+
		"\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2"+
		"\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y"+
		"\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2"+
		"\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2"+
		"\2s\3\2\2\2\2u\3\2\2\2\3w\3\2\2\2\5y\3\2\2\2\7}\3\2\2\2\t\u0082\3\2\2"+
		"\2\13\u0089\3\2\2\2\r\u0090\3\2\2\2\17\u0093\3\2\2\2\21\u0098\3\2\2\2"+
		"\23\u009c\3\2\2\2\25\u00a2\3\2\2\2\27\u00a4\3\2\2\2\31\u00a6\3\2\2\2\33"+
		"\u00a8\3\2\2\2\35\u00aa\3\2\2\2\37\u00ac\3\2\2\2!\u00ae\3\2\2\2#\u00b0"+
		"\3\2\2\2%\u00b3\3\2\2\2\'\u00b5\3\2\2\2)\u00b8\3\2\2\2+\u00bb\3\2\2\2"+
		"-\u00be\3\2\2\2/\u00c1\3\2\2\2\61\u00c4\3\2\2\2\63\u00c6\3\2\2\2\65\u00c8"+
		"\3\2\2\2\67\u00cb\3\2\2\29\u00ce\3\2\2\2;\u00d0\3\2\2\2=\u00d2\3\2\2\2"+
		"?\u00d4\3\2\2\2A\u00d6\3\2\2\2C\u00d8\3\2\2\2E\u00db\3\2\2\2G\u00de\3"+
		"\2\2\2I\u00e0\3\2\2\2K\u00e2\3\2\2\2M\u00e4\3\2\2\2O\u00e6\3\2\2\2Q\u00e8"+
		"\3\2\2\2S\u00ea\3\2\2\2U\u00ed\3\2\2\2W\u00f0\3\2\2\2Y\u00f3\3\2\2\2["+
		"\u00f6\3\2\2\2]\u00f9\3\2\2\2_\u00fd\3\2\2\2a\u0101\3\2\2\2c\u0104\3\2"+
		"\2\2e\u0107\3\2\2\2g\u010a\3\2\2\2i\u010c\3\2\2\2k\u0112\3\2\2\2m\u0114"+
		"\3\2\2\2o\u011b\3\2\2\2q\u0122\3\2\2\2s\u0129\3\2\2\2u\u0134\3\2\2\2w"+
		"x\7\f\2\2x\4\3\2\2\2yz\7k\2\2z{\7p\2\2{|\7v\2\2|\6\3\2\2\2}~\7x\2\2~\177"+
		"\7q\2\2\177\u0080\7k\2\2\u0080\u0081\7f\2\2\u0081\b\3\2\2\2\u0082\u0083"+
		"\7t\2\2\u0083\u0084\7g\2\2\u0084\u0085\7v\2\2\u0085\u0086\7w\2\2\u0086"+
		"\u0087\7t\2\2\u0087\u0088\7p\2\2\u0088\n\3\2\2\2\u0089\u008a\7u\2\2\u008a"+
		"\u008b\7v\2\2\u008b\u008c\7t\2\2\u008c\u008d\7w\2\2\u008d\u008e\7e\2\2"+
		"\u008e\u008f\7v\2\2\u008f\f\3\2\2\2\u0090\u0091\7k\2\2\u0091\u0092\7h"+
		"\2\2\u0092\16\3\2\2\2\u0093\u0094\7g\2\2\u0094\u0095\7n\2\2\u0095\u0096"+
		"\7u\2\2\u0096\u0097\7g\2\2\u0097\20\3\2\2\2\u0098\u0099\7h\2\2\u0099\u009a"+
		"\7q\2\2\u009a\u009b\7t\2\2\u009b\22\3\2\2\2\u009c\u009d\7y\2\2\u009d\u009e"+
		"\7j\2\2\u009e\u009f\7k\2\2\u009f\u00a0\7n\2\2\u00a0\u00a1\7g\2\2\u00a1"+
		"\24\3\2\2\2\u00a2\u00a3\7*\2\2\u00a3\26\3\2\2\2\u00a4\u00a5\7+\2\2\u00a5"+
		"\30\3\2\2\2\u00a6\u00a7\7]\2\2\u00a7\32\3\2\2\2\u00a8\u00a9\7_\2\2\u00a9"+
		"\34\3\2\2\2\u00aa\u00ab\7}\2\2\u00ab\36\3\2\2\2\u00ac\u00ad\7\177\2\2"+
		"\u00ad \3\2\2\2\u00ae\u00af\7>\2\2\u00af\"\3\2\2\2\u00b0\u00b1\7>\2\2"+
		"\u00b1\u00b2\7?\2\2\u00b2$\3\2\2\2\u00b3\u00b4\7@\2\2\u00b4&\3\2\2\2\u00b5"+
		"\u00b6\7@\2\2\u00b6\u00b7\7?\2\2\u00b7(\3\2\2\2\u00b8\u00b9\7>\2\2\u00b9"+
		"\u00ba\7>\2\2\u00ba*\3\2\2\2\u00bb\u00bc\7@\2\2\u00bc\u00bd\7@\2\2\u00bd"+
		",\3\2\2\2\u00be\u00bf\7?\2\2\u00bf\u00c0\7?\2\2\u00c0.\3\2\2\2\u00c1\u00c2"+
		"\7#\2\2\u00c2\u00c3\7?\2\2\u00c3\60\3\2\2\2\u00c4\u00c5\7-\2\2\u00c5\62"+
		"\3\2\2\2\u00c6\u00c7\7/\2\2\u00c7\64\3\2\2\2\u00c8\u00c9\7-\2\2\u00c9"+
		"\u00ca\7-\2\2\u00ca\66\3\2\2\2\u00cb\u00cc\7/\2\2\u00cc\u00cd\7/\2\2\u00cd"+
		"8\3\2\2\2\u00ce\u00cf\7,\2\2\u00cf:\3\2\2\2\u00d0\u00d1\7\61\2\2\u00d1"+
		"<\3\2\2\2\u00d2\u00d3\7\'\2\2\u00d3>\3\2\2\2\u00d4\u00d5\7(\2\2\u00d5"+
		"@\3\2\2\2\u00d6\u00d7\7~\2\2\u00d7B\3\2\2\2\u00d8\u00d9\7(\2\2\u00d9\u00da"+
		"\7(\2\2\u00daD\3\2\2\2\u00db\u00dc\7~\2\2\u00dc\u00dd\7~\2\2\u00ddF\3"+
		"\2\2\2\u00de\u00df\7`\2\2\u00dfH\3\2\2\2\u00e0\u00e1\7#\2\2\u00e1J\3\2"+
		"\2\2\u00e2\u00e3\7\u0080\2\2\u00e3L\3\2\2\2\u00e4\u00e5\7.\2\2\u00e5N"+
		"\3\2\2\2\u00e6\u00e7\7=\2\2\u00e7P\3\2\2\2\u00e8\u00e9\7?\2\2\u00e9R\3"+
		"\2\2\2\u00ea\u00eb\7,\2\2\u00eb\u00ec\7?\2\2\u00ecT\3\2\2\2\u00ed\u00ee"+
		"\7\61\2\2\u00ee\u00ef\7?\2\2\u00efV\3\2\2\2\u00f0\u00f1\7\'\2\2\u00f1"+
		"\u00f2\7?\2\2\u00f2X\3\2\2\2\u00f3\u00f4\7-\2\2\u00f4\u00f5\7?\2\2\u00f5"+
		"Z\3\2\2\2\u00f6\u00f7\7/\2\2\u00f7\u00f8\7?\2\2\u00f8\\\3\2\2\2\u00f9"+
		"\u00fa\7>\2\2\u00fa\u00fb\7>\2\2\u00fb\u00fc\7?\2\2\u00fc^\3\2\2\2\u00fd"+
		"\u00fe\7@\2\2\u00fe\u00ff\7@\2\2\u00ff\u0100\7?\2\2\u0100`\3\2\2\2\u0101"+
		"\u0102\7(\2\2\u0102\u0103\7?\2\2\u0103b\3\2\2\2\u0104\u0105\7`\2\2\u0105"+
		"\u0106\7?\2\2\u0106d\3\2\2\2\u0107\u0108\7~\2\2\u0108\u0109\7?\2\2\u0109"+
		"f\3\2\2\2\u010a\u010b\7\60\2\2\u010bh\3\2\2\2\u010c\u010d\7/\2\2\u010d"+
		"\u010e\7@\2\2\u010ej\3\2\2\2\u010f\u0113\7\62\2\2\u0110\u0113\5m\67\2"+
		"\u0111\u0113\5o8\2\u0112\u010f\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0111"+
		"\3\2\2\2\u0113l\3\2\2\2\u0114\u0118\t\2\2\2\u0115\u0117\t\3\2\2\u0116"+
		"\u0115\3\2\2\2\u0117\u011a\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2"+
		"\2\2\u0119n\3\2\2\2\u011a\u0118\3\2\2\2\u011b\u011c\7\62\2\2\u011c\u011e"+
		"\t\4\2\2\u011d\u011f\t\5\2\2\u011e\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120"+
		"\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121p\3\2\2\2\u0122\u0126\t\6\2\2"+
		"\u0123\u0125\t\7\2\2\u0124\u0123\3\2\2\2\u0125\u0128\3\2\2\2\u0126\u0124"+
		"\3\2\2\2\u0126\u0127\3\2\2\2\u0127r\3\2\2\2\u0128\u0126\3\2\2\2\u0129"+
		"\u012a\7\61\2\2\u012a\u012b\7\61\2\2\u012b\u012f\3\2\2\2\u012c\u012e\n"+
		"\b\2\2\u012d\u012c\3\2\2\2\u012e\u0131\3\2\2\2\u012f\u012d\3\2\2\2\u012f"+
		"\u0130\3\2\2\2\u0130\u0132\3\2\2\2\u0131\u012f\3\2\2\2\u0132\u0133\b:"+
		"\2\2\u0133t\3\2\2\2\u0134\u0135\t\t\2\2\u0135\u0136\3\2\2\2\u0136\u0137"+
		"\b;\2\2\u0137v\3\2\2\2\b\2\u0112\u0118\u0120\u0126\u012f\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}