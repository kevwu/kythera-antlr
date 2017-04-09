// Generated from /home/dejawu/kythera/Kythera.g4 by ANTLR 4.7

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
		T__9=10, T__10=11, COMMENT=12, LET=13, NAME=14, IF=15, ELSE=16, FOR=17, 
		WHILE=18, RETURN=19, BREAK=20, CONTINUE=21, NEW=22, BOOL=23, INT=24, FLOAT=25, 
		STR=26, FN=27, OBJ=28, ASSIGNMENT_OPERATOR=29, BOOLEAN_OPERATOR=30, NOT_OPERATOR=31, 
		ARITH_OPERATOR=32, EXTENDS=33, IMPLEMENTS=34, INTERFACE=35, THIS=36, PUNCT=37, 
		TRUE=38, FALSE=39, IntLiteral=40, FloatLiteral=41, StrLiteral=42, NULL=43, 
		Identifier=44, WHITESPACE=45;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "COMMENT", "LET", "NAME", "IF", "ELSE", "FOR", "WHILE", 
		"RETURN", "BREAK", "CONTINUE", "NEW", "BOOL", "INT", "FLOAT", "STR", "FN", 
		"OBJ", "ASSIGNMENT_OPERATOR", "BOOLEAN_OPERATOR", "NOT_OPERATOR", "ARITH_OPERATOR", 
		"EXTENDS", "IMPLEMENTS", "INTERFACE", "THIS", "PUNCT", "TRUE", "FALSE", 
		"IntLiteral", "FloatLiteral", "StrLiteral", "NULL", "Identifier", "WHITESPACE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "'('", "')'", "'['", "','", "']'", "'import'", "'include'", 
		"'export'", "';'", null, "'let'", "'name'", "'if'", "'else'", "'for'", 
		"'while'", "'return'", "'break'", "'continue'", "'new'", "'bool'", "'int'", 
		"'float'", "'str'", "'fn'", "'obj'", "'='", null, "'!'", null, "'extends'", 
		"'implements'", "'interface'", "'this'", null, "'true'", "'false'", null, 
		null, null, "'null'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"COMMENT", "LET", "NAME", "IF", "ELSE", "FOR", "WHILE", "RETURN", "BREAK", 
		"CONTINUE", "NEW", "BOOL", "INT", "FLOAT", "STR", "FN", "OBJ", "ASSIGNMENT_OPERATOR", 
		"BOOLEAN_OPERATOR", "NOT_OPERATOR", "ARITH_OPERATOR", "EXTENDS", "IMPLEMENTS", 
		"INTERFACE", "THIS", "PUNCT", "TRUE", "FALSE", "IntLiteral", "FloatLiteral", 
		"StrLiteral", "NULL", "Identifier", "WHITESPACE"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2/\u0156\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3"+
		"\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\7\r\u0088\n\r\f\r"+
		"\16\r\u008b\13\r\3\r\5\r\u008e\n\r\3\r\3\r\3\r\3\r\3\r\7\r\u0095\n\r\f"+
		"\r\16\r\u0098\13\r\3\r\3\r\5\r\u009c\n\r\3\r\3\r\3\16\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3"+
		"\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3"+
		"\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3"+
		"\34\3\35\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5"+
		"\37\u00f8\n\37\3 \3 \3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3"+
		"&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3)\6)\u012e\n)\r)\16)\u012f"+
		"\3*\6*\u0133\n*\r*\16*\u0134\3*\3*\6*\u0139\n*\r*\16*\u013a\5*\u013d\n"+
		"*\3+\3+\6+\u0141\n+\r+\16+\u0142\3+\3+\3,\3,\3,\3,\3,\3-\3-\7-\u014e\n"+
		"-\f-\16-\u0151\13-\3.\3.\3.\3.\4\u0096\u0142\2/\3\3\5\4\7\5\t\6\13\7\r"+
		"\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O"+
		")Q*S+U,W-Y.[/\3\2\t\4\2\f\f\17\17\4\2>>@@\6\2\'\',-//\61\61\n\2*+\60\60"+
		">>@@]]__}}\177\177\4\2C\\c|\7\2//\62;C\\aac|\5\2\13\f\17\17\"\"\2\u0162"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\3]\3\2\2\2\5_\3\2\2\2\7a\3"+
		"\2\2\2\tc\3\2\2\2\13e\3\2\2\2\rg\3\2\2\2\17i\3\2\2\2\21k\3\2\2\2\23r\3"+
		"\2\2\2\25z\3\2\2\2\27\u0081\3\2\2\2\31\u009b\3\2\2\2\33\u009f\3\2\2\2"+
		"\35\u00a3\3\2\2\2\37\u00a8\3\2\2\2!\u00ab\3\2\2\2#\u00b0\3\2\2\2%\u00b4"+
		"\3\2\2\2\'\u00ba\3\2\2\2)\u00c1\3\2\2\2+\u00c7\3\2\2\2-\u00d0\3\2\2\2"+
		"/\u00d4\3\2\2\2\61\u00d9\3\2\2\2\63\u00dd\3\2\2\2\65\u00e3\3\2\2\2\67"+
		"\u00e7\3\2\2\29\u00ea\3\2\2\2;\u00ee\3\2\2\2=\u00f7\3\2\2\2?\u00f9\3\2"+
		"\2\2A\u00fb\3\2\2\2C\u00fd\3\2\2\2E\u0105\3\2\2\2G\u0110\3\2\2\2I\u011a"+
		"\3\2\2\2K\u011f\3\2\2\2M\u0121\3\2\2\2O\u0126\3\2\2\2Q\u012d\3\2\2\2S"+
		"\u0132\3\2\2\2U\u013e\3\2\2\2W\u0146\3\2\2\2Y\u014b\3\2\2\2[\u0152\3\2"+
		"\2\2]^\7}\2\2^\4\3\2\2\2_`\7\177\2\2`\6\3\2\2\2ab\7*\2\2b\b\3\2\2\2cd"+
		"\7+\2\2d\n\3\2\2\2ef\7]\2\2f\f\3\2\2\2gh\7.\2\2h\16\3\2\2\2ij\7_\2\2j"+
		"\20\3\2\2\2kl\7k\2\2lm\7o\2\2mn\7r\2\2no\7q\2\2op\7t\2\2pq\7v\2\2q\22"+
		"\3\2\2\2rs\7k\2\2st\7p\2\2tu\7e\2\2uv\7n\2\2vw\7w\2\2wx\7f\2\2xy\7g\2"+
		"\2y\24\3\2\2\2z{\7g\2\2{|\7z\2\2|}\7r\2\2}~\7q\2\2~\177\7t\2\2\177\u0080"+
		"\7v\2\2\u0080\26\3\2\2\2\u0081\u0082\7=\2\2\u0082\30\3\2\2\2\u0083\u0084"+
		"\7\61\2\2\u0084\u0085\7\61\2\2\u0085\u0089\3\2\2\2\u0086\u0088\n\2\2\2"+
		"\u0087\u0086\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a"+
		"\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008c\u008e\7\17\2\2"+
		"\u008d\u008c\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u009c"+
		"\7\f\2\2\u0090\u0091\7\61\2\2\u0091\u0092\7,\2\2\u0092\u0096\3\2\2\2\u0093"+
		"\u0095\13\2\2\2\u0094\u0093\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0097\3"+
		"\2\2\2\u0096\u0094\3\2\2\2\u0097\u0099\3\2\2\2\u0098\u0096\3\2\2\2\u0099"+
		"\u009a\7,\2\2\u009a\u009c\7\61\2\2\u009b\u0083\3\2\2\2\u009b\u0090\3\2"+
		"\2\2\u009c\u009d\3\2\2\2\u009d\u009e\b\r\2\2\u009e\32\3\2\2\2\u009f\u00a0"+
		"\7n\2\2\u00a0\u00a1\7g\2\2\u00a1\u00a2\7v\2\2\u00a2\34\3\2\2\2\u00a3\u00a4"+
		"\7p\2\2\u00a4\u00a5\7c\2\2\u00a5\u00a6\7o\2\2\u00a6\u00a7\7g\2\2\u00a7"+
		"\36\3\2\2\2\u00a8\u00a9\7k\2\2\u00a9\u00aa\7h\2\2\u00aa \3\2\2\2\u00ab"+
		"\u00ac\7g\2\2\u00ac\u00ad\7n\2\2\u00ad\u00ae\7u\2\2\u00ae\u00af\7g\2\2"+
		"\u00af\"\3\2\2\2\u00b0\u00b1\7h\2\2\u00b1\u00b2\7q\2\2\u00b2\u00b3\7t"+
		"\2\2\u00b3$\3\2\2\2\u00b4\u00b5\7y\2\2\u00b5\u00b6\7j\2\2\u00b6\u00b7"+
		"\7k\2\2\u00b7\u00b8\7n\2\2\u00b8\u00b9\7g\2\2\u00b9&\3\2\2\2\u00ba\u00bb"+
		"\7t\2\2\u00bb\u00bc\7g\2\2\u00bc\u00bd\7v\2\2\u00bd\u00be\7w\2\2\u00be"+
		"\u00bf\7t\2\2\u00bf\u00c0\7p\2\2\u00c0(\3\2\2\2\u00c1\u00c2\7d\2\2\u00c2"+
		"\u00c3\7t\2\2\u00c3\u00c4\7g\2\2\u00c4\u00c5\7c\2\2\u00c5\u00c6\7m\2\2"+
		"\u00c6*\3\2\2\2\u00c7\u00c8\7e\2\2\u00c8\u00c9\7q\2\2\u00c9\u00ca\7p\2"+
		"\2\u00ca\u00cb\7v\2\2\u00cb\u00cc\7k\2\2\u00cc\u00cd\7p\2\2\u00cd\u00ce"+
		"\7w\2\2\u00ce\u00cf\7g\2\2\u00cf,\3\2\2\2\u00d0\u00d1\7p\2\2\u00d1\u00d2"+
		"\7g\2\2\u00d2\u00d3\7y\2\2\u00d3.\3\2\2\2\u00d4\u00d5\7d\2\2\u00d5\u00d6"+
		"\7q\2\2\u00d6\u00d7\7q\2\2\u00d7\u00d8\7n\2\2\u00d8\60\3\2\2\2\u00d9\u00da"+
		"\7k\2\2\u00da\u00db\7p\2\2\u00db\u00dc\7v\2\2\u00dc\62\3\2\2\2\u00dd\u00de"+
		"\7h\2\2\u00de\u00df\7n\2\2\u00df\u00e0\7q\2\2\u00e0\u00e1\7c\2\2\u00e1"+
		"\u00e2\7v\2\2\u00e2\64\3\2\2\2\u00e3\u00e4\7u\2\2\u00e4\u00e5\7v\2\2\u00e5"+
		"\u00e6\7t\2\2\u00e6\66\3\2\2\2\u00e7\u00e8\7h\2\2\u00e8\u00e9\7p\2\2\u00e9"+
		"8\3\2\2\2\u00ea\u00eb\7q\2\2\u00eb\u00ec\7d\2\2\u00ec\u00ed\7l\2\2\u00ed"+
		":\3\2\2\2\u00ee\u00ef\7?\2\2\u00ef<\3\2\2\2\u00f0\u00f1\7?\2\2\u00f1\u00f8"+
		"\7?\2\2\u00f2\u00f8\t\3\2\2\u00f3\u00f4\7>\2\2\u00f4\u00f8\7?\2\2\u00f5"+
		"\u00f6\7@\2\2\u00f6\u00f8\7?\2\2\u00f7\u00f0\3\2\2\2\u00f7\u00f2\3\2\2"+
		"\2\u00f7\u00f3\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f8>\3\2\2\2\u00f9\u00fa"+
		"\7#\2\2\u00fa@\3\2\2\2\u00fb\u00fc\t\4\2\2\u00fcB\3\2\2\2\u00fd\u00fe"+
		"\7g\2\2\u00fe\u00ff\7z\2\2\u00ff\u0100\7v\2\2\u0100\u0101\7g\2\2\u0101"+
		"\u0102\7p\2\2\u0102\u0103\7f\2\2\u0103\u0104\7u\2\2\u0104D\3\2\2\2\u0105"+
		"\u0106\7k\2\2\u0106\u0107\7o\2\2\u0107\u0108\7r\2\2\u0108\u0109\7n\2\2"+
		"\u0109\u010a\7g\2\2\u010a\u010b\7o\2\2\u010b\u010c\7g\2\2\u010c\u010d"+
		"\7p\2\2\u010d\u010e\7v\2\2\u010e\u010f\7u\2\2\u010fF\3\2\2\2\u0110\u0111"+
		"\7k\2\2\u0111\u0112\7p\2\2\u0112\u0113\7v\2\2\u0113\u0114\7g\2\2\u0114"+
		"\u0115\7t\2\2\u0115\u0116\7h\2\2\u0116\u0117\7c\2\2\u0117\u0118\7e\2\2"+
		"\u0118\u0119\7g\2\2\u0119H\3\2\2\2\u011a\u011b\7v\2\2\u011b\u011c\7j\2"+
		"\2\u011c\u011d\7k\2\2\u011d\u011e\7u\2\2\u011eJ\3\2\2\2\u011f\u0120\t"+
		"\5\2\2\u0120L\3\2\2\2\u0121\u0122\7v\2\2\u0122\u0123\7t\2\2\u0123\u0124"+
		"\7w\2\2\u0124\u0125\7g\2\2\u0125N\3\2\2\2\u0126\u0127\7h\2\2\u0127\u0128"+
		"\7c\2\2\u0128\u0129\7n\2\2\u0129\u012a\7u\2\2\u012a\u012b\7g\2\2\u012b"+
		"P\3\2\2\2\u012c\u012e\4\62;\2\u012d\u012c\3\2\2\2\u012e\u012f\3\2\2\2"+
		"\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130R\3\2\2\2\u0131\u0133\4"+
		"\62;\2\u0132\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0132\3\2\2\2\u0134"+
		"\u0135\3\2\2\2\u0135\u013c\3\2\2\2\u0136\u0138\7\60\2\2\u0137\u0139\4"+
		"\62;\2\u0138\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u0138\3\2\2\2\u013a"+
		"\u013b\3\2\2\2\u013b\u013d\3\2\2\2\u013c\u0136\3\2\2\2\u013c\u013d\3\2"+
		"\2\2\u013dT\3\2\2\2\u013e\u0140\7$\2\2\u013f\u0141\13\2\2\2\u0140\u013f"+
		"\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0143\3\2\2\2\u0142\u0140\3\2\2\2\u0143"+
		"\u0144\3\2\2\2\u0144\u0145\7$\2\2\u0145V\3\2\2\2\u0146\u0147\7p\2\2\u0147"+
		"\u0148\7w\2\2\u0148\u0149\7n\2\2\u0149\u014a\7n\2\2\u014aX\3\2\2\2\u014b"+
		"\u014f\t\6\2\2\u014c\u014e\t\7\2\2\u014d\u014c\3\2\2\2\u014e\u0151\3\2"+
		"\2\2\u014f\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150Z\3\2\2\2\u0151\u014f"+
		"\3\2\2\2\u0152\u0153\t\b\2\2\u0153\u0154\3\2\2\2\u0154\u0155\b.\2\2\u0155"+
		"\\\3\2\2\2\16\2\u0089\u008d\u0096\u009b\u00f7\u012f\u0134\u013a\u013c"+
		"\u0142\u014f\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}