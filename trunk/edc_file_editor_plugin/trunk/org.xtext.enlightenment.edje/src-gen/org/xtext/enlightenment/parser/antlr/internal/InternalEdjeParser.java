package org.xtext.enlightenment.parser.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.xtext.enlightenment.services.EdjeGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalEdjeParser extends AbstractInternalAntlrParser {
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
    public String getGrammarFileName() { return "../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g"; }


     
     	private EdjeGrammarAccess grammarAccess;
     	
        public InternalEdjeParser(TokenStream input, IAstFactory factory, EdjeGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("org/xtext/enlightenment/parser/antlr/internal/InternalEdje.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	} 



    // $ANTLR start entryRuleModel
    // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:72:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:72:47: (iv_ruleModel= ruleModel EOF )
            // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:73:2: iv_ruleModel= ruleModel EOF
            {
             currentNode = createCompositeNode(grammarAccess.getModelRule(), currentNode); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel73);
            iv_ruleModel=ruleModel();
            _fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel83); 

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
    // $ANTLR end entryRuleModel


    // $ANTLR start ruleModel
    // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:80:1: ruleModel returns [EObject current=null] : ( (lv_includes_0= ruleInclude )* (lv_collections_1= ruleCollections )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_includes_0 = null;

        EObject lv_collections_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:85:6: ( ( (lv_includes_0= ruleInclude )* (lv_collections_1= ruleCollections )* ) )
            // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:86:1: ( (lv_includes_0= ruleInclude )* (lv_collections_1= ruleCollections )* )
            {
            // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:86:1: ( (lv_includes_0= ruleInclude )* (lv_collections_1= ruleCollections )* )
            // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:86:2: (lv_includes_0= ruleInclude )* (lv_collections_1= ruleCollections )*
            {
            // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:86:2: (lv_includes_0= ruleInclude )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:89:6: lv_includes_0= ruleInclude
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getIncludesIncludeParserRuleCall_0_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleInclude_in_ruleModel142);
            	    lv_includes_0=ruleInclude();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "includes", lv_includes_0, "Include", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:107:3: (lv_collections_1= ruleCollections )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:110:6: lv_collections_1= ruleCollections
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getCollectionsCollectionsParserRuleCall_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleCollections_in_ruleModel181);
            	    lv_collections_1=ruleCollections();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "collections", lv_collections_1, "Collections", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleModel


    // $ANTLR start entryRuleInclude
    // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:135:1: entryRuleInclude returns [String current=null] : iv_ruleInclude= ruleInclude EOF ;
    public final String entryRuleInclude() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInclude = null;


        try {
            // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:135:48: (iv_ruleInclude= ruleInclude EOF )
            // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:136:2: iv_ruleInclude= ruleInclude EOF
            {
             currentNode = createCompositeNode(grammarAccess.getIncludeRule(), currentNode); 
            pushFollow(FOLLOW_ruleInclude_in_entryRuleInclude220);
            iv_ruleInclude=ruleInclude();
            _fsp--;

             current =iv_ruleInclude.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInclude231); 

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
    // $ANTLR end entryRuleInclude


    // $ANTLR start ruleInclude
    // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:143:1: ruleInclude returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '#include' ;
    public final AntlrDatatypeRuleToken ruleInclude() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:149:6: (kw= '#include' )
            // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:151:2: kw= '#include'
            {
            kw=(Token)input.LT(1);
            match(input,11,FOLLOW_11_in_ruleInclude268); 

                    current.merge(kw);
                    createLeafNode(grammarAccess.getIncludeAccess().getIncludeKeyword(), null); 
                

            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
            	    lastConsumedDatatypeToken = current;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleInclude


    // $ANTLR start entryRuleLUA_Script
    // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:166:1: entryRuleLUA_Script returns [EObject current=null] : iv_ruleLUA_Script= ruleLUA_Script EOF ;
    public final EObject entryRuleLUA_Script() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLUA_Script = null;


        try {
            // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:166:52: (iv_ruleLUA_Script= ruleLUA_Script EOF )
            // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:167:2: iv_ruleLUA_Script= ruleLUA_Script EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLUA_ScriptRule(), currentNode); 
            pushFollow(FOLLOW_ruleLUA_Script_in_entryRuleLUA_Script307);
            iv_ruleLUA_Script=ruleLUA_Script();
            _fsp--;

             current =iv_ruleLUA_Script; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLUA_Script317); 

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
    // $ANTLR end entryRuleLUA_Script


    // $ANTLR start ruleLUA_Script
    // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:174:1: ruleLUA_Script returns [EObject current=null] : ( 'lua_script {' (lv_content_1= RULE_STRING ) '}' ) ;
    public final EObject ruleLUA_Script() throws RecognitionException {
        EObject current = null;

        Token lv_content_1=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:179:6: ( ( 'lua_script {' (lv_content_1= RULE_STRING ) '}' ) )
            // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:180:1: ( 'lua_script {' (lv_content_1= RULE_STRING ) '}' )
            {
            // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:180:1: ( 'lua_script {' (lv_content_1= RULE_STRING ) '}' )
            // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:180:2: 'lua_script {' (lv_content_1= RULE_STRING ) '}'
            {
            match(input,12,FOLLOW_12_in_ruleLUA_Script351); 

                    createLeafNode(grammarAccess.getLUA_ScriptAccess().getLua_scriptKeyword_0(), null); 
                
            // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:184:1: (lv_content_1= RULE_STRING )
            // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:186:6: lv_content_1= RULE_STRING
            {
            lv_content_1=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLUA_Script373); 

            		createLeafNode(grammarAccess.getLUA_ScriptAccess().getContentSTRINGTerminalRuleCall_1_0(), "content"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getLUA_ScriptRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "content", lv_content_1, "STRING", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            match(input,13,FOLLOW_13_in_ruleLUA_Script390); 

                    createLeafNode(grammarAccess.getLUA_ScriptAccess().getRightCurlyBracketKeyword_2(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleLUA_Script


    // $ANTLR start entryRuleCollections
    // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:215:1: entryRuleCollections returns [EObject current=null] : iv_ruleCollections= ruleCollections EOF ;
    public final EObject entryRuleCollections() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollections = null;


        try {
            // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:215:53: (iv_ruleCollections= ruleCollections EOF )
            // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:216:2: iv_ruleCollections= ruleCollections EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCollectionsRule(), currentNode); 
            pushFollow(FOLLOW_ruleCollections_in_entryRuleCollections423);
            iv_ruleCollections=ruleCollections();
            _fsp--;

             current =iv_ruleCollections; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollections433); 

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
    // $ANTLR end entryRuleCollections


    // $ANTLR start ruleCollections
    // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:223:1: ruleCollections returns [EObject current=null] : ( 'collections {' (lv_groups_1= ruleGroup )* '}' ) ;
    public final EObject ruleCollections() throws RecognitionException {
        EObject current = null;

        EObject lv_groups_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:228:6: ( ( 'collections {' (lv_groups_1= ruleGroup )* '}' ) )
            // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:229:1: ( 'collections {' (lv_groups_1= ruleGroup )* '}' )
            {
            // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:229:1: ( 'collections {' (lv_groups_1= ruleGroup )* '}' )
            // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:229:2: 'collections {' (lv_groups_1= ruleGroup )* '}'
            {
            match(input,14,FOLLOW_14_in_ruleCollections467); 

                    createLeafNode(grammarAccess.getCollectionsAccess().getCollectionsKeyword_0(), null); 
                
            // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:233:1: (lv_groups_1= ruleGroup )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:236:6: lv_groups_1= ruleGroup
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getCollectionsAccess().getGroupsGroupParserRuleCall_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleGroup_in_ruleCollections501);
            	    lv_groups_1=ruleGroup();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getCollectionsRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "groups", lv_groups_1, "Group", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            match(input,13,FOLLOW_13_in_ruleCollections515); 

                    createLeafNode(grammarAccess.getCollectionsAccess().getRightCurlyBracketKeyword_2(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleCollections


    // $ANTLR start entryRuleGroup
    // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:265:1: entryRuleGroup returns [EObject current=null] : iv_ruleGroup= ruleGroup EOF ;
    public final EObject entryRuleGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroup = null;


        try {
            // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:265:47: (iv_ruleGroup= ruleGroup EOF )
            // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:266:2: iv_ruleGroup= ruleGroup EOF
            {
             currentNode = createCompositeNode(grammarAccess.getGroupRule(), currentNode); 
            pushFollow(FOLLOW_ruleGroup_in_entryRuleGroup548);
            iv_ruleGroup=ruleGroup();
            _fsp--;

             current =iv_ruleGroup; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGroup558); 

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
    // $ANTLR end entryRuleGroup


    // $ANTLR start ruleGroup
    // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:273:1: ruleGroup returns [EObject current=null] : ( 'group {' ( 'name:' (lv_name_2= RULE_STRING ) ';' )? ( 'min:' ( (lv_minx_5= RULE_INT ) (lv_miny_6= RULE_INT ) ) ';' )? ( 'parts {' (lv_part_9= rulePart )* '}' )* ( 'programs {' (lv_program_12= ruleProgram )* '}' )* (lv_lua_script_14= ruleLUA_Script )? '}' ) ;
    public final EObject ruleGroup() throws RecognitionException {
        EObject current = null;

        Token lv_name_2=null;
        Token lv_minx_5=null;
        Token lv_miny_6=null;
        EObject lv_part_9 = null;

        EObject lv_program_12 = null;

        EObject lv_lua_script_14 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:278:6: ( ( 'group {' ( 'name:' (lv_name_2= RULE_STRING ) ';' )? ( 'min:' ( (lv_minx_5= RULE_INT ) (lv_miny_6= RULE_INT ) ) ';' )? ( 'parts {' (lv_part_9= rulePart )* '}' )* ( 'programs {' (lv_program_12= ruleProgram )* '}' )* (lv_lua_script_14= ruleLUA_Script )? '}' ) )
            // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:279:1: ( 'group {' ( 'name:' (lv_name_2= RULE_STRING ) ';' )? ( 'min:' ( (lv_minx_5= RULE_INT ) (lv_miny_6= RULE_INT ) ) ';' )? ( 'parts {' (lv_part_9= rulePart )* '}' )* ( 'programs {' (lv_program_12= ruleProgram )* '}' )* (lv_lua_script_14= ruleLUA_Script )? '}' )
            {
            // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:279:1: ( 'group {' ( 'name:' (lv_name_2= RULE_STRING ) ';' )? ( 'min:' ( (lv_minx_5= RULE_INT ) (lv_miny_6= RULE_INT ) ) ';' )? ( 'parts {' (lv_part_9= rulePart )* '}' )* ( 'programs {' (lv_program_12= ruleProgram )* '}' )* (lv_lua_script_14= ruleLUA_Script )? '}' )
            // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:279:2: 'group {' ( 'name:' (lv_name_2= RULE_STRING ) ';' )? ( 'min:' ( (lv_minx_5= RULE_INT ) (lv_miny_6= RULE_INT ) ) ';' )? ( 'parts {' (lv_part_9= rulePart )* '}' )* ( 'programs {' (lv_program_12= ruleProgram )* '}' )* (lv_lua_script_14= ruleLUA_Script )? '}'
            {
            match(input,15,FOLLOW_15_in_ruleGroup592); 

                    createLeafNode(grammarAccess.getGroupAccess().getGroupKeyword_0(), null); 
                
            // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:283:1: ( 'name:' (lv_name_2= RULE_STRING ) ';' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:283:2: 'name:' (lv_name_2= RULE_STRING ) ';'
                    {
                    match(input,16,FOLLOW_16_in_ruleGroup602); 

                            createLeafNode(grammarAccess.getGroupAccess().getNameKeyword_1_0(), null); 
                        
                    // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:287:1: (lv_name_2= RULE_STRING )
                    // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:289:6: lv_name_2= RULE_STRING
                    {
                    lv_name_2=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGroup624); 

                    		createLeafNode(grammarAccess.getGroupAccess().getNameSTRINGTerminalRuleCall_1_1_0(), "name"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getGroupRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "name", lv_name_2, "STRING", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }

                    match(input,17,FOLLOW_17_in_ruleGroup641); 

                            createLeafNode(grammarAccess.getGroupAccess().getSemicolonKeyword_1_2(), null); 
                        

                    }
                    break;

            }

            // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:311:3: ( 'min:' ( (lv_minx_5= RULE_INT ) (lv_miny_6= RULE_INT ) ) ';' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:311:4: 'min:' ( (lv_minx_5= RULE_INT ) (lv_miny_6= RULE_INT ) ) ';'
                    {
                    match(input,18,FOLLOW_18_in_ruleGroup653); 

                            createLeafNode(grammarAccess.getGroupAccess().getMinKeyword_2_0(), null); 
                        
                    // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:315:1: ( (lv_minx_5= RULE_INT ) (lv_miny_6= RULE_INT ) )
                    // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:315:2: (lv_minx_5= RULE_INT ) (lv_miny_6= RULE_INT )
                    {
                    // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:315:2: (lv_minx_5= RULE_INT )
                    // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:317:6: lv_minx_5= RULE_INT
                    {
                    lv_minx_5=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleGroup676); 

                    		createLeafNode(grammarAccess.getGroupAccess().getMinxINTTerminalRuleCall_2_1_0_0(), "minx"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getGroupRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "minx", lv_minx_5, "INT", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }

                    // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:335:2: (lv_miny_6= RULE_INT )
                    // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:337:6: lv_miny_6= RULE_INT
                    {
                    lv_miny_6=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleGroup706); 

                    		createLeafNode(grammarAccess.getGroupAccess().getMinyINTTerminalRuleCall_2_1_1_0(), "miny"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getGroupRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "miny", lv_miny_6, "INT", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    match(input,17,FOLLOW_17_in_ruleGroup724); 

                            createLeafNode(grammarAccess.getGroupAccess().getSemicolonKeyword_2_2(), null); 
                        

                    }
                    break;

            }

            // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:359:3: ( 'parts {' (lv_part_9= rulePart )* '}' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==19) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:359:4: 'parts {' (lv_part_9= rulePart )* '}'
            	    {
            	    match(input,19,FOLLOW_19_in_ruleGroup736); 

            	            createLeafNode(grammarAccess.getGroupAccess().getPartsKeyword_3_0(), null); 
            	        
            	    // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:363:1: (lv_part_9= rulePart )*
            	    loop6:
            	    do {
            	        int alt6=2;
            	        int LA6_0 = input.LA(1);

            	        if ( (LA6_0==21) ) {
            	            alt6=1;
            	        }


            	        switch (alt6) {
            	    	case 1 :
            	    	    // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:366:6: lv_part_9= rulePart
            	    	    {
            	    	     
            	    	    	        currentNode=createCompositeNode(grammarAccess.getGroupAccess().getPartPartParserRuleCall_3_1_0(), currentNode); 
            	    	    	    
            	    	    pushFollow(FOLLOW_rulePart_in_ruleGroup770);
            	    	    lv_part_9=rulePart();
            	    	    _fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = factory.create(grammarAccess.getGroupRule().getType().getClassifier());
            	    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	    	        }
            	    	    	        
            	    	    	        try {
            	    	    	       		add(current, "part", lv_part_9, "Part", currentNode);
            	    	    	        } catch (ValueConverterException vce) {
            	    	    				handleValueConverterException(vce);
            	    	    	        }
            	    	    	        currentNode = currentNode.getParent();
            	    	    	    

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop6;
            	        }
            	    } while (true);

            	    match(input,13,FOLLOW_13_in_ruleGroup784); 

            	            createLeafNode(grammarAccess.getGroupAccess().getRightCurlyBracketKeyword_3_2(), null); 
            	        

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:388:3: ( 'programs {' (lv_program_12= ruleProgram )* '}' )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==20) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:388:4: 'programs {' (lv_program_12= ruleProgram )* '}'
            	    {
            	    match(input,20,FOLLOW_20_in_ruleGroup796); 

            	            createLeafNode(grammarAccess.getGroupAccess().getProgramsKeyword_4_0(), null); 
            	        
            	    // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:392:1: (lv_program_12= ruleProgram )*
            	    loop8:
            	    do {
            	        int alt8=2;
            	        int LA8_0 = input.LA(1);

            	        if ( (LA8_0==30) ) {
            	            alt8=1;
            	        }


            	        switch (alt8) {
            	    	case 1 :
            	    	    // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:395:6: lv_program_12= ruleProgram
            	    	    {
            	    	     
            	    	    	        currentNode=createCompositeNode(grammarAccess.getGroupAccess().getProgramProgramParserRuleCall_4_1_0(), currentNode); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleProgram_in_ruleGroup830);
            	    	    lv_program_12=ruleProgram();
            	    	    _fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = factory.create(grammarAccess.getGroupRule().getType().getClassifier());
            	    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	    	        }
            	    	    	        
            	    	    	        try {
            	    	    	       		add(current, "program", lv_program_12, "Program", currentNode);
            	    	    	        } catch (ValueConverterException vce) {
            	    	    				handleValueConverterException(vce);
            	    	    	        }
            	    	    	        currentNode = currentNode.getParent();
            	    	    	    

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop8;
            	        }
            	    } while (true);

            	    match(input,13,FOLLOW_13_in_ruleGroup844); 

            	            createLeafNode(grammarAccess.getGroupAccess().getRightCurlyBracketKeyword_4_2(), null); 
            	        

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:417:3: (lv_lua_script_14= ruleLUA_Script )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==12) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:420:6: lv_lua_script_14= ruleLUA_Script
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getGroupAccess().getLua_scriptLUA_ScriptParserRuleCall_5_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleLUA_Script_in_ruleGroup880);
                    lv_lua_script_14=ruleLUA_Script();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getGroupRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "lua_script", lv_lua_script_14, "LUA_Script", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }
                    break;

            }

            match(input,13,FOLLOW_13_in_ruleGroup894); 

                    createLeafNode(grammarAccess.getGroupAccess().getRightCurlyBracketKeyword_6(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleGroup


    // $ANTLR start entryRulePart
    // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:449:1: entryRulePart returns [EObject current=null] : iv_rulePart= rulePart EOF ;
    public final EObject entryRulePart() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePart = null;


        try {
            // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:449:46: (iv_rulePart= rulePart EOF )
            // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:450:2: iv_rulePart= rulePart EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPartRule(), currentNode); 
            pushFollow(FOLLOW_rulePart_in_entryRulePart927);
            iv_rulePart=rulePart();
            _fsp--;

             current =iv_rulePart; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePart937); 

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
    // $ANTLR end entryRulePart


    // $ANTLR start rulePart
    // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:457:1: rulePart returns [EObject current=null] : ( 'part {' ( 'name:' (lv_name_2= RULE_STRING ) ';' )? ( 'min:' ( (lv_minx_5= RULE_INT ) (lv_miny_6= RULE_INT ) ) ';' )? ( 'type:' (lv_type_9= RULE_ID ) ';' )? (lv_descriptions_11= ruleDescription )* '}' ) ;
    public final EObject rulePart() throws RecognitionException {
        EObject current = null;

        Token lv_name_2=null;
        Token lv_minx_5=null;
        Token lv_miny_6=null;
        Token lv_type_9=null;
        EObject lv_descriptions_11 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:462:6: ( ( 'part {' ( 'name:' (lv_name_2= RULE_STRING ) ';' )? ( 'min:' ( (lv_minx_5= RULE_INT ) (lv_miny_6= RULE_INT ) ) ';' )? ( 'type:' (lv_type_9= RULE_ID ) ';' )? (lv_descriptions_11= ruleDescription )* '}' ) )
            // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:463:1: ( 'part {' ( 'name:' (lv_name_2= RULE_STRING ) ';' )? ( 'min:' ( (lv_minx_5= RULE_INT ) (lv_miny_6= RULE_INT ) ) ';' )? ( 'type:' (lv_type_9= RULE_ID ) ';' )? (lv_descriptions_11= ruleDescription )* '}' )
            {
            // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:463:1: ( 'part {' ( 'name:' (lv_name_2= RULE_STRING ) ';' )? ( 'min:' ( (lv_minx_5= RULE_INT ) (lv_miny_6= RULE_INT ) ) ';' )? ( 'type:' (lv_type_9= RULE_ID ) ';' )? (lv_descriptions_11= ruleDescription )* '}' )
            // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:463:2: 'part {' ( 'name:' (lv_name_2= RULE_STRING ) ';' )? ( 'min:' ( (lv_minx_5= RULE_INT ) (lv_miny_6= RULE_INT ) ) ';' )? ( 'type:' (lv_type_9= RULE_ID ) ';' )? (lv_descriptions_11= ruleDescription )* '}'
            {
            match(input,21,FOLLOW_21_in_rulePart971); 

                    createLeafNode(grammarAccess.getPartAccess().getPartKeyword_0(), null); 
                
            // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:467:1: ( 'name:' (lv_name_2= RULE_STRING ) ';' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==16) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:467:2: 'name:' (lv_name_2= RULE_STRING ) ';'
                    {
                    match(input,16,FOLLOW_16_in_rulePart981); 

                            createLeafNode(grammarAccess.getPartAccess().getNameKeyword_1_0(), null); 
                        
                    // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:471:1: (lv_name_2= RULE_STRING )
                    // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:473:6: lv_name_2= RULE_STRING
                    {
                    lv_name_2=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePart1003); 

                    		createLeafNode(grammarAccess.getPartAccess().getNameSTRINGTerminalRuleCall_1_1_0(), "name"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getPartRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "name", lv_name_2, "STRING", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }

                    match(input,17,FOLLOW_17_in_rulePart1020); 

                            createLeafNode(grammarAccess.getPartAccess().getSemicolonKeyword_1_2(), null); 
                        

                    }
                    break;

            }

            // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:495:3: ( 'min:' ( (lv_minx_5= RULE_INT ) (lv_miny_6= RULE_INT ) ) ';' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==18) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:495:4: 'min:' ( (lv_minx_5= RULE_INT ) (lv_miny_6= RULE_INT ) ) ';'
                    {
                    match(input,18,FOLLOW_18_in_rulePart1032); 

                            createLeafNode(grammarAccess.getPartAccess().getMinKeyword_2_0(), null); 
                        
                    // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:499:1: ( (lv_minx_5= RULE_INT ) (lv_miny_6= RULE_INT ) )
                    // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:499:2: (lv_minx_5= RULE_INT ) (lv_miny_6= RULE_INT )
                    {
                    // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:499:2: (lv_minx_5= RULE_INT )
                    // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:501:6: lv_minx_5= RULE_INT
                    {
                    lv_minx_5=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_rulePart1055); 

                    		createLeafNode(grammarAccess.getPartAccess().getMinxINTTerminalRuleCall_2_1_0_0(), "minx"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getPartRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "minx", lv_minx_5, "INT", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }

                    // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:519:2: (lv_miny_6= RULE_INT )
                    // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:521:6: lv_miny_6= RULE_INT
                    {
                    lv_miny_6=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_rulePart1085); 

                    		createLeafNode(grammarAccess.getPartAccess().getMinyINTTerminalRuleCall_2_1_1_0(), "miny"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getPartRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "miny", lv_miny_6, "INT", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    match(input,17,FOLLOW_17_in_rulePart1103); 

                            createLeafNode(grammarAccess.getPartAccess().getSemicolonKeyword_2_2(), null); 
                        

                    }
                    break;

            }

            // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:543:3: ( 'type:' (lv_type_9= RULE_ID ) ';' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==22) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:543:4: 'type:' (lv_type_9= RULE_ID ) ';'
                    {
                    match(input,22,FOLLOW_22_in_rulePart1115); 

                            createLeafNode(grammarAccess.getPartAccess().getTypeKeyword_3_0(), null); 
                        
                    // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:547:1: (lv_type_9= RULE_ID )
                    // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:549:6: lv_type_9= RULE_ID
                    {
                    lv_type_9=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePart1137); 

                    		createLeafNode(grammarAccess.getPartAccess().getTypeIDTerminalRuleCall_3_1_0(), "type"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getPartRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "type", lv_type_9, "ID", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }

                    match(input,17,FOLLOW_17_in_rulePart1154); 

                            createLeafNode(grammarAccess.getPartAccess().getSemicolonKeyword_3_2(), null); 
                        

                    }
                    break;

            }

            // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:571:3: (lv_descriptions_11= ruleDescription )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==23) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:574:6: lv_descriptions_11= ruleDescription
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getPartAccess().getDescriptionsDescriptionParserRuleCall_4_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleDescription_in_rulePart1190);
            	    lv_descriptions_11=ruleDescription();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getPartRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "descriptions", lv_descriptions_11, "Description", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            match(input,13,FOLLOW_13_in_rulePart1204); 

                    createLeafNode(grammarAccess.getPartAccess().getRightCurlyBracketKeyword_5(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulePart


    // $ANTLR start entryRuleDescription
    // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:603:1: entryRuleDescription returns [EObject current=null] : iv_ruleDescription= ruleDescription EOF ;
    public final EObject entryRuleDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDescription = null;


        try {
            // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:603:53: (iv_ruleDescription= ruleDescription EOF )
            // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:604:2: iv_ruleDescription= ruleDescription EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDescriptionRule(), currentNode); 
            pushFollow(FOLLOW_ruleDescription_in_entryRuleDescription1237);
            iv_ruleDescription=ruleDescription();
            _fsp--;

             current =iv_ruleDescription; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDescription1247); 

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
    // $ANTLR end entryRuleDescription


    // $ANTLR start ruleDescription
    // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:611:1: ruleDescription returns [EObject current=null] : ( 'description {' 'rel1 {' (lv_coordinates_2= ruleCoordinates ) '}' 'rel2 {' (lv_coordinates_5= ruleCoordinates ) '}' ( 'color:' ( (lv_red_8= RULE_INT ) (lv_green_9= RULE_INT ) (lv_blue_10= RULE_INT ) (lv_alpha_11= RULE_INT ) ) ';' )? '}' ) ;
    public final EObject ruleDescription() throws RecognitionException {
        EObject current = null;

        Token lv_red_8=null;
        Token lv_green_9=null;
        Token lv_blue_10=null;
        Token lv_alpha_11=null;
        EObject lv_coordinates_2 = null;

        EObject lv_coordinates_5 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:616:6: ( ( 'description {' 'rel1 {' (lv_coordinates_2= ruleCoordinates ) '}' 'rel2 {' (lv_coordinates_5= ruleCoordinates ) '}' ( 'color:' ( (lv_red_8= RULE_INT ) (lv_green_9= RULE_INT ) (lv_blue_10= RULE_INT ) (lv_alpha_11= RULE_INT ) ) ';' )? '}' ) )
            // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:617:1: ( 'description {' 'rel1 {' (lv_coordinates_2= ruleCoordinates ) '}' 'rel2 {' (lv_coordinates_5= ruleCoordinates ) '}' ( 'color:' ( (lv_red_8= RULE_INT ) (lv_green_9= RULE_INT ) (lv_blue_10= RULE_INT ) (lv_alpha_11= RULE_INT ) ) ';' )? '}' )
            {
            // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:617:1: ( 'description {' 'rel1 {' (lv_coordinates_2= ruleCoordinates ) '}' 'rel2 {' (lv_coordinates_5= ruleCoordinates ) '}' ( 'color:' ( (lv_red_8= RULE_INT ) (lv_green_9= RULE_INT ) (lv_blue_10= RULE_INT ) (lv_alpha_11= RULE_INT ) ) ';' )? '}' )
            // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:617:2: 'description {' 'rel1 {' (lv_coordinates_2= ruleCoordinates ) '}' 'rel2 {' (lv_coordinates_5= ruleCoordinates ) '}' ( 'color:' ( (lv_red_8= RULE_INT ) (lv_green_9= RULE_INT ) (lv_blue_10= RULE_INT ) (lv_alpha_11= RULE_INT ) ) ';' )? '}'
            {
            match(input,23,FOLLOW_23_in_ruleDescription1281); 

                    createLeafNode(grammarAccess.getDescriptionAccess().getDescriptionKeyword_0(), null); 
                
            match(input,24,FOLLOW_24_in_ruleDescription1290); 

                    createLeafNode(grammarAccess.getDescriptionAccess().getRel1Keyword_1(), null); 
                
            // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:625:1: (lv_coordinates_2= ruleCoordinates )
            // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:628:6: lv_coordinates_2= ruleCoordinates
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getDescriptionAccess().getCoordinatesCoordinatesParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleCoordinates_in_ruleDescription1324);
            lv_coordinates_2=ruleCoordinates();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDescriptionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "coordinates", lv_coordinates_2, "Coordinates", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            match(input,13,FOLLOW_13_in_ruleDescription1337); 

                    createLeafNode(grammarAccess.getDescriptionAccess().getRightCurlyBracketKeyword_3(), null); 
                
            match(input,25,FOLLOW_25_in_ruleDescription1346); 

                    createLeafNode(grammarAccess.getDescriptionAccess().getRel2Keyword_4(), null); 
                
            // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:654:1: (lv_coordinates_5= ruleCoordinates )
            // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:657:6: lv_coordinates_5= ruleCoordinates
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getDescriptionAccess().getCoordinatesCoordinatesParserRuleCall_5_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleCoordinates_in_ruleDescription1380);
            lv_coordinates_5=ruleCoordinates();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDescriptionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "coordinates", lv_coordinates_5, "Coordinates", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            match(input,13,FOLLOW_13_in_ruleDescription1393); 

                    createLeafNode(grammarAccess.getDescriptionAccess().getRightCurlyBracketKeyword_6(), null); 
                
            // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:679:1: ( 'color:' ( (lv_red_8= RULE_INT ) (lv_green_9= RULE_INT ) (lv_blue_10= RULE_INT ) (lv_alpha_11= RULE_INT ) ) ';' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==26) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:679:2: 'color:' ( (lv_red_8= RULE_INT ) (lv_green_9= RULE_INT ) (lv_blue_10= RULE_INT ) (lv_alpha_11= RULE_INT ) ) ';'
                    {
                    match(input,26,FOLLOW_26_in_ruleDescription1403); 

                            createLeafNode(grammarAccess.getDescriptionAccess().getColorKeyword_7_0(), null); 
                        
                    // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:683:1: ( (lv_red_8= RULE_INT ) (lv_green_9= RULE_INT ) (lv_blue_10= RULE_INT ) (lv_alpha_11= RULE_INT ) )
                    // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:683:2: (lv_red_8= RULE_INT ) (lv_green_9= RULE_INT ) (lv_blue_10= RULE_INT ) (lv_alpha_11= RULE_INT )
                    {
                    // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:683:2: (lv_red_8= RULE_INT )
                    // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:685:6: lv_red_8= RULE_INT
                    {
                    lv_red_8=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDescription1426); 

                    		createLeafNode(grammarAccess.getDescriptionAccess().getRedINTTerminalRuleCall_7_1_0_0(), "red"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDescriptionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "red", lv_red_8, "INT", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }

                    // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:703:2: (lv_green_9= RULE_INT )
                    // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:705:6: lv_green_9= RULE_INT
                    {
                    lv_green_9=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDescription1456); 

                    		createLeafNode(grammarAccess.getDescriptionAccess().getGreenINTTerminalRuleCall_7_1_1_0(), "green"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDescriptionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "green", lv_green_9, "INT", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }

                    // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:723:2: (lv_blue_10= RULE_INT )
                    // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:725:6: lv_blue_10= RULE_INT
                    {
                    lv_blue_10=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDescription1486); 

                    		createLeafNode(grammarAccess.getDescriptionAccess().getBlueINTTerminalRuleCall_7_1_2_0(), "blue"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDescriptionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "blue", lv_blue_10, "INT", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }

                    // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:743:2: (lv_alpha_11= RULE_INT )
                    // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:745:6: lv_alpha_11= RULE_INT
                    {
                    lv_alpha_11=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDescription1516); 

                    		createLeafNode(grammarAccess.getDescriptionAccess().getAlphaINTTerminalRuleCall_7_1_3_0(), "alpha"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDescriptionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "alpha", lv_alpha_11, "INT", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    match(input,17,FOLLOW_17_in_ruleDescription1534); 

                            createLeafNode(grammarAccess.getDescriptionAccess().getSemicolonKeyword_7_2(), null); 
                        

                    }
                    break;

            }

            match(input,13,FOLLOW_13_in_ruleDescription1545); 

                    createLeafNode(grammarAccess.getDescriptionAccess().getRightCurlyBracketKeyword_8(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleDescription


    // $ANTLR start entryRuleCoordinates
    // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:778:1: entryRuleCoordinates returns [EObject current=null] : iv_ruleCoordinates= ruleCoordinates EOF ;
    public final EObject entryRuleCoordinates() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCoordinates = null;


        try {
            // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:778:53: (iv_ruleCoordinates= ruleCoordinates EOF )
            // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:779:2: iv_ruleCoordinates= ruleCoordinates EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCoordinatesRule(), currentNode); 
            pushFollow(FOLLOW_ruleCoordinates_in_entryRuleCoordinates1578);
            iv_ruleCoordinates=ruleCoordinates();
            _fsp--;

             current =iv_ruleCoordinates; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCoordinates1588); 

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
    // $ANTLR end entryRuleCoordinates


    // $ANTLR start ruleCoordinates
    // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:786:1: ruleCoordinates returns [EObject current=null] : ( ( 'absolute:' ( (lv_x_1= RULE_INT ) (lv_y_2= RULE_INT ) (lv_width_3= RULE_INT ) (lv_height_4= RULE_INT ) ) ';' )? ( 'relative:' ( (lv_x_7= RULE_INT ) (lv_y_8= RULE_INT ) ) ';' )? ( 'offset:' ( (lv_x_11= RULE_INT ) (lv_y_12= RULE_INT ) ) ';' )? ) ;
    public final EObject ruleCoordinates() throws RecognitionException {
        EObject current = null;

        Token lv_x_1=null;
        Token lv_y_2=null;
        Token lv_width_3=null;
        Token lv_height_4=null;
        Token lv_x_7=null;
        Token lv_y_8=null;
        Token lv_x_11=null;
        Token lv_y_12=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:791:6: ( ( ( 'absolute:' ( (lv_x_1= RULE_INT ) (lv_y_2= RULE_INT ) (lv_width_3= RULE_INT ) (lv_height_4= RULE_INT ) ) ';' )? ( 'relative:' ( (lv_x_7= RULE_INT ) (lv_y_8= RULE_INT ) ) ';' )? ( 'offset:' ( (lv_x_11= RULE_INT ) (lv_y_12= RULE_INT ) ) ';' )? ) )
            // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:792:1: ( ( 'absolute:' ( (lv_x_1= RULE_INT ) (lv_y_2= RULE_INT ) (lv_width_3= RULE_INT ) (lv_height_4= RULE_INT ) ) ';' )? ( 'relative:' ( (lv_x_7= RULE_INT ) (lv_y_8= RULE_INT ) ) ';' )? ( 'offset:' ( (lv_x_11= RULE_INT ) (lv_y_12= RULE_INT ) ) ';' )? )
            {
            // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:792:1: ( ( 'absolute:' ( (lv_x_1= RULE_INT ) (lv_y_2= RULE_INT ) (lv_width_3= RULE_INT ) (lv_height_4= RULE_INT ) ) ';' )? ( 'relative:' ( (lv_x_7= RULE_INT ) (lv_y_8= RULE_INT ) ) ';' )? ( 'offset:' ( (lv_x_11= RULE_INT ) (lv_y_12= RULE_INT ) ) ';' )? )
            // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:792:2: ( 'absolute:' ( (lv_x_1= RULE_INT ) (lv_y_2= RULE_INT ) (lv_width_3= RULE_INT ) (lv_height_4= RULE_INT ) ) ';' )? ( 'relative:' ( (lv_x_7= RULE_INT ) (lv_y_8= RULE_INT ) ) ';' )? ( 'offset:' ( (lv_x_11= RULE_INT ) (lv_y_12= RULE_INT ) ) ';' )?
            {
            // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:792:2: ( 'absolute:' ( (lv_x_1= RULE_INT ) (lv_y_2= RULE_INT ) (lv_width_3= RULE_INT ) (lv_height_4= RULE_INT ) ) ';' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==27) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:792:3: 'absolute:' ( (lv_x_1= RULE_INT ) (lv_y_2= RULE_INT ) (lv_width_3= RULE_INT ) (lv_height_4= RULE_INT ) ) ';'
                    {
                    match(input,27,FOLLOW_27_in_ruleCoordinates1623); 

                            createLeafNode(grammarAccess.getCoordinatesAccess().getAbsoluteKeyword_0_0(), null); 
                        
                    // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:796:1: ( (lv_x_1= RULE_INT ) (lv_y_2= RULE_INT ) (lv_width_3= RULE_INT ) (lv_height_4= RULE_INT ) )
                    // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:796:2: (lv_x_1= RULE_INT ) (lv_y_2= RULE_INT ) (lv_width_3= RULE_INT ) (lv_height_4= RULE_INT )
                    {
                    // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:796:2: (lv_x_1= RULE_INT )
                    // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:798:6: lv_x_1= RULE_INT
                    {
                    lv_x_1=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleCoordinates1646); 

                    		createLeafNode(grammarAccess.getCoordinatesAccess().getXINTTerminalRuleCall_0_1_0_0(), "x"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getCoordinatesRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "x", lv_x_1, "INT", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }

                    // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:816:2: (lv_y_2= RULE_INT )
                    // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:818:6: lv_y_2= RULE_INT
                    {
                    lv_y_2=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleCoordinates1676); 

                    		createLeafNode(grammarAccess.getCoordinatesAccess().getYINTTerminalRuleCall_0_1_1_0(), "y"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getCoordinatesRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "y", lv_y_2, "INT", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }

                    // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:836:2: (lv_width_3= RULE_INT )
                    // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:838:6: lv_width_3= RULE_INT
                    {
                    lv_width_3=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleCoordinates1706); 

                    		createLeafNode(grammarAccess.getCoordinatesAccess().getWidthINTTerminalRuleCall_0_1_2_0(), "width"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getCoordinatesRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "width", lv_width_3, "INT", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }

                    // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:856:2: (lv_height_4= RULE_INT )
                    // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:858:6: lv_height_4= RULE_INT
                    {
                    lv_height_4=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleCoordinates1736); 

                    		createLeafNode(grammarAccess.getCoordinatesAccess().getHeightINTTerminalRuleCall_0_1_3_0(), "height"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getCoordinatesRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "height", lv_height_4, "INT", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    match(input,17,FOLLOW_17_in_ruleCoordinates1754); 

                            createLeafNode(grammarAccess.getCoordinatesAccess().getSemicolonKeyword_0_2(), null); 
                        

                    }
                    break;

            }

            // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:880:3: ( 'relative:' ( (lv_x_7= RULE_INT ) (lv_y_8= RULE_INT ) ) ';' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==28) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:880:4: 'relative:' ( (lv_x_7= RULE_INT ) (lv_y_8= RULE_INT ) ) ';'
                    {
                    match(input,28,FOLLOW_28_in_ruleCoordinates1766); 

                            createLeafNode(grammarAccess.getCoordinatesAccess().getRelativeKeyword_1_0(), null); 
                        
                    // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:884:1: ( (lv_x_7= RULE_INT ) (lv_y_8= RULE_INT ) )
                    // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:884:2: (lv_x_7= RULE_INT ) (lv_y_8= RULE_INT )
                    {
                    // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:884:2: (lv_x_7= RULE_INT )
                    // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:886:6: lv_x_7= RULE_INT
                    {
                    lv_x_7=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleCoordinates1789); 

                    		createLeafNode(grammarAccess.getCoordinatesAccess().getXINTTerminalRuleCall_1_1_0_0(), "x"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getCoordinatesRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "x", lv_x_7, "INT", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }

                    // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:904:2: (lv_y_8= RULE_INT )
                    // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:906:6: lv_y_8= RULE_INT
                    {
                    lv_y_8=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleCoordinates1819); 

                    		createLeafNode(grammarAccess.getCoordinatesAccess().getYINTTerminalRuleCall_1_1_1_0(), "y"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getCoordinatesRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "y", lv_y_8, "INT", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    match(input,17,FOLLOW_17_in_ruleCoordinates1837); 

                            createLeafNode(grammarAccess.getCoordinatesAccess().getSemicolonKeyword_1_2(), null); 
                        

                    }
                    break;

            }

            // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:928:3: ( 'offset:' ( (lv_x_11= RULE_INT ) (lv_y_12= RULE_INT ) ) ';' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==29) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:928:4: 'offset:' ( (lv_x_11= RULE_INT ) (lv_y_12= RULE_INT ) ) ';'
                    {
                    match(input,29,FOLLOW_29_in_ruleCoordinates1849); 

                            createLeafNode(grammarAccess.getCoordinatesAccess().getOffsetKeyword_2_0(), null); 
                        
                    // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:932:1: ( (lv_x_11= RULE_INT ) (lv_y_12= RULE_INT ) )
                    // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:932:2: (lv_x_11= RULE_INT ) (lv_y_12= RULE_INT )
                    {
                    // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:932:2: (lv_x_11= RULE_INT )
                    // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:934:6: lv_x_11= RULE_INT
                    {
                    lv_x_11=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleCoordinates1872); 

                    		createLeafNode(grammarAccess.getCoordinatesAccess().getXINTTerminalRuleCall_2_1_0_0(), "x"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getCoordinatesRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "x", lv_x_11, "INT", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }

                    // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:952:2: (lv_y_12= RULE_INT )
                    // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:954:6: lv_y_12= RULE_INT
                    {
                    lv_y_12=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleCoordinates1902); 

                    		createLeafNode(grammarAccess.getCoordinatesAccess().getYINTTerminalRuleCall_2_1_1_0(), "y"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getCoordinatesRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "y", lv_y_12, "INT", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    match(input,17,FOLLOW_17_in_ruleCoordinates1920); 

                            createLeafNode(grammarAccess.getCoordinatesAccess().getSemicolonKeyword_2_2(), null); 
                        

                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleCoordinates


    // $ANTLR start entryRuleProgram
    // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:985:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:985:49: (iv_ruleProgram= ruleProgram EOF )
            // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:986:2: iv_ruleProgram= ruleProgram EOF
            {
             currentNode = createCompositeNode(grammarAccess.getProgramRule(), currentNode); 
            pushFollow(FOLLOW_ruleProgram_in_entryRuleProgram1957);
            iv_ruleProgram=ruleProgram();
            _fsp--;

             current =iv_ruleProgram; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProgram1967); 

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
    // $ANTLR end entryRuleProgram


    // $ANTLR start ruleProgram
    // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:993:1: ruleProgram returns [EObject current=null] : ( 'program {' ( 'name:' (lv_name_2= RULE_STRING ) ';' ) ( 'signal:' (lv_signal_5= RULE_STRING ) ';' ) ( 'source:' (lv_source_8= RULE_STRING ) ';' ) ( 'action:' (lv_action_11= ruleAction ) )? (lv_lua_script_12= ruleLUA_Script )? '}' ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        Token lv_name_2=null;
        Token lv_signal_5=null;
        Token lv_source_8=null;
        EObject lv_action_11 = null;

        EObject lv_lua_script_12 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:998:6: ( ( 'program {' ( 'name:' (lv_name_2= RULE_STRING ) ';' ) ( 'signal:' (lv_signal_5= RULE_STRING ) ';' ) ( 'source:' (lv_source_8= RULE_STRING ) ';' ) ( 'action:' (lv_action_11= ruleAction ) )? (lv_lua_script_12= ruleLUA_Script )? '}' ) )
            // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:999:1: ( 'program {' ( 'name:' (lv_name_2= RULE_STRING ) ';' ) ( 'signal:' (lv_signal_5= RULE_STRING ) ';' ) ( 'source:' (lv_source_8= RULE_STRING ) ';' ) ( 'action:' (lv_action_11= ruleAction ) )? (lv_lua_script_12= ruleLUA_Script )? '}' )
            {
            // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:999:1: ( 'program {' ( 'name:' (lv_name_2= RULE_STRING ) ';' ) ( 'signal:' (lv_signal_5= RULE_STRING ) ';' ) ( 'source:' (lv_source_8= RULE_STRING ) ';' ) ( 'action:' (lv_action_11= ruleAction ) )? (lv_lua_script_12= ruleLUA_Script )? '}' )
            // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:999:2: 'program {' ( 'name:' (lv_name_2= RULE_STRING ) ';' ) ( 'signal:' (lv_signal_5= RULE_STRING ) ';' ) ( 'source:' (lv_source_8= RULE_STRING ) ';' ) ( 'action:' (lv_action_11= ruleAction ) )? (lv_lua_script_12= ruleLUA_Script )? '}'
            {
            match(input,30,FOLLOW_30_in_ruleProgram2001); 

                    createLeafNode(grammarAccess.getProgramAccess().getProgramKeyword_0(), null); 
                
            // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:1003:1: ( 'name:' (lv_name_2= RULE_STRING ) ';' )
            // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:1003:2: 'name:' (lv_name_2= RULE_STRING ) ';'
            {
            match(input,16,FOLLOW_16_in_ruleProgram2011); 

                    createLeafNode(grammarAccess.getProgramAccess().getNameKeyword_1_0(), null); 
                
            // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:1007:1: (lv_name_2= RULE_STRING )
            // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:1009:6: lv_name_2= RULE_STRING
            {
            lv_name_2=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleProgram2033); 

            		createLeafNode(grammarAccess.getProgramAccess().getNameSTRINGTerminalRuleCall_1_1_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getProgramRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_2, "STRING", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            match(input,17,FOLLOW_17_in_ruleProgram2050); 

                    createLeafNode(grammarAccess.getProgramAccess().getSemicolonKeyword_1_2(), null); 
                

            }

            // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:1031:2: ( 'signal:' (lv_signal_5= RULE_STRING ) ';' )
            // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:1031:3: 'signal:' (lv_signal_5= RULE_STRING ) ';'
            {
            match(input,31,FOLLOW_31_in_ruleProgram2061); 

                    createLeafNode(grammarAccess.getProgramAccess().getSignalKeyword_2_0(), null); 
                
            // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:1035:1: (lv_signal_5= RULE_STRING )
            // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:1037:6: lv_signal_5= RULE_STRING
            {
            lv_signal_5=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleProgram2083); 

            		createLeafNode(grammarAccess.getProgramAccess().getSignalSTRINGTerminalRuleCall_2_1_0(), "signal"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getProgramRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "signal", lv_signal_5, "STRING", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            match(input,17,FOLLOW_17_in_ruleProgram2100); 

                    createLeafNode(grammarAccess.getProgramAccess().getSemicolonKeyword_2_2(), null); 
                

            }

            // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:1059:2: ( 'source:' (lv_source_8= RULE_STRING ) ';' )
            // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:1059:3: 'source:' (lv_source_8= RULE_STRING ) ';'
            {
            match(input,32,FOLLOW_32_in_ruleProgram2111); 

                    createLeafNode(grammarAccess.getProgramAccess().getSourceKeyword_3_0(), null); 
                
            // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:1063:1: (lv_source_8= RULE_STRING )
            // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:1065:6: lv_source_8= RULE_STRING
            {
            lv_source_8=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleProgram2133); 

            		createLeafNode(grammarAccess.getProgramAccess().getSourceSTRINGTerminalRuleCall_3_1_0(), "source"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getProgramRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "source", lv_source_8, "STRING", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            match(input,17,FOLLOW_17_in_ruleProgram2150); 

                    createLeafNode(grammarAccess.getProgramAccess().getSemicolonKeyword_3_2(), null); 
                

            }

            // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:1087:2: ( 'action:' (lv_action_11= ruleAction ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==33) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:1087:3: 'action:' (lv_action_11= ruleAction )
                    {
                    match(input,33,FOLLOW_33_in_ruleProgram2161); 

                            createLeafNode(grammarAccess.getProgramAccess().getActionKeyword_4_0(), null); 
                        
                    // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:1091:1: (lv_action_11= ruleAction )
                    // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:1094:6: lv_action_11= ruleAction
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getProgramAccess().getActionActionParserRuleCall_4_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleAction_in_ruleProgram2195);
                    lv_action_11=ruleAction();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getProgramRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "action", lv_action_11, "Action", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:1112:4: (lv_lua_script_12= ruleLUA_Script )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==12) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:1115:6: lv_lua_script_12= ruleLUA_Script
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getProgramAccess().getLua_scriptLUA_ScriptParserRuleCall_5_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleLUA_Script_in_ruleProgram2235);
                    lv_lua_script_12=ruleLUA_Script();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getProgramRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "lua_script", lv_lua_script_12, "LUA_Script", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }
                    break;

            }

            match(input,13,FOLLOW_13_in_ruleProgram2249); 

                    createLeafNode(grammarAccess.getProgramAccess().getRightCurlyBracketKeyword_6(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleProgram


    // $ANTLR start entryRuleAction
    // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:1144:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:1144:48: (iv_ruleAction= ruleAction EOF )
            // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:1145:2: iv_ruleAction= ruleAction EOF
            {
             currentNode = createCompositeNode(grammarAccess.getActionRule(), currentNode); 
            pushFollow(FOLLOW_ruleAction_in_entryRuleAction2282);
            iv_ruleAction=ruleAction();
            _fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAction2292); 

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
    // $ANTLR end entryRuleAction


    // $ANTLR start ruleAction
    // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:1152:1: ruleAction returns [EObject current=null] : ( (lv_name_0= RULE_ID ) (lv_params_1= RULE_STRING )* ';' ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token lv_name_0=null;
        Token lv_params_1=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:1157:6: ( ( (lv_name_0= RULE_ID ) (lv_params_1= RULE_STRING )* ';' ) )
            // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:1158:1: ( (lv_name_0= RULE_ID ) (lv_params_1= RULE_STRING )* ';' )
            {
            // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:1158:1: ( (lv_name_0= RULE_ID ) (lv_params_1= RULE_STRING )* ';' )
            // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:1158:2: (lv_name_0= RULE_ID ) (lv_params_1= RULE_STRING )* ';'
            {
            // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:1158:2: (lv_name_0= RULE_ID )
            // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:1160:6: lv_name_0= RULE_ID
            {
            lv_name_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAction2339); 

            		createLeafNode(grammarAccess.getActionAccess().getNameIDTerminalRuleCall_0_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getActionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_0, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:1178:2: (lv_params_1= RULE_STRING )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_STRING) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.xtext.enlightenment.edje/src-gen/org/xtext/enlightenment/parser/antlr/internal/InternalEdje.g:1180:6: lv_params_1= RULE_STRING
            	    {
            	    lv_params_1=(Token)input.LT(1);
            	    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAction2369); 

            	    		createLeafNode(grammarAccess.getActionAccess().getParamsSTRINGTerminalRuleCall_1_0(), "params"); 
            	    	

            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getActionRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "params", lv_params_1, "STRING", lastConsumedNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	    

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            match(input,17,FOLLOW_17_in_ruleAction2387); 

                    createLeafNode(grammarAccess.getActionAccess().getSemicolonKeyword_2(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAction


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel73 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel83 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInclude_in_ruleModel142 = new BitSet(new long[]{0x0000000000004802L});
    public static final BitSet FOLLOW_ruleCollections_in_ruleModel181 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleInclude_in_entryRuleInclude220 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInclude231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleInclude268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLUA_Script_in_entryRuleLUA_Script307 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLUA_Script317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleLUA_Script351 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLUA_Script373 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleLUA_Script390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollections_in_entryRuleCollections423 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollections433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleCollections467 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_ruleGroup_in_ruleCollections501 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_13_in_ruleCollections515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroup_in_entryRuleGroup548 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGroup558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleGroup592 = new BitSet(new long[]{0x00000000001D3000L});
    public static final BitSet FOLLOW_16_in_ruleGroup602 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGroup624 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleGroup641 = new BitSet(new long[]{0x00000000001C3000L});
    public static final BitSet FOLLOW_18_in_ruleGroup653 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleGroup676 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleGroup706 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleGroup724 = new BitSet(new long[]{0x0000000000183000L});
    public static final BitSet FOLLOW_19_in_ruleGroup736 = new BitSet(new long[]{0x0000000000202000L});
    public static final BitSet FOLLOW_rulePart_in_ruleGroup770 = new BitSet(new long[]{0x0000000000202000L});
    public static final BitSet FOLLOW_13_in_ruleGroup784 = new BitSet(new long[]{0x0000000000183000L});
    public static final BitSet FOLLOW_20_in_ruleGroup796 = new BitSet(new long[]{0x0000000040002000L});
    public static final BitSet FOLLOW_ruleProgram_in_ruleGroup830 = new BitSet(new long[]{0x0000000040002000L});
    public static final BitSet FOLLOW_13_in_ruleGroup844 = new BitSet(new long[]{0x0000000000103000L});
    public static final BitSet FOLLOW_ruleLUA_Script_in_ruleGroup880 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleGroup894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePart_in_entryRulePart927 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePart937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rulePart971 = new BitSet(new long[]{0x0000000000C52000L});
    public static final BitSet FOLLOW_16_in_rulePart981 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePart1003 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_rulePart1020 = new BitSet(new long[]{0x0000000000C42000L});
    public static final BitSet FOLLOW_18_in_rulePart1032 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_rulePart1055 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_rulePart1085 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_rulePart1103 = new BitSet(new long[]{0x0000000000C02000L});
    public static final BitSet FOLLOW_22_in_rulePart1115 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePart1137 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_rulePart1154 = new BitSet(new long[]{0x0000000000802000L});
    public static final BitSet FOLLOW_ruleDescription_in_rulePart1190 = new BitSet(new long[]{0x0000000000802000L});
    public static final BitSet FOLLOW_13_in_rulePart1204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDescription_in_entryRuleDescription1237 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDescription1247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleDescription1281 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleDescription1290 = new BitSet(new long[]{0x0000000038002000L});
    public static final BitSet FOLLOW_ruleCoordinates_in_ruleDescription1324 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleDescription1337 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleDescription1346 = new BitSet(new long[]{0x0000000038002000L});
    public static final BitSet FOLLOW_ruleCoordinates_in_ruleDescription1380 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleDescription1393 = new BitSet(new long[]{0x0000000004002000L});
    public static final BitSet FOLLOW_26_in_ruleDescription1403 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDescription1426 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDescription1456 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDescription1486 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDescription1516 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleDescription1534 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleDescription1545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCoordinates_in_entryRuleCoordinates1578 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCoordinates1588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleCoordinates1623 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleCoordinates1646 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleCoordinates1676 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleCoordinates1706 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleCoordinates1736 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleCoordinates1754 = new BitSet(new long[]{0x0000000030000002L});
    public static final BitSet FOLLOW_28_in_ruleCoordinates1766 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleCoordinates1789 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleCoordinates1819 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleCoordinates1837 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_ruleCoordinates1849 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleCoordinates1872 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleCoordinates1902 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleCoordinates1920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProgram_in_entryRuleProgram1957 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProgram1967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleProgram2001 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleProgram2011 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleProgram2033 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleProgram2050 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleProgram2061 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleProgram2083 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleProgram2100 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleProgram2111 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleProgram2133 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleProgram2150 = new BitSet(new long[]{0x0000000200003000L});
    public static final BitSet FOLLOW_33_in_ruleProgram2161 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleAction_in_ruleProgram2195 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_ruleLUA_Script_in_ruleProgram2235 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleProgram2249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_entryRuleAction2282 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAction2292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAction2339 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAction2369 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_17_in_ruleAction2387 = new BitSet(new long[]{0x0000000000000002L});

}