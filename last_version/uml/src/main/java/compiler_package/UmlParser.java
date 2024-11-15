// Generated from Uml.g4 by ANTLR 4.13.2

    package compiler_package;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class UmlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		EQ=1, COMP=2, NEQ=3, SXREL=4, DXREL=5, LTE=6, GTE=7, MOD=8, ADD=9, UNDREL=10, 
		MUL=11, DIV=12, AADD=13, SSUB=14, DP=15, SC=16, DOT=17, COMMA=18, LP=19, 
		RP=20, LBR=21, RBR=22, LB=23, RB=24, ABSTRACT=25, BOOLEAN_TYPE=26, BYTE=27, 
		CHAR_TYPE=28, CLASS=29, CONSTRUCTOR=30, CONST=31, DOUBLE_TYPE=32, ENUM=33, 
		EXTENDS=34, FALSE=35, FINAL=36, FLOAT_TYPE=37, IMPLEMENTS=38, INHERITS=39, 
		INT_TYPE=40, INTERFACE=41, LONG_TYPE=42, NONUNIQUE=43, NULL=44, ORDER=45, 
		PRIVATE=46, PROTECTED=47, PUBLIC=48, PACKAGE=49, READONLY=50, SET=51, 
		MULTISET=52, ORDEREDSET=53, LIST=54, SHORT=55, STATIC=56, THROWS=57, STRING_TYPE=58, 
		TRUE=59, UNIQUE=60, UNORDERED=61, VOID_TYPE=62, SHARED=63, COMPOSED=64, 
		ATTRIBUTE=65, RELATIONS=66, OPERATION=67, MIN=68, MAX=69, ID=70, INT=71, 
		FLOAT=72, COMMENT=73, WS=74, STRING=75, CHAR=76, ERROR_TOKEN=77;
	public static final int
		RULE_start = 0, RULE_classDefinitionRule = 1, RULE_enumDefinitionRule = 2, 
		RULE_relationsDefinitionRule = 3, RULE_classCodeRule = 4, RULE_enumCodeRule = 5, 
		RULE_relationCodeRule = 6, RULE_attributeDeclarationRule = 7, RULE_visibilityRule = 8, 
		RULE_arrayTypeRule = 9, RULE_typeRule = 10, RULE_relationTypeRule = 11, 
		RULE_multiplicityRule = 12, RULE_operationDeclarationRule = 13, RULE_constructorDeclarationRule = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "classDefinitionRule", "enumDefinitionRule", "relationsDefinitionRule", 
			"classCodeRule", "enumCodeRule", "relationCodeRule", "attributeDeclarationRule", 
			"visibilityRule", "arrayTypeRule", "typeRule", "relationTypeRule", "multiplicityRule", 
			"operationDeclarationRule", "constructorDeclarationRule"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'%'", "'+'", 
			"'-'", "'*'", "'/'", "'++'", "'--'", "':'", "';'", "'.'", "','", "'('", 
			"')'", "'{'", "'}'", "'['", "']'", "'abstract'", "'boolean'", "'byte'", 
			"'char'", "'class'", "'constructor'", "'const'", "'double'", "'enum'", 
			"'extends'", "'false'", "'final'", "'float'", "'implements'", "'inherits'", 
			"'int'", "'interface'", "'long'", "'non-unique'", "'null'", "'ordered'", 
			"'private'", "'protected'", "'public'", "'package'", "'readOnly'", "'Set'", 
			"'Multi-set'", "'Ordered-set'", "'List'", "'short'", "'static'", "'throws'", 
			"'String'", "'true'", "'unique'", "'unordered'", "'void'", "'shared'", 
			"'composed'", "'attribute'", "'relations'", "'operation'", "'min'", "'max'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "EQ", "COMP", "NEQ", "SXREL", "DXREL", "LTE", "GTE", "MOD", "ADD", 
			"UNDREL", "MUL", "DIV", "AADD", "SSUB", "DP", "SC", "DOT", "COMMA", "LP", 
			"RP", "LBR", "RBR", "LB", "RB", "ABSTRACT", "BOOLEAN_TYPE", "BYTE", "CHAR_TYPE", 
			"CLASS", "CONSTRUCTOR", "CONST", "DOUBLE_TYPE", "ENUM", "EXTENDS", "FALSE", 
			"FINAL", "FLOAT_TYPE", "IMPLEMENTS", "INHERITS", "INT_TYPE", "INTERFACE", 
			"LONG_TYPE", "NONUNIQUE", "NULL", "ORDER", "PRIVATE", "PROTECTED", "PUBLIC", 
			"PACKAGE", "READONLY", "SET", "MULTISET", "ORDEREDSET", "LIST", "SHORT", 
			"STATIC", "THROWS", "STRING_TYPE", "TRUE", "UNIQUE", "UNORDERED", "VOID_TYPE", 
			"SHARED", "COMPOSED", "ATTRIBUTE", "RELATIONS", "OPERATION", "MIN", "MAX", 
			"ID", "INT", "FLOAT", "COMMENT", "WS", "STRING", "CHAR", "ERROR_TOKEN"
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

	@Override
	public String getGrammarFileName() { return "Uml.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    SemanticHandler h = new SemanticHandler();

	    public SemanticHandler getHandler() {
	        return h;
	    }

	public UmlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public List<ClassDefinitionRuleContext> classDefinitionRule() {
			return getRuleContexts(ClassDefinitionRuleContext.class);
		}
		public ClassDefinitionRuleContext classDefinitionRule(int i) {
			return getRuleContext(ClassDefinitionRuleContext.class,i);
		}
		public List<EnumDefinitionRuleContext> enumDefinitionRule() {
			return getRuleContexts(EnumDefinitionRuleContext.class);
		}
		public EnumDefinitionRuleContext enumDefinitionRule(int i) {
			return getRuleContext(EnumDefinitionRuleContext.class,i);
		}
		public RelationsDefinitionRuleContext relationsDefinitionRule() {
			return getRuleContext(RelationsDefinitionRuleContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UmlListener ) ((UmlListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UmlListener ) ((UmlListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UmlVisitor ) return ((UmlVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ABSTRACT || _la==CLASS) {
				{
				{
				setState(30);
				classDefinitionRule();
				}
				}
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(39);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(36);
					enumDefinitionRule();
					}
					} 
				}
				setState(41);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RELATIONS) {
				{
				setState(42);
				relationsDefinitionRule();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClassDefinitionRuleContext extends ParserRuleContext {
		public Token c;
		public TerminalNode CLASS() { return getToken(UmlParser.CLASS, 0); }
		public ClassCodeRuleContext classCodeRule() {
			return getRuleContext(ClassCodeRuleContext.class,0);
		}
		public TerminalNode ID() { return getToken(UmlParser.ID, 0); }
		public TerminalNode ABSTRACT() { return getToken(UmlParser.ABSTRACT, 0); }
		public ClassDefinitionRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDefinitionRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UmlListener ) ((UmlListener)listener).enterClassDefinitionRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UmlListener ) ((UmlListener)listener).exitClassDefinitionRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UmlVisitor ) return ((UmlVisitor<? extends T>)visitor).visitClassDefinitionRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDefinitionRuleContext classDefinitionRule() throws RecognitionException {
		ClassDefinitionRuleContext _localctx = new ClassDefinitionRuleContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_classDefinitionRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ABSTRACT) {
				{
				setState(45);
				match(ABSTRACT);
				}
			}

			setState(48);
			match(CLASS);
			setState(49);
			((ClassDefinitionRuleContext)_localctx).c = match(ID);
			 h.manageClassName(((ClassDefinitionRuleContext)_localctx).c); h.setClass(((ClassDefinitionRuleContext)_localctx).c); 
			setState(51);
			classCodeRule();
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

	@SuppressWarnings("CheckReturnValue")
	public static class EnumDefinitionRuleContext extends ParserRuleContext {
		public Token n;
		public TerminalNode ENUM() { return getToken(UmlParser.ENUM, 0); }
		public EnumCodeRuleContext enumCodeRule() {
			return getRuleContext(EnumCodeRuleContext.class,0);
		}
		public TerminalNode ID() { return getToken(UmlParser.ID, 0); }
		public EnumDefinitionRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDefinitionRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UmlListener ) ((UmlListener)listener).enterEnumDefinitionRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UmlListener ) ((UmlListener)listener).exitEnumDefinitionRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UmlVisitor ) return ((UmlVisitor<? extends T>)visitor).visitEnumDefinitionRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumDefinitionRuleContext enumDefinitionRule() throws RecognitionException {
		EnumDefinitionRuleContext _localctx = new EnumDefinitionRuleContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_enumDefinitionRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(ENUM);
			setState(54);
			((EnumDefinitionRuleContext)_localctx).n = match(ID);
			setState(55);
			enumCodeRule();
			 h.manageEnum(((EnumDefinitionRuleContext)_localctx).n); h.setEnum(((EnumDefinitionRuleContext)_localctx).n); 
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

	@SuppressWarnings("CheckReturnValue")
	public static class RelationsDefinitionRuleContext extends ParserRuleContext {
		public TerminalNode RELATIONS() { return getToken(UmlParser.RELATIONS, 0); }
		public TerminalNode LBR() { return getToken(UmlParser.LBR, 0); }
		public TerminalNode RBR() { return getToken(UmlParser.RBR, 0); }
		public List<RelationCodeRuleContext> relationCodeRule() {
			return getRuleContexts(RelationCodeRuleContext.class);
		}
		public RelationCodeRuleContext relationCodeRule(int i) {
			return getRuleContext(RelationCodeRuleContext.class,i);
		}
		public RelationsDefinitionRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationsDefinitionRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UmlListener ) ((UmlListener)listener).enterRelationsDefinitionRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UmlListener ) ((UmlListener)listener).exitRelationsDefinitionRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UmlVisitor ) return ((UmlVisitor<? extends T>)visitor).visitRelationsDefinitionRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationsDefinitionRuleContext relationsDefinitionRule() throws RecognitionException {
		RelationsDefinitionRuleContext _localctx = new RelationsDefinitionRuleContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_relationsDefinitionRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(RELATIONS);
			setState(59);
			match(LBR);
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(60);
				relationCodeRule();
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 h.relationsCoherent(); 
			setState(67);
			match(RBR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClassCodeRuleContext extends ParserRuleContext {
		public List<TerminalNode> LBR() { return getTokens(UmlParser.LBR); }
		public TerminalNode LBR(int i) {
			return getToken(UmlParser.LBR, i);
		}
		public List<TerminalNode> RBR() { return getTokens(UmlParser.RBR); }
		public TerminalNode RBR(int i) {
			return getToken(UmlParser.RBR, i);
		}
		public TerminalNode CONSTRUCTOR() { return getToken(UmlParser.CONSTRUCTOR, 0); }
		public TerminalNode ATTRIBUTE() { return getToken(UmlParser.ATTRIBUTE, 0); }
		public TerminalNode OPERATION() { return getToken(UmlParser.OPERATION, 0); }
		public List<ConstructorDeclarationRuleContext> constructorDeclarationRule() {
			return getRuleContexts(ConstructorDeclarationRuleContext.class);
		}
		public ConstructorDeclarationRuleContext constructorDeclarationRule(int i) {
			return getRuleContext(ConstructorDeclarationRuleContext.class,i);
		}
		public List<AttributeDeclarationRuleContext> attributeDeclarationRule() {
			return getRuleContexts(AttributeDeclarationRuleContext.class);
		}
		public AttributeDeclarationRuleContext attributeDeclarationRule(int i) {
			return getRuleContext(AttributeDeclarationRuleContext.class,i);
		}
		public List<OperationDeclarationRuleContext> operationDeclarationRule() {
			return getRuleContexts(OperationDeclarationRuleContext.class);
		}
		public OperationDeclarationRuleContext operationDeclarationRule(int i) {
			return getRuleContext(OperationDeclarationRuleContext.class,i);
		}
		public ClassCodeRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classCodeRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UmlListener ) ((UmlListener)listener).enterClassCodeRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UmlListener ) ((UmlListener)listener).exitClassCodeRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UmlVisitor ) return ((UmlVisitor<? extends T>)visitor).visitClassCodeRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassCodeRuleContext classCodeRule() throws RecognitionException {
		ClassCodeRuleContext _localctx = new ClassCodeRuleContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_classCodeRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(LBR);
			{
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTRUCTOR) {
				{
				setState(70);
				match(CONSTRUCTOR);
				setState(71);
				match(LBR);
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(72);
					constructorDeclarationRule();
					}
					}
					setState(77);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(78);
				match(RBR);
				}
			}

			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ATTRIBUTE) {
				{
				setState(81);
				match(ATTRIBUTE);
				setState(82);
				match(LBR);
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1055531162664960L) != 0)) {
					{
					{
					setState(83);
					attributeDeclarationRule();
					}
					}
					setState(88);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(89);
				match(RBR);
				}
			}

			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPERATION) {
				{
				setState(92);
				match(OPERATION);
				setState(93);
				match(LBR);
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1055531162664960L) != 0)) {
					{
					{
					setState(94);
					operationDeclarationRule();
					}
					}
					setState(99);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(100);
				match(RBR);
				}
			}

			}
			setState(103);
			match(RBR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class EnumCodeRuleContext extends ParserRuleContext {
		public Token ID;
		public List<Token> eName = new ArrayList<Token>();
		public TerminalNode LBR() { return getToken(UmlParser.LBR, 0); }
		public TerminalNode RBR() { return getToken(UmlParser.RBR, 0); }
		public List<TerminalNode> SC() { return getTokens(UmlParser.SC); }
		public TerminalNode SC(int i) {
			return getToken(UmlParser.SC, i);
		}
		public List<TerminalNode> ID() { return getTokens(UmlParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(UmlParser.ID, i);
		}
		public EnumCodeRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumCodeRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UmlListener ) ((UmlListener)listener).enterEnumCodeRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UmlListener ) ((UmlListener)listener).exitEnumCodeRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UmlVisitor ) return ((UmlVisitor<? extends T>)visitor).visitEnumCodeRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumCodeRuleContext enumCodeRule() throws RecognitionException {
		EnumCodeRuleContext _localctx = new EnumCodeRuleContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_enumCodeRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(LBR);
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(106);
				((EnumCodeRuleContext)_localctx).ID = match(ID);
				((EnumCodeRuleContext)_localctx).eName.add(((EnumCodeRuleContext)_localctx).ID);
				setState(107);
				match(SC);
				}
				}
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(113);
			match(RBR);
			 h.enumDeclaration(((EnumCodeRuleContext)_localctx).eName); 
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

	@SuppressWarnings("CheckReturnValue")
	public static class RelationCodeRuleContext extends ParserRuleContext {
		public Token nameRelation;
		public Token nameClass1;
		public RelationTypeRuleContext relationTypeRule;
		public Token nameClass2;
		public Token infoClass;
		public List<MultiplicityRuleContext> multiplicityRule() {
			return getRuleContexts(MultiplicityRuleContext.class);
		}
		public MultiplicityRuleContext multiplicityRule(int i) {
			return getRuleContext(MultiplicityRuleContext.class,i);
		}
		public RelationTypeRuleContext relationTypeRule() {
			return getRuleContext(RelationTypeRuleContext.class,0);
		}
		public TerminalNode SC() { return getToken(UmlParser.SC, 0); }
		public List<TerminalNode> ID() { return getTokens(UmlParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(UmlParser.ID, i);
		}
		public TerminalNode UNDREL() { return getToken(UmlParser.UNDREL, 0); }
		public RelationCodeRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationCodeRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UmlListener ) ((UmlListener)listener).enterRelationCodeRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UmlListener ) ((UmlListener)listener).exitRelationCodeRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UmlVisitor ) return ((UmlVisitor<? extends T>)visitor).visitRelationCodeRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationCodeRuleContext relationCodeRule() throws RecognitionException {
		RelationCodeRuleContext _localctx = new RelationCodeRuleContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_relationCodeRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			((RelationCodeRuleContext)_localctx).nameRelation = match(ID);
			setState(117);
			((RelationCodeRuleContext)_localctx).nameClass1 = match(ID);
			setState(118);
			multiplicityRule();
			setState(119);
			((RelationCodeRuleContext)_localctx).relationTypeRule = relationTypeRule();
			setState(120);
			((RelationCodeRuleContext)_localctx).nameClass2 = match(ID);
			setState(121);
			multiplicityRule();
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UNDREL) {
				{
				setState(122);
				match(UNDREL);
				setState(123);
				((RelationCodeRuleContext)_localctx).infoClass = match(ID);
				}
			}

			setState(126);
			match(SC);
			 
			        h.relDeclaration(((RelationCodeRuleContext)_localctx).nameRelation, ((RelationCodeRuleContext)_localctx).nameClass1, (((RelationCodeRuleContext)_localctx).relationTypeRule!=null?_input.getText(((RelationCodeRuleContext)_localctx).relationTypeRule.start,((RelationCodeRuleContext)_localctx).relationTypeRule.stop):null), ((RelationCodeRuleContext)_localctx).nameClass2);
			      
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

	@SuppressWarnings("CheckReturnValue")
	public static class AttributeDeclarationRuleContext extends ParserRuleContext {
		public VisibilityRuleContext v;
		public ArrayTypeRuleContext ar;
		public TypeRuleContext t;
		public Token a;
		public Token d;
		public TerminalNode SC() { return getToken(UmlParser.SC, 0); }
		public VisibilityRuleContext visibilityRule() {
			return getRuleContext(VisibilityRuleContext.class,0);
		}
		public TypeRuleContext typeRule() {
			return getRuleContext(TypeRuleContext.class,0);
		}
		public TerminalNode ID() { return getToken(UmlParser.ID, 0); }
		public TerminalNode EQ() { return getToken(UmlParser.EQ, 0); }
		public TerminalNode READONLY() { return getToken(UmlParser.READONLY, 0); }
		public ArrayTypeRuleContext arrayTypeRule() {
			return getRuleContext(ArrayTypeRuleContext.class,0);
		}
		public TerminalNode STRING() { return getToken(UmlParser.STRING, 0); }
		public TerminalNode INT() { return getToken(UmlParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(UmlParser.FLOAT, 0); }
		public AttributeDeclarationRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeDeclarationRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UmlListener ) ((UmlListener)listener).enterAttributeDeclarationRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UmlListener ) ((UmlListener)listener).exitAttributeDeclarationRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UmlVisitor ) return ((UmlVisitor<? extends T>)visitor).visitAttributeDeclarationRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeDeclarationRuleContext attributeDeclarationRule() throws RecognitionException {
		AttributeDeclarationRuleContext _localctx = new AttributeDeclarationRuleContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_attributeDeclarationRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			((AttributeDeclarationRuleContext)_localctx).v = visibilityRule();
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 33776997205278720L) != 0)) {
				{
				setState(130);
				((AttributeDeclarationRuleContext)_localctx).ar = arrayTypeRule();
				}
			}

			setState(133);
			((AttributeDeclarationRuleContext)_localctx).t = typeRule();
			setState(134);
			((AttributeDeclarationRuleContext)_localctx).a = match(ID);
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(135);
				match(EQ);
				setState(136);
				((AttributeDeclarationRuleContext)_localctx).d = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 19L) != 0)) ) {
					((AttributeDeclarationRuleContext)_localctx).d = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==READONLY) {
				{
				setState(139);
				match(READONLY);
				}
			}

			setState(142);
			match(SC);
			 h.attDeclaration((((AttributeDeclarationRuleContext)_localctx).v!=null?_input.getText(((AttributeDeclarationRuleContext)_localctx).v.start,((AttributeDeclarationRuleContext)_localctx).v.stop):null), (((AttributeDeclarationRuleContext)_localctx).ar!=null?_input.getText(((AttributeDeclarationRuleContext)_localctx).ar.start,((AttributeDeclarationRuleContext)_localctx).ar.stop):null) != null ? (((AttributeDeclarationRuleContext)_localctx).ar!=null?_input.getText(((AttributeDeclarationRuleContext)_localctx).ar.start,((AttributeDeclarationRuleContext)_localctx).ar.stop):null) : null, (((AttributeDeclarationRuleContext)_localctx).t!=null?_input.getText(((AttributeDeclarationRuleContext)_localctx).t.start,((AttributeDeclarationRuleContext)_localctx).t.stop):null), ((AttributeDeclarationRuleContext)_localctx).a, ((AttributeDeclarationRuleContext)_localctx).d != null ? ((AttributeDeclarationRuleContext)_localctx).d : null); 
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

	@SuppressWarnings("CheckReturnValue")
	public static class VisibilityRuleContext extends ParserRuleContext {
		public TerminalNode PUBLIC() { return getToken(UmlParser.PUBLIC, 0); }
		public TerminalNode PROTECTED() { return getToken(UmlParser.PROTECTED, 0); }
		public TerminalNode PRIVATE() { return getToken(UmlParser.PRIVATE, 0); }
		public TerminalNode PACKAGE() { return getToken(UmlParser.PACKAGE, 0); }
		public VisibilityRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_visibilityRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UmlListener ) ((UmlListener)listener).enterVisibilityRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UmlListener ) ((UmlListener)listener).exitVisibilityRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UmlVisitor ) return ((UmlVisitor<? extends T>)visitor).visitVisibilityRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VisibilityRuleContext visibilityRule() throws RecognitionException {
		VisibilityRuleContext _localctx = new VisibilityRuleContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_visibilityRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1055531162664960L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayTypeRuleContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(UmlParser.SET, 0); }
		public TerminalNode MULTISET() { return getToken(UmlParser.MULTISET, 0); }
		public TerminalNode LIST() { return getToken(UmlParser.LIST, 0); }
		public TerminalNode ORDEREDSET() { return getToken(UmlParser.ORDEREDSET, 0); }
		public ArrayTypeRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayTypeRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UmlListener ) ((UmlListener)listener).enterArrayTypeRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UmlListener ) ((UmlListener)listener).exitArrayTypeRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UmlVisitor ) return ((UmlVisitor<? extends T>)visitor).visitArrayTypeRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayTypeRuleContext arrayTypeRule() throws RecognitionException {
		ArrayTypeRuleContext _localctx = new ArrayTypeRuleContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_arrayTypeRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 33776997205278720L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeRuleContext extends ParserRuleContext {
		public TerminalNode INT_TYPE() { return getToken(UmlParser.INT_TYPE, 0); }
		public TerminalNode FLOAT_TYPE() { return getToken(UmlParser.FLOAT_TYPE, 0); }
		public TerminalNode LONG_TYPE() { return getToken(UmlParser.LONG_TYPE, 0); }
		public TerminalNode DOUBLE_TYPE() { return getToken(UmlParser.DOUBLE_TYPE, 0); }
		public TerminalNode BOOLEAN_TYPE() { return getToken(UmlParser.BOOLEAN_TYPE, 0); }
		public TerminalNode CHAR_TYPE() { return getToken(UmlParser.CHAR_TYPE, 0); }
		public TerminalNode STRING_TYPE() { return getToken(UmlParser.STRING_TYPE, 0); }
		public TerminalNode VOID_TYPE() { return getToken(UmlParser.VOID_TYPE, 0); }
		public TerminalNode ID() { return getToken(UmlParser.ID, 0); }
		public TypeRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UmlListener ) ((UmlListener)listener).enterTypeRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UmlListener ) ((UmlListener)listener).exitTypeRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UmlVisitor ) return ((UmlVisitor<? extends T>)visitor).visitTypeRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeRuleContext typeRule() throws RecognitionException {
		TypeRuleContext _localctx = new TypeRuleContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_typeRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			_la = _input.LA(1);
			if ( !(((((_la - 26)) & ~0x3f) == 0 && ((1L << (_la - 26)) & 17665200572485L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class RelationTypeRuleContext extends ParserRuleContext {
		public TerminalNode UNDREL() { return getToken(UmlParser.UNDREL, 0); }
		public TerminalNode SXREL() { return getToken(UmlParser.SXREL, 0); }
		public TerminalNode DXREL() { return getToken(UmlParser.DXREL, 0); }
		public TerminalNode INHERITS() { return getToken(UmlParser.INHERITS, 0); }
		public TerminalNode SHARED() { return getToken(UmlParser.SHARED, 0); }
		public TerminalNode COMPOSED() { return getToken(UmlParser.COMPOSED, 0); }
		public RelationTypeRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationTypeRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UmlListener ) ((UmlListener)listener).enterRelationTypeRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UmlListener ) ((UmlListener)listener).exitRelationTypeRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UmlVisitor ) return ((UmlVisitor<? extends T>)visitor).visitRelationTypeRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationTypeRuleContext relationTypeRule() throws RecognitionException {
		RelationTypeRuleContext _localctx = new RelationTypeRuleContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_relationTypeRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			_la = _input.LA(1);
			if ( !(((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & 1729382291270008899L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class MultiplicityRuleContext extends ParserRuleContext {
		public Token n;
		public Token m;
		public TerminalNode MIN() { return getToken(UmlParser.MIN, 0); }
		public TerminalNode MAX() { return getToken(UmlParser.MAX, 0); }
		public List<TerminalNode> INT() { return getTokens(UmlParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(UmlParser.INT, i);
		}
		public MultiplicityRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicityRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UmlListener ) ((UmlListener)listener).enterMultiplicityRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UmlListener ) ((UmlListener)listener).exitMultiplicityRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UmlVisitor ) return ((UmlVisitor<? extends T>)visitor).visitMultiplicityRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicityRuleContext multiplicityRule() throws RecognitionException {
		MultiplicityRuleContext _localctx = new MultiplicityRuleContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_multiplicityRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(153);
			match(MIN);
			setState(154);
			((MultiplicityRuleContext)_localctx).n = match(INT);
			setState(155);
			match(MAX);
			setState(156);
			((MultiplicityRuleContext)_localctx).m = match(INT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OperationDeclarationRuleContext extends ParserRuleContext {
		public VisibilityRuleContext v;
		public TypeRuleContext t;
		public Token a;
		public TypeRuleContext typeRule;
		public List<TypeRuleContext> pType = new ArrayList<TypeRuleContext>();
		public Token ID;
		public List<Token> pName = new ArrayList<Token>();
		public TerminalNode LP() { return getToken(UmlParser.LP, 0); }
		public TerminalNode RP() { return getToken(UmlParser.RP, 0); }
		public TerminalNode SC() { return getToken(UmlParser.SC, 0); }
		public VisibilityRuleContext visibilityRule() {
			return getRuleContext(VisibilityRuleContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(UmlParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(UmlParser.ID, i);
		}
		public List<TypeRuleContext> typeRule() {
			return getRuleContexts(TypeRuleContext.class);
		}
		public TypeRuleContext typeRule(int i) {
			return getRuleContext(TypeRuleContext.class,i);
		}
		public OperationDeclarationRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operationDeclarationRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UmlListener ) ((UmlListener)listener).enterOperationDeclarationRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UmlListener ) ((UmlListener)listener).exitOperationDeclarationRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UmlVisitor ) return ((UmlVisitor<? extends T>)visitor).visitOperationDeclarationRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationDeclarationRuleContext operationDeclarationRule() throws RecognitionException {
		OperationDeclarationRuleContext _localctx = new OperationDeclarationRuleContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_operationDeclarationRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			((OperationDeclarationRuleContext)_localctx).v = visibilityRule();
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(159);
				((OperationDeclarationRuleContext)_localctx).t = typeRule();
				}
				break;
			}
			setState(162);
			((OperationDeclarationRuleContext)_localctx).a = match(ID);
			setState(163);
			match(LP);
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 26)) & ~0x3f) == 0 && ((1L << (_la - 26)) & 17665200572485L) != 0)) {
				{
				{
				setState(164);
				((OperationDeclarationRuleContext)_localctx).typeRule = typeRule();
				((OperationDeclarationRuleContext)_localctx).pType.add(((OperationDeclarationRuleContext)_localctx).typeRule);
				setState(165);
				((OperationDeclarationRuleContext)_localctx).ID = match(ID);
				((OperationDeclarationRuleContext)_localctx).pName.add(((OperationDeclarationRuleContext)_localctx).ID);
				}
				}
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(172);
			match(RP);
			setState(173);
			match(SC);
			 h.opDeclaration((((OperationDeclarationRuleContext)_localctx).v!=null?_input.getText(((OperationDeclarationRuleContext)_localctx).v.start,((OperationDeclarationRuleContext)_localctx).v.stop):null), (((OperationDeclarationRuleContext)_localctx).t!=null?_input.getText(((OperationDeclarationRuleContext)_localctx).t.start,((OperationDeclarationRuleContext)_localctx).t.stop):null) != null ? (((OperationDeclarationRuleContext)_localctx).t!=null?_input.getText(((OperationDeclarationRuleContext)_localctx).t.start,((OperationDeclarationRuleContext)_localctx).t.stop):null) : null, ((OperationDeclarationRuleContext)_localctx).a, ((OperationDeclarationRuleContext)_localctx).pType, ((OperationDeclarationRuleContext)_localctx).pName); 
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConstructorDeclarationRuleContext extends ParserRuleContext {
		public Token a;
		public TypeRuleContext typeRule;
		public List<TypeRuleContext> pType = new ArrayList<TypeRuleContext>();
		public Token ID;
		public List<Token> pName = new ArrayList<Token>();
		public TerminalNode LP() { return getToken(UmlParser.LP, 0); }
		public TerminalNode RP() { return getToken(UmlParser.RP, 0); }
		public TerminalNode SC() { return getToken(UmlParser.SC, 0); }
		public List<TerminalNode> ID() { return getTokens(UmlParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(UmlParser.ID, i);
		}
		public List<TypeRuleContext> typeRule() {
			return getRuleContexts(TypeRuleContext.class);
		}
		public TypeRuleContext typeRule(int i) {
			return getRuleContext(TypeRuleContext.class,i);
		}
		public ConstructorDeclarationRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclarationRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UmlListener ) ((UmlListener)listener).enterConstructorDeclarationRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UmlListener ) ((UmlListener)listener).exitConstructorDeclarationRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UmlVisitor ) return ((UmlVisitor<? extends T>)visitor).visitConstructorDeclarationRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorDeclarationRuleContext constructorDeclarationRule() throws RecognitionException {
		ConstructorDeclarationRuleContext _localctx = new ConstructorDeclarationRuleContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_constructorDeclarationRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			((ConstructorDeclarationRuleContext)_localctx).a = match(ID);
			setState(177);
			match(LP);
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 26)) & ~0x3f) == 0 && ((1L << (_la - 26)) & 17665200572485L) != 0)) {
				{
				{
				setState(178);
				((ConstructorDeclarationRuleContext)_localctx).typeRule = typeRule();
				((ConstructorDeclarationRuleContext)_localctx).pType.add(((ConstructorDeclarationRuleContext)_localctx).typeRule);
				setState(179);
				((ConstructorDeclarationRuleContext)_localctx).ID = match(ID);
				((ConstructorDeclarationRuleContext)_localctx).pName.add(((ConstructorDeclarationRuleContext)_localctx).ID);
				}
				}
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(186);
			match(RP);
			setState(187);
			match(SC);
			 h.constrDeclaration(((ConstructorDeclarationRuleContext)_localctx).a, ((ConstructorDeclarationRuleContext)_localctx).pType, ((ConstructorDeclarationRuleContext)_localctx).pName); 
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

	public static final String _serializedATN =
		"\u0004\u0001M\u00bf\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0005\u0000"+
		" \b\u0000\n\u0000\f\u0000#\t\u0000\u0001\u0000\u0005\u0000&\b\u0000\n"+
		"\u0000\f\u0000)\t\u0000\u0001\u0000\u0003\u0000,\b\u0000\u0001\u0001\u0003"+
		"\u0001/\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0005\u0003>\b\u0003\n\u0003\f\u0003A\t"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0005\u0004J\b\u0004\n\u0004\f\u0004M\t\u0004\u0001"+
		"\u0004\u0003\u0004P\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005"+
		"\u0004U\b\u0004\n\u0004\f\u0004X\t\u0004\u0001\u0004\u0003\u0004[\b\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004`\b\u0004\n\u0004\f\u0004"+
		"c\t\u0004\u0001\u0004\u0003\u0004f\b\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0005\u0005m\b\u0005\n\u0005\f\u0005p\t"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003"+
		"\u0006}\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0003\u0007\u0084\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007\u008a\b\u0007\u0001\u0007\u0003\u0007\u008d\b\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0003\r\u00a1\b\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0005\r\u00a8\b\r\n\r\f\r\u00ab\t\r\u0001\r\u0001\r\u0001\r\u0001\r"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e"+
		"\u00b6\b\u000e\n\u000e\f\u000e\u00b9\t\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\'\u0000\u000f\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u0000\u0005\u0002"+
		"\u0000GHKK\u0001\u0000.1\u0001\u000036\t\u0000\u001a\u001a\u001c\u001c"+
		"  %%((**::>>FF\u0004\u0000\u0004\u0005\n\n\'\'?@\u00c2\u0000!\u0001\u0000"+
		"\u0000\u0000\u0002.\u0001\u0000\u0000\u0000\u00045\u0001\u0000\u0000\u0000"+
		"\u0006:\u0001\u0000\u0000\u0000\bE\u0001\u0000\u0000\u0000\ni\u0001\u0000"+
		"\u0000\u0000\ft\u0001\u0000\u0000\u0000\u000e\u0081\u0001\u0000\u0000"+
		"\u0000\u0010\u0091\u0001\u0000\u0000\u0000\u0012\u0093\u0001\u0000\u0000"+
		"\u0000\u0014\u0095\u0001\u0000\u0000\u0000\u0016\u0097\u0001\u0000\u0000"+
		"\u0000\u0018\u0099\u0001\u0000\u0000\u0000\u001a\u009e\u0001\u0000\u0000"+
		"\u0000\u001c\u00b0\u0001\u0000\u0000\u0000\u001e \u0003\u0002\u0001\u0000"+
		"\u001f\u001e\u0001\u0000\u0000\u0000 #\u0001\u0000\u0000\u0000!\u001f"+
		"\u0001\u0000\u0000\u0000!\"\u0001\u0000\u0000\u0000\"\'\u0001\u0000\u0000"+
		"\u0000#!\u0001\u0000\u0000\u0000$&\u0003\u0004\u0002\u0000%$\u0001\u0000"+
		"\u0000\u0000&)\u0001\u0000\u0000\u0000\'(\u0001\u0000\u0000\u0000\'%\u0001"+
		"\u0000\u0000\u0000(+\u0001\u0000\u0000\u0000)\'\u0001\u0000\u0000\u0000"+
		"*,\u0003\u0006\u0003\u0000+*\u0001\u0000\u0000\u0000+,\u0001\u0000\u0000"+
		"\u0000,\u0001\u0001\u0000\u0000\u0000-/\u0005\u0019\u0000\u0000.-\u0001"+
		"\u0000\u0000\u0000./\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000\u0000"+
		"01\u0005\u001d\u0000\u000012\u0005F\u0000\u000023\u0006\u0001\uffff\uffff"+
		"\u000034\u0003\b\u0004\u00004\u0003\u0001\u0000\u0000\u000056\u0005!\u0000"+
		"\u000067\u0005F\u0000\u000078\u0003\n\u0005\u000089\u0006\u0002\uffff"+
		"\uffff\u00009\u0005\u0001\u0000\u0000\u0000:;\u0005B\u0000\u0000;?\u0005"+
		"\u0015\u0000\u0000<>\u0003\f\u0006\u0000=<\u0001\u0000\u0000\u0000>A\u0001"+
		"\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000"+
		"@B\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000BC\u0006\u0003\uffff"+
		"\uffff\u0000CD\u0005\u0016\u0000\u0000D\u0007\u0001\u0000\u0000\u0000"+
		"EO\u0005\u0015\u0000\u0000FG\u0005\u001e\u0000\u0000GK\u0005\u0015\u0000"+
		"\u0000HJ\u0003\u001c\u000e\u0000IH\u0001\u0000\u0000\u0000JM\u0001\u0000"+
		"\u0000\u0000KI\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000LN\u0001"+
		"\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000NP\u0005\u0016\u0000\u0000"+
		"OF\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000PZ\u0001\u0000\u0000"+
		"\u0000QR\u0005A\u0000\u0000RV\u0005\u0015\u0000\u0000SU\u0003\u000e\u0007"+
		"\u0000TS\u0001\u0000\u0000\u0000UX\u0001\u0000\u0000\u0000VT\u0001\u0000"+
		"\u0000\u0000VW\u0001\u0000\u0000\u0000WY\u0001\u0000\u0000\u0000XV\u0001"+
		"\u0000\u0000\u0000Y[\u0005\u0016\u0000\u0000ZQ\u0001\u0000\u0000\u0000"+
		"Z[\u0001\u0000\u0000\u0000[e\u0001\u0000\u0000\u0000\\]\u0005C\u0000\u0000"+
		"]a\u0005\u0015\u0000\u0000^`\u0003\u001a\r\u0000_^\u0001\u0000\u0000\u0000"+
		"`c\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000"+
		"\u0000bd\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000df\u0005\u0016"+
		"\u0000\u0000e\\\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000fg\u0001"+
		"\u0000\u0000\u0000gh\u0005\u0016\u0000\u0000h\t\u0001\u0000\u0000\u0000"+
		"in\u0005\u0015\u0000\u0000jk\u0005F\u0000\u0000km\u0005\u0010\u0000\u0000"+
		"lj\u0001\u0000\u0000\u0000mp\u0001\u0000\u0000\u0000nl\u0001\u0000\u0000"+
		"\u0000no\u0001\u0000\u0000\u0000oq\u0001\u0000\u0000\u0000pn\u0001\u0000"+
		"\u0000\u0000qr\u0005\u0016\u0000\u0000rs\u0006\u0005\uffff\uffff\u0000"+
		"s\u000b\u0001\u0000\u0000\u0000tu\u0005F\u0000\u0000uv\u0005F\u0000\u0000"+
		"vw\u0003\u0018\f\u0000wx\u0003\u0016\u000b\u0000xy\u0005F\u0000\u0000"+
		"y|\u0003\u0018\f\u0000z{\u0005\n\u0000\u0000{}\u0005F\u0000\u0000|z\u0001"+
		"\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000"+
		"~\u007f\u0005\u0010\u0000\u0000\u007f\u0080\u0006\u0006\uffff\uffff\u0000"+
		"\u0080\r\u0001\u0000\u0000\u0000\u0081\u0083\u0003\u0010\b\u0000\u0082"+
		"\u0084\u0003\u0012\t\u0000\u0083\u0082\u0001\u0000\u0000\u0000\u0083\u0084"+
		"\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u0086"+
		"\u0003\u0014\n\u0000\u0086\u0089\u0005F\u0000\u0000\u0087\u0088\u0005"+
		"\u0001\u0000\u0000\u0088\u008a\u0007\u0000\u0000\u0000\u0089\u0087\u0001"+
		"\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000\u0000\u008a\u008c\u0001"+
		"\u0000\u0000\u0000\u008b\u008d\u00052\u0000\u0000\u008c\u008b\u0001\u0000"+
		"\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000"+
		"\u0000\u0000\u008e\u008f\u0005\u0010\u0000\u0000\u008f\u0090\u0006\u0007"+
		"\uffff\uffff\u0000\u0090\u000f\u0001\u0000\u0000\u0000\u0091\u0092\u0007"+
		"\u0001\u0000\u0000\u0092\u0011\u0001\u0000\u0000\u0000\u0093\u0094\u0007"+
		"\u0002\u0000\u0000\u0094\u0013\u0001\u0000\u0000\u0000\u0095\u0096\u0007"+
		"\u0003\u0000\u0000\u0096\u0015\u0001\u0000\u0000\u0000\u0097\u0098\u0007"+
		"\u0004\u0000\u0000\u0098\u0017\u0001\u0000\u0000\u0000\u0099\u009a\u0005"+
		"D\u0000\u0000\u009a\u009b\u0005G\u0000\u0000\u009b\u009c\u0005E\u0000"+
		"\u0000\u009c\u009d\u0005G\u0000\u0000\u009d\u0019\u0001\u0000\u0000\u0000"+
		"\u009e\u00a0\u0003\u0010\b\u0000\u009f\u00a1\u0003\u0014\n\u0000\u00a0"+
		"\u009f\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1"+
		"\u00a2\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005F\u0000\u0000\u00a3\u00a9"+
		"\u0005\u0013\u0000\u0000\u00a4\u00a5\u0003\u0014\n\u0000\u00a5\u00a6\u0005"+
		"F\u0000\u0000\u00a6\u00a8\u0001\u0000\u0000\u0000\u00a7\u00a4\u0001\u0000"+
		"\u0000\u0000\u00a8\u00ab\u0001\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000"+
		"\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa\u00ac\u0001\u0000"+
		"\u0000\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ac\u00ad\u0005\u0014"+
		"\u0000\u0000\u00ad\u00ae\u0005\u0010\u0000\u0000\u00ae\u00af\u0006\r\uffff"+
		"\uffff\u0000\u00af\u001b\u0001\u0000\u0000\u0000\u00b0\u00b1\u0005F\u0000"+
		"\u0000\u00b1\u00b7\u0005\u0013\u0000\u0000\u00b2\u00b3\u0003\u0014\n\u0000"+
		"\u00b3\u00b4\u0005F\u0000\u0000\u00b4\u00b6\u0001\u0000\u0000\u0000\u00b5"+
		"\u00b2\u0001\u0000\u0000\u0000\u00b6\u00b9\u0001\u0000\u0000\u0000\u00b7"+
		"\u00b5\u0001\u0000\u0000\u0000\u00b7\u00b8\u0001\u0000\u0000\u0000\u00b8"+
		"\u00ba\u0001\u0000\u0000\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000\u00ba"+
		"\u00bb\u0005\u0014\u0000\u0000\u00bb\u00bc\u0005\u0010\u0000\u0000\u00bc"+
		"\u00bd\u0006\u000e\uffff\uffff\u0000\u00bd\u001d\u0001\u0000\u0000\u0000"+
		"\u0013!\'+.?KOVZaen|\u0083\u0089\u008c\u00a0\u00a9\u00b7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}