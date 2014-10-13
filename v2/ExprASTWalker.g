tree grammar ExprASTWalker;

options {
    tokenVocab=ExprAST;
    ASTLabelType=CommonTree;
}

@header {
import java.util.HashMap;
}

doc	:	
	^(Doc sujet+)
	;

sujet	:
	^(S id pred[$id.name]+)  
	;

pred[String nomSujet]:	
	^(P id objet[nomSujet, $id.name]+) 
	;

objet[String nomSujet, String nomVerbe]	:
	^(O id)	{System.out.println(nomSujet + " " + nomVerbe + " " + $id.name + " .");}
	;

id returns [String name]	:	
	'<'ID'>' {$name = '<' + $ID.text + '>';}
	| '"'ID'"' {$name = '"' + $ID.text + '"';}
	;
