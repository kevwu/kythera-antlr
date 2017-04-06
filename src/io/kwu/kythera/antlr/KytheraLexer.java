// Generated from /home/dejawu/kythera/Kythera.g4 by ANTLR 4.6

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
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, WHITESPACE=9, 
		LET=10, NAME=11, IF=12, ELSE=13, FOR=14, WHILE=15, RETURN=16, BREAK=17, 
		CONTINUE=18, BOOL=19, INT=20, FLOAT=21, FN=22, OBJ=23, OPERATOR=24, BOOLEAN_OPERATOR=25, 
		ASSIGNMENT_OPERATOR=26, NOT_OPERATOR=27, ARITH_OPERATOR=28, EXTENDS=29, 
		IMPLEMENTS=30, INTERFACE=31, IntLiteral=32, FloatLiteral=33, StrLiteral=34, 
		Type=35, NamedType=36, Identifier=37;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "WHITESPACE", 
		"ID", "LET", "NAME", "IF", "ELSE", "FOR", "WHILE", "RETURN", "BREAK", 
		"CONTINUE", "BOOL", "INT", "FLOAT", "FN", "OBJ", "OPERATOR", "BOOLEAN_OPERATOR", 
		"ASSIGNMENT_OPERATOR", "NOT_OPERATOR", "ARITH_OPERATOR", "EXTENDS", "IMPLEMENTS", 
		"INTERFACE", "IntLiteral", "FloatLiteral", "StrLiteral", "Type", "NamedType", 
		"Identifier"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "'('", "')'", "'import'", "'include'", "'export'", 
		"';'", null, "'let'", "'name'", "'if'", "'else'", "'for'", "'while'", 
		"'return'", "'break'", "'continue'", "'bool'", "'int'", "'float'", "'fn'", 
		"'obj'", null, null, "'='", "'!'", null, "'extends'", "'implements'", 
		"'interface'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, "WHITESPACE", "LET", 
		"NAME", "IF", "ELSE", "FOR", "WHILE", "RETURN", "BREAK", "CONTINUE", "BOOL", 
		"INT", "FLOAT", "FN", "OBJ", "OPERATOR", "BOOLEAN_OPERATOR", "ASSIGNMENT_OPERATOR", 
		"NOT_OPERATOR", "ARITH_OPERATOR", "EXTENDS", "IMPLEMENTS", "INTERFACE", 
		"IntLiteral", "FloatLiteral", "StrLiteral", "Type", "NamedType", "Identifier"
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
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\'\u0119\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\3\3\3\3\4\3\4\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\7\13v\n\13"+
		"\f\13\16\13y\13\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\31\3\32\3\32\3\32\3\32\5\32\u00c6\n\32\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\5\33\u00cf\n\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!"+
		"\3!\3!\3!\3!\3!\3!\3!\3!\3\"\6\"\u00f5\n\"\r\"\16\"\u00f6\3#\6#\u00fa"+
		"\n#\r#\16#\u00fb\3#\3#\6#\u0100\n#\r#\16#\u0101\5#\u0104\n#\3$\3$\6$\u0108"+
		"\n$\r$\16$\u0109\3$\3$\3%\3%\3%\3%\3%\3%\5%\u0114\n%\3&\3&\3\'\3\'\3\u0109"+
		"\2(\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\2\27\f\31\r\33\16\35\17"+
		"\37\20!\21#\22%\23\'\24)\25+\26-\27/\30\61\31\63\32\65\33\67\349\35;\36"+
		"=\37? A!C\"E#G$I%K&M\'\3\2\7\5\2\13\f\17\17\"\"\5\2C\\aac|\6\2\62;C\\"+
		"aac|\4\2>>@@\6\2\'\',-//\61\61\u0128\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\3O\3\2\2\2\5"+
		"Q\3\2\2\2\7S\3\2\2\2\tU\3\2\2\2\13W\3\2\2\2\r^\3\2\2\2\17f\3\2\2\2\21"+
		"m\3\2\2\2\23o\3\2\2\2\25s\3\2\2\2\27z\3\2\2\2\31~\3\2\2\2\33\u0083\3\2"+
		"\2\2\35\u0086\3\2\2\2\37\u008b\3\2\2\2!\u008f\3\2\2\2#\u0095\3\2\2\2%"+
		"\u009c\3\2\2\2\'\u00a2\3\2\2\2)\u00ab\3\2\2\2+\u00b0\3\2\2\2-\u00b4\3"+
		"\2\2\2/\u00ba\3\2\2\2\61\u00bd\3\2\2\2\63\u00c5\3\2\2\2\65\u00ce\3\2\2"+
		"\2\67\u00d0\3\2\2\29\u00d2\3\2\2\2;\u00d4\3\2\2\2=\u00d6\3\2\2\2?\u00de"+
		"\3\2\2\2A\u00e9\3\2\2\2C\u00f4\3\2\2\2E\u00f9\3\2\2\2G\u0105\3\2\2\2I"+
		"\u0113\3\2\2\2K\u0115\3\2\2\2M\u0117\3\2\2\2OP\7}\2\2P\4\3\2\2\2QR\7\177"+
		"\2\2R\6\3\2\2\2ST\7*\2\2T\b\3\2\2\2UV\7+\2\2V\n\3\2\2\2WX\7k\2\2XY\7o"+
		"\2\2YZ\7r\2\2Z[\7q\2\2[\\\7t\2\2\\]\7v\2\2]\f\3\2\2\2^_\7k\2\2_`\7p\2"+
		"\2`a\7e\2\2ab\7n\2\2bc\7w\2\2cd\7f\2\2de\7g\2\2e\16\3\2\2\2fg\7g\2\2g"+
		"h\7z\2\2hi\7r\2\2ij\7q\2\2jk\7t\2\2kl\7v\2\2l\20\3\2\2\2mn\7=\2\2n\22"+
		"\3\2\2\2op\t\2\2\2pq\3\2\2\2qr\b\n\2\2r\24\3\2\2\2sw\t\3\2\2tv\t\4\2\2"+
		"ut\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2x\26\3\2\2\2yw\3\2\2\2z{\7n\2"+
		"\2{|\7g\2\2|}\7v\2\2}\30\3\2\2\2~\177\7p\2\2\177\u0080\7c\2\2\u0080\u0081"+
		"\7o\2\2\u0081\u0082\7g\2\2\u0082\32\3\2\2\2\u0083\u0084\7k\2\2\u0084\u0085"+
		"\7h\2\2\u0085\34\3\2\2\2\u0086\u0087\7g\2\2\u0087\u0088\7n\2\2\u0088\u0089"+
		"\7u\2\2\u0089\u008a\7g\2\2\u008a\36\3\2\2\2\u008b\u008c\7h\2\2\u008c\u008d"+
		"\7q\2\2\u008d\u008e\7t\2\2\u008e \3\2\2\2\u008f\u0090\7y\2\2\u0090\u0091"+
		"\7j\2\2\u0091\u0092\7k\2\2\u0092\u0093\7n\2\2\u0093\u0094\7g\2\2\u0094"+
		"\"\3\2\2\2\u0095\u0096\7t\2\2\u0096\u0097\7g\2\2\u0097\u0098\7v\2\2\u0098"+
		"\u0099\7w\2\2\u0099\u009a\7t\2\2\u009a\u009b\7p\2\2\u009b$\3\2\2\2\u009c"+
		"\u009d\7d\2\2\u009d\u009e\7t\2\2\u009e\u009f\7g\2\2\u009f\u00a0\7c\2\2"+
		"\u00a0\u00a1\7m\2\2\u00a1&\3\2\2\2\u00a2\u00a3\7e\2\2\u00a3\u00a4\7q\2"+
		"\2\u00a4\u00a5\7p\2\2\u00a5\u00a6\7v\2\2\u00a6\u00a7\7k\2\2\u00a7\u00a8"+
		"\7p\2\2\u00a8\u00a9\7w\2\2\u00a9\u00aa\7g\2\2\u00aa(\3\2\2\2\u00ab\u00ac"+
		"\7d\2\2\u00ac\u00ad\7q\2\2\u00ad\u00ae\7q\2\2\u00ae\u00af\7n\2\2\u00af"+
		"*\3\2\2\2\u00b0\u00b1\7k\2\2\u00b1\u00b2\7p\2\2\u00b2\u00b3\7v\2\2\u00b3"+
		",\3\2\2\2\u00b4\u00b5\7h\2\2\u00b5\u00b6\7n\2\2\u00b6\u00b7\7q\2\2\u00b7"+
		"\u00b8\7c\2\2\u00b8\u00b9\7v\2\2\u00b9.\3\2\2\2\u00ba\u00bb\7h\2\2\u00bb"+
		"\u00bc\7p\2\2\u00bc\60\3\2\2\2\u00bd\u00be\7q\2\2\u00be\u00bf\7d\2\2\u00bf"+
		"\u00c0\7l\2\2\u00c0\62\3\2\2\2\u00c1\u00c6\5\65\33\2\u00c2\u00c6\5\67"+
		"\34\2\u00c3\u00c6\59\35\2\u00c4\u00c6\5;\36\2\u00c5\u00c1\3\2\2\2\u00c5"+
		"\u00c2\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c4\3\2\2\2\u00c6\64\3\2\2"+
		"\2\u00c7\u00c8\7?\2\2\u00c8\u00cf\7?\2\2\u00c9\u00cf\t\5\2\2\u00ca\u00cb"+
		"\7>\2\2\u00cb\u00cf\7?\2\2\u00cc\u00cd\7@\2\2\u00cd\u00cf\7?\2\2\u00ce"+
		"\u00c7\3\2\2\2\u00ce\u00c9\3\2\2\2\u00ce\u00ca\3\2\2\2\u00ce\u00cc\3\2"+
		"\2\2\u00cf\66\3\2\2\2\u00d0\u00d1\7?\2\2\u00d18\3\2\2\2\u00d2\u00d3\7"+
		"#\2\2\u00d3:\3\2\2\2\u00d4\u00d5\t\6\2\2\u00d5<\3\2\2\2\u00d6\u00d7\7"+
		"g\2\2\u00d7\u00d8\7z\2\2\u00d8\u00d9\7v\2\2\u00d9\u00da\7g\2\2\u00da\u00db"+
		"\7p\2\2\u00db\u00dc\7f\2\2\u00dc\u00dd\7u\2\2\u00dd>\3\2\2\2\u00de\u00df"+
		"\7k\2\2\u00df\u00e0\7o\2\2\u00e0\u00e1\7r\2\2\u00e1\u00e2\7n\2\2\u00e2"+
		"\u00e3\7g\2\2\u00e3\u00e4\7o\2\2\u00e4\u00e5\7g\2\2\u00e5\u00e6\7p\2\2"+
		"\u00e6\u00e7\7v\2\2\u00e7\u00e8\7u\2\2\u00e8@\3\2\2\2\u00e9\u00ea\7k\2"+
		"\2\u00ea\u00eb\7p\2\2\u00eb\u00ec\7v\2\2\u00ec\u00ed\7g\2\2\u00ed\u00ee"+
		"\7t\2\2\u00ee\u00ef\7h\2\2\u00ef\u00f0\7c\2\2\u00f0\u00f1\7e\2\2\u00f1"+
		"\u00f2\7g\2\2\u00f2B\3\2\2\2\u00f3\u00f5\4\62;\2\u00f4\u00f3\3\2\2\2\u00f5"+
		"\u00f6\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7D\3\2\2\2"+
		"\u00f8\u00fa\4\62;\2\u00f9\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00f9"+
		"\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u0103\3\2\2\2\u00fd\u00ff\7\60\2\2"+
		"\u00fe\u0100\4\62;\2\u00ff\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u00ff"+
		"\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0104\3\2\2\2\u0103\u00fd\3\2\2\2\u0103"+
		"\u0104\3\2\2\2\u0104F\3\2\2\2\u0105\u0107\7$\2\2\u0106\u0108\13\2\2\2"+
		"\u0107\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010a\3\2\2\2\u0109\u0107"+
		"\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010c\7$\2\2\u010cH\3\2\2\2\u010d\u0114"+
		"\5)\25\2\u010e\u0114\5+\26\2\u010f\u0114\5-\27\2\u0110\u0114\5/\30\2\u0111"+
		"\u0114\5\61\31\2\u0112\u0114\5K&\2\u0113\u010d\3\2\2\2\u0113\u010e\3\2"+
		"\2\2\u0113\u010f\3\2\2\2\u0113\u0110\3\2\2\2\u0113\u0111\3\2\2\2\u0113"+
		"\u0112\3\2\2\2\u0114J\3\2\2\2\u0115\u0116\5\25\13\2\u0116L\3\2\2\2\u0117"+
		"\u0118\5\25\13\2\u0118N\3\2\2\2\f\2w\u00c5\u00ce\u00f6\u00fb\u0101\u0103"+
		"\u0109\u0113\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}