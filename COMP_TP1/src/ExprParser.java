// $ANTLR 3.5.1 /home/matthias/ISTIC/COMP/tp1/v1/Expr.g 2014-10-12 18:42:59

import java.util.HashMap;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class ExprParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "WS", "'\"'", "','", "'.'", 
		"';'", "'<'", "'>'"
	};
	public static final int EOF=-1;
	public static final int T__6=6;
	public static final int T__7=7;
	public static final int T__8=8;
	public static final int T__9=9;
	public static final int T__10=10;
	public static final int T__11=11;
	public static final int ID=4;
	public static final int WS=5;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public ExprParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public ExprParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return ExprParser.tokenNames; }
	@Override public String getGrammarFileName() { return "/home/matthias/ISTIC/COMP/tp1/v1/Expr.g"; }


	/** Map variable name to Integer object holding value */
	HashMap memory = new HashMap();



	// $ANTLR start "doc"
	// /home/matthias/ISTIC/COMP/tp1/v1/Expr.g:12:1: doc : phrases ;
	public final void doc() throws RecognitionException {
		try {
			// /home/matthias/ISTIC/COMP/tp1/v1/Expr.g:12:5: ( phrases )
			// /home/matthias/ISTIC/COMP/tp1/v1/Expr.g:13:2: phrases
			{
			pushFollow(FOLLOW_phrases_in_doc24);
			phrases();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "doc"



	// $ANTLR start "phrases"
	// /home/matthias/ISTIC/COMP/tp1/v1/Expr.g:15:1: phrases : ( phrase phrases |);
	public final void phrases() throws RecognitionException {
		try {
			// /home/matthias/ISTIC/COMP/tp1/v1/Expr.g:15:9: ( phrase phrases |)
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==10) ) {
				alt1=1;
			}
			else if ( (LA1_0==EOF) ) {
				alt1=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// /home/matthias/ISTIC/COMP/tp1/v1/Expr.g:16:2: phrase phrases
					{
					pushFollow(FOLLOW_phrase_in_phrases35);
					phrase();
					state._fsp--;

					pushFollow(FOLLOW_phrases_in_phrases37);
					phrases();
					state._fsp--;

					}
					break;
				case 2 :
					// /home/matthias/ISTIC/COMP/tp1/v1/Expr.g:16:19: 
					{
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "phrases"



	// $ANTLR start "phrase"
	// /home/matthias/ISTIC/COMP/tp1/v1/Expr.g:18:1: phrase : sujet verbesobjets[$sujet.name] '.' ;
	public final void phrase() throws RecognitionException {
		String sujet1 =null;

		try {
			// /home/matthias/ISTIC/COMP/tp1/v1/Expr.g:18:9: ( sujet verbesobjets[$sujet.name] '.' )
			// /home/matthias/ISTIC/COMP/tp1/v1/Expr.g:18:11: sujet verbesobjets[$sujet.name] '.'
			{
			pushFollow(FOLLOW_sujet_in_phrase49);
			sujet1=sujet();
			state._fsp--;

			pushFollow(FOLLOW_verbesobjets_in_phrase51);
			verbesobjets(sujet1);
			state._fsp--;

			match(input,8,FOLLOW_8_in_phrase54); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "phrase"



	// $ANTLR start "sujet"
	// /home/matthias/ISTIC/COMP/tp1/v1/Expr.g:20:1: sujet returns [String name] : entite ;
	public final String sujet() throws RecognitionException {
		String name = null;


		String entite2 =null;

		try {
			// /home/matthias/ISTIC/COMP/tp1/v1/Expr.g:20:28: ( entite )
			// /home/matthias/ISTIC/COMP/tp1/v1/Expr.g:21:2: entite
			{
			pushFollow(FOLLOW_entite_in_sujet67);
			entite2=entite();
			state._fsp--;

			name = entite2;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return name;
	}
	// $ANTLR end "sujet"



	// $ANTLR start "verbe"
	// /home/matthias/ISTIC/COMP/tp1/v1/Expr.g:23:1: verbe returns [String name] : entite ;
	public final String verbe() throws RecognitionException {
		String name = null;


		String entite3 =null;

		try {
			// /home/matthias/ISTIC/COMP/tp1/v1/Expr.g:23:28: ( entite )
			// /home/matthias/ISTIC/COMP/tp1/v1/Expr.g:24:2: entite
			{
			pushFollow(FOLLOW_entite_in_verbe83);
			entite3=entite();
			state._fsp--;

			name = entite3;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return name;
	}
	// $ANTLR end "verbe"



	// $ANTLR start "verbesobjets"
	// /home/matthias/ISTIC/COMP/tp1/v1/Expr.g:26:1: verbesobjets[String nomSujet] : verbeobjets[nomSujet] ( ';' verbesobjets[nomSujet] |) ;
	public final void verbesobjets(String nomSujet) throws RecognitionException {
		try {
			// /home/matthias/ISTIC/COMP/tp1/v1/Expr.g:27:2: ( verbeobjets[nomSujet] ( ';' verbesobjets[nomSujet] |) )
			// /home/matthias/ISTIC/COMP/tp1/v1/Expr.g:28:2: verbeobjets[nomSujet] ( ';' verbesobjets[nomSujet] |)
			{
			pushFollow(FOLLOW_verbeobjets_in_verbesobjets98);
			verbeobjets(nomSujet);
			state._fsp--;

			// /home/matthias/ISTIC/COMP/tp1/v1/Expr.g:28:24: ( ';' verbesobjets[nomSujet] |)
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==9) ) {
				alt2=1;
			}
			else if ( (LA2_0==8) ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// /home/matthias/ISTIC/COMP/tp1/v1/Expr.g:28:25: ';' verbesobjets[nomSujet]
					{
					match(input,9,FOLLOW_9_in_verbesobjets102); 
					pushFollow(FOLLOW_verbesobjets_in_verbesobjets103);
					verbesobjets(nomSujet);
					state._fsp--;

					}
					break;
				case 2 :
					// /home/matthias/ISTIC/COMP/tp1/v1/Expr.g:28:53: 
					{
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "verbesobjets"



	// $ANTLR start "verbeobjets"
	// /home/matthias/ISTIC/COMP/tp1/v1/Expr.g:30:1: verbeobjets[String nomSujet] : verbe objets[nomSujet, $verbe.name] ;
	public final void verbeobjets(String nomSujet) throws RecognitionException {
		String verbe4 =null;

		try {
			// /home/matthias/ISTIC/COMP/tp1/v1/Expr.g:31:2: ( verbe objets[nomSujet, $verbe.name] )
			// /home/matthias/ISTIC/COMP/tp1/v1/Expr.g:32:2: verbe objets[nomSujet, $verbe.name]
			{
			pushFollow(FOLLOW_verbe_in_verbeobjets119);
			verbe4=verbe();
			state._fsp--;

			pushFollow(FOLLOW_objets_in_verbeobjets121);
			objets(nomSujet, verbe4);
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "verbeobjets"



	// $ANTLR start "objets"
	// /home/matthias/ISTIC/COMP/tp1/v1/Expr.g:34:1: objets[String nomSujet, String nomVerbe] : objet[nomSujet, nomVerbe] ( ',' objets[nomSujet, nomVerbe] |) ;
	public final void objets(String nomSujet, String nomVerbe) throws RecognitionException {
		try {
			// /home/matthias/ISTIC/COMP/tp1/v1/Expr.g:34:41: ( objet[nomSujet, nomVerbe] ( ',' objets[nomSujet, nomVerbe] |) )
			// /home/matthias/ISTIC/COMP/tp1/v1/Expr.g:35:2: objet[nomSujet, nomVerbe] ( ',' objets[nomSujet, nomVerbe] |)
			{
			pushFollow(FOLLOW_objet_in_objets132);
			objet(nomSujet, nomVerbe);
			state._fsp--;

			// /home/matthias/ISTIC/COMP/tp1/v1/Expr.g:35:27: ( ',' objets[nomSujet, nomVerbe] |)
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==7) ) {
				alt3=1;
			}
			else if ( ((LA3_0 >= 8 && LA3_0 <= 9)) ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// /home/matthias/ISTIC/COMP/tp1/v1/Expr.g:35:28: ',' objets[nomSujet, nomVerbe]
					{
					match(input,7,FOLLOW_7_in_objets135); 
					pushFollow(FOLLOW_objets_in_objets136);
					objets(nomSujet, nomVerbe);
					state._fsp--;

					}
					break;
				case 2 :
					// /home/matthias/ISTIC/COMP/tp1/v1/Expr.g:35:60: 
					{
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "objets"



	// $ANTLR start "objet"
	// /home/matthias/ISTIC/COMP/tp1/v1/Expr.g:37:1: objet[String nomSujet, String nomVerbe] : ( entite | text );
	public final void objet(String nomSujet, String nomVerbe) throws RecognitionException {
		String entite5 =null;
		String text6 =null;

		try {
			// /home/matthias/ISTIC/COMP/tp1/v1/Expr.g:37:41: ( entite | text )
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==10) ) {
				alt4=1;
			}
			else if ( (LA4_0==6) ) {
				alt4=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// /home/matthias/ISTIC/COMP/tp1/v1/Expr.g:38:2: entite
					{
					pushFollow(FOLLOW_entite_in_objet153);
					entite5=entite();
					state._fsp--;

					System.out.println(nomSujet + " " + nomVerbe + " " + entite5 + " .");
					}
					break;
				case 2 :
					// /home/matthias/ISTIC/COMP/tp1/v1/Expr.g:38:86: text
					{
					pushFollow(FOLLOW_text_in_objet157);
					text6=text();
					state._fsp--;

					System.out.println(nomSujet + " " + nomVerbe + " " + text6 + " .");
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "objet"



	// $ANTLR start "entite"
	// /home/matthias/ISTIC/COMP/tp1/v1/Expr.g:41:1: entite returns [String name] : '<' ID '>' ;
	public final String entite() throws RecognitionException {
		String name = null;


		Token ID7=null;

		try {
			// /home/matthias/ISTIC/COMP/tp1/v1/Expr.g:42:2: ( '<' ID '>' )
			// /home/matthias/ISTIC/COMP/tp1/v1/Expr.g:42:3: '<' ID '>'
			{
			match(input,10,FOLLOW_10_in_entite174); 
			ID7=(Token)match(input,ID,FOLLOW_ID_in_entite175); 
			match(input,11,FOLLOW_11_in_entite176); 
			name = '<' + (ID7!=null?ID7.getText():null) + '>';
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return name;
	}
	// $ANTLR end "entite"



	// $ANTLR start "text"
	// /home/matthias/ISTIC/COMP/tp1/v1/Expr.g:45:1: text returns [String name] : '\"' ID '\"' ;
	public final String text() throws RecognitionException {
		String name = null;


		Token ID8=null;

		try {
			// /home/matthias/ISTIC/COMP/tp1/v1/Expr.g:46:6: ( '\"' ID '\"' )
			// /home/matthias/ISTIC/COMP/tp1/v1/Expr.g:46:7: '\"' ID '\"'
			{
			match(input,6,FOLLOW_6_in_text198); 
			ID8=(Token)match(input,ID,FOLLOW_ID_in_text199); 
			match(input,6,FOLLOW_6_in_text200); 
			name = '"' + (ID8!=null?ID8.getText():null) + '"';
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return name;
	}
	// $ANTLR end "text"

	// Delegated rules



	public static final BitSet FOLLOW_phrases_in_doc24 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_phrase_in_phrases35 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_phrases_in_phrases37 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sujet_in_phrase49 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_verbesobjets_in_phrase51 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_8_in_phrase54 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_entite_in_sujet67 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_entite_in_verbe83 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_verbeobjets_in_verbesobjets98 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_9_in_verbesobjets102 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_verbesobjets_in_verbesobjets103 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_verbe_in_verbeobjets119 = new BitSet(new long[]{0x0000000000000440L});
	public static final BitSet FOLLOW_objets_in_verbeobjets121 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_objet_in_objets132 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_7_in_objets135 = new BitSet(new long[]{0x0000000000000440L});
	public static final BitSet FOLLOW_objets_in_objets136 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_entite_in_objet153 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_text_in_objet157 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_10_in_entite174 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ID_in_entite175 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_entite176 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_6_in_text198 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ID_in_text199 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_6_in_text200 = new BitSet(new long[]{0x0000000000000002L});
}
