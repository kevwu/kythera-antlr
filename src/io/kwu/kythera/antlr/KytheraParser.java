// Generated from /home/dejawu/kythera/Kythera.g4 by ANTLR 4.6

    package io.kwu.kythera.antlr;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class KytheraParser extends Parser {
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
	public static final int
		RULE_objLiteral = 0, RULE_fnLiteral = 1, RULE_literal = 2, RULE_expression = 3, 
		RULE_fnExpression = 4, RULE_statement = 5, RULE_packageStatement = 6, 
		RULE_importStatement = 7, RULE_includeStatement = 8, RULE_exportStatement = 9, 
		RULE_variableStatement = 10, RULE_declarationStatement = 11, RULE_assignmentStatement = 12, 
		RULE_nameStatement = 13, RULE_controlFlowStatement = 14, RULE_ifStatement = 15, 
		RULE_forStatement = 16, RULE_whileStatement = 17, RULE_breakStatement = 18, 
		RULE_continueStatement = 19, RULE_returnStatement = 20, RULE_program = 21;
	public static final String[] ruleNames = {
		"objLiteral", "fnLiteral", "literal", "expression", "fnExpression", "statement", 
		"packageStatement", "importStatement", "includeStatement", "exportStatement", 
		"variableStatement", "declarationStatement", "assignmentStatement", "nameStatement", 
		"controlFlowStatement", "ifStatement", "forStatement", "whileStatement", 
		"breakStatement", "continueStatement", "returnStatement", "program"
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

	@Override
	public String getGrammarFileName() { return "Kythera.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public KytheraParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ObjLiteralContext extends ParserRuleContext {
		public List<TerminalNode> Type() { return getTokens(KytheraParser.Type); }
		public TerminalNode Type(int i) {
			return getToken(KytheraParser.Type, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(KytheraParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(KytheraParser.Identifier, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ObjLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KytheraListener ) ((KytheraListener)listener).enterObjLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KytheraListener ) ((KytheraListener)listener).exitObjLiteral(this);
		}
	}

	public final ObjLiteralContext objLiteral() throws RecognitionException {
		ObjLiteralContext _localctx = new ObjLiteralContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_objLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(T__0);
			setState(50); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(50);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Type:
					{
					{
					setState(45);
					match(Type);
					setState(46);
					match(Identifier);
					}
					}
					break;
				case Identifier:
					{
					{
					setState(47);
					match(Identifier);
					setState(48);
					match(ASSIGNMENT_OPERATOR);
					setState(49);
					expression(0);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(52); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Type || _la==Identifier );
			setState(54);
			match(T__1);
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

	public static class FnLiteralContext extends ParserRuleContext {
		public List<TerminalNode> Type() { return getTokens(KytheraParser.Type); }
		public TerminalNode Type(int i) {
			return getToken(KytheraParser.Type, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(KytheraParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(KytheraParser.Identifier, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FnLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fnLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KytheraListener ) ((KytheraListener)listener).enterFnLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KytheraListener ) ((KytheraListener)listener).exitFnLiteral(this);
		}
	}

	public final FnLiteralContext fnLiteral() throws RecognitionException {
		FnLiteralContext _localctx = new FnLiteralContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_fnLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(T__2);
			setState(59); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(57);
				match(Type);
				setState(58);
				match(Identifier);
				}
				}
				setState(61); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Type );
			setState(63);
			match(T__3);
			setState(64);
			match(T__0);
			setState(66); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(65);
				statement();
				}
				}
				setState(68); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << LET) | (1L << NAME) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << RETURN) | (1L << BREAK) | (1L << CONTINUE) | (1L << Identifier))) != 0) );
			setState(70);
			match(T__1);
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode IntLiteral() { return getToken(KytheraParser.IntLiteral, 0); }
		public TerminalNode FloatLiteral() { return getToken(KytheraParser.FloatLiteral, 0); }
		public TerminalNode StrLiteral() { return getToken(KytheraParser.StrLiteral, 0); }
		public ObjLiteralContext objLiteral() {
			return getRuleContext(ObjLiteralContext.class,0);
		}
		public FnLiteralContext fnLiteral() {
			return getRuleContext(FnLiteralContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KytheraListener ) ((KytheraListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KytheraListener ) ((KytheraListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_literal);
		try {
			setState(77);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IntLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				match(IntLiteral);
				}
				break;
			case FloatLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				match(FloatLiteral);
				}
				break;
			case StrLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(74);
				match(StrLiteral);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 4);
				{
				setState(75);
				objLiteral();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 5);
				{
				setState(76);
				fnLiteral();
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

	public static class ExpressionContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode NOT_OPERATOR() { return getToken(KytheraParser.NOT_OPERATOR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public FnExpressionContext fnExpression() {
			return getRuleContext(FnExpressionContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(KytheraParser.Identifier, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode BOOLEAN_OPERATOR() { return getToken(KytheraParser.BOOLEAN_OPERATOR, 0); }
		public TerminalNode ARITH_OPERATOR() { return getToken(KytheraParser.ARITH_OPERATOR, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KytheraListener ) ((KytheraListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KytheraListener ) ((KytheraListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(80);
				statement();
				}
				break;
			case 2:
				{
				setState(81);
				match(NOT_OPERATOR);
				setState(82);
				expression(3);
				}
				break;
			case 3:
				{
				setState(83);
				fnExpression();
				}
				break;
			case 4:
				{
				setState(86);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Identifier:
					{
					setState(84);
					match(Identifier);
					}
					break;
				case T__0:
				case T__2:
				case IntLiteral:
				case FloatLiteral:
				case StrLiteral:
					{
					setState(85);
					literal();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(98);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(96);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(90);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(91);
						match(BOOLEAN_OPERATOR);
						setState(92);
						expression(6);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(93);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(94);
						match(ARITH_OPERATOR);
						setState(95);
						expression(5);
						}
						break;
					}
					} 
				}
				setState(100);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class FnExpressionContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(KytheraParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(KytheraParser.Identifier, i);
		}
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public FnExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fnExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KytheraListener ) ((KytheraListener)listener).enterFnExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KytheraListener ) ((KytheraListener)listener).exitFnExpression(this);
		}
	}

	public final FnExpressionContext fnExpression() throws RecognitionException {
		FnExpressionContext _localctx = new FnExpressionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_fnExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(Identifier);
			setState(102);
			match(T__2);
			setState(105); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(105);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Identifier:
					{
					setState(103);
					match(Identifier);
					}
					break;
				case T__0:
				case T__2:
				case IntLiteral:
				case FloatLiteral:
				case StrLiteral:
					{
					setState(104);
					literal();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(107); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << IntLiteral) | (1L << FloatLiteral) | (1L << StrLiteral) | (1L << Identifier))) != 0) );
			setState(109);
			match(T__3);
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

	public static class StatementContext extends ParserRuleContext {
		public VariableStatementContext variableStatement() {
			return getRuleContext(VariableStatementContext.class,0);
		}
		public ControlFlowStatementContext controlFlowStatement() {
			return getRuleContext(ControlFlowStatementContext.class,0);
		}
		public PackageStatementContext packageStatement() {
			return getRuleContext(PackageStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KytheraListener ) ((KytheraListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KytheraListener ) ((KytheraListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_statement);
		try {
			setState(114);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LET:
			case NAME:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				variableStatement();
				}
				break;
			case IF:
			case FOR:
			case WHILE:
			case RETURN:
			case BREAK:
			case CONTINUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				controlFlowStatement();
				}
				break;
			case T__4:
			case T__5:
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				setState(113);
				packageStatement();
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

	public static class PackageStatementContext extends ParserRuleContext {
		public ImportStatementContext importStatement() {
			return getRuleContext(ImportStatementContext.class,0);
		}
		public IncludeStatementContext includeStatement() {
			return getRuleContext(IncludeStatementContext.class,0);
		}
		public ExportStatementContext exportStatement() {
			return getRuleContext(ExportStatementContext.class,0);
		}
		public PackageStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KytheraListener ) ((KytheraListener)listener).enterPackageStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KytheraListener ) ((KytheraListener)listener).exitPackageStatement(this);
		}
	}

	public final PackageStatementContext packageStatement() throws RecognitionException {
		PackageStatementContext _localctx = new PackageStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_packageStatement);
		try {
			setState(119);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				importStatement();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				includeStatement();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				setState(118);
				exportStatement();
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

	public static class ImportStatementContext extends ParserRuleContext {
		public TerminalNode StrLiteral() { return getToken(KytheraParser.StrLiteral, 0); }
		public ImportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KytheraListener ) ((KytheraListener)listener).enterImportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KytheraListener ) ((KytheraListener)listener).exitImportStatement(this);
		}
	}

	public final ImportStatementContext importStatement() throws RecognitionException {
		ImportStatementContext _localctx = new ImportStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_importStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(T__4);
			setState(122);
			match(StrLiteral);
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

	public static class IncludeStatementContext extends ParserRuleContext {
		public TerminalNode StrLiteral() { return getToken(KytheraParser.StrLiteral, 0); }
		public IncludeStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_includeStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KytheraListener ) ((KytheraListener)listener).enterIncludeStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KytheraListener ) ((KytheraListener)listener).exitIncludeStatement(this);
		}
	}

	public final IncludeStatementContext includeStatement() throws RecognitionException {
		IncludeStatementContext _localctx = new IncludeStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_includeStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(T__5);
			setState(125);
			match(StrLiteral);
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

	public static class ExportStatementContext extends ParserRuleContext {
		public TerminalNode StrLiteral() { return getToken(KytheraParser.StrLiteral, 0); }
		public ExportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exportStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KytheraListener ) ((KytheraListener)listener).enterExportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KytheraListener ) ((KytheraListener)listener).exitExportStatement(this);
		}
	}

	public final ExportStatementContext exportStatement() throws RecognitionException {
		ExportStatementContext _localctx = new ExportStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_exportStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(T__6);
			setState(128);
			match(StrLiteral);
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

	public static class VariableStatementContext extends ParserRuleContext {
		public DeclarationStatementContext declarationStatement() {
			return getRuleContext(DeclarationStatementContext.class,0);
		}
		public AssignmentStatementContext assignmentStatement() {
			return getRuleContext(AssignmentStatementContext.class,0);
		}
		public NameStatementContext nameStatement() {
			return getRuleContext(NameStatementContext.class,0);
		}
		public VariableStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KytheraListener ) ((KytheraListener)listener).enterVariableStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KytheraListener ) ((KytheraListener)listener).exitVariableStatement(this);
		}
	}

	public final VariableStatementContext variableStatement() throws RecognitionException {
		VariableStatementContext _localctx = new VariableStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_variableStatement);
		try {
			setState(133);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LET:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				declarationStatement();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				assignmentStatement();
				}
				break;
			case NAME:
				enterOuterAlt(_localctx, 3);
				{
				setState(132);
				nameStatement();
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

	public static class DeclarationStatementContext extends ParserRuleContext {
		public TerminalNode LET() { return getToken(KytheraParser.LET, 0); }
		public TerminalNode Identifier() { return getToken(KytheraParser.Identifier, 0); }
		public TerminalNode ASSIGNMENT_OPERATOR() { return getToken(KytheraParser.ASSIGNMENT_OPERATOR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KytheraListener ) ((KytheraListener)listener).enterDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KytheraListener ) ((KytheraListener)listener).exitDeclarationStatement(this);
		}
	}

	public final DeclarationStatementContext declarationStatement() throws RecognitionException {
		DeclarationStatementContext _localctx = new DeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_declarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(LET);
			setState(136);
			match(Identifier);
			setState(137);
			match(ASSIGNMENT_OPERATOR);
			setState(138);
			expression(0);
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

	public static class AssignmentStatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(KytheraParser.Identifier, 0); }
		public TerminalNode ASSIGNMENT_OPERATOR() { return getToken(KytheraParser.ASSIGNMENT_OPERATOR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KytheraListener ) ((KytheraListener)listener).enterAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KytheraListener ) ((KytheraListener)listener).exitAssignmentStatement(this);
		}
	}

	public final AssignmentStatementContext assignmentStatement() throws RecognitionException {
		AssignmentStatementContext _localctx = new AssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_assignmentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(Identifier);
			setState(141);
			match(ASSIGNMENT_OPERATOR);
			setState(142);
			expression(0);
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

	public static class NameStatementContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(KytheraParser.NAME, 0); }
		public List<TerminalNode> Identifier() { return getTokens(KytheraParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(KytheraParser.Identifier, i);
		}
		public TerminalNode Type() { return getToken(KytheraParser.Type, 0); }
		public TerminalNode IMPLEMENTS() { return getToken(KytheraParser.IMPLEMENTS, 0); }
		public TerminalNode EXTENDS() { return getToken(KytheraParser.EXTENDS, 0); }
		public NameStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nameStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KytheraListener ) ((KytheraListener)listener).enterNameStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KytheraListener ) ((KytheraListener)listener).exitNameStatement(this);
		}
	}

	public final NameStatementContext nameStatement() throws RecognitionException {
		NameStatementContext _localctx = new NameStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_nameStatement);
		int _la;
		try {
			setState(172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				match(NAME);
				setState(145);
				match(Identifier);
				setState(146);
				match(Type);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				match(NAME);
				setState(148);
				match(Identifier);
				setState(149);
				match(IMPLEMENTS);
				setState(151); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(150);
					match(Identifier);
					}
					}
					setState(153); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Identifier );
				setState(155);
				match(Type);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(156);
				match(NAME);
				setState(157);
				match(Identifier);
				setState(158);
				match(EXTENDS);
				setState(159);
				match(Identifier);
				setState(160);
				match(Type);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(161);
				match(NAME);
				setState(162);
				match(Identifier);
				setState(163);
				match(EXTENDS);
				setState(164);
				match(Identifier);
				setState(165);
				match(IMPLEMENTS);
				setState(167); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(166);
					match(Identifier);
					}
					}
					setState(169); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Identifier );
				setState(171);
				match(Type);
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

	public static class ControlFlowStatementContext extends ParserRuleContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public ControlFlowStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_controlFlowStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KytheraListener ) ((KytheraListener)listener).enterControlFlowStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KytheraListener ) ((KytheraListener)listener).exitControlFlowStatement(this);
		}
	}

	public final ControlFlowStatementContext controlFlowStatement() throws RecognitionException {
		ControlFlowStatementContext _localctx = new ControlFlowStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_controlFlowStatement);
		try {
			setState(180);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				ifStatement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				forStatement();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(176);
				whileStatement();
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 4);
				{
				setState(177);
				breakStatement();
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 5);
				{
				setState(178);
				continueStatement();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 6);
				{
				setState(179);
				returnStatement();
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

	public static class IfStatementContext extends ParserRuleContext {
		public List<TerminalNode> IF() { return getTokens(KytheraParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(KytheraParser.IF, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> ELSE() { return getTokens(KytheraParser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(KytheraParser.ELSE, i);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KytheraListener ) ((KytheraListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KytheraListener ) ((KytheraListener)listener).exitIfStatement(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_ifStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(IF);
			setState(183);
			match(T__2);
			setState(184);
			expression(0);
			setState(185);
			match(T__3);
			setState(186);
			match(T__0);
			setState(188); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(187);
				expression(0);
				}
				}
				setState(190); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << LET) | (1L << NAME) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << RETURN) | (1L << BREAK) | (1L << CONTINUE) | (1L << NOT_OPERATOR) | (1L << IntLiteral) | (1L << FloatLiteral) | (1L << StrLiteral) | (1L << Identifier))) != 0) );
			setState(192);
			match(T__1);
			setState(221);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(206); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(193);
						match(ELSE);
						setState(194);
						match(IF);
						setState(195);
						match(T__2);
						setState(196);
						expression(0);
						setState(197);
						match(T__3);
						setState(198);
						match(T__0);
						setState(200); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(199);
							expression(0);
							}
							}
							setState(202); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << LET) | (1L << NAME) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << RETURN) | (1L << BREAK) | (1L << CONTINUE) | (1L << NOT_OPERATOR) | (1L << IntLiteral) | (1L << FloatLiteral) | (1L << StrLiteral) | (1L << Identifier))) != 0) );
						setState(204);
						match(T__1);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(208); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(219);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(210);
					match(ELSE);
					setState(211);
					match(T__0);
					setState(213); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(212);
						expression(0);
						}
						}
						setState(215); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << LET) | (1L << NAME) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << RETURN) | (1L << BREAK) | (1L << CONTINUE) | (1L << NOT_OPERATOR) | (1L << IntLiteral) | (1L << FloatLiteral) | (1L << StrLiteral) | (1L << Identifier))) != 0) );
					setState(217);
					match(T__1);
					}
					break;
				}
				}
				break;
			}
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

	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(KytheraParser.FOR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KytheraListener ) ((KytheraListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KytheraListener ) ((KytheraListener)listener).exitForStatement(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(FOR);
			setState(224);
			match(T__2);
			setState(225);
			expression(0);
			setState(226);
			match(T__7);
			setState(227);
			expression(0);
			setState(228);
			match(T__7);
			setState(229);
			expression(0);
			setState(230);
			match(T__3);
			setState(231);
			match(T__0);
			setState(233); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(232);
				expression(0);
				}
				}
				setState(235); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << LET) | (1L << NAME) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << RETURN) | (1L << BREAK) | (1L << CONTINUE) | (1L << NOT_OPERATOR) | (1L << IntLiteral) | (1L << FloatLiteral) | (1L << StrLiteral) | (1L << Identifier))) != 0) );
			setState(237);
			match(T__1);
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

	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(KytheraParser.WHILE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KytheraListener ) ((KytheraListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KytheraListener ) ((KytheraListener)listener).exitWhileStatement(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_whileStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(WHILE);
			setState(240);
			match(T__2);
			setState(241);
			expression(0);
			setState(242);
			match(T__3);
			setState(243);
			match(T__0);
			setState(245); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(244);
				expression(0);
				}
				}
				setState(247); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << LET) | (1L << NAME) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << RETURN) | (1L << BREAK) | (1L << CONTINUE) | (1L << NOT_OPERATOR) | (1L << IntLiteral) | (1L << FloatLiteral) | (1L << StrLiteral) | (1L << Identifier))) != 0) );
			setState(249);
			match(T__1);
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

	public static class BreakStatementContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(KytheraParser.BREAK, 0); }
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KytheraListener ) ((KytheraListener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KytheraListener ) ((KytheraListener)listener).exitBreakStatement(this);
		}
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(BREAK);
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

	public static class ContinueStatementContext extends ParserRuleContext {
		public TerminalNode CONTINUE() { return getToken(KytheraParser.CONTINUE, 0); }
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KytheraListener ) ((KytheraListener)listener).enterContinueStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KytheraListener ) ((KytheraListener)listener).exitContinueStatement(this);
		}
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_continueStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(CONTINUE);
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

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(KytheraParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KytheraListener ) ((KytheraListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KytheraListener ) ((KytheraListener)listener).exitReturnStatement(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(RETURN);
			setState(256);
			expression(0);
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

	public static class ProgramContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KytheraListener ) ((KytheraListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KytheraListener ) ((KytheraListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(258);
				expression(0);
				}
				}
				setState(261); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << LET) | (1L << NAME) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << RETURN) | (1L << BREAK) | (1L << CONTINUE) | (1L << NOT_OPERATOR) | (1L << IntLiteral) | (1L << FloatLiteral) | (1L << StrLiteral) | (1L << Identifier))) != 0) );
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
		case 3:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\'\u010a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\6\2\65\n\2\r\2\16\2\66\3\2\3\2\3\3\3\3\3\3\6\3>\n\3\r\3\16\3?\3\3"+
		"\3\3\3\3\6\3E\n\3\r\3\16\3F\3\3\3\3\3\4\3\4\3\4\3\4\3\4\5\4P\n\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\5\5Y\n\5\5\5[\n\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5c"+
		"\n\5\f\5\16\5f\13\5\3\6\3\6\3\6\3\6\6\6l\n\6\r\6\16\6m\3\6\3\6\3\7\3\7"+
		"\3\7\5\7u\n\7\3\b\3\b\3\b\5\bz\n\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3"+
		"\13\3\f\3\f\3\f\5\f\u0088\n\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\6\17\u009a\n\17\r\17\16\17\u009b\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\6\17\u00aa"+
		"\n\17\r\17\16\17\u00ab\3\17\5\17\u00af\n\17\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\5\20\u00b7\n\20\3\21\3\21\3\21\3\21\3\21\3\21\6\21\u00bf\n\21\r\21"+
		"\16\21\u00c0\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\6\21\u00cb\n\21\r"+
		"\21\16\21\u00cc\3\21\3\21\6\21\u00d1\n\21\r\21\16\21\u00d2\3\21\3\21\3"+
		"\21\6\21\u00d8\n\21\r\21\16\21\u00d9\3\21\3\21\5\21\u00de\n\21\5\21\u00e0"+
		"\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\6\22\u00ec\n\22"+
		"\r\22\16\22\u00ed\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\6\23\u00f8\n"+
		"\23\r\23\16\23\u00f9\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\27"+
		"\6\27\u0106\n\27\r\27\16\27\u0107\3\27\2\3\b\30\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,\2\2\u011c\2.\3\2\2\2\4:\3\2\2\2\6O\3\2\2\2\bZ"+
		"\3\2\2\2\ng\3\2\2\2\ft\3\2\2\2\16y\3\2\2\2\20{\3\2\2\2\22~\3\2\2\2\24"+
		"\u0081\3\2\2\2\26\u0087\3\2\2\2\30\u0089\3\2\2\2\32\u008e\3\2\2\2\34\u00ae"+
		"\3\2\2\2\36\u00b6\3\2\2\2 \u00b8\3\2\2\2\"\u00e1\3\2\2\2$\u00f1\3\2\2"+
		"\2&\u00fd\3\2\2\2(\u00ff\3\2\2\2*\u0101\3\2\2\2,\u0105\3\2\2\2.\64\7\3"+
		"\2\2/\60\7%\2\2\60\65\7\'\2\2\61\62\7\'\2\2\62\63\7\34\2\2\63\65\5\b\5"+
		"\2\64/\3\2\2\2\64\61\3\2\2\2\65\66\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2"+
		"\678\3\2\2\289\7\4\2\29\3\3\2\2\2:=\7\5\2\2;<\7%\2\2<>\7\'\2\2=;\3\2\2"+
		"\2>?\3\2\2\2?=\3\2\2\2?@\3\2\2\2@A\3\2\2\2AB\7\6\2\2BD\7\3\2\2CE\5\f\7"+
		"\2DC\3\2\2\2EF\3\2\2\2FD\3\2\2\2FG\3\2\2\2GH\3\2\2\2HI\7\4\2\2I\5\3\2"+
		"\2\2JP\7\"\2\2KP\7#\2\2LP\7$\2\2MP\5\2\2\2NP\5\4\3\2OJ\3\2\2\2OK\3\2\2"+
		"\2OL\3\2\2\2OM\3\2\2\2ON\3\2\2\2P\7\3\2\2\2QR\b\5\1\2R[\5\f\7\2ST\7\35"+
		"\2\2T[\5\b\5\5U[\5\n\6\2VY\7\'\2\2WY\5\6\4\2XV\3\2\2\2XW\3\2\2\2Y[\3\2"+
		"\2\2ZQ\3\2\2\2ZS\3\2\2\2ZU\3\2\2\2ZX\3\2\2\2[d\3\2\2\2\\]\f\7\2\2]^\7"+
		"\33\2\2^c\5\b\5\b_`\f\6\2\2`a\7\36\2\2ac\5\b\5\7b\\\3\2\2\2b_\3\2\2\2"+
		"cf\3\2\2\2db\3\2\2\2de\3\2\2\2e\t\3\2\2\2fd\3\2\2\2gh\7\'\2\2hk\7\5\2"+
		"\2il\7\'\2\2jl\5\6\4\2ki\3\2\2\2kj\3\2\2\2lm\3\2\2\2mk\3\2\2\2mn\3\2\2"+
		"\2no\3\2\2\2op\7\6\2\2p\13\3\2\2\2qu\5\26\f\2ru\5\36\20\2su\5\16\b\2t"+
		"q\3\2\2\2tr\3\2\2\2ts\3\2\2\2u\r\3\2\2\2vz\5\20\t\2wz\5\22\n\2xz\5\24"+
		"\13\2yv\3\2\2\2yw\3\2\2\2yx\3\2\2\2z\17\3\2\2\2{|\7\7\2\2|}\7$\2\2}\21"+
		"\3\2\2\2~\177\7\b\2\2\177\u0080\7$\2\2\u0080\23\3\2\2\2\u0081\u0082\7"+
		"\t\2\2\u0082\u0083\7$\2\2\u0083\25\3\2\2\2\u0084\u0088\5\30\r\2\u0085"+
		"\u0088\5\32\16\2\u0086\u0088\5\34\17\2\u0087\u0084\3\2\2\2\u0087\u0085"+
		"\3\2\2\2\u0087\u0086\3\2\2\2\u0088\27\3\2\2\2\u0089\u008a\7\f\2\2\u008a"+
		"\u008b\7\'\2\2\u008b\u008c\7\34\2\2\u008c\u008d\5\b\5\2\u008d\31\3\2\2"+
		"\2\u008e\u008f\7\'\2\2\u008f\u0090\7\34\2\2\u0090\u0091\5\b\5\2\u0091"+
		"\33\3\2\2\2\u0092\u0093\7\r\2\2\u0093\u0094\7\'\2\2\u0094\u00af\7%\2\2"+
		"\u0095\u0096\7\r\2\2\u0096\u0097\7\'\2\2\u0097\u0099\7 \2\2\u0098\u009a"+
		"\7\'\2\2\u0099\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u0099\3\2\2\2\u009b"+
		"\u009c\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u00af\7%\2\2\u009e\u009f\7\r"+
		"\2\2\u009f\u00a0\7\'\2\2\u00a0\u00a1\7\37\2\2\u00a1\u00a2\7\'\2\2\u00a2"+
		"\u00af\7%\2\2\u00a3\u00a4\7\r\2\2\u00a4\u00a5\7\'\2\2\u00a5\u00a6\7\37"+
		"\2\2\u00a6\u00a7\7\'\2\2\u00a7\u00a9\7 \2\2\u00a8\u00aa\7\'\2\2\u00a9"+
		"\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2"+
		"\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00af\7%\2\2\u00ae\u0092\3\2\2\2\u00ae"+
		"\u0095\3\2\2\2\u00ae\u009e\3\2\2\2\u00ae\u00a3\3\2\2\2\u00af\35\3\2\2"+
		"\2\u00b0\u00b7\5 \21\2\u00b1\u00b7\5\"\22\2\u00b2\u00b7\5$\23\2\u00b3"+
		"\u00b7\5&\24\2\u00b4\u00b7\5(\25\2\u00b5\u00b7\5*\26\2\u00b6\u00b0\3\2"+
		"\2\2\u00b6\u00b1\3\2\2\2\u00b6\u00b2\3\2\2\2\u00b6\u00b3\3\2\2\2\u00b6"+
		"\u00b4\3\2\2\2\u00b6\u00b5\3\2\2\2\u00b7\37\3\2\2\2\u00b8\u00b9\7\16\2"+
		"\2\u00b9\u00ba\7\5\2\2\u00ba\u00bb\5\b\5\2\u00bb\u00bc\7\6\2\2\u00bc\u00be"+
		"\7\3\2\2\u00bd\u00bf\5\b\5\2\u00be\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0"+
		"\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00df\7\4"+
		"\2\2\u00c3\u00c4\7\17\2\2\u00c4\u00c5\7\16\2\2\u00c5\u00c6\7\5\2\2\u00c6"+
		"\u00c7\5\b\5\2\u00c7\u00c8\7\6\2\2\u00c8\u00ca\7\3\2\2\u00c9\u00cb\5\b"+
		"\5\2\u00ca\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc"+
		"\u00cd\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf\7\4\2\2\u00cf\u00d1\3\2"+
		"\2\2\u00d0\u00c3\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2"+
		"\u00d3\3\2\2\2\u00d3\u00dd\3\2\2\2\u00d4\u00d5\7\17\2\2\u00d5\u00d7\7"+
		"\3\2\2\u00d6\u00d8\5\b\5\2\u00d7\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9"+
		"\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dc\7\4"+
		"\2\2\u00dc\u00de\3\2\2\2\u00dd\u00d4\3\2\2\2\u00dd\u00de\3\2\2\2\u00de"+
		"\u00e0\3\2\2\2\u00df\u00d0\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0!\3\2\2\2"+
		"\u00e1\u00e2\7\20\2\2\u00e2\u00e3\7\5\2\2\u00e3\u00e4\5\b\5\2\u00e4\u00e5"+
		"\7\n\2\2\u00e5\u00e6\5\b\5\2\u00e6\u00e7\7\n\2\2\u00e7\u00e8\5\b\5\2\u00e8"+
		"\u00e9\7\6\2\2\u00e9\u00eb\7\3\2\2\u00ea\u00ec\5\b\5\2\u00eb\u00ea\3\2"+
		"\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee"+
		"\u00ef\3\2\2\2\u00ef\u00f0\7\4\2\2\u00f0#\3\2\2\2\u00f1\u00f2\7\21\2\2"+
		"\u00f2\u00f3\7\5\2\2\u00f3\u00f4\5\b\5\2\u00f4\u00f5\7\6\2\2\u00f5\u00f7"+
		"\7\3\2\2\u00f6\u00f8\5\b\5\2\u00f7\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9"+
		"\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\7\4"+
		"\2\2\u00fc%\3\2\2\2\u00fd\u00fe\7\23\2\2\u00fe\'\3\2\2\2\u00ff\u0100\7"+
		"\24\2\2\u0100)\3\2\2\2\u0101\u0102\7\22\2\2\u0102\u0103\5\b\5\2\u0103"+
		"+\3\2\2\2\u0104\u0106\5\b\5\2\u0105\u0104\3\2\2\2\u0106\u0107\3\2\2\2"+
		"\u0107\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108-\3\2\2\2\35\64\66?FOXZ"+
		"bdkmty\u0087\u009b\u00ab\u00ae\u00b6\u00c0\u00cc\u00d2\u00d9\u00dd\u00df"+
		"\u00ed\u00f9\u0107";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}