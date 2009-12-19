lexer grammar InternalEdje;
@header {
package org.xtext.enlightenment.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.internal.Lexer;
}

T11 : '#include' ;
T12 : 'lua_script {' ;
T13 : '}' ;
T14 : 'collections {' ;
T15 : 'group {' ;
T16 : 'name:' ;
T17 : ';' ;
T18 : 'min:' ;
T19 : 'parts {' ;
T20 : 'programs {' ;
T21 : 'part {' ;
T22 : 'type:' ;
T23 : 'description {' ;
T24 : 'rel1 {' ;
T25 : 'rel2 {' ;
T26 : 'color:' ;
T27 : 'absolute:' ;
T28 : 'relative:' ;
T29 : 'offset:' ;
T30 : 'program {' ;
T31 : 'signal:' ;
T32 : 'source:' ;
T33 : 'action:' ;

// $ANTLR src "../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g" 3003
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g" 3005
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g" 3007
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g" 3009
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g" 3011
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g" 3013
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g" 3015
RULE_ANY_OTHER : .;


