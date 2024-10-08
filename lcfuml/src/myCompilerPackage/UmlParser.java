// $ANTLR 3.5.1 C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g 2024-10-08 17:45:38

	package myCompilerPackage; 		


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class UmlParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AADD", "ABSTRACT", "ADD", "ATTRIBUTE", 
		"BOOLEAN_TYPE", "BYTE", "CHAR", "CHAR_TYPE", "CLASS", "COMMA", "COMMENT", 
		"COMP", "COMPOSED", "CONST", "DIV", "DOT", "DOUBLE_TYPE", "DP", "DXREL", 
		"ENUM", "EQ", "ERROR_TOKEN", "ESC_SEQ", "EXPONENT", "EXTENDS", "FALSE", 
		"FINAL", "FLOAT", "FLOAT_TYPE", "GTE", "HEX_DIGIT", "ID", "IMPLEMENTS", 
		"INHERITS", "INT", "INTERFACE", "INT_TYPE", "LB", "LBR", "LIST", "LONG_TYPE", 
		"LP", "LTE", "MAX", "MIN", "MOD", "MUL", "MULTISET", "NEQ", "NONUNIQUE", 
		"NULL", "OCTAL_ESC", "OPERATION", "ORDER", "ORDEREDSET", "PACKAGE", "PRIVATE", 
		"PROTECTED", "PUBLIC", "RB", "RBR", "READONLY", "RELATIONS", "RP", "SC", 
		"SET", "SHARED", "SHORT", "SSUB", "STATIC", "STRING", "STRING_TYPE", "SXREL", 
		"THROWS", "TRUE", "UNDREL", "UNICODE_ESC", "UNIQUE", "UNORDERED", "VOID", 
		"WS"
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
	public static final int ERROR_TOKEN=25;
	public static final int ESC_SEQ=26;
	public static final int EXPONENT=27;
	public static final int EXTENDS=28;
	public static final int FALSE=29;
	public static final int FINAL=30;
	public static final int FLOAT=31;
	public static final int FLOAT_TYPE=32;
	public static final int GTE=33;
	public static final int HEX_DIGIT=34;
	public static final int ID=35;
	public static final int IMPLEMENTS=36;
	public static final int INHERITS=37;
	public static final int INT=38;
	public static final int INTERFACE=39;
	public static final int INT_TYPE=40;
	public static final int LB=41;
	public static final int LBR=42;
	public static final int LIST=43;
	public static final int LONG_TYPE=44;
	public static final int LP=45;
	public static final int LTE=46;
	public static final int MAX=47;
	public static final int MIN=48;
	public static final int MOD=49;
	public static final int MUL=50;
	public static final int MULTISET=51;
	public static final int NEQ=52;
	public static final int NONUNIQUE=53;
	public static final int NULL=54;
	public static final int OCTAL_ESC=55;
	public static final int OPERATION=56;
	public static final int ORDER=57;
	public static final int ORDEREDSET=58;
	public static final int PACKAGE=59;
	public static final int PRIVATE=60;
	public static final int PROTECTED=61;
	public static final int PUBLIC=62;
	public static final int RB=63;
	public static final int RBR=64;
	public static final int READONLY=65;
	public static final int RELATIONS=66;
	public static final int RP=67;
	public static final int SC=68;
	public static final int SET=69;
	public static final int SHARED=70;
	public static final int SHORT=71;
	public static final int SSUB=72;
	public static final int STATIC=73;
	public static final int STRING=74;
	public static final int STRING_TYPE=75;
	public static final int SXREL=76;
	public static final int THROWS=77;
	public static final int TRUE=78;
	public static final int UNDREL=79;
	public static final int UNICODE_ESC=80;
	public static final int UNIQUE=81;
	public static final int UNORDERED=82;
	public static final int VOID=83;
	public static final int WS=84;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public UmlParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public UmlParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return UmlParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g"; }


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




	// $ANTLR start "start"
	// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:43:1: start : ( classDefinitionRule )* ( relationsDefinitionRule )? ;
	public final void start() throws RecognitionException {
		try {
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:44:2: ( ( classDefinitionRule )* ( relationsDefinitionRule )? )
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:45:3: ( classDefinitionRule )* ( relationsDefinitionRule )?
			{
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:45:3: ( classDefinitionRule )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==ABSTRACT||LA1_0==CLASS) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:45:3: classDefinitionRule
					{
					pushFollow(FOLLOW_classDefinitionRule_in_start60);
					classDefinitionRule();
					state._fsp--;

					}
					break;

				default :
					break loop1;
				}
			}

			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:46:3: ( relationsDefinitionRule )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==RELATIONS) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:46:3: relationsDefinitionRule
					{
					pushFollow(FOLLOW_relationsDefinitionRule_in_start65);
					relationsDefinitionRule();
					state._fsp--;

					}
					break;

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
	// $ANTLR end "start"



	// $ANTLR start "classDefinitionRule"
	// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:50:1: classDefinitionRule : (a= ABSTRACT )? CLASS c= ID classCodeRule ;
	public final void classDefinitionRule() throws RecognitionException {
		Token a=null;
		Token c=null;

		try {
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:51:2: ( (a= ABSTRACT )? CLASS c= ID classCodeRule )
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:52:3: (a= ABSTRACT )? CLASS c= ID classCodeRule
			{
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:52:4: (a= ABSTRACT )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==ABSTRACT) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:52:4: a= ABSTRACT
					{
					a=(Token)match(input,ABSTRACT,FOLLOW_ABSTRACT_in_classDefinitionRule83); 
					}
					break;

			}

			match(input,CLASS,FOLLOW_CLASS_in_classDefinitionRule88); 
			c=(Token)match(input,ID,FOLLOW_ID_in_classDefinitionRule94); 
			 h.manageClassName (c); 
			pushFollow(FOLLOW_classCodeRule_in_classDefinitionRule104);
			classCodeRule();
			state._fsp--;

			 h.setClass(c); 
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
	// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:58:1: relationsDefinitionRule : RELATIONS DP LBR ( relationCodeRule )* RBR ;
	public final void relationsDefinitionRule() throws RecognitionException {
		try {
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:59:2: ( RELATIONS DP LBR ( relationCodeRule )* RBR )
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:60:3: RELATIONS DP LBR ( relationCodeRule )* RBR
			{
			match(input,RELATIONS,FOLLOW_RELATIONS_in_relationsDefinitionRule121); 
			match(input,DP,FOLLOW_DP_in_relationsDefinitionRule125); 
			match(input,LBR,FOLLOW_LBR_in_relationsDefinitionRule129); 
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:63:3: ( relationCodeRule )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==ID) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:63:3: relationCodeRule
					{
					pushFollow(FOLLOW_relationCodeRule_in_relationsDefinitionRule133);
					relationCodeRule();
					state._fsp--;

					}
					break;

				default :
					break loop4;
				}
			}

			match(input,RBR,FOLLOW_RBR_in_relationsDefinitionRule138); 
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
	// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:68:1: classCodeRule : LBR ( ( ATTRIBUTE DP attributeDeclarationRule ) | ( OPERATION DP operationDeclarationRule ) )* RBR ;
	public final void classCodeRule() throws RecognitionException {
		try {
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:69:2: ( LBR ( ( ATTRIBUTE DP attributeDeclarationRule ) | ( OPERATION DP operationDeclarationRule ) )* RBR )
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:70:3: LBR ( ( ATTRIBUTE DP attributeDeclarationRule ) | ( OPERATION DP operationDeclarationRule ) )* RBR
			{
			match(input,LBR,FOLLOW_LBR_in_classCodeRule154); 
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:71:3: ( ( ATTRIBUTE DP attributeDeclarationRule ) | ( OPERATION DP operationDeclarationRule ) )*
			loop5:
			while (true) {
				int alt5=3;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==ATTRIBUTE) ) {
					alt5=1;
				}
				else if ( (LA5_0==OPERATION) ) {
					alt5=2;
				}

				switch (alt5) {
				case 1 :
					// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:72:4: ( ATTRIBUTE DP attributeDeclarationRule )
					{
					// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:72:4: ( ATTRIBUTE DP attributeDeclarationRule )
					// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:72:6: ATTRIBUTE DP attributeDeclarationRule
					{
					match(input,ATTRIBUTE,FOLLOW_ATTRIBUTE_in_classCodeRule166); 
					match(input,DP,FOLLOW_DP_in_classCodeRule168); 
					pushFollow(FOLLOW_attributeDeclarationRule_in_classCodeRule170);
					attributeDeclarationRule();
					state._fsp--;

					}

					}
					break;
				case 2 :
					// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:74:4: ( OPERATION DP operationDeclarationRule )
					{
					// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:74:4: ( OPERATION DP operationDeclarationRule )
					// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:74:5: OPERATION DP operationDeclarationRule
					{
					match(input,OPERATION,FOLLOW_OPERATION_in_classCodeRule183); 
					match(input,DP,FOLLOW_DP_in_classCodeRule185); 
					pushFollow(FOLLOW_operationDeclarationRule_in_classCodeRule187);
					operationDeclarationRule();
					state._fsp--;

					}

					}
					break;

				default :
					break loop5;
				}
			}

			match(input,RBR,FOLLOW_RBR_in_classCodeRule198); 
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
	// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:79:1: relationCodeRule : nameRelation= ID nameClass1= ID mClass1= multiplicityRule relationTypeRule nameClass2= ID mClass2= multiplicityRule ( UNDREL infoClass= ID )? ;
	public final void relationCodeRule() throws RecognitionException {
		Token nameRelation=null;
		Token nameClass1=null;
		Token nameClass2=null;
		Token infoClass=null;

		try {
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:80:2: (nameRelation= ID nameClass1= ID mClass1= multiplicityRule relationTypeRule nameClass2= ID mClass2= multiplicityRule ( UNDREL infoClass= ID )? )
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:81:3: nameRelation= ID nameClass1= ID mClass1= multiplicityRule relationTypeRule nameClass2= ID mClass2= multiplicityRule ( UNDREL infoClass= ID )?
			{
			nameRelation=(Token)match(input,ID,FOLLOW_ID_in_relationCodeRule215); 
			nameClass1=(Token)match(input,ID,FOLLOW_ID_in_relationCodeRule224); 
			pushFollow(FOLLOW_multiplicityRule_in_relationCodeRule230);
			multiplicityRule();
			state._fsp--;

			pushFollow(FOLLOW_relationTypeRule_in_relationCodeRule234);
			relationTypeRule();
			state._fsp--;

			nameClass2=(Token)match(input,ID,FOLLOW_ID_in_relationCodeRule240); 
			pushFollow(FOLLOW_multiplicityRule_in_relationCodeRule246);
			multiplicityRule();
			state._fsp--;

			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:88:3: ( UNDREL infoClass= ID )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==UNDREL) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:89:4: UNDREL infoClass= ID
					{
					match(input,UNDREL,FOLLOW_UNDREL_in_relationCodeRule255); 
					infoClass=(Token)match(input,ID,FOLLOW_ID_in_relationCodeRule262); 
					}
					break;

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
	// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:96:1: attributeDeclarationRule : v= visibilityRule (aType= arrayTypeRule )? t= typeRule a= ID (d= ID )? ( multiplicityRule )? ( READONLY )? SC ;
	public final void attributeDeclarationRule() throws RecognitionException {
		Token a=null;
		Token d=null;
		String v =null;
		String aType =null;
		String t =null;

		try {
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:97:2: (v= visibilityRule (aType= arrayTypeRule )? t= typeRule a= ID (d= ID )? ( multiplicityRule )? ( READONLY )? SC )
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:98:3: v= visibilityRule (aType= arrayTypeRule )? t= typeRule a= ID (d= ID )? ( multiplicityRule )? ( READONLY )? SC
			{
			pushFollow(FOLLOW_visibilityRule_in_attributeDeclarationRule287);
			v=visibilityRule();
			state._fsp--;

			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:99:8: (aType= arrayTypeRule )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==LIST||LA7_0==MULTISET||LA7_0==ORDEREDSET||LA7_0==SET) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:99:8: aType= arrayTypeRule
					{
					pushFollow(FOLLOW_arrayTypeRule_in_attributeDeclarationRule300);
					aType=arrayTypeRule();
					state._fsp--;

					}
					break;

			}

			pushFollow(FOLLOW_typeRule_in_attributeDeclarationRule307);
			t=typeRule();
			state._fsp--;

			a=(Token)match(input,ID,FOLLOW_ID_in_attributeDeclarationRule313); 
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:102:4: (d= ID )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==ID) ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:102:4: d= ID
					{
					d=(Token)match(input,ID,FOLLOW_ID_in_attributeDeclarationRule328); 
					}
					break;

			}

			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:103:3: ( multiplicityRule )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==MIN) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:103:3: multiplicityRule
					{
					pushFollow(FOLLOW_multiplicityRule_in_attributeDeclarationRule341);
					multiplicityRule();
					state._fsp--;

					}
					break;

			}

			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:104:3: ( READONLY )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==READONLY) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:104:3: READONLY
					{
					match(input,READONLY,FOLLOW_READONLY_in_attributeDeclarationRule360); 
					}
					break;

			}

			match(input,SC,FOLLOW_SC_in_attributeDeclarationRule365); 
			 h.attDeclaration (v, aType, t, a, d); 
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
	// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:108:1: visibilityRule returns [String visibility] : (t= PUBLIC |t= PROTECTED |t= PRIVATE |t= PACKAGE ) ;
	public final String visibilityRule() throws RecognitionException {
		String visibility = null;


		Token t=null;

		try {
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:109:2: ( (t= PUBLIC |t= PROTECTED |t= PRIVATE |t= PACKAGE ) )
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:110:3: (t= PUBLIC |t= PROTECTED |t= PRIVATE |t= PACKAGE )
			{
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:110:3: (t= PUBLIC |t= PROTECTED |t= PRIVATE |t= PACKAGE )
			int alt11=4;
			switch ( input.LA(1) ) {
			case PUBLIC:
				{
				alt11=1;
				}
				break;
			case PROTECTED:
				{
				alt11=2;
				}
				break;
			case PRIVATE:
				{
				alt11=3;
				}
				break;
			case PACKAGE:
				{
				alt11=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}
			switch (alt11) {
				case 1 :
					// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:110:5: t= PUBLIC
					{
					t=(Token)match(input,PUBLIC,FOLLOW_PUBLIC_in_visibilityRule398); 
					}
					break;
				case 2 :
					// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:111:5: t= PROTECTED
					{
					t=(Token)match(input,PROTECTED,FOLLOW_PROTECTED_in_visibilityRule406); 
					}
					break;
				case 3 :
					// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:112:5: t= PRIVATE
					{
					t=(Token)match(input,PRIVATE,FOLLOW_PRIVATE_in_visibilityRule414); 
					}
					break;
				case 4 :
					// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:113:5: t= PACKAGE
					{
					t=(Token)match(input,PACKAGE,FOLLOW_PACKAGE_in_visibilityRule422); 
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
		return visibility;
	}
	// $ANTLR end "visibilityRule"



	// $ANTLR start "arrayTypeRule"
	// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:119:1: arrayTypeRule returns [String arrayType] : (t= SET |t= MULTISET |t= LIST |t= ORDEREDSET ) ;
	public final String arrayTypeRule() throws RecognitionException {
		String arrayType = null;


		Token t=null;

		try {
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:120:2: ( (t= SET |t= MULTISET |t= LIST |t= ORDEREDSET ) )
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:121:3: (t= SET |t= MULTISET |t= LIST |t= ORDEREDSET )
			{
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:121:3: (t= SET |t= MULTISET |t= LIST |t= ORDEREDSET )
			int alt12=4;
			switch ( input.LA(1) ) {
			case SET:
				{
				alt12=1;
				}
				break;
			case MULTISET:
				{
				alt12=2;
				}
				break;
			case LIST:
				{
				alt12=3;
				}
				break;
			case ORDEREDSET:
				{
				alt12=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}
			switch (alt12) {
				case 1 :
					// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:121:5: t= SET
					{
					t=(Token)match(input,SET,FOLLOW_SET_in_arrayTypeRule465); 
					}
					break;
				case 2 :
					// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:122:5: t= MULTISET
					{
					t=(Token)match(input,MULTISET,FOLLOW_MULTISET_in_arrayTypeRule473); 
					}
					break;
				case 3 :
					// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:123:5: t= LIST
					{
					t=(Token)match(input,LIST,FOLLOW_LIST_in_arrayTypeRule481); 
					}
					break;
				case 4 :
					// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:124:5: t= ORDEREDSET
					{
					t=(Token)match(input,ORDEREDSET,FOLLOW_ORDEREDSET_in_arrayTypeRule489); 
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
		return arrayType;
	}
	// $ANTLR end "arrayTypeRule"



	// $ANTLR start "typeRule"
	// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:129:1: typeRule returns [String type] : (t= INT_TYPE |t= FLOAT_TYPE |t= LONG_TYPE |t= DOUBLE_TYPE |t= BOOLEAN_TYPE |t= CHAR_TYPE |t= STRING_TYPE |t= ID ) ;
	public final String typeRule() throws RecognitionException {
		String type = null;


		Token t=null;

		try {
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:130:2: ( (t= INT_TYPE |t= FLOAT_TYPE |t= LONG_TYPE |t= DOUBLE_TYPE |t= BOOLEAN_TYPE |t= CHAR_TYPE |t= STRING_TYPE |t= ID ) )
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:131:3: (t= INT_TYPE |t= FLOAT_TYPE |t= LONG_TYPE |t= DOUBLE_TYPE |t= BOOLEAN_TYPE |t= CHAR_TYPE |t= STRING_TYPE |t= ID )
			{
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:131:3: (t= INT_TYPE |t= FLOAT_TYPE |t= LONG_TYPE |t= DOUBLE_TYPE |t= BOOLEAN_TYPE |t= CHAR_TYPE |t= STRING_TYPE |t= ID )
			int alt13=8;
			switch ( input.LA(1) ) {
			case INT_TYPE:
				{
				alt13=1;
				}
				break;
			case FLOAT_TYPE:
				{
				alt13=2;
				}
				break;
			case LONG_TYPE:
				{
				alt13=3;
				}
				break;
			case DOUBLE_TYPE:
				{
				alt13=4;
				}
				break;
			case BOOLEAN_TYPE:
				{
				alt13=5;
				}
				break;
			case CHAR_TYPE:
				{
				alt13=6;
				}
				break;
			case STRING_TYPE:
				{
				alt13=7;
				}
				break;
			case ID:
				{
				alt13=8;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}
			switch (alt13) {
				case 1 :
					// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:131:5: t= INT_TYPE
					{
					t=(Token)match(input,INT_TYPE,FOLLOW_INT_TYPE_in_typeRule530); 
					}
					break;
				case 2 :
					// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:132:5: t= FLOAT_TYPE
					{
					t=(Token)match(input,FLOAT_TYPE,FOLLOW_FLOAT_TYPE_in_typeRule538); 
					}
					break;
				case 3 :
					// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:133:5: t= LONG_TYPE
					{
					t=(Token)match(input,LONG_TYPE,FOLLOW_LONG_TYPE_in_typeRule546); 
					}
					break;
				case 4 :
					// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:134:5: t= DOUBLE_TYPE
					{
					t=(Token)match(input,DOUBLE_TYPE,FOLLOW_DOUBLE_TYPE_in_typeRule554); 
					}
					break;
				case 5 :
					// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:135:5: t= BOOLEAN_TYPE
					{
					t=(Token)match(input,BOOLEAN_TYPE,FOLLOW_BOOLEAN_TYPE_in_typeRule562); 
					}
					break;
				case 6 :
					// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:136:5: t= CHAR_TYPE
					{
					t=(Token)match(input,CHAR_TYPE,FOLLOW_CHAR_TYPE_in_typeRule570); 
					}
					break;
				case 7 :
					// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:137:5: t= STRING_TYPE
					{
					t=(Token)match(input,STRING_TYPE,FOLLOW_STRING_TYPE_in_typeRule578); 
					}
					break;
				case 8 :
					// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:138:5: t= ID
					{
					t=(Token)match(input,ID,FOLLOW_ID_in_typeRule588); 
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
	// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:143:1: relationTypeRule returns [String type] : ( ( UNDREL | SXREL | DXREL ) | ( INHERITS ) | ( SHARED | COMPOSED ) );
	public final String relationTypeRule() throws RecognitionException {
		String type = null;


		try {
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:144:2: ( ( UNDREL | SXREL | DXREL ) | ( INHERITS ) | ( SHARED | COMPOSED ) )
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:
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
	// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:152:1: multiplicityRule : ( ( MIN n= ID ) ( MAX m= ID ) ) ;
	public final void multiplicityRule() throws RecognitionException {
		Token n=null;
		Token m=null;

		try {
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:153:2: ( ( ( MIN n= ID ) ( MAX m= ID ) ) )
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:154:3: ( ( MIN n= ID ) ( MAX m= ID ) )
			{
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:154:3: ( ( MIN n= ID ) ( MAX m= ID ) )
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:155:3: ( MIN n= ID ) ( MAX m= ID )
			{
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:155:3: ( MIN n= ID )
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:155:4: MIN n= ID
			{
			match(input,MIN,FOLLOW_MIN_in_multiplicityRule684); 
			n=(Token)match(input,ID,FOLLOW_ID_in_multiplicityRule688); 
			}

			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:156:3: ( MAX m= ID )
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:156:4: MAX m= ID
			{
			match(input,MAX,FOLLOW_MAX_in_multiplicityRule694); 
			m=(Token)match(input,ID,FOLLOW_ID_in_multiplicityRule698); 
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
	// $ANTLR end "multiplicityRule"



	// $ANTLR start "operationDeclarationRule"
	// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:160:1: operationDeclarationRule : v= visibilityRule t= typeRule a= ID LP (pType= typeRule pID= ID )* RP ;
	public final void operationDeclarationRule() throws RecognitionException {
		Token a=null;
		Token pID=null;
		String v =null;
		String t =null;
		String pType =null;

		try {
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:161:2: (v= visibilityRule t= typeRule a= ID LP (pType= typeRule pID= ID )* RP )
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:162:3: v= visibilityRule t= typeRule a= ID LP (pType= typeRule pID= ID )* RP
			{
			pushFollow(FOLLOW_visibilityRule_in_operationDeclarationRule729);
			v=visibilityRule();
			state._fsp--;

			pushFollow(FOLLOW_typeRule_in_operationDeclarationRule735);
			t=typeRule();
			state._fsp--;

			a=(Token)match(input,ID,FOLLOW_ID_in_operationDeclarationRule741); 
			match(input,LP,FOLLOW_LP_in_operationDeclarationRule745); 
			// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:166:3: (pType= typeRule pID= ID )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==BOOLEAN_TYPE||LA14_0==CHAR_TYPE||LA14_0==DOUBLE_TYPE||LA14_0==FLOAT_TYPE||LA14_0==ID||LA14_0==INT_TYPE||LA14_0==LONG_TYPE||LA14_0==STRING_TYPE) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// C:\\Users\\tiron\\Desktop\\Unibg\\2Magistrale\\ANNO I\\I Semestre\\Linguaggi formali e compilatori\\Progetto\\LFC2324_Project\\lcfuml\\src\\myCompilerPackage\\Uml.g:167:4: pType= typeRule pID= ID
					{
					pushFollow(FOLLOW_typeRule_in_operationDeclarationRule756);
					pType=typeRule();
					state._fsp--;

					pID=(Token)match(input,ID,FOLLOW_ID_in_operationDeclarationRule763); 
					}
					break;

				default :
					break loop14;
				}
			}

			match(input,RP,FOLLOW_RP_in_operationDeclarationRule772); 
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



	public static final BitSet FOLLOW_classDefinitionRule_in_start60 = new BitSet(new long[]{0x0000000000001022L,0x0000000000000004L});
	public static final BitSet FOLLOW_relationsDefinitionRule_in_start65 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ABSTRACT_in_classDefinitionRule83 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_CLASS_in_classDefinitionRule88 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_ID_in_classDefinitionRule94 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_classCodeRule_in_classDefinitionRule104 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RELATIONS_in_relationsDefinitionRule121 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_DP_in_relationsDefinitionRule125 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_LBR_in_relationsDefinitionRule129 = new BitSet(new long[]{0x0000000800000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_relationCodeRule_in_relationsDefinitionRule133 = new BitSet(new long[]{0x0000000800000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_RBR_in_relationsDefinitionRule138 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBR_in_classCodeRule154 = new BitSet(new long[]{0x0100000000000080L,0x0000000000000001L});
	public static final BitSet FOLLOW_ATTRIBUTE_in_classCodeRule166 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_DP_in_classCodeRule168 = new BitSet(new long[]{0x7800000000000000L});
	public static final BitSet FOLLOW_attributeDeclarationRule_in_classCodeRule170 = new BitSet(new long[]{0x0100000000000080L,0x0000000000000001L});
	public static final BitSet FOLLOW_OPERATION_in_classCodeRule183 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_DP_in_classCodeRule185 = new BitSet(new long[]{0x7800000000000000L});
	public static final BitSet FOLLOW_operationDeclarationRule_in_classCodeRule187 = new BitSet(new long[]{0x0100000000000080L,0x0000000000000001L});
	public static final BitSet FOLLOW_RBR_in_classCodeRule198 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_relationCodeRule215 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_ID_in_relationCodeRule224 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_multiplicityRule_in_relationCodeRule230 = new BitSet(new long[]{0x0000002000410000L,0x0000000000009040L});
	public static final BitSet FOLLOW_relationTypeRule_in_relationCodeRule234 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_ID_in_relationCodeRule240 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_multiplicityRule_in_relationCodeRule246 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
	public static final BitSet FOLLOW_UNDREL_in_relationCodeRule255 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_ID_in_relationCodeRule262 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_visibilityRule_in_attributeDeclarationRule287 = new BitSet(new long[]{0x0408190900100900L,0x0000000000000820L});
	public static final BitSet FOLLOW_arrayTypeRule_in_attributeDeclarationRule300 = new BitSet(new long[]{0x0000110900100900L,0x0000000000000800L});
	public static final BitSet FOLLOW_typeRule_in_attributeDeclarationRule307 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_ID_in_attributeDeclarationRule313 = new BitSet(new long[]{0x0001000800000000L,0x0000000000000012L});
	public static final BitSet FOLLOW_ID_in_attributeDeclarationRule328 = new BitSet(new long[]{0x0001000000000000L,0x0000000000000012L});
	public static final BitSet FOLLOW_multiplicityRule_in_attributeDeclarationRule341 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000012L});
	public static final BitSet FOLLOW_READONLY_in_attributeDeclarationRule360 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_SC_in_attributeDeclarationRule365 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PUBLIC_in_visibilityRule398 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PROTECTED_in_visibilityRule406 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRIVATE_in_visibilityRule414 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PACKAGE_in_visibilityRule422 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SET_in_arrayTypeRule465 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MULTISET_in_arrayTypeRule473 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LIST_in_arrayTypeRule481 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ORDEREDSET_in_arrayTypeRule489 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_TYPE_in_typeRule530 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_TYPE_in_typeRule538 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LONG_TYPE_in_typeRule546 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOUBLE_TYPE_in_typeRule554 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOLEAN_TYPE_in_typeRule562 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_TYPE_in_typeRule570 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_TYPE_in_typeRule578 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_typeRule588 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MIN_in_multiplicityRule684 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_ID_in_multiplicityRule688 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_MAX_in_multiplicityRule694 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_ID_in_multiplicityRule698 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_visibilityRule_in_operationDeclarationRule729 = new BitSet(new long[]{0x0000110900100900L,0x0000000000000800L});
	public static final BitSet FOLLOW_typeRule_in_operationDeclarationRule735 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_ID_in_operationDeclarationRule741 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_LP_in_operationDeclarationRule745 = new BitSet(new long[]{0x0000110900100900L,0x0000000000000808L});
	public static final BitSet FOLLOW_typeRule_in_operationDeclarationRule756 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_ID_in_operationDeclarationRule763 = new BitSet(new long[]{0x0000110900100900L,0x0000000000000808L});
	public static final BitSet FOLLOW_RP_in_operationDeclarationRule772 = new BitSet(new long[]{0x0000000000000002L});
}
