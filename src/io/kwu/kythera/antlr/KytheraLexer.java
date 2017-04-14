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
		STR=26, FN=27, OBJ=28, ARR=29, ASSIGNMENT_OPERATOR=30, BOOLEAN_OPERATOR=31, 
		NOT_OPERATOR=32, ARITH_OPERATOR=33, EXTENDS=34, IMPLEMENTS=35, INTERFACE=36, 
		THIS=37, PUNCT=38, TRUE=39, FALSE=40, IntLiteral=41, FloatLiteral=42, 
		StrLiteral=43, NULL=44, Identifier=45, WHITESPACE=46;
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
		"OBJ", "ARR", "ASSIGNMENT_OPERATOR", "BOOLEAN_OPERATOR", "NOT_OPERATOR", 
		"ARITH_OPERATOR", "EXTENDS", "IMPLEMENTS", "INTERFACE", "THIS", "PUNCT", 
		"TRUE", "FALSE", "IntLiteral", "FloatLiteral", "StrLiteral", "NULL", "Identifier", 
		"WHITESPACE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "'('", "')'", "'['", "','", "']'", "'import'", "'include'", 
		"'export'", "';'", null, "'let'", "'name'", "'if'", "'else'", "'for'", 
		"'while'", "'return'", "'break'", "'continue'", "'new'", "'bool'", "'int'", 
		"'float'", "'str'", "'fn'", "'obj'", "'arr'", "'='", null, "'!'", null, 
		"'extends'", "'implements'", "'interface'", "'this'", null, "'true'", 
		"'false'", null, null, null, "'null'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"COMMENT", "LET", "NAME", "IF", "ELSE", "FOR", "WHILE", "RETURN", "BREAK", 
		"CONTINUE", "NEW", "BOOL", "INT", "FLOAT", "STR", "FN", "OBJ", "ARR", 
		"ASSIGNMENT_OPERATOR", "BOOLEAN_OPERATOR", "NOT_OPERATOR", "ARITH_OPERATOR", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\60\u015e\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7"+
		"\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\7\r\u008a"+
		"\n\r\f\r\16\r\u008d\13\r\3\r\5\r\u0090\n\r\3\r\3\r\3\r\3\r\3\r\7\r\u0097"+
		"\n\r\f\r\16\r\u009a\13\r\3\r\3\r\5\r\u009e\n\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3 \3 \3 "+
		"\3 \3 \3 \3 \3 \3 \5 \u0100\n \3!\3!\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3"+
		"$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3"+
		"&\3&\3&\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3*\6*\u0136\n*\r*\16"+
		"*\u0137\3+\6+\u013b\n+\r+\16+\u013c\3+\3+\6+\u0141\n+\r+\16+\u0142\5+"+
		"\u0145\n+\3,\3,\6,\u0149\n,\r,\16,\u014a\3,\3,\3-\3-\3-\3-\3-\3.\3.\7"+
		".\u0156\n.\f.\16.\u0159\13.\3/\3/\3/\3/\4\u0098\u014a\2\60\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G"+
		"%I&K\'M(O)Q*S+U,W-Y.[/]\60\3\2\t\4\2\f\f\17\17\4\2>>@@\6\2\'\',-//\61"+
		"\61\n\2*+\60\60>>@@]]__}}\177\177\4\2C\\c|\7\2//\62;C\\aac|\5\2\13\f\17"+
		"\17\"\"\2\u016b\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		"9\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3"+
		"\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2"+
		"\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\3"+
		"_\3\2\2\2\5a\3\2\2\2\7c\3\2\2\2\te\3\2\2\2\13g\3\2\2\2\ri\3\2\2\2\17k"+
		"\3\2\2\2\21m\3\2\2\2\23t\3\2\2\2\25|\3\2\2\2\27\u0083\3\2\2\2\31\u009d"+
		"\3\2\2\2\33\u00a1\3\2\2\2\35\u00a5\3\2\2\2\37\u00aa\3\2\2\2!\u00ad\3\2"+
		"\2\2#\u00b2\3\2\2\2%\u00b6\3\2\2\2\'\u00bc\3\2\2\2)\u00c3\3\2\2\2+\u00c9"+
		"\3\2\2\2-\u00d2\3\2\2\2/\u00d6\3\2\2\2\61\u00db\3\2\2\2\63\u00df\3\2\2"+
		"\2\65\u00e5\3\2\2\2\67\u00e9\3\2\2\29\u00ec\3\2\2\2;\u00f0\3\2\2\2=\u00f4"+
		"\3\2\2\2?\u00ff\3\2\2\2A\u0101\3\2\2\2C\u0103\3\2\2\2E\u0105\3\2\2\2G"+
		"\u010d\3\2\2\2I\u0118\3\2\2\2K\u0122\3\2\2\2M\u0127\3\2\2\2O\u0129\3\2"+
		"\2\2Q\u012e\3\2\2\2S\u0135\3\2\2\2U\u013a\3\2\2\2W\u0146\3\2\2\2Y\u014e"+
		"\3\2\2\2[\u0153\3\2\2\2]\u015a\3\2\2\2_`\7}\2\2`\4\3\2\2\2ab\7\177\2\2"+
		"b\6\3\2\2\2cd\7*\2\2d\b\3\2\2\2ef\7+\2\2f\n\3\2\2\2gh\7]\2\2h\f\3\2\2"+
		"\2ij\7.\2\2j\16\3\2\2\2kl\7_\2\2l\20\3\2\2\2mn\7k\2\2no\7o\2\2op\7r\2"+
		"\2pq\7q\2\2qr\7t\2\2rs\7v\2\2s\22\3\2\2\2tu\7k\2\2uv\7p\2\2vw\7e\2\2w"+
		"x\7n\2\2xy\7w\2\2yz\7f\2\2z{\7g\2\2{\24\3\2\2\2|}\7g\2\2}~\7z\2\2~\177"+
		"\7r\2\2\177\u0080\7q\2\2\u0080\u0081\7t\2\2\u0081\u0082\7v\2\2\u0082\26"+
		"\3\2\2\2\u0083\u0084\7=\2\2\u0084\30\3\2\2\2\u0085\u0086\7\61\2\2\u0086"+
		"\u0087\7\61\2\2\u0087\u008b\3\2\2\2\u0088\u008a\n\2\2\2\u0089\u0088\3"+
		"\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c"+
		"\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u0090\7\17\2\2\u008f\u008e\3"+
		"\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u009e\7\f\2\2\u0092"+
		"\u0093\7\61\2\2\u0093\u0094\7,\2\2\u0094\u0098\3\2\2\2\u0095\u0097\13"+
		"\2\2\2\u0096\u0095\3\2\2\2\u0097\u009a\3\2\2\2\u0098\u0099\3\2\2\2\u0098"+
		"\u0096\3\2\2\2\u0099\u009b\3\2\2\2\u009a\u0098\3\2\2\2\u009b\u009c\7,"+
		"\2\2\u009c\u009e\7\61\2\2\u009d\u0085\3\2\2\2\u009d\u0092\3\2\2\2\u009e"+
		"\u009f\3\2\2\2\u009f\u00a0\b\r\2\2\u00a0\32\3\2\2\2\u00a1\u00a2\7n\2\2"+
		"\u00a2\u00a3\7g\2\2\u00a3\u00a4\7v\2\2\u00a4\34\3\2\2\2\u00a5\u00a6\7"+
		"p\2\2\u00a6\u00a7\7c\2\2\u00a7\u00a8\7o\2\2\u00a8\u00a9\7g\2\2\u00a9\36"+
		"\3\2\2\2\u00aa\u00ab\7k\2\2\u00ab\u00ac\7h\2\2\u00ac \3\2\2\2\u00ad\u00ae"+
		"\7g\2\2\u00ae\u00af\7n\2\2\u00af\u00b0\7u\2\2\u00b0\u00b1\7g\2\2\u00b1"+
		"\"\3\2\2\2\u00b2\u00b3\7h\2\2\u00b3\u00b4\7q\2\2\u00b4\u00b5\7t\2\2\u00b5"+
		"$\3\2\2\2\u00b6\u00b7\7y\2\2\u00b7\u00b8\7j\2\2\u00b8\u00b9\7k\2\2\u00b9"+
		"\u00ba\7n\2\2\u00ba\u00bb\7g\2\2\u00bb&\3\2\2\2\u00bc\u00bd\7t\2\2\u00bd"+
		"\u00be\7g\2\2\u00be\u00bf\7v\2\2\u00bf\u00c0\7w\2\2\u00c0\u00c1\7t\2\2"+
		"\u00c1\u00c2\7p\2\2\u00c2(\3\2\2\2\u00c3\u00c4\7d\2\2\u00c4\u00c5\7t\2"+
		"\2\u00c5\u00c6\7g\2\2\u00c6\u00c7\7c\2\2\u00c7\u00c8\7m\2\2\u00c8*\3\2"+
		"\2\2\u00c9\u00ca\7e\2\2\u00ca\u00cb\7q\2\2\u00cb\u00cc\7p\2\2\u00cc\u00cd"+
		"\7v\2\2\u00cd\u00ce\7k\2\2\u00ce\u00cf\7p\2\2\u00cf\u00d0\7w\2\2\u00d0"+
		"\u00d1\7g\2\2\u00d1,\3\2\2\2\u00d2\u00d3\7p\2\2\u00d3\u00d4\7g\2\2\u00d4"+
		"\u00d5\7y\2\2\u00d5.\3\2\2\2\u00d6\u00d7\7d\2\2\u00d7\u00d8\7q\2\2\u00d8"+
		"\u00d9\7q\2\2\u00d9\u00da\7n\2\2\u00da\60\3\2\2\2\u00db\u00dc\7k\2\2\u00dc"+
		"\u00dd\7p\2\2\u00dd\u00de\7v\2\2\u00de\62\3\2\2\2\u00df\u00e0\7h\2\2\u00e0"+
		"\u00e1\7n\2\2\u00e1\u00e2\7q\2\2\u00e2\u00e3\7c\2\2\u00e3\u00e4\7v\2\2"+
		"\u00e4\64\3\2\2\2\u00e5\u00e6\7u\2\2\u00e6\u00e7\7v\2\2\u00e7\u00e8\7"+
		"t\2\2\u00e8\66\3\2\2\2\u00e9\u00ea\7h\2\2\u00ea\u00eb\7p\2\2\u00eb8\3"+
		"\2\2\2\u00ec\u00ed\7q\2\2\u00ed\u00ee\7d\2\2\u00ee\u00ef\7l\2\2\u00ef"+
		":\3\2\2\2\u00f0\u00f1\7c\2\2\u00f1\u00f2\7t\2\2\u00f2\u00f3\7t\2\2\u00f3"+
		"<\3\2\2\2\u00f4\u00f5\7?\2\2\u00f5>\3\2\2\2\u00f6\u00f7\7?\2\2\u00f7\u0100"+
		"\7?\2\2\u00f8\u00f9\7#\2\2\u00f9\u0100\7?\2\2\u00fa\u0100\t\3\2\2\u00fb"+
		"\u00fc\7>\2\2\u00fc\u0100\7?\2\2\u00fd\u00fe\7@\2\2\u00fe\u0100\7?\2\2"+
		"\u00ff\u00f6\3\2\2\2\u00ff\u00f8\3\2\2\2\u00ff\u00fa\3\2\2\2\u00ff\u00fb"+
		"\3\2\2\2\u00ff\u00fd\3\2\2\2\u0100@\3\2\2\2\u0101\u0102\7#\2\2\u0102B"+
		"\3\2\2\2\u0103\u0104\t\4\2\2\u0104D\3\2\2\2\u0105\u0106\7g\2\2\u0106\u0107"+
		"\7z\2\2\u0107\u0108\7v\2\2\u0108\u0109\7g\2\2\u0109\u010a\7p\2\2\u010a"+
		"\u010b\7f\2\2\u010b\u010c\7u\2\2\u010cF\3\2\2\2\u010d\u010e\7k\2\2\u010e"+
		"\u010f\7o\2\2\u010f\u0110\7r\2\2\u0110\u0111\7n\2\2\u0111\u0112\7g\2\2"+
		"\u0112\u0113\7o\2\2\u0113\u0114\7g\2\2\u0114\u0115\7p\2\2\u0115\u0116"+
		"\7v\2\2\u0116\u0117\7u\2\2\u0117H\3\2\2\2\u0118\u0119\7k\2\2\u0119\u011a"+
		"\7p\2\2\u011a\u011b\7v\2\2\u011b\u011c\7g\2\2\u011c\u011d\7t\2\2\u011d"+
		"\u011e\7h\2\2\u011e\u011f\7c\2\2\u011f\u0120\7e\2\2\u0120\u0121\7g\2\2"+
		"\u0121J\3\2\2\2\u0122\u0123\7v\2\2\u0123\u0124\7j\2\2\u0124\u0125\7k\2"+
		"\2\u0125\u0126\7u\2\2\u0126L\3\2\2\2\u0127\u0128\t\5\2\2\u0128N\3\2\2"+
		"\2\u0129\u012a\7v\2\2\u012a\u012b\7t\2\2\u012b\u012c\7w\2\2\u012c\u012d"+
		"\7g\2\2\u012dP\3\2\2\2\u012e\u012f\7h\2\2\u012f\u0130\7c\2\2\u0130\u0131"+
		"\7n\2\2\u0131\u0132\7u\2\2\u0132\u0133\7g\2\2\u0133R\3\2\2\2\u0134\u0136"+
		"\4\62;\2\u0135\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0135\3\2\2\2\u0137"+
		"\u0138\3\2\2\2\u0138T\3\2\2\2\u0139\u013b\4\62;\2\u013a\u0139\3\2\2\2"+
		"\u013b\u013c\3\2\2\2\u013c\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u0144"+
		"\3\2\2\2\u013e\u0140\7\60\2\2\u013f\u0141\4\62;\2\u0140\u013f\3\2\2\2"+
		"\u0141\u0142\3\2\2\2\u0142\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0145"+
		"\3\2\2\2\u0144\u013e\3\2\2\2\u0144\u0145\3\2\2\2\u0145V\3\2\2\2\u0146"+
		"\u0148\7$\2\2\u0147\u0149\13\2\2\2\u0148\u0147\3\2\2\2\u0149\u014a\3\2"+
		"\2\2\u014a\u014b\3\2\2\2\u014a\u0148\3\2\2\2\u014b\u014c\3\2\2\2\u014c"+
		"\u014d\7$\2\2\u014dX\3\2\2\2\u014e\u014f\7p\2\2\u014f\u0150\7w\2\2\u0150"+
		"\u0151\7n\2\2\u0151\u0152\7n\2\2\u0152Z\3\2\2\2\u0153\u0157\t\6\2\2\u0154"+
		"\u0156\t\7\2\2\u0155\u0154\3\2\2\2\u0156\u0159\3\2\2\2\u0157\u0155\3\2"+
		"\2\2\u0157\u0158\3\2\2\2\u0158\\\3\2\2\2\u0159\u0157\3\2\2\2\u015a\u015b"+
		"\t\b\2\2\u015b\u015c\3\2\2\2\u015c\u015d\b/\2\2\u015d^\3\2\2\2\16\2\u008b"+
		"\u008f\u0098\u009d\u00ff\u0137\u013c\u0142\u0144\u014a\u0157\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}