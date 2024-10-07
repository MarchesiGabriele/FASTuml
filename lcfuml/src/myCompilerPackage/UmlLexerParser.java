// $ANTLR 3.5.1 C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\UmlLexer.g 2024-10-07 15:30:08

	package myCompilerPackage; 		


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class UmlLexerParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AADD", "ABSTRACT", "ADD", "ATTRIBUTE", 
		"BOOLEAN_TYPE", "BYTE", "CHAR", "CHAR_TYPE", "CLASS", "COMMA", "COMMENT", 
		"COMP", "COMPOSED", "CONST", "DIV", "DOT", "DOUBLE_TYPE", "DP", "DXREL", 
		"ENUM", "EQ", "ESC_SEQ", "EXPONENT", "EXTENDS", "FALSE", "FINAL", "FLOAT", 
		"FLOAT_TYPE", "GTE", "HEX_DIGIT", "ID", "IMPLEMENTS", "INHERITS", "INT", 
		"INTERFACE", "INT_TYPE", "LB", "LBR", "LIST", "LONG_TYPE", "LP", "LTE", 
		"MAX", "MIN", "MOD", "MUL", "MULTISET", "NEQ", "NONUNIQUE", "NULL", "OCTAL_ESC", 
		"OPERATION", "ORDER", "ORDEREDSET", "PACKAGE", "PRIVATE", "PROTECTED", 
		"PUBLIC", "RB", "RBR", "READONLY", "RELATIONS", "RP", "SC", "SET", "SHARED", 
		"SHORT", "SSUB", "STATIC", "STRING", "STRING_TYPE", "SXREL", "THROWS", 
		"TRUE", "UNDREL", "UNICODE_ESC", "UNIQUE", "UNORDERED", "VOID", "WS"
	};
	public static final int EOF=-1;
	public static final int AADD=4;
	public static final int ABSTRACT=5;
	public static final int ADD=6;
	public static final int ATTRIBUTE=7;
	public static final int BOOLEAN_TYPE=8;
	public static final int BYTE=9;
	public static final int CHAR=10;
	public static final int CHAR_TYPE=11;
	public static final int CLASS=12;
	public static final int COMMA=13;
	public static final int COMMENT=14;
	public static final int COMP=15;
	public static final int COMPOSED=16;
	public static final int CONST=17;
	public static final int DIV=18;
	public static final int DOT=19;
	public static final int DOUBLE_TYPE=20;
	public static final int DP=21;
	public static final int DXREL=22;
	public static final int ENUM=23;
	public static final int EQ=24;
	public static final int ESC_SEQ=25;
	public static final int EXPONENT=26;
	public static final int EXTENDS=27;
	public static final int FALSE=28;
	public static final int FINAL=29;
	public static final int FLOAT=30;
	public static final int FLOAT_TYPE=31;
	public static final int GTE=32;
	public static final int HEX_DIGIT=33;
	public static final int ID=34;
	public static final int IMPLEMENTS=35;
	public static final int INHERITS=36;
	public static final int INT=37;
	public static final int INTERFACE=38;
	public static final int INT_TYPE=39;
	public static final int LB=40;
	public static final int LBR=41;
	public static final int LIST=42;
	public static final int LONG_TYPE=43;
	public static final int LP=44;
	public static final int LTE=45;
	public static final int MAX=46;
	public static final int MIN=47;
	public static final int MOD=48;
	public static final int MUL=49;
	public static final int MULTISET=50;
	public static final int NEQ=51;
	public static final int NONUNIQUE=52;
	public static final int NULL=53;
	public static final int OCTAL_ESC=54;
	public static final int OPERATION=55;
	public static final int ORDER=56;
	public static final int ORDEREDSET=57;
	public static final int PACKAGE=58;
	public static final int PRIVATE=59;
	public static final int PROTECTED=60;
	public static final int PUBLIC=61;
	public static final int RB=62;
	public static final int RBR=63;
	public static final int READONLY=64;
	public static final int RELATIONS=65;
	public static final int RP=66;
	public static final int SC=67;
	public static final int SET=68;
	public static final int SHARED=69;
	public static final int SHORT=70;
	public static final int SSUB=71;
	public static final int STATIC=72;
	public static final int STRING=73;
	public static final int STRING_TYPE=74;
	public static final int SXREL=75;
	public static final int THROWS=76;
	public static final int TRUE=77;
	public static final int UNDREL=78;
	public static final int UNICODE_ESC=79;
	public static final int UNIQUE=80;
	public static final int UNORDERED=81;
	public static final int VOID=82;
	public static final int WS=83;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public UmlLexerParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public UmlLexerParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return UmlLexerParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\UmlLexer.g"; }


		SemanticHandler h = new SemanticHandler ();

		public SemanticHandler getHandler () {
			return h;
		}


	  public void displayRecognitionError(String[] tokenNames,
	                                       RecognitionException e) {
			// in tokenNames c'è la lista dei token che si sarebbe voluto trovare
			// token che genera l'errore
			Token tk = input.LT(1);
	    // header e corpo dell'errore gestito automaticamente da ANTLR
			String hdr = getErrorHeader(e);
			String msg = getErrorMessage(e, tokenNames);
			
			// passo tutto all'handler che lo 
			h.handleError(tokenNames, tk, e, hdr, msg);
	  }




	// $ANTLR start "classDefinitionRule"
	// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\UmlLexer.g:42:1: classDefinitionRule : (a= ABSTRACT )? CLASS c= ID classCodeRule ;
	public final void classDefinitionRule() throws RecognitionException {
		Token a=null;
		Token c=null;

		try {
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\UmlLexer.g:43:2: ( (a= ABSTRACT )? CLASS c= ID classCodeRule )
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\UmlLexer.g:44:3: (a= ABSTRACT )? CLASS c= ID classCodeRule
			{
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\UmlLexer.g:44:4: (a= ABSTRACT )?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==ABSTRACT) ) {
				alt1=1;
			}
			switch (alt1) {
				case 1 :
					// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\UmlLexer.g:44:4: a= ABSTRACT
					{
					a=(Token)match(input,ABSTRACT,FOLLOW_ABSTRACT_in_classDefinitionRule62); 
					}
					break;

			}

			match(input,CLASS,FOLLOW_CLASS_in_classDefinitionRule67); 
			c=(Token)match(input,ID,FOLLOW_ID_in_classDefinitionRule73); 
			 h.manageClassName (a, c); 
			pushFollow(FOLLOW_classCodeRule_in_classDefinitionRule83);
			classCodeRule();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "classDefinitionRule"



	// $ANTLR start "relationsDefinitionRule"
	// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\UmlLexer.g:50:1: relationsDefinitionRule : RELATIONS DP LBR ( relationCodeRule )* RBR ;
	public final void relationsDefinitionRule() throws RecognitionException {
		try {
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\UmlLexer.g:51:2: ( RELATIONS DP LBR ( relationCodeRule )* RBR )
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\UmlLexer.g:52:3: RELATIONS DP LBR ( relationCodeRule )* RBR
			{
			match(input,RELATIONS,FOLLOW_RELATIONS_in_relationsDefinitionRule97); 
			match(input,DP,FOLLOW_DP_in_relationsDefinitionRule101); 
			match(input,LBR,FOLLOW_LBR_in_relationsDefinitionRule105); 
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\UmlLexer.g:55:3: ( relationCodeRule )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==ID) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\UmlLexer.g:55:3: relationCodeRule
					{
					pushFollow(FOLLOW_relationCodeRule_in_relationsDefinitionRule109);
					relationCodeRule();
					state._fsp--;

					}
					break;

				default :
					break loop2;
				}
			}

			match(input,RBR,FOLLOW_RBR_in_relationsDefinitionRule114); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "relationsDefinitionRule"



	// $ANTLR start "classCodeRule"
	// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\UmlLexer.g:60:1: classCodeRule : LBR ( ( ATTRIBUTE DP attributeDeclarationRule ) | ( OPERATION DP operationDeclarationRule ) )* RBR ;
	public final void classCodeRule() throws RecognitionException {
		try {
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\UmlLexer.g:61:2: ( LBR ( ( ATTRIBUTE DP attributeDeclarationRule ) | ( OPERATION DP operationDeclarationRule ) )* RBR )
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\UmlLexer.g:62:3: LBR ( ( ATTRIBUTE DP attributeDeclarationRule ) | ( OPERATION DP operationDeclarationRule ) )* RBR
			{
			match(input,LBR,FOLLOW_LBR_in_classCodeRule130); 
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\UmlLexer.g:63:3: ( ( ATTRIBUTE DP attributeDeclarationRule ) | ( OPERATION DP operationDeclarationRule ) )*
			loop3:
			while (true) {
				int alt3=3;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==ATTRIBUTE) ) {
					alt3=1;
				}
				else if ( (LA3_0==OPERATION) ) {
					alt3=2;
				}

				switch (alt3) {
				case 1 :
					// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\UmlLexer.g:64:4: ( ATTRIBUTE DP attributeDeclarationRule )
					{
					// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\UmlLexer.g:64:4: ( ATTRIBUTE DP attributeDeclarationRule )
					// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\UmlLexer.g:64:6: ATTRIBUTE DP attributeDeclarationRule
					{
					match(input,ATTRIBUTE,FOLLOW_ATTRIBUTE_in_classCodeRule142); 
					match(input,DP,FOLLOW_DP_in_classCodeRule144); 
					pushFollow(FOLLOW_attributeDeclarationRule_in_classCodeRule146);
					attributeDeclarationRule();
					state._fsp--;

					}

					}
					break;
				case 2 :
					// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\UmlLexer.g:66:4: ( OPERATION DP operationDeclarationRule )
					{
					// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\UmlLexer.g:66:4: ( OPERATION DP operationDeclarationRule )
					// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\UmlLexer.g:66:5: OPERATION DP operationDeclarationRule
					{
					match(input,OPERATION,FOLLOW_OPERATION_in_classCodeRule159); 
					match(input,DP,FOLLOW_DP_in_classCodeRule161); 
					pushFollow(FOLLOW_operationDeclarationRule_in_classCodeRule163);
					operationDeclarationRule();
					state._fsp--;

					}

					}
					break;

				default :
					break loop3;
				}
			}

			match(input,RBR,FOLLOW_RBR_in_classCodeRule174); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "classCodeRule"



	// $ANTLR start "relationCodeRule"
	// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\UmlLexer.g:71:1: relationCodeRule : nameRelation= ID nameClass1= ID mClass1= multiplicityRule relationTypeRule nameClass2= ID mClass2= multiplicityRule ( relationTypeRule nameClass3= ID mClass3= multiplicityRule )* ;
	public final void relationCodeRule() throws RecognitionException {
		Token nameRelation=null;
		Token nameClass1=null;
		Token nameClass2=null;
		Token nameClass3=null;

		try {
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\UmlLexer.g:72:2: (nameRelation= ID nameClass1= ID mClass1= multiplicityRule relationTypeRule nameClass2= ID mClass2= multiplicityRule ( relationTypeRule nameClass3= ID mClass3= multiplicityRule )* )
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\UmlLexer.g:73:3: nameRelation= ID nameClass1= ID mClass1= multiplicityRule relationTypeRule nameClass2= ID mClass2= multiplicityRule ( relationTypeRule nameClass3= ID mClass3= multiplicityRule )*
			{
			nameRelation=(Token)match(input,ID,FOLLOW_ID_in_relationCodeRule191); 
			nameClass1=(Token)match(input,ID,FOLLOW_ID_in_relationCodeRule200); 
			pushFollow(FOLLOW_multiplicityRule_in_relationCodeRule206);
			multiplicityRule();
			state._fsp--;

			pushFollow(FOLLOW_relationTypeRule_in_relationCodeRule210);
			relationTypeRule();
			state._fsp--;

			nameClass2=(Token)match(input,ID,FOLLOW_ID_in_relationCodeRule216); 
			pushFollow(FOLLOW_multiplicityRule_in_relationCodeRule222);
			multiplicityRule();
			state._fsp--;

			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\UmlLexer.g:80:3: ( relationTypeRule nameClass3= ID mClass3= multiplicityRule )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==COMPOSED||LA4_0==DXREL||LA4_0==INHERITS||LA4_0==SHARED||LA4_0==SXREL||LA4_0==UNDREL) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\UmlLexer.g:82:4: relationTypeRule nameClass3= ID mClass3= multiplicityRule
					{
					pushFollow(FOLLOW_relationTypeRule_in_relationCodeRule235);
					relationTypeRule();
					state._fsp--;

					nameClass3=(Token)match(input,ID,FOLLOW_ID_in_relationCodeRule242); 
					pushFollow(FOLLOW_multiplicityRule_in_relationCodeRule249);
					multiplicityRule();
					state._fsp--;

					}
					break;

				default :
					break loop4;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "relationCodeRule"



	// $ANTLR start "attributeDeclarationRule"
	// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\UmlLexer.g:90:1: attributeDeclarationRule : v= visibilityRule ( arrayTypeRule )? t= typeRule a= ID (d= ID )? multiplicityRule ( READONLY )? SC ;
	public final void attributeDeclarationRule() throws RecognitionException {
		Token a=null;
		Token d=null;
		String v =null;
		String t =null;

		try {
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\UmlLexer.g:91:2: (v= visibilityRule ( arrayTypeRule )? t= typeRule a= ID (d= ID )? multiplicityRule ( READONLY )? SC )
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\UmlLexer.g:92:3: v= visibilityRule ( arrayTypeRule )? t= typeRule a= ID (d= ID )? multiplicityRule ( READONLY )? SC
			{
			pushFollow(FOLLOW_visibilityRule_in_attributeDeclarationRule274);
			v=visibilityRule();
			state._fsp--;

			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\UmlLexer.g:93:3: ( arrayTypeRule )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==LIST||LA5_0==MULTISET||LA5_0==ORDEREDSET||LA5_0==SET) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\UmlLexer.g:93:3: arrayTypeRule
					{
					pushFollow(FOLLOW_arrayTypeRule_in_attributeDeclarationRule285);
					arrayTypeRule();
					state._fsp--;

					}
					break;

			}

			pushFollow(FOLLOW_typeRule_in_attributeDeclarationRule292);
			t=typeRule();
			state._fsp--;

			a=(Token)match(input,ID,FOLLOW_ID_in_attributeDeclarationRule298); 
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\UmlLexer.g:96:4: (d= ID )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==ID) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\UmlLexer.g:96:4: d= ID
					{
					d=(Token)match(input,ID,FOLLOW_ID_in_attributeDeclarationRule313); 
					}
					break;

			}

				h.varDeclaration (v, a, d); 
			pushFollow(FOLLOW_multiplicityRule_in_attributeDeclarationRule327);
			multiplicityRule();
			state._fsp--;

			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\UmlLexer.g:98:3: ( READONLY )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==READONLY) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\UmlLexer.g:98:3: READONLY
					{
					match(input,READONLY,FOLLOW_READONLY_in_attributeDeclarationRule331); 
					}
					break;

			}

			match(input,SC,FOLLOW_SC_in_attributeDeclarationRule336); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "attributeDeclarationRule"



	// $ANTLR start "visibilityRule"
	// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\UmlLexer.g:102:1: visibilityRule returns [String type] : (t= PUBLIC |t= PROTECTED |t= PRIVATE |t= PACKAGE ) ;
	public final String visibilityRule() throws RecognitionException {
		String type = null;


		Token t=null;

		try {
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\UmlLexer.g:103:2: ( (t= PUBLIC |t= PROTECTED |t= PRIVATE |t= PACKAGE ) )
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\UmlLexer.g:104:3: (t= PUBLIC |t= PROTECTED |t= PRIVATE |t= PACKAGE )
			{
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\UmlLexer.g:104:3: (t= PUBLIC |t= PROTECTED |t= PRIVATE |t= PACKAGE )
			int alt8=4;
			switch ( input.LA(1) ) {
			case PUBLIC:
				{
				alt8=1;
				}
				break;
			case PROTECTED:
				{
				alt8=2;
				}
				break;
			case PRIVATE:
				{
				alt8=3;
				}
				break;
			case PACKAGE:
				{
				alt8=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}
			switch (alt8) {
				case 1 :
					// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\UmlLexer.g:104:5: t= PUBLIC
					{
					t=(Token)match(input,PUBLIC,FOLLOW_PUBLIC_in_visibilityRule359); 
					}
					break;
				case 2 :
					// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\UmlLexer.g:105:5: t= PROTECTED
					{
					t=(Token)match(input,PROTECTED,FOLLOW_PROTECTED_in_visibilityRule367); 
					}
					break;
				case 3 :
					// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\UmlLexer.g:106:5: t= PRIVATE
					{
					t=(Token)match(input,PRIVATE,FOLLOW_PRIVATE_in_visibilityRule375); 
					}
					break;
				case 4 :
					// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\UmlLexer.g:107:5: t= PACKAGE
					{
					t=(Token)match(input,PACKAGE,FOLLOW_PACKAGE_in_visibilityRule383); 
					}
					break;

			}

			 visibility = t.getText(); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return type;
	}
	// $ANTLR end "visibilityRule"



	// $ANTLR start "arrayTypeRule"
	// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\UmlLexer.g:113:1: arrayTypeRule returns [String type] : (t= SET |t= MULTISET |t= LIST |t= ORDEREDSET ) ;
	public final String arrayTypeRule() throws RecognitionException {
		String type = null;


		Token t=null;

		try {
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\UmlLexer.g:114:2: ( (t= SET |t= MULTISET |t= LIST |t= ORDEREDSET ) )
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\UmlLexer.g:115:3: (t= SET |t= MULTISET |t= LIST |t= ORDEREDSET )
			{
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\UmlLexer.g:115:3: (t= SET |t= MULTISET |t= LIST |t= ORDEREDSET )
			int alt9=4;
			switch ( input.LA(1) ) {
			case SET:
				{
				alt9=1;
				}
				break;
			case MULTISET:
				{
				alt9=2;
				}
				break;
			case LIST:
				{
				alt9=3;
				}
				break;
			case ORDEREDSET:
				{
				alt9=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}
			switch (alt9) {
				case 1 :
					// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\UmlLexer.g:115:5: t= SET
					{
					t=(Token)match(input,SET,FOLLOW_SET_in_arrayTypeRule426); 
					}
					break;
				case 2 :
					// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\UmlLexer.g:116:5: t= MULTISET
					{
					t=(Token)match(input,MULTISET,FOLLOW_MULTISET_in_arrayTypeRule434); 
					}
					break;
				case 3 :
					// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\UmlLexer.g:117:5: t= LIST
					{
					t=(Token)match(input,LIST,FOLLOW_LIST_in_arrayTypeRule442); 
					}
					break;
				case 4 :
					// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\UmlLexer.g:118:5: t= ORDEREDSET
					{
					t=(Token)match(input,ORDEREDSET,FOLLOW_ORDEREDSET_in_arrayTypeRule450); 
					}
					break;

			}

			 arrayType = t.getText(); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return type;
	}
	// $ANTLR end "arrayTypeRule"



	// $ANTLR start "typeRule"
	// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\UmlLexer.g:123:1: typeRule returns [String type] : (t= INT_TYPE |t= FLOAT_TYPE |t= LONG_TYPE |t= DOUBLE_TYPE |t= BOOLEAN_TYPE |t= CHAR_TYPE |t= STRING_TYPE ) ;
	public final String typeRule() throws RecognitionException {
		String type = null;


		Token t=null;

		try {
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\UmlLexer.g:124:2: ( (t= INT_TYPE |t= FLOAT_TYPE |t= LONG_TYPE |t= DOUBLE_TYPE |t= BOOLEAN_TYPE |t= CHAR_TYPE |t= STRING_TYPE ) )
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\UmlLexer.g:125:3: (t= INT_TYPE |t= FLOAT_TYPE |t= LONG_TYPE |t= DOUBLE_TYPE |t= BOOLEAN_TYPE |t= CHAR_TYPE |t= STRING_TYPE )
			{
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\UmlLexer.g:125:3: (t= INT_TYPE |t= FLOAT_TYPE |t= LONG_TYPE |t= DOUBLE_TYPE |t= BOOLEAN_TYPE |t= CHAR_TYPE |t= STRING_TYPE )
			int alt10=7;
			switch ( input.LA(1) ) {
			case INT_TYPE:
				{
				alt10=1;
				}
				break;
			case FLOAT_TYPE:
				{
				alt10=2;
				}
				break;
			case LONG_TYPE:
				{
				alt10=3;
				}
				break;
			case DOUBLE_TYPE:
				{
				alt10=4;
				}
				break;
			case BOOLEAN_TYPE:
				{
				alt10=5;
				}
				break;
			case CHAR_TYPE:
				{
				alt10=6;
				}
				break;
			case STRING_TYPE:
				{
				alt10=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}
			switch (alt10) {
				case 1 :
					// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\UmlLexer.g:125:5: t= INT_TYPE
					{
					t=(Token)match(input,INT_TYPE,FOLLOW_INT_TYPE_in_typeRule491); 
					}
					break;
				case 2 :
					// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\UmlLexer.g:126:5: t= FLOAT_TYPE
					{
					t=(Token)match(input,FLOAT_TYPE,FOLLOW_FLOAT_TYPE_in_typeRule499); 
					}
					break;
				case 3 :
					// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\UmlLexer.g:127:5: t= LONG_TYPE
					{
					t=(Token)match(input,LONG_TYPE,FOLLOW_LONG_TYPE_in_typeRule507); 
					}
					break;
				case 4 :
					// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\UmlLexer.g:128:5: t= DOUBLE_TYPE
					{
					t=(Token)match(input,DOUBLE_TYPE,FOLLOW_DOUBLE_TYPE_in_typeRule515); 
					}
					break;
				case 5 :
					// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\UmlLexer.g:129:5: t= BOOLEAN_TYPE
					{
					t=(Token)match(input,BOOLEAN_TYPE,FOLLOW_BOOLEAN_TYPE_in_typeRule523); 
					}
					break;
				case 6 :
					// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\UmlLexer.g:130:5: t= CHAR_TYPE
					{
					t=(Token)match(input,CHAR_TYPE,FOLLOW_CHAR_TYPE_in_typeRule531); 
					}
					break;
				case 7 :
					// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\UmlLexer.g:131:5: t= STRING_TYPE
					{
					t=(Token)match(input,STRING_TYPE,FOLLOW_STRING_TYPE_in_typeRule539); 
					}
					break;

			}

			 type = t.getText(); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return type;
	}
	// $ANTLR end "typeRule"



	// $ANTLR start "relationTypeRule"
	// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\UmlLexer.g:136:1: relationTypeRule returns [String type] : ( ( UNDREL | SXREL | DXREL ) | ( INHERITS ) | ( SHARED | COMPOSED ) );
	public final String relationTypeRule() throws RecognitionException {
		String type = null;


		try {
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\UmlLexer.g:137:2: ( ( UNDREL | SXREL | DXREL ) | ( INHERITS ) | ( SHARED | COMPOSED ) )
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\UmlLexer.g:
			{
			if ( input.LA(1)==COMPOSED||input.LA(1)==DXREL||input.LA(1)==INHERITS||input.LA(1)==SHARED||input.LA(1)==SXREL||input.LA(1)==UNDREL ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return type;
	}
	// $ANTLR end "relationTypeRule"



	// $ANTLR start "multiplicityRule"
	// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\UmlLexer.g:146:1: multiplicityRule : ( ( MIN n= ID )? ( MAX m= ID )? ) ;
	public final void multiplicityRule() throws RecognitionException {
		Token n=null;
		Token m=null;

		try {
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\UmlLexer.g:147:2: ( ( ( MIN n= ID )? ( MAX m= ID )? ) )
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\UmlLexer.g:148:3: ( ( MIN n= ID )? ( MAX m= ID )? )
			{
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\UmlLexer.g:148:3: ( ( MIN n= ID )? ( MAX m= ID )? )
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\UmlLexer.g:149:3: ( MIN n= ID )? ( MAX m= ID )?
			{
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\UmlLexer.g:149:3: ( MIN n= ID )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==MIN) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\UmlLexer.g:149:4: MIN n= ID
					{
					match(input,MIN,FOLLOW_MIN_in_multiplicityRule641); 
					n=(Token)match(input,ID,FOLLOW_ID_in_multiplicityRule645); 
					}
					break;

			}

			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\UmlLexer.g:150:3: ( MAX m= ID )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==MAX) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\UmlLexer.g:150:4: MAX m= ID
					{
					match(input,MAX,FOLLOW_MAX_in_multiplicityRule652); 
					m=(Token)match(input,ID,FOLLOW_ID_in_multiplicityRule656); 
					}
					break;

			}

			}

				h.varDeclaration (n, m); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "multiplicityRule"



	// $ANTLR start "operationDeclarationRule"
	// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\UmlLexer.g:154:1: operationDeclarationRule : v= visibilityRule t= typeRule a= ID LP (pType= typeRule pID= ID )* RP ;
	public final void operationDeclarationRule() throws RecognitionException {
		Token a=null;
		Token pID=null;
		String v =null;
		String t =null;
		String pType =null;

		try {
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\UmlLexer.g:155:2: (v= visibilityRule t= typeRule a= ID LP (pType= typeRule pID= ID )* RP )
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\UmlLexer.g:156:3: v= visibilityRule t= typeRule a= ID LP (pType= typeRule pID= ID )* RP
			{
			pushFollow(FOLLOW_visibilityRule_in_operationDeclarationRule689);
			v=visibilityRule();
			state._fsp--;

			pushFollow(FOLLOW_typeRule_in_operationDeclarationRule695);
			t=typeRule();
			state._fsp--;

			a=(Token)match(input,ID,FOLLOW_ID_in_operationDeclarationRule701); 
			match(input,LP,FOLLOW_LP_in_operationDeclarationRule705); 
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\UmlLexer.g:160:3: (pType= typeRule pID= ID )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==BOOLEAN_TYPE||LA13_0==CHAR_TYPE||LA13_0==DOUBLE_TYPE||LA13_0==FLOAT_TYPE||LA13_0==INT_TYPE||LA13_0==LONG_TYPE||LA13_0==STRING_TYPE) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\UmlLexer.g:161:4: pType= typeRule pID= ID
					{
					pushFollow(FOLLOW_typeRule_in_operationDeclarationRule716);
					pType=typeRule();
					state._fsp--;

					pID=(Token)match(input,ID,FOLLOW_ID_in_operationDeclarationRule723); 
					}
					break;

				default :
					break loop13;
				}
			}

			match(input,RP,FOLLOW_RP_in_operationDeclarationRule732); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "operationDeclarationRule"

	// Delegated rules



	public static final BitSet FOLLOW_ABSTRACT_in_classDefinitionRule62 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_CLASS_in_classDefinitionRule67 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_ID_in_classDefinitionRule73 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_classCodeRule_in_classDefinitionRule83 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RELATIONS_in_relationsDefinitionRule97 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_DP_in_relationsDefinitionRule101 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_LBR_in_relationsDefinitionRule105 = new BitSet(new long[]{0x8000000400000000L});
	public static final BitSet FOLLOW_relationCodeRule_in_relationsDefinitionRule109 = new BitSet(new long[]{0x8000000400000000L});
	public static final BitSet FOLLOW_RBR_in_relationsDefinitionRule114 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBR_in_classCodeRule130 = new BitSet(new long[]{0x8080000000000080L});
	public static final BitSet FOLLOW_ATTRIBUTE_in_classCodeRule142 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_DP_in_classCodeRule144 = new BitSet(new long[]{0x3C00000000000000L});
	public static final BitSet FOLLOW_attributeDeclarationRule_in_classCodeRule146 = new BitSet(new long[]{0x8080000000000080L});
	public static final BitSet FOLLOW_OPERATION_in_classCodeRule159 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_DP_in_classCodeRule161 = new BitSet(new long[]{0x3C00000000000000L});
	public static final BitSet FOLLOW_operationDeclarationRule_in_classCodeRule163 = new BitSet(new long[]{0x8080000000000080L});
	public static final BitSet FOLLOW_RBR_in_classCodeRule174 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_relationCodeRule191 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_ID_in_relationCodeRule200 = new BitSet(new long[]{0x0000C01000410000L,0x0000000000004820L});
	public static final BitSet FOLLOW_multiplicityRule_in_relationCodeRule206 = new BitSet(new long[]{0x0000001000410000L,0x0000000000004820L});
	public static final BitSet FOLLOW_relationTypeRule_in_relationCodeRule210 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_ID_in_relationCodeRule216 = new BitSet(new long[]{0x0000C01000410000L,0x0000000000004820L});
	public static final BitSet FOLLOW_multiplicityRule_in_relationCodeRule222 = new BitSet(new long[]{0x0000001000410002L,0x0000000000004820L});
	public static final BitSet FOLLOW_relationTypeRule_in_relationCodeRule235 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_ID_in_relationCodeRule242 = new BitSet(new long[]{0x0000C01000410000L,0x0000000000004820L});
	public static final BitSet FOLLOW_multiplicityRule_in_relationCodeRule249 = new BitSet(new long[]{0x0000001000410002L,0x0000000000004820L});
	public static final BitSet FOLLOW_visibilityRule_in_attributeDeclarationRule274 = new BitSet(new long[]{0x02040C8080100900L,0x0000000000000410L});
	public static final BitSet FOLLOW_arrayTypeRule_in_attributeDeclarationRule285 = new BitSet(new long[]{0x0000088080100900L,0x0000000000000400L});
	public static final BitSet FOLLOW_typeRule_in_attributeDeclarationRule292 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_ID_in_attributeDeclarationRule298 = new BitSet(new long[]{0x0000C00400000000L,0x0000000000000009L});
	public static final BitSet FOLLOW_ID_in_attributeDeclarationRule313 = new BitSet(new long[]{0x0000C00000000000L,0x0000000000000009L});
	public static final BitSet FOLLOW_multiplicityRule_in_attributeDeclarationRule327 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000009L});
	public static final BitSet FOLLOW_READONLY_in_attributeDeclarationRule331 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_SC_in_attributeDeclarationRule336 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PUBLIC_in_visibilityRule359 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PROTECTED_in_visibilityRule367 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRIVATE_in_visibilityRule375 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PACKAGE_in_visibilityRule383 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SET_in_arrayTypeRule426 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MULTISET_in_arrayTypeRule434 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LIST_in_arrayTypeRule442 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ORDEREDSET_in_arrayTypeRule450 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_TYPE_in_typeRule491 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_TYPE_in_typeRule499 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LONG_TYPE_in_typeRule507 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOUBLE_TYPE_in_typeRule515 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOLEAN_TYPE_in_typeRule523 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_TYPE_in_typeRule531 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_TYPE_in_typeRule539 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MIN_in_multiplicityRule641 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_ID_in_multiplicityRule645 = new BitSet(new long[]{0x0000400000000002L});
	public static final BitSet FOLLOW_MAX_in_multiplicityRule652 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_ID_in_multiplicityRule656 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_visibilityRule_in_operationDeclarationRule689 = new BitSet(new long[]{0x0000088080100900L,0x0000000000000400L});
	public static final BitSet FOLLOW_typeRule_in_operationDeclarationRule695 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_ID_in_operationDeclarationRule701 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_LP_in_operationDeclarationRule705 = new BitSet(new long[]{0x0000088080100900L,0x0000000000000404L});
	public static final BitSet FOLLOW_typeRule_in_operationDeclarationRule716 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_ID_in_operationDeclarationRule723 = new BitSet(new long[]{0x0000088080100900L,0x0000000000000404L});
	public static final BitSet FOLLOW_RP_in_operationDeclarationRule732 = new BitSet(new long[]{0x0000000000000002L});
}
