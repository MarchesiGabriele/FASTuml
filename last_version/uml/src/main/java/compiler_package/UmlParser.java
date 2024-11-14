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
		CHAR_TYPE=28, CLASS=29, CONST=30, DOUBLE_TYPE=31, ENUM=32, EXTENDS=33, 
		FALSE=34, FINAL=35, FLOAT_TYPE=36, IMPLEMENTS=37, INHERITS=38, INT_TYPE=39, 
		INTERFACE=40, LONG_TYPE=41, NONUNIQUE=42, NULL=43, ORDER=44, PRIVATE=45, 
		PROTECTED=46, PUBLIC=47, PACKAGE=48, READONLY=49, SET=50, MULTISET=51, 
		ORDEREDSET=52, LIST=53, SHORT=54, STATIC=55, THROWS=56, STRING_TYPE=57, 
		TRUE=58, UNIQUE=59, UNORDERED=60, VOID_TYPE=61, SHARED=62, COMPOSED=63, 
		ATTRIBUTE=64, RELATIONS=65, OPERATION=66, MIN=67, MAX=68, ID=69, INT=70, 
		FLOAT=71, COMMENT=72, WS=73, STRING=74, CHAR=75, ERROR_TOKEN=76;
	public static final int
		RULE_start = 0, RULE_classDefinitionRule = 1, RULE_relationsDefinitionRule = 2, 
		RULE_classCodeRule = 3, RULE_relationCodeRule = 4, RULE_attributeDeclarationRule = 5, 
		RULE_visibilityRule = 6, RULE_arrayTypeRule = 7, RULE_typeRule = 8, RULE_relationTypeRule = 9, 
		RULE_multiplicityRule = 10, RULE_operationDeclarationRule = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "classDefinitionRule", "relationsDefinitionRule", "classCodeRule", 
			"relationCodeRule", "attributeDeclarationRule", "visibilityRule", "arrayTypeRule", 
			"typeRule", "relationTypeRule", "multiplicityRule", "operationDeclarationRule"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'%'", "'+'", 
			"'-'", "'*'", "'/'", "'++'", "'--'", "':'", "';'", "'.'", "','", "'('", 
			"')'", "'{'", "'}'", "'['", "']'", "'abstract'", "'boolean'", "'byte'", 
			"'char'", "'class'", "'const'", "'double'", "'enum'", "'extends'", "'false'", 
			"'final'", "'float'", "'implements'", "'inherits'", "'int'", "'interface'", 
			"'long'", "'non-unique'", "'null'", "'ordered'", "'private'", "'protected'", 
			"'public'", "'package'", "'readOnly'", "'Set'", "'Multi-set'", "'Ordered-set'", 
			"'List'", "'short'", "'static'", "'throws'", "'String'", "'true'", "'unique'", 
			"'unordered'", "'void'", "'shared'", "'composed'", "'attribute'", "'relations'", 
			"'operation'", "'min'", "'max'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "EQ", "COMP", "NEQ", "SXREL", "DXREL", "LTE", "GTE", "MOD", "ADD", 
			"UNDREL", "MUL", "DIV", "AADD", "SSUB", "DP", "SC", "DOT", "COMMA", "LP", 
			"RP", "LBR", "RBR", "LB", "RB", "ABSTRACT", "BOOLEAN_TYPE", "BYTE", "CHAR_TYPE", 
			"CLASS", "CONST", "DOUBLE_TYPE", "ENUM", "EXTENDS", "FALSE", "FINAL", 
			"FLOAT_TYPE", "IMPLEMENTS", "INHERITS", "INT_TYPE", "INTERFACE", "LONG_TYPE", 
			"NONUNIQUE", "NULL", "ORDER", "PRIVATE", "PROTECTED", "PUBLIC", "PACKAGE", 
			"READONLY", "SET", "MULTISET", "ORDEREDSET", "LIST", "SHORT", "STATIC", 
			"THROWS", "STRING_TYPE", "TRUE", "UNIQUE", "UNORDERED", "VOID_TYPE", 
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
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ABSTRACT || _la==CLASS) {
				{
				{
				setState(24);
				classDefinitionRule();
				}
				}
				setState(29);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RELATIONS) {
				{
				setState(30);
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
			setState(34);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ABSTRACT) {
				{
				setState(33);
				match(ABSTRACT);
				}
			}

			setState(36);
			match(CLASS);
			setState(37);
			((ClassDefinitionRuleContext)_localctx).c = match(ID);
			 h.manageClassName(((ClassDefinitionRuleContext)_localctx).c); h.setClass(((ClassDefinitionRuleContext)_localctx).c); 
			setState(39);
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
	public static class RelationsDefinitionRuleContext extends ParserRuleContext {
		public TerminalNode RELATIONS() { return getToken(UmlParser.RELATIONS, 0); }
		public TerminalNode DP() { return getToken(UmlParser.DP, 0); }
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
		enterRule(_localctx, 4, RULE_relationsDefinitionRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(RELATIONS);
			setState(42);
			match(DP);
			setState(43);
			match(LBR);
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(44);
				relationCodeRule();
				}
				}
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(50);
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
		public TerminalNode LBR() { return getToken(UmlParser.LBR, 0); }
		public TerminalNode RBR() { return getToken(UmlParser.RBR, 0); }
		public List<TerminalNode> ATTRIBUTE() { return getTokens(UmlParser.ATTRIBUTE); }
		public TerminalNode ATTRIBUTE(int i) {
			return getToken(UmlParser.ATTRIBUTE, i);
		}
		public List<TerminalNode> DP() { return getTokens(UmlParser.DP); }
		public TerminalNode DP(int i) {
			return getToken(UmlParser.DP, i);
		}
		public List<AttributeDeclarationRuleContext> attributeDeclarationRule() {
			return getRuleContexts(AttributeDeclarationRuleContext.class);
		}
		public AttributeDeclarationRuleContext attributeDeclarationRule(int i) {
			return getRuleContext(AttributeDeclarationRuleContext.class,i);
		}
		public List<TerminalNode> OPERATION() { return getTokens(UmlParser.OPERATION); }
		public TerminalNode OPERATION(int i) {
			return getToken(UmlParser.OPERATION, i);
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
		enterRule(_localctx, 6, RULE_classCodeRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(LBR);
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ATTRIBUTE || _la==OPERATION) {
				{
				setState(59);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ATTRIBUTE:
					{
					{
					setState(53);
					match(ATTRIBUTE);
					setState(54);
					match(DP);
					setState(55);
					attributeDeclarationRule();
					}
					}
					break;
				case OPERATION:
					{
					{
					setState(56);
					match(OPERATION);
					setState(57);
					match(DP);
					setState(58);
					operationDeclarationRule();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(64);
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
		enterRule(_localctx, 8, RULE_relationCodeRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			((RelationCodeRuleContext)_localctx).nameRelation = match(ID);
			setState(67);
			((RelationCodeRuleContext)_localctx).nameClass1 = match(ID);
			setState(68);
			multiplicityRule();
			setState(69);
			((RelationCodeRuleContext)_localctx).relationTypeRule = relationTypeRule();
			setState(70);
			((RelationCodeRuleContext)_localctx).nameClass2 = match(ID);
			setState(71);
			multiplicityRule();
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UNDREL) {
				{
				setState(72);
				match(UNDREL);
				setState(73);
				((RelationCodeRuleContext)_localctx).infoClass = match(ID);
				}
			}

			 
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
		enterRule(_localctx, 10, RULE_attributeDeclarationRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			((AttributeDeclarationRuleContext)_localctx).v = visibilityRule();
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 16888498602639360L) != 0)) {
				{
				setState(79);
				((AttributeDeclarationRuleContext)_localctx).ar = arrayTypeRule();
				}
			}

			setState(82);
			((AttributeDeclarationRuleContext)_localctx).t = typeRule();
			setState(83);
			((AttributeDeclarationRuleContext)_localctx).a = match(ID);
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & 19L) != 0)) {
				{
				setState(84);
				((AttributeDeclarationRuleContext)_localctx).d = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & 19L) != 0)) ) {
					((AttributeDeclarationRuleContext)_localctx).d = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==READONLY) {
				{
				setState(87);
				match(READONLY);
				}
			}

			setState(90);
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
		enterRule(_localctx, 12, RULE_visibilityRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 527765581332480L) != 0)) ) {
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
		enterRule(_localctx, 14, RULE_arrayTypeRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 16888498602639360L) != 0)) ) {
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
		enterRule(_localctx, 16, RULE_typeRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			_la = _input.LA(1);
			if ( !(((((_la - 26)) & ~0x3f) == 0 && ((1L << (_la - 26)) & 8832600286245L) != 0)) ) {
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
		enterRule(_localctx, 18, RULE_relationTypeRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & -4611685743549479888L) != 0)) ) {
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
		enterRule(_localctx, 20, RULE_multiplicityRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(101);
			match(MIN);
			setState(102);
			((MultiplicityRuleContext)_localctx).n = match(INT);
			setState(103);
			match(MAX);
			setState(104);
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
		enterRule(_localctx, 22, RULE_operationDeclarationRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			((OperationDeclarationRuleContext)_localctx).v = visibilityRule();
			setState(108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(107);
				((OperationDeclarationRuleContext)_localctx).t = typeRule();
				}
				break;
			}
			setState(110);
			((OperationDeclarationRuleContext)_localctx).a = match(ID);
			setState(111);
			match(LP);
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 26)) & ~0x3f) == 0 && ((1L << (_la - 26)) & 8832600286245L) != 0)) {
				{
				{
				setState(112);
				((OperationDeclarationRuleContext)_localctx).typeRule = typeRule();
				((OperationDeclarationRuleContext)_localctx).pType.add(((OperationDeclarationRuleContext)_localctx).typeRule);
				setState(113);
				((OperationDeclarationRuleContext)_localctx).ID = match(ID);
				((OperationDeclarationRuleContext)_localctx).pName.add(((OperationDeclarationRuleContext)_localctx).ID);
				}
				}
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(120);
			match(RP);
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

	public static final String _serializedATN =
		"\u0004\u0001L|\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002"+
		"\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002\u0005"+
		"\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002\b\u0007"+
		"\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0001\u0000"+
		"\u0005\u0000\u001a\b\u0000\n\u0000\f\u0000\u001d\t\u0000\u0001\u0000\u0003"+
		"\u0000 \b\u0000\u0001\u0001\u0003\u0001#\b\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0005\u0002.\b\u0002\n\u0002\f\u00021\t\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0005\u0003<\b\u0003\n\u0003\f\u0003?\t\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004K\b\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0003\u0005Q\b\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005V\b\u0005\u0001\u0005"+
		"\u0003\u0005Y\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0003\u000b"+
		"m\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0005\u000bt\b\u000b\n\u000b\f\u000bw\t\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0000\u0000\f\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0000\u0005\u0002\u0000FGJJ\u0001\u0000-0\u0001"+
		"\u000025\t\u0000\u001a\u001a\u001c\u001c\u001f\u001f$$\'\'))99==EE\u0004"+
		"\u0000\u0004\u0005\n\n&&>?{\u0000\u001b\u0001\u0000\u0000\u0000\u0002"+
		"\"\u0001\u0000\u0000\u0000\u0004)\u0001\u0000\u0000\u0000\u00064\u0001"+
		"\u0000\u0000\u0000\bB\u0001\u0000\u0000\u0000\nN\u0001\u0000\u0000\u0000"+
		"\f]\u0001\u0000\u0000\u0000\u000e_\u0001\u0000\u0000\u0000\u0010a\u0001"+
		"\u0000\u0000\u0000\u0012c\u0001\u0000\u0000\u0000\u0014e\u0001\u0000\u0000"+
		"\u0000\u0016j\u0001\u0000\u0000\u0000\u0018\u001a\u0003\u0002\u0001\u0000"+
		"\u0019\u0018\u0001\u0000\u0000\u0000\u001a\u001d\u0001\u0000\u0000\u0000"+
		"\u001b\u0019\u0001\u0000\u0000\u0000\u001b\u001c\u0001\u0000\u0000\u0000"+
		"\u001c\u001f\u0001\u0000\u0000\u0000\u001d\u001b\u0001\u0000\u0000\u0000"+
		"\u001e \u0003\u0004\u0002\u0000\u001f\u001e\u0001\u0000\u0000\u0000\u001f"+
		" \u0001\u0000\u0000\u0000 \u0001\u0001\u0000\u0000\u0000!#\u0005\u0019"+
		"\u0000\u0000\"!\u0001\u0000\u0000\u0000\"#\u0001\u0000\u0000\u0000#$\u0001"+
		"\u0000\u0000\u0000$%\u0005\u001d\u0000\u0000%&\u0005E\u0000\u0000&\'\u0006"+
		"\u0001\uffff\uffff\u0000\'(\u0003\u0006\u0003\u0000(\u0003\u0001\u0000"+
		"\u0000\u0000)*\u0005A\u0000\u0000*+\u0005\u000f\u0000\u0000+/\u0005\u0015"+
		"\u0000\u0000,.\u0003\b\u0004\u0000-,\u0001\u0000\u0000\u0000.1\u0001\u0000"+
		"\u0000\u0000/-\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000\u000002\u0001"+
		"\u0000\u0000\u00001/\u0001\u0000\u0000\u000023\u0005\u0016\u0000\u0000"+
		"3\u0005\u0001\u0000\u0000\u00004=\u0005\u0015\u0000\u000056\u0005@\u0000"+
		"\u000067\u0005\u000f\u0000\u00007<\u0003\n\u0005\u000089\u0005B\u0000"+
		"\u00009:\u0005\u000f\u0000\u0000:<\u0003\u0016\u000b\u0000;5\u0001\u0000"+
		"\u0000\u0000;8\u0001\u0000\u0000\u0000<?\u0001\u0000\u0000\u0000=;\u0001"+
		"\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000>@\u0001\u0000\u0000\u0000"+
		"?=\u0001\u0000\u0000\u0000@A\u0005\u0016\u0000\u0000A\u0007\u0001\u0000"+
		"\u0000\u0000BC\u0005E\u0000\u0000CD\u0005E\u0000\u0000DE\u0003\u0014\n"+
		"\u0000EF\u0003\u0012\t\u0000FG\u0005E\u0000\u0000GJ\u0003\u0014\n\u0000"+
		"HI\u0005\n\u0000\u0000IK\u0005E\u0000\u0000JH\u0001\u0000\u0000\u0000"+
		"JK\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000LM\u0006\u0004\uffff"+
		"\uffff\u0000M\t\u0001\u0000\u0000\u0000NP\u0003\f\u0006\u0000OQ\u0003"+
		"\u000e\u0007\u0000PO\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000"+
		"QR\u0001\u0000\u0000\u0000RS\u0003\u0010\b\u0000SU\u0005E\u0000\u0000"+
		"TV\u0007\u0000\u0000\u0000UT\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000"+
		"\u0000VX\u0001\u0000\u0000\u0000WY\u00051\u0000\u0000XW\u0001\u0000\u0000"+
		"\u0000XY\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000Z[\u0005\u0010"+
		"\u0000\u0000[\\\u0006\u0005\uffff\uffff\u0000\\\u000b\u0001\u0000\u0000"+
		"\u0000]^\u0007\u0001\u0000\u0000^\r\u0001\u0000\u0000\u0000_`\u0007\u0002"+
		"\u0000\u0000`\u000f\u0001\u0000\u0000\u0000ab\u0007\u0003\u0000\u0000"+
		"b\u0011\u0001\u0000\u0000\u0000cd\u0007\u0004\u0000\u0000d\u0013\u0001"+
		"\u0000\u0000\u0000ef\u0005C\u0000\u0000fg\u0005F\u0000\u0000gh\u0005D"+
		"\u0000\u0000hi\u0005F\u0000\u0000i\u0015\u0001\u0000\u0000\u0000jl\u0003"+
		"\f\u0006\u0000km\u0003\u0010\b\u0000lk\u0001\u0000\u0000\u0000lm\u0001"+
		"\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000no\u0005E\u0000\u0000ou\u0005"+
		"\u0013\u0000\u0000pq\u0003\u0010\b\u0000qr\u0005E\u0000\u0000rt\u0001"+
		"\u0000\u0000\u0000sp\u0001\u0000\u0000\u0000tw\u0001\u0000\u0000\u0000"+
		"us\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000vx\u0001\u0000\u0000"+
		"\u0000wu\u0001\u0000\u0000\u0000xy\u0005\u0014\u0000\u0000yz\u0006\u000b"+
		"\uffff\uffff\u0000z\u0017\u0001\u0000\u0000\u0000\f\u001b\u001f\"/;=J"+
		"PUXlu";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}