grammar Expr;

@header {
import java.util.HashMap;
}

@members {
/** Map variable name to Integer object holding value */
HashMap memory = new HashMap();
}

doc	:	
	phrases;
	
phrases	:	
	phrase phrases | ;
	
	
	
phrase 	: sujet verbesobjets[$sujet.name] '.';

sujet	returns [String name]:	
	entite {$name = $entite.name;};
	
verbe	returns [String name]:	
	entite {$name = $entite.name;};
	
verbesobjets[String nomSujet]
	:	
	verbe objets[nomSujet, $verbe.name] (';'verbesobjets[nomSujet] | );

objets[String nomSujet, String nomVerbe]:	
	objet[nomSujet, nomVerbe]','objets[nomSujet, nomVerbe] 
	| objet[nomSujet, nomVerbe];
	
objet[String nomSujet, String nomVerbe]	:	
	entite {System.out.println(nomSujet + " " + nomVerbe + " " + $entite.name + " .");}|text {System.out.println(nomSujet + " " + nomVerbe + " " + $text.name + " .");}
	;
	
entite returns [String name]
	:'<'ID'>' {$name = '<' + $ID.text + '>';}
	; 
	
text returns [String name]
    	:'"'ID'"' {$name = '"' + $ID.text + '"';}
    	;

WS  :   (' '|'\t' | '\n' | '\r')+ {skip();} ;
ID  :   ('a'..'z'|'A'..'Z'|'0'..'9' | '-' | '_' | '&' | ' ')+ ;
