// $ANTLR 3.5.1 /private/student/7/37/13008637/Documents/M1_GL/COMP/Expr.g 2014-10-10 15:52:32

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
	@Override public String getGrammarFileName() { return "/private/student/7/37/13008637/Documents/M1_GL/COMP/Expr.g"; }


	/** Map variable name to Integer object holding value */
	HashMap memory = new HashMap();



	// $ANTLR start "doc"
	// /private/student/7/37/13008637/Documents/M1_GL/COMP/Expr.g:12:1: doc : phrases ;
	public final void doc() throws RecognitionException {
		try {
			// /private/student/7/37/13008637/Documents/M1_GL/COMP/Expr.g:12:5: ( phrases )
			// /private/student/7/37/13008637/Documents/M1_GL/COMP/Expr.g:13:2: phrases
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
	// /private/student/7/37/13008637/Documents/M1_GL/COMP/Expr.g:15:1: phrases : ( phrase phrases |);
	public final void phrases() throws RecognitionException {
		try {
			// /private/student/7/37/13008637/Documents/M1_GL/COMP/Expr.g:15:9: ( phrase phrases |)
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
					// /private/student/7/37/13008637/Documents/M1_GL/COMP/Expr.g:16:2: phrase phrases
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
					// /private/student/7/37/13008637/Documents/M1_GL/COMP/Expr.g:16:19: 
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
	// /private/student/7/37/13008637/Documents/M1_GL/COMP/Expr.g:20:1: phrase : sujet verbesobjets[$sujet.name] '.' ;
	public final void phrase() throws RecognitionException {
		String sujet1 =null;

		try {
			// /private/student/7/37/13008637/Documents/M1_GL/COMP/Expr.g:20:9: ( sujet verbesobjets[$sujet.name] '.' )
			// /private/student/7/37/13008637/Documents/M1_GL/COMP/Expr.g:20:11: sujet verbesobjets[$sujet.name] '.'
			{
			pushFollow(FOLLOW_sujet_in_phrase54);
			sujet1=sujet();
			state._fsp--;

			pushFollow(FOLLOW_verbesobjets_in_phrase56);
			verbesobjets(sujet1);
			state._fsp--;

			match(input,8,FOLLOW_8_in_phrase59); 
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
	// /private/student/7/37/13008637/Documents/M1_GL/COMP/Expr.g:22:1: sujet returns [String name] : entite ;
	public final String sujet() throws RecognitionException {
		String name = null;


		String entite2 =null;

		try {
			// /private/student/7/37/13008637/Documents/M1_GL/COMP/Expr.g:22:28: ( entite )
			// /private/student/7/37/13008637/Documents/M1_GL/COMP/Expr.g:23:2: entite
			{
			pushFollow(FOLLOW_entite_in_sujet72);
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
	// /private/student/7/37/13008637/Documents/M1_GL/COMP/Expr.g:25:1: verbe returns [String name] : entite ;
	public final String verbe() throws RecognitionException {
		String name = null;


		String entite3 =null;

		try {
			// /private/student/7/37/13008637/Documents/M1_GL/COMP/Expr.g:25:28: ( entite )
			// /private/student/7/37/13008637/Documents/M1_GL/COMP/Expr.g:26:2: entite
			{
			pushFollow(FOLLOW_entite_in_verbe88);
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
	// /private/student/7/37/13008637/Documents/M1_GL/COMP/Expr.g:28:1: verbesobjets[String nomSujet] : verbe objets[nomSujet, $verbe.name] ( ';' verbesobjets[nomSujet] |) ;
	public final void verbesobjets(String nomSujet) throws RecognitionException {
		String verbe4 =null;

		try {
			// /private/student/7/37/13008637/Documents/M1_GL/COMP/Expr.g:29:2: ( verbe objets[nomSujet, $verbe.name] ( ';' verbesobjets[nomSujet] |) )
			// /private/student/7/37/13008637/Documents/M1_GL/COMP/Expr.g:30:2: verbe objets[nomSujet, $verbe.name] ( ';' verbesobjets[nomSujet] |)
			{
			pushFollow(FOLLOW_verbe_in_verbesobjets103);
			verbe4=verbe();
			state._fsp--;

			pushFollow(FOLLOW_objets_in_verbesobjets105);
			objets(nomSujet, verbe4);
			state._fsp--;

			// /private/student/7/37/13008637/Documents/M1_GL/COMP/Expr.g:30:38: ( ';' verbesobjets[nomSujet] |)
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
					// /private/student/7/37/13008637/Documents/M1_GL/COMP/Expr.g:30:39: ';' verbesobjets[nomSujet]
					{
					match(input,9,FOLLOW_9_in_verbesobjets109); 
					pushFollow(FOLLOW_verbesobjets_in_verbesobjets110);
					verbesobjets(nomSujet);
					state._fsp--;

					}
					break;
				case 2 :
					// /private/student/7/37/13008637/Documents/M1_GL/COMP/Expr.g:30:67: 
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



	// $ANTLR start "objets"
	// /private/student/7/37/13008637/Documents/M1_GL/COMP/Expr.g:32:1: objets[String nomSujet, String nomVerbe] : ( objet[nomSujet, nomVerbe] ',' objets[nomSujet, nomVerbe] | objet[nomSujet, nomVerbe] );
	public final void objets(String nomSujet, String nomVerbe) throws RecognitionException {
		try {
			// /private/student/7/37/13008637/Documents/M1_GL/COMP/Expr.g:32:41: ( objet[nomSujet, nomVerbe] ',' objets[nomSujet, nomVerbe] | objet[nomSujet, nomVerbe] )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==10) ) {
				int LA3_1 = input.LA(2);
				if ( (LA3_1==ID) ) {
					int LA3_3 = input.LA(3);
					if ( (LA3_3==11) ) {
						int LA3_5 = input.LA(4);
						if ( (LA3_5==7) ) {
							alt3=1;
						}
						else if ( ((LA3_5 >= 8 && LA3_5 <= 9)) ) {
							alt3=2;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 3, 5, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 3, 3, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 3, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA3_0==6) ) {
				int LA3_2 = input.LA(2);
				if ( (LA3_2==ID) ) {
					int LA3_4 = input.LA(3);
					if ( (LA3_4==6) ) {
						int LA3_6 = input.LA(4);
						if ( (LA3_6==7) ) {
							alt3=1;
						}
						else if ( ((LA3_6 >= 8 && LA3_6 <= 9)) ) {
							alt3=2;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 3, 6, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 3, 4, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 3, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// /private/student/7/37/13008637/Documents/M1_GL/COMP/Expr.g:33:2: objet[nomSujet, nomVerbe] ',' objets[nomSujet, nomVerbe]
					{
					pushFollow(FOLLOW_objet_in_objets125);
					objet(nomSujet, nomVerbe);
					state._fsp--;

					match(input,7,FOLLOW_7_in_objets127); 
					pushFollow(FOLLOW_objets_in_objets128);
					objets(nomSujet, nomVerbe);
					state._fsp--;

					}
					break;
				case 2 :
					// /private/student/7/37/13008637/Documents/M1_GL/COMP/Expr.g:34:4: objet[nomSujet, nomVerbe]
					{
					pushFollow(FOLLOW_objet_in_objets135);
					objet(nomSujet, nomVerbe);
					state._fsp--;

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
	// $ANTLR end "objets"



	// $ANTLR start "objet"
	// /private/student/7/37/13008637/Documents/M1_GL/COMP/Expr.g:36:1: objet[String nomSujet, String nomVerbe] : ( entite | text );
	public final void objet(String nomSujet, String nomVerbe) throws RecognitionException {
		String entite5 =null;
		String text6 =null;

		try {
			// /private/student/7/37/13008637/Documents/M1_GL/COMP/Expr.g:36:41: ( entite | text )
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
					// /private/student/7/37/13008637/Documents/M1_GL/COMP/Expr.g:37:2: entite
					{
					pushFollow(FOLLOW_entite_in_objet148);
					entite5=entite();
					state._fsp--;

					System.out.println(nomSujet + " " + nomVerbe + " " + entite5 + " .");
					}
					break;
				case 2 :
					// /private/student/7/37/13008637/Documents/M1_GL/COMP/Expr.g:37:86: text
					{
					pushFollow(FOLLOW_text_in_objet152);
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
	// /private/student/7/37/13008637/Documents/M1_GL/COMP/Expr.g:40:1: entite returns [String name] : '<' ID '>' ;
	public final String entite() throws RecognitionException {
		String name = null;


		Token ID7=null;

		try {
			// /private/student/7/37/13008637/Documents/M1_GL/COMP/Expr.g:41:2: ( '<' ID '>' )
			// /private/student/7/37/13008637/Documents/M1_GL/COMP/Expr.g:41:3: '<' ID '>'
			{
			match(input,10,FOLLOW_10_in_entite169); 
			ID7=(Token)match(input,ID,FOLLOW_ID_in_entite170); 
			match(input,11,FOLLOW_11_in_entite171); 
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
	// /private/student/7/37/13008637/Documents/M1_GL/COMP/Expr.g:44:1: text returns [String name] : '\"' ID '\"' ;
	public final String text() throws RecognitionException {
		String name = null;


		Token ID8=null;

		try {
			// /private/student/7/37/13008637/Documents/M1_GL/COMP/Expr.g:45:6: ( '\"' ID '\"' )
			// /private/student/7/37/13008637/Documents/M1_GL/COMP/Expr.g:45:7: '\"' ID '\"'
			{
			match(input,6,FOLLOW_6_in_text193); 
			ID8=(Token)match(input,ID,FOLLOW_ID_in_text194); 
			match(input,6,FOLLOW_6_in_text195); 
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
	public static final BitSet FOLLOW_sujet_in_phrase54 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_verbesobjets_in_phrase56 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_8_in_phrase59 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_entite_in_sujet72 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_entite_in_verbe88 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_verbe_in_verbesobjets103 = new BitSet(new long[]{0x0000000000000440L});
	public static final BitSet FOLLOW_objets_in_verbesobjets105 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_9_in_verbesobjets109 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_verbesobjets_in_verbesobjets110 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_objet_in_objets125 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_7_in_objets127 = new BitSet(new long[]{0x0000000000000440L});
	public static final BitSet FOLLOW_objets_in_objets128 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_objet_in_objets135 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_entite_in_objet148 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_text_in_objet152 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_10_in_entite169 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ID_in_entite170 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_entite171 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_6_in_text193 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ID_in_text194 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_6_in_text195 = new BitSet(new long[]{0x0000000000000002L});
}
