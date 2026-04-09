package edu.example.gamedsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import edu.example.gamedsl.services.GameDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGameDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'board'", "'x'", "'player'", "'turn_order'", "'['", "','", "']'", "'piece'", "'symbol'", "'owner'", "'place'", "'at'", "'for'", "'move'", "'direction'", "'if'", "'rule'", "'then'", "'win_condition'", "'winner'", "'='", "'-'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalGameDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGameDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGameDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalGameDSL.g"; }



     	private GameDSLGrammarAccess grammarAccess;

        public InternalGameDSLParser(TokenStream input, GameDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected GameDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalGameDSL.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalGameDSL.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalGameDSL.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalGameDSL.g:71:1: ruleModel returns [EObject current=null] : ( (lv_statements_0_0= ruleStatement ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_statements_0_0 = null;



        	enterRule();

        try {
            // InternalGameDSL.g:77:2: ( ( (lv_statements_0_0= ruleStatement ) )* )
            // InternalGameDSL.g:78:2: ( (lv_statements_0_0= ruleStatement ) )*
            {
            // InternalGameDSL.g:78:2: ( (lv_statements_0_0= ruleStatement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||(LA1_0>=13 && LA1_0<=14)||LA1_0==18||LA1_0==21||LA1_0==24||LA1_0==27||LA1_0==29) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalGameDSL.g:79:3: (lv_statements_0_0= ruleStatement )
            	    {
            	    // InternalGameDSL.g:79:3: (lv_statements_0_0= ruleStatement )
            	    // InternalGameDSL.g:80:4: lv_statements_0_0= ruleStatement
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getStatementsStatementParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_statements_0_0=ruleStatement();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"statements",
            	    					lv_statements_0_0,
            	    					"edu.example.gamedsl.GameDSL.Statement");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleStatement"
    // InternalGameDSL.g:100:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalGameDSL.g:100:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalGameDSL.g:101:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalGameDSL.g:107:1: ruleStatement returns [EObject current=null] : (this_Board_0= ruleBoard | this_Player_1= rulePlayer | this_TurnOrder_2= ruleTurnOrder | this_Piece_3= rulePiece | this_Placement_4= rulePlacement | this_Move_5= ruleMove | this_Rule_6= ruleRule | this_WinCondition_7= ruleWinCondition ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_Board_0 = null;

        EObject this_Player_1 = null;

        EObject this_TurnOrder_2 = null;

        EObject this_Piece_3 = null;

        EObject this_Placement_4 = null;

        EObject this_Move_5 = null;

        EObject this_Rule_6 = null;

        EObject this_WinCondition_7 = null;



        	enterRule();

        try {
            // InternalGameDSL.g:113:2: ( (this_Board_0= ruleBoard | this_Player_1= rulePlayer | this_TurnOrder_2= ruleTurnOrder | this_Piece_3= rulePiece | this_Placement_4= rulePlacement | this_Move_5= ruleMove | this_Rule_6= ruleRule | this_WinCondition_7= ruleWinCondition ) )
            // InternalGameDSL.g:114:2: (this_Board_0= ruleBoard | this_Player_1= rulePlayer | this_TurnOrder_2= ruleTurnOrder | this_Piece_3= rulePiece | this_Placement_4= rulePlacement | this_Move_5= ruleMove | this_Rule_6= ruleRule | this_WinCondition_7= ruleWinCondition )
            {
            // InternalGameDSL.g:114:2: (this_Board_0= ruleBoard | this_Player_1= rulePlayer | this_TurnOrder_2= ruleTurnOrder | this_Piece_3= rulePiece | this_Placement_4= rulePlacement | this_Move_5= ruleMove | this_Rule_6= ruleRule | this_WinCondition_7= ruleWinCondition )
            int alt2=8;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 13:
                {
                alt2=2;
                }
                break;
            case 14:
                {
                alt2=3;
                }
                break;
            case 18:
                {
                alt2=4;
                }
                break;
            case 21:
                {
                alt2=5;
                }
                break;
            case 24:
                {
                alt2=6;
                }
                break;
            case 27:
                {
                alt2=7;
                }
                break;
            case 29:
                {
                alt2=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalGameDSL.g:115:3: this_Board_0= ruleBoard
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getBoardParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Board_0=ruleBoard();

                    state._fsp--;


                    			current = this_Board_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalGameDSL.g:124:3: this_Player_1= rulePlayer
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getPlayerParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Player_1=rulePlayer();

                    state._fsp--;


                    			current = this_Player_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalGameDSL.g:133:3: this_TurnOrder_2= ruleTurnOrder
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getTurnOrderParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_TurnOrder_2=ruleTurnOrder();

                    state._fsp--;


                    			current = this_TurnOrder_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalGameDSL.g:142:3: this_Piece_3= rulePiece
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getPieceParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Piece_3=rulePiece();

                    state._fsp--;


                    			current = this_Piece_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalGameDSL.g:151:3: this_Placement_4= rulePlacement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getPlacementParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Placement_4=rulePlacement();

                    state._fsp--;


                    			current = this_Placement_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalGameDSL.g:160:3: this_Move_5= ruleMove
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getMoveParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Move_5=ruleMove();

                    state._fsp--;


                    			current = this_Move_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalGameDSL.g:169:3: this_Rule_6= ruleRule
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getRuleParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Rule_6=ruleRule();

                    state._fsp--;


                    			current = this_Rule_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalGameDSL.g:178:3: this_WinCondition_7= ruleWinCondition
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getWinConditionParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_WinCondition_7=ruleWinCondition();

                    state._fsp--;


                    			current = this_WinCondition_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleBoard"
    // InternalGameDSL.g:190:1: entryRuleBoard returns [EObject current=null] : iv_ruleBoard= ruleBoard EOF ;
    public final EObject entryRuleBoard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoard = null;


        try {
            // InternalGameDSL.g:190:46: (iv_ruleBoard= ruleBoard EOF )
            // InternalGameDSL.g:191:2: iv_ruleBoard= ruleBoard EOF
            {
             newCompositeNode(grammarAccess.getBoardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBoard=ruleBoard();

            state._fsp--;

             current =iv_ruleBoard; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBoard"


    // $ANTLR start "ruleBoard"
    // InternalGameDSL.g:197:1: ruleBoard returns [EObject current=null] : (otherlv_0= 'board' ( (lv_rows_1_0= RULE_INT ) ) otherlv_2= 'x' ( (lv_cols_3_0= RULE_INT ) ) ) ;
    public final EObject ruleBoard() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_rows_1_0=null;
        Token otherlv_2=null;
        Token lv_cols_3_0=null;


        	enterRule();

        try {
            // InternalGameDSL.g:203:2: ( (otherlv_0= 'board' ( (lv_rows_1_0= RULE_INT ) ) otherlv_2= 'x' ( (lv_cols_3_0= RULE_INT ) ) ) )
            // InternalGameDSL.g:204:2: (otherlv_0= 'board' ( (lv_rows_1_0= RULE_INT ) ) otherlv_2= 'x' ( (lv_cols_3_0= RULE_INT ) ) )
            {
            // InternalGameDSL.g:204:2: (otherlv_0= 'board' ( (lv_rows_1_0= RULE_INT ) ) otherlv_2= 'x' ( (lv_cols_3_0= RULE_INT ) ) )
            // InternalGameDSL.g:205:3: otherlv_0= 'board' ( (lv_rows_1_0= RULE_INT ) ) otherlv_2= 'x' ( (lv_cols_3_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getBoardAccess().getBoardKeyword_0());
            		
            // InternalGameDSL.g:209:3: ( (lv_rows_1_0= RULE_INT ) )
            // InternalGameDSL.g:210:4: (lv_rows_1_0= RULE_INT )
            {
            // InternalGameDSL.g:210:4: (lv_rows_1_0= RULE_INT )
            // InternalGameDSL.g:211:5: lv_rows_1_0= RULE_INT
            {
            lv_rows_1_0=(Token)match(input,RULE_INT,FOLLOW_5); 

            					newLeafNode(lv_rows_1_0, grammarAccess.getBoardAccess().getRowsINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBoardRule());
            					}
            					setWithLastConsumed(
            						current,
            						"rows",
            						lv_rows_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getBoardAccess().getXKeyword_2());
            		
            // InternalGameDSL.g:231:3: ( (lv_cols_3_0= RULE_INT ) )
            // InternalGameDSL.g:232:4: (lv_cols_3_0= RULE_INT )
            {
            // InternalGameDSL.g:232:4: (lv_cols_3_0= RULE_INT )
            // InternalGameDSL.g:233:5: lv_cols_3_0= RULE_INT
            {
            lv_cols_3_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_cols_3_0, grammarAccess.getBoardAccess().getColsINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBoardRule());
            					}
            					setWithLastConsumed(
            						current,
            						"cols",
            						lv_cols_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBoard"


    // $ANTLR start "entryRulePlayer"
    // InternalGameDSL.g:253:1: entryRulePlayer returns [EObject current=null] : iv_rulePlayer= rulePlayer EOF ;
    public final EObject entryRulePlayer() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlayer = null;


        try {
            // InternalGameDSL.g:253:47: (iv_rulePlayer= rulePlayer EOF )
            // InternalGameDSL.g:254:2: iv_rulePlayer= rulePlayer EOF
            {
             newCompositeNode(grammarAccess.getPlayerRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlayer=rulePlayer();

            state._fsp--;

             current =iv_rulePlayer; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePlayer"


    // $ANTLR start "rulePlayer"
    // InternalGameDSL.g:260:1: rulePlayer returns [EObject current=null] : (otherlv_0= 'player' ( (lv_name_1_0= RULE_STRING ) ) ) ;
    public final EObject rulePlayer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalGameDSL.g:266:2: ( (otherlv_0= 'player' ( (lv_name_1_0= RULE_STRING ) ) ) )
            // InternalGameDSL.g:267:2: (otherlv_0= 'player' ( (lv_name_1_0= RULE_STRING ) ) )
            {
            // InternalGameDSL.g:267:2: (otherlv_0= 'player' ( (lv_name_1_0= RULE_STRING ) ) )
            // InternalGameDSL.g:268:3: otherlv_0= 'player' ( (lv_name_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getPlayerAccess().getPlayerKeyword_0());
            		
            // InternalGameDSL.g:272:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalGameDSL.g:273:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalGameDSL.g:273:4: (lv_name_1_0= RULE_STRING )
            // InternalGameDSL.g:274:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPlayerAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlayerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePlayer"


    // $ANTLR start "entryRuleTurnOrder"
    // InternalGameDSL.g:294:1: entryRuleTurnOrder returns [EObject current=null] : iv_ruleTurnOrder= ruleTurnOrder EOF ;
    public final EObject entryRuleTurnOrder() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTurnOrder = null;


        try {
            // InternalGameDSL.g:294:50: (iv_ruleTurnOrder= ruleTurnOrder EOF )
            // InternalGameDSL.g:295:2: iv_ruleTurnOrder= ruleTurnOrder EOF
            {
             newCompositeNode(grammarAccess.getTurnOrderRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTurnOrder=ruleTurnOrder();

            state._fsp--;

             current =iv_ruleTurnOrder; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTurnOrder"


    // $ANTLR start "ruleTurnOrder"
    // InternalGameDSL.g:301:1: ruleTurnOrder returns [EObject current=null] : (otherlv_0= 'turn_order' otherlv_1= '[' ( (lv_players_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_players_4_0= RULE_STRING ) ) )* otherlv_5= ']' ) ;
    public final EObject ruleTurnOrder() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_players_2_0=null;
        Token otherlv_3=null;
        Token lv_players_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalGameDSL.g:307:2: ( (otherlv_0= 'turn_order' otherlv_1= '[' ( (lv_players_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_players_4_0= RULE_STRING ) ) )* otherlv_5= ']' ) )
            // InternalGameDSL.g:308:2: (otherlv_0= 'turn_order' otherlv_1= '[' ( (lv_players_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_players_4_0= RULE_STRING ) ) )* otherlv_5= ']' )
            {
            // InternalGameDSL.g:308:2: (otherlv_0= 'turn_order' otherlv_1= '[' ( (lv_players_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_players_4_0= RULE_STRING ) ) )* otherlv_5= ']' )
            // InternalGameDSL.g:309:3: otherlv_0= 'turn_order' otherlv_1= '[' ( (lv_players_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_players_4_0= RULE_STRING ) ) )* otherlv_5= ']'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getTurnOrderAccess().getTurn_orderKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getTurnOrderAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalGameDSL.g:317:3: ( (lv_players_2_0= RULE_STRING ) )
            // InternalGameDSL.g:318:4: (lv_players_2_0= RULE_STRING )
            {
            // InternalGameDSL.g:318:4: (lv_players_2_0= RULE_STRING )
            // InternalGameDSL.g:319:5: lv_players_2_0= RULE_STRING
            {
            lv_players_2_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_players_2_0, grammarAccess.getTurnOrderAccess().getPlayersSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTurnOrderRule());
            					}
            					addWithLastConsumed(
            						current,
            						"players",
            						lv_players_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalGameDSL.g:335:3: (otherlv_3= ',' ( (lv_players_4_0= RULE_STRING ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalGameDSL.g:336:4: otherlv_3= ',' ( (lv_players_4_0= RULE_STRING ) )
            	    {
            	    otherlv_3=(Token)match(input,16,FOLLOW_6); 

            	    				newLeafNode(otherlv_3, grammarAccess.getTurnOrderAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalGameDSL.g:340:4: ( (lv_players_4_0= RULE_STRING ) )
            	    // InternalGameDSL.g:341:5: (lv_players_4_0= RULE_STRING )
            	    {
            	    // InternalGameDSL.g:341:5: (lv_players_4_0= RULE_STRING )
            	    // InternalGameDSL.g:342:6: lv_players_4_0= RULE_STRING
            	    {
            	    lv_players_4_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            	    						newLeafNode(lv_players_4_0, grammarAccess.getTurnOrderAccess().getPlayersSTRINGTerminalRuleCall_3_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getTurnOrderRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"players",
            	    							lv_players_4_0,
            	    							"org.eclipse.xtext.common.Terminals.STRING");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_5=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getTurnOrderAccess().getRightSquareBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTurnOrder"


    // $ANTLR start "entryRulePiece"
    // InternalGameDSL.g:367:1: entryRulePiece returns [EObject current=null] : iv_rulePiece= rulePiece EOF ;
    public final EObject entryRulePiece() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePiece = null;


        try {
            // InternalGameDSL.g:367:46: (iv_rulePiece= rulePiece EOF )
            // InternalGameDSL.g:368:2: iv_rulePiece= rulePiece EOF
            {
             newCompositeNode(grammarAccess.getPieceRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePiece=rulePiece();

            state._fsp--;

             current =iv_rulePiece; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePiece"


    // $ANTLR start "rulePiece"
    // InternalGameDSL.g:374:1: rulePiece returns [EObject current=null] : (otherlv_0= 'piece' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'symbol' ( (lv_symbol_3_0= RULE_STRING ) ) otherlv_4= 'owner' ( (lv_owner_5_0= RULE_STRING ) ) (otherlv_6= 'x' ( (lv_count_7_0= RULE_INT ) ) )? ) ;
    public final EObject rulePiece() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_symbol_3_0=null;
        Token otherlv_4=null;
        Token lv_owner_5_0=null;
        Token otherlv_6=null;
        Token lv_count_7_0=null;


        	enterRule();

        try {
            // InternalGameDSL.g:380:2: ( (otherlv_0= 'piece' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'symbol' ( (lv_symbol_3_0= RULE_STRING ) ) otherlv_4= 'owner' ( (lv_owner_5_0= RULE_STRING ) ) (otherlv_6= 'x' ( (lv_count_7_0= RULE_INT ) ) )? ) )
            // InternalGameDSL.g:381:2: (otherlv_0= 'piece' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'symbol' ( (lv_symbol_3_0= RULE_STRING ) ) otherlv_4= 'owner' ( (lv_owner_5_0= RULE_STRING ) ) (otherlv_6= 'x' ( (lv_count_7_0= RULE_INT ) ) )? )
            {
            // InternalGameDSL.g:381:2: (otherlv_0= 'piece' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'symbol' ( (lv_symbol_3_0= RULE_STRING ) ) otherlv_4= 'owner' ( (lv_owner_5_0= RULE_STRING ) ) (otherlv_6= 'x' ( (lv_count_7_0= RULE_INT ) ) )? )
            // InternalGameDSL.g:382:3: otherlv_0= 'piece' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'symbol' ( (lv_symbol_3_0= RULE_STRING ) ) otherlv_4= 'owner' ( (lv_owner_5_0= RULE_STRING ) ) (otherlv_6= 'x' ( (lv_count_7_0= RULE_INT ) ) )?
            {
            otherlv_0=(Token)match(input,18,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getPieceAccess().getPieceKeyword_0());
            		
            // InternalGameDSL.g:386:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalGameDSL.g:387:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalGameDSL.g:387:4: (lv_name_1_0= RULE_STRING )
            // InternalGameDSL.g:388:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPieceAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPieceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getPieceAccess().getSymbolKeyword_2());
            		
            // InternalGameDSL.g:408:3: ( (lv_symbol_3_0= RULE_STRING ) )
            // InternalGameDSL.g:409:4: (lv_symbol_3_0= RULE_STRING )
            {
            // InternalGameDSL.g:409:4: (lv_symbol_3_0= RULE_STRING )
            // InternalGameDSL.g:410:5: lv_symbol_3_0= RULE_STRING
            {
            lv_symbol_3_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            					newLeafNode(lv_symbol_3_0, grammarAccess.getPieceAccess().getSymbolSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPieceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"symbol",
            						lv_symbol_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,20,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getPieceAccess().getOwnerKeyword_4());
            		
            // InternalGameDSL.g:430:3: ( (lv_owner_5_0= RULE_STRING ) )
            // InternalGameDSL.g:431:4: (lv_owner_5_0= RULE_STRING )
            {
            // InternalGameDSL.g:431:4: (lv_owner_5_0= RULE_STRING )
            // InternalGameDSL.g:432:5: lv_owner_5_0= RULE_STRING
            {
            lv_owner_5_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

            					newLeafNode(lv_owner_5_0, grammarAccess.getPieceAccess().getOwnerSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPieceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"owner",
            						lv_owner_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalGameDSL.g:448:3: (otherlv_6= 'x' ( (lv_count_7_0= RULE_INT ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalGameDSL.g:449:4: otherlv_6= 'x' ( (lv_count_7_0= RULE_INT ) )
                    {
                    otherlv_6=(Token)match(input,12,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getPieceAccess().getXKeyword_6_0());
                    			
                    // InternalGameDSL.g:453:4: ( (lv_count_7_0= RULE_INT ) )
                    // InternalGameDSL.g:454:5: (lv_count_7_0= RULE_INT )
                    {
                    // InternalGameDSL.g:454:5: (lv_count_7_0= RULE_INT )
                    // InternalGameDSL.g:455:6: lv_count_7_0= RULE_INT
                    {
                    lv_count_7_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_count_7_0, grammarAccess.getPieceAccess().getCountINTTerminalRuleCall_6_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPieceRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"count",
                    							lv_count_7_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePiece"


    // $ANTLR start "entryRulePlacement"
    // InternalGameDSL.g:476:1: entryRulePlacement returns [EObject current=null] : iv_rulePlacement= rulePlacement EOF ;
    public final EObject entryRulePlacement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlacement = null;


        try {
            // InternalGameDSL.g:476:50: (iv_rulePlacement= rulePlacement EOF )
            // InternalGameDSL.g:477:2: iv_rulePlacement= rulePlacement EOF
            {
             newCompositeNode(grammarAccess.getPlacementRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlacement=rulePlacement();

            state._fsp--;

             current =iv_rulePlacement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePlacement"


    // $ANTLR start "rulePlacement"
    // InternalGameDSL.g:483:1: rulePlacement returns [EObject current=null] : (otherlv_0= 'place' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'at' ( (lv_range_3_0= ruleCoordinateRange ) ) otherlv_4= 'for' ( (lv_owner_5_0= RULE_STRING ) ) ) ;
    public final EObject rulePlacement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_owner_5_0=null;
        EObject lv_range_3_0 = null;



        	enterRule();

        try {
            // InternalGameDSL.g:489:2: ( (otherlv_0= 'place' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'at' ( (lv_range_3_0= ruleCoordinateRange ) ) otherlv_4= 'for' ( (lv_owner_5_0= RULE_STRING ) ) ) )
            // InternalGameDSL.g:490:2: (otherlv_0= 'place' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'at' ( (lv_range_3_0= ruleCoordinateRange ) ) otherlv_4= 'for' ( (lv_owner_5_0= RULE_STRING ) ) )
            {
            // InternalGameDSL.g:490:2: (otherlv_0= 'place' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'at' ( (lv_range_3_0= ruleCoordinateRange ) ) otherlv_4= 'for' ( (lv_owner_5_0= RULE_STRING ) ) )
            // InternalGameDSL.g:491:3: otherlv_0= 'place' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'at' ( (lv_range_3_0= ruleCoordinateRange ) ) otherlv_4= 'for' ( (lv_owner_5_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getPlacementAccess().getPlaceKeyword_0());
            		
            // InternalGameDSL.g:495:3: ( (otherlv_1= RULE_ID ) )
            // InternalGameDSL.g:496:4: (otherlv_1= RULE_ID )
            {
            // InternalGameDSL.g:496:4: (otherlv_1= RULE_ID )
            // InternalGameDSL.g:497:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlacementRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(otherlv_1, grammarAccess.getPlacementAccess().getPiecePieceCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getPlacementAccess().getAtKeyword_2());
            		
            // InternalGameDSL.g:512:3: ( (lv_range_3_0= ruleCoordinateRange ) )
            // InternalGameDSL.g:513:4: (lv_range_3_0= ruleCoordinateRange )
            {
            // InternalGameDSL.g:513:4: (lv_range_3_0= ruleCoordinateRange )
            // InternalGameDSL.g:514:5: lv_range_3_0= ruleCoordinateRange
            {

            					newCompositeNode(grammarAccess.getPlacementAccess().getRangeCoordinateRangeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_14);
            lv_range_3_0=ruleCoordinateRange();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPlacementRule());
            					}
            					set(
            						current,
            						"range",
            						lv_range_3_0,
            						"edu.example.gamedsl.GameDSL.CoordinateRange");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,23,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getPlacementAccess().getForKeyword_4());
            		
            // InternalGameDSL.g:535:3: ( (lv_owner_5_0= RULE_STRING ) )
            // InternalGameDSL.g:536:4: (lv_owner_5_0= RULE_STRING )
            {
            // InternalGameDSL.g:536:4: (lv_owner_5_0= RULE_STRING )
            // InternalGameDSL.g:537:5: lv_owner_5_0= RULE_STRING
            {
            lv_owner_5_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_owner_5_0, grammarAccess.getPlacementAccess().getOwnerSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlacementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"owner",
            						lv_owner_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePlacement"


    // $ANTLR start "entryRuleMove"
    // InternalGameDSL.g:557:1: entryRuleMove returns [EObject current=null] : iv_ruleMove= ruleMove EOF ;
    public final EObject entryRuleMove() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMove = null;


        try {
            // InternalGameDSL.g:557:45: (iv_ruleMove= ruleMove EOF )
            // InternalGameDSL.g:558:2: iv_ruleMove= ruleMove EOF
            {
             newCompositeNode(grammarAccess.getMoveRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMove=ruleMove();

            state._fsp--;

             current =iv_ruleMove; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMove"


    // $ANTLR start "ruleMove"
    // InternalGameDSL.g:564:1: ruleMove returns [EObject current=null] : (otherlv_0= 'move' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'direction' ( (lv_direction_3_0= RULE_STRING ) ) ( (lv_steps_4_0= RULE_INT ) ) (otherlv_5= 'if' ( (lv_condition_6_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleMove() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_direction_3_0=null;
        Token lv_steps_4_0=null;
        Token otherlv_5=null;
        Token lv_condition_6_0=null;


        	enterRule();

        try {
            // InternalGameDSL.g:570:2: ( (otherlv_0= 'move' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'direction' ( (lv_direction_3_0= RULE_STRING ) ) ( (lv_steps_4_0= RULE_INT ) ) (otherlv_5= 'if' ( (lv_condition_6_0= RULE_STRING ) ) )? ) )
            // InternalGameDSL.g:571:2: (otherlv_0= 'move' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'direction' ( (lv_direction_3_0= RULE_STRING ) ) ( (lv_steps_4_0= RULE_INT ) ) (otherlv_5= 'if' ( (lv_condition_6_0= RULE_STRING ) ) )? )
            {
            // InternalGameDSL.g:571:2: (otherlv_0= 'move' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'direction' ( (lv_direction_3_0= RULE_STRING ) ) ( (lv_steps_4_0= RULE_INT ) ) (otherlv_5= 'if' ( (lv_condition_6_0= RULE_STRING ) ) )? )
            // InternalGameDSL.g:572:3: otherlv_0= 'move' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'direction' ( (lv_direction_3_0= RULE_STRING ) ) ( (lv_steps_4_0= RULE_INT ) ) (otherlv_5= 'if' ( (lv_condition_6_0= RULE_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,24,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getMoveAccess().getMoveKeyword_0());
            		
            // InternalGameDSL.g:576:3: ( (otherlv_1= RULE_ID ) )
            // InternalGameDSL.g:577:4: (otherlv_1= RULE_ID )
            {
            // InternalGameDSL.g:577:4: (otherlv_1= RULE_ID )
            // InternalGameDSL.g:578:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMoveRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(otherlv_1, grammarAccess.getMoveAccess().getPiecePieceCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getMoveAccess().getDirectionKeyword_2());
            		
            // InternalGameDSL.g:593:3: ( (lv_direction_3_0= RULE_STRING ) )
            // InternalGameDSL.g:594:4: (lv_direction_3_0= RULE_STRING )
            {
            // InternalGameDSL.g:594:4: (lv_direction_3_0= RULE_STRING )
            // InternalGameDSL.g:595:5: lv_direction_3_0= RULE_STRING
            {
            lv_direction_3_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            					newLeafNode(lv_direction_3_0, grammarAccess.getMoveAccess().getDirectionSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMoveRule());
            					}
            					setWithLastConsumed(
            						current,
            						"direction",
            						lv_direction_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalGameDSL.g:611:3: ( (lv_steps_4_0= RULE_INT ) )
            // InternalGameDSL.g:612:4: (lv_steps_4_0= RULE_INT )
            {
            // InternalGameDSL.g:612:4: (lv_steps_4_0= RULE_INT )
            // InternalGameDSL.g:613:5: lv_steps_4_0= RULE_INT
            {
            lv_steps_4_0=(Token)match(input,RULE_INT,FOLLOW_16); 

            					newLeafNode(lv_steps_4_0, grammarAccess.getMoveAccess().getStepsINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMoveRule());
            					}
            					setWithLastConsumed(
            						current,
            						"steps",
            						lv_steps_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalGameDSL.g:629:3: (otherlv_5= 'if' ( (lv_condition_6_0= RULE_STRING ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==26) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalGameDSL.g:630:4: otherlv_5= 'if' ( (lv_condition_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,26,FOLLOW_6); 

                    				newLeafNode(otherlv_5, grammarAccess.getMoveAccess().getIfKeyword_5_0());
                    			
                    // InternalGameDSL.g:634:4: ( (lv_condition_6_0= RULE_STRING ) )
                    // InternalGameDSL.g:635:5: (lv_condition_6_0= RULE_STRING )
                    {
                    // InternalGameDSL.g:635:5: (lv_condition_6_0= RULE_STRING )
                    // InternalGameDSL.g:636:6: lv_condition_6_0= RULE_STRING
                    {
                    lv_condition_6_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_condition_6_0, grammarAccess.getMoveAccess().getConditionSTRINGTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMoveRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"condition",
                    							lv_condition_6_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMove"


    // $ANTLR start "entryRuleRule"
    // InternalGameDSL.g:657:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalGameDSL.g:657:45: (iv_ruleRule= ruleRule EOF )
            // InternalGameDSL.g:658:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalGameDSL.g:664:1: ruleRule returns [EObject current=null] : (otherlv_0= 'rule' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'if' ( (lv_condition_3_0= RULE_STRING ) ) otherlv_4= 'then' ( (lv_action_5_0= RULE_STRING ) ) ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_condition_3_0=null;
        Token otherlv_4=null;
        Token lv_action_5_0=null;


        	enterRule();

        try {
            // InternalGameDSL.g:670:2: ( (otherlv_0= 'rule' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'if' ( (lv_condition_3_0= RULE_STRING ) ) otherlv_4= 'then' ( (lv_action_5_0= RULE_STRING ) ) ) )
            // InternalGameDSL.g:671:2: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'if' ( (lv_condition_3_0= RULE_STRING ) ) otherlv_4= 'then' ( (lv_action_5_0= RULE_STRING ) ) )
            {
            // InternalGameDSL.g:671:2: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'if' ( (lv_condition_3_0= RULE_STRING ) ) otherlv_4= 'then' ( (lv_action_5_0= RULE_STRING ) ) )
            // InternalGameDSL.g:672:3: otherlv_0= 'rule' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'if' ( (lv_condition_3_0= RULE_STRING ) ) otherlv_4= 'then' ( (lv_action_5_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getRuleKeyword_0());
            		
            // InternalGameDSL.g:676:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalGameDSL.g:677:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalGameDSL.g:677:4: (lv_name_1_0= RULE_STRING )
            // InternalGameDSL.g:678:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRuleAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRuleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,26,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getRuleAccess().getIfKeyword_2());
            		
            // InternalGameDSL.g:698:3: ( (lv_condition_3_0= RULE_STRING ) )
            // InternalGameDSL.g:699:4: (lv_condition_3_0= RULE_STRING )
            {
            // InternalGameDSL.g:699:4: (lv_condition_3_0= RULE_STRING )
            // InternalGameDSL.g:700:5: lv_condition_3_0= RULE_STRING
            {
            lv_condition_3_0=(Token)match(input,RULE_STRING,FOLLOW_18); 

            					newLeafNode(lv_condition_3_0, grammarAccess.getRuleAccess().getConditionSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRuleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"condition",
            						lv_condition_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,28,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getRuleAccess().getThenKeyword_4());
            		
            // InternalGameDSL.g:720:3: ( (lv_action_5_0= RULE_STRING ) )
            // InternalGameDSL.g:721:4: (lv_action_5_0= RULE_STRING )
            {
            // InternalGameDSL.g:721:4: (lv_action_5_0= RULE_STRING )
            // InternalGameDSL.g:722:5: lv_action_5_0= RULE_STRING
            {
            lv_action_5_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_action_5_0, grammarAccess.getRuleAccess().getActionSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRuleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"action",
            						lv_action_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleWinCondition"
    // InternalGameDSL.g:742:1: entryRuleWinCondition returns [EObject current=null] : iv_ruleWinCondition= ruleWinCondition EOF ;
    public final EObject entryRuleWinCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWinCondition = null;


        try {
            // InternalGameDSL.g:742:53: (iv_ruleWinCondition= ruleWinCondition EOF )
            // InternalGameDSL.g:743:2: iv_ruleWinCondition= ruleWinCondition EOF
            {
             newCompositeNode(grammarAccess.getWinConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWinCondition=ruleWinCondition();

            state._fsp--;

             current =iv_ruleWinCondition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWinCondition"


    // $ANTLR start "ruleWinCondition"
    // InternalGameDSL.g:749:1: ruleWinCondition returns [EObject current=null] : (otherlv_0= 'win_condition' otherlv_1= 'if' ( (lv_condition_2_0= RULE_STRING ) ) otherlv_3= 'then' otherlv_4= 'winner' otherlv_5= '=' ( (lv_winner_6_0= RULE_STRING ) ) ) ;
    public final EObject ruleWinCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_condition_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_winner_6_0=null;


        	enterRule();

        try {
            // InternalGameDSL.g:755:2: ( (otherlv_0= 'win_condition' otherlv_1= 'if' ( (lv_condition_2_0= RULE_STRING ) ) otherlv_3= 'then' otherlv_4= 'winner' otherlv_5= '=' ( (lv_winner_6_0= RULE_STRING ) ) ) )
            // InternalGameDSL.g:756:2: (otherlv_0= 'win_condition' otherlv_1= 'if' ( (lv_condition_2_0= RULE_STRING ) ) otherlv_3= 'then' otherlv_4= 'winner' otherlv_5= '=' ( (lv_winner_6_0= RULE_STRING ) ) )
            {
            // InternalGameDSL.g:756:2: (otherlv_0= 'win_condition' otherlv_1= 'if' ( (lv_condition_2_0= RULE_STRING ) ) otherlv_3= 'then' otherlv_4= 'winner' otherlv_5= '=' ( (lv_winner_6_0= RULE_STRING ) ) )
            // InternalGameDSL.g:757:3: otherlv_0= 'win_condition' otherlv_1= 'if' ( (lv_condition_2_0= RULE_STRING ) ) otherlv_3= 'then' otherlv_4= 'winner' otherlv_5= '=' ( (lv_winner_6_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getWinConditionAccess().getWin_conditionKeyword_0());
            		
            otherlv_1=(Token)match(input,26,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getWinConditionAccess().getIfKeyword_1());
            		
            // InternalGameDSL.g:765:3: ( (lv_condition_2_0= RULE_STRING ) )
            // InternalGameDSL.g:766:4: (lv_condition_2_0= RULE_STRING )
            {
            // InternalGameDSL.g:766:4: (lv_condition_2_0= RULE_STRING )
            // InternalGameDSL.g:767:5: lv_condition_2_0= RULE_STRING
            {
            lv_condition_2_0=(Token)match(input,RULE_STRING,FOLLOW_18); 

            					newLeafNode(lv_condition_2_0, grammarAccess.getWinConditionAccess().getConditionSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWinConditionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"condition",
            						lv_condition_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,28,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getWinConditionAccess().getThenKeyword_3());
            		
            otherlv_4=(Token)match(input,30,FOLLOW_20); 

            			newLeafNode(otherlv_4, grammarAccess.getWinConditionAccess().getWinnerKeyword_4());
            		
            otherlv_5=(Token)match(input,31,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getWinConditionAccess().getEqualsSignKeyword_5());
            		
            // InternalGameDSL.g:795:3: ( (lv_winner_6_0= RULE_STRING ) )
            // InternalGameDSL.g:796:4: (lv_winner_6_0= RULE_STRING )
            {
            // InternalGameDSL.g:796:4: (lv_winner_6_0= RULE_STRING )
            // InternalGameDSL.g:797:5: lv_winner_6_0= RULE_STRING
            {
            lv_winner_6_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_winner_6_0, grammarAccess.getWinConditionAccess().getWinnerSTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWinConditionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"winner",
            						lv_winner_6_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWinCondition"


    // $ANTLR start "entryRuleCoordinateRange"
    // InternalGameDSL.g:817:1: entryRuleCoordinateRange returns [EObject current=null] : iv_ruleCoordinateRange= ruleCoordinateRange EOF ;
    public final EObject entryRuleCoordinateRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCoordinateRange = null;


        try {
            // InternalGameDSL.g:817:56: (iv_ruleCoordinateRange= ruleCoordinateRange EOF )
            // InternalGameDSL.g:818:2: iv_ruleCoordinateRange= ruleCoordinateRange EOF
            {
             newCompositeNode(grammarAccess.getCoordinateRangeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCoordinateRange=ruleCoordinateRange();

            state._fsp--;

             current =iv_ruleCoordinateRange; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCoordinateRange"


    // $ANTLR start "ruleCoordinateRange"
    // InternalGameDSL.g:824:1: ruleCoordinateRange returns [EObject current=null] : (otherlv_0= '[' ( (lv_startRow_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_startCol_3_0= RULE_INT ) ) otherlv_4= ']' otherlv_5= '-' otherlv_6= '[' ( (lv_endRow_7_0= RULE_INT ) ) otherlv_8= ',' ( (lv_endCol_9_0= RULE_INT ) ) otherlv_10= ']' ) ;
    public final EObject ruleCoordinateRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_startRow_1_0=null;
        Token otherlv_2=null;
        Token lv_startCol_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_endRow_7_0=null;
        Token otherlv_8=null;
        Token lv_endCol_9_0=null;
        Token otherlv_10=null;


        	enterRule();

        try {
            // InternalGameDSL.g:830:2: ( (otherlv_0= '[' ( (lv_startRow_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_startCol_3_0= RULE_INT ) ) otherlv_4= ']' otherlv_5= '-' otherlv_6= '[' ( (lv_endRow_7_0= RULE_INT ) ) otherlv_8= ',' ( (lv_endCol_9_0= RULE_INT ) ) otherlv_10= ']' ) )
            // InternalGameDSL.g:831:2: (otherlv_0= '[' ( (lv_startRow_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_startCol_3_0= RULE_INT ) ) otherlv_4= ']' otherlv_5= '-' otherlv_6= '[' ( (lv_endRow_7_0= RULE_INT ) ) otherlv_8= ',' ( (lv_endCol_9_0= RULE_INT ) ) otherlv_10= ']' )
            {
            // InternalGameDSL.g:831:2: (otherlv_0= '[' ( (lv_startRow_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_startCol_3_0= RULE_INT ) ) otherlv_4= ']' otherlv_5= '-' otherlv_6= '[' ( (lv_endRow_7_0= RULE_INT ) ) otherlv_8= ',' ( (lv_endCol_9_0= RULE_INT ) ) otherlv_10= ']' )
            // InternalGameDSL.g:832:3: otherlv_0= '[' ( (lv_startRow_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_startCol_3_0= RULE_INT ) ) otherlv_4= ']' otherlv_5= '-' otherlv_6= '[' ( (lv_endRow_7_0= RULE_INT ) ) otherlv_8= ',' ( (lv_endCol_9_0= RULE_INT ) ) otherlv_10= ']'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getCoordinateRangeAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalGameDSL.g:836:3: ( (lv_startRow_1_0= RULE_INT ) )
            // InternalGameDSL.g:837:4: (lv_startRow_1_0= RULE_INT )
            {
            // InternalGameDSL.g:837:4: (lv_startRow_1_0= RULE_INT )
            // InternalGameDSL.g:838:5: lv_startRow_1_0= RULE_INT
            {
            lv_startRow_1_0=(Token)match(input,RULE_INT,FOLLOW_21); 

            					newLeafNode(lv_startRow_1_0, grammarAccess.getCoordinateRangeAccess().getStartRowINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCoordinateRangeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"startRow",
            						lv_startRow_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getCoordinateRangeAccess().getCommaKeyword_2());
            		
            // InternalGameDSL.g:858:3: ( (lv_startCol_3_0= RULE_INT ) )
            // InternalGameDSL.g:859:4: (lv_startCol_3_0= RULE_INT )
            {
            // InternalGameDSL.g:859:4: (lv_startCol_3_0= RULE_INT )
            // InternalGameDSL.g:860:5: lv_startCol_3_0= RULE_INT
            {
            lv_startCol_3_0=(Token)match(input,RULE_INT,FOLLOW_22); 

            					newLeafNode(lv_startCol_3_0, grammarAccess.getCoordinateRangeAccess().getStartColINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCoordinateRangeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"startCol",
            						lv_startCol_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_23); 

            			newLeafNode(otherlv_4, grammarAccess.getCoordinateRangeAccess().getRightSquareBracketKeyword_4());
            		
            otherlv_5=(Token)match(input,32,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getCoordinateRangeAccess().getHyphenMinusKeyword_5());
            		
            otherlv_6=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_6, grammarAccess.getCoordinateRangeAccess().getLeftSquareBracketKeyword_6());
            		
            // InternalGameDSL.g:888:3: ( (lv_endRow_7_0= RULE_INT ) )
            // InternalGameDSL.g:889:4: (lv_endRow_7_0= RULE_INT )
            {
            // InternalGameDSL.g:889:4: (lv_endRow_7_0= RULE_INT )
            // InternalGameDSL.g:890:5: lv_endRow_7_0= RULE_INT
            {
            lv_endRow_7_0=(Token)match(input,RULE_INT,FOLLOW_21); 

            					newLeafNode(lv_endRow_7_0, grammarAccess.getCoordinateRangeAccess().getEndRowINTTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCoordinateRangeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"endRow",
            						lv_endRow_7_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_8=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_8, grammarAccess.getCoordinateRangeAccess().getCommaKeyword_8());
            		
            // InternalGameDSL.g:910:3: ( (lv_endCol_9_0= RULE_INT ) )
            // InternalGameDSL.g:911:4: (lv_endCol_9_0= RULE_INT )
            {
            // InternalGameDSL.g:911:4: (lv_endCol_9_0= RULE_INT )
            // InternalGameDSL.g:912:5: lv_endCol_9_0= RULE_INT
            {
            lv_endCol_9_0=(Token)match(input,RULE_INT,FOLLOW_22); 

            					newLeafNode(lv_endCol_9_0, grammarAccess.getCoordinateRangeAccess().getEndColINTTerminalRuleCall_9_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCoordinateRangeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"endCol",
            						lv_endCol_9_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_10=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getCoordinateRangeAccess().getRightSquareBracketKeyword_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCoordinateRange"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000029246802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000100000000L});

}