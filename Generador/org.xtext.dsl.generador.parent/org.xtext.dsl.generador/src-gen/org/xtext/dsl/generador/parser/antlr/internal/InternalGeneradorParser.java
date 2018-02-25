package org.xtext.dsl.generador.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.dsl.generador.services.GeneradorGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGeneradorParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Parafarmacia'", "'{'", "'<'", "'Nombre'", "'='", "':'", "'>'", "'Titular'", "'Menu'", "'Apariencia'", "'Categorias'", "'Productos'", "'Usuario'", "'}'", "'['", "'Color'", "']'", "'Texto'", "'Margen'", "'Producto'", "'.'", "'Cosmetica'", "'Higiene'", "'Salud'", "'Dietetica'", "'Bebes'", "'Desplegable'", "'Permanente'", "'#'", "'px'", "'%'", "'@'", "'Registro'", "'Direccion'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=6;
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
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__44=44;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalGeneradorParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGeneradorParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGeneradorParser.tokenNames; }
    public String getGrammarFileName() { return "InternalGenerador.g"; }



     	private GeneradorGrammarAccess grammarAccess;

        public InternalGeneradorParser(TokenStream input, GeneradorGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Parafarmacia";
       	}

       	@Override
       	protected GeneradorGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleParafarmacia"
    // InternalGenerador.g:64:1: entryRuleParafarmacia returns [EObject current=null] : iv_ruleParafarmacia= ruleParafarmacia EOF ;
    public final EObject entryRuleParafarmacia() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParafarmacia = null;


        try {
            // InternalGenerador.g:64:53: (iv_ruleParafarmacia= ruleParafarmacia EOF )
            // InternalGenerador.g:65:2: iv_ruleParafarmacia= ruleParafarmacia EOF
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
    // InternalGenerador.g:71:1: ruleParafarmacia returns [EObject current=null] : (otherlv_0= 'Parafarmacia' otherlv_1= '{' otherlv_2= '<' otherlv_3= 'Nombre' otherlv_4= '=' ( (lv_titulo_5_0= RULE_STRING ) ) otherlv_6= ':' ( (lv_fuente_7_0= RULE_STRING ) ) otherlv_8= '>' otherlv_9= '<' otherlv_10= 'Titular' otherlv_11= '=' ( (lv_nombre_12_0= RULE_STRING ) ) otherlv_13= ':' ( (lv_direccion_14_0= ruleDireccion ) ) otherlv_15= ':' ( (lv_cif_16_0= RULE_STRING ) ) otherlv_17= ':' ( (lv_registro_18_0= ruleRegistro ) ) otherlv_19= ':' ( (lv_correo_20_0= ruleCorreo ) ) otherlv_21= ':' ( (lv_telefono_22_0= RULE_INT ) ) otherlv_23= '>' otherlv_24= '<' otherlv_25= 'Menu' otherlv_26= '=' ( (lv_tipo_27_0= ruleTipo ) ) otherlv_28= '>' otherlv_29= '<' otherlv_30= 'Apariencia' otherlv_31= '=' ( (lv_apariencia_32_0= ruleApariencia ) ) otherlv_33= '>' otherlv_34= '<' otherlv_35= 'Categorias' otherlv_36= '=' ( (lv_categorias_37_0= ruleCategoria ) )* otherlv_38= '>' otherlv_39= '<' otherlv_40= 'Productos' otherlv_41= '=' ( (lv_numProductosPorFila_42_0= RULE_INT ) ) ( (lv_productos_43_0= ruleProducto ) )* otherlv_44= '>' otherlv_45= '<' otherlv_46= 'Usuario' otherlv_47= '=' ( (lv_nombreUsuario_48_0= RULE_STRING ) ) otherlv_49= ':' ( (lv_email_50_0= ruleCorreo ) ) otherlv_51= ':' ( (lv_password_52_0= RULE_STRING ) ) otherlv_53= '>' otherlv_54= '}' ) ;
    public final EObject ruleParafarmacia() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_titulo_5_0=null;
        Token otherlv_6=null;
        Token lv_fuente_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token lv_nombre_12_0=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token lv_cif_16_0=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token lv_telefono_22_0=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        Token otherlv_36=null;
        Token otherlv_38=null;
        Token otherlv_39=null;
        Token otherlv_40=null;
        Token otherlv_41=null;
        Token lv_numProductosPorFila_42_0=null;
        Token otherlv_44=null;
        Token otherlv_45=null;
        Token otherlv_46=null;
        Token otherlv_47=null;
        Token lv_nombreUsuario_48_0=null;
        Token otherlv_49=null;
        Token otherlv_51=null;
        Token lv_password_52_0=null;
        Token otherlv_53=null;
        Token otherlv_54=null;
        EObject lv_direccion_14_0 = null;

        EObject lv_registro_18_0 = null;

        AntlrDatatypeRuleToken lv_correo_20_0 = null;

        EObject lv_tipo_27_0 = null;

        EObject lv_apariencia_32_0 = null;

        AntlrDatatypeRuleToken lv_categorias_37_0 = null;

        EObject lv_productos_43_0 = null;

        AntlrDatatypeRuleToken lv_email_50_0 = null;



        	enterRule();

        try {
            // InternalGenerador.g:77:2: ( (otherlv_0= 'Parafarmacia' otherlv_1= '{' otherlv_2= '<' otherlv_3= 'Nombre' otherlv_4= '=' ( (lv_titulo_5_0= RULE_STRING ) ) otherlv_6= ':' ( (lv_fuente_7_0= RULE_STRING ) ) otherlv_8= '>' otherlv_9= '<' otherlv_10= 'Titular' otherlv_11= '=' ( (lv_nombre_12_0= RULE_STRING ) ) otherlv_13= ':' ( (lv_direccion_14_0= ruleDireccion ) ) otherlv_15= ':' ( (lv_cif_16_0= RULE_STRING ) ) otherlv_17= ':' ( (lv_registro_18_0= ruleRegistro ) ) otherlv_19= ':' ( (lv_correo_20_0= ruleCorreo ) ) otherlv_21= ':' ( (lv_telefono_22_0= RULE_INT ) ) otherlv_23= '>' otherlv_24= '<' otherlv_25= 'Menu' otherlv_26= '=' ( (lv_tipo_27_0= ruleTipo ) ) otherlv_28= '>' otherlv_29= '<' otherlv_30= 'Apariencia' otherlv_31= '=' ( (lv_apariencia_32_0= ruleApariencia ) ) otherlv_33= '>' otherlv_34= '<' otherlv_35= 'Categorias' otherlv_36= '=' ( (lv_categorias_37_0= ruleCategoria ) )* otherlv_38= '>' otherlv_39= '<' otherlv_40= 'Productos' otherlv_41= '=' ( (lv_numProductosPorFila_42_0= RULE_INT ) ) ( (lv_productos_43_0= ruleProducto ) )* otherlv_44= '>' otherlv_45= '<' otherlv_46= 'Usuario' otherlv_47= '=' ( (lv_nombreUsuario_48_0= RULE_STRING ) ) otherlv_49= ':' ( (lv_email_50_0= ruleCorreo ) ) otherlv_51= ':' ( (lv_password_52_0= RULE_STRING ) ) otherlv_53= '>' otherlv_54= '}' ) )
            // InternalGenerador.g:78:2: (otherlv_0= 'Parafarmacia' otherlv_1= '{' otherlv_2= '<' otherlv_3= 'Nombre' otherlv_4= '=' ( (lv_titulo_5_0= RULE_STRING ) ) otherlv_6= ':' ( (lv_fuente_7_0= RULE_STRING ) ) otherlv_8= '>' otherlv_9= '<' otherlv_10= 'Titular' otherlv_11= '=' ( (lv_nombre_12_0= RULE_STRING ) ) otherlv_13= ':' ( (lv_direccion_14_0= ruleDireccion ) ) otherlv_15= ':' ( (lv_cif_16_0= RULE_STRING ) ) otherlv_17= ':' ( (lv_registro_18_0= ruleRegistro ) ) otherlv_19= ':' ( (lv_correo_20_0= ruleCorreo ) ) otherlv_21= ':' ( (lv_telefono_22_0= RULE_INT ) ) otherlv_23= '>' otherlv_24= '<' otherlv_25= 'Menu' otherlv_26= '=' ( (lv_tipo_27_0= ruleTipo ) ) otherlv_28= '>' otherlv_29= '<' otherlv_30= 'Apariencia' otherlv_31= '=' ( (lv_apariencia_32_0= ruleApariencia ) ) otherlv_33= '>' otherlv_34= '<' otherlv_35= 'Categorias' otherlv_36= '=' ( (lv_categorias_37_0= ruleCategoria ) )* otherlv_38= '>' otherlv_39= '<' otherlv_40= 'Productos' otherlv_41= '=' ( (lv_numProductosPorFila_42_0= RULE_INT ) ) ( (lv_productos_43_0= ruleProducto ) )* otherlv_44= '>' otherlv_45= '<' otherlv_46= 'Usuario' otherlv_47= '=' ( (lv_nombreUsuario_48_0= RULE_STRING ) ) otherlv_49= ':' ( (lv_email_50_0= ruleCorreo ) ) otherlv_51= ':' ( (lv_password_52_0= RULE_STRING ) ) otherlv_53= '>' otherlv_54= '}' )
            {
            // InternalGenerador.g:78:2: (otherlv_0= 'Parafarmacia' otherlv_1= '{' otherlv_2= '<' otherlv_3= 'Nombre' otherlv_4= '=' ( (lv_titulo_5_0= RULE_STRING ) ) otherlv_6= ':' ( (lv_fuente_7_0= RULE_STRING ) ) otherlv_8= '>' otherlv_9= '<' otherlv_10= 'Titular' otherlv_11= '=' ( (lv_nombre_12_0= RULE_STRING ) ) otherlv_13= ':' ( (lv_direccion_14_0= ruleDireccion ) ) otherlv_15= ':' ( (lv_cif_16_0= RULE_STRING ) ) otherlv_17= ':' ( (lv_registro_18_0= ruleRegistro ) ) otherlv_19= ':' ( (lv_correo_20_0= ruleCorreo ) ) otherlv_21= ':' ( (lv_telefono_22_0= RULE_INT ) ) otherlv_23= '>' otherlv_24= '<' otherlv_25= 'Menu' otherlv_26= '=' ( (lv_tipo_27_0= ruleTipo ) ) otherlv_28= '>' otherlv_29= '<' otherlv_30= 'Apariencia' otherlv_31= '=' ( (lv_apariencia_32_0= ruleApariencia ) ) otherlv_33= '>' otherlv_34= '<' otherlv_35= 'Categorias' otherlv_36= '=' ( (lv_categorias_37_0= ruleCategoria ) )* otherlv_38= '>' otherlv_39= '<' otherlv_40= 'Productos' otherlv_41= '=' ( (lv_numProductosPorFila_42_0= RULE_INT ) ) ( (lv_productos_43_0= ruleProducto ) )* otherlv_44= '>' otherlv_45= '<' otherlv_46= 'Usuario' otherlv_47= '=' ( (lv_nombreUsuario_48_0= RULE_STRING ) ) otherlv_49= ':' ( (lv_email_50_0= ruleCorreo ) ) otherlv_51= ':' ( (lv_password_52_0= RULE_STRING ) ) otherlv_53= '>' otherlv_54= '}' )
            // InternalGenerador.g:79:3: otherlv_0= 'Parafarmacia' otherlv_1= '{' otherlv_2= '<' otherlv_3= 'Nombre' otherlv_4= '=' ( (lv_titulo_5_0= RULE_STRING ) ) otherlv_6= ':' ( (lv_fuente_7_0= RULE_STRING ) ) otherlv_8= '>' otherlv_9= '<' otherlv_10= 'Titular' otherlv_11= '=' ( (lv_nombre_12_0= RULE_STRING ) ) otherlv_13= ':' ( (lv_direccion_14_0= ruleDireccion ) ) otherlv_15= ':' ( (lv_cif_16_0= RULE_STRING ) ) otherlv_17= ':' ( (lv_registro_18_0= ruleRegistro ) ) otherlv_19= ':' ( (lv_correo_20_0= ruleCorreo ) ) otherlv_21= ':' ( (lv_telefono_22_0= RULE_INT ) ) otherlv_23= '>' otherlv_24= '<' otherlv_25= 'Menu' otherlv_26= '=' ( (lv_tipo_27_0= ruleTipo ) ) otherlv_28= '>' otherlv_29= '<' otherlv_30= 'Apariencia' otherlv_31= '=' ( (lv_apariencia_32_0= ruleApariencia ) ) otherlv_33= '>' otherlv_34= '<' otherlv_35= 'Categorias' otherlv_36= '=' ( (lv_categorias_37_0= ruleCategoria ) )* otherlv_38= '>' otherlv_39= '<' otherlv_40= 'Productos' otherlv_41= '=' ( (lv_numProductosPorFila_42_0= RULE_INT ) ) ( (lv_productos_43_0= ruleProducto ) )* otherlv_44= '>' otherlv_45= '<' otherlv_46= 'Usuario' otherlv_47= '=' ( (lv_nombreUsuario_48_0= RULE_STRING ) ) otherlv_49= ':' ( (lv_email_50_0= ruleCorreo ) ) otherlv_51= ':' ( (lv_password_52_0= RULE_STRING ) ) otherlv_53= '>' otherlv_54= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getParafarmaciaAccess().getParafarmaciaKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getParafarmaciaAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getParafarmaciaAccess().getLessThanSignKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getParafarmaciaAccess().getNombreKeyword_3());
            		
            otherlv_4=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getParafarmaciaAccess().getEqualsSignKeyword_4());
            		
            // InternalGenerador.g:99:3: ( (lv_titulo_5_0= RULE_STRING ) )
            // InternalGenerador.g:100:4: (lv_titulo_5_0= RULE_STRING )
            {
            // InternalGenerador.g:100:4: (lv_titulo_5_0= RULE_STRING )
            // InternalGenerador.g:101:5: lv_titulo_5_0= RULE_STRING
            {
            lv_titulo_5_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_titulo_5_0, grammarAccess.getParafarmaciaAccess().getTituloSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParafarmaciaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"titulo",
            						lv_titulo_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,16,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getParafarmaciaAccess().getColonKeyword_6());
            		
            // InternalGenerador.g:121:3: ( (lv_fuente_7_0= RULE_STRING ) )
            // InternalGenerador.g:122:4: (lv_fuente_7_0= RULE_STRING )
            {
            // InternalGenerador.g:122:4: (lv_fuente_7_0= RULE_STRING )
            // InternalGenerador.g:123:5: lv_fuente_7_0= RULE_STRING
            {
            lv_fuente_7_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

            					newLeafNode(lv_fuente_7_0, grammarAccess.getParafarmaciaAccess().getFuenteSTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParafarmaciaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"fuente",
            						lv_fuente_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_8=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_8, grammarAccess.getParafarmaciaAccess().getGreaterThanSignKeyword_8());
            		
            otherlv_9=(Token)match(input,13,FOLLOW_10); 

            			newLeafNode(otherlv_9, grammarAccess.getParafarmaciaAccess().getLessThanSignKeyword_9());
            		
            otherlv_10=(Token)match(input,18,FOLLOW_6); 

            			newLeafNode(otherlv_10, grammarAccess.getParafarmaciaAccess().getTitularKeyword_10());
            		
            otherlv_11=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_11, grammarAccess.getParafarmaciaAccess().getEqualsSignKeyword_11());
            		
            // InternalGenerador.g:155:3: ( (lv_nombre_12_0= RULE_STRING ) )
            // InternalGenerador.g:156:4: (lv_nombre_12_0= RULE_STRING )
            {
            // InternalGenerador.g:156:4: (lv_nombre_12_0= RULE_STRING )
            // InternalGenerador.g:157:5: lv_nombre_12_0= RULE_STRING
            {
            lv_nombre_12_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_nombre_12_0, grammarAccess.getParafarmaciaAccess().getNombreSTRINGTerminalRuleCall_12_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParafarmaciaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"nombre",
            						lv_nombre_12_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_13=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_13, grammarAccess.getParafarmaciaAccess().getColonKeyword_13());
            		
            // InternalGenerador.g:177:3: ( (lv_direccion_14_0= ruleDireccion ) )
            // InternalGenerador.g:178:4: (lv_direccion_14_0= ruleDireccion )
            {
            // InternalGenerador.g:178:4: (lv_direccion_14_0= ruleDireccion )
            // InternalGenerador.g:179:5: lv_direccion_14_0= ruleDireccion
            {

            					newCompositeNode(grammarAccess.getParafarmaciaAccess().getDireccionDireccionParserRuleCall_14_0());
            				
            pushFollow(FOLLOW_8);
            lv_direccion_14_0=ruleDireccion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParafarmaciaRule());
            					}
            					set(
            						current,
            						"direccion",
            						lv_direccion_14_0,
            						"org.xtext.dsl.generador.Generador.Direccion");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_15=(Token)match(input,16,FOLLOW_7); 

            			newLeafNode(otherlv_15, grammarAccess.getParafarmaciaAccess().getColonKeyword_15());
            		
            // InternalGenerador.g:200:3: ( (lv_cif_16_0= RULE_STRING ) )
            // InternalGenerador.g:201:4: (lv_cif_16_0= RULE_STRING )
            {
            // InternalGenerador.g:201:4: (lv_cif_16_0= RULE_STRING )
            // InternalGenerador.g:202:5: lv_cif_16_0= RULE_STRING
            {
            lv_cif_16_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_cif_16_0, grammarAccess.getParafarmaciaAccess().getCifSTRINGTerminalRuleCall_16_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParafarmaciaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"cif",
            						lv_cif_16_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_17=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_17, grammarAccess.getParafarmaciaAccess().getColonKeyword_17());
            		
            // InternalGenerador.g:222:3: ( (lv_registro_18_0= ruleRegistro ) )
            // InternalGenerador.g:223:4: (lv_registro_18_0= ruleRegistro )
            {
            // InternalGenerador.g:223:4: (lv_registro_18_0= ruleRegistro )
            // InternalGenerador.g:224:5: lv_registro_18_0= ruleRegistro
            {

            					newCompositeNode(grammarAccess.getParafarmaciaAccess().getRegistroRegistroParserRuleCall_18_0());
            				
            pushFollow(FOLLOW_8);
            lv_registro_18_0=ruleRegistro();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParafarmaciaRule());
            					}
            					set(
            						current,
            						"registro",
            						lv_registro_18_0,
            						"org.xtext.dsl.generador.Generador.Registro");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_19=(Token)match(input,16,FOLLOW_12); 

            			newLeafNode(otherlv_19, grammarAccess.getParafarmaciaAccess().getColonKeyword_19());
            		
            // InternalGenerador.g:245:3: ( (lv_correo_20_0= ruleCorreo ) )
            // InternalGenerador.g:246:4: (lv_correo_20_0= ruleCorreo )
            {
            // InternalGenerador.g:246:4: (lv_correo_20_0= ruleCorreo )
            // InternalGenerador.g:247:5: lv_correo_20_0= ruleCorreo
            {

            					newCompositeNode(grammarAccess.getParafarmaciaAccess().getCorreoCorreoParserRuleCall_20_0());
            				
            pushFollow(FOLLOW_8);
            lv_correo_20_0=ruleCorreo();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParafarmaciaRule());
            					}
            					set(
            						current,
            						"correo",
            						lv_correo_20_0,
            						"org.xtext.dsl.generador.Generador.Correo");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_21=(Token)match(input,16,FOLLOW_13); 

            			newLeafNode(otherlv_21, grammarAccess.getParafarmaciaAccess().getColonKeyword_21());
            		
            // InternalGenerador.g:268:3: ( (lv_telefono_22_0= RULE_INT ) )
            // InternalGenerador.g:269:4: (lv_telefono_22_0= RULE_INT )
            {
            // InternalGenerador.g:269:4: (lv_telefono_22_0= RULE_INT )
            // InternalGenerador.g:270:5: lv_telefono_22_0= RULE_INT
            {
            lv_telefono_22_0=(Token)match(input,RULE_INT,FOLLOW_9); 

            					newLeafNode(lv_telefono_22_0, grammarAccess.getParafarmaciaAccess().getTelefonoINTTerminalRuleCall_22_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParafarmaciaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"telefono",
            						lv_telefono_22_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_23=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_23, grammarAccess.getParafarmaciaAccess().getGreaterThanSignKeyword_23());
            		
            otherlv_24=(Token)match(input,13,FOLLOW_14); 

            			newLeafNode(otherlv_24, grammarAccess.getParafarmaciaAccess().getLessThanSignKeyword_24());
            		
            otherlv_25=(Token)match(input,19,FOLLOW_6); 

            			newLeafNode(otherlv_25, grammarAccess.getParafarmaciaAccess().getMenuKeyword_25());
            		
            otherlv_26=(Token)match(input,15,FOLLOW_15); 

            			newLeafNode(otherlv_26, grammarAccess.getParafarmaciaAccess().getEqualsSignKeyword_26());
            		
            // InternalGenerador.g:302:3: ( (lv_tipo_27_0= ruleTipo ) )
            // InternalGenerador.g:303:4: (lv_tipo_27_0= ruleTipo )
            {
            // InternalGenerador.g:303:4: (lv_tipo_27_0= ruleTipo )
            // InternalGenerador.g:304:5: lv_tipo_27_0= ruleTipo
            {

            					newCompositeNode(grammarAccess.getParafarmaciaAccess().getTipoTipoParserRuleCall_27_0());
            				
            pushFollow(FOLLOW_9);
            lv_tipo_27_0=ruleTipo();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParafarmaciaRule());
            					}
            					set(
            						current,
            						"tipo",
            						lv_tipo_27_0,
            						"org.xtext.dsl.generador.Generador.Tipo");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_28=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_28, grammarAccess.getParafarmaciaAccess().getGreaterThanSignKeyword_28());
            		
            otherlv_29=(Token)match(input,13,FOLLOW_16); 

            			newLeafNode(otherlv_29, grammarAccess.getParafarmaciaAccess().getLessThanSignKeyword_29());
            		
            otherlv_30=(Token)match(input,20,FOLLOW_6); 

            			newLeafNode(otherlv_30, grammarAccess.getParafarmaciaAccess().getAparienciaKeyword_30());
            		
            otherlv_31=(Token)match(input,15,FOLLOW_11); 

            			newLeafNode(otherlv_31, grammarAccess.getParafarmaciaAccess().getEqualsSignKeyword_31());
            		
            // InternalGenerador.g:337:3: ( (lv_apariencia_32_0= ruleApariencia ) )
            // InternalGenerador.g:338:4: (lv_apariencia_32_0= ruleApariencia )
            {
            // InternalGenerador.g:338:4: (lv_apariencia_32_0= ruleApariencia )
            // InternalGenerador.g:339:5: lv_apariencia_32_0= ruleApariencia
            {

            					newCompositeNode(grammarAccess.getParafarmaciaAccess().getAparienciaAparienciaParserRuleCall_32_0());
            				
            pushFollow(FOLLOW_9);
            lv_apariencia_32_0=ruleApariencia();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParafarmaciaRule());
            					}
            					set(
            						current,
            						"apariencia",
            						lv_apariencia_32_0,
            						"org.xtext.dsl.generador.Generador.Apariencia");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_33=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_33, grammarAccess.getParafarmaciaAccess().getGreaterThanSignKeyword_33());
            		
            otherlv_34=(Token)match(input,13,FOLLOW_17); 

            			newLeafNode(otherlv_34, grammarAccess.getParafarmaciaAccess().getLessThanSignKeyword_34());
            		
            otherlv_35=(Token)match(input,21,FOLLOW_6); 

            			newLeafNode(otherlv_35, grammarAccess.getParafarmaciaAccess().getCategoriasKeyword_35());
            		
            otherlv_36=(Token)match(input,15,FOLLOW_18); 

            			newLeafNode(otherlv_36, grammarAccess.getParafarmaciaAccess().getEqualsSignKeyword_36());
            		
            // InternalGenerador.g:372:3: ( (lv_categorias_37_0= ruleCategoria ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=32 && LA1_0<=36)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalGenerador.g:373:4: (lv_categorias_37_0= ruleCategoria )
            	    {
            	    // InternalGenerador.g:373:4: (lv_categorias_37_0= ruleCategoria )
            	    // InternalGenerador.g:374:5: lv_categorias_37_0= ruleCategoria
            	    {

            	    					newCompositeNode(grammarAccess.getParafarmaciaAccess().getCategoriasCategoriaParserRuleCall_37_0());
            	    				
            	    pushFollow(FOLLOW_18);
            	    lv_categorias_37_0=ruleCategoria();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getParafarmaciaRule());
            	    					}
            	    					add(
            	    						current,
            	    						"categorias",
            	    						lv_categorias_37_0,
            	    						"org.xtext.dsl.generador.Generador.Categoria");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_38=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_38, grammarAccess.getParafarmaciaAccess().getGreaterThanSignKeyword_38());
            		
            otherlv_39=(Token)match(input,13,FOLLOW_19); 

            			newLeafNode(otherlv_39, grammarAccess.getParafarmaciaAccess().getLessThanSignKeyword_39());
            		
            otherlv_40=(Token)match(input,22,FOLLOW_6); 

            			newLeafNode(otherlv_40, grammarAccess.getParafarmaciaAccess().getProductosKeyword_40());
            		
            otherlv_41=(Token)match(input,15,FOLLOW_13); 

            			newLeafNode(otherlv_41, grammarAccess.getParafarmaciaAccess().getEqualsSignKeyword_41());
            		
            // InternalGenerador.g:407:3: ( (lv_numProductosPorFila_42_0= RULE_INT ) )
            // InternalGenerador.g:408:4: (lv_numProductosPorFila_42_0= RULE_INT )
            {
            // InternalGenerador.g:408:4: (lv_numProductosPorFila_42_0= RULE_INT )
            // InternalGenerador.g:409:5: lv_numProductosPorFila_42_0= RULE_INT
            {
            lv_numProductosPorFila_42_0=(Token)match(input,RULE_INT,FOLLOW_20); 

            					newLeafNode(lv_numProductosPorFila_42_0, grammarAccess.getParafarmaciaAccess().getNumProductosPorFilaINTTerminalRuleCall_42_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParafarmaciaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"numProductosPorFila",
            						lv_numProductosPorFila_42_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalGenerador.g:425:3: ( (lv_productos_43_0= ruleProducto ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==25) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalGenerador.g:426:4: (lv_productos_43_0= ruleProducto )
            	    {
            	    // InternalGenerador.g:426:4: (lv_productos_43_0= ruleProducto )
            	    // InternalGenerador.g:427:5: lv_productos_43_0= ruleProducto
            	    {

            	    					newCompositeNode(grammarAccess.getParafarmaciaAccess().getProductosProductoParserRuleCall_43_0());
            	    				
            	    pushFollow(FOLLOW_20);
            	    lv_productos_43_0=ruleProducto();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getParafarmaciaRule());
            	    					}
            	    					add(
            	    						current,
            	    						"productos",
            	    						lv_productos_43_0,
            	    						"org.xtext.dsl.generador.Generador.Producto");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_44=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_44, grammarAccess.getParafarmaciaAccess().getGreaterThanSignKeyword_44());
            		
            otherlv_45=(Token)match(input,13,FOLLOW_21); 

            			newLeafNode(otherlv_45, grammarAccess.getParafarmaciaAccess().getLessThanSignKeyword_45());
            		
            otherlv_46=(Token)match(input,23,FOLLOW_6); 

            			newLeafNode(otherlv_46, grammarAccess.getParafarmaciaAccess().getUsuarioKeyword_46());
            		
            otherlv_47=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_47, grammarAccess.getParafarmaciaAccess().getEqualsSignKeyword_47());
            		
            // InternalGenerador.g:460:3: ( (lv_nombreUsuario_48_0= RULE_STRING ) )
            // InternalGenerador.g:461:4: (lv_nombreUsuario_48_0= RULE_STRING )
            {
            // InternalGenerador.g:461:4: (lv_nombreUsuario_48_0= RULE_STRING )
            // InternalGenerador.g:462:5: lv_nombreUsuario_48_0= RULE_STRING
            {
            lv_nombreUsuario_48_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_nombreUsuario_48_0, grammarAccess.getParafarmaciaAccess().getNombreUsuarioSTRINGTerminalRuleCall_48_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParafarmaciaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"nombreUsuario",
            						lv_nombreUsuario_48_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_49=(Token)match(input,16,FOLLOW_12); 

            			newLeafNode(otherlv_49, grammarAccess.getParafarmaciaAccess().getColonKeyword_49());
            		
            // InternalGenerador.g:482:3: ( (lv_email_50_0= ruleCorreo ) )
            // InternalGenerador.g:483:4: (lv_email_50_0= ruleCorreo )
            {
            // InternalGenerador.g:483:4: (lv_email_50_0= ruleCorreo )
            // InternalGenerador.g:484:5: lv_email_50_0= ruleCorreo
            {

            					newCompositeNode(grammarAccess.getParafarmaciaAccess().getEmailCorreoParserRuleCall_50_0());
            				
            pushFollow(FOLLOW_8);
            lv_email_50_0=ruleCorreo();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParafarmaciaRule());
            					}
            					set(
            						current,
            						"email",
            						lv_email_50_0,
            						"org.xtext.dsl.generador.Generador.Correo");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_51=(Token)match(input,16,FOLLOW_7); 

            			newLeafNode(otherlv_51, grammarAccess.getParafarmaciaAccess().getColonKeyword_51());
            		
            // InternalGenerador.g:505:3: ( (lv_password_52_0= RULE_STRING ) )
            // InternalGenerador.g:506:4: (lv_password_52_0= RULE_STRING )
            {
            // InternalGenerador.g:506:4: (lv_password_52_0= RULE_STRING )
            // InternalGenerador.g:507:5: lv_password_52_0= RULE_STRING
            {
            lv_password_52_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

            					newLeafNode(lv_password_52_0, grammarAccess.getParafarmaciaAccess().getPasswordSTRINGTerminalRuleCall_52_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParafarmaciaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"password",
            						lv_password_52_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_53=(Token)match(input,17,FOLLOW_22); 

            			newLeafNode(otherlv_53, grammarAccess.getParafarmaciaAccess().getGreaterThanSignKeyword_53());
            		
            otherlv_54=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_54, grammarAccess.getParafarmaciaAccess().getRightCurlyBracketKeyword_54());
            		

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
    // InternalGenerador.g:535:1: entryRuleApariencia returns [EObject current=null] : iv_ruleApariencia= ruleApariencia EOF ;
    public final EObject entryRuleApariencia() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApariencia = null;


        try {
            // InternalGenerador.g:535:51: (iv_ruleApariencia= ruleApariencia EOF )
            // InternalGenerador.g:536:2: iv_ruleApariencia= ruleApariencia EOF
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
    // InternalGenerador.g:542:1: ruleApariencia returns [EObject current=null] : (otherlv_0= '[' otherlv_1= 'Color' otherlv_2= '=' ( (lv_principal_3_0= ruleColor ) ) otherlv_4= ':' ( (lv_principalClaro_5_0= ruleColor ) ) otherlv_6= ':' ( (lv_secundario_7_0= ruleColor ) ) otherlv_8= ':' ( (lv_fondo_9_0= ruleColor ) ) otherlv_10= ':' ( (lv_fondoProductos_11_0= ruleColor ) ) otherlv_12= ':' ( (lv_precios_13_0= ruleColor ) ) otherlv_14= ':' ( (lv_texto_15_0= ruleColor ) ) otherlv_16= ':' ( (lv_tituloColor_17_0= ruleColor ) ) otherlv_18= ']' otherlv_19= '[' otherlv_20= 'Texto' otherlv_21= '=' ( (lv_normal_22_0= ruleMedida ) ) otherlv_23= ':' ( (lv_grande_24_0= ruleMedida ) ) otherlv_25= ':' ( (lv_titulo_26_0= ruleMedida ) ) otherlv_27= ':' ( (lv_menu_28_0= ruleMedida ) ) otherlv_29= ']' otherlv_30= '[' otherlv_31= 'Margen' otherlv_32= '=' ( (lv_lateral_33_0= ruleMedida ) ) otherlv_34= ']' ) ;
    public final EObject ruleApariencia() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token otherlv_34=null;
        AntlrDatatypeRuleToken lv_principal_3_0 = null;

        AntlrDatatypeRuleToken lv_principalClaro_5_0 = null;

        AntlrDatatypeRuleToken lv_secundario_7_0 = null;

        AntlrDatatypeRuleToken lv_fondo_9_0 = null;

        AntlrDatatypeRuleToken lv_fondoProductos_11_0 = null;

        AntlrDatatypeRuleToken lv_precios_13_0 = null;

        AntlrDatatypeRuleToken lv_texto_15_0 = null;

        AntlrDatatypeRuleToken lv_tituloColor_17_0 = null;

        AntlrDatatypeRuleToken lv_normal_22_0 = null;

        AntlrDatatypeRuleToken lv_grande_24_0 = null;

        AntlrDatatypeRuleToken lv_titulo_26_0 = null;

        AntlrDatatypeRuleToken lv_menu_28_0 = null;

        AntlrDatatypeRuleToken lv_lateral_33_0 = null;



        	enterRule();

        try {
            // InternalGenerador.g:548:2: ( (otherlv_0= '[' otherlv_1= 'Color' otherlv_2= '=' ( (lv_principal_3_0= ruleColor ) ) otherlv_4= ':' ( (lv_principalClaro_5_0= ruleColor ) ) otherlv_6= ':' ( (lv_secundario_7_0= ruleColor ) ) otherlv_8= ':' ( (lv_fondo_9_0= ruleColor ) ) otherlv_10= ':' ( (lv_fondoProductos_11_0= ruleColor ) ) otherlv_12= ':' ( (lv_precios_13_0= ruleColor ) ) otherlv_14= ':' ( (lv_texto_15_0= ruleColor ) ) otherlv_16= ':' ( (lv_tituloColor_17_0= ruleColor ) ) otherlv_18= ']' otherlv_19= '[' otherlv_20= 'Texto' otherlv_21= '=' ( (lv_normal_22_0= ruleMedida ) ) otherlv_23= ':' ( (lv_grande_24_0= ruleMedida ) ) otherlv_25= ':' ( (lv_titulo_26_0= ruleMedida ) ) otherlv_27= ':' ( (lv_menu_28_0= ruleMedida ) ) otherlv_29= ']' otherlv_30= '[' otherlv_31= 'Margen' otherlv_32= '=' ( (lv_lateral_33_0= ruleMedida ) ) otherlv_34= ']' ) )
            // InternalGenerador.g:549:2: (otherlv_0= '[' otherlv_1= 'Color' otherlv_2= '=' ( (lv_principal_3_0= ruleColor ) ) otherlv_4= ':' ( (lv_principalClaro_5_0= ruleColor ) ) otherlv_6= ':' ( (lv_secundario_7_0= ruleColor ) ) otherlv_8= ':' ( (lv_fondo_9_0= ruleColor ) ) otherlv_10= ':' ( (lv_fondoProductos_11_0= ruleColor ) ) otherlv_12= ':' ( (lv_precios_13_0= ruleColor ) ) otherlv_14= ':' ( (lv_texto_15_0= ruleColor ) ) otherlv_16= ':' ( (lv_tituloColor_17_0= ruleColor ) ) otherlv_18= ']' otherlv_19= '[' otherlv_20= 'Texto' otherlv_21= '=' ( (lv_normal_22_0= ruleMedida ) ) otherlv_23= ':' ( (lv_grande_24_0= ruleMedida ) ) otherlv_25= ':' ( (lv_titulo_26_0= ruleMedida ) ) otherlv_27= ':' ( (lv_menu_28_0= ruleMedida ) ) otherlv_29= ']' otherlv_30= '[' otherlv_31= 'Margen' otherlv_32= '=' ( (lv_lateral_33_0= ruleMedida ) ) otherlv_34= ']' )
            {
            // InternalGenerador.g:549:2: (otherlv_0= '[' otherlv_1= 'Color' otherlv_2= '=' ( (lv_principal_3_0= ruleColor ) ) otherlv_4= ':' ( (lv_principalClaro_5_0= ruleColor ) ) otherlv_6= ':' ( (lv_secundario_7_0= ruleColor ) ) otherlv_8= ':' ( (lv_fondo_9_0= ruleColor ) ) otherlv_10= ':' ( (lv_fondoProductos_11_0= ruleColor ) ) otherlv_12= ':' ( (lv_precios_13_0= ruleColor ) ) otherlv_14= ':' ( (lv_texto_15_0= ruleColor ) ) otherlv_16= ':' ( (lv_tituloColor_17_0= ruleColor ) ) otherlv_18= ']' otherlv_19= '[' otherlv_20= 'Texto' otherlv_21= '=' ( (lv_normal_22_0= ruleMedida ) ) otherlv_23= ':' ( (lv_grande_24_0= ruleMedida ) ) otherlv_25= ':' ( (lv_titulo_26_0= ruleMedida ) ) otherlv_27= ':' ( (lv_menu_28_0= ruleMedida ) ) otherlv_29= ']' otherlv_30= '[' otherlv_31= 'Margen' otherlv_32= '=' ( (lv_lateral_33_0= ruleMedida ) ) otherlv_34= ']' )
            // InternalGenerador.g:550:3: otherlv_0= '[' otherlv_1= 'Color' otherlv_2= '=' ( (lv_principal_3_0= ruleColor ) ) otherlv_4= ':' ( (lv_principalClaro_5_0= ruleColor ) ) otherlv_6= ':' ( (lv_secundario_7_0= ruleColor ) ) otherlv_8= ':' ( (lv_fondo_9_0= ruleColor ) ) otherlv_10= ':' ( (lv_fondoProductos_11_0= ruleColor ) ) otherlv_12= ':' ( (lv_precios_13_0= ruleColor ) ) otherlv_14= ':' ( (lv_texto_15_0= ruleColor ) ) otherlv_16= ':' ( (lv_tituloColor_17_0= ruleColor ) ) otherlv_18= ']' otherlv_19= '[' otherlv_20= 'Texto' otherlv_21= '=' ( (lv_normal_22_0= ruleMedida ) ) otherlv_23= ':' ( (lv_grande_24_0= ruleMedida ) ) otherlv_25= ':' ( (lv_titulo_26_0= ruleMedida ) ) otherlv_27= ':' ( (lv_menu_28_0= ruleMedida ) ) otherlv_29= ']' otherlv_30= '[' otherlv_31= 'Margen' otherlv_32= '=' ( (lv_lateral_33_0= ruleMedida ) ) otherlv_34= ']'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getAparienciaAccess().getLeftSquareBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,26,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getAparienciaAccess().getColorKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_24); 

            			newLeafNode(otherlv_2, grammarAccess.getAparienciaAccess().getEqualsSignKeyword_2());
            		
            // InternalGenerador.g:562:3: ( (lv_principal_3_0= ruleColor ) )
            // InternalGenerador.g:563:4: (lv_principal_3_0= ruleColor )
            {
            // InternalGenerador.g:563:4: (lv_principal_3_0= ruleColor )
            // InternalGenerador.g:564:5: lv_principal_3_0= ruleColor
            {

            					newCompositeNode(grammarAccess.getAparienciaAccess().getPrincipalColorParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
            lv_principal_3_0=ruleColor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAparienciaRule());
            					}
            					set(
            						current,
            						"principal",
            						lv_principal_3_0,
            						"org.xtext.dsl.generador.Generador.Color");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_24); 

            			newLeafNode(otherlv_4, grammarAccess.getAparienciaAccess().getColonKeyword_4());
            		
            // InternalGenerador.g:585:3: ( (lv_principalClaro_5_0= ruleColor ) )
            // InternalGenerador.g:586:4: (lv_principalClaro_5_0= ruleColor )
            {
            // InternalGenerador.g:586:4: (lv_principalClaro_5_0= ruleColor )
            // InternalGenerador.g:587:5: lv_principalClaro_5_0= ruleColor
            {

            					newCompositeNode(grammarAccess.getAparienciaAccess().getPrincipalClaroColorParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_8);
            lv_principalClaro_5_0=ruleColor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAparienciaRule());
            					}
            					set(
            						current,
            						"principalClaro",
            						lv_principalClaro_5_0,
            						"org.xtext.dsl.generador.Generador.Color");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,16,FOLLOW_24); 

            			newLeafNode(otherlv_6, grammarAccess.getAparienciaAccess().getColonKeyword_6());
            		
            // InternalGenerador.g:608:3: ( (lv_secundario_7_0= ruleColor ) )
            // InternalGenerador.g:609:4: (lv_secundario_7_0= ruleColor )
            {
            // InternalGenerador.g:609:4: (lv_secundario_7_0= ruleColor )
            // InternalGenerador.g:610:5: lv_secundario_7_0= ruleColor
            {

            					newCompositeNode(grammarAccess.getAparienciaAccess().getSecundarioColorParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_8);
            lv_secundario_7_0=ruleColor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAparienciaRule());
            					}
            					set(
            						current,
            						"secundario",
            						lv_secundario_7_0,
            						"org.xtext.dsl.generador.Generador.Color");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,16,FOLLOW_24); 

            			newLeafNode(otherlv_8, grammarAccess.getAparienciaAccess().getColonKeyword_8());
            		
            // InternalGenerador.g:631:3: ( (lv_fondo_9_0= ruleColor ) )
            // InternalGenerador.g:632:4: (lv_fondo_9_0= ruleColor )
            {
            // InternalGenerador.g:632:4: (lv_fondo_9_0= ruleColor )
            // InternalGenerador.g:633:5: lv_fondo_9_0= ruleColor
            {

            					newCompositeNode(grammarAccess.getAparienciaAccess().getFondoColorParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_8);
            lv_fondo_9_0=ruleColor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAparienciaRule());
            					}
            					set(
            						current,
            						"fondo",
            						lv_fondo_9_0,
            						"org.xtext.dsl.generador.Generador.Color");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,16,FOLLOW_24); 

            			newLeafNode(otherlv_10, grammarAccess.getAparienciaAccess().getColonKeyword_10());
            		
            // InternalGenerador.g:654:3: ( (lv_fondoProductos_11_0= ruleColor ) )
            // InternalGenerador.g:655:4: (lv_fondoProductos_11_0= ruleColor )
            {
            // InternalGenerador.g:655:4: (lv_fondoProductos_11_0= ruleColor )
            // InternalGenerador.g:656:5: lv_fondoProductos_11_0= ruleColor
            {

            					newCompositeNode(grammarAccess.getAparienciaAccess().getFondoProductosColorParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_8);
            lv_fondoProductos_11_0=ruleColor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAparienciaRule());
            					}
            					set(
            						current,
            						"fondoProductos",
            						lv_fondoProductos_11_0,
            						"org.xtext.dsl.generador.Generador.Color");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_12=(Token)match(input,16,FOLLOW_24); 

            			newLeafNode(otherlv_12, grammarAccess.getAparienciaAccess().getColonKeyword_12());
            		
            // InternalGenerador.g:677:3: ( (lv_precios_13_0= ruleColor ) )
            // InternalGenerador.g:678:4: (lv_precios_13_0= ruleColor )
            {
            // InternalGenerador.g:678:4: (lv_precios_13_0= ruleColor )
            // InternalGenerador.g:679:5: lv_precios_13_0= ruleColor
            {

            					newCompositeNode(grammarAccess.getAparienciaAccess().getPreciosColorParserRuleCall_13_0());
            				
            pushFollow(FOLLOW_8);
            lv_precios_13_0=ruleColor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAparienciaRule());
            					}
            					set(
            						current,
            						"precios",
            						lv_precios_13_0,
            						"org.xtext.dsl.generador.Generador.Color");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_14=(Token)match(input,16,FOLLOW_24); 

            			newLeafNode(otherlv_14, grammarAccess.getAparienciaAccess().getColonKeyword_14());
            		
            // InternalGenerador.g:700:3: ( (lv_texto_15_0= ruleColor ) )
            // InternalGenerador.g:701:4: (lv_texto_15_0= ruleColor )
            {
            // InternalGenerador.g:701:4: (lv_texto_15_0= ruleColor )
            // InternalGenerador.g:702:5: lv_texto_15_0= ruleColor
            {

            					newCompositeNode(grammarAccess.getAparienciaAccess().getTextoColorParserRuleCall_15_0());
            				
            pushFollow(FOLLOW_8);
            lv_texto_15_0=ruleColor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAparienciaRule());
            					}
            					set(
            						current,
            						"texto",
            						lv_texto_15_0,
            						"org.xtext.dsl.generador.Generador.Color");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_16=(Token)match(input,16,FOLLOW_24); 

            			newLeafNode(otherlv_16, grammarAccess.getAparienciaAccess().getColonKeyword_16());
            		
            // InternalGenerador.g:723:3: ( (lv_tituloColor_17_0= ruleColor ) )
            // InternalGenerador.g:724:4: (lv_tituloColor_17_0= ruleColor )
            {
            // InternalGenerador.g:724:4: (lv_tituloColor_17_0= ruleColor )
            // InternalGenerador.g:725:5: lv_tituloColor_17_0= ruleColor
            {

            					newCompositeNode(grammarAccess.getAparienciaAccess().getTituloColorColorParserRuleCall_17_0());
            				
            pushFollow(FOLLOW_25);
            lv_tituloColor_17_0=ruleColor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAparienciaRule());
            					}
            					set(
            						current,
            						"tituloColor",
            						lv_tituloColor_17_0,
            						"org.xtext.dsl.generador.Generador.Color");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_18=(Token)match(input,27,FOLLOW_11); 

            			newLeafNode(otherlv_18, grammarAccess.getAparienciaAccess().getRightSquareBracketKeyword_18());
            		
            otherlv_19=(Token)match(input,25,FOLLOW_26); 

            			newLeafNode(otherlv_19, grammarAccess.getAparienciaAccess().getLeftSquareBracketKeyword_19());
            		
            otherlv_20=(Token)match(input,28,FOLLOW_6); 

            			newLeafNode(otherlv_20, grammarAccess.getAparienciaAccess().getTextoKeyword_20());
            		
            otherlv_21=(Token)match(input,15,FOLLOW_13); 

            			newLeafNode(otherlv_21, grammarAccess.getAparienciaAccess().getEqualsSignKeyword_21());
            		
            // InternalGenerador.g:758:3: ( (lv_normal_22_0= ruleMedida ) )
            // InternalGenerador.g:759:4: (lv_normal_22_0= ruleMedida )
            {
            // InternalGenerador.g:759:4: (lv_normal_22_0= ruleMedida )
            // InternalGenerador.g:760:5: lv_normal_22_0= ruleMedida
            {

            					newCompositeNode(grammarAccess.getAparienciaAccess().getNormalMedidaParserRuleCall_22_0());
            				
            pushFollow(FOLLOW_8);
            lv_normal_22_0=ruleMedida();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAparienciaRule());
            					}
            					set(
            						current,
            						"normal",
            						lv_normal_22_0,
            						"org.xtext.dsl.generador.Generador.Medida");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_23=(Token)match(input,16,FOLLOW_13); 

            			newLeafNode(otherlv_23, grammarAccess.getAparienciaAccess().getColonKeyword_23());
            		
            // InternalGenerador.g:781:3: ( (lv_grande_24_0= ruleMedida ) )
            // InternalGenerador.g:782:4: (lv_grande_24_0= ruleMedida )
            {
            // InternalGenerador.g:782:4: (lv_grande_24_0= ruleMedida )
            // InternalGenerador.g:783:5: lv_grande_24_0= ruleMedida
            {

            					newCompositeNode(grammarAccess.getAparienciaAccess().getGrandeMedidaParserRuleCall_24_0());
            				
            pushFollow(FOLLOW_8);
            lv_grande_24_0=ruleMedida();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAparienciaRule());
            					}
            					set(
            						current,
            						"grande",
            						lv_grande_24_0,
            						"org.xtext.dsl.generador.Generador.Medida");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_25=(Token)match(input,16,FOLLOW_13); 

            			newLeafNode(otherlv_25, grammarAccess.getAparienciaAccess().getColonKeyword_25());
            		
            // InternalGenerador.g:804:3: ( (lv_titulo_26_0= ruleMedida ) )
            // InternalGenerador.g:805:4: (lv_titulo_26_0= ruleMedida )
            {
            // InternalGenerador.g:805:4: (lv_titulo_26_0= ruleMedida )
            // InternalGenerador.g:806:5: lv_titulo_26_0= ruleMedida
            {

            					newCompositeNode(grammarAccess.getAparienciaAccess().getTituloMedidaParserRuleCall_26_0());
            				
            pushFollow(FOLLOW_8);
            lv_titulo_26_0=ruleMedida();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAparienciaRule());
            					}
            					set(
            						current,
            						"titulo",
            						lv_titulo_26_0,
            						"org.xtext.dsl.generador.Generador.Medida");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_27=(Token)match(input,16,FOLLOW_13); 

            			newLeafNode(otherlv_27, grammarAccess.getAparienciaAccess().getColonKeyword_27());
            		
            // InternalGenerador.g:827:3: ( (lv_menu_28_0= ruleMedida ) )
            // InternalGenerador.g:828:4: (lv_menu_28_0= ruleMedida )
            {
            // InternalGenerador.g:828:4: (lv_menu_28_0= ruleMedida )
            // InternalGenerador.g:829:5: lv_menu_28_0= ruleMedida
            {

            					newCompositeNode(grammarAccess.getAparienciaAccess().getMenuMedidaParserRuleCall_28_0());
            				
            pushFollow(FOLLOW_25);
            lv_menu_28_0=ruleMedida();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAparienciaRule());
            					}
            					set(
            						current,
            						"menu",
            						lv_menu_28_0,
            						"org.xtext.dsl.generador.Generador.Medida");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_29=(Token)match(input,27,FOLLOW_11); 

            			newLeafNode(otherlv_29, grammarAccess.getAparienciaAccess().getRightSquareBracketKeyword_29());
            		
            otherlv_30=(Token)match(input,25,FOLLOW_27); 

            			newLeafNode(otherlv_30, grammarAccess.getAparienciaAccess().getLeftSquareBracketKeyword_30());
            		
            otherlv_31=(Token)match(input,29,FOLLOW_6); 

            			newLeafNode(otherlv_31, grammarAccess.getAparienciaAccess().getMargenKeyword_31());
            		
            otherlv_32=(Token)match(input,15,FOLLOW_13); 

            			newLeafNode(otherlv_32, grammarAccess.getAparienciaAccess().getEqualsSignKeyword_32());
            		
            // InternalGenerador.g:862:3: ( (lv_lateral_33_0= ruleMedida ) )
            // InternalGenerador.g:863:4: (lv_lateral_33_0= ruleMedida )
            {
            // InternalGenerador.g:863:4: (lv_lateral_33_0= ruleMedida )
            // InternalGenerador.g:864:5: lv_lateral_33_0= ruleMedida
            {

            					newCompositeNode(grammarAccess.getAparienciaAccess().getLateralMedidaParserRuleCall_33_0());
            				
            pushFollow(FOLLOW_25);
            lv_lateral_33_0=ruleMedida();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAparienciaRule());
            					}
            					set(
            						current,
            						"lateral",
            						lv_lateral_33_0,
            						"org.xtext.dsl.generador.Generador.Medida");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_34=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_34, grammarAccess.getAparienciaAccess().getRightSquareBracketKeyword_34());
            		

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


    // $ANTLR start "entryRuleProducto"
    // InternalGenerador.g:889:1: entryRuleProducto returns [EObject current=null] : iv_ruleProducto= ruleProducto EOF ;
    public final EObject entryRuleProducto() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProducto = null;


        try {
            // InternalGenerador.g:889:49: (iv_ruleProducto= ruleProducto EOF )
            // InternalGenerador.g:890:2: iv_ruleProducto= ruleProducto EOF
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
    // InternalGenerador.g:896:1: ruleProducto returns [EObject current=null] : (otherlv_0= '[' otherlv_1= 'Producto' otherlv_2= '=' ( (lv_nombreProducto_3_0= RULE_STRING ) ) otherlv_4= ':' ( (lv_descripcion_5_0= RULE_STRING ) ) otherlv_6= ':' ( (lv_precio_7_0= rulePrecio ) ) otherlv_8= ':' ( (lv_cantidad_9_0= RULE_INT ) ) otherlv_10= ':' ( (lv_categoria_11_0= ruleCategoria ) ) otherlv_12= ']' ) ;
    public final EObject ruleProducto() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_nombreProducto_3_0=null;
        Token otherlv_4=null;
        Token lv_descripcion_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token lv_cantidad_9_0=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_precio_7_0 = null;

        AntlrDatatypeRuleToken lv_categoria_11_0 = null;



        	enterRule();

        try {
            // InternalGenerador.g:902:2: ( (otherlv_0= '[' otherlv_1= 'Producto' otherlv_2= '=' ( (lv_nombreProducto_3_0= RULE_STRING ) ) otherlv_4= ':' ( (lv_descripcion_5_0= RULE_STRING ) ) otherlv_6= ':' ( (lv_precio_7_0= rulePrecio ) ) otherlv_8= ':' ( (lv_cantidad_9_0= RULE_INT ) ) otherlv_10= ':' ( (lv_categoria_11_0= ruleCategoria ) ) otherlv_12= ']' ) )
            // InternalGenerador.g:903:2: (otherlv_0= '[' otherlv_1= 'Producto' otherlv_2= '=' ( (lv_nombreProducto_3_0= RULE_STRING ) ) otherlv_4= ':' ( (lv_descripcion_5_0= RULE_STRING ) ) otherlv_6= ':' ( (lv_precio_7_0= rulePrecio ) ) otherlv_8= ':' ( (lv_cantidad_9_0= RULE_INT ) ) otherlv_10= ':' ( (lv_categoria_11_0= ruleCategoria ) ) otherlv_12= ']' )
            {
            // InternalGenerador.g:903:2: (otherlv_0= '[' otherlv_1= 'Producto' otherlv_2= '=' ( (lv_nombreProducto_3_0= RULE_STRING ) ) otherlv_4= ':' ( (lv_descripcion_5_0= RULE_STRING ) ) otherlv_6= ':' ( (lv_precio_7_0= rulePrecio ) ) otherlv_8= ':' ( (lv_cantidad_9_0= RULE_INT ) ) otherlv_10= ':' ( (lv_categoria_11_0= ruleCategoria ) ) otherlv_12= ']' )
            // InternalGenerador.g:904:3: otherlv_0= '[' otherlv_1= 'Producto' otherlv_2= '=' ( (lv_nombreProducto_3_0= RULE_STRING ) ) otherlv_4= ':' ( (lv_descripcion_5_0= RULE_STRING ) ) otherlv_6= ':' ( (lv_precio_7_0= rulePrecio ) ) otherlv_8= ':' ( (lv_cantidad_9_0= RULE_INT ) ) otherlv_10= ':' ( (lv_categoria_11_0= ruleCategoria ) ) otherlv_12= ']'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_28); 

            			newLeafNode(otherlv_0, grammarAccess.getProductoAccess().getLeftSquareBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,30,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getProductoAccess().getProductoKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getProductoAccess().getEqualsSignKeyword_2());
            		
            // InternalGenerador.g:916:3: ( (lv_nombreProducto_3_0= RULE_STRING ) )
            // InternalGenerador.g:917:4: (lv_nombreProducto_3_0= RULE_STRING )
            {
            // InternalGenerador.g:917:4: (lv_nombreProducto_3_0= RULE_STRING )
            // InternalGenerador.g:918:5: lv_nombreProducto_3_0= RULE_STRING
            {
            lv_nombreProducto_3_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_nombreProducto_3_0, grammarAccess.getProductoAccess().getNombreProductoSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProductoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"nombreProducto",
            						lv_nombreProducto_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getProductoAccess().getColonKeyword_4());
            		
            // InternalGenerador.g:938:3: ( (lv_descripcion_5_0= RULE_STRING ) )
            // InternalGenerador.g:939:4: (lv_descripcion_5_0= RULE_STRING )
            {
            // InternalGenerador.g:939:4: (lv_descripcion_5_0= RULE_STRING )
            // InternalGenerador.g:940:5: lv_descripcion_5_0= RULE_STRING
            {
            lv_descripcion_5_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_descripcion_5_0, grammarAccess.getProductoAccess().getDescripcionSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProductoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"descripcion",
            						lv_descripcion_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,16,FOLLOW_13); 

            			newLeafNode(otherlv_6, grammarAccess.getProductoAccess().getColonKeyword_6());
            		
            // InternalGenerador.g:960:3: ( (lv_precio_7_0= rulePrecio ) )
            // InternalGenerador.g:961:4: (lv_precio_7_0= rulePrecio )
            {
            // InternalGenerador.g:961:4: (lv_precio_7_0= rulePrecio )
            // InternalGenerador.g:962:5: lv_precio_7_0= rulePrecio
            {

            					newCompositeNode(grammarAccess.getProductoAccess().getPrecioPrecioParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_8);
            lv_precio_7_0=rulePrecio();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProductoRule());
            					}
            					set(
            						current,
            						"precio",
            						lv_precio_7_0,
            						"org.xtext.dsl.generador.Generador.Precio");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,16,FOLLOW_13); 

            			newLeafNode(otherlv_8, grammarAccess.getProductoAccess().getColonKeyword_8());
            		
            // InternalGenerador.g:983:3: ( (lv_cantidad_9_0= RULE_INT ) )
            // InternalGenerador.g:984:4: (lv_cantidad_9_0= RULE_INT )
            {
            // InternalGenerador.g:984:4: (lv_cantidad_9_0= RULE_INT )
            // InternalGenerador.g:985:5: lv_cantidad_9_0= RULE_INT
            {
            lv_cantidad_9_0=(Token)match(input,RULE_INT,FOLLOW_8); 

            					newLeafNode(lv_cantidad_9_0, grammarAccess.getProductoAccess().getCantidadINTTerminalRuleCall_9_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProductoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"cantidad",
            						lv_cantidad_9_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_10=(Token)match(input,16,FOLLOW_29); 

            			newLeafNode(otherlv_10, grammarAccess.getProductoAccess().getColonKeyword_10());
            		
            // InternalGenerador.g:1005:3: ( (lv_categoria_11_0= ruleCategoria ) )
            // InternalGenerador.g:1006:4: (lv_categoria_11_0= ruleCategoria )
            {
            // InternalGenerador.g:1006:4: (lv_categoria_11_0= ruleCategoria )
            // InternalGenerador.g:1007:5: lv_categoria_11_0= ruleCategoria
            {

            					newCompositeNode(grammarAccess.getProductoAccess().getCategoriaCategoriaParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_25);
            lv_categoria_11_0=ruleCategoria();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProductoRule());
            					}
            					set(
            						current,
            						"categoria",
            						lv_categoria_11_0,
            						"org.xtext.dsl.generador.Generador.Categoria");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_12=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getProductoAccess().getRightSquareBracketKeyword_12());
            		

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
    // InternalGenerador.g:1032:1: entryRulePrecio returns [String current=null] : iv_rulePrecio= rulePrecio EOF ;
    public final String entryRulePrecio() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrecio = null;


        try {
            // InternalGenerador.g:1032:46: (iv_rulePrecio= rulePrecio EOF )
            // InternalGenerador.g:1033:2: iv_rulePrecio= rulePrecio EOF
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
    // InternalGenerador.g:1039:1: rulePrecio returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken rulePrecio() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalGenerador.g:1045:2: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) )
            // InternalGenerador.g:1046:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            {
            // InternalGenerador.g:1046:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            // InternalGenerador.g:1047:3: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_30); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getPrecioAccess().getINTTerminalRuleCall_0());
            		
            kw=(Token)match(input,31,FOLLOW_13); 

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


    // $ANTLR start "entryRuleCategoria"
    // InternalGenerador.g:1070:1: entryRuleCategoria returns [String current=null] : iv_ruleCategoria= ruleCategoria EOF ;
    public final String entryRuleCategoria() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCategoria = null;


        try {
            // InternalGenerador.g:1070:49: (iv_ruleCategoria= ruleCategoria EOF )
            // InternalGenerador.g:1071:2: iv_ruleCategoria= ruleCategoria EOF
            {
             newCompositeNode(grammarAccess.getCategoriaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCategoria=ruleCategoria();

            state._fsp--;

             current =iv_ruleCategoria.getText(); 
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
    // $ANTLR end "entryRuleCategoria"


    // $ANTLR start "ruleCategoria"
    // InternalGenerador.g:1077:1: ruleCategoria returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Cosmetica' | kw= 'Higiene' | kw= 'Salud' | kw= 'Dietetica' | kw= 'Bebes' ) ;
    public final AntlrDatatypeRuleToken ruleCategoria() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGenerador.g:1083:2: ( (kw= 'Cosmetica' | kw= 'Higiene' | kw= 'Salud' | kw= 'Dietetica' | kw= 'Bebes' ) )
            // InternalGenerador.g:1084:2: (kw= 'Cosmetica' | kw= 'Higiene' | kw= 'Salud' | kw= 'Dietetica' | kw= 'Bebes' )
            {
            // InternalGenerador.g:1084:2: (kw= 'Cosmetica' | kw= 'Higiene' | kw= 'Salud' | kw= 'Dietetica' | kw= 'Bebes' )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt3=1;
                }
                break;
            case 33:
                {
                alt3=2;
                }
                break;
            case 34:
                {
                alt3=3;
                }
                break;
            case 35:
                {
                alt3=4;
                }
                break;
            case 36:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalGenerador.g:1085:3: kw= 'Cosmetica'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCategoriaAccess().getCosmeticaKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalGenerador.g:1091:3: kw= 'Higiene'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCategoriaAccess().getHigieneKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalGenerador.g:1097:3: kw= 'Salud'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCategoriaAccess().getSaludKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalGenerador.g:1103:3: kw= 'Dietetica'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCategoriaAccess().getDieteticaKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalGenerador.g:1109:3: kw= 'Bebes'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCategoriaAccess().getBebesKeyword_4());
                    		

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
    // $ANTLR end "ruleCategoria"


    // $ANTLR start "entryRuleTipo"
    // InternalGenerador.g:1118:1: entryRuleTipo returns [EObject current=null] : iv_ruleTipo= ruleTipo EOF ;
    public final EObject entryRuleTipo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTipo = null;


        try {
            // InternalGenerador.g:1118:45: (iv_ruleTipo= ruleTipo EOF )
            // InternalGenerador.g:1119:2: iv_ruleTipo= ruleTipo EOF
            {
             newCompositeNode(grammarAccess.getTipoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTipo=ruleTipo();

            state._fsp--;

             current =iv_ruleTipo; 
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
    // $ANTLR end "entryRuleTipo"


    // $ANTLR start "ruleTipo"
    // InternalGenerador.g:1125:1: ruleTipo returns [EObject current=null] : ( ( (lv_desplegable_0_0= ruleDesplegable ) ) | ( (lv_permanente_1_0= rulePermanente ) ) ) ;
    public final EObject ruleTipo() throws RecognitionException {
        EObject current = null;

        EObject lv_desplegable_0_0 = null;

        EObject lv_permanente_1_0 = null;



        	enterRule();

        try {
            // InternalGenerador.g:1131:2: ( ( ( (lv_desplegable_0_0= ruleDesplegable ) ) | ( (lv_permanente_1_0= rulePermanente ) ) ) )
            // InternalGenerador.g:1132:2: ( ( (lv_desplegable_0_0= ruleDesplegable ) ) | ( (lv_permanente_1_0= rulePermanente ) ) )
            {
            // InternalGenerador.g:1132:2: ( ( (lv_desplegable_0_0= ruleDesplegable ) ) | ( (lv_permanente_1_0= rulePermanente ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==37) ) {
                alt4=1;
            }
            else if ( (LA4_0==38) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalGenerador.g:1133:3: ( (lv_desplegable_0_0= ruleDesplegable ) )
                    {
                    // InternalGenerador.g:1133:3: ( (lv_desplegable_0_0= ruleDesplegable ) )
                    // InternalGenerador.g:1134:4: (lv_desplegable_0_0= ruleDesplegable )
                    {
                    // InternalGenerador.g:1134:4: (lv_desplegable_0_0= ruleDesplegable )
                    // InternalGenerador.g:1135:5: lv_desplegable_0_0= ruleDesplegable
                    {

                    					newCompositeNode(grammarAccess.getTipoAccess().getDesplegableDesplegableParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_desplegable_0_0=ruleDesplegable();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTipoRule());
                    					}
                    					set(
                    						current,
                    						"desplegable",
                    						lv_desplegable_0_0,
                    						"org.xtext.dsl.generador.Generador.Desplegable");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGenerador.g:1153:3: ( (lv_permanente_1_0= rulePermanente ) )
                    {
                    // InternalGenerador.g:1153:3: ( (lv_permanente_1_0= rulePermanente ) )
                    // InternalGenerador.g:1154:4: (lv_permanente_1_0= rulePermanente )
                    {
                    // InternalGenerador.g:1154:4: (lv_permanente_1_0= rulePermanente )
                    // InternalGenerador.g:1155:5: lv_permanente_1_0= rulePermanente
                    {

                    					newCompositeNode(grammarAccess.getTipoAccess().getPermanentePermanenteParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_permanente_1_0=rulePermanente();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTipoRule());
                    					}
                    					set(
                    						current,
                    						"permanente",
                    						lv_permanente_1_0,
                    						"org.xtext.dsl.generador.Generador.Permanente");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


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
    // $ANTLR end "ruleTipo"


    // $ANTLR start "entryRuleDesplegable"
    // InternalGenerador.g:1176:1: entryRuleDesplegable returns [EObject current=null] : iv_ruleDesplegable= ruleDesplegable EOF ;
    public final EObject entryRuleDesplegable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDesplegable = null;


        try {
            // InternalGenerador.g:1176:52: (iv_ruleDesplegable= ruleDesplegable EOF )
            // InternalGenerador.g:1177:2: iv_ruleDesplegable= ruleDesplegable EOF
            {
             newCompositeNode(grammarAccess.getDesplegableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDesplegable=ruleDesplegable();

            state._fsp--;

             current =iv_ruleDesplegable; 
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
    // $ANTLR end "entryRuleDesplegable"


    // $ANTLR start "ruleDesplegable"
    // InternalGenerador.g:1183:1: ruleDesplegable returns [EObject current=null] : (otherlv_0= 'Desplegable' otherlv_1= ':' ( (lv_color_2_0= ruleColor ) ) ) ;
    public final EObject ruleDesplegable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_color_2_0 = null;



        	enterRule();

        try {
            // InternalGenerador.g:1189:2: ( (otherlv_0= 'Desplegable' otherlv_1= ':' ( (lv_color_2_0= ruleColor ) ) ) )
            // InternalGenerador.g:1190:2: (otherlv_0= 'Desplegable' otherlv_1= ':' ( (lv_color_2_0= ruleColor ) ) )
            {
            // InternalGenerador.g:1190:2: (otherlv_0= 'Desplegable' otherlv_1= ':' ( (lv_color_2_0= ruleColor ) ) )
            // InternalGenerador.g:1191:3: otherlv_0= 'Desplegable' otherlv_1= ':' ( (lv_color_2_0= ruleColor ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getDesplegableAccess().getDesplegableKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getDesplegableAccess().getColonKeyword_1());
            		
            // InternalGenerador.g:1199:3: ( (lv_color_2_0= ruleColor ) )
            // InternalGenerador.g:1200:4: (lv_color_2_0= ruleColor )
            {
            // InternalGenerador.g:1200:4: (lv_color_2_0= ruleColor )
            // InternalGenerador.g:1201:5: lv_color_2_0= ruleColor
            {

            					newCompositeNode(grammarAccess.getDesplegableAccess().getColorColorParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_color_2_0=ruleColor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDesplegableRule());
            					}
            					set(
            						current,
            						"color",
            						lv_color_2_0,
            						"org.xtext.dsl.generador.Generador.Color");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleDesplegable"


    // $ANTLR start "entryRulePermanente"
    // InternalGenerador.g:1222:1: entryRulePermanente returns [EObject current=null] : iv_rulePermanente= rulePermanente EOF ;
    public final EObject entryRulePermanente() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePermanente = null;


        try {
            // InternalGenerador.g:1222:51: (iv_rulePermanente= rulePermanente EOF )
            // InternalGenerador.g:1223:2: iv_rulePermanente= rulePermanente EOF
            {
             newCompositeNode(grammarAccess.getPermanenteRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePermanente=rulePermanente();

            state._fsp--;

             current =iv_rulePermanente; 
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
    // $ANTLR end "entryRulePermanente"


    // $ANTLR start "rulePermanente"
    // InternalGenerador.g:1229:1: rulePermanente returns [EObject current=null] : (otherlv_0= 'Permanente' otherlv_1= ':' ( (lv_color_2_0= ruleColor ) ) otherlv_3= ':' ( (lv_altura_4_0= ruleMedida ) ) ) ;
    public final EObject rulePermanente() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_color_2_0 = null;

        AntlrDatatypeRuleToken lv_altura_4_0 = null;



        	enterRule();

        try {
            // InternalGenerador.g:1235:2: ( (otherlv_0= 'Permanente' otherlv_1= ':' ( (lv_color_2_0= ruleColor ) ) otherlv_3= ':' ( (lv_altura_4_0= ruleMedida ) ) ) )
            // InternalGenerador.g:1236:2: (otherlv_0= 'Permanente' otherlv_1= ':' ( (lv_color_2_0= ruleColor ) ) otherlv_3= ':' ( (lv_altura_4_0= ruleMedida ) ) )
            {
            // InternalGenerador.g:1236:2: (otherlv_0= 'Permanente' otherlv_1= ':' ( (lv_color_2_0= ruleColor ) ) otherlv_3= ':' ( (lv_altura_4_0= ruleMedida ) ) )
            // InternalGenerador.g:1237:3: otherlv_0= 'Permanente' otherlv_1= ':' ( (lv_color_2_0= ruleColor ) ) otherlv_3= ':' ( (lv_altura_4_0= ruleMedida ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getPermanenteAccess().getPermanenteKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getPermanenteAccess().getColonKeyword_1());
            		
            // InternalGenerador.g:1245:3: ( (lv_color_2_0= ruleColor ) )
            // InternalGenerador.g:1246:4: (lv_color_2_0= ruleColor )
            {
            // InternalGenerador.g:1246:4: (lv_color_2_0= ruleColor )
            // InternalGenerador.g:1247:5: lv_color_2_0= ruleColor
            {

            					newCompositeNode(grammarAccess.getPermanenteAccess().getColorColorParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
            lv_color_2_0=ruleColor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPermanenteRule());
            					}
            					set(
            						current,
            						"color",
            						lv_color_2_0,
            						"org.xtext.dsl.generador.Generador.Color");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getPermanenteAccess().getColonKeyword_3());
            		
            // InternalGenerador.g:1268:3: ( (lv_altura_4_0= ruleMedida ) )
            // InternalGenerador.g:1269:4: (lv_altura_4_0= ruleMedida )
            {
            // InternalGenerador.g:1269:4: (lv_altura_4_0= ruleMedida )
            // InternalGenerador.g:1270:5: lv_altura_4_0= ruleMedida
            {

            					newCompositeNode(grammarAccess.getPermanenteAccess().getAlturaMedidaParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_altura_4_0=ruleMedida();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPermanenteRule());
            					}
            					set(
            						current,
            						"altura",
            						lv_altura_4_0,
            						"org.xtext.dsl.generador.Generador.Medida");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "rulePermanente"


    // $ANTLR start "entryRuleColor"
    // InternalGenerador.g:1291:1: entryRuleColor returns [String current=null] : iv_ruleColor= ruleColor EOF ;
    public final String entryRuleColor() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleColor = null;


        try {
            // InternalGenerador.g:1291:45: (iv_ruleColor= ruleColor EOF )
            // InternalGenerador.g:1292:2: iv_ruleColor= ruleColor EOF
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
    // InternalGenerador.g:1298:1: ruleColor returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '#' (this_ID_1= RULE_ID | this_INT_2= RULE_INT )+ ) ;
    public final AntlrDatatypeRuleToken ruleColor() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalGenerador.g:1304:2: ( (kw= '#' (this_ID_1= RULE_ID | this_INT_2= RULE_INT )+ ) )
            // InternalGenerador.g:1305:2: (kw= '#' (this_ID_1= RULE_ID | this_INT_2= RULE_INT )+ )
            {
            // InternalGenerador.g:1305:2: (kw= '#' (this_ID_1= RULE_ID | this_INT_2= RULE_INT )+ )
            // InternalGenerador.g:1306:3: kw= '#' (this_ID_1= RULE_ID | this_INT_2= RULE_INT )+
            {
            kw=(Token)match(input,39,FOLLOW_31); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getColorAccess().getNumberSignKeyword_0());
            		
            // InternalGenerador.g:1311:3: (this_ID_1= RULE_ID | this_INT_2= RULE_INT )+
            int cnt5=0;
            loop5:
            do {
                int alt5=3;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }
                else if ( (LA5_0==RULE_INT) ) {
                    alt5=2;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalGenerador.g:1312:4: this_ID_1= RULE_ID
            	    {
            	    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_32); 

            	    				current.merge(this_ID_1);
            	    			

            	    				newLeafNode(this_ID_1, grammarAccess.getColorAccess().getIDTerminalRuleCall_1_0());
            	    			

            	    }
            	    break;
            	case 2 :
            	    // InternalGenerador.g:1320:4: this_INT_2= RULE_INT
            	    {
            	    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_32); 

            	    				current.merge(this_INT_2);
            	    			

            	    				newLeafNode(this_INT_2, grammarAccess.getColorAccess().getINTTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
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


    // $ANTLR start "entryRuleMedida"
    // InternalGenerador.g:1332:1: entryRuleMedida returns [String current=null] : iv_ruleMedida= ruleMedida EOF ;
    public final String entryRuleMedida() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMedida = null;


        try {
            // InternalGenerador.g:1332:46: (iv_ruleMedida= ruleMedida EOF )
            // InternalGenerador.g:1333:2: iv_ruleMedida= ruleMedida EOF
            {
             newCompositeNode(grammarAccess.getMedidaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMedida=ruleMedida();

            state._fsp--;

             current =iv_ruleMedida.getText(); 
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
    // $ANTLR end "entryRuleMedida"


    // $ANTLR start "ruleMedida"
    // InternalGenerador.g:1339:1: ruleMedida returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT kw= 'px' ) | (this_INT_2= RULE_INT kw= '%' ) ) ;
    public final AntlrDatatypeRuleToken ruleMedida() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalGenerador.g:1345:2: ( ( (this_INT_0= RULE_INT kw= 'px' ) | (this_INT_2= RULE_INT kw= '%' ) ) )
            // InternalGenerador.g:1346:2: ( (this_INT_0= RULE_INT kw= 'px' ) | (this_INT_2= RULE_INT kw= '%' ) )
            {
            // InternalGenerador.g:1346:2: ( (this_INT_0= RULE_INT kw= 'px' ) | (this_INT_2= RULE_INT kw= '%' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_INT) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==40) ) {
                    alt6=1;
                }
                else if ( (LA6_1==41) ) {
                    alt6=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalGenerador.g:1347:3: (this_INT_0= RULE_INT kw= 'px' )
                    {
                    // InternalGenerador.g:1347:3: (this_INT_0= RULE_INT kw= 'px' )
                    // InternalGenerador.g:1348:4: this_INT_0= RULE_INT kw= 'px'
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_33); 

                    				current.merge(this_INT_0);
                    			

                    				newLeafNode(this_INT_0, grammarAccess.getMedidaAccess().getINTTerminalRuleCall_0_0());
                    			
                    kw=(Token)match(input,40,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getMedidaAccess().getPxKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGenerador.g:1362:3: (this_INT_2= RULE_INT kw= '%' )
                    {
                    // InternalGenerador.g:1362:3: (this_INT_2= RULE_INT kw= '%' )
                    // InternalGenerador.g:1363:4: this_INT_2= RULE_INT kw= '%'
                    {
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_34); 

                    				current.merge(this_INT_2);
                    			

                    				newLeafNode(this_INT_2, grammarAccess.getMedidaAccess().getINTTerminalRuleCall_1_0());
                    			
                    kw=(Token)match(input,41,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getMedidaAccess().getPercentSignKeyword_1_1());
                    			

                    }


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
    // $ANTLR end "ruleMedida"


    // $ANTLR start "entryRuleCorreo"
    // InternalGenerador.g:1380:1: entryRuleCorreo returns [String current=null] : iv_ruleCorreo= ruleCorreo EOF ;
    public final String entryRuleCorreo() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCorreo = null;


        try {
            // InternalGenerador.g:1380:46: (iv_ruleCorreo= ruleCorreo EOF )
            // InternalGenerador.g:1381:2: iv_ruleCorreo= ruleCorreo EOF
            {
             newCompositeNode(grammarAccess.getCorreoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCorreo=ruleCorreo();

            state._fsp--;

             current =iv_ruleCorreo.getText(); 
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
    // $ANTLR end "entryRuleCorreo"


    // $ANTLR start "ruleCorreo"
    // InternalGenerador.g:1387:1: ruleCorreo returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID kw= '@' this_ID_2= RULE_ID kw= '.' this_ID_4= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleCorreo() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;
        Token this_ID_4=null;


        	enterRule();

        try {
            // InternalGenerador.g:1393:2: ( (this_ID_0= RULE_ID kw= '@' this_ID_2= RULE_ID kw= '.' this_ID_4= RULE_ID ) )
            // InternalGenerador.g:1394:2: (this_ID_0= RULE_ID kw= '@' this_ID_2= RULE_ID kw= '.' this_ID_4= RULE_ID )
            {
            // InternalGenerador.g:1394:2: (this_ID_0= RULE_ID kw= '@' this_ID_2= RULE_ID kw= '.' this_ID_4= RULE_ID )
            // InternalGenerador.g:1395:3: this_ID_0= RULE_ID kw= '@' this_ID_2= RULE_ID kw= '.' this_ID_4= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_35); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getCorreoAccess().getIDTerminalRuleCall_0());
            		
            kw=(Token)match(input,42,FOLLOW_12); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getCorreoAccess().getCommercialAtKeyword_1());
            		
            this_ID_2=(Token)match(input,RULE_ID,FOLLOW_30); 

            			current.merge(this_ID_2);
            		

            			newLeafNode(this_ID_2, grammarAccess.getCorreoAccess().getIDTerminalRuleCall_2());
            		
            kw=(Token)match(input,31,FOLLOW_12); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getCorreoAccess().getFullStopKeyword_3());
            		
            this_ID_4=(Token)match(input,RULE_ID,FOLLOW_2); 

            			current.merge(this_ID_4);
            		

            			newLeafNode(this_ID_4, grammarAccess.getCorreoAccess().getIDTerminalRuleCall_4());
            		

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
    // $ANTLR end "ruleCorreo"


    // $ANTLR start "entryRuleRegistro"
    // InternalGenerador.g:1430:1: entryRuleRegistro returns [EObject current=null] : iv_ruleRegistro= ruleRegistro EOF ;
    public final EObject entryRuleRegistro() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegistro = null;


        try {
            // InternalGenerador.g:1430:49: (iv_ruleRegistro= ruleRegistro EOF )
            // InternalGenerador.g:1431:2: iv_ruleRegistro= ruleRegistro EOF
            {
             newCompositeNode(grammarAccess.getRegistroRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRegistro=ruleRegistro();

            state._fsp--;

             current =iv_ruleRegistro; 
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
    // $ANTLR end "entryRuleRegistro"


    // $ANTLR start "ruleRegistro"
    // InternalGenerador.g:1437:1: ruleRegistro returns [EObject current=null] : (otherlv_0= '[' otherlv_1= 'Registro' otherlv_2= '=' ( (lv_tomo_3_0= RULE_INT ) ) otherlv_4= ':' ( (lv_folio_5_0= RULE_INT ) ) otherlv_6= ':' ( (lv_seccion_7_0= RULE_INT ) ) otherlv_8= ':' ( (lv_hoja_9_0= RULE_INT ) ) otherlv_10= ']' ) ;
    public final EObject ruleRegistro() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_tomo_3_0=null;
        Token otherlv_4=null;
        Token lv_folio_5_0=null;
        Token otherlv_6=null;
        Token lv_seccion_7_0=null;
        Token otherlv_8=null;
        Token lv_hoja_9_0=null;
        Token otherlv_10=null;


        	enterRule();

        try {
            // InternalGenerador.g:1443:2: ( (otherlv_0= '[' otherlv_1= 'Registro' otherlv_2= '=' ( (lv_tomo_3_0= RULE_INT ) ) otherlv_4= ':' ( (lv_folio_5_0= RULE_INT ) ) otherlv_6= ':' ( (lv_seccion_7_0= RULE_INT ) ) otherlv_8= ':' ( (lv_hoja_9_0= RULE_INT ) ) otherlv_10= ']' ) )
            // InternalGenerador.g:1444:2: (otherlv_0= '[' otherlv_1= 'Registro' otherlv_2= '=' ( (lv_tomo_3_0= RULE_INT ) ) otherlv_4= ':' ( (lv_folio_5_0= RULE_INT ) ) otherlv_6= ':' ( (lv_seccion_7_0= RULE_INT ) ) otherlv_8= ':' ( (lv_hoja_9_0= RULE_INT ) ) otherlv_10= ']' )
            {
            // InternalGenerador.g:1444:2: (otherlv_0= '[' otherlv_1= 'Registro' otherlv_2= '=' ( (lv_tomo_3_0= RULE_INT ) ) otherlv_4= ':' ( (lv_folio_5_0= RULE_INT ) ) otherlv_6= ':' ( (lv_seccion_7_0= RULE_INT ) ) otherlv_8= ':' ( (lv_hoja_9_0= RULE_INT ) ) otherlv_10= ']' )
            // InternalGenerador.g:1445:3: otherlv_0= '[' otherlv_1= 'Registro' otherlv_2= '=' ( (lv_tomo_3_0= RULE_INT ) ) otherlv_4= ':' ( (lv_folio_5_0= RULE_INT ) ) otherlv_6= ':' ( (lv_seccion_7_0= RULE_INT ) ) otherlv_8= ':' ( (lv_hoja_9_0= RULE_INT ) ) otherlv_10= ']'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_36); 

            			newLeafNode(otherlv_0, grammarAccess.getRegistroAccess().getLeftSquareBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,43,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getRegistroAccess().getRegistroKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getRegistroAccess().getEqualsSignKeyword_2());
            		
            // InternalGenerador.g:1457:3: ( (lv_tomo_3_0= RULE_INT ) )
            // InternalGenerador.g:1458:4: (lv_tomo_3_0= RULE_INT )
            {
            // InternalGenerador.g:1458:4: (lv_tomo_3_0= RULE_INT )
            // InternalGenerador.g:1459:5: lv_tomo_3_0= RULE_INT
            {
            lv_tomo_3_0=(Token)match(input,RULE_INT,FOLLOW_8); 

            					newLeafNode(lv_tomo_3_0, grammarAccess.getRegistroAccess().getTomoINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRegistroRule());
            					}
            					setWithLastConsumed(
            						current,
            						"tomo",
            						lv_tomo_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getRegistroAccess().getColonKeyword_4());
            		
            // InternalGenerador.g:1479:3: ( (lv_folio_5_0= RULE_INT ) )
            // InternalGenerador.g:1480:4: (lv_folio_5_0= RULE_INT )
            {
            // InternalGenerador.g:1480:4: (lv_folio_5_0= RULE_INT )
            // InternalGenerador.g:1481:5: lv_folio_5_0= RULE_INT
            {
            lv_folio_5_0=(Token)match(input,RULE_INT,FOLLOW_8); 

            					newLeafNode(lv_folio_5_0, grammarAccess.getRegistroAccess().getFolioINTTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRegistroRule());
            					}
            					setWithLastConsumed(
            						current,
            						"folio",
            						lv_folio_5_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_6=(Token)match(input,16,FOLLOW_13); 

            			newLeafNode(otherlv_6, grammarAccess.getRegistroAccess().getColonKeyword_6());
            		
            // InternalGenerador.g:1501:3: ( (lv_seccion_7_0= RULE_INT ) )
            // InternalGenerador.g:1502:4: (lv_seccion_7_0= RULE_INT )
            {
            // InternalGenerador.g:1502:4: (lv_seccion_7_0= RULE_INT )
            // InternalGenerador.g:1503:5: lv_seccion_7_0= RULE_INT
            {
            lv_seccion_7_0=(Token)match(input,RULE_INT,FOLLOW_8); 

            					newLeafNode(lv_seccion_7_0, grammarAccess.getRegistroAccess().getSeccionINTTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRegistroRule());
            					}
            					setWithLastConsumed(
            						current,
            						"seccion",
            						lv_seccion_7_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_8=(Token)match(input,16,FOLLOW_13); 

            			newLeafNode(otherlv_8, grammarAccess.getRegistroAccess().getColonKeyword_8());
            		
            // InternalGenerador.g:1523:3: ( (lv_hoja_9_0= RULE_INT ) )
            // InternalGenerador.g:1524:4: (lv_hoja_9_0= RULE_INT )
            {
            // InternalGenerador.g:1524:4: (lv_hoja_9_0= RULE_INT )
            // InternalGenerador.g:1525:5: lv_hoja_9_0= RULE_INT
            {
            lv_hoja_9_0=(Token)match(input,RULE_INT,FOLLOW_25); 

            					newLeafNode(lv_hoja_9_0, grammarAccess.getRegistroAccess().getHojaINTTerminalRuleCall_9_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRegistroRule());
            					}
            					setWithLastConsumed(
            						current,
            						"hoja",
            						lv_hoja_9_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_10=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getRegistroAccess().getRightSquareBracketKeyword_10());
            		

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
    // $ANTLR end "ruleRegistro"


    // $ANTLR start "entryRuleDireccion"
    // InternalGenerador.g:1549:1: entryRuleDireccion returns [EObject current=null] : iv_ruleDireccion= ruleDireccion EOF ;
    public final EObject entryRuleDireccion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDireccion = null;


        try {
            // InternalGenerador.g:1549:50: (iv_ruleDireccion= ruleDireccion EOF )
            // InternalGenerador.g:1550:2: iv_ruleDireccion= ruleDireccion EOF
            {
             newCompositeNode(grammarAccess.getDireccionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDireccion=ruleDireccion();

            state._fsp--;

             current =iv_ruleDireccion; 
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
    // $ANTLR end "entryRuleDireccion"


    // $ANTLR start "ruleDireccion"
    // InternalGenerador.g:1556:1: ruleDireccion returns [EObject current=null] : (otherlv_0= '[' otherlv_1= 'Direccion' otherlv_2= '=' ( (lv_calle_3_0= RULE_STRING ) ) otherlv_4= ':' ( (lv_ciudad_5_0= RULE_STRING ) ) otherlv_6= ':' ( (lv_pais_7_0= RULE_STRING ) ) otherlv_8= ']' ) ;
    public final EObject ruleDireccion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_calle_3_0=null;
        Token otherlv_4=null;
        Token lv_ciudad_5_0=null;
        Token otherlv_6=null;
        Token lv_pais_7_0=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalGenerador.g:1562:2: ( (otherlv_0= '[' otherlv_1= 'Direccion' otherlv_2= '=' ( (lv_calle_3_0= RULE_STRING ) ) otherlv_4= ':' ( (lv_ciudad_5_0= RULE_STRING ) ) otherlv_6= ':' ( (lv_pais_7_0= RULE_STRING ) ) otherlv_8= ']' ) )
            // InternalGenerador.g:1563:2: (otherlv_0= '[' otherlv_1= 'Direccion' otherlv_2= '=' ( (lv_calle_3_0= RULE_STRING ) ) otherlv_4= ':' ( (lv_ciudad_5_0= RULE_STRING ) ) otherlv_6= ':' ( (lv_pais_7_0= RULE_STRING ) ) otherlv_8= ']' )
            {
            // InternalGenerador.g:1563:2: (otherlv_0= '[' otherlv_1= 'Direccion' otherlv_2= '=' ( (lv_calle_3_0= RULE_STRING ) ) otherlv_4= ':' ( (lv_ciudad_5_0= RULE_STRING ) ) otherlv_6= ':' ( (lv_pais_7_0= RULE_STRING ) ) otherlv_8= ']' )
            // InternalGenerador.g:1564:3: otherlv_0= '[' otherlv_1= 'Direccion' otherlv_2= '=' ( (lv_calle_3_0= RULE_STRING ) ) otherlv_4= ':' ( (lv_ciudad_5_0= RULE_STRING ) ) otherlv_6= ':' ( (lv_pais_7_0= RULE_STRING ) ) otherlv_8= ']'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_37); 

            			newLeafNode(otherlv_0, grammarAccess.getDireccionAccess().getLeftSquareBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,44,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getDireccionAccess().getDireccionKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getDireccionAccess().getEqualsSignKeyword_2());
            		
            // InternalGenerador.g:1576:3: ( (lv_calle_3_0= RULE_STRING ) )
            // InternalGenerador.g:1577:4: (lv_calle_3_0= RULE_STRING )
            {
            // InternalGenerador.g:1577:4: (lv_calle_3_0= RULE_STRING )
            // InternalGenerador.g:1578:5: lv_calle_3_0= RULE_STRING
            {
            lv_calle_3_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_calle_3_0, grammarAccess.getDireccionAccess().getCalleSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDireccionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"calle",
            						lv_calle_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getDireccionAccess().getColonKeyword_4());
            		
            // InternalGenerador.g:1598:3: ( (lv_ciudad_5_0= RULE_STRING ) )
            // InternalGenerador.g:1599:4: (lv_ciudad_5_0= RULE_STRING )
            {
            // InternalGenerador.g:1599:4: (lv_ciudad_5_0= RULE_STRING )
            // InternalGenerador.g:1600:5: lv_ciudad_5_0= RULE_STRING
            {
            lv_ciudad_5_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_ciudad_5_0, grammarAccess.getDireccionAccess().getCiudadSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDireccionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"ciudad",
            						lv_ciudad_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,16,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getDireccionAccess().getColonKeyword_6());
            		
            // InternalGenerador.g:1620:3: ( (lv_pais_7_0= RULE_STRING ) )
            // InternalGenerador.g:1621:4: (lv_pais_7_0= RULE_STRING )
            {
            // InternalGenerador.g:1621:4: (lv_pais_7_0= RULE_STRING )
            // InternalGenerador.g:1622:5: lv_pais_7_0= RULE_STRING
            {
            lv_pais_7_0=(Token)match(input,RULE_STRING,FOLLOW_25); 

            					newLeafNode(lv_pais_7_0, grammarAccess.getDireccionAccess().getPaisSTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDireccionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"pais",
            						lv_pais_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_8=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getDireccionAccess().getRightSquareBracketKeyword_8());
            		

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
    // $ANTLR end "ruleDireccion"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000001F00020000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002020000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000001F00000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000062L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000100000000000L});

}