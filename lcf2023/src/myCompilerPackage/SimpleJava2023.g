grammar SimpleJava2023;

/* ***********************************
*********** DA COMPLEATARE NELL'ANALIZZAORE SEMANTICO (SemanticHandler.java) ***********
Aggiungere l'analisi semantica per gestire scope differenti 
cioè una variabile dichiarata in un metodo può essere refenziata solo in quel metodo
mentre una variabile globale può essere  referenziata ovunque.
Inoltre a aggiungere i controli sui nomi dei metodi (gestendo le diverse segnature...)

Infine fare in modo che le liste degli errori e degli warning siano ordinate in base alle coordinate
(non è garantito che errori e warning vengano rilevati sequenzialmente 
(es: facciamo riferimento ad metodo dichiarato dopo. Come si fa il controllo? Quando lo gestisco?)

*********************************** */

options {
  language = Java;
  k = 2;		
}

@header{
	package myCompilerPackage; 		
	import myCompilerPackage.util.*;
}

@lexer::header{
	package myCompilerPackage; 	
}

@members{
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

}

/* ***********************************************
			Syntactic Rule definition starts here
************************************************** */ 

// The 1st rule is the axiom
javaStart
	:
		packageRule? 
		// l'azione semantica qui di seguito non ha alcuno scopo se non quello didattico
		( importRule )*		
		classDefinitionRule	
	;

packageRule
	:
		PACKAGE dotNameRule SC
	;

dotNameRule	
	:
		ID (DOT ID)*
	;

// esempio di passaggio di attributi sintetizzati - solo a scopo didattico
importRule 
	:
		IMPORT 						
		ID 								
			(DOT ID  )* 
			(DOT MUL )?
		SC 
	;


classDefinitionRule
	:
		p=PUBLIC?
		CLASS
		c=ID										{ h.manageClassName ($p, $c); }
		classCodeRule
	;
	

classCodeRule
	:
		LBR
		(	varDeclarationRule 
		|	methodDeclarationRule )*
		RBR
	;	


varDeclarationRule
	:
		t=typeRule v=ID	 				{	h.varDeclaration (t, $v); }
			(EQ e=exprRule {}			{	h.assignValue ($v, e); 		} )? 
			(COMMA v=ID 					{	h.varDeclaration (t, $v); }
				(EQ e=exprRule			{	h.assignValue ($v, e); 		} )? )* 
		SC
	;	


typeRule returns [String type] 
	:
		( t=INT_TYPE
		| t=FLOAT_TYPE
		| t=LONG_TYPE
		| t=DOUBLE_TYPE
		| t=BOOLEAN_TYPE
		| t=CHAR_TYPE
		| t=STRING_TYPE   // in questa versione di (simple) Java ipotizziamo che String sia predefinito
		)									{ type = $t.getText(); }
		
	;	


methodDeclarationRule
	:
		methodSignatureRule
		blockRule
	;

// in questa versione di (simple) java consideriamo solo metodi void
methodSignatureRule
	:
		VOID m=ID 
			LP
				( typeRule ID
					( COMMA typeRule ID)* 
				)?
			RP
		{ h.manageNewMethodDeclaration ($m); }	
	;

blockRule 
	:
		LBR
			instructionRule*
		RBR
	;

instructionRule
	:
			varDeclarationRule
		|	blockRule
		|	assignmentRule
		| methodCallRule
		| ifRule
		| whileRule
		| doWhileRule
		| forRule
		| autoInc
		| SC
	;

autoInc 
	:
		( ID (AADD | SSUB)
		| (AADD | SSUB) ID )
		SC
	;

assignmentRule
	:
		v=ID EQ e=exprRule SC { h.assignValue ($v, e); }
	;

// questa regola non entra in conflitto con assignementRule perché k=2
methodCallRule
	:
		m=ID LP 
			(exprRule
				(COMMA exprRule)* ) ? 
		RP SC
		{ h.checkMethodReference ($m); }
	;

// da realizzare
exprRule returns [Variable x]
	:
		(o=ADD | o=SUB)?
		t1=termRule											{ x = h.manageFirtTerm (t1, $o); }		// il segno davanti può esserci oppure no... e dobbiamo gestirlo
		( (o=ADD | o=SUB) t2=termRule   { x = h.doAdd (x, t2, $o);}				 )*
	;

termRule returns [Variable x]
	:
		f1=factorRule 										{ x = f1;}
		( (o=MUL | o=DIV) f2=factorRule   { x = h.doMul (x, f2, $o); } )*
	;
	
factorRule returns [Variable x]
@init{ x = new Variable ("0");}
	:
			i=INT							{ x = h.handleNumber($i); }
		| f=FLOAT						{ x = h.handleNumber($i); }
		| v=ID 							{ x = h.checkVarDeclaration ($v); }
		| LP e=exprRule RP  { x = e; }
		// da completare: per ora i casi successivi li ignoriamo, 
		// (o meglio li consideriamo come valori numerici che valgono 0....)
		| STRING
		| CHAR
		| TRUE
		| FALSE
		| NULL		
	;

whileRule
	:
		WHILE LP conditionRule RP
			instructionRule 
	;

conditionRule
	:
		exprRule compRule exprRule
	;
	
	
compRule
	:
			COMP 
		| NEQ
		| GT
		| LT
		| GTE
		| LTE
	;	


// da completare
ifRule
	:
		IF LP conditionRule RP
			instructionRule
		(ELSE 
			instructionRule)?	
	
	;

// da completare
doWhileRule
	:	
		DO
			instructionRule
		WHILE LP conditionRule RP 
		SC
	;

// da completare
forRule
	:
		FOR LP 
			typeRule? assignmentRule
			SC
			conditionRule
			SC
			( autoInc
			| assignmentRule )			
		RP
			instructionRule
	;

/* ***********************************************
			Tokens defintion part starts here
************************************************** */ 
EQ : '=';
COMP : '==';
NEQ : '!=';
LT : '<';
GT : '>';
LTE : '<=';
GTE : '>=';
MOD : '%';
ADD : '+';
SUB : '-';
MUL : '*';
DIV : '/';
AADD : '++';
SSUB : '--';

SC : ';';
DOT : '.';
COMMA : ',';
LP : '(';
RP : ')';
LBR : '{';
RBR : '}';
LB : '[';
RB : ']';



ABSTRACT	:	'abstract';
ASSERT	:	'assert';
BOOLEAN_TYPE	:	'boolean';
BREAK	:	'break';
BYTE	:	'byte';
CASE	:	'case';
CATCH	:	'catch';
CHAR_TYPE	:	'char';
CLASS	:	'class';
CONTINUE	:	'continue';
CONST	:	'const';
DEFAULT	:	'default';
DO	:	'do';
DOUBLE_TYPE	:	'double';
ELSE	:	'else';
ENUM	:	'enum';
EXPORTS	:	'exports';
EXTENDS	:	'extends';
FALSE	:	'false';
FINAL	:	'final';
FINALLY	:	'finally';
FLOAT_TYPE	:	'float';
FOR	:	'for';
GOTO	:	'goto';
IF	:	'if';
FI: 'fi';
IMPLEMENTS	:	'implements';
IMPORT	:	'import';
INSTANCEOF	:	'instanceof';
INT_TYPE	:	'int';
INTERFACE	:	'interface';
LONG_TYPE	:	'long';
MODULE	:	'module';
NATIVE	:	'native';
NEW	:	'new';
NULL : 'null';
PACKAGE	:	'package';
PRIVATE	:	'private';
PROTECTED	:	'protected';
PUBLIC	:	'public';
REQUIRES	:	'requires';
RETURN	:	'return';
SHORT	:	'short';
STATIC	:	'static';
STRICTFP	:	'strictfp';
STRING_TYPE	:	'String';				
SUPER	:	'super';
SWITCH	:	'switch';
SYNCHRONIZED	:	'synchronized';
THIS	:	'this';
THROW	:	'throw';
THROWS	:	'throws';
TRANSIENT	:	'transient';
TRUE : 'true';
TRY	:	'try';
VAR	:	'var';
VOID	:	'void';
VOLATILE	:	'volatile';
WHILE	:	'while';


ID  :	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
    ;


INT :	'0'..'9'+
    ;

FLOAT
    :   ('0'..'9')+ '.' ('0'..'9')* EXPONENT?
    |   '.' ('0'..'9')+ EXPONENT?
    |   ('0'..'9')+ EXPONENT
    ;

COMMENT
    :   '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    |   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ;

STRING
    :  '"' ( ESC_SEQ | ~('\\'|'"') )* '"'
    ;

CHAR:  '\'' ( ESC_SEQ | ~('\''|'\\') ) '\''
    ;

fragment
EXPONENT : ('e'|'E') ('+'|'-')? ('0'..'9')+ ;

fragment
HEX_DIGIT : ('0'..'9'|'a'..'f'|'A'..'F') ;

fragment
ESC_SEQ
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    |   UNICODE_ESC
    |   OCTAL_ESC
    ;

fragment
OCTAL_ESC
    :   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7')
    ;

fragment
UNICODE_ESC
    :   '\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
    ;


ERROR_TOKEN 
	: 
		. //  {	$channel = HIDDEN;	}
	;
