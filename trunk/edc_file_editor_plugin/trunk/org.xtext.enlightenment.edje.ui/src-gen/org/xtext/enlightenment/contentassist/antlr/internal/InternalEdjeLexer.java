package org.xtext.enlightenment.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalEdjeLexer extends Lexer {
    public static final int RULE_ID=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int T29=29;
    public static final int T28=28;
    public static final int T27=27;
    public static final int T26=26;
    public static final int T25=25;
    public static final int Tokens=34;
    public static final int T24=24;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=8;
    public static final int T23=23;
    public static final int T22=22;
    public static final int T21=21;
    public static final int T20=20;
    public static final int RULE_ML_COMMENT=7;
    public static final int RULE_STRING=4;
    public static final int RULE_INT=5;
    public static final int T11=11;
    public static final int T12=12;
    public static final int T13=13;
    public static final int T14=14;
    public static final int RULE_WS=9;
    public static final int T15=15;
    public static final int T33=33;
    public static final int T16=16;
    public static final int T17=17;
    public static final int T18=18;
    public static final int T30=30;
    public static final int T19=19;
    public static final int T32=32;
    public static final int T31=31;
    public InternalEdjeLexer() {;} 
    public InternalEdjeLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g"; }

    // $ANTLR start T11
    public final void mT11() throws RecognitionException {
        try {
            int _type = T11;
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:10:5: ( '#include' )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:10:7: '#include'
            {
            match("#include"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T11

    // $ANTLR start T12
    public final void mT12() throws RecognitionException {
        try {
            int _type = T12;
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:11:5: ( 'lua_script {' )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:11:7: 'lua_script {'
            {
            match("lua_script {"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T12

    // $ANTLR start T13
    public final void mT13() throws RecognitionException {
        try {
            int _type = T13;
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:12:5: ( '}' )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:12:7: '}'
            {
            match('}'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T13

    // $ANTLR start T14
    public final void mT14() throws RecognitionException {
        try {
            int _type = T14;
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:13:5: ( 'collections {' )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:13:7: 'collections {'
            {
            match("collections {"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T14

    // $ANTLR start T15
    public final void mT15() throws RecognitionException {
        try {
            int _type = T15;
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:14:5: ( 'group {' )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:14:7: 'group {'
            {
            match("group {"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T15

    // $ANTLR start T16
    public final void mT16() throws RecognitionException {
        try {
            int _type = T16;
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:15:5: ( 'name:' )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:15:7: 'name:'
            {
            match("name:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T16

    // $ANTLR start T17
    public final void mT17() throws RecognitionException {
        try {
            int _type = T17;
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:16:5: ( ';' )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:16:7: ';'
            {
            match(';'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T17

    // $ANTLR start T18
    public final void mT18() throws RecognitionException {
        try {
            int _type = T18;
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:17:5: ( 'min:' )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:17:7: 'min:'
            {
            match("min:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T18

    // $ANTLR start T19
    public final void mT19() throws RecognitionException {
        try {
            int _type = T19;
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:18:5: ( 'parts {' )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:18:7: 'parts {'
            {
            match("parts {"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T19

    // $ANTLR start T20
    public final void mT20() throws RecognitionException {
        try {
            int _type = T20;
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:19:5: ( 'programs {' )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:19:7: 'programs {'
            {
            match("programs {"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T20

    // $ANTLR start T21
    public final void mT21() throws RecognitionException {
        try {
            int _type = T21;
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:20:5: ( 'part {' )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:20:7: 'part {'
            {
            match("part {"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T21

    // $ANTLR start T22
    public final void mT22() throws RecognitionException {
        try {
            int _type = T22;
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:21:5: ( 'type:' )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:21:7: 'type:'
            {
            match("type:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T22

    // $ANTLR start T23
    public final void mT23() throws RecognitionException {
        try {
            int _type = T23;
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:22:5: ( 'description {' )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:22:7: 'description {'
            {
            match("description {"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T23

    // $ANTLR start T24
    public final void mT24() throws RecognitionException {
        try {
            int _type = T24;
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:23:5: ( 'rel1 {' )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:23:7: 'rel1 {'
            {
            match("rel1 {"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T24

    // $ANTLR start T25
    public final void mT25() throws RecognitionException {
        try {
            int _type = T25;
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:24:5: ( 'rel2 {' )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:24:7: 'rel2 {'
            {
            match("rel2 {"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T25

    // $ANTLR start T26
    public final void mT26() throws RecognitionException {
        try {
            int _type = T26;
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:25:5: ( 'color:' )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:25:7: 'color:'
            {
            match("color:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T26

    // $ANTLR start T27
    public final void mT27() throws RecognitionException {
        try {
            int _type = T27;
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:26:5: ( 'absolute:' )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:26:7: 'absolute:'
            {
            match("absolute:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T27

    // $ANTLR start T28
    public final void mT28() throws RecognitionException {
        try {
            int _type = T28;
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:27:5: ( 'relative:' )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:27:7: 'relative:'
            {
            match("relative:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T28

    // $ANTLR start T29
    public final void mT29() throws RecognitionException {
        try {
            int _type = T29;
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:28:5: ( 'offset:' )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:28:7: 'offset:'
            {
            match("offset:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T29

    // $ANTLR start T30
    public final void mT30() throws RecognitionException {
        try {
            int _type = T30;
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:29:5: ( 'program {' )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:29:7: 'program {'
            {
            match("program {"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T30

    // $ANTLR start T31
    public final void mT31() throws RecognitionException {
        try {
            int _type = T31;
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:30:5: ( 'signal:' )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:30:7: 'signal:'
            {
            match("signal:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T31

    // $ANTLR start T32
    public final void mT32() throws RecognitionException {
        try {
            int _type = T32;
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:31:5: ( 'source:' )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:31:7: 'source:'
            {
            match("source:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T32

    // $ANTLR start T33
    public final void mT33() throws RecognitionException {
        try {
            int _type = T33;
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:32:5: ( 'action:' )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:32:7: 'action:'
            {
            match("action:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T33

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:3003:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:3003:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:3003:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:3003:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:3003:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ID

    // $ANTLR start RULE_INT
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:3005:10: ( ( '0' .. '9' )+ )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:3005:12: ( '0' .. '9' )+
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:3005:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:3005:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_INT

    // $ANTLR start RULE_STRING
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:3007:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:3007:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:3007:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("3007:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:3007:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:3007:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFE')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:3007:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:3007:62: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:3007:82: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:3007:87: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFE')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:3007:88: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:3007:129: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_STRING

    // $ANTLR start RULE_ML_COMMENT
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:3009:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:3009:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:3009:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFE')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFE')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:3009:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ML_COMMENT

    // $ANTLR start RULE_SL_COMMENT
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:3011:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:3011:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:3011:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFE')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:3011:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:3011:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:3011:41: ( '\\r' )? '\\n'
                    {
                    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:3011:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:3011:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_SL_COMMENT

    // $ANTLR start RULE_WS
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:3013:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:3013:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:3013:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_WS

    // $ANTLR start RULE_ANY_OTHER
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:3015:16: ( . )
            // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:3015:18: .
            {
            matchAny(); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ANY_OTHER

    public void mTokens() throws RecognitionException {
        // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1:8: ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=30;
        int LA12_0 = input.LA(1);

        if ( (LA12_0=='#') ) {
            int LA12_1 = input.LA(2);

            if ( (LA12_1=='i') ) {
                alt12=1;
            }
            else {
                alt12=30;}
        }
        else if ( (LA12_0=='l') ) {
            int LA12_2 = input.LA(2);

            if ( (LA12_2=='u') ) {
                int LA12_25 = input.LA(3);

                if ( (LA12_25=='a') ) {
                    int LA12_48 = input.LA(4);

                    if ( (LA12_48=='_') ) {
                        int LA12_63 = input.LA(5);

                        if ( (LA12_63=='s') ) {
                            int LA12_81 = input.LA(6);

                            if ( (LA12_81=='c') ) {
                                int LA12_99 = input.LA(7);

                                if ( (LA12_99=='r') ) {
                                    int LA12_112 = input.LA(8);

                                    if ( (LA12_112=='i') ) {
                                        int LA12_122 = input.LA(9);

                                        if ( (LA12_122=='p') ) {
                                            int LA12_129 = input.LA(10);

                                            if ( (LA12_129=='t') ) {
                                                int LA12_135 = input.LA(11);

                                                if ( (LA12_135==' ') ) {
                                                    alt12=2;
                                                }
                                                else {
                                                    alt12=24;}
                                            }
                                            else {
                                                alt12=24;}
                                        }
                                        else {
                                            alt12=24;}
                                    }
                                    else {
                                        alt12=24;}
                                }
                                else {
                                    alt12=24;}
                            }
                            else {
                                alt12=24;}
                        }
                        else {
                            alt12=24;}
                    }
                    else {
                        alt12=24;}
                }
                else {
                    alt12=24;}
            }
            else {
                alt12=24;}
        }
        else if ( (LA12_0=='}') ) {
            alt12=3;
        }
        else if ( (LA12_0=='c') ) {
            int LA12_4 = input.LA(2);

            if ( (LA12_4=='o') ) {
                int LA12_28 = input.LA(3);

                if ( (LA12_28=='l') ) {
                    switch ( input.LA(4) ) {
                    case 'o':
                        {
                        int LA12_64 = input.LA(5);

                        if ( (LA12_64=='r') ) {
                            int LA12_82 = input.LA(6);

                            if ( (LA12_82==':') ) {
                                alt12=16;
                            }
                            else {
                                alt12=24;}
                        }
                        else {
                            alt12=24;}
                        }
                        break;
                    case 'l':
                        {
                        int LA12_65 = input.LA(5);

                        if ( (LA12_65=='e') ) {
                            int LA12_83 = input.LA(6);

                            if ( (LA12_83=='c') ) {
                                int LA12_101 = input.LA(7);

                                if ( (LA12_101=='t') ) {
                                    int LA12_113 = input.LA(8);

                                    if ( (LA12_113=='i') ) {
                                        int LA12_123 = input.LA(9);

                                        if ( (LA12_123=='o') ) {
                                            int LA12_130 = input.LA(10);

                                            if ( (LA12_130=='n') ) {
                                                int LA12_136 = input.LA(11);

                                                if ( (LA12_136=='s') ) {
                                                    int LA12_139 = input.LA(12);

                                                    if ( (LA12_139==' ') ) {
                                                        alt12=4;
                                                    }
                                                    else {
                                                        alt12=24;}
                                                }
                                                else {
                                                    alt12=24;}
                                            }
                                            else {
                                                alt12=24;}
                                        }
                                        else {
                                            alt12=24;}
                                    }
                                    else {
                                        alt12=24;}
                                }
                                else {
                                    alt12=24;}
                            }
                            else {
                                alt12=24;}
                        }
                        else {
                            alt12=24;}
                        }
                        break;
                    default:
                        alt12=24;}

                }
                else {
                    alt12=24;}
            }
            else {
                alt12=24;}
        }
        else if ( (LA12_0=='g') ) {
            int LA12_5 = input.LA(2);

            if ( (LA12_5=='r') ) {
                int LA12_29 = input.LA(3);

                if ( (LA12_29=='o') ) {
                    int LA12_50 = input.LA(4);

                    if ( (LA12_50=='u') ) {
                        int LA12_66 = input.LA(5);

                        if ( (LA12_66=='p') ) {
                            int LA12_84 = input.LA(6);

                            if ( (LA12_84==' ') ) {
                                alt12=5;
                            }
                            else {
                                alt12=24;}
                        }
                        else {
                            alt12=24;}
                    }
                    else {
                        alt12=24;}
                }
                else {
                    alt12=24;}
            }
            else {
                alt12=24;}
        }
        else if ( (LA12_0=='n') ) {
            int LA12_6 = input.LA(2);

            if ( (LA12_6=='a') ) {
                int LA12_30 = input.LA(3);

                if ( (LA12_30=='m') ) {
                    int LA12_51 = input.LA(4);

                    if ( (LA12_51=='e') ) {
                        int LA12_67 = input.LA(5);

                        if ( (LA12_67==':') ) {
                            alt12=6;
                        }
                        else {
                            alt12=24;}
                    }
                    else {
                        alt12=24;}
                }
                else {
                    alt12=24;}
            }
            else {
                alt12=24;}
        }
        else if ( (LA12_0==';') ) {
            alt12=7;
        }
        else if ( (LA12_0=='m') ) {
            int LA12_8 = input.LA(2);

            if ( (LA12_8=='i') ) {
                int LA12_32 = input.LA(3);

                if ( (LA12_32=='n') ) {
                    int LA12_52 = input.LA(4);

                    if ( (LA12_52==':') ) {
                        alt12=8;
                    }
                    else {
                        alt12=24;}
                }
                else {
                    alt12=24;}
            }
            else {
                alt12=24;}
        }
        else if ( (LA12_0=='p') ) {
            switch ( input.LA(2) ) {
            case 'r':
                {
                int LA12_33 = input.LA(3);

                if ( (LA12_33=='o') ) {
                    int LA12_53 = input.LA(4);

                    if ( (LA12_53=='g') ) {
                        int LA12_69 = input.LA(5);

                        if ( (LA12_69=='r') ) {
                            int LA12_86 = input.LA(6);

                            if ( (LA12_86=='a') ) {
                                int LA12_103 = input.LA(7);

                                if ( (LA12_103=='m') ) {
                                    switch ( input.LA(8) ) {
                                    case ' ':
                                        {
                                        alt12=20;
                                        }
                                        break;
                                    case 's':
                                        {
                                        int LA12_125 = input.LA(9);

                                        if ( (LA12_125==' ') ) {
                                            alt12=10;
                                        }
                                        else {
                                            alt12=24;}
                                        }
                                        break;
                                    default:
                                        alt12=24;}

                                }
                                else {
                                    alt12=24;}
                            }
                            else {
                                alt12=24;}
                        }
                        else {
                            alt12=24;}
                    }
                    else {
                        alt12=24;}
                }
                else {
                    alt12=24;}
                }
                break;
            case 'a':
                {
                int LA12_34 = input.LA(3);

                if ( (LA12_34=='r') ) {
                    int LA12_54 = input.LA(4);

                    if ( (LA12_54=='t') ) {
                        switch ( input.LA(5) ) {
                        case ' ':
                            {
                            alt12=11;
                            }
                            break;
                        case 's':
                            {
                            int LA12_88 = input.LA(6);

                            if ( (LA12_88==' ') ) {
                                alt12=9;
                            }
                            else {
                                alt12=24;}
                            }
                            break;
                        default:
                            alt12=24;}

                    }
                    else {
                        alt12=24;}
                }
                else {
                    alt12=24;}
                }
                break;
            default:
                alt12=24;}

        }
        else if ( (LA12_0=='t') ) {
            int LA12_10 = input.LA(2);

            if ( (LA12_10=='y') ) {
                int LA12_35 = input.LA(3);

                if ( (LA12_35=='p') ) {
                    int LA12_55 = input.LA(4);

                    if ( (LA12_55=='e') ) {
                        int LA12_71 = input.LA(5);

                        if ( (LA12_71==':') ) {
                            alt12=12;
                        }
                        else {
                            alt12=24;}
                    }
                    else {
                        alt12=24;}
                }
                else {
                    alt12=24;}
            }
            else {
                alt12=24;}
        }
        else if ( (LA12_0=='d') ) {
            int LA12_11 = input.LA(2);

            if ( (LA12_11=='e') ) {
                int LA12_36 = input.LA(3);

                if ( (LA12_36=='s') ) {
                    int LA12_56 = input.LA(4);

                    if ( (LA12_56=='c') ) {
                        int LA12_72 = input.LA(5);

                        if ( (LA12_72=='r') ) {
                            int LA12_90 = input.LA(6);

                            if ( (LA12_90=='i') ) {
                                int LA12_105 = input.LA(7);

                                if ( (LA12_105=='p') ) {
                                    int LA12_115 = input.LA(8);

                                    if ( (LA12_115=='t') ) {
                                        int LA12_126 = input.LA(9);

                                        if ( (LA12_126=='i') ) {
                                            int LA12_132 = input.LA(10);

                                            if ( (LA12_132=='o') ) {
                                                int LA12_137 = input.LA(11);

                                                if ( (LA12_137=='n') ) {
                                                    int LA12_140 = input.LA(12);

                                                    if ( (LA12_140==' ') ) {
                                                        alt12=13;
                                                    }
                                                    else {
                                                        alt12=24;}
                                                }
                                                else {
                                                    alt12=24;}
                                            }
                                            else {
                                                alt12=24;}
                                        }
                                        else {
                                            alt12=24;}
                                    }
                                    else {
                                        alt12=24;}
                                }
                                else {
                                    alt12=24;}
                            }
                            else {
                                alt12=24;}
                        }
                        else {
                            alt12=24;}
                    }
                    else {
                        alt12=24;}
                }
                else {
                    alt12=24;}
            }
            else {
                alt12=24;}
        }
        else if ( (LA12_0=='r') ) {
            int LA12_12 = input.LA(2);

            if ( (LA12_12=='e') ) {
                int LA12_37 = input.LA(3);

                if ( (LA12_37=='l') ) {
                    switch ( input.LA(4) ) {
                    case 'a':
                        {
                        int LA12_73 = input.LA(5);

                        if ( (LA12_73=='t') ) {
                            int LA12_91 = input.LA(6);

                            if ( (LA12_91=='i') ) {
                                int LA12_106 = input.LA(7);

                                if ( (LA12_106=='v') ) {
                                    int LA12_116 = input.LA(8);

                                    if ( (LA12_116=='e') ) {
                                        int LA12_127 = input.LA(9);

                                        if ( (LA12_127==':') ) {
                                            alt12=18;
                                        }
                                        else {
                                            alt12=24;}
                                    }
                                    else {
                                        alt12=24;}
                                }
                                else {
                                    alt12=24;}
                            }
                            else {
                                alt12=24;}
                        }
                        else {
                            alt12=24;}
                        }
                        break;
                    case '2':
                        {
                        int LA12_74 = input.LA(5);

                        if ( (LA12_74==' ') ) {
                            alt12=15;
                        }
                        else {
                            alt12=24;}
                        }
                        break;
                    case '1':
                        {
                        int LA12_75 = input.LA(5);

                        if ( (LA12_75==' ') ) {
                            alt12=14;
                        }
                        else {
                            alt12=24;}
                        }
                        break;
                    default:
                        alt12=24;}

                }
                else {
                    alt12=24;}
            }
            else {
                alt12=24;}
        }
        else if ( (LA12_0=='a') ) {
            switch ( input.LA(2) ) {
            case 'b':
                {
                int LA12_38 = input.LA(3);

                if ( (LA12_38=='s') ) {
                    int LA12_58 = input.LA(4);

                    if ( (LA12_58=='o') ) {
                        int LA12_76 = input.LA(5);

                        if ( (LA12_76=='l') ) {
                            int LA12_94 = input.LA(6);

                            if ( (LA12_94=='u') ) {
                                int LA12_107 = input.LA(7);

                                if ( (LA12_107=='t') ) {
                                    int LA12_117 = input.LA(8);

                                    if ( (LA12_117=='e') ) {
                                        int LA12_128 = input.LA(9);

                                        if ( (LA12_128==':') ) {
                                            alt12=17;
                                        }
                                        else {
                                            alt12=24;}
                                    }
                                    else {
                                        alt12=24;}
                                }
                                else {
                                    alt12=24;}
                            }
                            else {
                                alt12=24;}
                        }
                        else {
                            alt12=24;}
                    }
                    else {
                        alt12=24;}
                }
                else {
                    alt12=24;}
                }
                break;
            case 'c':
                {
                int LA12_39 = input.LA(3);

                if ( (LA12_39=='t') ) {
                    int LA12_59 = input.LA(4);

                    if ( (LA12_59=='i') ) {
                        int LA12_77 = input.LA(5);

                        if ( (LA12_77=='o') ) {
                            int LA12_95 = input.LA(6);

                            if ( (LA12_95=='n') ) {
                                int LA12_108 = input.LA(7);

                                if ( (LA12_108==':') ) {
                                    alt12=23;
                                }
                                else {
                                    alt12=24;}
                            }
                            else {
                                alt12=24;}
                        }
                        else {
                            alt12=24;}
                    }
                    else {
                        alt12=24;}
                }
                else {
                    alt12=24;}
                }
                break;
            default:
                alt12=24;}

        }
        else if ( (LA12_0=='o') ) {
            int LA12_14 = input.LA(2);

            if ( (LA12_14=='f') ) {
                int LA12_40 = input.LA(3);

                if ( (LA12_40=='f') ) {
                    int LA12_60 = input.LA(4);

                    if ( (LA12_60=='s') ) {
                        int LA12_78 = input.LA(5);

                        if ( (LA12_78=='e') ) {
                            int LA12_96 = input.LA(6);

                            if ( (LA12_96=='t') ) {
                                int LA12_109 = input.LA(7);

                                if ( (LA12_109==':') ) {
                                    alt12=19;
                                }
                                else {
                                    alt12=24;}
                            }
                            else {
                                alt12=24;}
                        }
                        else {
                            alt12=24;}
                    }
                    else {
                        alt12=24;}
                }
                else {
                    alt12=24;}
            }
            else {
                alt12=24;}
        }
        else if ( (LA12_0=='s') ) {
            switch ( input.LA(2) ) {
            case 'o':
                {
                int LA12_41 = input.LA(3);

                if ( (LA12_41=='u') ) {
                    int LA12_61 = input.LA(4);

                    if ( (LA12_61=='r') ) {
                        int LA12_79 = input.LA(5);

                        if ( (LA12_79=='c') ) {
                            int LA12_97 = input.LA(6);

                            if ( (LA12_97=='e') ) {
                                int LA12_110 = input.LA(7);

                                if ( (LA12_110==':') ) {
                                    alt12=22;
                                }
                                else {
                                    alt12=24;}
                            }
                            else {
                                alt12=24;}
                        }
                        else {
                            alt12=24;}
                    }
                    else {
                        alt12=24;}
                }
                else {
                    alt12=24;}
                }
                break;
            case 'i':
                {
                int LA12_42 = input.LA(3);

                if ( (LA12_42=='g') ) {
                    int LA12_62 = input.LA(4);

                    if ( (LA12_62=='n') ) {
                        int LA12_80 = input.LA(5);

                        if ( (LA12_80=='a') ) {
                            int LA12_98 = input.LA(6);

                            if ( (LA12_98=='l') ) {
                                int LA12_111 = input.LA(7);

                                if ( (LA12_111==':') ) {
                                    alt12=21;
                                }
                                else {
                                    alt12=24;}
                            }
                            else {
                                alt12=24;}
                        }
                        else {
                            alt12=24;}
                    }
                    else {
                        alt12=24;}
                }
                else {
                    alt12=24;}
                }
                break;
            default:
                alt12=24;}

        }
        else if ( (LA12_0=='^') ) {
            int LA12_16 = input.LA(2);

            if ( ((LA12_16>='A' && LA12_16<='Z')||LA12_16=='_'||(LA12_16>='a' && LA12_16<='z')) ) {
                alt12=24;
            }
            else {
                alt12=30;}
        }
        else if ( ((LA12_0>='A' && LA12_0<='Z')||LA12_0=='_'||LA12_0=='b'||(LA12_0>='e' && LA12_0<='f')||(LA12_0>='h' && LA12_0<='k')||LA12_0=='q'||(LA12_0>='u' && LA12_0<='z')) ) {
            alt12=24;
        }
        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {
            alt12=25;
        }
        else if ( (LA12_0=='\"') ) {
            int LA12_19 = input.LA(2);

            if ( ((LA12_19>='\u0000' && LA12_19<='\uFFFE')) ) {
                alt12=26;
            }
            else {
                alt12=30;}
        }
        else if ( (LA12_0=='\'') ) {
            int LA12_20 = input.LA(2);

            if ( ((LA12_20>='\u0000' && LA12_20<='\uFFFE')) ) {
                alt12=26;
            }
            else {
                alt12=30;}
        }
        else if ( (LA12_0=='/') ) {
            switch ( input.LA(2) ) {
            case '/':
                {
                alt12=28;
                }
                break;
            case '*':
                {
                alt12=27;
                }
                break;
            default:
                alt12=30;}

        }
        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
            alt12=29;
        }
        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='$' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='.')||LA12_0==':'||(LA12_0>='<' && LA12_0<='@')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||(LA12_0>='{' && LA12_0<='|')||(LA12_0>='~' && LA12_0<='\uFFFE')) ) {
            alt12=30;
        }
        else {
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 12, 0, input);

            throw nvae;
        }
        switch (alt12) {
            case 1 :
                // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1:10: T11
                {
                mT11(); 

                }
                break;
            case 2 :
                // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1:14: T12
                {
                mT12(); 

                }
                break;
            case 3 :
                // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1:18: T13
                {
                mT13(); 

                }
                break;
            case 4 :
                // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1:22: T14
                {
                mT14(); 

                }
                break;
            case 5 :
                // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1:26: T15
                {
                mT15(); 

                }
                break;
            case 6 :
                // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1:30: T16
                {
                mT16(); 

                }
                break;
            case 7 :
                // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1:34: T17
                {
                mT17(); 

                }
                break;
            case 8 :
                // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1:38: T18
                {
                mT18(); 

                }
                break;
            case 9 :
                // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1:42: T19
                {
                mT19(); 

                }
                break;
            case 10 :
                // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1:46: T20
                {
                mT20(); 

                }
                break;
            case 11 :
                // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1:50: T21
                {
                mT21(); 

                }
                break;
            case 12 :
                // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1:54: T22
                {
                mT22(); 

                }
                break;
            case 13 :
                // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1:58: T23
                {
                mT23(); 

                }
                break;
            case 14 :
                // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1:62: T24
                {
                mT24(); 

                }
                break;
            case 15 :
                // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1:66: T25
                {
                mT25(); 

                }
                break;
            case 16 :
                // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1:70: T26
                {
                mT26(); 

                }
                break;
            case 17 :
                // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1:74: T27
                {
                mT27(); 

                }
                break;
            case 18 :
                // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1:78: T28
                {
                mT28(); 

                }
                break;
            case 19 :
                // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1:82: T29
                {
                mT29(); 

                }
                break;
            case 20 :
                // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1:86: T30
                {
                mT30(); 

                }
                break;
            case 21 :
                // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1:90: T31
                {
                mT31(); 

                }
                break;
            case 22 :
                // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1:94: T32
                {
                mT32(); 

                }
                break;
            case 23 :
                // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1:98: T33
                {
                mT33(); 

                }
                break;
            case 24 :
                // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1:102: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 25 :
                // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1:110: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 26 :
                // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1:119: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 27 :
                // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1:131: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 28 :
                // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1:147: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 29 :
                // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1:163: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 30 :
                // ../org.xtext.enlightenment.edje.ui/src-gen/org/xtext/enlightenment/contentassist/antlr/internal/InternalEdje.g:1:171: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


 

}