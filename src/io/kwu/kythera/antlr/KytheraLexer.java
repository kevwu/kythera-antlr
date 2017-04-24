// Generated from /home/dejawu/Documents/kythera/Kythera.g4 by ANTLR 4.7

    package io.kwu.kythera.antlr;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class KytheraLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, COMMENT=11, LET=12, NAME=13, IF=14, ELSE=15, WHILE=16, EACH=17, 
		RETURN=18, BREAK=19, CONTINUE=20, NEW=21, BOOL=22, INT=23, FLOAT=24, STR=25, 
		FN=26, OBJ=27, ARR=28, TYPEOF=29, ASSIGNMENT_OPERATOR=30, BOOLEAN_COMPARISON=31, 
		BOOLEAN_OPERATOR=32, NOT_OPERATOR=33, ARITH_OPERATOR=34, EXTENDS=35, IMPLEMENTS=36, 
		INTERFACE=37, THIS=38, PUNCT=39, TRUE=40, FALSE=41, IntLiteral=42, FloatLiteral=43, 
		StrLiteral=44, NULL=45, Identifier=46, WHITESPACE=47;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "COMMENT", "LET", "NAME", "IF", "ELSE", "WHILE", "EACH", "RETURN", 
		"BREAK", "CONTINUE", "NEW", "BOOL", "INT", "FLOAT", "STR", "FN", "OBJ", 
		"ARR", "TYPEOF", "ASSIGNMENT_OPERATOR", "BOOLEAN_COMPARISON", "BOOLEAN_OPERATOR", 
		"NOT_OPERATOR", "ARITH_OPERATOR", "EXTENDS", "IMPLEMENTS", "INTERFACE", 
		"THIS", "PUNCT", "TRUE", "FALSE", "IntLiteral", "FloatLiteral", "StrLiteral", 
		"NULL", "Identifier", "WHITESPACE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "'('", "','", "')'", "':'", "'.'", "'import'", "'include'", 
		"'export'", null, "'let'", "'name'", "'if'", "'else'", "'while'", "'each'", 
		"'return'", "'break'", "'continue'", "'new'", "'bool'", "'int'", "'float'", 
		"'str'", "'fn'", "'obj'", "'arr'", "'typeof'", "'='", null, null, "'!'", 
		null, "'extends'", "'implements'", "'interface'", "'this'", null, "'true'", 
		"'false'", null, null, null, "'null'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, "COMMENT", 
		"LET", "NAME", "IF", "ELSE", "WHILE", "EACH", "RETURN", "BREAK", "CONTINUE", 
		"NEW", "BOOL", "INT", "FLOAT", "STR", "FN", "OBJ", "ARR", "TYPEOF", "ASSIGNMENT_OPERATOR", 
		"BOOLEAN_COMPARISON", "BOOLEAN_OPERATOR", "NOT_OPERATOR", "ARITH_OPERATOR", 
		"EXTENDS", "IMPLEMENTS", "INTERFACE", "THIS", "PUNCT", "TRUE", "FALSE", 
		"IntLiteral", "FloatLiteral", "StrLiteral", "NULL", "Identifier", "WHITESPACE"
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


	public KytheraLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Kythera.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\61\u016c\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\7\f\u008a"+
		"\n\f\f\f\16\f\u008d\13\f\3\f\5\f\u0090\n\f\3\f\3\f\3\f\3\f\3\f\7\f\u0097"+
		"\n\f\f\f\16\f\u009a\13\f\3\f\3\f\5\f\u009e\n\f\3\f\3\f\3\r\3\r\3\r\3\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33"+
		"\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u0108\n \3!\3"+
		"!\3!\3!\5!\u010e\n!\3\"\3\"\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%"+
		"\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3"+
		"\'\3(\3(\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3+\6+\u0144\n+\r+\16+\u0145"+
		"\3,\6,\u0149\n,\r,\16,\u014a\3,\3,\6,\u014f\n,\r,\16,\u0150\5,\u0153\n"+
		",\3-\3-\6-\u0157\n-\r-\16-\u0158\3-\3-\3.\3.\3.\3.\3.\3/\3/\7/\u0164\n"+
		"/\f/\16/\u0167\13/\3\60\3\60\3\60\3\60\4\u0098\u0158\2\61\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G"+
		"%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61\3\2\t\4\2\f\f\17\17\4\2>>@@\6\2\'\',-/"+
		"/\61\61\n\2*+\60\60>>@@]]__}}\177\177\4\2C\\c|\6\2\62;C\\aac|\5\2\13\f"+
		"\17\17\"\"\2\u017a\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2"+
		"\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2"+
		"\2_\3\2\2\2\3a\3\2\2\2\5c\3\2\2\2\7e\3\2\2\2\tg\3\2\2\2\13i\3\2\2\2\r"+
		"k\3\2\2\2\17m\3\2\2\2\21o\3\2\2\2\23v\3\2\2\2\25~\3\2\2\2\27\u009d\3\2"+
		"\2\2\31\u00a1\3\2\2\2\33\u00a5\3\2\2\2\35\u00aa\3\2\2\2\37\u00ad\3\2\2"+
		"\2!\u00b2\3\2\2\2#\u00b8\3\2\2\2%\u00bd\3\2\2\2\'\u00c4\3\2\2\2)\u00ca"+
		"\3\2\2\2+\u00d3\3\2\2\2-\u00d7\3\2\2\2/\u00dc\3\2\2\2\61\u00e0\3\2\2\2"+
		"\63\u00e6\3\2\2\2\65\u00ea\3\2\2\2\67\u00ed\3\2\2\29\u00f1\3\2\2\2;\u00f5"+
		"\3\2\2\2=\u00fc\3\2\2\2?\u0107\3\2\2\2A\u010d\3\2\2\2C\u010f\3\2\2\2E"+
		"\u0111\3\2\2\2G\u0113\3\2\2\2I\u011b\3\2\2\2K\u0126\3\2\2\2M\u0130\3\2"+
		"\2\2O\u0135\3\2\2\2Q\u0137\3\2\2\2S\u013c\3\2\2\2U\u0143\3\2\2\2W\u0148"+
		"\3\2\2\2Y\u0154\3\2\2\2[\u015c\3\2\2\2]\u0161\3\2\2\2_\u0168\3\2\2\2a"+
		"b\7}\2\2b\4\3\2\2\2cd\7\177\2\2d\6\3\2\2\2ef\7*\2\2f\b\3\2\2\2gh\7.\2"+
		"\2h\n\3\2\2\2ij\7+\2\2j\f\3\2\2\2kl\7<\2\2l\16\3\2\2\2mn\7\60\2\2n\20"+
		"\3\2\2\2op\7k\2\2pq\7o\2\2qr\7r\2\2rs\7q\2\2st\7t\2\2tu\7v\2\2u\22\3\2"+
		"\2\2vw\7k\2\2wx\7p\2\2xy\7e\2\2yz\7n\2\2z{\7w\2\2{|\7f\2\2|}\7g\2\2}\24"+
		"\3\2\2\2~\177\7g\2\2\177\u0080\7z\2\2\u0080\u0081\7r\2\2\u0081\u0082\7"+
		"q\2\2\u0082\u0083\7t\2\2\u0083\u0084\7v\2\2\u0084\26\3\2\2\2\u0085\u0086"+
		"\7\61\2\2\u0086\u0087\7\61\2\2\u0087\u008b\3\2\2\2\u0088\u008a\n\2\2\2"+
		"\u0089\u0088\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c"+
		"\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u0090\7\17\2\2"+
		"\u008f\u008e\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u009e"+
		"\7\f\2\2\u0092\u0093\7\61\2\2\u0093\u0094\7,\2\2\u0094\u0098\3\2\2\2\u0095"+
		"\u0097\13\2\2\2\u0096\u0095\3\2\2\2\u0097\u009a\3\2\2\2\u0098\u0099\3"+
		"\2\2\2\u0098\u0096\3\2\2\2\u0099\u009b\3\2\2\2\u009a\u0098\3\2\2\2\u009b"+
		"\u009c\7,\2\2\u009c\u009e\7\61\2\2\u009d\u0085\3\2\2\2\u009d\u0092\3\2"+
		"\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\b\f\2\2\u00a0\30\3\2\2\2\u00a1\u00a2"+
		"\7n\2\2\u00a2\u00a3\7g\2\2\u00a3\u00a4\7v\2\2\u00a4\32\3\2\2\2\u00a5\u00a6"+
		"\7p\2\2\u00a6\u00a7\7c\2\2\u00a7\u00a8\7o\2\2\u00a8\u00a9\7g\2\2\u00a9"+
		"\34\3\2\2\2\u00aa\u00ab\7k\2\2\u00ab\u00ac\7h\2\2\u00ac\36\3\2\2\2\u00ad"+
		"\u00ae\7g\2\2\u00ae\u00af\7n\2\2\u00af\u00b0\7u\2\2\u00b0\u00b1\7g\2\2"+
		"\u00b1 \3\2\2\2\u00b2\u00b3\7y\2\2\u00b3\u00b4\7j\2\2\u00b4\u00b5\7k\2"+
		"\2\u00b5\u00b6\7n\2\2\u00b6\u00b7\7g\2\2\u00b7\"\3\2\2\2\u00b8\u00b9\7"+
		"g\2\2\u00b9\u00ba\7c\2\2\u00ba\u00bb\7e\2\2\u00bb\u00bc\7j\2\2\u00bc$"+
		"\3\2\2\2\u00bd\u00be\7t\2\2\u00be\u00bf\7g\2\2\u00bf\u00c0\7v\2\2\u00c0"+
		"\u00c1\7w\2\2\u00c1\u00c2\7t\2\2\u00c2\u00c3\7p\2\2\u00c3&\3\2\2\2\u00c4"+
		"\u00c5\7d\2\2\u00c5\u00c6\7t\2\2\u00c6\u00c7\7g\2\2\u00c7\u00c8\7c\2\2"+
		"\u00c8\u00c9\7m\2\2\u00c9(\3\2\2\2\u00ca\u00cb\7e\2\2\u00cb\u00cc\7q\2"+
		"\2\u00cc\u00cd\7p\2\2\u00cd\u00ce\7v\2\2\u00ce\u00cf\7k\2\2\u00cf\u00d0"+
		"\7p\2\2\u00d0\u00d1\7w\2\2\u00d1\u00d2\7g\2\2\u00d2*\3\2\2\2\u00d3\u00d4"+
		"\7p\2\2\u00d4\u00d5\7g\2\2\u00d5\u00d6\7y\2\2\u00d6,\3\2\2\2\u00d7\u00d8"+
		"\7d\2\2\u00d8\u00d9\7q\2\2\u00d9\u00da\7q\2\2\u00da\u00db\7n\2\2\u00db"+
		".\3\2\2\2\u00dc\u00dd\7k\2\2\u00dd\u00de\7p\2\2\u00de\u00df\7v\2\2\u00df"+
		"\60\3\2\2\2\u00e0\u00e1\7h\2\2\u00e1\u00e2\7n\2\2\u00e2\u00e3\7q\2\2\u00e3"+
		"\u00e4\7c\2\2\u00e4\u00e5\7v\2\2\u00e5\62\3\2\2\2\u00e6\u00e7\7u\2\2\u00e7"+
		"\u00e8\7v\2\2\u00e8\u00e9\7t\2\2\u00e9\64\3\2\2\2\u00ea\u00eb\7h\2\2\u00eb"+
		"\u00ec\7p\2\2\u00ec\66\3\2\2\2\u00ed\u00ee\7q\2\2\u00ee\u00ef\7d\2\2\u00ef"+
		"\u00f0\7l\2\2\u00f08\3\2\2\2\u00f1\u00f2\7c\2\2\u00f2\u00f3\7t\2\2\u00f3"+
		"\u00f4\7t\2\2\u00f4:\3\2\2\2\u00f5\u00f6\7v\2\2\u00f6\u00f7\7{\2\2\u00f7"+
		"\u00f8\7r\2\2\u00f8\u00f9\7g\2\2\u00f9\u00fa\7q\2\2\u00fa\u00fb\7h\2\2"+
		"\u00fb<\3\2\2\2\u00fc\u00fd\7?\2\2\u00fd>\3\2\2\2\u00fe\u00ff\7?\2\2\u00ff"+
		"\u0108\7?\2\2\u0100\u0101\7#\2\2\u0101\u0108\7?\2\2\u0102\u0108\t\3\2"+
		"\2\u0103\u0104\7>\2\2\u0104\u0108\7?\2\2\u0105\u0106\7@\2\2\u0106\u0108"+
		"\7?\2\2\u0107\u00fe\3\2\2\2\u0107\u0100\3\2\2\2\u0107\u0102\3\2\2\2\u0107"+
		"\u0103\3\2\2\2\u0107\u0105\3\2\2\2\u0108@\3\2\2\2\u0109\u010a\7(\2\2\u010a"+
		"\u010e\7(\2\2\u010b\u010c\7~\2\2\u010c\u010e\7~\2\2\u010d\u0109\3\2\2"+
		"\2\u010d\u010b\3\2\2\2\u010eB\3\2\2\2\u010f\u0110\7#\2\2\u0110D\3\2\2"+
		"\2\u0111\u0112\t\4\2\2\u0112F\3\2\2\2\u0113\u0114\7g\2\2\u0114\u0115\7"+
		"z\2\2\u0115\u0116\7v\2\2\u0116\u0117\7g\2\2\u0117\u0118\7p\2\2\u0118\u0119"+
		"\7f\2\2\u0119\u011a\7u\2\2\u011aH\3\2\2\2\u011b\u011c\7k\2\2\u011c\u011d"+
		"\7o\2\2\u011d\u011e\7r\2\2\u011e\u011f\7n\2\2\u011f\u0120\7g\2\2\u0120"+
		"\u0121\7o\2\2\u0121\u0122\7g\2\2\u0122\u0123\7p\2\2\u0123\u0124\7v\2\2"+
		"\u0124\u0125\7u\2\2\u0125J\3\2\2\2\u0126\u0127\7k\2\2\u0127\u0128\7p\2"+
		"\2\u0128\u0129\7v\2\2\u0129\u012a\7g\2\2\u012a\u012b\7t\2\2\u012b\u012c"+
		"\7h\2\2\u012c\u012d\7c\2\2\u012d\u012e\7e\2\2\u012e\u012f\7g\2\2\u012f"+
		"L\3\2\2\2\u0130\u0131\7v\2\2\u0131\u0132\7j\2\2\u0132\u0133\7k\2\2\u0133"+
		"\u0134\7u\2\2\u0134N\3\2\2\2\u0135\u0136\t\5\2\2\u0136P\3\2\2\2\u0137"+
		"\u0138\7v\2\2\u0138\u0139\7t\2\2\u0139\u013a\7w\2\2\u013a\u013b\7g\2\2"+
		"\u013bR\3\2\2\2\u013c\u013d\7h\2\2\u013d\u013e\7c\2\2\u013e\u013f\7n\2"+
		"\2\u013f\u0140\7u\2\2\u0140\u0141\7g\2\2\u0141T\3\2\2\2\u0142\u0144\4"+
		"\62;\2\u0143\u0142\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0143\3\2\2\2\u0145"+
		"\u0146\3\2\2\2\u0146V\3\2\2\2\u0147\u0149\4\62;\2\u0148\u0147\3\2\2\2"+
		"\u0149\u014a\3\2\2\2\u014a\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u0152"+
		"\3\2\2\2\u014c\u014e\7\60\2\2\u014d\u014f\4\62;\2\u014e\u014d\3\2\2\2"+
		"\u014f\u0150\3\2\2\2\u0150\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0153"+
		"\3\2\2\2\u0152\u014c\3\2\2\2\u0152\u0153\3\2\2\2\u0153X\3\2\2\2\u0154"+
		"\u0156\7$\2\2\u0155\u0157\13\2\2\2\u0156\u0155\3\2\2\2\u0157\u0158\3\2"+
		"\2\2\u0158\u0159\3\2\2\2\u0158\u0156\3\2\2\2\u0159\u015a\3\2\2\2\u015a"+
		"\u015b\7$\2\2\u015bZ\3\2\2\2\u015c\u015d\7p\2\2\u015d\u015e\7w\2\2\u015e"+
		"\u015f\7n\2\2\u015f\u0160\7n\2\2\u0160\\\3\2\2\2\u0161\u0165\t\6\2\2\u0162"+
		"\u0164\t\7\2\2\u0163\u0162\3\2\2\2\u0164\u0167\3\2\2\2\u0165\u0163\3\2"+
		"\2\2\u0165\u0166\3\2\2\2\u0166^\3\2\2\2\u0167\u0165\3\2\2\2\u0168\u0169"+
		"\t\b\2\2\u0169\u016a\3\2\2\2\u016a\u016b\b\60\2\2\u016b`\3\2\2\2\17\2"+
		"\u008b\u008f\u0098\u009d\u0107\u010d\u0145\u014a\u0150\u0152\u0158\u0165"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}