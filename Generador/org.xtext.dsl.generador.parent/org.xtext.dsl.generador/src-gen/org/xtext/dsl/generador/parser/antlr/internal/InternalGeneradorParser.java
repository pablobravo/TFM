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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Parafarmacia'", "'{'", "'<'", "'Nombre'", "'='", "':'", "'>'", "'Titular'", "'Menu'", "'Apariencia'", "'Categorias'", "'Productos'", "'Usuario'", "'}'", "'['", "'Color'", "'principal'", "'.'", "'principalClaro'", "'secundario'", "'fondo'", "'fondoProductos'", "'precios'", "'texto'", "'titulo'", "']'", "'Texto'", "'normal'", "'grande'", "'menu'", "'Margen'", "'Producto'", "'Cosmetica'", "'Higiene'", "'Salud'", "'Dietetica'", "'Bebes'", "'Desplegable'", "'Permanente'", "'#'", "'px'", "'%'", "'@'", "'Registro'", "'Direccion'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
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
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
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

                if ( ((LA1_0>=43 && LA1_0<=47)) ) {
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
    // InternalGenerador.g:542:1: ruleApariencia returns [EObject current=null] : (otherlv_0= '[' otherlv_1= 'Color' otherlv_2= '=' otherlv_3= 'principal' otherlv_4= '.' ( (lv_principal_5_0= ruleColor ) ) otherlv_6= ':' otherlv_7= 'principalClaro' otherlv_8= '.' ( (lv_principalClaro_9_0= ruleColor ) ) otherlv_10= ':' otherlv_11= 'secundario' otherlv_12= '.' ( (lv_secundario_13_0= ruleColor ) ) otherlv_14= ':' otherlv_15= 'fondo' otherlv_16= '.' ( (lv_fondo_17_0= ruleColor ) ) otherlv_18= ':' otherlv_19= 'fondoProductos' otherlv_20= '.' ( (lv_fondoProductos_21_0= ruleColor ) ) otherlv_22= ':' otherlv_23= 'precios' otherlv_24= '.' ( (lv_precios_25_0= ruleColor ) ) otherlv_26= ':' otherlv_27= 'texto' otherlv_28= '.' ( (lv_texto_29_0= ruleColor ) ) otherlv_30= ':' otherlv_31= 'titulo' otherlv_32= '.' ( (lv_tituloColor_33_0= ruleColor ) ) otherlv_34= ']' otherlv_35= '[' otherlv_36= 'Texto' otherlv_37= '=' otherlv_38= 'normal' otherlv_39= '.' ( (lv_normal_40_0= ruleMedida ) ) otherlv_41= ':' otherlv_42= 'grande' otherlv_43= '.' ( (lv_grande_44_0= ruleMedida ) ) otherlv_45= ':' otherlv_46= 'titulo' otherlv_47= '.' ( (lv_titulo_48_0= ruleMedida ) ) otherlv_49= ':' otherlv_50= 'menu' otherlv_51= '.' ( (lv_menu_52_0= ruleMedida ) ) otherlv_53= ']' otherlv_54= '[' otherlv_55= 'Margen' otherlv_56= '=' ( (lv_lateral_57_0= ruleMedida ) ) otherlv_58= ']' ) ;
    public final EObject ruleApariencia() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        Token otherlv_36=null;
        Token otherlv_37=null;
        Token otherlv_38=null;
        Token otherlv_39=null;
        Token otherlv_41=null;
        Token otherlv_42=null;
        Token otherlv_43=null;
        Token otherlv_45=null;
        Token otherlv_46=null;
        Token otherlv_47=null;
        Token otherlv_49=null;
        Token otherlv_50=null;
        Token otherlv_51=null;
        Token otherlv_53=null;
        Token otherlv_54=null;
        Token otherlv_55=null;
        Token otherlv_56=null;
        Token otherlv_58=null;
        AntlrDatatypeRuleToken lv_principal_5_0 = null;

        AntlrDatatypeRuleToken lv_principalClaro_9_0 = null;

        AntlrDatatypeRuleToken lv_secundario_13_0 = null;

        AntlrDatatypeRuleToken lv_fondo_17_0 = null;

        AntlrDatatypeRuleToken lv_fondoProductos_21_0 = null;

        AntlrDatatypeRuleToken lv_precios_25_0 = null;

        AntlrDatatypeRuleToken lv_texto_29_0 = null;

        AntlrDatatypeRuleToken lv_tituloColor_33_0 = null;

        AntlrDatatypeRuleToken lv_normal_40_0 = null;

        AntlrDatatypeRuleToken lv_grande_44_0 = null;

        AntlrDatatypeRuleToken lv_titulo_48_0 = null;

        AntlrDatatypeRuleToken lv_menu_52_0 = null;

        AntlrDatatypeRuleToken lv_lateral_57_0 = null;



        	enterRule();

        try {
            // InternalGenerador.g:548:2: ( (otherlv_0= '[' otherlv_1= 'Color' otherlv_2= '=' otherlv_3= 'principal' otherlv_4= '.' ( (lv_principal_5_0= ruleColor ) ) otherlv_6= ':' otherlv_7= 'principalClaro' otherlv_8= '.' ( (lv_principalClaro_9_0= ruleColor ) ) otherlv_10= ':' otherlv_11= 'secundario' otherlv_12= '.' ( (lv_secundario_13_0= ruleColor ) ) otherlv_14= ':' otherlv_15= 'fondo' otherlv_16= '.' ( (lv_fondo_17_0= ruleColor ) ) otherlv_18= ':' otherlv_19= 'fondoProductos' otherlv_20= '.' ( (lv_fondoProductos_21_0= ruleColor ) ) otherlv_22= ':' otherlv_23= 'precios' otherlv_24= '.' ( (lv_precios_25_0= ruleColor ) ) otherlv_26= ':' otherlv_27= 'texto' otherlv_28= '.' ( (lv_texto_29_0= ruleColor ) ) otherlv_30= ':' otherlv_31= 'titulo' otherlv_32= '.' ( (lv_tituloColor_33_0= ruleColor ) ) otherlv_34= ']' otherlv_35= '[' otherlv_36= 'Texto' otherlv_37= '=' otherlv_38= 'normal' otherlv_39= '.' ( (lv_normal_40_0= ruleMedida ) ) otherlv_41= ':' otherlv_42= 'grande' otherlv_43= '.' ( (lv_grande_44_0= ruleMedida ) ) otherlv_45= ':' otherlv_46= 'titulo' otherlv_47= '.' ( (lv_titulo_48_0= ruleMedida ) ) otherlv_49= ':' otherlv_50= 'menu' otherlv_51= '.' ( (lv_menu_52_0= ruleMedida ) ) otherlv_53= ']' otherlv_54= '[' otherlv_55= 'Margen' otherlv_56= '=' ( (lv_lateral_57_0= ruleMedida ) ) otherlv_58= ']' ) )
            // InternalGenerador.g:549:2: (otherlv_0= '[' otherlv_1= 'Color' otherlv_2= '=' otherlv_3= 'principal' otherlv_4= '.' ( (lv_principal_5_0= ruleColor ) ) otherlv_6= ':' otherlv_7= 'principalClaro' otherlv_8= '.' ( (lv_principalClaro_9_0= ruleColor ) ) otherlv_10= ':' otherlv_11= 'secundario' otherlv_12= '.' ( (lv_secundario_13_0= ruleColor ) ) otherlv_14= ':' otherlv_15= 'fondo' otherlv_16= '.' ( (lv_fondo_17_0= ruleColor ) ) otherlv_18= ':' otherlv_19= 'fondoProductos' otherlv_20= '.' ( (lv_fondoProductos_21_0= ruleColor ) ) otherlv_22= ':' otherlv_23= 'precios' otherlv_24= '.' ( (lv_precios_25_0= ruleColor ) ) otherlv_26= ':' otherlv_27= 'texto' otherlv_28= '.' ( (lv_texto_29_0= ruleColor ) ) otherlv_30= ':' otherlv_31= 'titulo' otherlv_32= '.' ( (lv_tituloColor_33_0= ruleColor ) ) otherlv_34= ']' otherlv_35= '[' otherlv_36= 'Texto' otherlv_37= '=' otherlv_38= 'normal' otherlv_39= '.' ( (lv_normal_40_0= ruleMedida ) ) otherlv_41= ':' otherlv_42= 'grande' otherlv_43= '.' ( (lv_grande_44_0= ruleMedida ) ) otherlv_45= ':' otherlv_46= 'titulo' otherlv_47= '.' ( (lv_titulo_48_0= ruleMedida ) ) otherlv_49= ':' otherlv_50= 'menu' otherlv_51= '.' ( (lv_menu_52_0= ruleMedida ) ) otherlv_53= ']' otherlv_54= '[' otherlv_55= 'Margen' otherlv_56= '=' ( (lv_lateral_57_0= ruleMedida ) ) otherlv_58= ']' )
            {
            // InternalGenerador.g:549:2: (otherlv_0= '[' otherlv_1= 'Color' otherlv_2= '=' otherlv_3= 'principal' otherlv_4= '.' ( (lv_principal_5_0= ruleColor ) ) otherlv_6= ':' otherlv_7= 'principalClaro' otherlv_8= '.' ( (lv_principalClaro_9_0= ruleColor ) ) otherlv_10= ':' otherlv_11= 'secundario' otherlv_12= '.' ( (lv_secundario_13_0= ruleColor ) ) otherlv_14= ':' otherlv_15= 'fondo' otherlv_16= '.' ( (lv_fondo_17_0= ruleColor ) ) otherlv_18= ':' otherlv_19= 'fondoProductos' otherlv_20= '.' ( (lv_fondoProductos_21_0= ruleColor ) ) otherlv_22= ':' otherlv_23= 'precios' otherlv_24= '.' ( (lv_precios_25_0= ruleColor ) ) otherlv_26= ':' otherlv_27= 'texto' otherlv_28= '.' ( (lv_texto_29_0= ruleColor ) ) otherlv_30= ':' otherlv_31= 'titulo' otherlv_32= '.' ( (lv_tituloColor_33_0= ruleColor ) ) otherlv_34= ']' otherlv_35= '[' otherlv_36= 'Texto' otherlv_37= '=' otherlv_38= 'normal' otherlv_39= '.' ( (lv_normal_40_0= ruleMedida ) ) otherlv_41= ':' otherlv_42= 'grande' otherlv_43= '.' ( (lv_grande_44_0= ruleMedida ) ) otherlv_45= ':' otherlv_46= 'titulo' otherlv_47= '.' ( (lv_titulo_48_0= ruleMedida ) ) otherlv_49= ':' otherlv_50= 'menu' otherlv_51= '.' ( (lv_menu_52_0= ruleMedida ) ) otherlv_53= ']' otherlv_54= '[' otherlv_55= 'Margen' otherlv_56= '=' ( (lv_lateral_57_0= ruleMedida ) ) otherlv_58= ']' )
            // InternalGenerador.g:550:3: otherlv_0= '[' otherlv_1= 'Color' otherlv_2= '=' otherlv_3= 'principal' otherlv_4= '.' ( (lv_principal_5_0= ruleColor ) ) otherlv_6= ':' otherlv_7= 'principalClaro' otherlv_8= '.' ( (lv_principalClaro_9_0= ruleColor ) ) otherlv_10= ':' otherlv_11= 'secundario' otherlv_12= '.' ( (lv_secundario_13_0= ruleColor ) ) otherlv_14= ':' otherlv_15= 'fondo' otherlv_16= '.' ( (lv_fondo_17_0= ruleColor ) ) otherlv_18= ':' otherlv_19= 'fondoProductos' otherlv_20= '.' ( (lv_fondoProductos_21_0= ruleColor ) ) otherlv_22= ':' otherlv_23= 'precios' otherlv_24= '.' ( (lv_precios_25_0= ruleColor ) ) otherlv_26= ':' otherlv_27= 'texto' otherlv_28= '.' ( (lv_texto_29_0= ruleColor ) ) otherlv_30= ':' otherlv_31= 'titulo' otherlv_32= '.' ( (lv_tituloColor_33_0= ruleColor ) ) otherlv_34= ']' otherlv_35= '[' otherlv_36= 'Texto' otherlv_37= '=' otherlv_38= 'normal' otherlv_39= '.' ( (lv_normal_40_0= ruleMedida ) ) otherlv_41= ':' otherlv_42= 'grande' otherlv_43= '.' ( (lv_grande_44_0= ruleMedida ) ) otherlv_45= ':' otherlv_46= 'titulo' otherlv_47= '.' ( (lv_titulo_48_0= ruleMedida ) ) otherlv_49= ':' otherlv_50= 'menu' otherlv_51= '.' ( (lv_menu_52_0= ruleMedida ) ) otherlv_53= ']' otherlv_54= '[' otherlv_55= 'Margen' otherlv_56= '=' ( (lv_lateral_57_0= ruleMedida ) ) otherlv_58= ']'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getAparienciaAccess().getLeftSquareBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,26,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getAparienciaAccess().getColorKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_24); 

            			newLeafNode(otherlv_2, grammarAccess.getAparienciaAccess().getEqualsSignKeyword_2());
            		
            otherlv_3=(Token)match(input,27,FOLLOW_25); 

            			newLeafNode(otherlv_3, grammarAccess.getAparienciaAccess().getPrincipalKeyword_3());
            		
            otherlv_4=(Token)match(input,28,FOLLOW_26); 

            			newLeafNode(otherlv_4, grammarAccess.getAparienciaAccess().getFullStopKeyword_4());
            		
            // InternalGenerador.g:570:3: ( (lv_principal_5_0= ruleColor ) )
            // InternalGenerador.g:571:4: (lv_principal_5_0= ruleColor )
            {
            // InternalGenerador.g:571:4: (lv_principal_5_0= ruleColor )
            // InternalGenerador.g:572:5: lv_principal_5_0= ruleColor
            {

            					newCompositeNode(grammarAccess.getAparienciaAccess().getPrincipalColorParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_8);
            lv_principal_5_0=ruleColor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAparienciaRule());
            					}
            					set(
            						current,
            						"principal",
            						lv_principal_5_0,
            						"org.xtext.dsl.generador.Generador.Color");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,16,FOLLOW_27); 

            			newLeafNode(otherlv_6, grammarAccess.getAparienciaAccess().getColonKeyword_6());
            		
            otherlv_7=(Token)match(input,29,FOLLOW_25); 

            			newLeafNode(otherlv_7, grammarAccess.getAparienciaAccess().getPrincipalClaroKeyword_7());
            		
            otherlv_8=(Token)match(input,28,FOLLOW_26); 

            			newLeafNode(otherlv_8, grammarAccess.getAparienciaAccess().getFullStopKeyword_8());
            		
            // InternalGenerador.g:601:3: ( (lv_principalClaro_9_0= ruleColor ) )
            // InternalGenerador.g:602:4: (lv_principalClaro_9_0= ruleColor )
            {
            // InternalGenerador.g:602:4: (lv_principalClaro_9_0= ruleColor )
            // InternalGenerador.g:603:5: lv_principalClaro_9_0= ruleColor
            {

            					newCompositeNode(grammarAccess.getAparienciaAccess().getPrincipalClaroColorParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_8);
            lv_principalClaro_9_0=ruleColor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAparienciaRule());
            					}
            					set(
            						current,
            						"principalClaro",
            						lv_principalClaro_9_0,
            						"org.xtext.dsl.generador.Generador.Color");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,16,FOLLOW_28); 

            			newLeafNode(otherlv_10, grammarAccess.getAparienciaAccess().getColonKeyword_10());
            		
            otherlv_11=(Token)match(input,30,FOLLOW_25); 

            			newLeafNode(otherlv_11, grammarAccess.getAparienciaAccess().getSecundarioKeyword_11());
            		
            otherlv_12=(Token)match(input,28,FOLLOW_26); 

            			newLeafNode(otherlv_12, grammarAccess.getAparienciaAccess().getFullStopKeyword_12());
            		
            // InternalGenerador.g:632:3: ( (lv_secundario_13_0= ruleColor ) )
            // InternalGenerador.g:633:4: (lv_secundario_13_0= ruleColor )
            {
            // InternalGenerador.g:633:4: (lv_secundario_13_0= ruleColor )
            // InternalGenerador.g:634:5: lv_secundario_13_0= ruleColor
            {

            					newCompositeNode(grammarAccess.getAparienciaAccess().getSecundarioColorParserRuleCall_13_0());
            				
            pushFollow(FOLLOW_8);
            lv_secundario_13_0=ruleColor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAparienciaRule());
            					}
            					set(
            						current,
            						"secundario",
            						lv_secundario_13_0,
            						"org.xtext.dsl.generador.Generador.Color");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_14=(Token)match(input,16,FOLLOW_29); 

            			newLeafNode(otherlv_14, grammarAccess.getAparienciaAccess().getColonKeyword_14());
            		
            otherlv_15=(Token)match(input,31,FOLLOW_25); 

            			newLeafNode(otherlv_15, grammarAccess.getAparienciaAccess().getFondoKeyword_15());
            		
            otherlv_16=(Token)match(input,28,FOLLOW_26); 

            			newLeafNode(otherlv_16, grammarAccess.getAparienciaAccess().getFullStopKeyword_16());
            		
            // InternalGenerador.g:663:3: ( (lv_fondo_17_0= ruleColor ) )
            // InternalGenerador.g:664:4: (lv_fondo_17_0= ruleColor )
            {
            // InternalGenerador.g:664:4: (lv_fondo_17_0= ruleColor )
            // InternalGenerador.g:665:5: lv_fondo_17_0= ruleColor
            {

            					newCompositeNode(grammarAccess.getAparienciaAccess().getFondoColorParserRuleCall_17_0());
            				
            pushFollow(FOLLOW_8);
            lv_fondo_17_0=ruleColor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAparienciaRule());
            					}
            					set(
            						current,
            						"fondo",
            						lv_fondo_17_0,
            						"org.xtext.dsl.generador.Generador.Color");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_18=(Token)match(input,16,FOLLOW_30); 

            			newLeafNode(otherlv_18, grammarAccess.getAparienciaAccess().getColonKeyword_18());
            		
            otherlv_19=(Token)match(input,32,FOLLOW_25); 

            			newLeafNode(otherlv_19, grammarAccess.getAparienciaAccess().getFondoProductosKeyword_19());
            		
            otherlv_20=(Token)match(input,28,FOLLOW_26); 

            			newLeafNode(otherlv_20, grammarAccess.getAparienciaAccess().getFullStopKeyword_20());
            		
            // InternalGenerador.g:694:3: ( (lv_fondoProductos_21_0= ruleColor ) )
            // InternalGenerador.g:695:4: (lv_fondoProductos_21_0= ruleColor )
            {
            // InternalGenerador.g:695:4: (lv_fondoProductos_21_0= ruleColor )
            // InternalGenerador.g:696:5: lv_fondoProductos_21_0= ruleColor
            {

            					newCompositeNode(grammarAccess.getAparienciaAccess().getFondoProductosColorParserRuleCall_21_0());
            				
            pushFollow(FOLLOW_8);
            lv_fondoProductos_21_0=ruleColor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAparienciaRule());
            					}
            					set(
            						current,
            						"fondoProductos",
            						lv_fondoProductos_21_0,
            						"org.xtext.dsl.generador.Generador.Color");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_22=(Token)match(input,16,FOLLOW_31); 

            			newLeafNode(otherlv_22, grammarAccess.getAparienciaAccess().getColonKeyword_22());
            		
            otherlv_23=(Token)match(input,33,FOLLOW_25); 

            			newLeafNode(otherlv_23, grammarAccess.getAparienciaAccess().getPreciosKeyword_23());
            		
            otherlv_24=(Token)match(input,28,FOLLOW_26); 

            			newLeafNode(otherlv_24, grammarAccess.getAparienciaAccess().getFullStopKeyword_24());
            		
            // InternalGenerador.g:725:3: ( (lv_precios_25_0= ruleColor ) )
            // InternalGenerador.g:726:4: (lv_precios_25_0= ruleColor )
            {
            // InternalGenerador.g:726:4: (lv_precios_25_0= ruleColor )
            // InternalGenerador.g:727:5: lv_precios_25_0= ruleColor
            {

            					newCompositeNode(grammarAccess.getAparienciaAccess().getPreciosColorParserRuleCall_25_0());
            				
            pushFollow(FOLLOW_8);
            lv_precios_25_0=ruleColor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAparienciaRule());
            					}
            					set(
            						current,
            						"precios",
            						lv_precios_25_0,
            						"org.xtext.dsl.generador.Generador.Color");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_26=(Token)match(input,16,FOLLOW_32); 

            			newLeafNode(otherlv_26, grammarAccess.getAparienciaAccess().getColonKeyword_26());
            		
            otherlv_27=(Token)match(input,34,FOLLOW_25); 

            			newLeafNode(otherlv_27, grammarAccess.getAparienciaAccess().getTextoKeyword_27());
            		
            otherlv_28=(Token)match(input,28,FOLLOW_26); 

            			newLeafNode(otherlv_28, grammarAccess.getAparienciaAccess().getFullStopKeyword_28());
            		
            // InternalGenerador.g:756:3: ( (lv_texto_29_0= ruleColor ) )
            // InternalGenerador.g:757:4: (lv_texto_29_0= ruleColor )
            {
            // InternalGenerador.g:757:4: (lv_texto_29_0= ruleColor )
            // InternalGenerador.g:758:5: lv_texto_29_0= ruleColor
            {

            					newCompositeNode(grammarAccess.getAparienciaAccess().getTextoColorParserRuleCall_29_0());
            				
            pushFollow(FOLLOW_8);
            lv_texto_29_0=ruleColor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAparienciaRule());
            					}
            					set(
            						current,
            						"texto",
            						lv_texto_29_0,
            						"org.xtext.dsl.generador.Generador.Color");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_30=(Token)match(input,16,FOLLOW_33); 

            			newLeafNode(otherlv_30, grammarAccess.getAparienciaAccess().getColonKeyword_30());
            		
            otherlv_31=(Token)match(input,35,FOLLOW_25); 

            			newLeafNode(otherlv_31, grammarAccess.getAparienciaAccess().getTituloKeyword_31());
            		
            otherlv_32=(Token)match(input,28,FOLLOW_26); 

            			newLeafNode(otherlv_32, grammarAccess.getAparienciaAccess().getFullStopKeyword_32());
            		
            // InternalGenerador.g:787:3: ( (lv_tituloColor_33_0= ruleColor ) )
            // InternalGenerador.g:788:4: (lv_tituloColor_33_0= ruleColor )
            {
            // InternalGenerador.g:788:4: (lv_tituloColor_33_0= ruleColor )
            // InternalGenerador.g:789:5: lv_tituloColor_33_0= ruleColor
            {

            					newCompositeNode(grammarAccess.getAparienciaAccess().getTituloColorColorParserRuleCall_33_0());
            				
            pushFollow(FOLLOW_34);
            lv_tituloColor_33_0=ruleColor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAparienciaRule());
            					}
            					set(
            						current,
            						"tituloColor",
            						lv_tituloColor_33_0,
            						"org.xtext.dsl.generador.Generador.Color");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_34=(Token)match(input,36,FOLLOW_11); 

            			newLeafNode(otherlv_34, grammarAccess.getAparienciaAccess().getRightSquareBracketKeyword_34());
            		
            otherlv_35=(Token)match(input,25,FOLLOW_35); 

            			newLeafNode(otherlv_35, grammarAccess.getAparienciaAccess().getLeftSquareBracketKeyword_35());
            		
            otherlv_36=(Token)match(input,37,FOLLOW_6); 

            			newLeafNode(otherlv_36, grammarAccess.getAparienciaAccess().getTextoKeyword_36());
            		
            otherlv_37=(Token)match(input,15,FOLLOW_36); 

            			newLeafNode(otherlv_37, grammarAccess.getAparienciaAccess().getEqualsSignKeyword_37());
            		
            otherlv_38=(Token)match(input,38,FOLLOW_25); 

            			newLeafNode(otherlv_38, grammarAccess.getAparienciaAccess().getNormalKeyword_38());
            		
            otherlv_39=(Token)match(input,28,FOLLOW_13); 

            			newLeafNode(otherlv_39, grammarAccess.getAparienciaAccess().getFullStopKeyword_39());
            		
            // InternalGenerador.g:830:3: ( (lv_normal_40_0= ruleMedida ) )
            // InternalGenerador.g:831:4: (lv_normal_40_0= ruleMedida )
            {
            // InternalGenerador.g:831:4: (lv_normal_40_0= ruleMedida )
            // InternalGenerador.g:832:5: lv_normal_40_0= ruleMedida
            {

            					newCompositeNode(grammarAccess.getAparienciaAccess().getNormalMedidaParserRuleCall_40_0());
            				
            pushFollow(FOLLOW_8);
            lv_normal_40_0=ruleMedida();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAparienciaRule());
            					}
            					set(
            						current,
            						"normal",
            						lv_normal_40_0,
            						"org.xtext.dsl.generador.Generador.Medida");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_41=(Token)match(input,16,FOLLOW_37); 

            			newLeafNode(otherlv_41, grammarAccess.getAparienciaAccess().getColonKeyword_41());
            		
            otherlv_42=(Token)match(input,39,FOLLOW_25); 

            			newLeafNode(otherlv_42, grammarAccess.getAparienciaAccess().getGrandeKeyword_42());
            		
            otherlv_43=(Token)match(input,28,FOLLOW_13); 

            			newLeafNode(otherlv_43, grammarAccess.getAparienciaAccess().getFullStopKeyword_43());
            		
            // InternalGenerador.g:861:3: ( (lv_grande_44_0= ruleMedida ) )
            // InternalGenerador.g:862:4: (lv_grande_44_0= ruleMedida )
            {
            // InternalGenerador.g:862:4: (lv_grande_44_0= ruleMedida )
            // InternalGenerador.g:863:5: lv_grande_44_0= ruleMedida
            {

            					newCompositeNode(grammarAccess.getAparienciaAccess().getGrandeMedidaParserRuleCall_44_0());
            				
            pushFollow(FOLLOW_8);
            lv_grande_44_0=ruleMedida();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAparienciaRule());
            					}
            					set(
            						current,
            						"grande",
            						lv_grande_44_0,
            						"org.xtext.dsl.generador.Generador.Medida");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_45=(Token)match(input,16,FOLLOW_33); 

            			newLeafNode(otherlv_45, grammarAccess.getAparienciaAccess().getColonKeyword_45());
            		
            otherlv_46=(Token)match(input,35,FOLLOW_25); 

            			newLeafNode(otherlv_46, grammarAccess.getAparienciaAccess().getTituloKeyword_46());
            		
            otherlv_47=(Token)match(input,28,FOLLOW_13); 

            			newLeafNode(otherlv_47, grammarAccess.getAparienciaAccess().getFullStopKeyword_47());
            		
            // InternalGenerador.g:892:3: ( (lv_titulo_48_0= ruleMedida ) )
            // InternalGenerador.g:893:4: (lv_titulo_48_0= ruleMedida )
            {
            // InternalGenerador.g:893:4: (lv_titulo_48_0= ruleMedida )
            // InternalGenerador.g:894:5: lv_titulo_48_0= ruleMedida
            {

            					newCompositeNode(grammarAccess.getAparienciaAccess().getTituloMedidaParserRuleCall_48_0());
            				
            pushFollow(FOLLOW_8);
            lv_titulo_48_0=ruleMedida();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAparienciaRule());
            					}
            					set(
            						current,
            						"titulo",
            						lv_titulo_48_0,
            						"org.xtext.dsl.generador.Generador.Medida");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_49=(Token)match(input,16,FOLLOW_38); 

            			newLeafNode(otherlv_49, grammarAccess.getAparienciaAccess().getColonKeyword_49());
            		
            otherlv_50=(Token)match(input,40,FOLLOW_25); 

            			newLeafNode(otherlv_50, grammarAccess.getAparienciaAccess().getMenuKeyword_50());
            		
            otherlv_51=(Token)match(input,28,FOLLOW_13); 

            			newLeafNode(otherlv_51, grammarAccess.getAparienciaAccess().getFullStopKeyword_51());
            		
            // InternalGenerador.g:923:3: ( (lv_menu_52_0= ruleMedida ) )
            // InternalGenerador.g:924:4: (lv_menu_52_0= ruleMedida )
            {
            // InternalGenerador.g:924:4: (lv_menu_52_0= ruleMedida )
            // InternalGenerador.g:925:5: lv_menu_52_0= ruleMedida
            {

            					newCompositeNode(grammarAccess.getAparienciaAccess().getMenuMedidaParserRuleCall_52_0());
            				
            pushFollow(FOLLOW_34);
            lv_menu_52_0=ruleMedida();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAparienciaRule());
            					}
            					set(
            						current,
            						"menu",
            						lv_menu_52_0,
            						"org.xtext.dsl.generador.Generador.Medida");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_53=(Token)match(input,36,FOLLOW_11); 

            			newLeafNode(otherlv_53, grammarAccess.getAparienciaAccess().getRightSquareBracketKeyword_53());
            		
            otherlv_54=(Token)match(input,25,FOLLOW_39); 

            			newLeafNode(otherlv_54, grammarAccess.getAparienciaAccess().getLeftSquareBracketKeyword_54());
            		
            otherlv_55=(Token)match(input,41,FOLLOW_6); 

            			newLeafNode(otherlv_55, grammarAccess.getAparienciaAccess().getMargenKeyword_55());
            		
            otherlv_56=(Token)match(input,15,FOLLOW_13); 

            			newLeafNode(otherlv_56, grammarAccess.getAparienciaAccess().getEqualsSignKeyword_56());
            		
            // InternalGenerador.g:958:3: ( (lv_lateral_57_0= ruleMedida ) )
            // InternalGenerador.g:959:4: (lv_lateral_57_0= ruleMedida )
            {
            // InternalGenerador.g:959:4: (lv_lateral_57_0= ruleMedida )
            // InternalGenerador.g:960:5: lv_lateral_57_0= ruleMedida
            {

            					newCompositeNode(grammarAccess.getAparienciaAccess().getLateralMedidaParserRuleCall_57_0());
            				
            pushFollow(FOLLOW_34);
            lv_lateral_57_0=ruleMedida();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAparienciaRule());
            					}
            					set(
            						current,
            						"lateral",
            						lv_lateral_57_0,
            						"org.xtext.dsl.generador.Generador.Medida");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_58=(Token)match(input,36,FOLLOW_2); 

            			newLeafNode(otherlv_58, grammarAccess.getAparienciaAccess().getRightSquareBracketKeyword_58());
            		

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
    // InternalGenerador.g:985:1: entryRuleProducto returns [EObject current=null] : iv_ruleProducto= ruleProducto EOF ;
    public final EObject entryRuleProducto() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProducto = null;


        try {
            // InternalGenerador.g:985:49: (iv_ruleProducto= ruleProducto EOF )
            // InternalGenerador.g:986:2: iv_ruleProducto= ruleProducto EOF
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
    // InternalGenerador.g:992:1: ruleProducto returns [EObject current=null] : (otherlv_0= '[' otherlv_1= 'Producto' otherlv_2= '=' ( (lv_nombreProducto_3_0= RULE_STRING ) ) otherlv_4= ':' ( (lv_descripcion_5_0= RULE_STRING ) ) otherlv_6= ':' ( (lv_precio_7_0= rulePrecio ) ) otherlv_8= ':' ( (lv_cantidad_9_0= RULE_INT ) ) otherlv_10= ':' ( (lv_categoria_11_0= ruleCategoria ) ) otherlv_12= ']' ) ;
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
            // InternalGenerador.g:998:2: ( (otherlv_0= '[' otherlv_1= 'Producto' otherlv_2= '=' ( (lv_nombreProducto_3_0= RULE_STRING ) ) otherlv_4= ':' ( (lv_descripcion_5_0= RULE_STRING ) ) otherlv_6= ':' ( (lv_precio_7_0= rulePrecio ) ) otherlv_8= ':' ( (lv_cantidad_9_0= RULE_INT ) ) otherlv_10= ':' ( (lv_categoria_11_0= ruleCategoria ) ) otherlv_12= ']' ) )
            // InternalGenerador.g:999:2: (otherlv_0= '[' otherlv_1= 'Producto' otherlv_2= '=' ( (lv_nombreProducto_3_0= RULE_STRING ) ) otherlv_4= ':' ( (lv_descripcion_5_0= RULE_STRING ) ) otherlv_6= ':' ( (lv_precio_7_0= rulePrecio ) ) otherlv_8= ':' ( (lv_cantidad_9_0= RULE_INT ) ) otherlv_10= ':' ( (lv_categoria_11_0= ruleCategoria ) ) otherlv_12= ']' )
            {
            // InternalGenerador.g:999:2: (otherlv_0= '[' otherlv_1= 'Producto' otherlv_2= '=' ( (lv_nombreProducto_3_0= RULE_STRING ) ) otherlv_4= ':' ( (lv_descripcion_5_0= RULE_STRING ) ) otherlv_6= ':' ( (lv_precio_7_0= rulePrecio ) ) otherlv_8= ':' ( (lv_cantidad_9_0= RULE_INT ) ) otherlv_10= ':' ( (lv_categoria_11_0= ruleCategoria ) ) otherlv_12= ']' )
            // InternalGenerador.g:1000:3: otherlv_0= '[' otherlv_1= 'Producto' otherlv_2= '=' ( (lv_nombreProducto_3_0= RULE_STRING ) ) otherlv_4= ':' ( (lv_descripcion_5_0= RULE_STRING ) ) otherlv_6= ':' ( (lv_precio_7_0= rulePrecio ) ) otherlv_8= ':' ( (lv_cantidad_9_0= RULE_INT ) ) otherlv_10= ':' ( (lv_categoria_11_0= ruleCategoria ) ) otherlv_12= ']'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_40); 

            			newLeafNode(otherlv_0, grammarAccess.getProductoAccess().getLeftSquareBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,42,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getProductoAccess().getProductoKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getProductoAccess().getEqualsSignKeyword_2());
            		
            // InternalGenerador.g:1012:3: ( (lv_nombreProducto_3_0= RULE_STRING ) )
            // InternalGenerador.g:1013:4: (lv_nombreProducto_3_0= RULE_STRING )
            {
            // InternalGenerador.g:1013:4: (lv_nombreProducto_3_0= RULE_STRING )
            // InternalGenerador.g:1014:5: lv_nombreProducto_3_0= RULE_STRING
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
            		
            // InternalGenerador.g:1034:3: ( (lv_descripcion_5_0= RULE_STRING ) )
            // InternalGenerador.g:1035:4: (lv_descripcion_5_0= RULE_STRING )
            {
            // InternalGenerador.g:1035:4: (lv_descripcion_5_0= RULE_STRING )
            // InternalGenerador.g:1036:5: lv_descripcion_5_0= RULE_STRING
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
            		
            // InternalGenerador.g:1056:3: ( (lv_precio_7_0= rulePrecio ) )
            // InternalGenerador.g:1057:4: (lv_precio_7_0= rulePrecio )
            {
            // InternalGenerador.g:1057:4: (lv_precio_7_0= rulePrecio )
            // InternalGenerador.g:1058:5: lv_precio_7_0= rulePrecio
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
            		
            // InternalGenerador.g:1079:3: ( (lv_cantidad_9_0= RULE_INT ) )
            // InternalGenerador.g:1080:4: (lv_cantidad_9_0= RULE_INT )
            {
            // InternalGenerador.g:1080:4: (lv_cantidad_9_0= RULE_INT )
            // InternalGenerador.g:1081:5: lv_cantidad_9_0= RULE_INT
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

            otherlv_10=(Token)match(input,16,FOLLOW_41); 

            			newLeafNode(otherlv_10, grammarAccess.getProductoAccess().getColonKeyword_10());
            		
            // InternalGenerador.g:1101:3: ( (lv_categoria_11_0= ruleCategoria ) )
            // InternalGenerador.g:1102:4: (lv_categoria_11_0= ruleCategoria )
            {
            // InternalGenerador.g:1102:4: (lv_categoria_11_0= ruleCategoria )
            // InternalGenerador.g:1103:5: lv_categoria_11_0= ruleCategoria
            {

            					newCompositeNode(grammarAccess.getProductoAccess().getCategoriaCategoriaParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_34);
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

            otherlv_12=(Token)match(input,36,FOLLOW_2); 

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
    // InternalGenerador.g:1128:1: entryRulePrecio returns [String current=null] : iv_rulePrecio= rulePrecio EOF ;
    public final String entryRulePrecio() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrecio = null;


        try {
            // InternalGenerador.g:1128:46: (iv_rulePrecio= rulePrecio EOF )
            // InternalGenerador.g:1129:2: iv_rulePrecio= rulePrecio EOF
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
    // InternalGenerador.g:1135:1: rulePrecio returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken rulePrecio() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalGenerador.g:1141:2: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) )
            // InternalGenerador.g:1142:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            {
            // InternalGenerador.g:1142:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            // InternalGenerador.g:1143:3: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_25); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getPrecioAccess().getINTTerminalRuleCall_0());
            		
            kw=(Token)match(input,28,FOLLOW_13); 

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
    // InternalGenerador.g:1166:1: entryRuleCategoria returns [String current=null] : iv_ruleCategoria= ruleCategoria EOF ;
    public final String entryRuleCategoria() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCategoria = null;


        try {
            // InternalGenerador.g:1166:49: (iv_ruleCategoria= ruleCategoria EOF )
            // InternalGenerador.g:1167:2: iv_ruleCategoria= ruleCategoria EOF
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
    // InternalGenerador.g:1173:1: ruleCategoria returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Cosmetica' | kw= 'Higiene' | kw= 'Salud' | kw= 'Dietetica' | kw= 'Bebes' ) ;
    public final AntlrDatatypeRuleToken ruleCategoria() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGenerador.g:1179:2: ( (kw= 'Cosmetica' | kw= 'Higiene' | kw= 'Salud' | kw= 'Dietetica' | kw= 'Bebes' ) )
            // InternalGenerador.g:1180:2: (kw= 'Cosmetica' | kw= 'Higiene' | kw= 'Salud' | kw= 'Dietetica' | kw= 'Bebes' )
            {
            // InternalGenerador.g:1180:2: (kw= 'Cosmetica' | kw= 'Higiene' | kw= 'Salud' | kw= 'Dietetica' | kw= 'Bebes' )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt3=1;
                }
                break;
            case 44:
                {
                alt3=2;
                }
                break;
            case 45:
                {
                alt3=3;
                }
                break;
            case 46:
                {
                alt3=4;
                }
                break;
            case 47:
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
                    // InternalGenerador.g:1181:3: kw= 'Cosmetica'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCategoriaAccess().getCosmeticaKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalGenerador.g:1187:3: kw= 'Higiene'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCategoriaAccess().getHigieneKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalGenerador.g:1193:3: kw= 'Salud'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCategoriaAccess().getSaludKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalGenerador.g:1199:3: kw= 'Dietetica'
                    {
                    kw=(Token)match(input,46,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCategoriaAccess().getDieteticaKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalGenerador.g:1205:3: kw= 'Bebes'
                    {
                    kw=(Token)match(input,47,FOLLOW_2); 

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
    // InternalGenerador.g:1214:1: entryRuleTipo returns [EObject current=null] : iv_ruleTipo= ruleTipo EOF ;
    public final EObject entryRuleTipo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTipo = null;


        try {
            // InternalGenerador.g:1214:45: (iv_ruleTipo= ruleTipo EOF )
            // InternalGenerador.g:1215:2: iv_ruleTipo= ruleTipo EOF
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
    // InternalGenerador.g:1221:1: ruleTipo returns [EObject current=null] : ( ( (lv_desplegable_0_0= ruleDesplegable ) ) | ( (lv_permanente_1_0= rulePermanente ) ) ) ;
    public final EObject ruleTipo() throws RecognitionException {
        EObject current = null;

        EObject lv_desplegable_0_0 = null;

        EObject lv_permanente_1_0 = null;



        	enterRule();

        try {
            // InternalGenerador.g:1227:2: ( ( ( (lv_desplegable_0_0= ruleDesplegable ) ) | ( (lv_permanente_1_0= rulePermanente ) ) ) )
            // InternalGenerador.g:1228:2: ( ( (lv_desplegable_0_0= ruleDesplegable ) ) | ( (lv_permanente_1_0= rulePermanente ) ) )
            {
            // InternalGenerador.g:1228:2: ( ( (lv_desplegable_0_0= ruleDesplegable ) ) | ( (lv_permanente_1_0= rulePermanente ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==48) ) {
                alt4=1;
            }
            else if ( (LA4_0==49) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalGenerador.g:1229:3: ( (lv_desplegable_0_0= ruleDesplegable ) )
                    {
                    // InternalGenerador.g:1229:3: ( (lv_desplegable_0_0= ruleDesplegable ) )
                    // InternalGenerador.g:1230:4: (lv_desplegable_0_0= ruleDesplegable )
                    {
                    // InternalGenerador.g:1230:4: (lv_desplegable_0_0= ruleDesplegable )
                    // InternalGenerador.g:1231:5: lv_desplegable_0_0= ruleDesplegable
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
                    // InternalGenerador.g:1249:3: ( (lv_permanente_1_0= rulePermanente ) )
                    {
                    // InternalGenerador.g:1249:3: ( (lv_permanente_1_0= rulePermanente ) )
                    // InternalGenerador.g:1250:4: (lv_permanente_1_0= rulePermanente )
                    {
                    // InternalGenerador.g:1250:4: (lv_permanente_1_0= rulePermanente )
                    // InternalGenerador.g:1251:5: lv_permanente_1_0= rulePermanente
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
    // InternalGenerador.g:1272:1: entryRuleDesplegable returns [EObject current=null] : iv_ruleDesplegable= ruleDesplegable EOF ;
    public final EObject entryRuleDesplegable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDesplegable = null;


        try {
            // InternalGenerador.g:1272:52: (iv_ruleDesplegable= ruleDesplegable EOF )
            // InternalGenerador.g:1273:2: iv_ruleDesplegable= ruleDesplegable EOF
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
    // InternalGenerador.g:1279:1: ruleDesplegable returns [EObject current=null] : (otherlv_0= 'Desplegable' otherlv_1= ':' ( (lv_color_2_0= ruleColor ) ) ) ;
    public final EObject ruleDesplegable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_color_2_0 = null;



        	enterRule();

        try {
            // InternalGenerador.g:1285:2: ( (otherlv_0= 'Desplegable' otherlv_1= ':' ( (lv_color_2_0= ruleColor ) ) ) )
            // InternalGenerador.g:1286:2: (otherlv_0= 'Desplegable' otherlv_1= ':' ( (lv_color_2_0= ruleColor ) ) )
            {
            // InternalGenerador.g:1286:2: (otherlv_0= 'Desplegable' otherlv_1= ':' ( (lv_color_2_0= ruleColor ) ) )
            // InternalGenerador.g:1287:3: otherlv_0= 'Desplegable' otherlv_1= ':' ( (lv_color_2_0= ruleColor ) )
            {
            otherlv_0=(Token)match(input,48,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getDesplegableAccess().getDesplegableKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getDesplegableAccess().getColonKeyword_1());
            		
            // InternalGenerador.g:1295:3: ( (lv_color_2_0= ruleColor ) )
            // InternalGenerador.g:1296:4: (lv_color_2_0= ruleColor )
            {
            // InternalGenerador.g:1296:4: (lv_color_2_0= ruleColor )
            // InternalGenerador.g:1297:5: lv_color_2_0= ruleColor
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
    // InternalGenerador.g:1318:1: entryRulePermanente returns [EObject current=null] : iv_rulePermanente= rulePermanente EOF ;
    public final EObject entryRulePermanente() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePermanente = null;


        try {
            // InternalGenerador.g:1318:51: (iv_rulePermanente= rulePermanente EOF )
            // InternalGenerador.g:1319:2: iv_rulePermanente= rulePermanente EOF
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
    // InternalGenerador.g:1325:1: rulePermanente returns [EObject current=null] : (otherlv_0= 'Permanente' otherlv_1= ':' ( (lv_color_2_0= ruleColor ) ) otherlv_3= ':' ( (lv_altura_4_0= ruleMedida ) ) ) ;
    public final EObject rulePermanente() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_color_2_0 = null;

        AntlrDatatypeRuleToken lv_altura_4_0 = null;



        	enterRule();

        try {
            // InternalGenerador.g:1331:2: ( (otherlv_0= 'Permanente' otherlv_1= ':' ( (lv_color_2_0= ruleColor ) ) otherlv_3= ':' ( (lv_altura_4_0= ruleMedida ) ) ) )
            // InternalGenerador.g:1332:2: (otherlv_0= 'Permanente' otherlv_1= ':' ( (lv_color_2_0= ruleColor ) ) otherlv_3= ':' ( (lv_altura_4_0= ruleMedida ) ) )
            {
            // InternalGenerador.g:1332:2: (otherlv_0= 'Permanente' otherlv_1= ':' ( (lv_color_2_0= ruleColor ) ) otherlv_3= ':' ( (lv_altura_4_0= ruleMedida ) ) )
            // InternalGenerador.g:1333:3: otherlv_0= 'Permanente' otherlv_1= ':' ( (lv_color_2_0= ruleColor ) ) otherlv_3= ':' ( (lv_altura_4_0= ruleMedida ) )
            {
            otherlv_0=(Token)match(input,49,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getPermanenteAccess().getPermanenteKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getPermanenteAccess().getColonKeyword_1());
            		
            // InternalGenerador.g:1341:3: ( (lv_color_2_0= ruleColor ) )
            // InternalGenerador.g:1342:4: (lv_color_2_0= ruleColor )
            {
            // InternalGenerador.g:1342:4: (lv_color_2_0= ruleColor )
            // InternalGenerador.g:1343:5: lv_color_2_0= ruleColor
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
            		
            // InternalGenerador.g:1364:3: ( (lv_altura_4_0= ruleMedida ) )
            // InternalGenerador.g:1365:4: (lv_altura_4_0= ruleMedida )
            {
            // InternalGenerador.g:1365:4: (lv_altura_4_0= ruleMedida )
            // InternalGenerador.g:1366:5: lv_altura_4_0= ruleMedida
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
    // InternalGenerador.g:1387:1: entryRuleColor returns [String current=null] : iv_ruleColor= ruleColor EOF ;
    public final String entryRuleColor() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleColor = null;


        try {
            // InternalGenerador.g:1387:45: (iv_ruleColor= ruleColor EOF )
            // InternalGenerador.g:1388:2: iv_ruleColor= ruleColor EOF
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
    // InternalGenerador.g:1394:1: ruleColor returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '#' (this_ID_1= RULE_ID | this_INT_2= RULE_INT )+ ) ;
    public final AntlrDatatypeRuleToken ruleColor() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalGenerador.g:1400:2: ( (kw= '#' (this_ID_1= RULE_ID | this_INT_2= RULE_INT )+ ) )
            // InternalGenerador.g:1401:2: (kw= '#' (this_ID_1= RULE_ID | this_INT_2= RULE_INT )+ )
            {
            // InternalGenerador.g:1401:2: (kw= '#' (this_ID_1= RULE_ID | this_INT_2= RULE_INT )+ )
            // InternalGenerador.g:1402:3: kw= '#' (this_ID_1= RULE_ID | this_INT_2= RULE_INT )+
            {
            kw=(Token)match(input,50,FOLLOW_42); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getColorAccess().getNumberSignKeyword_0());
            		
            // InternalGenerador.g:1407:3: (this_ID_1= RULE_ID | this_INT_2= RULE_INT )+
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
            	    // InternalGenerador.g:1408:4: this_ID_1= RULE_ID
            	    {
            	    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_43); 

            	    				current.merge(this_ID_1);
            	    			

            	    				newLeafNode(this_ID_1, grammarAccess.getColorAccess().getIDTerminalRuleCall_1_0());
            	    			

            	    }
            	    break;
            	case 2 :
            	    // InternalGenerador.g:1416:4: this_INT_2= RULE_INT
            	    {
            	    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_43); 

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
    // InternalGenerador.g:1428:1: entryRuleMedida returns [String current=null] : iv_ruleMedida= ruleMedida EOF ;
    public final String entryRuleMedida() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMedida = null;


        try {
            // InternalGenerador.g:1428:46: (iv_ruleMedida= ruleMedida EOF )
            // InternalGenerador.g:1429:2: iv_ruleMedida= ruleMedida EOF
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
    // InternalGenerador.g:1435:1: ruleMedida returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT kw= 'px' ) | (this_INT_2= RULE_INT kw= '%' ) ) ;
    public final AntlrDatatypeRuleToken ruleMedida() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalGenerador.g:1441:2: ( ( (this_INT_0= RULE_INT kw= 'px' ) | (this_INT_2= RULE_INT kw= '%' ) ) )
            // InternalGenerador.g:1442:2: ( (this_INT_0= RULE_INT kw= 'px' ) | (this_INT_2= RULE_INT kw= '%' ) )
            {
            // InternalGenerador.g:1442:2: ( (this_INT_0= RULE_INT kw= 'px' ) | (this_INT_2= RULE_INT kw= '%' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_INT) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==51) ) {
                    alt6=1;
                }
                else if ( (LA6_1==52) ) {
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
                    // InternalGenerador.g:1443:3: (this_INT_0= RULE_INT kw= 'px' )
                    {
                    // InternalGenerador.g:1443:3: (this_INT_0= RULE_INT kw= 'px' )
                    // InternalGenerador.g:1444:4: this_INT_0= RULE_INT kw= 'px'
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_44); 

                    				current.merge(this_INT_0);
                    			

                    				newLeafNode(this_INT_0, grammarAccess.getMedidaAccess().getINTTerminalRuleCall_0_0());
                    			
                    kw=(Token)match(input,51,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getMedidaAccess().getPxKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGenerador.g:1458:3: (this_INT_2= RULE_INT kw= '%' )
                    {
                    // InternalGenerador.g:1458:3: (this_INT_2= RULE_INT kw= '%' )
                    // InternalGenerador.g:1459:4: this_INT_2= RULE_INT kw= '%'
                    {
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_45); 

                    				current.merge(this_INT_2);
                    			

                    				newLeafNode(this_INT_2, grammarAccess.getMedidaAccess().getINTTerminalRuleCall_1_0());
                    			
                    kw=(Token)match(input,52,FOLLOW_2); 

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
    // InternalGenerador.g:1476:1: entryRuleCorreo returns [String current=null] : iv_ruleCorreo= ruleCorreo EOF ;
    public final String entryRuleCorreo() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCorreo = null;


        try {
            // InternalGenerador.g:1476:46: (iv_ruleCorreo= ruleCorreo EOF )
            // InternalGenerador.g:1477:2: iv_ruleCorreo= ruleCorreo EOF
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
    // InternalGenerador.g:1483:1: ruleCorreo returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID kw= '@' this_ID_2= RULE_ID kw= '.' this_ID_4= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleCorreo() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;
        Token this_ID_4=null;


        	enterRule();

        try {
            // InternalGenerador.g:1489:2: ( (this_ID_0= RULE_ID kw= '@' this_ID_2= RULE_ID kw= '.' this_ID_4= RULE_ID ) )
            // InternalGenerador.g:1490:2: (this_ID_0= RULE_ID kw= '@' this_ID_2= RULE_ID kw= '.' this_ID_4= RULE_ID )
            {
            // InternalGenerador.g:1490:2: (this_ID_0= RULE_ID kw= '@' this_ID_2= RULE_ID kw= '.' this_ID_4= RULE_ID )
            // InternalGenerador.g:1491:3: this_ID_0= RULE_ID kw= '@' this_ID_2= RULE_ID kw= '.' this_ID_4= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_46); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getCorreoAccess().getIDTerminalRuleCall_0());
            		
            kw=(Token)match(input,53,FOLLOW_12); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getCorreoAccess().getCommercialAtKeyword_1());
            		
            this_ID_2=(Token)match(input,RULE_ID,FOLLOW_25); 

            			current.merge(this_ID_2);
            		

            			newLeafNode(this_ID_2, grammarAccess.getCorreoAccess().getIDTerminalRuleCall_2());
            		
            kw=(Token)match(input,28,FOLLOW_12); 

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
    // InternalGenerador.g:1526:1: entryRuleRegistro returns [EObject current=null] : iv_ruleRegistro= ruleRegistro EOF ;
    public final EObject entryRuleRegistro() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegistro = null;


        try {
            // InternalGenerador.g:1526:49: (iv_ruleRegistro= ruleRegistro EOF )
            // InternalGenerador.g:1527:2: iv_ruleRegistro= ruleRegistro EOF
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
    // InternalGenerador.g:1533:1: ruleRegistro returns [EObject current=null] : (otherlv_0= '[' otherlv_1= 'Registro' otherlv_2= '=' ( (lv_tomo_3_0= RULE_INT ) ) otherlv_4= ':' ( (lv_folio_5_0= RULE_INT ) ) otherlv_6= ':' ( (lv_seccion_7_0= RULE_INT ) ) otherlv_8= ':' ( (lv_hoja_9_0= RULE_INT ) ) otherlv_10= ']' ) ;
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
            // InternalGenerador.g:1539:2: ( (otherlv_0= '[' otherlv_1= 'Registro' otherlv_2= '=' ( (lv_tomo_3_0= RULE_INT ) ) otherlv_4= ':' ( (lv_folio_5_0= RULE_INT ) ) otherlv_6= ':' ( (lv_seccion_7_0= RULE_INT ) ) otherlv_8= ':' ( (lv_hoja_9_0= RULE_INT ) ) otherlv_10= ']' ) )
            // InternalGenerador.g:1540:2: (otherlv_0= '[' otherlv_1= 'Registro' otherlv_2= '=' ( (lv_tomo_3_0= RULE_INT ) ) otherlv_4= ':' ( (lv_folio_5_0= RULE_INT ) ) otherlv_6= ':' ( (lv_seccion_7_0= RULE_INT ) ) otherlv_8= ':' ( (lv_hoja_9_0= RULE_INT ) ) otherlv_10= ']' )
            {
            // InternalGenerador.g:1540:2: (otherlv_0= '[' otherlv_1= 'Registro' otherlv_2= '=' ( (lv_tomo_3_0= RULE_INT ) ) otherlv_4= ':' ( (lv_folio_5_0= RULE_INT ) ) otherlv_6= ':' ( (lv_seccion_7_0= RULE_INT ) ) otherlv_8= ':' ( (lv_hoja_9_0= RULE_INT ) ) otherlv_10= ']' )
            // InternalGenerador.g:1541:3: otherlv_0= '[' otherlv_1= 'Registro' otherlv_2= '=' ( (lv_tomo_3_0= RULE_INT ) ) otherlv_4= ':' ( (lv_folio_5_0= RULE_INT ) ) otherlv_6= ':' ( (lv_seccion_7_0= RULE_INT ) ) otherlv_8= ':' ( (lv_hoja_9_0= RULE_INT ) ) otherlv_10= ']'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_47); 

            			newLeafNode(otherlv_0, grammarAccess.getRegistroAccess().getLeftSquareBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,54,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getRegistroAccess().getRegistroKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getRegistroAccess().getEqualsSignKeyword_2());
            		
            // InternalGenerador.g:1553:3: ( (lv_tomo_3_0= RULE_INT ) )
            // InternalGenerador.g:1554:4: (lv_tomo_3_0= RULE_INT )
            {
            // InternalGenerador.g:1554:4: (lv_tomo_3_0= RULE_INT )
            // InternalGenerador.g:1555:5: lv_tomo_3_0= RULE_INT
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
            		
            // InternalGenerador.g:1575:3: ( (lv_folio_5_0= RULE_INT ) )
            // InternalGenerador.g:1576:4: (lv_folio_5_0= RULE_INT )
            {
            // InternalGenerador.g:1576:4: (lv_folio_5_0= RULE_INT )
            // InternalGenerador.g:1577:5: lv_folio_5_0= RULE_INT
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
            		
            // InternalGenerador.g:1597:3: ( (lv_seccion_7_0= RULE_INT ) )
            // InternalGenerador.g:1598:4: (lv_seccion_7_0= RULE_INT )
            {
            // InternalGenerador.g:1598:4: (lv_seccion_7_0= RULE_INT )
            // InternalGenerador.g:1599:5: lv_seccion_7_0= RULE_INT
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
            		
            // InternalGenerador.g:1619:3: ( (lv_hoja_9_0= RULE_INT ) )
            // InternalGenerador.g:1620:4: (lv_hoja_9_0= RULE_INT )
            {
            // InternalGenerador.g:1620:4: (lv_hoja_9_0= RULE_INT )
            // InternalGenerador.g:1621:5: lv_hoja_9_0= RULE_INT
            {
            lv_hoja_9_0=(Token)match(input,RULE_INT,FOLLOW_34); 

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

            otherlv_10=(Token)match(input,36,FOLLOW_2); 

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
    // InternalGenerador.g:1645:1: entryRuleDireccion returns [EObject current=null] : iv_ruleDireccion= ruleDireccion EOF ;
    public final EObject entryRuleDireccion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDireccion = null;


        try {
            // InternalGenerador.g:1645:50: (iv_ruleDireccion= ruleDireccion EOF )
            // InternalGenerador.g:1646:2: iv_ruleDireccion= ruleDireccion EOF
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
    // InternalGenerador.g:1652:1: ruleDireccion returns [EObject current=null] : (otherlv_0= '[' otherlv_1= 'Direccion' otherlv_2= '=' ( (lv_calle_3_0= RULE_STRING ) ) otherlv_4= ':' ( (lv_ciudad_5_0= RULE_STRING ) ) otherlv_6= ':' ( (lv_pais_7_0= RULE_STRING ) ) otherlv_8= ']' ) ;
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
            // InternalGenerador.g:1658:2: ( (otherlv_0= '[' otherlv_1= 'Direccion' otherlv_2= '=' ( (lv_calle_3_0= RULE_STRING ) ) otherlv_4= ':' ( (lv_ciudad_5_0= RULE_STRING ) ) otherlv_6= ':' ( (lv_pais_7_0= RULE_STRING ) ) otherlv_8= ']' ) )
            // InternalGenerador.g:1659:2: (otherlv_0= '[' otherlv_1= 'Direccion' otherlv_2= '=' ( (lv_calle_3_0= RULE_STRING ) ) otherlv_4= ':' ( (lv_ciudad_5_0= RULE_STRING ) ) otherlv_6= ':' ( (lv_pais_7_0= RULE_STRING ) ) otherlv_8= ']' )
            {
            // InternalGenerador.g:1659:2: (otherlv_0= '[' otherlv_1= 'Direccion' otherlv_2= '=' ( (lv_calle_3_0= RULE_STRING ) ) otherlv_4= ':' ( (lv_ciudad_5_0= RULE_STRING ) ) otherlv_6= ':' ( (lv_pais_7_0= RULE_STRING ) ) otherlv_8= ']' )
            // InternalGenerador.g:1660:3: otherlv_0= '[' otherlv_1= 'Direccion' otherlv_2= '=' ( (lv_calle_3_0= RULE_STRING ) ) otherlv_4= ':' ( (lv_ciudad_5_0= RULE_STRING ) ) otherlv_6= ':' ( (lv_pais_7_0= RULE_STRING ) ) otherlv_8= ']'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_48); 

            			newLeafNode(otherlv_0, grammarAccess.getDireccionAccess().getLeftSquareBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,55,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getDireccionAccess().getDireccionKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getDireccionAccess().getEqualsSignKeyword_2());
            		
            // InternalGenerador.g:1672:3: ( (lv_calle_3_0= RULE_STRING ) )
            // InternalGenerador.g:1673:4: (lv_calle_3_0= RULE_STRING )
            {
            // InternalGenerador.g:1673:4: (lv_calle_3_0= RULE_STRING )
            // InternalGenerador.g:1674:5: lv_calle_3_0= RULE_STRING
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
            		
            // InternalGenerador.g:1694:3: ( (lv_ciudad_5_0= RULE_STRING ) )
            // InternalGenerador.g:1695:4: (lv_ciudad_5_0= RULE_STRING )
            {
            // InternalGenerador.g:1695:4: (lv_ciudad_5_0= RULE_STRING )
            // InternalGenerador.g:1696:5: lv_ciudad_5_0= RULE_STRING
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
            		
            // InternalGenerador.g:1716:3: ( (lv_pais_7_0= RULE_STRING ) )
            // InternalGenerador.g:1717:4: (lv_pais_7_0= RULE_STRING )
            {
            // InternalGenerador.g:1717:4: (lv_pais_7_0= RULE_STRING )
            // InternalGenerador.g:1718:5: lv_pais_7_0= RULE_STRING
            {
            lv_pais_7_0=(Token)match(input,RULE_STRING,FOLLOW_34); 

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

            otherlv_8=(Token)match(input,36,FOLLOW_2); 

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
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000F80000020000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002020000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000F80000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000062L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0080000000000000L});

}