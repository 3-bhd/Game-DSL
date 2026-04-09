package edu.example.gamedsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import edu.example.gamedsl.services.GameDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGameDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'board'", "'x'", "'player'", "'turn_order'", "'['", "']'", "','", "'piece'", "'symbol'", "'owner'", "'place'", "'at'", "'for'", "'move'", "'direction'", "'if'", "'rule'", "'then'", "'win_condition'", "'winner'", "'='", "'-'"
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

    	public void setGrammarAccess(GameDSLGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalGameDSL.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalGameDSL.g:54:1: ( ruleModel EOF )
            // InternalGameDSL.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalGameDSL.g:62:1: ruleModel : ( ( rule__Model__StatementsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:66:2: ( ( ( rule__Model__StatementsAssignment )* ) )
            // InternalGameDSL.g:67:2: ( ( rule__Model__StatementsAssignment )* )
            {
            // InternalGameDSL.g:67:2: ( ( rule__Model__StatementsAssignment )* )
            // InternalGameDSL.g:68:3: ( rule__Model__StatementsAssignment )*
            {
             before(grammarAccess.getModelAccess().getStatementsAssignment()); 
            // InternalGameDSL.g:69:3: ( rule__Model__StatementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||(LA1_0>=13 && LA1_0<=14)||LA1_0==18||LA1_0==21||LA1_0==24||LA1_0==27||LA1_0==29) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalGameDSL.g:69:4: rule__Model__StatementsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__StatementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getStatementsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleStatement"
    // InternalGameDSL.g:78:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalGameDSL.g:79:1: ( ruleStatement EOF )
            // InternalGameDSL.g:80:1: ruleStatement EOF
            {
             before(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalGameDSL.g:87:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:91:2: ( ( ( rule__Statement__Alternatives ) ) )
            // InternalGameDSL.g:92:2: ( ( rule__Statement__Alternatives ) )
            {
            // InternalGameDSL.g:92:2: ( ( rule__Statement__Alternatives ) )
            // InternalGameDSL.g:93:3: ( rule__Statement__Alternatives )
            {
             before(grammarAccess.getStatementAccess().getAlternatives()); 
            // InternalGameDSL.g:94:3: ( rule__Statement__Alternatives )
            // InternalGameDSL.g:94:4: rule__Statement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleBoard"
    // InternalGameDSL.g:103:1: entryRuleBoard : ruleBoard EOF ;
    public final void entryRuleBoard() throws RecognitionException {
        try {
            // InternalGameDSL.g:104:1: ( ruleBoard EOF )
            // InternalGameDSL.g:105:1: ruleBoard EOF
            {
             before(grammarAccess.getBoardRule()); 
            pushFollow(FOLLOW_1);
            ruleBoard();

            state._fsp--;

             after(grammarAccess.getBoardRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBoard"


    // $ANTLR start "ruleBoard"
    // InternalGameDSL.g:112:1: ruleBoard : ( ( rule__Board__Group__0 ) ) ;
    public final void ruleBoard() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:116:2: ( ( ( rule__Board__Group__0 ) ) )
            // InternalGameDSL.g:117:2: ( ( rule__Board__Group__0 ) )
            {
            // InternalGameDSL.g:117:2: ( ( rule__Board__Group__0 ) )
            // InternalGameDSL.g:118:3: ( rule__Board__Group__0 )
            {
             before(grammarAccess.getBoardAccess().getGroup()); 
            // InternalGameDSL.g:119:3: ( rule__Board__Group__0 )
            // InternalGameDSL.g:119:4: rule__Board__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Board__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBoardAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBoard"


    // $ANTLR start "entryRulePlayer"
    // InternalGameDSL.g:128:1: entryRulePlayer : rulePlayer EOF ;
    public final void entryRulePlayer() throws RecognitionException {
        try {
            // InternalGameDSL.g:129:1: ( rulePlayer EOF )
            // InternalGameDSL.g:130:1: rulePlayer EOF
            {
             before(grammarAccess.getPlayerRule()); 
            pushFollow(FOLLOW_1);
            rulePlayer();

            state._fsp--;

             after(grammarAccess.getPlayerRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePlayer"


    // $ANTLR start "rulePlayer"
    // InternalGameDSL.g:137:1: rulePlayer : ( ( rule__Player__Group__0 ) ) ;
    public final void rulePlayer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:141:2: ( ( ( rule__Player__Group__0 ) ) )
            // InternalGameDSL.g:142:2: ( ( rule__Player__Group__0 ) )
            {
            // InternalGameDSL.g:142:2: ( ( rule__Player__Group__0 ) )
            // InternalGameDSL.g:143:3: ( rule__Player__Group__0 )
            {
             before(grammarAccess.getPlayerAccess().getGroup()); 
            // InternalGameDSL.g:144:3: ( rule__Player__Group__0 )
            // InternalGameDSL.g:144:4: rule__Player__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Player__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPlayerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePlayer"


    // $ANTLR start "entryRuleTurnOrder"
    // InternalGameDSL.g:153:1: entryRuleTurnOrder : ruleTurnOrder EOF ;
    public final void entryRuleTurnOrder() throws RecognitionException {
        try {
            // InternalGameDSL.g:154:1: ( ruleTurnOrder EOF )
            // InternalGameDSL.g:155:1: ruleTurnOrder EOF
            {
             before(grammarAccess.getTurnOrderRule()); 
            pushFollow(FOLLOW_1);
            ruleTurnOrder();

            state._fsp--;

             after(grammarAccess.getTurnOrderRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTurnOrder"


    // $ANTLR start "ruleTurnOrder"
    // InternalGameDSL.g:162:1: ruleTurnOrder : ( ( rule__TurnOrder__Group__0 ) ) ;
    public final void ruleTurnOrder() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:166:2: ( ( ( rule__TurnOrder__Group__0 ) ) )
            // InternalGameDSL.g:167:2: ( ( rule__TurnOrder__Group__0 ) )
            {
            // InternalGameDSL.g:167:2: ( ( rule__TurnOrder__Group__0 ) )
            // InternalGameDSL.g:168:3: ( rule__TurnOrder__Group__0 )
            {
             before(grammarAccess.getTurnOrderAccess().getGroup()); 
            // InternalGameDSL.g:169:3: ( rule__TurnOrder__Group__0 )
            // InternalGameDSL.g:169:4: rule__TurnOrder__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TurnOrder__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTurnOrderAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTurnOrder"


    // $ANTLR start "entryRulePiece"
    // InternalGameDSL.g:178:1: entryRulePiece : rulePiece EOF ;
    public final void entryRulePiece() throws RecognitionException {
        try {
            // InternalGameDSL.g:179:1: ( rulePiece EOF )
            // InternalGameDSL.g:180:1: rulePiece EOF
            {
             before(grammarAccess.getPieceRule()); 
            pushFollow(FOLLOW_1);
            rulePiece();

            state._fsp--;

             after(grammarAccess.getPieceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePiece"


    // $ANTLR start "rulePiece"
    // InternalGameDSL.g:187:1: rulePiece : ( ( rule__Piece__Group__0 ) ) ;
    public final void rulePiece() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:191:2: ( ( ( rule__Piece__Group__0 ) ) )
            // InternalGameDSL.g:192:2: ( ( rule__Piece__Group__0 ) )
            {
            // InternalGameDSL.g:192:2: ( ( rule__Piece__Group__0 ) )
            // InternalGameDSL.g:193:3: ( rule__Piece__Group__0 )
            {
             before(grammarAccess.getPieceAccess().getGroup()); 
            // InternalGameDSL.g:194:3: ( rule__Piece__Group__0 )
            // InternalGameDSL.g:194:4: rule__Piece__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Piece__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPieceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePiece"


    // $ANTLR start "entryRulePlacement"
    // InternalGameDSL.g:203:1: entryRulePlacement : rulePlacement EOF ;
    public final void entryRulePlacement() throws RecognitionException {
        try {
            // InternalGameDSL.g:204:1: ( rulePlacement EOF )
            // InternalGameDSL.g:205:1: rulePlacement EOF
            {
             before(grammarAccess.getPlacementRule()); 
            pushFollow(FOLLOW_1);
            rulePlacement();

            state._fsp--;

             after(grammarAccess.getPlacementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePlacement"


    // $ANTLR start "rulePlacement"
    // InternalGameDSL.g:212:1: rulePlacement : ( ( rule__Placement__Group__0 ) ) ;
    public final void rulePlacement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:216:2: ( ( ( rule__Placement__Group__0 ) ) )
            // InternalGameDSL.g:217:2: ( ( rule__Placement__Group__0 ) )
            {
            // InternalGameDSL.g:217:2: ( ( rule__Placement__Group__0 ) )
            // InternalGameDSL.g:218:3: ( rule__Placement__Group__0 )
            {
             before(grammarAccess.getPlacementAccess().getGroup()); 
            // InternalGameDSL.g:219:3: ( rule__Placement__Group__0 )
            // InternalGameDSL.g:219:4: rule__Placement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Placement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPlacementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePlacement"


    // $ANTLR start "entryRuleMove"
    // InternalGameDSL.g:228:1: entryRuleMove : ruleMove EOF ;
    public final void entryRuleMove() throws RecognitionException {
        try {
            // InternalGameDSL.g:229:1: ( ruleMove EOF )
            // InternalGameDSL.g:230:1: ruleMove EOF
            {
             before(grammarAccess.getMoveRule()); 
            pushFollow(FOLLOW_1);
            ruleMove();

            state._fsp--;

             after(grammarAccess.getMoveRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMove"


    // $ANTLR start "ruleMove"
    // InternalGameDSL.g:237:1: ruleMove : ( ( rule__Move__Group__0 ) ) ;
    public final void ruleMove() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:241:2: ( ( ( rule__Move__Group__0 ) ) )
            // InternalGameDSL.g:242:2: ( ( rule__Move__Group__0 ) )
            {
            // InternalGameDSL.g:242:2: ( ( rule__Move__Group__0 ) )
            // InternalGameDSL.g:243:3: ( rule__Move__Group__0 )
            {
             before(grammarAccess.getMoveAccess().getGroup()); 
            // InternalGameDSL.g:244:3: ( rule__Move__Group__0 )
            // InternalGameDSL.g:244:4: rule__Move__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Move__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMoveAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMove"


    // $ANTLR start "entryRuleRule"
    // InternalGameDSL.g:253:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // InternalGameDSL.g:254:1: ( ruleRule EOF )
            // InternalGameDSL.g:255:1: ruleRule EOF
            {
             before(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getRuleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalGameDSL.g:262:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:266:2: ( ( ( rule__Rule__Group__0 ) ) )
            // InternalGameDSL.g:267:2: ( ( rule__Rule__Group__0 ) )
            {
            // InternalGameDSL.g:267:2: ( ( rule__Rule__Group__0 ) )
            // InternalGameDSL.g:268:3: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // InternalGameDSL.g:269:3: ( rule__Rule__Group__0 )
            // InternalGameDSL.g:269:4: rule__Rule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleWinCondition"
    // InternalGameDSL.g:278:1: entryRuleWinCondition : ruleWinCondition EOF ;
    public final void entryRuleWinCondition() throws RecognitionException {
        try {
            // InternalGameDSL.g:279:1: ( ruleWinCondition EOF )
            // InternalGameDSL.g:280:1: ruleWinCondition EOF
            {
             before(grammarAccess.getWinConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleWinCondition();

            state._fsp--;

             after(grammarAccess.getWinConditionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWinCondition"


    // $ANTLR start "ruleWinCondition"
    // InternalGameDSL.g:287:1: ruleWinCondition : ( ( rule__WinCondition__Group__0 ) ) ;
    public final void ruleWinCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:291:2: ( ( ( rule__WinCondition__Group__0 ) ) )
            // InternalGameDSL.g:292:2: ( ( rule__WinCondition__Group__0 ) )
            {
            // InternalGameDSL.g:292:2: ( ( rule__WinCondition__Group__0 ) )
            // InternalGameDSL.g:293:3: ( rule__WinCondition__Group__0 )
            {
             before(grammarAccess.getWinConditionAccess().getGroup()); 
            // InternalGameDSL.g:294:3: ( rule__WinCondition__Group__0 )
            // InternalGameDSL.g:294:4: rule__WinCondition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WinCondition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWinConditionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWinCondition"


    // $ANTLR start "entryRuleCoordinateRange"
    // InternalGameDSL.g:303:1: entryRuleCoordinateRange : ruleCoordinateRange EOF ;
    public final void entryRuleCoordinateRange() throws RecognitionException {
        try {
            // InternalGameDSL.g:304:1: ( ruleCoordinateRange EOF )
            // InternalGameDSL.g:305:1: ruleCoordinateRange EOF
            {
             before(grammarAccess.getCoordinateRangeRule()); 
            pushFollow(FOLLOW_1);
            ruleCoordinateRange();

            state._fsp--;

             after(grammarAccess.getCoordinateRangeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCoordinateRange"


    // $ANTLR start "ruleCoordinateRange"
    // InternalGameDSL.g:312:1: ruleCoordinateRange : ( ( rule__CoordinateRange__Group__0 ) ) ;
    public final void ruleCoordinateRange() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:316:2: ( ( ( rule__CoordinateRange__Group__0 ) ) )
            // InternalGameDSL.g:317:2: ( ( rule__CoordinateRange__Group__0 ) )
            {
            // InternalGameDSL.g:317:2: ( ( rule__CoordinateRange__Group__0 ) )
            // InternalGameDSL.g:318:3: ( rule__CoordinateRange__Group__0 )
            {
             before(grammarAccess.getCoordinateRangeAccess().getGroup()); 
            // InternalGameDSL.g:319:3: ( rule__CoordinateRange__Group__0 )
            // InternalGameDSL.g:319:4: rule__CoordinateRange__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CoordinateRange__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCoordinateRangeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCoordinateRange"


    // $ANTLR start "rule__Statement__Alternatives"
    // InternalGameDSL.g:327:1: rule__Statement__Alternatives : ( ( ruleBoard ) | ( rulePlayer ) | ( ruleTurnOrder ) | ( rulePiece ) | ( rulePlacement ) | ( ruleMove ) | ( ruleRule ) | ( ruleWinCondition ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:331:1: ( ( ruleBoard ) | ( rulePlayer ) | ( ruleTurnOrder ) | ( rulePiece ) | ( rulePlacement ) | ( ruleMove ) | ( ruleRule ) | ( ruleWinCondition ) )
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
                    // InternalGameDSL.g:332:2: ( ruleBoard )
                    {
                    // InternalGameDSL.g:332:2: ( ruleBoard )
                    // InternalGameDSL.g:333:3: ruleBoard
                    {
                     before(grammarAccess.getStatementAccess().getBoardParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleBoard();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getBoardParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGameDSL.g:338:2: ( rulePlayer )
                    {
                    // InternalGameDSL.g:338:2: ( rulePlayer )
                    // InternalGameDSL.g:339:3: rulePlayer
                    {
                     before(grammarAccess.getStatementAccess().getPlayerParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    rulePlayer();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getPlayerParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGameDSL.g:344:2: ( ruleTurnOrder )
                    {
                    // InternalGameDSL.g:344:2: ( ruleTurnOrder )
                    // InternalGameDSL.g:345:3: ruleTurnOrder
                    {
                     before(grammarAccess.getStatementAccess().getTurnOrderParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleTurnOrder();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getTurnOrderParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalGameDSL.g:350:2: ( rulePiece )
                    {
                    // InternalGameDSL.g:350:2: ( rulePiece )
                    // InternalGameDSL.g:351:3: rulePiece
                    {
                     before(grammarAccess.getStatementAccess().getPieceParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    rulePiece();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getPieceParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalGameDSL.g:356:2: ( rulePlacement )
                    {
                    // InternalGameDSL.g:356:2: ( rulePlacement )
                    // InternalGameDSL.g:357:3: rulePlacement
                    {
                     before(grammarAccess.getStatementAccess().getPlacementParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    rulePlacement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getPlacementParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalGameDSL.g:362:2: ( ruleMove )
                    {
                    // InternalGameDSL.g:362:2: ( ruleMove )
                    // InternalGameDSL.g:363:3: ruleMove
                    {
                     before(grammarAccess.getStatementAccess().getMoveParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleMove();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getMoveParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalGameDSL.g:368:2: ( ruleRule )
                    {
                    // InternalGameDSL.g:368:2: ( ruleRule )
                    // InternalGameDSL.g:369:3: ruleRule
                    {
                     before(grammarAccess.getStatementAccess().getRuleParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleRule();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getRuleParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalGameDSL.g:374:2: ( ruleWinCondition )
                    {
                    // InternalGameDSL.g:374:2: ( ruleWinCondition )
                    // InternalGameDSL.g:375:3: ruleWinCondition
                    {
                     before(grammarAccess.getStatementAccess().getWinConditionParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleWinCondition();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getWinConditionParserRuleCall_7()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Alternatives"


    // $ANTLR start "rule__Board__Group__0"
    // InternalGameDSL.g:384:1: rule__Board__Group__0 : rule__Board__Group__0__Impl rule__Board__Group__1 ;
    public final void rule__Board__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:388:1: ( rule__Board__Group__0__Impl rule__Board__Group__1 )
            // InternalGameDSL.g:389:2: rule__Board__Group__0__Impl rule__Board__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Board__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Board__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group__0"


    // $ANTLR start "rule__Board__Group__0__Impl"
    // InternalGameDSL.g:396:1: rule__Board__Group__0__Impl : ( 'board' ) ;
    public final void rule__Board__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:400:1: ( ( 'board' ) )
            // InternalGameDSL.g:401:1: ( 'board' )
            {
            // InternalGameDSL.g:401:1: ( 'board' )
            // InternalGameDSL.g:402:2: 'board'
            {
             before(grammarAccess.getBoardAccess().getBoardKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getBoardAccess().getBoardKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group__0__Impl"


    // $ANTLR start "rule__Board__Group__1"
    // InternalGameDSL.g:411:1: rule__Board__Group__1 : rule__Board__Group__1__Impl rule__Board__Group__2 ;
    public final void rule__Board__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:415:1: ( rule__Board__Group__1__Impl rule__Board__Group__2 )
            // InternalGameDSL.g:416:2: rule__Board__Group__1__Impl rule__Board__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Board__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Board__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group__1"


    // $ANTLR start "rule__Board__Group__1__Impl"
    // InternalGameDSL.g:423:1: rule__Board__Group__1__Impl : ( ( rule__Board__RowsAssignment_1 ) ) ;
    public final void rule__Board__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:427:1: ( ( ( rule__Board__RowsAssignment_1 ) ) )
            // InternalGameDSL.g:428:1: ( ( rule__Board__RowsAssignment_1 ) )
            {
            // InternalGameDSL.g:428:1: ( ( rule__Board__RowsAssignment_1 ) )
            // InternalGameDSL.g:429:2: ( rule__Board__RowsAssignment_1 )
            {
             before(grammarAccess.getBoardAccess().getRowsAssignment_1()); 
            // InternalGameDSL.g:430:2: ( rule__Board__RowsAssignment_1 )
            // InternalGameDSL.g:430:3: rule__Board__RowsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Board__RowsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBoardAccess().getRowsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group__1__Impl"


    // $ANTLR start "rule__Board__Group__2"
    // InternalGameDSL.g:438:1: rule__Board__Group__2 : rule__Board__Group__2__Impl rule__Board__Group__3 ;
    public final void rule__Board__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:442:1: ( rule__Board__Group__2__Impl rule__Board__Group__3 )
            // InternalGameDSL.g:443:2: rule__Board__Group__2__Impl rule__Board__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Board__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Board__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group__2"


    // $ANTLR start "rule__Board__Group__2__Impl"
    // InternalGameDSL.g:450:1: rule__Board__Group__2__Impl : ( 'x' ) ;
    public final void rule__Board__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:454:1: ( ( 'x' ) )
            // InternalGameDSL.g:455:1: ( 'x' )
            {
            // InternalGameDSL.g:455:1: ( 'x' )
            // InternalGameDSL.g:456:2: 'x'
            {
             before(grammarAccess.getBoardAccess().getXKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getBoardAccess().getXKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group__2__Impl"


    // $ANTLR start "rule__Board__Group__3"
    // InternalGameDSL.g:465:1: rule__Board__Group__3 : rule__Board__Group__3__Impl ;
    public final void rule__Board__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:469:1: ( rule__Board__Group__3__Impl )
            // InternalGameDSL.g:470:2: rule__Board__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Board__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group__3"


    // $ANTLR start "rule__Board__Group__3__Impl"
    // InternalGameDSL.g:476:1: rule__Board__Group__3__Impl : ( ( rule__Board__ColsAssignment_3 ) ) ;
    public final void rule__Board__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:480:1: ( ( ( rule__Board__ColsAssignment_3 ) ) )
            // InternalGameDSL.g:481:1: ( ( rule__Board__ColsAssignment_3 ) )
            {
            // InternalGameDSL.g:481:1: ( ( rule__Board__ColsAssignment_3 ) )
            // InternalGameDSL.g:482:2: ( rule__Board__ColsAssignment_3 )
            {
             before(grammarAccess.getBoardAccess().getColsAssignment_3()); 
            // InternalGameDSL.g:483:2: ( rule__Board__ColsAssignment_3 )
            // InternalGameDSL.g:483:3: rule__Board__ColsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Board__ColsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getBoardAccess().getColsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group__3__Impl"


    // $ANTLR start "rule__Player__Group__0"
    // InternalGameDSL.g:492:1: rule__Player__Group__0 : rule__Player__Group__0__Impl rule__Player__Group__1 ;
    public final void rule__Player__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:496:1: ( rule__Player__Group__0__Impl rule__Player__Group__1 )
            // InternalGameDSL.g:497:2: rule__Player__Group__0__Impl rule__Player__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Player__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Player__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Player__Group__0"


    // $ANTLR start "rule__Player__Group__0__Impl"
    // InternalGameDSL.g:504:1: rule__Player__Group__0__Impl : ( 'player' ) ;
    public final void rule__Player__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:508:1: ( ( 'player' ) )
            // InternalGameDSL.g:509:1: ( 'player' )
            {
            // InternalGameDSL.g:509:1: ( 'player' )
            // InternalGameDSL.g:510:2: 'player'
            {
             before(grammarAccess.getPlayerAccess().getPlayerKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getPlayerAccess().getPlayerKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Player__Group__0__Impl"


    // $ANTLR start "rule__Player__Group__1"
    // InternalGameDSL.g:519:1: rule__Player__Group__1 : rule__Player__Group__1__Impl ;
    public final void rule__Player__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:523:1: ( rule__Player__Group__1__Impl )
            // InternalGameDSL.g:524:2: rule__Player__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Player__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Player__Group__1"


    // $ANTLR start "rule__Player__Group__1__Impl"
    // InternalGameDSL.g:530:1: rule__Player__Group__1__Impl : ( ( rule__Player__NameAssignment_1 ) ) ;
    public final void rule__Player__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:534:1: ( ( ( rule__Player__NameAssignment_1 ) ) )
            // InternalGameDSL.g:535:1: ( ( rule__Player__NameAssignment_1 ) )
            {
            // InternalGameDSL.g:535:1: ( ( rule__Player__NameAssignment_1 ) )
            // InternalGameDSL.g:536:2: ( rule__Player__NameAssignment_1 )
            {
             before(grammarAccess.getPlayerAccess().getNameAssignment_1()); 
            // InternalGameDSL.g:537:2: ( rule__Player__NameAssignment_1 )
            // InternalGameDSL.g:537:3: rule__Player__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Player__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPlayerAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Player__Group__1__Impl"


    // $ANTLR start "rule__TurnOrder__Group__0"
    // InternalGameDSL.g:546:1: rule__TurnOrder__Group__0 : rule__TurnOrder__Group__0__Impl rule__TurnOrder__Group__1 ;
    public final void rule__TurnOrder__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:550:1: ( rule__TurnOrder__Group__0__Impl rule__TurnOrder__Group__1 )
            // InternalGameDSL.g:551:2: rule__TurnOrder__Group__0__Impl rule__TurnOrder__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__TurnOrder__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TurnOrder__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnOrder__Group__0"


    // $ANTLR start "rule__TurnOrder__Group__0__Impl"
    // InternalGameDSL.g:558:1: rule__TurnOrder__Group__0__Impl : ( 'turn_order' ) ;
    public final void rule__TurnOrder__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:562:1: ( ( 'turn_order' ) )
            // InternalGameDSL.g:563:1: ( 'turn_order' )
            {
            // InternalGameDSL.g:563:1: ( 'turn_order' )
            // InternalGameDSL.g:564:2: 'turn_order'
            {
             before(grammarAccess.getTurnOrderAccess().getTurn_orderKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getTurnOrderAccess().getTurn_orderKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnOrder__Group__0__Impl"


    // $ANTLR start "rule__TurnOrder__Group__1"
    // InternalGameDSL.g:573:1: rule__TurnOrder__Group__1 : rule__TurnOrder__Group__1__Impl rule__TurnOrder__Group__2 ;
    public final void rule__TurnOrder__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:577:1: ( rule__TurnOrder__Group__1__Impl rule__TurnOrder__Group__2 )
            // InternalGameDSL.g:578:2: rule__TurnOrder__Group__1__Impl rule__TurnOrder__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__TurnOrder__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TurnOrder__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnOrder__Group__1"


    // $ANTLR start "rule__TurnOrder__Group__1__Impl"
    // InternalGameDSL.g:585:1: rule__TurnOrder__Group__1__Impl : ( '[' ) ;
    public final void rule__TurnOrder__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:589:1: ( ( '[' ) )
            // InternalGameDSL.g:590:1: ( '[' )
            {
            // InternalGameDSL.g:590:1: ( '[' )
            // InternalGameDSL.g:591:2: '['
            {
             before(grammarAccess.getTurnOrderAccess().getLeftSquareBracketKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getTurnOrderAccess().getLeftSquareBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnOrder__Group__1__Impl"


    // $ANTLR start "rule__TurnOrder__Group__2"
    // InternalGameDSL.g:600:1: rule__TurnOrder__Group__2 : rule__TurnOrder__Group__2__Impl rule__TurnOrder__Group__3 ;
    public final void rule__TurnOrder__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:604:1: ( rule__TurnOrder__Group__2__Impl rule__TurnOrder__Group__3 )
            // InternalGameDSL.g:605:2: rule__TurnOrder__Group__2__Impl rule__TurnOrder__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__TurnOrder__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TurnOrder__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnOrder__Group__2"


    // $ANTLR start "rule__TurnOrder__Group__2__Impl"
    // InternalGameDSL.g:612:1: rule__TurnOrder__Group__2__Impl : ( ( rule__TurnOrder__PlayersAssignment_2 ) ) ;
    public final void rule__TurnOrder__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:616:1: ( ( ( rule__TurnOrder__PlayersAssignment_2 ) ) )
            // InternalGameDSL.g:617:1: ( ( rule__TurnOrder__PlayersAssignment_2 ) )
            {
            // InternalGameDSL.g:617:1: ( ( rule__TurnOrder__PlayersAssignment_2 ) )
            // InternalGameDSL.g:618:2: ( rule__TurnOrder__PlayersAssignment_2 )
            {
             before(grammarAccess.getTurnOrderAccess().getPlayersAssignment_2()); 
            // InternalGameDSL.g:619:2: ( rule__TurnOrder__PlayersAssignment_2 )
            // InternalGameDSL.g:619:3: rule__TurnOrder__PlayersAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__TurnOrder__PlayersAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTurnOrderAccess().getPlayersAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnOrder__Group__2__Impl"


    // $ANTLR start "rule__TurnOrder__Group__3"
    // InternalGameDSL.g:627:1: rule__TurnOrder__Group__3 : rule__TurnOrder__Group__3__Impl rule__TurnOrder__Group__4 ;
    public final void rule__TurnOrder__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:631:1: ( rule__TurnOrder__Group__3__Impl rule__TurnOrder__Group__4 )
            // InternalGameDSL.g:632:2: rule__TurnOrder__Group__3__Impl rule__TurnOrder__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__TurnOrder__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TurnOrder__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnOrder__Group__3"


    // $ANTLR start "rule__TurnOrder__Group__3__Impl"
    // InternalGameDSL.g:639:1: rule__TurnOrder__Group__3__Impl : ( ( rule__TurnOrder__Group_3__0 )* ) ;
    public final void rule__TurnOrder__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:643:1: ( ( ( rule__TurnOrder__Group_3__0 )* ) )
            // InternalGameDSL.g:644:1: ( ( rule__TurnOrder__Group_3__0 )* )
            {
            // InternalGameDSL.g:644:1: ( ( rule__TurnOrder__Group_3__0 )* )
            // InternalGameDSL.g:645:2: ( rule__TurnOrder__Group_3__0 )*
            {
             before(grammarAccess.getTurnOrderAccess().getGroup_3()); 
            // InternalGameDSL.g:646:2: ( rule__TurnOrder__Group_3__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalGameDSL.g:646:3: rule__TurnOrder__Group_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__TurnOrder__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getTurnOrderAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnOrder__Group__3__Impl"


    // $ANTLR start "rule__TurnOrder__Group__4"
    // InternalGameDSL.g:654:1: rule__TurnOrder__Group__4 : rule__TurnOrder__Group__4__Impl ;
    public final void rule__TurnOrder__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:658:1: ( rule__TurnOrder__Group__4__Impl )
            // InternalGameDSL.g:659:2: rule__TurnOrder__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TurnOrder__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnOrder__Group__4"


    // $ANTLR start "rule__TurnOrder__Group__4__Impl"
    // InternalGameDSL.g:665:1: rule__TurnOrder__Group__4__Impl : ( ']' ) ;
    public final void rule__TurnOrder__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:669:1: ( ( ']' ) )
            // InternalGameDSL.g:670:1: ( ']' )
            {
            // InternalGameDSL.g:670:1: ( ']' )
            // InternalGameDSL.g:671:2: ']'
            {
             before(grammarAccess.getTurnOrderAccess().getRightSquareBracketKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTurnOrderAccess().getRightSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnOrder__Group__4__Impl"


    // $ANTLR start "rule__TurnOrder__Group_3__0"
    // InternalGameDSL.g:681:1: rule__TurnOrder__Group_3__0 : rule__TurnOrder__Group_3__0__Impl rule__TurnOrder__Group_3__1 ;
    public final void rule__TurnOrder__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:685:1: ( rule__TurnOrder__Group_3__0__Impl rule__TurnOrder__Group_3__1 )
            // InternalGameDSL.g:686:2: rule__TurnOrder__Group_3__0__Impl rule__TurnOrder__Group_3__1
            {
            pushFollow(FOLLOW_6);
            rule__TurnOrder__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TurnOrder__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnOrder__Group_3__0"


    // $ANTLR start "rule__TurnOrder__Group_3__0__Impl"
    // InternalGameDSL.g:693:1: rule__TurnOrder__Group_3__0__Impl : ( ',' ) ;
    public final void rule__TurnOrder__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:697:1: ( ( ',' ) )
            // InternalGameDSL.g:698:1: ( ',' )
            {
            // InternalGameDSL.g:698:1: ( ',' )
            // InternalGameDSL.g:699:2: ','
            {
             before(grammarAccess.getTurnOrderAccess().getCommaKeyword_3_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getTurnOrderAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnOrder__Group_3__0__Impl"


    // $ANTLR start "rule__TurnOrder__Group_3__1"
    // InternalGameDSL.g:708:1: rule__TurnOrder__Group_3__1 : rule__TurnOrder__Group_3__1__Impl ;
    public final void rule__TurnOrder__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:712:1: ( rule__TurnOrder__Group_3__1__Impl )
            // InternalGameDSL.g:713:2: rule__TurnOrder__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TurnOrder__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnOrder__Group_3__1"


    // $ANTLR start "rule__TurnOrder__Group_3__1__Impl"
    // InternalGameDSL.g:719:1: rule__TurnOrder__Group_3__1__Impl : ( ( rule__TurnOrder__PlayersAssignment_3_1 ) ) ;
    public final void rule__TurnOrder__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:723:1: ( ( ( rule__TurnOrder__PlayersAssignment_3_1 ) ) )
            // InternalGameDSL.g:724:1: ( ( rule__TurnOrder__PlayersAssignment_3_1 ) )
            {
            // InternalGameDSL.g:724:1: ( ( rule__TurnOrder__PlayersAssignment_3_1 ) )
            // InternalGameDSL.g:725:2: ( rule__TurnOrder__PlayersAssignment_3_1 )
            {
             before(grammarAccess.getTurnOrderAccess().getPlayersAssignment_3_1()); 
            // InternalGameDSL.g:726:2: ( rule__TurnOrder__PlayersAssignment_3_1 )
            // InternalGameDSL.g:726:3: rule__TurnOrder__PlayersAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__TurnOrder__PlayersAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTurnOrderAccess().getPlayersAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnOrder__Group_3__1__Impl"


    // $ANTLR start "rule__Piece__Group__0"
    // InternalGameDSL.g:735:1: rule__Piece__Group__0 : rule__Piece__Group__0__Impl rule__Piece__Group__1 ;
    public final void rule__Piece__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:739:1: ( rule__Piece__Group__0__Impl rule__Piece__Group__1 )
            // InternalGameDSL.g:740:2: rule__Piece__Group__0__Impl rule__Piece__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Piece__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Piece__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Piece__Group__0"


    // $ANTLR start "rule__Piece__Group__0__Impl"
    // InternalGameDSL.g:747:1: rule__Piece__Group__0__Impl : ( 'piece' ) ;
    public final void rule__Piece__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:751:1: ( ( 'piece' ) )
            // InternalGameDSL.g:752:1: ( 'piece' )
            {
            // InternalGameDSL.g:752:1: ( 'piece' )
            // InternalGameDSL.g:753:2: 'piece'
            {
             before(grammarAccess.getPieceAccess().getPieceKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getPieceAccess().getPieceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Piece__Group__0__Impl"


    // $ANTLR start "rule__Piece__Group__1"
    // InternalGameDSL.g:762:1: rule__Piece__Group__1 : rule__Piece__Group__1__Impl rule__Piece__Group__2 ;
    public final void rule__Piece__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:766:1: ( rule__Piece__Group__1__Impl rule__Piece__Group__2 )
            // InternalGameDSL.g:767:2: rule__Piece__Group__1__Impl rule__Piece__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Piece__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Piece__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Piece__Group__1"


    // $ANTLR start "rule__Piece__Group__1__Impl"
    // InternalGameDSL.g:774:1: rule__Piece__Group__1__Impl : ( ( rule__Piece__NameAssignment_1 ) ) ;
    public final void rule__Piece__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:778:1: ( ( ( rule__Piece__NameAssignment_1 ) ) )
            // InternalGameDSL.g:779:1: ( ( rule__Piece__NameAssignment_1 ) )
            {
            // InternalGameDSL.g:779:1: ( ( rule__Piece__NameAssignment_1 ) )
            // InternalGameDSL.g:780:2: ( rule__Piece__NameAssignment_1 )
            {
             before(grammarAccess.getPieceAccess().getNameAssignment_1()); 
            // InternalGameDSL.g:781:2: ( rule__Piece__NameAssignment_1 )
            // InternalGameDSL.g:781:3: rule__Piece__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Piece__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPieceAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Piece__Group__1__Impl"


    // $ANTLR start "rule__Piece__Group__2"
    // InternalGameDSL.g:789:1: rule__Piece__Group__2 : rule__Piece__Group__2__Impl rule__Piece__Group__3 ;
    public final void rule__Piece__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:793:1: ( rule__Piece__Group__2__Impl rule__Piece__Group__3 )
            // InternalGameDSL.g:794:2: rule__Piece__Group__2__Impl rule__Piece__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Piece__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Piece__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Piece__Group__2"


    // $ANTLR start "rule__Piece__Group__2__Impl"
    // InternalGameDSL.g:801:1: rule__Piece__Group__2__Impl : ( 'symbol' ) ;
    public final void rule__Piece__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:805:1: ( ( 'symbol' ) )
            // InternalGameDSL.g:806:1: ( 'symbol' )
            {
            // InternalGameDSL.g:806:1: ( 'symbol' )
            // InternalGameDSL.g:807:2: 'symbol'
            {
             before(grammarAccess.getPieceAccess().getSymbolKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getPieceAccess().getSymbolKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Piece__Group__2__Impl"


    // $ANTLR start "rule__Piece__Group__3"
    // InternalGameDSL.g:816:1: rule__Piece__Group__3 : rule__Piece__Group__3__Impl rule__Piece__Group__4 ;
    public final void rule__Piece__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:820:1: ( rule__Piece__Group__3__Impl rule__Piece__Group__4 )
            // InternalGameDSL.g:821:2: rule__Piece__Group__3__Impl rule__Piece__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__Piece__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Piece__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Piece__Group__3"


    // $ANTLR start "rule__Piece__Group__3__Impl"
    // InternalGameDSL.g:828:1: rule__Piece__Group__3__Impl : ( ( rule__Piece__SymbolAssignment_3 ) ) ;
    public final void rule__Piece__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:832:1: ( ( ( rule__Piece__SymbolAssignment_3 ) ) )
            // InternalGameDSL.g:833:1: ( ( rule__Piece__SymbolAssignment_3 ) )
            {
            // InternalGameDSL.g:833:1: ( ( rule__Piece__SymbolAssignment_3 ) )
            // InternalGameDSL.g:834:2: ( rule__Piece__SymbolAssignment_3 )
            {
             before(grammarAccess.getPieceAccess().getSymbolAssignment_3()); 
            // InternalGameDSL.g:835:2: ( rule__Piece__SymbolAssignment_3 )
            // InternalGameDSL.g:835:3: rule__Piece__SymbolAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Piece__SymbolAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPieceAccess().getSymbolAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Piece__Group__3__Impl"


    // $ANTLR start "rule__Piece__Group__4"
    // InternalGameDSL.g:843:1: rule__Piece__Group__4 : rule__Piece__Group__4__Impl rule__Piece__Group__5 ;
    public final void rule__Piece__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:847:1: ( rule__Piece__Group__4__Impl rule__Piece__Group__5 )
            // InternalGameDSL.g:848:2: rule__Piece__Group__4__Impl rule__Piece__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Piece__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Piece__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Piece__Group__4"


    // $ANTLR start "rule__Piece__Group__4__Impl"
    // InternalGameDSL.g:855:1: rule__Piece__Group__4__Impl : ( 'owner' ) ;
    public final void rule__Piece__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:859:1: ( ( 'owner' ) )
            // InternalGameDSL.g:860:1: ( 'owner' )
            {
            // InternalGameDSL.g:860:1: ( 'owner' )
            // InternalGameDSL.g:861:2: 'owner'
            {
             before(grammarAccess.getPieceAccess().getOwnerKeyword_4()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getPieceAccess().getOwnerKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Piece__Group__4__Impl"


    // $ANTLR start "rule__Piece__Group__5"
    // InternalGameDSL.g:870:1: rule__Piece__Group__5 : rule__Piece__Group__5__Impl rule__Piece__Group__6 ;
    public final void rule__Piece__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:874:1: ( rule__Piece__Group__5__Impl rule__Piece__Group__6 )
            // InternalGameDSL.g:875:2: rule__Piece__Group__5__Impl rule__Piece__Group__6
            {
            pushFollow(FOLLOW_5);
            rule__Piece__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Piece__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Piece__Group__5"


    // $ANTLR start "rule__Piece__Group__5__Impl"
    // InternalGameDSL.g:882:1: rule__Piece__Group__5__Impl : ( ( rule__Piece__OwnerAssignment_5 ) ) ;
    public final void rule__Piece__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:886:1: ( ( ( rule__Piece__OwnerAssignment_5 ) ) )
            // InternalGameDSL.g:887:1: ( ( rule__Piece__OwnerAssignment_5 ) )
            {
            // InternalGameDSL.g:887:1: ( ( rule__Piece__OwnerAssignment_5 ) )
            // InternalGameDSL.g:888:2: ( rule__Piece__OwnerAssignment_5 )
            {
             before(grammarAccess.getPieceAccess().getOwnerAssignment_5()); 
            // InternalGameDSL.g:889:2: ( rule__Piece__OwnerAssignment_5 )
            // InternalGameDSL.g:889:3: rule__Piece__OwnerAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Piece__OwnerAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getPieceAccess().getOwnerAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Piece__Group__5__Impl"


    // $ANTLR start "rule__Piece__Group__6"
    // InternalGameDSL.g:897:1: rule__Piece__Group__6 : rule__Piece__Group__6__Impl ;
    public final void rule__Piece__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:901:1: ( rule__Piece__Group__6__Impl )
            // InternalGameDSL.g:902:2: rule__Piece__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Piece__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Piece__Group__6"


    // $ANTLR start "rule__Piece__Group__6__Impl"
    // InternalGameDSL.g:908:1: rule__Piece__Group__6__Impl : ( ( rule__Piece__Group_6__0 )? ) ;
    public final void rule__Piece__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:912:1: ( ( ( rule__Piece__Group_6__0 )? ) )
            // InternalGameDSL.g:913:1: ( ( rule__Piece__Group_6__0 )? )
            {
            // InternalGameDSL.g:913:1: ( ( rule__Piece__Group_6__0 )? )
            // InternalGameDSL.g:914:2: ( rule__Piece__Group_6__0 )?
            {
             before(grammarAccess.getPieceAccess().getGroup_6()); 
            // InternalGameDSL.g:915:2: ( rule__Piece__Group_6__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalGameDSL.g:915:3: rule__Piece__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Piece__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPieceAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Piece__Group__6__Impl"


    // $ANTLR start "rule__Piece__Group_6__0"
    // InternalGameDSL.g:924:1: rule__Piece__Group_6__0 : rule__Piece__Group_6__0__Impl rule__Piece__Group_6__1 ;
    public final void rule__Piece__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:928:1: ( rule__Piece__Group_6__0__Impl rule__Piece__Group_6__1 )
            // InternalGameDSL.g:929:2: rule__Piece__Group_6__0__Impl rule__Piece__Group_6__1
            {
            pushFollow(FOLLOW_4);
            rule__Piece__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Piece__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Piece__Group_6__0"


    // $ANTLR start "rule__Piece__Group_6__0__Impl"
    // InternalGameDSL.g:936:1: rule__Piece__Group_6__0__Impl : ( 'x' ) ;
    public final void rule__Piece__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:940:1: ( ( 'x' ) )
            // InternalGameDSL.g:941:1: ( 'x' )
            {
            // InternalGameDSL.g:941:1: ( 'x' )
            // InternalGameDSL.g:942:2: 'x'
            {
             before(grammarAccess.getPieceAccess().getXKeyword_6_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getPieceAccess().getXKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Piece__Group_6__0__Impl"


    // $ANTLR start "rule__Piece__Group_6__1"
    // InternalGameDSL.g:951:1: rule__Piece__Group_6__1 : rule__Piece__Group_6__1__Impl ;
    public final void rule__Piece__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:955:1: ( rule__Piece__Group_6__1__Impl )
            // InternalGameDSL.g:956:2: rule__Piece__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Piece__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Piece__Group_6__1"


    // $ANTLR start "rule__Piece__Group_6__1__Impl"
    // InternalGameDSL.g:962:1: rule__Piece__Group_6__1__Impl : ( ( rule__Piece__CountAssignment_6_1 ) ) ;
    public final void rule__Piece__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:966:1: ( ( ( rule__Piece__CountAssignment_6_1 ) ) )
            // InternalGameDSL.g:967:1: ( ( rule__Piece__CountAssignment_6_1 ) )
            {
            // InternalGameDSL.g:967:1: ( ( rule__Piece__CountAssignment_6_1 ) )
            // InternalGameDSL.g:968:2: ( rule__Piece__CountAssignment_6_1 )
            {
             before(grammarAccess.getPieceAccess().getCountAssignment_6_1()); 
            // InternalGameDSL.g:969:2: ( rule__Piece__CountAssignment_6_1 )
            // InternalGameDSL.g:969:3: rule__Piece__CountAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Piece__CountAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getPieceAccess().getCountAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Piece__Group_6__1__Impl"


    // $ANTLR start "rule__Placement__Group__0"
    // InternalGameDSL.g:978:1: rule__Placement__Group__0 : rule__Placement__Group__0__Impl rule__Placement__Group__1 ;
    public final void rule__Placement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:982:1: ( rule__Placement__Group__0__Impl rule__Placement__Group__1 )
            // InternalGameDSL.g:983:2: rule__Placement__Group__0__Impl rule__Placement__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Placement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Placement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Placement__Group__0"


    // $ANTLR start "rule__Placement__Group__0__Impl"
    // InternalGameDSL.g:990:1: rule__Placement__Group__0__Impl : ( 'place' ) ;
    public final void rule__Placement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:994:1: ( ( 'place' ) )
            // InternalGameDSL.g:995:1: ( 'place' )
            {
            // InternalGameDSL.g:995:1: ( 'place' )
            // InternalGameDSL.g:996:2: 'place'
            {
             before(grammarAccess.getPlacementAccess().getPlaceKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getPlacementAccess().getPlaceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Placement__Group__0__Impl"


    // $ANTLR start "rule__Placement__Group__1"
    // InternalGameDSL.g:1005:1: rule__Placement__Group__1 : rule__Placement__Group__1__Impl rule__Placement__Group__2 ;
    public final void rule__Placement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:1009:1: ( rule__Placement__Group__1__Impl rule__Placement__Group__2 )
            // InternalGameDSL.g:1010:2: rule__Placement__Group__1__Impl rule__Placement__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Placement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Placement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Placement__Group__1"


    // $ANTLR start "rule__Placement__Group__1__Impl"
    // InternalGameDSL.g:1017:1: rule__Placement__Group__1__Impl : ( ( rule__Placement__PieceAssignment_1 ) ) ;
    public final void rule__Placement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:1021:1: ( ( ( rule__Placement__PieceAssignment_1 ) ) )
            // InternalGameDSL.g:1022:1: ( ( rule__Placement__PieceAssignment_1 ) )
            {
            // InternalGameDSL.g:1022:1: ( ( rule__Placement__PieceAssignment_1 ) )
            // InternalGameDSL.g:1023:2: ( rule__Placement__PieceAssignment_1 )
            {
             before(grammarAccess.getPlacementAccess().getPieceAssignment_1()); 
            // InternalGameDSL.g:1024:2: ( rule__Placement__PieceAssignment_1 )
            // InternalGameDSL.g:1024:3: rule__Placement__PieceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Placement__PieceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPlacementAccess().getPieceAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Placement__Group__1__Impl"


    // $ANTLR start "rule__Placement__Group__2"
    // InternalGameDSL.g:1032:1: rule__Placement__Group__2 : rule__Placement__Group__2__Impl rule__Placement__Group__3 ;
    public final void rule__Placement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:1036:1: ( rule__Placement__Group__2__Impl rule__Placement__Group__3 )
            // InternalGameDSL.g:1037:2: rule__Placement__Group__2__Impl rule__Placement__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Placement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Placement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Placement__Group__2"


    // $ANTLR start "rule__Placement__Group__2__Impl"
    // InternalGameDSL.g:1044:1: rule__Placement__Group__2__Impl : ( 'at' ) ;
    public final void rule__Placement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:1048:1: ( ( 'at' ) )
            // InternalGameDSL.g:1049:1: ( 'at' )
            {
            // InternalGameDSL.g:1049:1: ( 'at' )
            // InternalGameDSL.g:1050:2: 'at'
            {
             before(grammarAccess.getPlacementAccess().getAtKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getPlacementAccess().getAtKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Placement__Group__2__Impl"


    // $ANTLR start "rule__Placement__Group__3"
    // InternalGameDSL.g:1059:1: rule__Placement__Group__3 : rule__Placement__Group__3__Impl rule__Placement__Group__4 ;
    public final void rule__Placement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:1063:1: ( rule__Placement__Group__3__Impl rule__Placement__Group__4 )
            // InternalGameDSL.g:1064:2: rule__Placement__Group__3__Impl rule__Placement__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__Placement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Placement__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Placement__Group__3"


    // $ANTLR start "rule__Placement__Group__3__Impl"
    // InternalGameDSL.g:1071:1: rule__Placement__Group__3__Impl : ( ( rule__Placement__RangeAssignment_3 ) ) ;
    public final void rule__Placement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:1075:1: ( ( ( rule__Placement__RangeAssignment_3 ) ) )
            // InternalGameDSL.g:1076:1: ( ( rule__Placement__RangeAssignment_3 ) )
            {
            // InternalGameDSL.g:1076:1: ( ( rule__Placement__RangeAssignment_3 ) )
            // InternalGameDSL.g:1077:2: ( rule__Placement__RangeAssignment_3 )
            {
             before(grammarAccess.getPlacementAccess().getRangeAssignment_3()); 
            // InternalGameDSL.g:1078:2: ( rule__Placement__RangeAssignment_3 )
            // InternalGameDSL.g:1078:3: rule__Placement__RangeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Placement__RangeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPlacementAccess().getRangeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Placement__Group__3__Impl"


    // $ANTLR start "rule__Placement__Group__4"
    // InternalGameDSL.g:1086:1: rule__Placement__Group__4 : rule__Placement__Group__4__Impl rule__Placement__Group__5 ;
    public final void rule__Placement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:1090:1: ( rule__Placement__Group__4__Impl rule__Placement__Group__5 )
            // InternalGameDSL.g:1091:2: rule__Placement__Group__4__Impl rule__Placement__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Placement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Placement__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Placement__Group__4"


    // $ANTLR start "rule__Placement__Group__4__Impl"
    // InternalGameDSL.g:1098:1: rule__Placement__Group__4__Impl : ( 'for' ) ;
    public final void rule__Placement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:1102:1: ( ( 'for' ) )
            // InternalGameDSL.g:1103:1: ( 'for' )
            {
            // InternalGameDSL.g:1103:1: ( 'for' )
            // InternalGameDSL.g:1104:2: 'for'
            {
             before(grammarAccess.getPlacementAccess().getForKeyword_4()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getPlacementAccess().getForKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Placement__Group__4__Impl"


    // $ANTLR start "rule__Placement__Group__5"
    // InternalGameDSL.g:1113:1: rule__Placement__Group__5 : rule__Placement__Group__5__Impl ;
    public final void rule__Placement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:1117:1: ( rule__Placement__Group__5__Impl )
            // InternalGameDSL.g:1118:2: rule__Placement__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Placement__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Placement__Group__5"


    // $ANTLR start "rule__Placement__Group__5__Impl"
    // InternalGameDSL.g:1124:1: rule__Placement__Group__5__Impl : ( ( rule__Placement__OwnerAssignment_5 ) ) ;
    public final void rule__Placement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:1128:1: ( ( ( rule__Placement__OwnerAssignment_5 ) ) )
            // InternalGameDSL.g:1129:1: ( ( rule__Placement__OwnerAssignment_5 ) )
            {
            // InternalGameDSL.g:1129:1: ( ( rule__Placement__OwnerAssignment_5 ) )
            // InternalGameDSL.g:1130:2: ( rule__Placement__OwnerAssignment_5 )
            {
             before(grammarAccess.getPlacementAccess().getOwnerAssignment_5()); 
            // InternalGameDSL.g:1131:2: ( rule__Placement__OwnerAssignment_5 )
            // InternalGameDSL.g:1131:3: rule__Placement__OwnerAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Placement__OwnerAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getPlacementAccess().getOwnerAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Placement__Group__5__Impl"


    // $ANTLR start "rule__Move__Group__0"
    // InternalGameDSL.g:1140:1: rule__Move__Group__0 : rule__Move__Group__0__Impl rule__Move__Group__1 ;
    public final void rule__Move__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:1144:1: ( rule__Move__Group__0__Impl rule__Move__Group__1 )
            // InternalGameDSL.g:1145:2: rule__Move__Group__0__Impl rule__Move__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Move__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Move__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__0"


    // $ANTLR start "rule__Move__Group__0__Impl"
    // InternalGameDSL.g:1152:1: rule__Move__Group__0__Impl : ( 'move' ) ;
    public final void rule__Move__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:1156:1: ( ( 'move' ) )
            // InternalGameDSL.g:1157:1: ( 'move' )
            {
            // InternalGameDSL.g:1157:1: ( 'move' )
            // InternalGameDSL.g:1158:2: 'move'
            {
             before(grammarAccess.getMoveAccess().getMoveKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getMoveAccess().getMoveKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__0__Impl"


    // $ANTLR start "rule__Move__Group__1"
    // InternalGameDSL.g:1167:1: rule__Move__Group__1 : rule__Move__Group__1__Impl rule__Move__Group__2 ;
    public final void rule__Move__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:1171:1: ( rule__Move__Group__1__Impl rule__Move__Group__2 )
            // InternalGameDSL.g:1172:2: rule__Move__Group__1__Impl rule__Move__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Move__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Move__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__1"


    // $ANTLR start "rule__Move__Group__1__Impl"
    // InternalGameDSL.g:1179:1: rule__Move__Group__1__Impl : ( ( rule__Move__PieceAssignment_1 ) ) ;
    public final void rule__Move__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:1183:1: ( ( ( rule__Move__PieceAssignment_1 ) ) )
            // InternalGameDSL.g:1184:1: ( ( rule__Move__PieceAssignment_1 ) )
            {
            // InternalGameDSL.g:1184:1: ( ( rule__Move__PieceAssignment_1 ) )
            // InternalGameDSL.g:1185:2: ( rule__Move__PieceAssignment_1 )
            {
             before(grammarAccess.getMoveAccess().getPieceAssignment_1()); 
            // InternalGameDSL.g:1186:2: ( rule__Move__PieceAssignment_1 )
            // InternalGameDSL.g:1186:3: rule__Move__PieceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Move__PieceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMoveAccess().getPieceAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__1__Impl"


    // $ANTLR start "rule__Move__Group__2"
    // InternalGameDSL.g:1194:1: rule__Move__Group__2 : rule__Move__Group__2__Impl rule__Move__Group__3 ;
    public final void rule__Move__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:1198:1: ( rule__Move__Group__2__Impl rule__Move__Group__3 )
            // InternalGameDSL.g:1199:2: rule__Move__Group__2__Impl rule__Move__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Move__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Move__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__2"


    // $ANTLR start "rule__Move__Group__2__Impl"
    // InternalGameDSL.g:1206:1: rule__Move__Group__2__Impl : ( 'direction' ) ;
    public final void rule__Move__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:1210:1: ( ( 'direction' ) )
            // InternalGameDSL.g:1211:1: ( 'direction' )
            {
            // InternalGameDSL.g:1211:1: ( 'direction' )
            // InternalGameDSL.g:1212:2: 'direction'
            {
             before(grammarAccess.getMoveAccess().getDirectionKeyword_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getMoveAccess().getDirectionKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__2__Impl"


    // $ANTLR start "rule__Move__Group__3"
    // InternalGameDSL.g:1221:1: rule__Move__Group__3 : rule__Move__Group__3__Impl rule__Move__Group__4 ;
    public final void rule__Move__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:1225:1: ( rule__Move__Group__3__Impl rule__Move__Group__4 )
            // InternalGameDSL.g:1226:2: rule__Move__Group__3__Impl rule__Move__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__Move__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Move__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__3"


    // $ANTLR start "rule__Move__Group__3__Impl"
    // InternalGameDSL.g:1233:1: rule__Move__Group__3__Impl : ( ( rule__Move__DirectionAssignment_3 ) ) ;
    public final void rule__Move__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:1237:1: ( ( ( rule__Move__DirectionAssignment_3 ) ) )
            // InternalGameDSL.g:1238:1: ( ( rule__Move__DirectionAssignment_3 ) )
            {
            // InternalGameDSL.g:1238:1: ( ( rule__Move__DirectionAssignment_3 ) )
            // InternalGameDSL.g:1239:2: ( rule__Move__DirectionAssignment_3 )
            {
             before(grammarAccess.getMoveAccess().getDirectionAssignment_3()); 
            // InternalGameDSL.g:1240:2: ( rule__Move__DirectionAssignment_3 )
            // InternalGameDSL.g:1240:3: rule__Move__DirectionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Move__DirectionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMoveAccess().getDirectionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__3__Impl"


    // $ANTLR start "rule__Move__Group__4"
    // InternalGameDSL.g:1248:1: rule__Move__Group__4 : rule__Move__Group__4__Impl rule__Move__Group__5 ;
    public final void rule__Move__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:1252:1: ( rule__Move__Group__4__Impl rule__Move__Group__5 )
            // InternalGameDSL.g:1253:2: rule__Move__Group__4__Impl rule__Move__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__Move__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Move__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__4"


    // $ANTLR start "rule__Move__Group__4__Impl"
    // InternalGameDSL.g:1260:1: rule__Move__Group__4__Impl : ( ( rule__Move__StepsAssignment_4 ) ) ;
    public final void rule__Move__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:1264:1: ( ( ( rule__Move__StepsAssignment_4 ) ) )
            // InternalGameDSL.g:1265:1: ( ( rule__Move__StepsAssignment_4 ) )
            {
            // InternalGameDSL.g:1265:1: ( ( rule__Move__StepsAssignment_4 ) )
            // InternalGameDSL.g:1266:2: ( rule__Move__StepsAssignment_4 )
            {
             before(grammarAccess.getMoveAccess().getStepsAssignment_4()); 
            // InternalGameDSL.g:1267:2: ( rule__Move__StepsAssignment_4 )
            // InternalGameDSL.g:1267:3: rule__Move__StepsAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Move__StepsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMoveAccess().getStepsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__4__Impl"


    // $ANTLR start "rule__Move__Group__5"
    // InternalGameDSL.g:1275:1: rule__Move__Group__5 : rule__Move__Group__5__Impl ;
    public final void rule__Move__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:1279:1: ( rule__Move__Group__5__Impl )
            // InternalGameDSL.g:1280:2: rule__Move__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Move__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__5"


    // $ANTLR start "rule__Move__Group__5__Impl"
    // InternalGameDSL.g:1286:1: rule__Move__Group__5__Impl : ( ( rule__Move__Group_5__0 )? ) ;
    public final void rule__Move__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:1290:1: ( ( ( rule__Move__Group_5__0 )? ) )
            // InternalGameDSL.g:1291:1: ( ( rule__Move__Group_5__0 )? )
            {
            // InternalGameDSL.g:1291:1: ( ( rule__Move__Group_5__0 )? )
            // InternalGameDSL.g:1292:2: ( rule__Move__Group_5__0 )?
            {
             before(grammarAccess.getMoveAccess().getGroup_5()); 
            // InternalGameDSL.g:1293:2: ( rule__Move__Group_5__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==26) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalGameDSL.g:1293:3: rule__Move__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Move__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMoveAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__5__Impl"


    // $ANTLR start "rule__Move__Group_5__0"
    // InternalGameDSL.g:1302:1: rule__Move__Group_5__0 : rule__Move__Group_5__0__Impl rule__Move__Group_5__1 ;
    public final void rule__Move__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:1306:1: ( rule__Move__Group_5__0__Impl rule__Move__Group_5__1 )
            // InternalGameDSL.g:1307:2: rule__Move__Group_5__0__Impl rule__Move__Group_5__1
            {
            pushFollow(FOLLOW_6);
            rule__Move__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Move__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group_5__0"


    // $ANTLR start "rule__Move__Group_5__0__Impl"
    // InternalGameDSL.g:1314:1: rule__Move__Group_5__0__Impl : ( 'if' ) ;
    public final void rule__Move__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:1318:1: ( ( 'if' ) )
            // InternalGameDSL.g:1319:1: ( 'if' )
            {
            // InternalGameDSL.g:1319:1: ( 'if' )
            // InternalGameDSL.g:1320:2: 'if'
            {
             before(grammarAccess.getMoveAccess().getIfKeyword_5_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getMoveAccess().getIfKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group_5__0__Impl"


    // $ANTLR start "rule__Move__Group_5__1"
    // InternalGameDSL.g:1329:1: rule__Move__Group_5__1 : rule__Move__Group_5__1__Impl ;
    public final void rule__Move__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:1333:1: ( rule__Move__Group_5__1__Impl )
            // InternalGameDSL.g:1334:2: rule__Move__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Move__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group_5__1"


    // $ANTLR start "rule__Move__Group_5__1__Impl"
    // InternalGameDSL.g:1340:1: rule__Move__Group_5__1__Impl : ( ( rule__Move__ConditionAssignment_5_1 ) ) ;
    public final void rule__Move__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:1344:1: ( ( ( rule__Move__ConditionAssignment_5_1 ) ) )
            // InternalGameDSL.g:1345:1: ( ( rule__Move__ConditionAssignment_5_1 ) )
            {
            // InternalGameDSL.g:1345:1: ( ( rule__Move__ConditionAssignment_5_1 ) )
            // InternalGameDSL.g:1346:2: ( rule__Move__ConditionAssignment_5_1 )
            {
             before(grammarAccess.getMoveAccess().getConditionAssignment_5_1()); 
            // InternalGameDSL.g:1347:2: ( rule__Move__ConditionAssignment_5_1 )
            // InternalGameDSL.g:1347:3: rule__Move__ConditionAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Move__ConditionAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getMoveAccess().getConditionAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group_5__1__Impl"


    // $ANTLR start "rule__Rule__Group__0"
    // InternalGameDSL.g:1356:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:1360:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalGameDSL.g:1361:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Rule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0"


    // $ANTLR start "rule__Rule__Group__0__Impl"
    // InternalGameDSL.g:1368:1: rule__Rule__Group__0__Impl : ( 'rule' ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:1372:1: ( ( 'rule' ) )
            // InternalGameDSL.g:1373:1: ( 'rule' )
            {
            // InternalGameDSL.g:1373:1: ( 'rule' )
            // InternalGameDSL.g:1374:2: 'rule'
            {
             before(grammarAccess.getRuleAccess().getRuleKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getRuleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0__Impl"


    // $ANTLR start "rule__Rule__Group__1"
    // InternalGameDSL.g:1383:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:1387:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // InternalGameDSL.g:1388:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__Rule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1"


    // $ANTLR start "rule__Rule__Group__1__Impl"
    // InternalGameDSL.g:1395:1: rule__Rule__Group__1__Impl : ( ( rule__Rule__NameAssignment_1 ) ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:1399:1: ( ( ( rule__Rule__NameAssignment_1 ) ) )
            // InternalGameDSL.g:1400:1: ( ( rule__Rule__NameAssignment_1 ) )
            {
            // InternalGameDSL.g:1400:1: ( ( rule__Rule__NameAssignment_1 ) )
            // InternalGameDSL.g:1401:2: ( rule__Rule__NameAssignment_1 )
            {
             before(grammarAccess.getRuleAccess().getNameAssignment_1()); 
            // InternalGameDSL.g:1402:2: ( rule__Rule__NameAssignment_1 )
            // InternalGameDSL.g:1402:3: rule__Rule__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Rule__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1__Impl"


    // $ANTLR start "rule__Rule__Group__2"
    // InternalGameDSL.g:1410:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:1414:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // InternalGameDSL.g:1415:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Rule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__2"


    // $ANTLR start "rule__Rule__Group__2__Impl"
    // InternalGameDSL.g:1422:1: rule__Rule__Group__2__Impl : ( 'if' ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:1426:1: ( ( 'if' ) )
            // InternalGameDSL.g:1427:1: ( 'if' )
            {
            // InternalGameDSL.g:1427:1: ( 'if' )
            // InternalGameDSL.g:1428:2: 'if'
            {
             before(grammarAccess.getRuleAccess().getIfKeyword_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getIfKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__2__Impl"


    // $ANTLR start "rule__Rule__Group__3"
    // InternalGameDSL.g:1437:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl rule__Rule__Group__4 ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:1441:1: ( rule__Rule__Group__3__Impl rule__Rule__Group__4 )
            // InternalGameDSL.g:1442:2: rule__Rule__Group__3__Impl rule__Rule__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__Rule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__3"


    // $ANTLR start "rule__Rule__Group__3__Impl"
    // InternalGameDSL.g:1449:1: rule__Rule__Group__3__Impl : ( ( rule__Rule__ConditionAssignment_3 ) ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:1453:1: ( ( ( rule__Rule__ConditionAssignment_3 ) ) )
            // InternalGameDSL.g:1454:1: ( ( rule__Rule__ConditionAssignment_3 ) )
            {
            // InternalGameDSL.g:1454:1: ( ( rule__Rule__ConditionAssignment_3 ) )
            // InternalGameDSL.g:1455:2: ( rule__Rule__ConditionAssignment_3 )
            {
             before(grammarAccess.getRuleAccess().getConditionAssignment_3()); 
            // InternalGameDSL.g:1456:2: ( rule__Rule__ConditionAssignment_3 )
            // InternalGameDSL.g:1456:3: rule__Rule__ConditionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Rule__ConditionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getConditionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__3__Impl"


    // $ANTLR start "rule__Rule__Group__4"
    // InternalGameDSL.g:1464:1: rule__Rule__Group__4 : rule__Rule__Group__4__Impl rule__Rule__Group__5 ;
    public final void rule__Rule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:1468:1: ( rule__Rule__Group__4__Impl rule__Rule__Group__5 )
            // InternalGameDSL.g:1469:2: rule__Rule__Group__4__Impl rule__Rule__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Rule__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__4"


    // $ANTLR start "rule__Rule__Group__4__Impl"
    // InternalGameDSL.g:1476:1: rule__Rule__Group__4__Impl : ( 'then' ) ;
    public final void rule__Rule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:1480:1: ( ( 'then' ) )
            // InternalGameDSL.g:1481:1: ( 'then' )
            {
            // InternalGameDSL.g:1481:1: ( 'then' )
            // InternalGameDSL.g:1482:2: 'then'
            {
             before(grammarAccess.getRuleAccess().getThenKeyword_4()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getThenKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__4__Impl"


    // $ANTLR start "rule__Rule__Group__5"
    // InternalGameDSL.g:1491:1: rule__Rule__Group__5 : rule__Rule__Group__5__Impl ;
    public final void rule__Rule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:1495:1: ( rule__Rule__Group__5__Impl )
            // InternalGameDSL.g:1496:2: rule__Rule__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__5"


    // $ANTLR start "rule__Rule__Group__5__Impl"
    // InternalGameDSL.g:1502:1: rule__Rule__Group__5__Impl : ( ( rule__Rule__ActionAssignment_5 ) ) ;
    public final void rule__Rule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:1506:1: ( ( ( rule__Rule__ActionAssignment_5 ) ) )
            // InternalGameDSL.g:1507:1: ( ( rule__Rule__ActionAssignment_5 ) )
            {
            // InternalGameDSL.g:1507:1: ( ( rule__Rule__ActionAssignment_5 ) )
            // InternalGameDSL.g:1508:2: ( rule__Rule__ActionAssignment_5 )
            {
             before(grammarAccess.getRuleAccess().getActionAssignment_5()); 
            // InternalGameDSL.g:1509:2: ( rule__Rule__ActionAssignment_5 )
            // InternalGameDSL.g:1509:3: rule__Rule__ActionAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Rule__ActionAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getActionAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__5__Impl"


    // $ANTLR start "rule__WinCondition__Group__0"
    // InternalGameDSL.g:1518:1: rule__WinCondition__Group__0 : rule__WinCondition__Group__0__Impl rule__WinCondition__Group__1 ;
    public final void rule__WinCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:1522:1: ( rule__WinCondition__Group__0__Impl rule__WinCondition__Group__1 )
            // InternalGameDSL.g:1523:2: rule__WinCondition__Group__0__Impl rule__WinCondition__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__WinCondition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WinCondition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WinCondition__Group__0"


    // $ANTLR start "rule__WinCondition__Group__0__Impl"
    // InternalGameDSL.g:1530:1: rule__WinCondition__Group__0__Impl : ( 'win_condition' ) ;
    public final void rule__WinCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:1534:1: ( ( 'win_condition' ) )
            // InternalGameDSL.g:1535:1: ( 'win_condition' )
            {
            // InternalGameDSL.g:1535:1: ( 'win_condition' )
            // InternalGameDSL.g:1536:2: 'win_condition'
            {
             before(grammarAccess.getWinConditionAccess().getWin_conditionKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getWinConditionAccess().getWin_conditionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WinCondition__Group__0__Impl"


    // $ANTLR start "rule__WinCondition__Group__1"
    // InternalGameDSL.g:1545:1: rule__WinCondition__Group__1 : rule__WinCondition__Group__1__Impl rule__WinCondition__Group__2 ;
    public final void rule__WinCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:1549:1: ( rule__WinCondition__Group__1__Impl rule__WinCondition__Group__2 )
            // InternalGameDSL.g:1550:2: rule__WinCondition__Group__1__Impl rule__WinCondition__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__WinCondition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WinCondition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WinCondition__Group__1"


    // $ANTLR start "rule__WinCondition__Group__1__Impl"
    // InternalGameDSL.g:1557:1: rule__WinCondition__Group__1__Impl : ( 'if' ) ;
    public final void rule__WinCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:1561:1: ( ( 'if' ) )
            // InternalGameDSL.g:1562:1: ( 'if' )
            {
            // InternalGameDSL.g:1562:1: ( 'if' )
            // InternalGameDSL.g:1563:2: 'if'
            {
             before(grammarAccess.getWinConditionAccess().getIfKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getWinConditionAccess().getIfKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WinCondition__Group__1__Impl"


    // $ANTLR start "rule__WinCondition__Group__2"
    // InternalGameDSL.g:1572:1: rule__WinCondition__Group__2 : rule__WinCondition__Group__2__Impl rule__WinCondition__Group__3 ;
    public final void rule__WinCondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:1576:1: ( rule__WinCondition__Group__2__Impl rule__WinCondition__Group__3 )
            // InternalGameDSL.g:1577:2: rule__WinCondition__Group__2__Impl rule__WinCondition__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__WinCondition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WinCondition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WinCondition__Group__2"


    // $ANTLR start "rule__WinCondition__Group__2__Impl"
    // InternalGameDSL.g:1584:1: rule__WinCondition__Group__2__Impl : ( ( rule__WinCondition__ConditionAssignment_2 ) ) ;
    public final void rule__WinCondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:1588:1: ( ( ( rule__WinCondition__ConditionAssignment_2 ) ) )
            // InternalGameDSL.g:1589:1: ( ( rule__WinCondition__ConditionAssignment_2 ) )
            {
            // InternalGameDSL.g:1589:1: ( ( rule__WinCondition__ConditionAssignment_2 ) )
            // InternalGameDSL.g:1590:2: ( rule__WinCondition__ConditionAssignment_2 )
            {
             before(grammarAccess.getWinConditionAccess().getConditionAssignment_2()); 
            // InternalGameDSL.g:1591:2: ( rule__WinCondition__ConditionAssignment_2 )
            // InternalGameDSL.g:1591:3: rule__WinCondition__ConditionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__WinCondition__ConditionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getWinConditionAccess().getConditionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WinCondition__Group__2__Impl"


    // $ANTLR start "rule__WinCondition__Group__3"
    // InternalGameDSL.g:1599:1: rule__WinCondition__Group__3 : rule__WinCondition__Group__3__Impl rule__WinCondition__Group__4 ;
    public final void rule__WinCondition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:1603:1: ( rule__WinCondition__Group__3__Impl rule__WinCondition__Group__4 )
            // InternalGameDSL.g:1604:2: rule__WinCondition__Group__3__Impl rule__WinCondition__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__WinCondition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WinCondition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WinCondition__Group__3"


    // $ANTLR start "rule__WinCondition__Group__3__Impl"
    // InternalGameDSL.g:1611:1: rule__WinCondition__Group__3__Impl : ( 'then' ) ;
    public final void rule__WinCondition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:1615:1: ( ( 'then' ) )
            // InternalGameDSL.g:1616:1: ( 'then' )
            {
            // InternalGameDSL.g:1616:1: ( 'then' )
            // InternalGameDSL.g:1617:2: 'then'
            {
             before(grammarAccess.getWinConditionAccess().getThenKeyword_3()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getWinConditionAccess().getThenKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WinCondition__Group__3__Impl"


    // $ANTLR start "rule__WinCondition__Group__4"
    // InternalGameDSL.g:1626:1: rule__WinCondition__Group__4 : rule__WinCondition__Group__4__Impl rule__WinCondition__Group__5 ;
    public final void rule__WinCondition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:1630:1: ( rule__WinCondition__Group__4__Impl rule__WinCondition__Group__5 )
            // InternalGameDSL.g:1631:2: rule__WinCondition__Group__4__Impl rule__WinCondition__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__WinCondition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WinCondition__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WinCondition__Group__4"


    // $ANTLR start "rule__WinCondition__Group__4__Impl"
    // InternalGameDSL.g:1638:1: rule__WinCondition__Group__4__Impl : ( 'winner' ) ;
    public final void rule__WinCondition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:1642:1: ( ( 'winner' ) )
            // InternalGameDSL.g:1643:1: ( 'winner' )
            {
            // InternalGameDSL.g:1643:1: ( 'winner' )
            // InternalGameDSL.g:1644:2: 'winner'
            {
             before(grammarAccess.getWinConditionAccess().getWinnerKeyword_4()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getWinConditionAccess().getWinnerKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WinCondition__Group__4__Impl"


    // $ANTLR start "rule__WinCondition__Group__5"
    // InternalGameDSL.g:1653:1: rule__WinCondition__Group__5 : rule__WinCondition__Group__5__Impl rule__WinCondition__Group__6 ;
    public final void rule__WinCondition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:1657:1: ( rule__WinCondition__Group__5__Impl rule__WinCondition__Group__6 )
            // InternalGameDSL.g:1658:2: rule__WinCondition__Group__5__Impl rule__WinCondition__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__WinCondition__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WinCondition__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WinCondition__Group__5"


    // $ANTLR start "rule__WinCondition__Group__5__Impl"
    // InternalGameDSL.g:1665:1: rule__WinCondition__Group__5__Impl : ( '=' ) ;
    public final void rule__WinCondition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:1669:1: ( ( '=' ) )
            // InternalGameDSL.g:1670:1: ( '=' )
            {
            // InternalGameDSL.g:1670:1: ( '=' )
            // InternalGameDSL.g:1671:2: '='
            {
             before(grammarAccess.getWinConditionAccess().getEqualsSignKeyword_5()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getWinConditionAccess().getEqualsSignKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WinCondition__Group__5__Impl"


    // $ANTLR start "rule__WinCondition__Group__6"
    // InternalGameDSL.g:1680:1: rule__WinCondition__Group__6 : rule__WinCondition__Group__6__Impl ;
    public final void rule__WinCondition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:1684:1: ( rule__WinCondition__Group__6__Impl )
            // InternalGameDSL.g:1685:2: rule__WinCondition__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WinCondition__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WinCondition__Group__6"


    // $ANTLR start "rule__WinCondition__Group__6__Impl"
    // InternalGameDSL.g:1691:1: rule__WinCondition__Group__6__Impl : ( ( rule__WinCondition__WinnerAssignment_6 ) ) ;
    public final void rule__WinCondition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:1695:1: ( ( ( rule__WinCondition__WinnerAssignment_6 ) ) )
            // InternalGameDSL.g:1696:1: ( ( rule__WinCondition__WinnerAssignment_6 ) )
            {
            // InternalGameDSL.g:1696:1: ( ( rule__WinCondition__WinnerAssignment_6 ) )
            // InternalGameDSL.g:1697:2: ( rule__WinCondition__WinnerAssignment_6 )
            {
             before(grammarAccess.getWinConditionAccess().getWinnerAssignment_6()); 
            // InternalGameDSL.g:1698:2: ( rule__WinCondition__WinnerAssignment_6 )
            // InternalGameDSL.g:1698:3: rule__WinCondition__WinnerAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__WinCondition__WinnerAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getWinConditionAccess().getWinnerAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WinCondition__Group__6__Impl"


    // $ANTLR start "rule__CoordinateRange__Group__0"
    // InternalGameDSL.g:1707:1: rule__CoordinateRange__Group__0 : rule__CoordinateRange__Group__0__Impl rule__CoordinateRange__Group__1 ;
    public final void rule__CoordinateRange__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:1711:1: ( rule__CoordinateRange__Group__0__Impl rule__CoordinateRange__Group__1 )
            // InternalGameDSL.g:1712:2: rule__CoordinateRange__Group__0__Impl rule__CoordinateRange__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__CoordinateRange__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CoordinateRange__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinateRange__Group__0"


    // $ANTLR start "rule__CoordinateRange__Group__0__Impl"
    // InternalGameDSL.g:1719:1: rule__CoordinateRange__Group__0__Impl : ( '[' ) ;
    public final void rule__CoordinateRange__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:1723:1: ( ( '[' ) )
            // InternalGameDSL.g:1724:1: ( '[' )
            {
            // InternalGameDSL.g:1724:1: ( '[' )
            // InternalGameDSL.g:1725:2: '['
            {
             before(grammarAccess.getCoordinateRangeAccess().getLeftSquareBracketKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getCoordinateRangeAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinateRange__Group__0__Impl"


    // $ANTLR start "rule__CoordinateRange__Group__1"
    // InternalGameDSL.g:1734:1: rule__CoordinateRange__Group__1 : rule__CoordinateRange__Group__1__Impl rule__CoordinateRange__Group__2 ;
    public final void rule__CoordinateRange__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:1738:1: ( rule__CoordinateRange__Group__1__Impl rule__CoordinateRange__Group__2 )
            // InternalGameDSL.g:1739:2: rule__CoordinateRange__Group__1__Impl rule__CoordinateRange__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__CoordinateRange__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CoordinateRange__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinateRange__Group__1"


    // $ANTLR start "rule__CoordinateRange__Group__1__Impl"
    // InternalGameDSL.g:1746:1: rule__CoordinateRange__Group__1__Impl : ( ( rule__CoordinateRange__StartRowAssignment_1 ) ) ;
    public final void rule__CoordinateRange__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:1750:1: ( ( ( rule__CoordinateRange__StartRowAssignment_1 ) ) )
            // InternalGameDSL.g:1751:1: ( ( rule__CoordinateRange__StartRowAssignment_1 ) )
            {
            // InternalGameDSL.g:1751:1: ( ( rule__CoordinateRange__StartRowAssignment_1 ) )
            // InternalGameDSL.g:1752:2: ( rule__CoordinateRange__StartRowAssignment_1 )
            {
             before(grammarAccess.getCoordinateRangeAccess().getStartRowAssignment_1()); 
            // InternalGameDSL.g:1753:2: ( rule__CoordinateRange__StartRowAssignment_1 )
            // InternalGameDSL.g:1753:3: rule__CoordinateRange__StartRowAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CoordinateRange__StartRowAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCoordinateRangeAccess().getStartRowAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinateRange__Group__1__Impl"


    // $ANTLR start "rule__CoordinateRange__Group__2"
    // InternalGameDSL.g:1761:1: rule__CoordinateRange__Group__2 : rule__CoordinateRange__Group__2__Impl rule__CoordinateRange__Group__3 ;
    public final void rule__CoordinateRange__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:1765:1: ( rule__CoordinateRange__Group__2__Impl rule__CoordinateRange__Group__3 )
            // InternalGameDSL.g:1766:2: rule__CoordinateRange__Group__2__Impl rule__CoordinateRange__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__CoordinateRange__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CoordinateRange__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinateRange__Group__2"


    // $ANTLR start "rule__CoordinateRange__Group__2__Impl"
    // InternalGameDSL.g:1773:1: rule__CoordinateRange__Group__2__Impl : ( ',' ) ;
    public final void rule__CoordinateRange__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:1777:1: ( ( ',' ) )
            // InternalGameDSL.g:1778:1: ( ',' )
            {
            // InternalGameDSL.g:1778:1: ( ',' )
            // InternalGameDSL.g:1779:2: ','
            {
             before(grammarAccess.getCoordinateRangeAccess().getCommaKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getCoordinateRangeAccess().getCommaKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinateRange__Group__2__Impl"


    // $ANTLR start "rule__CoordinateRange__Group__3"
    // InternalGameDSL.g:1788:1: rule__CoordinateRange__Group__3 : rule__CoordinateRange__Group__3__Impl rule__CoordinateRange__Group__4 ;
    public final void rule__CoordinateRange__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:1792:1: ( rule__CoordinateRange__Group__3__Impl rule__CoordinateRange__Group__4 )
            // InternalGameDSL.g:1793:2: rule__CoordinateRange__Group__3__Impl rule__CoordinateRange__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__CoordinateRange__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CoordinateRange__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinateRange__Group__3"


    // $ANTLR start "rule__CoordinateRange__Group__3__Impl"
    // InternalGameDSL.g:1800:1: rule__CoordinateRange__Group__3__Impl : ( ( rule__CoordinateRange__StartColAssignment_3 ) ) ;
    public final void rule__CoordinateRange__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:1804:1: ( ( ( rule__CoordinateRange__StartColAssignment_3 ) ) )
            // InternalGameDSL.g:1805:1: ( ( rule__CoordinateRange__StartColAssignment_3 ) )
            {
            // InternalGameDSL.g:1805:1: ( ( rule__CoordinateRange__StartColAssignment_3 ) )
            // InternalGameDSL.g:1806:2: ( rule__CoordinateRange__StartColAssignment_3 )
            {
             before(grammarAccess.getCoordinateRangeAccess().getStartColAssignment_3()); 
            // InternalGameDSL.g:1807:2: ( rule__CoordinateRange__StartColAssignment_3 )
            // InternalGameDSL.g:1807:3: rule__CoordinateRange__StartColAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__CoordinateRange__StartColAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCoordinateRangeAccess().getStartColAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinateRange__Group__3__Impl"


    // $ANTLR start "rule__CoordinateRange__Group__4"
    // InternalGameDSL.g:1815:1: rule__CoordinateRange__Group__4 : rule__CoordinateRange__Group__4__Impl rule__CoordinateRange__Group__5 ;
    public final void rule__CoordinateRange__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:1819:1: ( rule__CoordinateRange__Group__4__Impl rule__CoordinateRange__Group__5 )
            // InternalGameDSL.g:1820:2: rule__CoordinateRange__Group__4__Impl rule__CoordinateRange__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__CoordinateRange__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CoordinateRange__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinateRange__Group__4"


    // $ANTLR start "rule__CoordinateRange__Group__4__Impl"
    // InternalGameDSL.g:1827:1: rule__CoordinateRange__Group__4__Impl : ( ']' ) ;
    public final void rule__CoordinateRange__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:1831:1: ( ( ']' ) )
            // InternalGameDSL.g:1832:1: ( ']' )
            {
            // InternalGameDSL.g:1832:1: ( ']' )
            // InternalGameDSL.g:1833:2: ']'
            {
             before(grammarAccess.getCoordinateRangeAccess().getRightSquareBracketKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getCoordinateRangeAccess().getRightSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinateRange__Group__4__Impl"


    // $ANTLR start "rule__CoordinateRange__Group__5"
    // InternalGameDSL.g:1842:1: rule__CoordinateRange__Group__5 : rule__CoordinateRange__Group__5__Impl rule__CoordinateRange__Group__6 ;
    public final void rule__CoordinateRange__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:1846:1: ( rule__CoordinateRange__Group__5__Impl rule__CoordinateRange__Group__6 )
            // InternalGameDSL.g:1847:2: rule__CoordinateRange__Group__5__Impl rule__CoordinateRange__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__CoordinateRange__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CoordinateRange__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinateRange__Group__5"


    // $ANTLR start "rule__CoordinateRange__Group__5__Impl"
    // InternalGameDSL.g:1854:1: rule__CoordinateRange__Group__5__Impl : ( '-' ) ;
    public final void rule__CoordinateRange__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:1858:1: ( ( '-' ) )
            // InternalGameDSL.g:1859:1: ( '-' )
            {
            // InternalGameDSL.g:1859:1: ( '-' )
            // InternalGameDSL.g:1860:2: '-'
            {
             before(grammarAccess.getCoordinateRangeAccess().getHyphenMinusKeyword_5()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getCoordinateRangeAccess().getHyphenMinusKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinateRange__Group__5__Impl"


    // $ANTLR start "rule__CoordinateRange__Group__6"
    // InternalGameDSL.g:1869:1: rule__CoordinateRange__Group__6 : rule__CoordinateRange__Group__6__Impl rule__CoordinateRange__Group__7 ;
    public final void rule__CoordinateRange__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:1873:1: ( rule__CoordinateRange__Group__6__Impl rule__CoordinateRange__Group__7 )
            // InternalGameDSL.g:1874:2: rule__CoordinateRange__Group__6__Impl rule__CoordinateRange__Group__7
            {
            pushFollow(FOLLOW_4);
            rule__CoordinateRange__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CoordinateRange__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinateRange__Group__6"


    // $ANTLR start "rule__CoordinateRange__Group__6__Impl"
    // InternalGameDSL.g:1881:1: rule__CoordinateRange__Group__6__Impl : ( '[' ) ;
    public final void rule__CoordinateRange__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:1885:1: ( ( '[' ) )
            // InternalGameDSL.g:1886:1: ( '[' )
            {
            // InternalGameDSL.g:1886:1: ( '[' )
            // InternalGameDSL.g:1887:2: '['
            {
             before(grammarAccess.getCoordinateRangeAccess().getLeftSquareBracketKeyword_6()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getCoordinateRangeAccess().getLeftSquareBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinateRange__Group__6__Impl"


    // $ANTLR start "rule__CoordinateRange__Group__7"
    // InternalGameDSL.g:1896:1: rule__CoordinateRange__Group__7 : rule__CoordinateRange__Group__7__Impl rule__CoordinateRange__Group__8 ;
    public final void rule__CoordinateRange__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:1900:1: ( rule__CoordinateRange__Group__7__Impl rule__CoordinateRange__Group__8 )
            // InternalGameDSL.g:1901:2: rule__CoordinateRange__Group__7__Impl rule__CoordinateRange__Group__8
            {
            pushFollow(FOLLOW_20);
            rule__CoordinateRange__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CoordinateRange__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinateRange__Group__7"


    // $ANTLR start "rule__CoordinateRange__Group__7__Impl"
    // InternalGameDSL.g:1908:1: rule__CoordinateRange__Group__7__Impl : ( ( rule__CoordinateRange__EndRowAssignment_7 ) ) ;
    public final void rule__CoordinateRange__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:1912:1: ( ( ( rule__CoordinateRange__EndRowAssignment_7 ) ) )
            // InternalGameDSL.g:1913:1: ( ( rule__CoordinateRange__EndRowAssignment_7 ) )
            {
            // InternalGameDSL.g:1913:1: ( ( rule__CoordinateRange__EndRowAssignment_7 ) )
            // InternalGameDSL.g:1914:2: ( rule__CoordinateRange__EndRowAssignment_7 )
            {
             before(grammarAccess.getCoordinateRangeAccess().getEndRowAssignment_7()); 
            // InternalGameDSL.g:1915:2: ( rule__CoordinateRange__EndRowAssignment_7 )
            // InternalGameDSL.g:1915:3: rule__CoordinateRange__EndRowAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__CoordinateRange__EndRowAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getCoordinateRangeAccess().getEndRowAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinateRange__Group__7__Impl"


    // $ANTLR start "rule__CoordinateRange__Group__8"
    // InternalGameDSL.g:1923:1: rule__CoordinateRange__Group__8 : rule__CoordinateRange__Group__8__Impl rule__CoordinateRange__Group__9 ;
    public final void rule__CoordinateRange__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:1927:1: ( rule__CoordinateRange__Group__8__Impl rule__CoordinateRange__Group__9 )
            // InternalGameDSL.g:1928:2: rule__CoordinateRange__Group__8__Impl rule__CoordinateRange__Group__9
            {
            pushFollow(FOLLOW_4);
            rule__CoordinateRange__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CoordinateRange__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinateRange__Group__8"


    // $ANTLR start "rule__CoordinateRange__Group__8__Impl"
    // InternalGameDSL.g:1935:1: rule__CoordinateRange__Group__8__Impl : ( ',' ) ;
    public final void rule__CoordinateRange__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:1939:1: ( ( ',' ) )
            // InternalGameDSL.g:1940:1: ( ',' )
            {
            // InternalGameDSL.g:1940:1: ( ',' )
            // InternalGameDSL.g:1941:2: ','
            {
             before(grammarAccess.getCoordinateRangeAccess().getCommaKeyword_8()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getCoordinateRangeAccess().getCommaKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinateRange__Group__8__Impl"


    // $ANTLR start "rule__CoordinateRange__Group__9"
    // InternalGameDSL.g:1950:1: rule__CoordinateRange__Group__9 : rule__CoordinateRange__Group__9__Impl rule__CoordinateRange__Group__10 ;
    public final void rule__CoordinateRange__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:1954:1: ( rule__CoordinateRange__Group__9__Impl rule__CoordinateRange__Group__10 )
            // InternalGameDSL.g:1955:2: rule__CoordinateRange__Group__9__Impl rule__CoordinateRange__Group__10
            {
            pushFollow(FOLLOW_21);
            rule__CoordinateRange__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CoordinateRange__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinateRange__Group__9"


    // $ANTLR start "rule__CoordinateRange__Group__9__Impl"
    // InternalGameDSL.g:1962:1: rule__CoordinateRange__Group__9__Impl : ( ( rule__CoordinateRange__EndColAssignment_9 ) ) ;
    public final void rule__CoordinateRange__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:1966:1: ( ( ( rule__CoordinateRange__EndColAssignment_9 ) ) )
            // InternalGameDSL.g:1967:1: ( ( rule__CoordinateRange__EndColAssignment_9 ) )
            {
            // InternalGameDSL.g:1967:1: ( ( rule__CoordinateRange__EndColAssignment_9 ) )
            // InternalGameDSL.g:1968:2: ( rule__CoordinateRange__EndColAssignment_9 )
            {
             before(grammarAccess.getCoordinateRangeAccess().getEndColAssignment_9()); 
            // InternalGameDSL.g:1969:2: ( rule__CoordinateRange__EndColAssignment_9 )
            // InternalGameDSL.g:1969:3: rule__CoordinateRange__EndColAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__CoordinateRange__EndColAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getCoordinateRangeAccess().getEndColAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinateRange__Group__9__Impl"


    // $ANTLR start "rule__CoordinateRange__Group__10"
    // InternalGameDSL.g:1977:1: rule__CoordinateRange__Group__10 : rule__CoordinateRange__Group__10__Impl ;
    public final void rule__CoordinateRange__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:1981:1: ( rule__CoordinateRange__Group__10__Impl )
            // InternalGameDSL.g:1982:2: rule__CoordinateRange__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CoordinateRange__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinateRange__Group__10"


    // $ANTLR start "rule__CoordinateRange__Group__10__Impl"
    // InternalGameDSL.g:1988:1: rule__CoordinateRange__Group__10__Impl : ( ']' ) ;
    public final void rule__CoordinateRange__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:1992:1: ( ( ']' ) )
            // InternalGameDSL.g:1993:1: ( ']' )
            {
            // InternalGameDSL.g:1993:1: ( ']' )
            // InternalGameDSL.g:1994:2: ']'
            {
             before(grammarAccess.getCoordinateRangeAccess().getRightSquareBracketKeyword_10()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getCoordinateRangeAccess().getRightSquareBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinateRange__Group__10__Impl"


    // $ANTLR start "rule__Model__StatementsAssignment"
    // InternalGameDSL.g:2004:1: rule__Model__StatementsAssignment : ( ruleStatement ) ;
    public final void rule__Model__StatementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:2008:1: ( ( ruleStatement ) )
            // InternalGameDSL.g:2009:2: ( ruleStatement )
            {
            // InternalGameDSL.g:2009:2: ( ruleStatement )
            // InternalGameDSL.g:2010:3: ruleStatement
            {
             before(grammarAccess.getModelAccess().getStatementsStatementParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getModelAccess().getStatementsStatementParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__StatementsAssignment"


    // $ANTLR start "rule__Board__RowsAssignment_1"
    // InternalGameDSL.g:2019:1: rule__Board__RowsAssignment_1 : ( RULE_INT ) ;
    public final void rule__Board__RowsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:2023:1: ( ( RULE_INT ) )
            // InternalGameDSL.g:2024:2: ( RULE_INT )
            {
            // InternalGameDSL.g:2024:2: ( RULE_INT )
            // InternalGameDSL.g:2025:3: RULE_INT
            {
             before(grammarAccess.getBoardAccess().getRowsINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getBoardAccess().getRowsINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__RowsAssignment_1"


    // $ANTLR start "rule__Board__ColsAssignment_3"
    // InternalGameDSL.g:2034:1: rule__Board__ColsAssignment_3 : ( RULE_INT ) ;
    public final void rule__Board__ColsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:2038:1: ( ( RULE_INT ) )
            // InternalGameDSL.g:2039:2: ( RULE_INT )
            {
            // InternalGameDSL.g:2039:2: ( RULE_INT )
            // InternalGameDSL.g:2040:3: RULE_INT
            {
             before(grammarAccess.getBoardAccess().getColsINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getBoardAccess().getColsINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__ColsAssignment_3"


    // $ANTLR start "rule__Player__NameAssignment_1"
    // InternalGameDSL.g:2049:1: rule__Player__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Player__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:2053:1: ( ( RULE_STRING ) )
            // InternalGameDSL.g:2054:2: ( RULE_STRING )
            {
            // InternalGameDSL.g:2054:2: ( RULE_STRING )
            // InternalGameDSL.g:2055:3: RULE_STRING
            {
             before(grammarAccess.getPlayerAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPlayerAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Player__NameAssignment_1"


    // $ANTLR start "rule__TurnOrder__PlayersAssignment_2"
    // InternalGameDSL.g:2064:1: rule__TurnOrder__PlayersAssignment_2 : ( RULE_STRING ) ;
    public final void rule__TurnOrder__PlayersAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:2068:1: ( ( RULE_STRING ) )
            // InternalGameDSL.g:2069:2: ( RULE_STRING )
            {
            // InternalGameDSL.g:2069:2: ( RULE_STRING )
            // InternalGameDSL.g:2070:3: RULE_STRING
            {
             before(grammarAccess.getTurnOrderAccess().getPlayersSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTurnOrderAccess().getPlayersSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnOrder__PlayersAssignment_2"


    // $ANTLR start "rule__TurnOrder__PlayersAssignment_3_1"
    // InternalGameDSL.g:2079:1: rule__TurnOrder__PlayersAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__TurnOrder__PlayersAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:2083:1: ( ( RULE_STRING ) )
            // InternalGameDSL.g:2084:2: ( RULE_STRING )
            {
            // InternalGameDSL.g:2084:2: ( RULE_STRING )
            // InternalGameDSL.g:2085:3: RULE_STRING
            {
             before(grammarAccess.getTurnOrderAccess().getPlayersSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTurnOrderAccess().getPlayersSTRINGTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnOrder__PlayersAssignment_3_1"


    // $ANTLR start "rule__Piece__NameAssignment_1"
    // InternalGameDSL.g:2094:1: rule__Piece__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Piece__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:2098:1: ( ( RULE_STRING ) )
            // InternalGameDSL.g:2099:2: ( RULE_STRING )
            {
            // InternalGameDSL.g:2099:2: ( RULE_STRING )
            // InternalGameDSL.g:2100:3: RULE_STRING
            {
             before(grammarAccess.getPieceAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPieceAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Piece__NameAssignment_1"


    // $ANTLR start "rule__Piece__SymbolAssignment_3"
    // InternalGameDSL.g:2109:1: rule__Piece__SymbolAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Piece__SymbolAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:2113:1: ( ( RULE_STRING ) )
            // InternalGameDSL.g:2114:2: ( RULE_STRING )
            {
            // InternalGameDSL.g:2114:2: ( RULE_STRING )
            // InternalGameDSL.g:2115:3: RULE_STRING
            {
             before(grammarAccess.getPieceAccess().getSymbolSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPieceAccess().getSymbolSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Piece__SymbolAssignment_3"


    // $ANTLR start "rule__Piece__OwnerAssignment_5"
    // InternalGameDSL.g:2124:1: rule__Piece__OwnerAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Piece__OwnerAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:2128:1: ( ( RULE_STRING ) )
            // InternalGameDSL.g:2129:2: ( RULE_STRING )
            {
            // InternalGameDSL.g:2129:2: ( RULE_STRING )
            // InternalGameDSL.g:2130:3: RULE_STRING
            {
             before(grammarAccess.getPieceAccess().getOwnerSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPieceAccess().getOwnerSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Piece__OwnerAssignment_5"


    // $ANTLR start "rule__Piece__CountAssignment_6_1"
    // InternalGameDSL.g:2139:1: rule__Piece__CountAssignment_6_1 : ( RULE_INT ) ;
    public final void rule__Piece__CountAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:2143:1: ( ( RULE_INT ) )
            // InternalGameDSL.g:2144:2: ( RULE_INT )
            {
            // InternalGameDSL.g:2144:2: ( RULE_INT )
            // InternalGameDSL.g:2145:3: RULE_INT
            {
             before(grammarAccess.getPieceAccess().getCountINTTerminalRuleCall_6_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPieceAccess().getCountINTTerminalRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Piece__CountAssignment_6_1"


    // $ANTLR start "rule__Placement__PieceAssignment_1"
    // InternalGameDSL.g:2154:1: rule__Placement__PieceAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Placement__PieceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:2158:1: ( ( ( RULE_ID ) ) )
            // InternalGameDSL.g:2159:2: ( ( RULE_ID ) )
            {
            // InternalGameDSL.g:2159:2: ( ( RULE_ID ) )
            // InternalGameDSL.g:2160:3: ( RULE_ID )
            {
             before(grammarAccess.getPlacementAccess().getPiecePieceCrossReference_1_0()); 
            // InternalGameDSL.g:2161:3: ( RULE_ID )
            // InternalGameDSL.g:2162:4: RULE_ID
            {
             before(grammarAccess.getPlacementAccess().getPiecePieceIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPlacementAccess().getPiecePieceIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getPlacementAccess().getPiecePieceCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Placement__PieceAssignment_1"


    // $ANTLR start "rule__Placement__RangeAssignment_3"
    // InternalGameDSL.g:2173:1: rule__Placement__RangeAssignment_3 : ( ruleCoordinateRange ) ;
    public final void rule__Placement__RangeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:2177:1: ( ( ruleCoordinateRange ) )
            // InternalGameDSL.g:2178:2: ( ruleCoordinateRange )
            {
            // InternalGameDSL.g:2178:2: ( ruleCoordinateRange )
            // InternalGameDSL.g:2179:3: ruleCoordinateRange
            {
             before(grammarAccess.getPlacementAccess().getRangeCoordinateRangeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleCoordinateRange();

            state._fsp--;

             after(grammarAccess.getPlacementAccess().getRangeCoordinateRangeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Placement__RangeAssignment_3"


    // $ANTLR start "rule__Placement__OwnerAssignment_5"
    // InternalGameDSL.g:2188:1: rule__Placement__OwnerAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Placement__OwnerAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:2192:1: ( ( RULE_STRING ) )
            // InternalGameDSL.g:2193:2: ( RULE_STRING )
            {
            // InternalGameDSL.g:2193:2: ( RULE_STRING )
            // InternalGameDSL.g:2194:3: RULE_STRING
            {
             before(grammarAccess.getPlacementAccess().getOwnerSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPlacementAccess().getOwnerSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Placement__OwnerAssignment_5"


    // $ANTLR start "rule__Move__PieceAssignment_1"
    // InternalGameDSL.g:2203:1: rule__Move__PieceAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Move__PieceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:2207:1: ( ( ( RULE_ID ) ) )
            // InternalGameDSL.g:2208:2: ( ( RULE_ID ) )
            {
            // InternalGameDSL.g:2208:2: ( ( RULE_ID ) )
            // InternalGameDSL.g:2209:3: ( RULE_ID )
            {
             before(grammarAccess.getMoveAccess().getPiecePieceCrossReference_1_0()); 
            // InternalGameDSL.g:2210:3: ( RULE_ID )
            // InternalGameDSL.g:2211:4: RULE_ID
            {
             before(grammarAccess.getMoveAccess().getPiecePieceIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMoveAccess().getPiecePieceIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getMoveAccess().getPiecePieceCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__PieceAssignment_1"


    // $ANTLR start "rule__Move__DirectionAssignment_3"
    // InternalGameDSL.g:2222:1: rule__Move__DirectionAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Move__DirectionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:2226:1: ( ( RULE_STRING ) )
            // InternalGameDSL.g:2227:2: ( RULE_STRING )
            {
            // InternalGameDSL.g:2227:2: ( RULE_STRING )
            // InternalGameDSL.g:2228:3: RULE_STRING
            {
             before(grammarAccess.getMoveAccess().getDirectionSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMoveAccess().getDirectionSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__DirectionAssignment_3"


    // $ANTLR start "rule__Move__StepsAssignment_4"
    // InternalGameDSL.g:2237:1: rule__Move__StepsAssignment_4 : ( RULE_INT ) ;
    public final void rule__Move__StepsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:2241:1: ( ( RULE_INT ) )
            // InternalGameDSL.g:2242:2: ( RULE_INT )
            {
            // InternalGameDSL.g:2242:2: ( RULE_INT )
            // InternalGameDSL.g:2243:3: RULE_INT
            {
             before(grammarAccess.getMoveAccess().getStepsINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getMoveAccess().getStepsINTTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__StepsAssignment_4"


    // $ANTLR start "rule__Move__ConditionAssignment_5_1"
    // InternalGameDSL.g:2252:1: rule__Move__ConditionAssignment_5_1 : ( RULE_STRING ) ;
    public final void rule__Move__ConditionAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:2256:1: ( ( RULE_STRING ) )
            // InternalGameDSL.g:2257:2: ( RULE_STRING )
            {
            // InternalGameDSL.g:2257:2: ( RULE_STRING )
            // InternalGameDSL.g:2258:3: RULE_STRING
            {
             before(grammarAccess.getMoveAccess().getConditionSTRINGTerminalRuleCall_5_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMoveAccess().getConditionSTRINGTerminalRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__ConditionAssignment_5_1"


    // $ANTLR start "rule__Rule__NameAssignment_1"
    // InternalGameDSL.g:2267:1: rule__Rule__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Rule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:2271:1: ( ( RULE_STRING ) )
            // InternalGameDSL.g:2272:2: ( RULE_STRING )
            {
            // InternalGameDSL.g:2272:2: ( RULE_STRING )
            // InternalGameDSL.g:2273:3: RULE_STRING
            {
             before(grammarAccess.getRuleAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__NameAssignment_1"


    // $ANTLR start "rule__Rule__ConditionAssignment_3"
    // InternalGameDSL.g:2282:1: rule__Rule__ConditionAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Rule__ConditionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:2286:1: ( ( RULE_STRING ) )
            // InternalGameDSL.g:2287:2: ( RULE_STRING )
            {
            // InternalGameDSL.g:2287:2: ( RULE_STRING )
            // InternalGameDSL.g:2288:3: RULE_STRING
            {
             before(grammarAccess.getRuleAccess().getConditionSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getConditionSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__ConditionAssignment_3"


    // $ANTLR start "rule__Rule__ActionAssignment_5"
    // InternalGameDSL.g:2297:1: rule__Rule__ActionAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Rule__ActionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:2301:1: ( ( RULE_STRING ) )
            // InternalGameDSL.g:2302:2: ( RULE_STRING )
            {
            // InternalGameDSL.g:2302:2: ( RULE_STRING )
            // InternalGameDSL.g:2303:3: RULE_STRING
            {
             before(grammarAccess.getRuleAccess().getActionSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getActionSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__ActionAssignment_5"


    // $ANTLR start "rule__WinCondition__ConditionAssignment_2"
    // InternalGameDSL.g:2312:1: rule__WinCondition__ConditionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__WinCondition__ConditionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:2316:1: ( ( RULE_STRING ) )
            // InternalGameDSL.g:2317:2: ( RULE_STRING )
            {
            // InternalGameDSL.g:2317:2: ( RULE_STRING )
            // InternalGameDSL.g:2318:3: RULE_STRING
            {
             before(grammarAccess.getWinConditionAccess().getConditionSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getWinConditionAccess().getConditionSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WinCondition__ConditionAssignment_2"


    // $ANTLR start "rule__WinCondition__WinnerAssignment_6"
    // InternalGameDSL.g:2327:1: rule__WinCondition__WinnerAssignment_6 : ( RULE_STRING ) ;
    public final void rule__WinCondition__WinnerAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:2331:1: ( ( RULE_STRING ) )
            // InternalGameDSL.g:2332:2: ( RULE_STRING )
            {
            // InternalGameDSL.g:2332:2: ( RULE_STRING )
            // InternalGameDSL.g:2333:3: RULE_STRING
            {
             before(grammarAccess.getWinConditionAccess().getWinnerSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getWinConditionAccess().getWinnerSTRINGTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WinCondition__WinnerAssignment_6"


    // $ANTLR start "rule__CoordinateRange__StartRowAssignment_1"
    // InternalGameDSL.g:2342:1: rule__CoordinateRange__StartRowAssignment_1 : ( RULE_INT ) ;
    public final void rule__CoordinateRange__StartRowAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:2346:1: ( ( RULE_INT ) )
            // InternalGameDSL.g:2347:2: ( RULE_INT )
            {
            // InternalGameDSL.g:2347:2: ( RULE_INT )
            // InternalGameDSL.g:2348:3: RULE_INT
            {
             before(grammarAccess.getCoordinateRangeAccess().getStartRowINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCoordinateRangeAccess().getStartRowINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinateRange__StartRowAssignment_1"


    // $ANTLR start "rule__CoordinateRange__StartColAssignment_3"
    // InternalGameDSL.g:2357:1: rule__CoordinateRange__StartColAssignment_3 : ( RULE_INT ) ;
    public final void rule__CoordinateRange__StartColAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:2361:1: ( ( RULE_INT ) )
            // InternalGameDSL.g:2362:2: ( RULE_INT )
            {
            // InternalGameDSL.g:2362:2: ( RULE_INT )
            // InternalGameDSL.g:2363:3: RULE_INT
            {
             before(grammarAccess.getCoordinateRangeAccess().getStartColINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCoordinateRangeAccess().getStartColINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinateRange__StartColAssignment_3"


    // $ANTLR start "rule__CoordinateRange__EndRowAssignment_7"
    // InternalGameDSL.g:2372:1: rule__CoordinateRange__EndRowAssignment_7 : ( RULE_INT ) ;
    public final void rule__CoordinateRange__EndRowAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:2376:1: ( ( RULE_INT ) )
            // InternalGameDSL.g:2377:2: ( RULE_INT )
            {
            // InternalGameDSL.g:2377:2: ( RULE_INT )
            // InternalGameDSL.g:2378:3: RULE_INT
            {
             before(grammarAccess.getCoordinateRangeAccess().getEndRowINTTerminalRuleCall_7_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCoordinateRangeAccess().getEndRowINTTerminalRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinateRange__EndRowAssignment_7"


    // $ANTLR start "rule__CoordinateRange__EndColAssignment_9"
    // InternalGameDSL.g:2387:1: rule__CoordinateRange__EndColAssignment_9 : ( RULE_INT ) ;
    public final void rule__CoordinateRange__EndColAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:2391:1: ( ( RULE_INT ) )
            // InternalGameDSL.g:2392:2: ( RULE_INT )
            {
            // InternalGameDSL.g:2392:2: ( RULE_INT )
            // InternalGameDSL.g:2393:3: RULE_INT
            {
             before(grammarAccess.getCoordinateRangeAccess().getEndColINTTerminalRuleCall_9_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCoordinateRangeAccess().getEndColINTTerminalRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinateRange__EndColAssignment_9"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000029246802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000100000000L});

}