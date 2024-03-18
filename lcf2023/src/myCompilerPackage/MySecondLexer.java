// $ANTLR 3.5.1 C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\MySecondLexer.g 2023-10-20 17:34:35

	package myCompilerPackage; 	


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class MySecondLexer extends Lexer {
	public static final int EOF=-1;
	public static final int CHAR=4;
	public static final int CLASS=5;
	public static final int COMMA=6;
	public static final int COMMENT=7;
	public static final int DOT=8;
	public static final int EQ=9;
	public static final int ESC_SEQ=10;
	public static final int EXPONENT=11;
	public static final int FLOAT=12;
	public static final int HEX_DIGIT=13;
	public static final int ID=14;
	public static final int IMPORT=15;
	public static final int INT=16;
	public static final int LB=17;
	public static final int LP=18;
	public static final int NEQ=19;
	public static final int OCTAL_ESC=20;
	public static final int PACKAGE=21;
	public static final int PUBLIC=22;
	public static final int RB=23;
	public static final int RP=24;
	public static final int SC=25;
	public static final int STATIC=26;
	public static final int STRING=27;
	public static final int UNICODE_ESC=28;
	public static final int VOID=29;
	public static final int WS=30;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public MySecondLexer() {} 
	public MySecondLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public MySecondLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\MySecondLexer.g"; }

	// $ANTLR start "EQ"
	public final void mEQ() throws RecognitionException {
		try {
			int _type = EQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\MySecondLexer.g:10:4: ( '=' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\MySecondLexer.g:10:6: '='
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

	// $ANTLR start "NEQ"
	public final void mNEQ() throws RecognitionException {
		try {
			int _type = NEQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\MySecondLexer.g:11:5: ( '!=' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\MySecondLexer.g:11:7: '!='
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

	// $ANTLR start "SC"
	public final void mSC() throws RecognitionException {
		try {
			int _type = SC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\MySecondLexer.g:12:4: ( ';' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\MySecondLexer.g:12:6: ';'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\MySecondLexer.g:13:5: ( '.' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\MySecondLexer.g:13:7: '.'
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\MySecondLexer.g:14:7: ( ',' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\MySecondLexer.g:14:9: ','
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\MySecondLexer.g:15:4: ( '(' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\MySecondLexer.g:15:6: '('
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\MySecondLexer.g:16:4: ( ')' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\MySecondLexer.g:16:6: ')'
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

	// $ANTLR start "LB"
	public final void mLB() throws RecognitionException {
		try {
			int _type = LB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\MySecondLexer.g:17:4: ( '{' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\MySecondLexer.g:17:6: '{'
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
	// $ANTLR end "LB"

	// $ANTLR start "RB"
	public final void mRB() throws RecognitionException {
		try {
			int _type = RB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\MySecondLexer.g:18:4: ( '}' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\MySecondLexer.g:18:6: '}'
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
	// $ANTLR end "RB"

	// $ANTLR start "CLASS"
	public final void mCLASS() throws RecognitionException {
		try {
			int _type = CLASS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\MySecondLexer.g:21:7: ( 'class' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\MySecondLexer.g:21:9: 'class'
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

	// $ANTLR start "IMPORT"
	public final void mIMPORT() throws RecognitionException {
		try {
			int _type = IMPORT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\MySecondLexer.g:22:8: ( 'import' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\MySecondLexer.g:22:9: 'import'
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

	// $ANTLR start "PUBLIC"
	public final void mPUBLIC() throws RecognitionException {
		try {
			int _type = PUBLIC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\MySecondLexer.g:23:8: ( 'public' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\MySecondLexer.g:23:10: 'public'
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

	// $ANTLR start "STATIC"
	public final void mSTATIC() throws RecognitionException {
		try {
			int _type = STATIC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\MySecondLexer.g:24:7: ( 'static' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\MySecondLexer.g:24:9: 'static'
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

	// $ANTLR start "PACKAGE"
	public final void mPACKAGE() throws RecognitionException {
		try {
			int _type = PACKAGE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\MySecondLexer.g:25:9: ( 'package' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\MySecondLexer.g:25:11: 'package'
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

	// $ANTLR start "VOID"
	public final void mVOID() throws RecognitionException {
		try {
			int _type = VOID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\MySecondLexer.g:26:6: ( 'void' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\MySecondLexer.g:26:8: 'void'
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

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\MySecondLexer.g:28:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\MySecondLexer.g:28:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\MySecondLexer.g:28:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\MySecondLexer.g:
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\MySecondLexer.g:32:5: ( ( '0' .. '9' )+ )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\MySecondLexer.g:32:7: ( '0' .. '9' )+
			{
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\MySecondLexer.g:32:7: ( '0' .. '9' )+
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\MySecondLexer.g:
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\MySecondLexer.g:36:5: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT )
			int alt9=3;
			alt9 = dfa9.predict(input);
			switch (alt9) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\MySecondLexer.g:36:9: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )?
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\MySecondLexer.g:36:9: ( '0' .. '9' )+
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
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\MySecondLexer.g:
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\MySecondLexer.g:36:25: ( '0' .. '9' )*
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\MySecondLexer.g:
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

					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\MySecondLexer.g:36:37: ( EXPONENT )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0=='E'||LA5_0=='e') ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\MySecondLexer.g:36:37: EXPONENT
							{
							mEXPONENT(); 

							}
							break;

					}

					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\MySecondLexer.g:37:9: '.' ( '0' .. '9' )+ ( EXPONENT )?
					{
					match('.'); 
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\MySecondLexer.g:37:13: ( '0' .. '9' )+
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
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\MySecondLexer.g:
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

					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\MySecondLexer.g:37:25: ( EXPONENT )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0=='E'||LA7_0=='e') ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\MySecondLexer.g:37:25: EXPONENT
							{
							mEXPONENT(); 

							}
							break;

					}

					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\MySecondLexer.g:38:9: ( '0' .. '9' )+ EXPONENT
					{
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\MySecondLexer.g:38:9: ( '0' .. '9' )+
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
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\MySecondLexer.g:
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\MySecondLexer.g:42:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\MySecondLexer.g:42:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
					{
					match("//"); 

					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\MySecondLexer.g:42:14: (~ ( '\\n' | '\\r' ) )*
					loop10:
					while (true) {
						int alt10=2;
						int LA10_0 = input.LA(1);
						if ( ((LA10_0 >= '\u0000' && LA10_0 <= '\t')||(LA10_0 >= '\u000B' && LA10_0 <= '\f')||(LA10_0 >= '\u000E' && LA10_0 <= '\uFFFF')) ) {
							alt10=1;
						}

						switch (alt10) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\MySecondLexer.g:
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

					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\MySecondLexer.g:42:28: ( '\\r' )?
					int alt11=2;
					int LA11_0 = input.LA(1);
					if ( (LA11_0=='\r') ) {
						alt11=1;
					}
					switch (alt11) {
						case 1 :
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\MySecondLexer.g:42:28: '\\r'
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\MySecondLexer.g:43:9: '/*' ( options {greedy=false; } : . )* '*/'
					{
					match("/*"); 

					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\MySecondLexer.g:43:14: ( options {greedy=false; } : . )*
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
							// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\MySecondLexer.g:43:42: .
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\MySecondLexer.g:46:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\MySecondLexer.g:46:9: ( ' ' | '\\t' | '\\r' | '\\n' )
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\MySecondLexer.g:54:5: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\MySecondLexer.g:54:8: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
			{
			match('\"'); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\MySecondLexer.g:54:12: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\MySecondLexer.g:54:14: ESC_SEQ
					{
					mESC_SEQ(); 

					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\MySecondLexer.g:54:24: ~ ( '\\\\' | '\"' )
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\MySecondLexer.g:57:5: ( '\\'' ( ESC_SEQ |~ ( '\\'' | '\\\\' ) ) '\\'' )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\MySecondLexer.g:57:8: '\\'' ( ESC_SEQ |~ ( '\\'' | '\\\\' ) ) '\\''
			{
			match('\''); 
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\MySecondLexer.g:57:13: ( ESC_SEQ |~ ( '\\'' | '\\\\' ) )
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\MySecondLexer.g:57:15: ESC_SEQ
					{
					mESC_SEQ(); 

					}
					break;
				case 2 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\MySecondLexer.g:57:25: ~ ( '\\'' | '\\\\' )
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\MySecondLexer.g:61:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\MySecondLexer.g:61:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
			{
			if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\MySecondLexer.g:61:22: ( '+' | '-' )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0=='+'||LA16_0=='-') ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\MySecondLexer.g:
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

			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\MySecondLexer.g:61:33: ( '0' .. '9' )+
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\MySecondLexer.g:
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\MySecondLexer.g:64:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\MySecondLexer.g:
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\MySecondLexer.g:68:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\MySecondLexer.g:68:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\MySecondLexer.g:69:9: UNICODE_ESC
					{
					mUNICODE_ESC(); 

					}
					break;
				case 3 :
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\MySecondLexer.g:70:9: OCTAL_ESC
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\MySecondLexer.g:75:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\MySecondLexer.g:75:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\MySecondLexer.g:76:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
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
					// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\MySecondLexer.g:77:9: '\\\\' ( '0' .. '7' )
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
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\MySecondLexer.g:82:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
			// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\MySecondLexer.g:82:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
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

	@Override
	public void mTokens() throws RecognitionException {
		// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\MySecondLexer.g:1:8: ( EQ | NEQ | SC | DOT | COMMA | LP | RP | LB | RB | CLASS | IMPORT | PUBLIC | STATIC | PACKAGE | VOID | ID | INT | FLOAT | COMMENT | WS | STRING | CHAR )
		int alt20=22;
		alt20 = dfa20.predict(input);
		switch (alt20) {
			case 1 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\MySecondLexer.g:1:10: EQ
				{
				mEQ(); 

				}
				break;
			case 2 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\MySecondLexer.g:1:13: NEQ
				{
				mNEQ(); 

				}
				break;
			case 3 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\MySecondLexer.g:1:17: SC
				{
				mSC(); 

				}
				break;
			case 4 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\MySecondLexer.g:1:20: DOT
				{
				mDOT(); 

				}
				break;
			case 5 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\MySecondLexer.g:1:24: COMMA
				{
				mCOMMA(); 

				}
				break;
			case 6 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\MySecondLexer.g:1:30: LP
				{
				mLP(); 

				}
				break;
			case 7 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\MySecondLexer.g:1:33: RP
				{
				mRP(); 

				}
				break;
			case 8 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\MySecondLexer.g:1:36: LB
				{
				mLB(); 

				}
				break;
			case 9 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\MySecondLexer.g:1:39: RB
				{
				mRB(); 

				}
				break;
			case 10 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\MySecondLexer.g:1:42: CLASS
				{
				mCLASS(); 

				}
				break;
			case 11 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\MySecondLexer.g:1:48: IMPORT
				{
				mIMPORT(); 

				}
				break;
			case 12 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\MySecondLexer.g:1:55: PUBLIC
				{
				mPUBLIC(); 

				}
				break;
			case 13 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\MySecondLexer.g:1:62: STATIC
				{
				mSTATIC(); 

				}
				break;
			case 14 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\MySecondLexer.g:1:69: PACKAGE
				{
				mPACKAGE(); 

				}
				break;
			case 15 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\MySecondLexer.g:1:77: VOID
				{
				mVOID(); 

				}
				break;
			case 16 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\MySecondLexer.g:1:82: ID
				{
				mID(); 

				}
				break;
			case 17 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\MySecondLexer.g:1:85: INT
				{
				mINT(); 

				}
				break;
			case 18 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\MySecondLexer.g:1:89: FLOAT
				{
				mFLOAT(); 

				}
				break;
			case 19 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\MySecondLexer.g:1:95: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 20 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\MySecondLexer.g:1:103: WS
				{
				mWS(); 

				}
				break;
			case 21 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\MySecondLexer.g:1:106: STRING
				{
				mSTRING(); 

				}
				break;
			case 22 :
				// C:\\Users\\Unibg\\Documents\\Eclipse\\WS CorsoLC\\lcf2023\\src\\myCompilerPackage\\MySecondLexer.g:1:113: CHAR
				{
				mCHAR(); 

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
			return "35:1: FLOAT : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT );";
		}
	}

	static final String DFA20_eotS =
		"\4\uffff\1\25\5\uffff\5\17\1\uffff\1\35\6\uffff\6\17\1\uffff\13\17\1\57"+
		"\1\60\4\17\2\uffff\1\65\1\66\1\17\1\70\2\uffff\1\71\2\uffff";
	static final String DFA20_eofS =
		"\72\uffff";
	static final String DFA20_minS =
		"\1\11\3\uffff\1\60\5\uffff\1\154\1\155\1\141\1\164\1\157\1\uffff\1\56"+
		"\6\uffff\1\141\1\160\1\142\1\143\1\141\1\151\1\uffff\1\163\1\157\1\154"+
		"\1\153\1\164\1\144\1\163\1\162\1\151\1\141\1\151\2\60\1\164\1\143\1\147"+
		"\1\143\2\uffff\2\60\1\145\1\60\2\uffff\1\60\2\uffff";
	static final String DFA20_maxS =
		"\1\175\3\uffff\1\71\5\uffff\1\154\1\155\1\165\1\164\1\157\1\uffff\1\145"+
		"\6\uffff\1\141\1\160\1\142\1\143\1\141\1\151\1\uffff\1\163\1\157\1\154"+
		"\1\153\1\164\1\144\1\163\1\162\1\151\1\141\1\151\2\172\1\164\1\143\1\147"+
		"\1\143\2\uffff\2\172\1\145\1\172\2\uffff\1\172\2\uffff";
	static final String DFA20_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\uffff\1\5\1\6\1\7\1\10\1\11\5\uffff\1\20\1\uffff"+
		"\1\23\1\24\1\25\1\26\1\4\1\22\6\uffff\1\21\21\uffff\1\17\1\12\4\uffff"+
		"\1\13\1\14\1\uffff\1\15\1\16";
	static final String DFA20_specialS =
		"\72\uffff}>";
	static final String[] DFA20_transitionS = {
			"\2\22\2\uffff\1\22\22\uffff\1\22\1\2\1\23\4\uffff\1\24\1\6\1\7\2\uffff"+
			"\1\5\1\uffff\1\4\1\21\12\20\1\uffff\1\3\1\uffff\1\1\3\uffff\32\17\4\uffff"+
			"\1\17\1\uffff\2\17\1\12\5\17\1\13\6\17\1\14\2\17\1\15\2\17\1\16\4\17"+
			"\1\10\1\uffff\1\11",
			"",
			"",
			"",
			"\12\26",
			"",
			"",
			"",
			"",
			"",
			"\1\27",
			"\1\30",
			"\1\32\23\uffff\1\31",
			"\1\33",
			"\1\34",
			"",
			"\1\26\1\uffff\12\20\13\uffff\1\26\37\uffff\1\26",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\36",
			"\1\37",
			"\1\40",
			"\1\41",
			"\1\42",
			"\1\43",
			"",
			"\1\44",
			"\1\45",
			"\1\46",
			"\1\47",
			"\1\50",
			"\1\51",
			"\1\52",
			"\1\53",
			"\1\54",
			"\1\55",
			"\1\56",
			"\12\17\7\uffff\32\17\4\uffff\1\17\1\uffff\32\17",
			"\12\17\7\uffff\32\17\4\uffff\1\17\1\uffff\32\17",
			"\1\61",
			"\1\62",
			"\1\63",
			"\1\64",
			"",
			"",
			"\12\17\7\uffff\32\17\4\uffff\1\17\1\uffff\32\17",
			"\12\17\7\uffff\32\17\4\uffff\1\17\1\uffff\32\17",
			"\1\67",
			"\12\17\7\uffff\32\17\4\uffff\1\17\1\uffff\32\17",
			"",
			"",
			"\12\17\7\uffff\32\17\4\uffff\1\17\1\uffff\32\17",
			"",
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
			return "1:1: Tokens : ( EQ | NEQ | SC | DOT | COMMA | LP | RP | LB | RB | CLASS | IMPORT | PUBLIC | STATIC | PACKAGE | VOID | ID | INT | FLOAT | COMMENT | WS | STRING | CHAR );";
		}
	}

}
