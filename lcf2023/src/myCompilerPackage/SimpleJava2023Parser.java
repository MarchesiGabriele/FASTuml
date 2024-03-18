// $ANTLR 3.5.1 C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g 2023-12-19 00:11:24

	package myCompilerPackage; 		
	import myCompilerPackage.util.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class SimpleJava2023Parser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AADD", "ABSTRACT", "ADD", "ASSERT", 
		"BOOLEAN_TYPE", "BREAK", "BYTE", "CASE", "CATCH", "CHAR", "CHAR_TYPE", 
		"CLASS", "COMMA", "COMMENT", "COMP", "CONST", "CONTINUE", "DEFAULT", "DIV", 
		"DO", "DOT", "DOUBLE_TYPE", "ELSE", "ENUM", "EQ", "ERROR_TOKEN", "ESC_SEQ", 
		"EXPONENT", "EXPORTS", "EXTENDS", "FALSE", "FI", "FINAL", "FINALLY", "FLOAT", 
		"FLOAT_TYPE", "FOR", "GOTO", "GT", "GTE", "HEX_DIGIT", "ID", "IF", "IMPLEMENTS", 
		"IMPORT", "INSTANCEOF", "INT", "INTERFACE", "INT_TYPE", "LB", "LBR", "LONG_TYPE", 
		"LP", "LT", "LTE", "MOD", "MODULE", "MUL", "NATIVE", "NEQ", "NEW", "NULL", 
		"OCTAL_ESC", "PACKAGE", "PRIVATE", "PROTECTED", "PUBLIC", "RB", "RBR", 
		"REQUIRES", "RETURN", "RP", "SC", "SHORT", "SSUB", "STATIC", "STRICTFP", 
		"STRING", "STRING_TYPE", "SUB", "SUPER", "SWITCH", "SYNCHRONIZED", "THIS", 
		"THROW", "THROWS", "TRANSIENT", "TRUE", "TRY", "UNICODE_ESC", "VAR", "VOID", 
		"VOLATILE", "WHILE", "WS"
	};
	public static final int EOF=-1;
	public static final int AADD=4;
	public static final int ABSTRACT=5;
	public static final int ADD=6;
	public static final int ASSERT=7;
	public static final int BOOLEAN_TYPE=8;
	public static final int BREAK=9;
	public static final int BYTE=10;
	public static final int CASE=11;
	public static final int CATCH=12;
	public static final int CHAR=13;
	public static final int CHAR_TYPE=14;
	public static final int CLASS=15;
	public static final int COMMA=16;
	public static final int COMMENT=17;
	public static final int COMP=18;
	public static final int CONST=19;
	public static final int CONTINUE=20;
	public static final int DEFAULT=21;
	public static final int DIV=22;
	public static final int DO=23;
	public static final int DOT=24;
	public static final int DOUBLE_TYPE=25;
	public static final int ELSE=26;
	public static final int ENUM=27;
	public static final int EQ=28;
	public static final int ERROR_TOKEN=29;
	public static final int ESC_SEQ=30;
	public static final int EXPONENT=31;
	public static final int EXPORTS=32;
	public static final int EXTENDS=33;
	public static final int FALSE=34;
	public static final int FI=35;
	public static final int FINAL=36;
	public static final int FINALLY=37;
	public static final int FLOAT=38;
	public static final int FLOAT_TYPE=39;
	public static final int FOR=40;
	public static final int GOTO=41;
	public static final int GT=42;
	public static final int GTE=43;
	public static final int HEX_DIGIT=44;
	public static final int ID=45;
	public static final int IF=46;
	public static final int IMPLEMENTS=47;
	public static final int IMPORT=48;
	public static final int INSTANCEOF=49;
	public static final int INT=50;
	public static final int INTERFACE=51;
	public static final int INT_TYPE=52;
	public static final int LB=53;
	public static final int LBR=54;
	public static final int LONG_TYPE=55;
	public static final int LP=56;
	public static final int LT=57;
	public static final int LTE=58;
	public static final int MOD=59;
	public static final int MODULE=60;
	public static final int MUL=61;
	public static final int NATIVE=62;
	public static final int NEQ=63;
	public static final int NEW=64;
	public static final int NULL=65;
	public static final int OCTAL_ESC=66;
	public static final int PACKAGE=67;
	public static final int PRIVATE=68;
	public static final int PROTECTED=69;
	public static final int PUBLIC=70;
	public static final int RB=71;
	public static final int RBR=72;
	public static final int REQUIRES=73;
	public static final int RETURN=74;
	public static final int RP=75;
	public static final int SC=76;
	public static final int SHORT=77;
	public static final int SSUB=78;
	public static final int STATIC=79;
	public static final int STRICTFP=80;
	public static final int STRING=81;
	public static final int STRING_TYPE=82;
	public static final int SUB=83;
	public static final int SUPER=84;
	public static final int SWITCH=85;
	public static final int SYNCHRONIZED=86;
	public static final int THIS=87;
	public static final int THROW=88;
	public static final int THROWS=89;
	public static final int TRANSIENT=90;
	public static final int TRUE=91;
	public static final int TRY=92;
	public static final int UNICODE_ESC=93;
	public static final int VAR=94;
	public static final int VOID=95;
	public static final int VOLATILE=96;
	public static final int WHILE=97;
	public static final int WS=98;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public SimpleJava2023Parser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public SimpleJava2023Parser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return SimpleJava2023Parser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g"; }


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




	// $ANTLR start "javaStart"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:58:1: javaStart : ( packageRule )? ( importRule )* classDefinitionRule ;
	public final void javaStart() throws RecognitionException {
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:59:2: ( ( packageRule )? ( importRule )* classDefinitionRule )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:60:3: ( packageRule )? ( importRule )* classDefinitionRule
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:60:3: ( packageRule )?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==PACKAGE) ) {
				alt1=1;
			}
			switch (alt1) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:60:3: packageRule
					{
					pushFollow(FOLLOW_packageRule_in_javaStart64);
					packageRule();
					state._fsp--;

					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:62:3: ( importRule )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==IMPORT) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:62:5: importRule
					{
					pushFollow(FOLLOW_importRule_in_javaStart75);
					importRule();
					state._fsp--;

					}
					break;

				default :
					break loop2;
				}
			}

			pushFollow(FOLLOW_classDefinitionRule_in_javaStart84);
			classDefinitionRule();
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
	// $ANTLR end "javaStart"



	// $ANTLR start "packageRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:66:1: packageRule : PACKAGE dotNameRule SC ;
	public final void packageRule() throws RecognitionException {
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:67:2: ( PACKAGE dotNameRule SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:68:3: PACKAGE dotNameRule SC
			{
			match(input,PACKAGE,FOLLOW_PACKAGE_in_packageRule98); 
			pushFollow(FOLLOW_dotNameRule_in_packageRule100);
			dotNameRule();
			state._fsp--;

			match(input,SC,FOLLOW_SC_in_packageRule102); 
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
	// $ANTLR end "packageRule"



	// $ANTLR start "dotNameRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:71:1: dotNameRule : ID ( DOT ID )* ;
	public final void dotNameRule() throws RecognitionException {
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:72:2: ( ID ( DOT ID )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:73:3: ID ( DOT ID )*
			{
			match(input,ID,FOLLOW_ID_in_dotNameRule116); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:73:6: ( DOT ID )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==DOT) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:73:7: DOT ID
					{
					match(input,DOT,FOLLOW_DOT_in_dotNameRule119); 
					match(input,ID,FOLLOW_ID_in_dotNameRule121); 
					}
					break;

				default :
					break loop3;
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
	// $ANTLR end "dotNameRule"



	// $ANTLR start "importRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:77:1: importRule : IMPORT ID ( DOT ID )* ( DOT MUL )? SC ;
	public final void importRule() throws RecognitionException {
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:78:2: ( IMPORT ID ( DOT ID )* ( DOT MUL )? SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:79:3: IMPORT ID ( DOT ID )* ( DOT MUL )? SC
			{
			match(input,IMPORT,FOLLOW_IMPORT_in_importRule138); 
			match(input,ID,FOLLOW_ID_in_importRule149); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:81:4: ( DOT ID )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==DOT) ) {
					int LA4_1 = input.LA(2);
					if ( (LA4_1==ID) ) {
						alt4=1;
					}

				}

				switch (alt4) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:81:5: DOT ID
					{
					match(input,DOT,FOLLOW_DOT_in_importRule164); 
					match(input,ID,FOLLOW_ID_in_importRule166); 
					}
					break;

				default :
					break loop4;
				}
			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:82:4: ( DOT MUL )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==DOT) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:82:5: DOT MUL
					{
					match(input,DOT,FOLLOW_DOT_in_importRule177); 
					match(input,MUL,FOLLOW_MUL_in_importRule179); 
					}
					break;

			}

			match(input,SC,FOLLOW_SC_in_importRule186); 
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
	// $ANTLR end "importRule"



	// $ANTLR start "classDefinitionRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:87:1: classDefinitionRule : (p= PUBLIC )? CLASS c= ID classCodeRule ;
	public final void classDefinitionRule() throws RecognitionException {
		Token p=null;
		Token c=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:88:2: ( (p= PUBLIC )? CLASS c= ID classCodeRule )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:89:3: (p= PUBLIC )? CLASS c= ID classCodeRule
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:89:4: (p= PUBLIC )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==PUBLIC) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:89:4: p= PUBLIC
					{
					p=(Token)match(input,PUBLIC,FOLLOW_PUBLIC_in_classDefinitionRule203); 
					}
					break;

			}

			match(input,CLASS,FOLLOW_CLASS_in_classDefinitionRule208); 
			c=(Token)match(input,ID,FOLLOW_ID_in_classDefinitionRule214); 
			 h.manageClassName (p, c); 
			pushFollow(FOLLOW_classCodeRule_in_classDefinitionRule229);
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



	// $ANTLR start "classCodeRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:96:1: classCodeRule : LBR ( varDeclarationRule | methodDeclarationRule )* RBR ;
	public final void classCodeRule() throws RecognitionException {
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:97:2: ( LBR ( varDeclarationRule | methodDeclarationRule )* RBR )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:98:3: LBR ( varDeclarationRule | methodDeclarationRule )* RBR
			{
			match(input,LBR,FOLLOW_LBR_in_classCodeRule244); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:99:3: ( varDeclarationRule | methodDeclarationRule )*
			loop7:
			while (true) {
				int alt7=3;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==BOOLEAN_TYPE||LA7_0==CHAR_TYPE||LA7_0==DOUBLE_TYPE||LA7_0==FLOAT_TYPE||LA7_0==INT_TYPE||LA7_0==LONG_TYPE||LA7_0==STRING_TYPE) ) {
					alt7=1;
				}
				else if ( (LA7_0==VOID) ) {
					alt7=2;
				}

				switch (alt7) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:99:5: varDeclarationRule
					{
					pushFollow(FOLLOW_varDeclarationRule_in_classCodeRule250);
					varDeclarationRule();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:100:5: methodDeclarationRule
					{
					pushFollow(FOLLOW_methodDeclarationRule_in_classCodeRule257);
					methodDeclarationRule();
					state._fsp--;

					}
					break;

				default :
					break loop7;
				}
			}

			match(input,RBR,FOLLOW_RBR_in_classCodeRule264); 
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



	// $ANTLR start "varDeclarationRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:105:1: varDeclarationRule : t= typeRule v= ID ( EQ e= exprRule )? ( COMMA v= ID ( EQ e= exprRule )? )* SC ;
	public final void varDeclarationRule() throws RecognitionException {
		Token v=null;
		String t =null;
		Variable e =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:106:2: (t= typeRule v= ID ( EQ e= exprRule )? ( COMMA v= ID ( EQ e= exprRule )? )* SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:107:3: t= typeRule v= ID ( EQ e= exprRule )? ( COMMA v= ID ( EQ e= exprRule )? )* SC
			{
			pushFollow(FOLLOW_typeRule_in_varDeclarationRule281);
			t=typeRule();
			state._fsp--;

			v=(Token)match(input,ID,FOLLOW_ID_in_varDeclarationRule285); 
				h.varDeclaration (t, v); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:108:4: ( EQ e= exprRule )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==EQ) ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:108:5: EQ e= exprRule
					{
					match(input,EQ,FOLLOW_EQ_in_varDeclarationRule298); 
					pushFollow(FOLLOW_exprRule_in_varDeclarationRule302);
					e=exprRule();
					state._fsp--;

						h.assignValue (v, e); 		
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:109:4: ( COMMA v= ID ( EQ e= exprRule )? )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==COMMA) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:109:5: COMMA v= ID ( EQ e= exprRule )?
					{
					match(input,COMMA,FOLLOW_COMMA_in_varDeclarationRule318); 
					v=(Token)match(input,ID,FOLLOW_ID_in_varDeclarationRule322); 
						h.varDeclaration (t, v); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:110:5: ( EQ e= exprRule )?
					int alt9=2;
					int LA9_0 = input.LA(1);
					if ( (LA9_0==EQ) ) {
						alt9=1;
					}
					switch (alt9) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:110:6: EQ e= exprRule
							{
							match(input,EQ,FOLLOW_EQ_in_varDeclarationRule336); 
							pushFollow(FOLLOW_exprRule_in_varDeclarationRule340);
							e=exprRule();
							state._fsp--;

								h.assignValue (v, e); 		
							}
							break;

					}

					}
					break;

				default :
					break loop10;
				}
			}

			match(input,SC,FOLLOW_SC_in_varDeclarationRule355); 
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
	// $ANTLR end "varDeclarationRule"



	// $ANTLR start "typeRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:115:1: typeRule returns [String type] : (t= INT_TYPE |t= FLOAT_TYPE |t= LONG_TYPE |t= DOUBLE_TYPE |t= BOOLEAN_TYPE |t= CHAR_TYPE |t= STRING_TYPE ) ;
	public final String typeRule() throws RecognitionException {
		String type = null;


		Token t=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:116:2: ( (t= INT_TYPE |t= FLOAT_TYPE |t= LONG_TYPE |t= DOUBLE_TYPE |t= BOOLEAN_TYPE |t= CHAR_TYPE |t= STRING_TYPE ) )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:117:3: (t= INT_TYPE |t= FLOAT_TYPE |t= LONG_TYPE |t= DOUBLE_TYPE |t= BOOLEAN_TYPE |t= CHAR_TYPE |t= STRING_TYPE )
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:117:3: (t= INT_TYPE |t= FLOAT_TYPE |t= LONG_TYPE |t= DOUBLE_TYPE |t= BOOLEAN_TYPE |t= CHAR_TYPE |t= STRING_TYPE )
			int alt11=7;
			switch ( input.LA(1) ) {
			case INT_TYPE:
				{
				alt11=1;
				}
				break;
			case FLOAT_TYPE:
				{
				alt11=2;
				}
				break;
			case LONG_TYPE:
				{
				alt11=3;
				}
				break;
			case DOUBLE_TYPE:
				{
				alt11=4;
				}
				break;
			case BOOLEAN_TYPE:
				{
				alt11=5;
				}
				break;
			case CHAR_TYPE:
				{
				alt11=6;
				}
				break;
			case STRING_TYPE:
				{
				alt11=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}
			switch (alt11) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:117:5: t= INT_TYPE
					{
					t=(Token)match(input,INT_TYPE,FOLLOW_INT_TYPE_in_typeRule379); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:118:5: t= FLOAT_TYPE
					{
					t=(Token)match(input,FLOAT_TYPE,FOLLOW_FLOAT_TYPE_in_typeRule387); 
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:119:5: t= LONG_TYPE
					{
					t=(Token)match(input,LONG_TYPE,FOLLOW_LONG_TYPE_in_typeRule395); 
					}
					break;
				case 4 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:120:5: t= DOUBLE_TYPE
					{
					t=(Token)match(input,DOUBLE_TYPE,FOLLOW_DOUBLE_TYPE_in_typeRule403); 
					}
					break;
				case 5 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:121:5: t= BOOLEAN_TYPE
					{
					t=(Token)match(input,BOOLEAN_TYPE,FOLLOW_BOOLEAN_TYPE_in_typeRule411); 
					}
					break;
				case 6 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:122:5: t= CHAR_TYPE
					{
					t=(Token)match(input,CHAR_TYPE,FOLLOW_CHAR_TYPE_in_typeRule419); 
					}
					break;
				case 7 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:123:5: t= STRING_TYPE
					{
					t=(Token)match(input,STRING_TYPE,FOLLOW_STRING_TYPE_in_typeRule427); 
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



	// $ANTLR start "methodDeclarationRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:129:1: methodDeclarationRule : methodSignatureRule blockRule ;
	public final void methodDeclarationRule() throws RecognitionException {
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:130:2: ( methodSignatureRule blockRule )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:131:3: methodSignatureRule blockRule
			{
			pushFollow(FOLLOW_methodSignatureRule_in_methodDeclarationRule462);
			methodSignatureRule();
			state._fsp--;

			pushFollow(FOLLOW_blockRule_in_methodDeclarationRule466);
			blockRule();
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
	// $ANTLR end "methodDeclarationRule"



	// $ANTLR start "methodSignatureRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:136:1: methodSignatureRule : VOID m= ID LP ( typeRule ID ( COMMA typeRule ID )* )? RP ;
	public final void methodSignatureRule() throws RecognitionException {
		Token m=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:137:2: ( VOID m= ID LP ( typeRule ID ( COMMA typeRule ID )* )? RP )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:138:3: VOID m= ID LP ( typeRule ID ( COMMA typeRule ID )* )? RP
			{
			match(input,VOID,FOLLOW_VOID_in_methodSignatureRule480); 
			m=(Token)match(input,ID,FOLLOW_ID_in_methodSignatureRule484); 
			match(input,LP,FOLLOW_LP_in_methodSignatureRule490); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:140:5: ( typeRule ID ( COMMA typeRule ID )* )?
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==BOOLEAN_TYPE||LA13_0==CHAR_TYPE||LA13_0==DOUBLE_TYPE||LA13_0==FLOAT_TYPE||LA13_0==INT_TYPE||LA13_0==LONG_TYPE||LA13_0==STRING_TYPE) ) {
				alt13=1;
			}
			switch (alt13) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:140:7: typeRule ID ( COMMA typeRule ID )*
					{
					pushFollow(FOLLOW_typeRule_in_methodSignatureRule498);
					typeRule();
					state._fsp--;

					match(input,ID,FOLLOW_ID_in_methodSignatureRule500); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:141:6: ( COMMA typeRule ID )*
					loop12:
					while (true) {
						int alt12=2;
						int LA12_0 = input.LA(1);
						if ( (LA12_0==COMMA) ) {
							alt12=1;
						}

						switch (alt12) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:141:8: COMMA typeRule ID
							{
							match(input,COMMA,FOLLOW_COMMA_in_methodSignatureRule509); 
							pushFollow(FOLLOW_typeRule_in_methodSignatureRule511);
							typeRule();
							state._fsp--;

							match(input,ID,FOLLOW_ID_in_methodSignatureRule513); 
							}
							break;

						default :
							break loop12;
						}
					}

					}
					break;

			}

			match(input,RP,FOLLOW_RP_in_methodSignatureRule528); 
			 h.manageNewMethodDeclaration (m); 
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
	// $ANTLR end "methodSignatureRule"



	// $ANTLR start "blockRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:147:1: blockRule : LBR ( instructionRule )* RBR ;
	public final void blockRule() throws RecognitionException {
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:148:2: ( LBR ( instructionRule )* RBR )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:149:3: LBR ( instructionRule )* RBR
			{
			match(input,LBR,FOLLOW_LBR_in_blockRule547); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:150:4: ( instructionRule )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==AADD||LA14_0==BOOLEAN_TYPE||LA14_0==CHAR_TYPE||LA14_0==DO||LA14_0==DOUBLE_TYPE||(LA14_0 >= FLOAT_TYPE && LA14_0 <= FOR)||(LA14_0 >= ID && LA14_0 <= IF)||LA14_0==INT_TYPE||(LA14_0 >= LBR && LA14_0 <= LONG_TYPE)||LA14_0==SC||LA14_0==SSUB||LA14_0==STRING_TYPE||LA14_0==WHILE) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:150:4: instructionRule
					{
					pushFollow(FOLLOW_instructionRule_in_blockRule552);
					instructionRule();
					state._fsp--;

					}
					break;

				default :
					break loop14;
				}
			}

			match(input,RBR,FOLLOW_RBR_in_blockRule557); 
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
	// $ANTLR end "blockRule"



	// $ANTLR start "instructionRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:154:1: instructionRule : ( varDeclarationRule | blockRule | assignmentRule | methodCallRule | ifRule | whileRule | doWhileRule | forRule | autoInc | SC );
	public final void instructionRule() throws RecognitionException {
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:155:2: ( varDeclarationRule | blockRule | assignmentRule | methodCallRule | ifRule | whileRule | doWhileRule | forRule | autoInc | SC )
			int alt15=10;
			switch ( input.LA(1) ) {
			case BOOLEAN_TYPE:
			case CHAR_TYPE:
			case DOUBLE_TYPE:
			case FLOAT_TYPE:
			case INT_TYPE:
			case LONG_TYPE:
			case STRING_TYPE:
				{
				alt15=1;
				}
				break;
			case LBR:
				{
				alt15=2;
				}
				break;
			case ID:
				{
				switch ( input.LA(2) ) {
				case EQ:
					{
					alt15=3;
					}
					break;
				case LP:
					{
					alt15=4;
					}
					break;
				case AADD:
				case SSUB:
					{
					alt15=9;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 15, 9, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case IF:
				{
				alt15=5;
				}
				break;
			case WHILE:
				{
				alt15=6;
				}
				break;
			case DO:
				{
				alt15=7;
				}
				break;
			case FOR:
				{
				alt15=8;
				}
				break;
			case AADD:
			case SSUB:
				{
				alt15=9;
				}
				break;
			case SC:
				{
				alt15=10;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}
			switch (alt15) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:156:4: varDeclarationRule
					{
					pushFollow(FOLLOW_varDeclarationRule_in_instructionRule571);
					varDeclarationRule();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:157:5: blockRule
					{
					pushFollow(FOLLOW_blockRule_in_instructionRule577);
					blockRule();
					state._fsp--;

					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:158:5: assignmentRule
					{
					pushFollow(FOLLOW_assignmentRule_in_instructionRule583);
					assignmentRule();
					state._fsp--;

					}
					break;
				case 4 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:159:5: methodCallRule
					{
					pushFollow(FOLLOW_methodCallRule_in_instructionRule589);
					methodCallRule();
					state._fsp--;

					}
					break;
				case 5 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:160:5: ifRule
					{
					pushFollow(FOLLOW_ifRule_in_instructionRule595);
					ifRule();
					state._fsp--;

					}
					break;
				case 6 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:161:5: whileRule
					{
					pushFollow(FOLLOW_whileRule_in_instructionRule601);
					whileRule();
					state._fsp--;

					}
					break;
				case 7 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:162:5: doWhileRule
					{
					pushFollow(FOLLOW_doWhileRule_in_instructionRule607);
					doWhileRule();
					state._fsp--;

					}
					break;
				case 8 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:163:5: forRule
					{
					pushFollow(FOLLOW_forRule_in_instructionRule613);
					forRule();
					state._fsp--;

					}
					break;
				case 9 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:164:5: autoInc
					{
					pushFollow(FOLLOW_autoInc_in_instructionRule619);
					autoInc();
					state._fsp--;

					}
					break;
				case 10 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:165:5: SC
					{
					match(input,SC,FOLLOW_SC_in_instructionRule625); 
					}
					break;

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
	// $ANTLR end "instructionRule"



	// $ANTLR start "autoInc"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:168:1: autoInc : ( ID ( AADD | SSUB ) | ( AADD | SSUB ) ID ) SC ;
	public final void autoInc() throws RecognitionException {
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:169:2: ( ( ID ( AADD | SSUB ) | ( AADD | SSUB ) ID ) SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:170:3: ( ID ( AADD | SSUB ) | ( AADD | SSUB ) ID ) SC
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:170:3: ( ID ( AADD | SSUB ) | ( AADD | SSUB ) ID )
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==ID) ) {
				alt16=1;
			}
			else if ( (LA16_0==AADD||LA16_0==SSUB) ) {
				alt16=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}

			switch (alt16) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:170:5: ID ( AADD | SSUB )
					{
					match(input,ID,FOLLOW_ID_in_autoInc641); 
					if ( input.LA(1)==AADD||input.LA(1)==SSUB ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:171:5: ( AADD | SSUB ) ID
					{
					if ( input.LA(1)==AADD||input.LA(1)==SSUB ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					match(input,ID,FOLLOW_ID_in_autoInc663); 
					}
					break;

			}

			match(input,SC,FOLLOW_SC_in_autoInc669); 
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
	// $ANTLR end "autoInc"



	// $ANTLR start "assignmentRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:175:1: assignmentRule : v= ID EQ e= exprRule SC ;
	public final void assignmentRule() throws RecognitionException {
		Token v=null;
		Variable e =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:176:2: (v= ID EQ e= exprRule SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:177:3: v= ID EQ e= exprRule SC
			{
			v=(Token)match(input,ID,FOLLOW_ID_in_assignmentRule684); 
			match(input,EQ,FOLLOW_EQ_in_assignmentRule686); 
			pushFollow(FOLLOW_exprRule_in_assignmentRule690);
			e=exprRule();
			state._fsp--;

			match(input,SC,FOLLOW_SC_in_assignmentRule692); 
			 h.assignValue (v, e); 
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
	// $ANTLR end "assignmentRule"



	// $ANTLR start "methodCallRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:181:1: methodCallRule : m= ID LP ( exprRule ( COMMA exprRule )* )? RP SC ;
	public final void methodCallRule() throws RecognitionException {
		Token m=null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:182:2: (m= ID LP ( exprRule ( COMMA exprRule )* )? RP SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:183:3: m= ID LP ( exprRule ( COMMA exprRule )* )? RP SC
			{
			m=(Token)match(input,ID,FOLLOW_ID_in_methodCallRule710); 
			match(input,LP,FOLLOW_LP_in_methodCallRule712); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:184:4: ( exprRule ( COMMA exprRule )* )?
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==ADD||LA18_0==CHAR||LA18_0==FALSE||LA18_0==FLOAT||LA18_0==ID||LA18_0==INT||LA18_0==LP||LA18_0==NULL||LA18_0==STRING||LA18_0==SUB||LA18_0==TRUE) ) {
				alt18=1;
			}
			switch (alt18) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:184:5: exprRule ( COMMA exprRule )*
					{
					pushFollow(FOLLOW_exprRule_in_methodCallRule719);
					exprRule();
					state._fsp--;

					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:185:5: ( COMMA exprRule )*
					loop17:
					while (true) {
						int alt17=2;
						int LA17_0 = input.LA(1);
						if ( (LA17_0==COMMA) ) {
							alt17=1;
						}

						switch (alt17) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:185:6: COMMA exprRule
							{
							match(input,COMMA,FOLLOW_COMMA_in_methodCallRule726); 
							pushFollow(FOLLOW_exprRule_in_methodCallRule728);
							exprRule();
							state._fsp--;

							}
							break;

						default :
							break loop17;
						}
					}

					}
					break;

			}

			match(input,RP,FOLLOW_RP_in_methodCallRule739); 
			match(input,SC,FOLLOW_SC_in_methodCallRule741); 
			 h.checkMethodReference (m); 
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
	// $ANTLR end "methodCallRule"



	// $ANTLR start "exprRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:191:1: exprRule returns [Variable x] : (o= ADD |o= SUB )? t1= termRule ( (o= ADD |o= SUB ) t2= termRule )* ;
	public final Variable exprRule() throws RecognitionException {
		Variable x = null;


		Token o=null;
		Variable t1 =null;
		Variable t2 =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:192:2: ( (o= ADD |o= SUB )? t1= termRule ( (o= ADD |o= SUB ) t2= termRule )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:193:3: (o= ADD |o= SUB )? t1= termRule ( (o= ADD |o= SUB ) t2= termRule )*
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:193:3: (o= ADD |o= SUB )?
			int alt19=3;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==ADD) ) {
				alt19=1;
			}
			else if ( (LA19_0==SUB) ) {
				alt19=2;
			}
			switch (alt19) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:193:4: o= ADD
					{
					o=(Token)match(input,ADD,FOLLOW_ADD_in_exprRule766); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:193:12: o= SUB
					{
					o=(Token)match(input,SUB,FOLLOW_SUB_in_exprRule772); 
					}
					break;

			}

			pushFollow(FOLLOW_termRule_in_exprRule780);
			t1=termRule();
			state._fsp--;

			 x = h.manageFirtTerm (t1, o); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:195:3: ( (o= ADD |o= SUB ) t2= termRule )*
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( (LA21_0==ADD||LA21_0==SUB) ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:195:5: (o= ADD |o= SUB ) t2= termRule
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:195:5: (o= ADD |o= SUB )
					int alt20=2;
					int LA20_0 = input.LA(1);
					if ( (LA20_0==ADD) ) {
						alt20=1;
					}
					else if ( (LA20_0==SUB) ) {
						alt20=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 20, 0, input);
						throw nvae;
					}

					switch (alt20) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:195:6: o= ADD
							{
							o=(Token)match(input,ADD,FOLLOW_ADD_in_exprRule803); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:195:14: o= SUB
							{
							o=(Token)match(input,SUB,FOLLOW_SUB_in_exprRule809); 
							}
							break;

					}

					pushFollow(FOLLOW_termRule_in_exprRule814);
					t2=termRule();
					state._fsp--;

					 x = h.doAdd (x, t2, o);
					}
					break;

				default :
					break loop21;
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
		return x;
	}
	// $ANTLR end "exprRule"



	// $ANTLR start "termRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:198:1: termRule returns [Variable x] : f1= factorRule ( (o= MUL |o= DIV ) f2= factorRule )* ;
	public final Variable termRule() throws RecognitionException {
		Variable x = null;


		Token o=null;
		Variable f1 =null;
		Variable f2 =null;

		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:199:2: (f1= factorRule ( (o= MUL |o= DIV ) f2= factorRule )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:200:3: f1= factorRule ( (o= MUL |o= DIV ) f2= factorRule )*
			{
			pushFollow(FOLLOW_factorRule_in_termRule844);
			f1=factorRule();
			state._fsp--;

			 x = f1;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:201:3: ( (o= MUL |o= DIV ) f2= factorRule )*
			loop23:
			while (true) {
				int alt23=2;
				int LA23_0 = input.LA(1);
				if ( (LA23_0==DIV||LA23_0==MUL) ) {
					alt23=1;
				}

				switch (alt23) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:201:5: (o= MUL |o= DIV ) f2= factorRule
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:201:5: (o= MUL |o= DIV )
					int alt22=2;
					int LA22_0 = input.LA(1);
					if ( (LA22_0==MUL) ) {
						alt22=1;
					}
					else if ( (LA22_0==DIV) ) {
						alt22=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 22, 0, input);
						throw nvae;
					}

					switch (alt22) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:201:6: o= MUL
							{
							o=(Token)match(input,MUL,FOLLOW_MUL_in_termRule865); 
							}
							break;
						case 2 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:201:14: o= DIV
							{
							o=(Token)match(input,DIV,FOLLOW_DIV_in_termRule871); 
							}
							break;

					}

					pushFollow(FOLLOW_factorRule_in_termRule876);
					f2=factorRule();
					state._fsp--;

					 x = h.doMul (x, f2, o); 
					}
					break;

				default :
					break loop23;
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
		return x;
	}
	// $ANTLR end "termRule"



	// $ANTLR start "factorRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:204:1: factorRule returns [Variable x] : (i= INT |f= FLOAT |v= ID | LP e= exprRule RP | STRING | CHAR | TRUE | FALSE | NULL );
	public final Variable factorRule() throws RecognitionException {
		Variable x = null;


		Token i=null;
		Token f=null;
		Token v=null;
		Variable e =null;

		 x = new Variable ("0");
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:206:2: (i= INT |f= FLOAT |v= ID | LP e= exprRule RP | STRING | CHAR | TRUE | FALSE | NULL )
			int alt24=9;
			switch ( input.LA(1) ) {
			case INT:
				{
				alt24=1;
				}
				break;
			case FLOAT:
				{
				alt24=2;
				}
				break;
			case ID:
				{
				alt24=3;
				}
				break;
			case LP:
				{
				alt24=4;
				}
				break;
			case STRING:
				{
				alt24=5;
				}
				break;
			case CHAR:
				{
				alt24=6;
				}
				break;
			case TRUE:
				{
				alt24=7;
				}
				break;
			case FALSE:
				{
				alt24=8;
				}
				break;
			case NULL:
				{
				alt24=9;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 24, 0, input);
				throw nvae;
			}
			switch (alt24) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:207:4: i= INT
					{
					i=(Token)match(input,INT,FOLLOW_INT_in_factorRule908); 
					 x = h.handleNumber(i); 
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:208:5: f= FLOAT
					{
					f=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_factorRule924); 
					 x = h.handleNumber(i); 
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:209:5: v= ID
					{
					v=(Token)match(input,ID,FOLLOW_ID_in_factorRule939); 
					 x = h.checkVarDeclaration (v); 
					}
					break;
				case 4 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:210:5: LP e= exprRule RP
					{
					match(input,LP,FOLLOW_LP_in_factorRule954); 
					pushFollow(FOLLOW_exprRule_in_factorRule958);
					e=exprRule();
					state._fsp--;

					match(input,RP,FOLLOW_RP_in_factorRule960); 
					 x = e; 
					}
					break;
				case 5 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:213:5: STRING
					{
					match(input,STRING,FOLLOW_STRING_in_factorRule975); 
					}
					break;
				case 6 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:214:5: CHAR
					{
					match(input,CHAR,FOLLOW_CHAR_in_factorRule981); 
					}
					break;
				case 7 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:215:5: TRUE
					{
					match(input,TRUE,FOLLOW_TRUE_in_factorRule987); 
					}
					break;
				case 8 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:216:5: FALSE
					{
					match(input,FALSE,FOLLOW_FALSE_in_factorRule993); 
					}
					break;
				case 9 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:217:5: NULL
					{
					match(input,NULL,FOLLOW_NULL_in_factorRule999); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return x;
	}
	// $ANTLR end "factorRule"



	// $ANTLR start "whileRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:220:1: whileRule : WHILE LP conditionRule RP instructionRule ;
	public final void whileRule() throws RecognitionException {
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:221:2: ( WHILE LP conditionRule RP instructionRule )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:222:3: WHILE LP conditionRule RP instructionRule
			{
			match(input,WHILE,FOLLOW_WHILE_in_whileRule1014); 
			match(input,LP,FOLLOW_LP_in_whileRule1016); 
			pushFollow(FOLLOW_conditionRule_in_whileRule1018);
			conditionRule();
			state._fsp--;

			match(input,RP,FOLLOW_RP_in_whileRule1020); 
			pushFollow(FOLLOW_instructionRule_in_whileRule1025);
			instructionRule();
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
	// $ANTLR end "whileRule"



	// $ANTLR start "conditionRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:226:1: conditionRule : exprRule compRule exprRule ;
	public final void conditionRule() throws RecognitionException {
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:227:2: ( exprRule compRule exprRule )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:228:3: exprRule compRule exprRule
			{
			pushFollow(FOLLOW_exprRule_in_conditionRule1039);
			exprRule();
			state._fsp--;

			pushFollow(FOLLOW_compRule_in_conditionRule1041);
			compRule();
			state._fsp--;

			pushFollow(FOLLOW_exprRule_in_conditionRule1043);
			exprRule();
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
	// $ANTLR end "conditionRule"



	// $ANTLR start "compRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:232:1: compRule : ( COMP | NEQ | GT | LT | GTE | LTE );
	public final void compRule() throws RecognitionException {
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:233:2: ( COMP | NEQ | GT | LT | GTE | LTE )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:
			{
			if ( input.LA(1)==COMP||(input.LA(1) >= GT && input.LA(1) <= GTE)||(input.LA(1) >= LT && input.LA(1) <= LTE)||input.LA(1)==NEQ ) {
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
	}
	// $ANTLR end "compRule"



	// $ANTLR start "ifRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:244:1: ifRule : IF LP conditionRule RP instructionRule ( ELSE instructionRule )? ;
	public final void ifRule() throws RecognitionException {
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:245:2: ( IF LP conditionRule RP instructionRule ( ELSE instructionRule )? )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:246:3: IF LP conditionRule RP instructionRule ( ELSE instructionRule )?
			{
			match(input,IF,FOLLOW_IF_in_ifRule1107); 
			match(input,LP,FOLLOW_LP_in_ifRule1109); 
			pushFollow(FOLLOW_conditionRule_in_ifRule1111);
			conditionRule();
			state._fsp--;

			match(input,RP,FOLLOW_RP_in_ifRule1113); 
			pushFollow(FOLLOW_instructionRule_in_ifRule1118);
			instructionRule();
			state._fsp--;

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:248:3: ( ELSE instructionRule )?
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==ELSE) ) {
				alt25=1;
			}
			switch (alt25) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:248:4: ELSE instructionRule
					{
					match(input,ELSE,FOLLOW_ELSE_in_ifRule1123); 
					pushFollow(FOLLOW_instructionRule_in_ifRule1129);
					instructionRule();
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
	// $ANTLR end "ifRule"



	// $ANTLR start "doWhileRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:254:1: doWhileRule : DO instructionRule WHILE LP conditionRule RP SC ;
	public final void doWhileRule() throws RecognitionException {
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:255:2: ( DO instructionRule WHILE LP conditionRule RP SC )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:256:3: DO instructionRule WHILE LP conditionRule RP SC
			{
			match(input,DO,FOLLOW_DO_in_doWhileRule1149); 
			pushFollow(FOLLOW_instructionRule_in_doWhileRule1154);
			instructionRule();
			state._fsp--;

			match(input,WHILE,FOLLOW_WHILE_in_doWhileRule1158); 
			match(input,LP,FOLLOW_LP_in_doWhileRule1160); 
			pushFollow(FOLLOW_conditionRule_in_doWhileRule1162);
			conditionRule();
			state._fsp--;

			match(input,RP,FOLLOW_RP_in_doWhileRule1164); 
			match(input,SC,FOLLOW_SC_in_doWhileRule1169); 
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
	// $ANTLR end "doWhileRule"



	// $ANTLR start "forRule"
	// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:263:1: forRule : FOR LP ( typeRule )? assignmentRule SC conditionRule SC ( autoInc | assignmentRule ) RP instructionRule ;
	public final void forRule() throws RecognitionException {
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:264:2: ( FOR LP ( typeRule )? assignmentRule SC conditionRule SC ( autoInc | assignmentRule ) RP instructionRule )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:265:3: FOR LP ( typeRule )? assignmentRule SC conditionRule SC ( autoInc | assignmentRule ) RP instructionRule
			{
			match(input,FOR,FOLLOW_FOR_in_forRule1183); 
			match(input,LP,FOLLOW_LP_in_forRule1185); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:266:4: ( typeRule )?
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==BOOLEAN_TYPE||LA26_0==CHAR_TYPE||LA26_0==DOUBLE_TYPE||LA26_0==FLOAT_TYPE||LA26_0==INT_TYPE||LA26_0==LONG_TYPE||LA26_0==STRING_TYPE) ) {
				alt26=1;
			}
			switch (alt26) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:266:4: typeRule
					{
					pushFollow(FOLLOW_typeRule_in_forRule1191);
					typeRule();
					state._fsp--;

					}
					break;

			}

			pushFollow(FOLLOW_assignmentRule_in_forRule1194);
			assignmentRule();
			state._fsp--;

			match(input,SC,FOLLOW_SC_in_forRule1199); 
			pushFollow(FOLLOW_conditionRule_in_forRule1204);
			conditionRule();
			state._fsp--;

			match(input,SC,FOLLOW_SC_in_forRule1209); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:270:4: ( autoInc | assignmentRule )
			int alt27=2;
			int LA27_0 = input.LA(1);
			if ( (LA27_0==ID) ) {
				int LA27_1 = input.LA(2);
				if ( (LA27_1==AADD||LA27_1==SSUB) ) {
					alt27=1;
				}
				else if ( (LA27_1==EQ) ) {
					alt27=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 27, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA27_0==AADD||LA27_0==SSUB) ) {
				alt27=1;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 27, 0, input);
				throw nvae;
			}

			switch (alt27) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:270:6: autoInc
					{
					pushFollow(FOLLOW_autoInc_in_forRule1216);
					autoInc();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:271:6: assignmentRule
					{
					pushFollow(FOLLOW_assignmentRule_in_forRule1223);
					assignmentRule();
					state._fsp--;

					}
					break;

			}

			match(input,RP,FOLLOW_RP_in_forRule1232); 
			pushFollow(FOLLOW_instructionRule_in_forRule1237);
			instructionRule();
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
	// $ANTLR end "forRule"

	// Delegated rules



	public static final BitSet FOLLOW_packageRule_in_javaStart64 = new BitSet(new long[]{0x0001000000008000L,0x0000000000000040L});
	public static final BitSet FOLLOW_importRule_in_javaStart75 = new BitSet(new long[]{0x0001000000008000L,0x0000000000000040L});
	public static final BitSet FOLLOW_classDefinitionRule_in_javaStart84 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PACKAGE_in_packageRule98 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_dotNameRule_in_packageRule100 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_SC_in_packageRule102 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_dotNameRule116 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_DOT_in_dotNameRule119 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_ID_in_dotNameRule121 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_IMPORT_in_importRule138 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_ID_in_importRule149 = new BitSet(new long[]{0x0000000001000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_DOT_in_importRule164 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_ID_in_importRule166 = new BitSet(new long[]{0x0000000001000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_DOT_in_importRule177 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_MUL_in_importRule179 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_SC_in_importRule186 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PUBLIC_in_classDefinitionRule203 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CLASS_in_classDefinitionRule208 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_ID_in_classDefinitionRule214 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_classCodeRule_in_classDefinitionRule229 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBR_in_classCodeRule244 = new BitSet(new long[]{0x0090008002004100L,0x0000000080040100L});
	public static final BitSet FOLLOW_varDeclarationRule_in_classCodeRule250 = new BitSet(new long[]{0x0090008002004100L,0x0000000080040100L});
	public static final BitSet FOLLOW_methodDeclarationRule_in_classCodeRule257 = new BitSet(new long[]{0x0090008002004100L,0x0000000080040100L});
	public static final BitSet FOLLOW_RBR_in_classCodeRule264 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_typeRule_in_varDeclarationRule281 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_ID_in_varDeclarationRule285 = new BitSet(new long[]{0x0000000010010000L,0x0000000000001000L});
	public static final BitSet FOLLOW_EQ_in_varDeclarationRule298 = new BitSet(new long[]{0x0104204400002040L,0x00000000080A0002L});
	public static final BitSet FOLLOW_exprRule_in_varDeclarationRule302 = new BitSet(new long[]{0x0000000000010000L,0x0000000000001000L});
	public static final BitSet FOLLOW_COMMA_in_varDeclarationRule318 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_ID_in_varDeclarationRule322 = new BitSet(new long[]{0x0000000010010000L,0x0000000000001000L});
	public static final BitSet FOLLOW_EQ_in_varDeclarationRule336 = new BitSet(new long[]{0x0104204400002040L,0x00000000080A0002L});
	public static final BitSet FOLLOW_exprRule_in_varDeclarationRule340 = new BitSet(new long[]{0x0000000000010000L,0x0000000000001000L});
	public static final BitSet FOLLOW_SC_in_varDeclarationRule355 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_TYPE_in_typeRule379 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_TYPE_in_typeRule387 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LONG_TYPE_in_typeRule395 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOUBLE_TYPE_in_typeRule403 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOLEAN_TYPE_in_typeRule411 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_TYPE_in_typeRule419 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_TYPE_in_typeRule427 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_methodSignatureRule_in_methodDeclarationRule462 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_blockRule_in_methodDeclarationRule466 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VOID_in_methodSignatureRule480 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_ID_in_methodSignatureRule484 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_LP_in_methodSignatureRule490 = new BitSet(new long[]{0x0090008002004100L,0x0000000000040800L});
	public static final BitSet FOLLOW_typeRule_in_methodSignatureRule498 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_ID_in_methodSignatureRule500 = new BitSet(new long[]{0x0000000000010000L,0x0000000000000800L});
	public static final BitSet FOLLOW_COMMA_in_methodSignatureRule509 = new BitSet(new long[]{0x0090008002004100L,0x0000000000040000L});
	public static final BitSet FOLLOW_typeRule_in_methodSignatureRule511 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_ID_in_methodSignatureRule513 = new BitSet(new long[]{0x0000000000010000L,0x0000000000000800L});
	public static final BitSet FOLLOW_RP_in_methodSignatureRule528 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBR_in_blockRule547 = new BitSet(new long[]{0x00D0618002804110L,0x0000000200045100L});
	public static final BitSet FOLLOW_instructionRule_in_blockRule552 = new BitSet(new long[]{0x00D0618002804110L,0x0000000200045100L});
	public static final BitSet FOLLOW_RBR_in_blockRule557 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_varDeclarationRule_in_instructionRule571 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_blockRule_in_instructionRule577 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignmentRule_in_instructionRule583 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_methodCallRule_in_instructionRule589 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifRule_in_instructionRule595 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileRule_in_instructionRule601 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_doWhileRule_in_instructionRule607 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forRule_in_instructionRule613 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_autoInc_in_instructionRule619 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SC_in_instructionRule625 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_autoInc641 = new BitSet(new long[]{0x0000000000000010L,0x0000000000004000L});
	public static final BitSet FOLLOW_set_in_autoInc643 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_set_in_autoInc655 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_ID_in_autoInc663 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_SC_in_autoInc669 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_assignmentRule684 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_EQ_in_assignmentRule686 = new BitSet(new long[]{0x0104204400002040L,0x00000000080A0002L});
	public static final BitSet FOLLOW_exprRule_in_assignmentRule690 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_SC_in_assignmentRule692 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_methodCallRule710 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_LP_in_methodCallRule712 = new BitSet(new long[]{0x0104204400002040L,0x00000000080A0802L});
	public static final BitSet FOLLOW_exprRule_in_methodCallRule719 = new BitSet(new long[]{0x0000000000010000L,0x0000000000000800L});
	public static final BitSet FOLLOW_COMMA_in_methodCallRule726 = new BitSet(new long[]{0x0104204400002040L,0x00000000080A0002L});
	public static final BitSet FOLLOW_exprRule_in_methodCallRule728 = new BitSet(new long[]{0x0000000000010000L,0x0000000000000800L});
	public static final BitSet FOLLOW_RP_in_methodCallRule739 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_SC_in_methodCallRule741 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ADD_in_exprRule766 = new BitSet(new long[]{0x0104204400002000L,0x0000000008020002L});
	public static final BitSet FOLLOW_SUB_in_exprRule772 = new BitSet(new long[]{0x0104204400002000L,0x0000000008020002L});
	public static final BitSet FOLLOW_termRule_in_exprRule780 = new BitSet(new long[]{0x0000000000000042L,0x0000000000080000L});
	public static final BitSet FOLLOW_ADD_in_exprRule803 = new BitSet(new long[]{0x0104204400002000L,0x0000000008020002L});
	public static final BitSet FOLLOW_SUB_in_exprRule809 = new BitSet(new long[]{0x0104204400002000L,0x0000000008020002L});
	public static final BitSet FOLLOW_termRule_in_exprRule814 = new BitSet(new long[]{0x0000000000000042L,0x0000000000080000L});
	public static final BitSet FOLLOW_factorRule_in_termRule844 = new BitSet(new long[]{0x2000000000400002L});
	public static final BitSet FOLLOW_MUL_in_termRule865 = new BitSet(new long[]{0x0104204400002000L,0x0000000008020002L});
	public static final BitSet FOLLOW_DIV_in_termRule871 = new BitSet(new long[]{0x0104204400002000L,0x0000000008020002L});
	public static final BitSet FOLLOW_factorRule_in_termRule876 = new BitSet(new long[]{0x2000000000400002L});
	public static final BitSet FOLLOW_INT_in_factorRule908 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_factorRule924 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_factorRule939 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LP_in_factorRule954 = new BitSet(new long[]{0x0104204400002040L,0x00000000080A0002L});
	public static final BitSet FOLLOW_exprRule_in_factorRule958 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_RP_in_factorRule960 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_factorRule975 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_in_factorRule981 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TRUE_in_factorRule987 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FALSE_in_factorRule993 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NULL_in_factorRule999 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_whileRule1014 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_LP_in_whileRule1016 = new BitSet(new long[]{0x0104204400002040L,0x00000000080A0002L});
	public static final BitSet FOLLOW_conditionRule_in_whileRule1018 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_RP_in_whileRule1020 = new BitSet(new long[]{0x00D0618002804110L,0x0000000200045000L});
	public static final BitSet FOLLOW_instructionRule_in_whileRule1025 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exprRule_in_conditionRule1039 = new BitSet(new long[]{0x86000C0000040000L});
	public static final BitSet FOLLOW_compRule_in_conditionRule1041 = new BitSet(new long[]{0x0104204400002040L,0x00000000080A0002L});
	public static final BitSet FOLLOW_exprRule_in_conditionRule1043 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_ifRule1107 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_LP_in_ifRule1109 = new BitSet(new long[]{0x0104204400002040L,0x00000000080A0002L});
	public static final BitSet FOLLOW_conditionRule_in_ifRule1111 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_RP_in_ifRule1113 = new BitSet(new long[]{0x00D0618002804110L,0x0000000200045000L});
	public static final BitSet FOLLOW_instructionRule_in_ifRule1118 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_ELSE_in_ifRule1123 = new BitSet(new long[]{0x00D0618002804110L,0x0000000200045000L});
	public static final BitSet FOLLOW_instructionRule_in_ifRule1129 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DO_in_doWhileRule1149 = new BitSet(new long[]{0x00D0618002804110L,0x0000000200045000L});
	public static final BitSet FOLLOW_instructionRule_in_doWhileRule1154 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_WHILE_in_doWhileRule1158 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_LP_in_doWhileRule1160 = new BitSet(new long[]{0x0104204400002040L,0x00000000080A0002L});
	public static final BitSet FOLLOW_conditionRule_in_doWhileRule1162 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_RP_in_doWhileRule1164 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_SC_in_doWhileRule1169 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOR_in_forRule1183 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_LP_in_forRule1185 = new BitSet(new long[]{0x0090208002004100L,0x0000000000040000L});
	public static final BitSet FOLLOW_typeRule_in_forRule1191 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_assignmentRule_in_forRule1194 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_SC_in_forRule1199 = new BitSet(new long[]{0x0104204400002040L,0x00000000080A0002L});
	public static final BitSet FOLLOW_conditionRule_in_forRule1204 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_SC_in_forRule1209 = new BitSet(new long[]{0x0000200000000010L,0x0000000000004000L});
	public static final BitSet FOLLOW_autoInc_in_forRule1216 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_assignmentRule_in_forRule1223 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_RP_in_forRule1232 = new BitSet(new long[]{0x00D0618002804110L,0x0000000200045000L});
	public static final BitSet FOLLOW_instructionRule_in_forRule1237 = new BitSet(new long[]{0x0000000000000002L});
}
