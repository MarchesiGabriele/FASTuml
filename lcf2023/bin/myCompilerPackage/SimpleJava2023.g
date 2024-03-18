grammar SimpleJava2023;

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
}

/* ***********************************************
			Syntactic Rule definition starts here
************************************************** */ 

// The 1st rule is the axiom
javaStart
	:
		packageRule? 
		// **** ESEMPIO 1
		( x=importRule {System.out.println ($x.s1.getText() +" \t " + $x.s2); } )*		
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

// esempio di passaggio di attributi sintetizzati
importRule returns [Token s1, String s2]
	:
		t1=IMPORT 						{ $s1 = $t1;}
		t2=ID 								{ $s2 = $t2.getText(); } 
			(DOT t2=ID 					{ $s2+= $t2.getText(); }	)* 
			(DOT MUL 						{ $s2+="*"; }							)?
		SC 
	;


classDefinitionRule
	:
		PUBLIC?
		CLASS
		ID
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
			(EQ exprRule)? 
			(COMMA v=ID 					{	h.varDeclaration (t, $v); }
				(EQ exprRule)? )* 
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
		VOID ID 
			LP
				( typeRule ID
					( COMMA typeRule ID)* 
				)?
			RP
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
		ID EQ exprRule SC
	;

// questa regola non entra in conflitto con assignementRule perché k=2
methodCallRule
	:
		ID LP 
			(exprRule
				(COMMA exprRule)* ) ? 
		RP SC
	;

// da realizzare
exprRule
	:
		(ADD | SUB)?
		termRule
		( (ADD | SUB) termRule )*
	;

termRule
	:
		factorRule 
		( (MUL | DIV) factorRule )*
	;
	
factorRule
	:
			INT
		| FLOAT
		| v=ID 						{ h.checkVarDeclaration ($v); }
		| LP exprRule RP
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
