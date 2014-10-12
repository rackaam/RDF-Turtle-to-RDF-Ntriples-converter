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
	
	
	
phrase 	: sujet verbesobjets[$sujet.name] '.' -> ^(S sujet (verbesobjets)+)
	;

sujet	returns [String name]:	
	entite {$name = $entite.name;};
	
verbe	returns [String name]:	
	entite {$name = $entite.name;};
	
verbesobjets[String nomSujet]
	:	
	verbeobjets[nomSujet] (';'!verbesobjets[nomSujet] | );

verbeobjets[String nomSujet]
	:
	verbe objets[nomSujet, $verbe.name]-> ^(P verbe objets);

objets[String nomSujet, String nomVerbe]:	
	objet[nomSujet, nomVerbe]','!objets[nomSujet, nomVerbe] 
	| objet[nomSujet, nomVerbe];
	
objet[String nomSujet, String nomVerbe]	:	
	entite {System.out.println(nomSujet + " " + nomVerbe + " " + $entite.name + " .");} -> ^(O entite)
	|text {System.out.println(nomSujet + " " + nomVerbe + " " + $text.name + " .");} -> ^(O text)
	;
	
entite returns [String name]
	:'<'ID'>' {$name = '<' + $ID.text + '>';}
	; 
	
text returns [String name]
    	:'"'ID'"' {$name ='"' + $ID.text + '"';}
    	;

WS  :   (' '|'\t' | '\n' | '\r')+ {skip();} ;
ID  :   ('a'..'z'|'A'..'Z'|'0'..'9' | '-' | '_' | '&' | ' ')+ ;
