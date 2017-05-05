// Generated from /home/dejawu/kythera/Kythera.g4 by ANTLR 4.7

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
	public static final int
		RULE_objRigidType = 0, RULE_objTypeEntry = 1, RULE_fnType = 2, RULE_fnTypeArg = 3, 
		RULE_fnTypeReturn = 4, RULE_objLiteral = 5, RULE_objLiteralEntry = 6, 
		RULE_fnLiteral = 7, RULE_fnLiteralArg = 8, RULE_literal = 9, RULE_type = 10, 
		RULE_identifier = 11, RULE_expression = 12, RULE_fnCallParamList = 13, 
		RULE_expBlock = 14, RULE_declarationStatement = 15, RULE_assignmentStatement = 16, 
		RULE_nameStatement = 17, RULE_importStatement = 18, RULE_includeStatement = 19, 
		RULE_exportStatement = 20, RULE_ifStatement = 21, RULE_whileStatement = 22, 
		RULE_breakStatement = 23, RULE_continueStatement = 24, RULE_returnStatement = 25, 
		RULE_program = 26;
	public static final String[] ruleNames = {
		"objRigidType", "objTypeEntry", "fnType", "fnTypeArg", "fnTypeReturn", 
		"objLiteral", "objLiteralEntry", "fnLiteral", "fnLiteralArg", "literal", 
		"type", "identifier", "expression", "fnCallParamList", "expBlock", "declarationStatement", 
		"assignmentStatement", "nameStatement", "importStatement", "includeStatement", 
		"exportStatement", "ifStatement", "whileStatement", "breakStatement", 
		"continueStatement", "returnStatement", "program"
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
	public static class ObjRigidTypeContext extends ParserRuleContext {
		public TerminalNode OBJ() { return getToken(KytheraParser.OBJ, 0); }
		public List<ObjTypeEntryContext> objTypeEntry() {
			return getRuleContexts(ObjTypeEntryContext.class);
		}
		public ObjTypeEntryContext objTypeEntry(int i) {
			return getRuleContext(ObjTypeEntryContext.class,i);
		}
		public ObjRigidTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objRigidType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KytheraListener ) ((KytheraListener)listener).enterObjRigidType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KytheraListener ) ((KytheraListener)listener).exitObjRigidType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KytheraVisitor ) return ((KytheraVisitor<? extends T>)visitor).visitObjRigidType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjRigidTypeContext objRigidType() throws RecognitionException {
		ObjRigidTypeContext _localctx = new ObjRigidTypeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_objRigidType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(OBJ);
			setState(55);
			match(T__0);
			setState(59);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(56);
					objTypeEntry();
					}
					} 
				}
				setState(61);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(62);
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

	public static class ObjTypeEntryContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ObjTypeEntryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objTypeEntry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KytheraListener ) ((KytheraListener)listener).enterObjTypeEntry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KytheraListener ) ((KytheraListener)listener).exitObjTypeEntry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KytheraVisitor ) return ((KytheraVisitor<? extends T>)visitor).visitObjTypeEntry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjTypeEntryContext objTypeEntry() throws RecognitionException {
		ObjTypeEntryContext _localctx = new ObjTypeEntryContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_objTypeEntry);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			type();
			setState(65);
			identifier();
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

	public static class FnTypeContext extends ParserRuleContext {
		public TerminalNode FN() { return getToken(KytheraParser.FN, 0); }
		public FnTypeReturnContext fnTypeReturn() {
			return getRuleContext(FnTypeReturnContext.class,0);
		}
		public List<FnTypeArgContext> fnTypeArg() {
			return getRuleContexts(FnTypeArgContext.class);
		}
		public FnTypeArgContext fnTypeArg(int i) {
			return getRuleContext(FnTypeArgContext.class,i);
		}
		public FnTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fnType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KytheraListener ) ((KytheraListener)listener).enterFnType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KytheraListener ) ((KytheraListener)listener).exitFnType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KytheraVisitor ) return ((KytheraVisitor<? extends T>)visitor).visitFnType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FnTypeContext fnType() throws RecognitionException {
		FnTypeContext _localctx = new FnTypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_fnType);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(FN);
			setState(68);
			match(T__2);
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << INT) | (1L << FLOAT) | (1L << STR) | (1L << FN) | (1L << OBJ) | (1L << NULL) | (1L << Identifier))) != 0)) {
				{
				setState(69);
				fnTypeArg();
				setState(74);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(70);
						match(T__3);
						setState(71);
						fnTypeArg();
						}
						} 
					}
					setState(76);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				}
				}
			}

			setState(79);
			match(T__4);
			setState(80);
			match(T__5);
			setState(81);
			fnTypeReturn();
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

	public static class FnTypeArgContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FnTypeArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fnTypeArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KytheraListener ) ((KytheraListener)listener).enterFnTypeArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KytheraListener ) ((KytheraListener)listener).exitFnTypeArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KytheraVisitor ) return ((KytheraVisitor<? extends T>)visitor).visitFnTypeArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FnTypeArgContext fnTypeArg() throws RecognitionException {
		FnTypeArgContext _localctx = new FnTypeArgContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_fnTypeArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			type();
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

	public static class FnTypeReturnContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FnTypeReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fnTypeReturn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KytheraListener ) ((KytheraListener)listener).enterFnTypeReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KytheraListener ) ((KytheraListener)listener).exitFnTypeReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KytheraVisitor ) return ((KytheraVisitor<? extends T>)visitor).visitFnTypeReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FnTypeReturnContext fnTypeReturn() throws RecognitionException {
		FnTypeReturnContext _localctx = new FnTypeReturnContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_fnTypeReturn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			type();
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

	public static class ObjLiteralContext extends ParserRuleContext {
		public List<ObjLiteralEntryContext> objLiteralEntry() {
			return getRuleContexts(ObjLiteralEntryContext.class);
		}
		public ObjLiteralEntryContext objLiteralEntry(int i) {
			return getRuleContext(ObjLiteralEntryContext.class,i);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KytheraVisitor ) return ((KytheraVisitor<? extends T>)visitor).visitObjLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjLiteralContext objLiteral() throws RecognitionException {
		ObjLiteralContext _localctx = new ObjLiteralContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_objLiteral);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(T__0);
			setState(91);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(88);
					objLiteralEntry();
					}
					} 
				}
				setState(93);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(94);
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

	public static class ObjLiteralEntryContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASSIGNMENT_OPERATOR() { return getToken(KytheraParser.ASSIGNMENT_OPERATOR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ObjLiteralEntryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objLiteralEntry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KytheraListener ) ((KytheraListener)listener).enterObjLiteralEntry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KytheraListener ) ((KytheraListener)listener).exitObjLiteralEntry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KytheraVisitor ) return ((KytheraVisitor<? extends T>)visitor).visitObjLiteralEntry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjLiteralEntryContext objLiteralEntry() throws RecognitionException {
		ObjLiteralEntryContext _localctx = new ObjLiteralEntryContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_objLiteralEntry);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			identifier();
			setState(97);
			match(ASSIGNMENT_OPERATOR);
			setState(98);
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

	public static class FnLiteralContext extends ParserRuleContext {
		public TerminalNode FN() { return getToken(KytheraParser.FN, 0); }
		public List<FnLiteralArgContext> fnLiteralArg() {
			return getRuleContexts(FnLiteralArgContext.class);
		}
		public FnLiteralArgContext fnLiteralArg(int i) {
			return getRuleContext(FnLiteralArgContext.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpBlockContext expBlock() {
			return getRuleContext(ExpBlockContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KytheraVisitor ) return ((KytheraVisitor<? extends T>)visitor).visitFnLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FnLiteralContext fnLiteral() throws RecognitionException {
		FnLiteralContext _localctx = new FnLiteralContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_fnLiteral);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(FN);
			setState(101);
			match(T__2);
			setState(102);
			fnLiteralArg();
			setState(107);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(103);
					match(T__3);
					setState(104);
					fnLiteralArg();
					}
					} 
				}
				setState(109);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(110);
			match(T__4);
			setState(111);
			match(T__5);
			setState(112);
			type();
			setState(113);
			expBlock();
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

	public static class FnLiteralArgContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(KytheraParser.Identifier, 0); }
		public FnLiteralArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fnLiteralArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KytheraListener ) ((KytheraListener)listener).enterFnLiteralArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KytheraListener ) ((KytheraListener)listener).exitFnLiteralArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KytheraVisitor ) return ((KytheraVisitor<? extends T>)visitor).visitFnLiteralArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FnLiteralArgContext fnLiteralArg() throws RecognitionException {
		FnLiteralArgContext _localctx = new FnLiteralArgContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_fnLiteralArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			type();
			setState(116);
			match(Identifier);
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
		public TerminalNode NULL() { return getToken(KytheraParser.NULL, 0); }
		public TerminalNode TRUE() { return getToken(KytheraParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(KytheraParser.FALSE, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KytheraVisitor ) return ((KytheraVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_literal);
		try {
			setState(126);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IntLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				match(IntLiteral);
				}
				break;
			case FloatLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				match(FloatLiteral);
				}
				break;
			case StrLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(120);
				match(StrLiteral);
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 4);
				{
				setState(121);
				match(NULL);
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 5);
				{
				setState(122);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 6);
				{
				setState(123);
				match(FALSE);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 7);
				{
				setState(124);
				objLiteral();
				}
				break;
			case FN:
				enterOuterAlt(_localctx, 8);
				{
				setState(125);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode BOOL() { return getToken(KytheraParser.BOOL, 0); }
		public TerminalNode INT() { return getToken(KytheraParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(KytheraParser.FLOAT, 0); }
		public TerminalNode STR() { return getToken(KytheraParser.STR, 0); }
		public TerminalNode NULL() { return getToken(KytheraParser.NULL, 0); }
		public TerminalNode OBJ() { return getToken(KytheraParser.OBJ, 0); }
		public FnTypeContext fnType() {
			return getRuleContext(FnTypeContext.class,0);
		}
		public ObjRigidTypeContext objRigidType() {
			return getRuleContext(ObjRigidTypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(KytheraParser.Identifier, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KytheraListener ) ((KytheraListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KytheraListener ) ((KytheraListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KytheraVisitor ) return ((KytheraVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_type);
		try {
			setState(137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				match(BOOL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				match(INT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(130);
				match(FLOAT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(131);
				match(STR);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(132);
				match(NULL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(133);
				match(OBJ);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(134);
				fnType();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(135);
				objRigidType();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(136);
				match(Identifier);
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(KytheraParser.Identifier, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KytheraListener ) ((KytheraListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KytheraListener ) ((KytheraListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KytheraVisitor ) return ((KytheraVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(Identifier);
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
		public TerminalNode TYPEOF() { return getToken(KytheraParser.TYPEOF, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode NEW() { return getToken(KytheraParser.NEW, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode NOT_OPERATOR() { return getToken(KytheraParser.NOT_OPERATOR, 0); }
		public TerminalNode LET() { return getToken(KytheraParser.LET, 0); }
		public TerminalNode DOT() { return getToken(KytheraParser.DOT, 0); }
		public TerminalNode Identifier() { return getToken(KytheraParser.Identifier, 0); }
		public TerminalNode ASSIGNMENT_OPERATOR() { return getToken(KytheraParser.ASSIGNMENT_OPERATOR, 0); }
		public DeclarationStatementContext declarationStatement() {
			return getRuleContext(DeclarationStatementContext.class,0);
		}
		public AssignmentStatementContext assignmentStatement() {
			return getRuleContext(AssignmentStatementContext.class,0);
		}
		public NameStatementContext nameStatement() {
			return getRuleContext(NameStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
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
		public ImportStatementContext importStatement() {
			return getRuleContext(ImportStatementContext.class,0);
		}
		public ExportStatementContext exportStatement() {
			return getRuleContext(ExportStatementContext.class,0);
		}
		public IncludeStatementContext includeStatement() {
			return getRuleContext(IncludeStatementContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode BOOLEAN_COMPARISON() { return getToken(KytheraParser.BOOLEAN_COMPARISON, 0); }
		public TerminalNode BOOLEAN_OPERATOR() { return getToken(KytheraParser.BOOLEAN_OPERATOR, 0); }
		public TerminalNode ARITH_OPERATOR() { return getToken(KytheraParser.ARITH_OPERATOR, 0); }
		public FnCallParamListContext fnCallParamList() {
			return getRuleContext(FnCallParamListContext.class,0);
		}
		public TerminalNode AS() { return getToken(KytheraParser.AS, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KytheraVisitor ) return ((KytheraVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
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
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(142);
				match(TYPEOF);
				setState(143);
				expression(24);
				}
				break;
			case 2:
				{
				setState(144);
				match(NEW);
				setState(145);
				type();
				}
				break;
			case 3:
				{
				setState(146);
				match(NOT_OPERATOR);
				setState(147);
				expression(18);
				}
				break;
			case 4:
				{
				setState(148);
				match(LET);
				setState(149);
				expression(0);
				setState(150);
				match(DOT);
				setState(151);
				match(Identifier);
				setState(152);
				match(ASSIGNMENT_OPERATOR);
				setState(153);
				expression(16);
				}
				break;
			case 5:
				{
				setState(155);
				declarationStatement();
				}
				break;
			case 6:
				{
				setState(156);
				assignmentStatement();
				}
				break;
			case 7:
				{
				setState(157);
				nameStatement();
				}
				break;
			case 8:
				{
				setState(158);
				ifStatement();
				}
				break;
			case 9:
				{
				setState(159);
				whileStatement();
				}
				break;
			case 10:
				{
				setState(160);
				breakStatement();
				}
				break;
			case 11:
				{
				setState(161);
				continueStatement();
				}
				break;
			case 12:
				{
				setState(162);
				returnStatement();
				}
				break;
			case 13:
				{
				setState(163);
				importStatement();
				}
				break;
			case 14:
				{
				setState(164);
				exportStatement();
				}
				break;
			case 15:
				{
				setState(165);
				includeStatement();
				}
				break;
			case 16:
				{
				setState(166);
				identifier();
				}
				break;
			case 17:
				{
				setState(167);
				literal();
				}
				break;
			case 18:
				{
				setState(168);
				match(T__2);
				setState(169);
				expression(0);
				setState(170);
				match(T__4);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(201);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(199);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(174);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(175);
						match(BOOLEAN_COMPARISON);
						setState(176);
						expression(22);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(177);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(178);
						match(BOOLEAN_OPERATOR);
						setState(179);
						expression(21);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(180);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(181);
						match(ARITH_OPERATOR);
						setState(182);
						expression(20);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(183);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(184);
						match(DOT);
						setState(185);
						match(Identifier);
						setState(186);
						match(ASSIGNMENT_OPERATOR);
						setState(187);
						expression(16);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(188);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(189);
						match(T__2);
						setState(190);
						fnCallParamList();
						setState(191);
						match(T__4);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(193);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(194);
						match(AS);
						setState(195);
						type();
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(196);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(197);
						match(DOT);
						setState(198);
						match(Identifier);
						}
						break;
					}
					} 
				}
				setState(203);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	public static class FnCallParamListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public FnCallParamListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fnCallParamList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KytheraListener ) ((KytheraListener)listener).enterFnCallParamList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KytheraListener ) ((KytheraListener)listener).exitFnCallParamList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KytheraVisitor ) return ((KytheraVisitor<? extends T>)visitor).visitFnCallParamList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FnCallParamListContext fnCallParamList() throws RecognitionException {
		FnCallParamListContext _localctx = new FnCallParamListContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_fnCallParamList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << LET) | (1L << NAME) | (1L << IF) | (1L << WHILE) | (1L << RETURN) | (1L << BREAK) | (1L << CONTINUE) | (1L << NEW) | (1L << TYPEOF) | (1L << FN) | (1L << IMPORT) | (1L << EXPORT) | (1L << INCLUDE) | (1L << NOT_OPERATOR) | (1L << IntLiteral) | (1L << FloatLiteral) | (1L << StrLiteral) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << Identifier))) != 0)) {
				{
				{
				setState(204);
				expression(0);
				}
				setState(209);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(205);
						match(T__3);
						setState(206);
						expression(0);
						}
						} 
					}
					setState(211);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				}
				}
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

	public static class ExpBlockContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KytheraListener ) ((KytheraListener)listener).enterExpBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KytheraListener ) ((KytheraListener)listener).exitExpBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KytheraVisitor ) return ((KytheraVisitor<? extends T>)visitor).visitExpBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpBlockContext expBlock() throws RecognitionException {
		ExpBlockContext _localctx = new ExpBlockContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_expBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(T__0);
			setState(216); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(215);
				expression(0);
				}
				}
				setState(218); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << LET) | (1L << NAME) | (1L << IF) | (1L << WHILE) | (1L << RETURN) | (1L << BREAK) | (1L << CONTINUE) | (1L << NEW) | (1L << TYPEOF) | (1L << FN) | (1L << IMPORT) | (1L << EXPORT) | (1L << INCLUDE) | (1L << NOT_OPERATOR) | (1L << IntLiteral) | (1L << FloatLiteral) | (1L << StrLiteral) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << Identifier))) != 0) );
			setState(220);
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

	public static class DeclarationStatementContext extends ParserRuleContext {
		public TerminalNode LET() { return getToken(KytheraParser.LET, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KytheraVisitor ) return ((KytheraVisitor<? extends T>)visitor).visitDeclarationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationStatementContext declarationStatement() throws RecognitionException {
		DeclarationStatementContext _localctx = new DeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_declarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(LET);
			setState(223);
			identifier();
			setState(224);
			match(ASSIGNMENT_OPERATOR);
			setState(225);
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KytheraVisitor ) return ((KytheraVisitor<? extends T>)visitor).visitAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentStatementContext assignmentStatement() throws RecognitionException {
		AssignmentStatementContext _localctx = new AssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_assignmentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			identifier();
			setState(228);
			match(ASSIGNMENT_OPERATOR);
			setState(229);
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
		public TerminalNode Identifier() { return getToken(KytheraParser.Identifier, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KytheraVisitor ) return ((KytheraVisitor<? extends T>)visitor).visitNameStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameStatementContext nameStatement() throws RecognitionException {
		NameStatementContext _localctx = new NameStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_nameStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(NAME);
			setState(232);
			match(Identifier);
			setState(233);
			type();
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
		public TerminalNode IMPORT() { return getToken(KytheraParser.IMPORT, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KytheraVisitor ) return ((KytheraVisitor<? extends T>)visitor).visitImportStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportStatementContext importStatement() throws RecognitionException {
		ImportStatementContext _localctx = new ImportStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_importStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(IMPORT);
			setState(236);
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
		public TerminalNode INCLUDE() { return getToken(KytheraParser.INCLUDE, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KytheraVisitor ) return ((KytheraVisitor<? extends T>)visitor).visitIncludeStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncludeStatementContext includeStatement() throws RecognitionException {
		IncludeStatementContext _localctx = new IncludeStatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_includeStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(INCLUDE);
			setState(239);
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
		public TerminalNode EXPORT() { return getToken(KytheraParser.EXPORT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KytheraVisitor ) return ((KytheraVisitor<? extends T>)visitor).visitExportStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExportStatementContext exportStatement() throws RecognitionException {
		ExportStatementContext _localctx = new ExportStatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_exportStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(EXPORT);
			setState(242);
			identifier();
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
		public TerminalNode IF() { return getToken(KytheraParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<ExpBlockContext> expBlock() {
			return getRuleContexts(ExpBlockContext.class);
		}
		public ExpBlockContext expBlock(int i) {
			return getRuleContext(ExpBlockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(KytheraParser.ELSE, 0); }
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KytheraVisitor ) return ((KytheraVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(IF);
			setState(245);
			expression(0);
			setState(246);
			expBlock();
			setState(252);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(247);
				match(ELSE);
				setState(250);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IF:
					{
					setState(248);
					ifStatement();
					}
					break;
				case T__0:
					{
					setState(249);
					expBlock();
					}
					break;
				default:
					throw new NoViableAltException(this);
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

	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(KytheraParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpBlockContext expBlock() {
			return getRuleContext(ExpBlockContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KytheraVisitor ) return ((KytheraVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(WHILE);
			setState(255);
			expression(0);
			setState(256);
			expBlock();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KytheraVisitor ) return ((KytheraVisitor<? extends T>)visitor).visitBreakStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KytheraVisitor ) return ((KytheraVisitor<? extends T>)visitor).visitContinueStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_continueStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KytheraVisitor ) return ((KytheraVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(RETURN);
			setState(263);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KytheraVisitor ) return ((KytheraVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(265);
				expression(0);
				}
				}
				setState(268); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << LET) | (1L << NAME) | (1L << IF) | (1L << WHILE) | (1L << RETURN) | (1L << BREAK) | (1L << CONTINUE) | (1L << NEW) | (1L << TYPEOF) | (1L << FN) | (1L << IMPORT) | (1L << EXPORT) | (1L << INCLUDE) | (1L << NOT_OPERATOR) | (1L << IntLiteral) | (1L << FloatLiteral) | (1L << StrLiteral) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << Identifier))) != 0) );
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
		case 12:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 21);
		case 1:
			return precpred(_ctx, 20);
		case 2:
			return precpred(_ctx, 19);
		case 3:
			return precpred(_ctx, 15);
		case 4:
			return precpred(_ctx, 25);
		case 5:
			return precpred(_ctx, 23);
		case 6:
			return precpred(_ctx, 17);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3/\u0111\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\7\2<\n\2\f\2\16\2?\13\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\7\4K\n\4\f\4\16\4N\13\4\5\4P\n\4"+
		"\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\7\7\\\n\7\f\7\16\7_\13\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\7\tl\n\t\f\t\16\to\13\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13"+
		"\u0081\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u008c\n\f\3\r\3\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\5\16\u00af\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\7\16\u00ca\n\16\f\16\16\16\u00cd\13\16\3\17\3\17\3\17"+
		"\7\17\u00d2\n\17\f\17\16\17\u00d5\13\17\5\17\u00d7\n\17\3\20\3\20\6\20"+
		"\u00db\n\20\r\20\16\20\u00dc\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3"+
		"\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3"+
		"\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u00fd\n\27\5\27\u00ff\n\27"+
		"\3\30\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\34\6\34\u010d"+
		"\n\34\r\34\16\34\u010e\3\34\7=L]m\u00d3\3\32\35\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\66\2\2\2\u0127\28\3\2\2\2\4B\3\2\2\2"+
		"\6E\3\2\2\2\bU\3\2\2\2\nW\3\2\2\2\fY\3\2\2\2\16b\3\2\2\2\20f\3\2\2\2\22"+
		"u\3\2\2\2\24\u0080\3\2\2\2\26\u008b\3\2\2\2\30\u008d\3\2\2\2\32\u00ae"+
		"\3\2\2\2\34\u00d6\3\2\2\2\36\u00d8\3\2\2\2 \u00e0\3\2\2\2\"\u00e5\3\2"+
		"\2\2$\u00e9\3\2\2\2&\u00ed\3\2\2\2(\u00f0\3\2\2\2*\u00f3\3\2\2\2,\u00f6"+
		"\3\2\2\2.\u0100\3\2\2\2\60\u0104\3\2\2\2\62\u0106\3\2\2\2\64\u0108\3\2"+
		"\2\2\66\u010c\3\2\2\289\7\33\2\29=\7\3\2\2:<\5\4\3\2;:\3\2\2\2<?\3\2\2"+
		"\2=>\3\2\2\2=;\3\2\2\2>@\3\2\2\2?=\3\2\2\2@A\7\4\2\2A\3\3\2\2\2BC\5\26"+
		"\f\2CD\5\30\r\2D\5\3\2\2\2EF\7\32\2\2FO\7\5\2\2GL\5\b\5\2HI\7\6\2\2IK"+
		"\5\b\5\2JH\3\2\2\2KN\3\2\2\2LM\3\2\2\2LJ\3\2\2\2MP\3\2\2\2NL\3\2\2\2O"+
		"G\3\2\2\2OP\3\2\2\2PQ\3\2\2\2QR\7\7\2\2RS\7\b\2\2ST\5\n\6\2T\7\3\2\2\2"+
		"UV\5\26\f\2V\t\3\2\2\2WX\5\26\f\2X\13\3\2\2\2Y]\7\3\2\2Z\\\5\16\b\2[Z"+
		"\3\2\2\2\\_\3\2\2\2]^\3\2\2\2][\3\2\2\2^`\3\2\2\2_]\3\2\2\2`a\7\4\2\2"+
		"a\r\3\2\2\2bc\5\30\r\2cd\7 \2\2de\5\32\16\2e\17\3\2\2\2fg\7\32\2\2gh\7"+
		"\5\2\2hm\5\22\n\2ij\7\6\2\2jl\5\22\n\2ki\3\2\2\2lo\3\2\2\2mn\3\2\2\2m"+
		"k\3\2\2\2np\3\2\2\2om\3\2\2\2pq\7\7\2\2qr\7\b\2\2rs\5\26\f\2st\5\36\20"+
		"\2t\21\3\2\2\2uv\5\26\f\2vw\7.\2\2w\23\3\2\2\2x\u0081\7(\2\2y\u0081\7"+
		")\2\2z\u0081\7*\2\2{\u0081\7-\2\2|\u0081\7+\2\2}\u0081\7,\2\2~\u0081\5"+
		"\f\7\2\177\u0081\5\20\t\2\u0080x\3\2\2\2\u0080y\3\2\2\2\u0080z\3\2\2\2"+
		"\u0080{\3\2\2\2\u0080|\3\2\2\2\u0080}\3\2\2\2\u0080~\3\2\2\2\u0080\177"+
		"\3\2\2\2\u0081\25\3\2\2\2\u0082\u008c\7\26\2\2\u0083\u008c\7\27\2\2\u0084"+
		"\u008c\7\30\2\2\u0085\u008c\7\31\2\2\u0086\u008c\7-\2\2\u0087\u008c\7"+
		"\33\2\2\u0088\u008c\5\6\4\2\u0089\u008c\5\2\2\2\u008a\u008c\7.\2\2\u008b"+
		"\u0082\3\2\2\2\u008b\u0083\3\2\2\2\u008b\u0084\3\2\2\2\u008b\u0085\3\2"+
		"\2\2\u008b\u0086\3\2\2\2\u008b\u0087\3\2\2\2\u008b\u0088\3\2\2\2\u008b"+
		"\u0089\3\2\2\2\u008b\u008a\3\2\2\2\u008c\27\3\2\2\2\u008d\u008e\7.\2\2"+
		"\u008e\31\3\2\2\2\u008f\u0090\b\16\1\2\u0090\u0091\7\25\2\2\u0091\u00af"+
		"\5\32\16\32\u0092\u0093\7\23\2\2\u0093\u00af\5\26\f\2\u0094\u0095\7#\2"+
		"\2\u0095\u00af\5\32\16\24\u0096\u0097\7\n\2\2\u0097\u0098\5\32\16\2\u0098"+
		"\u0099\7\'\2\2\u0099\u009a\7.\2\2\u009a\u009b\7 \2\2\u009b\u009c\5\32"+
		"\16\22\u009c\u00af\3\2\2\2\u009d\u00af\5 \21\2\u009e\u00af\5\"\22\2\u009f"+
		"\u00af\5$\23\2\u00a0\u00af\5,\27\2\u00a1\u00af\5.\30\2\u00a2\u00af\5\60"+
		"\31\2\u00a3\u00af\5\62\32\2\u00a4\u00af\5\64\33\2\u00a5\u00af\5&\24\2"+
		"\u00a6\u00af\5*\26\2\u00a7\u00af\5(\25\2\u00a8\u00af\5\30\r\2\u00a9\u00af"+
		"\5\24\13\2\u00aa\u00ab\7\5\2\2\u00ab\u00ac\5\32\16\2\u00ac\u00ad\7\7\2"+
		"\2\u00ad\u00af\3\2\2\2\u00ae\u008f\3\2\2\2\u00ae\u0092\3\2\2\2\u00ae\u0094"+
		"\3\2\2\2\u00ae\u0096\3\2\2\2\u00ae\u009d\3\2\2\2\u00ae\u009e\3\2\2\2\u00ae"+
		"\u009f\3\2\2\2\u00ae\u00a0\3\2\2\2\u00ae\u00a1\3\2\2\2\u00ae\u00a2\3\2"+
		"\2\2\u00ae\u00a3\3\2\2\2\u00ae\u00a4\3\2\2\2\u00ae\u00a5\3\2\2\2\u00ae"+
		"\u00a6\3\2\2\2\u00ae\u00a7\3\2\2\2\u00ae\u00a8\3\2\2\2\u00ae\u00a9\3\2"+
		"\2\2\u00ae\u00aa\3\2\2\2\u00af\u00cb\3\2\2\2\u00b0\u00b1\f\27\2\2\u00b1"+
		"\u00b2\7!\2\2\u00b2\u00ca\5\32\16\30\u00b3\u00b4\f\26\2\2\u00b4\u00b5"+
		"\7\"\2\2\u00b5\u00ca\5\32\16\27\u00b6\u00b7\f\25\2\2\u00b7\u00b8\7$\2"+
		"\2\u00b8\u00ca\5\32\16\26\u00b9\u00ba\f\21\2\2\u00ba\u00bb\7\'\2\2\u00bb"+
		"\u00bc\7.\2\2\u00bc\u00bd\7 \2\2\u00bd\u00ca\5\32\16\22\u00be\u00bf\f"+
		"\33\2\2\u00bf\u00c0\7\5\2\2\u00c0\u00c1\5\34\17\2\u00c1\u00c2\7\7\2\2"+
		"\u00c2\u00ca\3\2\2\2\u00c3\u00c4\f\31\2\2\u00c4\u00c5\7\24\2\2\u00c5\u00ca"+
		"\5\26\f\2\u00c6\u00c7\f\23\2\2\u00c7\u00c8\7\'\2\2\u00c8\u00ca\7.\2\2"+
		"\u00c9\u00b0\3\2\2\2\u00c9\u00b3\3\2\2\2\u00c9\u00b6\3\2\2\2\u00c9\u00b9"+
		"\3\2\2\2\u00c9\u00be\3\2\2\2\u00c9\u00c3\3\2\2\2\u00c9\u00c6\3\2\2\2\u00ca"+
		"\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\33\3\2\2"+
		"\2\u00cd\u00cb\3\2\2\2\u00ce\u00d3\5\32\16\2\u00cf\u00d0\7\6\2\2\u00d0"+
		"\u00d2\5\32\16\2\u00d1\u00cf\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d4\3"+
		"\2\2\2\u00d3\u00d1\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6"+
		"\u00ce\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\35\3\2\2\2\u00d8\u00da\7\3\2"+
		"\2\u00d9\u00db\5\32\16\2\u00da\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc"+
		"\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00df\7\4"+
		"\2\2\u00df\37\3\2\2\2\u00e0\u00e1\7\n\2\2\u00e1\u00e2\5\30\r\2\u00e2\u00e3"+
		"\7 \2\2\u00e3\u00e4\5\32\16\2\u00e4!\3\2\2\2\u00e5\u00e6\5\30\r\2\u00e6"+
		"\u00e7\7 \2\2\u00e7\u00e8\5\32\16\2\u00e8#\3\2\2\2\u00e9\u00ea\7\13\2"+
		"\2\u00ea\u00eb\7.\2\2\u00eb\u00ec\5\26\f\2\u00ec%\3\2\2\2\u00ed\u00ee"+
		"\7\35\2\2\u00ee\u00ef\7*\2\2\u00ef\'\3\2\2\2\u00f0\u00f1\7\37\2\2\u00f1"+
		"\u00f2\7*\2\2\u00f2)\3\2\2\2\u00f3\u00f4\7\36\2\2\u00f4\u00f5\5\30\r\2"+
		"\u00f5+\3\2\2\2\u00f6\u00f7\7\f\2\2\u00f7\u00f8\5\32\16\2\u00f8\u00fe"+
		"\5\36\20\2\u00f9\u00fc\7\r\2\2\u00fa\u00fd\5,\27\2\u00fb\u00fd\5\36\20"+
		"\2\u00fc\u00fa\3\2\2\2\u00fc\u00fb\3\2\2\2\u00fd\u00ff\3\2\2\2\u00fe\u00f9"+
		"\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff-\3\2\2\2\u0100\u0101\7\16\2\2\u0101"+
		"\u0102\5\32\16\2\u0102\u0103\5\36\20\2\u0103/\3\2\2\2\u0104\u0105\7\21"+
		"\2\2\u0105\61\3\2\2\2\u0106\u0107\7\22\2\2\u0107\63\3\2\2\2\u0108\u0109"+
		"\7\20\2\2\u0109\u010a\5\32\16\2\u010a\65\3\2\2\2\u010b\u010d\5\32\16\2"+
		"\u010c\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f"+
		"\3\2\2\2\u010f\67\3\2\2\2\22=LO]m\u0080\u008b\u00ae\u00c9\u00cb\u00d3"+
		"\u00d6\u00dc\u00fc\u00fe\u010e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}