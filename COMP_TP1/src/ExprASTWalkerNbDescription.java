// $ANTLR 3.5.1 /home/matthias/ISTIC/COMP/tp1/v2/ExprASTWalkerNbDescription.g 2014-10-13 23:11:38

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class ExprASTWalkerNbDescription extends TreeParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "Doc", "ID", "O", "P", "S", "WS", 
		"'\"'", "','", "'.'", "';'", "'<'", "'>'"
	};
	public static final int EOF=-1;
	public static final int T__10=10;
	public static final int T__11=11;
	public static final int T__12=12;
	public static final int T__13=13;
	public static final int T__14=14;
	public static final int T__15=15;
	public static final int Doc=4;
	public static final int ID=5;
	public static final int O=6;
	public static final int P=7;
	public static final int S=8;
	public static final int WS=9;

	// delegates
	public TreeParser[] getDelegates() {
		return new TreeParser[] {};
	}

	// delegators


	public ExprASTWalkerNbDescription(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public ExprASTWalkerNbDescription(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return ExprASTWalkerNbDescription.tokenNames; }
	@Override public String getGrammarFileName() { return "/home/matthias/ISTIC/COMP/tp1/v2/ExprASTWalkerNbDescription.g"; }


	/** Map variable name to Integer object holding value */
	int descriptions = 0;



	// $ANTLR start "doc"
	// /home/matthias/ISTIC/COMP/tp1/v2/ExprASTWalkerNbDescription.g:13:1: doc : ^( Doc ( sujet )+ ) ;
	public final void doc() throws RecognitionException {
		try {
			// /home/matthias/ISTIC/COMP/tp1/v2/ExprASTWalkerNbDescription.g:13:5: ( ^( Doc ( sujet )+ ) )
			// /home/matthias/ISTIC/COMP/tp1/v2/ExprASTWalkerNbDescription.g:14:2: ^( Doc ( sujet )+ )
			{
			match(input,Doc,FOLLOW_Doc_in_doc44); 
			match(input, Token.DOWN, null); 
			// /home/matthias/ISTIC/COMP/tp1/v2/ExprASTWalkerNbDescription.g:14:8: ( sujet )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==S) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// /home/matthias/ISTIC/COMP/tp1/v2/ExprASTWalkerNbDescription.g:14:8: sujet
					{
					pushFollow(FOLLOW_sujet_in_doc46);
					sujet();
					state._fsp--;

					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			match(input, Token.UP, null); 

			System.out.println("Nb Descriptions = " + descriptions);
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



	// $ANTLR start "sujet"
	// /home/matthias/ISTIC/COMP/tp1/v2/ExprASTWalkerNbDescription.g:17:1: sujet : ^( S id ( pred[$id.name] )+ ) ;
	public final void sujet() throws RecognitionException {
		String id1 =null;

		try {
			// /home/matthias/ISTIC/COMP/tp1/v2/ExprASTWalkerNbDescription.g:17:7: ( ^( S id ( pred[$id.name] )+ ) )
			// /home/matthias/ISTIC/COMP/tp1/v2/ExprASTWalkerNbDescription.g:18:2: ^( S id ( pred[$id.name] )+ )
			{
			match(input,S,FOLLOW_S_in_sujet62); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_id_in_sujet64);
			id1=id();
			state._fsp--;

			// /home/matthias/ISTIC/COMP/tp1/v2/ExprASTWalkerNbDescription.g:18:9: ( pred[$id.name] )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==P) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// /home/matthias/ISTIC/COMP/tp1/v2/ExprASTWalkerNbDescription.g:18:9: pred[$id.name]
					{
					pushFollow(FOLLOW_pred_in_sujet66);
					pred(id1);
					state._fsp--;

					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			match(input, Token.UP, null); 

			descriptions++;
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
	// $ANTLR end "sujet"



	// $ANTLR start "pred"
	// /home/matthias/ISTIC/COMP/tp1/v2/ExprASTWalkerNbDescription.g:21:1: pred[String nomSujet] : ^( P id ( objet[nomSujet, $id.name] )+ ) ;
	public final void pred(String nomSujet) throws RecognitionException {
		String id2 =null;

		try {
			// /home/matthias/ISTIC/COMP/tp1/v2/ExprASTWalkerNbDescription.g:21:22: ( ^( P id ( objet[nomSujet, $id.name] )+ ) )
			// /home/matthias/ISTIC/COMP/tp1/v2/ExprASTWalkerNbDescription.g:22:2: ^( P id ( objet[nomSujet, $id.name] )+ )
			{
			match(input,P,FOLLOW_P_in_pred85); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_id_in_pred87);
			id2=id();
			state._fsp--;

			// /home/matthias/ISTIC/COMP/tp1/v2/ExprASTWalkerNbDescription.g:22:9: ( objet[nomSujet, $id.name] )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==O) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// /home/matthias/ISTIC/COMP/tp1/v2/ExprASTWalkerNbDescription.g:22:9: objet[nomSujet, $id.name]
					{
					pushFollow(FOLLOW_objet_in_pred89);
					objet(nomSujet, id2);
					state._fsp--;

					}
					break;

				default :
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
			}

			match(input, Token.UP, null); 

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
	// $ANTLR end "pred"



	// $ANTLR start "objet"
	// /home/matthias/ISTIC/COMP/tp1/v2/ExprASTWalkerNbDescription.g:25:1: objet[String nomSujet, String nomVerbe] : ^( O id ) ;
	public final void objet(String nomSujet, String nomVerbe) throws RecognitionException {
		try {
			// /home/matthias/ISTIC/COMP/tp1/v2/ExprASTWalkerNbDescription.g:25:41: ( ^( O id ) )
			// /home/matthias/ISTIC/COMP/tp1/v2/ExprASTWalkerNbDescription.g:26:2: ^( O id )
			{
			match(input,O,FOLLOW_O_in_objet106); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_id_in_objet108);
			id();
			state._fsp--;

			match(input, Token.UP, null); 

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



	// $ANTLR start "id"
	// /home/matthias/ISTIC/COMP/tp1/v2/ExprASTWalkerNbDescription.g:29:1: id returns [String name] : ( '<' ID '>' | '\"' ID '\"' );
	public final String id() throws RecognitionException {
		String name = null;


		CommonTree ID3=null;
		CommonTree ID4=null;

		try {
			// /home/matthias/ISTIC/COMP/tp1/v2/ExprASTWalkerNbDescription.g:29:26: ( '<' ID '>' | '\"' ID '\"' )
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==14) ) {
				alt4=1;
			}
			else if ( (LA4_0==10) ) {
				alt4=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// /home/matthias/ISTIC/COMP/tp1/v2/ExprASTWalkerNbDescription.g:30:2: '<' ID '>'
					{
					match(input,14,FOLLOW_14_in_id125); 
					ID3=(CommonTree)match(input,ID,FOLLOW_ID_in_id126); 
					match(input,15,FOLLOW_15_in_id127); 
					name = '<' + (ID3!=null?ID3.getText():null) + '>';
					}
					break;
				case 2 :
					// /home/matthias/ISTIC/COMP/tp1/v2/ExprASTWalkerNbDescription.g:31:4: '\"' ID '\"'
					{
					match(input,10,FOLLOW_10_in_id134); 
					ID4=(CommonTree)match(input,ID,FOLLOW_ID_in_id135); 
					match(input,10,FOLLOW_10_in_id136); 
					name = '"' + (ID4!=null?ID4.getText():null) + '"';
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
		return name;
	}
	// $ANTLR end "id"

	// Delegated rules



	public static final BitSet FOLLOW_Doc_in_doc44 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_sujet_in_doc46 = new BitSet(new long[]{0x0000000000000108L});
	public static final BitSet FOLLOW_S_in_sujet62 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_id_in_sujet64 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_pred_in_sujet66 = new BitSet(new long[]{0x0000000000000088L});
	public static final BitSet FOLLOW_P_in_pred85 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_id_in_pred87 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_objet_in_pred89 = new BitSet(new long[]{0x0000000000000048L});
	public static final BitSet FOLLOW_O_in_objet106 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_id_in_objet108 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_14_in_id125 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_id126 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_id127 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_10_in_id134 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_id135 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_id136 = new BitSet(new long[]{0x0000000000000002L});
}
