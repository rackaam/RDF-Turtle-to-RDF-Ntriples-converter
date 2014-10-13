tree grammar ExprASTWalkerNbDescription;

options {
    tokenVocab=ExprAST;
    ASTLabelType=CommonTree;
}

@members {
/** Map variable name to Integer object holding value */
int descriptions = 0;
}

doc	:	
	^(Doc sujet+) {System.out.println("Nb Descriptions = " + descriptions);}
	;

sujet	:
	^(S id pred[$id.name]+)  {descriptions++;}
	;

pred[String nomSujet]:	
	^(P id objet[nomSujet, $id.name]+) 
	;

objet[String nomSujet, String nomVerbe]	:
	^(O id)
	;

id returns [String name]	:	
	'<'ID'>' {$name = '<' + $ID.text + '>';}
	| '"'ID'"' {$name = '"' + $ID.text + '"';}
	;
