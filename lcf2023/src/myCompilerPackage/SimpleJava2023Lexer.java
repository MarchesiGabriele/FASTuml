// $ANTLR 3.5.1 C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g 2023-12-19 00:11:24

	package myCompilerPackage; 	


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class SimpleJava2023Lexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public SimpleJava2023Lexer() {} 
	public SimpleJava2023Lexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public SimpleJava2023Lexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g"; }

	// $ANTLR start "EQ"
	public final void mEQ() throws RecognitionException {
		try {
			int _type = EQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:279:4: ( '=' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:279:6: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQ"

	// $ANTLR start "COMP"
	public final void mCOMP() throws RecognitionException {
		try {
			int _type = COMP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:280:6: ( '==' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:280:8: '=='
			{
			match("=="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMP"

	// $ANTLR start "NEQ"
	public final void mNEQ() throws RecognitionException {
		try {
			int _type = NEQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:281:5: ( '!=' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:281:7: '!='
			{
			match("!="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NEQ"

	// $ANTLR start "LT"
	public final void mLT() throws RecognitionException {
		try {
			int _type = LT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:282:4: ( '<' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:282:6: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LT"

	// $ANTLR start "GT"
	public final void mGT() throws RecognitionException {
		try {
			int _type = GT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:283:4: ( '>' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:283:6: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GT"

	// $ANTLR start "LTE"
	public final void mLTE() throws RecognitionException {
		try {
			int _type = LTE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:284:5: ( '<=' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:284:7: '<='
			{
			match("<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LTE"

	// $ANTLR start "GTE"
	public final void mGTE() throws RecognitionException {
		try {
			int _type = GTE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:285:5: ( '>=' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:285:7: '>='
			{
			match(">="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GTE"

	// $ANTLR start "MOD"
	public final void mMOD() throws RecognitionException {
		try {
			int _type = MOD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:286:5: ( '%' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:286:7: '%'
			{
			match('%'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MOD"

	// $ANTLR start "ADD"
	public final void mADD() throws RecognitionException {
		try {
			int _type = ADD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:287:5: ( '+' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:287:7: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ADD"

	// $ANTLR start "SUB"
	public final void mSUB() throws RecognitionException {
		try {
			int _type = SUB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:288:5: ( '-' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:288:7: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SUB"

	// $ANTLR start "MUL"
	public final void mMUL() throws RecognitionException {
		try {
			int _type = MUL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:289:5: ( '*' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:289:7: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MUL"

	// $ANTLR start "DIV"
	public final void mDIV() throws RecognitionException {
		try {
			int _type = DIV;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:290:5: ( '/' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:290:7: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIV"

	// $ANTLR start "AADD"
	public final void mAADD() throws RecognitionException {
		try {
			int _type = AADD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:291:6: ( '++' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:291:8: '++'
			{
			match("++"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AADD"

	// $ANTLR start "SSUB"
	public final void mSSUB() throws RecognitionException {
		try {
			int _type = SSUB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:292:6: ( '--' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:292:8: '--'
			{
			match("--"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SSUB"

	// $ANTLR start "SC"
	public final void mSC() throws RecognitionException {
		try {
			int _type = SC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:294:4: ( ';' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:294:6: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SC"

	// $ANTLR start "DOT"
	public final void mDOT() throws RecognitionException {
		try {
			int _type = DOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:295:5: ( '.' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:295:7: '.'
			{
			match('.'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOT"

	// $ANTLR start "COMMA"
	public final void mCOMMA() throws RecognitionException {
		try {
			int _type = COMMA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:296:7: ( ',' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:296:9: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMA"

	// $ANTLR start "LP"
	public final void mLP() throws RecognitionException {
		try {
			int _type = LP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:297:4: ( '(' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:297:6: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LP"

	// $ANTLR start "RP"
	public final void mRP() throws RecognitionException {
		try {
			int _type = RP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:298:4: ( ')' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:298:6: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RP"

	// $ANTLR start "LBR"
	public final void mLBR() throws RecognitionException {
		try {
			int _type = LBR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:299:5: ( '{' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:299:7: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LBR"

	// $ANTLR start "RBR"
	public final void mRBR() throws RecognitionException {
		try {
			int _type = RBR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:300:5: ( '}' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:300:7: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RBR"

	// $ANTLR start "LB"
	public final void mLB() throws RecognitionException {
		try {
			int _type = LB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:301:4: ( '[' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:301:6: '['
			{
			match('['); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LB"

	// $ANTLR start "RB"
	public final void mRB() throws RecognitionException {
		try {
			int _type = RB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:302:4: ( ']' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:302:6: ']'
			{
			match(']'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RB"

	// $ANTLR start "ABSTRACT"
	public final void mABSTRACT() throws RecognitionException {
		try {
			int _type = ABSTRACT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:306:10: ( 'abstract' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:306:12: 'abstract'
			{
			match("abstract"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ABSTRACT"

	// $ANTLR start "ASSERT"
	public final void mASSERT() throws RecognitionException {
		try {
			int _type = ASSERT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:307:8: ( 'assert' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:307:10: 'assert'
			{
			match("assert"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ASSERT"

	// $ANTLR start "BOOLEAN_TYPE"
	public final void mBOOLEAN_TYPE() throws RecognitionException {
		try {
			int _type = BOOLEAN_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:308:14: ( 'boolean' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:308:16: 'boolean'
			{
			match("boolean"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BOOLEAN_TYPE"

	// $ANTLR start "BREAK"
	public final void mBREAK() throws RecognitionException {
		try {
			int _type = BREAK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:309:7: ( 'break' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:309:9: 'break'
			{
			match("break"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BREAK"

	// $ANTLR start "BYTE"
	public final void mBYTE() throws RecognitionException {
		try {
			int _type = BYTE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:310:6: ( 'byte' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:310:8: 'byte'
			{
			match("byte"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BYTE"

	// $ANTLR start "CASE"
	public final void mCASE() throws RecognitionException {
		try {
			int _type = CASE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:311:6: ( 'case' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:311:8: 'case'
			{
			match("case"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CASE"

	// $ANTLR start "CATCH"
	public final void mCATCH() throws RecognitionException {
		try {
			int _type = CATCH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:312:7: ( 'catch' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:312:9: 'catch'
			{
			match("catch"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CATCH"

	// $ANTLR start "CHAR_TYPE"
	public final void mCHAR_TYPE() throws RecognitionException {
		try {
			int _type = CHAR_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:313:11: ( 'char' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:313:13: 'char'
			{
			match("char"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHAR_TYPE"

	// $ANTLR start "CLASS"
	public final void mCLASS() throws RecognitionException {
		try {
			int _type = CLASS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:314:7: ( 'class' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:314:9: 'class'
			{
			match("class"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CLASS"

	// $ANTLR start "CONTINUE"
	public final void mCONTINUE() throws RecognitionException {
		try {
			int _type = CONTINUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:315:10: ( 'continue' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:315:12: 'continue'
			{
			match("continue"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CONTINUE"

	// $ANTLR start "CONST"
	public final void mCONST() throws RecognitionException {
		try {
			int _type = CONST;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:316:7: ( 'const' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:316:9: 'const'
			{
			match("const"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CONST"

	// $ANTLR start "DEFAULT"
	public final void mDEFAULT() throws RecognitionException {
		try {
			int _type = DEFAULT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:317:9: ( 'default' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:317:11: 'default'
			{
			match("default"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DEFAULT"

	// $ANTLR start "DO"
	public final void mDO() throws RecognitionException {
		try {
			int _type = DO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:318:4: ( 'do' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:318:6: 'do'
			{
			match("do"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DO"

	// $ANTLR start "DOUBLE_TYPE"
	public final void mDOUBLE_TYPE() throws RecognitionException {
		try {
			int _type = DOUBLE_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:319:13: ( 'double' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:319:15: 'double'
			{
			match("double"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOUBLE_TYPE"

	// $ANTLR start "ELSE"
	public final void mELSE() throws RecognitionException {
		try {
			int _type = ELSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:320:6: ( 'else' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:320:8: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ELSE"

	// $ANTLR start "ENUM"
	public final void mENUM() throws RecognitionException {
		try {
			int _type = ENUM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:321:6: ( 'enum' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:321:8: 'enum'
			{
			match("enum"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ENUM"

	// $ANTLR start "EXPORTS"
	public final void mEXPORTS() throws RecognitionException {
		try {
			int _type = EXPORTS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:322:9: ( 'exports' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:322:11: 'exports'
			{
			match("exports"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EXPORTS"

	// $ANTLR start "EXTENDS"
	public final void mEXTENDS() throws RecognitionException {
		try {
			int _type = EXTENDS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:323:9: ( 'extends' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:323:11: 'extends'
			{
			match("extends"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EXTENDS"

	// $ANTLR start "FALSE"
	public final void mFALSE() throws RecognitionException {
		try {
			int _type = FALSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:324:7: ( 'false' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:324:9: 'false'
			{
			match("false"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FALSE"

	// $ANTLR start "FINAL"
	public final void mFINAL() throws RecognitionException {
		try {
			int _type = FINAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:325:7: ( 'final' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:325:9: 'final'
			{
			match("final"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FINAL"

	// $ANTLR start "FINALLY"
	public final void mFINALLY() throws RecognitionException {
		try {
			int _type = FINALLY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:326:9: ( 'finally' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:326:11: 'finally'
			{
			match("finally"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FINALLY"

	// $ANTLR start "FLOAT_TYPE"
	public final void mFLOAT_TYPE() throws RecognitionException {
		try {
			int _type = FLOAT_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:327:12: ( 'float' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:327:14: 'float'
			{
			match("float"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT_TYPE"

	// $ANTLR start "FOR"
	public final void mFOR() throws RecognitionException {
		try {
			int _type = FOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:328:5: ( 'for' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:328:7: 'for'
			{
			match("for"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FOR"

	// $ANTLR start "GOTO"
	public final void mGOTO() throws RecognitionException {
		try {
			int _type = GOTO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:329:6: ( 'goto' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:329:8: 'goto'
			{
			match("goto"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GOTO"

	// $ANTLR start "IF"
	public final void mIF() throws RecognitionException {
		try {
			int _type = IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:330:4: ( 'if' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:330:6: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IF"

	// $ANTLR start "FI"
	public final void mFI() throws RecognitionException {
		try {
			int _type = FI;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:331:3: ( 'fi' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:331:5: 'fi'
			{
			match("fi"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FI"

	// $ANTLR start "IMPLEMENTS"
	public final void mIMPLEMENTS() throws RecognitionException {
		try {
			int _type = IMPLEMENTS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:332:12: ( 'implements' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:332:14: 'implements'
			{
			match("implements"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IMPLEMENTS"

	// $ANTLR start "IMPORT"
	public final void mIMPORT() throws RecognitionException {
		try {
			int _type = IMPORT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:333:8: ( 'import' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:333:10: 'import'
			{
			match("import"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IMPORT"

	// $ANTLR start "INSTANCEOF"
	public final void mINSTANCEOF() throws RecognitionException {
		try {
			int _type = INSTANCEOF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:334:12: ( 'instanceof' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:334:14: 'instanceof'
			{
			match("instanceof"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INSTANCEOF"

	// $ANTLR start "INT_TYPE"
	public final void mINT_TYPE() throws RecognitionException {
		try {
			int _type = INT_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:335:10: ( 'int' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:335:12: 'int'
			{
			match("int"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_TYPE"

	// $ANTLR start "INTERFACE"
	public final void mINTERFACE() throws RecognitionException {
		try {
			int _type = INTERFACE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:336:11: ( 'interface' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:336:13: 'interface'
			{
			match("interface"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INTERFACE"

	// $ANTLR start "LONG_TYPE"
	public final void mLONG_TYPE() throws RecognitionException {
		try {
			int _type = LONG_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:337:11: ( 'long' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:337:13: 'long'
			{
			match("long"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LONG_TYPE"

	// $ANTLR start "MODULE"
	public final void mMODULE() throws RecognitionException {
		try {
			int _type = MODULE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:338:8: ( 'module' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:338:10: 'module'
			{
			match("module"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MODULE"

	// $ANTLR start "NATIVE"
	public final void mNATIVE() throws RecognitionException {
		try {
			int _type = NATIVE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:339:8: ( 'native' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:339:10: 'native'
			{
			match("native"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NATIVE"

	// $ANTLR start "NEW"
	public final void mNEW() throws RecognitionException {
		try {
			int _type = NEW;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:340:5: ( 'new' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:340:7: 'new'
			{
			match("new"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NEW"

	// $ANTLR start "NULL"
	public final void mNULL() throws RecognitionException {
		try {
			int _type = NULL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:341:6: ( 'null' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:341:8: 'null'
			{
			match("null"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NULL"

	// $ANTLR start "PACKAGE"
	public final void mPACKAGE() throws RecognitionException {
		try {
			int _type = PACKAGE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:342:9: ( 'package' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:342:11: 'package'
			{
			match("package"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PACKAGE"

	// $ANTLR start "PRIVATE"
	public final void mPRIVATE() throws RecognitionException {
		try {
			int _type = PRIVATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:343:9: ( 'private' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:343:11: 'private'
			{
			match("private"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PRIVATE"

	// $ANTLR start "PROTECTED"
	public final void mPROTECTED() throws RecognitionException {
		try {
			int _type = PROTECTED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:344:11: ( 'protected' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:344:13: 'protected'
			{
			match("protected"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PROTECTED"

	// $ANTLR start "PUBLIC"
	public final void mPUBLIC() throws RecognitionException {
		try {
			int _type = PUBLIC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:345:8: ( 'public' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:345:10: 'public'
			{
			match("public"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PUBLIC"

	// $ANTLR start "REQUIRES"
	public final void mREQUIRES() throws RecognitionException {
		try {
			int _type = REQUIRES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:346:10: ( 'requires' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:346:12: 'requires'
			{
			match("requires"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "REQUIRES"

	// $ANTLR start "RETURN"
	public final void mRETURN() throws RecognitionException {
		try {
			int _type = RETURN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:347:8: ( 'return' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:347:10: 'return'
			{
			match("return"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RETURN"

	// $ANTLR start "SHORT"
	public final void mSHORT() throws RecognitionException {
		try {
			int _type = SHORT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:348:7: ( 'short' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:348:9: 'short'
			{
			match("short"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SHORT"

	// $ANTLR start "STATIC"
	public final void mSTATIC() throws RecognitionException {
		try {
			int _type = STATIC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:349:8: ( 'static' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:349:10: 'static'
			{
			match("static"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STATIC"

	// $ANTLR start "STRICTFP"
	public final void mSTRICTFP() throws RecognitionException {
		try {
			int _type = STRICTFP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:350:10: ( 'strictfp' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:350:12: 'strictfp'
			{
			match("strictfp"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRICTFP"

	// $ANTLR start "STRING_TYPE"
	public final void mSTRING_TYPE() throws RecognitionException {
		try {
			int _type = STRING_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:351:13: ( 'String' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:351:15: 'String'
			{
			match("String"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING_TYPE"

	// $ANTLR start "SUPER"
	public final void mSUPER() throws RecognitionException {
		try {
			int _type = SUPER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:352:7: ( 'super' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:352:9: 'super'
			{
			match("super"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SUPER"

	// $ANTLR start "SWITCH"
	public final void mSWITCH() throws RecognitionException {
		try {
			int _type = SWITCH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:353:8: ( 'switch' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:353:10: 'switch'
			{
			match("switch"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SWITCH"

	// $ANTLR start "SYNCHRONIZED"
	public final void mSYNCHRONIZED() throws RecognitionException {
		try {
			int _type = SYNCHRONIZED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:354:14: ( 'synchronized' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:354:16: 'synchronized'
			{
			match("synchronized"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SYNCHRONIZED"

	// $ANTLR start "THIS"
	public final void mTHIS() throws RecognitionException {
		try {
			int _type = THIS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:355:6: ( 'this' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:355:8: 'this'
			{
			match("this"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "THIS"

	// $ANTLR start "THROW"
	public final void mTHROW() throws RecognitionException {
		try {
			int _type = THROW;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:356:7: ( 'throw' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:356:9: 'throw'
			{
			match("throw"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "THROW"

	// $ANTLR start "THROWS"
	public final void mTHROWS() throws RecognitionException {
		try {
			int _type = THROWS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:357:8: ( 'throws' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:357:10: 'throws'
			{
			match("throws"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "THROWS"

	// $ANTLR start "TRANSIENT"
	public final void mTRANSIENT() throws RecognitionException {
		try {
			int _type = TRANSIENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:358:11: ( 'transient' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:358:13: 'transient'
			{
			match("transient"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TRANSIENT"

	// $ANTLR start "TRUE"
	public final void mTRUE() throws RecognitionException {
		try {
			int _type = TRUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:359:6: ( 'true' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:359:8: 'true'
			{
			match("true"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TRUE"

	// $ANTLR start "TRY"
	public final void mTRY() throws RecognitionException {
		try {
			int _type = TRY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:360:5: ( 'try' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:360:7: 'try'
			{
			match("try"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TRY"

	// $ANTLR start "VAR"
	public final void mVAR() throws RecognitionException {
		try {
			int _type = VAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:361:5: ( 'var' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:361:7: 'var'
			{
			match("var"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VAR"

	// $ANTLR start "VOID"
	public final void mVOID() throws RecognitionException {
		try {
			int _type = VOID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:362:6: ( 'void' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:362:8: 'void'
			{
			match("void"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VOID"

	// $ANTLR start "VOLATILE"
	public final void mVOLATILE() throws RecognitionException {
		try {
			int _type = VOLATILE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:363:10: ( 'volatile' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:363:12: 'volatile'
			{
			match("volatile"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VOLATILE"

	// $ANTLR start "WHILE"
	public final void mWHILE() throws RecognitionException {
		try {
			int _type = WHILE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:364:7: ( 'while' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:364:9: 'while'
			{
			match("while"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WHILE"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:367:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:367:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:367:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop1;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:371:5: ( ( '0' .. '9' )+ )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:371:7: ( '0' .. '9' )+
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:371:7: ( '0' .. '9' )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT"

	// $ANTLR start "FLOAT"
	public final void mFLOAT() throws RecognitionException {
		try {
			int _type = FLOAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:375:5: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT )
			int alt9=3;
			alt9 = dfa9.predict(input);
			switch (alt9) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:375:9: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )?
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:375:9: ( '0' .. '9' )+
					int cnt3=0;
					loop3:
					while (true) {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
							alt3=1;
						}

						switch (alt3) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt3 >= 1 ) break loop3;
							EarlyExitException eee = new EarlyExitException(3, input);
							throw eee;
						}
						cnt3++;
					}

					match('.'); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:375:25: ( '0' .. '9' )*
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop4;
						}
					}

					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:375:37: ( EXPONENT )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0=='E'||LA5_0=='e') ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:375:37: EXPONENT
							{
							mEXPONENT(); 

							}
							break;

					}

					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:376:9: '.' ( '0' .. '9' )+ ( EXPONENT )?
					{
					match('.'); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:376:13: ( '0' .. '9' )+
					int cnt6=0;
					loop6:
					while (true) {
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
							alt6=1;
						}

						switch (alt6) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt6 >= 1 ) break loop6;
							EarlyExitException eee = new EarlyExitException(6, input);
							throw eee;
						}
						cnt6++;
					}

					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:376:25: ( EXPONENT )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0=='E'||LA7_0=='e') ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:376:25: EXPONENT
							{
							mEXPONENT(); 

							}
							break;

					}

					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:377:9: ( '0' .. '9' )+ EXPONENT
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:377:9: ( '0' .. '9' )+
					int cnt8=0;
					loop8:
					while (true) {
						int alt8=2;
						int LA8_0 = input.LA(1);
						if ( ((LA8_0 >= '0' && LA8_0 <= '9')) ) {
							alt8=1;
						}

						switch (alt8) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt8 >= 1 ) break loop8;
							EarlyExitException eee = new EarlyExitException(8, input);
							throw eee;
						}
						cnt8++;
					}

					mEXPONENT(); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:381:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0=='/') ) {
				int LA13_1 = input.LA(2);
				if ( (LA13_1=='/') ) {
					alt13=1;
				}
				else if ( (LA13_1=='*') ) {
					alt13=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 13, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}

			switch (alt13) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:381:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
					{
					match("//"); 

					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:381:14: (~ ( '\\n' | '\\r' ) )*
					loop10:
					while (true) {
						int alt10=2;
						int LA10_0 = input.LA(1);
						if ( ((LA10_0 >= '\u0000' && LA10_0 <= '\t')||(LA10_0 >= '\u000B' && LA10_0 <= '\f')||(LA10_0 >= '\u000E' && LA10_0 <= '\uFFFF')) ) {
							alt10=1;
						}

						switch (alt10) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:
							{
							if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop10;
						}
					}

					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:381:28: ( '\\r' )?
					int alt11=2;
					int LA11_0 = input.LA(1);
					if ( (LA11_0=='\r') ) {
						alt11=1;
					}
					switch (alt11) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:381:28: '\\r'
							{
							match('\r'); 
							}
							break;

					}

					match('\n'); 
					_channel=HIDDEN;
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:382:9: '/*' ( options {greedy=false; } : . )* '*/'
					{
					match("/*"); 

					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:382:14: ( options {greedy=false; } : . )*
					loop12:
					while (true) {
						int alt12=2;
						int LA12_0 = input.LA(1);
						if ( (LA12_0=='*') ) {
							int LA12_1 = input.LA(2);
							if ( (LA12_1=='/') ) {
								alt12=2;
							}
							else if ( ((LA12_1 >= '\u0000' && LA12_1 <= '.')||(LA12_1 >= '0' && LA12_1 <= '\uFFFF')) ) {
								alt12=1;
							}

						}
						else if ( ((LA12_0 >= '\u0000' && LA12_0 <= ')')||(LA12_0 >= '+' && LA12_0 <= '\uFFFF')) ) {
							alt12=1;
						}

						switch (alt12) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:382:42: .
							{
							matchAny(); 
							}
							break;

						default :
							break loop12;
						}
					}

					match("*/"); 

					_channel=HIDDEN;
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:385:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:385:9: ( ' ' | '\\t' | '\\r' | '\\n' )
			{
			if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:393:5: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:393:8: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
			{
			match('\"'); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:393:12: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
			loop14:
			while (true) {
				int alt14=3;
				int LA14_0 = input.LA(1);
				if ( (LA14_0=='\\') ) {
					alt14=1;
				}
				else if ( ((LA14_0 >= '\u0000' && LA14_0 <= '!')||(LA14_0 >= '#' && LA14_0 <= '[')||(LA14_0 >= ']' && LA14_0 <= '\uFFFF')) ) {
					alt14=2;
				}

				switch (alt14) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:393:14: ESC_SEQ
					{
					mESC_SEQ(); 

					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:393:24: ~ ( '\\\\' | '\"' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop14;
				}
			}

			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING"

	// $ANTLR start "CHAR"
	public final void mCHAR() throws RecognitionException {
		try {
			int _type = CHAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:396:5: ( '\\'' ( ESC_SEQ |~ ( '\\'' | '\\\\' ) ) '\\'' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:396:8: '\\'' ( ESC_SEQ |~ ( '\\'' | '\\\\' ) ) '\\''
			{
			match('\''); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:396:13: ( ESC_SEQ |~ ( '\\'' | '\\\\' ) )
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0=='\\') ) {
				alt15=1;
			}
			else if ( ((LA15_0 >= '\u0000' && LA15_0 <= '&')||(LA15_0 >= '(' && LA15_0 <= '[')||(LA15_0 >= ']' && LA15_0 <= '\uFFFF')) ) {
				alt15=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}

			switch (alt15) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:396:15: ESC_SEQ
					{
					mESC_SEQ(); 

					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:396:25: ~ ( '\\'' | '\\\\' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			match('\''); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHAR"

	// $ANTLR start "EXPONENT"
	public final void mEXPONENT() throws RecognitionException {
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:401:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:401:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
			{
			if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:401:22: ( '+' | '-' )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0=='+'||LA16_0=='-') ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:
					{
					if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:401:33: ( '0' .. '9' )+
			int cnt17=0;
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( ((LA17_0 >= '0' && LA17_0 <= '9')) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt17 >= 1 ) break loop17;
					EarlyExitException eee = new EarlyExitException(17, input);
					throw eee;
				}
				cnt17++;
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EXPONENT"

	// $ANTLR start "HEX_DIGIT"
	public final void mHEX_DIGIT() throws RecognitionException {
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:404:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HEX_DIGIT"

	// $ANTLR start "ESC_SEQ"
	public final void mESC_SEQ() throws RecognitionException {
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:408:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
			int alt18=3;
			int LA18_0 = input.LA(1);
			if ( (LA18_0=='\\') ) {
				switch ( input.LA(2) ) {
				case '\"':
				case '\'':
				case '\\':
				case 'b':
				case 'f':
				case 'n':
				case 'r':
				case 't':
					{
					alt18=1;
					}
					break;
				case 'u':
					{
					alt18=2;
					}
					break;
				case '0':
				case '1':
				case '2':
				case '3':
				case '4':
				case '5':
				case '6':
				case '7':
					{
					alt18=3;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 18, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}

			switch (alt18) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:408:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
					{
					match('\\'); 
					if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:409:9: UNICODE_ESC
					{
					mUNICODE_ESC(); 

					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:410:9: OCTAL_ESC
					{
					mOCTAL_ESC(); 

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ESC_SEQ"

	// $ANTLR start "OCTAL_ESC"
	public final void mOCTAL_ESC() throws RecognitionException {
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:415:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
			int alt19=3;
			int LA19_0 = input.LA(1);
			if ( (LA19_0=='\\') ) {
				int LA19_1 = input.LA(2);
				if ( ((LA19_1 >= '0' && LA19_1 <= '3')) ) {
					int LA19_2 = input.LA(3);
					if ( ((LA19_2 >= '0' && LA19_2 <= '7')) ) {
						int LA19_4 = input.LA(4);
						if ( ((LA19_4 >= '0' && LA19_4 <= '7')) ) {
							alt19=1;
						}

						else {
							alt19=2;
						}

					}

					else {
						alt19=3;
					}

				}
				else if ( ((LA19_1 >= '4' && LA19_1 <= '7')) ) {
					int LA19_3 = input.LA(3);
					if ( ((LA19_3 >= '0' && LA19_3 <= '7')) ) {
						alt19=2;
					}

					else {
						alt19=3;
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 19, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}

			switch (alt19) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:415:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '3') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:416:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:417:9: '\\\\' ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OCTAL_ESC"

	// $ANTLR start "UNICODE_ESC"
	public final void mUNICODE_ESC() throws RecognitionException {
		try {
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:422:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:422:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
			{
			match('\\'); 
			match('u'); 
			mHEX_DIGIT(); 

			mHEX_DIGIT(); 

			mHEX_DIGIT(); 

			mHEX_DIGIT(); 

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UNICODE_ESC"

	// $ANTLR start "ERROR_TOKEN"
	public final void mERROR_TOKEN() throws RecognitionException {
		try {
			int _type = ERROR_TOKEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:426:2: ( . )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:427:3: .
			{
			matchAny(); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ERROR_TOKEN"

	@Override
	public void mTokens() throws RecognitionException {
		// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:1:8: ( EQ | COMP | NEQ | LT | GT | LTE | GTE | MOD | ADD | SUB | MUL | DIV | AADD | SSUB | SC | DOT | COMMA | LP | RP | LBR | RBR | LB | RB | ABSTRACT | ASSERT | BOOLEAN_TYPE | BREAK | BYTE | CASE | CATCH | CHAR_TYPE | CLASS | CONTINUE | CONST | DEFAULT | DO | DOUBLE_TYPE | ELSE | ENUM | EXPORTS | EXTENDS | FALSE | FINAL | FINALLY | FLOAT_TYPE | FOR | GOTO | IF | FI | IMPLEMENTS | IMPORT | INSTANCEOF | INT_TYPE | INTERFACE | LONG_TYPE | MODULE | NATIVE | NEW | NULL | PACKAGE | PRIVATE | PROTECTED | PUBLIC | REQUIRES | RETURN | SHORT | STATIC | STRICTFP | STRING_TYPE | SUPER | SWITCH | SYNCHRONIZED | THIS | THROW | THROWS | TRANSIENT | TRUE | TRY | VAR | VOID | VOLATILE | WHILE | ID | INT | FLOAT | COMMENT | WS | STRING | CHAR | ERROR_TOKEN )
		int alt20=90;
		alt20 = dfa20.predict(input);
		switch (alt20) {
			case 1 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:1:10: EQ
				{
				mEQ(); 

				}
				break;
			case 2 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:1:13: COMP
				{
				mCOMP(); 

				}
				break;
			case 3 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:1:18: NEQ
				{
				mNEQ(); 

				}
				break;
			case 4 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:1:22: LT
				{
				mLT(); 

				}
				break;
			case 5 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:1:25: GT
				{
				mGT(); 

				}
				break;
			case 6 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:1:28: LTE
				{
				mLTE(); 

				}
				break;
			case 7 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:1:32: GTE
				{
				mGTE(); 

				}
				break;
			case 8 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:1:36: MOD
				{
				mMOD(); 

				}
				break;
			case 9 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:1:40: ADD
				{
				mADD(); 

				}
				break;
			case 10 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:1:44: SUB
				{
				mSUB(); 

				}
				break;
			case 11 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:1:48: MUL
				{
				mMUL(); 

				}
				break;
			case 12 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:1:52: DIV
				{
				mDIV(); 

				}
				break;
			case 13 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:1:56: AADD
				{
				mAADD(); 

				}
				break;
			case 14 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:1:61: SSUB
				{
				mSSUB(); 

				}
				break;
			case 15 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:1:66: SC
				{
				mSC(); 

				}
				break;
			case 16 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:1:69: DOT
				{
				mDOT(); 

				}
				break;
			case 17 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:1:73: COMMA
				{
				mCOMMA(); 

				}
				break;
			case 18 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:1:79: LP
				{
				mLP(); 

				}
				break;
			case 19 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:1:82: RP
				{
				mRP(); 

				}
				break;
			case 20 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:1:85: LBR
				{
				mLBR(); 

				}
				break;
			case 21 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:1:89: RBR
				{
				mRBR(); 

				}
				break;
			case 22 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:1:93: LB
				{
				mLB(); 

				}
				break;
			case 23 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:1:96: RB
				{
				mRB(); 

				}
				break;
			case 24 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:1:99: ABSTRACT
				{
				mABSTRACT(); 

				}
				break;
			case 25 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:1:108: ASSERT
				{
				mASSERT(); 

				}
				break;
			case 26 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:1:115: BOOLEAN_TYPE
				{
				mBOOLEAN_TYPE(); 

				}
				break;
			case 27 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:1:128: BREAK
				{
				mBREAK(); 

				}
				break;
			case 28 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:1:134: BYTE
				{
				mBYTE(); 

				}
				break;
			case 29 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:1:139: CASE
				{
				mCASE(); 

				}
				break;
			case 30 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:1:144: CATCH
				{
				mCATCH(); 

				}
				break;
			case 31 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:1:150: CHAR_TYPE
				{
				mCHAR_TYPE(); 

				}
				break;
			case 32 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:1:160: CLASS
				{
				mCLASS(); 

				}
				break;
			case 33 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:1:166: CONTINUE
				{
				mCONTINUE(); 

				}
				break;
			case 34 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:1:175: CONST
				{
				mCONST(); 

				}
				break;
			case 35 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:1:181: DEFAULT
				{
				mDEFAULT(); 

				}
				break;
			case 36 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:1:189: DO
				{
				mDO(); 

				}
				break;
			case 37 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:1:192: DOUBLE_TYPE
				{
				mDOUBLE_TYPE(); 

				}
				break;
			case 38 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:1:204: ELSE
				{
				mELSE(); 

				}
				break;
			case 39 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:1:209: ENUM
				{
				mENUM(); 

				}
				break;
			case 40 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:1:214: EXPORTS
				{
				mEXPORTS(); 

				}
				break;
			case 41 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:1:222: EXTENDS
				{
				mEXTENDS(); 

				}
				break;
			case 42 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:1:230: FALSE
				{
				mFALSE(); 

				}
				break;
			case 43 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:1:236: FINAL
				{
				mFINAL(); 

				}
				break;
			case 44 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:1:242: FINALLY
				{
				mFINALLY(); 

				}
				break;
			case 45 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:1:250: FLOAT_TYPE
				{
				mFLOAT_TYPE(); 

				}
				break;
			case 46 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:1:261: FOR
				{
				mFOR(); 

				}
				break;
			case 47 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:1:265: GOTO
				{
				mGOTO(); 

				}
				break;
			case 48 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:1:270: IF
				{
				mIF(); 

				}
				break;
			case 49 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:1:273: FI
				{
				mFI(); 

				}
				break;
			case 50 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:1:276: IMPLEMENTS
				{
				mIMPLEMENTS(); 

				}
				break;
			case 51 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:1:287: IMPORT
				{
				mIMPORT(); 

				}
				break;
			case 52 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:1:294: INSTANCEOF
				{
				mINSTANCEOF(); 

				}
				break;
			case 53 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:1:305: INT_TYPE
				{
				mINT_TYPE(); 

				}
				break;
			case 54 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:1:314: INTERFACE
				{
				mINTERFACE(); 

				}
				break;
			case 55 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:1:324: LONG_TYPE
				{
				mLONG_TYPE(); 

				}
				break;
			case 56 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:1:334: MODULE
				{
				mMODULE(); 

				}
				break;
			case 57 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:1:341: NATIVE
				{
				mNATIVE(); 

				}
				break;
			case 58 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:1:348: NEW
				{
				mNEW(); 

				}
				break;
			case 59 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:1:352: NULL
				{
				mNULL(); 

				}
				break;
			case 60 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:1:357: PACKAGE
				{
				mPACKAGE(); 

				}
				break;
			case 61 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:1:365: PRIVATE
				{
				mPRIVATE(); 

				}
				break;
			case 62 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:1:373: PROTECTED
				{
				mPROTECTED(); 

				}
				break;
			case 63 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:1:383: PUBLIC
				{
				mPUBLIC(); 

				}
				break;
			case 64 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:1:390: REQUIRES
				{
				mREQUIRES(); 

				}
				break;
			case 65 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:1:399: RETURN
				{
				mRETURN(); 

				}
				break;
			case 66 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:1:406: SHORT
				{
				mSHORT(); 

				}
				break;
			case 67 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:1:412: STATIC
				{
				mSTATIC(); 

				}
				break;
			case 68 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:1:419: STRICTFP
				{
				mSTRICTFP(); 

				}
				break;
			case 69 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:1:428: STRING_TYPE
				{
				mSTRING_TYPE(); 

				}
				break;
			case 70 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:1:440: SUPER
				{
				mSUPER(); 

				}
				break;
			case 71 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:1:446: SWITCH
				{
				mSWITCH(); 

				}
				break;
			case 72 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:1:453: SYNCHRONIZED
				{
				mSYNCHRONIZED(); 

				}
				break;
			case 73 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:1:466: THIS
				{
				mTHIS(); 

				}
				break;
			case 74 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:1:471: THROW
				{
				mTHROW(); 

				}
				break;
			case 75 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:1:477: THROWS
				{
				mTHROWS(); 

				}
				break;
			case 76 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:1:484: TRANSIENT
				{
				mTRANSIENT(); 

				}
				break;
			case 77 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:1:494: TRUE
				{
				mTRUE(); 

				}
				break;
			case 78 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:1:499: TRY
				{
				mTRY(); 

				}
				break;
			case 79 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:1:503: VAR
				{
				mVAR(); 

				}
				break;
			case 80 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:1:507: VOID
				{
				mVOID(); 

				}
				break;
			case 81 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:1:512: VOLATILE
				{
				mVOLATILE(); 

				}
				break;
			case 82 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:1:521: WHILE
				{
				mWHILE(); 

				}
				break;
			case 83 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:1:527: ID
				{
				mID(); 

				}
				break;
			case 84 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:1:530: INT
				{
				mINT(); 

				}
				break;
			case 85 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:1:534: FLOAT
				{
				mFLOAT(); 

				}
				break;
			case 86 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:1:540: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 87 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:1:548: WS
				{
				mWS(); 

				}
				break;
			case 88 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:1:551: STRING
				{
				mSTRING(); 

				}
				break;
			case 89 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:1:558: CHAR
				{
				mCHAR(); 

				}
				break;
			case 90 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\SimpleJava2023.g:1:563: ERROR_TOKEN
				{
				mERROR_TOKEN(); 

				}
				break;

		}
	}


	protected DFA9 dfa9 = new DFA9(this);
	protected DFA20 dfa20 = new DFA20(this);
	static final String DFA9_eotS =
		"\5\uffff";
	static final String DFA9_eofS =
		"\5\uffff";
	static final String DFA9_minS =
		"\2\56\3\uffff";
	static final String DFA9_maxS =
		"\1\71\1\145\3\uffff";
	static final String DFA9_acceptS =
		"\2\uffff\1\2\1\1\1\3";
	static final String DFA9_specialS =
		"\5\uffff}>";
	static final String[] DFA9_transitionS = {
			"\1\2\1\uffff\12\1",
			"\1\3\1\uffff\12\1\13\uffff\1\4\37\uffff\1\4",
			"",
			"",
			""
	};

	static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
	static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
	static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
	static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
	static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
	static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
	static final short[][] DFA9_transition;

	static {
		int numStates = DFA9_transitionS.length;
		DFA9_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
		}
	}

	protected class DFA9 extends DFA {

		public DFA9(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 9;
			this.eot = DFA9_eot;
			this.eof = DFA9_eof;
			this.min = DFA9_min;
			this.max = DFA9_max;
			this.accept = DFA9_accept;
			this.special = DFA9_special;
			this.transition = DFA9_transition;
		}
		@Override
		public String getDescription() {
			return "374:1: FLOAT : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT );";
		}
	}

	static final String DFA20_eotS =
		"\1\uffff\1\54\1\52\1\57\1\61\1\uffff\1\64\1\66\1\uffff\1\71\1\uffff\1"+
		"\73\7\uffff\22\106\1\uffff\1\157\1\uffff\2\52\32\uffff\2\106\1\uffff\10"+
		"\106\1\u0080\4\106\1\u0087\3\106\1\u008b\26\106\1\uffff\1\157\3\uffff"+
		"\14\106\1\uffff\6\106\1\uffff\1\106\1\u00be\1\106\1\uffff\2\106\1\u00c4"+
		"\3\106\1\u00c8\22\106\1\u00db\1\u00dc\7\106\1\u00e4\1\u00e5\1\106\1\u00e7"+
		"\5\106\1\u00ed\1\u00ee\5\106\1\uffff\1\u00f4\4\106\1\uffff\1\u00f9\2\106"+
		"\1\uffff\1\u00fc\15\106\1\u010a\2\106\1\u010d\2\uffff\1\u010e\5\106\1"+
		"\u0114\2\uffff\1\u0115\1\uffff\1\u0116\1\106\1\u0118\2\106\2\uffff\2\106"+
		"\1\u011d\1\u011f\1\u0120\1\uffff\4\106\1\uffff\2\106\1\uffff\6\106\1\u012d"+
		"\2\106\1\u0130\3\106\1\uffff\1\u0135\1\106\2\uffff\1\106\1\u0138\1\106"+
		"\1\u013a\1\106\3\uffff\1\106\1\uffff\1\106\1\u013e\2\106\1\uffff\1\106"+
		"\2\uffff\1\106\1\u0143\2\106\1\u0146\1\u0147\3\106\1\u014b\1\106\1\u014d"+
		"\1\uffff\1\u014e\1\106\1\uffff\1\u0150\1\106\1\u0152\1\u0153\1\uffff\2"+
		"\106\1\uffff\1\106\1\uffff\1\u0157\1\106\1\u0159\1\uffff\1\u015a\1\u015b"+
		"\1\u015c\1\106\1\uffff\2\106\2\uffff\1\u0160\1\u0161\1\106\1\uffff\1\106"+
		"\2\uffff\1\106\1\uffff\1\106\2\uffff\2\106\1\u0168\1\uffff\1\u0169\4\uffff"+
		"\3\106\2\uffff\1\106\1\u016e\1\u016f\2\106\1\u0172\2\uffff\2\106\1\u0175"+
		"\1\u0176\2\uffff\1\106\1\u0178\1\uffff\1\u0179\1\u017a\2\uffff\1\106\3"+
		"\uffff\1\106\1\u017d\1\uffff";
	static final String DFA20_eofS =
		"\u017e\uffff";
	static final String DFA20_minS =
		"\1\0\4\75\1\uffff\1\53\1\55\1\uffff\1\52\1\uffff\1\60\7\uffff\1\142\1"+
		"\157\1\141\1\145\1\154\1\141\1\157\1\146\2\157\2\141\1\145\1\150\1\164"+
		"\1\150\1\141\1\150\1\uffff\1\56\1\uffff\2\0\32\uffff\2\163\1\uffff\1\157"+
		"\1\145\1\164\1\163\2\141\1\156\1\146\1\60\1\163\1\165\1\160\1\154\1\60"+
		"\1\157\1\162\1\164\1\60\1\160\1\163\1\156\1\144\1\164\1\167\1\154\1\143"+
		"\1\151\1\142\1\161\1\157\1\141\1\160\1\151\1\156\1\162\1\151\1\141\1\162"+
		"\2\151\1\uffff\1\56\3\uffff\1\164\1\145\1\154\1\141\2\145\1\143\1\162"+
		"\2\163\1\141\1\142\1\uffff\1\145\1\155\1\157\1\145\1\163\1\141\1\uffff"+
		"\1\141\1\60\1\157\1\uffff\1\154\1\164\1\60\1\147\1\165\1\151\1\60\1\154"+
		"\1\153\1\166\1\164\1\154\2\165\1\162\1\164\1\151\1\145\1\164\1\143\1\151"+
		"\1\163\1\157\1\156\1\145\2\60\1\144\1\141\1\154\2\162\1\145\1\153\2\60"+
		"\1\150\1\60\1\163\1\151\1\164\1\165\1\154\2\60\1\162\1\156\1\145\1\154"+
		"\1\164\1\uffff\1\60\1\145\1\162\1\141\1\162\1\uffff\1\60\1\154\1\166\1"+
		"\uffff\1\60\2\141\1\145\2\151\1\162\1\164\1\151\1\143\1\162\1\143\1\150"+
		"\1\156\1\60\1\167\1\163\1\60\2\uffff\1\60\1\164\1\145\1\141\1\164\1\141"+
		"\1\60\2\uffff\1\60\1\uffff\1\60\1\156\1\60\1\154\1\145\2\uffff\1\164\1"+
		"\144\3\60\1\uffff\1\155\1\164\1\156\1\146\1\uffff\2\145\1\uffff\1\147"+
		"\1\164\2\143\1\162\1\156\1\60\1\143\1\164\1\60\1\150\1\162\1\147\1\uffff"+
		"\1\60\1\151\2\uffff\1\151\1\60\1\143\1\60\1\156\3\uffff\1\165\1\uffff"+
		"\1\164\1\60\2\163\1\uffff\1\171\2\uffff\1\145\1\60\1\143\1\141\2\60\2"+
		"\145\1\164\1\60\1\145\1\60\1\uffff\1\60\1\146\1\uffff\1\60\1\157\2\60"+
		"\1\uffff\1\145\1\154\1\uffff\1\164\1\uffff\1\60\1\145\1\60\1\uffff\3\60"+
		"\1\156\1\uffff\1\145\1\143\2\uffff\2\60\1\145\1\uffff\1\163\2\uffff\1"+
		"\160\1\uffff\1\156\2\uffff\1\156\1\145\1\60\1\uffff\1\60\4\uffff\1\164"+
		"\1\157\1\145\2\uffff\1\144\2\60\1\151\1\164\1\60\2\uffff\1\163\1\146\2"+
		"\60\2\uffff\1\172\1\60\1\uffff\2\60\2\uffff\1\145\3\uffff\1\144\1\60\1"+
		"\uffff";
	static final String DFA20_maxS =
		"\1\uffff\4\75\1\uffff\1\53\1\55\1\uffff\1\57\1\uffff\1\71\7\uffff\1\163"+
		"\1\171\2\157\1\170\2\157\1\156\2\157\2\165\1\145\1\171\1\164\1\162\1\157"+
		"\1\150\1\uffff\1\145\1\uffff\2\uffff\32\uffff\2\163\1\uffff\1\157\1\145"+
		"\2\164\2\141\1\156\1\146\1\172\1\163\1\165\1\164\1\154\1\172\1\157\1\162"+
		"\1\164\1\172\1\160\1\164\1\156\1\144\1\164\1\167\1\154\1\143\1\157\1\142"+
		"\1\164\1\157\1\162\1\160\1\151\1\156\2\162\1\171\1\162\1\154\1\151\1\uffff"+
		"\1\145\3\uffff\1\164\1\145\1\154\1\141\2\145\1\143\1\162\1\163\1\164\1"+
		"\141\1\142\1\uffff\1\145\1\155\1\157\1\145\1\163\1\141\1\uffff\1\141\1"+
		"\172\1\157\1\uffff\1\157\1\164\1\172\1\147\1\165\1\151\1\172\1\154\1\153"+
		"\1\166\1\164\1\154\2\165\1\162\1\164\1\151\1\145\1\164\1\143\1\151\1\163"+
		"\1\157\1\156\1\145\2\172\1\144\1\141\1\154\2\162\1\145\1\153\2\172\1\150"+
		"\1\172\1\163\1\151\1\164\1\165\1\154\2\172\1\162\1\156\1\145\1\154\1\164"+
		"\1\uffff\1\172\1\145\1\162\1\141\1\162\1\uffff\1\172\1\154\1\166\1\uffff"+
		"\1\172\2\141\1\145\2\151\1\162\1\164\1\151\1\143\1\162\1\143\1\150\1\156"+
		"\1\172\1\167\1\163\1\172\2\uffff\1\172\1\164\1\145\1\141\1\164\1\141\1"+
		"\172\2\uffff\1\172\1\uffff\1\172\1\156\1\172\1\154\1\145\2\uffff\1\164"+
		"\1\144\3\172\1\uffff\1\155\1\164\1\156\1\146\1\uffff\2\145\1\uffff\1\147"+
		"\1\164\2\143\1\162\1\156\1\172\1\143\1\164\1\172\1\150\1\162\1\147\1\uffff"+
		"\1\172\1\151\2\uffff\1\151\1\172\1\143\1\172\1\156\3\uffff\1\165\1\uffff"+
		"\1\164\1\172\2\163\1\uffff\1\171\2\uffff\1\145\1\172\1\143\1\141\2\172"+
		"\2\145\1\164\1\172\1\145\1\172\1\uffff\1\172\1\146\1\uffff\1\172\1\157"+
		"\2\172\1\uffff\1\145\1\154\1\uffff\1\164\1\uffff\1\172\1\145\1\172\1\uffff"+
		"\3\172\1\156\1\uffff\1\145\1\143\2\uffff\2\172\1\145\1\uffff\1\163\2\uffff"+
		"\1\160\1\uffff\1\156\2\uffff\1\156\1\145\1\172\1\uffff\1\172\4\uffff\1"+
		"\164\1\157\1\145\2\uffff\1\144\2\172\1\151\1\164\1\172\2\uffff\1\163\1"+
		"\146\2\172\2\uffff\2\172\1\uffff\2\172\2\uffff\1\145\3\uffff\1\144\1\172"+
		"\1\uffff";
	static final String DFA20_acceptS =
		"\5\uffff\1\10\2\uffff\1\13\1\uffff\1\17\1\uffff\1\21\1\22\1\23\1\24\1"+
		"\25\1\26\1\27\22\uffff\1\123\1\uffff\1\127\2\uffff\1\132\1\2\1\1\1\3\1"+
		"\6\1\4\1\7\1\5\1\10\1\15\1\11\1\16\1\12\1\13\1\126\1\14\1\17\1\20\1\125"+
		"\1\21\1\22\1\23\1\24\1\25\1\26\1\27\2\uffff\1\123\50\uffff\1\124\1\uffff"+
		"\1\127\1\130\1\131\14\uffff\1\44\6\uffff\1\61\3\uffff\1\60\62\uffff\1"+
		"\56\5\uffff\1\65\3\uffff\1\72\22\uffff\1\116\1\117\7\uffff\1\34\1\35\1"+
		"\uffff\1\37\5\uffff\1\46\1\47\5\uffff\1\57\4\uffff\1\67\2\uffff\1\73\15"+
		"\uffff\1\111\2\uffff\1\115\1\120\5\uffff\1\33\1\36\1\40\1\uffff\1\42\4"+
		"\uffff\1\52\1\uffff\1\53\1\55\14\uffff\1\102\2\uffff\1\106\4\uffff\1\112"+
		"\2\uffff\1\122\1\uffff\1\31\3\uffff\1\45\4\uffff\1\63\2\uffff\1\70\1\71"+
		"\3\uffff\1\77\1\uffff\1\101\1\103\1\uffff\1\107\1\uffff\1\105\1\113\3"+
		"\uffff\1\32\1\uffff\1\43\1\50\1\51\1\54\3\uffff\1\74\1\75\6\uffff\1\30"+
		"\1\41\4\uffff\1\100\1\104\2\uffff\1\121\2\uffff\1\66\1\76\1\uffff\1\114"+
		"\1\62\1\64\2\uffff\1\110";
	static final String DFA20_specialS =
		"\1\2\47\uffff\1\1\1\0\u0154\uffff}>";
	static final String[] DFA20_transitionS = {
			"\11\52\2\47\2\52\1\47\22\52\1\47\1\2\1\50\2\52\1\5\1\52\1\51\1\15\1\16"+
			"\1\10\1\6\1\14\1\7\1\13\1\11\12\46\1\52\1\12\1\3\1\1\1\4\2\52\22\45\1"+
			"\41\7\45\1\21\1\52\1\22\1\52\1\45\1\52\1\23\1\24\1\25\1\26\1\27\1\30"+
			"\1\31\1\45\1\32\2\45\1\33\1\34\1\35\1\45\1\36\1\45\1\37\1\40\1\42\1\45"+
			"\1\43\1\44\3\45\1\17\1\52\1\20\uff82\52",
			"\1\53",
			"\1\55",
			"\1\56",
			"\1\60",
			"",
			"\1\63",
			"\1\65",
			"",
			"\1\70\4\uffff\1\70",
			"",
			"\12\74",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\104\20\uffff\1\105",
			"\1\107\2\uffff\1\110\6\uffff\1\111",
			"\1\112\6\uffff\1\113\3\uffff\1\114\2\uffff\1\115",
			"\1\116\11\uffff\1\117",
			"\1\120\1\uffff\1\121\11\uffff\1\122",
			"\1\123\7\uffff\1\124\2\uffff\1\125\2\uffff\1\126",
			"\1\127",
			"\1\130\6\uffff\1\131\1\132",
			"\1\133",
			"\1\134",
			"\1\135\3\uffff\1\136\17\uffff\1\137",
			"\1\140\20\uffff\1\141\2\uffff\1\142",
			"\1\143",
			"\1\144\13\uffff\1\145\1\146\1\uffff\1\147\1\uffff\1\150",
			"\1\151",
			"\1\152\11\uffff\1\153",
			"\1\154\15\uffff\1\155",
			"\1\156",
			"",
			"\1\74\1\uffff\12\160\13\uffff\1\74\37\uffff\1\74",
			"",
			"\0\162",
			"\47\163\1\uffff\uffd8\163",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\164",
			"\1\165",
			"",
			"\1\166",
			"\1\167",
			"\1\170",
			"\1\171\1\172",
			"\1\173",
			"\1\174",
			"\1\175",
			"\1\176",
			"\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\24\106\1\177\5\106",
			"\1\u0081",
			"\1\u0082",
			"\1\u0083\3\uffff\1\u0084",
			"\1\u0085",
			"\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\15\106\1\u0086\14\106",
			"\1\u0088",
			"\1\u0089",
			"\1\u008a",
			"\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\32\106",
			"\1\u008c",
			"\1\u008d\1\u008e",
			"\1\u008f",
			"\1\u0090",
			"\1\u0091",
			"\1\u0092",
			"\1\u0093",
			"\1\u0094",
			"\1\u0095\5\uffff\1\u0096",
			"\1\u0097",
			"\1\u0098\2\uffff\1\u0099",
			"\1\u009a",
			"\1\u009b\20\uffff\1\u009c",
			"\1\u009d",
			"\1\u009e",
			"\1\u009f",
			"\1\u00a0",
			"\1\u00a1\10\uffff\1\u00a2",
			"\1\u00a3\23\uffff\1\u00a4\3\uffff\1\u00a5",
			"\1\u00a6",
			"\1\u00a7\2\uffff\1\u00a8",
			"\1\u00a9",
			"",
			"\1\74\1\uffff\12\160\13\uffff\1\74\37\uffff\1\74",
			"",
			"",
			"",
			"\1\u00aa",
			"\1\u00ab",
			"\1\u00ac",
			"\1\u00ad",
			"\1\u00ae",
			"\1\u00af",
			"\1\u00b0",
			"\1\u00b1",
			"\1\u00b2",
			"\1\u00b4\1\u00b3",
			"\1\u00b5",
			"\1\u00b6",
			"",
			"\1\u00b7",
			"\1\u00b8",
			"\1\u00b9",
			"\1\u00ba",
			"\1\u00bb",
			"\1\u00bc",
			"",
			"\1\u00bd",
			"\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\32\106",
			"\1\u00bf",
			"",
			"\1\u00c0\2\uffff\1\u00c1",
			"\1\u00c2",
			"\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\4\106\1\u00c3\25\106",
			"\1\u00c5",
			"\1\u00c6",
			"\1\u00c7",
			"\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\32\106",
			"\1\u00c9",
			"\1\u00ca",
			"\1\u00cb",
			"\1\u00cc",
			"\1\u00cd",
			"\1\u00ce",
			"\1\u00cf",
			"\1\u00d0",
			"\1\u00d1",
			"\1\u00d2",
			"\1\u00d3",
			"\1\u00d4",
			"\1\u00d5",
			"\1\u00d6",
			"\1\u00d7",
			"\1\u00d8",
			"\1\u00d9",
			"\1\u00da",
			"\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\32\106",
			"\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\32\106",
			"\1\u00dd",
			"\1\u00de",
			"\1\u00df",
			"\1\u00e0",
			"\1\u00e1",
			"\1\u00e2",
			"\1\u00e3",
			"\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\32\106",
			"\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\32\106",
			"\1\u00e6",
			"\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\32\106",
			"\1\u00e8",
			"\1\u00e9",
			"\1\u00ea",
			"\1\u00eb",
			"\1\u00ec",
			"\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\32\106",
			"\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\32\106",
			"\1\u00ef",
			"\1\u00f0",
			"\1\u00f1",
			"\1\u00f2",
			"\1\u00f3",
			"",
			"\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\32\106",
			"\1\u00f5",
			"\1\u00f6",
			"\1\u00f7",
			"\1\u00f8",
			"",
			"\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\32\106",
			"\1\u00fa",
			"\1\u00fb",
			"",
			"\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\32\106",
			"\1\u00fd",
			"\1\u00fe",
			"\1\u00ff",
			"\1\u0100",
			"\1\u0101",
			"\1\u0102",
			"\1\u0103",
			"\1\u0104",
			"\1\u0105",
			"\1\u0106",
			"\1\u0107",
			"\1\u0108",
			"\1\u0109",
			"\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\32\106",
			"\1\u010b",
			"\1\u010c",
			"\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\32\106",
			"",
			"",
			"\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\32\106",
			"\1\u010f",
			"\1\u0110",
			"\1\u0111",
			"\1\u0112",
			"\1\u0113",
			"\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\32\106",
			"",
			"",
			"\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\32\106",
			"",
			"\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\32\106",
			"\1\u0117",
			"\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\32\106",
			"\1\u0119",
			"\1\u011a",
			"",
			"",
			"\1\u011b",
			"\1\u011c",
			"\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\32\106",
			"\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\13\106\1\u011e\16\106",
			"\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\32\106",
			"",
			"\1\u0121",
			"\1\u0122",
			"\1\u0123",
			"\1\u0124",
			"",
			"\1\u0125",
			"\1\u0126",
			"",
			"\1\u0127",
			"\1\u0128",
			"\1\u0129",
			"\1\u012a",
			"\1\u012b",
			"\1\u012c",
			"\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\32\106",
			"\1\u012e",
			"\1\u012f",
			"\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\32\106",
			"\1\u0131",
			"\1\u0132",
			"\1\u0133",
			"",
			"\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\22\106\1\u0134\7\106",
			"\1\u0136",
			"",
			"",
			"\1\u0137",
			"\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\32\106",
			"\1\u0139",
			"\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\32\106",
			"\1\u013b",
			"",
			"",
			"",
			"\1\u013c",
			"",
			"\1\u013d",
			"\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\32\106",
			"\1\u013f",
			"\1\u0140",
			"",
			"\1\u0141",
			"",
			"",
			"\1\u0142",
			"\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\32\106",
			"\1\u0144",
			"\1\u0145",
			"\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\32\106",
			"\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\32\106",
			"\1\u0148",
			"\1\u0149",
			"\1\u014a",
			"\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\32\106",
			"\1\u014c",
			"\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\32\106",
			"",
			"\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\32\106",
			"\1\u014f",
			"",
			"\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\32\106",
			"\1\u0151",
			"\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\32\106",
			"\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\32\106",
			"",
			"\1\u0154",
			"\1\u0155",
			"",
			"\1\u0156",
			"",
			"\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\32\106",
			"\1\u0158",
			"\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\32\106",
			"",
			"\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\32\106",
			"\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\32\106",
			"\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\32\106",
			"\1\u015d",
			"",
			"\1\u015e",
			"\1\u015f",
			"",
			"",
			"\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\32\106",
			"\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\32\106",
			"\1\u0162",
			"",
			"\1\u0163",
			"",
			"",
			"\1\u0164",
			"",
			"\1\u0165",
			"",
			"",
			"\1\u0166",
			"\1\u0167",
			"\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\32\106",
			"",
			"\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\32\106",
			"",
			"",
			"",
			"",
			"\1\u016a",
			"\1\u016b",
			"\1\u016c",
			"",
			"",
			"\1\u016d",
			"\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\32\106",
			"\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\32\106",
			"\1\u0170",
			"\1\u0171",
			"\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\32\106",
			"",
			"",
			"\1\u0173",
			"\1\u0174",
			"\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\32\106",
			"\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\32\106",
			"",
			"",
			"\1\u0177",
			"\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\32\106",
			"",
			"\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\32\106",
			"\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\32\106",
			"",
			"",
			"\1\u017b",
			"",
			"",
			"",
			"\1\u017c",
			"\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\32\106",
			""
	};

	static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
	static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
	static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
	static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
	static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
	static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
	static final short[][] DFA20_transition;

	static {
		int numStates = DFA20_transitionS.length;
		DFA20_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
		}
	}

	protected class DFA20 extends DFA {

		public DFA20(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 20;
			this.eot = DFA20_eot;
			this.eof = DFA20_eof;
			this.min = DFA20_min;
			this.max = DFA20_max;
			this.accept = DFA20_accept;
			this.special = DFA20_special;
			this.transition = DFA20_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( EQ | COMP | NEQ | LT | GT | LTE | GTE | MOD | ADD | SUB | MUL | DIV | AADD | SSUB | SC | DOT | COMMA | LP | RP | LBR | RBR | LB | RB | ABSTRACT | ASSERT | BOOLEAN_TYPE | BREAK | BYTE | CASE | CATCH | CHAR_TYPE | CLASS | CONTINUE | CONST | DEFAULT | DO | DOUBLE_TYPE | ELSE | ENUM | EXPORTS | EXTENDS | FALSE | FINAL | FINALLY | FLOAT_TYPE | FOR | GOTO | IF | FI | IMPLEMENTS | IMPORT | INSTANCEOF | INT_TYPE | INTERFACE | LONG_TYPE | MODULE | NATIVE | NEW | NULL | PACKAGE | PRIVATE | PROTECTED | PUBLIC | REQUIRES | RETURN | SHORT | STATIC | STRICTFP | STRING_TYPE | SUPER | SWITCH | SYNCHRONIZED | THIS | THROW | THROWS | TRANSIENT | TRUE | TRY | VAR | VOID | VOLATILE | WHILE | ID | INT | FLOAT | COMMENT | WS | STRING | CHAR | ERROR_TOKEN );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA20_41 = input.LA(1);
						s = -1;
						if ( ((LA20_41 >= '\u0000' && LA20_41 <= '&')||(LA20_41 >= '(' && LA20_41 <= '\uFFFF')) ) {s = 115;}
						else s = 42;
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA20_40 = input.LA(1);
						s = -1;
						if ( ((LA20_40 >= '\u0000' && LA20_40 <= '\uFFFF')) ) {s = 114;}
						else s = 42;
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA20_0 = input.LA(1);
						s = -1;
						if ( (LA20_0=='=') ) {s = 1;}
						else if ( (LA20_0=='!') ) {s = 2;}
						else if ( (LA20_0=='<') ) {s = 3;}
						else if ( (LA20_0=='>') ) {s = 4;}
						else if ( (LA20_0=='%') ) {s = 5;}
						else if ( (LA20_0=='+') ) {s = 6;}
						else if ( (LA20_0=='-') ) {s = 7;}
						else if ( (LA20_0=='*') ) {s = 8;}
						else if ( (LA20_0=='/') ) {s = 9;}
						else if ( (LA20_0==';') ) {s = 10;}
						else if ( (LA20_0=='.') ) {s = 11;}
						else if ( (LA20_0==',') ) {s = 12;}
						else if ( (LA20_0=='(') ) {s = 13;}
						else if ( (LA20_0==')') ) {s = 14;}
						else if ( (LA20_0=='{') ) {s = 15;}
						else if ( (LA20_0=='}') ) {s = 16;}
						else if ( (LA20_0=='[') ) {s = 17;}
						else if ( (LA20_0==']') ) {s = 18;}
						else if ( (LA20_0=='a') ) {s = 19;}
						else if ( (LA20_0=='b') ) {s = 20;}
						else if ( (LA20_0=='c') ) {s = 21;}
						else if ( (LA20_0=='d') ) {s = 22;}
						else if ( (LA20_0=='e') ) {s = 23;}
						else if ( (LA20_0=='f') ) {s = 24;}
						else if ( (LA20_0=='g') ) {s = 25;}
						else if ( (LA20_0=='i') ) {s = 26;}
						else if ( (LA20_0=='l') ) {s = 27;}
						else if ( (LA20_0=='m') ) {s = 28;}
						else if ( (LA20_0=='n') ) {s = 29;}
						else if ( (LA20_0=='p') ) {s = 30;}
						else if ( (LA20_0=='r') ) {s = 31;}
						else if ( (LA20_0=='s') ) {s = 32;}
						else if ( (LA20_0=='S') ) {s = 33;}
						else if ( (LA20_0=='t') ) {s = 34;}
						else if ( (LA20_0=='v') ) {s = 35;}
						else if ( (LA20_0=='w') ) {s = 36;}
						else if ( ((LA20_0 >= 'A' && LA20_0 <= 'R')||(LA20_0 >= 'T' && LA20_0 <= 'Z')||LA20_0=='_'||LA20_0=='h'||(LA20_0 >= 'j' && LA20_0 <= 'k')||LA20_0=='o'||LA20_0=='q'||LA20_0=='u'||(LA20_0 >= 'x' && LA20_0 <= 'z')) ) {s = 37;}
						else if ( ((LA20_0 >= '0' && LA20_0 <= '9')) ) {s = 38;}
						else if ( ((LA20_0 >= '\t' && LA20_0 <= '\n')||LA20_0=='\r'||LA20_0==' ') ) {s = 39;}
						else if ( (LA20_0=='\"') ) {s = 40;}
						else if ( (LA20_0=='\'') ) {s = 41;}
						else if ( ((LA20_0 >= '\u0000' && LA20_0 <= '\b')||(LA20_0 >= '\u000B' && LA20_0 <= '\f')||(LA20_0 >= '\u000E' && LA20_0 <= '\u001F')||(LA20_0 >= '#' && LA20_0 <= '$')||LA20_0=='&'||LA20_0==':'||(LA20_0 >= '?' && LA20_0 <= '@')||LA20_0=='\\'||LA20_0=='^'||LA20_0=='`'||LA20_0=='|'||(LA20_0 >= '~' && LA20_0 <= '\uFFFF')) ) {s = 42;}
						if ( s>=0 ) return s;
						break;
			}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 20, _s, input);
			error(nvae);
			throw nvae;
		}
	}

}
