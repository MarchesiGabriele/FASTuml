grammar Uml;

@header {
    package compiler_package;
}

@members {
    SemanticHandler h = new SemanticHandler();

    public SemanticHandler getHandler() {
        return h;
    }
}

/* ***********************************************
            Syntactic Rule definition starts here
************************************************** */ 

start
    : classDefinitionRule* enumDefinitionRule*? relationsDefinitionRule?
    ;

classDefinitionRule
    : ABSTRACT? CLASS c=ID { h.manageClassName($c); h.setClass($c); }
      classCodeRule
    ;

enumDefinitionRule
    : ENUM n=ID enumCodeRule { h.manageEnum($n); h.setEnum($n); }
    ;

relationsDefinitionRule
    : RELATIONS LBR (relationCodeRule | inheritCodeRule)* { h.relationsCoherent(); } RBR
    ;

classCodeRule
    : LBR ( 
    		(CONSTRUCTOR LBR constructorDeclarationRule* RBR)?
    		(ATTRIBUTE LBR attributeDeclarationRule* RBR)?
            (OPERATION LBR operationDeclarationRule* RBR)? ) RBR
    ;

enumCodeRule
    : LBR (eName+=ID SC)* RBR { h.enumDeclaration($eName); }
    ;

relationCodeRule
    : nameClass1=ID multiplicityRule relationTypeRule
      nameClass2=ID multiplicityRule SC
      { 
        h.relDeclaration($nameClass1, $relationTypeRule.text, $nameClass2);
      }
    ;
    
inheritCodeRule
    : nameClass1=ID INHERITS
      nameClass2=ID SC
      { 
        h.relDeclaration($nameClass1, $INHERITS.text, $nameClass2);
      }
    ;    

attributeDeclarationRule
    : v=visibilityRule ar=arrayTypeRule? t=typeRule a=ID (EQ  d=(STRING | INT | FLOAT))? READONLY? SC
      { h.attDeclaration($v.text, $ar.text != null ? $ar.text : null, $t.text, $a, $d != null ? $d : null); }
    ;

visibilityRule
    : ( PUBLIC | PROTECTED | PRIVATE | PACKAGE )
    ;

arrayTypeRule
    : ( SET | MULTISET | LIST | ORDEREDSET )
    ;

typeRule
    : ( INT_TYPE | FLOAT_TYPE | LONG_TYPE | DOUBLE_TYPE | BOOLEAN_TYPE | CHAR_TYPE | STRING_TYPE | VOID_TYPE | ID )
    ;

relationTypeRule
    : UNDREL | SXREL | DXREL | SHARED | COMPOSED
    ;

multiplicityRule
    : (n=INT COMMA m=(MUL|INT) { h.manageMultiplicity($n, $m);})
    ;

operationDeclarationRule
    : v=visibilityRule t=typeRule? a=ID LP (pType+=typeRule pName+=ID (COMMA pType+=typeRule pName+=ID)*)? RP SC
        {h.opDeclaration($v.text, $t.text != null ? $t.text : null, $a, $pType, $pName); 
        }
    ;
    
constructorDeclarationRule
    : LP (pType+=typeRule pName+=ID (COMMA pType+=typeRule pName+=ID)*)? RP SC
        { h.constrDeclaration($pType, $pName); }
    ;

    

/* ***********************************************
            Tokens definition part starts here
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

ABSTRACT : 'abstract';
BOOLEAN_TYPE : 'boolean';
BYTE : 'byte';
CHAR_TYPE : 'char';
CLASS : 'class';
CONSTRUCTOR: 'constructor';
CONST : 'const';
DOUBLE_TYPE : 'double';
ENUM : 'enum';
EXTENDS : 'extends';
FALSE : 'false';
FINAL : 'final';
FLOAT_TYPE : 'float';
IMPLEMENTS : 'implements';
INHERITS : 'inherits';
INT_TYPE : 'int';
INTERFACE : 'interface';
LONG_TYPE : 'long';
NONUNIQUE : 'non-unique';
NULL : 'null';
ORDER : 'ordered';
PRIVATE : 'private';
PROTECTED : 'protected';
PUBLIC : 'public';
PACKAGE : 'package';
READONLY : 'readOnly';
SET : 'Set';
MULTISET : 'Multi-set';
ORDEREDSET : 'Ordered-set';
LIST : 'List';
SHORT : 'short';
STATIC : 'static';
THROWS : 'throws';
STRING_TYPE : 'String';
TRUE : 'true';
UNIQUE : 'unique';
UNORDERED : 'unordered';
VOID_TYPE : 'void';
SHARED : 'shared';
COMPOSED : 'composed';
ATTRIBUTE : 'attribute';
RELATIONS : 'relations';
OPERATION : 'operation';
MIN : 'min';
MAX : 'max';

ID : [a-zA-Z_] [a-zA-Z0-9_]*;
INT : [0-9]+;
FLOAT : [0-9]+ '.' [0-9]* EXPONENT? | '.' [0-9]+ EXPONENT? | [0-9]+ EXPONENT;

COMMENT
    :   ( '//' ~[\r\n]* '\r'? '\n'
        | '/*' .*? '*/'
        ) -> channel(HIDDEN)
    ;
WS : [ \t\r\n]+ -> skip;

STRING : '"' ( ESC_SEQ | ~('\\'|'"') )* '"';
CHAR : '\'' ( ESC_SEQ | ~('\''|'\\') ) '\'';

fragment EXPONENT : [eE] [+-]? [0-9]+;
fragment HEX_DIGIT : [0-9a-fA-F];
fragment ESC_SEQ
    : '\\' [btnfr"'\\]
    | UNICODE_ESC
    | OCTAL_ESC
    ;

fragment OCTAL_ESC
    : '\\' [0-3] [0-7] [0-7]
    | '\\' [0-7] [0-7]?
    ;

fragment UNICODE_ESC
    : '\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
    ;

