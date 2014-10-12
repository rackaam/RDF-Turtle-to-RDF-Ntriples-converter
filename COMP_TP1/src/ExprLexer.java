// $ANTLR 3.5.1 /home/matthias/ISTIC/COMP/tp1/v1/Expr.g 2014-10-12 18:42:59

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class ExprLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public ExprLexer() {} 
	public ExprLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public ExprLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "/home/matthias/ISTIC/COMP/tp1/v1/Expr.g"; }

	// $ANTLR start "T__6"
	public final void mT__6() throws RecognitionException {
		try {
			int _type = T__6;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/matthias/ISTIC/COMP/tp1/v1/Expr.g:2:6: ( '\"' )
			// /home/matthias/ISTIC/COMP/tp1/v1/Expr.g:2:8: '\"'
			{
			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__6"

	// $ANTLR start "T__7"
	public final void mT__7() throws RecognitionException {
		try {
			int _type = T__7;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/matthias/ISTIC/COMP/tp1/v1/Expr.g:3:6: ( ',' )
			// /home/matthias/ISTIC/COMP/tp1/v1/Expr.g:3:8: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__7"

	// $ANTLR start "T__8"
	public final void mT__8() throws RecognitionException {
		try {
			int _type = T__8;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/matthias/ISTIC/COMP/tp1/v1/Expr.g:4:6: ( '.' )
			// /home/matthias/ISTIC/COMP/tp1/v1/Expr.g:4:8: '.'
			{
			match('.'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__8"

	// $ANTLR start "T__9"
	public final void mT__9() throws RecognitionException {
		try {
			int _type = T__9;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/matthias/ISTIC/COMP/tp1/v1/Expr.g:5:6: ( ';' )
			// /home/matthias/ISTIC/COMP/tp1/v1/Expr.g:5:8: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__9"

	// $ANTLR start "T__10"
	public final void mT__10() throws RecognitionException {
		try {
			int _type = T__10;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/matthias/ISTIC/COMP/tp1/v1/Expr.g:6:7: ( '<' )
			// /home/matthias/ISTIC/COMP/tp1/v1/Expr.g:6:9: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__10"

	// $ANTLR start "T__11"
	public final void mT__11() throws RecognitionException {
		try {
			int _type = T__11;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/matthias/ISTIC/COMP/tp1/v1/Expr.g:7:7: ( '>' )
			// /home/matthias/ISTIC/COMP/tp1/v1/Expr.g:7:9: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__11"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/matthias/ISTIC/COMP/tp1/v1/Expr.g:49:5: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
			// /home/matthias/ISTIC/COMP/tp1/v1/Expr.g:49:9: ( ' ' | '\\t' | '\\n' | '\\r' )+
			{
			// /home/matthias/ISTIC/COMP/tp1/v1/Expr.g:49:9: ( ' ' | '\\t' | '\\n' | '\\r' )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '\t' && LA1_0 <= '\n')||LA1_0=='\r'||LA1_0==' ') ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// /home/matthias/ISTIC/COMP/tp1/v1/Expr.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			skip();
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/matthias/ISTIC/COMP/tp1/v1/Expr.g:50:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '-' | '_' | '&' | ' ' )+ )
			// /home/matthias/ISTIC/COMP/tp1/v1/Expr.g:50:9: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '-' | '_' | '&' | ' ' )+
			{
			// /home/matthias/ISTIC/COMP/tp1/v1/Expr.g:50:9: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '-' | '_' | '&' | ' ' )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==' '||LA2_0=='&'||LA2_0=='-'||(LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||LA2_0=='_'||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// /home/matthias/ISTIC/COMP/tp1/v1/Expr.g:
					{
					if ( input.LA(1)==' '||input.LA(1)=='&'||input.LA(1)=='-'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	@Override
	public void mTokens() throws RecognitionException {
		// /home/matthias/ISTIC/COMP/tp1/v1/Expr.g:1:8: ( T__6 | T__7 | T__8 | T__9 | T__10 | T__11 | WS | ID )
		int alt3=8;
		alt3 = dfa3.predict(input);
		switch (alt3) {
			case 1 :
				// /home/matthias/ISTIC/COMP/tp1/v1/Expr.g:1:10: T__6
				{
				mT__6(); 

				}
				break;
			case 2 :
				// /home/matthias/ISTIC/COMP/tp1/v1/Expr.g:1:15: T__7
				{
				mT__7(); 

				}
				break;
			case 3 :
				// /home/matthias/ISTIC/COMP/tp1/v1/Expr.g:1:20: T__8
				{
				mT__8(); 

				}
				break;
			case 4 :
				// /home/matthias/ISTIC/COMP/tp1/v1/Expr.g:1:25: T__9
				{
				mT__9(); 

				}
				break;
			case 5 :
				// /home/matthias/ISTIC/COMP/tp1/v1/Expr.g:1:30: T__10
				{
				mT__10(); 

				}
				break;
			case 6 :
				// /home/matthias/ISTIC/COMP/tp1/v1/Expr.g:1:36: T__11
				{
				mT__11(); 

				}
				break;
			case 7 :
				// /home/matthias/ISTIC/COMP/tp1/v1/Expr.g:1:42: WS
				{
				mWS(); 

				}
				break;
			case 8 :
				// /home/matthias/ISTIC/COMP/tp1/v1/Expr.g:1:45: ID
				{
				mID(); 

				}
				break;

		}
	}


	protected DFA3 dfa3 = new DFA3(this);
	static final String DFA3_eotS =
		"\7\uffff\1\10\2\uffff";
	static final String DFA3_eofS =
		"\12\uffff";
	static final String DFA3_minS =
		"\1\11\6\uffff\1\40\2\uffff";
	static final String DFA3_maxS =
		"\1\172\6\uffff\1\172\2\uffff";
	static final String DFA3_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\uffff\1\7\1\10";
	static final String DFA3_specialS =
		"\12\uffff}>";
	static final String[] DFA3_transitionS = {
			"\2\10\2\uffff\1\10\22\uffff\1\7\1\uffff\1\1\3\uffff\1\11\5\uffff\1\2"+
			"\1\11\1\3\1\uffff\12\11\1\uffff\1\4\1\5\1\uffff\1\6\2\uffff\32\11\4\uffff"+
			"\1\11\1\uffff\32\11",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\7\5\uffff\1\11\6\uffff\1\11\2\uffff\12\11\7\uffff\32\11\4\uffff\1"+
			"\11\1\uffff\32\11",
			"",
			""
	};

	static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
	static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
	static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
	static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
	static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
	static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
	static final short[][] DFA3_transition;

	static {
		int numStates = DFA3_transitionS.length;
		DFA3_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
		}
	}

	protected class DFA3 extends DFA {

		public DFA3(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 3;
			this.eot = DFA3_eot;
			this.eof = DFA3_eof;
			this.min = DFA3_min;
			this.max = DFA3_max;
			this.accept = DFA3_accept;
			this.special = DFA3_special;
			this.transition = DFA3_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__6 | T__7 | T__8 | T__9 | T__10 | T__11 | WS | ID );";
		}
	}

}
