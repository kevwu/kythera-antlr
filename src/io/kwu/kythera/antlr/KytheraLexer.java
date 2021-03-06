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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, COMMENT=7, LET=8, NAME=9, 
		IF=10, ELSE=11, WHILE=12, EACH=13, RETURN=14, BREAK=15, CONTINUE=16, NEW=17, 
		AS=18, TYPEOF=19, BOOL=20, INT=21, FLOAT=22, STR=23, FN=24, OBJ=25, ARR=26, 
		IMPORT=27, EXPORT=28, INCLUDE=29, ASSIGNMENT_OPERATOR=30, BOOLEAN_COMPARISON=31, 
		BOOLEAN_OPERATOR=32, NOT_OPERATOR=33, ARITH_OPERATOR=34, PUNCT=35, THIS=36, 
		DOT=37, IntLiteral=38, FloatLiteral=39, StrLiteral=40, TRUE=41, FALSE=42, 
		NULL=43, Identifier=44, WHITESPACE=45;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "COMMENT", "LET", "NAME", 
		"IF", "ELSE", "WHILE", "EACH", "RETURN", "BREAK", "CONTINUE", "NEW", "AS", 
		"TYPEOF", "BOOL", "INT", "FLOAT", "STR", "FN", "OBJ", "ARR", "IMPORT", 
		"EXPORT", "INCLUDE", "ASSIGNMENT_OPERATOR", "BOOLEAN_COMPARISON", "BOOLEAN_OPERATOR", 
		"NOT_OPERATOR", "ARITH_OPERATOR", "PUNCT", "THIS", "DOT", "IntLiteral", 
		"FloatLiteral", "StrLiteral", "TRUE", "FALSE", "NULL", "Identifier", "WHITESPACE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "'('", "','", "')'", "':'", null, "'let'", "'name'", 
		"'if'", "'else'", "'while'", "'each'", "'return'", "'break'", "'continue'", 
		"'new'", "'as'", "'typeof'", "'bool'", "'int'", "'float'", "'str'", "'fn'", 
		"'obj'", "'arr'", "'import'", "'export'", "'include'", "'='", null, null, 
		"'!'", null, null, "'this'", "'.'", null, null, null, "'true'", "'false'", 
		"'null'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, "COMMENT", "LET", "NAME", "IF", 
		"ELSE", "WHILE", "EACH", "RETURN", "BREAK", "CONTINUE", "NEW", "AS", "TYPEOF", 
		"BOOL", "INT", "FLOAT", "STR", "FN", "OBJ", "ARR", "IMPORT", "EXPORT", 
		"INCLUDE", "ASSIGNMENT_OPERATOR", "BOOLEAN_COMPARISON", "BOOLEAN_OPERATOR", 
		"NOT_OPERATOR", "ARITH_OPERATOR", "PUNCT", "THIS", "DOT", "IntLiteral", 
		"FloatLiteral", "StrLiteral", "TRUE", "FALSE", "NULL", "Identifier", "WHITESPACE"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2/\u014e\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\7\bn\n\b\f\b\16\bq\13\b\3\b\5\bt\n\b\3\b\3\b\3\b\3\b\3\b\7"+
		"\b{\n\b\f\b\16\b~\13\b\3\b\3\b\5\b\u0082\n\b\3\b\3\b\3\t\3\t\3\t\3\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3"+
		"\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3"+
		"\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3 \3 "+
		"\3 \3 \3 \3 \3 \3 \3 \5 \u0105\n \3!\3!\3!\3!\5!\u010b\n!\3\"\3\"\3#\3"+
		"#\3$\3$\3%\3%\3%\3%\3%\3&\3&\3\'\6\'\u011b\n\'\r\'\16\'\u011c\3(\6(\u0120"+
		"\n(\r(\16(\u0121\3(\3(\6(\u0126\n(\r(\16(\u0127\5(\u012a\n(\3)\3)\6)\u012e"+
		"\n)\r)\16)\u012f\3)\3)\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3"+
		",\3-\3-\7-\u0146\n-\f-\16-\u0149\13-\3.\3.\3.\3.\4|\u012f\2/\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C"+
		"#E$G%I&K\'M(O)Q*S+U,W-Y.[/\3\2\t\4\2\f\f\17\17\4\2>>@@\6\2\'\',-//\61"+
		"\61\t\2*+>>@@]]__}}\177\177\4\2C\\c|\6\2\62;C\\aac|\5\2\13\f\17\17\"\""+
		"\2\u015c\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S"+
		"\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\3]\3\2\2\2\5_\3\2"+
		"\2\2\7a\3\2\2\2\tc\3\2\2\2\13e\3\2\2\2\rg\3\2\2\2\17\u0081\3\2\2\2\21"+
		"\u0085\3\2\2\2\23\u0089\3\2\2\2\25\u008e\3\2\2\2\27\u0091\3\2\2\2\31\u0096"+
		"\3\2\2\2\33\u009c\3\2\2\2\35\u00a1\3\2\2\2\37\u00a8\3\2\2\2!\u00ae\3\2"+
		"\2\2#\u00b7\3\2\2\2%\u00bb\3\2\2\2\'\u00be\3\2\2\2)\u00c5\3\2\2\2+\u00ca"+
		"\3\2\2\2-\u00ce\3\2\2\2/\u00d4\3\2\2\2\61\u00d8\3\2\2\2\63\u00db\3\2\2"+
		"\2\65\u00df\3\2\2\2\67\u00e3\3\2\2\29\u00ea\3\2\2\2;\u00f1\3\2\2\2=\u00f9"+
		"\3\2\2\2?\u0104\3\2\2\2A\u010a\3\2\2\2C\u010c\3\2\2\2E\u010e\3\2\2\2G"+
		"\u0110\3\2\2\2I\u0112\3\2\2\2K\u0117\3\2\2\2M\u011a\3\2\2\2O\u011f\3\2"+
		"\2\2Q\u012b\3\2\2\2S\u0133\3\2\2\2U\u0138\3\2\2\2W\u013e\3\2\2\2Y\u0143"+
		"\3\2\2\2[\u014a\3\2\2\2]^\7}\2\2^\4\3\2\2\2_`\7\177\2\2`\6\3\2\2\2ab\7"+
		"*\2\2b\b\3\2\2\2cd\7.\2\2d\n\3\2\2\2ef\7+\2\2f\f\3\2\2\2gh\7<\2\2h\16"+
		"\3\2\2\2ij\7\61\2\2jk\7\61\2\2ko\3\2\2\2ln\n\2\2\2ml\3\2\2\2nq\3\2\2\2"+
		"om\3\2\2\2op\3\2\2\2ps\3\2\2\2qo\3\2\2\2rt\7\17\2\2sr\3\2\2\2st\3\2\2"+
		"\2tu\3\2\2\2u\u0082\7\f\2\2vw\7\61\2\2wx\7,\2\2x|\3\2\2\2y{\13\2\2\2z"+
		"y\3\2\2\2{~\3\2\2\2|}\3\2\2\2|z\3\2\2\2}\177\3\2\2\2~|\3\2\2\2\177\u0080"+
		"\7,\2\2\u0080\u0082\7\61\2\2\u0081i\3\2\2\2\u0081v\3\2\2\2\u0082\u0083"+
		"\3\2\2\2\u0083\u0084\b\b\2\2\u0084\20\3\2\2\2\u0085\u0086\7n\2\2\u0086"+
		"\u0087\7g\2\2\u0087\u0088\7v\2\2\u0088\22\3\2\2\2\u0089\u008a\7p\2\2\u008a"+
		"\u008b\7c\2\2\u008b\u008c\7o\2\2\u008c\u008d\7g\2\2\u008d\24\3\2\2\2\u008e"+
		"\u008f\7k\2\2\u008f\u0090\7h\2\2\u0090\26\3\2\2\2\u0091\u0092\7g\2\2\u0092"+
		"\u0093\7n\2\2\u0093\u0094\7u\2\2\u0094\u0095\7g\2\2\u0095\30\3\2\2\2\u0096"+
		"\u0097\7y\2\2\u0097\u0098\7j\2\2\u0098\u0099\7k\2\2\u0099\u009a\7n\2\2"+
		"\u009a\u009b\7g\2\2\u009b\32\3\2\2\2\u009c\u009d\7g\2\2\u009d\u009e\7"+
		"c\2\2\u009e\u009f\7e\2\2\u009f\u00a0\7j\2\2\u00a0\34\3\2\2\2\u00a1\u00a2"+
		"\7t\2\2\u00a2\u00a3\7g\2\2\u00a3\u00a4\7v\2\2\u00a4\u00a5\7w\2\2\u00a5"+
		"\u00a6\7t\2\2\u00a6\u00a7\7p\2\2\u00a7\36\3\2\2\2\u00a8\u00a9\7d\2\2\u00a9"+
		"\u00aa\7t\2\2\u00aa\u00ab\7g\2\2\u00ab\u00ac\7c\2\2\u00ac\u00ad\7m\2\2"+
		"\u00ad \3\2\2\2\u00ae\u00af\7e\2\2\u00af\u00b0\7q\2\2\u00b0\u00b1\7p\2"+
		"\2\u00b1\u00b2\7v\2\2\u00b2\u00b3\7k\2\2\u00b3\u00b4\7p\2\2\u00b4\u00b5"+
		"\7w\2\2\u00b5\u00b6\7g\2\2\u00b6\"\3\2\2\2\u00b7\u00b8\7p\2\2\u00b8\u00b9"+
		"\7g\2\2\u00b9\u00ba\7y\2\2\u00ba$\3\2\2\2\u00bb\u00bc\7c\2\2\u00bc\u00bd"+
		"\7u\2\2\u00bd&\3\2\2\2\u00be\u00bf\7v\2\2\u00bf\u00c0\7{\2\2\u00c0\u00c1"+
		"\7r\2\2\u00c1\u00c2\7g\2\2\u00c2\u00c3\7q\2\2\u00c3\u00c4\7h\2\2\u00c4"+
		"(\3\2\2\2\u00c5\u00c6\7d\2\2\u00c6\u00c7\7q\2\2\u00c7\u00c8\7q\2\2\u00c8"+
		"\u00c9\7n\2\2\u00c9*\3\2\2\2\u00ca\u00cb\7k\2\2\u00cb\u00cc\7p\2\2\u00cc"+
		"\u00cd\7v\2\2\u00cd,\3\2\2\2\u00ce\u00cf\7h\2\2\u00cf\u00d0\7n\2\2\u00d0"+
		"\u00d1\7q\2\2\u00d1\u00d2\7c\2\2\u00d2\u00d3\7v\2\2\u00d3.\3\2\2\2\u00d4"+
		"\u00d5\7u\2\2\u00d5\u00d6\7v\2\2\u00d6\u00d7\7t\2\2\u00d7\60\3\2\2\2\u00d8"+
		"\u00d9\7h\2\2\u00d9\u00da\7p\2\2\u00da\62\3\2\2\2\u00db\u00dc\7q\2\2\u00dc"+
		"\u00dd\7d\2\2\u00dd\u00de\7l\2\2\u00de\64\3\2\2\2\u00df\u00e0\7c\2\2\u00e0"+
		"\u00e1\7t\2\2\u00e1\u00e2\7t\2\2\u00e2\66\3\2\2\2\u00e3\u00e4\7k\2\2\u00e4"+
		"\u00e5\7o\2\2\u00e5\u00e6\7r\2\2\u00e6\u00e7\7q\2\2\u00e7\u00e8\7t\2\2"+
		"\u00e8\u00e9\7v\2\2\u00e98\3\2\2\2\u00ea\u00eb\7g\2\2\u00eb\u00ec\7z\2"+
		"\2\u00ec\u00ed\7r\2\2\u00ed\u00ee\7q\2\2\u00ee\u00ef\7t\2\2\u00ef\u00f0"+
		"\7v\2\2\u00f0:\3\2\2\2\u00f1\u00f2\7k\2\2\u00f2\u00f3\7p\2\2\u00f3\u00f4"+
		"\7e\2\2\u00f4\u00f5\7n\2\2\u00f5\u00f6\7w\2\2\u00f6\u00f7\7f\2\2\u00f7"+
		"\u00f8\7g\2\2\u00f8<\3\2\2\2\u00f9\u00fa\7?\2\2\u00fa>\3\2\2\2\u00fb\u00fc"+
		"\7?\2\2\u00fc\u0105\7?\2\2\u00fd\u00fe\7#\2\2\u00fe\u0105\7?\2\2\u00ff"+
		"\u0105\t\3\2\2\u0100\u0101\7>\2\2\u0101\u0105\7?\2\2\u0102\u0103\7@\2"+
		"\2\u0103\u0105\7?\2\2\u0104\u00fb\3\2\2\2\u0104\u00fd\3\2\2\2\u0104\u00ff"+
		"\3\2\2\2\u0104\u0100\3\2\2\2\u0104\u0102\3\2\2\2\u0105@\3\2\2\2\u0106"+
		"\u0107\7(\2\2\u0107\u010b\7(\2\2\u0108\u0109\7~\2\2\u0109\u010b\7~\2\2"+
		"\u010a\u0106\3\2\2\2\u010a\u0108\3\2\2\2\u010bB\3\2\2\2\u010c\u010d\7"+
		"#\2\2\u010dD\3\2\2\2\u010e\u010f\t\4\2\2\u010fF\3\2\2\2\u0110\u0111\t"+
		"\5\2\2\u0111H\3\2\2\2\u0112\u0113\7v\2\2\u0113\u0114\7j\2\2\u0114\u0115"+
		"\7k\2\2\u0115\u0116\7u\2\2\u0116J\3\2\2\2\u0117\u0118\7\60\2\2\u0118L"+
		"\3\2\2\2\u0119\u011b\4\62;\2\u011a\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c"+
		"\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011dN\3\2\2\2\u011e\u0120\4\62;\2"+
		"\u011f\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0122"+
		"\3\2\2\2\u0122\u0129\3\2\2\2\u0123\u0125\7\60\2\2\u0124\u0126\4\62;\2"+
		"\u0125\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0128"+
		"\3\2\2\2\u0128\u012a\3\2\2\2\u0129\u0123\3\2\2\2\u0129\u012a\3\2\2\2\u012a"+
		"P\3\2\2\2\u012b\u012d\7$\2\2\u012c\u012e\13\2\2\2\u012d\u012c\3\2\2\2"+
		"\u012e\u012f\3\2\2\2\u012f\u0130\3\2\2\2\u012f\u012d\3\2\2\2\u0130\u0131"+
		"\3\2\2\2\u0131\u0132\7$\2\2\u0132R\3\2\2\2\u0133\u0134\7v\2\2\u0134\u0135"+
		"\7t\2\2\u0135\u0136\7w\2\2\u0136\u0137\7g\2\2\u0137T\3\2\2\2\u0138\u0139"+
		"\7h\2\2\u0139\u013a\7c\2\2\u013a\u013b\7n\2\2\u013b\u013c\7u\2\2\u013c"+
		"\u013d\7g\2\2\u013dV\3\2\2\2\u013e\u013f\7p\2\2\u013f\u0140\7w\2\2\u0140"+
		"\u0141\7n\2\2\u0141\u0142\7n\2\2\u0142X\3\2\2\2\u0143\u0147\t\6\2\2\u0144"+
		"\u0146\t\7\2\2\u0145\u0144\3\2\2\2\u0146\u0149\3\2\2\2\u0147\u0145\3\2"+
		"\2\2\u0147\u0148\3\2\2\2\u0148Z\3\2\2\2\u0149\u0147\3\2\2\2\u014a\u014b"+
		"\t\b\2\2\u014b\u014c\3\2\2\2\u014c\u014d\b.\2\2\u014d\\\3\2\2\2\17\2o"+
		"s|\u0081\u0104\u010a\u011c\u0121\u0127\u0129\u012f\u0147\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}