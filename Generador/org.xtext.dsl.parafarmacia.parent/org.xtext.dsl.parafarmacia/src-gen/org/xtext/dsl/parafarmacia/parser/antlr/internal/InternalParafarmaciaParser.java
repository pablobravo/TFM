package org.xtext.dsl.parafarmacia.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.dsl.parafarmacia.services.ParafarmaciaGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalParafarmaciaParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Parafarmacia'", "'{'", "'Titulo'", "'='", "';'", "'Descripcion'", "'Paginas'", "'}'", "'Color'", "'FondoPrincipal'", "'FondoSecundario'", "'Texto'", "'Fuente'", "'SizeH1'", "'px'", "'SizeH2'", "'Cuerpo'", "'Size'", "'Pagina'", "'Producto'", "'imagen'", "'con receta'", "'descripcion'", "'.'", "'#'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
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
    public static final int RULE_INT=5;
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


        public InternalParafarmaciaParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalParafarmaciaParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalParafarmaciaParser.tokenNames; }
    public String getGrammarFileName() { return "InternalParafarmacia.g"; }



     	private ParafarmaciaGrammarAccess grammarAccess;

        public InternalParafarmaciaParser(TokenStream input, ParafarmaciaGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Parafarmacia";
       	}

       	@Override
       	protected ParafarmaciaGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleParafarmacia"
    // InternalParafarmacia.g:64:1: entryRuleParafarmacia returns [EObject current=null] : iv_ruleParafarmacia= ruleParafarmacia EOF ;
    public final EObject entryRuleParafarmacia() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParafarmacia = null;


        try {
            // InternalParafarmacia.g:64:53: (iv_ruleParafarmacia= ruleParafarmacia EOF )
            // InternalParafarmacia.g:65:2: iv_ruleParafarmacia= ruleParafarmacia EOF
            {
             newCompositeNode(grammarAccess.getParafarmaciaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParafarmacia=ruleParafarmacia();

            state._fsp--;

             current =iv_ruleParafarmacia; 
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
    // $ANTLR end "entryRuleParafarmacia"


    // $ANTLR start "ruleParafarmacia"
    // InternalParafarmacia.g:71:1: ruleParafarmacia returns [EObject current=null] : (otherlv_0= 'Parafarmacia' otherlv_1= '{' otherlv_2= 'Titulo' otherlv_3= '=' ( (lv_titulo_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'Descripcion' otherlv_7= '=' ( (lv_descripcion_8_0= RULE_STRING ) ) otherlv_9= ';' ( (lv_apariencia_10_0= ruleApariencia ) ) otherlv_11= 'Paginas' otherlv_12= '{' ( (lv_paginas_13_0= rulePagina ) )* otherlv_14= '}' otherlv_15= '}' ) ;
    public final EObject ruleParafarmacia() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_titulo_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_descripcion_8_0=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        EObject lv_apariencia_10_0 = null;

        EObject lv_paginas_13_0 = null;



        	enterRule();

        try {
            // InternalParafarmacia.g:77:2: ( (otherlv_0= 'Parafarmacia' otherlv_1= '{' otherlv_2= 'Titulo' otherlv_3= '=' ( (lv_titulo_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'Descripcion' otherlv_7= '=' ( (lv_descripcion_8_0= RULE_STRING ) ) otherlv_9= ';' ( (lv_apariencia_10_0= ruleApariencia ) ) otherlv_11= 'Paginas' otherlv_12= '{' ( (lv_paginas_13_0= rulePagina ) )* otherlv_14= '}' otherlv_15= '}' ) )
            // InternalParafarmacia.g:78:2: (otherlv_0= 'Parafarmacia' otherlv_1= '{' otherlv_2= 'Titulo' otherlv_3= '=' ( (lv_titulo_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'Descripcion' otherlv_7= '=' ( (lv_descripcion_8_0= RULE_STRING ) ) otherlv_9= ';' ( (lv_apariencia_10_0= ruleApariencia ) ) otherlv_11= 'Paginas' otherlv_12= '{' ( (lv_paginas_13_0= rulePagina ) )* otherlv_14= '}' otherlv_15= '}' )
            {
            // InternalParafarmacia.g:78:2: (otherlv_0= 'Parafarmacia' otherlv_1= '{' otherlv_2= 'Titulo' otherlv_3= '=' ( (lv_titulo_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'Descripcion' otherlv_7= '=' ( (lv_descripcion_8_0= RULE_STRING ) ) otherlv_9= ';' ( (lv_apariencia_10_0= ruleApariencia ) ) otherlv_11= 'Paginas' otherlv_12= '{' ( (lv_paginas_13_0= rulePagina ) )* otherlv_14= '}' otherlv_15= '}' )
            // InternalParafarmacia.g:79:3: otherlv_0= 'Parafarmacia' otherlv_1= '{' otherlv_2= 'Titulo' otherlv_3= '=' ( (lv_titulo_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'Descripcion' otherlv_7= '=' ( (lv_descripcion_8_0= RULE_STRING ) ) otherlv_9= ';' ( (lv_apariencia_10_0= ruleApariencia ) ) otherlv_11= 'Paginas' otherlv_12= '{' ( (lv_paginas_13_0= rulePagina ) )* otherlv_14= '}' otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getParafarmaciaAccess().getParafarmaciaKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getParafarmaciaAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getParafarmaciaAccess().getTituloKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getParafarmaciaAccess().getEqualsSignKeyword_3());
            		
            // InternalParafarmacia.g:95:3: ( (lv_titulo_4_0= RULE_STRING ) )
            // InternalParafarmacia.g:96:4: (lv_titulo_4_0= RULE_STRING )
            {
            // InternalParafarmacia.g:96:4: (lv_titulo_4_0= RULE_STRING )
            // InternalParafarmacia.g:97:5: lv_titulo_4_0= RULE_STRING
            {
            lv_titulo_4_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            					newLeafNode(lv_titulo_4_0, grammarAccess.getParafarmaciaAccess().getTituloSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParafarmaciaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"titulo",
            						lv_titulo_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getParafarmaciaAccess().getSemicolonKeyword_5());
            		
            otherlv_6=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_6, grammarAccess.getParafarmaciaAccess().getDescripcionKeyword_6());
            		
            otherlv_7=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_7, grammarAccess.getParafarmaciaAccess().getEqualsSignKeyword_7());
            		
            // InternalParafarmacia.g:125:3: ( (lv_descripcion_8_0= RULE_STRING ) )
            // InternalParafarmacia.g:126:4: (lv_descripcion_8_0= RULE_STRING )
            {
            // InternalParafarmacia.g:126:4: (lv_descripcion_8_0= RULE_STRING )
            // InternalParafarmacia.g:127:5: lv_descripcion_8_0= RULE_STRING
            {
            lv_descripcion_8_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            					newLeafNode(lv_descripcion_8_0, grammarAccess.getParafarmaciaAccess().getDescripcionSTRINGTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParafarmaciaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"descripcion",
            						lv_descripcion_8_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_9=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_9, grammarAccess.getParafarmaciaAccess().getSemicolonKeyword_9());
            		
            // InternalParafarmacia.g:147:3: ( (lv_apariencia_10_0= ruleApariencia ) )
            // InternalParafarmacia.g:148:4: (lv_apariencia_10_0= ruleApariencia )
            {
            // InternalParafarmacia.g:148:4: (lv_apariencia_10_0= ruleApariencia )
            // InternalParafarmacia.g:149:5: lv_apariencia_10_0= ruleApariencia
            {

            					newCompositeNode(grammarAccess.getParafarmaciaAccess().getAparienciaAparienciaParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_10);
            lv_apariencia_10_0=ruleApariencia();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParafarmaciaRule());
            					}
            					set(
            						current,
            						"apariencia",
            						lv_apariencia_10_0,
            						"org.xtext.dsl.parafarmacia.Parafarmacia.Apariencia");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_11, grammarAccess.getParafarmaciaAccess().getPaginasKeyword_11());
            		
            otherlv_12=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_12, grammarAccess.getParafarmaciaAccess().getLeftCurlyBracketKeyword_12());
            		
            // InternalParafarmacia.g:174:3: ( (lv_paginas_13_0= rulePagina ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==29) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalParafarmacia.g:175:4: (lv_paginas_13_0= rulePagina )
            	    {
            	    // InternalParafarmacia.g:175:4: (lv_paginas_13_0= rulePagina )
            	    // InternalParafarmacia.g:176:5: lv_paginas_13_0= rulePagina
            	    {

            	    					newCompositeNode(grammarAccess.getParafarmaciaAccess().getPaginasPaginaParserRuleCall_13_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_paginas_13_0=rulePagina();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getParafarmaciaRule());
            	    					}
            	    					add(
            	    						current,
            	    						"paginas",
            	    						lv_paginas_13_0,
            	    						"org.xtext.dsl.parafarmacia.Parafarmacia.Pagina");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_14=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_14, grammarAccess.getParafarmaciaAccess().getRightCurlyBracketKeyword_14());
            		
            otherlv_15=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getParafarmaciaAccess().getRightCurlyBracketKeyword_15());
            		

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
    // $ANTLR end "ruleParafarmacia"


    // $ANTLR start "entryRuleApariencia"
    // InternalParafarmacia.g:205:1: entryRuleApariencia returns [EObject current=null] : iv_ruleApariencia= ruleApariencia EOF ;
    public final EObject entryRuleApariencia() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApariencia = null;


        try {
            // InternalParafarmacia.g:205:51: (iv_ruleApariencia= ruleApariencia EOF )
            // InternalParafarmacia.g:206:2: iv_ruleApariencia= ruleApariencia EOF
            {
             newCompositeNode(grammarAccess.getAparienciaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleApariencia=ruleApariencia();

            state._fsp--;

             current =iv_ruleApariencia; 
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
    // $ANTLR end "entryRuleApariencia"


    // $ANTLR start "ruleApariencia"
    // InternalParafarmacia.g:212:1: ruleApariencia returns [EObject current=null] : (otherlv_0= 'Color' otherlv_1= '{' otherlv_2= 'FondoPrincipal' otherlv_3= '=' ( (lv_colorFondo1_4_0= ruleColor ) ) otherlv_5= ';' otherlv_6= 'FondoSecundario' otherlv_7= '=' ( (lv_colorFondo2_8_0= ruleColor ) ) otherlv_9= ';' otherlv_10= 'Texto' otherlv_11= '=' ( (lv_colorTexto_12_0= ruleColor ) ) otherlv_13= ';' otherlv_14= '}' otherlv_15= 'Fuente' otherlv_16= '{' otherlv_17= 'Titulo' otherlv_18= '{' otherlv_19= 'SizeH1' otherlv_20= '=' ( (lv_sizeFuenteH1_21_0= RULE_INT ) ) otherlv_22= 'px' otherlv_23= ';' otherlv_24= 'SizeH2' otherlv_25= '=' ( (lv_sizeFuenteH2_26_0= RULE_INT ) ) otherlv_27= 'px' otherlv_28= ';' otherlv_29= '}' otherlv_30= 'Cuerpo' otherlv_31= '{' otherlv_32= 'Size' otherlv_33= '=' ( (lv_sizeFuenteCuerpo_34_0= RULE_INT ) ) otherlv_35= 'px' otherlv_36= ';' otherlv_37= '}' otherlv_38= '}' ) ;
    public final EObject ruleApariencia() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token lv_sizeFuenteH1_21_0=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token lv_sizeFuenteH2_26_0=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        Token lv_sizeFuenteCuerpo_34_0=null;
        Token otherlv_35=null;
        Token otherlv_36=null;
        Token otherlv_37=null;
        Token otherlv_38=null;
        AntlrDatatypeRuleToken lv_colorFondo1_4_0 = null;

        AntlrDatatypeRuleToken lv_colorFondo2_8_0 = null;

        AntlrDatatypeRuleToken lv_colorTexto_12_0 = null;



        	enterRule();

        try {
            // InternalParafarmacia.g:218:2: ( (otherlv_0= 'Color' otherlv_1= '{' otherlv_2= 'FondoPrincipal' otherlv_3= '=' ( (lv_colorFondo1_4_0= ruleColor ) ) otherlv_5= ';' otherlv_6= 'FondoSecundario' otherlv_7= '=' ( (lv_colorFondo2_8_0= ruleColor ) ) otherlv_9= ';' otherlv_10= 'Texto' otherlv_11= '=' ( (lv_colorTexto_12_0= ruleColor ) ) otherlv_13= ';' otherlv_14= '}' otherlv_15= 'Fuente' otherlv_16= '{' otherlv_17= 'Titulo' otherlv_18= '{' otherlv_19= 'SizeH1' otherlv_20= '=' ( (lv_sizeFuenteH1_21_0= RULE_INT ) ) otherlv_22= 'px' otherlv_23= ';' otherlv_24= 'SizeH2' otherlv_25= '=' ( (lv_sizeFuenteH2_26_0= RULE_INT ) ) otherlv_27= 'px' otherlv_28= ';' otherlv_29= '}' otherlv_30= 'Cuerpo' otherlv_31= '{' otherlv_32= 'Size' otherlv_33= '=' ( (lv_sizeFuenteCuerpo_34_0= RULE_INT ) ) otherlv_35= 'px' otherlv_36= ';' otherlv_37= '}' otherlv_38= '}' ) )
            // InternalParafarmacia.g:219:2: (otherlv_0= 'Color' otherlv_1= '{' otherlv_2= 'FondoPrincipal' otherlv_3= '=' ( (lv_colorFondo1_4_0= ruleColor ) ) otherlv_5= ';' otherlv_6= 'FondoSecundario' otherlv_7= '=' ( (lv_colorFondo2_8_0= ruleColor ) ) otherlv_9= ';' otherlv_10= 'Texto' otherlv_11= '=' ( (lv_colorTexto_12_0= ruleColor ) ) otherlv_13= ';' otherlv_14= '}' otherlv_15= 'Fuente' otherlv_16= '{' otherlv_17= 'Titulo' otherlv_18= '{' otherlv_19= 'SizeH1' otherlv_20= '=' ( (lv_sizeFuenteH1_21_0= RULE_INT ) ) otherlv_22= 'px' otherlv_23= ';' otherlv_24= 'SizeH2' otherlv_25= '=' ( (lv_sizeFuenteH2_26_0= RULE_INT ) ) otherlv_27= 'px' otherlv_28= ';' otherlv_29= '}' otherlv_30= 'Cuerpo' otherlv_31= '{' otherlv_32= 'Size' otherlv_33= '=' ( (lv_sizeFuenteCuerpo_34_0= RULE_INT ) ) otherlv_35= 'px' otherlv_36= ';' otherlv_37= '}' otherlv_38= '}' )
            {
            // InternalParafarmacia.g:219:2: (otherlv_0= 'Color' otherlv_1= '{' otherlv_2= 'FondoPrincipal' otherlv_3= '=' ( (lv_colorFondo1_4_0= ruleColor ) ) otherlv_5= ';' otherlv_6= 'FondoSecundario' otherlv_7= '=' ( (lv_colorFondo2_8_0= ruleColor ) ) otherlv_9= ';' otherlv_10= 'Texto' otherlv_11= '=' ( (lv_colorTexto_12_0= ruleColor ) ) otherlv_13= ';' otherlv_14= '}' otherlv_15= 'Fuente' otherlv_16= '{' otherlv_17= 'Titulo' otherlv_18= '{' otherlv_19= 'SizeH1' otherlv_20= '=' ( (lv_sizeFuenteH1_21_0= RULE_INT ) ) otherlv_22= 'px' otherlv_23= ';' otherlv_24= 'SizeH2' otherlv_25= '=' ( (lv_sizeFuenteH2_26_0= RULE_INT ) ) otherlv_27= 'px' otherlv_28= ';' otherlv_29= '}' otherlv_30= 'Cuerpo' otherlv_31= '{' otherlv_32= 'Size' otherlv_33= '=' ( (lv_sizeFuenteCuerpo_34_0= RULE_INT ) ) otherlv_35= 'px' otherlv_36= ';' otherlv_37= '}' otherlv_38= '}' )
            // InternalParafarmacia.g:220:3: otherlv_0= 'Color' otherlv_1= '{' otherlv_2= 'FondoPrincipal' otherlv_3= '=' ( (lv_colorFondo1_4_0= ruleColor ) ) otherlv_5= ';' otherlv_6= 'FondoSecundario' otherlv_7= '=' ( (lv_colorFondo2_8_0= ruleColor ) ) otherlv_9= ';' otherlv_10= 'Texto' otherlv_11= '=' ( (lv_colorTexto_12_0= ruleColor ) ) otherlv_13= ';' otherlv_14= '}' otherlv_15= 'Fuente' otherlv_16= '{' otherlv_17= 'Titulo' otherlv_18= '{' otherlv_19= 'SizeH1' otherlv_20= '=' ( (lv_sizeFuenteH1_21_0= RULE_INT ) ) otherlv_22= 'px' otherlv_23= ';' otherlv_24= 'SizeH2' otherlv_25= '=' ( (lv_sizeFuenteH2_26_0= RULE_INT ) ) otherlv_27= 'px' otherlv_28= ';' otherlv_29= '}' otherlv_30= 'Cuerpo' otherlv_31= '{' otherlv_32= 'Size' otherlv_33= '=' ( (lv_sizeFuenteCuerpo_34_0= RULE_INT ) ) otherlv_35= 'px' otherlv_36= ';' otherlv_37= '}' otherlv_38= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAparienciaAccess().getColorKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getAparienciaAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getAparienciaAccess().getFondoPrincipalKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getAparienciaAccess().getEqualsSignKeyword_3());
            		
            // InternalParafarmacia.g:236:3: ( (lv_colorFondo1_4_0= ruleColor ) )
            // InternalParafarmacia.g:237:4: (lv_colorFondo1_4_0= ruleColor )
            {
            // InternalParafarmacia.g:237:4: (lv_colorFondo1_4_0= ruleColor )
            // InternalParafarmacia.g:238:5: lv_colorFondo1_4_0= ruleColor
            {

            					newCompositeNode(grammarAccess.getAparienciaAccess().getColorFondo1ColorParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_7);
            lv_colorFondo1_4_0=ruleColor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAparienciaRule());
            					}
            					set(
            						current,
            						"colorFondo1",
            						lv_colorFondo1_4_0,
            						"org.xtext.dsl.parafarmacia.Parafarmacia.Color");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_15); 

            			newLeafNode(otherlv_5, grammarAccess.getAparienciaAccess().getSemicolonKeyword_5());
            		
            otherlv_6=(Token)match(input,21,FOLLOW_5); 

            			newLeafNode(otherlv_6, grammarAccess.getAparienciaAccess().getFondoSecundarioKeyword_6());
            		
            otherlv_7=(Token)match(input,14,FOLLOW_14); 

            			newLeafNode(otherlv_7, grammarAccess.getAparienciaAccess().getEqualsSignKeyword_7());
            		
            // InternalParafarmacia.g:267:3: ( (lv_colorFondo2_8_0= ruleColor ) )
            // InternalParafarmacia.g:268:4: (lv_colorFondo2_8_0= ruleColor )
            {
            // InternalParafarmacia.g:268:4: (lv_colorFondo2_8_0= ruleColor )
            // InternalParafarmacia.g:269:5: lv_colorFondo2_8_0= ruleColor
            {

            					newCompositeNode(grammarAccess.getAparienciaAccess().getColorFondo2ColorParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_7);
            lv_colorFondo2_8_0=ruleColor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAparienciaRule());
            					}
            					set(
            						current,
            						"colorFondo2",
            						lv_colorFondo2_8_0,
            						"org.xtext.dsl.parafarmacia.Parafarmacia.Color");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,15,FOLLOW_16); 

            			newLeafNode(otherlv_9, grammarAccess.getAparienciaAccess().getSemicolonKeyword_9());
            		
            otherlv_10=(Token)match(input,22,FOLLOW_5); 

            			newLeafNode(otherlv_10, grammarAccess.getAparienciaAccess().getTextoKeyword_10());
            		
            otherlv_11=(Token)match(input,14,FOLLOW_14); 

            			newLeafNode(otherlv_11, grammarAccess.getAparienciaAccess().getEqualsSignKeyword_11());
            		
            // InternalParafarmacia.g:298:3: ( (lv_colorTexto_12_0= ruleColor ) )
            // InternalParafarmacia.g:299:4: (lv_colorTexto_12_0= ruleColor )
            {
            // InternalParafarmacia.g:299:4: (lv_colorTexto_12_0= ruleColor )
            // InternalParafarmacia.g:300:5: lv_colorTexto_12_0= ruleColor
            {

            					newCompositeNode(grammarAccess.getAparienciaAccess().getColorTextoColorParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_7);
            lv_colorTexto_12_0=ruleColor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAparienciaRule());
            					}
            					set(
            						current,
            						"colorTexto",
            						lv_colorTexto_12_0,
            						"org.xtext.dsl.parafarmacia.Parafarmacia.Color");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_13=(Token)match(input,15,FOLLOW_12); 

            			newLeafNode(otherlv_13, grammarAccess.getAparienciaAccess().getSemicolonKeyword_13());
            		
            otherlv_14=(Token)match(input,18,FOLLOW_17); 

            			newLeafNode(otherlv_14, grammarAccess.getAparienciaAccess().getRightCurlyBracketKeyword_14());
            		
            otherlv_15=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_15, grammarAccess.getAparienciaAccess().getFuenteKeyword_15());
            		
            otherlv_16=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_16, grammarAccess.getAparienciaAccess().getLeftCurlyBracketKeyword_16());
            		
            otherlv_17=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_17, grammarAccess.getAparienciaAccess().getTituloKeyword_17());
            		
            otherlv_18=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_18, grammarAccess.getAparienciaAccess().getLeftCurlyBracketKeyword_18());
            		
            otherlv_19=(Token)match(input,24,FOLLOW_5); 

            			newLeafNode(otherlv_19, grammarAccess.getAparienciaAccess().getSizeH1Keyword_19());
            		
            otherlv_20=(Token)match(input,14,FOLLOW_19); 

            			newLeafNode(otherlv_20, grammarAccess.getAparienciaAccess().getEqualsSignKeyword_20());
            		
            // InternalParafarmacia.g:349:3: ( (lv_sizeFuenteH1_21_0= RULE_INT ) )
            // InternalParafarmacia.g:350:4: (lv_sizeFuenteH1_21_0= RULE_INT )
            {
            // InternalParafarmacia.g:350:4: (lv_sizeFuenteH1_21_0= RULE_INT )
            // InternalParafarmacia.g:351:5: lv_sizeFuenteH1_21_0= RULE_INT
            {
            lv_sizeFuenteH1_21_0=(Token)match(input,RULE_INT,FOLLOW_20); 

            					newLeafNode(lv_sizeFuenteH1_21_0, grammarAccess.getAparienciaAccess().getSizeFuenteH1INTTerminalRuleCall_21_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAparienciaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"sizeFuenteH1",
            						lv_sizeFuenteH1_21_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_22=(Token)match(input,25,FOLLOW_7); 

            			newLeafNode(otherlv_22, grammarAccess.getAparienciaAccess().getPxKeyword_22());
            		
            otherlv_23=(Token)match(input,15,FOLLOW_21); 

            			newLeafNode(otherlv_23, grammarAccess.getAparienciaAccess().getSemicolonKeyword_23());
            		
            otherlv_24=(Token)match(input,26,FOLLOW_5); 

            			newLeafNode(otherlv_24, grammarAccess.getAparienciaAccess().getSizeH2Keyword_24());
            		
            otherlv_25=(Token)match(input,14,FOLLOW_19); 

            			newLeafNode(otherlv_25, grammarAccess.getAparienciaAccess().getEqualsSignKeyword_25());
            		
            // InternalParafarmacia.g:383:3: ( (lv_sizeFuenteH2_26_0= RULE_INT ) )
            // InternalParafarmacia.g:384:4: (lv_sizeFuenteH2_26_0= RULE_INT )
            {
            // InternalParafarmacia.g:384:4: (lv_sizeFuenteH2_26_0= RULE_INT )
            // InternalParafarmacia.g:385:5: lv_sizeFuenteH2_26_0= RULE_INT
            {
            lv_sizeFuenteH2_26_0=(Token)match(input,RULE_INT,FOLLOW_20); 

            					newLeafNode(lv_sizeFuenteH2_26_0, grammarAccess.getAparienciaAccess().getSizeFuenteH2INTTerminalRuleCall_26_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAparienciaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"sizeFuenteH2",
            						lv_sizeFuenteH2_26_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_27=(Token)match(input,25,FOLLOW_7); 

            			newLeafNode(otherlv_27, grammarAccess.getAparienciaAccess().getPxKeyword_27());
            		
            otherlv_28=(Token)match(input,15,FOLLOW_12); 

            			newLeafNode(otherlv_28, grammarAccess.getAparienciaAccess().getSemicolonKeyword_28());
            		
            otherlv_29=(Token)match(input,18,FOLLOW_22); 

            			newLeafNode(otherlv_29, grammarAccess.getAparienciaAccess().getRightCurlyBracketKeyword_29());
            		
            otherlv_30=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_30, grammarAccess.getAparienciaAccess().getCuerpoKeyword_30());
            		
            otherlv_31=(Token)match(input,12,FOLLOW_23); 

            			newLeafNode(otherlv_31, grammarAccess.getAparienciaAccess().getLeftCurlyBracketKeyword_31());
            		
            otherlv_32=(Token)match(input,28,FOLLOW_5); 

            			newLeafNode(otherlv_32, grammarAccess.getAparienciaAccess().getSizeKeyword_32());
            		
            otherlv_33=(Token)match(input,14,FOLLOW_19); 

            			newLeafNode(otherlv_33, grammarAccess.getAparienciaAccess().getEqualsSignKeyword_33());
            		
            // InternalParafarmacia.g:429:3: ( (lv_sizeFuenteCuerpo_34_0= RULE_INT ) )
            // InternalParafarmacia.g:430:4: (lv_sizeFuenteCuerpo_34_0= RULE_INT )
            {
            // InternalParafarmacia.g:430:4: (lv_sizeFuenteCuerpo_34_0= RULE_INT )
            // InternalParafarmacia.g:431:5: lv_sizeFuenteCuerpo_34_0= RULE_INT
            {
            lv_sizeFuenteCuerpo_34_0=(Token)match(input,RULE_INT,FOLLOW_20); 

            					newLeafNode(lv_sizeFuenteCuerpo_34_0, grammarAccess.getAparienciaAccess().getSizeFuenteCuerpoINTTerminalRuleCall_34_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAparienciaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"sizeFuenteCuerpo",
            						lv_sizeFuenteCuerpo_34_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_35=(Token)match(input,25,FOLLOW_7); 

            			newLeafNode(otherlv_35, grammarAccess.getAparienciaAccess().getPxKeyword_35());
            		
            otherlv_36=(Token)match(input,15,FOLLOW_12); 

            			newLeafNode(otherlv_36, grammarAccess.getAparienciaAccess().getSemicolonKeyword_36());
            		
            otherlv_37=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_37, grammarAccess.getAparienciaAccess().getRightCurlyBracketKeyword_37());
            		
            otherlv_38=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_38, grammarAccess.getAparienciaAccess().getRightCurlyBracketKeyword_38());
            		

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
    // $ANTLR end "ruleApariencia"


    // $ANTLR start "entryRulePagina"
    // InternalParafarmacia.g:467:1: entryRulePagina returns [EObject current=null] : iv_rulePagina= rulePagina EOF ;
    public final EObject entryRulePagina() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePagina = null;


        try {
            // InternalParafarmacia.g:467:47: (iv_rulePagina= rulePagina EOF )
            // InternalParafarmacia.g:468:2: iv_rulePagina= rulePagina EOF
            {
             newCompositeNode(grammarAccess.getPaginaRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePagina=rulePagina();

            state._fsp--;

             current =iv_rulePagina; 
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
    // $ANTLR end "entryRulePagina"


    // $ANTLR start "rulePagina"
    // InternalParafarmacia.g:474:1: rulePagina returns [EObject current=null] : (otherlv_0= 'Pagina' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' otherlv_3= 'Titulo' ( (lv_titulo_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'Cuerpo' otherlv_7= '{' ( (lv_cuerpo_8_0= ruleCuerpo ) ) otherlv_9= '}' ) ;
    public final EObject rulePagina() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_titulo_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_cuerpo_8_0 = null;



        	enterRule();

        try {
            // InternalParafarmacia.g:480:2: ( (otherlv_0= 'Pagina' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' otherlv_3= 'Titulo' ( (lv_titulo_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'Cuerpo' otherlv_7= '{' ( (lv_cuerpo_8_0= ruleCuerpo ) ) otherlv_9= '}' ) )
            // InternalParafarmacia.g:481:2: (otherlv_0= 'Pagina' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' otherlv_3= 'Titulo' ( (lv_titulo_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'Cuerpo' otherlv_7= '{' ( (lv_cuerpo_8_0= ruleCuerpo ) ) otherlv_9= '}' )
            {
            // InternalParafarmacia.g:481:2: (otherlv_0= 'Pagina' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' otherlv_3= 'Titulo' ( (lv_titulo_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'Cuerpo' otherlv_7= '{' ( (lv_cuerpo_8_0= ruleCuerpo ) ) otherlv_9= '}' )
            // InternalParafarmacia.g:482:3: otherlv_0= 'Pagina' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' otherlv_3= 'Titulo' ( (lv_titulo_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'Cuerpo' otherlv_7= '{' ( (lv_cuerpo_8_0= ruleCuerpo ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getPaginaAccess().getPaginaKeyword_0());
            		
            // InternalParafarmacia.g:486:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalParafarmacia.g:487:4: (lv_name_1_0= RULE_ID )
            {
            // InternalParafarmacia.g:487:4: (lv_name_1_0= RULE_ID )
            // InternalParafarmacia.g:488:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPaginaAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPaginaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getPaginaAccess().getSemicolonKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getPaginaAccess().getTituloKeyword_3());
            		
            // InternalParafarmacia.g:512:3: ( (lv_titulo_4_0= RULE_STRING ) )
            // InternalParafarmacia.g:513:4: (lv_titulo_4_0= RULE_STRING )
            {
            // InternalParafarmacia.g:513:4: (lv_titulo_4_0= RULE_STRING )
            // InternalParafarmacia.g:514:5: lv_titulo_4_0= RULE_STRING
            {
            lv_titulo_4_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            					newLeafNode(lv_titulo_4_0, grammarAccess.getPaginaAccess().getTituloSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPaginaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"titulo",
            						lv_titulo_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_22); 

            			newLeafNode(otherlv_5, grammarAccess.getPaginaAccess().getSemicolonKeyword_5());
            		
            otherlv_6=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getPaginaAccess().getCuerpoKeyword_6());
            		
            otherlv_7=(Token)match(input,12,FOLLOW_25); 

            			newLeafNode(otherlv_7, grammarAccess.getPaginaAccess().getLeftCurlyBracketKeyword_7());
            		
            // InternalParafarmacia.g:542:3: ( (lv_cuerpo_8_0= ruleCuerpo ) )
            // InternalParafarmacia.g:543:4: (lv_cuerpo_8_0= ruleCuerpo )
            {
            // InternalParafarmacia.g:543:4: (lv_cuerpo_8_0= ruleCuerpo )
            // InternalParafarmacia.g:544:5: lv_cuerpo_8_0= ruleCuerpo
            {

            					newCompositeNode(grammarAccess.getPaginaAccess().getCuerpoCuerpoParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_12);
            lv_cuerpo_8_0=ruleCuerpo();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPaginaRule());
            					}
            					set(
            						current,
            						"cuerpo",
            						lv_cuerpo_8_0,
            						"org.xtext.dsl.parafarmacia.Parafarmacia.Cuerpo");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getPaginaAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "rulePagina"


    // $ANTLR start "entryRuleCuerpo"
    // InternalParafarmacia.g:569:1: entryRuleCuerpo returns [EObject current=null] : iv_ruleCuerpo= ruleCuerpo EOF ;
    public final EObject entryRuleCuerpo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCuerpo = null;


        try {
            // InternalParafarmacia.g:569:47: (iv_ruleCuerpo= ruleCuerpo EOF )
            // InternalParafarmacia.g:570:2: iv_ruleCuerpo= ruleCuerpo EOF
            {
             newCompositeNode(grammarAccess.getCuerpoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCuerpo=ruleCuerpo();

            state._fsp--;

             current =iv_ruleCuerpo; 
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
    // $ANTLR end "entryRuleCuerpo"


    // $ANTLR start "ruleCuerpo"
    // InternalParafarmacia.g:576:1: ruleCuerpo returns [EObject current=null] : ( ( ( (lv_texto_0_0= RULE_STRING ) ) otherlv_1= ';' ) | ( (lv_productos_2_0= ruleProducto ) )* ) ;
    public final EObject ruleCuerpo() throws RecognitionException {
        EObject current = null;

        Token lv_texto_0_0=null;
        Token otherlv_1=null;
        EObject lv_productos_2_0 = null;



        	enterRule();

        try {
            // InternalParafarmacia.g:582:2: ( ( ( ( (lv_texto_0_0= RULE_STRING ) ) otherlv_1= ';' ) | ( (lv_productos_2_0= ruleProducto ) )* ) )
            // InternalParafarmacia.g:583:2: ( ( ( (lv_texto_0_0= RULE_STRING ) ) otherlv_1= ';' ) | ( (lv_productos_2_0= ruleProducto ) )* )
            {
            // InternalParafarmacia.g:583:2: ( ( ( (lv_texto_0_0= RULE_STRING ) ) otherlv_1= ';' ) | ( (lv_productos_2_0= ruleProducto ) )* )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==EOF||LA3_0==18||LA3_0==30) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalParafarmacia.g:584:3: ( ( (lv_texto_0_0= RULE_STRING ) ) otherlv_1= ';' )
                    {
                    // InternalParafarmacia.g:584:3: ( ( (lv_texto_0_0= RULE_STRING ) ) otherlv_1= ';' )
                    // InternalParafarmacia.g:585:4: ( (lv_texto_0_0= RULE_STRING ) ) otherlv_1= ';'
                    {
                    // InternalParafarmacia.g:585:4: ( (lv_texto_0_0= RULE_STRING ) )
                    // InternalParafarmacia.g:586:5: (lv_texto_0_0= RULE_STRING )
                    {
                    // InternalParafarmacia.g:586:5: (lv_texto_0_0= RULE_STRING )
                    // InternalParafarmacia.g:587:6: lv_texto_0_0= RULE_STRING
                    {
                    lv_texto_0_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

                    						newLeafNode(lv_texto_0_0, grammarAccess.getCuerpoAccess().getTextoSTRINGTerminalRuleCall_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCuerpoRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"texto",
                    							lv_texto_0_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getCuerpoAccess().getSemicolonKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalParafarmacia.g:609:3: ( (lv_productos_2_0= ruleProducto ) )*
                    {
                    // InternalParafarmacia.g:609:3: ( (lv_productos_2_0= ruleProducto ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==30) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalParafarmacia.g:610:4: (lv_productos_2_0= ruleProducto )
                    	    {
                    	    // InternalParafarmacia.g:610:4: (lv_productos_2_0= ruleProducto )
                    	    // InternalParafarmacia.g:611:5: lv_productos_2_0= ruleProducto
                    	    {

                    	    					newCompositeNode(grammarAccess.getCuerpoAccess().getProductosProductoParserRuleCall_1_0());
                    	    				
                    	    pushFollow(FOLLOW_26);
                    	    lv_productos_2_0=ruleProducto();

                    	    state._fsp--;


                    	    					if (current==null) {
                    	    						current = createModelElementForParent(grammarAccess.getCuerpoRule());
                    	    					}
                    	    					add(
                    	    						current,
                    	    						"productos",
                    	    						lv_productos_2_0,
                    	    						"org.xtext.dsl.parafarmacia.Parafarmacia.Producto");
                    	    					afterParserOrEnumRuleCall();
                    	    				

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


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
    // $ANTLR end "ruleCuerpo"


    // $ANTLR start "entryRuleProducto"
    // InternalParafarmacia.g:632:1: entryRuleProducto returns [EObject current=null] : iv_ruleProducto= ruleProducto EOF ;
    public final EObject entryRuleProducto() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProducto = null;


        try {
            // InternalParafarmacia.g:632:49: (iv_ruleProducto= ruleProducto EOF )
            // InternalParafarmacia.g:633:2: iv_ruleProducto= ruleProducto EOF
            {
             newCompositeNode(grammarAccess.getProductoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProducto=ruleProducto();

            state._fsp--;

             current =iv_ruleProducto; 
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
    // $ANTLR end "entryRuleProducto"


    // $ANTLR start "ruleProducto"
    // InternalParafarmacia.g:639:1: ruleProducto returns [EObject current=null] : (otherlv_0= 'Producto' ( (lv_name_1_0= RULE_ID ) ) ( (lv_nombre_2_0= RULE_STRING ) ) ( (lv_precio_3_0= rulePrecio ) ) (otherlv_4= 'imagen' ( (lv_imagen_5_0= RULE_STRING ) ) )? ( (lv_conreceta_6_0= 'con receta' ) )? (otherlv_7= 'descripcion' ( (lv_descripcion_8_0= RULE_STRING ) ) ) otherlv_9= ';' ) ;
    public final EObject ruleProducto() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_nombre_2_0=null;
        Token otherlv_4=null;
        Token lv_imagen_5_0=null;
        Token lv_conreceta_6_0=null;
        Token otherlv_7=null;
        Token lv_descripcion_8_0=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_precio_3_0 = null;



        	enterRule();

        try {
            // InternalParafarmacia.g:645:2: ( (otherlv_0= 'Producto' ( (lv_name_1_0= RULE_ID ) ) ( (lv_nombre_2_0= RULE_STRING ) ) ( (lv_precio_3_0= rulePrecio ) ) (otherlv_4= 'imagen' ( (lv_imagen_5_0= RULE_STRING ) ) )? ( (lv_conreceta_6_0= 'con receta' ) )? (otherlv_7= 'descripcion' ( (lv_descripcion_8_0= RULE_STRING ) ) ) otherlv_9= ';' ) )
            // InternalParafarmacia.g:646:2: (otherlv_0= 'Producto' ( (lv_name_1_0= RULE_ID ) ) ( (lv_nombre_2_0= RULE_STRING ) ) ( (lv_precio_3_0= rulePrecio ) ) (otherlv_4= 'imagen' ( (lv_imagen_5_0= RULE_STRING ) ) )? ( (lv_conreceta_6_0= 'con receta' ) )? (otherlv_7= 'descripcion' ( (lv_descripcion_8_0= RULE_STRING ) ) ) otherlv_9= ';' )
            {
            // InternalParafarmacia.g:646:2: (otherlv_0= 'Producto' ( (lv_name_1_0= RULE_ID ) ) ( (lv_nombre_2_0= RULE_STRING ) ) ( (lv_precio_3_0= rulePrecio ) ) (otherlv_4= 'imagen' ( (lv_imagen_5_0= RULE_STRING ) ) )? ( (lv_conreceta_6_0= 'con receta' ) )? (otherlv_7= 'descripcion' ( (lv_descripcion_8_0= RULE_STRING ) ) ) otherlv_9= ';' )
            // InternalParafarmacia.g:647:3: otherlv_0= 'Producto' ( (lv_name_1_0= RULE_ID ) ) ( (lv_nombre_2_0= RULE_STRING ) ) ( (lv_precio_3_0= rulePrecio ) ) (otherlv_4= 'imagen' ( (lv_imagen_5_0= RULE_STRING ) ) )? ( (lv_conreceta_6_0= 'con receta' ) )? (otherlv_7= 'descripcion' ( (lv_descripcion_8_0= RULE_STRING ) ) ) otherlv_9= ';'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getProductoAccess().getProductoKeyword_0());
            		
            // InternalParafarmacia.g:651:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalParafarmacia.g:652:4: (lv_name_1_0= RULE_ID )
            {
            // InternalParafarmacia.g:652:4: (lv_name_1_0= RULE_ID )
            // InternalParafarmacia.g:653:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getProductoAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProductoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalParafarmacia.g:669:3: ( (lv_nombre_2_0= RULE_STRING ) )
            // InternalParafarmacia.g:670:4: (lv_nombre_2_0= RULE_STRING )
            {
            // InternalParafarmacia.g:670:4: (lv_nombre_2_0= RULE_STRING )
            // InternalParafarmacia.g:671:5: lv_nombre_2_0= RULE_STRING
            {
            lv_nombre_2_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

            					newLeafNode(lv_nombre_2_0, grammarAccess.getProductoAccess().getNombreSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProductoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"nombre",
            						lv_nombre_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalParafarmacia.g:687:3: ( (lv_precio_3_0= rulePrecio ) )
            // InternalParafarmacia.g:688:4: (lv_precio_3_0= rulePrecio )
            {
            // InternalParafarmacia.g:688:4: (lv_precio_3_0= rulePrecio )
            // InternalParafarmacia.g:689:5: lv_precio_3_0= rulePrecio
            {

            					newCompositeNode(grammarAccess.getProductoAccess().getPrecioPrecioParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_27);
            lv_precio_3_0=rulePrecio();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProductoRule());
            					}
            					set(
            						current,
            						"precio",
            						lv_precio_3_0,
            						"org.xtext.dsl.parafarmacia.Parafarmacia.Precio");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalParafarmacia.g:706:3: (otherlv_4= 'imagen' ( (lv_imagen_5_0= RULE_STRING ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==31) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalParafarmacia.g:707:4: otherlv_4= 'imagen' ( (lv_imagen_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,31,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getProductoAccess().getImagenKeyword_4_0());
                    			
                    // InternalParafarmacia.g:711:4: ( (lv_imagen_5_0= RULE_STRING ) )
                    // InternalParafarmacia.g:712:5: (lv_imagen_5_0= RULE_STRING )
                    {
                    // InternalParafarmacia.g:712:5: (lv_imagen_5_0= RULE_STRING )
                    // InternalParafarmacia.g:713:6: lv_imagen_5_0= RULE_STRING
                    {
                    lv_imagen_5_0=(Token)match(input,RULE_STRING,FOLLOW_28); 

                    						newLeafNode(lv_imagen_5_0, grammarAccess.getProductoAccess().getImagenSTRINGTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getProductoRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"imagen",
                    							lv_imagen_5_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalParafarmacia.g:730:3: ( (lv_conreceta_6_0= 'con receta' ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==32) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalParafarmacia.g:731:4: (lv_conreceta_6_0= 'con receta' )
                    {
                    // InternalParafarmacia.g:731:4: (lv_conreceta_6_0= 'con receta' )
                    // InternalParafarmacia.g:732:5: lv_conreceta_6_0= 'con receta'
                    {
                    lv_conreceta_6_0=(Token)match(input,32,FOLLOW_29); 

                    					newLeafNode(lv_conreceta_6_0, grammarAccess.getProductoAccess().getConrecetaConRecetaKeyword_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getProductoRule());
                    					}
                    					setWithLastConsumed(current, "conreceta", true, "con receta");
                    				

                    }


                    }
                    break;

            }

            // InternalParafarmacia.g:744:3: (otherlv_7= 'descripcion' ( (lv_descripcion_8_0= RULE_STRING ) ) )
            // InternalParafarmacia.g:745:4: otherlv_7= 'descripcion' ( (lv_descripcion_8_0= RULE_STRING ) )
            {
            otherlv_7=(Token)match(input,33,FOLLOW_6); 

            				newLeafNode(otherlv_7, grammarAccess.getProductoAccess().getDescripcionKeyword_6_0());
            			
            // InternalParafarmacia.g:749:4: ( (lv_descripcion_8_0= RULE_STRING ) )
            // InternalParafarmacia.g:750:5: (lv_descripcion_8_0= RULE_STRING )
            {
            // InternalParafarmacia.g:750:5: (lv_descripcion_8_0= RULE_STRING )
            // InternalParafarmacia.g:751:6: lv_descripcion_8_0= RULE_STRING
            {
            lv_descripcion_8_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            						newLeafNode(lv_descripcion_8_0, grammarAccess.getProductoAccess().getDescripcionSTRINGTerminalRuleCall_6_1_0());
            					

            						if (current==null) {
            							current = createModelElement(grammarAccess.getProductoRule());
            						}
            						setWithLastConsumed(
            							current,
            							"descripcion",
            							lv_descripcion_8_0,
            							"org.eclipse.xtext.common.Terminals.STRING");
            					

            }


            }


            }

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getProductoAccess().getSemicolonKeyword_7());
            		

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
    // $ANTLR end "ruleProducto"


    // $ANTLR start "entryRulePrecio"
    // InternalParafarmacia.g:776:1: entryRulePrecio returns [String current=null] : iv_rulePrecio= rulePrecio EOF ;
    public final String entryRulePrecio() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrecio = null;


        try {
            // InternalParafarmacia.g:776:46: (iv_rulePrecio= rulePrecio EOF )
            // InternalParafarmacia.g:777:2: iv_rulePrecio= rulePrecio EOF
            {
             newCompositeNode(grammarAccess.getPrecioRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrecio=rulePrecio();

            state._fsp--;

             current =iv_rulePrecio.getText(); 
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
    // $ANTLR end "entryRulePrecio"


    // $ANTLR start "rulePrecio"
    // InternalParafarmacia.g:783:1: rulePrecio returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken rulePrecio() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalParafarmacia.g:789:2: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) )
            // InternalParafarmacia.g:790:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            {
            // InternalParafarmacia.g:790:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            // InternalParafarmacia.g:791:3: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_30); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getPrecioAccess().getINTTerminalRuleCall_0());
            		
            kw=(Token)match(input,34,FOLLOW_19); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getPrecioAccess().getFullStopKeyword_1());
            		
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_2);
            		

            			newLeafNode(this_INT_2, grammarAccess.getPrecioAccess().getINTTerminalRuleCall_2());
            		

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
    // $ANTLR end "rulePrecio"


    // $ANTLR start "entryRuleColor"
    // InternalParafarmacia.g:814:1: entryRuleColor returns [String current=null] : iv_ruleColor= ruleColor EOF ;
    public final String entryRuleColor() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleColor = null;


        try {
            // InternalParafarmacia.g:814:45: (iv_ruleColor= ruleColor EOF )
            // InternalParafarmacia.g:815:2: iv_ruleColor= ruleColor EOF
            {
             newCompositeNode(grammarAccess.getColorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColor=ruleColor();

            state._fsp--;

             current =iv_ruleColor.getText(); 
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
    // $ANTLR end "entryRuleColor"


    // $ANTLR start "ruleColor"
    // InternalParafarmacia.g:821:1: ruleColor returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '#' (this_ID_1= RULE_ID | this_INT_2= RULE_INT )+ ) ;
    public final AntlrDatatypeRuleToken ruleColor() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalParafarmacia.g:827:2: ( (kw= '#' (this_ID_1= RULE_ID | this_INT_2= RULE_INT )+ ) )
            // InternalParafarmacia.g:828:2: (kw= '#' (this_ID_1= RULE_ID | this_INT_2= RULE_INT )+ )
            {
            // InternalParafarmacia.g:828:2: (kw= '#' (this_ID_1= RULE_ID | this_INT_2= RULE_INT )+ )
            // InternalParafarmacia.g:829:3: kw= '#' (this_ID_1= RULE_ID | this_INT_2= RULE_INT )+
            {
            kw=(Token)match(input,35,FOLLOW_31); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getColorAccess().getNumberSignKeyword_0());
            		
            // InternalParafarmacia.g:834:3: (this_ID_1= RULE_ID | this_INT_2= RULE_INT )+
            int cnt6=0;
            loop6:
            do {
                int alt6=3;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }
                else if ( (LA6_0==RULE_INT) ) {
                    alt6=2;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalParafarmacia.g:835:4: this_ID_1= RULE_ID
            	    {
            	    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_32); 

            	    				current.merge(this_ID_1);
            	    			

            	    				newLeafNode(this_ID_1, grammarAccess.getColorAccess().getIDTerminalRuleCall_1_0());
            	    			

            	    }
            	    break;
            	case 2 :
            	    // InternalParafarmacia.g:843:4: this_INT_2= RULE_INT
            	    {
            	    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_32); 

            	    				current.merge(this_INT_2);
            	    			

            	    				newLeafNode(this_INT_2, grammarAccess.getColorAccess().getINTTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


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
    // $ANTLR end "ruleColor"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000020040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000040040010L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000380000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000062L});

}