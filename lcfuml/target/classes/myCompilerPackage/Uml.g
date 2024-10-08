grammar Uml;

options {
  language = Java;
  k = 2;		
}

@header{
	package myCompilerPackage; 		
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

classDefinitionRule
	:	
		a=ABSTRACT?
		CLASS
		c=ID  			{ h.manageClassName ($c); }
		classCodeRule		{ h.setClass($c); }
	;
	
relationsDefinitionRule
	:
		RELATIONS
		DP
		LBR
		relationCodeRule*
		RBR
		
	;

classCodeRule
	:
		LBR
		(	
			( ATTRIBUTE DP attributeDeclarationRule )
		|	
			(OPERATION DP operationDeclarationRule )
		)*
		RBR
	;	
	
relationCodeRule
	:
		nameRelation=ID
		
		nameClass1=ID
		mClass1=multiplicityRule
		relationTypeRule
		nameClass2=ID
		mClass2=multiplicityRule
		(
			UNDREL
			infoClass=ID
		)?
		
	;	

// controlla se DEFAULT e' presente allora in base alla TypeRule scegli il valore di default da adsegnare
attributeDeclarationRule
	:
		v=visibilityRule 	 				
		aType=arrayTypeRule?
		t=typeRule
		a=ID									
		d=ID?								
		multiplicityRule?						        
		READONLY?
		SC									{ h.attDeclaration (v, aType, t, $a, $d); }
	;	

visibilityRule returns [String visibility] 
	:
		( t=PUBLIC
		| t=PROTECTED
		| t=PRIVATE
		| t=PACKAGE
		)									{ visibility = $t.getText(); }
		
	;	
	
	
arrayTypeRule returns [String arrayType] 
	:
		( t=SET
		| t=MULTISET
		| t=LIST
		| t=ORDEREDSET
		)									{ arrayType = $t.getText(); }
		
	;	
	
typeRule returns [String type] 
	:
		( t=INT_TYPE
		| t=FLOAT_TYPE
		| t=LONG_TYPE
		| t=DOUBLE_TYPE
		| t=BOOLEAN_TYPE
		| t=CHAR_TYPE
		| t=STRING_TYPE  
		| t=ID
		)									{ type = $t.getText(); }
		
	;	

relationTypeRule returns [String type] 
	:
		( UNDREL | SXREL | DXREL )
		|
		( INHERITS )
		|
		( SHARED | COMPOSED )
	;	
	
multiplicityRule
	:
		(
		(MIN n=ID)
		(MAX m=ID)
		)								
	;	
	
operationDeclarationRule 
	:
		v=visibilityRule
		t=typeRule
		a=ID
		LP
		(
			pType=typeRule
			pID=ID
		)*
		RP
	;
		
/* ***********************************************
			Tokens defintion part starts here
************************************************** */ 
EQ : '=';
COMP : '==';
NEQ : '!=';
SXREL : '<';
DXREL : '>';
LTE : '<=';
GTE : '>=';
MOD : '%';
ADD : '+';
UNDREL : '-';
MUL : '*';
DIV : '/';
AADD : '++';
SSUB : '--';

DP : ':';
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
BOOLEAN_TYPE	:	'boolean';
BYTE	:	'byte';
CHAR_TYPE	:	'char';
CLASS	:	'class';
CONST	:	'const';
DOUBLE_TYPE	:	'double';
ENUM	:	'enum';
EXTENDS	:	'extends';
FALSE	:	'false';
FINAL	:	'final';
FLOAT_TYPE	:	'float';
IMPLEMENTS	:	'implements';
INHERITS	:	'inherits';
INT_TYPE	:	'int';		
INTERFACE	:	'interface';	
LONG_TYPE	:	'long';
NONUNIQUE	:	 'non-unique'; 
NULL : 'null';
ORDER	:	 'ordered'; 
PRIVATE	:	'private';
PROTECTED	:	'protected';
PUBLIC	:	'public';
PACKAGE	:	'package';
READONLY:	'readOnly';
SET 	:	 'Set';
MULTISET 	:	 'Multi-set';
ORDEREDSET 	:	 'Ordered-set';
LIST	:	'List';
SHORT	:	'short';
STATIC	:	'static';
THROWS	:	'throws';
STRING_TYPE	:	'String';	
TRUE : 'true';
UNIQUE	:	 'unique'; 
UNORDERED :	'unordered' ;
VOID	:	'void';
SHARED	:	'shared';
COMPOSED	:	'composed';
ATTRIBUTE :	'attribute';
RELATIONS	:	'relations';
OPERATION	:	'operation';
MIN 	:	'min';
MAX 	:	'max';

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
    	:	   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7')
    ;

fragment
UNICODE_ESC
    :   '\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
    ;
    
ERROR_TOKEN
	:	.
	;