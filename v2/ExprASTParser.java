// $ANTLR 3.5.1 /home/matthias/ISTIC/COMP/tp1/v2/ExprAST.g 2014-10-12 23:05:17

import java.util.HashMap;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class ExprASTParser extends Parser {
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public ExprASTParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public ExprASTParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return ExprASTParser.tokenNames; }
	@Override public String getGrammarFileName() { return "/home/matthias/ISTIC/COMP/tp1/v2/ExprAST.g"; }


	/** Map variable name to Integer object holding value */
	HashMap memory = new HashMap();


	public static class doc_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "doc"
	// /home/matthias/ISTIC/COMP/tp1/v2/ExprAST.g:27:1: doc : phrases -> ^( Doc phrases ) ;
	public final ExprASTParser.doc_return doc() throws RecognitionException {
		ExprASTParser.doc_return retval = new ExprASTParser.doc_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope phrases1 =null;

		RewriteRuleSubtreeStream stream_phrases=new RewriteRuleSubtreeStream(adaptor,"rule phrases");

		try {
			// /home/matthias/ISTIC/COMP/tp1/v2/ExprAST.g:27:5: ( phrases -> ^( Doc phrases ) )
			// /home/matthias/ISTIC/COMP/tp1/v2/ExprAST.g:28:2: phrases
			{
			pushFollow(FOLLOW_phrases_in_doc89);
			phrases1=phrases();
			state._fsp--;

			stream_phrases.add(phrases1.getTree());
			// AST REWRITE
			// elements: phrases
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 28:10: -> ^( Doc phrases )
			{
				// /home/matthias/ISTIC/COMP/tp1/v2/ExprAST.g:28:13: ^( Doc phrases )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(Doc, "Doc"), root_1);
				adaptor.addChild(root_1, stream_phrases.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "doc"


	public static class phrases_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "phrases"
	// /home/matthias/ISTIC/COMP/tp1/v2/ExprAST.g:30:1: phrases : ( phrase phrases |);
	public final ExprASTParser.phrases_return phrases() throws RecognitionException {
		ExprASTParser.phrases_return retval = new ExprASTParser.phrases_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope phrase2 =null;
		ParserRuleReturnScope phrases3 =null;


		try {
			// /home/matthias/ISTIC/COMP/tp1/v2/ExprAST.g:30:9: ( phrase phrases |)
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==14) ) {
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
					// /home/matthias/ISTIC/COMP/tp1/v2/ExprAST.g:31:2: phrase phrases
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_phrase_in_phrases108);
					phrase2=phrase();
					state._fsp--;

					adaptor.addChild(root_0, phrase2.getTree());

					pushFollow(FOLLOW_phrases_in_phrases110);
					phrases3=phrases();
					state._fsp--;

					adaptor.addChild(root_0, phrases3.getTree());

					}
					break;
				case 2 :
					// /home/matthias/ISTIC/COMP/tp1/v2/ExprAST.g:31:19: 
					{
					root_0 = (CommonTree)adaptor.nil();


					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "phrases"


	public static class phrase_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "phrase"
	// /home/matthias/ISTIC/COMP/tp1/v2/ExprAST.g:35:1: phrase : sujet verbesobjets '.' -> ^( S sujet ( verbesobjets )+ ) ;
	public final ExprASTParser.phrase_return phrase() throws RecognitionException {
		ExprASTParser.phrase_return retval = new ExprASTParser.phrase_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal6=null;
		ParserRuleReturnScope sujet4 =null;
		ParserRuleReturnScope verbesobjets5 =null;

		CommonTree char_literal6_tree=null;
		RewriteRuleTokenStream stream_12=new RewriteRuleTokenStream(adaptor,"token 12");
		RewriteRuleSubtreeStream stream_verbesobjets=new RewriteRuleSubtreeStream(adaptor,"rule verbesobjets");
		RewriteRuleSubtreeStream stream_sujet=new RewriteRuleSubtreeStream(adaptor,"rule sujet");

		try {
			// /home/matthias/ISTIC/COMP/tp1/v2/ExprAST.g:35:9: ( sujet verbesobjets '.' -> ^( S sujet ( verbesobjets )+ ) )
			// /home/matthias/ISTIC/COMP/tp1/v2/ExprAST.g:35:11: sujet verbesobjets '.'
			{
			pushFollow(FOLLOW_sujet_in_phrase127);
			sujet4=sujet();
			state._fsp--;

			stream_sujet.add(sujet4.getTree());
			pushFollow(FOLLOW_verbesobjets_in_phrase129);
			verbesobjets5=verbesobjets();
			state._fsp--;

			stream_verbesobjets.add(verbesobjets5.getTree());
			char_literal6=(Token)match(input,12,FOLLOW_12_in_phrase131);  
			stream_12.add(char_literal6);

			// AST REWRITE
			// elements: verbesobjets, sujet
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 35:34: -> ^( S sujet ( verbesobjets )+ )
			{
				// /home/matthias/ISTIC/COMP/tp1/v2/ExprAST.g:35:37: ^( S sujet ( verbesobjets )+ )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(S, "S"), root_1);
				adaptor.addChild(root_1, stream_sujet.nextTree());
				if ( !(stream_verbesobjets.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_verbesobjets.hasNext() ) {
					adaptor.addChild(root_1, stream_verbesobjets.nextTree());
				}
				stream_verbesobjets.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "phrase"


	public static class sujet_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "sujet"
	// /home/matthias/ISTIC/COMP/tp1/v2/ExprAST.g:38:1: sujet : entite ;
	public final ExprASTParser.sujet_return sujet() throws RecognitionException {
		ExprASTParser.sujet_return retval = new ExprASTParser.sujet_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope entite7 =null;


		try {
			// /home/matthias/ISTIC/COMP/tp1/v2/ExprAST.g:38:6: ( entite )
			// /home/matthias/ISTIC/COMP/tp1/v2/ExprAST.g:39:2: entite
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_entite_in_sujet155);
			entite7=entite();
			state._fsp--;

			adaptor.addChild(root_0, entite7.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "sujet"


	public static class verbe_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "verbe"
	// /home/matthias/ISTIC/COMP/tp1/v2/ExprAST.g:41:1: verbe : entite ;
	public final ExprASTParser.verbe_return verbe() throws RecognitionException {
		ExprASTParser.verbe_return retval = new ExprASTParser.verbe_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope entite8 =null;


		try {
			// /home/matthias/ISTIC/COMP/tp1/v2/ExprAST.g:41:7: ( entite )
			// /home/matthias/ISTIC/COMP/tp1/v2/ExprAST.g:42:2: entite
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_entite_in_verbe167);
			entite8=entite();
			state._fsp--;

			adaptor.addChild(root_0, entite8.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "verbe"


	public static class verbesobjets_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "verbesobjets"
	// /home/matthias/ISTIC/COMP/tp1/v2/ExprAST.g:44:1: verbesobjets : verbeobjets ( ';' ! verbesobjets |) ;
	public final ExprASTParser.verbesobjets_return verbesobjets() throws RecognitionException {
		ExprASTParser.verbesobjets_return retval = new ExprASTParser.verbesobjets_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal10=null;
		ParserRuleReturnScope verbeobjets9 =null;
		ParserRuleReturnScope verbesobjets11 =null;

		CommonTree char_literal10_tree=null;

		try {
			// /home/matthias/ISTIC/COMP/tp1/v2/ExprAST.g:45:2: ( verbeobjets ( ';' ! verbesobjets |) )
			// /home/matthias/ISTIC/COMP/tp1/v2/ExprAST.g:46:2: verbeobjets ( ';' ! verbesobjets |)
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_verbeobjets_in_verbesobjets179);
			verbeobjets9=verbeobjets();
			state._fsp--;

			adaptor.addChild(root_0, verbeobjets9.getTree());

			// /home/matthias/ISTIC/COMP/tp1/v2/ExprAST.g:46:14: ( ';' ! verbesobjets |)
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==13) ) {
				alt2=1;
			}
			else if ( (LA2_0==12) ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// /home/matthias/ISTIC/COMP/tp1/v2/ExprAST.g:46:15: ';' ! verbesobjets
					{
					char_literal10=(Token)match(input,13,FOLLOW_13_in_verbesobjets182); 
					pushFollow(FOLLOW_verbesobjets_in_verbesobjets184);
					verbesobjets11=verbesobjets();
					state._fsp--;

					adaptor.addChild(root_0, verbesobjets11.getTree());

					}
					break;
				case 2 :
					// /home/matthias/ISTIC/COMP/tp1/v2/ExprAST.g:46:34: 
					{
					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "verbesobjets"


	public static class verbeobjets_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "verbeobjets"
	// /home/matthias/ISTIC/COMP/tp1/v2/ExprAST.g:48:1: verbeobjets : verbe objets -> ^( P verbe objets ) ;
	public final ExprASTParser.verbeobjets_return verbeobjets() throws RecognitionException {
		ExprASTParser.verbeobjets_return retval = new ExprASTParser.verbeobjets_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope verbe12 =null;
		ParserRuleReturnScope objets13 =null;

		RewriteRuleSubtreeStream stream_objets=new RewriteRuleSubtreeStream(adaptor,"rule objets");
		RewriteRuleSubtreeStream stream_verbe=new RewriteRuleSubtreeStream(adaptor,"rule verbe");

		try {
			// /home/matthias/ISTIC/COMP/tp1/v2/ExprAST.g:49:2: ( verbe objets -> ^( P verbe objets ) )
			// /home/matthias/ISTIC/COMP/tp1/v2/ExprAST.g:50:2: verbe objets
			{
			pushFollow(FOLLOW_verbe_in_verbeobjets198);
			verbe12=verbe();
			state._fsp--;

			stream_verbe.add(verbe12.getTree());
			pushFollow(FOLLOW_objets_in_verbeobjets200);
			objets13=objets();
			state._fsp--;

			stream_objets.add(objets13.getTree());
			// AST REWRITE
			// elements: objets, verbe
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 50:15: -> ^( P verbe objets )
			{
				// /home/matthias/ISTIC/COMP/tp1/v2/ExprAST.g:50:18: ^( P verbe objets )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(P, "P"), root_1);
				adaptor.addChild(root_1, stream_verbe.nextTree());
				adaptor.addChild(root_1, stream_objets.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "verbeobjets"


	public static class objets_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "objets"
	// /home/matthias/ISTIC/COMP/tp1/v2/ExprAST.g:52:1: objets : ( objet ',' ! objets | objet );
	public final ExprASTParser.objets_return objets() throws RecognitionException {
		ExprASTParser.objets_return retval = new ExprASTParser.objets_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal15=null;
		ParserRuleReturnScope objet14 =null;
		ParserRuleReturnScope objets16 =null;
		ParserRuleReturnScope objet17 =null;

		CommonTree char_literal15_tree=null;

		try {
			// /home/matthias/ISTIC/COMP/tp1/v2/ExprAST.g:52:7: ( objet ',' ! objets | objet )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==14) ) {
				int LA3_1 = input.LA(2);
				if ( (LA3_1==ID) ) {
					int LA3_3 = input.LA(3);
					if ( (LA3_3==15) ) {
						int LA3_5 = input.LA(4);
						if ( (LA3_5==11) ) {
							alt3=1;
						}
						else if ( ((LA3_5 >= 12 && LA3_5 <= 13)) ) {
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
			else if ( (LA3_0==10) ) {
				int LA3_2 = input.LA(2);
				if ( (LA3_2==ID) ) {
					int LA3_4 = input.LA(3);
					if ( (LA3_4==10) ) {
						int LA3_6 = input.LA(4);
						if ( (LA3_6==11) ) {
							alt3=1;
						}
						else if ( ((LA3_6 >= 12 && LA3_6 <= 13)) ) {
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
					// /home/matthias/ISTIC/COMP/tp1/v2/ExprAST.g:53:2: objet ',' ! objets
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_objet_in_objets219);
					objet14=objet();
					state._fsp--;

					adaptor.addChild(root_0, objet14.getTree());

					char_literal15=(Token)match(input,11,FOLLOW_11_in_objets220); 
					pushFollow(FOLLOW_objets_in_objets222);
					objets16=objets();
					state._fsp--;

					adaptor.addChild(root_0, objets16.getTree());

					}
					break;
				case 2 :
					// /home/matthias/ISTIC/COMP/tp1/v2/ExprAST.g:54:4: objet
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_objet_in_objets228);
					objet17=objet();
					state._fsp--;

					adaptor.addChild(root_0, objet17.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "objets"


	public static class objet_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "objet"
	// /home/matthias/ISTIC/COMP/tp1/v2/ExprAST.g:56:1: objet : ( entite -> ^( O entite ) | text -> ^( O text ) );
	public final ExprASTParser.objet_return objet() throws RecognitionException {
		ExprASTParser.objet_return retval = new ExprASTParser.objet_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope entite18 =null;
		ParserRuleReturnScope text19 =null;

		RewriteRuleSubtreeStream stream_text=new RewriteRuleSubtreeStream(adaptor,"rule text");
		RewriteRuleSubtreeStream stream_entite=new RewriteRuleSubtreeStream(adaptor,"rule entite");

		try {
			// /home/matthias/ISTIC/COMP/tp1/v2/ExprAST.g:56:6: ( entite -> ^( O entite ) | text -> ^( O text ) )
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
					// /home/matthias/ISTIC/COMP/tp1/v2/ExprAST.g:57:2: entite
					{
					pushFollow(FOLLOW_entite_in_objet238);
					entite18=entite();
					state._fsp--;

					stream_entite.add(entite18.getTree());
					// AST REWRITE
					// elements: entite
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 57:10: -> ^( O entite )
					{
						// /home/matthias/ISTIC/COMP/tp1/v2/ExprAST.g:57:13: ^( O entite )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(O, "O"), root_1);
						adaptor.addChild(root_1, stream_entite.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /home/matthias/ISTIC/COMP/tp1/v2/ExprAST.g:58:3: text
					{
					pushFollow(FOLLOW_text_in_objet251);
					text19=text();
					state._fsp--;

					stream_text.add(text19.getTree());
					// AST REWRITE
					// elements: text
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 58:9: -> ^( O text )
					{
						// /home/matthias/ISTIC/COMP/tp1/v2/ExprAST.g:58:12: ^( O text )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(O, "O"), root_1);
						adaptor.addChild(root_1, stream_text.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "objet"


	public static class entite_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "entite"
	// /home/matthias/ISTIC/COMP/tp1/v2/ExprAST.g:61:1: entite : '<' ID '>' ;
	public final ExprASTParser.entite_return entite() throws RecognitionException {
		ExprASTParser.entite_return retval = new ExprASTParser.entite_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal20=null;
		Token ID21=null;
		Token char_literal22=null;

		CommonTree char_literal20_tree=null;
		CommonTree ID21_tree=null;
		CommonTree char_literal22_tree=null;

		try {
			// /home/matthias/ISTIC/COMP/tp1/v2/ExprAST.g:62:2: ( '<' ID '>' )
			// /home/matthias/ISTIC/COMP/tp1/v2/ExprAST.g:62:3: '<' ID '>'
			{
			root_0 = (CommonTree)adaptor.nil();


			char_literal20=(Token)match(input,14,FOLLOW_14_in_entite271); 
			char_literal20_tree = (CommonTree)adaptor.create(char_literal20);
			adaptor.addChild(root_0, char_literal20_tree);

			ID21=(Token)match(input,ID,FOLLOW_ID_in_entite272); 
			ID21_tree = (CommonTree)adaptor.create(ID21);
			adaptor.addChild(root_0, ID21_tree);

			char_literal22=(Token)match(input,15,FOLLOW_15_in_entite273); 
			char_literal22_tree = (CommonTree)adaptor.create(char_literal22);
			adaptor.addChild(root_0, char_literal22_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "entite"


	public static class text_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "text"
	// /home/matthias/ISTIC/COMP/tp1/v2/ExprAST.g:65:1: text : '\"' ID '\"' ;
	public final ExprASTParser.text_return text() throws RecognitionException {
		ExprASTParser.text_return retval = new ExprASTParser.text_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal23=null;
		Token ID24=null;
		Token char_literal25=null;

		CommonTree char_literal23_tree=null;
		CommonTree ID24_tree=null;
		CommonTree char_literal25_tree=null;

		try {
			// /home/matthias/ISTIC/COMP/tp1/v2/ExprAST.g:66:6: ( '\"' ID '\"' )
			// /home/matthias/ISTIC/COMP/tp1/v2/ExprAST.g:66:7: '\"' ID '\"'
			{
			root_0 = (CommonTree)adaptor.nil();


			char_literal23=(Token)match(input,10,FOLLOW_10_in_text290); 
			char_literal23_tree = (CommonTree)adaptor.create(char_literal23);
			adaptor.addChild(root_0, char_literal23_tree);

			ID24=(Token)match(input,ID,FOLLOW_ID_in_text291); 
			ID24_tree = (CommonTree)adaptor.create(ID24);
			adaptor.addChild(root_0, ID24_tree);

			char_literal25=(Token)match(input,10,FOLLOW_10_in_text292); 
			char_literal25_tree = (CommonTree)adaptor.create(char_literal25);
			adaptor.addChild(root_0, char_literal25_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "text"

	// Delegated rules



	public static final BitSet FOLLOW_phrases_in_doc89 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_phrase_in_phrases108 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_phrases_in_phrases110 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sujet_in_phrase127 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_verbesobjets_in_phrase129 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_phrase131 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_entite_in_sujet155 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_entite_in_verbe167 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_verbeobjets_in_verbesobjets179 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_13_in_verbesobjets182 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_verbesobjets_in_verbesobjets184 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_verbe_in_verbeobjets198 = new BitSet(new long[]{0x0000000000004400L});
	public static final BitSet FOLLOW_objets_in_verbeobjets200 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_objet_in_objets219 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_objets220 = new BitSet(new long[]{0x0000000000004400L});
	public static final BitSet FOLLOW_objets_in_objets222 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_objet_in_objets228 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_entite_in_objet238 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_text_in_objet251 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_14_in_entite271 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_entite272 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_entite273 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_10_in_text290 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_text291 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_text292 = new BitSet(new long[]{0x0000000000000002L});
}
