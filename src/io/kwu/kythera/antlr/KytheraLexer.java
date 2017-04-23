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
		COMMENT=10, LET=11, NAME=12, IF=13, ELSE=14, WHILE=15, EACH=16, RETURN=17, 
		BREAK=18, CONTINUE=19, NEW=20, BOOL=21, INT=22, FLOAT=23, STR=24, FN=25, 
		OBJ=26, ARR=27, ASSIGNMENT_OPERATOR=28, BOOLEAN_COMPARISON=29, BOOLEAN_OPERATOR=30, 
		NOT_OPERATOR=31, ARITH_OPERATOR=32, EXTENDS=33, IMPLEMENTS=34, INTERFACE=35, 
		THIS=36, PUNCT=37, TRUE=38, FALSE=39, IntLiteral=40, FloatLiteral=41, 
		StrLiteral=42, NULL=43, Identifier=44, WHITESPACE=45;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"COMMENT", "LET", "NAME", "IF", "ELSE", "WHILE", "EACH", "RETURN", "BREAK", 
		"CONTINUE", "NEW", "BOOL", "INT", "FLOAT", "STR", "FN", "OBJ", "ARR", 
		"ASSIGNMENT_OPERATOR", "BOOLEAN_COMPARISON", "BOOLEAN_OPERATOR", "NOT_OPERATOR", 
		"ARITH_OPERATOR", "EXTENDS", "IMPLEMENTS", "INTERFACE", "THIS", "PUNCT", 
		"TRUE", "FALSE", "IntLiteral", "FloatLiteral", "StrLiteral", "NULL", "Identifier", 
		"WHITESPACE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "'('", "','", "')'", "':'", "'import'", "'include'", 
		"'export'", null, "'let'", "'name'", "'if'", "'else'", "'while'", "'each'", 
		"'return'", "'break'", "'continue'", "'new'", "'bool'", "'int'", "'float'", 
		"'str'", "'fn'", "'obj'", "'arr'", "'='", null, null, "'!'", null, "'extends'", 
		"'implements'", "'interface'", "'this'", null, "'true'", "'false'", null, 
		null, null, "'null'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, "COMMENT", 
		"LET", "NAME", "IF", "ELSE", "WHILE", "EACH", "RETURN", "BREAK", "CONTINUE", 
		"NEW", "BOOL", "INT", "FLOAT", "STR", "FN", "OBJ", "ARR", "ASSIGNMENT_OPERATOR", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2/\u015f\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\13\3\13\3\13\3\13\7\13\u0084\n\13\f\13\16\13\u0087\13\13"+
		"\3\13\5\13\u008a\n\13\3\13\3\13\3\13\3\13\3\13\7\13\u0091\n\13\f\13\16"+
		"\13\u0094\13\13\3\13\3\13\5\13\u0098\n\13\3\13\3\13\3\f\3\f\3\f\3\f\3"+
		"\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3"+
		"\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3"+
		"\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\5\36\u00fb\n\36\3\37\3\37\3\37\3\37\5\37"+
		"\u0101\n\37\3 \3 \3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3&\3"+
		"&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3)\6)\u0137\n)\r)\16)\u0138\3"+
		"*\6*\u013c\n*\r*\16*\u013d\3*\3*\6*\u0142\n*\r*\16*\u0143\5*\u0146\n*"+
		"\3+\3+\6+\u014a\n+\r+\16+\u014b\3+\3+\3,\3,\3,\3,\3,\3-\3-\7-\u0157\n"+
		"-\f-\16-\u015a\13-\3.\3.\3.\3.\4\u0092\u014b\2/\3\3\5\4\7\5\t\6\13\7\r"+
		"\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O"+
		")Q*S+U,W-Y.[/\3\2\t\4\2\f\f\17\17\4\2>>@@\6\2\'\',-//\61\61\n\2*+\60\60"+
		">>@@]]__}}\177\177\4\2C\\c|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\2\u016d"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\3]\3\2\2\2\5_\3\2\2\2\7a\3"+
		"\2\2\2\tc\3\2\2\2\13e\3\2\2\2\rg\3\2\2\2\17i\3\2\2\2\21p\3\2\2\2\23x\3"+
		"\2\2\2\25\u0097\3\2\2\2\27\u009b\3\2\2\2\31\u009f\3\2\2\2\33\u00a4\3\2"+
		"\2\2\35\u00a7\3\2\2\2\37\u00ac\3\2\2\2!\u00b2\3\2\2\2#\u00b7\3\2\2\2%"+
		"\u00be\3\2\2\2\'\u00c4\3\2\2\2)\u00cd\3\2\2\2+\u00d1\3\2\2\2-\u00d6\3"+
		"\2\2\2/\u00da\3\2\2\2\61\u00e0\3\2\2\2\63\u00e4\3\2\2\2\65\u00e7\3\2\2"+
		"\2\67\u00eb\3\2\2\29\u00ef\3\2\2\2;\u00fa\3\2\2\2=\u0100\3\2\2\2?\u0102"+
		"\3\2\2\2A\u0104\3\2\2\2C\u0106\3\2\2\2E\u010e\3\2\2\2G\u0119\3\2\2\2I"+
		"\u0123\3\2\2\2K\u0128\3\2\2\2M\u012a\3\2\2\2O\u012f\3\2\2\2Q\u0136\3\2"+
		"\2\2S\u013b\3\2\2\2U\u0147\3\2\2\2W\u014f\3\2\2\2Y\u0154\3\2\2\2[\u015b"+
		"\3\2\2\2]^\7}\2\2^\4\3\2\2\2_`\7\177\2\2`\6\3\2\2\2ab\7*\2\2b\b\3\2\2"+
		"\2cd\7.\2\2d\n\3\2\2\2ef\7+\2\2f\f\3\2\2\2gh\7<\2\2h\16\3\2\2\2ij\7k\2"+
		"\2jk\7o\2\2kl\7r\2\2lm\7q\2\2mn\7t\2\2no\7v\2\2o\20\3\2\2\2pq\7k\2\2q"+
		"r\7p\2\2rs\7e\2\2st\7n\2\2tu\7w\2\2uv\7f\2\2vw\7g\2\2w\22\3\2\2\2xy\7"+
		"g\2\2yz\7z\2\2z{\7r\2\2{|\7q\2\2|}\7t\2\2}~\7v\2\2~\24\3\2\2\2\177\u0080"+
		"\7\61\2\2\u0080\u0081\7\61\2\2\u0081\u0085\3\2\2\2\u0082\u0084\n\2\2\2"+
		"\u0083\u0082\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086"+
		"\3\2\2\2\u0086\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u008a\7\17\2\2"+
		"\u0089\u0088\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u0098"+
		"\7\f\2\2\u008c\u008d\7\61\2\2\u008d\u008e\7,\2\2\u008e\u0092\3\2\2\2\u008f"+
		"\u0091\13\2\2\2\u0090\u008f\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0093\3"+
		"\2\2\2\u0092\u0090\3\2\2\2\u0093\u0095\3\2\2\2\u0094\u0092\3\2\2\2\u0095"+
		"\u0096\7,\2\2\u0096\u0098\7\61\2\2\u0097\177\3\2\2\2\u0097\u008c\3\2\2"+
		"\2\u0098\u0099\3\2\2\2\u0099\u009a\b\13\2\2\u009a\26\3\2\2\2\u009b\u009c"+
		"\7n\2\2\u009c\u009d\7g\2\2\u009d\u009e\7v\2\2\u009e\30\3\2\2\2\u009f\u00a0"+
		"\7p\2\2\u00a0\u00a1\7c\2\2\u00a1\u00a2\7o\2\2\u00a2\u00a3\7g\2\2\u00a3"+
		"\32\3\2\2\2\u00a4\u00a5\7k\2\2\u00a5\u00a6\7h\2\2\u00a6\34\3\2\2\2\u00a7"+
		"\u00a8\7g\2\2\u00a8\u00a9\7n\2\2\u00a9\u00aa\7u\2\2\u00aa\u00ab\7g\2\2"+
		"\u00ab\36\3\2\2\2\u00ac\u00ad\7y\2\2\u00ad\u00ae\7j\2\2\u00ae\u00af\7"+
		"k\2\2\u00af\u00b0\7n\2\2\u00b0\u00b1\7g\2\2\u00b1 \3\2\2\2\u00b2\u00b3"+
		"\7g\2\2\u00b3\u00b4\7c\2\2\u00b4\u00b5\7e\2\2\u00b5\u00b6\7j\2\2\u00b6"+
		"\"\3\2\2\2\u00b7\u00b8\7t\2\2\u00b8\u00b9\7g\2\2\u00b9\u00ba\7v\2\2\u00ba"+
		"\u00bb\7w\2\2\u00bb\u00bc\7t\2\2\u00bc\u00bd\7p\2\2\u00bd$\3\2\2\2\u00be"+
		"\u00bf\7d\2\2\u00bf\u00c0\7t\2\2\u00c0\u00c1\7g\2\2\u00c1\u00c2\7c\2\2"+
		"\u00c2\u00c3\7m\2\2\u00c3&\3\2\2\2\u00c4\u00c5\7e\2\2\u00c5\u00c6\7q\2"+
		"\2\u00c6\u00c7\7p\2\2\u00c7\u00c8\7v\2\2\u00c8\u00c9\7k\2\2\u00c9\u00ca"+
		"\7p\2\2\u00ca\u00cb\7w\2\2\u00cb\u00cc\7g\2\2\u00cc(\3\2\2\2\u00cd\u00ce"+
		"\7p\2\2\u00ce\u00cf\7g\2\2\u00cf\u00d0\7y\2\2\u00d0*\3\2\2\2\u00d1\u00d2"+
		"\7d\2\2\u00d2\u00d3\7q\2\2\u00d3\u00d4\7q\2\2\u00d4\u00d5\7n\2\2\u00d5"+
		",\3\2\2\2\u00d6\u00d7\7k\2\2\u00d7\u00d8\7p\2\2\u00d8\u00d9\7v\2\2\u00d9"+
		".\3\2\2\2\u00da\u00db\7h\2\2\u00db\u00dc\7n\2\2\u00dc\u00dd\7q\2\2\u00dd"+
		"\u00de\7c\2\2\u00de\u00df\7v\2\2\u00df\60\3\2\2\2\u00e0\u00e1\7u\2\2\u00e1"+
		"\u00e2\7v\2\2\u00e2\u00e3\7t\2\2\u00e3\62\3\2\2\2\u00e4\u00e5\7h\2\2\u00e5"+
		"\u00e6\7p\2\2\u00e6\64\3\2\2\2\u00e7\u00e8\7q\2\2\u00e8\u00e9\7d\2\2\u00e9"+
		"\u00ea\7l\2\2\u00ea\66\3\2\2\2\u00eb\u00ec\7c\2\2\u00ec\u00ed\7t\2\2\u00ed"+
		"\u00ee\7t\2\2\u00ee8\3\2\2\2\u00ef\u00f0\7?\2\2\u00f0:\3\2\2\2\u00f1\u00f2"+
		"\7?\2\2\u00f2\u00fb\7?\2\2\u00f3\u00f4\7#\2\2\u00f4\u00fb\7?\2\2\u00f5"+
		"\u00fb\t\3\2\2\u00f6\u00f7\7>\2\2\u00f7\u00fb\7?\2\2\u00f8\u00f9\7@\2"+
		"\2\u00f9\u00fb\7?\2\2\u00fa\u00f1\3\2\2\2\u00fa\u00f3\3\2\2\2\u00fa\u00f5"+
		"\3\2\2\2\u00fa\u00f6\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb<\3\2\2\2\u00fc"+
		"\u00fd\7(\2\2\u00fd\u0101\7(\2\2\u00fe\u00ff\7~\2\2\u00ff\u0101\7~\2\2"+
		"\u0100\u00fc\3\2\2\2\u0100\u00fe\3\2\2\2\u0101>\3\2\2\2\u0102\u0103\7"+
		"#\2\2\u0103@\3\2\2\2\u0104\u0105\t\4\2\2\u0105B\3\2\2\2\u0106\u0107\7"+
		"g\2\2\u0107\u0108\7z\2\2\u0108\u0109\7v\2\2\u0109\u010a\7g\2\2\u010a\u010b"+
		"\7p\2\2\u010b\u010c\7f\2\2\u010c\u010d\7u\2\2\u010dD\3\2\2\2\u010e\u010f"+
		"\7k\2\2\u010f\u0110\7o\2\2\u0110\u0111\7r\2\2\u0111\u0112\7n\2\2\u0112"+
		"\u0113\7g\2\2\u0113\u0114\7o\2\2\u0114\u0115\7g\2\2\u0115\u0116\7p\2\2"+
		"\u0116\u0117\7v\2\2\u0117\u0118\7u\2\2\u0118F\3\2\2\2\u0119\u011a\7k\2"+
		"\2\u011a\u011b\7p\2\2\u011b\u011c\7v\2\2\u011c\u011d\7g\2\2\u011d\u011e"+
		"\7t\2\2\u011e\u011f\7h\2\2\u011f\u0120\7c\2\2\u0120\u0121\7e\2\2\u0121"+
		"\u0122\7g\2\2\u0122H\3\2\2\2\u0123\u0124\7v\2\2\u0124\u0125\7j\2\2\u0125"+
		"\u0126\7k\2\2\u0126\u0127\7u\2\2\u0127J\3\2\2\2\u0128\u0129\t\5\2\2\u0129"+
		"L\3\2\2\2\u012a\u012b\7v\2\2\u012b\u012c\7t\2\2\u012c\u012d\7w\2\2\u012d"+
		"\u012e\7g\2\2\u012eN\3\2\2\2\u012f\u0130\7h\2\2\u0130\u0131\7c\2\2\u0131"+
		"\u0132\7n\2\2\u0132\u0133\7u\2\2\u0133\u0134\7g\2\2\u0134P\3\2\2\2\u0135"+
		"\u0137\4\62;\2\u0136\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u0136\3\2"+
		"\2\2\u0138\u0139\3\2\2\2\u0139R\3\2\2\2\u013a\u013c\4\62;\2\u013b\u013a"+
		"\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e"+
		"\u0145\3\2\2\2\u013f\u0141\7\60\2\2\u0140\u0142\4\62;\2\u0141\u0140\3"+
		"\2\2\2\u0142\u0143\3\2\2\2\u0143\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144"+
		"\u0146\3\2\2\2\u0145\u013f\3\2\2\2\u0145\u0146\3\2\2\2\u0146T\3\2\2\2"+
		"\u0147\u0149\7$\2\2\u0148\u014a\13\2\2\2\u0149\u0148\3\2\2\2\u014a\u014b"+
		"\3\2\2\2\u014b\u014c\3\2\2\2\u014b\u0149\3\2\2\2\u014c\u014d\3\2\2\2\u014d"+
		"\u014e\7$\2\2\u014eV\3\2\2\2\u014f\u0150\7p\2\2\u0150\u0151\7w\2\2\u0151"+
		"\u0152\7n\2\2\u0152\u0153\7n\2\2\u0153X\3\2\2\2\u0154\u0158\t\6\2\2\u0155"+
		"\u0157\t\7\2\2\u0156\u0155\3\2\2\2\u0157\u015a\3\2\2\2\u0158\u0156\3\2"+
		"\2\2\u0158\u0159\3\2\2\2\u0159Z\3\2\2\2\u015a\u0158\3\2\2\2\u015b\u015c"+
		"\t\b\2\2\u015c\u015d\3\2\2\2\u015d\u015e\b.\2\2\u015e\\\3\2\2\2\17\2\u0085"+
		"\u0089\u0092\u0097\u00fa\u0100\u0138\u013d\u0143\u0145\u014b\u0158\3\b"+
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