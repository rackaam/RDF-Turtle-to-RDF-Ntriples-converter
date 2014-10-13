grammar ExprAST;


options {
    output=AST;
    ASTLabelType=CommonTree; // type of $stat.tree ref etc...
}

tokens { 
  Doc;
  S; 
  P; 
  O; 
} 

@header {
import java.util.HashMap;
}

@members {
/** Map variable name to Integer object holding value */
HashMap memory = new HashMap();
}


doc	:
	phrases -> ^(Doc phrases);
	
phrases	:	
	phrase phrases | ;
	
	
	
phrase 	: sujet verbesobjets '.' -> ^(S sujet (verbesobjets)+)
	;

sujet:	
	entite ;
	
verbe	:	
	entite;
	
verbesobjets
	:	
	verbeobjets (';'!verbesobjets | );

verbeobjets
	:
	verbe objets -> ^(P verbe objets);

objets:	
	objet','!objets 
	| objet;
	
objet:	
	entite  -> ^(O entite)
	|text  -> ^(O text)
	;
	
entite
	:'<'ID'>'
	; 
	
text
    	:'"'ID'"'
    	;

WS  :   (' '|'\t' | '\n' | '\r')+ {skip();} ;
ID  :   ('a'..'z'|'A'..'Z'|'0'..'9' | '-' | '_' | '&' | ' ')+ ;
