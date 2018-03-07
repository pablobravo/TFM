package org.xtext.dsl.generador.ide.contentassist.antlr.internal;

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
import org.xtext.dsl.generador.services.GeneradorGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGeneradorParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Cosmetica'", "'Higiene'", "'Salud'", "'Dietetica'", "'Bebes'", "'Parafarmacia'", "'{'", "'<'", "'Nombre'", "'='", "':'", "'>'", "'Titular'", "'Menu'", "'Apariencia'", "'Categorias'", "'Productos'", "'Usuario'", "'}'", "'['", "'Color'", "'principal'", "'.'", "'principalClaro'", "'secundario'", "'fondo'", "'fondoProductos'", "'precios'", "'texto'", "'titulo'", "']'", "'Texto'", "'normal'", "'grande'", "'menu'", "'Margen'", "'Producto'", "'Desplegable'", "'Permanente'", "'#'", "'px'", "'%'", "'@'", "'Registro'", "'Direccion'"
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
    public static final int RULE_ID=4;
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
    public static final int RULE_STRING=6;
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

    	public void setGrammarAccess(GeneradorGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleParafarmacia"
    // InternalGenerador.g:53:1: entryRuleParafarmacia : ruleParafarmacia EOF ;
    public final void entryRuleParafarmacia() throws RecognitionException {
        try {
            // InternalGenerador.g:54:1: ( ruleParafarmacia EOF )
            // InternalGenerador.g:55:1: ruleParafarmacia EOF
            {
             before(grammarAccess.getParafarmaciaRule()); 
            pushFollow(FOLLOW_1);
            ruleParafarmacia();

            state._fsp--;

             after(grammarAccess.getParafarmaciaRule()); 
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
    // $ANTLR end "entryRuleParafarmacia"


    // $ANTLR start "ruleParafarmacia"
    // InternalGenerador.g:62:1: ruleParafarmacia : ( ( rule__Parafarmacia__Group__0 ) ) ;
    public final void ruleParafarmacia() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:66:2: ( ( ( rule__Parafarmacia__Group__0 ) ) )
            // InternalGenerador.g:67:2: ( ( rule__Parafarmacia__Group__0 ) )
            {
            // InternalGenerador.g:67:2: ( ( rule__Parafarmacia__Group__0 ) )
            // InternalGenerador.g:68:3: ( rule__Parafarmacia__Group__0 )
            {
             before(grammarAccess.getParafarmaciaAccess().getGroup()); 
            // InternalGenerador.g:69:3: ( rule__Parafarmacia__Group__0 )
            // InternalGenerador.g:69:4: rule__Parafarmacia__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Parafarmacia__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParafarmaciaAccess().getGroup()); 

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
    // $ANTLR end "ruleParafarmacia"


    // $ANTLR start "entryRuleApariencia"
    // InternalGenerador.g:78:1: entryRuleApariencia : ruleApariencia EOF ;
    public final void entryRuleApariencia() throws RecognitionException {
        try {
            // InternalGenerador.g:79:1: ( ruleApariencia EOF )
            // InternalGenerador.g:80:1: ruleApariencia EOF
            {
             before(grammarAccess.getAparienciaRule()); 
            pushFollow(FOLLOW_1);
            ruleApariencia();

            state._fsp--;

             after(grammarAccess.getAparienciaRule()); 
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
    // $ANTLR end "entryRuleApariencia"


    // $ANTLR start "ruleApariencia"
    // InternalGenerador.g:87:1: ruleApariencia : ( ( rule__Apariencia__Group__0 ) ) ;
    public final void ruleApariencia() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:91:2: ( ( ( rule__Apariencia__Group__0 ) ) )
            // InternalGenerador.g:92:2: ( ( rule__Apariencia__Group__0 ) )
            {
            // InternalGenerador.g:92:2: ( ( rule__Apariencia__Group__0 ) )
            // InternalGenerador.g:93:3: ( rule__Apariencia__Group__0 )
            {
             before(grammarAccess.getAparienciaAccess().getGroup()); 
            // InternalGenerador.g:94:3: ( rule__Apariencia__Group__0 )
            // InternalGenerador.g:94:4: rule__Apariencia__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Apariencia__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAparienciaAccess().getGroup()); 

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
    // $ANTLR end "ruleApariencia"


    // $ANTLR start "entryRuleProducto"
    // InternalGenerador.g:103:1: entryRuleProducto : ruleProducto EOF ;
    public final void entryRuleProducto() throws RecognitionException {
        try {
            // InternalGenerador.g:104:1: ( ruleProducto EOF )
            // InternalGenerador.g:105:1: ruleProducto EOF
            {
             before(grammarAccess.getProductoRule()); 
            pushFollow(FOLLOW_1);
            ruleProducto();

            state._fsp--;

             after(grammarAccess.getProductoRule()); 
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
    // $ANTLR end "entryRuleProducto"


    // $ANTLR start "ruleProducto"
    // InternalGenerador.g:112:1: ruleProducto : ( ( rule__Producto__Group__0 ) ) ;
    public final void ruleProducto() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:116:2: ( ( ( rule__Producto__Group__0 ) ) )
            // InternalGenerador.g:117:2: ( ( rule__Producto__Group__0 ) )
            {
            // InternalGenerador.g:117:2: ( ( rule__Producto__Group__0 ) )
            // InternalGenerador.g:118:3: ( rule__Producto__Group__0 )
            {
             before(grammarAccess.getProductoAccess().getGroup()); 
            // InternalGenerador.g:119:3: ( rule__Producto__Group__0 )
            // InternalGenerador.g:119:4: rule__Producto__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Producto__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProductoAccess().getGroup()); 

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
    // $ANTLR end "ruleProducto"


    // $ANTLR start "entryRulePrecio"
    // InternalGenerador.g:128:1: entryRulePrecio : rulePrecio EOF ;
    public final void entryRulePrecio() throws RecognitionException {
        try {
            // InternalGenerador.g:129:1: ( rulePrecio EOF )
            // InternalGenerador.g:130:1: rulePrecio EOF
            {
             before(grammarAccess.getPrecioRule()); 
            pushFollow(FOLLOW_1);
            rulePrecio();

            state._fsp--;

             after(grammarAccess.getPrecioRule()); 
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
    // $ANTLR end "entryRulePrecio"


    // $ANTLR start "rulePrecio"
    // InternalGenerador.g:137:1: rulePrecio : ( ( rule__Precio__Group__0 ) ) ;
    public final void rulePrecio() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:141:2: ( ( ( rule__Precio__Group__0 ) ) )
            // InternalGenerador.g:142:2: ( ( rule__Precio__Group__0 ) )
            {
            // InternalGenerador.g:142:2: ( ( rule__Precio__Group__0 ) )
            // InternalGenerador.g:143:3: ( rule__Precio__Group__0 )
            {
             before(grammarAccess.getPrecioAccess().getGroup()); 
            // InternalGenerador.g:144:3: ( rule__Precio__Group__0 )
            // InternalGenerador.g:144:4: rule__Precio__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Precio__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPrecioAccess().getGroup()); 

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
    // $ANTLR end "rulePrecio"


    // $ANTLR start "entryRuleCategoria"
    // InternalGenerador.g:153:1: entryRuleCategoria : ruleCategoria EOF ;
    public final void entryRuleCategoria() throws RecognitionException {
        try {
            // InternalGenerador.g:154:1: ( ruleCategoria EOF )
            // InternalGenerador.g:155:1: ruleCategoria EOF
            {
             before(grammarAccess.getCategoriaRule()); 
            pushFollow(FOLLOW_1);
            ruleCategoria();

            state._fsp--;

             after(grammarAccess.getCategoriaRule()); 
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
    // $ANTLR end "entryRuleCategoria"


    // $ANTLR start "ruleCategoria"
    // InternalGenerador.g:162:1: ruleCategoria : ( ( rule__Categoria__Alternatives ) ) ;
    public final void ruleCategoria() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:166:2: ( ( ( rule__Categoria__Alternatives ) ) )
            // InternalGenerador.g:167:2: ( ( rule__Categoria__Alternatives ) )
            {
            // InternalGenerador.g:167:2: ( ( rule__Categoria__Alternatives ) )
            // InternalGenerador.g:168:3: ( rule__Categoria__Alternatives )
            {
             before(grammarAccess.getCategoriaAccess().getAlternatives()); 
            // InternalGenerador.g:169:3: ( rule__Categoria__Alternatives )
            // InternalGenerador.g:169:4: rule__Categoria__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Categoria__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCategoriaAccess().getAlternatives()); 

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
    // $ANTLR end "ruleCategoria"


    // $ANTLR start "entryRuleTipo"
    // InternalGenerador.g:178:1: entryRuleTipo : ruleTipo EOF ;
    public final void entryRuleTipo() throws RecognitionException {
        try {
            // InternalGenerador.g:179:1: ( ruleTipo EOF )
            // InternalGenerador.g:180:1: ruleTipo EOF
            {
             before(grammarAccess.getTipoRule()); 
            pushFollow(FOLLOW_1);
            ruleTipo();

            state._fsp--;

             after(grammarAccess.getTipoRule()); 
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
    // $ANTLR end "entryRuleTipo"


    // $ANTLR start "ruleTipo"
    // InternalGenerador.g:187:1: ruleTipo : ( ( rule__Tipo__Alternatives ) ) ;
    public final void ruleTipo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:191:2: ( ( ( rule__Tipo__Alternatives ) ) )
            // InternalGenerador.g:192:2: ( ( rule__Tipo__Alternatives ) )
            {
            // InternalGenerador.g:192:2: ( ( rule__Tipo__Alternatives ) )
            // InternalGenerador.g:193:3: ( rule__Tipo__Alternatives )
            {
             before(grammarAccess.getTipoAccess().getAlternatives()); 
            // InternalGenerador.g:194:3: ( rule__Tipo__Alternatives )
            // InternalGenerador.g:194:4: rule__Tipo__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Tipo__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTipoAccess().getAlternatives()); 

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
    // $ANTLR end "ruleTipo"


    // $ANTLR start "entryRuleDesplegable"
    // InternalGenerador.g:203:1: entryRuleDesplegable : ruleDesplegable EOF ;
    public final void entryRuleDesplegable() throws RecognitionException {
        try {
            // InternalGenerador.g:204:1: ( ruleDesplegable EOF )
            // InternalGenerador.g:205:1: ruleDesplegable EOF
            {
             before(grammarAccess.getDesplegableRule()); 
            pushFollow(FOLLOW_1);
            ruleDesplegable();

            state._fsp--;

             after(grammarAccess.getDesplegableRule()); 
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
    // $ANTLR end "entryRuleDesplegable"


    // $ANTLR start "ruleDesplegable"
    // InternalGenerador.g:212:1: ruleDesplegable : ( ( rule__Desplegable__Group__0 ) ) ;
    public final void ruleDesplegable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:216:2: ( ( ( rule__Desplegable__Group__0 ) ) )
            // InternalGenerador.g:217:2: ( ( rule__Desplegable__Group__0 ) )
            {
            // InternalGenerador.g:217:2: ( ( rule__Desplegable__Group__0 ) )
            // InternalGenerador.g:218:3: ( rule__Desplegable__Group__0 )
            {
             before(grammarAccess.getDesplegableAccess().getGroup()); 
            // InternalGenerador.g:219:3: ( rule__Desplegable__Group__0 )
            // InternalGenerador.g:219:4: rule__Desplegable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Desplegable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDesplegableAccess().getGroup()); 

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
    // $ANTLR end "ruleDesplegable"


    // $ANTLR start "entryRulePermanente"
    // InternalGenerador.g:228:1: entryRulePermanente : rulePermanente EOF ;
    public final void entryRulePermanente() throws RecognitionException {
        try {
            // InternalGenerador.g:229:1: ( rulePermanente EOF )
            // InternalGenerador.g:230:1: rulePermanente EOF
            {
             before(grammarAccess.getPermanenteRule()); 
            pushFollow(FOLLOW_1);
            rulePermanente();

            state._fsp--;

             after(grammarAccess.getPermanenteRule()); 
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
    // $ANTLR end "entryRulePermanente"


    // $ANTLR start "rulePermanente"
    // InternalGenerador.g:237:1: rulePermanente : ( ( rule__Permanente__Group__0 ) ) ;
    public final void rulePermanente() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:241:2: ( ( ( rule__Permanente__Group__0 ) ) )
            // InternalGenerador.g:242:2: ( ( rule__Permanente__Group__0 ) )
            {
            // InternalGenerador.g:242:2: ( ( rule__Permanente__Group__0 ) )
            // InternalGenerador.g:243:3: ( rule__Permanente__Group__0 )
            {
             before(grammarAccess.getPermanenteAccess().getGroup()); 
            // InternalGenerador.g:244:3: ( rule__Permanente__Group__0 )
            // InternalGenerador.g:244:4: rule__Permanente__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Permanente__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPermanenteAccess().getGroup()); 

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
    // $ANTLR end "rulePermanente"


    // $ANTLR start "entryRuleColor"
    // InternalGenerador.g:253:1: entryRuleColor : ruleColor EOF ;
    public final void entryRuleColor() throws RecognitionException {
        try {
            // InternalGenerador.g:254:1: ( ruleColor EOF )
            // InternalGenerador.g:255:1: ruleColor EOF
            {
             before(grammarAccess.getColorRule()); 
            pushFollow(FOLLOW_1);
            ruleColor();

            state._fsp--;

             after(grammarAccess.getColorRule()); 
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
    // $ANTLR end "entryRuleColor"


    // $ANTLR start "ruleColor"
    // InternalGenerador.g:262:1: ruleColor : ( ( rule__Color__Group__0 ) ) ;
    public final void ruleColor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:266:2: ( ( ( rule__Color__Group__0 ) ) )
            // InternalGenerador.g:267:2: ( ( rule__Color__Group__0 ) )
            {
            // InternalGenerador.g:267:2: ( ( rule__Color__Group__0 ) )
            // InternalGenerador.g:268:3: ( rule__Color__Group__0 )
            {
             before(grammarAccess.getColorAccess().getGroup()); 
            // InternalGenerador.g:269:3: ( rule__Color__Group__0 )
            // InternalGenerador.g:269:4: rule__Color__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Color__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getColorAccess().getGroup()); 

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
    // $ANTLR end "ruleColor"


    // $ANTLR start "entryRuleMedida"
    // InternalGenerador.g:278:1: entryRuleMedida : ruleMedida EOF ;
    public final void entryRuleMedida() throws RecognitionException {
        try {
            // InternalGenerador.g:279:1: ( ruleMedida EOF )
            // InternalGenerador.g:280:1: ruleMedida EOF
            {
             before(grammarAccess.getMedidaRule()); 
            pushFollow(FOLLOW_1);
            ruleMedida();

            state._fsp--;

             after(grammarAccess.getMedidaRule()); 
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
    // $ANTLR end "entryRuleMedida"


    // $ANTLR start "ruleMedida"
    // InternalGenerador.g:287:1: ruleMedida : ( ( rule__Medida__Alternatives ) ) ;
    public final void ruleMedida() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:291:2: ( ( ( rule__Medida__Alternatives ) ) )
            // InternalGenerador.g:292:2: ( ( rule__Medida__Alternatives ) )
            {
            // InternalGenerador.g:292:2: ( ( rule__Medida__Alternatives ) )
            // InternalGenerador.g:293:3: ( rule__Medida__Alternatives )
            {
             before(grammarAccess.getMedidaAccess().getAlternatives()); 
            // InternalGenerador.g:294:3: ( rule__Medida__Alternatives )
            // InternalGenerador.g:294:4: rule__Medida__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Medida__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMedidaAccess().getAlternatives()); 

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
    // $ANTLR end "ruleMedida"


    // $ANTLR start "entryRuleCorreo"
    // InternalGenerador.g:303:1: entryRuleCorreo : ruleCorreo EOF ;
    public final void entryRuleCorreo() throws RecognitionException {
        try {
            // InternalGenerador.g:304:1: ( ruleCorreo EOF )
            // InternalGenerador.g:305:1: ruleCorreo EOF
            {
             before(grammarAccess.getCorreoRule()); 
            pushFollow(FOLLOW_1);
            ruleCorreo();

            state._fsp--;

             after(grammarAccess.getCorreoRule()); 
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
    // $ANTLR end "entryRuleCorreo"


    // $ANTLR start "ruleCorreo"
    // InternalGenerador.g:312:1: ruleCorreo : ( ( rule__Correo__Group__0 ) ) ;
    public final void ruleCorreo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:316:2: ( ( ( rule__Correo__Group__0 ) ) )
            // InternalGenerador.g:317:2: ( ( rule__Correo__Group__0 ) )
            {
            // InternalGenerador.g:317:2: ( ( rule__Correo__Group__0 ) )
            // InternalGenerador.g:318:3: ( rule__Correo__Group__0 )
            {
             before(grammarAccess.getCorreoAccess().getGroup()); 
            // InternalGenerador.g:319:3: ( rule__Correo__Group__0 )
            // InternalGenerador.g:319:4: rule__Correo__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Correo__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCorreoAccess().getGroup()); 

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
    // $ANTLR end "ruleCorreo"


    // $ANTLR start "entryRuleRegistro"
    // InternalGenerador.g:328:1: entryRuleRegistro : ruleRegistro EOF ;
    public final void entryRuleRegistro() throws RecognitionException {
        try {
            // InternalGenerador.g:329:1: ( ruleRegistro EOF )
            // InternalGenerador.g:330:1: ruleRegistro EOF
            {
             before(grammarAccess.getRegistroRule()); 
            pushFollow(FOLLOW_1);
            ruleRegistro();

            state._fsp--;

             after(grammarAccess.getRegistroRule()); 
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
    // $ANTLR end "entryRuleRegistro"


    // $ANTLR start "ruleRegistro"
    // InternalGenerador.g:337:1: ruleRegistro : ( ( rule__Registro__Group__0 ) ) ;
    public final void ruleRegistro() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:341:2: ( ( ( rule__Registro__Group__0 ) ) )
            // InternalGenerador.g:342:2: ( ( rule__Registro__Group__0 ) )
            {
            // InternalGenerador.g:342:2: ( ( rule__Registro__Group__0 ) )
            // InternalGenerador.g:343:3: ( rule__Registro__Group__0 )
            {
             before(grammarAccess.getRegistroAccess().getGroup()); 
            // InternalGenerador.g:344:3: ( rule__Registro__Group__0 )
            // InternalGenerador.g:344:4: rule__Registro__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Registro__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRegistroAccess().getGroup()); 

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
    // $ANTLR end "ruleRegistro"


    // $ANTLR start "entryRuleDireccion"
    // InternalGenerador.g:353:1: entryRuleDireccion : ruleDireccion EOF ;
    public final void entryRuleDireccion() throws RecognitionException {
        try {
            // InternalGenerador.g:354:1: ( ruleDireccion EOF )
            // InternalGenerador.g:355:1: ruleDireccion EOF
            {
             before(grammarAccess.getDireccionRule()); 
            pushFollow(FOLLOW_1);
            ruleDireccion();

            state._fsp--;

             after(grammarAccess.getDireccionRule()); 
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
    // $ANTLR end "entryRuleDireccion"


    // $ANTLR start "ruleDireccion"
    // InternalGenerador.g:362:1: ruleDireccion : ( ( rule__Direccion__Group__0 ) ) ;
    public final void ruleDireccion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:366:2: ( ( ( rule__Direccion__Group__0 ) ) )
            // InternalGenerador.g:367:2: ( ( rule__Direccion__Group__0 ) )
            {
            // InternalGenerador.g:367:2: ( ( rule__Direccion__Group__0 ) )
            // InternalGenerador.g:368:3: ( rule__Direccion__Group__0 )
            {
             before(grammarAccess.getDireccionAccess().getGroup()); 
            // InternalGenerador.g:369:3: ( rule__Direccion__Group__0 )
            // InternalGenerador.g:369:4: rule__Direccion__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Direccion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDireccionAccess().getGroup()); 

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
    // $ANTLR end "ruleDireccion"


    // $ANTLR start "rule__Categoria__Alternatives"
    // InternalGenerador.g:377:1: rule__Categoria__Alternatives : ( ( 'Cosmetica' ) | ( 'Higiene' ) | ( 'Salud' ) | ( 'Dietetica' ) | ( 'Bebes' ) );
    public final void rule__Categoria__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:381:1: ( ( 'Cosmetica' ) | ( 'Higiene' ) | ( 'Salud' ) | ( 'Dietetica' ) | ( 'Bebes' ) )
            int alt1=5;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt1=1;
                }
                break;
            case 12:
                {
                alt1=2;
                }
                break;
            case 13:
                {
                alt1=3;
                }
                break;
            case 14:
                {
                alt1=4;
                }
                break;
            case 15:
                {
                alt1=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalGenerador.g:382:2: ( 'Cosmetica' )
                    {
                    // InternalGenerador.g:382:2: ( 'Cosmetica' )
                    // InternalGenerador.g:383:3: 'Cosmetica'
                    {
                     before(grammarAccess.getCategoriaAccess().getCosmeticaKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getCategoriaAccess().getCosmeticaKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGenerador.g:388:2: ( 'Higiene' )
                    {
                    // InternalGenerador.g:388:2: ( 'Higiene' )
                    // InternalGenerador.g:389:3: 'Higiene'
                    {
                     before(grammarAccess.getCategoriaAccess().getHigieneKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getCategoriaAccess().getHigieneKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGenerador.g:394:2: ( 'Salud' )
                    {
                    // InternalGenerador.g:394:2: ( 'Salud' )
                    // InternalGenerador.g:395:3: 'Salud'
                    {
                     before(grammarAccess.getCategoriaAccess().getSaludKeyword_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getCategoriaAccess().getSaludKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalGenerador.g:400:2: ( 'Dietetica' )
                    {
                    // InternalGenerador.g:400:2: ( 'Dietetica' )
                    // InternalGenerador.g:401:3: 'Dietetica'
                    {
                     before(grammarAccess.getCategoriaAccess().getDieteticaKeyword_3()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getCategoriaAccess().getDieteticaKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalGenerador.g:406:2: ( 'Bebes' )
                    {
                    // InternalGenerador.g:406:2: ( 'Bebes' )
                    // InternalGenerador.g:407:3: 'Bebes'
                    {
                     before(grammarAccess.getCategoriaAccess().getBebesKeyword_4()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getCategoriaAccess().getBebesKeyword_4()); 

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
    // $ANTLR end "rule__Categoria__Alternatives"


    // $ANTLR start "rule__Tipo__Alternatives"
    // InternalGenerador.g:416:1: rule__Tipo__Alternatives : ( ( ( rule__Tipo__DesplegableAssignment_0 ) ) | ( ( rule__Tipo__PermanenteAssignment_1 ) ) );
    public final void rule__Tipo__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:420:1: ( ( ( rule__Tipo__DesplegableAssignment_0 ) ) | ( ( rule__Tipo__PermanenteAssignment_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==48) ) {
                alt2=1;
            }
            else if ( (LA2_0==49) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalGenerador.g:421:2: ( ( rule__Tipo__DesplegableAssignment_0 ) )
                    {
                    // InternalGenerador.g:421:2: ( ( rule__Tipo__DesplegableAssignment_0 ) )
                    // InternalGenerador.g:422:3: ( rule__Tipo__DesplegableAssignment_0 )
                    {
                     before(grammarAccess.getTipoAccess().getDesplegableAssignment_0()); 
                    // InternalGenerador.g:423:3: ( rule__Tipo__DesplegableAssignment_0 )
                    // InternalGenerador.g:423:4: rule__Tipo__DesplegableAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Tipo__DesplegableAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTipoAccess().getDesplegableAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGenerador.g:427:2: ( ( rule__Tipo__PermanenteAssignment_1 ) )
                    {
                    // InternalGenerador.g:427:2: ( ( rule__Tipo__PermanenteAssignment_1 ) )
                    // InternalGenerador.g:428:3: ( rule__Tipo__PermanenteAssignment_1 )
                    {
                     before(grammarAccess.getTipoAccess().getPermanenteAssignment_1()); 
                    // InternalGenerador.g:429:3: ( rule__Tipo__PermanenteAssignment_1 )
                    // InternalGenerador.g:429:4: rule__Tipo__PermanenteAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Tipo__PermanenteAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getTipoAccess().getPermanenteAssignment_1()); 

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
    // $ANTLR end "rule__Tipo__Alternatives"


    // $ANTLR start "rule__Color__Alternatives_1"
    // InternalGenerador.g:437:1: rule__Color__Alternatives_1 : ( ( RULE_ID ) | ( RULE_INT ) );
    public final void rule__Color__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:441:1: ( ( RULE_ID ) | ( RULE_INT ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_INT) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalGenerador.g:442:2: ( RULE_ID )
                    {
                    // InternalGenerador.g:442:2: ( RULE_ID )
                    // InternalGenerador.g:443:3: RULE_ID
                    {
                     before(grammarAccess.getColorAccess().getIDTerminalRuleCall_1_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getColorAccess().getIDTerminalRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGenerador.g:448:2: ( RULE_INT )
                    {
                    // InternalGenerador.g:448:2: ( RULE_INT )
                    // InternalGenerador.g:449:3: RULE_INT
                    {
                     before(grammarAccess.getColorAccess().getINTTerminalRuleCall_1_1()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getColorAccess().getINTTerminalRuleCall_1_1()); 

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
    // $ANTLR end "rule__Color__Alternatives_1"


    // $ANTLR start "rule__Medida__Alternatives"
    // InternalGenerador.g:458:1: rule__Medida__Alternatives : ( ( ( rule__Medida__Group_0__0 ) ) | ( ( rule__Medida__Group_1__0 ) ) );
    public final void rule__Medida__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:462:1: ( ( ( rule__Medida__Group_0__0 ) ) | ( ( rule__Medida__Group_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_INT) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==52) ) {
                    alt4=2;
                }
                else if ( (LA4_1==51) ) {
                    alt4=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalGenerador.g:463:2: ( ( rule__Medida__Group_0__0 ) )
                    {
                    // InternalGenerador.g:463:2: ( ( rule__Medida__Group_0__0 ) )
                    // InternalGenerador.g:464:3: ( rule__Medida__Group_0__0 )
                    {
                     before(grammarAccess.getMedidaAccess().getGroup_0()); 
                    // InternalGenerador.g:465:3: ( rule__Medida__Group_0__0 )
                    // InternalGenerador.g:465:4: rule__Medida__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Medida__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMedidaAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGenerador.g:469:2: ( ( rule__Medida__Group_1__0 ) )
                    {
                    // InternalGenerador.g:469:2: ( ( rule__Medida__Group_1__0 ) )
                    // InternalGenerador.g:470:3: ( rule__Medida__Group_1__0 )
                    {
                     before(grammarAccess.getMedidaAccess().getGroup_1()); 
                    // InternalGenerador.g:471:3: ( rule__Medida__Group_1__0 )
                    // InternalGenerador.g:471:4: rule__Medida__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Medida__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMedidaAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Medida__Alternatives"


    // $ANTLR start "rule__Parafarmacia__Group__0"
    // InternalGenerador.g:479:1: rule__Parafarmacia__Group__0 : rule__Parafarmacia__Group__0__Impl rule__Parafarmacia__Group__1 ;
    public final void rule__Parafarmacia__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:483:1: ( rule__Parafarmacia__Group__0__Impl rule__Parafarmacia__Group__1 )
            // InternalGenerador.g:484:2: rule__Parafarmacia__Group__0__Impl rule__Parafarmacia__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Parafarmacia__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parafarmacia__Group__1();

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
    // $ANTLR end "rule__Parafarmacia__Group__0"


    // $ANTLR start "rule__Parafarmacia__Group__0__Impl"
    // InternalGenerador.g:491:1: rule__Parafarmacia__Group__0__Impl : ( 'Parafarmacia' ) ;
    public final void rule__Parafarmacia__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:495:1: ( ( 'Parafarmacia' ) )
            // InternalGenerador.g:496:1: ( 'Parafarmacia' )
            {
            // InternalGenerador.g:496:1: ( 'Parafarmacia' )
            // InternalGenerador.g:497:2: 'Parafarmacia'
            {
             before(grammarAccess.getParafarmaciaAccess().getParafarmaciaKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getParafarmaciaAccess().getParafarmaciaKeyword_0()); 

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
    // $ANTLR end "rule__Parafarmacia__Group__0__Impl"


    // $ANTLR start "rule__Parafarmacia__Group__1"
    // InternalGenerador.g:506:1: rule__Parafarmacia__Group__1 : rule__Parafarmacia__Group__1__Impl rule__Parafarmacia__Group__2 ;
    public final void rule__Parafarmacia__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:510:1: ( rule__Parafarmacia__Group__1__Impl rule__Parafarmacia__Group__2 )
            // InternalGenerador.g:511:2: rule__Parafarmacia__Group__1__Impl rule__Parafarmacia__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Parafarmacia__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parafarmacia__Group__2();

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
    // $ANTLR end "rule__Parafarmacia__Group__1"


    // $ANTLR start "rule__Parafarmacia__Group__1__Impl"
    // InternalGenerador.g:518:1: rule__Parafarmacia__Group__1__Impl : ( '{' ) ;
    public final void rule__Parafarmacia__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:522:1: ( ( '{' ) )
            // InternalGenerador.g:523:1: ( '{' )
            {
            // InternalGenerador.g:523:1: ( '{' )
            // InternalGenerador.g:524:2: '{'
            {
             before(grammarAccess.getParafarmaciaAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getParafarmaciaAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__Parafarmacia__Group__1__Impl"


    // $ANTLR start "rule__Parafarmacia__Group__2"
    // InternalGenerador.g:533:1: rule__Parafarmacia__Group__2 : rule__Parafarmacia__Group__2__Impl rule__Parafarmacia__Group__3 ;
    public final void rule__Parafarmacia__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:537:1: ( rule__Parafarmacia__Group__2__Impl rule__Parafarmacia__Group__3 )
            // InternalGenerador.g:538:2: rule__Parafarmacia__Group__2__Impl rule__Parafarmacia__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Parafarmacia__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parafarmacia__Group__3();

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
    // $ANTLR end "rule__Parafarmacia__Group__2"


    // $ANTLR start "rule__Parafarmacia__Group__2__Impl"
    // InternalGenerador.g:545:1: rule__Parafarmacia__Group__2__Impl : ( '<' ) ;
    public final void rule__Parafarmacia__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:549:1: ( ( '<' ) )
            // InternalGenerador.g:550:1: ( '<' )
            {
            // InternalGenerador.g:550:1: ( '<' )
            // InternalGenerador.g:551:2: '<'
            {
             before(grammarAccess.getParafarmaciaAccess().getLessThanSignKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getParafarmaciaAccess().getLessThanSignKeyword_2()); 

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
    // $ANTLR end "rule__Parafarmacia__Group__2__Impl"


    // $ANTLR start "rule__Parafarmacia__Group__3"
    // InternalGenerador.g:560:1: rule__Parafarmacia__Group__3 : rule__Parafarmacia__Group__3__Impl rule__Parafarmacia__Group__4 ;
    public final void rule__Parafarmacia__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:564:1: ( rule__Parafarmacia__Group__3__Impl rule__Parafarmacia__Group__4 )
            // InternalGenerador.g:565:2: rule__Parafarmacia__Group__3__Impl rule__Parafarmacia__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Parafarmacia__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parafarmacia__Group__4();

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
    // $ANTLR end "rule__Parafarmacia__Group__3"


    // $ANTLR start "rule__Parafarmacia__Group__3__Impl"
    // InternalGenerador.g:572:1: rule__Parafarmacia__Group__3__Impl : ( 'Nombre' ) ;
    public final void rule__Parafarmacia__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:576:1: ( ( 'Nombre' ) )
            // InternalGenerador.g:577:1: ( 'Nombre' )
            {
            // InternalGenerador.g:577:1: ( 'Nombre' )
            // InternalGenerador.g:578:2: 'Nombre'
            {
             before(grammarAccess.getParafarmaciaAccess().getNombreKeyword_3()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getParafarmaciaAccess().getNombreKeyword_3()); 

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
    // $ANTLR end "rule__Parafarmacia__Group__3__Impl"


    // $ANTLR start "rule__Parafarmacia__Group__4"
    // InternalGenerador.g:587:1: rule__Parafarmacia__Group__4 : rule__Parafarmacia__Group__4__Impl rule__Parafarmacia__Group__5 ;
    public final void rule__Parafarmacia__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:591:1: ( rule__Parafarmacia__Group__4__Impl rule__Parafarmacia__Group__5 )
            // InternalGenerador.g:592:2: rule__Parafarmacia__Group__4__Impl rule__Parafarmacia__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Parafarmacia__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parafarmacia__Group__5();

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
    // $ANTLR end "rule__Parafarmacia__Group__4"


    // $ANTLR start "rule__Parafarmacia__Group__4__Impl"
    // InternalGenerador.g:599:1: rule__Parafarmacia__Group__4__Impl : ( '=' ) ;
    public final void rule__Parafarmacia__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:603:1: ( ( '=' ) )
            // InternalGenerador.g:604:1: ( '=' )
            {
            // InternalGenerador.g:604:1: ( '=' )
            // InternalGenerador.g:605:2: '='
            {
             before(grammarAccess.getParafarmaciaAccess().getEqualsSignKeyword_4()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getParafarmaciaAccess().getEqualsSignKeyword_4()); 

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
    // $ANTLR end "rule__Parafarmacia__Group__4__Impl"


    // $ANTLR start "rule__Parafarmacia__Group__5"
    // InternalGenerador.g:614:1: rule__Parafarmacia__Group__5 : rule__Parafarmacia__Group__5__Impl rule__Parafarmacia__Group__6 ;
    public final void rule__Parafarmacia__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:618:1: ( rule__Parafarmacia__Group__5__Impl rule__Parafarmacia__Group__6 )
            // InternalGenerador.g:619:2: rule__Parafarmacia__Group__5__Impl rule__Parafarmacia__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__Parafarmacia__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parafarmacia__Group__6();

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
    // $ANTLR end "rule__Parafarmacia__Group__5"


    // $ANTLR start "rule__Parafarmacia__Group__5__Impl"
    // InternalGenerador.g:626:1: rule__Parafarmacia__Group__5__Impl : ( ( rule__Parafarmacia__TituloAssignment_5 ) ) ;
    public final void rule__Parafarmacia__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:630:1: ( ( ( rule__Parafarmacia__TituloAssignment_5 ) ) )
            // InternalGenerador.g:631:1: ( ( rule__Parafarmacia__TituloAssignment_5 ) )
            {
            // InternalGenerador.g:631:1: ( ( rule__Parafarmacia__TituloAssignment_5 ) )
            // InternalGenerador.g:632:2: ( rule__Parafarmacia__TituloAssignment_5 )
            {
             before(grammarAccess.getParafarmaciaAccess().getTituloAssignment_5()); 
            // InternalGenerador.g:633:2: ( rule__Parafarmacia__TituloAssignment_5 )
            // InternalGenerador.g:633:3: rule__Parafarmacia__TituloAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Parafarmacia__TituloAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getParafarmaciaAccess().getTituloAssignment_5()); 

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
    // $ANTLR end "rule__Parafarmacia__Group__5__Impl"


    // $ANTLR start "rule__Parafarmacia__Group__6"
    // InternalGenerador.g:641:1: rule__Parafarmacia__Group__6 : rule__Parafarmacia__Group__6__Impl rule__Parafarmacia__Group__7 ;
    public final void rule__Parafarmacia__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:645:1: ( rule__Parafarmacia__Group__6__Impl rule__Parafarmacia__Group__7 )
            // InternalGenerador.g:646:2: rule__Parafarmacia__Group__6__Impl rule__Parafarmacia__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__Parafarmacia__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parafarmacia__Group__7();

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
    // $ANTLR end "rule__Parafarmacia__Group__6"


    // $ANTLR start "rule__Parafarmacia__Group__6__Impl"
    // InternalGenerador.g:653:1: rule__Parafarmacia__Group__6__Impl : ( ':' ) ;
    public final void rule__Parafarmacia__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:657:1: ( ( ':' ) )
            // InternalGenerador.g:658:1: ( ':' )
            {
            // InternalGenerador.g:658:1: ( ':' )
            // InternalGenerador.g:659:2: ':'
            {
             before(grammarAccess.getParafarmaciaAccess().getColonKeyword_6()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getParafarmaciaAccess().getColonKeyword_6()); 

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
    // $ANTLR end "rule__Parafarmacia__Group__6__Impl"


    // $ANTLR start "rule__Parafarmacia__Group__7"
    // InternalGenerador.g:668:1: rule__Parafarmacia__Group__7 : rule__Parafarmacia__Group__7__Impl rule__Parafarmacia__Group__8 ;
    public final void rule__Parafarmacia__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:672:1: ( rule__Parafarmacia__Group__7__Impl rule__Parafarmacia__Group__8 )
            // InternalGenerador.g:673:2: rule__Parafarmacia__Group__7__Impl rule__Parafarmacia__Group__8
            {
            pushFollow(FOLLOW_9);
            rule__Parafarmacia__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parafarmacia__Group__8();

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
    // $ANTLR end "rule__Parafarmacia__Group__7"


    // $ANTLR start "rule__Parafarmacia__Group__7__Impl"
    // InternalGenerador.g:680:1: rule__Parafarmacia__Group__7__Impl : ( ( rule__Parafarmacia__FuenteAssignment_7 ) ) ;
    public final void rule__Parafarmacia__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:684:1: ( ( ( rule__Parafarmacia__FuenteAssignment_7 ) ) )
            // InternalGenerador.g:685:1: ( ( rule__Parafarmacia__FuenteAssignment_7 ) )
            {
            // InternalGenerador.g:685:1: ( ( rule__Parafarmacia__FuenteAssignment_7 ) )
            // InternalGenerador.g:686:2: ( rule__Parafarmacia__FuenteAssignment_7 )
            {
             before(grammarAccess.getParafarmaciaAccess().getFuenteAssignment_7()); 
            // InternalGenerador.g:687:2: ( rule__Parafarmacia__FuenteAssignment_7 )
            // InternalGenerador.g:687:3: rule__Parafarmacia__FuenteAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Parafarmacia__FuenteAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getParafarmaciaAccess().getFuenteAssignment_7()); 

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
    // $ANTLR end "rule__Parafarmacia__Group__7__Impl"


    // $ANTLR start "rule__Parafarmacia__Group__8"
    // InternalGenerador.g:695:1: rule__Parafarmacia__Group__8 : rule__Parafarmacia__Group__8__Impl rule__Parafarmacia__Group__9 ;
    public final void rule__Parafarmacia__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:699:1: ( rule__Parafarmacia__Group__8__Impl rule__Parafarmacia__Group__9 )
            // InternalGenerador.g:700:2: rule__Parafarmacia__Group__8__Impl rule__Parafarmacia__Group__9
            {
            pushFollow(FOLLOW_4);
            rule__Parafarmacia__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parafarmacia__Group__9();

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
    // $ANTLR end "rule__Parafarmacia__Group__8"


    // $ANTLR start "rule__Parafarmacia__Group__8__Impl"
    // InternalGenerador.g:707:1: rule__Parafarmacia__Group__8__Impl : ( '>' ) ;
    public final void rule__Parafarmacia__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:711:1: ( ( '>' ) )
            // InternalGenerador.g:712:1: ( '>' )
            {
            // InternalGenerador.g:712:1: ( '>' )
            // InternalGenerador.g:713:2: '>'
            {
             before(grammarAccess.getParafarmaciaAccess().getGreaterThanSignKeyword_8()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getParafarmaciaAccess().getGreaterThanSignKeyword_8()); 

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
    // $ANTLR end "rule__Parafarmacia__Group__8__Impl"


    // $ANTLR start "rule__Parafarmacia__Group__9"
    // InternalGenerador.g:722:1: rule__Parafarmacia__Group__9 : rule__Parafarmacia__Group__9__Impl rule__Parafarmacia__Group__10 ;
    public final void rule__Parafarmacia__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:726:1: ( rule__Parafarmacia__Group__9__Impl rule__Parafarmacia__Group__10 )
            // InternalGenerador.g:727:2: rule__Parafarmacia__Group__9__Impl rule__Parafarmacia__Group__10
            {
            pushFollow(FOLLOW_10);
            rule__Parafarmacia__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parafarmacia__Group__10();

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
    // $ANTLR end "rule__Parafarmacia__Group__9"


    // $ANTLR start "rule__Parafarmacia__Group__9__Impl"
    // InternalGenerador.g:734:1: rule__Parafarmacia__Group__9__Impl : ( '<' ) ;
    public final void rule__Parafarmacia__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:738:1: ( ( '<' ) )
            // InternalGenerador.g:739:1: ( '<' )
            {
            // InternalGenerador.g:739:1: ( '<' )
            // InternalGenerador.g:740:2: '<'
            {
             before(grammarAccess.getParafarmaciaAccess().getLessThanSignKeyword_9()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getParafarmaciaAccess().getLessThanSignKeyword_9()); 

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
    // $ANTLR end "rule__Parafarmacia__Group__9__Impl"


    // $ANTLR start "rule__Parafarmacia__Group__10"
    // InternalGenerador.g:749:1: rule__Parafarmacia__Group__10 : rule__Parafarmacia__Group__10__Impl rule__Parafarmacia__Group__11 ;
    public final void rule__Parafarmacia__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:753:1: ( rule__Parafarmacia__Group__10__Impl rule__Parafarmacia__Group__11 )
            // InternalGenerador.g:754:2: rule__Parafarmacia__Group__10__Impl rule__Parafarmacia__Group__11
            {
            pushFollow(FOLLOW_6);
            rule__Parafarmacia__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parafarmacia__Group__11();

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
    // $ANTLR end "rule__Parafarmacia__Group__10"


    // $ANTLR start "rule__Parafarmacia__Group__10__Impl"
    // InternalGenerador.g:761:1: rule__Parafarmacia__Group__10__Impl : ( 'Titular' ) ;
    public final void rule__Parafarmacia__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:765:1: ( ( 'Titular' ) )
            // InternalGenerador.g:766:1: ( 'Titular' )
            {
            // InternalGenerador.g:766:1: ( 'Titular' )
            // InternalGenerador.g:767:2: 'Titular'
            {
             before(grammarAccess.getParafarmaciaAccess().getTitularKeyword_10()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getParafarmaciaAccess().getTitularKeyword_10()); 

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
    // $ANTLR end "rule__Parafarmacia__Group__10__Impl"


    // $ANTLR start "rule__Parafarmacia__Group__11"
    // InternalGenerador.g:776:1: rule__Parafarmacia__Group__11 : rule__Parafarmacia__Group__11__Impl rule__Parafarmacia__Group__12 ;
    public final void rule__Parafarmacia__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:780:1: ( rule__Parafarmacia__Group__11__Impl rule__Parafarmacia__Group__12 )
            // InternalGenerador.g:781:2: rule__Parafarmacia__Group__11__Impl rule__Parafarmacia__Group__12
            {
            pushFollow(FOLLOW_7);
            rule__Parafarmacia__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parafarmacia__Group__12();

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
    // $ANTLR end "rule__Parafarmacia__Group__11"


    // $ANTLR start "rule__Parafarmacia__Group__11__Impl"
    // InternalGenerador.g:788:1: rule__Parafarmacia__Group__11__Impl : ( '=' ) ;
    public final void rule__Parafarmacia__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:792:1: ( ( '=' ) )
            // InternalGenerador.g:793:1: ( '=' )
            {
            // InternalGenerador.g:793:1: ( '=' )
            // InternalGenerador.g:794:2: '='
            {
             before(grammarAccess.getParafarmaciaAccess().getEqualsSignKeyword_11()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getParafarmaciaAccess().getEqualsSignKeyword_11()); 

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
    // $ANTLR end "rule__Parafarmacia__Group__11__Impl"


    // $ANTLR start "rule__Parafarmacia__Group__12"
    // InternalGenerador.g:803:1: rule__Parafarmacia__Group__12 : rule__Parafarmacia__Group__12__Impl rule__Parafarmacia__Group__13 ;
    public final void rule__Parafarmacia__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:807:1: ( rule__Parafarmacia__Group__12__Impl rule__Parafarmacia__Group__13 )
            // InternalGenerador.g:808:2: rule__Parafarmacia__Group__12__Impl rule__Parafarmacia__Group__13
            {
            pushFollow(FOLLOW_8);
            rule__Parafarmacia__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parafarmacia__Group__13();

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
    // $ANTLR end "rule__Parafarmacia__Group__12"


    // $ANTLR start "rule__Parafarmacia__Group__12__Impl"
    // InternalGenerador.g:815:1: rule__Parafarmacia__Group__12__Impl : ( ( rule__Parafarmacia__NombreAssignment_12 ) ) ;
    public final void rule__Parafarmacia__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:819:1: ( ( ( rule__Parafarmacia__NombreAssignment_12 ) ) )
            // InternalGenerador.g:820:1: ( ( rule__Parafarmacia__NombreAssignment_12 ) )
            {
            // InternalGenerador.g:820:1: ( ( rule__Parafarmacia__NombreAssignment_12 ) )
            // InternalGenerador.g:821:2: ( rule__Parafarmacia__NombreAssignment_12 )
            {
             before(grammarAccess.getParafarmaciaAccess().getNombreAssignment_12()); 
            // InternalGenerador.g:822:2: ( rule__Parafarmacia__NombreAssignment_12 )
            // InternalGenerador.g:822:3: rule__Parafarmacia__NombreAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__Parafarmacia__NombreAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getParafarmaciaAccess().getNombreAssignment_12()); 

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
    // $ANTLR end "rule__Parafarmacia__Group__12__Impl"


    // $ANTLR start "rule__Parafarmacia__Group__13"
    // InternalGenerador.g:830:1: rule__Parafarmacia__Group__13 : rule__Parafarmacia__Group__13__Impl rule__Parafarmacia__Group__14 ;
    public final void rule__Parafarmacia__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:834:1: ( rule__Parafarmacia__Group__13__Impl rule__Parafarmacia__Group__14 )
            // InternalGenerador.g:835:2: rule__Parafarmacia__Group__13__Impl rule__Parafarmacia__Group__14
            {
            pushFollow(FOLLOW_11);
            rule__Parafarmacia__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parafarmacia__Group__14();

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
    // $ANTLR end "rule__Parafarmacia__Group__13"


    // $ANTLR start "rule__Parafarmacia__Group__13__Impl"
    // InternalGenerador.g:842:1: rule__Parafarmacia__Group__13__Impl : ( ':' ) ;
    public final void rule__Parafarmacia__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:846:1: ( ( ':' ) )
            // InternalGenerador.g:847:1: ( ':' )
            {
            // InternalGenerador.g:847:1: ( ':' )
            // InternalGenerador.g:848:2: ':'
            {
             before(grammarAccess.getParafarmaciaAccess().getColonKeyword_13()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getParafarmaciaAccess().getColonKeyword_13()); 

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
    // $ANTLR end "rule__Parafarmacia__Group__13__Impl"


    // $ANTLR start "rule__Parafarmacia__Group__14"
    // InternalGenerador.g:857:1: rule__Parafarmacia__Group__14 : rule__Parafarmacia__Group__14__Impl rule__Parafarmacia__Group__15 ;
    public final void rule__Parafarmacia__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:861:1: ( rule__Parafarmacia__Group__14__Impl rule__Parafarmacia__Group__15 )
            // InternalGenerador.g:862:2: rule__Parafarmacia__Group__14__Impl rule__Parafarmacia__Group__15
            {
            pushFollow(FOLLOW_8);
            rule__Parafarmacia__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parafarmacia__Group__15();

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
    // $ANTLR end "rule__Parafarmacia__Group__14"


    // $ANTLR start "rule__Parafarmacia__Group__14__Impl"
    // InternalGenerador.g:869:1: rule__Parafarmacia__Group__14__Impl : ( ( rule__Parafarmacia__DireccionAssignment_14 ) ) ;
    public final void rule__Parafarmacia__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:873:1: ( ( ( rule__Parafarmacia__DireccionAssignment_14 ) ) )
            // InternalGenerador.g:874:1: ( ( rule__Parafarmacia__DireccionAssignment_14 ) )
            {
            // InternalGenerador.g:874:1: ( ( rule__Parafarmacia__DireccionAssignment_14 ) )
            // InternalGenerador.g:875:2: ( rule__Parafarmacia__DireccionAssignment_14 )
            {
             before(grammarAccess.getParafarmaciaAccess().getDireccionAssignment_14()); 
            // InternalGenerador.g:876:2: ( rule__Parafarmacia__DireccionAssignment_14 )
            // InternalGenerador.g:876:3: rule__Parafarmacia__DireccionAssignment_14
            {
            pushFollow(FOLLOW_2);
            rule__Parafarmacia__DireccionAssignment_14();

            state._fsp--;


            }

             after(grammarAccess.getParafarmaciaAccess().getDireccionAssignment_14()); 

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
    // $ANTLR end "rule__Parafarmacia__Group__14__Impl"


    // $ANTLR start "rule__Parafarmacia__Group__15"
    // InternalGenerador.g:884:1: rule__Parafarmacia__Group__15 : rule__Parafarmacia__Group__15__Impl rule__Parafarmacia__Group__16 ;
    public final void rule__Parafarmacia__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:888:1: ( rule__Parafarmacia__Group__15__Impl rule__Parafarmacia__Group__16 )
            // InternalGenerador.g:889:2: rule__Parafarmacia__Group__15__Impl rule__Parafarmacia__Group__16
            {
            pushFollow(FOLLOW_7);
            rule__Parafarmacia__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parafarmacia__Group__16();

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
    // $ANTLR end "rule__Parafarmacia__Group__15"


    // $ANTLR start "rule__Parafarmacia__Group__15__Impl"
    // InternalGenerador.g:896:1: rule__Parafarmacia__Group__15__Impl : ( ':' ) ;
    public final void rule__Parafarmacia__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:900:1: ( ( ':' ) )
            // InternalGenerador.g:901:1: ( ':' )
            {
            // InternalGenerador.g:901:1: ( ':' )
            // InternalGenerador.g:902:2: ':'
            {
             before(grammarAccess.getParafarmaciaAccess().getColonKeyword_15()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getParafarmaciaAccess().getColonKeyword_15()); 

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
    // $ANTLR end "rule__Parafarmacia__Group__15__Impl"


    // $ANTLR start "rule__Parafarmacia__Group__16"
    // InternalGenerador.g:911:1: rule__Parafarmacia__Group__16 : rule__Parafarmacia__Group__16__Impl rule__Parafarmacia__Group__17 ;
    public final void rule__Parafarmacia__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:915:1: ( rule__Parafarmacia__Group__16__Impl rule__Parafarmacia__Group__17 )
            // InternalGenerador.g:916:2: rule__Parafarmacia__Group__16__Impl rule__Parafarmacia__Group__17
            {
            pushFollow(FOLLOW_8);
            rule__Parafarmacia__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parafarmacia__Group__17();

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
    // $ANTLR end "rule__Parafarmacia__Group__16"


    // $ANTLR start "rule__Parafarmacia__Group__16__Impl"
    // InternalGenerador.g:923:1: rule__Parafarmacia__Group__16__Impl : ( ( rule__Parafarmacia__CifAssignment_16 ) ) ;
    public final void rule__Parafarmacia__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:927:1: ( ( ( rule__Parafarmacia__CifAssignment_16 ) ) )
            // InternalGenerador.g:928:1: ( ( rule__Parafarmacia__CifAssignment_16 ) )
            {
            // InternalGenerador.g:928:1: ( ( rule__Parafarmacia__CifAssignment_16 ) )
            // InternalGenerador.g:929:2: ( rule__Parafarmacia__CifAssignment_16 )
            {
             before(grammarAccess.getParafarmaciaAccess().getCifAssignment_16()); 
            // InternalGenerador.g:930:2: ( rule__Parafarmacia__CifAssignment_16 )
            // InternalGenerador.g:930:3: rule__Parafarmacia__CifAssignment_16
            {
            pushFollow(FOLLOW_2);
            rule__Parafarmacia__CifAssignment_16();

            state._fsp--;


            }

             after(grammarAccess.getParafarmaciaAccess().getCifAssignment_16()); 

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
    // $ANTLR end "rule__Parafarmacia__Group__16__Impl"


    // $ANTLR start "rule__Parafarmacia__Group__17"
    // InternalGenerador.g:938:1: rule__Parafarmacia__Group__17 : rule__Parafarmacia__Group__17__Impl rule__Parafarmacia__Group__18 ;
    public final void rule__Parafarmacia__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:942:1: ( rule__Parafarmacia__Group__17__Impl rule__Parafarmacia__Group__18 )
            // InternalGenerador.g:943:2: rule__Parafarmacia__Group__17__Impl rule__Parafarmacia__Group__18
            {
            pushFollow(FOLLOW_11);
            rule__Parafarmacia__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parafarmacia__Group__18();

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
    // $ANTLR end "rule__Parafarmacia__Group__17"


    // $ANTLR start "rule__Parafarmacia__Group__17__Impl"
    // InternalGenerador.g:950:1: rule__Parafarmacia__Group__17__Impl : ( ':' ) ;
    public final void rule__Parafarmacia__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:954:1: ( ( ':' ) )
            // InternalGenerador.g:955:1: ( ':' )
            {
            // InternalGenerador.g:955:1: ( ':' )
            // InternalGenerador.g:956:2: ':'
            {
             before(grammarAccess.getParafarmaciaAccess().getColonKeyword_17()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getParafarmaciaAccess().getColonKeyword_17()); 

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
    // $ANTLR end "rule__Parafarmacia__Group__17__Impl"


    // $ANTLR start "rule__Parafarmacia__Group__18"
    // InternalGenerador.g:965:1: rule__Parafarmacia__Group__18 : rule__Parafarmacia__Group__18__Impl rule__Parafarmacia__Group__19 ;
    public final void rule__Parafarmacia__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:969:1: ( rule__Parafarmacia__Group__18__Impl rule__Parafarmacia__Group__19 )
            // InternalGenerador.g:970:2: rule__Parafarmacia__Group__18__Impl rule__Parafarmacia__Group__19
            {
            pushFollow(FOLLOW_8);
            rule__Parafarmacia__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parafarmacia__Group__19();

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
    // $ANTLR end "rule__Parafarmacia__Group__18"


    // $ANTLR start "rule__Parafarmacia__Group__18__Impl"
    // InternalGenerador.g:977:1: rule__Parafarmacia__Group__18__Impl : ( ( rule__Parafarmacia__RegistroAssignment_18 ) ) ;
    public final void rule__Parafarmacia__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:981:1: ( ( ( rule__Parafarmacia__RegistroAssignment_18 ) ) )
            // InternalGenerador.g:982:1: ( ( rule__Parafarmacia__RegistroAssignment_18 ) )
            {
            // InternalGenerador.g:982:1: ( ( rule__Parafarmacia__RegistroAssignment_18 ) )
            // InternalGenerador.g:983:2: ( rule__Parafarmacia__RegistroAssignment_18 )
            {
             before(grammarAccess.getParafarmaciaAccess().getRegistroAssignment_18()); 
            // InternalGenerador.g:984:2: ( rule__Parafarmacia__RegistroAssignment_18 )
            // InternalGenerador.g:984:3: rule__Parafarmacia__RegistroAssignment_18
            {
            pushFollow(FOLLOW_2);
            rule__Parafarmacia__RegistroAssignment_18();

            state._fsp--;


            }

             after(grammarAccess.getParafarmaciaAccess().getRegistroAssignment_18()); 

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
    // $ANTLR end "rule__Parafarmacia__Group__18__Impl"


    // $ANTLR start "rule__Parafarmacia__Group__19"
    // InternalGenerador.g:992:1: rule__Parafarmacia__Group__19 : rule__Parafarmacia__Group__19__Impl rule__Parafarmacia__Group__20 ;
    public final void rule__Parafarmacia__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:996:1: ( rule__Parafarmacia__Group__19__Impl rule__Parafarmacia__Group__20 )
            // InternalGenerador.g:997:2: rule__Parafarmacia__Group__19__Impl rule__Parafarmacia__Group__20
            {
            pushFollow(FOLLOW_12);
            rule__Parafarmacia__Group__19__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parafarmacia__Group__20();

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
    // $ANTLR end "rule__Parafarmacia__Group__19"


    // $ANTLR start "rule__Parafarmacia__Group__19__Impl"
    // InternalGenerador.g:1004:1: rule__Parafarmacia__Group__19__Impl : ( ':' ) ;
    public final void rule__Parafarmacia__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:1008:1: ( ( ':' ) )
            // InternalGenerador.g:1009:1: ( ':' )
            {
            // InternalGenerador.g:1009:1: ( ':' )
            // InternalGenerador.g:1010:2: ':'
            {
             before(grammarAccess.getParafarmaciaAccess().getColonKeyword_19()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getParafarmaciaAccess().getColonKeyword_19()); 

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
    // $ANTLR end "rule__Parafarmacia__Group__19__Impl"


    // $ANTLR start "rule__Parafarmacia__Group__20"
    // InternalGenerador.g:1019:1: rule__Parafarmacia__Group__20 : rule__Parafarmacia__Group__20__Impl rule__Parafarmacia__Group__21 ;
    public final void rule__Parafarmacia__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:1023:1: ( rule__Parafarmacia__Group__20__Impl rule__Parafarmacia__Group__21 )
            // InternalGenerador.g:1024:2: rule__Parafarmacia__Group__20__Impl rule__Parafarmacia__Group__21
            {
            pushFollow(FOLLOW_8);
            rule__Parafarmacia__Group__20__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parafarmacia__Group__21();

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
    // $ANTLR end "rule__Parafarmacia__Group__20"


    // $ANTLR start "rule__Parafarmacia__Group__20__Impl"
    // InternalGenerador.g:1031:1: rule__Parafarmacia__Group__20__Impl : ( ( rule__Parafarmacia__CorreoAssignment_20 ) ) ;
    public final void rule__Parafarmacia__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:1035:1: ( ( ( rule__Parafarmacia__CorreoAssignment_20 ) ) )
            // InternalGenerador.g:1036:1: ( ( rule__Parafarmacia__CorreoAssignment_20 ) )
            {
            // InternalGenerador.g:1036:1: ( ( rule__Parafarmacia__CorreoAssignment_20 ) )
            // InternalGenerador.g:1037:2: ( rule__Parafarmacia__CorreoAssignment_20 )
            {
             before(grammarAccess.getParafarmaciaAccess().getCorreoAssignment_20()); 
            // InternalGenerador.g:1038:2: ( rule__Parafarmacia__CorreoAssignment_20 )
            // InternalGenerador.g:1038:3: rule__Parafarmacia__CorreoAssignment_20
            {
            pushFollow(FOLLOW_2);
            rule__Parafarmacia__CorreoAssignment_20();

            state._fsp--;


            }

             after(grammarAccess.getParafarmaciaAccess().getCorreoAssignment_20()); 

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
    // $ANTLR end "rule__Parafarmacia__Group__20__Impl"


    // $ANTLR start "rule__Parafarmacia__Group__21"
    // InternalGenerador.g:1046:1: rule__Parafarmacia__Group__21 : rule__Parafarmacia__Group__21__Impl rule__Parafarmacia__Group__22 ;
    public final void rule__Parafarmacia__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:1050:1: ( rule__Parafarmacia__Group__21__Impl rule__Parafarmacia__Group__22 )
            // InternalGenerador.g:1051:2: rule__Parafarmacia__Group__21__Impl rule__Parafarmacia__Group__22
            {
            pushFollow(FOLLOW_13);
            rule__Parafarmacia__Group__21__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parafarmacia__Group__22();

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
    // $ANTLR end "rule__Parafarmacia__Group__21"


    // $ANTLR start "rule__Parafarmacia__Group__21__Impl"
    // InternalGenerador.g:1058:1: rule__Parafarmacia__Group__21__Impl : ( ':' ) ;
    public final void rule__Parafarmacia__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:1062:1: ( ( ':' ) )
            // InternalGenerador.g:1063:1: ( ':' )
            {
            // InternalGenerador.g:1063:1: ( ':' )
            // InternalGenerador.g:1064:2: ':'
            {
             before(grammarAccess.getParafarmaciaAccess().getColonKeyword_21()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getParafarmaciaAccess().getColonKeyword_21()); 

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
    // $ANTLR end "rule__Parafarmacia__Group__21__Impl"


    // $ANTLR start "rule__Parafarmacia__Group__22"
    // InternalGenerador.g:1073:1: rule__Parafarmacia__Group__22 : rule__Parafarmacia__Group__22__Impl rule__Parafarmacia__Group__23 ;
    public final void rule__Parafarmacia__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:1077:1: ( rule__Parafarmacia__Group__22__Impl rule__Parafarmacia__Group__23 )
            // InternalGenerador.g:1078:2: rule__Parafarmacia__Group__22__Impl rule__Parafarmacia__Group__23
            {
            pushFollow(FOLLOW_9);
            rule__Parafarmacia__Group__22__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parafarmacia__Group__23();

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
    // $ANTLR end "rule__Parafarmacia__Group__22"


    // $ANTLR start "rule__Parafarmacia__Group__22__Impl"
    // InternalGenerador.g:1085:1: rule__Parafarmacia__Group__22__Impl : ( ( rule__Parafarmacia__TelefonoAssignment_22 ) ) ;
    public final void rule__Parafarmacia__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:1089:1: ( ( ( rule__Parafarmacia__TelefonoAssignment_22 ) ) )
            // InternalGenerador.g:1090:1: ( ( rule__Parafarmacia__TelefonoAssignment_22 ) )
            {
            // InternalGenerador.g:1090:1: ( ( rule__Parafarmacia__TelefonoAssignment_22 ) )
            // InternalGenerador.g:1091:2: ( rule__Parafarmacia__TelefonoAssignment_22 )
            {
             before(grammarAccess.getParafarmaciaAccess().getTelefonoAssignment_22()); 
            // InternalGenerador.g:1092:2: ( rule__Parafarmacia__TelefonoAssignment_22 )
            // InternalGenerador.g:1092:3: rule__Parafarmacia__TelefonoAssignment_22
            {
            pushFollow(FOLLOW_2);
            rule__Parafarmacia__TelefonoAssignment_22();

            state._fsp--;


            }

             after(grammarAccess.getParafarmaciaAccess().getTelefonoAssignment_22()); 

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
    // $ANTLR end "rule__Parafarmacia__Group__22__Impl"


    // $ANTLR start "rule__Parafarmacia__Group__23"
    // InternalGenerador.g:1100:1: rule__Parafarmacia__Group__23 : rule__Parafarmacia__Group__23__Impl rule__Parafarmacia__Group__24 ;
    public final void rule__Parafarmacia__Group__23() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:1104:1: ( rule__Parafarmacia__Group__23__Impl rule__Parafarmacia__Group__24 )
            // InternalGenerador.g:1105:2: rule__Parafarmacia__Group__23__Impl rule__Parafarmacia__Group__24
            {
            pushFollow(FOLLOW_4);
            rule__Parafarmacia__Group__23__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parafarmacia__Group__24();

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
    // $ANTLR end "rule__Parafarmacia__Group__23"


    // $ANTLR start "rule__Parafarmacia__Group__23__Impl"
    // InternalGenerador.g:1112:1: rule__Parafarmacia__Group__23__Impl : ( '>' ) ;
    public final void rule__Parafarmacia__Group__23__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:1116:1: ( ( '>' ) )
            // InternalGenerador.g:1117:1: ( '>' )
            {
            // InternalGenerador.g:1117:1: ( '>' )
            // InternalGenerador.g:1118:2: '>'
            {
             before(grammarAccess.getParafarmaciaAccess().getGreaterThanSignKeyword_23()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getParafarmaciaAccess().getGreaterThanSignKeyword_23()); 

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
    // $ANTLR end "rule__Parafarmacia__Group__23__Impl"


    // $ANTLR start "rule__Parafarmacia__Group__24"
    // InternalGenerador.g:1127:1: rule__Parafarmacia__Group__24 : rule__Parafarmacia__Group__24__Impl rule__Parafarmacia__Group__25 ;
    public final void rule__Parafarmacia__Group__24() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:1131:1: ( rule__Parafarmacia__Group__24__Impl rule__Parafarmacia__Group__25 )
            // InternalGenerador.g:1132:2: rule__Parafarmacia__Group__24__Impl rule__Parafarmacia__Group__25
            {
            pushFollow(FOLLOW_14);
            rule__Parafarmacia__Group__24__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parafarmacia__Group__25();

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
    // $ANTLR end "rule__Parafarmacia__Group__24"


    // $ANTLR start "rule__Parafarmacia__Group__24__Impl"
    // InternalGenerador.g:1139:1: rule__Parafarmacia__Group__24__Impl : ( '<' ) ;
    public final void rule__Parafarmacia__Group__24__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:1143:1: ( ( '<' ) )
            // InternalGenerador.g:1144:1: ( '<' )
            {
            // InternalGenerador.g:1144:1: ( '<' )
            // InternalGenerador.g:1145:2: '<'
            {
             before(grammarAccess.getParafarmaciaAccess().getLessThanSignKeyword_24()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getParafarmaciaAccess().getLessThanSignKeyword_24()); 

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
    // $ANTLR end "rule__Parafarmacia__Group__24__Impl"


    // $ANTLR start "rule__Parafarmacia__Group__25"
    // InternalGenerador.g:1154:1: rule__Parafarmacia__Group__25 : rule__Parafarmacia__Group__25__Impl rule__Parafarmacia__Group__26 ;
    public final void rule__Parafarmacia__Group__25() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:1158:1: ( rule__Parafarmacia__Group__25__Impl rule__Parafarmacia__Group__26 )
            // InternalGenerador.g:1159:2: rule__Parafarmacia__Group__25__Impl rule__Parafarmacia__Group__26
            {
            pushFollow(FOLLOW_6);
            rule__Parafarmacia__Group__25__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parafarmacia__Group__26();

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
    // $ANTLR end "rule__Parafarmacia__Group__25"


    // $ANTLR start "rule__Parafarmacia__Group__25__Impl"
    // InternalGenerador.g:1166:1: rule__Parafarmacia__Group__25__Impl : ( 'Menu' ) ;
    public final void rule__Parafarmacia__Group__25__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:1170:1: ( ( 'Menu' ) )
            // InternalGenerador.g:1171:1: ( 'Menu' )
            {
            // InternalGenerador.g:1171:1: ( 'Menu' )
            // InternalGenerador.g:1172:2: 'Menu'
            {
             before(grammarAccess.getParafarmaciaAccess().getMenuKeyword_25()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getParafarmaciaAccess().getMenuKeyword_25()); 

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
    // $ANTLR end "rule__Parafarmacia__Group__25__Impl"


    // $ANTLR start "rule__Parafarmacia__Group__26"
    // InternalGenerador.g:1181:1: rule__Parafarmacia__Group__26 : rule__Parafarmacia__Group__26__Impl rule__Parafarmacia__Group__27 ;
    public final void rule__Parafarmacia__Group__26() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:1185:1: ( rule__Parafarmacia__Group__26__Impl rule__Parafarmacia__Group__27 )
            // InternalGenerador.g:1186:2: rule__Parafarmacia__Group__26__Impl rule__Parafarmacia__Group__27
            {
            pushFollow(FOLLOW_15);
            rule__Parafarmacia__Group__26__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parafarmacia__Group__27();

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
    // $ANTLR end "rule__Parafarmacia__Group__26"


    // $ANTLR start "rule__Parafarmacia__Group__26__Impl"
    // InternalGenerador.g:1193:1: rule__Parafarmacia__Group__26__Impl : ( '=' ) ;
    public final void rule__Parafarmacia__Group__26__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:1197:1: ( ( '=' ) )
            // InternalGenerador.g:1198:1: ( '=' )
            {
            // InternalGenerador.g:1198:1: ( '=' )
            // InternalGenerador.g:1199:2: '='
            {
             before(grammarAccess.getParafarmaciaAccess().getEqualsSignKeyword_26()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getParafarmaciaAccess().getEqualsSignKeyword_26()); 

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
    // $ANTLR end "rule__Parafarmacia__Group__26__Impl"


    // $ANTLR start "rule__Parafarmacia__Group__27"
    // InternalGenerador.g:1208:1: rule__Parafarmacia__Group__27 : rule__Parafarmacia__Group__27__Impl rule__Parafarmacia__Group__28 ;
    public final void rule__Parafarmacia__Group__27() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:1212:1: ( rule__Parafarmacia__Group__27__Impl rule__Parafarmacia__Group__28 )
            // InternalGenerador.g:1213:2: rule__Parafarmacia__Group__27__Impl rule__Parafarmacia__Group__28
            {
            pushFollow(FOLLOW_9);
            rule__Parafarmacia__Group__27__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parafarmacia__Group__28();

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
    // $ANTLR end "rule__Parafarmacia__Group__27"


    // $ANTLR start "rule__Parafarmacia__Group__27__Impl"
    // InternalGenerador.g:1220:1: rule__Parafarmacia__Group__27__Impl : ( ( rule__Parafarmacia__TipoAssignment_27 ) ) ;
    public final void rule__Parafarmacia__Group__27__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:1224:1: ( ( ( rule__Parafarmacia__TipoAssignment_27 ) ) )
            // InternalGenerador.g:1225:1: ( ( rule__Parafarmacia__TipoAssignment_27 ) )
            {
            // InternalGenerador.g:1225:1: ( ( rule__Parafarmacia__TipoAssignment_27 ) )
            // InternalGenerador.g:1226:2: ( rule__Parafarmacia__TipoAssignment_27 )
            {
             before(grammarAccess.getParafarmaciaAccess().getTipoAssignment_27()); 
            // InternalGenerador.g:1227:2: ( rule__Parafarmacia__TipoAssignment_27 )
            // InternalGenerador.g:1227:3: rule__Parafarmacia__TipoAssignment_27
            {
            pushFollow(FOLLOW_2);
            rule__Parafarmacia__TipoAssignment_27();

            state._fsp--;


            }

             after(grammarAccess.getParafarmaciaAccess().getTipoAssignment_27()); 

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
    // $ANTLR end "rule__Parafarmacia__Group__27__Impl"


    // $ANTLR start "rule__Parafarmacia__Group__28"
    // InternalGenerador.g:1235:1: rule__Parafarmacia__Group__28 : rule__Parafarmacia__Group__28__Impl rule__Parafarmacia__Group__29 ;
    public final void rule__Parafarmacia__Group__28() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:1239:1: ( rule__Parafarmacia__Group__28__Impl rule__Parafarmacia__Group__29 )
            // InternalGenerador.g:1240:2: rule__Parafarmacia__Group__28__Impl rule__Parafarmacia__Group__29
            {
            pushFollow(FOLLOW_4);
            rule__Parafarmacia__Group__28__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parafarmacia__Group__29();

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
    // $ANTLR end "rule__Parafarmacia__Group__28"


    // $ANTLR start "rule__Parafarmacia__Group__28__Impl"
    // InternalGenerador.g:1247:1: rule__Parafarmacia__Group__28__Impl : ( '>' ) ;
    public final void rule__Parafarmacia__Group__28__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:1251:1: ( ( '>' ) )
            // InternalGenerador.g:1252:1: ( '>' )
            {
            // InternalGenerador.g:1252:1: ( '>' )
            // InternalGenerador.g:1253:2: '>'
            {
             before(grammarAccess.getParafarmaciaAccess().getGreaterThanSignKeyword_28()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getParafarmaciaAccess().getGreaterThanSignKeyword_28()); 

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
    // $ANTLR end "rule__Parafarmacia__Group__28__Impl"


    // $ANTLR start "rule__Parafarmacia__Group__29"
    // InternalGenerador.g:1262:1: rule__Parafarmacia__Group__29 : rule__Parafarmacia__Group__29__Impl rule__Parafarmacia__Group__30 ;
    public final void rule__Parafarmacia__Group__29() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:1266:1: ( rule__Parafarmacia__Group__29__Impl rule__Parafarmacia__Group__30 )
            // InternalGenerador.g:1267:2: rule__Parafarmacia__Group__29__Impl rule__Parafarmacia__Group__30
            {
            pushFollow(FOLLOW_16);
            rule__Parafarmacia__Group__29__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parafarmacia__Group__30();

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
    // $ANTLR end "rule__Parafarmacia__Group__29"


    // $ANTLR start "rule__Parafarmacia__Group__29__Impl"
    // InternalGenerador.g:1274:1: rule__Parafarmacia__Group__29__Impl : ( '<' ) ;
    public final void rule__Parafarmacia__Group__29__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:1278:1: ( ( '<' ) )
            // InternalGenerador.g:1279:1: ( '<' )
            {
            // InternalGenerador.g:1279:1: ( '<' )
            // InternalGenerador.g:1280:2: '<'
            {
             before(grammarAccess.getParafarmaciaAccess().getLessThanSignKeyword_29()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getParafarmaciaAccess().getLessThanSignKeyword_29()); 

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
    // $ANTLR end "rule__Parafarmacia__Group__29__Impl"


    // $ANTLR start "rule__Parafarmacia__Group__30"
    // InternalGenerador.g:1289:1: rule__Parafarmacia__Group__30 : rule__Parafarmacia__Group__30__Impl rule__Parafarmacia__Group__31 ;
    public final void rule__Parafarmacia__Group__30() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:1293:1: ( rule__Parafarmacia__Group__30__Impl rule__Parafarmacia__Group__31 )
            // InternalGenerador.g:1294:2: rule__Parafarmacia__Group__30__Impl rule__Parafarmacia__Group__31
            {
            pushFollow(FOLLOW_6);
            rule__Parafarmacia__Group__30__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parafarmacia__Group__31();

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
    // $ANTLR end "rule__Parafarmacia__Group__30"


    // $ANTLR start "rule__Parafarmacia__Group__30__Impl"
    // InternalGenerador.g:1301:1: rule__Parafarmacia__Group__30__Impl : ( 'Apariencia' ) ;
    public final void rule__Parafarmacia__Group__30__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:1305:1: ( ( 'Apariencia' ) )
            // InternalGenerador.g:1306:1: ( 'Apariencia' )
            {
            // InternalGenerador.g:1306:1: ( 'Apariencia' )
            // InternalGenerador.g:1307:2: 'Apariencia'
            {
             before(grammarAccess.getParafarmaciaAccess().getAparienciaKeyword_30()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getParafarmaciaAccess().getAparienciaKeyword_30()); 

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
    // $ANTLR end "rule__Parafarmacia__Group__30__Impl"


    // $ANTLR start "rule__Parafarmacia__Group__31"
    // InternalGenerador.g:1316:1: rule__Parafarmacia__Group__31 : rule__Parafarmacia__Group__31__Impl rule__Parafarmacia__Group__32 ;
    public final void rule__Parafarmacia__Group__31() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:1320:1: ( rule__Parafarmacia__Group__31__Impl rule__Parafarmacia__Group__32 )
            // InternalGenerador.g:1321:2: rule__Parafarmacia__Group__31__Impl rule__Parafarmacia__Group__32
            {
            pushFollow(FOLLOW_11);
            rule__Parafarmacia__Group__31__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parafarmacia__Group__32();

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
    // $ANTLR end "rule__Parafarmacia__Group__31"


    // $ANTLR start "rule__Parafarmacia__Group__31__Impl"
    // InternalGenerador.g:1328:1: rule__Parafarmacia__Group__31__Impl : ( '=' ) ;
    public final void rule__Parafarmacia__Group__31__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:1332:1: ( ( '=' ) )
            // InternalGenerador.g:1333:1: ( '=' )
            {
            // InternalGenerador.g:1333:1: ( '=' )
            // InternalGenerador.g:1334:2: '='
            {
             before(grammarAccess.getParafarmaciaAccess().getEqualsSignKeyword_31()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getParafarmaciaAccess().getEqualsSignKeyword_31()); 

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
    // $ANTLR end "rule__Parafarmacia__Group__31__Impl"


    // $ANTLR start "rule__Parafarmacia__Group__32"
    // InternalGenerador.g:1343:1: rule__Parafarmacia__Group__32 : rule__Parafarmacia__Group__32__Impl rule__Parafarmacia__Group__33 ;
    public final void rule__Parafarmacia__Group__32() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:1347:1: ( rule__Parafarmacia__Group__32__Impl rule__Parafarmacia__Group__33 )
            // InternalGenerador.g:1348:2: rule__Parafarmacia__Group__32__Impl rule__Parafarmacia__Group__33
            {
            pushFollow(FOLLOW_9);
            rule__Parafarmacia__Group__32__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parafarmacia__Group__33();

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
    // $ANTLR end "rule__Parafarmacia__Group__32"


    // $ANTLR start "rule__Parafarmacia__Group__32__Impl"
    // InternalGenerador.g:1355:1: rule__Parafarmacia__Group__32__Impl : ( ( rule__Parafarmacia__AparienciaAssignment_32 ) ) ;
    public final void rule__Parafarmacia__Group__32__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:1359:1: ( ( ( rule__Parafarmacia__AparienciaAssignment_32 ) ) )
            // InternalGenerador.g:1360:1: ( ( rule__Parafarmacia__AparienciaAssignment_32 ) )
            {
            // InternalGenerador.g:1360:1: ( ( rule__Parafarmacia__AparienciaAssignment_32 ) )
            // InternalGenerador.g:1361:2: ( rule__Parafarmacia__AparienciaAssignment_32 )
            {
             before(grammarAccess.getParafarmaciaAccess().getAparienciaAssignment_32()); 
            // InternalGenerador.g:1362:2: ( rule__Parafarmacia__AparienciaAssignment_32 )
            // InternalGenerador.g:1362:3: rule__Parafarmacia__AparienciaAssignment_32
            {
            pushFollow(FOLLOW_2);
            rule__Parafarmacia__AparienciaAssignment_32();

            state._fsp--;


            }

             after(grammarAccess.getParafarmaciaAccess().getAparienciaAssignment_32()); 

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
    // $ANTLR end "rule__Parafarmacia__Group__32__Impl"


    // $ANTLR start "rule__Parafarmacia__Group__33"
    // InternalGenerador.g:1370:1: rule__Parafarmacia__Group__33 : rule__Parafarmacia__Group__33__Impl rule__Parafarmacia__Group__34 ;
    public final void rule__Parafarmacia__Group__33() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:1374:1: ( rule__Parafarmacia__Group__33__Impl rule__Parafarmacia__Group__34 )
            // InternalGenerador.g:1375:2: rule__Parafarmacia__Group__33__Impl rule__Parafarmacia__Group__34
            {
            pushFollow(FOLLOW_4);
            rule__Parafarmacia__Group__33__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parafarmacia__Group__34();

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
    // $ANTLR end "rule__Parafarmacia__Group__33"


    // $ANTLR start "rule__Parafarmacia__Group__33__Impl"
    // InternalGenerador.g:1382:1: rule__Parafarmacia__Group__33__Impl : ( '>' ) ;
    public final void rule__Parafarmacia__Group__33__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:1386:1: ( ( '>' ) )
            // InternalGenerador.g:1387:1: ( '>' )
            {
            // InternalGenerador.g:1387:1: ( '>' )
            // InternalGenerador.g:1388:2: '>'
            {
             before(grammarAccess.getParafarmaciaAccess().getGreaterThanSignKeyword_33()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getParafarmaciaAccess().getGreaterThanSignKeyword_33()); 

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
    // $ANTLR end "rule__Parafarmacia__Group__33__Impl"


    // $ANTLR start "rule__Parafarmacia__Group__34"
    // InternalGenerador.g:1397:1: rule__Parafarmacia__Group__34 : rule__Parafarmacia__Group__34__Impl rule__Parafarmacia__Group__35 ;
    public final void rule__Parafarmacia__Group__34() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:1401:1: ( rule__Parafarmacia__Group__34__Impl rule__Parafarmacia__Group__35 )
            // InternalGenerador.g:1402:2: rule__Parafarmacia__Group__34__Impl rule__Parafarmacia__Group__35
            {
            pushFollow(FOLLOW_17);
            rule__Parafarmacia__Group__34__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parafarmacia__Group__35();

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
    // $ANTLR end "rule__Parafarmacia__Group__34"


    // $ANTLR start "rule__Parafarmacia__Group__34__Impl"
    // InternalGenerador.g:1409:1: rule__Parafarmacia__Group__34__Impl : ( '<' ) ;
    public final void rule__Parafarmacia__Group__34__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:1413:1: ( ( '<' ) )
            // InternalGenerador.g:1414:1: ( '<' )
            {
            // InternalGenerador.g:1414:1: ( '<' )
            // InternalGenerador.g:1415:2: '<'
            {
             before(grammarAccess.getParafarmaciaAccess().getLessThanSignKeyword_34()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getParafarmaciaAccess().getLessThanSignKeyword_34()); 

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
    // $ANTLR end "rule__Parafarmacia__Group__34__Impl"


    // $ANTLR start "rule__Parafarmacia__Group__35"
    // InternalGenerador.g:1424:1: rule__Parafarmacia__Group__35 : rule__Parafarmacia__Group__35__Impl rule__Parafarmacia__Group__36 ;
    public final void rule__Parafarmacia__Group__35() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:1428:1: ( rule__Parafarmacia__Group__35__Impl rule__Parafarmacia__Group__36 )
            // InternalGenerador.g:1429:2: rule__Parafarmacia__Group__35__Impl rule__Parafarmacia__Group__36
            {
            pushFollow(FOLLOW_6);
            rule__Parafarmacia__Group__35__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parafarmacia__Group__36();

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
    // $ANTLR end "rule__Parafarmacia__Group__35"


    // $ANTLR start "rule__Parafarmacia__Group__35__Impl"
    // InternalGenerador.g:1436:1: rule__Parafarmacia__Group__35__Impl : ( 'Categorias' ) ;
    public final void rule__Parafarmacia__Group__35__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:1440:1: ( ( 'Categorias' ) )
            // InternalGenerador.g:1441:1: ( 'Categorias' )
            {
            // InternalGenerador.g:1441:1: ( 'Categorias' )
            // InternalGenerador.g:1442:2: 'Categorias'
            {
             before(grammarAccess.getParafarmaciaAccess().getCategoriasKeyword_35()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getParafarmaciaAccess().getCategoriasKeyword_35()); 

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
    // $ANTLR end "rule__Parafarmacia__Group__35__Impl"


    // $ANTLR start "rule__Parafarmacia__Group__36"
    // InternalGenerador.g:1451:1: rule__Parafarmacia__Group__36 : rule__Parafarmacia__Group__36__Impl rule__Parafarmacia__Group__37 ;
    public final void rule__Parafarmacia__Group__36() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:1455:1: ( rule__Parafarmacia__Group__36__Impl rule__Parafarmacia__Group__37 )
            // InternalGenerador.g:1456:2: rule__Parafarmacia__Group__36__Impl rule__Parafarmacia__Group__37
            {
            pushFollow(FOLLOW_18);
            rule__Parafarmacia__Group__36__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parafarmacia__Group__37();

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
    // $ANTLR end "rule__Parafarmacia__Group__36"


    // $ANTLR start "rule__Parafarmacia__Group__36__Impl"
    // InternalGenerador.g:1463:1: rule__Parafarmacia__Group__36__Impl : ( '=' ) ;
    public final void rule__Parafarmacia__Group__36__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:1467:1: ( ( '=' ) )
            // InternalGenerador.g:1468:1: ( '=' )
            {
            // InternalGenerador.g:1468:1: ( '=' )
            // InternalGenerador.g:1469:2: '='
            {
             before(grammarAccess.getParafarmaciaAccess().getEqualsSignKeyword_36()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getParafarmaciaAccess().getEqualsSignKeyword_36()); 

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
    // $ANTLR end "rule__Parafarmacia__Group__36__Impl"


    // $ANTLR start "rule__Parafarmacia__Group__37"
    // InternalGenerador.g:1478:1: rule__Parafarmacia__Group__37 : rule__Parafarmacia__Group__37__Impl rule__Parafarmacia__Group__38 ;
    public final void rule__Parafarmacia__Group__37() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:1482:1: ( rule__Parafarmacia__Group__37__Impl rule__Parafarmacia__Group__38 )
            // InternalGenerador.g:1483:2: rule__Parafarmacia__Group__37__Impl rule__Parafarmacia__Group__38
            {
            pushFollow(FOLLOW_18);
            rule__Parafarmacia__Group__37__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parafarmacia__Group__38();

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
    // $ANTLR end "rule__Parafarmacia__Group__37"


    // $ANTLR start "rule__Parafarmacia__Group__37__Impl"
    // InternalGenerador.g:1490:1: rule__Parafarmacia__Group__37__Impl : ( ( rule__Parafarmacia__CategoriasAssignment_37 )* ) ;
    public final void rule__Parafarmacia__Group__37__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:1494:1: ( ( ( rule__Parafarmacia__CategoriasAssignment_37 )* ) )
            // InternalGenerador.g:1495:1: ( ( rule__Parafarmacia__CategoriasAssignment_37 )* )
            {
            // InternalGenerador.g:1495:1: ( ( rule__Parafarmacia__CategoriasAssignment_37 )* )
            // InternalGenerador.g:1496:2: ( rule__Parafarmacia__CategoriasAssignment_37 )*
            {
             before(grammarAccess.getParafarmaciaAccess().getCategoriasAssignment_37()); 
            // InternalGenerador.g:1497:2: ( rule__Parafarmacia__CategoriasAssignment_37 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=11 && LA5_0<=15)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalGenerador.g:1497:3: rule__Parafarmacia__CategoriasAssignment_37
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Parafarmacia__CategoriasAssignment_37();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getParafarmaciaAccess().getCategoriasAssignment_37()); 

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
    // $ANTLR end "rule__Parafarmacia__Group__37__Impl"


    // $ANTLR start "rule__Parafarmacia__Group__38"
    // InternalGenerador.g:1505:1: rule__Parafarmacia__Group__38 : rule__Parafarmacia__Group__38__Impl rule__Parafarmacia__Group__39 ;
    public final void rule__Parafarmacia__Group__38() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:1509:1: ( rule__Parafarmacia__Group__38__Impl rule__Parafarmacia__Group__39 )
            // InternalGenerador.g:1510:2: rule__Parafarmacia__Group__38__Impl rule__Parafarmacia__Group__39
            {
            pushFollow(FOLLOW_4);
            rule__Parafarmacia__Group__38__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parafarmacia__Group__39();

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
    // $ANTLR end "rule__Parafarmacia__Group__38"


    // $ANTLR start "rule__Parafarmacia__Group__38__Impl"
    // InternalGenerador.g:1517:1: rule__Parafarmacia__Group__38__Impl : ( '>' ) ;
    public final void rule__Parafarmacia__Group__38__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:1521:1: ( ( '>' ) )
            // InternalGenerador.g:1522:1: ( '>' )
            {
            // InternalGenerador.g:1522:1: ( '>' )
            // InternalGenerador.g:1523:2: '>'
            {
             before(grammarAccess.getParafarmaciaAccess().getGreaterThanSignKeyword_38()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getParafarmaciaAccess().getGreaterThanSignKeyword_38()); 

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
    // $ANTLR end "rule__Parafarmacia__Group__38__Impl"


    // $ANTLR start "rule__Parafarmacia__Group__39"
    // InternalGenerador.g:1532:1: rule__Parafarmacia__Group__39 : rule__Parafarmacia__Group__39__Impl rule__Parafarmacia__Group__40 ;
    public final void rule__Parafarmacia__Group__39() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:1536:1: ( rule__Parafarmacia__Group__39__Impl rule__Parafarmacia__Group__40 )
            // InternalGenerador.g:1537:2: rule__Parafarmacia__Group__39__Impl rule__Parafarmacia__Group__40
            {
            pushFollow(FOLLOW_20);
            rule__Parafarmacia__Group__39__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parafarmacia__Group__40();

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
    // $ANTLR end "rule__Parafarmacia__Group__39"


    // $ANTLR start "rule__Parafarmacia__Group__39__Impl"
    // InternalGenerador.g:1544:1: rule__Parafarmacia__Group__39__Impl : ( '<' ) ;
    public final void rule__Parafarmacia__Group__39__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:1548:1: ( ( '<' ) )
            // InternalGenerador.g:1549:1: ( '<' )
            {
            // InternalGenerador.g:1549:1: ( '<' )
            // InternalGenerador.g:1550:2: '<'
            {
             before(grammarAccess.getParafarmaciaAccess().getLessThanSignKeyword_39()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getParafarmaciaAccess().getLessThanSignKeyword_39()); 

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
    // $ANTLR end "rule__Parafarmacia__Group__39__Impl"


    // $ANTLR start "rule__Parafarmacia__Group__40"
    // InternalGenerador.g:1559:1: rule__Parafarmacia__Group__40 : rule__Parafarmacia__Group__40__Impl rule__Parafarmacia__Group__41 ;
    public final void rule__Parafarmacia__Group__40() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:1563:1: ( rule__Parafarmacia__Group__40__Impl rule__Parafarmacia__Group__41 )
            // InternalGenerador.g:1564:2: rule__Parafarmacia__Group__40__Impl rule__Parafarmacia__Group__41
            {
            pushFollow(FOLLOW_6);
            rule__Parafarmacia__Group__40__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parafarmacia__Group__41();

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
    // $ANTLR end "rule__Parafarmacia__Group__40"


    // $ANTLR start "rule__Parafarmacia__Group__40__Impl"
    // InternalGenerador.g:1571:1: rule__Parafarmacia__Group__40__Impl : ( 'Productos' ) ;
    public final void rule__Parafarmacia__Group__40__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:1575:1: ( ( 'Productos' ) )
            // InternalGenerador.g:1576:1: ( 'Productos' )
            {
            // InternalGenerador.g:1576:1: ( 'Productos' )
            // InternalGenerador.g:1577:2: 'Productos'
            {
             before(grammarAccess.getParafarmaciaAccess().getProductosKeyword_40()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getParafarmaciaAccess().getProductosKeyword_40()); 

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
    // $ANTLR end "rule__Parafarmacia__Group__40__Impl"


    // $ANTLR start "rule__Parafarmacia__Group__41"
    // InternalGenerador.g:1586:1: rule__Parafarmacia__Group__41 : rule__Parafarmacia__Group__41__Impl rule__Parafarmacia__Group__42 ;
    public final void rule__Parafarmacia__Group__41() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:1590:1: ( rule__Parafarmacia__Group__41__Impl rule__Parafarmacia__Group__42 )
            // InternalGenerador.g:1591:2: rule__Parafarmacia__Group__41__Impl rule__Parafarmacia__Group__42
            {
            pushFollow(FOLLOW_13);
            rule__Parafarmacia__Group__41__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parafarmacia__Group__42();

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
    // $ANTLR end "rule__Parafarmacia__Group__41"


    // $ANTLR start "rule__Parafarmacia__Group__41__Impl"
    // InternalGenerador.g:1598:1: rule__Parafarmacia__Group__41__Impl : ( '=' ) ;
    public final void rule__Parafarmacia__Group__41__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:1602:1: ( ( '=' ) )
            // InternalGenerador.g:1603:1: ( '=' )
            {
            // InternalGenerador.g:1603:1: ( '=' )
            // InternalGenerador.g:1604:2: '='
            {
             before(grammarAccess.getParafarmaciaAccess().getEqualsSignKeyword_41()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getParafarmaciaAccess().getEqualsSignKeyword_41()); 

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
    // $ANTLR end "rule__Parafarmacia__Group__41__Impl"


    // $ANTLR start "rule__Parafarmacia__Group__42"
    // InternalGenerador.g:1613:1: rule__Parafarmacia__Group__42 : rule__Parafarmacia__Group__42__Impl rule__Parafarmacia__Group__43 ;
    public final void rule__Parafarmacia__Group__42() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:1617:1: ( rule__Parafarmacia__Group__42__Impl rule__Parafarmacia__Group__43 )
            // InternalGenerador.g:1618:2: rule__Parafarmacia__Group__42__Impl rule__Parafarmacia__Group__43
            {
            pushFollow(FOLLOW_21);
            rule__Parafarmacia__Group__42__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parafarmacia__Group__43();

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
    // $ANTLR end "rule__Parafarmacia__Group__42"


    // $ANTLR start "rule__Parafarmacia__Group__42__Impl"
    // InternalGenerador.g:1625:1: rule__Parafarmacia__Group__42__Impl : ( ( rule__Parafarmacia__NumProductosPorFilaAssignment_42 ) ) ;
    public final void rule__Parafarmacia__Group__42__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:1629:1: ( ( ( rule__Parafarmacia__NumProductosPorFilaAssignment_42 ) ) )
            // InternalGenerador.g:1630:1: ( ( rule__Parafarmacia__NumProductosPorFilaAssignment_42 ) )
            {
            // InternalGenerador.g:1630:1: ( ( rule__Parafarmacia__NumProductosPorFilaAssignment_42 ) )
            // InternalGenerador.g:1631:2: ( rule__Parafarmacia__NumProductosPorFilaAssignment_42 )
            {
             before(grammarAccess.getParafarmaciaAccess().getNumProductosPorFilaAssignment_42()); 
            // InternalGenerador.g:1632:2: ( rule__Parafarmacia__NumProductosPorFilaAssignment_42 )
            // InternalGenerador.g:1632:3: rule__Parafarmacia__NumProductosPorFilaAssignment_42
            {
            pushFollow(FOLLOW_2);
            rule__Parafarmacia__NumProductosPorFilaAssignment_42();

            state._fsp--;


            }

             after(grammarAccess.getParafarmaciaAccess().getNumProductosPorFilaAssignment_42()); 

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
    // $ANTLR end "rule__Parafarmacia__Group__42__Impl"


    // $ANTLR start "rule__Parafarmacia__Group__43"
    // InternalGenerador.g:1640:1: rule__Parafarmacia__Group__43 : rule__Parafarmacia__Group__43__Impl rule__Parafarmacia__Group__44 ;
    public final void rule__Parafarmacia__Group__43() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:1644:1: ( rule__Parafarmacia__Group__43__Impl rule__Parafarmacia__Group__44 )
            // InternalGenerador.g:1645:2: rule__Parafarmacia__Group__43__Impl rule__Parafarmacia__Group__44
            {
            pushFollow(FOLLOW_21);
            rule__Parafarmacia__Group__43__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parafarmacia__Group__44();

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
    // $ANTLR end "rule__Parafarmacia__Group__43"


    // $ANTLR start "rule__Parafarmacia__Group__43__Impl"
    // InternalGenerador.g:1652:1: rule__Parafarmacia__Group__43__Impl : ( ( rule__Parafarmacia__ProductosAssignment_43 )* ) ;
    public final void rule__Parafarmacia__Group__43__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:1656:1: ( ( ( rule__Parafarmacia__ProductosAssignment_43 )* ) )
            // InternalGenerador.g:1657:1: ( ( rule__Parafarmacia__ProductosAssignment_43 )* )
            {
            // InternalGenerador.g:1657:1: ( ( rule__Parafarmacia__ProductosAssignment_43 )* )
            // InternalGenerador.g:1658:2: ( rule__Parafarmacia__ProductosAssignment_43 )*
            {
             before(grammarAccess.getParafarmaciaAccess().getProductosAssignment_43()); 
            // InternalGenerador.g:1659:2: ( rule__Parafarmacia__ProductosAssignment_43 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==30) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalGenerador.g:1659:3: rule__Parafarmacia__ProductosAssignment_43
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__Parafarmacia__ProductosAssignment_43();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getParafarmaciaAccess().getProductosAssignment_43()); 

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
    // $ANTLR end "rule__Parafarmacia__Group__43__Impl"


    // $ANTLR start "rule__Parafarmacia__Group__44"
    // InternalGenerador.g:1667:1: rule__Parafarmacia__Group__44 : rule__Parafarmacia__Group__44__Impl rule__Parafarmacia__Group__45 ;
    public final void rule__Parafarmacia__Group__44() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:1671:1: ( rule__Parafarmacia__Group__44__Impl rule__Parafarmacia__Group__45 )
            // InternalGenerador.g:1672:2: rule__Parafarmacia__Group__44__Impl rule__Parafarmacia__Group__45
            {
            pushFollow(FOLLOW_4);
            rule__Parafarmacia__Group__44__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parafarmacia__Group__45();

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
    // $ANTLR end "rule__Parafarmacia__Group__44"


    // $ANTLR start "rule__Parafarmacia__Group__44__Impl"
    // InternalGenerador.g:1679:1: rule__Parafarmacia__Group__44__Impl : ( '>' ) ;
    public final void rule__Parafarmacia__Group__44__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:1683:1: ( ( '>' ) )
            // InternalGenerador.g:1684:1: ( '>' )
            {
            // InternalGenerador.g:1684:1: ( '>' )
            // InternalGenerador.g:1685:2: '>'
            {
             before(grammarAccess.getParafarmaciaAccess().getGreaterThanSignKeyword_44()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getParafarmaciaAccess().getGreaterThanSignKeyword_44()); 

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
    // $ANTLR end "rule__Parafarmacia__Group__44__Impl"


    // $ANTLR start "rule__Parafarmacia__Group__45"
    // InternalGenerador.g:1694:1: rule__Parafarmacia__Group__45 : rule__Parafarmacia__Group__45__Impl rule__Parafarmacia__Group__46 ;
    public final void rule__Parafarmacia__Group__45() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:1698:1: ( rule__Parafarmacia__Group__45__Impl rule__Parafarmacia__Group__46 )
            // InternalGenerador.g:1699:2: rule__Parafarmacia__Group__45__Impl rule__Parafarmacia__Group__46
            {
            pushFollow(FOLLOW_23);
            rule__Parafarmacia__Group__45__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parafarmacia__Group__46();

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
    // $ANTLR end "rule__Parafarmacia__Group__45"


    // $ANTLR start "rule__Parafarmacia__Group__45__Impl"
    // InternalGenerador.g:1706:1: rule__Parafarmacia__Group__45__Impl : ( '<' ) ;
    public final void rule__Parafarmacia__Group__45__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:1710:1: ( ( '<' ) )
            // InternalGenerador.g:1711:1: ( '<' )
            {
            // InternalGenerador.g:1711:1: ( '<' )
            // InternalGenerador.g:1712:2: '<'
            {
             before(grammarAccess.getParafarmaciaAccess().getLessThanSignKeyword_45()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getParafarmaciaAccess().getLessThanSignKeyword_45()); 

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
    // $ANTLR end "rule__Parafarmacia__Group__45__Impl"


    // $ANTLR start "rule__Parafarmacia__Group__46"
    // InternalGenerador.g:1721:1: rule__Parafarmacia__Group__46 : rule__Parafarmacia__Group__46__Impl rule__Parafarmacia__Group__47 ;
    public final void rule__Parafarmacia__Group__46() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:1725:1: ( rule__Parafarmacia__Group__46__Impl rule__Parafarmacia__Group__47 )
            // InternalGenerador.g:1726:2: rule__Parafarmacia__Group__46__Impl rule__Parafarmacia__Group__47
            {
            pushFollow(FOLLOW_6);
            rule__Parafarmacia__Group__46__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parafarmacia__Group__47();

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
    // $ANTLR end "rule__Parafarmacia__Group__46"


    // $ANTLR start "rule__Parafarmacia__Group__46__Impl"
    // InternalGenerador.g:1733:1: rule__Parafarmacia__Group__46__Impl : ( 'Usuario' ) ;
    public final void rule__Parafarmacia__Group__46__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:1737:1: ( ( 'Usuario' ) )
            // InternalGenerador.g:1738:1: ( 'Usuario' )
            {
            // InternalGenerador.g:1738:1: ( 'Usuario' )
            // InternalGenerador.g:1739:2: 'Usuario'
            {
             before(grammarAccess.getParafarmaciaAccess().getUsuarioKeyword_46()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getParafarmaciaAccess().getUsuarioKeyword_46()); 

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
    // $ANTLR end "rule__Parafarmacia__Group__46__Impl"


    // $ANTLR start "rule__Parafarmacia__Group__47"
    // InternalGenerador.g:1748:1: rule__Parafarmacia__Group__47 : rule__Parafarmacia__Group__47__Impl rule__Parafarmacia__Group__48 ;
    public final void rule__Parafarmacia__Group__47() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:1752:1: ( rule__Parafarmacia__Group__47__Impl rule__Parafarmacia__Group__48 )
            // InternalGenerador.g:1753:2: rule__Parafarmacia__Group__47__Impl rule__Parafarmacia__Group__48
            {
            pushFollow(FOLLOW_7);
            rule__Parafarmacia__Group__47__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parafarmacia__Group__48();

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
    // $ANTLR end "rule__Parafarmacia__Group__47"


    // $ANTLR start "rule__Parafarmacia__Group__47__Impl"
    // InternalGenerador.g:1760:1: rule__Parafarmacia__Group__47__Impl : ( '=' ) ;
    public final void rule__Parafarmacia__Group__47__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:1764:1: ( ( '=' ) )
            // InternalGenerador.g:1765:1: ( '=' )
            {
            // InternalGenerador.g:1765:1: ( '=' )
            // InternalGenerador.g:1766:2: '='
            {
             before(grammarAccess.getParafarmaciaAccess().getEqualsSignKeyword_47()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getParafarmaciaAccess().getEqualsSignKeyword_47()); 

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
    // $ANTLR end "rule__Parafarmacia__Group__47__Impl"


    // $ANTLR start "rule__Parafarmacia__Group__48"
    // InternalGenerador.g:1775:1: rule__Parafarmacia__Group__48 : rule__Parafarmacia__Group__48__Impl rule__Parafarmacia__Group__49 ;
    public final void rule__Parafarmacia__Group__48() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:1779:1: ( rule__Parafarmacia__Group__48__Impl rule__Parafarmacia__Group__49 )
            // InternalGenerador.g:1780:2: rule__Parafarmacia__Group__48__Impl rule__Parafarmacia__Group__49
            {
            pushFollow(FOLLOW_8);
            rule__Parafarmacia__Group__48__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parafarmacia__Group__49();

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
    // $ANTLR end "rule__Parafarmacia__Group__48"


    // $ANTLR start "rule__Parafarmacia__Group__48__Impl"
    // InternalGenerador.g:1787:1: rule__Parafarmacia__Group__48__Impl : ( ( rule__Parafarmacia__NombreUsuarioAssignment_48 ) ) ;
    public final void rule__Parafarmacia__Group__48__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:1791:1: ( ( ( rule__Parafarmacia__NombreUsuarioAssignment_48 ) ) )
            // InternalGenerador.g:1792:1: ( ( rule__Parafarmacia__NombreUsuarioAssignment_48 ) )
            {
            // InternalGenerador.g:1792:1: ( ( rule__Parafarmacia__NombreUsuarioAssignment_48 ) )
            // InternalGenerador.g:1793:2: ( rule__Parafarmacia__NombreUsuarioAssignment_48 )
            {
             before(grammarAccess.getParafarmaciaAccess().getNombreUsuarioAssignment_48()); 
            // InternalGenerador.g:1794:2: ( rule__Parafarmacia__NombreUsuarioAssignment_48 )
            // InternalGenerador.g:1794:3: rule__Parafarmacia__NombreUsuarioAssignment_48
            {
            pushFollow(FOLLOW_2);
            rule__Parafarmacia__NombreUsuarioAssignment_48();

            state._fsp--;


            }

             after(grammarAccess.getParafarmaciaAccess().getNombreUsuarioAssignment_48()); 

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
    // $ANTLR end "rule__Parafarmacia__Group__48__Impl"


    // $ANTLR start "rule__Parafarmacia__Group__49"
    // InternalGenerador.g:1802:1: rule__Parafarmacia__Group__49 : rule__Parafarmacia__Group__49__Impl rule__Parafarmacia__Group__50 ;
    public final void rule__Parafarmacia__Group__49() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:1806:1: ( rule__Parafarmacia__Group__49__Impl rule__Parafarmacia__Group__50 )
            // InternalGenerador.g:1807:2: rule__Parafarmacia__Group__49__Impl rule__Parafarmacia__Group__50
            {
            pushFollow(FOLLOW_12);
            rule__Parafarmacia__Group__49__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parafarmacia__Group__50();

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
    // $ANTLR end "rule__Parafarmacia__Group__49"


    // $ANTLR start "rule__Parafarmacia__Group__49__Impl"
    // InternalGenerador.g:1814:1: rule__Parafarmacia__Group__49__Impl : ( ':' ) ;
    public final void rule__Parafarmacia__Group__49__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:1818:1: ( ( ':' ) )
            // InternalGenerador.g:1819:1: ( ':' )
            {
            // InternalGenerador.g:1819:1: ( ':' )
            // InternalGenerador.g:1820:2: ':'
            {
             before(grammarAccess.getParafarmaciaAccess().getColonKeyword_49()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getParafarmaciaAccess().getColonKeyword_49()); 

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
    // $ANTLR end "rule__Parafarmacia__Group__49__Impl"


    // $ANTLR start "rule__Parafarmacia__Group__50"
    // InternalGenerador.g:1829:1: rule__Parafarmacia__Group__50 : rule__Parafarmacia__Group__50__Impl rule__Parafarmacia__Group__51 ;
    public final void rule__Parafarmacia__Group__50() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:1833:1: ( rule__Parafarmacia__Group__50__Impl rule__Parafarmacia__Group__51 )
            // InternalGenerador.g:1834:2: rule__Parafarmacia__Group__50__Impl rule__Parafarmacia__Group__51
            {
            pushFollow(FOLLOW_8);
            rule__Parafarmacia__Group__50__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parafarmacia__Group__51();

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
    // $ANTLR end "rule__Parafarmacia__Group__50"


    // $ANTLR start "rule__Parafarmacia__Group__50__Impl"
    // InternalGenerador.g:1841:1: rule__Parafarmacia__Group__50__Impl : ( ( rule__Parafarmacia__EmailAssignment_50 ) ) ;
    public final void rule__Parafarmacia__Group__50__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:1845:1: ( ( ( rule__Parafarmacia__EmailAssignment_50 ) ) )
            // InternalGenerador.g:1846:1: ( ( rule__Parafarmacia__EmailAssignment_50 ) )
            {
            // InternalGenerador.g:1846:1: ( ( rule__Parafarmacia__EmailAssignment_50 ) )
            // InternalGenerador.g:1847:2: ( rule__Parafarmacia__EmailAssignment_50 )
            {
             before(grammarAccess.getParafarmaciaAccess().getEmailAssignment_50()); 
            // InternalGenerador.g:1848:2: ( rule__Parafarmacia__EmailAssignment_50 )
            // InternalGenerador.g:1848:3: rule__Parafarmacia__EmailAssignment_50
            {
            pushFollow(FOLLOW_2);
            rule__Parafarmacia__EmailAssignment_50();

            state._fsp--;


            }

             after(grammarAccess.getParafarmaciaAccess().getEmailAssignment_50()); 

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
    // $ANTLR end "rule__Parafarmacia__Group__50__Impl"


    // $ANTLR start "rule__Parafarmacia__Group__51"
    // InternalGenerador.g:1856:1: rule__Parafarmacia__Group__51 : rule__Parafarmacia__Group__51__Impl rule__Parafarmacia__Group__52 ;
    public final void rule__Parafarmacia__Group__51() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:1860:1: ( rule__Parafarmacia__Group__51__Impl rule__Parafarmacia__Group__52 )
            // InternalGenerador.g:1861:2: rule__Parafarmacia__Group__51__Impl rule__Parafarmacia__Group__52
            {
            pushFollow(FOLLOW_7);
            rule__Parafarmacia__Group__51__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parafarmacia__Group__52();

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
    // $ANTLR end "rule__Parafarmacia__Group__51"


    // $ANTLR start "rule__Parafarmacia__Group__51__Impl"
    // InternalGenerador.g:1868:1: rule__Parafarmacia__Group__51__Impl : ( ':' ) ;
    public final void rule__Parafarmacia__Group__51__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:1872:1: ( ( ':' ) )
            // InternalGenerador.g:1873:1: ( ':' )
            {
            // InternalGenerador.g:1873:1: ( ':' )
            // InternalGenerador.g:1874:2: ':'
            {
             before(grammarAccess.getParafarmaciaAccess().getColonKeyword_51()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getParafarmaciaAccess().getColonKeyword_51()); 

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
    // $ANTLR end "rule__Parafarmacia__Group__51__Impl"


    // $ANTLR start "rule__Parafarmacia__Group__52"
    // InternalGenerador.g:1883:1: rule__Parafarmacia__Group__52 : rule__Parafarmacia__Group__52__Impl rule__Parafarmacia__Group__53 ;
    public final void rule__Parafarmacia__Group__52() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:1887:1: ( rule__Parafarmacia__Group__52__Impl rule__Parafarmacia__Group__53 )
            // InternalGenerador.g:1888:2: rule__Parafarmacia__Group__52__Impl rule__Parafarmacia__Group__53
            {
            pushFollow(FOLLOW_9);
            rule__Parafarmacia__Group__52__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parafarmacia__Group__53();

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
    // $ANTLR end "rule__Parafarmacia__Group__52"


    // $ANTLR start "rule__Parafarmacia__Group__52__Impl"
    // InternalGenerador.g:1895:1: rule__Parafarmacia__Group__52__Impl : ( ( rule__Parafarmacia__PasswordAssignment_52 ) ) ;
    public final void rule__Parafarmacia__Group__52__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:1899:1: ( ( ( rule__Parafarmacia__PasswordAssignment_52 ) ) )
            // InternalGenerador.g:1900:1: ( ( rule__Parafarmacia__PasswordAssignment_52 ) )
            {
            // InternalGenerador.g:1900:1: ( ( rule__Parafarmacia__PasswordAssignment_52 ) )
            // InternalGenerador.g:1901:2: ( rule__Parafarmacia__PasswordAssignment_52 )
            {
             before(grammarAccess.getParafarmaciaAccess().getPasswordAssignment_52()); 
            // InternalGenerador.g:1902:2: ( rule__Parafarmacia__PasswordAssignment_52 )
            // InternalGenerador.g:1902:3: rule__Parafarmacia__PasswordAssignment_52
            {
            pushFollow(FOLLOW_2);
            rule__Parafarmacia__PasswordAssignment_52();

            state._fsp--;


            }

             after(grammarAccess.getParafarmaciaAccess().getPasswordAssignment_52()); 

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
    // $ANTLR end "rule__Parafarmacia__Group__52__Impl"


    // $ANTLR start "rule__Parafarmacia__Group__53"
    // InternalGenerador.g:1910:1: rule__Parafarmacia__Group__53 : rule__Parafarmacia__Group__53__Impl rule__Parafarmacia__Group__54 ;
    public final void rule__Parafarmacia__Group__53() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:1914:1: ( rule__Parafarmacia__Group__53__Impl rule__Parafarmacia__Group__54 )
            // InternalGenerador.g:1915:2: rule__Parafarmacia__Group__53__Impl rule__Parafarmacia__Group__54
            {
            pushFollow(FOLLOW_24);
            rule__Parafarmacia__Group__53__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parafarmacia__Group__54();

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
    // $ANTLR end "rule__Parafarmacia__Group__53"


    // $ANTLR start "rule__Parafarmacia__Group__53__Impl"
    // InternalGenerador.g:1922:1: rule__Parafarmacia__Group__53__Impl : ( '>' ) ;
    public final void rule__Parafarmacia__Group__53__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:1926:1: ( ( '>' ) )
            // InternalGenerador.g:1927:1: ( '>' )
            {
            // InternalGenerador.g:1927:1: ( '>' )
            // InternalGenerador.g:1928:2: '>'
            {
             before(grammarAccess.getParafarmaciaAccess().getGreaterThanSignKeyword_53()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getParafarmaciaAccess().getGreaterThanSignKeyword_53()); 

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
    // $ANTLR end "rule__Parafarmacia__Group__53__Impl"


    // $ANTLR start "rule__Parafarmacia__Group__54"
    // InternalGenerador.g:1937:1: rule__Parafarmacia__Group__54 : rule__Parafarmacia__Group__54__Impl ;
    public final void rule__Parafarmacia__Group__54() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:1941:1: ( rule__Parafarmacia__Group__54__Impl )
            // InternalGenerador.g:1942:2: rule__Parafarmacia__Group__54__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parafarmacia__Group__54__Impl();

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
    // $ANTLR end "rule__Parafarmacia__Group__54"


    // $ANTLR start "rule__Parafarmacia__Group__54__Impl"
    // InternalGenerador.g:1948:1: rule__Parafarmacia__Group__54__Impl : ( '}' ) ;
    public final void rule__Parafarmacia__Group__54__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:1952:1: ( ( '}' ) )
            // InternalGenerador.g:1953:1: ( '}' )
            {
            // InternalGenerador.g:1953:1: ( '}' )
            // InternalGenerador.g:1954:2: '}'
            {
             before(grammarAccess.getParafarmaciaAccess().getRightCurlyBracketKeyword_54()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getParafarmaciaAccess().getRightCurlyBracketKeyword_54()); 

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
    // $ANTLR end "rule__Parafarmacia__Group__54__Impl"


    // $ANTLR start "rule__Apariencia__Group__0"
    // InternalGenerador.g:1964:1: rule__Apariencia__Group__0 : rule__Apariencia__Group__0__Impl rule__Apariencia__Group__1 ;
    public final void rule__Apariencia__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:1968:1: ( rule__Apariencia__Group__0__Impl rule__Apariencia__Group__1 )
            // InternalGenerador.g:1969:2: rule__Apariencia__Group__0__Impl rule__Apariencia__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__Apariencia__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Apariencia__Group__1();

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
    // $ANTLR end "rule__Apariencia__Group__0"


    // $ANTLR start "rule__Apariencia__Group__0__Impl"
    // InternalGenerador.g:1976:1: rule__Apariencia__Group__0__Impl : ( '[' ) ;
    public final void rule__Apariencia__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:1980:1: ( ( '[' ) )
            // InternalGenerador.g:1981:1: ( '[' )
            {
            // InternalGenerador.g:1981:1: ( '[' )
            // InternalGenerador.g:1982:2: '['
            {
             before(grammarAccess.getAparienciaAccess().getLeftSquareBracketKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getAparienciaAccess().getLeftSquareBracketKeyword_0()); 

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
    // $ANTLR end "rule__Apariencia__Group__0__Impl"


    // $ANTLR start "rule__Apariencia__Group__1"
    // InternalGenerador.g:1991:1: rule__Apariencia__Group__1 : rule__Apariencia__Group__1__Impl rule__Apariencia__Group__2 ;
    public final void rule__Apariencia__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:1995:1: ( rule__Apariencia__Group__1__Impl rule__Apariencia__Group__2 )
            // InternalGenerador.g:1996:2: rule__Apariencia__Group__1__Impl rule__Apariencia__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Apariencia__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Apariencia__Group__2();

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
    // $ANTLR end "rule__Apariencia__Group__1"


    // $ANTLR start "rule__Apariencia__Group__1__Impl"
    // InternalGenerador.g:2003:1: rule__Apariencia__Group__1__Impl : ( 'Color' ) ;
    public final void rule__Apariencia__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:2007:1: ( ( 'Color' ) )
            // InternalGenerador.g:2008:1: ( 'Color' )
            {
            // InternalGenerador.g:2008:1: ( 'Color' )
            // InternalGenerador.g:2009:2: 'Color'
            {
             before(grammarAccess.getAparienciaAccess().getColorKeyword_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getAparienciaAccess().getColorKeyword_1()); 

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
    // $ANTLR end "rule__Apariencia__Group__1__Impl"


    // $ANTLR start "rule__Apariencia__Group__2"
    // InternalGenerador.g:2018:1: rule__Apariencia__Group__2 : rule__Apariencia__Group__2__Impl rule__Apariencia__Group__3 ;
    public final void rule__Apariencia__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:2022:1: ( rule__Apariencia__Group__2__Impl rule__Apariencia__Group__3 )
            // InternalGenerador.g:2023:2: rule__Apariencia__Group__2__Impl rule__Apariencia__Group__3
            {
            pushFollow(FOLLOW_26);
            rule__Apariencia__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Apariencia__Group__3();

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
    // $ANTLR end "rule__Apariencia__Group__2"


    // $ANTLR start "rule__Apariencia__Group__2__Impl"
    // InternalGenerador.g:2030:1: rule__Apariencia__Group__2__Impl : ( '=' ) ;
    public final void rule__Apariencia__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:2034:1: ( ( '=' ) )
            // InternalGenerador.g:2035:1: ( '=' )
            {
            // InternalGenerador.g:2035:1: ( '=' )
            // InternalGenerador.g:2036:2: '='
            {
             before(grammarAccess.getAparienciaAccess().getEqualsSignKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getAparienciaAccess().getEqualsSignKeyword_2()); 

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
    // $ANTLR end "rule__Apariencia__Group__2__Impl"


    // $ANTLR start "rule__Apariencia__Group__3"
    // InternalGenerador.g:2045:1: rule__Apariencia__Group__3 : rule__Apariencia__Group__3__Impl rule__Apariencia__Group__4 ;
    public final void rule__Apariencia__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:2049:1: ( rule__Apariencia__Group__3__Impl rule__Apariencia__Group__4 )
            // InternalGenerador.g:2050:2: rule__Apariencia__Group__3__Impl rule__Apariencia__Group__4
            {
            pushFollow(FOLLOW_27);
            rule__Apariencia__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Apariencia__Group__4();

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
    // $ANTLR end "rule__Apariencia__Group__3"


    // $ANTLR start "rule__Apariencia__Group__3__Impl"
    // InternalGenerador.g:2057:1: rule__Apariencia__Group__3__Impl : ( 'principal' ) ;
    public final void rule__Apariencia__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:2061:1: ( ( 'principal' ) )
            // InternalGenerador.g:2062:1: ( 'principal' )
            {
            // InternalGenerador.g:2062:1: ( 'principal' )
            // InternalGenerador.g:2063:2: 'principal'
            {
             before(grammarAccess.getAparienciaAccess().getPrincipalKeyword_3()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getAparienciaAccess().getPrincipalKeyword_3()); 

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
    // $ANTLR end "rule__Apariencia__Group__3__Impl"


    // $ANTLR start "rule__Apariencia__Group__4"
    // InternalGenerador.g:2072:1: rule__Apariencia__Group__4 : rule__Apariencia__Group__4__Impl rule__Apariencia__Group__5 ;
    public final void rule__Apariencia__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:2076:1: ( rule__Apariencia__Group__4__Impl rule__Apariencia__Group__5 )
            // InternalGenerador.g:2077:2: rule__Apariencia__Group__4__Impl rule__Apariencia__Group__5
            {
            pushFollow(FOLLOW_28);
            rule__Apariencia__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Apariencia__Group__5();

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
    // $ANTLR end "rule__Apariencia__Group__4"


    // $ANTLR start "rule__Apariencia__Group__4__Impl"
    // InternalGenerador.g:2084:1: rule__Apariencia__Group__4__Impl : ( '.' ) ;
    public final void rule__Apariencia__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:2088:1: ( ( '.' ) )
            // InternalGenerador.g:2089:1: ( '.' )
            {
            // InternalGenerador.g:2089:1: ( '.' )
            // InternalGenerador.g:2090:2: '.'
            {
             before(grammarAccess.getAparienciaAccess().getFullStopKeyword_4()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getAparienciaAccess().getFullStopKeyword_4()); 

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
    // $ANTLR end "rule__Apariencia__Group__4__Impl"


    // $ANTLR start "rule__Apariencia__Group__5"
    // InternalGenerador.g:2099:1: rule__Apariencia__Group__5 : rule__Apariencia__Group__5__Impl rule__Apariencia__Group__6 ;
    public final void rule__Apariencia__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:2103:1: ( rule__Apariencia__Group__5__Impl rule__Apariencia__Group__6 )
            // InternalGenerador.g:2104:2: rule__Apariencia__Group__5__Impl rule__Apariencia__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__Apariencia__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Apariencia__Group__6();

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
    // $ANTLR end "rule__Apariencia__Group__5"


    // $ANTLR start "rule__Apariencia__Group__5__Impl"
    // InternalGenerador.g:2111:1: rule__Apariencia__Group__5__Impl : ( ( rule__Apariencia__PrincipalAssignment_5 ) ) ;
    public final void rule__Apariencia__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:2115:1: ( ( ( rule__Apariencia__PrincipalAssignment_5 ) ) )
            // InternalGenerador.g:2116:1: ( ( rule__Apariencia__PrincipalAssignment_5 ) )
            {
            // InternalGenerador.g:2116:1: ( ( rule__Apariencia__PrincipalAssignment_5 ) )
            // InternalGenerador.g:2117:2: ( rule__Apariencia__PrincipalAssignment_5 )
            {
             before(grammarAccess.getAparienciaAccess().getPrincipalAssignment_5()); 
            // InternalGenerador.g:2118:2: ( rule__Apariencia__PrincipalAssignment_5 )
            // InternalGenerador.g:2118:3: rule__Apariencia__PrincipalAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Apariencia__PrincipalAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getAparienciaAccess().getPrincipalAssignment_5()); 

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
    // $ANTLR end "rule__Apariencia__Group__5__Impl"


    // $ANTLR start "rule__Apariencia__Group__6"
    // InternalGenerador.g:2126:1: rule__Apariencia__Group__6 : rule__Apariencia__Group__6__Impl rule__Apariencia__Group__7 ;
    public final void rule__Apariencia__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:2130:1: ( rule__Apariencia__Group__6__Impl rule__Apariencia__Group__7 )
            // InternalGenerador.g:2131:2: rule__Apariencia__Group__6__Impl rule__Apariencia__Group__7
            {
            pushFollow(FOLLOW_29);
            rule__Apariencia__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Apariencia__Group__7();

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
    // $ANTLR end "rule__Apariencia__Group__6"


    // $ANTLR start "rule__Apariencia__Group__6__Impl"
    // InternalGenerador.g:2138:1: rule__Apariencia__Group__6__Impl : ( ':' ) ;
    public final void rule__Apariencia__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:2142:1: ( ( ':' ) )
            // InternalGenerador.g:2143:1: ( ':' )
            {
            // InternalGenerador.g:2143:1: ( ':' )
            // InternalGenerador.g:2144:2: ':'
            {
             before(grammarAccess.getAparienciaAccess().getColonKeyword_6()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getAparienciaAccess().getColonKeyword_6()); 

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
    // $ANTLR end "rule__Apariencia__Group__6__Impl"


    // $ANTLR start "rule__Apariencia__Group__7"
    // InternalGenerador.g:2153:1: rule__Apariencia__Group__7 : rule__Apariencia__Group__7__Impl rule__Apariencia__Group__8 ;
    public final void rule__Apariencia__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:2157:1: ( rule__Apariencia__Group__7__Impl rule__Apariencia__Group__8 )
            // InternalGenerador.g:2158:2: rule__Apariencia__Group__7__Impl rule__Apariencia__Group__8
            {
            pushFollow(FOLLOW_27);
            rule__Apariencia__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Apariencia__Group__8();

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
    // $ANTLR end "rule__Apariencia__Group__7"


    // $ANTLR start "rule__Apariencia__Group__7__Impl"
    // InternalGenerador.g:2165:1: rule__Apariencia__Group__7__Impl : ( 'principalClaro' ) ;
    public final void rule__Apariencia__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:2169:1: ( ( 'principalClaro' ) )
            // InternalGenerador.g:2170:1: ( 'principalClaro' )
            {
            // InternalGenerador.g:2170:1: ( 'principalClaro' )
            // InternalGenerador.g:2171:2: 'principalClaro'
            {
             before(grammarAccess.getAparienciaAccess().getPrincipalClaroKeyword_7()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getAparienciaAccess().getPrincipalClaroKeyword_7()); 

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
    // $ANTLR end "rule__Apariencia__Group__7__Impl"


    // $ANTLR start "rule__Apariencia__Group__8"
    // InternalGenerador.g:2180:1: rule__Apariencia__Group__8 : rule__Apariencia__Group__8__Impl rule__Apariencia__Group__9 ;
    public final void rule__Apariencia__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:2184:1: ( rule__Apariencia__Group__8__Impl rule__Apariencia__Group__9 )
            // InternalGenerador.g:2185:2: rule__Apariencia__Group__8__Impl rule__Apariencia__Group__9
            {
            pushFollow(FOLLOW_28);
            rule__Apariencia__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Apariencia__Group__9();

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
    // $ANTLR end "rule__Apariencia__Group__8"


    // $ANTLR start "rule__Apariencia__Group__8__Impl"
    // InternalGenerador.g:2192:1: rule__Apariencia__Group__8__Impl : ( '.' ) ;
    public final void rule__Apariencia__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:2196:1: ( ( '.' ) )
            // InternalGenerador.g:2197:1: ( '.' )
            {
            // InternalGenerador.g:2197:1: ( '.' )
            // InternalGenerador.g:2198:2: '.'
            {
             before(grammarAccess.getAparienciaAccess().getFullStopKeyword_8()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getAparienciaAccess().getFullStopKeyword_8()); 

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
    // $ANTLR end "rule__Apariencia__Group__8__Impl"


    // $ANTLR start "rule__Apariencia__Group__9"
    // InternalGenerador.g:2207:1: rule__Apariencia__Group__9 : rule__Apariencia__Group__9__Impl rule__Apariencia__Group__10 ;
    public final void rule__Apariencia__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:2211:1: ( rule__Apariencia__Group__9__Impl rule__Apariencia__Group__10 )
            // InternalGenerador.g:2212:2: rule__Apariencia__Group__9__Impl rule__Apariencia__Group__10
            {
            pushFollow(FOLLOW_8);
            rule__Apariencia__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Apariencia__Group__10();

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
    // $ANTLR end "rule__Apariencia__Group__9"


    // $ANTLR start "rule__Apariencia__Group__9__Impl"
    // InternalGenerador.g:2219:1: rule__Apariencia__Group__9__Impl : ( ( rule__Apariencia__PrincipalClaroAssignment_9 ) ) ;
    public final void rule__Apariencia__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:2223:1: ( ( ( rule__Apariencia__PrincipalClaroAssignment_9 ) ) )
            // InternalGenerador.g:2224:1: ( ( rule__Apariencia__PrincipalClaroAssignment_9 ) )
            {
            // InternalGenerador.g:2224:1: ( ( rule__Apariencia__PrincipalClaroAssignment_9 ) )
            // InternalGenerador.g:2225:2: ( rule__Apariencia__PrincipalClaroAssignment_9 )
            {
             before(grammarAccess.getAparienciaAccess().getPrincipalClaroAssignment_9()); 
            // InternalGenerador.g:2226:2: ( rule__Apariencia__PrincipalClaroAssignment_9 )
            // InternalGenerador.g:2226:3: rule__Apariencia__PrincipalClaroAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Apariencia__PrincipalClaroAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getAparienciaAccess().getPrincipalClaroAssignment_9()); 

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
    // $ANTLR end "rule__Apariencia__Group__9__Impl"


    // $ANTLR start "rule__Apariencia__Group__10"
    // InternalGenerador.g:2234:1: rule__Apariencia__Group__10 : rule__Apariencia__Group__10__Impl rule__Apariencia__Group__11 ;
    public final void rule__Apariencia__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:2238:1: ( rule__Apariencia__Group__10__Impl rule__Apariencia__Group__11 )
            // InternalGenerador.g:2239:2: rule__Apariencia__Group__10__Impl rule__Apariencia__Group__11
            {
            pushFollow(FOLLOW_30);
            rule__Apariencia__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Apariencia__Group__11();

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
    // $ANTLR end "rule__Apariencia__Group__10"


    // $ANTLR start "rule__Apariencia__Group__10__Impl"
    // InternalGenerador.g:2246:1: rule__Apariencia__Group__10__Impl : ( ':' ) ;
    public final void rule__Apariencia__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:2250:1: ( ( ':' ) )
            // InternalGenerador.g:2251:1: ( ':' )
            {
            // InternalGenerador.g:2251:1: ( ':' )
            // InternalGenerador.g:2252:2: ':'
            {
             before(grammarAccess.getAparienciaAccess().getColonKeyword_10()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getAparienciaAccess().getColonKeyword_10()); 

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
    // $ANTLR end "rule__Apariencia__Group__10__Impl"


    // $ANTLR start "rule__Apariencia__Group__11"
    // InternalGenerador.g:2261:1: rule__Apariencia__Group__11 : rule__Apariencia__Group__11__Impl rule__Apariencia__Group__12 ;
    public final void rule__Apariencia__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:2265:1: ( rule__Apariencia__Group__11__Impl rule__Apariencia__Group__12 )
            // InternalGenerador.g:2266:2: rule__Apariencia__Group__11__Impl rule__Apariencia__Group__12
            {
            pushFollow(FOLLOW_27);
            rule__Apariencia__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Apariencia__Group__12();

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
    // $ANTLR end "rule__Apariencia__Group__11"


    // $ANTLR start "rule__Apariencia__Group__11__Impl"
    // InternalGenerador.g:2273:1: rule__Apariencia__Group__11__Impl : ( 'secundario' ) ;
    public final void rule__Apariencia__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:2277:1: ( ( 'secundario' ) )
            // InternalGenerador.g:2278:1: ( 'secundario' )
            {
            // InternalGenerador.g:2278:1: ( 'secundario' )
            // InternalGenerador.g:2279:2: 'secundario'
            {
             before(grammarAccess.getAparienciaAccess().getSecundarioKeyword_11()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getAparienciaAccess().getSecundarioKeyword_11()); 

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
    // $ANTLR end "rule__Apariencia__Group__11__Impl"


    // $ANTLR start "rule__Apariencia__Group__12"
    // InternalGenerador.g:2288:1: rule__Apariencia__Group__12 : rule__Apariencia__Group__12__Impl rule__Apariencia__Group__13 ;
    public final void rule__Apariencia__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:2292:1: ( rule__Apariencia__Group__12__Impl rule__Apariencia__Group__13 )
            // InternalGenerador.g:2293:2: rule__Apariencia__Group__12__Impl rule__Apariencia__Group__13
            {
            pushFollow(FOLLOW_28);
            rule__Apariencia__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Apariencia__Group__13();

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
    // $ANTLR end "rule__Apariencia__Group__12"


    // $ANTLR start "rule__Apariencia__Group__12__Impl"
    // InternalGenerador.g:2300:1: rule__Apariencia__Group__12__Impl : ( '.' ) ;
    public final void rule__Apariencia__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:2304:1: ( ( '.' ) )
            // InternalGenerador.g:2305:1: ( '.' )
            {
            // InternalGenerador.g:2305:1: ( '.' )
            // InternalGenerador.g:2306:2: '.'
            {
             before(grammarAccess.getAparienciaAccess().getFullStopKeyword_12()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getAparienciaAccess().getFullStopKeyword_12()); 

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
    // $ANTLR end "rule__Apariencia__Group__12__Impl"


    // $ANTLR start "rule__Apariencia__Group__13"
    // InternalGenerador.g:2315:1: rule__Apariencia__Group__13 : rule__Apariencia__Group__13__Impl rule__Apariencia__Group__14 ;
    public final void rule__Apariencia__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:2319:1: ( rule__Apariencia__Group__13__Impl rule__Apariencia__Group__14 )
            // InternalGenerador.g:2320:2: rule__Apariencia__Group__13__Impl rule__Apariencia__Group__14
            {
            pushFollow(FOLLOW_8);
            rule__Apariencia__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Apariencia__Group__14();

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
    // $ANTLR end "rule__Apariencia__Group__13"


    // $ANTLR start "rule__Apariencia__Group__13__Impl"
    // InternalGenerador.g:2327:1: rule__Apariencia__Group__13__Impl : ( ( rule__Apariencia__SecundarioAssignment_13 ) ) ;
    public final void rule__Apariencia__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:2331:1: ( ( ( rule__Apariencia__SecundarioAssignment_13 ) ) )
            // InternalGenerador.g:2332:1: ( ( rule__Apariencia__SecundarioAssignment_13 ) )
            {
            // InternalGenerador.g:2332:1: ( ( rule__Apariencia__SecundarioAssignment_13 ) )
            // InternalGenerador.g:2333:2: ( rule__Apariencia__SecundarioAssignment_13 )
            {
             before(grammarAccess.getAparienciaAccess().getSecundarioAssignment_13()); 
            // InternalGenerador.g:2334:2: ( rule__Apariencia__SecundarioAssignment_13 )
            // InternalGenerador.g:2334:3: rule__Apariencia__SecundarioAssignment_13
            {
            pushFollow(FOLLOW_2);
            rule__Apariencia__SecundarioAssignment_13();

            state._fsp--;


            }

             after(grammarAccess.getAparienciaAccess().getSecundarioAssignment_13()); 

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
    // $ANTLR end "rule__Apariencia__Group__13__Impl"


    // $ANTLR start "rule__Apariencia__Group__14"
    // InternalGenerador.g:2342:1: rule__Apariencia__Group__14 : rule__Apariencia__Group__14__Impl rule__Apariencia__Group__15 ;
    public final void rule__Apariencia__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:2346:1: ( rule__Apariencia__Group__14__Impl rule__Apariencia__Group__15 )
            // InternalGenerador.g:2347:2: rule__Apariencia__Group__14__Impl rule__Apariencia__Group__15
            {
            pushFollow(FOLLOW_31);
            rule__Apariencia__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Apariencia__Group__15();

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
    // $ANTLR end "rule__Apariencia__Group__14"


    // $ANTLR start "rule__Apariencia__Group__14__Impl"
    // InternalGenerador.g:2354:1: rule__Apariencia__Group__14__Impl : ( ':' ) ;
    public final void rule__Apariencia__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:2358:1: ( ( ':' ) )
            // InternalGenerador.g:2359:1: ( ':' )
            {
            // InternalGenerador.g:2359:1: ( ':' )
            // InternalGenerador.g:2360:2: ':'
            {
             before(grammarAccess.getAparienciaAccess().getColonKeyword_14()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getAparienciaAccess().getColonKeyword_14()); 

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
    // $ANTLR end "rule__Apariencia__Group__14__Impl"


    // $ANTLR start "rule__Apariencia__Group__15"
    // InternalGenerador.g:2369:1: rule__Apariencia__Group__15 : rule__Apariencia__Group__15__Impl rule__Apariencia__Group__16 ;
    public final void rule__Apariencia__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:2373:1: ( rule__Apariencia__Group__15__Impl rule__Apariencia__Group__16 )
            // InternalGenerador.g:2374:2: rule__Apariencia__Group__15__Impl rule__Apariencia__Group__16
            {
            pushFollow(FOLLOW_27);
            rule__Apariencia__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Apariencia__Group__16();

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
    // $ANTLR end "rule__Apariencia__Group__15"


    // $ANTLR start "rule__Apariencia__Group__15__Impl"
    // InternalGenerador.g:2381:1: rule__Apariencia__Group__15__Impl : ( 'fondo' ) ;
    public final void rule__Apariencia__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:2385:1: ( ( 'fondo' ) )
            // InternalGenerador.g:2386:1: ( 'fondo' )
            {
            // InternalGenerador.g:2386:1: ( 'fondo' )
            // InternalGenerador.g:2387:2: 'fondo'
            {
             before(grammarAccess.getAparienciaAccess().getFondoKeyword_15()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getAparienciaAccess().getFondoKeyword_15()); 

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
    // $ANTLR end "rule__Apariencia__Group__15__Impl"


    // $ANTLR start "rule__Apariencia__Group__16"
    // InternalGenerador.g:2396:1: rule__Apariencia__Group__16 : rule__Apariencia__Group__16__Impl rule__Apariencia__Group__17 ;
    public final void rule__Apariencia__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:2400:1: ( rule__Apariencia__Group__16__Impl rule__Apariencia__Group__17 )
            // InternalGenerador.g:2401:2: rule__Apariencia__Group__16__Impl rule__Apariencia__Group__17
            {
            pushFollow(FOLLOW_28);
            rule__Apariencia__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Apariencia__Group__17();

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
    // $ANTLR end "rule__Apariencia__Group__16"


    // $ANTLR start "rule__Apariencia__Group__16__Impl"
    // InternalGenerador.g:2408:1: rule__Apariencia__Group__16__Impl : ( '.' ) ;
    public final void rule__Apariencia__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:2412:1: ( ( '.' ) )
            // InternalGenerador.g:2413:1: ( '.' )
            {
            // InternalGenerador.g:2413:1: ( '.' )
            // InternalGenerador.g:2414:2: '.'
            {
             before(grammarAccess.getAparienciaAccess().getFullStopKeyword_16()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getAparienciaAccess().getFullStopKeyword_16()); 

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
    // $ANTLR end "rule__Apariencia__Group__16__Impl"


    // $ANTLR start "rule__Apariencia__Group__17"
    // InternalGenerador.g:2423:1: rule__Apariencia__Group__17 : rule__Apariencia__Group__17__Impl rule__Apariencia__Group__18 ;
    public final void rule__Apariencia__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:2427:1: ( rule__Apariencia__Group__17__Impl rule__Apariencia__Group__18 )
            // InternalGenerador.g:2428:2: rule__Apariencia__Group__17__Impl rule__Apariencia__Group__18
            {
            pushFollow(FOLLOW_8);
            rule__Apariencia__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Apariencia__Group__18();

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
    // $ANTLR end "rule__Apariencia__Group__17"


    // $ANTLR start "rule__Apariencia__Group__17__Impl"
    // InternalGenerador.g:2435:1: rule__Apariencia__Group__17__Impl : ( ( rule__Apariencia__FondoAssignment_17 ) ) ;
    public final void rule__Apariencia__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:2439:1: ( ( ( rule__Apariencia__FondoAssignment_17 ) ) )
            // InternalGenerador.g:2440:1: ( ( rule__Apariencia__FondoAssignment_17 ) )
            {
            // InternalGenerador.g:2440:1: ( ( rule__Apariencia__FondoAssignment_17 ) )
            // InternalGenerador.g:2441:2: ( rule__Apariencia__FondoAssignment_17 )
            {
             before(grammarAccess.getAparienciaAccess().getFondoAssignment_17()); 
            // InternalGenerador.g:2442:2: ( rule__Apariencia__FondoAssignment_17 )
            // InternalGenerador.g:2442:3: rule__Apariencia__FondoAssignment_17
            {
            pushFollow(FOLLOW_2);
            rule__Apariencia__FondoAssignment_17();

            state._fsp--;


            }

             after(grammarAccess.getAparienciaAccess().getFondoAssignment_17()); 

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
    // $ANTLR end "rule__Apariencia__Group__17__Impl"


    // $ANTLR start "rule__Apariencia__Group__18"
    // InternalGenerador.g:2450:1: rule__Apariencia__Group__18 : rule__Apariencia__Group__18__Impl rule__Apariencia__Group__19 ;
    public final void rule__Apariencia__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:2454:1: ( rule__Apariencia__Group__18__Impl rule__Apariencia__Group__19 )
            // InternalGenerador.g:2455:2: rule__Apariencia__Group__18__Impl rule__Apariencia__Group__19
            {
            pushFollow(FOLLOW_32);
            rule__Apariencia__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Apariencia__Group__19();

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
    // $ANTLR end "rule__Apariencia__Group__18"


    // $ANTLR start "rule__Apariencia__Group__18__Impl"
    // InternalGenerador.g:2462:1: rule__Apariencia__Group__18__Impl : ( ':' ) ;
    public final void rule__Apariencia__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:2466:1: ( ( ':' ) )
            // InternalGenerador.g:2467:1: ( ':' )
            {
            // InternalGenerador.g:2467:1: ( ':' )
            // InternalGenerador.g:2468:2: ':'
            {
             before(grammarAccess.getAparienciaAccess().getColonKeyword_18()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getAparienciaAccess().getColonKeyword_18()); 

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
    // $ANTLR end "rule__Apariencia__Group__18__Impl"


    // $ANTLR start "rule__Apariencia__Group__19"
    // InternalGenerador.g:2477:1: rule__Apariencia__Group__19 : rule__Apariencia__Group__19__Impl rule__Apariencia__Group__20 ;
    public final void rule__Apariencia__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:2481:1: ( rule__Apariencia__Group__19__Impl rule__Apariencia__Group__20 )
            // InternalGenerador.g:2482:2: rule__Apariencia__Group__19__Impl rule__Apariencia__Group__20
            {
            pushFollow(FOLLOW_27);
            rule__Apariencia__Group__19__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Apariencia__Group__20();

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
    // $ANTLR end "rule__Apariencia__Group__19"


    // $ANTLR start "rule__Apariencia__Group__19__Impl"
    // InternalGenerador.g:2489:1: rule__Apariencia__Group__19__Impl : ( 'fondoProductos' ) ;
    public final void rule__Apariencia__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:2493:1: ( ( 'fondoProductos' ) )
            // InternalGenerador.g:2494:1: ( 'fondoProductos' )
            {
            // InternalGenerador.g:2494:1: ( 'fondoProductos' )
            // InternalGenerador.g:2495:2: 'fondoProductos'
            {
             before(grammarAccess.getAparienciaAccess().getFondoProductosKeyword_19()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getAparienciaAccess().getFondoProductosKeyword_19()); 

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
    // $ANTLR end "rule__Apariencia__Group__19__Impl"


    // $ANTLR start "rule__Apariencia__Group__20"
    // InternalGenerador.g:2504:1: rule__Apariencia__Group__20 : rule__Apariencia__Group__20__Impl rule__Apariencia__Group__21 ;
    public final void rule__Apariencia__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:2508:1: ( rule__Apariencia__Group__20__Impl rule__Apariencia__Group__21 )
            // InternalGenerador.g:2509:2: rule__Apariencia__Group__20__Impl rule__Apariencia__Group__21
            {
            pushFollow(FOLLOW_28);
            rule__Apariencia__Group__20__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Apariencia__Group__21();

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
    // $ANTLR end "rule__Apariencia__Group__20"


    // $ANTLR start "rule__Apariencia__Group__20__Impl"
    // InternalGenerador.g:2516:1: rule__Apariencia__Group__20__Impl : ( '.' ) ;
    public final void rule__Apariencia__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:2520:1: ( ( '.' ) )
            // InternalGenerador.g:2521:1: ( '.' )
            {
            // InternalGenerador.g:2521:1: ( '.' )
            // InternalGenerador.g:2522:2: '.'
            {
             before(grammarAccess.getAparienciaAccess().getFullStopKeyword_20()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getAparienciaAccess().getFullStopKeyword_20()); 

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
    // $ANTLR end "rule__Apariencia__Group__20__Impl"


    // $ANTLR start "rule__Apariencia__Group__21"
    // InternalGenerador.g:2531:1: rule__Apariencia__Group__21 : rule__Apariencia__Group__21__Impl rule__Apariencia__Group__22 ;
    public final void rule__Apariencia__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:2535:1: ( rule__Apariencia__Group__21__Impl rule__Apariencia__Group__22 )
            // InternalGenerador.g:2536:2: rule__Apariencia__Group__21__Impl rule__Apariencia__Group__22
            {
            pushFollow(FOLLOW_8);
            rule__Apariencia__Group__21__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Apariencia__Group__22();

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
    // $ANTLR end "rule__Apariencia__Group__21"


    // $ANTLR start "rule__Apariencia__Group__21__Impl"
    // InternalGenerador.g:2543:1: rule__Apariencia__Group__21__Impl : ( ( rule__Apariencia__FondoProductosAssignment_21 ) ) ;
    public final void rule__Apariencia__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:2547:1: ( ( ( rule__Apariencia__FondoProductosAssignment_21 ) ) )
            // InternalGenerador.g:2548:1: ( ( rule__Apariencia__FondoProductosAssignment_21 ) )
            {
            // InternalGenerador.g:2548:1: ( ( rule__Apariencia__FondoProductosAssignment_21 ) )
            // InternalGenerador.g:2549:2: ( rule__Apariencia__FondoProductosAssignment_21 )
            {
             before(grammarAccess.getAparienciaAccess().getFondoProductosAssignment_21()); 
            // InternalGenerador.g:2550:2: ( rule__Apariencia__FondoProductosAssignment_21 )
            // InternalGenerador.g:2550:3: rule__Apariencia__FondoProductosAssignment_21
            {
            pushFollow(FOLLOW_2);
            rule__Apariencia__FondoProductosAssignment_21();

            state._fsp--;


            }

             after(grammarAccess.getAparienciaAccess().getFondoProductosAssignment_21()); 

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
    // $ANTLR end "rule__Apariencia__Group__21__Impl"


    // $ANTLR start "rule__Apariencia__Group__22"
    // InternalGenerador.g:2558:1: rule__Apariencia__Group__22 : rule__Apariencia__Group__22__Impl rule__Apariencia__Group__23 ;
    public final void rule__Apariencia__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:2562:1: ( rule__Apariencia__Group__22__Impl rule__Apariencia__Group__23 )
            // InternalGenerador.g:2563:2: rule__Apariencia__Group__22__Impl rule__Apariencia__Group__23
            {
            pushFollow(FOLLOW_33);
            rule__Apariencia__Group__22__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Apariencia__Group__23();

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
    // $ANTLR end "rule__Apariencia__Group__22"


    // $ANTLR start "rule__Apariencia__Group__22__Impl"
    // InternalGenerador.g:2570:1: rule__Apariencia__Group__22__Impl : ( ':' ) ;
    public final void rule__Apariencia__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:2574:1: ( ( ':' ) )
            // InternalGenerador.g:2575:1: ( ':' )
            {
            // InternalGenerador.g:2575:1: ( ':' )
            // InternalGenerador.g:2576:2: ':'
            {
             before(grammarAccess.getAparienciaAccess().getColonKeyword_22()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getAparienciaAccess().getColonKeyword_22()); 

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
    // $ANTLR end "rule__Apariencia__Group__22__Impl"


    // $ANTLR start "rule__Apariencia__Group__23"
    // InternalGenerador.g:2585:1: rule__Apariencia__Group__23 : rule__Apariencia__Group__23__Impl rule__Apariencia__Group__24 ;
    public final void rule__Apariencia__Group__23() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:2589:1: ( rule__Apariencia__Group__23__Impl rule__Apariencia__Group__24 )
            // InternalGenerador.g:2590:2: rule__Apariencia__Group__23__Impl rule__Apariencia__Group__24
            {
            pushFollow(FOLLOW_27);
            rule__Apariencia__Group__23__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Apariencia__Group__24();

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
    // $ANTLR end "rule__Apariencia__Group__23"


    // $ANTLR start "rule__Apariencia__Group__23__Impl"
    // InternalGenerador.g:2597:1: rule__Apariencia__Group__23__Impl : ( 'precios' ) ;
    public final void rule__Apariencia__Group__23__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:2601:1: ( ( 'precios' ) )
            // InternalGenerador.g:2602:1: ( 'precios' )
            {
            // InternalGenerador.g:2602:1: ( 'precios' )
            // InternalGenerador.g:2603:2: 'precios'
            {
             before(grammarAccess.getAparienciaAccess().getPreciosKeyword_23()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getAparienciaAccess().getPreciosKeyword_23()); 

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
    // $ANTLR end "rule__Apariencia__Group__23__Impl"


    // $ANTLR start "rule__Apariencia__Group__24"
    // InternalGenerador.g:2612:1: rule__Apariencia__Group__24 : rule__Apariencia__Group__24__Impl rule__Apariencia__Group__25 ;
    public final void rule__Apariencia__Group__24() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:2616:1: ( rule__Apariencia__Group__24__Impl rule__Apariencia__Group__25 )
            // InternalGenerador.g:2617:2: rule__Apariencia__Group__24__Impl rule__Apariencia__Group__25
            {
            pushFollow(FOLLOW_28);
            rule__Apariencia__Group__24__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Apariencia__Group__25();

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
    // $ANTLR end "rule__Apariencia__Group__24"


    // $ANTLR start "rule__Apariencia__Group__24__Impl"
    // InternalGenerador.g:2624:1: rule__Apariencia__Group__24__Impl : ( '.' ) ;
    public final void rule__Apariencia__Group__24__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:2628:1: ( ( '.' ) )
            // InternalGenerador.g:2629:1: ( '.' )
            {
            // InternalGenerador.g:2629:1: ( '.' )
            // InternalGenerador.g:2630:2: '.'
            {
             before(grammarAccess.getAparienciaAccess().getFullStopKeyword_24()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getAparienciaAccess().getFullStopKeyword_24()); 

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
    // $ANTLR end "rule__Apariencia__Group__24__Impl"


    // $ANTLR start "rule__Apariencia__Group__25"
    // InternalGenerador.g:2639:1: rule__Apariencia__Group__25 : rule__Apariencia__Group__25__Impl rule__Apariencia__Group__26 ;
    public final void rule__Apariencia__Group__25() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:2643:1: ( rule__Apariencia__Group__25__Impl rule__Apariencia__Group__26 )
            // InternalGenerador.g:2644:2: rule__Apariencia__Group__25__Impl rule__Apariencia__Group__26
            {
            pushFollow(FOLLOW_8);
            rule__Apariencia__Group__25__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Apariencia__Group__26();

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
    // $ANTLR end "rule__Apariencia__Group__25"


    // $ANTLR start "rule__Apariencia__Group__25__Impl"
    // InternalGenerador.g:2651:1: rule__Apariencia__Group__25__Impl : ( ( rule__Apariencia__PreciosAssignment_25 ) ) ;
    public final void rule__Apariencia__Group__25__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:2655:1: ( ( ( rule__Apariencia__PreciosAssignment_25 ) ) )
            // InternalGenerador.g:2656:1: ( ( rule__Apariencia__PreciosAssignment_25 ) )
            {
            // InternalGenerador.g:2656:1: ( ( rule__Apariencia__PreciosAssignment_25 ) )
            // InternalGenerador.g:2657:2: ( rule__Apariencia__PreciosAssignment_25 )
            {
             before(grammarAccess.getAparienciaAccess().getPreciosAssignment_25()); 
            // InternalGenerador.g:2658:2: ( rule__Apariencia__PreciosAssignment_25 )
            // InternalGenerador.g:2658:3: rule__Apariencia__PreciosAssignment_25
            {
            pushFollow(FOLLOW_2);
            rule__Apariencia__PreciosAssignment_25();

            state._fsp--;


            }

             after(grammarAccess.getAparienciaAccess().getPreciosAssignment_25()); 

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
    // $ANTLR end "rule__Apariencia__Group__25__Impl"


    // $ANTLR start "rule__Apariencia__Group__26"
    // InternalGenerador.g:2666:1: rule__Apariencia__Group__26 : rule__Apariencia__Group__26__Impl rule__Apariencia__Group__27 ;
    public final void rule__Apariencia__Group__26() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:2670:1: ( rule__Apariencia__Group__26__Impl rule__Apariencia__Group__27 )
            // InternalGenerador.g:2671:2: rule__Apariencia__Group__26__Impl rule__Apariencia__Group__27
            {
            pushFollow(FOLLOW_34);
            rule__Apariencia__Group__26__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Apariencia__Group__27();

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
    // $ANTLR end "rule__Apariencia__Group__26"


    // $ANTLR start "rule__Apariencia__Group__26__Impl"
    // InternalGenerador.g:2678:1: rule__Apariencia__Group__26__Impl : ( ':' ) ;
    public final void rule__Apariencia__Group__26__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:2682:1: ( ( ':' ) )
            // InternalGenerador.g:2683:1: ( ':' )
            {
            // InternalGenerador.g:2683:1: ( ':' )
            // InternalGenerador.g:2684:2: ':'
            {
             before(grammarAccess.getAparienciaAccess().getColonKeyword_26()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getAparienciaAccess().getColonKeyword_26()); 

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
    // $ANTLR end "rule__Apariencia__Group__26__Impl"


    // $ANTLR start "rule__Apariencia__Group__27"
    // InternalGenerador.g:2693:1: rule__Apariencia__Group__27 : rule__Apariencia__Group__27__Impl rule__Apariencia__Group__28 ;
    public final void rule__Apariencia__Group__27() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:2697:1: ( rule__Apariencia__Group__27__Impl rule__Apariencia__Group__28 )
            // InternalGenerador.g:2698:2: rule__Apariencia__Group__27__Impl rule__Apariencia__Group__28
            {
            pushFollow(FOLLOW_27);
            rule__Apariencia__Group__27__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Apariencia__Group__28();

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
    // $ANTLR end "rule__Apariencia__Group__27"


    // $ANTLR start "rule__Apariencia__Group__27__Impl"
    // InternalGenerador.g:2705:1: rule__Apariencia__Group__27__Impl : ( 'texto' ) ;
    public final void rule__Apariencia__Group__27__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:2709:1: ( ( 'texto' ) )
            // InternalGenerador.g:2710:1: ( 'texto' )
            {
            // InternalGenerador.g:2710:1: ( 'texto' )
            // InternalGenerador.g:2711:2: 'texto'
            {
             before(grammarAccess.getAparienciaAccess().getTextoKeyword_27()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getAparienciaAccess().getTextoKeyword_27()); 

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
    // $ANTLR end "rule__Apariencia__Group__27__Impl"


    // $ANTLR start "rule__Apariencia__Group__28"
    // InternalGenerador.g:2720:1: rule__Apariencia__Group__28 : rule__Apariencia__Group__28__Impl rule__Apariencia__Group__29 ;
    public final void rule__Apariencia__Group__28() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:2724:1: ( rule__Apariencia__Group__28__Impl rule__Apariencia__Group__29 )
            // InternalGenerador.g:2725:2: rule__Apariencia__Group__28__Impl rule__Apariencia__Group__29
            {
            pushFollow(FOLLOW_28);
            rule__Apariencia__Group__28__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Apariencia__Group__29();

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
    // $ANTLR end "rule__Apariencia__Group__28"


    // $ANTLR start "rule__Apariencia__Group__28__Impl"
    // InternalGenerador.g:2732:1: rule__Apariencia__Group__28__Impl : ( '.' ) ;
    public final void rule__Apariencia__Group__28__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:2736:1: ( ( '.' ) )
            // InternalGenerador.g:2737:1: ( '.' )
            {
            // InternalGenerador.g:2737:1: ( '.' )
            // InternalGenerador.g:2738:2: '.'
            {
             before(grammarAccess.getAparienciaAccess().getFullStopKeyword_28()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getAparienciaAccess().getFullStopKeyword_28()); 

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
    // $ANTLR end "rule__Apariencia__Group__28__Impl"


    // $ANTLR start "rule__Apariencia__Group__29"
    // InternalGenerador.g:2747:1: rule__Apariencia__Group__29 : rule__Apariencia__Group__29__Impl rule__Apariencia__Group__30 ;
    public final void rule__Apariencia__Group__29() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:2751:1: ( rule__Apariencia__Group__29__Impl rule__Apariencia__Group__30 )
            // InternalGenerador.g:2752:2: rule__Apariencia__Group__29__Impl rule__Apariencia__Group__30
            {
            pushFollow(FOLLOW_8);
            rule__Apariencia__Group__29__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Apariencia__Group__30();

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
    // $ANTLR end "rule__Apariencia__Group__29"


    // $ANTLR start "rule__Apariencia__Group__29__Impl"
    // InternalGenerador.g:2759:1: rule__Apariencia__Group__29__Impl : ( ( rule__Apariencia__TextoAssignment_29 ) ) ;
    public final void rule__Apariencia__Group__29__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:2763:1: ( ( ( rule__Apariencia__TextoAssignment_29 ) ) )
            // InternalGenerador.g:2764:1: ( ( rule__Apariencia__TextoAssignment_29 ) )
            {
            // InternalGenerador.g:2764:1: ( ( rule__Apariencia__TextoAssignment_29 ) )
            // InternalGenerador.g:2765:2: ( rule__Apariencia__TextoAssignment_29 )
            {
             before(grammarAccess.getAparienciaAccess().getTextoAssignment_29()); 
            // InternalGenerador.g:2766:2: ( rule__Apariencia__TextoAssignment_29 )
            // InternalGenerador.g:2766:3: rule__Apariencia__TextoAssignment_29
            {
            pushFollow(FOLLOW_2);
            rule__Apariencia__TextoAssignment_29();

            state._fsp--;


            }

             after(grammarAccess.getAparienciaAccess().getTextoAssignment_29()); 

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
    // $ANTLR end "rule__Apariencia__Group__29__Impl"


    // $ANTLR start "rule__Apariencia__Group__30"
    // InternalGenerador.g:2774:1: rule__Apariencia__Group__30 : rule__Apariencia__Group__30__Impl rule__Apariencia__Group__31 ;
    public final void rule__Apariencia__Group__30() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:2778:1: ( rule__Apariencia__Group__30__Impl rule__Apariencia__Group__31 )
            // InternalGenerador.g:2779:2: rule__Apariencia__Group__30__Impl rule__Apariencia__Group__31
            {
            pushFollow(FOLLOW_35);
            rule__Apariencia__Group__30__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Apariencia__Group__31();

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
    // $ANTLR end "rule__Apariencia__Group__30"


    // $ANTLR start "rule__Apariencia__Group__30__Impl"
    // InternalGenerador.g:2786:1: rule__Apariencia__Group__30__Impl : ( ':' ) ;
    public final void rule__Apariencia__Group__30__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:2790:1: ( ( ':' ) )
            // InternalGenerador.g:2791:1: ( ':' )
            {
            // InternalGenerador.g:2791:1: ( ':' )
            // InternalGenerador.g:2792:2: ':'
            {
             before(grammarAccess.getAparienciaAccess().getColonKeyword_30()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getAparienciaAccess().getColonKeyword_30()); 

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
    // $ANTLR end "rule__Apariencia__Group__30__Impl"


    // $ANTLR start "rule__Apariencia__Group__31"
    // InternalGenerador.g:2801:1: rule__Apariencia__Group__31 : rule__Apariencia__Group__31__Impl rule__Apariencia__Group__32 ;
    public final void rule__Apariencia__Group__31() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:2805:1: ( rule__Apariencia__Group__31__Impl rule__Apariencia__Group__32 )
            // InternalGenerador.g:2806:2: rule__Apariencia__Group__31__Impl rule__Apariencia__Group__32
            {
            pushFollow(FOLLOW_27);
            rule__Apariencia__Group__31__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Apariencia__Group__32();

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
    // $ANTLR end "rule__Apariencia__Group__31"


    // $ANTLR start "rule__Apariencia__Group__31__Impl"
    // InternalGenerador.g:2813:1: rule__Apariencia__Group__31__Impl : ( 'titulo' ) ;
    public final void rule__Apariencia__Group__31__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:2817:1: ( ( 'titulo' ) )
            // InternalGenerador.g:2818:1: ( 'titulo' )
            {
            // InternalGenerador.g:2818:1: ( 'titulo' )
            // InternalGenerador.g:2819:2: 'titulo'
            {
             before(grammarAccess.getAparienciaAccess().getTituloKeyword_31()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getAparienciaAccess().getTituloKeyword_31()); 

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
    // $ANTLR end "rule__Apariencia__Group__31__Impl"


    // $ANTLR start "rule__Apariencia__Group__32"
    // InternalGenerador.g:2828:1: rule__Apariencia__Group__32 : rule__Apariencia__Group__32__Impl rule__Apariencia__Group__33 ;
    public final void rule__Apariencia__Group__32() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:2832:1: ( rule__Apariencia__Group__32__Impl rule__Apariencia__Group__33 )
            // InternalGenerador.g:2833:2: rule__Apariencia__Group__32__Impl rule__Apariencia__Group__33
            {
            pushFollow(FOLLOW_28);
            rule__Apariencia__Group__32__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Apariencia__Group__33();

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
    // $ANTLR end "rule__Apariencia__Group__32"


    // $ANTLR start "rule__Apariencia__Group__32__Impl"
    // InternalGenerador.g:2840:1: rule__Apariencia__Group__32__Impl : ( '.' ) ;
    public final void rule__Apariencia__Group__32__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:2844:1: ( ( '.' ) )
            // InternalGenerador.g:2845:1: ( '.' )
            {
            // InternalGenerador.g:2845:1: ( '.' )
            // InternalGenerador.g:2846:2: '.'
            {
             before(grammarAccess.getAparienciaAccess().getFullStopKeyword_32()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getAparienciaAccess().getFullStopKeyword_32()); 

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
    // $ANTLR end "rule__Apariencia__Group__32__Impl"


    // $ANTLR start "rule__Apariencia__Group__33"
    // InternalGenerador.g:2855:1: rule__Apariencia__Group__33 : rule__Apariencia__Group__33__Impl rule__Apariencia__Group__34 ;
    public final void rule__Apariencia__Group__33() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:2859:1: ( rule__Apariencia__Group__33__Impl rule__Apariencia__Group__34 )
            // InternalGenerador.g:2860:2: rule__Apariencia__Group__33__Impl rule__Apariencia__Group__34
            {
            pushFollow(FOLLOW_36);
            rule__Apariencia__Group__33__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Apariencia__Group__34();

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
    // $ANTLR end "rule__Apariencia__Group__33"


    // $ANTLR start "rule__Apariencia__Group__33__Impl"
    // InternalGenerador.g:2867:1: rule__Apariencia__Group__33__Impl : ( ( rule__Apariencia__TituloColorAssignment_33 ) ) ;
    public final void rule__Apariencia__Group__33__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:2871:1: ( ( ( rule__Apariencia__TituloColorAssignment_33 ) ) )
            // InternalGenerador.g:2872:1: ( ( rule__Apariencia__TituloColorAssignment_33 ) )
            {
            // InternalGenerador.g:2872:1: ( ( rule__Apariencia__TituloColorAssignment_33 ) )
            // InternalGenerador.g:2873:2: ( rule__Apariencia__TituloColorAssignment_33 )
            {
             before(grammarAccess.getAparienciaAccess().getTituloColorAssignment_33()); 
            // InternalGenerador.g:2874:2: ( rule__Apariencia__TituloColorAssignment_33 )
            // InternalGenerador.g:2874:3: rule__Apariencia__TituloColorAssignment_33
            {
            pushFollow(FOLLOW_2);
            rule__Apariencia__TituloColorAssignment_33();

            state._fsp--;


            }

             after(grammarAccess.getAparienciaAccess().getTituloColorAssignment_33()); 

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
    // $ANTLR end "rule__Apariencia__Group__33__Impl"


    // $ANTLR start "rule__Apariencia__Group__34"
    // InternalGenerador.g:2882:1: rule__Apariencia__Group__34 : rule__Apariencia__Group__34__Impl rule__Apariencia__Group__35 ;
    public final void rule__Apariencia__Group__34() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:2886:1: ( rule__Apariencia__Group__34__Impl rule__Apariencia__Group__35 )
            // InternalGenerador.g:2887:2: rule__Apariencia__Group__34__Impl rule__Apariencia__Group__35
            {
            pushFollow(FOLLOW_11);
            rule__Apariencia__Group__34__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Apariencia__Group__35();

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
    // $ANTLR end "rule__Apariencia__Group__34"


    // $ANTLR start "rule__Apariencia__Group__34__Impl"
    // InternalGenerador.g:2894:1: rule__Apariencia__Group__34__Impl : ( ']' ) ;
    public final void rule__Apariencia__Group__34__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:2898:1: ( ( ']' ) )
            // InternalGenerador.g:2899:1: ( ']' )
            {
            // InternalGenerador.g:2899:1: ( ']' )
            // InternalGenerador.g:2900:2: ']'
            {
             before(grammarAccess.getAparienciaAccess().getRightSquareBracketKeyword_34()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getAparienciaAccess().getRightSquareBracketKeyword_34()); 

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
    // $ANTLR end "rule__Apariencia__Group__34__Impl"


    // $ANTLR start "rule__Apariencia__Group__35"
    // InternalGenerador.g:2909:1: rule__Apariencia__Group__35 : rule__Apariencia__Group__35__Impl rule__Apariencia__Group__36 ;
    public final void rule__Apariencia__Group__35() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:2913:1: ( rule__Apariencia__Group__35__Impl rule__Apariencia__Group__36 )
            // InternalGenerador.g:2914:2: rule__Apariencia__Group__35__Impl rule__Apariencia__Group__36
            {
            pushFollow(FOLLOW_37);
            rule__Apariencia__Group__35__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Apariencia__Group__36();

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
    // $ANTLR end "rule__Apariencia__Group__35"


    // $ANTLR start "rule__Apariencia__Group__35__Impl"
    // InternalGenerador.g:2921:1: rule__Apariencia__Group__35__Impl : ( '[' ) ;
    public final void rule__Apariencia__Group__35__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:2925:1: ( ( '[' ) )
            // InternalGenerador.g:2926:1: ( '[' )
            {
            // InternalGenerador.g:2926:1: ( '[' )
            // InternalGenerador.g:2927:2: '['
            {
             before(grammarAccess.getAparienciaAccess().getLeftSquareBracketKeyword_35()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getAparienciaAccess().getLeftSquareBracketKeyword_35()); 

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
    // $ANTLR end "rule__Apariencia__Group__35__Impl"


    // $ANTLR start "rule__Apariencia__Group__36"
    // InternalGenerador.g:2936:1: rule__Apariencia__Group__36 : rule__Apariencia__Group__36__Impl rule__Apariencia__Group__37 ;
    public final void rule__Apariencia__Group__36() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:2940:1: ( rule__Apariencia__Group__36__Impl rule__Apariencia__Group__37 )
            // InternalGenerador.g:2941:2: rule__Apariencia__Group__36__Impl rule__Apariencia__Group__37
            {
            pushFollow(FOLLOW_6);
            rule__Apariencia__Group__36__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Apariencia__Group__37();

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
    // $ANTLR end "rule__Apariencia__Group__36"


    // $ANTLR start "rule__Apariencia__Group__36__Impl"
    // InternalGenerador.g:2948:1: rule__Apariencia__Group__36__Impl : ( 'Texto' ) ;
    public final void rule__Apariencia__Group__36__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:2952:1: ( ( 'Texto' ) )
            // InternalGenerador.g:2953:1: ( 'Texto' )
            {
            // InternalGenerador.g:2953:1: ( 'Texto' )
            // InternalGenerador.g:2954:2: 'Texto'
            {
             before(grammarAccess.getAparienciaAccess().getTextoKeyword_36()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getAparienciaAccess().getTextoKeyword_36()); 

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
    // $ANTLR end "rule__Apariencia__Group__36__Impl"


    // $ANTLR start "rule__Apariencia__Group__37"
    // InternalGenerador.g:2963:1: rule__Apariencia__Group__37 : rule__Apariencia__Group__37__Impl rule__Apariencia__Group__38 ;
    public final void rule__Apariencia__Group__37() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:2967:1: ( rule__Apariencia__Group__37__Impl rule__Apariencia__Group__38 )
            // InternalGenerador.g:2968:2: rule__Apariencia__Group__37__Impl rule__Apariencia__Group__38
            {
            pushFollow(FOLLOW_38);
            rule__Apariencia__Group__37__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Apariencia__Group__38();

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
    // $ANTLR end "rule__Apariencia__Group__37"


    // $ANTLR start "rule__Apariencia__Group__37__Impl"
    // InternalGenerador.g:2975:1: rule__Apariencia__Group__37__Impl : ( '=' ) ;
    public final void rule__Apariencia__Group__37__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:2979:1: ( ( '=' ) )
            // InternalGenerador.g:2980:1: ( '=' )
            {
            // InternalGenerador.g:2980:1: ( '=' )
            // InternalGenerador.g:2981:2: '='
            {
             before(grammarAccess.getAparienciaAccess().getEqualsSignKeyword_37()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getAparienciaAccess().getEqualsSignKeyword_37()); 

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
    // $ANTLR end "rule__Apariencia__Group__37__Impl"


    // $ANTLR start "rule__Apariencia__Group__38"
    // InternalGenerador.g:2990:1: rule__Apariencia__Group__38 : rule__Apariencia__Group__38__Impl rule__Apariencia__Group__39 ;
    public final void rule__Apariencia__Group__38() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:2994:1: ( rule__Apariencia__Group__38__Impl rule__Apariencia__Group__39 )
            // InternalGenerador.g:2995:2: rule__Apariencia__Group__38__Impl rule__Apariencia__Group__39
            {
            pushFollow(FOLLOW_27);
            rule__Apariencia__Group__38__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Apariencia__Group__39();

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
    // $ANTLR end "rule__Apariencia__Group__38"


    // $ANTLR start "rule__Apariencia__Group__38__Impl"
    // InternalGenerador.g:3002:1: rule__Apariencia__Group__38__Impl : ( 'normal' ) ;
    public final void rule__Apariencia__Group__38__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:3006:1: ( ( 'normal' ) )
            // InternalGenerador.g:3007:1: ( 'normal' )
            {
            // InternalGenerador.g:3007:1: ( 'normal' )
            // InternalGenerador.g:3008:2: 'normal'
            {
             before(grammarAccess.getAparienciaAccess().getNormalKeyword_38()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getAparienciaAccess().getNormalKeyword_38()); 

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
    // $ANTLR end "rule__Apariencia__Group__38__Impl"


    // $ANTLR start "rule__Apariencia__Group__39"
    // InternalGenerador.g:3017:1: rule__Apariencia__Group__39 : rule__Apariencia__Group__39__Impl rule__Apariencia__Group__40 ;
    public final void rule__Apariencia__Group__39() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:3021:1: ( rule__Apariencia__Group__39__Impl rule__Apariencia__Group__40 )
            // InternalGenerador.g:3022:2: rule__Apariencia__Group__39__Impl rule__Apariencia__Group__40
            {
            pushFollow(FOLLOW_13);
            rule__Apariencia__Group__39__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Apariencia__Group__40();

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
    // $ANTLR end "rule__Apariencia__Group__39"


    // $ANTLR start "rule__Apariencia__Group__39__Impl"
    // InternalGenerador.g:3029:1: rule__Apariencia__Group__39__Impl : ( '.' ) ;
    public final void rule__Apariencia__Group__39__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:3033:1: ( ( '.' ) )
            // InternalGenerador.g:3034:1: ( '.' )
            {
            // InternalGenerador.g:3034:1: ( '.' )
            // InternalGenerador.g:3035:2: '.'
            {
             before(grammarAccess.getAparienciaAccess().getFullStopKeyword_39()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getAparienciaAccess().getFullStopKeyword_39()); 

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
    // $ANTLR end "rule__Apariencia__Group__39__Impl"


    // $ANTLR start "rule__Apariencia__Group__40"
    // InternalGenerador.g:3044:1: rule__Apariencia__Group__40 : rule__Apariencia__Group__40__Impl rule__Apariencia__Group__41 ;
    public final void rule__Apariencia__Group__40() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:3048:1: ( rule__Apariencia__Group__40__Impl rule__Apariencia__Group__41 )
            // InternalGenerador.g:3049:2: rule__Apariencia__Group__40__Impl rule__Apariencia__Group__41
            {
            pushFollow(FOLLOW_8);
            rule__Apariencia__Group__40__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Apariencia__Group__41();

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
    // $ANTLR end "rule__Apariencia__Group__40"


    // $ANTLR start "rule__Apariencia__Group__40__Impl"
    // InternalGenerador.g:3056:1: rule__Apariencia__Group__40__Impl : ( ( rule__Apariencia__NormalAssignment_40 ) ) ;
    public final void rule__Apariencia__Group__40__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:3060:1: ( ( ( rule__Apariencia__NormalAssignment_40 ) ) )
            // InternalGenerador.g:3061:1: ( ( rule__Apariencia__NormalAssignment_40 ) )
            {
            // InternalGenerador.g:3061:1: ( ( rule__Apariencia__NormalAssignment_40 ) )
            // InternalGenerador.g:3062:2: ( rule__Apariencia__NormalAssignment_40 )
            {
             before(grammarAccess.getAparienciaAccess().getNormalAssignment_40()); 
            // InternalGenerador.g:3063:2: ( rule__Apariencia__NormalAssignment_40 )
            // InternalGenerador.g:3063:3: rule__Apariencia__NormalAssignment_40
            {
            pushFollow(FOLLOW_2);
            rule__Apariencia__NormalAssignment_40();

            state._fsp--;


            }

             after(grammarAccess.getAparienciaAccess().getNormalAssignment_40()); 

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
    // $ANTLR end "rule__Apariencia__Group__40__Impl"


    // $ANTLR start "rule__Apariencia__Group__41"
    // InternalGenerador.g:3071:1: rule__Apariencia__Group__41 : rule__Apariencia__Group__41__Impl rule__Apariencia__Group__42 ;
    public final void rule__Apariencia__Group__41() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:3075:1: ( rule__Apariencia__Group__41__Impl rule__Apariencia__Group__42 )
            // InternalGenerador.g:3076:2: rule__Apariencia__Group__41__Impl rule__Apariencia__Group__42
            {
            pushFollow(FOLLOW_39);
            rule__Apariencia__Group__41__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Apariencia__Group__42();

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
    // $ANTLR end "rule__Apariencia__Group__41"


    // $ANTLR start "rule__Apariencia__Group__41__Impl"
    // InternalGenerador.g:3083:1: rule__Apariencia__Group__41__Impl : ( ':' ) ;
    public final void rule__Apariencia__Group__41__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:3087:1: ( ( ':' ) )
            // InternalGenerador.g:3088:1: ( ':' )
            {
            // InternalGenerador.g:3088:1: ( ':' )
            // InternalGenerador.g:3089:2: ':'
            {
             before(grammarAccess.getAparienciaAccess().getColonKeyword_41()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getAparienciaAccess().getColonKeyword_41()); 

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
    // $ANTLR end "rule__Apariencia__Group__41__Impl"


    // $ANTLR start "rule__Apariencia__Group__42"
    // InternalGenerador.g:3098:1: rule__Apariencia__Group__42 : rule__Apariencia__Group__42__Impl rule__Apariencia__Group__43 ;
    public final void rule__Apariencia__Group__42() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:3102:1: ( rule__Apariencia__Group__42__Impl rule__Apariencia__Group__43 )
            // InternalGenerador.g:3103:2: rule__Apariencia__Group__42__Impl rule__Apariencia__Group__43
            {
            pushFollow(FOLLOW_27);
            rule__Apariencia__Group__42__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Apariencia__Group__43();

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
    // $ANTLR end "rule__Apariencia__Group__42"


    // $ANTLR start "rule__Apariencia__Group__42__Impl"
    // InternalGenerador.g:3110:1: rule__Apariencia__Group__42__Impl : ( 'grande' ) ;
    public final void rule__Apariencia__Group__42__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:3114:1: ( ( 'grande' ) )
            // InternalGenerador.g:3115:1: ( 'grande' )
            {
            // InternalGenerador.g:3115:1: ( 'grande' )
            // InternalGenerador.g:3116:2: 'grande'
            {
             before(grammarAccess.getAparienciaAccess().getGrandeKeyword_42()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getAparienciaAccess().getGrandeKeyword_42()); 

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
    // $ANTLR end "rule__Apariencia__Group__42__Impl"


    // $ANTLR start "rule__Apariencia__Group__43"
    // InternalGenerador.g:3125:1: rule__Apariencia__Group__43 : rule__Apariencia__Group__43__Impl rule__Apariencia__Group__44 ;
    public final void rule__Apariencia__Group__43() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:3129:1: ( rule__Apariencia__Group__43__Impl rule__Apariencia__Group__44 )
            // InternalGenerador.g:3130:2: rule__Apariencia__Group__43__Impl rule__Apariencia__Group__44
            {
            pushFollow(FOLLOW_13);
            rule__Apariencia__Group__43__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Apariencia__Group__44();

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
    // $ANTLR end "rule__Apariencia__Group__43"


    // $ANTLR start "rule__Apariencia__Group__43__Impl"
    // InternalGenerador.g:3137:1: rule__Apariencia__Group__43__Impl : ( '.' ) ;
    public final void rule__Apariencia__Group__43__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:3141:1: ( ( '.' ) )
            // InternalGenerador.g:3142:1: ( '.' )
            {
            // InternalGenerador.g:3142:1: ( '.' )
            // InternalGenerador.g:3143:2: '.'
            {
             before(grammarAccess.getAparienciaAccess().getFullStopKeyword_43()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getAparienciaAccess().getFullStopKeyword_43()); 

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
    // $ANTLR end "rule__Apariencia__Group__43__Impl"


    // $ANTLR start "rule__Apariencia__Group__44"
    // InternalGenerador.g:3152:1: rule__Apariencia__Group__44 : rule__Apariencia__Group__44__Impl rule__Apariencia__Group__45 ;
    public final void rule__Apariencia__Group__44() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:3156:1: ( rule__Apariencia__Group__44__Impl rule__Apariencia__Group__45 )
            // InternalGenerador.g:3157:2: rule__Apariencia__Group__44__Impl rule__Apariencia__Group__45
            {
            pushFollow(FOLLOW_8);
            rule__Apariencia__Group__44__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Apariencia__Group__45();

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
    // $ANTLR end "rule__Apariencia__Group__44"


    // $ANTLR start "rule__Apariencia__Group__44__Impl"
    // InternalGenerador.g:3164:1: rule__Apariencia__Group__44__Impl : ( ( rule__Apariencia__GrandeAssignment_44 ) ) ;
    public final void rule__Apariencia__Group__44__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:3168:1: ( ( ( rule__Apariencia__GrandeAssignment_44 ) ) )
            // InternalGenerador.g:3169:1: ( ( rule__Apariencia__GrandeAssignment_44 ) )
            {
            // InternalGenerador.g:3169:1: ( ( rule__Apariencia__GrandeAssignment_44 ) )
            // InternalGenerador.g:3170:2: ( rule__Apariencia__GrandeAssignment_44 )
            {
             before(grammarAccess.getAparienciaAccess().getGrandeAssignment_44()); 
            // InternalGenerador.g:3171:2: ( rule__Apariencia__GrandeAssignment_44 )
            // InternalGenerador.g:3171:3: rule__Apariencia__GrandeAssignment_44
            {
            pushFollow(FOLLOW_2);
            rule__Apariencia__GrandeAssignment_44();

            state._fsp--;


            }

             after(grammarAccess.getAparienciaAccess().getGrandeAssignment_44()); 

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
    // $ANTLR end "rule__Apariencia__Group__44__Impl"


    // $ANTLR start "rule__Apariencia__Group__45"
    // InternalGenerador.g:3179:1: rule__Apariencia__Group__45 : rule__Apariencia__Group__45__Impl rule__Apariencia__Group__46 ;
    public final void rule__Apariencia__Group__45() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:3183:1: ( rule__Apariencia__Group__45__Impl rule__Apariencia__Group__46 )
            // InternalGenerador.g:3184:2: rule__Apariencia__Group__45__Impl rule__Apariencia__Group__46
            {
            pushFollow(FOLLOW_35);
            rule__Apariencia__Group__45__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Apariencia__Group__46();

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
    // $ANTLR end "rule__Apariencia__Group__45"


    // $ANTLR start "rule__Apariencia__Group__45__Impl"
    // InternalGenerador.g:3191:1: rule__Apariencia__Group__45__Impl : ( ':' ) ;
    public final void rule__Apariencia__Group__45__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:3195:1: ( ( ':' ) )
            // InternalGenerador.g:3196:1: ( ':' )
            {
            // InternalGenerador.g:3196:1: ( ':' )
            // InternalGenerador.g:3197:2: ':'
            {
             before(grammarAccess.getAparienciaAccess().getColonKeyword_45()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getAparienciaAccess().getColonKeyword_45()); 

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
    // $ANTLR end "rule__Apariencia__Group__45__Impl"


    // $ANTLR start "rule__Apariencia__Group__46"
    // InternalGenerador.g:3206:1: rule__Apariencia__Group__46 : rule__Apariencia__Group__46__Impl rule__Apariencia__Group__47 ;
    public final void rule__Apariencia__Group__46() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:3210:1: ( rule__Apariencia__Group__46__Impl rule__Apariencia__Group__47 )
            // InternalGenerador.g:3211:2: rule__Apariencia__Group__46__Impl rule__Apariencia__Group__47
            {
            pushFollow(FOLLOW_27);
            rule__Apariencia__Group__46__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Apariencia__Group__47();

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
    // $ANTLR end "rule__Apariencia__Group__46"


    // $ANTLR start "rule__Apariencia__Group__46__Impl"
    // InternalGenerador.g:3218:1: rule__Apariencia__Group__46__Impl : ( 'titulo' ) ;
    public final void rule__Apariencia__Group__46__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:3222:1: ( ( 'titulo' ) )
            // InternalGenerador.g:3223:1: ( 'titulo' )
            {
            // InternalGenerador.g:3223:1: ( 'titulo' )
            // InternalGenerador.g:3224:2: 'titulo'
            {
             before(grammarAccess.getAparienciaAccess().getTituloKeyword_46()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getAparienciaAccess().getTituloKeyword_46()); 

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
    // $ANTLR end "rule__Apariencia__Group__46__Impl"


    // $ANTLR start "rule__Apariencia__Group__47"
    // InternalGenerador.g:3233:1: rule__Apariencia__Group__47 : rule__Apariencia__Group__47__Impl rule__Apariencia__Group__48 ;
    public final void rule__Apariencia__Group__47() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:3237:1: ( rule__Apariencia__Group__47__Impl rule__Apariencia__Group__48 )
            // InternalGenerador.g:3238:2: rule__Apariencia__Group__47__Impl rule__Apariencia__Group__48
            {
            pushFollow(FOLLOW_13);
            rule__Apariencia__Group__47__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Apariencia__Group__48();

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
    // $ANTLR end "rule__Apariencia__Group__47"


    // $ANTLR start "rule__Apariencia__Group__47__Impl"
    // InternalGenerador.g:3245:1: rule__Apariencia__Group__47__Impl : ( '.' ) ;
    public final void rule__Apariencia__Group__47__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:3249:1: ( ( '.' ) )
            // InternalGenerador.g:3250:1: ( '.' )
            {
            // InternalGenerador.g:3250:1: ( '.' )
            // InternalGenerador.g:3251:2: '.'
            {
             before(grammarAccess.getAparienciaAccess().getFullStopKeyword_47()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getAparienciaAccess().getFullStopKeyword_47()); 

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
    // $ANTLR end "rule__Apariencia__Group__47__Impl"


    // $ANTLR start "rule__Apariencia__Group__48"
    // InternalGenerador.g:3260:1: rule__Apariencia__Group__48 : rule__Apariencia__Group__48__Impl rule__Apariencia__Group__49 ;
    public final void rule__Apariencia__Group__48() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:3264:1: ( rule__Apariencia__Group__48__Impl rule__Apariencia__Group__49 )
            // InternalGenerador.g:3265:2: rule__Apariencia__Group__48__Impl rule__Apariencia__Group__49
            {
            pushFollow(FOLLOW_8);
            rule__Apariencia__Group__48__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Apariencia__Group__49();

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
    // $ANTLR end "rule__Apariencia__Group__48"


    // $ANTLR start "rule__Apariencia__Group__48__Impl"
    // InternalGenerador.g:3272:1: rule__Apariencia__Group__48__Impl : ( ( rule__Apariencia__TituloAssignment_48 ) ) ;
    public final void rule__Apariencia__Group__48__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:3276:1: ( ( ( rule__Apariencia__TituloAssignment_48 ) ) )
            // InternalGenerador.g:3277:1: ( ( rule__Apariencia__TituloAssignment_48 ) )
            {
            // InternalGenerador.g:3277:1: ( ( rule__Apariencia__TituloAssignment_48 ) )
            // InternalGenerador.g:3278:2: ( rule__Apariencia__TituloAssignment_48 )
            {
             before(grammarAccess.getAparienciaAccess().getTituloAssignment_48()); 
            // InternalGenerador.g:3279:2: ( rule__Apariencia__TituloAssignment_48 )
            // InternalGenerador.g:3279:3: rule__Apariencia__TituloAssignment_48
            {
            pushFollow(FOLLOW_2);
            rule__Apariencia__TituloAssignment_48();

            state._fsp--;


            }

             after(grammarAccess.getAparienciaAccess().getTituloAssignment_48()); 

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
    // $ANTLR end "rule__Apariencia__Group__48__Impl"


    // $ANTLR start "rule__Apariencia__Group__49"
    // InternalGenerador.g:3287:1: rule__Apariencia__Group__49 : rule__Apariencia__Group__49__Impl rule__Apariencia__Group__50 ;
    public final void rule__Apariencia__Group__49() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:3291:1: ( rule__Apariencia__Group__49__Impl rule__Apariencia__Group__50 )
            // InternalGenerador.g:3292:2: rule__Apariencia__Group__49__Impl rule__Apariencia__Group__50
            {
            pushFollow(FOLLOW_40);
            rule__Apariencia__Group__49__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Apariencia__Group__50();

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
    // $ANTLR end "rule__Apariencia__Group__49"


    // $ANTLR start "rule__Apariencia__Group__49__Impl"
    // InternalGenerador.g:3299:1: rule__Apariencia__Group__49__Impl : ( ':' ) ;
    public final void rule__Apariencia__Group__49__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:3303:1: ( ( ':' ) )
            // InternalGenerador.g:3304:1: ( ':' )
            {
            // InternalGenerador.g:3304:1: ( ':' )
            // InternalGenerador.g:3305:2: ':'
            {
             before(grammarAccess.getAparienciaAccess().getColonKeyword_49()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getAparienciaAccess().getColonKeyword_49()); 

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
    // $ANTLR end "rule__Apariencia__Group__49__Impl"


    // $ANTLR start "rule__Apariencia__Group__50"
    // InternalGenerador.g:3314:1: rule__Apariencia__Group__50 : rule__Apariencia__Group__50__Impl rule__Apariencia__Group__51 ;
    public final void rule__Apariencia__Group__50() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:3318:1: ( rule__Apariencia__Group__50__Impl rule__Apariencia__Group__51 )
            // InternalGenerador.g:3319:2: rule__Apariencia__Group__50__Impl rule__Apariencia__Group__51
            {
            pushFollow(FOLLOW_27);
            rule__Apariencia__Group__50__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Apariencia__Group__51();

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
    // $ANTLR end "rule__Apariencia__Group__50"


    // $ANTLR start "rule__Apariencia__Group__50__Impl"
    // InternalGenerador.g:3326:1: rule__Apariencia__Group__50__Impl : ( 'menu' ) ;
    public final void rule__Apariencia__Group__50__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:3330:1: ( ( 'menu' ) )
            // InternalGenerador.g:3331:1: ( 'menu' )
            {
            // InternalGenerador.g:3331:1: ( 'menu' )
            // InternalGenerador.g:3332:2: 'menu'
            {
             before(grammarAccess.getAparienciaAccess().getMenuKeyword_50()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getAparienciaAccess().getMenuKeyword_50()); 

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
    // $ANTLR end "rule__Apariencia__Group__50__Impl"


    // $ANTLR start "rule__Apariencia__Group__51"
    // InternalGenerador.g:3341:1: rule__Apariencia__Group__51 : rule__Apariencia__Group__51__Impl rule__Apariencia__Group__52 ;
    public final void rule__Apariencia__Group__51() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:3345:1: ( rule__Apariencia__Group__51__Impl rule__Apariencia__Group__52 )
            // InternalGenerador.g:3346:2: rule__Apariencia__Group__51__Impl rule__Apariencia__Group__52
            {
            pushFollow(FOLLOW_13);
            rule__Apariencia__Group__51__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Apariencia__Group__52();

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
    // $ANTLR end "rule__Apariencia__Group__51"


    // $ANTLR start "rule__Apariencia__Group__51__Impl"
    // InternalGenerador.g:3353:1: rule__Apariencia__Group__51__Impl : ( '.' ) ;
    public final void rule__Apariencia__Group__51__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:3357:1: ( ( '.' ) )
            // InternalGenerador.g:3358:1: ( '.' )
            {
            // InternalGenerador.g:3358:1: ( '.' )
            // InternalGenerador.g:3359:2: '.'
            {
             before(grammarAccess.getAparienciaAccess().getFullStopKeyword_51()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getAparienciaAccess().getFullStopKeyword_51()); 

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
    // $ANTLR end "rule__Apariencia__Group__51__Impl"


    // $ANTLR start "rule__Apariencia__Group__52"
    // InternalGenerador.g:3368:1: rule__Apariencia__Group__52 : rule__Apariencia__Group__52__Impl rule__Apariencia__Group__53 ;
    public final void rule__Apariencia__Group__52() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:3372:1: ( rule__Apariencia__Group__52__Impl rule__Apariencia__Group__53 )
            // InternalGenerador.g:3373:2: rule__Apariencia__Group__52__Impl rule__Apariencia__Group__53
            {
            pushFollow(FOLLOW_36);
            rule__Apariencia__Group__52__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Apariencia__Group__53();

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
    // $ANTLR end "rule__Apariencia__Group__52"


    // $ANTLR start "rule__Apariencia__Group__52__Impl"
    // InternalGenerador.g:3380:1: rule__Apariencia__Group__52__Impl : ( ( rule__Apariencia__MenuAssignment_52 ) ) ;
    public final void rule__Apariencia__Group__52__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:3384:1: ( ( ( rule__Apariencia__MenuAssignment_52 ) ) )
            // InternalGenerador.g:3385:1: ( ( rule__Apariencia__MenuAssignment_52 ) )
            {
            // InternalGenerador.g:3385:1: ( ( rule__Apariencia__MenuAssignment_52 ) )
            // InternalGenerador.g:3386:2: ( rule__Apariencia__MenuAssignment_52 )
            {
             before(grammarAccess.getAparienciaAccess().getMenuAssignment_52()); 
            // InternalGenerador.g:3387:2: ( rule__Apariencia__MenuAssignment_52 )
            // InternalGenerador.g:3387:3: rule__Apariencia__MenuAssignment_52
            {
            pushFollow(FOLLOW_2);
            rule__Apariencia__MenuAssignment_52();

            state._fsp--;


            }

             after(grammarAccess.getAparienciaAccess().getMenuAssignment_52()); 

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
    // $ANTLR end "rule__Apariencia__Group__52__Impl"


    // $ANTLR start "rule__Apariencia__Group__53"
    // InternalGenerador.g:3395:1: rule__Apariencia__Group__53 : rule__Apariencia__Group__53__Impl rule__Apariencia__Group__54 ;
    public final void rule__Apariencia__Group__53() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:3399:1: ( rule__Apariencia__Group__53__Impl rule__Apariencia__Group__54 )
            // InternalGenerador.g:3400:2: rule__Apariencia__Group__53__Impl rule__Apariencia__Group__54
            {
            pushFollow(FOLLOW_11);
            rule__Apariencia__Group__53__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Apariencia__Group__54();

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
    // $ANTLR end "rule__Apariencia__Group__53"


    // $ANTLR start "rule__Apariencia__Group__53__Impl"
    // InternalGenerador.g:3407:1: rule__Apariencia__Group__53__Impl : ( ']' ) ;
    public final void rule__Apariencia__Group__53__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:3411:1: ( ( ']' ) )
            // InternalGenerador.g:3412:1: ( ']' )
            {
            // InternalGenerador.g:3412:1: ( ']' )
            // InternalGenerador.g:3413:2: ']'
            {
             before(grammarAccess.getAparienciaAccess().getRightSquareBracketKeyword_53()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getAparienciaAccess().getRightSquareBracketKeyword_53()); 

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
    // $ANTLR end "rule__Apariencia__Group__53__Impl"


    // $ANTLR start "rule__Apariencia__Group__54"
    // InternalGenerador.g:3422:1: rule__Apariencia__Group__54 : rule__Apariencia__Group__54__Impl rule__Apariencia__Group__55 ;
    public final void rule__Apariencia__Group__54() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:3426:1: ( rule__Apariencia__Group__54__Impl rule__Apariencia__Group__55 )
            // InternalGenerador.g:3427:2: rule__Apariencia__Group__54__Impl rule__Apariencia__Group__55
            {
            pushFollow(FOLLOW_41);
            rule__Apariencia__Group__54__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Apariencia__Group__55();

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
    // $ANTLR end "rule__Apariencia__Group__54"


    // $ANTLR start "rule__Apariencia__Group__54__Impl"
    // InternalGenerador.g:3434:1: rule__Apariencia__Group__54__Impl : ( '[' ) ;
    public final void rule__Apariencia__Group__54__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:3438:1: ( ( '[' ) )
            // InternalGenerador.g:3439:1: ( '[' )
            {
            // InternalGenerador.g:3439:1: ( '[' )
            // InternalGenerador.g:3440:2: '['
            {
             before(grammarAccess.getAparienciaAccess().getLeftSquareBracketKeyword_54()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getAparienciaAccess().getLeftSquareBracketKeyword_54()); 

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
    // $ANTLR end "rule__Apariencia__Group__54__Impl"


    // $ANTLR start "rule__Apariencia__Group__55"
    // InternalGenerador.g:3449:1: rule__Apariencia__Group__55 : rule__Apariencia__Group__55__Impl rule__Apariencia__Group__56 ;
    public final void rule__Apariencia__Group__55() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:3453:1: ( rule__Apariencia__Group__55__Impl rule__Apariencia__Group__56 )
            // InternalGenerador.g:3454:2: rule__Apariencia__Group__55__Impl rule__Apariencia__Group__56
            {
            pushFollow(FOLLOW_6);
            rule__Apariencia__Group__55__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Apariencia__Group__56();

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
    // $ANTLR end "rule__Apariencia__Group__55"


    // $ANTLR start "rule__Apariencia__Group__55__Impl"
    // InternalGenerador.g:3461:1: rule__Apariencia__Group__55__Impl : ( 'Margen' ) ;
    public final void rule__Apariencia__Group__55__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:3465:1: ( ( 'Margen' ) )
            // InternalGenerador.g:3466:1: ( 'Margen' )
            {
            // InternalGenerador.g:3466:1: ( 'Margen' )
            // InternalGenerador.g:3467:2: 'Margen'
            {
             before(grammarAccess.getAparienciaAccess().getMargenKeyword_55()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getAparienciaAccess().getMargenKeyword_55()); 

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
    // $ANTLR end "rule__Apariencia__Group__55__Impl"


    // $ANTLR start "rule__Apariencia__Group__56"
    // InternalGenerador.g:3476:1: rule__Apariencia__Group__56 : rule__Apariencia__Group__56__Impl rule__Apariencia__Group__57 ;
    public final void rule__Apariencia__Group__56() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:3480:1: ( rule__Apariencia__Group__56__Impl rule__Apariencia__Group__57 )
            // InternalGenerador.g:3481:2: rule__Apariencia__Group__56__Impl rule__Apariencia__Group__57
            {
            pushFollow(FOLLOW_13);
            rule__Apariencia__Group__56__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Apariencia__Group__57();

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
    // $ANTLR end "rule__Apariencia__Group__56"


    // $ANTLR start "rule__Apariencia__Group__56__Impl"
    // InternalGenerador.g:3488:1: rule__Apariencia__Group__56__Impl : ( '=' ) ;
    public final void rule__Apariencia__Group__56__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:3492:1: ( ( '=' ) )
            // InternalGenerador.g:3493:1: ( '=' )
            {
            // InternalGenerador.g:3493:1: ( '=' )
            // InternalGenerador.g:3494:2: '='
            {
             before(grammarAccess.getAparienciaAccess().getEqualsSignKeyword_56()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getAparienciaAccess().getEqualsSignKeyword_56()); 

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
    // $ANTLR end "rule__Apariencia__Group__56__Impl"


    // $ANTLR start "rule__Apariencia__Group__57"
    // InternalGenerador.g:3503:1: rule__Apariencia__Group__57 : rule__Apariencia__Group__57__Impl rule__Apariencia__Group__58 ;
    public final void rule__Apariencia__Group__57() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:3507:1: ( rule__Apariencia__Group__57__Impl rule__Apariencia__Group__58 )
            // InternalGenerador.g:3508:2: rule__Apariencia__Group__57__Impl rule__Apariencia__Group__58
            {
            pushFollow(FOLLOW_36);
            rule__Apariencia__Group__57__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Apariencia__Group__58();

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
    // $ANTLR end "rule__Apariencia__Group__57"


    // $ANTLR start "rule__Apariencia__Group__57__Impl"
    // InternalGenerador.g:3515:1: rule__Apariencia__Group__57__Impl : ( ( rule__Apariencia__LateralAssignment_57 ) ) ;
    public final void rule__Apariencia__Group__57__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:3519:1: ( ( ( rule__Apariencia__LateralAssignment_57 ) ) )
            // InternalGenerador.g:3520:1: ( ( rule__Apariencia__LateralAssignment_57 ) )
            {
            // InternalGenerador.g:3520:1: ( ( rule__Apariencia__LateralAssignment_57 ) )
            // InternalGenerador.g:3521:2: ( rule__Apariencia__LateralAssignment_57 )
            {
             before(grammarAccess.getAparienciaAccess().getLateralAssignment_57()); 
            // InternalGenerador.g:3522:2: ( rule__Apariencia__LateralAssignment_57 )
            // InternalGenerador.g:3522:3: rule__Apariencia__LateralAssignment_57
            {
            pushFollow(FOLLOW_2);
            rule__Apariencia__LateralAssignment_57();

            state._fsp--;


            }

             after(grammarAccess.getAparienciaAccess().getLateralAssignment_57()); 

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
    // $ANTLR end "rule__Apariencia__Group__57__Impl"


    // $ANTLR start "rule__Apariencia__Group__58"
    // InternalGenerador.g:3530:1: rule__Apariencia__Group__58 : rule__Apariencia__Group__58__Impl ;
    public final void rule__Apariencia__Group__58() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:3534:1: ( rule__Apariencia__Group__58__Impl )
            // InternalGenerador.g:3535:2: rule__Apariencia__Group__58__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Apariencia__Group__58__Impl();

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
    // $ANTLR end "rule__Apariencia__Group__58"


    // $ANTLR start "rule__Apariencia__Group__58__Impl"
    // InternalGenerador.g:3541:1: rule__Apariencia__Group__58__Impl : ( ']' ) ;
    public final void rule__Apariencia__Group__58__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:3545:1: ( ( ']' ) )
            // InternalGenerador.g:3546:1: ( ']' )
            {
            // InternalGenerador.g:3546:1: ( ']' )
            // InternalGenerador.g:3547:2: ']'
            {
             before(grammarAccess.getAparienciaAccess().getRightSquareBracketKeyword_58()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getAparienciaAccess().getRightSquareBracketKeyword_58()); 

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
    // $ANTLR end "rule__Apariencia__Group__58__Impl"


    // $ANTLR start "rule__Producto__Group__0"
    // InternalGenerador.g:3557:1: rule__Producto__Group__0 : rule__Producto__Group__0__Impl rule__Producto__Group__1 ;
    public final void rule__Producto__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:3561:1: ( rule__Producto__Group__0__Impl rule__Producto__Group__1 )
            // InternalGenerador.g:3562:2: rule__Producto__Group__0__Impl rule__Producto__Group__1
            {
            pushFollow(FOLLOW_42);
            rule__Producto__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Producto__Group__1();

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
    // $ANTLR end "rule__Producto__Group__0"


    // $ANTLR start "rule__Producto__Group__0__Impl"
    // InternalGenerador.g:3569:1: rule__Producto__Group__0__Impl : ( '[' ) ;
    public final void rule__Producto__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:3573:1: ( ( '[' ) )
            // InternalGenerador.g:3574:1: ( '[' )
            {
            // InternalGenerador.g:3574:1: ( '[' )
            // InternalGenerador.g:3575:2: '['
            {
             before(grammarAccess.getProductoAccess().getLeftSquareBracketKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getProductoAccess().getLeftSquareBracketKeyword_0()); 

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
    // $ANTLR end "rule__Producto__Group__0__Impl"


    // $ANTLR start "rule__Producto__Group__1"
    // InternalGenerador.g:3584:1: rule__Producto__Group__1 : rule__Producto__Group__1__Impl rule__Producto__Group__2 ;
    public final void rule__Producto__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:3588:1: ( rule__Producto__Group__1__Impl rule__Producto__Group__2 )
            // InternalGenerador.g:3589:2: rule__Producto__Group__1__Impl rule__Producto__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Producto__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Producto__Group__2();

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
    // $ANTLR end "rule__Producto__Group__1"


    // $ANTLR start "rule__Producto__Group__1__Impl"
    // InternalGenerador.g:3596:1: rule__Producto__Group__1__Impl : ( 'Producto' ) ;
    public final void rule__Producto__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:3600:1: ( ( 'Producto' ) )
            // InternalGenerador.g:3601:1: ( 'Producto' )
            {
            // InternalGenerador.g:3601:1: ( 'Producto' )
            // InternalGenerador.g:3602:2: 'Producto'
            {
             before(grammarAccess.getProductoAccess().getProductoKeyword_1()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getProductoAccess().getProductoKeyword_1()); 

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
    // $ANTLR end "rule__Producto__Group__1__Impl"


    // $ANTLR start "rule__Producto__Group__2"
    // InternalGenerador.g:3611:1: rule__Producto__Group__2 : rule__Producto__Group__2__Impl rule__Producto__Group__3 ;
    public final void rule__Producto__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:3615:1: ( rule__Producto__Group__2__Impl rule__Producto__Group__3 )
            // InternalGenerador.g:3616:2: rule__Producto__Group__2__Impl rule__Producto__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Producto__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Producto__Group__3();

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
    // $ANTLR end "rule__Producto__Group__2"


    // $ANTLR start "rule__Producto__Group__2__Impl"
    // InternalGenerador.g:3623:1: rule__Producto__Group__2__Impl : ( '=' ) ;
    public final void rule__Producto__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:3627:1: ( ( '=' ) )
            // InternalGenerador.g:3628:1: ( '=' )
            {
            // InternalGenerador.g:3628:1: ( '=' )
            // InternalGenerador.g:3629:2: '='
            {
             before(grammarAccess.getProductoAccess().getEqualsSignKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getProductoAccess().getEqualsSignKeyword_2()); 

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
    // $ANTLR end "rule__Producto__Group__2__Impl"


    // $ANTLR start "rule__Producto__Group__3"
    // InternalGenerador.g:3638:1: rule__Producto__Group__3 : rule__Producto__Group__3__Impl rule__Producto__Group__4 ;
    public final void rule__Producto__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:3642:1: ( rule__Producto__Group__3__Impl rule__Producto__Group__4 )
            // InternalGenerador.g:3643:2: rule__Producto__Group__3__Impl rule__Producto__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__Producto__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Producto__Group__4();

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
    // $ANTLR end "rule__Producto__Group__3"


    // $ANTLR start "rule__Producto__Group__3__Impl"
    // InternalGenerador.g:3650:1: rule__Producto__Group__3__Impl : ( ( rule__Producto__NombreProductoAssignment_3 ) ) ;
    public final void rule__Producto__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:3654:1: ( ( ( rule__Producto__NombreProductoAssignment_3 ) ) )
            // InternalGenerador.g:3655:1: ( ( rule__Producto__NombreProductoAssignment_3 ) )
            {
            // InternalGenerador.g:3655:1: ( ( rule__Producto__NombreProductoAssignment_3 ) )
            // InternalGenerador.g:3656:2: ( rule__Producto__NombreProductoAssignment_3 )
            {
             before(grammarAccess.getProductoAccess().getNombreProductoAssignment_3()); 
            // InternalGenerador.g:3657:2: ( rule__Producto__NombreProductoAssignment_3 )
            // InternalGenerador.g:3657:3: rule__Producto__NombreProductoAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Producto__NombreProductoAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getProductoAccess().getNombreProductoAssignment_3()); 

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
    // $ANTLR end "rule__Producto__Group__3__Impl"


    // $ANTLR start "rule__Producto__Group__4"
    // InternalGenerador.g:3665:1: rule__Producto__Group__4 : rule__Producto__Group__4__Impl rule__Producto__Group__5 ;
    public final void rule__Producto__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:3669:1: ( rule__Producto__Group__4__Impl rule__Producto__Group__5 )
            // InternalGenerador.g:3670:2: rule__Producto__Group__4__Impl rule__Producto__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Producto__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Producto__Group__5();

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
    // $ANTLR end "rule__Producto__Group__4"


    // $ANTLR start "rule__Producto__Group__4__Impl"
    // InternalGenerador.g:3677:1: rule__Producto__Group__4__Impl : ( ':' ) ;
    public final void rule__Producto__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:3681:1: ( ( ':' ) )
            // InternalGenerador.g:3682:1: ( ':' )
            {
            // InternalGenerador.g:3682:1: ( ':' )
            // InternalGenerador.g:3683:2: ':'
            {
             before(grammarAccess.getProductoAccess().getColonKeyword_4()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getProductoAccess().getColonKeyword_4()); 

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
    // $ANTLR end "rule__Producto__Group__4__Impl"


    // $ANTLR start "rule__Producto__Group__5"
    // InternalGenerador.g:3692:1: rule__Producto__Group__5 : rule__Producto__Group__5__Impl rule__Producto__Group__6 ;
    public final void rule__Producto__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:3696:1: ( rule__Producto__Group__5__Impl rule__Producto__Group__6 )
            // InternalGenerador.g:3697:2: rule__Producto__Group__5__Impl rule__Producto__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__Producto__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Producto__Group__6();

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
    // $ANTLR end "rule__Producto__Group__5"


    // $ANTLR start "rule__Producto__Group__5__Impl"
    // InternalGenerador.g:3704:1: rule__Producto__Group__5__Impl : ( ( rule__Producto__DescripcionAssignment_5 ) ) ;
    public final void rule__Producto__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:3708:1: ( ( ( rule__Producto__DescripcionAssignment_5 ) ) )
            // InternalGenerador.g:3709:1: ( ( rule__Producto__DescripcionAssignment_5 ) )
            {
            // InternalGenerador.g:3709:1: ( ( rule__Producto__DescripcionAssignment_5 ) )
            // InternalGenerador.g:3710:2: ( rule__Producto__DescripcionAssignment_5 )
            {
             before(grammarAccess.getProductoAccess().getDescripcionAssignment_5()); 
            // InternalGenerador.g:3711:2: ( rule__Producto__DescripcionAssignment_5 )
            // InternalGenerador.g:3711:3: rule__Producto__DescripcionAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Producto__DescripcionAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getProductoAccess().getDescripcionAssignment_5()); 

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
    // $ANTLR end "rule__Producto__Group__5__Impl"


    // $ANTLR start "rule__Producto__Group__6"
    // InternalGenerador.g:3719:1: rule__Producto__Group__6 : rule__Producto__Group__6__Impl rule__Producto__Group__7 ;
    public final void rule__Producto__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:3723:1: ( rule__Producto__Group__6__Impl rule__Producto__Group__7 )
            // InternalGenerador.g:3724:2: rule__Producto__Group__6__Impl rule__Producto__Group__7
            {
            pushFollow(FOLLOW_13);
            rule__Producto__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Producto__Group__7();

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
    // $ANTLR end "rule__Producto__Group__6"


    // $ANTLR start "rule__Producto__Group__6__Impl"
    // InternalGenerador.g:3731:1: rule__Producto__Group__6__Impl : ( ':' ) ;
    public final void rule__Producto__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:3735:1: ( ( ':' ) )
            // InternalGenerador.g:3736:1: ( ':' )
            {
            // InternalGenerador.g:3736:1: ( ':' )
            // InternalGenerador.g:3737:2: ':'
            {
             before(grammarAccess.getProductoAccess().getColonKeyword_6()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getProductoAccess().getColonKeyword_6()); 

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
    // $ANTLR end "rule__Producto__Group__6__Impl"


    // $ANTLR start "rule__Producto__Group__7"
    // InternalGenerador.g:3746:1: rule__Producto__Group__7 : rule__Producto__Group__7__Impl rule__Producto__Group__8 ;
    public final void rule__Producto__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:3750:1: ( rule__Producto__Group__7__Impl rule__Producto__Group__8 )
            // InternalGenerador.g:3751:2: rule__Producto__Group__7__Impl rule__Producto__Group__8
            {
            pushFollow(FOLLOW_8);
            rule__Producto__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Producto__Group__8();

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
    // $ANTLR end "rule__Producto__Group__7"


    // $ANTLR start "rule__Producto__Group__7__Impl"
    // InternalGenerador.g:3758:1: rule__Producto__Group__7__Impl : ( ( rule__Producto__PrecioAssignment_7 ) ) ;
    public final void rule__Producto__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:3762:1: ( ( ( rule__Producto__PrecioAssignment_7 ) ) )
            // InternalGenerador.g:3763:1: ( ( rule__Producto__PrecioAssignment_7 ) )
            {
            // InternalGenerador.g:3763:1: ( ( rule__Producto__PrecioAssignment_7 ) )
            // InternalGenerador.g:3764:2: ( rule__Producto__PrecioAssignment_7 )
            {
             before(grammarAccess.getProductoAccess().getPrecioAssignment_7()); 
            // InternalGenerador.g:3765:2: ( rule__Producto__PrecioAssignment_7 )
            // InternalGenerador.g:3765:3: rule__Producto__PrecioAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Producto__PrecioAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getProductoAccess().getPrecioAssignment_7()); 

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
    // $ANTLR end "rule__Producto__Group__7__Impl"


    // $ANTLR start "rule__Producto__Group__8"
    // InternalGenerador.g:3773:1: rule__Producto__Group__8 : rule__Producto__Group__8__Impl rule__Producto__Group__9 ;
    public final void rule__Producto__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:3777:1: ( rule__Producto__Group__8__Impl rule__Producto__Group__9 )
            // InternalGenerador.g:3778:2: rule__Producto__Group__8__Impl rule__Producto__Group__9
            {
            pushFollow(FOLLOW_13);
            rule__Producto__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Producto__Group__9();

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
    // $ANTLR end "rule__Producto__Group__8"


    // $ANTLR start "rule__Producto__Group__8__Impl"
    // InternalGenerador.g:3785:1: rule__Producto__Group__8__Impl : ( ':' ) ;
    public final void rule__Producto__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:3789:1: ( ( ':' ) )
            // InternalGenerador.g:3790:1: ( ':' )
            {
            // InternalGenerador.g:3790:1: ( ':' )
            // InternalGenerador.g:3791:2: ':'
            {
             before(grammarAccess.getProductoAccess().getColonKeyword_8()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getProductoAccess().getColonKeyword_8()); 

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
    // $ANTLR end "rule__Producto__Group__8__Impl"


    // $ANTLR start "rule__Producto__Group__9"
    // InternalGenerador.g:3800:1: rule__Producto__Group__9 : rule__Producto__Group__9__Impl rule__Producto__Group__10 ;
    public final void rule__Producto__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:3804:1: ( rule__Producto__Group__9__Impl rule__Producto__Group__10 )
            // InternalGenerador.g:3805:2: rule__Producto__Group__9__Impl rule__Producto__Group__10
            {
            pushFollow(FOLLOW_8);
            rule__Producto__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Producto__Group__10();

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
    // $ANTLR end "rule__Producto__Group__9"


    // $ANTLR start "rule__Producto__Group__9__Impl"
    // InternalGenerador.g:3812:1: rule__Producto__Group__9__Impl : ( ( rule__Producto__CantidadAssignment_9 ) ) ;
    public final void rule__Producto__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:3816:1: ( ( ( rule__Producto__CantidadAssignment_9 ) ) )
            // InternalGenerador.g:3817:1: ( ( rule__Producto__CantidadAssignment_9 ) )
            {
            // InternalGenerador.g:3817:1: ( ( rule__Producto__CantidadAssignment_9 ) )
            // InternalGenerador.g:3818:2: ( rule__Producto__CantidadAssignment_9 )
            {
             before(grammarAccess.getProductoAccess().getCantidadAssignment_9()); 
            // InternalGenerador.g:3819:2: ( rule__Producto__CantidadAssignment_9 )
            // InternalGenerador.g:3819:3: rule__Producto__CantidadAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Producto__CantidadAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getProductoAccess().getCantidadAssignment_9()); 

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
    // $ANTLR end "rule__Producto__Group__9__Impl"


    // $ANTLR start "rule__Producto__Group__10"
    // InternalGenerador.g:3827:1: rule__Producto__Group__10 : rule__Producto__Group__10__Impl rule__Producto__Group__11 ;
    public final void rule__Producto__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:3831:1: ( rule__Producto__Group__10__Impl rule__Producto__Group__11 )
            // InternalGenerador.g:3832:2: rule__Producto__Group__10__Impl rule__Producto__Group__11
            {
            pushFollow(FOLLOW_43);
            rule__Producto__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Producto__Group__11();

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
    // $ANTLR end "rule__Producto__Group__10"


    // $ANTLR start "rule__Producto__Group__10__Impl"
    // InternalGenerador.g:3839:1: rule__Producto__Group__10__Impl : ( ':' ) ;
    public final void rule__Producto__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:3843:1: ( ( ':' ) )
            // InternalGenerador.g:3844:1: ( ':' )
            {
            // InternalGenerador.g:3844:1: ( ':' )
            // InternalGenerador.g:3845:2: ':'
            {
             before(grammarAccess.getProductoAccess().getColonKeyword_10()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getProductoAccess().getColonKeyword_10()); 

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
    // $ANTLR end "rule__Producto__Group__10__Impl"


    // $ANTLR start "rule__Producto__Group__11"
    // InternalGenerador.g:3854:1: rule__Producto__Group__11 : rule__Producto__Group__11__Impl rule__Producto__Group__12 ;
    public final void rule__Producto__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:3858:1: ( rule__Producto__Group__11__Impl rule__Producto__Group__12 )
            // InternalGenerador.g:3859:2: rule__Producto__Group__11__Impl rule__Producto__Group__12
            {
            pushFollow(FOLLOW_36);
            rule__Producto__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Producto__Group__12();

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
    // $ANTLR end "rule__Producto__Group__11"


    // $ANTLR start "rule__Producto__Group__11__Impl"
    // InternalGenerador.g:3866:1: rule__Producto__Group__11__Impl : ( ( rule__Producto__CategoriaAssignment_11 ) ) ;
    public final void rule__Producto__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:3870:1: ( ( ( rule__Producto__CategoriaAssignment_11 ) ) )
            // InternalGenerador.g:3871:1: ( ( rule__Producto__CategoriaAssignment_11 ) )
            {
            // InternalGenerador.g:3871:1: ( ( rule__Producto__CategoriaAssignment_11 ) )
            // InternalGenerador.g:3872:2: ( rule__Producto__CategoriaAssignment_11 )
            {
             before(grammarAccess.getProductoAccess().getCategoriaAssignment_11()); 
            // InternalGenerador.g:3873:2: ( rule__Producto__CategoriaAssignment_11 )
            // InternalGenerador.g:3873:3: rule__Producto__CategoriaAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__Producto__CategoriaAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getProductoAccess().getCategoriaAssignment_11()); 

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
    // $ANTLR end "rule__Producto__Group__11__Impl"


    // $ANTLR start "rule__Producto__Group__12"
    // InternalGenerador.g:3881:1: rule__Producto__Group__12 : rule__Producto__Group__12__Impl ;
    public final void rule__Producto__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:3885:1: ( rule__Producto__Group__12__Impl )
            // InternalGenerador.g:3886:2: rule__Producto__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Producto__Group__12__Impl();

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
    // $ANTLR end "rule__Producto__Group__12"


    // $ANTLR start "rule__Producto__Group__12__Impl"
    // InternalGenerador.g:3892:1: rule__Producto__Group__12__Impl : ( ']' ) ;
    public final void rule__Producto__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:3896:1: ( ( ']' ) )
            // InternalGenerador.g:3897:1: ( ']' )
            {
            // InternalGenerador.g:3897:1: ( ']' )
            // InternalGenerador.g:3898:2: ']'
            {
             before(grammarAccess.getProductoAccess().getRightSquareBracketKeyword_12()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getProductoAccess().getRightSquareBracketKeyword_12()); 

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
    // $ANTLR end "rule__Producto__Group__12__Impl"


    // $ANTLR start "rule__Precio__Group__0"
    // InternalGenerador.g:3908:1: rule__Precio__Group__0 : rule__Precio__Group__0__Impl rule__Precio__Group__1 ;
    public final void rule__Precio__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:3912:1: ( rule__Precio__Group__0__Impl rule__Precio__Group__1 )
            // InternalGenerador.g:3913:2: rule__Precio__Group__0__Impl rule__Precio__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__Precio__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Precio__Group__1();

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
    // $ANTLR end "rule__Precio__Group__0"


    // $ANTLR start "rule__Precio__Group__0__Impl"
    // InternalGenerador.g:3920:1: rule__Precio__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__Precio__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:3924:1: ( ( RULE_INT ) )
            // InternalGenerador.g:3925:1: ( RULE_INT )
            {
            // InternalGenerador.g:3925:1: ( RULE_INT )
            // InternalGenerador.g:3926:2: RULE_INT
            {
             before(grammarAccess.getPrecioAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPrecioAccess().getINTTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Precio__Group__0__Impl"


    // $ANTLR start "rule__Precio__Group__1"
    // InternalGenerador.g:3935:1: rule__Precio__Group__1 : rule__Precio__Group__1__Impl rule__Precio__Group__2 ;
    public final void rule__Precio__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:3939:1: ( rule__Precio__Group__1__Impl rule__Precio__Group__2 )
            // InternalGenerador.g:3940:2: rule__Precio__Group__1__Impl rule__Precio__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Precio__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Precio__Group__2();

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
    // $ANTLR end "rule__Precio__Group__1"


    // $ANTLR start "rule__Precio__Group__1__Impl"
    // InternalGenerador.g:3947:1: rule__Precio__Group__1__Impl : ( '.' ) ;
    public final void rule__Precio__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:3951:1: ( ( '.' ) )
            // InternalGenerador.g:3952:1: ( '.' )
            {
            // InternalGenerador.g:3952:1: ( '.' )
            // InternalGenerador.g:3953:2: '.'
            {
             before(grammarAccess.getPrecioAccess().getFullStopKeyword_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getPrecioAccess().getFullStopKeyword_1()); 

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
    // $ANTLR end "rule__Precio__Group__1__Impl"


    // $ANTLR start "rule__Precio__Group__2"
    // InternalGenerador.g:3962:1: rule__Precio__Group__2 : rule__Precio__Group__2__Impl ;
    public final void rule__Precio__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:3966:1: ( rule__Precio__Group__2__Impl )
            // InternalGenerador.g:3967:2: rule__Precio__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Precio__Group__2__Impl();

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
    // $ANTLR end "rule__Precio__Group__2"


    // $ANTLR start "rule__Precio__Group__2__Impl"
    // InternalGenerador.g:3973:1: rule__Precio__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__Precio__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:3977:1: ( ( RULE_INT ) )
            // InternalGenerador.g:3978:1: ( RULE_INT )
            {
            // InternalGenerador.g:3978:1: ( RULE_INT )
            // InternalGenerador.g:3979:2: RULE_INT
            {
             before(grammarAccess.getPrecioAccess().getINTTerminalRuleCall_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPrecioAccess().getINTTerminalRuleCall_2()); 

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
    // $ANTLR end "rule__Precio__Group__2__Impl"


    // $ANTLR start "rule__Desplegable__Group__0"
    // InternalGenerador.g:3989:1: rule__Desplegable__Group__0 : rule__Desplegable__Group__0__Impl rule__Desplegable__Group__1 ;
    public final void rule__Desplegable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:3993:1: ( rule__Desplegable__Group__0__Impl rule__Desplegable__Group__1 )
            // InternalGenerador.g:3994:2: rule__Desplegable__Group__0__Impl rule__Desplegable__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Desplegable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Desplegable__Group__1();

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
    // $ANTLR end "rule__Desplegable__Group__0"


    // $ANTLR start "rule__Desplegable__Group__0__Impl"
    // InternalGenerador.g:4001:1: rule__Desplegable__Group__0__Impl : ( 'Desplegable' ) ;
    public final void rule__Desplegable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:4005:1: ( ( 'Desplegable' ) )
            // InternalGenerador.g:4006:1: ( 'Desplegable' )
            {
            // InternalGenerador.g:4006:1: ( 'Desplegable' )
            // InternalGenerador.g:4007:2: 'Desplegable'
            {
             before(grammarAccess.getDesplegableAccess().getDesplegableKeyword_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getDesplegableAccess().getDesplegableKeyword_0()); 

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
    // $ANTLR end "rule__Desplegable__Group__0__Impl"


    // $ANTLR start "rule__Desplegable__Group__1"
    // InternalGenerador.g:4016:1: rule__Desplegable__Group__1 : rule__Desplegable__Group__1__Impl rule__Desplegable__Group__2 ;
    public final void rule__Desplegable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:4020:1: ( rule__Desplegable__Group__1__Impl rule__Desplegable__Group__2 )
            // InternalGenerador.g:4021:2: rule__Desplegable__Group__1__Impl rule__Desplegable__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__Desplegable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Desplegable__Group__2();

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
    // $ANTLR end "rule__Desplegable__Group__1"


    // $ANTLR start "rule__Desplegable__Group__1__Impl"
    // InternalGenerador.g:4028:1: rule__Desplegable__Group__1__Impl : ( ':' ) ;
    public final void rule__Desplegable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:4032:1: ( ( ':' ) )
            // InternalGenerador.g:4033:1: ( ':' )
            {
            // InternalGenerador.g:4033:1: ( ':' )
            // InternalGenerador.g:4034:2: ':'
            {
             before(grammarAccess.getDesplegableAccess().getColonKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getDesplegableAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__Desplegable__Group__1__Impl"


    // $ANTLR start "rule__Desplegable__Group__2"
    // InternalGenerador.g:4043:1: rule__Desplegable__Group__2 : rule__Desplegable__Group__2__Impl ;
    public final void rule__Desplegable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:4047:1: ( rule__Desplegable__Group__2__Impl )
            // InternalGenerador.g:4048:2: rule__Desplegable__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Desplegable__Group__2__Impl();

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
    // $ANTLR end "rule__Desplegable__Group__2"


    // $ANTLR start "rule__Desplegable__Group__2__Impl"
    // InternalGenerador.g:4054:1: rule__Desplegable__Group__2__Impl : ( ( rule__Desplegable__ColorAssignment_2 ) ) ;
    public final void rule__Desplegable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:4058:1: ( ( ( rule__Desplegable__ColorAssignment_2 ) ) )
            // InternalGenerador.g:4059:1: ( ( rule__Desplegable__ColorAssignment_2 ) )
            {
            // InternalGenerador.g:4059:1: ( ( rule__Desplegable__ColorAssignment_2 ) )
            // InternalGenerador.g:4060:2: ( rule__Desplegable__ColorAssignment_2 )
            {
             before(grammarAccess.getDesplegableAccess().getColorAssignment_2()); 
            // InternalGenerador.g:4061:2: ( rule__Desplegable__ColorAssignment_2 )
            // InternalGenerador.g:4061:3: rule__Desplegable__ColorAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Desplegable__ColorAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDesplegableAccess().getColorAssignment_2()); 

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
    // $ANTLR end "rule__Desplegable__Group__2__Impl"


    // $ANTLR start "rule__Permanente__Group__0"
    // InternalGenerador.g:4070:1: rule__Permanente__Group__0 : rule__Permanente__Group__0__Impl rule__Permanente__Group__1 ;
    public final void rule__Permanente__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:4074:1: ( rule__Permanente__Group__0__Impl rule__Permanente__Group__1 )
            // InternalGenerador.g:4075:2: rule__Permanente__Group__0__Impl rule__Permanente__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Permanente__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Permanente__Group__1();

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
    // $ANTLR end "rule__Permanente__Group__0"


    // $ANTLR start "rule__Permanente__Group__0__Impl"
    // InternalGenerador.g:4082:1: rule__Permanente__Group__0__Impl : ( 'Permanente' ) ;
    public final void rule__Permanente__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:4086:1: ( ( 'Permanente' ) )
            // InternalGenerador.g:4087:1: ( 'Permanente' )
            {
            // InternalGenerador.g:4087:1: ( 'Permanente' )
            // InternalGenerador.g:4088:2: 'Permanente'
            {
             before(grammarAccess.getPermanenteAccess().getPermanenteKeyword_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getPermanenteAccess().getPermanenteKeyword_0()); 

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
    // $ANTLR end "rule__Permanente__Group__0__Impl"


    // $ANTLR start "rule__Permanente__Group__1"
    // InternalGenerador.g:4097:1: rule__Permanente__Group__1 : rule__Permanente__Group__1__Impl rule__Permanente__Group__2 ;
    public final void rule__Permanente__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:4101:1: ( rule__Permanente__Group__1__Impl rule__Permanente__Group__2 )
            // InternalGenerador.g:4102:2: rule__Permanente__Group__1__Impl rule__Permanente__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__Permanente__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Permanente__Group__2();

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
    // $ANTLR end "rule__Permanente__Group__1"


    // $ANTLR start "rule__Permanente__Group__1__Impl"
    // InternalGenerador.g:4109:1: rule__Permanente__Group__1__Impl : ( ':' ) ;
    public final void rule__Permanente__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:4113:1: ( ( ':' ) )
            // InternalGenerador.g:4114:1: ( ':' )
            {
            // InternalGenerador.g:4114:1: ( ':' )
            // InternalGenerador.g:4115:2: ':'
            {
             before(grammarAccess.getPermanenteAccess().getColonKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getPermanenteAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__Permanente__Group__1__Impl"


    // $ANTLR start "rule__Permanente__Group__2"
    // InternalGenerador.g:4124:1: rule__Permanente__Group__2 : rule__Permanente__Group__2__Impl rule__Permanente__Group__3 ;
    public final void rule__Permanente__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:4128:1: ( rule__Permanente__Group__2__Impl rule__Permanente__Group__3 )
            // InternalGenerador.g:4129:2: rule__Permanente__Group__2__Impl rule__Permanente__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Permanente__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Permanente__Group__3();

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
    // $ANTLR end "rule__Permanente__Group__2"


    // $ANTLR start "rule__Permanente__Group__2__Impl"
    // InternalGenerador.g:4136:1: rule__Permanente__Group__2__Impl : ( ( rule__Permanente__ColorAssignment_2 ) ) ;
    public final void rule__Permanente__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:4140:1: ( ( ( rule__Permanente__ColorAssignment_2 ) ) )
            // InternalGenerador.g:4141:1: ( ( rule__Permanente__ColorAssignment_2 ) )
            {
            // InternalGenerador.g:4141:1: ( ( rule__Permanente__ColorAssignment_2 ) )
            // InternalGenerador.g:4142:2: ( rule__Permanente__ColorAssignment_2 )
            {
             before(grammarAccess.getPermanenteAccess().getColorAssignment_2()); 
            // InternalGenerador.g:4143:2: ( rule__Permanente__ColorAssignment_2 )
            // InternalGenerador.g:4143:3: rule__Permanente__ColorAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Permanente__ColorAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPermanenteAccess().getColorAssignment_2()); 

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
    // $ANTLR end "rule__Permanente__Group__2__Impl"


    // $ANTLR start "rule__Permanente__Group__3"
    // InternalGenerador.g:4151:1: rule__Permanente__Group__3 : rule__Permanente__Group__3__Impl rule__Permanente__Group__4 ;
    public final void rule__Permanente__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:4155:1: ( rule__Permanente__Group__3__Impl rule__Permanente__Group__4 )
            // InternalGenerador.g:4156:2: rule__Permanente__Group__3__Impl rule__Permanente__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__Permanente__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Permanente__Group__4();

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
    // $ANTLR end "rule__Permanente__Group__3"


    // $ANTLR start "rule__Permanente__Group__3__Impl"
    // InternalGenerador.g:4163:1: rule__Permanente__Group__3__Impl : ( ':' ) ;
    public final void rule__Permanente__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:4167:1: ( ( ':' ) )
            // InternalGenerador.g:4168:1: ( ':' )
            {
            // InternalGenerador.g:4168:1: ( ':' )
            // InternalGenerador.g:4169:2: ':'
            {
             before(grammarAccess.getPermanenteAccess().getColonKeyword_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getPermanenteAccess().getColonKeyword_3()); 

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
    // $ANTLR end "rule__Permanente__Group__3__Impl"


    // $ANTLR start "rule__Permanente__Group__4"
    // InternalGenerador.g:4178:1: rule__Permanente__Group__4 : rule__Permanente__Group__4__Impl ;
    public final void rule__Permanente__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:4182:1: ( rule__Permanente__Group__4__Impl )
            // InternalGenerador.g:4183:2: rule__Permanente__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Permanente__Group__4__Impl();

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
    // $ANTLR end "rule__Permanente__Group__4"


    // $ANTLR start "rule__Permanente__Group__4__Impl"
    // InternalGenerador.g:4189:1: rule__Permanente__Group__4__Impl : ( ( rule__Permanente__AlturaAssignment_4 ) ) ;
    public final void rule__Permanente__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:4193:1: ( ( ( rule__Permanente__AlturaAssignment_4 ) ) )
            // InternalGenerador.g:4194:1: ( ( rule__Permanente__AlturaAssignment_4 ) )
            {
            // InternalGenerador.g:4194:1: ( ( rule__Permanente__AlturaAssignment_4 ) )
            // InternalGenerador.g:4195:2: ( rule__Permanente__AlturaAssignment_4 )
            {
             before(grammarAccess.getPermanenteAccess().getAlturaAssignment_4()); 
            // InternalGenerador.g:4196:2: ( rule__Permanente__AlturaAssignment_4 )
            // InternalGenerador.g:4196:3: rule__Permanente__AlturaAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Permanente__AlturaAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getPermanenteAccess().getAlturaAssignment_4()); 

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
    // $ANTLR end "rule__Permanente__Group__4__Impl"


    // $ANTLR start "rule__Color__Group__0"
    // InternalGenerador.g:4205:1: rule__Color__Group__0 : rule__Color__Group__0__Impl rule__Color__Group__1 ;
    public final void rule__Color__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:4209:1: ( rule__Color__Group__0__Impl rule__Color__Group__1 )
            // InternalGenerador.g:4210:2: rule__Color__Group__0__Impl rule__Color__Group__1
            {
            pushFollow(FOLLOW_44);
            rule__Color__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Color__Group__1();

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
    // $ANTLR end "rule__Color__Group__0"


    // $ANTLR start "rule__Color__Group__0__Impl"
    // InternalGenerador.g:4217:1: rule__Color__Group__0__Impl : ( '#' ) ;
    public final void rule__Color__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:4221:1: ( ( '#' ) )
            // InternalGenerador.g:4222:1: ( '#' )
            {
            // InternalGenerador.g:4222:1: ( '#' )
            // InternalGenerador.g:4223:2: '#'
            {
             before(grammarAccess.getColorAccess().getNumberSignKeyword_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getColorAccess().getNumberSignKeyword_0()); 

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
    // $ANTLR end "rule__Color__Group__0__Impl"


    // $ANTLR start "rule__Color__Group__1"
    // InternalGenerador.g:4232:1: rule__Color__Group__1 : rule__Color__Group__1__Impl ;
    public final void rule__Color__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:4236:1: ( rule__Color__Group__1__Impl )
            // InternalGenerador.g:4237:2: rule__Color__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Color__Group__1__Impl();

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
    // $ANTLR end "rule__Color__Group__1"


    // $ANTLR start "rule__Color__Group__1__Impl"
    // InternalGenerador.g:4243:1: rule__Color__Group__1__Impl : ( ( ( rule__Color__Alternatives_1 ) ) ( ( rule__Color__Alternatives_1 )* ) ) ;
    public final void rule__Color__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:4247:1: ( ( ( ( rule__Color__Alternatives_1 ) ) ( ( rule__Color__Alternatives_1 )* ) ) )
            // InternalGenerador.g:4248:1: ( ( ( rule__Color__Alternatives_1 ) ) ( ( rule__Color__Alternatives_1 )* ) )
            {
            // InternalGenerador.g:4248:1: ( ( ( rule__Color__Alternatives_1 ) ) ( ( rule__Color__Alternatives_1 )* ) )
            // InternalGenerador.g:4249:2: ( ( rule__Color__Alternatives_1 ) ) ( ( rule__Color__Alternatives_1 )* )
            {
            // InternalGenerador.g:4249:2: ( ( rule__Color__Alternatives_1 ) )
            // InternalGenerador.g:4250:3: ( rule__Color__Alternatives_1 )
            {
             before(grammarAccess.getColorAccess().getAlternatives_1()); 
            // InternalGenerador.g:4251:3: ( rule__Color__Alternatives_1 )
            // InternalGenerador.g:4251:4: rule__Color__Alternatives_1
            {
            pushFollow(FOLLOW_45);
            rule__Color__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getColorAccess().getAlternatives_1()); 

            }

            // InternalGenerador.g:4254:2: ( ( rule__Color__Alternatives_1 )* )
            // InternalGenerador.g:4255:3: ( rule__Color__Alternatives_1 )*
            {
             before(grammarAccess.getColorAccess().getAlternatives_1()); 
            // InternalGenerador.g:4256:3: ( rule__Color__Alternatives_1 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=RULE_ID && LA7_0<=RULE_INT)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalGenerador.g:4256:4: rule__Color__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_45);
            	    rule__Color__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getColorAccess().getAlternatives_1()); 

            }


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
    // $ANTLR end "rule__Color__Group__1__Impl"


    // $ANTLR start "rule__Medida__Group_0__0"
    // InternalGenerador.g:4266:1: rule__Medida__Group_0__0 : rule__Medida__Group_0__0__Impl rule__Medida__Group_0__1 ;
    public final void rule__Medida__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:4270:1: ( rule__Medida__Group_0__0__Impl rule__Medida__Group_0__1 )
            // InternalGenerador.g:4271:2: rule__Medida__Group_0__0__Impl rule__Medida__Group_0__1
            {
            pushFollow(FOLLOW_46);
            rule__Medida__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Medida__Group_0__1();

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
    // $ANTLR end "rule__Medida__Group_0__0"


    // $ANTLR start "rule__Medida__Group_0__0__Impl"
    // InternalGenerador.g:4278:1: rule__Medida__Group_0__0__Impl : ( RULE_INT ) ;
    public final void rule__Medida__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:4282:1: ( ( RULE_INT ) )
            // InternalGenerador.g:4283:1: ( RULE_INT )
            {
            // InternalGenerador.g:4283:1: ( RULE_INT )
            // InternalGenerador.g:4284:2: RULE_INT
            {
             before(grammarAccess.getMedidaAccess().getINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getMedidaAccess().getINTTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Medida__Group_0__0__Impl"


    // $ANTLR start "rule__Medida__Group_0__1"
    // InternalGenerador.g:4293:1: rule__Medida__Group_0__1 : rule__Medida__Group_0__1__Impl ;
    public final void rule__Medida__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:4297:1: ( rule__Medida__Group_0__1__Impl )
            // InternalGenerador.g:4298:2: rule__Medida__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Medida__Group_0__1__Impl();

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
    // $ANTLR end "rule__Medida__Group_0__1"


    // $ANTLR start "rule__Medida__Group_0__1__Impl"
    // InternalGenerador.g:4304:1: rule__Medida__Group_0__1__Impl : ( 'px' ) ;
    public final void rule__Medida__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:4308:1: ( ( 'px' ) )
            // InternalGenerador.g:4309:1: ( 'px' )
            {
            // InternalGenerador.g:4309:1: ( 'px' )
            // InternalGenerador.g:4310:2: 'px'
            {
             before(grammarAccess.getMedidaAccess().getPxKeyword_0_1()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getMedidaAccess().getPxKeyword_0_1()); 

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
    // $ANTLR end "rule__Medida__Group_0__1__Impl"


    // $ANTLR start "rule__Medida__Group_1__0"
    // InternalGenerador.g:4320:1: rule__Medida__Group_1__0 : rule__Medida__Group_1__0__Impl rule__Medida__Group_1__1 ;
    public final void rule__Medida__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:4324:1: ( rule__Medida__Group_1__0__Impl rule__Medida__Group_1__1 )
            // InternalGenerador.g:4325:2: rule__Medida__Group_1__0__Impl rule__Medida__Group_1__1
            {
            pushFollow(FOLLOW_47);
            rule__Medida__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Medida__Group_1__1();

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
    // $ANTLR end "rule__Medida__Group_1__0"


    // $ANTLR start "rule__Medida__Group_1__0__Impl"
    // InternalGenerador.g:4332:1: rule__Medida__Group_1__0__Impl : ( RULE_INT ) ;
    public final void rule__Medida__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:4336:1: ( ( RULE_INT ) )
            // InternalGenerador.g:4337:1: ( RULE_INT )
            {
            // InternalGenerador.g:4337:1: ( RULE_INT )
            // InternalGenerador.g:4338:2: RULE_INT
            {
             before(grammarAccess.getMedidaAccess().getINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getMedidaAccess().getINTTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Medida__Group_1__0__Impl"


    // $ANTLR start "rule__Medida__Group_1__1"
    // InternalGenerador.g:4347:1: rule__Medida__Group_1__1 : rule__Medida__Group_1__1__Impl ;
    public final void rule__Medida__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:4351:1: ( rule__Medida__Group_1__1__Impl )
            // InternalGenerador.g:4352:2: rule__Medida__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Medida__Group_1__1__Impl();

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
    // $ANTLR end "rule__Medida__Group_1__1"


    // $ANTLR start "rule__Medida__Group_1__1__Impl"
    // InternalGenerador.g:4358:1: rule__Medida__Group_1__1__Impl : ( '%' ) ;
    public final void rule__Medida__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:4362:1: ( ( '%' ) )
            // InternalGenerador.g:4363:1: ( '%' )
            {
            // InternalGenerador.g:4363:1: ( '%' )
            // InternalGenerador.g:4364:2: '%'
            {
             before(grammarAccess.getMedidaAccess().getPercentSignKeyword_1_1()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getMedidaAccess().getPercentSignKeyword_1_1()); 

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
    // $ANTLR end "rule__Medida__Group_1__1__Impl"


    // $ANTLR start "rule__Correo__Group__0"
    // InternalGenerador.g:4374:1: rule__Correo__Group__0 : rule__Correo__Group__0__Impl rule__Correo__Group__1 ;
    public final void rule__Correo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:4378:1: ( rule__Correo__Group__0__Impl rule__Correo__Group__1 )
            // InternalGenerador.g:4379:2: rule__Correo__Group__0__Impl rule__Correo__Group__1
            {
            pushFollow(FOLLOW_48);
            rule__Correo__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Correo__Group__1();

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
    // $ANTLR end "rule__Correo__Group__0"


    // $ANTLR start "rule__Correo__Group__0__Impl"
    // InternalGenerador.g:4386:1: rule__Correo__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__Correo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:4390:1: ( ( RULE_ID ) )
            // InternalGenerador.g:4391:1: ( RULE_ID )
            {
            // InternalGenerador.g:4391:1: ( RULE_ID )
            // InternalGenerador.g:4392:2: RULE_ID
            {
             before(grammarAccess.getCorreoAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCorreoAccess().getIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Correo__Group__0__Impl"


    // $ANTLR start "rule__Correo__Group__1"
    // InternalGenerador.g:4401:1: rule__Correo__Group__1 : rule__Correo__Group__1__Impl rule__Correo__Group__2 ;
    public final void rule__Correo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:4405:1: ( rule__Correo__Group__1__Impl rule__Correo__Group__2 )
            // InternalGenerador.g:4406:2: rule__Correo__Group__1__Impl rule__Correo__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Correo__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Correo__Group__2();

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
    // $ANTLR end "rule__Correo__Group__1"


    // $ANTLR start "rule__Correo__Group__1__Impl"
    // InternalGenerador.g:4413:1: rule__Correo__Group__1__Impl : ( '@' ) ;
    public final void rule__Correo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:4417:1: ( ( '@' ) )
            // InternalGenerador.g:4418:1: ( '@' )
            {
            // InternalGenerador.g:4418:1: ( '@' )
            // InternalGenerador.g:4419:2: '@'
            {
             before(grammarAccess.getCorreoAccess().getCommercialAtKeyword_1()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getCorreoAccess().getCommercialAtKeyword_1()); 

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
    // $ANTLR end "rule__Correo__Group__1__Impl"


    // $ANTLR start "rule__Correo__Group__2"
    // InternalGenerador.g:4428:1: rule__Correo__Group__2 : rule__Correo__Group__2__Impl rule__Correo__Group__3 ;
    public final void rule__Correo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:4432:1: ( rule__Correo__Group__2__Impl rule__Correo__Group__3 )
            // InternalGenerador.g:4433:2: rule__Correo__Group__2__Impl rule__Correo__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__Correo__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Correo__Group__3();

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
    // $ANTLR end "rule__Correo__Group__2"


    // $ANTLR start "rule__Correo__Group__2__Impl"
    // InternalGenerador.g:4440:1: rule__Correo__Group__2__Impl : ( RULE_ID ) ;
    public final void rule__Correo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:4444:1: ( ( RULE_ID ) )
            // InternalGenerador.g:4445:1: ( RULE_ID )
            {
            // InternalGenerador.g:4445:1: ( RULE_ID )
            // InternalGenerador.g:4446:2: RULE_ID
            {
             before(grammarAccess.getCorreoAccess().getIDTerminalRuleCall_2()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCorreoAccess().getIDTerminalRuleCall_2()); 

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
    // $ANTLR end "rule__Correo__Group__2__Impl"


    // $ANTLR start "rule__Correo__Group__3"
    // InternalGenerador.g:4455:1: rule__Correo__Group__3 : rule__Correo__Group__3__Impl rule__Correo__Group__4 ;
    public final void rule__Correo__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:4459:1: ( rule__Correo__Group__3__Impl rule__Correo__Group__4 )
            // InternalGenerador.g:4460:2: rule__Correo__Group__3__Impl rule__Correo__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__Correo__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Correo__Group__4();

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
    // $ANTLR end "rule__Correo__Group__3"


    // $ANTLR start "rule__Correo__Group__3__Impl"
    // InternalGenerador.g:4467:1: rule__Correo__Group__3__Impl : ( '.' ) ;
    public final void rule__Correo__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:4471:1: ( ( '.' ) )
            // InternalGenerador.g:4472:1: ( '.' )
            {
            // InternalGenerador.g:4472:1: ( '.' )
            // InternalGenerador.g:4473:2: '.'
            {
             before(grammarAccess.getCorreoAccess().getFullStopKeyword_3()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getCorreoAccess().getFullStopKeyword_3()); 

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
    // $ANTLR end "rule__Correo__Group__3__Impl"


    // $ANTLR start "rule__Correo__Group__4"
    // InternalGenerador.g:4482:1: rule__Correo__Group__4 : rule__Correo__Group__4__Impl ;
    public final void rule__Correo__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:4486:1: ( rule__Correo__Group__4__Impl )
            // InternalGenerador.g:4487:2: rule__Correo__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Correo__Group__4__Impl();

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
    // $ANTLR end "rule__Correo__Group__4"


    // $ANTLR start "rule__Correo__Group__4__Impl"
    // InternalGenerador.g:4493:1: rule__Correo__Group__4__Impl : ( RULE_ID ) ;
    public final void rule__Correo__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:4497:1: ( ( RULE_ID ) )
            // InternalGenerador.g:4498:1: ( RULE_ID )
            {
            // InternalGenerador.g:4498:1: ( RULE_ID )
            // InternalGenerador.g:4499:2: RULE_ID
            {
             before(grammarAccess.getCorreoAccess().getIDTerminalRuleCall_4()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCorreoAccess().getIDTerminalRuleCall_4()); 

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
    // $ANTLR end "rule__Correo__Group__4__Impl"


    // $ANTLR start "rule__Registro__Group__0"
    // InternalGenerador.g:4509:1: rule__Registro__Group__0 : rule__Registro__Group__0__Impl rule__Registro__Group__1 ;
    public final void rule__Registro__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:4513:1: ( rule__Registro__Group__0__Impl rule__Registro__Group__1 )
            // InternalGenerador.g:4514:2: rule__Registro__Group__0__Impl rule__Registro__Group__1
            {
            pushFollow(FOLLOW_49);
            rule__Registro__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Registro__Group__1();

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
    // $ANTLR end "rule__Registro__Group__0"


    // $ANTLR start "rule__Registro__Group__0__Impl"
    // InternalGenerador.g:4521:1: rule__Registro__Group__0__Impl : ( '[' ) ;
    public final void rule__Registro__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:4525:1: ( ( '[' ) )
            // InternalGenerador.g:4526:1: ( '[' )
            {
            // InternalGenerador.g:4526:1: ( '[' )
            // InternalGenerador.g:4527:2: '['
            {
             before(grammarAccess.getRegistroAccess().getLeftSquareBracketKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getRegistroAccess().getLeftSquareBracketKeyword_0()); 

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
    // $ANTLR end "rule__Registro__Group__0__Impl"


    // $ANTLR start "rule__Registro__Group__1"
    // InternalGenerador.g:4536:1: rule__Registro__Group__1 : rule__Registro__Group__1__Impl rule__Registro__Group__2 ;
    public final void rule__Registro__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:4540:1: ( rule__Registro__Group__1__Impl rule__Registro__Group__2 )
            // InternalGenerador.g:4541:2: rule__Registro__Group__1__Impl rule__Registro__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Registro__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Registro__Group__2();

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
    // $ANTLR end "rule__Registro__Group__1"


    // $ANTLR start "rule__Registro__Group__1__Impl"
    // InternalGenerador.g:4548:1: rule__Registro__Group__1__Impl : ( 'Registro' ) ;
    public final void rule__Registro__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:4552:1: ( ( 'Registro' ) )
            // InternalGenerador.g:4553:1: ( 'Registro' )
            {
            // InternalGenerador.g:4553:1: ( 'Registro' )
            // InternalGenerador.g:4554:2: 'Registro'
            {
             before(grammarAccess.getRegistroAccess().getRegistroKeyword_1()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getRegistroAccess().getRegistroKeyword_1()); 

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
    // $ANTLR end "rule__Registro__Group__1__Impl"


    // $ANTLR start "rule__Registro__Group__2"
    // InternalGenerador.g:4563:1: rule__Registro__Group__2 : rule__Registro__Group__2__Impl rule__Registro__Group__3 ;
    public final void rule__Registro__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:4567:1: ( rule__Registro__Group__2__Impl rule__Registro__Group__3 )
            // InternalGenerador.g:4568:2: rule__Registro__Group__2__Impl rule__Registro__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__Registro__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Registro__Group__3();

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
    // $ANTLR end "rule__Registro__Group__2"


    // $ANTLR start "rule__Registro__Group__2__Impl"
    // InternalGenerador.g:4575:1: rule__Registro__Group__2__Impl : ( '=' ) ;
    public final void rule__Registro__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:4579:1: ( ( '=' ) )
            // InternalGenerador.g:4580:1: ( '=' )
            {
            // InternalGenerador.g:4580:1: ( '=' )
            // InternalGenerador.g:4581:2: '='
            {
             before(grammarAccess.getRegistroAccess().getEqualsSignKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getRegistroAccess().getEqualsSignKeyword_2()); 

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
    // $ANTLR end "rule__Registro__Group__2__Impl"


    // $ANTLR start "rule__Registro__Group__3"
    // InternalGenerador.g:4590:1: rule__Registro__Group__3 : rule__Registro__Group__3__Impl rule__Registro__Group__4 ;
    public final void rule__Registro__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:4594:1: ( rule__Registro__Group__3__Impl rule__Registro__Group__4 )
            // InternalGenerador.g:4595:2: rule__Registro__Group__3__Impl rule__Registro__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__Registro__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Registro__Group__4();

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
    // $ANTLR end "rule__Registro__Group__3"


    // $ANTLR start "rule__Registro__Group__3__Impl"
    // InternalGenerador.g:4602:1: rule__Registro__Group__3__Impl : ( ( rule__Registro__TomoAssignment_3 ) ) ;
    public final void rule__Registro__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:4606:1: ( ( ( rule__Registro__TomoAssignment_3 ) ) )
            // InternalGenerador.g:4607:1: ( ( rule__Registro__TomoAssignment_3 ) )
            {
            // InternalGenerador.g:4607:1: ( ( rule__Registro__TomoAssignment_3 ) )
            // InternalGenerador.g:4608:2: ( rule__Registro__TomoAssignment_3 )
            {
             before(grammarAccess.getRegistroAccess().getTomoAssignment_3()); 
            // InternalGenerador.g:4609:2: ( rule__Registro__TomoAssignment_3 )
            // InternalGenerador.g:4609:3: rule__Registro__TomoAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Registro__TomoAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRegistroAccess().getTomoAssignment_3()); 

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
    // $ANTLR end "rule__Registro__Group__3__Impl"


    // $ANTLR start "rule__Registro__Group__4"
    // InternalGenerador.g:4617:1: rule__Registro__Group__4 : rule__Registro__Group__4__Impl rule__Registro__Group__5 ;
    public final void rule__Registro__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:4621:1: ( rule__Registro__Group__4__Impl rule__Registro__Group__5 )
            // InternalGenerador.g:4622:2: rule__Registro__Group__4__Impl rule__Registro__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__Registro__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Registro__Group__5();

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
    // $ANTLR end "rule__Registro__Group__4"


    // $ANTLR start "rule__Registro__Group__4__Impl"
    // InternalGenerador.g:4629:1: rule__Registro__Group__4__Impl : ( ':' ) ;
    public final void rule__Registro__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:4633:1: ( ( ':' ) )
            // InternalGenerador.g:4634:1: ( ':' )
            {
            // InternalGenerador.g:4634:1: ( ':' )
            // InternalGenerador.g:4635:2: ':'
            {
             before(grammarAccess.getRegistroAccess().getColonKeyword_4()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getRegistroAccess().getColonKeyword_4()); 

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
    // $ANTLR end "rule__Registro__Group__4__Impl"


    // $ANTLR start "rule__Registro__Group__5"
    // InternalGenerador.g:4644:1: rule__Registro__Group__5 : rule__Registro__Group__5__Impl rule__Registro__Group__6 ;
    public final void rule__Registro__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:4648:1: ( rule__Registro__Group__5__Impl rule__Registro__Group__6 )
            // InternalGenerador.g:4649:2: rule__Registro__Group__5__Impl rule__Registro__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__Registro__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Registro__Group__6();

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
    // $ANTLR end "rule__Registro__Group__5"


    // $ANTLR start "rule__Registro__Group__5__Impl"
    // InternalGenerador.g:4656:1: rule__Registro__Group__5__Impl : ( ( rule__Registro__FolioAssignment_5 ) ) ;
    public final void rule__Registro__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:4660:1: ( ( ( rule__Registro__FolioAssignment_5 ) ) )
            // InternalGenerador.g:4661:1: ( ( rule__Registro__FolioAssignment_5 ) )
            {
            // InternalGenerador.g:4661:1: ( ( rule__Registro__FolioAssignment_5 ) )
            // InternalGenerador.g:4662:2: ( rule__Registro__FolioAssignment_5 )
            {
             before(grammarAccess.getRegistroAccess().getFolioAssignment_5()); 
            // InternalGenerador.g:4663:2: ( rule__Registro__FolioAssignment_5 )
            // InternalGenerador.g:4663:3: rule__Registro__FolioAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Registro__FolioAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getRegistroAccess().getFolioAssignment_5()); 

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
    // $ANTLR end "rule__Registro__Group__5__Impl"


    // $ANTLR start "rule__Registro__Group__6"
    // InternalGenerador.g:4671:1: rule__Registro__Group__6 : rule__Registro__Group__6__Impl rule__Registro__Group__7 ;
    public final void rule__Registro__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:4675:1: ( rule__Registro__Group__6__Impl rule__Registro__Group__7 )
            // InternalGenerador.g:4676:2: rule__Registro__Group__6__Impl rule__Registro__Group__7
            {
            pushFollow(FOLLOW_13);
            rule__Registro__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Registro__Group__7();

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
    // $ANTLR end "rule__Registro__Group__6"


    // $ANTLR start "rule__Registro__Group__6__Impl"
    // InternalGenerador.g:4683:1: rule__Registro__Group__6__Impl : ( ':' ) ;
    public final void rule__Registro__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:4687:1: ( ( ':' ) )
            // InternalGenerador.g:4688:1: ( ':' )
            {
            // InternalGenerador.g:4688:1: ( ':' )
            // InternalGenerador.g:4689:2: ':'
            {
             before(grammarAccess.getRegistroAccess().getColonKeyword_6()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getRegistroAccess().getColonKeyword_6()); 

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
    // $ANTLR end "rule__Registro__Group__6__Impl"


    // $ANTLR start "rule__Registro__Group__7"
    // InternalGenerador.g:4698:1: rule__Registro__Group__7 : rule__Registro__Group__7__Impl rule__Registro__Group__8 ;
    public final void rule__Registro__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:4702:1: ( rule__Registro__Group__7__Impl rule__Registro__Group__8 )
            // InternalGenerador.g:4703:2: rule__Registro__Group__7__Impl rule__Registro__Group__8
            {
            pushFollow(FOLLOW_8);
            rule__Registro__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Registro__Group__8();

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
    // $ANTLR end "rule__Registro__Group__7"


    // $ANTLR start "rule__Registro__Group__7__Impl"
    // InternalGenerador.g:4710:1: rule__Registro__Group__7__Impl : ( ( rule__Registro__SeccionAssignment_7 ) ) ;
    public final void rule__Registro__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:4714:1: ( ( ( rule__Registro__SeccionAssignment_7 ) ) )
            // InternalGenerador.g:4715:1: ( ( rule__Registro__SeccionAssignment_7 ) )
            {
            // InternalGenerador.g:4715:1: ( ( rule__Registro__SeccionAssignment_7 ) )
            // InternalGenerador.g:4716:2: ( rule__Registro__SeccionAssignment_7 )
            {
             before(grammarAccess.getRegistroAccess().getSeccionAssignment_7()); 
            // InternalGenerador.g:4717:2: ( rule__Registro__SeccionAssignment_7 )
            // InternalGenerador.g:4717:3: rule__Registro__SeccionAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Registro__SeccionAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getRegistroAccess().getSeccionAssignment_7()); 

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
    // $ANTLR end "rule__Registro__Group__7__Impl"


    // $ANTLR start "rule__Registro__Group__8"
    // InternalGenerador.g:4725:1: rule__Registro__Group__8 : rule__Registro__Group__8__Impl rule__Registro__Group__9 ;
    public final void rule__Registro__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:4729:1: ( rule__Registro__Group__8__Impl rule__Registro__Group__9 )
            // InternalGenerador.g:4730:2: rule__Registro__Group__8__Impl rule__Registro__Group__9
            {
            pushFollow(FOLLOW_13);
            rule__Registro__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Registro__Group__9();

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
    // $ANTLR end "rule__Registro__Group__8"


    // $ANTLR start "rule__Registro__Group__8__Impl"
    // InternalGenerador.g:4737:1: rule__Registro__Group__8__Impl : ( ':' ) ;
    public final void rule__Registro__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:4741:1: ( ( ':' ) )
            // InternalGenerador.g:4742:1: ( ':' )
            {
            // InternalGenerador.g:4742:1: ( ':' )
            // InternalGenerador.g:4743:2: ':'
            {
             before(grammarAccess.getRegistroAccess().getColonKeyword_8()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getRegistroAccess().getColonKeyword_8()); 

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
    // $ANTLR end "rule__Registro__Group__8__Impl"


    // $ANTLR start "rule__Registro__Group__9"
    // InternalGenerador.g:4752:1: rule__Registro__Group__9 : rule__Registro__Group__9__Impl rule__Registro__Group__10 ;
    public final void rule__Registro__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:4756:1: ( rule__Registro__Group__9__Impl rule__Registro__Group__10 )
            // InternalGenerador.g:4757:2: rule__Registro__Group__9__Impl rule__Registro__Group__10
            {
            pushFollow(FOLLOW_36);
            rule__Registro__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Registro__Group__10();

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
    // $ANTLR end "rule__Registro__Group__9"


    // $ANTLR start "rule__Registro__Group__9__Impl"
    // InternalGenerador.g:4764:1: rule__Registro__Group__9__Impl : ( ( rule__Registro__HojaAssignment_9 ) ) ;
    public final void rule__Registro__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:4768:1: ( ( ( rule__Registro__HojaAssignment_9 ) ) )
            // InternalGenerador.g:4769:1: ( ( rule__Registro__HojaAssignment_9 ) )
            {
            // InternalGenerador.g:4769:1: ( ( rule__Registro__HojaAssignment_9 ) )
            // InternalGenerador.g:4770:2: ( rule__Registro__HojaAssignment_9 )
            {
             before(grammarAccess.getRegistroAccess().getHojaAssignment_9()); 
            // InternalGenerador.g:4771:2: ( rule__Registro__HojaAssignment_9 )
            // InternalGenerador.g:4771:3: rule__Registro__HojaAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Registro__HojaAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getRegistroAccess().getHojaAssignment_9()); 

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
    // $ANTLR end "rule__Registro__Group__9__Impl"


    // $ANTLR start "rule__Registro__Group__10"
    // InternalGenerador.g:4779:1: rule__Registro__Group__10 : rule__Registro__Group__10__Impl ;
    public final void rule__Registro__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:4783:1: ( rule__Registro__Group__10__Impl )
            // InternalGenerador.g:4784:2: rule__Registro__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Registro__Group__10__Impl();

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
    // $ANTLR end "rule__Registro__Group__10"


    // $ANTLR start "rule__Registro__Group__10__Impl"
    // InternalGenerador.g:4790:1: rule__Registro__Group__10__Impl : ( ']' ) ;
    public final void rule__Registro__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:4794:1: ( ( ']' ) )
            // InternalGenerador.g:4795:1: ( ']' )
            {
            // InternalGenerador.g:4795:1: ( ']' )
            // InternalGenerador.g:4796:2: ']'
            {
             before(grammarAccess.getRegistroAccess().getRightSquareBracketKeyword_10()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getRegistroAccess().getRightSquareBracketKeyword_10()); 

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
    // $ANTLR end "rule__Registro__Group__10__Impl"


    // $ANTLR start "rule__Direccion__Group__0"
    // InternalGenerador.g:4806:1: rule__Direccion__Group__0 : rule__Direccion__Group__0__Impl rule__Direccion__Group__1 ;
    public final void rule__Direccion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:4810:1: ( rule__Direccion__Group__0__Impl rule__Direccion__Group__1 )
            // InternalGenerador.g:4811:2: rule__Direccion__Group__0__Impl rule__Direccion__Group__1
            {
            pushFollow(FOLLOW_50);
            rule__Direccion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Direccion__Group__1();

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
    // $ANTLR end "rule__Direccion__Group__0"


    // $ANTLR start "rule__Direccion__Group__0__Impl"
    // InternalGenerador.g:4818:1: rule__Direccion__Group__0__Impl : ( '[' ) ;
    public final void rule__Direccion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:4822:1: ( ( '[' ) )
            // InternalGenerador.g:4823:1: ( '[' )
            {
            // InternalGenerador.g:4823:1: ( '[' )
            // InternalGenerador.g:4824:2: '['
            {
             before(grammarAccess.getDireccionAccess().getLeftSquareBracketKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getDireccionAccess().getLeftSquareBracketKeyword_0()); 

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
    // $ANTLR end "rule__Direccion__Group__0__Impl"


    // $ANTLR start "rule__Direccion__Group__1"
    // InternalGenerador.g:4833:1: rule__Direccion__Group__1 : rule__Direccion__Group__1__Impl rule__Direccion__Group__2 ;
    public final void rule__Direccion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:4837:1: ( rule__Direccion__Group__1__Impl rule__Direccion__Group__2 )
            // InternalGenerador.g:4838:2: rule__Direccion__Group__1__Impl rule__Direccion__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Direccion__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Direccion__Group__2();

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
    // $ANTLR end "rule__Direccion__Group__1"


    // $ANTLR start "rule__Direccion__Group__1__Impl"
    // InternalGenerador.g:4845:1: rule__Direccion__Group__1__Impl : ( 'Direccion' ) ;
    public final void rule__Direccion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:4849:1: ( ( 'Direccion' ) )
            // InternalGenerador.g:4850:1: ( 'Direccion' )
            {
            // InternalGenerador.g:4850:1: ( 'Direccion' )
            // InternalGenerador.g:4851:2: 'Direccion'
            {
             before(grammarAccess.getDireccionAccess().getDireccionKeyword_1()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getDireccionAccess().getDireccionKeyword_1()); 

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
    // $ANTLR end "rule__Direccion__Group__1__Impl"


    // $ANTLR start "rule__Direccion__Group__2"
    // InternalGenerador.g:4860:1: rule__Direccion__Group__2 : rule__Direccion__Group__2__Impl rule__Direccion__Group__3 ;
    public final void rule__Direccion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:4864:1: ( rule__Direccion__Group__2__Impl rule__Direccion__Group__3 )
            // InternalGenerador.g:4865:2: rule__Direccion__Group__2__Impl rule__Direccion__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Direccion__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Direccion__Group__3();

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
    // $ANTLR end "rule__Direccion__Group__2"


    // $ANTLR start "rule__Direccion__Group__2__Impl"
    // InternalGenerador.g:4872:1: rule__Direccion__Group__2__Impl : ( '=' ) ;
    public final void rule__Direccion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:4876:1: ( ( '=' ) )
            // InternalGenerador.g:4877:1: ( '=' )
            {
            // InternalGenerador.g:4877:1: ( '=' )
            // InternalGenerador.g:4878:2: '='
            {
             before(grammarAccess.getDireccionAccess().getEqualsSignKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getDireccionAccess().getEqualsSignKeyword_2()); 

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
    // $ANTLR end "rule__Direccion__Group__2__Impl"


    // $ANTLR start "rule__Direccion__Group__3"
    // InternalGenerador.g:4887:1: rule__Direccion__Group__3 : rule__Direccion__Group__3__Impl rule__Direccion__Group__4 ;
    public final void rule__Direccion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:4891:1: ( rule__Direccion__Group__3__Impl rule__Direccion__Group__4 )
            // InternalGenerador.g:4892:2: rule__Direccion__Group__3__Impl rule__Direccion__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__Direccion__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Direccion__Group__4();

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
    // $ANTLR end "rule__Direccion__Group__3"


    // $ANTLR start "rule__Direccion__Group__3__Impl"
    // InternalGenerador.g:4899:1: rule__Direccion__Group__3__Impl : ( ( rule__Direccion__CalleAssignment_3 ) ) ;
    public final void rule__Direccion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:4903:1: ( ( ( rule__Direccion__CalleAssignment_3 ) ) )
            // InternalGenerador.g:4904:1: ( ( rule__Direccion__CalleAssignment_3 ) )
            {
            // InternalGenerador.g:4904:1: ( ( rule__Direccion__CalleAssignment_3 ) )
            // InternalGenerador.g:4905:2: ( rule__Direccion__CalleAssignment_3 )
            {
             before(grammarAccess.getDireccionAccess().getCalleAssignment_3()); 
            // InternalGenerador.g:4906:2: ( rule__Direccion__CalleAssignment_3 )
            // InternalGenerador.g:4906:3: rule__Direccion__CalleAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Direccion__CalleAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDireccionAccess().getCalleAssignment_3()); 

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
    // $ANTLR end "rule__Direccion__Group__3__Impl"


    // $ANTLR start "rule__Direccion__Group__4"
    // InternalGenerador.g:4914:1: rule__Direccion__Group__4 : rule__Direccion__Group__4__Impl rule__Direccion__Group__5 ;
    public final void rule__Direccion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:4918:1: ( rule__Direccion__Group__4__Impl rule__Direccion__Group__5 )
            // InternalGenerador.g:4919:2: rule__Direccion__Group__4__Impl rule__Direccion__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Direccion__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Direccion__Group__5();

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
    // $ANTLR end "rule__Direccion__Group__4"


    // $ANTLR start "rule__Direccion__Group__4__Impl"
    // InternalGenerador.g:4926:1: rule__Direccion__Group__4__Impl : ( ':' ) ;
    public final void rule__Direccion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:4930:1: ( ( ':' ) )
            // InternalGenerador.g:4931:1: ( ':' )
            {
            // InternalGenerador.g:4931:1: ( ':' )
            // InternalGenerador.g:4932:2: ':'
            {
             before(grammarAccess.getDireccionAccess().getColonKeyword_4()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getDireccionAccess().getColonKeyword_4()); 

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
    // $ANTLR end "rule__Direccion__Group__4__Impl"


    // $ANTLR start "rule__Direccion__Group__5"
    // InternalGenerador.g:4941:1: rule__Direccion__Group__5 : rule__Direccion__Group__5__Impl rule__Direccion__Group__6 ;
    public final void rule__Direccion__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:4945:1: ( rule__Direccion__Group__5__Impl rule__Direccion__Group__6 )
            // InternalGenerador.g:4946:2: rule__Direccion__Group__5__Impl rule__Direccion__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__Direccion__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Direccion__Group__6();

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
    // $ANTLR end "rule__Direccion__Group__5"


    // $ANTLR start "rule__Direccion__Group__5__Impl"
    // InternalGenerador.g:4953:1: rule__Direccion__Group__5__Impl : ( ( rule__Direccion__CiudadAssignment_5 ) ) ;
    public final void rule__Direccion__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:4957:1: ( ( ( rule__Direccion__CiudadAssignment_5 ) ) )
            // InternalGenerador.g:4958:1: ( ( rule__Direccion__CiudadAssignment_5 ) )
            {
            // InternalGenerador.g:4958:1: ( ( rule__Direccion__CiudadAssignment_5 ) )
            // InternalGenerador.g:4959:2: ( rule__Direccion__CiudadAssignment_5 )
            {
             before(grammarAccess.getDireccionAccess().getCiudadAssignment_5()); 
            // InternalGenerador.g:4960:2: ( rule__Direccion__CiudadAssignment_5 )
            // InternalGenerador.g:4960:3: rule__Direccion__CiudadAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Direccion__CiudadAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getDireccionAccess().getCiudadAssignment_5()); 

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
    // $ANTLR end "rule__Direccion__Group__5__Impl"


    // $ANTLR start "rule__Direccion__Group__6"
    // InternalGenerador.g:4968:1: rule__Direccion__Group__6 : rule__Direccion__Group__6__Impl rule__Direccion__Group__7 ;
    public final void rule__Direccion__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:4972:1: ( rule__Direccion__Group__6__Impl rule__Direccion__Group__7 )
            // InternalGenerador.g:4973:2: rule__Direccion__Group__6__Impl rule__Direccion__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__Direccion__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Direccion__Group__7();

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
    // $ANTLR end "rule__Direccion__Group__6"


    // $ANTLR start "rule__Direccion__Group__6__Impl"
    // InternalGenerador.g:4980:1: rule__Direccion__Group__6__Impl : ( ':' ) ;
    public final void rule__Direccion__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:4984:1: ( ( ':' ) )
            // InternalGenerador.g:4985:1: ( ':' )
            {
            // InternalGenerador.g:4985:1: ( ':' )
            // InternalGenerador.g:4986:2: ':'
            {
             before(grammarAccess.getDireccionAccess().getColonKeyword_6()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getDireccionAccess().getColonKeyword_6()); 

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
    // $ANTLR end "rule__Direccion__Group__6__Impl"


    // $ANTLR start "rule__Direccion__Group__7"
    // InternalGenerador.g:4995:1: rule__Direccion__Group__7 : rule__Direccion__Group__7__Impl rule__Direccion__Group__8 ;
    public final void rule__Direccion__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:4999:1: ( rule__Direccion__Group__7__Impl rule__Direccion__Group__8 )
            // InternalGenerador.g:5000:2: rule__Direccion__Group__7__Impl rule__Direccion__Group__8
            {
            pushFollow(FOLLOW_36);
            rule__Direccion__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Direccion__Group__8();

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
    // $ANTLR end "rule__Direccion__Group__7"


    // $ANTLR start "rule__Direccion__Group__7__Impl"
    // InternalGenerador.g:5007:1: rule__Direccion__Group__7__Impl : ( ( rule__Direccion__PaisAssignment_7 ) ) ;
    public final void rule__Direccion__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:5011:1: ( ( ( rule__Direccion__PaisAssignment_7 ) ) )
            // InternalGenerador.g:5012:1: ( ( rule__Direccion__PaisAssignment_7 ) )
            {
            // InternalGenerador.g:5012:1: ( ( rule__Direccion__PaisAssignment_7 ) )
            // InternalGenerador.g:5013:2: ( rule__Direccion__PaisAssignment_7 )
            {
             before(grammarAccess.getDireccionAccess().getPaisAssignment_7()); 
            // InternalGenerador.g:5014:2: ( rule__Direccion__PaisAssignment_7 )
            // InternalGenerador.g:5014:3: rule__Direccion__PaisAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Direccion__PaisAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getDireccionAccess().getPaisAssignment_7()); 

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
    // $ANTLR end "rule__Direccion__Group__7__Impl"


    // $ANTLR start "rule__Direccion__Group__8"
    // InternalGenerador.g:5022:1: rule__Direccion__Group__8 : rule__Direccion__Group__8__Impl ;
    public final void rule__Direccion__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:5026:1: ( rule__Direccion__Group__8__Impl )
            // InternalGenerador.g:5027:2: rule__Direccion__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Direccion__Group__8__Impl();

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
    // $ANTLR end "rule__Direccion__Group__8"


    // $ANTLR start "rule__Direccion__Group__8__Impl"
    // InternalGenerador.g:5033:1: rule__Direccion__Group__8__Impl : ( ']' ) ;
    public final void rule__Direccion__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:5037:1: ( ( ']' ) )
            // InternalGenerador.g:5038:1: ( ']' )
            {
            // InternalGenerador.g:5038:1: ( ']' )
            // InternalGenerador.g:5039:2: ']'
            {
             before(grammarAccess.getDireccionAccess().getRightSquareBracketKeyword_8()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getDireccionAccess().getRightSquareBracketKeyword_8()); 

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
    // $ANTLR end "rule__Direccion__Group__8__Impl"


    // $ANTLR start "rule__Parafarmacia__TituloAssignment_5"
    // InternalGenerador.g:5049:1: rule__Parafarmacia__TituloAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Parafarmacia__TituloAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:5053:1: ( ( RULE_STRING ) )
            // InternalGenerador.g:5054:2: ( RULE_STRING )
            {
            // InternalGenerador.g:5054:2: ( RULE_STRING )
            // InternalGenerador.g:5055:3: RULE_STRING
            {
             before(grammarAccess.getParafarmaciaAccess().getTituloSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getParafarmaciaAccess().getTituloSTRINGTerminalRuleCall_5_0()); 

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
    // $ANTLR end "rule__Parafarmacia__TituloAssignment_5"


    // $ANTLR start "rule__Parafarmacia__FuenteAssignment_7"
    // InternalGenerador.g:5064:1: rule__Parafarmacia__FuenteAssignment_7 : ( RULE_STRING ) ;
    public final void rule__Parafarmacia__FuenteAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:5068:1: ( ( RULE_STRING ) )
            // InternalGenerador.g:5069:2: ( RULE_STRING )
            {
            // InternalGenerador.g:5069:2: ( RULE_STRING )
            // InternalGenerador.g:5070:3: RULE_STRING
            {
             before(grammarAccess.getParafarmaciaAccess().getFuenteSTRINGTerminalRuleCall_7_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getParafarmaciaAccess().getFuenteSTRINGTerminalRuleCall_7_0()); 

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
    // $ANTLR end "rule__Parafarmacia__FuenteAssignment_7"


    // $ANTLR start "rule__Parafarmacia__NombreAssignment_12"
    // InternalGenerador.g:5079:1: rule__Parafarmacia__NombreAssignment_12 : ( RULE_STRING ) ;
    public final void rule__Parafarmacia__NombreAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:5083:1: ( ( RULE_STRING ) )
            // InternalGenerador.g:5084:2: ( RULE_STRING )
            {
            // InternalGenerador.g:5084:2: ( RULE_STRING )
            // InternalGenerador.g:5085:3: RULE_STRING
            {
             before(grammarAccess.getParafarmaciaAccess().getNombreSTRINGTerminalRuleCall_12_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getParafarmaciaAccess().getNombreSTRINGTerminalRuleCall_12_0()); 

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
    // $ANTLR end "rule__Parafarmacia__NombreAssignment_12"


    // $ANTLR start "rule__Parafarmacia__DireccionAssignment_14"
    // InternalGenerador.g:5094:1: rule__Parafarmacia__DireccionAssignment_14 : ( ruleDireccion ) ;
    public final void rule__Parafarmacia__DireccionAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:5098:1: ( ( ruleDireccion ) )
            // InternalGenerador.g:5099:2: ( ruleDireccion )
            {
            // InternalGenerador.g:5099:2: ( ruleDireccion )
            // InternalGenerador.g:5100:3: ruleDireccion
            {
             before(grammarAccess.getParafarmaciaAccess().getDireccionDireccionParserRuleCall_14_0()); 
            pushFollow(FOLLOW_2);
            ruleDireccion();

            state._fsp--;

             after(grammarAccess.getParafarmaciaAccess().getDireccionDireccionParserRuleCall_14_0()); 

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
    // $ANTLR end "rule__Parafarmacia__DireccionAssignment_14"


    // $ANTLR start "rule__Parafarmacia__CifAssignment_16"
    // InternalGenerador.g:5109:1: rule__Parafarmacia__CifAssignment_16 : ( RULE_STRING ) ;
    public final void rule__Parafarmacia__CifAssignment_16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:5113:1: ( ( RULE_STRING ) )
            // InternalGenerador.g:5114:2: ( RULE_STRING )
            {
            // InternalGenerador.g:5114:2: ( RULE_STRING )
            // InternalGenerador.g:5115:3: RULE_STRING
            {
             before(grammarAccess.getParafarmaciaAccess().getCifSTRINGTerminalRuleCall_16_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getParafarmaciaAccess().getCifSTRINGTerminalRuleCall_16_0()); 

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
    // $ANTLR end "rule__Parafarmacia__CifAssignment_16"


    // $ANTLR start "rule__Parafarmacia__RegistroAssignment_18"
    // InternalGenerador.g:5124:1: rule__Parafarmacia__RegistroAssignment_18 : ( ruleRegistro ) ;
    public final void rule__Parafarmacia__RegistroAssignment_18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:5128:1: ( ( ruleRegistro ) )
            // InternalGenerador.g:5129:2: ( ruleRegistro )
            {
            // InternalGenerador.g:5129:2: ( ruleRegistro )
            // InternalGenerador.g:5130:3: ruleRegistro
            {
             before(grammarAccess.getParafarmaciaAccess().getRegistroRegistroParserRuleCall_18_0()); 
            pushFollow(FOLLOW_2);
            ruleRegistro();

            state._fsp--;

             after(grammarAccess.getParafarmaciaAccess().getRegistroRegistroParserRuleCall_18_0()); 

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
    // $ANTLR end "rule__Parafarmacia__RegistroAssignment_18"


    // $ANTLR start "rule__Parafarmacia__CorreoAssignment_20"
    // InternalGenerador.g:5139:1: rule__Parafarmacia__CorreoAssignment_20 : ( ruleCorreo ) ;
    public final void rule__Parafarmacia__CorreoAssignment_20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:5143:1: ( ( ruleCorreo ) )
            // InternalGenerador.g:5144:2: ( ruleCorreo )
            {
            // InternalGenerador.g:5144:2: ( ruleCorreo )
            // InternalGenerador.g:5145:3: ruleCorreo
            {
             before(grammarAccess.getParafarmaciaAccess().getCorreoCorreoParserRuleCall_20_0()); 
            pushFollow(FOLLOW_2);
            ruleCorreo();

            state._fsp--;

             after(grammarAccess.getParafarmaciaAccess().getCorreoCorreoParserRuleCall_20_0()); 

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
    // $ANTLR end "rule__Parafarmacia__CorreoAssignment_20"


    // $ANTLR start "rule__Parafarmacia__TelefonoAssignment_22"
    // InternalGenerador.g:5154:1: rule__Parafarmacia__TelefonoAssignment_22 : ( RULE_INT ) ;
    public final void rule__Parafarmacia__TelefonoAssignment_22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:5158:1: ( ( RULE_INT ) )
            // InternalGenerador.g:5159:2: ( RULE_INT )
            {
            // InternalGenerador.g:5159:2: ( RULE_INT )
            // InternalGenerador.g:5160:3: RULE_INT
            {
             before(grammarAccess.getParafarmaciaAccess().getTelefonoINTTerminalRuleCall_22_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getParafarmaciaAccess().getTelefonoINTTerminalRuleCall_22_0()); 

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
    // $ANTLR end "rule__Parafarmacia__TelefonoAssignment_22"


    // $ANTLR start "rule__Parafarmacia__TipoAssignment_27"
    // InternalGenerador.g:5169:1: rule__Parafarmacia__TipoAssignment_27 : ( ruleTipo ) ;
    public final void rule__Parafarmacia__TipoAssignment_27() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:5173:1: ( ( ruleTipo ) )
            // InternalGenerador.g:5174:2: ( ruleTipo )
            {
            // InternalGenerador.g:5174:2: ( ruleTipo )
            // InternalGenerador.g:5175:3: ruleTipo
            {
             before(grammarAccess.getParafarmaciaAccess().getTipoTipoParserRuleCall_27_0()); 
            pushFollow(FOLLOW_2);
            ruleTipo();

            state._fsp--;

             after(grammarAccess.getParafarmaciaAccess().getTipoTipoParserRuleCall_27_0()); 

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
    // $ANTLR end "rule__Parafarmacia__TipoAssignment_27"


    // $ANTLR start "rule__Parafarmacia__AparienciaAssignment_32"
    // InternalGenerador.g:5184:1: rule__Parafarmacia__AparienciaAssignment_32 : ( ruleApariencia ) ;
    public final void rule__Parafarmacia__AparienciaAssignment_32() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:5188:1: ( ( ruleApariencia ) )
            // InternalGenerador.g:5189:2: ( ruleApariencia )
            {
            // InternalGenerador.g:5189:2: ( ruleApariencia )
            // InternalGenerador.g:5190:3: ruleApariencia
            {
             before(grammarAccess.getParafarmaciaAccess().getAparienciaAparienciaParserRuleCall_32_0()); 
            pushFollow(FOLLOW_2);
            ruleApariencia();

            state._fsp--;

             after(grammarAccess.getParafarmaciaAccess().getAparienciaAparienciaParserRuleCall_32_0()); 

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
    // $ANTLR end "rule__Parafarmacia__AparienciaAssignment_32"


    // $ANTLR start "rule__Parafarmacia__CategoriasAssignment_37"
    // InternalGenerador.g:5199:1: rule__Parafarmacia__CategoriasAssignment_37 : ( ruleCategoria ) ;
    public final void rule__Parafarmacia__CategoriasAssignment_37() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:5203:1: ( ( ruleCategoria ) )
            // InternalGenerador.g:5204:2: ( ruleCategoria )
            {
            // InternalGenerador.g:5204:2: ( ruleCategoria )
            // InternalGenerador.g:5205:3: ruleCategoria
            {
             before(grammarAccess.getParafarmaciaAccess().getCategoriasCategoriaParserRuleCall_37_0()); 
            pushFollow(FOLLOW_2);
            ruleCategoria();

            state._fsp--;

             after(grammarAccess.getParafarmaciaAccess().getCategoriasCategoriaParserRuleCall_37_0()); 

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
    // $ANTLR end "rule__Parafarmacia__CategoriasAssignment_37"


    // $ANTLR start "rule__Parafarmacia__NumProductosPorFilaAssignment_42"
    // InternalGenerador.g:5214:1: rule__Parafarmacia__NumProductosPorFilaAssignment_42 : ( RULE_INT ) ;
    public final void rule__Parafarmacia__NumProductosPorFilaAssignment_42() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:5218:1: ( ( RULE_INT ) )
            // InternalGenerador.g:5219:2: ( RULE_INT )
            {
            // InternalGenerador.g:5219:2: ( RULE_INT )
            // InternalGenerador.g:5220:3: RULE_INT
            {
             before(grammarAccess.getParafarmaciaAccess().getNumProductosPorFilaINTTerminalRuleCall_42_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getParafarmaciaAccess().getNumProductosPorFilaINTTerminalRuleCall_42_0()); 

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
    // $ANTLR end "rule__Parafarmacia__NumProductosPorFilaAssignment_42"


    // $ANTLR start "rule__Parafarmacia__ProductosAssignment_43"
    // InternalGenerador.g:5229:1: rule__Parafarmacia__ProductosAssignment_43 : ( ruleProducto ) ;
    public final void rule__Parafarmacia__ProductosAssignment_43() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:5233:1: ( ( ruleProducto ) )
            // InternalGenerador.g:5234:2: ( ruleProducto )
            {
            // InternalGenerador.g:5234:2: ( ruleProducto )
            // InternalGenerador.g:5235:3: ruleProducto
            {
             before(grammarAccess.getParafarmaciaAccess().getProductosProductoParserRuleCall_43_0()); 
            pushFollow(FOLLOW_2);
            ruleProducto();

            state._fsp--;

             after(grammarAccess.getParafarmaciaAccess().getProductosProductoParserRuleCall_43_0()); 

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
    // $ANTLR end "rule__Parafarmacia__ProductosAssignment_43"


    // $ANTLR start "rule__Parafarmacia__NombreUsuarioAssignment_48"
    // InternalGenerador.g:5244:1: rule__Parafarmacia__NombreUsuarioAssignment_48 : ( RULE_STRING ) ;
    public final void rule__Parafarmacia__NombreUsuarioAssignment_48() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:5248:1: ( ( RULE_STRING ) )
            // InternalGenerador.g:5249:2: ( RULE_STRING )
            {
            // InternalGenerador.g:5249:2: ( RULE_STRING )
            // InternalGenerador.g:5250:3: RULE_STRING
            {
             before(grammarAccess.getParafarmaciaAccess().getNombreUsuarioSTRINGTerminalRuleCall_48_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getParafarmaciaAccess().getNombreUsuarioSTRINGTerminalRuleCall_48_0()); 

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
    // $ANTLR end "rule__Parafarmacia__NombreUsuarioAssignment_48"


    // $ANTLR start "rule__Parafarmacia__EmailAssignment_50"
    // InternalGenerador.g:5259:1: rule__Parafarmacia__EmailAssignment_50 : ( ruleCorreo ) ;
    public final void rule__Parafarmacia__EmailAssignment_50() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:5263:1: ( ( ruleCorreo ) )
            // InternalGenerador.g:5264:2: ( ruleCorreo )
            {
            // InternalGenerador.g:5264:2: ( ruleCorreo )
            // InternalGenerador.g:5265:3: ruleCorreo
            {
             before(grammarAccess.getParafarmaciaAccess().getEmailCorreoParserRuleCall_50_0()); 
            pushFollow(FOLLOW_2);
            ruleCorreo();

            state._fsp--;

             after(grammarAccess.getParafarmaciaAccess().getEmailCorreoParserRuleCall_50_0()); 

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
    // $ANTLR end "rule__Parafarmacia__EmailAssignment_50"


    // $ANTLR start "rule__Parafarmacia__PasswordAssignment_52"
    // InternalGenerador.g:5274:1: rule__Parafarmacia__PasswordAssignment_52 : ( RULE_STRING ) ;
    public final void rule__Parafarmacia__PasswordAssignment_52() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:5278:1: ( ( RULE_STRING ) )
            // InternalGenerador.g:5279:2: ( RULE_STRING )
            {
            // InternalGenerador.g:5279:2: ( RULE_STRING )
            // InternalGenerador.g:5280:3: RULE_STRING
            {
             before(grammarAccess.getParafarmaciaAccess().getPasswordSTRINGTerminalRuleCall_52_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getParafarmaciaAccess().getPasswordSTRINGTerminalRuleCall_52_0()); 

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
    // $ANTLR end "rule__Parafarmacia__PasswordAssignment_52"


    // $ANTLR start "rule__Apariencia__PrincipalAssignment_5"
    // InternalGenerador.g:5289:1: rule__Apariencia__PrincipalAssignment_5 : ( ruleColor ) ;
    public final void rule__Apariencia__PrincipalAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:5293:1: ( ( ruleColor ) )
            // InternalGenerador.g:5294:2: ( ruleColor )
            {
            // InternalGenerador.g:5294:2: ( ruleColor )
            // InternalGenerador.g:5295:3: ruleColor
            {
             before(grammarAccess.getAparienciaAccess().getPrincipalColorParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleColor();

            state._fsp--;

             after(grammarAccess.getAparienciaAccess().getPrincipalColorParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Apariencia__PrincipalAssignment_5"


    // $ANTLR start "rule__Apariencia__PrincipalClaroAssignment_9"
    // InternalGenerador.g:5304:1: rule__Apariencia__PrincipalClaroAssignment_9 : ( ruleColor ) ;
    public final void rule__Apariencia__PrincipalClaroAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:5308:1: ( ( ruleColor ) )
            // InternalGenerador.g:5309:2: ( ruleColor )
            {
            // InternalGenerador.g:5309:2: ( ruleColor )
            // InternalGenerador.g:5310:3: ruleColor
            {
             before(grammarAccess.getAparienciaAccess().getPrincipalClaroColorParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleColor();

            state._fsp--;

             after(grammarAccess.getAparienciaAccess().getPrincipalClaroColorParserRuleCall_9_0()); 

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
    // $ANTLR end "rule__Apariencia__PrincipalClaroAssignment_9"


    // $ANTLR start "rule__Apariencia__SecundarioAssignment_13"
    // InternalGenerador.g:5319:1: rule__Apariencia__SecundarioAssignment_13 : ( ruleColor ) ;
    public final void rule__Apariencia__SecundarioAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:5323:1: ( ( ruleColor ) )
            // InternalGenerador.g:5324:2: ( ruleColor )
            {
            // InternalGenerador.g:5324:2: ( ruleColor )
            // InternalGenerador.g:5325:3: ruleColor
            {
             before(grammarAccess.getAparienciaAccess().getSecundarioColorParserRuleCall_13_0()); 
            pushFollow(FOLLOW_2);
            ruleColor();

            state._fsp--;

             after(grammarAccess.getAparienciaAccess().getSecundarioColorParserRuleCall_13_0()); 

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
    // $ANTLR end "rule__Apariencia__SecundarioAssignment_13"


    // $ANTLR start "rule__Apariencia__FondoAssignment_17"
    // InternalGenerador.g:5334:1: rule__Apariencia__FondoAssignment_17 : ( ruleColor ) ;
    public final void rule__Apariencia__FondoAssignment_17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:5338:1: ( ( ruleColor ) )
            // InternalGenerador.g:5339:2: ( ruleColor )
            {
            // InternalGenerador.g:5339:2: ( ruleColor )
            // InternalGenerador.g:5340:3: ruleColor
            {
             before(grammarAccess.getAparienciaAccess().getFondoColorParserRuleCall_17_0()); 
            pushFollow(FOLLOW_2);
            ruleColor();

            state._fsp--;

             after(grammarAccess.getAparienciaAccess().getFondoColorParserRuleCall_17_0()); 

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
    // $ANTLR end "rule__Apariencia__FondoAssignment_17"


    // $ANTLR start "rule__Apariencia__FondoProductosAssignment_21"
    // InternalGenerador.g:5349:1: rule__Apariencia__FondoProductosAssignment_21 : ( ruleColor ) ;
    public final void rule__Apariencia__FondoProductosAssignment_21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:5353:1: ( ( ruleColor ) )
            // InternalGenerador.g:5354:2: ( ruleColor )
            {
            // InternalGenerador.g:5354:2: ( ruleColor )
            // InternalGenerador.g:5355:3: ruleColor
            {
             before(grammarAccess.getAparienciaAccess().getFondoProductosColorParserRuleCall_21_0()); 
            pushFollow(FOLLOW_2);
            ruleColor();

            state._fsp--;

             after(grammarAccess.getAparienciaAccess().getFondoProductosColorParserRuleCall_21_0()); 

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
    // $ANTLR end "rule__Apariencia__FondoProductosAssignment_21"


    // $ANTLR start "rule__Apariencia__PreciosAssignment_25"
    // InternalGenerador.g:5364:1: rule__Apariencia__PreciosAssignment_25 : ( ruleColor ) ;
    public final void rule__Apariencia__PreciosAssignment_25() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:5368:1: ( ( ruleColor ) )
            // InternalGenerador.g:5369:2: ( ruleColor )
            {
            // InternalGenerador.g:5369:2: ( ruleColor )
            // InternalGenerador.g:5370:3: ruleColor
            {
             before(grammarAccess.getAparienciaAccess().getPreciosColorParserRuleCall_25_0()); 
            pushFollow(FOLLOW_2);
            ruleColor();

            state._fsp--;

             after(grammarAccess.getAparienciaAccess().getPreciosColorParserRuleCall_25_0()); 

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
    // $ANTLR end "rule__Apariencia__PreciosAssignment_25"


    // $ANTLR start "rule__Apariencia__TextoAssignment_29"
    // InternalGenerador.g:5379:1: rule__Apariencia__TextoAssignment_29 : ( ruleColor ) ;
    public final void rule__Apariencia__TextoAssignment_29() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:5383:1: ( ( ruleColor ) )
            // InternalGenerador.g:5384:2: ( ruleColor )
            {
            // InternalGenerador.g:5384:2: ( ruleColor )
            // InternalGenerador.g:5385:3: ruleColor
            {
             before(grammarAccess.getAparienciaAccess().getTextoColorParserRuleCall_29_0()); 
            pushFollow(FOLLOW_2);
            ruleColor();

            state._fsp--;

             after(grammarAccess.getAparienciaAccess().getTextoColorParserRuleCall_29_0()); 

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
    // $ANTLR end "rule__Apariencia__TextoAssignment_29"


    // $ANTLR start "rule__Apariencia__TituloColorAssignment_33"
    // InternalGenerador.g:5394:1: rule__Apariencia__TituloColorAssignment_33 : ( ruleColor ) ;
    public final void rule__Apariencia__TituloColorAssignment_33() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:5398:1: ( ( ruleColor ) )
            // InternalGenerador.g:5399:2: ( ruleColor )
            {
            // InternalGenerador.g:5399:2: ( ruleColor )
            // InternalGenerador.g:5400:3: ruleColor
            {
             before(grammarAccess.getAparienciaAccess().getTituloColorColorParserRuleCall_33_0()); 
            pushFollow(FOLLOW_2);
            ruleColor();

            state._fsp--;

             after(grammarAccess.getAparienciaAccess().getTituloColorColorParserRuleCall_33_0()); 

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
    // $ANTLR end "rule__Apariencia__TituloColorAssignment_33"


    // $ANTLR start "rule__Apariencia__NormalAssignment_40"
    // InternalGenerador.g:5409:1: rule__Apariencia__NormalAssignment_40 : ( ruleMedida ) ;
    public final void rule__Apariencia__NormalAssignment_40() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:5413:1: ( ( ruleMedida ) )
            // InternalGenerador.g:5414:2: ( ruleMedida )
            {
            // InternalGenerador.g:5414:2: ( ruleMedida )
            // InternalGenerador.g:5415:3: ruleMedida
            {
             before(grammarAccess.getAparienciaAccess().getNormalMedidaParserRuleCall_40_0()); 
            pushFollow(FOLLOW_2);
            ruleMedida();

            state._fsp--;

             after(grammarAccess.getAparienciaAccess().getNormalMedidaParserRuleCall_40_0()); 

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
    // $ANTLR end "rule__Apariencia__NormalAssignment_40"


    // $ANTLR start "rule__Apariencia__GrandeAssignment_44"
    // InternalGenerador.g:5424:1: rule__Apariencia__GrandeAssignment_44 : ( ruleMedida ) ;
    public final void rule__Apariencia__GrandeAssignment_44() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:5428:1: ( ( ruleMedida ) )
            // InternalGenerador.g:5429:2: ( ruleMedida )
            {
            // InternalGenerador.g:5429:2: ( ruleMedida )
            // InternalGenerador.g:5430:3: ruleMedida
            {
             before(grammarAccess.getAparienciaAccess().getGrandeMedidaParserRuleCall_44_0()); 
            pushFollow(FOLLOW_2);
            ruleMedida();

            state._fsp--;

             after(grammarAccess.getAparienciaAccess().getGrandeMedidaParserRuleCall_44_0()); 

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
    // $ANTLR end "rule__Apariencia__GrandeAssignment_44"


    // $ANTLR start "rule__Apariencia__TituloAssignment_48"
    // InternalGenerador.g:5439:1: rule__Apariencia__TituloAssignment_48 : ( ruleMedida ) ;
    public final void rule__Apariencia__TituloAssignment_48() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:5443:1: ( ( ruleMedida ) )
            // InternalGenerador.g:5444:2: ( ruleMedida )
            {
            // InternalGenerador.g:5444:2: ( ruleMedida )
            // InternalGenerador.g:5445:3: ruleMedida
            {
             before(grammarAccess.getAparienciaAccess().getTituloMedidaParserRuleCall_48_0()); 
            pushFollow(FOLLOW_2);
            ruleMedida();

            state._fsp--;

             after(grammarAccess.getAparienciaAccess().getTituloMedidaParserRuleCall_48_0()); 

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
    // $ANTLR end "rule__Apariencia__TituloAssignment_48"


    // $ANTLR start "rule__Apariencia__MenuAssignment_52"
    // InternalGenerador.g:5454:1: rule__Apariencia__MenuAssignment_52 : ( ruleMedida ) ;
    public final void rule__Apariencia__MenuAssignment_52() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:5458:1: ( ( ruleMedida ) )
            // InternalGenerador.g:5459:2: ( ruleMedida )
            {
            // InternalGenerador.g:5459:2: ( ruleMedida )
            // InternalGenerador.g:5460:3: ruleMedida
            {
             before(grammarAccess.getAparienciaAccess().getMenuMedidaParserRuleCall_52_0()); 
            pushFollow(FOLLOW_2);
            ruleMedida();

            state._fsp--;

             after(grammarAccess.getAparienciaAccess().getMenuMedidaParserRuleCall_52_0()); 

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
    // $ANTLR end "rule__Apariencia__MenuAssignment_52"


    // $ANTLR start "rule__Apariencia__LateralAssignment_57"
    // InternalGenerador.g:5469:1: rule__Apariencia__LateralAssignment_57 : ( ruleMedida ) ;
    public final void rule__Apariencia__LateralAssignment_57() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:5473:1: ( ( ruleMedida ) )
            // InternalGenerador.g:5474:2: ( ruleMedida )
            {
            // InternalGenerador.g:5474:2: ( ruleMedida )
            // InternalGenerador.g:5475:3: ruleMedida
            {
             before(grammarAccess.getAparienciaAccess().getLateralMedidaParserRuleCall_57_0()); 
            pushFollow(FOLLOW_2);
            ruleMedida();

            state._fsp--;

             after(grammarAccess.getAparienciaAccess().getLateralMedidaParserRuleCall_57_0()); 

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
    // $ANTLR end "rule__Apariencia__LateralAssignment_57"


    // $ANTLR start "rule__Producto__NombreProductoAssignment_3"
    // InternalGenerador.g:5484:1: rule__Producto__NombreProductoAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Producto__NombreProductoAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:5488:1: ( ( RULE_STRING ) )
            // InternalGenerador.g:5489:2: ( RULE_STRING )
            {
            // InternalGenerador.g:5489:2: ( RULE_STRING )
            // InternalGenerador.g:5490:3: RULE_STRING
            {
             before(grammarAccess.getProductoAccess().getNombreProductoSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getProductoAccess().getNombreProductoSTRINGTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Producto__NombreProductoAssignment_3"


    // $ANTLR start "rule__Producto__DescripcionAssignment_5"
    // InternalGenerador.g:5499:1: rule__Producto__DescripcionAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Producto__DescripcionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:5503:1: ( ( RULE_STRING ) )
            // InternalGenerador.g:5504:2: ( RULE_STRING )
            {
            // InternalGenerador.g:5504:2: ( RULE_STRING )
            // InternalGenerador.g:5505:3: RULE_STRING
            {
             before(grammarAccess.getProductoAccess().getDescripcionSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getProductoAccess().getDescripcionSTRINGTerminalRuleCall_5_0()); 

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
    // $ANTLR end "rule__Producto__DescripcionAssignment_5"


    // $ANTLR start "rule__Producto__PrecioAssignment_7"
    // InternalGenerador.g:5514:1: rule__Producto__PrecioAssignment_7 : ( rulePrecio ) ;
    public final void rule__Producto__PrecioAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:5518:1: ( ( rulePrecio ) )
            // InternalGenerador.g:5519:2: ( rulePrecio )
            {
            // InternalGenerador.g:5519:2: ( rulePrecio )
            // InternalGenerador.g:5520:3: rulePrecio
            {
             before(grammarAccess.getProductoAccess().getPrecioPrecioParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            rulePrecio();

            state._fsp--;

             after(grammarAccess.getProductoAccess().getPrecioPrecioParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__Producto__PrecioAssignment_7"


    // $ANTLR start "rule__Producto__CantidadAssignment_9"
    // InternalGenerador.g:5529:1: rule__Producto__CantidadAssignment_9 : ( RULE_INT ) ;
    public final void rule__Producto__CantidadAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:5533:1: ( ( RULE_INT ) )
            // InternalGenerador.g:5534:2: ( RULE_INT )
            {
            // InternalGenerador.g:5534:2: ( RULE_INT )
            // InternalGenerador.g:5535:3: RULE_INT
            {
             before(grammarAccess.getProductoAccess().getCantidadINTTerminalRuleCall_9_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getProductoAccess().getCantidadINTTerminalRuleCall_9_0()); 

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
    // $ANTLR end "rule__Producto__CantidadAssignment_9"


    // $ANTLR start "rule__Producto__CategoriaAssignment_11"
    // InternalGenerador.g:5544:1: rule__Producto__CategoriaAssignment_11 : ( ruleCategoria ) ;
    public final void rule__Producto__CategoriaAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:5548:1: ( ( ruleCategoria ) )
            // InternalGenerador.g:5549:2: ( ruleCategoria )
            {
            // InternalGenerador.g:5549:2: ( ruleCategoria )
            // InternalGenerador.g:5550:3: ruleCategoria
            {
             before(grammarAccess.getProductoAccess().getCategoriaCategoriaParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            ruleCategoria();

            state._fsp--;

             after(grammarAccess.getProductoAccess().getCategoriaCategoriaParserRuleCall_11_0()); 

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
    // $ANTLR end "rule__Producto__CategoriaAssignment_11"


    // $ANTLR start "rule__Tipo__DesplegableAssignment_0"
    // InternalGenerador.g:5559:1: rule__Tipo__DesplegableAssignment_0 : ( ruleDesplegable ) ;
    public final void rule__Tipo__DesplegableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:5563:1: ( ( ruleDesplegable ) )
            // InternalGenerador.g:5564:2: ( ruleDesplegable )
            {
            // InternalGenerador.g:5564:2: ( ruleDesplegable )
            // InternalGenerador.g:5565:3: ruleDesplegable
            {
             before(grammarAccess.getTipoAccess().getDesplegableDesplegableParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDesplegable();

            state._fsp--;

             after(grammarAccess.getTipoAccess().getDesplegableDesplegableParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Tipo__DesplegableAssignment_0"


    // $ANTLR start "rule__Tipo__PermanenteAssignment_1"
    // InternalGenerador.g:5574:1: rule__Tipo__PermanenteAssignment_1 : ( rulePermanente ) ;
    public final void rule__Tipo__PermanenteAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:5578:1: ( ( rulePermanente ) )
            // InternalGenerador.g:5579:2: ( rulePermanente )
            {
            // InternalGenerador.g:5579:2: ( rulePermanente )
            // InternalGenerador.g:5580:3: rulePermanente
            {
             before(grammarAccess.getTipoAccess().getPermanentePermanenteParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePermanente();

            state._fsp--;

             after(grammarAccess.getTipoAccess().getPermanentePermanenteParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Tipo__PermanenteAssignment_1"


    // $ANTLR start "rule__Desplegable__ColorAssignment_2"
    // InternalGenerador.g:5589:1: rule__Desplegable__ColorAssignment_2 : ( ruleColor ) ;
    public final void rule__Desplegable__ColorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:5593:1: ( ( ruleColor ) )
            // InternalGenerador.g:5594:2: ( ruleColor )
            {
            // InternalGenerador.g:5594:2: ( ruleColor )
            // InternalGenerador.g:5595:3: ruleColor
            {
             before(grammarAccess.getDesplegableAccess().getColorColorParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleColor();

            state._fsp--;

             after(grammarAccess.getDesplegableAccess().getColorColorParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Desplegable__ColorAssignment_2"


    // $ANTLR start "rule__Permanente__ColorAssignment_2"
    // InternalGenerador.g:5604:1: rule__Permanente__ColorAssignment_2 : ( ruleColor ) ;
    public final void rule__Permanente__ColorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:5608:1: ( ( ruleColor ) )
            // InternalGenerador.g:5609:2: ( ruleColor )
            {
            // InternalGenerador.g:5609:2: ( ruleColor )
            // InternalGenerador.g:5610:3: ruleColor
            {
             before(grammarAccess.getPermanenteAccess().getColorColorParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleColor();

            state._fsp--;

             after(grammarAccess.getPermanenteAccess().getColorColorParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Permanente__ColorAssignment_2"


    // $ANTLR start "rule__Permanente__AlturaAssignment_4"
    // InternalGenerador.g:5619:1: rule__Permanente__AlturaAssignment_4 : ( ruleMedida ) ;
    public final void rule__Permanente__AlturaAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:5623:1: ( ( ruleMedida ) )
            // InternalGenerador.g:5624:2: ( ruleMedida )
            {
            // InternalGenerador.g:5624:2: ( ruleMedida )
            // InternalGenerador.g:5625:3: ruleMedida
            {
             before(grammarAccess.getPermanenteAccess().getAlturaMedidaParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleMedida();

            state._fsp--;

             after(grammarAccess.getPermanenteAccess().getAlturaMedidaParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Permanente__AlturaAssignment_4"


    // $ANTLR start "rule__Registro__TomoAssignment_3"
    // InternalGenerador.g:5634:1: rule__Registro__TomoAssignment_3 : ( RULE_INT ) ;
    public final void rule__Registro__TomoAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:5638:1: ( ( RULE_INT ) )
            // InternalGenerador.g:5639:2: ( RULE_INT )
            {
            // InternalGenerador.g:5639:2: ( RULE_INT )
            // InternalGenerador.g:5640:3: RULE_INT
            {
             before(grammarAccess.getRegistroAccess().getTomoINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getRegistroAccess().getTomoINTTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Registro__TomoAssignment_3"


    // $ANTLR start "rule__Registro__FolioAssignment_5"
    // InternalGenerador.g:5649:1: rule__Registro__FolioAssignment_5 : ( RULE_INT ) ;
    public final void rule__Registro__FolioAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:5653:1: ( ( RULE_INT ) )
            // InternalGenerador.g:5654:2: ( RULE_INT )
            {
            // InternalGenerador.g:5654:2: ( RULE_INT )
            // InternalGenerador.g:5655:3: RULE_INT
            {
             before(grammarAccess.getRegistroAccess().getFolioINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getRegistroAccess().getFolioINTTerminalRuleCall_5_0()); 

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
    // $ANTLR end "rule__Registro__FolioAssignment_5"


    // $ANTLR start "rule__Registro__SeccionAssignment_7"
    // InternalGenerador.g:5664:1: rule__Registro__SeccionAssignment_7 : ( RULE_INT ) ;
    public final void rule__Registro__SeccionAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:5668:1: ( ( RULE_INT ) )
            // InternalGenerador.g:5669:2: ( RULE_INT )
            {
            // InternalGenerador.g:5669:2: ( RULE_INT )
            // InternalGenerador.g:5670:3: RULE_INT
            {
             before(grammarAccess.getRegistroAccess().getSeccionINTTerminalRuleCall_7_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getRegistroAccess().getSeccionINTTerminalRuleCall_7_0()); 

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
    // $ANTLR end "rule__Registro__SeccionAssignment_7"


    // $ANTLR start "rule__Registro__HojaAssignment_9"
    // InternalGenerador.g:5679:1: rule__Registro__HojaAssignment_9 : ( RULE_INT ) ;
    public final void rule__Registro__HojaAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:5683:1: ( ( RULE_INT ) )
            // InternalGenerador.g:5684:2: ( RULE_INT )
            {
            // InternalGenerador.g:5684:2: ( RULE_INT )
            // InternalGenerador.g:5685:3: RULE_INT
            {
             before(grammarAccess.getRegistroAccess().getHojaINTTerminalRuleCall_9_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getRegistroAccess().getHojaINTTerminalRuleCall_9_0()); 

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
    // $ANTLR end "rule__Registro__HojaAssignment_9"


    // $ANTLR start "rule__Direccion__CalleAssignment_3"
    // InternalGenerador.g:5694:1: rule__Direccion__CalleAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Direccion__CalleAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:5698:1: ( ( RULE_STRING ) )
            // InternalGenerador.g:5699:2: ( RULE_STRING )
            {
            // InternalGenerador.g:5699:2: ( RULE_STRING )
            // InternalGenerador.g:5700:3: RULE_STRING
            {
             before(grammarAccess.getDireccionAccess().getCalleSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDireccionAccess().getCalleSTRINGTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Direccion__CalleAssignment_3"


    // $ANTLR start "rule__Direccion__CiudadAssignment_5"
    // InternalGenerador.g:5709:1: rule__Direccion__CiudadAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Direccion__CiudadAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:5713:1: ( ( RULE_STRING ) )
            // InternalGenerador.g:5714:2: ( RULE_STRING )
            {
            // InternalGenerador.g:5714:2: ( RULE_STRING )
            // InternalGenerador.g:5715:3: RULE_STRING
            {
             before(grammarAccess.getDireccionAccess().getCiudadSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDireccionAccess().getCiudadSTRINGTerminalRuleCall_5_0()); 

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
    // $ANTLR end "rule__Direccion__CiudadAssignment_5"


    // $ANTLR start "rule__Direccion__PaisAssignment_7"
    // InternalGenerador.g:5724:1: rule__Direccion__PaisAssignment_7 : ( RULE_STRING ) ;
    public final void rule__Direccion__PaisAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:5728:1: ( ( RULE_STRING ) )
            // InternalGenerador.g:5729:2: ( RULE_STRING )
            {
            // InternalGenerador.g:5729:2: ( RULE_STRING )
            // InternalGenerador.g:5730:3: RULE_STRING
            {
             before(grammarAccess.getDireccionAccess().getPaisSTRINGTerminalRuleCall_7_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDireccionAccess().getPaisSTRINGTerminalRuleCall_7_0()); 

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
    // $ANTLR end "rule__Direccion__PaisAssignment_7"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000000040F800L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000000000F802L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040400000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x000000000000F800L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0080000000000000L});

}