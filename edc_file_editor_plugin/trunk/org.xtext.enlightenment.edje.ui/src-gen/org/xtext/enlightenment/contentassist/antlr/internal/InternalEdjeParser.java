package org.xtext.enlightenment.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.xtext.enlightenment.services.EdjeGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalEdjeParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'#include'", "'lua_script {'", "'}'", "'collections {'", "'group {'", "'name:'", "';'", "'min:'", "'parts {'", "'programs {'", "'part {'", "'type:'", "'description {'", "'rel1 {'", "'rel2 {'", "'color:'", "'absolute:'", "'relative:'", "'offset:'", "'program {'", "'signal:'", "'source:'", "'action:'"
    };
    public static final int RULE_ID=6;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

        public InternalEdjeParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g"; }


     
     	private EdjeGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(EdjeGrammarAccess grammarAccess) {
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




    // $ANTLR start entryRuleModel
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:60:16: ( ruleModel EOF )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:61:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel60);
            ruleModel();
            _fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel67); 

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
    // $ANTLR end entryRuleModel


    // $ANTLR start ruleModel
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:68:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:72:2: ( ( ( rule__Model__Group__0 ) ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:73:1: ( ( rule__Model__Group__0 ) )
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:73:1: ( ( rule__Model__Group__0 ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:74:1: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:75:1: ( rule__Model__Group__0 )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:75:2: rule__Model__Group__0
            {
            pushFollow(FOLLOW_rule__Model__Group__0_in_ruleModel94);
            rule__Model__Group__0();
            _fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

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
    // $ANTLR end ruleModel


    // $ANTLR start entryRuleInclude
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:87:1: entryRuleInclude : ruleInclude EOF ;
    public final void entryRuleInclude() throws RecognitionException {
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:87:18: ( ruleInclude EOF )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:88:1: ruleInclude EOF
            {
             before(grammarAccess.getIncludeRule()); 
            pushFollow(FOLLOW_ruleInclude_in_entryRuleInclude120);
            ruleInclude();
            _fsp--;

             after(grammarAccess.getIncludeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInclude127); 

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
    // $ANTLR end entryRuleInclude


    // $ANTLR start ruleInclude
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:95:1: ruleInclude : ( '#include' ) ;
    public final void ruleInclude() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:99:2: ( ( '#include' ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:100:1: ( '#include' )
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:100:1: ( '#include' )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:101:1: '#include'
            {
             before(grammarAccess.getIncludeAccess().getIncludeKeyword()); 
            match(input,11,FOLLOW_11_in_ruleInclude155); 
             after(grammarAccess.getIncludeAccess().getIncludeKeyword()); 

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
    // $ANTLR end ruleInclude


    // $ANTLR start entryRuleLUA_Script
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:118:1: entryRuleLUA_Script : ruleLUA_Script EOF ;
    public final void entryRuleLUA_Script() throws RecognitionException {
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:118:21: ( ruleLUA_Script EOF )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:119:1: ruleLUA_Script EOF
            {
             before(grammarAccess.getLUA_ScriptRule()); 
            pushFollow(FOLLOW_ruleLUA_Script_in_entryRuleLUA_Script184);
            ruleLUA_Script();
            _fsp--;

             after(grammarAccess.getLUA_ScriptRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLUA_Script191); 

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
    // $ANTLR end entryRuleLUA_Script


    // $ANTLR start ruleLUA_Script
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:126:1: ruleLUA_Script : ( ( rule__LUA_Script__Group__0 ) ) ;
    public final void ruleLUA_Script() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:130:2: ( ( ( rule__LUA_Script__Group__0 ) ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:131:1: ( ( rule__LUA_Script__Group__0 ) )
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:131:1: ( ( rule__LUA_Script__Group__0 ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:132:1: ( rule__LUA_Script__Group__0 )
            {
             before(grammarAccess.getLUA_ScriptAccess().getGroup()); 
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:133:1: ( rule__LUA_Script__Group__0 )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:133:2: rule__LUA_Script__Group__0
            {
            pushFollow(FOLLOW_rule__LUA_Script__Group__0_in_ruleLUA_Script218);
            rule__LUA_Script__Group__0();
            _fsp--;


            }

             after(grammarAccess.getLUA_ScriptAccess().getGroup()); 

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
    // $ANTLR end ruleLUA_Script


    // $ANTLR start entryRuleCollections
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:145:1: entryRuleCollections : ruleCollections EOF ;
    public final void entryRuleCollections() throws RecognitionException {
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:145:22: ( ruleCollections EOF )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:146:1: ruleCollections EOF
            {
             before(grammarAccess.getCollectionsRule()); 
            pushFollow(FOLLOW_ruleCollections_in_entryRuleCollections244);
            ruleCollections();
            _fsp--;

             after(grammarAccess.getCollectionsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollections251); 

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
    // $ANTLR end entryRuleCollections


    // $ANTLR start ruleCollections
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:153:1: ruleCollections : ( ( rule__Collections__Group__0 ) ) ;
    public final void ruleCollections() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:157:2: ( ( ( rule__Collections__Group__0 ) ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:158:1: ( ( rule__Collections__Group__0 ) )
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:158:1: ( ( rule__Collections__Group__0 ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:159:1: ( rule__Collections__Group__0 )
            {
             before(grammarAccess.getCollectionsAccess().getGroup()); 
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:160:1: ( rule__Collections__Group__0 )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:160:2: rule__Collections__Group__0
            {
            pushFollow(FOLLOW_rule__Collections__Group__0_in_ruleCollections278);
            rule__Collections__Group__0();
            _fsp--;


            }

             after(grammarAccess.getCollectionsAccess().getGroup()); 

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
    // $ANTLR end ruleCollections


    // $ANTLR start entryRuleGroup
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:172:1: entryRuleGroup : ruleGroup EOF ;
    public final void entryRuleGroup() throws RecognitionException {
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:172:16: ( ruleGroup EOF )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:173:1: ruleGroup EOF
            {
             before(grammarAccess.getGroupRule()); 
            pushFollow(FOLLOW_ruleGroup_in_entryRuleGroup304);
            ruleGroup();
            _fsp--;

             after(grammarAccess.getGroupRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGroup311); 

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
    // $ANTLR end entryRuleGroup


    // $ANTLR start ruleGroup
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:180:1: ruleGroup : ( ( rule__Group__Group__0 ) ) ;
    public final void ruleGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:184:2: ( ( ( rule__Group__Group__0 ) ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:185:1: ( ( rule__Group__Group__0 ) )
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:185:1: ( ( rule__Group__Group__0 ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:186:1: ( rule__Group__Group__0 )
            {
             before(grammarAccess.getGroupAccess().getGroup()); 
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:187:1: ( rule__Group__Group__0 )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:187:2: rule__Group__Group__0
            {
            pushFollow(FOLLOW_rule__Group__Group__0_in_ruleGroup338);
            rule__Group__Group__0();
            _fsp--;


            }

             after(grammarAccess.getGroupAccess().getGroup()); 

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
    // $ANTLR end ruleGroup


    // $ANTLR start entryRulePart
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:199:1: entryRulePart : rulePart EOF ;
    public final void entryRulePart() throws RecognitionException {
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:199:15: ( rulePart EOF )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:200:1: rulePart EOF
            {
             before(grammarAccess.getPartRule()); 
            pushFollow(FOLLOW_rulePart_in_entryRulePart364);
            rulePart();
            _fsp--;

             after(grammarAccess.getPartRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePart371); 

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
    // $ANTLR end entryRulePart


    // $ANTLR start rulePart
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:207:1: rulePart : ( ( rule__Part__Group__0 ) ) ;
    public final void rulePart() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:211:2: ( ( ( rule__Part__Group__0 ) ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:212:1: ( ( rule__Part__Group__0 ) )
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:212:1: ( ( rule__Part__Group__0 ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:213:1: ( rule__Part__Group__0 )
            {
             before(grammarAccess.getPartAccess().getGroup()); 
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:214:1: ( rule__Part__Group__0 )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:214:2: rule__Part__Group__0
            {
            pushFollow(FOLLOW_rule__Part__Group__0_in_rulePart398);
            rule__Part__Group__0();
            _fsp--;


            }

             after(grammarAccess.getPartAccess().getGroup()); 

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
    // $ANTLR end rulePart


    // $ANTLR start entryRuleDescription
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:226:1: entryRuleDescription : ruleDescription EOF ;
    public final void entryRuleDescription() throws RecognitionException {
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:226:22: ( ruleDescription EOF )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:227:1: ruleDescription EOF
            {
             before(grammarAccess.getDescriptionRule()); 
            pushFollow(FOLLOW_ruleDescription_in_entryRuleDescription424);
            ruleDescription();
            _fsp--;

             after(grammarAccess.getDescriptionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDescription431); 

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
    // $ANTLR end entryRuleDescription


    // $ANTLR start ruleDescription
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:234:1: ruleDescription : ( ( rule__Description__Group__0 ) ) ;
    public final void ruleDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:238:2: ( ( ( rule__Description__Group__0 ) ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:239:1: ( ( rule__Description__Group__0 ) )
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:239:1: ( ( rule__Description__Group__0 ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:240:1: ( rule__Description__Group__0 )
            {
             before(grammarAccess.getDescriptionAccess().getGroup()); 
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:241:1: ( rule__Description__Group__0 )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:241:2: rule__Description__Group__0
            {
            pushFollow(FOLLOW_rule__Description__Group__0_in_ruleDescription458);
            rule__Description__Group__0();
            _fsp--;


            }

             after(grammarAccess.getDescriptionAccess().getGroup()); 

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
    // $ANTLR end ruleDescription


    // $ANTLR start entryRuleCoordinates
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:253:1: entryRuleCoordinates : ruleCoordinates EOF ;
    public final void entryRuleCoordinates() throws RecognitionException {
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:253:22: ( ruleCoordinates EOF )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:254:1: ruleCoordinates EOF
            {
             before(grammarAccess.getCoordinatesRule()); 
            pushFollow(FOLLOW_ruleCoordinates_in_entryRuleCoordinates484);
            ruleCoordinates();
            _fsp--;

             after(grammarAccess.getCoordinatesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCoordinates491); 

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
    // $ANTLR end entryRuleCoordinates


    // $ANTLR start ruleCoordinates
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:261:1: ruleCoordinates : ( ( rule__Coordinates__Group__0 ) ) ;
    public final void ruleCoordinates() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:265:2: ( ( ( rule__Coordinates__Group__0 ) ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:266:1: ( ( rule__Coordinates__Group__0 ) )
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:266:1: ( ( rule__Coordinates__Group__0 ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:267:1: ( rule__Coordinates__Group__0 )
            {
             before(grammarAccess.getCoordinatesAccess().getGroup()); 
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:268:1: ( rule__Coordinates__Group__0 )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:268:2: rule__Coordinates__Group__0
            {
            pushFollow(FOLLOW_rule__Coordinates__Group__0_in_ruleCoordinates518);
            rule__Coordinates__Group__0();
            _fsp--;


            }

             after(grammarAccess.getCoordinatesAccess().getGroup()); 

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
    // $ANTLR end ruleCoordinates


    // $ANTLR start entryRuleProgram
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:282:1: entryRuleProgram : ruleProgram EOF ;
    public final void entryRuleProgram() throws RecognitionException {
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:282:18: ( ruleProgram EOF )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:283:1: ruleProgram EOF
            {
             before(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_ruleProgram_in_entryRuleProgram546);
            ruleProgram();
            _fsp--;

             after(grammarAccess.getProgramRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProgram553); 

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
    // $ANTLR end entryRuleProgram


    // $ANTLR start ruleProgram
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:290:1: ruleProgram : ( ( rule__Program__Group__0 ) ) ;
    public final void ruleProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:294:2: ( ( ( rule__Program__Group__0 ) ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:295:1: ( ( rule__Program__Group__0 ) )
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:295:1: ( ( rule__Program__Group__0 ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:296:1: ( rule__Program__Group__0 )
            {
             before(grammarAccess.getProgramAccess().getGroup()); 
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:297:1: ( rule__Program__Group__0 )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:297:2: rule__Program__Group__0
            {
            pushFollow(FOLLOW_rule__Program__Group__0_in_ruleProgram580);
            rule__Program__Group__0();
            _fsp--;


            }

             after(grammarAccess.getProgramAccess().getGroup()); 

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
    // $ANTLR end ruleProgram


    // $ANTLR start entryRuleAction
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:309:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:309:17: ( ruleAction EOF )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:310:1: ruleAction EOF
            {
             before(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_ruleAction_in_entryRuleAction606);
            ruleAction();
            _fsp--;

             after(grammarAccess.getActionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAction613); 

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
    // $ANTLR end entryRuleAction


    // $ANTLR start ruleAction
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:317:1: ruleAction : ( ( rule__Action__Group__0 ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:321:2: ( ( ( rule__Action__Group__0 ) ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:322:1: ( ( rule__Action__Group__0 ) )
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:322:1: ( ( rule__Action__Group__0 ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:323:1: ( rule__Action__Group__0 )
            {
             before(grammarAccess.getActionAccess().getGroup()); 
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:324:1: ( rule__Action__Group__0 )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:324:2: rule__Action__Group__0
            {
            pushFollow(FOLLOW_rule__Action__Group__0_in_ruleAction640);
            rule__Action__Group__0();
            _fsp--;


            }

             after(grammarAccess.getActionAccess().getGroup()); 

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
    // $ANTLR end ruleAction


    // $ANTLR start rule__Model__Group__0
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:338:1: rule__Model__Group__0 : ( ( rule__Model__IncludesAssignment_0 )* ) rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:342:1: ( ( ( rule__Model__IncludesAssignment_0 )* ) rule__Model__Group__1 )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:343:1: ( ( rule__Model__IncludesAssignment_0 )* ) rule__Model__Group__1
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:343:1: ( ( rule__Model__IncludesAssignment_0 )* )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:344:1: ( rule__Model__IncludesAssignment_0 )*
            {
             before(grammarAccess.getModelAccess().getIncludesAssignment_0()); 
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:345:1: ( rule__Model__IncludesAssignment_0 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:345:2: rule__Model__IncludesAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Model__IncludesAssignment_0_in_rule__Model__Group__0678);
            	    rule__Model__IncludesAssignment_0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getIncludesAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0688);
            rule__Model__Group__1();
            _fsp--;


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
    // $ANTLR end rule__Model__Group__0


    // $ANTLR start rule__Model__Group__1
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:356:1: rule__Model__Group__1 : ( ( rule__Model__CollectionsAssignment_1 )* ) ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:360:1: ( ( ( rule__Model__CollectionsAssignment_1 )* ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:361:1: ( ( rule__Model__CollectionsAssignment_1 )* )
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:361:1: ( ( rule__Model__CollectionsAssignment_1 )* )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:362:1: ( rule__Model__CollectionsAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getCollectionsAssignment_1()); 
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:363:1: ( rule__Model__CollectionsAssignment_1 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:363:2: rule__Model__CollectionsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Model__CollectionsAssignment_1_in_rule__Model__Group__1716);
            	    rule__Model__CollectionsAssignment_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getCollectionsAssignment_1()); 

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
    // $ANTLR end rule__Model__Group__1


    // $ANTLR start rule__LUA_Script__Group__0
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:377:1: rule__LUA_Script__Group__0 : ( 'lua_script {' ) rule__LUA_Script__Group__1 ;
    public final void rule__LUA_Script__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:381:1: ( ( 'lua_script {' ) rule__LUA_Script__Group__1 )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:382:1: ( 'lua_script {' ) rule__LUA_Script__Group__1
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:382:1: ( 'lua_script {' )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:383:1: 'lua_script {'
            {
             before(grammarAccess.getLUA_ScriptAccess().getLua_scriptKeyword_0()); 
            match(input,12,FOLLOW_12_in_rule__LUA_Script__Group__0756); 
             after(grammarAccess.getLUA_ScriptAccess().getLua_scriptKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__LUA_Script__Group__1_in_rule__LUA_Script__Group__0766);
            rule__LUA_Script__Group__1();
            _fsp--;


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
    // $ANTLR end rule__LUA_Script__Group__0


    // $ANTLR start rule__LUA_Script__Group__1
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:397:1: rule__LUA_Script__Group__1 : ( ( rule__LUA_Script__ContentAssignment_1 ) ) rule__LUA_Script__Group__2 ;
    public final void rule__LUA_Script__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:401:1: ( ( ( rule__LUA_Script__ContentAssignment_1 ) ) rule__LUA_Script__Group__2 )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:402:1: ( ( rule__LUA_Script__ContentAssignment_1 ) ) rule__LUA_Script__Group__2
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:402:1: ( ( rule__LUA_Script__ContentAssignment_1 ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:403:1: ( rule__LUA_Script__ContentAssignment_1 )
            {
             before(grammarAccess.getLUA_ScriptAccess().getContentAssignment_1()); 
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:404:1: ( rule__LUA_Script__ContentAssignment_1 )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:404:2: rule__LUA_Script__ContentAssignment_1
            {
            pushFollow(FOLLOW_rule__LUA_Script__ContentAssignment_1_in_rule__LUA_Script__Group__1794);
            rule__LUA_Script__ContentAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getLUA_ScriptAccess().getContentAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__LUA_Script__Group__2_in_rule__LUA_Script__Group__1803);
            rule__LUA_Script__Group__2();
            _fsp--;


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
    // $ANTLR end rule__LUA_Script__Group__1


    // $ANTLR start rule__LUA_Script__Group__2
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:415:1: rule__LUA_Script__Group__2 : ( '}' ) ;
    public final void rule__LUA_Script__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:419:1: ( ( '}' ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:420:1: ( '}' )
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:420:1: ( '}' )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:421:1: '}'
            {
             before(grammarAccess.getLUA_ScriptAccess().getRightCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_13_in_rule__LUA_Script__Group__2832); 
             after(grammarAccess.getLUA_ScriptAccess().getRightCurlyBracketKeyword_2()); 

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
    // $ANTLR end rule__LUA_Script__Group__2


    // $ANTLR start rule__Collections__Group__0
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:440:1: rule__Collections__Group__0 : ( 'collections {' ) rule__Collections__Group__1 ;
    public final void rule__Collections__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:444:1: ( ( 'collections {' ) rule__Collections__Group__1 )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:445:1: ( 'collections {' ) rule__Collections__Group__1
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:445:1: ( 'collections {' )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:446:1: 'collections {'
            {
             before(grammarAccess.getCollectionsAccess().getCollectionsKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__Collections__Group__0874); 
             after(grammarAccess.getCollectionsAccess().getCollectionsKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Collections__Group__1_in_rule__Collections__Group__0884);
            rule__Collections__Group__1();
            _fsp--;


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
    // $ANTLR end rule__Collections__Group__0


    // $ANTLR start rule__Collections__Group__1
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:460:1: rule__Collections__Group__1 : ( ( rule__Collections__GroupsAssignment_1 )* ) rule__Collections__Group__2 ;
    public final void rule__Collections__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:464:1: ( ( ( rule__Collections__GroupsAssignment_1 )* ) rule__Collections__Group__2 )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:465:1: ( ( rule__Collections__GroupsAssignment_1 )* ) rule__Collections__Group__2
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:465:1: ( ( rule__Collections__GroupsAssignment_1 )* )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:466:1: ( rule__Collections__GroupsAssignment_1 )*
            {
             before(grammarAccess.getCollectionsAccess().getGroupsAssignment_1()); 
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:467:1: ( rule__Collections__GroupsAssignment_1 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:467:2: rule__Collections__GroupsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Collections__GroupsAssignment_1_in_rule__Collections__Group__1912);
            	    rule__Collections__GroupsAssignment_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getCollectionsAccess().getGroupsAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Collections__Group__2_in_rule__Collections__Group__1922);
            rule__Collections__Group__2();
            _fsp--;


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
    // $ANTLR end rule__Collections__Group__1


    // $ANTLR start rule__Collections__Group__2
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:478:1: rule__Collections__Group__2 : ( '}' ) ;
    public final void rule__Collections__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:482:1: ( ( '}' ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:483:1: ( '}' )
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:483:1: ( '}' )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:484:1: '}'
            {
             before(grammarAccess.getCollectionsAccess().getRightCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_13_in_rule__Collections__Group__2951); 
             after(grammarAccess.getCollectionsAccess().getRightCurlyBracketKeyword_2()); 

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
    // $ANTLR end rule__Collections__Group__2


    // $ANTLR start rule__Group__Group__0
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:503:1: rule__Group__Group__0 : ( 'group {' ) rule__Group__Group__1 ;
    public final void rule__Group__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:507:1: ( ( 'group {' ) rule__Group__Group__1 )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:508:1: ( 'group {' ) rule__Group__Group__1
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:508:1: ( 'group {' )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:509:1: 'group {'
            {
             before(grammarAccess.getGroupAccess().getGroupKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__Group__Group__0993); 
             after(grammarAccess.getGroupAccess().getGroupKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Group__Group__1_in_rule__Group__Group__01003);
            rule__Group__Group__1();
            _fsp--;


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
    // $ANTLR end rule__Group__Group__0


    // $ANTLR start rule__Group__Group__1
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:523:1: rule__Group__Group__1 : ( ( rule__Group__Group_1__0 )? ) rule__Group__Group__2 ;
    public final void rule__Group__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:527:1: ( ( ( rule__Group__Group_1__0 )? ) rule__Group__Group__2 )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:528:1: ( ( rule__Group__Group_1__0 )? ) rule__Group__Group__2
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:528:1: ( ( rule__Group__Group_1__0 )? )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:529:1: ( rule__Group__Group_1__0 )?
            {
             before(grammarAccess.getGroupAccess().getGroup_1()); 
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:530:1: ( rule__Group__Group_1__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:530:2: rule__Group__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Group__Group_1__0_in_rule__Group__Group__11031);
                    rule__Group__Group_1__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGroupAccess().getGroup_1()); 

            }

            pushFollow(FOLLOW_rule__Group__Group__2_in_rule__Group__Group__11041);
            rule__Group__Group__2();
            _fsp--;


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
    // $ANTLR end rule__Group__Group__1


    // $ANTLR start rule__Group__Group__2
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:541:1: rule__Group__Group__2 : ( ( rule__Group__Group_2__0 )? ) rule__Group__Group__3 ;
    public final void rule__Group__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:545:1: ( ( ( rule__Group__Group_2__0 )? ) rule__Group__Group__3 )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:546:1: ( ( rule__Group__Group_2__0 )? ) rule__Group__Group__3
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:546:1: ( ( rule__Group__Group_2__0 )? )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:547:1: ( rule__Group__Group_2__0 )?
            {
             before(grammarAccess.getGroupAccess().getGroup_2()); 
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:548:1: ( rule__Group__Group_2__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:548:2: rule__Group__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Group__Group_2__0_in_rule__Group__Group__21069);
                    rule__Group__Group_2__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGroupAccess().getGroup_2()); 

            }

            pushFollow(FOLLOW_rule__Group__Group__3_in_rule__Group__Group__21079);
            rule__Group__Group__3();
            _fsp--;


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
    // $ANTLR end rule__Group__Group__2


    // $ANTLR start rule__Group__Group__3
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:559:1: rule__Group__Group__3 : ( ( rule__Group__Group_3__0 )* ) rule__Group__Group__4 ;
    public final void rule__Group__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:563:1: ( ( ( rule__Group__Group_3__0 )* ) rule__Group__Group__4 )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:564:1: ( ( rule__Group__Group_3__0 )* ) rule__Group__Group__4
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:564:1: ( ( rule__Group__Group_3__0 )* )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:565:1: ( rule__Group__Group_3__0 )*
            {
             before(grammarAccess.getGroupAccess().getGroup_3()); 
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:566:1: ( rule__Group__Group_3__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==19) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:566:2: rule__Group__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__Group__Group_3__0_in_rule__Group__Group__31107);
            	    rule__Group__Group_3__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getGroupAccess().getGroup_3()); 

            }

            pushFollow(FOLLOW_rule__Group__Group__4_in_rule__Group__Group__31117);
            rule__Group__Group__4();
            _fsp--;


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
    // $ANTLR end rule__Group__Group__3


    // $ANTLR start rule__Group__Group__4
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:577:1: rule__Group__Group__4 : ( ( rule__Group__Group_4__0 )* ) rule__Group__Group__5 ;
    public final void rule__Group__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:581:1: ( ( ( rule__Group__Group_4__0 )* ) rule__Group__Group__5 )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:582:1: ( ( rule__Group__Group_4__0 )* ) rule__Group__Group__5
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:582:1: ( ( rule__Group__Group_4__0 )* )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:583:1: ( rule__Group__Group_4__0 )*
            {
             before(grammarAccess.getGroupAccess().getGroup_4()); 
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:584:1: ( rule__Group__Group_4__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==20) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:584:2: rule__Group__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__Group__Group_4__0_in_rule__Group__Group__41145);
            	    rule__Group__Group_4__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getGroupAccess().getGroup_4()); 

            }

            pushFollow(FOLLOW_rule__Group__Group__5_in_rule__Group__Group__41155);
            rule__Group__Group__5();
            _fsp--;


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
    // $ANTLR end rule__Group__Group__4


    // $ANTLR start rule__Group__Group__5
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:595:1: rule__Group__Group__5 : ( ( rule__Group__Lua_scriptAssignment_5 )? ) rule__Group__Group__6 ;
    public final void rule__Group__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:599:1: ( ( ( rule__Group__Lua_scriptAssignment_5 )? ) rule__Group__Group__6 )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:600:1: ( ( rule__Group__Lua_scriptAssignment_5 )? ) rule__Group__Group__6
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:600:1: ( ( rule__Group__Lua_scriptAssignment_5 )? )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:601:1: ( rule__Group__Lua_scriptAssignment_5 )?
            {
             before(grammarAccess.getGroupAccess().getLua_scriptAssignment_5()); 
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:602:1: ( rule__Group__Lua_scriptAssignment_5 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==12) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:602:2: rule__Group__Lua_scriptAssignment_5
                    {
                    pushFollow(FOLLOW_rule__Group__Lua_scriptAssignment_5_in_rule__Group__Group__51183);
                    rule__Group__Lua_scriptAssignment_5();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGroupAccess().getLua_scriptAssignment_5()); 

            }

            pushFollow(FOLLOW_rule__Group__Group__6_in_rule__Group__Group__51193);
            rule__Group__Group__6();
            _fsp--;


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
    // $ANTLR end rule__Group__Group__5


    // $ANTLR start rule__Group__Group__6
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:613:1: rule__Group__Group__6 : ( '}' ) ;
    public final void rule__Group__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:617:1: ( ( '}' ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:618:1: ( '}' )
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:618:1: ( '}' )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:619:1: '}'
            {
             before(grammarAccess.getGroupAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FOLLOW_13_in_rule__Group__Group__61222); 
             after(grammarAccess.getGroupAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end rule__Group__Group__6


    // $ANTLR start rule__Group__Group_1__0
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:646:1: rule__Group__Group_1__0 : ( 'name:' ) rule__Group__Group_1__1 ;
    public final void rule__Group__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:650:1: ( ( 'name:' ) rule__Group__Group_1__1 )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:651:1: ( 'name:' ) rule__Group__Group_1__1
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:651:1: ( 'name:' )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:652:1: 'name:'
            {
             before(grammarAccess.getGroupAccess().getNameKeyword_1_0()); 
            match(input,16,FOLLOW_16_in_rule__Group__Group_1__01272); 
             after(grammarAccess.getGroupAccess().getNameKeyword_1_0()); 

            }

            pushFollow(FOLLOW_rule__Group__Group_1__1_in_rule__Group__Group_1__01282);
            rule__Group__Group_1__1();
            _fsp--;


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
    // $ANTLR end rule__Group__Group_1__0


    // $ANTLR start rule__Group__Group_1__1
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:666:1: rule__Group__Group_1__1 : ( ( rule__Group__NameAssignment_1_1 ) ) rule__Group__Group_1__2 ;
    public final void rule__Group__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:670:1: ( ( ( rule__Group__NameAssignment_1_1 ) ) rule__Group__Group_1__2 )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:671:1: ( ( rule__Group__NameAssignment_1_1 ) ) rule__Group__Group_1__2
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:671:1: ( ( rule__Group__NameAssignment_1_1 ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:672:1: ( rule__Group__NameAssignment_1_1 )
            {
             before(grammarAccess.getGroupAccess().getNameAssignment_1_1()); 
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:673:1: ( rule__Group__NameAssignment_1_1 )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:673:2: rule__Group__NameAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Group__NameAssignment_1_1_in_rule__Group__Group_1__11310);
            rule__Group__NameAssignment_1_1();
            _fsp--;


            }

             after(grammarAccess.getGroupAccess().getNameAssignment_1_1()); 

            }

            pushFollow(FOLLOW_rule__Group__Group_1__2_in_rule__Group__Group_1__11319);
            rule__Group__Group_1__2();
            _fsp--;


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
    // $ANTLR end rule__Group__Group_1__1


    // $ANTLR start rule__Group__Group_1__2
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:684:1: rule__Group__Group_1__2 : ( ';' ) ;
    public final void rule__Group__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:688:1: ( ( ';' ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:689:1: ( ';' )
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:689:1: ( ';' )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:690:1: ';'
            {
             before(grammarAccess.getGroupAccess().getSemicolonKeyword_1_2()); 
            match(input,17,FOLLOW_17_in_rule__Group__Group_1__21348); 
             after(grammarAccess.getGroupAccess().getSemicolonKeyword_1_2()); 

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
    // $ANTLR end rule__Group__Group_1__2


    // $ANTLR start rule__Group__Group_2__0
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:709:1: rule__Group__Group_2__0 : ( 'min:' ) rule__Group__Group_2__1 ;
    public final void rule__Group__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:713:1: ( ( 'min:' ) rule__Group__Group_2__1 )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:714:1: ( 'min:' ) rule__Group__Group_2__1
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:714:1: ( 'min:' )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:715:1: 'min:'
            {
             before(grammarAccess.getGroupAccess().getMinKeyword_2_0()); 
            match(input,18,FOLLOW_18_in_rule__Group__Group_2__01390); 
             after(grammarAccess.getGroupAccess().getMinKeyword_2_0()); 

            }

            pushFollow(FOLLOW_rule__Group__Group_2__1_in_rule__Group__Group_2__01400);
            rule__Group__Group_2__1();
            _fsp--;


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
    // $ANTLR end rule__Group__Group_2__0


    // $ANTLR start rule__Group__Group_2__1
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:729:1: rule__Group__Group_2__1 : ( ( rule__Group__Group_2_1__0 ) ) rule__Group__Group_2__2 ;
    public final void rule__Group__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:733:1: ( ( ( rule__Group__Group_2_1__0 ) ) rule__Group__Group_2__2 )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:734:1: ( ( rule__Group__Group_2_1__0 ) ) rule__Group__Group_2__2
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:734:1: ( ( rule__Group__Group_2_1__0 ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:735:1: ( rule__Group__Group_2_1__0 )
            {
             before(grammarAccess.getGroupAccess().getGroup_2_1()); 
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:736:1: ( rule__Group__Group_2_1__0 )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:736:2: rule__Group__Group_2_1__0
            {
            pushFollow(FOLLOW_rule__Group__Group_2_1__0_in_rule__Group__Group_2__11428);
            rule__Group__Group_2_1__0();
            _fsp--;


            }

             after(grammarAccess.getGroupAccess().getGroup_2_1()); 

            }

            pushFollow(FOLLOW_rule__Group__Group_2__2_in_rule__Group__Group_2__11437);
            rule__Group__Group_2__2();
            _fsp--;


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
    // $ANTLR end rule__Group__Group_2__1


    // $ANTLR start rule__Group__Group_2__2
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:747:1: rule__Group__Group_2__2 : ( ';' ) ;
    public final void rule__Group__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:751:1: ( ( ';' ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:752:1: ( ';' )
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:752:1: ( ';' )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:753:1: ';'
            {
             before(grammarAccess.getGroupAccess().getSemicolonKeyword_2_2()); 
            match(input,17,FOLLOW_17_in_rule__Group__Group_2__21466); 
             after(grammarAccess.getGroupAccess().getSemicolonKeyword_2_2()); 

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
    // $ANTLR end rule__Group__Group_2__2


    // $ANTLR start rule__Group__Group_2_1__0
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:772:1: rule__Group__Group_2_1__0 : ( ( rule__Group__MinxAssignment_2_1_0 ) ) rule__Group__Group_2_1__1 ;
    public final void rule__Group__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:776:1: ( ( ( rule__Group__MinxAssignment_2_1_0 ) ) rule__Group__Group_2_1__1 )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:777:1: ( ( rule__Group__MinxAssignment_2_1_0 ) ) rule__Group__Group_2_1__1
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:777:1: ( ( rule__Group__MinxAssignment_2_1_0 ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:778:1: ( rule__Group__MinxAssignment_2_1_0 )
            {
             before(grammarAccess.getGroupAccess().getMinxAssignment_2_1_0()); 
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:779:1: ( rule__Group__MinxAssignment_2_1_0 )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:779:2: rule__Group__MinxAssignment_2_1_0
            {
            pushFollow(FOLLOW_rule__Group__MinxAssignment_2_1_0_in_rule__Group__Group_2_1__01507);
            rule__Group__MinxAssignment_2_1_0();
            _fsp--;


            }

             after(grammarAccess.getGroupAccess().getMinxAssignment_2_1_0()); 

            }

            pushFollow(FOLLOW_rule__Group__Group_2_1__1_in_rule__Group__Group_2_1__01516);
            rule__Group__Group_2_1__1();
            _fsp--;


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
    // $ANTLR end rule__Group__Group_2_1__0


    // $ANTLR start rule__Group__Group_2_1__1
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:790:1: rule__Group__Group_2_1__1 : ( ( rule__Group__MinyAssignment_2_1_1 ) ) ;
    public final void rule__Group__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:794:1: ( ( ( rule__Group__MinyAssignment_2_1_1 ) ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:795:1: ( ( rule__Group__MinyAssignment_2_1_1 ) )
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:795:1: ( ( rule__Group__MinyAssignment_2_1_1 ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:796:1: ( rule__Group__MinyAssignment_2_1_1 )
            {
             before(grammarAccess.getGroupAccess().getMinyAssignment_2_1_1()); 
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:797:1: ( rule__Group__MinyAssignment_2_1_1 )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:797:2: rule__Group__MinyAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__Group__MinyAssignment_2_1_1_in_rule__Group__Group_2_1__11544);
            rule__Group__MinyAssignment_2_1_1();
            _fsp--;


            }

             after(grammarAccess.getGroupAccess().getMinyAssignment_2_1_1()); 

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
    // $ANTLR end rule__Group__Group_2_1__1


    // $ANTLR start rule__Group__Group_3__0
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:811:1: rule__Group__Group_3__0 : ( 'parts {' ) rule__Group__Group_3__1 ;
    public final void rule__Group__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:815:1: ( ( 'parts {' ) rule__Group__Group_3__1 )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:816:1: ( 'parts {' ) rule__Group__Group_3__1
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:816:1: ( 'parts {' )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:817:1: 'parts {'
            {
             before(grammarAccess.getGroupAccess().getPartsKeyword_3_0()); 
            match(input,19,FOLLOW_19_in_rule__Group__Group_3__01583); 
             after(grammarAccess.getGroupAccess().getPartsKeyword_3_0()); 

            }

            pushFollow(FOLLOW_rule__Group__Group_3__1_in_rule__Group__Group_3__01593);
            rule__Group__Group_3__1();
            _fsp--;


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
    // $ANTLR end rule__Group__Group_3__0


    // $ANTLR start rule__Group__Group_3__1
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:831:1: rule__Group__Group_3__1 : ( ( rule__Group__PartAssignment_3_1 )* ) rule__Group__Group_3__2 ;
    public final void rule__Group__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:835:1: ( ( ( rule__Group__PartAssignment_3_1 )* ) rule__Group__Group_3__2 )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:836:1: ( ( rule__Group__PartAssignment_3_1 )* ) rule__Group__Group_3__2
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:836:1: ( ( rule__Group__PartAssignment_3_1 )* )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:837:1: ( rule__Group__PartAssignment_3_1 )*
            {
             before(grammarAccess.getGroupAccess().getPartAssignment_3_1()); 
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:838:1: ( rule__Group__PartAssignment_3_1 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==21) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:838:2: rule__Group__PartAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_rule__Group__PartAssignment_3_1_in_rule__Group__Group_3__11621);
            	    rule__Group__PartAssignment_3_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getGroupAccess().getPartAssignment_3_1()); 

            }

            pushFollow(FOLLOW_rule__Group__Group_3__2_in_rule__Group__Group_3__11631);
            rule__Group__Group_3__2();
            _fsp--;


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
    // $ANTLR end rule__Group__Group_3__1


    // $ANTLR start rule__Group__Group_3__2
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:849:1: rule__Group__Group_3__2 : ( '}' ) ;
    public final void rule__Group__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:853:1: ( ( '}' ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:854:1: ( '}' )
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:854:1: ( '}' )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:855:1: '}'
            {
             before(grammarAccess.getGroupAccess().getRightCurlyBracketKeyword_3_2()); 
            match(input,13,FOLLOW_13_in_rule__Group__Group_3__21660); 
             after(grammarAccess.getGroupAccess().getRightCurlyBracketKeyword_3_2()); 

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
    // $ANTLR end rule__Group__Group_3__2


    // $ANTLR start rule__Group__Group_4__0
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:874:1: rule__Group__Group_4__0 : ( 'programs {' ) rule__Group__Group_4__1 ;
    public final void rule__Group__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:878:1: ( ( 'programs {' ) rule__Group__Group_4__1 )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:879:1: ( 'programs {' ) rule__Group__Group_4__1
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:879:1: ( 'programs {' )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:880:1: 'programs {'
            {
             before(grammarAccess.getGroupAccess().getProgramsKeyword_4_0()); 
            match(input,20,FOLLOW_20_in_rule__Group__Group_4__01702); 
             after(grammarAccess.getGroupAccess().getProgramsKeyword_4_0()); 

            }

            pushFollow(FOLLOW_rule__Group__Group_4__1_in_rule__Group__Group_4__01712);
            rule__Group__Group_4__1();
            _fsp--;


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
    // $ANTLR end rule__Group__Group_4__0


    // $ANTLR start rule__Group__Group_4__1
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:894:1: rule__Group__Group_4__1 : ( ( rule__Group__ProgramAssignment_4_1 )* ) rule__Group__Group_4__2 ;
    public final void rule__Group__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:898:1: ( ( ( rule__Group__ProgramAssignment_4_1 )* ) rule__Group__Group_4__2 )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:899:1: ( ( rule__Group__ProgramAssignment_4_1 )* ) rule__Group__Group_4__2
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:899:1: ( ( rule__Group__ProgramAssignment_4_1 )* )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:900:1: ( rule__Group__ProgramAssignment_4_1 )*
            {
             before(grammarAccess.getGroupAccess().getProgramAssignment_4_1()); 
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:901:1: ( rule__Group__ProgramAssignment_4_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==30) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:901:2: rule__Group__ProgramAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_rule__Group__ProgramAssignment_4_1_in_rule__Group__Group_4__11740);
            	    rule__Group__ProgramAssignment_4_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getGroupAccess().getProgramAssignment_4_1()); 

            }

            pushFollow(FOLLOW_rule__Group__Group_4__2_in_rule__Group__Group_4__11750);
            rule__Group__Group_4__2();
            _fsp--;


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
    // $ANTLR end rule__Group__Group_4__1


    // $ANTLR start rule__Group__Group_4__2
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:912:1: rule__Group__Group_4__2 : ( '}' ) ;
    public final void rule__Group__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:916:1: ( ( '}' ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:917:1: ( '}' )
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:917:1: ( '}' )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:918:1: '}'
            {
             before(grammarAccess.getGroupAccess().getRightCurlyBracketKeyword_4_2()); 
            match(input,13,FOLLOW_13_in_rule__Group__Group_4__21779); 
             after(grammarAccess.getGroupAccess().getRightCurlyBracketKeyword_4_2()); 

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
    // $ANTLR end rule__Group__Group_4__2


    // $ANTLR start rule__Part__Group__0
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:937:1: rule__Part__Group__0 : ( 'part {' ) rule__Part__Group__1 ;
    public final void rule__Part__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:941:1: ( ( 'part {' ) rule__Part__Group__1 )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:942:1: ( 'part {' ) rule__Part__Group__1
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:942:1: ( 'part {' )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:943:1: 'part {'
            {
             before(grammarAccess.getPartAccess().getPartKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__Part__Group__01821); 
             after(grammarAccess.getPartAccess().getPartKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Part__Group__1_in_rule__Part__Group__01831);
            rule__Part__Group__1();
            _fsp--;


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
    // $ANTLR end rule__Part__Group__0


    // $ANTLR start rule__Part__Group__1
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:957:1: rule__Part__Group__1 : ( ( rule__Part__Group_1__0 )? ) rule__Part__Group__2 ;
    public final void rule__Part__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:961:1: ( ( ( rule__Part__Group_1__0 )? ) rule__Part__Group__2 )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:962:1: ( ( rule__Part__Group_1__0 )? ) rule__Part__Group__2
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:962:1: ( ( rule__Part__Group_1__0 )? )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:963:1: ( rule__Part__Group_1__0 )?
            {
             before(grammarAccess.getPartAccess().getGroup_1()); 
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:964:1: ( rule__Part__Group_1__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==16) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:964:2: rule__Part__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Part__Group_1__0_in_rule__Part__Group__11859);
                    rule__Part__Group_1__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPartAccess().getGroup_1()); 

            }

            pushFollow(FOLLOW_rule__Part__Group__2_in_rule__Part__Group__11869);
            rule__Part__Group__2();
            _fsp--;


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
    // $ANTLR end rule__Part__Group__1


    // $ANTLR start rule__Part__Group__2
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:975:1: rule__Part__Group__2 : ( ( rule__Part__Group_2__0 )? ) rule__Part__Group__3 ;
    public final void rule__Part__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:979:1: ( ( ( rule__Part__Group_2__0 )? ) rule__Part__Group__3 )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:980:1: ( ( rule__Part__Group_2__0 )? ) rule__Part__Group__3
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:980:1: ( ( rule__Part__Group_2__0 )? )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:981:1: ( rule__Part__Group_2__0 )?
            {
             before(grammarAccess.getPartAccess().getGroup_2()); 
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:982:1: ( rule__Part__Group_2__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==18) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:982:2: rule__Part__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Part__Group_2__0_in_rule__Part__Group__21897);
                    rule__Part__Group_2__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPartAccess().getGroup_2()); 

            }

            pushFollow(FOLLOW_rule__Part__Group__3_in_rule__Part__Group__21907);
            rule__Part__Group__3();
            _fsp--;


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
    // $ANTLR end rule__Part__Group__2


    // $ANTLR start rule__Part__Group__3
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:993:1: rule__Part__Group__3 : ( ( rule__Part__Group_3__0 )? ) rule__Part__Group__4 ;
    public final void rule__Part__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:997:1: ( ( ( rule__Part__Group_3__0 )? ) rule__Part__Group__4 )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:998:1: ( ( rule__Part__Group_3__0 )? ) rule__Part__Group__4
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:998:1: ( ( rule__Part__Group_3__0 )? )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:999:1: ( rule__Part__Group_3__0 )?
            {
             before(grammarAccess.getPartAccess().getGroup_3()); 
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1000:1: ( rule__Part__Group_3__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==22) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1000:2: rule__Part__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Part__Group_3__0_in_rule__Part__Group__31935);
                    rule__Part__Group_3__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPartAccess().getGroup_3()); 

            }

            pushFollow(FOLLOW_rule__Part__Group__4_in_rule__Part__Group__31945);
            rule__Part__Group__4();
            _fsp--;


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
    // $ANTLR end rule__Part__Group__3


    // $ANTLR start rule__Part__Group__4
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1011:1: rule__Part__Group__4 : ( ( rule__Part__DescriptionsAssignment_4 )* ) rule__Part__Group__5 ;
    public final void rule__Part__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1015:1: ( ( ( rule__Part__DescriptionsAssignment_4 )* ) rule__Part__Group__5 )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1016:1: ( ( rule__Part__DescriptionsAssignment_4 )* ) rule__Part__Group__5
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1016:1: ( ( rule__Part__DescriptionsAssignment_4 )* )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1017:1: ( rule__Part__DescriptionsAssignment_4 )*
            {
             before(grammarAccess.getPartAccess().getDescriptionsAssignment_4()); 
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1018:1: ( rule__Part__DescriptionsAssignment_4 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==23) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1018:2: rule__Part__DescriptionsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Part__DescriptionsAssignment_4_in_rule__Part__Group__41973);
            	    rule__Part__DescriptionsAssignment_4();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getPartAccess().getDescriptionsAssignment_4()); 

            }

            pushFollow(FOLLOW_rule__Part__Group__5_in_rule__Part__Group__41983);
            rule__Part__Group__5();
            _fsp--;


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
    // $ANTLR end rule__Part__Group__4


    // $ANTLR start rule__Part__Group__5
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1029:1: rule__Part__Group__5 : ( '}' ) ;
    public final void rule__Part__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1033:1: ( ( '}' ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1034:1: ( '}' )
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1034:1: ( '}' )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1035:1: '}'
            {
             before(grammarAccess.getPartAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_13_in_rule__Part__Group__52012); 
             after(grammarAccess.getPartAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end rule__Part__Group__5


    // $ANTLR start rule__Part__Group_1__0
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1060:1: rule__Part__Group_1__0 : ( 'name:' ) rule__Part__Group_1__1 ;
    public final void rule__Part__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1064:1: ( ( 'name:' ) rule__Part__Group_1__1 )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1065:1: ( 'name:' ) rule__Part__Group_1__1
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1065:1: ( 'name:' )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1066:1: 'name:'
            {
             before(grammarAccess.getPartAccess().getNameKeyword_1_0()); 
            match(input,16,FOLLOW_16_in_rule__Part__Group_1__02060); 
             after(grammarAccess.getPartAccess().getNameKeyword_1_0()); 

            }

            pushFollow(FOLLOW_rule__Part__Group_1__1_in_rule__Part__Group_1__02070);
            rule__Part__Group_1__1();
            _fsp--;


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
    // $ANTLR end rule__Part__Group_1__0


    // $ANTLR start rule__Part__Group_1__1
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1080:1: rule__Part__Group_1__1 : ( ( rule__Part__NameAssignment_1_1 ) ) rule__Part__Group_1__2 ;
    public final void rule__Part__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1084:1: ( ( ( rule__Part__NameAssignment_1_1 ) ) rule__Part__Group_1__2 )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1085:1: ( ( rule__Part__NameAssignment_1_1 ) ) rule__Part__Group_1__2
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1085:1: ( ( rule__Part__NameAssignment_1_1 ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1086:1: ( rule__Part__NameAssignment_1_1 )
            {
             before(grammarAccess.getPartAccess().getNameAssignment_1_1()); 
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1087:1: ( rule__Part__NameAssignment_1_1 )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1087:2: rule__Part__NameAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Part__NameAssignment_1_1_in_rule__Part__Group_1__12098);
            rule__Part__NameAssignment_1_1();
            _fsp--;


            }

             after(grammarAccess.getPartAccess().getNameAssignment_1_1()); 

            }

            pushFollow(FOLLOW_rule__Part__Group_1__2_in_rule__Part__Group_1__12107);
            rule__Part__Group_1__2();
            _fsp--;


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
    // $ANTLR end rule__Part__Group_1__1


    // $ANTLR start rule__Part__Group_1__2
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1098:1: rule__Part__Group_1__2 : ( ';' ) ;
    public final void rule__Part__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1102:1: ( ( ';' ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1103:1: ( ';' )
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1103:1: ( ';' )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1104:1: ';'
            {
             before(grammarAccess.getPartAccess().getSemicolonKeyword_1_2()); 
            match(input,17,FOLLOW_17_in_rule__Part__Group_1__22136); 
             after(grammarAccess.getPartAccess().getSemicolonKeyword_1_2()); 

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
    // $ANTLR end rule__Part__Group_1__2


    // $ANTLR start rule__Part__Group_2__0
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1123:1: rule__Part__Group_2__0 : ( 'min:' ) rule__Part__Group_2__1 ;
    public final void rule__Part__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1127:1: ( ( 'min:' ) rule__Part__Group_2__1 )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1128:1: ( 'min:' ) rule__Part__Group_2__1
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1128:1: ( 'min:' )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1129:1: 'min:'
            {
             before(grammarAccess.getPartAccess().getMinKeyword_2_0()); 
            match(input,18,FOLLOW_18_in_rule__Part__Group_2__02178); 
             after(grammarAccess.getPartAccess().getMinKeyword_2_0()); 

            }

            pushFollow(FOLLOW_rule__Part__Group_2__1_in_rule__Part__Group_2__02188);
            rule__Part__Group_2__1();
            _fsp--;


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
    // $ANTLR end rule__Part__Group_2__0


    // $ANTLR start rule__Part__Group_2__1
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1143:1: rule__Part__Group_2__1 : ( ( rule__Part__Group_2_1__0 ) ) rule__Part__Group_2__2 ;
    public final void rule__Part__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1147:1: ( ( ( rule__Part__Group_2_1__0 ) ) rule__Part__Group_2__2 )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1148:1: ( ( rule__Part__Group_2_1__0 ) ) rule__Part__Group_2__2
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1148:1: ( ( rule__Part__Group_2_1__0 ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1149:1: ( rule__Part__Group_2_1__0 )
            {
             before(grammarAccess.getPartAccess().getGroup_2_1()); 
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1150:1: ( rule__Part__Group_2_1__0 )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1150:2: rule__Part__Group_2_1__0
            {
            pushFollow(FOLLOW_rule__Part__Group_2_1__0_in_rule__Part__Group_2__12216);
            rule__Part__Group_2_1__0();
            _fsp--;


            }

             after(grammarAccess.getPartAccess().getGroup_2_1()); 

            }

            pushFollow(FOLLOW_rule__Part__Group_2__2_in_rule__Part__Group_2__12225);
            rule__Part__Group_2__2();
            _fsp--;


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
    // $ANTLR end rule__Part__Group_2__1


    // $ANTLR start rule__Part__Group_2__2
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1161:1: rule__Part__Group_2__2 : ( ';' ) ;
    public final void rule__Part__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1165:1: ( ( ';' ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1166:1: ( ';' )
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1166:1: ( ';' )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1167:1: ';'
            {
             before(grammarAccess.getPartAccess().getSemicolonKeyword_2_2()); 
            match(input,17,FOLLOW_17_in_rule__Part__Group_2__22254); 
             after(grammarAccess.getPartAccess().getSemicolonKeyword_2_2()); 

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
    // $ANTLR end rule__Part__Group_2__2


    // $ANTLR start rule__Part__Group_2_1__0
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1186:1: rule__Part__Group_2_1__0 : ( ( rule__Part__MinxAssignment_2_1_0 ) ) rule__Part__Group_2_1__1 ;
    public final void rule__Part__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1190:1: ( ( ( rule__Part__MinxAssignment_2_1_0 ) ) rule__Part__Group_2_1__1 )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1191:1: ( ( rule__Part__MinxAssignment_2_1_0 ) ) rule__Part__Group_2_1__1
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1191:1: ( ( rule__Part__MinxAssignment_2_1_0 ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1192:1: ( rule__Part__MinxAssignment_2_1_0 )
            {
             before(grammarAccess.getPartAccess().getMinxAssignment_2_1_0()); 
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1193:1: ( rule__Part__MinxAssignment_2_1_0 )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1193:2: rule__Part__MinxAssignment_2_1_0
            {
            pushFollow(FOLLOW_rule__Part__MinxAssignment_2_1_0_in_rule__Part__Group_2_1__02295);
            rule__Part__MinxAssignment_2_1_0();
            _fsp--;


            }

             after(grammarAccess.getPartAccess().getMinxAssignment_2_1_0()); 

            }

            pushFollow(FOLLOW_rule__Part__Group_2_1__1_in_rule__Part__Group_2_1__02304);
            rule__Part__Group_2_1__1();
            _fsp--;


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
    // $ANTLR end rule__Part__Group_2_1__0


    // $ANTLR start rule__Part__Group_2_1__1
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1204:1: rule__Part__Group_2_1__1 : ( ( rule__Part__MinyAssignment_2_1_1 ) ) ;
    public final void rule__Part__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1208:1: ( ( ( rule__Part__MinyAssignment_2_1_1 ) ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1209:1: ( ( rule__Part__MinyAssignment_2_1_1 ) )
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1209:1: ( ( rule__Part__MinyAssignment_2_1_1 ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1210:1: ( rule__Part__MinyAssignment_2_1_1 )
            {
             before(grammarAccess.getPartAccess().getMinyAssignment_2_1_1()); 
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1211:1: ( rule__Part__MinyAssignment_2_1_1 )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1211:2: rule__Part__MinyAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__Part__MinyAssignment_2_1_1_in_rule__Part__Group_2_1__12332);
            rule__Part__MinyAssignment_2_1_1();
            _fsp--;


            }

             after(grammarAccess.getPartAccess().getMinyAssignment_2_1_1()); 

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
    // $ANTLR end rule__Part__Group_2_1__1


    // $ANTLR start rule__Part__Group_3__0
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1225:1: rule__Part__Group_3__0 : ( 'type:' ) rule__Part__Group_3__1 ;
    public final void rule__Part__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1229:1: ( ( 'type:' ) rule__Part__Group_3__1 )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1230:1: ( 'type:' ) rule__Part__Group_3__1
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1230:1: ( 'type:' )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1231:1: 'type:'
            {
             before(grammarAccess.getPartAccess().getTypeKeyword_3_0()); 
            match(input,22,FOLLOW_22_in_rule__Part__Group_3__02371); 
             after(grammarAccess.getPartAccess().getTypeKeyword_3_0()); 

            }

            pushFollow(FOLLOW_rule__Part__Group_3__1_in_rule__Part__Group_3__02381);
            rule__Part__Group_3__1();
            _fsp--;


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
    // $ANTLR end rule__Part__Group_3__0


    // $ANTLR start rule__Part__Group_3__1
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1245:1: rule__Part__Group_3__1 : ( ( rule__Part__TypeAssignment_3_1 ) ) rule__Part__Group_3__2 ;
    public final void rule__Part__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1249:1: ( ( ( rule__Part__TypeAssignment_3_1 ) ) rule__Part__Group_3__2 )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1250:1: ( ( rule__Part__TypeAssignment_3_1 ) ) rule__Part__Group_3__2
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1250:1: ( ( rule__Part__TypeAssignment_3_1 ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1251:1: ( rule__Part__TypeAssignment_3_1 )
            {
             before(grammarAccess.getPartAccess().getTypeAssignment_3_1()); 
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1252:1: ( rule__Part__TypeAssignment_3_1 )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1252:2: rule__Part__TypeAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Part__TypeAssignment_3_1_in_rule__Part__Group_3__12409);
            rule__Part__TypeAssignment_3_1();
            _fsp--;


            }

             after(grammarAccess.getPartAccess().getTypeAssignment_3_1()); 

            }

            pushFollow(FOLLOW_rule__Part__Group_3__2_in_rule__Part__Group_3__12418);
            rule__Part__Group_3__2();
            _fsp--;


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
    // $ANTLR end rule__Part__Group_3__1


    // $ANTLR start rule__Part__Group_3__2
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1263:1: rule__Part__Group_3__2 : ( ';' ) ;
    public final void rule__Part__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1267:1: ( ( ';' ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1268:1: ( ';' )
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1268:1: ( ';' )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1269:1: ';'
            {
             before(grammarAccess.getPartAccess().getSemicolonKeyword_3_2()); 
            match(input,17,FOLLOW_17_in_rule__Part__Group_3__22447); 
             after(grammarAccess.getPartAccess().getSemicolonKeyword_3_2()); 

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
    // $ANTLR end rule__Part__Group_3__2


    // $ANTLR start rule__Description__Group__0
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1288:1: rule__Description__Group__0 : ( 'description {' ) rule__Description__Group__1 ;
    public final void rule__Description__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1292:1: ( ( 'description {' ) rule__Description__Group__1 )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1293:1: ( 'description {' ) rule__Description__Group__1
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1293:1: ( 'description {' )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1294:1: 'description {'
            {
             before(grammarAccess.getDescriptionAccess().getDescriptionKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__Description__Group__02489); 
             after(grammarAccess.getDescriptionAccess().getDescriptionKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Description__Group__1_in_rule__Description__Group__02499);
            rule__Description__Group__1();
            _fsp--;


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
    // $ANTLR end rule__Description__Group__0


    // $ANTLR start rule__Description__Group__1
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1308:1: rule__Description__Group__1 : ( 'rel1 {' ) rule__Description__Group__2 ;
    public final void rule__Description__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1312:1: ( ( 'rel1 {' ) rule__Description__Group__2 )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1313:1: ( 'rel1 {' ) rule__Description__Group__2
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1313:1: ( 'rel1 {' )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1314:1: 'rel1 {'
            {
             before(grammarAccess.getDescriptionAccess().getRel1Keyword_1()); 
            match(input,24,FOLLOW_24_in_rule__Description__Group__12528); 
             after(grammarAccess.getDescriptionAccess().getRel1Keyword_1()); 

            }

            pushFollow(FOLLOW_rule__Description__Group__2_in_rule__Description__Group__12538);
            rule__Description__Group__2();
            _fsp--;


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
    // $ANTLR end rule__Description__Group__1


    // $ANTLR start rule__Description__Group__2
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1328:1: rule__Description__Group__2 : ( ( rule__Description__CoordinatesAssignment_2 ) ) rule__Description__Group__3 ;
    public final void rule__Description__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1332:1: ( ( ( rule__Description__CoordinatesAssignment_2 ) ) rule__Description__Group__3 )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1333:1: ( ( rule__Description__CoordinatesAssignment_2 ) ) rule__Description__Group__3
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1333:1: ( ( rule__Description__CoordinatesAssignment_2 ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1334:1: ( rule__Description__CoordinatesAssignment_2 )
            {
             before(grammarAccess.getDescriptionAccess().getCoordinatesAssignment_2()); 
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1335:1: ( rule__Description__CoordinatesAssignment_2 )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1335:2: rule__Description__CoordinatesAssignment_2
            {
            pushFollow(FOLLOW_rule__Description__CoordinatesAssignment_2_in_rule__Description__Group__22566);
            rule__Description__CoordinatesAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getDescriptionAccess().getCoordinatesAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__Description__Group__3_in_rule__Description__Group__22575);
            rule__Description__Group__3();
            _fsp--;


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
    // $ANTLR end rule__Description__Group__2


    // $ANTLR start rule__Description__Group__3
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1346:1: rule__Description__Group__3 : ( '}' ) rule__Description__Group__4 ;
    public final void rule__Description__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1350:1: ( ( '}' ) rule__Description__Group__4 )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1351:1: ( '}' ) rule__Description__Group__4
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1351:1: ( '}' )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1352:1: '}'
            {
             before(grammarAccess.getDescriptionAccess().getRightCurlyBracketKeyword_3()); 
            match(input,13,FOLLOW_13_in_rule__Description__Group__32604); 
             after(grammarAccess.getDescriptionAccess().getRightCurlyBracketKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__Description__Group__4_in_rule__Description__Group__32614);
            rule__Description__Group__4();
            _fsp--;


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
    // $ANTLR end rule__Description__Group__3


    // $ANTLR start rule__Description__Group__4
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1366:1: rule__Description__Group__4 : ( 'rel2 {' ) rule__Description__Group__5 ;
    public final void rule__Description__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1370:1: ( ( 'rel2 {' ) rule__Description__Group__5 )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1371:1: ( 'rel2 {' ) rule__Description__Group__5
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1371:1: ( 'rel2 {' )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1372:1: 'rel2 {'
            {
             before(grammarAccess.getDescriptionAccess().getRel2Keyword_4()); 
            match(input,25,FOLLOW_25_in_rule__Description__Group__42643); 
             after(grammarAccess.getDescriptionAccess().getRel2Keyword_4()); 

            }

            pushFollow(FOLLOW_rule__Description__Group__5_in_rule__Description__Group__42653);
            rule__Description__Group__5();
            _fsp--;


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
    // $ANTLR end rule__Description__Group__4


    // $ANTLR start rule__Description__Group__5
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1386:1: rule__Description__Group__5 : ( ( rule__Description__CoordinatesAssignment_5 ) ) rule__Description__Group__6 ;
    public final void rule__Description__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1390:1: ( ( ( rule__Description__CoordinatesAssignment_5 ) ) rule__Description__Group__6 )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1391:1: ( ( rule__Description__CoordinatesAssignment_5 ) ) rule__Description__Group__6
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1391:1: ( ( rule__Description__CoordinatesAssignment_5 ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1392:1: ( rule__Description__CoordinatesAssignment_5 )
            {
             before(grammarAccess.getDescriptionAccess().getCoordinatesAssignment_5()); 
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1393:1: ( rule__Description__CoordinatesAssignment_5 )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1393:2: rule__Description__CoordinatesAssignment_5
            {
            pushFollow(FOLLOW_rule__Description__CoordinatesAssignment_5_in_rule__Description__Group__52681);
            rule__Description__CoordinatesAssignment_5();
            _fsp--;


            }

             after(grammarAccess.getDescriptionAccess().getCoordinatesAssignment_5()); 

            }

            pushFollow(FOLLOW_rule__Description__Group__6_in_rule__Description__Group__52690);
            rule__Description__Group__6();
            _fsp--;


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
    // $ANTLR end rule__Description__Group__5


    // $ANTLR start rule__Description__Group__6
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1404:1: rule__Description__Group__6 : ( '}' ) rule__Description__Group__7 ;
    public final void rule__Description__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1408:1: ( ( '}' ) rule__Description__Group__7 )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1409:1: ( '}' ) rule__Description__Group__7
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1409:1: ( '}' )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1410:1: '}'
            {
             before(grammarAccess.getDescriptionAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FOLLOW_13_in_rule__Description__Group__62719); 
             after(grammarAccess.getDescriptionAccess().getRightCurlyBracketKeyword_6()); 

            }

            pushFollow(FOLLOW_rule__Description__Group__7_in_rule__Description__Group__62729);
            rule__Description__Group__7();
            _fsp--;


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
    // $ANTLR end rule__Description__Group__6


    // $ANTLR start rule__Description__Group__7
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1424:1: rule__Description__Group__7 : ( ( rule__Description__Group_7__0 )? ) rule__Description__Group__8 ;
    public final void rule__Description__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1428:1: ( ( ( rule__Description__Group_7__0 )? ) rule__Description__Group__8 )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1429:1: ( ( rule__Description__Group_7__0 )? ) rule__Description__Group__8
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1429:1: ( ( rule__Description__Group_7__0 )? )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1430:1: ( rule__Description__Group_7__0 )?
            {
             before(grammarAccess.getDescriptionAccess().getGroup_7()); 
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1431:1: ( rule__Description__Group_7__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==26) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1431:2: rule__Description__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__Description__Group_7__0_in_rule__Description__Group__72757);
                    rule__Description__Group_7__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDescriptionAccess().getGroup_7()); 

            }

            pushFollow(FOLLOW_rule__Description__Group__8_in_rule__Description__Group__72767);
            rule__Description__Group__8();
            _fsp--;


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
    // $ANTLR end rule__Description__Group__7


    // $ANTLR start rule__Description__Group__8
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1442:1: rule__Description__Group__8 : ( '}' ) ;
    public final void rule__Description__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1446:1: ( ( '}' ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1447:1: ( '}' )
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1447:1: ( '}' )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1448:1: '}'
            {
             before(grammarAccess.getDescriptionAccess().getRightCurlyBracketKeyword_8()); 
            match(input,13,FOLLOW_13_in_rule__Description__Group__82796); 
             after(grammarAccess.getDescriptionAccess().getRightCurlyBracketKeyword_8()); 

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
    // $ANTLR end rule__Description__Group__8


    // $ANTLR start rule__Description__Group_7__0
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1479:1: rule__Description__Group_7__0 : ( 'color:' ) rule__Description__Group_7__1 ;
    public final void rule__Description__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1483:1: ( ( 'color:' ) rule__Description__Group_7__1 )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1484:1: ( 'color:' ) rule__Description__Group_7__1
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1484:1: ( 'color:' )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1485:1: 'color:'
            {
             before(grammarAccess.getDescriptionAccess().getColorKeyword_7_0()); 
            match(input,26,FOLLOW_26_in_rule__Description__Group_7__02850); 
             after(grammarAccess.getDescriptionAccess().getColorKeyword_7_0()); 

            }

            pushFollow(FOLLOW_rule__Description__Group_7__1_in_rule__Description__Group_7__02860);
            rule__Description__Group_7__1();
            _fsp--;


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
    // $ANTLR end rule__Description__Group_7__0


    // $ANTLR start rule__Description__Group_7__1
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1499:1: rule__Description__Group_7__1 : ( ( rule__Description__Group_7_1__0 ) ) rule__Description__Group_7__2 ;
    public final void rule__Description__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1503:1: ( ( ( rule__Description__Group_7_1__0 ) ) rule__Description__Group_7__2 )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1504:1: ( ( rule__Description__Group_7_1__0 ) ) rule__Description__Group_7__2
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1504:1: ( ( rule__Description__Group_7_1__0 ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1505:1: ( rule__Description__Group_7_1__0 )
            {
             before(grammarAccess.getDescriptionAccess().getGroup_7_1()); 
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1506:1: ( rule__Description__Group_7_1__0 )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1506:2: rule__Description__Group_7_1__0
            {
            pushFollow(FOLLOW_rule__Description__Group_7_1__0_in_rule__Description__Group_7__12888);
            rule__Description__Group_7_1__0();
            _fsp--;


            }

             after(grammarAccess.getDescriptionAccess().getGroup_7_1()); 

            }

            pushFollow(FOLLOW_rule__Description__Group_7__2_in_rule__Description__Group_7__12897);
            rule__Description__Group_7__2();
            _fsp--;


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
    // $ANTLR end rule__Description__Group_7__1


    // $ANTLR start rule__Description__Group_7__2
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1517:1: rule__Description__Group_7__2 : ( ';' ) ;
    public final void rule__Description__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1521:1: ( ( ';' ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1522:1: ( ';' )
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1522:1: ( ';' )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1523:1: ';'
            {
             before(grammarAccess.getDescriptionAccess().getSemicolonKeyword_7_2()); 
            match(input,17,FOLLOW_17_in_rule__Description__Group_7__22926); 
             after(grammarAccess.getDescriptionAccess().getSemicolonKeyword_7_2()); 

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
    // $ANTLR end rule__Description__Group_7__2


    // $ANTLR start rule__Description__Group_7_1__0
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1542:1: rule__Description__Group_7_1__0 : ( ( rule__Description__RedAssignment_7_1_0 ) ) rule__Description__Group_7_1__1 ;
    public final void rule__Description__Group_7_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1546:1: ( ( ( rule__Description__RedAssignment_7_1_0 ) ) rule__Description__Group_7_1__1 )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1547:1: ( ( rule__Description__RedAssignment_7_1_0 ) ) rule__Description__Group_7_1__1
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1547:1: ( ( rule__Description__RedAssignment_7_1_0 ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1548:1: ( rule__Description__RedAssignment_7_1_0 )
            {
             before(grammarAccess.getDescriptionAccess().getRedAssignment_7_1_0()); 
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1549:1: ( rule__Description__RedAssignment_7_1_0 )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1549:2: rule__Description__RedAssignment_7_1_0
            {
            pushFollow(FOLLOW_rule__Description__RedAssignment_7_1_0_in_rule__Description__Group_7_1__02967);
            rule__Description__RedAssignment_7_1_0();
            _fsp--;


            }

             after(grammarAccess.getDescriptionAccess().getRedAssignment_7_1_0()); 

            }

            pushFollow(FOLLOW_rule__Description__Group_7_1__1_in_rule__Description__Group_7_1__02976);
            rule__Description__Group_7_1__1();
            _fsp--;


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
    // $ANTLR end rule__Description__Group_7_1__0


    // $ANTLR start rule__Description__Group_7_1__1
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1560:1: rule__Description__Group_7_1__1 : ( ( rule__Description__GreenAssignment_7_1_1 ) ) rule__Description__Group_7_1__2 ;
    public final void rule__Description__Group_7_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1564:1: ( ( ( rule__Description__GreenAssignment_7_1_1 ) ) rule__Description__Group_7_1__2 )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1565:1: ( ( rule__Description__GreenAssignment_7_1_1 ) ) rule__Description__Group_7_1__2
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1565:1: ( ( rule__Description__GreenAssignment_7_1_1 ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1566:1: ( rule__Description__GreenAssignment_7_1_1 )
            {
             before(grammarAccess.getDescriptionAccess().getGreenAssignment_7_1_1()); 
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1567:1: ( rule__Description__GreenAssignment_7_1_1 )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1567:2: rule__Description__GreenAssignment_7_1_1
            {
            pushFollow(FOLLOW_rule__Description__GreenAssignment_7_1_1_in_rule__Description__Group_7_1__13004);
            rule__Description__GreenAssignment_7_1_1();
            _fsp--;


            }

             after(grammarAccess.getDescriptionAccess().getGreenAssignment_7_1_1()); 

            }

            pushFollow(FOLLOW_rule__Description__Group_7_1__2_in_rule__Description__Group_7_1__13013);
            rule__Description__Group_7_1__2();
            _fsp--;


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
    // $ANTLR end rule__Description__Group_7_1__1


    // $ANTLR start rule__Description__Group_7_1__2
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1578:1: rule__Description__Group_7_1__2 : ( ( rule__Description__BlueAssignment_7_1_2 ) ) rule__Description__Group_7_1__3 ;
    public final void rule__Description__Group_7_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1582:1: ( ( ( rule__Description__BlueAssignment_7_1_2 ) ) rule__Description__Group_7_1__3 )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1583:1: ( ( rule__Description__BlueAssignment_7_1_2 ) ) rule__Description__Group_7_1__3
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1583:1: ( ( rule__Description__BlueAssignment_7_1_2 ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1584:1: ( rule__Description__BlueAssignment_7_1_2 )
            {
             before(grammarAccess.getDescriptionAccess().getBlueAssignment_7_1_2()); 
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1585:1: ( rule__Description__BlueAssignment_7_1_2 )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1585:2: rule__Description__BlueAssignment_7_1_2
            {
            pushFollow(FOLLOW_rule__Description__BlueAssignment_7_1_2_in_rule__Description__Group_7_1__23041);
            rule__Description__BlueAssignment_7_1_2();
            _fsp--;


            }

             after(grammarAccess.getDescriptionAccess().getBlueAssignment_7_1_2()); 

            }

            pushFollow(FOLLOW_rule__Description__Group_7_1__3_in_rule__Description__Group_7_1__23050);
            rule__Description__Group_7_1__3();
            _fsp--;


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
    // $ANTLR end rule__Description__Group_7_1__2


    // $ANTLR start rule__Description__Group_7_1__3
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1596:1: rule__Description__Group_7_1__3 : ( ( rule__Description__AlphaAssignment_7_1_3 ) ) ;
    public final void rule__Description__Group_7_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1600:1: ( ( ( rule__Description__AlphaAssignment_7_1_3 ) ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1601:1: ( ( rule__Description__AlphaAssignment_7_1_3 ) )
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1601:1: ( ( rule__Description__AlphaAssignment_7_1_3 ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1602:1: ( rule__Description__AlphaAssignment_7_1_3 )
            {
             before(grammarAccess.getDescriptionAccess().getAlphaAssignment_7_1_3()); 
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1603:1: ( rule__Description__AlphaAssignment_7_1_3 )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1603:2: rule__Description__AlphaAssignment_7_1_3
            {
            pushFollow(FOLLOW_rule__Description__AlphaAssignment_7_1_3_in_rule__Description__Group_7_1__33078);
            rule__Description__AlphaAssignment_7_1_3();
            _fsp--;


            }

             after(grammarAccess.getDescriptionAccess().getAlphaAssignment_7_1_3()); 

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
    // $ANTLR end rule__Description__Group_7_1__3


    // $ANTLR start rule__Coordinates__Group__0
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1621:1: rule__Coordinates__Group__0 : ( ( rule__Coordinates__Group_0__0 )? ) rule__Coordinates__Group__1 ;
    public final void rule__Coordinates__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1625:1: ( ( ( rule__Coordinates__Group_0__0 )? ) rule__Coordinates__Group__1 )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1626:1: ( ( rule__Coordinates__Group_0__0 )? ) rule__Coordinates__Group__1
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1626:1: ( ( rule__Coordinates__Group_0__0 )? )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1627:1: ( rule__Coordinates__Group_0__0 )?
            {
             before(grammarAccess.getCoordinatesAccess().getGroup_0()); 
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1628:1: ( rule__Coordinates__Group_0__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==27) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1628:2: rule__Coordinates__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Coordinates__Group_0__0_in_rule__Coordinates__Group__03120);
                    rule__Coordinates__Group_0__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCoordinatesAccess().getGroup_0()); 

            }

            pushFollow(FOLLOW_rule__Coordinates__Group__1_in_rule__Coordinates__Group__03130);
            rule__Coordinates__Group__1();
            _fsp--;


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
    // $ANTLR end rule__Coordinates__Group__0


    // $ANTLR start rule__Coordinates__Group__1
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1639:1: rule__Coordinates__Group__1 : ( ( rule__Coordinates__Group_1__0 )? ) rule__Coordinates__Group__2 ;
    public final void rule__Coordinates__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1643:1: ( ( ( rule__Coordinates__Group_1__0 )? ) rule__Coordinates__Group__2 )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1644:1: ( ( rule__Coordinates__Group_1__0 )? ) rule__Coordinates__Group__2
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1644:1: ( ( rule__Coordinates__Group_1__0 )? )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1645:1: ( rule__Coordinates__Group_1__0 )?
            {
             before(grammarAccess.getCoordinatesAccess().getGroup_1()); 
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1646:1: ( rule__Coordinates__Group_1__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==28) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1646:2: rule__Coordinates__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Coordinates__Group_1__0_in_rule__Coordinates__Group__13158);
                    rule__Coordinates__Group_1__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCoordinatesAccess().getGroup_1()); 

            }

            pushFollow(FOLLOW_rule__Coordinates__Group__2_in_rule__Coordinates__Group__13168);
            rule__Coordinates__Group__2();
            _fsp--;


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
    // $ANTLR end rule__Coordinates__Group__1


    // $ANTLR start rule__Coordinates__Group__2
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1657:1: rule__Coordinates__Group__2 : ( ( rule__Coordinates__Group_2__0 )? ) ;
    public final void rule__Coordinates__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1661:1: ( ( ( rule__Coordinates__Group_2__0 )? ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1662:1: ( ( rule__Coordinates__Group_2__0 )? )
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1662:1: ( ( rule__Coordinates__Group_2__0 )? )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1663:1: ( rule__Coordinates__Group_2__0 )?
            {
             before(grammarAccess.getCoordinatesAccess().getGroup_2()); 
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1664:1: ( rule__Coordinates__Group_2__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==29) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1664:2: rule__Coordinates__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Coordinates__Group_2__0_in_rule__Coordinates__Group__23196);
                    rule__Coordinates__Group_2__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCoordinatesAccess().getGroup_2()); 

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
    // $ANTLR end rule__Coordinates__Group__2


    // $ANTLR start rule__Coordinates__Group_0__0
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1680:1: rule__Coordinates__Group_0__0 : ( 'absolute:' ) rule__Coordinates__Group_0__1 ;
    public final void rule__Coordinates__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1684:1: ( ( 'absolute:' ) rule__Coordinates__Group_0__1 )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1685:1: ( 'absolute:' ) rule__Coordinates__Group_0__1
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1685:1: ( 'absolute:' )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1686:1: 'absolute:'
            {
             before(grammarAccess.getCoordinatesAccess().getAbsoluteKeyword_0_0()); 
            match(input,27,FOLLOW_27_in_rule__Coordinates__Group_0__03238); 
             after(grammarAccess.getCoordinatesAccess().getAbsoluteKeyword_0_0()); 

            }

            pushFollow(FOLLOW_rule__Coordinates__Group_0__1_in_rule__Coordinates__Group_0__03248);
            rule__Coordinates__Group_0__1();
            _fsp--;


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
    // $ANTLR end rule__Coordinates__Group_0__0


    // $ANTLR start rule__Coordinates__Group_0__1
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1700:1: rule__Coordinates__Group_0__1 : ( ( rule__Coordinates__Group_0_1__0 ) ) rule__Coordinates__Group_0__2 ;
    public final void rule__Coordinates__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1704:1: ( ( ( rule__Coordinates__Group_0_1__0 ) ) rule__Coordinates__Group_0__2 )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1705:1: ( ( rule__Coordinates__Group_0_1__0 ) ) rule__Coordinates__Group_0__2
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1705:1: ( ( rule__Coordinates__Group_0_1__0 ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1706:1: ( rule__Coordinates__Group_0_1__0 )
            {
             before(grammarAccess.getCoordinatesAccess().getGroup_0_1()); 
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1707:1: ( rule__Coordinates__Group_0_1__0 )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1707:2: rule__Coordinates__Group_0_1__0
            {
            pushFollow(FOLLOW_rule__Coordinates__Group_0_1__0_in_rule__Coordinates__Group_0__13276);
            rule__Coordinates__Group_0_1__0();
            _fsp--;


            }

             after(grammarAccess.getCoordinatesAccess().getGroup_0_1()); 

            }

            pushFollow(FOLLOW_rule__Coordinates__Group_0__2_in_rule__Coordinates__Group_0__13285);
            rule__Coordinates__Group_0__2();
            _fsp--;


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
    // $ANTLR end rule__Coordinates__Group_0__1


    // $ANTLR start rule__Coordinates__Group_0__2
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1718:1: rule__Coordinates__Group_0__2 : ( ';' ) ;
    public final void rule__Coordinates__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1722:1: ( ( ';' ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1723:1: ( ';' )
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1723:1: ( ';' )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1724:1: ';'
            {
             before(grammarAccess.getCoordinatesAccess().getSemicolonKeyword_0_2()); 
            match(input,17,FOLLOW_17_in_rule__Coordinates__Group_0__23314); 
             after(grammarAccess.getCoordinatesAccess().getSemicolonKeyword_0_2()); 

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
    // $ANTLR end rule__Coordinates__Group_0__2


    // $ANTLR start rule__Coordinates__Group_0_1__0
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1743:1: rule__Coordinates__Group_0_1__0 : ( ( rule__Coordinates__XAssignment_0_1_0 ) ) rule__Coordinates__Group_0_1__1 ;
    public final void rule__Coordinates__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1747:1: ( ( ( rule__Coordinates__XAssignment_0_1_0 ) ) rule__Coordinates__Group_0_1__1 )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1748:1: ( ( rule__Coordinates__XAssignment_0_1_0 ) ) rule__Coordinates__Group_0_1__1
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1748:1: ( ( rule__Coordinates__XAssignment_0_1_0 ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1749:1: ( rule__Coordinates__XAssignment_0_1_0 )
            {
             before(grammarAccess.getCoordinatesAccess().getXAssignment_0_1_0()); 
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1750:1: ( rule__Coordinates__XAssignment_0_1_0 )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1750:2: rule__Coordinates__XAssignment_0_1_0
            {
            pushFollow(FOLLOW_rule__Coordinates__XAssignment_0_1_0_in_rule__Coordinates__Group_0_1__03355);
            rule__Coordinates__XAssignment_0_1_0();
            _fsp--;


            }

             after(grammarAccess.getCoordinatesAccess().getXAssignment_0_1_0()); 

            }

            pushFollow(FOLLOW_rule__Coordinates__Group_0_1__1_in_rule__Coordinates__Group_0_1__03364);
            rule__Coordinates__Group_0_1__1();
            _fsp--;


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
    // $ANTLR end rule__Coordinates__Group_0_1__0


    // $ANTLR start rule__Coordinates__Group_0_1__1
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1761:1: rule__Coordinates__Group_0_1__1 : ( ( rule__Coordinates__YAssignment_0_1_1 ) ) rule__Coordinates__Group_0_1__2 ;
    public final void rule__Coordinates__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1765:1: ( ( ( rule__Coordinates__YAssignment_0_1_1 ) ) rule__Coordinates__Group_0_1__2 )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1766:1: ( ( rule__Coordinates__YAssignment_0_1_1 ) ) rule__Coordinates__Group_0_1__2
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1766:1: ( ( rule__Coordinates__YAssignment_0_1_1 ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1767:1: ( rule__Coordinates__YAssignment_0_1_1 )
            {
             before(grammarAccess.getCoordinatesAccess().getYAssignment_0_1_1()); 
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1768:1: ( rule__Coordinates__YAssignment_0_1_1 )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1768:2: rule__Coordinates__YAssignment_0_1_1
            {
            pushFollow(FOLLOW_rule__Coordinates__YAssignment_0_1_1_in_rule__Coordinates__Group_0_1__13392);
            rule__Coordinates__YAssignment_0_1_1();
            _fsp--;


            }

             after(grammarAccess.getCoordinatesAccess().getYAssignment_0_1_1()); 

            }

            pushFollow(FOLLOW_rule__Coordinates__Group_0_1__2_in_rule__Coordinates__Group_0_1__13401);
            rule__Coordinates__Group_0_1__2();
            _fsp--;


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
    // $ANTLR end rule__Coordinates__Group_0_1__1


    // $ANTLR start rule__Coordinates__Group_0_1__2
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1779:1: rule__Coordinates__Group_0_1__2 : ( ( rule__Coordinates__WidthAssignment_0_1_2 ) ) rule__Coordinates__Group_0_1__3 ;
    public final void rule__Coordinates__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1783:1: ( ( ( rule__Coordinates__WidthAssignment_0_1_2 ) ) rule__Coordinates__Group_0_1__3 )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1784:1: ( ( rule__Coordinates__WidthAssignment_0_1_2 ) ) rule__Coordinates__Group_0_1__3
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1784:1: ( ( rule__Coordinates__WidthAssignment_0_1_2 ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1785:1: ( rule__Coordinates__WidthAssignment_0_1_2 )
            {
             before(grammarAccess.getCoordinatesAccess().getWidthAssignment_0_1_2()); 
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1786:1: ( rule__Coordinates__WidthAssignment_0_1_2 )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1786:2: rule__Coordinates__WidthAssignment_0_1_2
            {
            pushFollow(FOLLOW_rule__Coordinates__WidthAssignment_0_1_2_in_rule__Coordinates__Group_0_1__23429);
            rule__Coordinates__WidthAssignment_0_1_2();
            _fsp--;


            }

             after(grammarAccess.getCoordinatesAccess().getWidthAssignment_0_1_2()); 

            }

            pushFollow(FOLLOW_rule__Coordinates__Group_0_1__3_in_rule__Coordinates__Group_0_1__23438);
            rule__Coordinates__Group_0_1__3();
            _fsp--;


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
    // $ANTLR end rule__Coordinates__Group_0_1__2


    // $ANTLR start rule__Coordinates__Group_0_1__3
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1797:1: rule__Coordinates__Group_0_1__3 : ( ( rule__Coordinates__HeightAssignment_0_1_3 ) ) ;
    public final void rule__Coordinates__Group_0_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1801:1: ( ( ( rule__Coordinates__HeightAssignment_0_1_3 ) ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1802:1: ( ( rule__Coordinates__HeightAssignment_0_1_3 ) )
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1802:1: ( ( rule__Coordinates__HeightAssignment_0_1_3 ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1803:1: ( rule__Coordinates__HeightAssignment_0_1_3 )
            {
             before(grammarAccess.getCoordinatesAccess().getHeightAssignment_0_1_3()); 
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1804:1: ( rule__Coordinates__HeightAssignment_0_1_3 )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1804:2: rule__Coordinates__HeightAssignment_0_1_3
            {
            pushFollow(FOLLOW_rule__Coordinates__HeightAssignment_0_1_3_in_rule__Coordinates__Group_0_1__33466);
            rule__Coordinates__HeightAssignment_0_1_3();
            _fsp--;


            }

             after(grammarAccess.getCoordinatesAccess().getHeightAssignment_0_1_3()); 

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
    // $ANTLR end rule__Coordinates__Group_0_1__3


    // $ANTLR start rule__Coordinates__Group_1__0
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1822:1: rule__Coordinates__Group_1__0 : ( 'relative:' ) rule__Coordinates__Group_1__1 ;
    public final void rule__Coordinates__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1826:1: ( ( 'relative:' ) rule__Coordinates__Group_1__1 )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1827:1: ( 'relative:' ) rule__Coordinates__Group_1__1
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1827:1: ( 'relative:' )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1828:1: 'relative:'
            {
             before(grammarAccess.getCoordinatesAccess().getRelativeKeyword_1_0()); 
            match(input,28,FOLLOW_28_in_rule__Coordinates__Group_1__03509); 
             after(grammarAccess.getCoordinatesAccess().getRelativeKeyword_1_0()); 

            }

            pushFollow(FOLLOW_rule__Coordinates__Group_1__1_in_rule__Coordinates__Group_1__03519);
            rule__Coordinates__Group_1__1();
            _fsp--;


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
    // $ANTLR end rule__Coordinates__Group_1__0


    // $ANTLR start rule__Coordinates__Group_1__1
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1842:1: rule__Coordinates__Group_1__1 : ( ( rule__Coordinates__Group_1_1__0 ) ) rule__Coordinates__Group_1__2 ;
    public final void rule__Coordinates__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1846:1: ( ( ( rule__Coordinates__Group_1_1__0 ) ) rule__Coordinates__Group_1__2 )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1847:1: ( ( rule__Coordinates__Group_1_1__0 ) ) rule__Coordinates__Group_1__2
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1847:1: ( ( rule__Coordinates__Group_1_1__0 ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1848:1: ( rule__Coordinates__Group_1_1__0 )
            {
             before(grammarAccess.getCoordinatesAccess().getGroup_1_1()); 
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1849:1: ( rule__Coordinates__Group_1_1__0 )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1849:2: rule__Coordinates__Group_1_1__0
            {
            pushFollow(FOLLOW_rule__Coordinates__Group_1_1__0_in_rule__Coordinates__Group_1__13547);
            rule__Coordinates__Group_1_1__0();
            _fsp--;


            }

             after(grammarAccess.getCoordinatesAccess().getGroup_1_1()); 

            }

            pushFollow(FOLLOW_rule__Coordinates__Group_1__2_in_rule__Coordinates__Group_1__13556);
            rule__Coordinates__Group_1__2();
            _fsp--;


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
    // $ANTLR end rule__Coordinates__Group_1__1


    // $ANTLR start rule__Coordinates__Group_1__2
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1860:1: rule__Coordinates__Group_1__2 : ( ';' ) ;
    public final void rule__Coordinates__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1864:1: ( ( ';' ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1865:1: ( ';' )
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1865:1: ( ';' )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1866:1: ';'
            {
             before(grammarAccess.getCoordinatesAccess().getSemicolonKeyword_1_2()); 
            match(input,17,FOLLOW_17_in_rule__Coordinates__Group_1__23585); 
             after(grammarAccess.getCoordinatesAccess().getSemicolonKeyword_1_2()); 

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
    // $ANTLR end rule__Coordinates__Group_1__2


    // $ANTLR start rule__Coordinates__Group_1_1__0
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1885:1: rule__Coordinates__Group_1_1__0 : ( ( rule__Coordinates__XAssignment_1_1_0 ) ) rule__Coordinates__Group_1_1__1 ;
    public final void rule__Coordinates__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1889:1: ( ( ( rule__Coordinates__XAssignment_1_1_0 ) ) rule__Coordinates__Group_1_1__1 )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1890:1: ( ( rule__Coordinates__XAssignment_1_1_0 ) ) rule__Coordinates__Group_1_1__1
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1890:1: ( ( rule__Coordinates__XAssignment_1_1_0 ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1891:1: ( rule__Coordinates__XAssignment_1_1_0 )
            {
             before(grammarAccess.getCoordinatesAccess().getXAssignment_1_1_0()); 
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1892:1: ( rule__Coordinates__XAssignment_1_1_0 )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1892:2: rule__Coordinates__XAssignment_1_1_0
            {
            pushFollow(FOLLOW_rule__Coordinates__XAssignment_1_1_0_in_rule__Coordinates__Group_1_1__03626);
            rule__Coordinates__XAssignment_1_1_0();
            _fsp--;


            }

             after(grammarAccess.getCoordinatesAccess().getXAssignment_1_1_0()); 

            }

            pushFollow(FOLLOW_rule__Coordinates__Group_1_1__1_in_rule__Coordinates__Group_1_1__03635);
            rule__Coordinates__Group_1_1__1();
            _fsp--;


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
    // $ANTLR end rule__Coordinates__Group_1_1__0


    // $ANTLR start rule__Coordinates__Group_1_1__1
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1903:1: rule__Coordinates__Group_1_1__1 : ( ( rule__Coordinates__YAssignment_1_1_1 ) ) ;
    public final void rule__Coordinates__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1907:1: ( ( ( rule__Coordinates__YAssignment_1_1_1 ) ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1908:1: ( ( rule__Coordinates__YAssignment_1_1_1 ) )
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1908:1: ( ( rule__Coordinates__YAssignment_1_1_1 ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1909:1: ( rule__Coordinates__YAssignment_1_1_1 )
            {
             before(grammarAccess.getCoordinatesAccess().getYAssignment_1_1_1()); 
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1910:1: ( rule__Coordinates__YAssignment_1_1_1 )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1910:2: rule__Coordinates__YAssignment_1_1_1
            {
            pushFollow(FOLLOW_rule__Coordinates__YAssignment_1_1_1_in_rule__Coordinates__Group_1_1__13663);
            rule__Coordinates__YAssignment_1_1_1();
            _fsp--;


            }

             after(grammarAccess.getCoordinatesAccess().getYAssignment_1_1_1()); 

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
    // $ANTLR end rule__Coordinates__Group_1_1__1


    // $ANTLR start rule__Coordinates__Group_2__0
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1924:1: rule__Coordinates__Group_2__0 : ( 'offset:' ) rule__Coordinates__Group_2__1 ;
    public final void rule__Coordinates__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1928:1: ( ( 'offset:' ) rule__Coordinates__Group_2__1 )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1929:1: ( 'offset:' ) rule__Coordinates__Group_2__1
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1929:1: ( 'offset:' )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1930:1: 'offset:'
            {
             before(grammarAccess.getCoordinatesAccess().getOffsetKeyword_2_0()); 
            match(input,29,FOLLOW_29_in_rule__Coordinates__Group_2__03702); 
             after(grammarAccess.getCoordinatesAccess().getOffsetKeyword_2_0()); 

            }

            pushFollow(FOLLOW_rule__Coordinates__Group_2__1_in_rule__Coordinates__Group_2__03712);
            rule__Coordinates__Group_2__1();
            _fsp--;


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
    // $ANTLR end rule__Coordinates__Group_2__0


    // $ANTLR start rule__Coordinates__Group_2__1
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1944:1: rule__Coordinates__Group_2__1 : ( ( rule__Coordinates__Group_2_1__0 ) ) rule__Coordinates__Group_2__2 ;
    public final void rule__Coordinates__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1948:1: ( ( ( rule__Coordinates__Group_2_1__0 ) ) rule__Coordinates__Group_2__2 )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1949:1: ( ( rule__Coordinates__Group_2_1__0 ) ) rule__Coordinates__Group_2__2
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1949:1: ( ( rule__Coordinates__Group_2_1__0 ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1950:1: ( rule__Coordinates__Group_2_1__0 )
            {
             before(grammarAccess.getCoordinatesAccess().getGroup_2_1()); 
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1951:1: ( rule__Coordinates__Group_2_1__0 )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1951:2: rule__Coordinates__Group_2_1__0
            {
            pushFollow(FOLLOW_rule__Coordinates__Group_2_1__0_in_rule__Coordinates__Group_2__13740);
            rule__Coordinates__Group_2_1__0();
            _fsp--;


            }

             after(grammarAccess.getCoordinatesAccess().getGroup_2_1()); 

            }

            pushFollow(FOLLOW_rule__Coordinates__Group_2__2_in_rule__Coordinates__Group_2__13749);
            rule__Coordinates__Group_2__2();
            _fsp--;


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
    // $ANTLR end rule__Coordinates__Group_2__1


    // $ANTLR start rule__Coordinates__Group_2__2
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1962:1: rule__Coordinates__Group_2__2 : ( ';' ) ;
    public final void rule__Coordinates__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1966:1: ( ( ';' ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1967:1: ( ';' )
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1967:1: ( ';' )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1968:1: ';'
            {
             before(grammarAccess.getCoordinatesAccess().getSemicolonKeyword_2_2()); 
            match(input,17,FOLLOW_17_in_rule__Coordinates__Group_2__23778); 
             after(grammarAccess.getCoordinatesAccess().getSemicolonKeyword_2_2()); 

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
    // $ANTLR end rule__Coordinates__Group_2__2


    // $ANTLR start rule__Coordinates__Group_2_1__0
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1987:1: rule__Coordinates__Group_2_1__0 : ( ( rule__Coordinates__XAssignment_2_1_0 ) ) rule__Coordinates__Group_2_1__1 ;
    public final void rule__Coordinates__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1991:1: ( ( ( rule__Coordinates__XAssignment_2_1_0 ) ) rule__Coordinates__Group_2_1__1 )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1992:1: ( ( rule__Coordinates__XAssignment_2_1_0 ) ) rule__Coordinates__Group_2_1__1
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1992:1: ( ( rule__Coordinates__XAssignment_2_1_0 ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1993:1: ( rule__Coordinates__XAssignment_2_1_0 )
            {
             before(grammarAccess.getCoordinatesAccess().getXAssignment_2_1_0()); 
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1994:1: ( rule__Coordinates__XAssignment_2_1_0 )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1994:2: rule__Coordinates__XAssignment_2_1_0
            {
            pushFollow(FOLLOW_rule__Coordinates__XAssignment_2_1_0_in_rule__Coordinates__Group_2_1__03819);
            rule__Coordinates__XAssignment_2_1_0();
            _fsp--;


            }

             after(grammarAccess.getCoordinatesAccess().getXAssignment_2_1_0()); 

            }

            pushFollow(FOLLOW_rule__Coordinates__Group_2_1__1_in_rule__Coordinates__Group_2_1__03828);
            rule__Coordinates__Group_2_1__1();
            _fsp--;


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
    // $ANTLR end rule__Coordinates__Group_2_1__0


    // $ANTLR start rule__Coordinates__Group_2_1__1
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2005:1: rule__Coordinates__Group_2_1__1 : ( ( rule__Coordinates__YAssignment_2_1_1 ) ) ;
    public final void rule__Coordinates__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2009:1: ( ( ( rule__Coordinates__YAssignment_2_1_1 ) ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2010:1: ( ( rule__Coordinates__YAssignment_2_1_1 ) )
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2010:1: ( ( rule__Coordinates__YAssignment_2_1_1 ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2011:1: ( rule__Coordinates__YAssignment_2_1_1 )
            {
             before(grammarAccess.getCoordinatesAccess().getYAssignment_2_1_1()); 
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2012:1: ( rule__Coordinates__YAssignment_2_1_1 )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2012:2: rule__Coordinates__YAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__Coordinates__YAssignment_2_1_1_in_rule__Coordinates__Group_2_1__13856);
            rule__Coordinates__YAssignment_2_1_1();
            _fsp--;


            }

             after(grammarAccess.getCoordinatesAccess().getYAssignment_2_1_1()); 

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
    // $ANTLR end rule__Coordinates__Group_2_1__1


    // $ANTLR start rule__Program__Group__0
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2027:1: rule__Program__Group__0 : ( 'program {' ) rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2031:1: ( ( 'program {' ) rule__Program__Group__1 )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2032:1: ( 'program {' ) rule__Program__Group__1
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2032:1: ( 'program {' )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2033:1: 'program {'
            {
             before(grammarAccess.getProgramAccess().getProgramKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__Program__Group__03896); 
             after(grammarAccess.getProgramAccess().getProgramKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Program__Group__1_in_rule__Program__Group__03906);
            rule__Program__Group__1();
            _fsp--;


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
    // $ANTLR end rule__Program__Group__0


    // $ANTLR start rule__Program__Group__1
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2047:1: rule__Program__Group__1 : ( ( rule__Program__Group_1__0 ) ) rule__Program__Group__2 ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2051:1: ( ( ( rule__Program__Group_1__0 ) ) rule__Program__Group__2 )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2052:1: ( ( rule__Program__Group_1__0 ) ) rule__Program__Group__2
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2052:1: ( ( rule__Program__Group_1__0 ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2053:1: ( rule__Program__Group_1__0 )
            {
             before(grammarAccess.getProgramAccess().getGroup_1()); 
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2054:1: ( rule__Program__Group_1__0 )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2054:2: rule__Program__Group_1__0
            {
            pushFollow(FOLLOW_rule__Program__Group_1__0_in_rule__Program__Group__13934);
            rule__Program__Group_1__0();
            _fsp--;


            }

             after(grammarAccess.getProgramAccess().getGroup_1()); 

            }

            pushFollow(FOLLOW_rule__Program__Group__2_in_rule__Program__Group__13943);
            rule__Program__Group__2();
            _fsp--;


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
    // $ANTLR end rule__Program__Group__1


    // $ANTLR start rule__Program__Group__2
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2065:1: rule__Program__Group__2 : ( ( rule__Program__Group_2__0 ) ) rule__Program__Group__3 ;
    public final void rule__Program__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2069:1: ( ( ( rule__Program__Group_2__0 ) ) rule__Program__Group__3 )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2070:1: ( ( rule__Program__Group_2__0 ) ) rule__Program__Group__3
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2070:1: ( ( rule__Program__Group_2__0 ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2071:1: ( rule__Program__Group_2__0 )
            {
             before(grammarAccess.getProgramAccess().getGroup_2()); 
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2072:1: ( rule__Program__Group_2__0 )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2072:2: rule__Program__Group_2__0
            {
            pushFollow(FOLLOW_rule__Program__Group_2__0_in_rule__Program__Group__23971);
            rule__Program__Group_2__0();
            _fsp--;


            }

             after(grammarAccess.getProgramAccess().getGroup_2()); 

            }

            pushFollow(FOLLOW_rule__Program__Group__3_in_rule__Program__Group__23980);
            rule__Program__Group__3();
            _fsp--;


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
    // $ANTLR end rule__Program__Group__2


    // $ANTLR start rule__Program__Group__3
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2083:1: rule__Program__Group__3 : ( ( rule__Program__Group_3__0 ) ) rule__Program__Group__4 ;
    public final void rule__Program__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2087:1: ( ( ( rule__Program__Group_3__0 ) ) rule__Program__Group__4 )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2088:1: ( ( rule__Program__Group_3__0 ) ) rule__Program__Group__4
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2088:1: ( ( rule__Program__Group_3__0 ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2089:1: ( rule__Program__Group_3__0 )
            {
             before(grammarAccess.getProgramAccess().getGroup_3()); 
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2090:1: ( rule__Program__Group_3__0 )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2090:2: rule__Program__Group_3__0
            {
            pushFollow(FOLLOW_rule__Program__Group_3__0_in_rule__Program__Group__34008);
            rule__Program__Group_3__0();
            _fsp--;


            }

             after(grammarAccess.getProgramAccess().getGroup_3()); 

            }

            pushFollow(FOLLOW_rule__Program__Group__4_in_rule__Program__Group__34017);
            rule__Program__Group__4();
            _fsp--;


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
    // $ANTLR end rule__Program__Group__3


    // $ANTLR start rule__Program__Group__4
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2101:1: rule__Program__Group__4 : ( ( rule__Program__Group_4__0 )? ) rule__Program__Group__5 ;
    public final void rule__Program__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2105:1: ( ( ( rule__Program__Group_4__0 )? ) rule__Program__Group__5 )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2106:1: ( ( rule__Program__Group_4__0 )? ) rule__Program__Group__5
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2106:1: ( ( rule__Program__Group_4__0 )? )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2107:1: ( rule__Program__Group_4__0 )?
            {
             before(grammarAccess.getProgramAccess().getGroup_4()); 
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2108:1: ( rule__Program__Group_4__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==33) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2108:2: rule__Program__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Program__Group_4__0_in_rule__Program__Group__44045);
                    rule__Program__Group_4__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProgramAccess().getGroup_4()); 

            }

            pushFollow(FOLLOW_rule__Program__Group__5_in_rule__Program__Group__44055);
            rule__Program__Group__5();
            _fsp--;


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
    // $ANTLR end rule__Program__Group__4


    // $ANTLR start rule__Program__Group__5
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2119:1: rule__Program__Group__5 : ( ( rule__Program__Lua_scriptAssignment_5 )? ) rule__Program__Group__6 ;
    public final void rule__Program__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2123:1: ( ( ( rule__Program__Lua_scriptAssignment_5 )? ) rule__Program__Group__6 )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2124:1: ( ( rule__Program__Lua_scriptAssignment_5 )? ) rule__Program__Group__6
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2124:1: ( ( rule__Program__Lua_scriptAssignment_5 )? )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2125:1: ( rule__Program__Lua_scriptAssignment_5 )?
            {
             before(grammarAccess.getProgramAccess().getLua_scriptAssignment_5()); 
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2126:1: ( rule__Program__Lua_scriptAssignment_5 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==12) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2126:2: rule__Program__Lua_scriptAssignment_5
                    {
                    pushFollow(FOLLOW_rule__Program__Lua_scriptAssignment_5_in_rule__Program__Group__54083);
                    rule__Program__Lua_scriptAssignment_5();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProgramAccess().getLua_scriptAssignment_5()); 

            }

            pushFollow(FOLLOW_rule__Program__Group__6_in_rule__Program__Group__54093);
            rule__Program__Group__6();
            _fsp--;


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
    // $ANTLR end rule__Program__Group__5


    // $ANTLR start rule__Program__Group__6
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2137:1: rule__Program__Group__6 : ( '}' ) ;
    public final void rule__Program__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2141:1: ( ( '}' ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2142:1: ( '}' )
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2142:1: ( '}' )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2143:1: '}'
            {
             before(grammarAccess.getProgramAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FOLLOW_13_in_rule__Program__Group__64122); 
             after(grammarAccess.getProgramAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end rule__Program__Group__6


    // $ANTLR start rule__Program__Group_1__0
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2170:1: rule__Program__Group_1__0 : ( 'name:' ) rule__Program__Group_1__1 ;
    public final void rule__Program__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2174:1: ( ( 'name:' ) rule__Program__Group_1__1 )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2175:1: ( 'name:' ) rule__Program__Group_1__1
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2175:1: ( 'name:' )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2176:1: 'name:'
            {
             before(grammarAccess.getProgramAccess().getNameKeyword_1_0()); 
            match(input,16,FOLLOW_16_in_rule__Program__Group_1__04172); 
             after(grammarAccess.getProgramAccess().getNameKeyword_1_0()); 

            }

            pushFollow(FOLLOW_rule__Program__Group_1__1_in_rule__Program__Group_1__04182);
            rule__Program__Group_1__1();
            _fsp--;


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
    // $ANTLR end rule__Program__Group_1__0


    // $ANTLR start rule__Program__Group_1__1
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2190:1: rule__Program__Group_1__1 : ( ( rule__Program__NameAssignment_1_1 ) ) rule__Program__Group_1__2 ;
    public final void rule__Program__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2194:1: ( ( ( rule__Program__NameAssignment_1_1 ) ) rule__Program__Group_1__2 )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2195:1: ( ( rule__Program__NameAssignment_1_1 ) ) rule__Program__Group_1__2
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2195:1: ( ( rule__Program__NameAssignment_1_1 ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2196:1: ( rule__Program__NameAssignment_1_1 )
            {
             before(grammarAccess.getProgramAccess().getNameAssignment_1_1()); 
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2197:1: ( rule__Program__NameAssignment_1_1 )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2197:2: rule__Program__NameAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Program__NameAssignment_1_1_in_rule__Program__Group_1__14210);
            rule__Program__NameAssignment_1_1();
            _fsp--;


            }

             after(grammarAccess.getProgramAccess().getNameAssignment_1_1()); 

            }

            pushFollow(FOLLOW_rule__Program__Group_1__2_in_rule__Program__Group_1__14219);
            rule__Program__Group_1__2();
            _fsp--;


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
    // $ANTLR end rule__Program__Group_1__1


    // $ANTLR start rule__Program__Group_1__2
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2208:1: rule__Program__Group_1__2 : ( ';' ) ;
    public final void rule__Program__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2212:1: ( ( ';' ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2213:1: ( ';' )
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2213:1: ( ';' )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2214:1: ';'
            {
             before(grammarAccess.getProgramAccess().getSemicolonKeyword_1_2()); 
            match(input,17,FOLLOW_17_in_rule__Program__Group_1__24248); 
             after(grammarAccess.getProgramAccess().getSemicolonKeyword_1_2()); 

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
    // $ANTLR end rule__Program__Group_1__2


    // $ANTLR start rule__Program__Group_2__0
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2233:1: rule__Program__Group_2__0 : ( 'signal:' ) rule__Program__Group_2__1 ;
    public final void rule__Program__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2237:1: ( ( 'signal:' ) rule__Program__Group_2__1 )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2238:1: ( 'signal:' ) rule__Program__Group_2__1
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2238:1: ( 'signal:' )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2239:1: 'signal:'
            {
             before(grammarAccess.getProgramAccess().getSignalKeyword_2_0()); 
            match(input,31,FOLLOW_31_in_rule__Program__Group_2__04290); 
             after(grammarAccess.getProgramAccess().getSignalKeyword_2_0()); 

            }

            pushFollow(FOLLOW_rule__Program__Group_2__1_in_rule__Program__Group_2__04300);
            rule__Program__Group_2__1();
            _fsp--;


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
    // $ANTLR end rule__Program__Group_2__0


    // $ANTLR start rule__Program__Group_2__1
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2253:1: rule__Program__Group_2__1 : ( ( rule__Program__SignalAssignment_2_1 ) ) rule__Program__Group_2__2 ;
    public final void rule__Program__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2257:1: ( ( ( rule__Program__SignalAssignment_2_1 ) ) rule__Program__Group_2__2 )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2258:1: ( ( rule__Program__SignalAssignment_2_1 ) ) rule__Program__Group_2__2
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2258:1: ( ( rule__Program__SignalAssignment_2_1 ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2259:1: ( rule__Program__SignalAssignment_2_1 )
            {
             before(grammarAccess.getProgramAccess().getSignalAssignment_2_1()); 
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2260:1: ( rule__Program__SignalAssignment_2_1 )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2260:2: rule__Program__SignalAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Program__SignalAssignment_2_1_in_rule__Program__Group_2__14328);
            rule__Program__SignalAssignment_2_1();
            _fsp--;


            }

             after(grammarAccess.getProgramAccess().getSignalAssignment_2_1()); 

            }

            pushFollow(FOLLOW_rule__Program__Group_2__2_in_rule__Program__Group_2__14337);
            rule__Program__Group_2__2();
            _fsp--;


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
    // $ANTLR end rule__Program__Group_2__1


    // $ANTLR start rule__Program__Group_2__2
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2271:1: rule__Program__Group_2__2 : ( ';' ) ;
    public final void rule__Program__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2275:1: ( ( ';' ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2276:1: ( ';' )
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2276:1: ( ';' )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2277:1: ';'
            {
             before(grammarAccess.getProgramAccess().getSemicolonKeyword_2_2()); 
            match(input,17,FOLLOW_17_in_rule__Program__Group_2__24366); 
             after(grammarAccess.getProgramAccess().getSemicolonKeyword_2_2()); 

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
    // $ANTLR end rule__Program__Group_2__2


    // $ANTLR start rule__Program__Group_3__0
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2296:1: rule__Program__Group_3__0 : ( 'source:' ) rule__Program__Group_3__1 ;
    public final void rule__Program__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2300:1: ( ( 'source:' ) rule__Program__Group_3__1 )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2301:1: ( 'source:' ) rule__Program__Group_3__1
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2301:1: ( 'source:' )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2302:1: 'source:'
            {
             before(grammarAccess.getProgramAccess().getSourceKeyword_3_0()); 
            match(input,32,FOLLOW_32_in_rule__Program__Group_3__04408); 
             after(grammarAccess.getProgramAccess().getSourceKeyword_3_0()); 

            }

            pushFollow(FOLLOW_rule__Program__Group_3__1_in_rule__Program__Group_3__04418);
            rule__Program__Group_3__1();
            _fsp--;


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
    // $ANTLR end rule__Program__Group_3__0


    // $ANTLR start rule__Program__Group_3__1
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2316:1: rule__Program__Group_3__1 : ( ( rule__Program__SourceAssignment_3_1 ) ) rule__Program__Group_3__2 ;
    public final void rule__Program__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2320:1: ( ( ( rule__Program__SourceAssignment_3_1 ) ) rule__Program__Group_3__2 )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2321:1: ( ( rule__Program__SourceAssignment_3_1 ) ) rule__Program__Group_3__2
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2321:1: ( ( rule__Program__SourceAssignment_3_1 ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2322:1: ( rule__Program__SourceAssignment_3_1 )
            {
             before(grammarAccess.getProgramAccess().getSourceAssignment_3_1()); 
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2323:1: ( rule__Program__SourceAssignment_3_1 )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2323:2: rule__Program__SourceAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Program__SourceAssignment_3_1_in_rule__Program__Group_3__14446);
            rule__Program__SourceAssignment_3_1();
            _fsp--;


            }

             after(grammarAccess.getProgramAccess().getSourceAssignment_3_1()); 

            }

            pushFollow(FOLLOW_rule__Program__Group_3__2_in_rule__Program__Group_3__14455);
            rule__Program__Group_3__2();
            _fsp--;


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
    // $ANTLR end rule__Program__Group_3__1


    // $ANTLR start rule__Program__Group_3__2
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2334:1: rule__Program__Group_3__2 : ( ';' ) ;
    public final void rule__Program__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2338:1: ( ( ';' ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2339:1: ( ';' )
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2339:1: ( ';' )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2340:1: ';'
            {
             before(grammarAccess.getProgramAccess().getSemicolonKeyword_3_2()); 
            match(input,17,FOLLOW_17_in_rule__Program__Group_3__24484); 
             after(grammarAccess.getProgramAccess().getSemicolonKeyword_3_2()); 

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
    // $ANTLR end rule__Program__Group_3__2


    // $ANTLR start rule__Program__Group_4__0
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2359:1: rule__Program__Group_4__0 : ( 'action:' ) rule__Program__Group_4__1 ;
    public final void rule__Program__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2363:1: ( ( 'action:' ) rule__Program__Group_4__1 )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2364:1: ( 'action:' ) rule__Program__Group_4__1
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2364:1: ( 'action:' )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2365:1: 'action:'
            {
             before(grammarAccess.getProgramAccess().getActionKeyword_4_0()); 
            match(input,33,FOLLOW_33_in_rule__Program__Group_4__04526); 
             after(grammarAccess.getProgramAccess().getActionKeyword_4_0()); 

            }

            pushFollow(FOLLOW_rule__Program__Group_4__1_in_rule__Program__Group_4__04536);
            rule__Program__Group_4__1();
            _fsp--;


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
    // $ANTLR end rule__Program__Group_4__0


    // $ANTLR start rule__Program__Group_4__1
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2379:1: rule__Program__Group_4__1 : ( ( rule__Program__ActionAssignment_4_1 ) ) ;
    public final void rule__Program__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2383:1: ( ( ( rule__Program__ActionAssignment_4_1 ) ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2384:1: ( ( rule__Program__ActionAssignment_4_1 ) )
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2384:1: ( ( rule__Program__ActionAssignment_4_1 ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2385:1: ( rule__Program__ActionAssignment_4_1 )
            {
             before(grammarAccess.getProgramAccess().getActionAssignment_4_1()); 
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2386:1: ( rule__Program__ActionAssignment_4_1 )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2386:2: rule__Program__ActionAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Program__ActionAssignment_4_1_in_rule__Program__Group_4__14564);
            rule__Program__ActionAssignment_4_1();
            _fsp--;


            }

             after(grammarAccess.getProgramAccess().getActionAssignment_4_1()); 

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
    // $ANTLR end rule__Program__Group_4__1


    // $ANTLR start rule__Action__Group__0
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2400:1: rule__Action__Group__0 : ( ( rule__Action__NameAssignment_0 ) ) rule__Action__Group__1 ;
    public final void rule__Action__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2404:1: ( ( ( rule__Action__NameAssignment_0 ) ) rule__Action__Group__1 )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2405:1: ( ( rule__Action__NameAssignment_0 ) ) rule__Action__Group__1
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2405:1: ( ( rule__Action__NameAssignment_0 ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2406:1: ( rule__Action__NameAssignment_0 )
            {
             before(grammarAccess.getActionAccess().getNameAssignment_0()); 
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2407:1: ( rule__Action__NameAssignment_0 )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2407:2: rule__Action__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Action__NameAssignment_0_in_rule__Action__Group__04602);
            rule__Action__NameAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getActionAccess().getNameAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Action__Group__1_in_rule__Action__Group__04611);
            rule__Action__Group__1();
            _fsp--;


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
    // $ANTLR end rule__Action__Group__0


    // $ANTLR start rule__Action__Group__1
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2418:1: rule__Action__Group__1 : ( ( rule__Action__ParamsAssignment_1 )* ) rule__Action__Group__2 ;
    public final void rule__Action__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2422:1: ( ( ( rule__Action__ParamsAssignment_1 )* ) rule__Action__Group__2 )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2423:1: ( ( rule__Action__ParamsAssignment_1 )* ) rule__Action__Group__2
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2423:1: ( ( rule__Action__ParamsAssignment_1 )* )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2424:1: ( rule__Action__ParamsAssignment_1 )*
            {
             before(grammarAccess.getActionAccess().getParamsAssignment_1()); 
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2425:1: ( rule__Action__ParamsAssignment_1 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_STRING) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2425:2: rule__Action__ParamsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Action__ParamsAssignment_1_in_rule__Action__Group__14639);
            	    rule__Action__ParamsAssignment_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getActionAccess().getParamsAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Action__Group__2_in_rule__Action__Group__14649);
            rule__Action__Group__2();
            _fsp--;


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
    // $ANTLR end rule__Action__Group__1


    // $ANTLR start rule__Action__Group__2
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2436:1: rule__Action__Group__2 : ( ';' ) ;
    public final void rule__Action__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2440:1: ( ( ';' ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2441:1: ( ';' )
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2441:1: ( ';' )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2442:1: ';'
            {
             before(grammarAccess.getActionAccess().getSemicolonKeyword_2()); 
            match(input,17,FOLLOW_17_in_rule__Action__Group__24678); 
             after(grammarAccess.getActionAccess().getSemicolonKeyword_2()); 

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
    // $ANTLR end rule__Action__Group__2


    // $ANTLR start rule__Model__IncludesAssignment_0
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2461:1: rule__Model__IncludesAssignment_0 : ( ruleInclude ) ;
    public final void rule__Model__IncludesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2465:1: ( ( ruleInclude ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2466:1: ( ruleInclude )
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2466:1: ( ruleInclude )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2467:1: ruleInclude
            {
             before(grammarAccess.getModelAccess().getIncludesIncludeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleInclude_in_rule__Model__IncludesAssignment_04719);
            ruleInclude();
            _fsp--;

             after(grammarAccess.getModelAccess().getIncludesIncludeParserRuleCall_0_0()); 

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
    // $ANTLR end rule__Model__IncludesAssignment_0


    // $ANTLR start rule__Model__CollectionsAssignment_1
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2476:1: rule__Model__CollectionsAssignment_1 : ( ruleCollections ) ;
    public final void rule__Model__CollectionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2480:1: ( ( ruleCollections ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2481:1: ( ruleCollections )
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2481:1: ( ruleCollections )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2482:1: ruleCollections
            {
             before(grammarAccess.getModelAccess().getCollectionsCollectionsParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleCollections_in_rule__Model__CollectionsAssignment_14750);
            ruleCollections();
            _fsp--;

             after(grammarAccess.getModelAccess().getCollectionsCollectionsParserRuleCall_1_0()); 

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
    // $ANTLR end rule__Model__CollectionsAssignment_1


    // $ANTLR start rule__LUA_Script__ContentAssignment_1
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2491:1: rule__LUA_Script__ContentAssignment_1 : ( RULE_STRING ) ;
    public final void rule__LUA_Script__ContentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2495:1: ( ( RULE_STRING ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2496:1: ( RULE_STRING )
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2496:1: ( RULE_STRING )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2497:1: RULE_STRING
            {
             before(grammarAccess.getLUA_ScriptAccess().getContentSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__LUA_Script__ContentAssignment_14781); 
             after(grammarAccess.getLUA_ScriptAccess().getContentSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end rule__LUA_Script__ContentAssignment_1


    // $ANTLR start rule__Collections__GroupsAssignment_1
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2506:1: rule__Collections__GroupsAssignment_1 : ( ruleGroup ) ;
    public final void rule__Collections__GroupsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2510:1: ( ( ruleGroup ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2511:1: ( ruleGroup )
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2511:1: ( ruleGroup )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2512:1: ruleGroup
            {
             before(grammarAccess.getCollectionsAccess().getGroupsGroupParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleGroup_in_rule__Collections__GroupsAssignment_14812);
            ruleGroup();
            _fsp--;

             after(grammarAccess.getCollectionsAccess().getGroupsGroupParserRuleCall_1_0()); 

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
    // $ANTLR end rule__Collections__GroupsAssignment_1


    // $ANTLR start rule__Group__NameAssignment_1_1
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2521:1: rule__Group__NameAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__Group__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2525:1: ( ( RULE_STRING ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2526:1: ( RULE_STRING )
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2526:1: ( RULE_STRING )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2527:1: RULE_STRING
            {
             before(grammarAccess.getGroupAccess().getNameSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Group__NameAssignment_1_14843); 
             after(grammarAccess.getGroupAccess().getNameSTRINGTerminalRuleCall_1_1_0()); 

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
    // $ANTLR end rule__Group__NameAssignment_1_1


    // $ANTLR start rule__Group__MinxAssignment_2_1_0
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2536:1: rule__Group__MinxAssignment_2_1_0 : ( RULE_INT ) ;
    public final void rule__Group__MinxAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2540:1: ( ( RULE_INT ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2541:1: ( RULE_INT )
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2541:1: ( RULE_INT )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2542:1: RULE_INT
            {
             before(grammarAccess.getGroupAccess().getMinxINTTerminalRuleCall_2_1_0_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Group__MinxAssignment_2_1_04874); 
             after(grammarAccess.getGroupAccess().getMinxINTTerminalRuleCall_2_1_0_0()); 

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
    // $ANTLR end rule__Group__MinxAssignment_2_1_0


    // $ANTLR start rule__Group__MinyAssignment_2_1_1
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2551:1: rule__Group__MinyAssignment_2_1_1 : ( RULE_INT ) ;
    public final void rule__Group__MinyAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2555:1: ( ( RULE_INT ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2556:1: ( RULE_INT )
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2556:1: ( RULE_INT )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2557:1: RULE_INT
            {
             before(grammarAccess.getGroupAccess().getMinyINTTerminalRuleCall_2_1_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Group__MinyAssignment_2_1_14905); 
             after(grammarAccess.getGroupAccess().getMinyINTTerminalRuleCall_2_1_1_0()); 

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
    // $ANTLR end rule__Group__MinyAssignment_2_1_1


    // $ANTLR start rule__Group__PartAssignment_3_1
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2566:1: rule__Group__PartAssignment_3_1 : ( rulePart ) ;
    public final void rule__Group__PartAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2570:1: ( ( rulePart ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2571:1: ( rulePart )
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2571:1: ( rulePart )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2572:1: rulePart
            {
             before(grammarAccess.getGroupAccess().getPartPartParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_rulePart_in_rule__Group__PartAssignment_3_14936);
            rulePart();
            _fsp--;

             after(grammarAccess.getGroupAccess().getPartPartParserRuleCall_3_1_0()); 

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
    // $ANTLR end rule__Group__PartAssignment_3_1


    // $ANTLR start rule__Group__ProgramAssignment_4_1
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2581:1: rule__Group__ProgramAssignment_4_1 : ( ruleProgram ) ;
    public final void rule__Group__ProgramAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2585:1: ( ( ruleProgram ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2586:1: ( ruleProgram )
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2586:1: ( ruleProgram )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2587:1: ruleProgram
            {
             before(grammarAccess.getGroupAccess().getProgramProgramParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleProgram_in_rule__Group__ProgramAssignment_4_14967);
            ruleProgram();
            _fsp--;

             after(grammarAccess.getGroupAccess().getProgramProgramParserRuleCall_4_1_0()); 

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
    // $ANTLR end rule__Group__ProgramAssignment_4_1


    // $ANTLR start rule__Group__Lua_scriptAssignment_5
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2596:1: rule__Group__Lua_scriptAssignment_5 : ( ruleLUA_Script ) ;
    public final void rule__Group__Lua_scriptAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2600:1: ( ( ruleLUA_Script ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2601:1: ( ruleLUA_Script )
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2601:1: ( ruleLUA_Script )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2602:1: ruleLUA_Script
            {
             before(grammarAccess.getGroupAccess().getLua_scriptLUA_ScriptParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleLUA_Script_in_rule__Group__Lua_scriptAssignment_54998);
            ruleLUA_Script();
            _fsp--;

             after(grammarAccess.getGroupAccess().getLua_scriptLUA_ScriptParserRuleCall_5_0()); 

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
    // $ANTLR end rule__Group__Lua_scriptAssignment_5


    // $ANTLR start rule__Part__NameAssignment_1_1
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2611:1: rule__Part__NameAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__Part__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2615:1: ( ( RULE_STRING ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2616:1: ( RULE_STRING )
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2616:1: ( RULE_STRING )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2617:1: RULE_STRING
            {
             before(grammarAccess.getPartAccess().getNameSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Part__NameAssignment_1_15029); 
             after(grammarAccess.getPartAccess().getNameSTRINGTerminalRuleCall_1_1_0()); 

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
    // $ANTLR end rule__Part__NameAssignment_1_1


    // $ANTLR start rule__Part__MinxAssignment_2_1_0
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2626:1: rule__Part__MinxAssignment_2_1_0 : ( RULE_INT ) ;
    public final void rule__Part__MinxAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2630:1: ( ( RULE_INT ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2631:1: ( RULE_INT )
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2631:1: ( RULE_INT )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2632:1: RULE_INT
            {
             before(grammarAccess.getPartAccess().getMinxINTTerminalRuleCall_2_1_0_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Part__MinxAssignment_2_1_05060); 
             after(grammarAccess.getPartAccess().getMinxINTTerminalRuleCall_2_1_0_0()); 

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
    // $ANTLR end rule__Part__MinxAssignment_2_1_0


    // $ANTLR start rule__Part__MinyAssignment_2_1_1
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2641:1: rule__Part__MinyAssignment_2_1_1 : ( RULE_INT ) ;
    public final void rule__Part__MinyAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2645:1: ( ( RULE_INT ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2646:1: ( RULE_INT )
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2646:1: ( RULE_INT )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2647:1: RULE_INT
            {
             before(grammarAccess.getPartAccess().getMinyINTTerminalRuleCall_2_1_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Part__MinyAssignment_2_1_15091); 
             after(grammarAccess.getPartAccess().getMinyINTTerminalRuleCall_2_1_1_0()); 

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
    // $ANTLR end rule__Part__MinyAssignment_2_1_1


    // $ANTLR start rule__Part__TypeAssignment_3_1
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2656:1: rule__Part__TypeAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__Part__TypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2660:1: ( ( RULE_ID ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2661:1: ( RULE_ID )
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2661:1: ( RULE_ID )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2662:1: RULE_ID
            {
             before(grammarAccess.getPartAccess().getTypeIDTerminalRuleCall_3_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Part__TypeAssignment_3_15122); 
             after(grammarAccess.getPartAccess().getTypeIDTerminalRuleCall_3_1_0()); 

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
    // $ANTLR end rule__Part__TypeAssignment_3_1


    // $ANTLR start rule__Part__DescriptionsAssignment_4
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2671:1: rule__Part__DescriptionsAssignment_4 : ( ruleDescription ) ;
    public final void rule__Part__DescriptionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2675:1: ( ( ruleDescription ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2676:1: ( ruleDescription )
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2676:1: ( ruleDescription )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2677:1: ruleDescription
            {
             before(grammarAccess.getPartAccess().getDescriptionsDescriptionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleDescription_in_rule__Part__DescriptionsAssignment_45153);
            ruleDescription();
            _fsp--;

             after(grammarAccess.getPartAccess().getDescriptionsDescriptionParserRuleCall_4_0()); 

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
    // $ANTLR end rule__Part__DescriptionsAssignment_4


    // $ANTLR start rule__Description__CoordinatesAssignment_2
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2686:1: rule__Description__CoordinatesAssignment_2 : ( ruleCoordinates ) ;
    public final void rule__Description__CoordinatesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2690:1: ( ( ruleCoordinates ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2691:1: ( ruleCoordinates )
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2691:1: ( ruleCoordinates )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2692:1: ruleCoordinates
            {
             before(grammarAccess.getDescriptionAccess().getCoordinatesCoordinatesParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleCoordinates_in_rule__Description__CoordinatesAssignment_25184);
            ruleCoordinates();
            _fsp--;

             after(grammarAccess.getDescriptionAccess().getCoordinatesCoordinatesParserRuleCall_2_0()); 

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
    // $ANTLR end rule__Description__CoordinatesAssignment_2


    // $ANTLR start rule__Description__CoordinatesAssignment_5
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2701:1: rule__Description__CoordinatesAssignment_5 : ( ruleCoordinates ) ;
    public final void rule__Description__CoordinatesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2705:1: ( ( ruleCoordinates ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2706:1: ( ruleCoordinates )
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2706:1: ( ruleCoordinates )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2707:1: ruleCoordinates
            {
             before(grammarAccess.getDescriptionAccess().getCoordinatesCoordinatesParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleCoordinates_in_rule__Description__CoordinatesAssignment_55215);
            ruleCoordinates();
            _fsp--;

             after(grammarAccess.getDescriptionAccess().getCoordinatesCoordinatesParserRuleCall_5_0()); 

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
    // $ANTLR end rule__Description__CoordinatesAssignment_5


    // $ANTLR start rule__Description__RedAssignment_7_1_0
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2716:1: rule__Description__RedAssignment_7_1_0 : ( RULE_INT ) ;
    public final void rule__Description__RedAssignment_7_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2720:1: ( ( RULE_INT ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2721:1: ( RULE_INT )
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2721:1: ( RULE_INT )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2722:1: RULE_INT
            {
             before(grammarAccess.getDescriptionAccess().getRedINTTerminalRuleCall_7_1_0_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Description__RedAssignment_7_1_05246); 
             after(grammarAccess.getDescriptionAccess().getRedINTTerminalRuleCall_7_1_0_0()); 

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
    // $ANTLR end rule__Description__RedAssignment_7_1_0


    // $ANTLR start rule__Description__GreenAssignment_7_1_1
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2731:1: rule__Description__GreenAssignment_7_1_1 : ( RULE_INT ) ;
    public final void rule__Description__GreenAssignment_7_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2735:1: ( ( RULE_INT ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2736:1: ( RULE_INT )
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2736:1: ( RULE_INT )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2737:1: RULE_INT
            {
             before(grammarAccess.getDescriptionAccess().getGreenINTTerminalRuleCall_7_1_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Description__GreenAssignment_7_1_15277); 
             after(grammarAccess.getDescriptionAccess().getGreenINTTerminalRuleCall_7_1_1_0()); 

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
    // $ANTLR end rule__Description__GreenAssignment_7_1_1


    // $ANTLR start rule__Description__BlueAssignment_7_1_2
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2746:1: rule__Description__BlueAssignment_7_1_2 : ( RULE_INT ) ;
    public final void rule__Description__BlueAssignment_7_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2750:1: ( ( RULE_INT ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2751:1: ( RULE_INT )
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2751:1: ( RULE_INT )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2752:1: RULE_INT
            {
             before(grammarAccess.getDescriptionAccess().getBlueINTTerminalRuleCall_7_1_2_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Description__BlueAssignment_7_1_25308); 
             after(grammarAccess.getDescriptionAccess().getBlueINTTerminalRuleCall_7_1_2_0()); 

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
    // $ANTLR end rule__Description__BlueAssignment_7_1_2


    // $ANTLR start rule__Description__AlphaAssignment_7_1_3
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2761:1: rule__Description__AlphaAssignment_7_1_3 : ( RULE_INT ) ;
    public final void rule__Description__AlphaAssignment_7_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2765:1: ( ( RULE_INT ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2766:1: ( RULE_INT )
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2766:1: ( RULE_INT )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2767:1: RULE_INT
            {
             before(grammarAccess.getDescriptionAccess().getAlphaINTTerminalRuleCall_7_1_3_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Description__AlphaAssignment_7_1_35339); 
             after(grammarAccess.getDescriptionAccess().getAlphaINTTerminalRuleCall_7_1_3_0()); 

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
    // $ANTLR end rule__Description__AlphaAssignment_7_1_3


    // $ANTLR start rule__Coordinates__XAssignment_0_1_0
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2776:1: rule__Coordinates__XAssignment_0_1_0 : ( RULE_INT ) ;
    public final void rule__Coordinates__XAssignment_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2780:1: ( ( RULE_INT ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2781:1: ( RULE_INT )
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2781:1: ( RULE_INT )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2782:1: RULE_INT
            {
             before(grammarAccess.getCoordinatesAccess().getXINTTerminalRuleCall_0_1_0_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Coordinates__XAssignment_0_1_05370); 
             after(grammarAccess.getCoordinatesAccess().getXINTTerminalRuleCall_0_1_0_0()); 

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
    // $ANTLR end rule__Coordinates__XAssignment_0_1_0


    // $ANTLR start rule__Coordinates__YAssignment_0_1_1
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2791:1: rule__Coordinates__YAssignment_0_1_1 : ( RULE_INT ) ;
    public final void rule__Coordinates__YAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2795:1: ( ( RULE_INT ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2796:1: ( RULE_INT )
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2796:1: ( RULE_INT )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2797:1: RULE_INT
            {
             before(grammarAccess.getCoordinatesAccess().getYINTTerminalRuleCall_0_1_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Coordinates__YAssignment_0_1_15401); 
             after(grammarAccess.getCoordinatesAccess().getYINTTerminalRuleCall_0_1_1_0()); 

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
    // $ANTLR end rule__Coordinates__YAssignment_0_1_1


    // $ANTLR start rule__Coordinates__WidthAssignment_0_1_2
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2806:1: rule__Coordinates__WidthAssignment_0_1_2 : ( RULE_INT ) ;
    public final void rule__Coordinates__WidthAssignment_0_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2810:1: ( ( RULE_INT ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2811:1: ( RULE_INT )
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2811:1: ( RULE_INT )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2812:1: RULE_INT
            {
             before(grammarAccess.getCoordinatesAccess().getWidthINTTerminalRuleCall_0_1_2_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Coordinates__WidthAssignment_0_1_25432); 
             after(grammarAccess.getCoordinatesAccess().getWidthINTTerminalRuleCall_0_1_2_0()); 

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
    // $ANTLR end rule__Coordinates__WidthAssignment_0_1_2


    // $ANTLR start rule__Coordinates__HeightAssignment_0_1_3
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2821:1: rule__Coordinates__HeightAssignment_0_1_3 : ( RULE_INT ) ;
    public final void rule__Coordinates__HeightAssignment_0_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2825:1: ( ( RULE_INT ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2826:1: ( RULE_INT )
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2826:1: ( RULE_INT )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2827:1: RULE_INT
            {
             before(grammarAccess.getCoordinatesAccess().getHeightINTTerminalRuleCall_0_1_3_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Coordinates__HeightAssignment_0_1_35463); 
             after(grammarAccess.getCoordinatesAccess().getHeightINTTerminalRuleCall_0_1_3_0()); 

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
    // $ANTLR end rule__Coordinates__HeightAssignment_0_1_3


    // $ANTLR start rule__Coordinates__XAssignment_1_1_0
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2836:1: rule__Coordinates__XAssignment_1_1_0 : ( RULE_INT ) ;
    public final void rule__Coordinates__XAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2840:1: ( ( RULE_INT ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2841:1: ( RULE_INT )
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2841:1: ( RULE_INT )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2842:1: RULE_INT
            {
             before(grammarAccess.getCoordinatesAccess().getXINTTerminalRuleCall_1_1_0_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Coordinates__XAssignment_1_1_05494); 
             after(grammarAccess.getCoordinatesAccess().getXINTTerminalRuleCall_1_1_0_0()); 

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
    // $ANTLR end rule__Coordinates__XAssignment_1_1_0


    // $ANTLR start rule__Coordinates__YAssignment_1_1_1
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2851:1: rule__Coordinates__YAssignment_1_1_1 : ( RULE_INT ) ;
    public final void rule__Coordinates__YAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2855:1: ( ( RULE_INT ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2856:1: ( RULE_INT )
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2856:1: ( RULE_INT )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2857:1: RULE_INT
            {
             before(grammarAccess.getCoordinatesAccess().getYINTTerminalRuleCall_1_1_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Coordinates__YAssignment_1_1_15525); 
             after(grammarAccess.getCoordinatesAccess().getYINTTerminalRuleCall_1_1_1_0()); 

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
    // $ANTLR end rule__Coordinates__YAssignment_1_1_1


    // $ANTLR start rule__Coordinates__XAssignment_2_1_0
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2866:1: rule__Coordinates__XAssignment_2_1_0 : ( RULE_INT ) ;
    public final void rule__Coordinates__XAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2870:1: ( ( RULE_INT ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2871:1: ( RULE_INT )
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2871:1: ( RULE_INT )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2872:1: RULE_INT
            {
             before(grammarAccess.getCoordinatesAccess().getXINTTerminalRuleCall_2_1_0_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Coordinates__XAssignment_2_1_05556); 
             after(grammarAccess.getCoordinatesAccess().getXINTTerminalRuleCall_2_1_0_0()); 

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
    // $ANTLR end rule__Coordinates__XAssignment_2_1_0


    // $ANTLR start rule__Coordinates__YAssignment_2_1_1
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2881:1: rule__Coordinates__YAssignment_2_1_1 : ( RULE_INT ) ;
    public final void rule__Coordinates__YAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2885:1: ( ( RULE_INT ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2886:1: ( RULE_INT )
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2886:1: ( RULE_INT )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2887:1: RULE_INT
            {
             before(grammarAccess.getCoordinatesAccess().getYINTTerminalRuleCall_2_1_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Coordinates__YAssignment_2_1_15587); 
             after(grammarAccess.getCoordinatesAccess().getYINTTerminalRuleCall_2_1_1_0()); 

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
    // $ANTLR end rule__Coordinates__YAssignment_2_1_1


    // $ANTLR start rule__Program__NameAssignment_1_1
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2897:1: rule__Program__NameAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__Program__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2901:1: ( ( RULE_STRING ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2902:1: ( RULE_STRING )
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2902:1: ( RULE_STRING )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2903:1: RULE_STRING
            {
             before(grammarAccess.getProgramAccess().getNameSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Program__NameAssignment_1_15619); 
             after(grammarAccess.getProgramAccess().getNameSTRINGTerminalRuleCall_1_1_0()); 

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
    // $ANTLR end rule__Program__NameAssignment_1_1


    // $ANTLR start rule__Program__SignalAssignment_2_1
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2912:1: rule__Program__SignalAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__Program__SignalAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2916:1: ( ( RULE_STRING ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2917:1: ( RULE_STRING )
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2917:1: ( RULE_STRING )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2918:1: RULE_STRING
            {
             before(grammarAccess.getProgramAccess().getSignalSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Program__SignalAssignment_2_15650); 
             after(grammarAccess.getProgramAccess().getSignalSTRINGTerminalRuleCall_2_1_0()); 

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
    // $ANTLR end rule__Program__SignalAssignment_2_1


    // $ANTLR start rule__Program__SourceAssignment_3_1
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2927:1: rule__Program__SourceAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__Program__SourceAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2931:1: ( ( RULE_STRING ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2932:1: ( RULE_STRING )
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2932:1: ( RULE_STRING )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2933:1: RULE_STRING
            {
             before(grammarAccess.getProgramAccess().getSourceSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Program__SourceAssignment_3_15681); 
             after(grammarAccess.getProgramAccess().getSourceSTRINGTerminalRuleCall_3_1_0()); 

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
    // $ANTLR end rule__Program__SourceAssignment_3_1


    // $ANTLR start rule__Program__ActionAssignment_4_1
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2942:1: rule__Program__ActionAssignment_4_1 : ( ruleAction ) ;
    public final void rule__Program__ActionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2946:1: ( ( ruleAction ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2947:1: ( ruleAction )
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2947:1: ( ruleAction )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2948:1: ruleAction
            {
             before(grammarAccess.getProgramAccess().getActionActionParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleAction_in_rule__Program__ActionAssignment_4_15712);
            ruleAction();
            _fsp--;

             after(grammarAccess.getProgramAccess().getActionActionParserRuleCall_4_1_0()); 

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
    // $ANTLR end rule__Program__ActionAssignment_4_1


    // $ANTLR start rule__Program__Lua_scriptAssignment_5
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2957:1: rule__Program__Lua_scriptAssignment_5 : ( ruleLUA_Script ) ;
    public final void rule__Program__Lua_scriptAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2961:1: ( ( ruleLUA_Script ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2962:1: ( ruleLUA_Script )
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2962:1: ( ruleLUA_Script )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2963:1: ruleLUA_Script
            {
             before(grammarAccess.getProgramAccess().getLua_scriptLUA_ScriptParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleLUA_Script_in_rule__Program__Lua_scriptAssignment_55743);
            ruleLUA_Script();
            _fsp--;

             after(grammarAccess.getProgramAccess().getLua_scriptLUA_ScriptParserRuleCall_5_0()); 

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
    // $ANTLR end rule__Program__Lua_scriptAssignment_5


    // $ANTLR start rule__Action__NameAssignment_0
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2972:1: rule__Action__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Action__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2976:1: ( ( RULE_ID ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2977:1: ( RULE_ID )
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2977:1: ( RULE_ID )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2978:1: RULE_ID
            {
             before(grammarAccess.getActionAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Action__NameAssignment_05774); 
             after(grammarAccess.getActionAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end rule__Action__NameAssignment_0


    // $ANTLR start rule__Action__ParamsAssignment_1
    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2987:1: rule__Action__ParamsAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Action__ParamsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2991:1: ( ( RULE_STRING ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2992:1: ( RULE_STRING )
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2992:1: ( RULE_STRING )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:2993:1: RULE_STRING
            {
             before(grammarAccess.getActionAccess().getParamsSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Action__ParamsAssignment_15805); 
             after(grammarAccess.getActionAccess().getParamsSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end rule__Action__ParamsAssignment_1


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel60 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel67 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInclude_in_entryRuleInclude120 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInclude127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleInclude155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLUA_Script_in_entryRuleLUA_Script184 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLUA_Script191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LUA_Script__Group__0_in_ruleLUA_Script218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollections_in_entryRuleCollections244 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollections251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Collections__Group__0_in_ruleCollections278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroup_in_entryRuleGroup304 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGroup311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__Group__0_in_ruleGroup338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePart_in_entryRulePart364 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePart371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Part__Group__0_in_rulePart398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDescription_in_entryRuleDescription424 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDescription431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Description__Group__0_in_ruleDescription458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCoordinates_in_entryRuleCoordinates484 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCoordinates491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Coordinates__Group__0_in_ruleCoordinates518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProgram_in_entryRuleProgram546 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProgram553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__0_in_ruleProgram580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_entryRuleAction606 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAction613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group__0_in_ruleAction640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__IncludesAssignment_0_in_rule__Model__Group__0678 = new BitSet(new long[]{0x0000000000004802L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__CollectionsAssignment_1_in_rule__Model__Group__1716 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_12_in_rule__LUA_Script__Group__0756 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__LUA_Script__Group__1_in_rule__LUA_Script__Group__0766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LUA_Script__ContentAssignment_1_in_rule__LUA_Script__Group__1794 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__LUA_Script__Group__2_in_rule__LUA_Script__Group__1803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__LUA_Script__Group__2832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Collections__Group__0874 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_rule__Collections__Group__1_in_rule__Collections__Group__0884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Collections__GroupsAssignment_1_in_rule__Collections__Group__1912 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_rule__Collections__Group__2_in_rule__Collections__Group__1922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Collections__Group__2951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Group__Group__0993 = new BitSet(new long[]{0x00000000001D3000L});
    public static final BitSet FOLLOW_rule__Group__Group__1_in_rule__Group__Group__01003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__Group_1__0_in_rule__Group__Group__11031 = new BitSet(new long[]{0x00000000001C3000L});
    public static final BitSet FOLLOW_rule__Group__Group__2_in_rule__Group__Group__11041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__Group_2__0_in_rule__Group__Group__21069 = new BitSet(new long[]{0x0000000000183000L});
    public static final BitSet FOLLOW_rule__Group__Group__3_in_rule__Group__Group__21079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__Group_3__0_in_rule__Group__Group__31107 = new BitSet(new long[]{0x0000000000183000L});
    public static final BitSet FOLLOW_rule__Group__Group__4_in_rule__Group__Group__31117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__Group_4__0_in_rule__Group__Group__41145 = new BitSet(new long[]{0x0000000000103000L});
    public static final BitSet FOLLOW_rule__Group__Group__5_in_rule__Group__Group__41155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__Lua_scriptAssignment_5_in_rule__Group__Group__51183 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Group__Group__6_in_rule__Group__Group__51193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Group__Group__61222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Group__Group_1__01272 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Group__Group_1__1_in_rule__Group__Group_1__01282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__NameAssignment_1_1_in_rule__Group__Group_1__11310 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Group__Group_1__2_in_rule__Group__Group_1__11319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Group__Group_1__21348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Group__Group_2__01390 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Group__Group_2__1_in_rule__Group__Group_2__01400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__Group_2_1__0_in_rule__Group__Group_2__11428 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Group__Group_2__2_in_rule__Group__Group_2__11437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Group__Group_2__21466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__MinxAssignment_2_1_0_in_rule__Group__Group_2_1__01507 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Group__Group_2_1__1_in_rule__Group__Group_2_1__01516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__MinyAssignment_2_1_1_in_rule__Group__Group_2_1__11544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Group__Group_3__01583 = new BitSet(new long[]{0x0000000000202000L});
    public static final BitSet FOLLOW_rule__Group__Group_3__1_in_rule__Group__Group_3__01593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__PartAssignment_3_1_in_rule__Group__Group_3__11621 = new BitSet(new long[]{0x0000000000202000L});
    public static final BitSet FOLLOW_rule__Group__Group_3__2_in_rule__Group__Group_3__11631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Group__Group_3__21660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Group__Group_4__01702 = new BitSet(new long[]{0x0000000040002000L});
    public static final BitSet FOLLOW_rule__Group__Group_4__1_in_rule__Group__Group_4__01712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__ProgramAssignment_4_1_in_rule__Group__Group_4__11740 = new BitSet(new long[]{0x0000000040002000L});
    public static final BitSet FOLLOW_rule__Group__Group_4__2_in_rule__Group__Group_4__11750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Group__Group_4__21779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Part__Group__01821 = new BitSet(new long[]{0x0000000000C52000L});
    public static final BitSet FOLLOW_rule__Part__Group__1_in_rule__Part__Group__01831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Part__Group_1__0_in_rule__Part__Group__11859 = new BitSet(new long[]{0x0000000000C42000L});
    public static final BitSet FOLLOW_rule__Part__Group__2_in_rule__Part__Group__11869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Part__Group_2__0_in_rule__Part__Group__21897 = new BitSet(new long[]{0x0000000000C02000L});
    public static final BitSet FOLLOW_rule__Part__Group__3_in_rule__Part__Group__21907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Part__Group_3__0_in_rule__Part__Group__31935 = new BitSet(new long[]{0x0000000000802000L});
    public static final BitSet FOLLOW_rule__Part__Group__4_in_rule__Part__Group__31945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Part__DescriptionsAssignment_4_in_rule__Part__Group__41973 = new BitSet(new long[]{0x0000000000802000L});
    public static final BitSet FOLLOW_rule__Part__Group__5_in_rule__Part__Group__41983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Part__Group__52012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Part__Group_1__02060 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Part__Group_1__1_in_rule__Part__Group_1__02070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Part__NameAssignment_1_1_in_rule__Part__Group_1__12098 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Part__Group_1__2_in_rule__Part__Group_1__12107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Part__Group_1__22136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Part__Group_2__02178 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Part__Group_2__1_in_rule__Part__Group_2__02188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Part__Group_2_1__0_in_rule__Part__Group_2__12216 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Part__Group_2__2_in_rule__Part__Group_2__12225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Part__Group_2__22254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Part__MinxAssignment_2_1_0_in_rule__Part__Group_2_1__02295 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Part__Group_2_1__1_in_rule__Part__Group_2_1__02304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Part__MinyAssignment_2_1_1_in_rule__Part__Group_2_1__12332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Part__Group_3__02371 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Part__Group_3__1_in_rule__Part__Group_3__02381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Part__TypeAssignment_3_1_in_rule__Part__Group_3__12409 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Part__Group_3__2_in_rule__Part__Group_3__12418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Part__Group_3__22447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Description__Group__02489 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Description__Group__1_in_rule__Description__Group__02499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Description__Group__12528 = new BitSet(new long[]{0x0000000038002000L});
    public static final BitSet FOLLOW_rule__Description__Group__2_in_rule__Description__Group__12538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Description__CoordinatesAssignment_2_in_rule__Description__Group__22566 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Description__Group__3_in_rule__Description__Group__22575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Description__Group__32604 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Description__Group__4_in_rule__Description__Group__32614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Description__Group__42643 = new BitSet(new long[]{0x0000000038002000L});
    public static final BitSet FOLLOW_rule__Description__Group__5_in_rule__Description__Group__42653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Description__CoordinatesAssignment_5_in_rule__Description__Group__52681 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Description__Group__6_in_rule__Description__Group__52690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Description__Group__62719 = new BitSet(new long[]{0x0000000004002000L});
    public static final BitSet FOLLOW_rule__Description__Group__7_in_rule__Description__Group__62729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Description__Group_7__0_in_rule__Description__Group__72757 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Description__Group__8_in_rule__Description__Group__72767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Description__Group__82796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Description__Group_7__02850 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Description__Group_7__1_in_rule__Description__Group_7__02860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Description__Group_7_1__0_in_rule__Description__Group_7__12888 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Description__Group_7__2_in_rule__Description__Group_7__12897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Description__Group_7__22926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Description__RedAssignment_7_1_0_in_rule__Description__Group_7_1__02967 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Description__Group_7_1__1_in_rule__Description__Group_7_1__02976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Description__GreenAssignment_7_1_1_in_rule__Description__Group_7_1__13004 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Description__Group_7_1__2_in_rule__Description__Group_7_1__13013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Description__BlueAssignment_7_1_2_in_rule__Description__Group_7_1__23041 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Description__Group_7_1__3_in_rule__Description__Group_7_1__23050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Description__AlphaAssignment_7_1_3_in_rule__Description__Group_7_1__33078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Coordinates__Group_0__0_in_rule__Coordinates__Group__03120 = new BitSet(new long[]{0x0000000030000002L});
    public static final BitSet FOLLOW_rule__Coordinates__Group__1_in_rule__Coordinates__Group__03130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Coordinates__Group_1__0_in_rule__Coordinates__Group__13158 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__Coordinates__Group__2_in_rule__Coordinates__Group__13168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Coordinates__Group_2__0_in_rule__Coordinates__Group__23196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Coordinates__Group_0__03238 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Coordinates__Group_0__1_in_rule__Coordinates__Group_0__03248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Coordinates__Group_0_1__0_in_rule__Coordinates__Group_0__13276 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Coordinates__Group_0__2_in_rule__Coordinates__Group_0__13285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Coordinates__Group_0__23314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Coordinates__XAssignment_0_1_0_in_rule__Coordinates__Group_0_1__03355 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Coordinates__Group_0_1__1_in_rule__Coordinates__Group_0_1__03364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Coordinates__YAssignment_0_1_1_in_rule__Coordinates__Group_0_1__13392 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Coordinates__Group_0_1__2_in_rule__Coordinates__Group_0_1__13401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Coordinates__WidthAssignment_0_1_2_in_rule__Coordinates__Group_0_1__23429 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Coordinates__Group_0_1__3_in_rule__Coordinates__Group_0_1__23438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Coordinates__HeightAssignment_0_1_3_in_rule__Coordinates__Group_0_1__33466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Coordinates__Group_1__03509 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Coordinates__Group_1__1_in_rule__Coordinates__Group_1__03519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Coordinates__Group_1_1__0_in_rule__Coordinates__Group_1__13547 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Coordinates__Group_1__2_in_rule__Coordinates__Group_1__13556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Coordinates__Group_1__23585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Coordinates__XAssignment_1_1_0_in_rule__Coordinates__Group_1_1__03626 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Coordinates__Group_1_1__1_in_rule__Coordinates__Group_1_1__03635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Coordinates__YAssignment_1_1_1_in_rule__Coordinates__Group_1_1__13663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Coordinates__Group_2__03702 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Coordinates__Group_2__1_in_rule__Coordinates__Group_2__03712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Coordinates__Group_2_1__0_in_rule__Coordinates__Group_2__13740 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Coordinates__Group_2__2_in_rule__Coordinates__Group_2__13749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Coordinates__Group_2__23778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Coordinates__XAssignment_2_1_0_in_rule__Coordinates__Group_2_1__03819 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Coordinates__Group_2_1__1_in_rule__Coordinates__Group_2_1__03828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Coordinates__YAssignment_2_1_1_in_rule__Coordinates__Group_2_1__13856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Program__Group__03896 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Program__Group__1_in_rule__Program__Group__03906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_1__0_in_rule__Program__Group__13934 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Program__Group__2_in_rule__Program__Group__13943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_2__0_in_rule__Program__Group__23971 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Program__Group__3_in_rule__Program__Group__23980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_3__0_in_rule__Program__Group__34008 = new BitSet(new long[]{0x0000000200003000L});
    public static final BitSet FOLLOW_rule__Program__Group__4_in_rule__Program__Group__34017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_4__0_in_rule__Program__Group__44045 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_rule__Program__Group__5_in_rule__Program__Group__44055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Lua_scriptAssignment_5_in_rule__Program__Group__54083 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Program__Group__6_in_rule__Program__Group__54093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Program__Group__64122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Program__Group_1__04172 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Program__Group_1__1_in_rule__Program__Group_1__04182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__NameAssignment_1_1_in_rule__Program__Group_1__14210 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Program__Group_1__2_in_rule__Program__Group_1__14219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Program__Group_1__24248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Program__Group_2__04290 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Program__Group_2__1_in_rule__Program__Group_2__04300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__SignalAssignment_2_1_in_rule__Program__Group_2__14328 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Program__Group_2__2_in_rule__Program__Group_2__14337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Program__Group_2__24366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Program__Group_3__04408 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Program__Group_3__1_in_rule__Program__Group_3__04418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__SourceAssignment_3_1_in_rule__Program__Group_3__14446 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Program__Group_3__2_in_rule__Program__Group_3__14455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Program__Group_3__24484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Program__Group_4__04526 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Program__Group_4__1_in_rule__Program__Group_4__04536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__ActionAssignment_4_1_in_rule__Program__Group_4__14564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__NameAssignment_0_in_rule__Action__Group__04602 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_rule__Action__Group__1_in_rule__Action__Group__04611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__ParamsAssignment_1_in_rule__Action__Group__14639 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_rule__Action__Group__2_in_rule__Action__Group__14649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Action__Group__24678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInclude_in_rule__Model__IncludesAssignment_04719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollections_in_rule__Model__CollectionsAssignment_14750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__LUA_Script__ContentAssignment_14781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroup_in_rule__Collections__GroupsAssignment_14812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Group__NameAssignment_1_14843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Group__MinxAssignment_2_1_04874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Group__MinyAssignment_2_1_14905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePart_in_rule__Group__PartAssignment_3_14936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProgram_in_rule__Group__ProgramAssignment_4_14967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLUA_Script_in_rule__Group__Lua_scriptAssignment_54998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Part__NameAssignment_1_15029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Part__MinxAssignment_2_1_05060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Part__MinyAssignment_2_1_15091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Part__TypeAssignment_3_15122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDescription_in_rule__Part__DescriptionsAssignment_45153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCoordinates_in_rule__Description__CoordinatesAssignment_25184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCoordinates_in_rule__Description__CoordinatesAssignment_55215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Description__RedAssignment_7_1_05246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Description__GreenAssignment_7_1_15277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Description__BlueAssignment_7_1_25308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Description__AlphaAssignment_7_1_35339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Coordinates__XAssignment_0_1_05370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Coordinates__YAssignment_0_1_15401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Coordinates__WidthAssignment_0_1_25432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Coordinates__HeightAssignment_0_1_35463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Coordinates__XAssignment_1_1_05494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Coordinates__YAssignment_1_1_15525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Coordinates__XAssignment_2_1_05556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Coordinates__YAssignment_2_1_15587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Program__NameAssignment_1_15619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Program__SignalAssignment_2_15650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Program__SourceAssignment_3_15681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_rule__Program__ActionAssignment_4_15712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLUA_Script_in_rule__Program__Lua_scriptAssignment_55743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Action__NameAssignment_05774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Action__ParamsAssignment_15805 = new BitSet(new long[]{0x0000000000000002L});

}