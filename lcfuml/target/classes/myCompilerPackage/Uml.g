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
