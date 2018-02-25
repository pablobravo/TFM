package org.xtext.dsl.parafarmacia.ide.contentassist.antlr.internal;

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
import org.xtext.dsl.parafarmacia.services.ParafarmaciaGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalParafarmaciaParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Parafarmacia'", "'{'", "'Titulo'", "'='", "';'", "'Descripcion'", "'Paginas'", "'}'", "'Color'", "'FondoPrincipal'", "'FondoSecundario'", "'Texto'", "'Fuente'", "'SizeH1'", "'px'", "'SizeH2'", "'Cuerpo'", "'Size'", "'Pagina'", "'Producto'", "'imagen'", "'descripcion'", "'.'", "'#'", "'con receta'"
    };
    public static final int RULE_STRING=6;
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
    public static final int RULE_ID=4;
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

    	public void setGrammarAccess(ParafarmaciaGrammarAccess grammarAccess) {
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
    // InternalParafarmacia.g:53:1: entryRuleParafarmacia : ruleParafarmacia EOF ;
    public final void entryRuleParafarmacia() throws RecognitionException {
        try {
            // InternalParafarmacia.g:54:1: ( ruleParafarmacia EOF )
            // InternalParafarmacia.g:55:1: ruleParafarmacia EOF
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
    // InternalParafarmacia.g:62:1: ruleParafarmacia : ( ( rule__Parafarmacia__Group__0 ) ) ;
    public final void ruleParafarmacia() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:66:2: ( ( ( rule__Parafarmacia__Group__0 ) ) )
            // InternalParafarmacia.g:67:2: ( ( rule__Parafarmacia__Group__0 ) )
            {
            // InternalParafarmacia.g:67:2: ( ( rule__Parafarmacia__Group__0 ) )
            // InternalParafarmacia.g:68:3: ( rule__Parafarmacia__Group__0 )
            {
             before(grammarAccess.getParafarmaciaAccess().getGroup()); 
            // InternalParafarmacia.g:69:3: ( rule__Parafarmacia__Group__0 )
            // InternalParafarmacia.g:69:4: rule__Parafarmacia__Group__0
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
    // InternalParafarmacia.g:78:1: entryRuleApariencia : ruleApariencia EOF ;
    public final void entryRuleApariencia() throws RecognitionException {
        try {
            // InternalParafarmacia.g:79:1: ( ruleApariencia EOF )
            // InternalParafarmacia.g:80:1: ruleApariencia EOF
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
    // InternalParafarmacia.g:87:1: ruleApariencia : ( ( rule__Apariencia__Group__0 ) ) ;
    public final void ruleApariencia() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:91:2: ( ( ( rule__Apariencia__Group__0 ) ) )
            // InternalParafarmacia.g:92:2: ( ( rule__Apariencia__Group__0 ) )
            {
            // InternalParafarmacia.g:92:2: ( ( rule__Apariencia__Group__0 ) )
            // InternalParafarmacia.g:93:3: ( rule__Apariencia__Group__0 )
            {
             before(grammarAccess.getAparienciaAccess().getGroup()); 
            // InternalParafarmacia.g:94:3: ( rule__Apariencia__Group__0 )
            // InternalParafarmacia.g:94:4: rule__Apariencia__Group__0
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


    // $ANTLR start "entryRulePagina"
    // InternalParafarmacia.g:103:1: entryRulePagina : rulePagina EOF ;
    public final void entryRulePagina() throws RecognitionException {
        try {
            // InternalParafarmacia.g:104:1: ( rulePagina EOF )
            // InternalParafarmacia.g:105:1: rulePagina EOF
            {
             before(grammarAccess.getPaginaRule()); 
            pushFollow(FOLLOW_1);
            rulePagina();

            state._fsp--;

             after(grammarAccess.getPaginaRule()); 
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
    // $ANTLR end "entryRulePagina"


    // $ANTLR start "rulePagina"
    // InternalParafarmacia.g:112:1: rulePagina : ( ( rule__Pagina__Group__0 ) ) ;
    public final void rulePagina() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:116:2: ( ( ( rule__Pagina__Group__0 ) ) )
            // InternalParafarmacia.g:117:2: ( ( rule__Pagina__Group__0 ) )
            {
            // InternalParafarmacia.g:117:2: ( ( rule__Pagina__Group__0 ) )
            // InternalParafarmacia.g:118:3: ( rule__Pagina__Group__0 )
            {
             before(grammarAccess.getPaginaAccess().getGroup()); 
            // InternalParafarmacia.g:119:3: ( rule__Pagina__Group__0 )
            // InternalParafarmacia.g:119:4: rule__Pagina__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Pagina__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPaginaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePagina"


    // $ANTLR start "entryRuleCuerpo"
    // InternalParafarmacia.g:128:1: entryRuleCuerpo : ruleCuerpo EOF ;
    public final void entryRuleCuerpo() throws RecognitionException {
        try {
            // InternalParafarmacia.g:129:1: ( ruleCuerpo EOF )
            // InternalParafarmacia.g:130:1: ruleCuerpo EOF
            {
             before(grammarAccess.getCuerpoRule()); 
            pushFollow(FOLLOW_1);
            ruleCuerpo();

            state._fsp--;

             after(grammarAccess.getCuerpoRule()); 
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
    // $ANTLR end "entryRuleCuerpo"


    // $ANTLR start "ruleCuerpo"
    // InternalParafarmacia.g:137:1: ruleCuerpo : ( ( rule__Cuerpo__Alternatives ) ) ;
    public final void ruleCuerpo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:141:2: ( ( ( rule__Cuerpo__Alternatives ) ) )
            // InternalParafarmacia.g:142:2: ( ( rule__Cuerpo__Alternatives ) )
            {
            // InternalParafarmacia.g:142:2: ( ( rule__Cuerpo__Alternatives ) )
            // InternalParafarmacia.g:143:3: ( rule__Cuerpo__Alternatives )
            {
             before(grammarAccess.getCuerpoAccess().getAlternatives()); 
            // InternalParafarmacia.g:144:3: ( rule__Cuerpo__Alternatives )
            // InternalParafarmacia.g:144:4: rule__Cuerpo__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Cuerpo__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCuerpoAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCuerpo"


    // $ANTLR start "entryRuleProducto"
    // InternalParafarmacia.g:153:1: entryRuleProducto : ruleProducto EOF ;
    public final void entryRuleProducto() throws RecognitionException {
        try {
            // InternalParafarmacia.g:154:1: ( ruleProducto EOF )
            // InternalParafarmacia.g:155:1: ruleProducto EOF
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
    // InternalParafarmacia.g:162:1: ruleProducto : ( ( rule__Producto__Group__0 ) ) ;
    public final void ruleProducto() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:166:2: ( ( ( rule__Producto__Group__0 ) ) )
            // InternalParafarmacia.g:167:2: ( ( rule__Producto__Group__0 ) )
            {
            // InternalParafarmacia.g:167:2: ( ( rule__Producto__Group__0 ) )
            // InternalParafarmacia.g:168:3: ( rule__Producto__Group__0 )
            {
             before(grammarAccess.getProductoAccess().getGroup()); 
            // InternalParafarmacia.g:169:3: ( rule__Producto__Group__0 )
            // InternalParafarmacia.g:169:4: rule__Producto__Group__0
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
    // InternalParafarmacia.g:178:1: entryRulePrecio : rulePrecio EOF ;
    public final void entryRulePrecio() throws RecognitionException {
        try {
            // InternalParafarmacia.g:179:1: ( rulePrecio EOF )
            // InternalParafarmacia.g:180:1: rulePrecio EOF
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
    // InternalParafarmacia.g:187:1: rulePrecio : ( ( rule__Precio__Group__0 ) ) ;
    public final void rulePrecio() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:191:2: ( ( ( rule__Precio__Group__0 ) ) )
            // InternalParafarmacia.g:192:2: ( ( rule__Precio__Group__0 ) )
            {
            // InternalParafarmacia.g:192:2: ( ( rule__Precio__Group__0 ) )
            // InternalParafarmacia.g:193:3: ( rule__Precio__Group__0 )
            {
             before(grammarAccess.getPrecioAccess().getGroup()); 
            // InternalParafarmacia.g:194:3: ( rule__Precio__Group__0 )
            // InternalParafarmacia.g:194:4: rule__Precio__Group__0
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


    // $ANTLR start "entryRuleColor"
    // InternalParafarmacia.g:203:1: entryRuleColor : ruleColor EOF ;
    public final void entryRuleColor() throws RecognitionException {
        try {
            // InternalParafarmacia.g:204:1: ( ruleColor EOF )
            // InternalParafarmacia.g:205:1: ruleColor EOF
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
    // InternalParafarmacia.g:212:1: ruleColor : ( ( rule__Color__Group__0 ) ) ;
    public final void ruleColor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:216:2: ( ( ( rule__Color__Group__0 ) ) )
            // InternalParafarmacia.g:217:2: ( ( rule__Color__Group__0 ) )
            {
            // InternalParafarmacia.g:217:2: ( ( rule__Color__Group__0 ) )
            // InternalParafarmacia.g:218:3: ( rule__Color__Group__0 )
            {
             before(grammarAccess.getColorAccess().getGroup()); 
            // InternalParafarmacia.g:219:3: ( rule__Color__Group__0 )
            // InternalParafarmacia.g:219:4: rule__Color__Group__0
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


    // $ANTLR start "rule__Cuerpo__Alternatives"
    // InternalParafarmacia.g:227:1: rule__Cuerpo__Alternatives : ( ( ( rule__Cuerpo__Group_0__0 ) ) | ( ( rule__Cuerpo__ProductosAssignment_1 )* ) );
    public final void rule__Cuerpo__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:231:1: ( ( ( rule__Cuerpo__Group_0__0 ) ) | ( ( rule__Cuerpo__ProductosAssignment_1 )* ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==EOF||LA2_0==18||LA2_0==30) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalParafarmacia.g:232:2: ( ( rule__Cuerpo__Group_0__0 ) )
                    {
                    // InternalParafarmacia.g:232:2: ( ( rule__Cuerpo__Group_0__0 ) )
                    // InternalParafarmacia.g:233:3: ( rule__Cuerpo__Group_0__0 )
                    {
                     before(grammarAccess.getCuerpoAccess().getGroup_0()); 
                    // InternalParafarmacia.g:234:3: ( rule__Cuerpo__Group_0__0 )
                    // InternalParafarmacia.g:234:4: rule__Cuerpo__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Cuerpo__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCuerpoAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalParafarmacia.g:238:2: ( ( rule__Cuerpo__ProductosAssignment_1 )* )
                    {
                    // InternalParafarmacia.g:238:2: ( ( rule__Cuerpo__ProductosAssignment_1 )* )
                    // InternalParafarmacia.g:239:3: ( rule__Cuerpo__ProductosAssignment_1 )*
                    {
                     before(grammarAccess.getCuerpoAccess().getProductosAssignment_1()); 
                    // InternalParafarmacia.g:240:3: ( rule__Cuerpo__ProductosAssignment_1 )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==30) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalParafarmacia.g:240:4: rule__Cuerpo__ProductosAssignment_1
                    	    {
                    	    pushFollow(FOLLOW_3);
                    	    rule__Cuerpo__ProductosAssignment_1();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                     after(grammarAccess.getCuerpoAccess().getProductosAssignment_1()); 

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
    // $ANTLR end "rule__Cuerpo__Alternatives"


    // $ANTLR start "rule__Color__Alternatives_1"
    // InternalParafarmacia.g:248:1: rule__Color__Alternatives_1 : ( ( RULE_ID ) | ( RULE_INT ) );
    public final void rule__Color__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:252:1: ( ( RULE_ID ) | ( RULE_INT ) )
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
                    // InternalParafarmacia.g:253:2: ( RULE_ID )
                    {
                    // InternalParafarmacia.g:253:2: ( RULE_ID )
                    // InternalParafarmacia.g:254:3: RULE_ID
                    {
                     before(grammarAccess.getColorAccess().getIDTerminalRuleCall_1_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getColorAccess().getIDTerminalRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalParafarmacia.g:259:2: ( RULE_INT )
                    {
                    // InternalParafarmacia.g:259:2: ( RULE_INT )
                    // InternalParafarmacia.g:260:3: RULE_INT
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


    // $ANTLR start "rule__Parafarmacia__Group__0"
    // InternalParafarmacia.g:269:1: rule__Parafarmacia__Group__0 : rule__Parafarmacia__Group__0__Impl rule__Parafarmacia__Group__1 ;
    public final void rule__Parafarmacia__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:273:1: ( rule__Parafarmacia__Group__0__Impl rule__Parafarmacia__Group__1 )
            // InternalParafarmacia.g:274:2: rule__Parafarmacia__Group__0__Impl rule__Parafarmacia__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalParafarmacia.g:281:1: rule__Parafarmacia__Group__0__Impl : ( 'Parafarmacia' ) ;
    public final void rule__Parafarmacia__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:285:1: ( ( 'Parafarmacia' ) )
            // InternalParafarmacia.g:286:1: ( 'Parafarmacia' )
            {
            // InternalParafarmacia.g:286:1: ( 'Parafarmacia' )
            // InternalParafarmacia.g:287:2: 'Parafarmacia'
            {
             before(grammarAccess.getParafarmaciaAccess().getParafarmaciaKeyword_0()); 
            match(input,11,FOLLOW_2); 
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
    // InternalParafarmacia.g:296:1: rule__Parafarmacia__Group__1 : rule__Parafarmacia__Group__1__Impl rule__Parafarmacia__Group__2 ;
    public final void rule__Parafarmacia__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:300:1: ( rule__Parafarmacia__Group__1__Impl rule__Parafarmacia__Group__2 )
            // InternalParafarmacia.g:301:2: rule__Parafarmacia__Group__1__Impl rule__Parafarmacia__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalParafarmacia.g:308:1: rule__Parafarmacia__Group__1__Impl : ( '{' ) ;
    public final void rule__Parafarmacia__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:312:1: ( ( '{' ) )
            // InternalParafarmacia.g:313:1: ( '{' )
            {
            // InternalParafarmacia.g:313:1: ( '{' )
            // InternalParafarmacia.g:314:2: '{'
            {
             before(grammarAccess.getParafarmaciaAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
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
    // InternalParafarmacia.g:323:1: rule__Parafarmacia__Group__2 : rule__Parafarmacia__Group__2__Impl rule__Parafarmacia__Group__3 ;
    public final void rule__Parafarmacia__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:327:1: ( rule__Parafarmacia__Group__2__Impl rule__Parafarmacia__Group__3 )
            // InternalParafarmacia.g:328:2: rule__Parafarmacia__Group__2__Impl rule__Parafarmacia__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalParafarmacia.g:335:1: rule__Parafarmacia__Group__2__Impl : ( 'Titulo' ) ;
    public final void rule__Parafarmacia__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:339:1: ( ( 'Titulo' ) )
            // InternalParafarmacia.g:340:1: ( 'Titulo' )
            {
            // InternalParafarmacia.g:340:1: ( 'Titulo' )
            // InternalParafarmacia.g:341:2: 'Titulo'
            {
             before(grammarAccess.getParafarmaciaAccess().getTituloKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getParafarmaciaAccess().getTituloKeyword_2()); 

            }


            }

        }
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
    // InternalParafarmacia.g:350:1: rule__Parafarmacia__Group__3 : rule__Parafarmacia__Group__3__Impl rule__Parafarmacia__Group__4 ;
    public final void rule__Parafarmacia__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:354:1: ( rule__Parafarmacia__Group__3__Impl rule__Parafarmacia__Group__4 )
            // InternalParafarmacia.g:355:2: rule__Parafarmacia__Group__3__Impl rule__Parafarmacia__Group__4
            {
            pushFollow(FOLLOW_7);
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
    // InternalParafarmacia.g:362:1: rule__Parafarmacia__Group__3__Impl : ( '=' ) ;
    public final void rule__Parafarmacia__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:366:1: ( ( '=' ) )
            // InternalParafarmacia.g:367:1: ( '=' )
            {
            // InternalParafarmacia.g:367:1: ( '=' )
            // InternalParafarmacia.g:368:2: '='
            {
             before(grammarAccess.getParafarmaciaAccess().getEqualsSignKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getParafarmaciaAccess().getEqualsSignKeyword_3()); 

            }


            }

        }
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
    // InternalParafarmacia.g:377:1: rule__Parafarmacia__Group__4 : rule__Parafarmacia__Group__4__Impl rule__Parafarmacia__Group__5 ;
    public final void rule__Parafarmacia__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:381:1: ( rule__Parafarmacia__Group__4__Impl rule__Parafarmacia__Group__5 )
            // InternalParafarmacia.g:382:2: rule__Parafarmacia__Group__4__Impl rule__Parafarmacia__Group__5
            {
            pushFollow(FOLLOW_8);
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
    // InternalParafarmacia.g:389:1: rule__Parafarmacia__Group__4__Impl : ( ( rule__Parafarmacia__TituloAssignment_4 ) ) ;
    public final void rule__Parafarmacia__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:393:1: ( ( ( rule__Parafarmacia__TituloAssignment_4 ) ) )
            // InternalParafarmacia.g:394:1: ( ( rule__Parafarmacia__TituloAssignment_4 ) )
            {
            // InternalParafarmacia.g:394:1: ( ( rule__Parafarmacia__TituloAssignment_4 ) )
            // InternalParafarmacia.g:395:2: ( rule__Parafarmacia__TituloAssignment_4 )
            {
             before(grammarAccess.getParafarmaciaAccess().getTituloAssignment_4()); 
            // InternalParafarmacia.g:396:2: ( rule__Parafarmacia__TituloAssignment_4 )
            // InternalParafarmacia.g:396:3: rule__Parafarmacia__TituloAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Parafarmacia__TituloAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getParafarmaciaAccess().getTituloAssignment_4()); 

            }


            }

        }
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
    // InternalParafarmacia.g:404:1: rule__Parafarmacia__Group__5 : rule__Parafarmacia__Group__5__Impl rule__Parafarmacia__Group__6 ;
    public final void rule__Parafarmacia__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:408:1: ( rule__Parafarmacia__Group__5__Impl rule__Parafarmacia__Group__6 )
            // InternalParafarmacia.g:409:2: rule__Parafarmacia__Group__5__Impl rule__Parafarmacia__Group__6
            {
            pushFollow(FOLLOW_9);
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
    // InternalParafarmacia.g:416:1: rule__Parafarmacia__Group__5__Impl : ( ';' ) ;
    public final void rule__Parafarmacia__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:420:1: ( ( ';' ) )
            // InternalParafarmacia.g:421:1: ( ';' )
            {
            // InternalParafarmacia.g:421:1: ( ';' )
            // InternalParafarmacia.g:422:2: ';'
            {
             before(grammarAccess.getParafarmaciaAccess().getSemicolonKeyword_5()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getParafarmaciaAccess().getSemicolonKeyword_5()); 

            }


            }

        }
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
    // InternalParafarmacia.g:431:1: rule__Parafarmacia__Group__6 : rule__Parafarmacia__Group__6__Impl rule__Parafarmacia__Group__7 ;
    public final void rule__Parafarmacia__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:435:1: ( rule__Parafarmacia__Group__6__Impl rule__Parafarmacia__Group__7 )
            // InternalParafarmacia.g:436:2: rule__Parafarmacia__Group__6__Impl rule__Parafarmacia__Group__7
            {
            pushFollow(FOLLOW_6);
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
    // InternalParafarmacia.g:443:1: rule__Parafarmacia__Group__6__Impl : ( 'Descripcion' ) ;
    public final void rule__Parafarmacia__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:447:1: ( ( 'Descripcion' ) )
            // InternalParafarmacia.g:448:1: ( 'Descripcion' )
            {
            // InternalParafarmacia.g:448:1: ( 'Descripcion' )
            // InternalParafarmacia.g:449:2: 'Descripcion'
            {
             before(grammarAccess.getParafarmaciaAccess().getDescripcionKeyword_6()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getParafarmaciaAccess().getDescripcionKeyword_6()); 

            }


            }

        }
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
    // InternalParafarmacia.g:458:1: rule__Parafarmacia__Group__7 : rule__Parafarmacia__Group__7__Impl rule__Parafarmacia__Group__8 ;
    public final void rule__Parafarmacia__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:462:1: ( rule__Parafarmacia__Group__7__Impl rule__Parafarmacia__Group__8 )
            // InternalParafarmacia.g:463:2: rule__Parafarmacia__Group__7__Impl rule__Parafarmacia__Group__8
            {
            pushFollow(FOLLOW_7);
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
    // InternalParafarmacia.g:470:1: rule__Parafarmacia__Group__7__Impl : ( '=' ) ;
    public final void rule__Parafarmacia__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:474:1: ( ( '=' ) )
            // InternalParafarmacia.g:475:1: ( '=' )
            {
            // InternalParafarmacia.g:475:1: ( '=' )
            // InternalParafarmacia.g:476:2: '='
            {
             before(grammarAccess.getParafarmaciaAccess().getEqualsSignKeyword_7()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getParafarmaciaAccess().getEqualsSignKeyword_7()); 

            }


            }

        }
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
    // InternalParafarmacia.g:485:1: rule__Parafarmacia__Group__8 : rule__Parafarmacia__Group__8__Impl rule__Parafarmacia__Group__9 ;
    public final void rule__Parafarmacia__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:489:1: ( rule__Parafarmacia__Group__8__Impl rule__Parafarmacia__Group__9 )
            // InternalParafarmacia.g:490:2: rule__Parafarmacia__Group__8__Impl rule__Parafarmacia__Group__9
            {
            pushFollow(FOLLOW_8);
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
    // InternalParafarmacia.g:497:1: rule__Parafarmacia__Group__8__Impl : ( ( rule__Parafarmacia__DescripcionAssignment_8 ) ) ;
    public final void rule__Parafarmacia__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:501:1: ( ( ( rule__Parafarmacia__DescripcionAssignment_8 ) ) )
            // InternalParafarmacia.g:502:1: ( ( rule__Parafarmacia__DescripcionAssignment_8 ) )
            {
            // InternalParafarmacia.g:502:1: ( ( rule__Parafarmacia__DescripcionAssignment_8 ) )
            // InternalParafarmacia.g:503:2: ( rule__Parafarmacia__DescripcionAssignment_8 )
            {
             before(grammarAccess.getParafarmaciaAccess().getDescripcionAssignment_8()); 
            // InternalParafarmacia.g:504:2: ( rule__Parafarmacia__DescripcionAssignment_8 )
            // InternalParafarmacia.g:504:3: rule__Parafarmacia__DescripcionAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Parafarmacia__DescripcionAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getParafarmaciaAccess().getDescripcionAssignment_8()); 

            }


            }

        }
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
    // InternalParafarmacia.g:512:1: rule__Parafarmacia__Group__9 : rule__Parafarmacia__Group__9__Impl rule__Parafarmacia__Group__10 ;
    public final void rule__Parafarmacia__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:516:1: ( rule__Parafarmacia__Group__9__Impl rule__Parafarmacia__Group__10 )
            // InternalParafarmacia.g:517:2: rule__Parafarmacia__Group__9__Impl rule__Parafarmacia__Group__10
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
    // InternalParafarmacia.g:524:1: rule__Parafarmacia__Group__9__Impl : ( ';' ) ;
    public final void rule__Parafarmacia__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:528:1: ( ( ';' ) )
            // InternalParafarmacia.g:529:1: ( ';' )
            {
            // InternalParafarmacia.g:529:1: ( ';' )
            // InternalParafarmacia.g:530:2: ';'
            {
             before(grammarAccess.getParafarmaciaAccess().getSemicolonKeyword_9()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getParafarmaciaAccess().getSemicolonKeyword_9()); 

            }


            }

        }
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
    // InternalParafarmacia.g:539:1: rule__Parafarmacia__Group__10 : rule__Parafarmacia__Group__10__Impl rule__Parafarmacia__Group__11 ;
    public final void rule__Parafarmacia__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:543:1: ( rule__Parafarmacia__Group__10__Impl rule__Parafarmacia__Group__11 )
            // InternalParafarmacia.g:544:2: rule__Parafarmacia__Group__10__Impl rule__Parafarmacia__Group__11
            {
            pushFollow(FOLLOW_11);
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
    // InternalParafarmacia.g:551:1: rule__Parafarmacia__Group__10__Impl : ( ( rule__Parafarmacia__AparienciaAssignment_10 ) ) ;
    public final void rule__Parafarmacia__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:555:1: ( ( ( rule__Parafarmacia__AparienciaAssignment_10 ) ) )
            // InternalParafarmacia.g:556:1: ( ( rule__Parafarmacia__AparienciaAssignment_10 ) )
            {
            // InternalParafarmacia.g:556:1: ( ( rule__Parafarmacia__AparienciaAssignment_10 ) )
            // InternalParafarmacia.g:557:2: ( rule__Parafarmacia__AparienciaAssignment_10 )
            {
             before(grammarAccess.getParafarmaciaAccess().getAparienciaAssignment_10()); 
            // InternalParafarmacia.g:558:2: ( rule__Parafarmacia__AparienciaAssignment_10 )
            // InternalParafarmacia.g:558:3: rule__Parafarmacia__AparienciaAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__Parafarmacia__AparienciaAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getParafarmaciaAccess().getAparienciaAssignment_10()); 

            }


            }

        }
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
    // InternalParafarmacia.g:566:1: rule__Parafarmacia__Group__11 : rule__Parafarmacia__Group__11__Impl rule__Parafarmacia__Group__12 ;
    public final void rule__Parafarmacia__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:570:1: ( rule__Parafarmacia__Group__11__Impl rule__Parafarmacia__Group__12 )
            // InternalParafarmacia.g:571:2: rule__Parafarmacia__Group__11__Impl rule__Parafarmacia__Group__12
            {
            pushFollow(FOLLOW_4);
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
    // InternalParafarmacia.g:578:1: rule__Parafarmacia__Group__11__Impl : ( 'Paginas' ) ;
    public final void rule__Parafarmacia__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:582:1: ( ( 'Paginas' ) )
            // InternalParafarmacia.g:583:1: ( 'Paginas' )
            {
            // InternalParafarmacia.g:583:1: ( 'Paginas' )
            // InternalParafarmacia.g:584:2: 'Paginas'
            {
             before(grammarAccess.getParafarmaciaAccess().getPaginasKeyword_11()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getParafarmaciaAccess().getPaginasKeyword_11()); 

            }


            }

        }
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
    // InternalParafarmacia.g:593:1: rule__Parafarmacia__Group__12 : rule__Parafarmacia__Group__12__Impl rule__Parafarmacia__Group__13 ;
    public final void rule__Parafarmacia__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:597:1: ( rule__Parafarmacia__Group__12__Impl rule__Parafarmacia__Group__13 )
            // InternalParafarmacia.g:598:2: rule__Parafarmacia__Group__12__Impl rule__Parafarmacia__Group__13
            {
            pushFollow(FOLLOW_12);
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
    // InternalParafarmacia.g:605:1: rule__Parafarmacia__Group__12__Impl : ( '{' ) ;
    public final void rule__Parafarmacia__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:609:1: ( ( '{' ) )
            // InternalParafarmacia.g:610:1: ( '{' )
            {
            // InternalParafarmacia.g:610:1: ( '{' )
            // InternalParafarmacia.g:611:2: '{'
            {
             before(grammarAccess.getParafarmaciaAccess().getLeftCurlyBracketKeyword_12()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getParafarmaciaAccess().getLeftCurlyBracketKeyword_12()); 

            }


            }

        }
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
    // InternalParafarmacia.g:620:1: rule__Parafarmacia__Group__13 : rule__Parafarmacia__Group__13__Impl rule__Parafarmacia__Group__14 ;
    public final void rule__Parafarmacia__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:624:1: ( rule__Parafarmacia__Group__13__Impl rule__Parafarmacia__Group__14 )
            // InternalParafarmacia.g:625:2: rule__Parafarmacia__Group__13__Impl rule__Parafarmacia__Group__14
            {
            pushFollow(FOLLOW_12);
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
    // InternalParafarmacia.g:632:1: rule__Parafarmacia__Group__13__Impl : ( ( rule__Parafarmacia__PaginasAssignment_13 )* ) ;
    public final void rule__Parafarmacia__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:636:1: ( ( ( rule__Parafarmacia__PaginasAssignment_13 )* ) )
            // InternalParafarmacia.g:637:1: ( ( rule__Parafarmacia__PaginasAssignment_13 )* )
            {
            // InternalParafarmacia.g:637:1: ( ( rule__Parafarmacia__PaginasAssignment_13 )* )
            // InternalParafarmacia.g:638:2: ( rule__Parafarmacia__PaginasAssignment_13 )*
            {
             before(grammarAccess.getParafarmaciaAccess().getPaginasAssignment_13()); 
            // InternalParafarmacia.g:639:2: ( rule__Parafarmacia__PaginasAssignment_13 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==29) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalParafarmacia.g:639:3: rule__Parafarmacia__PaginasAssignment_13
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Parafarmacia__PaginasAssignment_13();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getParafarmaciaAccess().getPaginasAssignment_13()); 

            }


            }

        }
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
    // InternalParafarmacia.g:647:1: rule__Parafarmacia__Group__14 : rule__Parafarmacia__Group__14__Impl rule__Parafarmacia__Group__15 ;
    public final void rule__Parafarmacia__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:651:1: ( rule__Parafarmacia__Group__14__Impl rule__Parafarmacia__Group__15 )
            // InternalParafarmacia.g:652:2: rule__Parafarmacia__Group__14__Impl rule__Parafarmacia__Group__15
            {
            pushFollow(FOLLOW_14);
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
    // InternalParafarmacia.g:659:1: rule__Parafarmacia__Group__14__Impl : ( '}' ) ;
    public final void rule__Parafarmacia__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:663:1: ( ( '}' ) )
            // InternalParafarmacia.g:664:1: ( '}' )
            {
            // InternalParafarmacia.g:664:1: ( '}' )
            // InternalParafarmacia.g:665:2: '}'
            {
             before(grammarAccess.getParafarmaciaAccess().getRightCurlyBracketKeyword_14()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getParafarmaciaAccess().getRightCurlyBracketKeyword_14()); 

            }


            }

        }
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
    // InternalParafarmacia.g:674:1: rule__Parafarmacia__Group__15 : rule__Parafarmacia__Group__15__Impl ;
    public final void rule__Parafarmacia__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:678:1: ( rule__Parafarmacia__Group__15__Impl )
            // InternalParafarmacia.g:679:2: rule__Parafarmacia__Group__15__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parafarmacia__Group__15__Impl();

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
    // InternalParafarmacia.g:685:1: rule__Parafarmacia__Group__15__Impl : ( '}' ) ;
    public final void rule__Parafarmacia__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:689:1: ( ( '}' ) )
            // InternalParafarmacia.g:690:1: ( '}' )
            {
            // InternalParafarmacia.g:690:1: ( '}' )
            // InternalParafarmacia.g:691:2: '}'
            {
             before(grammarAccess.getParafarmaciaAccess().getRightCurlyBracketKeyword_15()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getParafarmaciaAccess().getRightCurlyBracketKeyword_15()); 

            }


            }

        }
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


    // $ANTLR start "rule__Apariencia__Group__0"
    // InternalParafarmacia.g:701:1: rule__Apariencia__Group__0 : rule__Apariencia__Group__0__Impl rule__Apariencia__Group__1 ;
    public final void rule__Apariencia__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:705:1: ( rule__Apariencia__Group__0__Impl rule__Apariencia__Group__1 )
            // InternalParafarmacia.g:706:2: rule__Apariencia__Group__0__Impl rule__Apariencia__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalParafarmacia.g:713:1: rule__Apariencia__Group__0__Impl : ( 'Color' ) ;
    public final void rule__Apariencia__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:717:1: ( ( 'Color' ) )
            // InternalParafarmacia.g:718:1: ( 'Color' )
            {
            // InternalParafarmacia.g:718:1: ( 'Color' )
            // InternalParafarmacia.g:719:2: 'Color'
            {
             before(grammarAccess.getAparienciaAccess().getColorKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getAparienciaAccess().getColorKeyword_0()); 

            }


            }

        }
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
    // InternalParafarmacia.g:728:1: rule__Apariencia__Group__1 : rule__Apariencia__Group__1__Impl rule__Apariencia__Group__2 ;
    public final void rule__Apariencia__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:732:1: ( rule__Apariencia__Group__1__Impl rule__Apariencia__Group__2 )
            // InternalParafarmacia.g:733:2: rule__Apariencia__Group__1__Impl rule__Apariencia__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalParafarmacia.g:740:1: rule__Apariencia__Group__1__Impl : ( '{' ) ;
    public final void rule__Apariencia__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:744:1: ( ( '{' ) )
            // InternalParafarmacia.g:745:1: ( '{' )
            {
            // InternalParafarmacia.g:745:1: ( '{' )
            // InternalParafarmacia.g:746:2: '{'
            {
             before(grammarAccess.getAparienciaAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getAparienciaAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
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
    // InternalParafarmacia.g:755:1: rule__Apariencia__Group__2 : rule__Apariencia__Group__2__Impl rule__Apariencia__Group__3 ;
    public final void rule__Apariencia__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:759:1: ( rule__Apariencia__Group__2__Impl rule__Apariencia__Group__3 )
            // InternalParafarmacia.g:760:2: rule__Apariencia__Group__2__Impl rule__Apariencia__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalParafarmacia.g:767:1: rule__Apariencia__Group__2__Impl : ( 'FondoPrincipal' ) ;
    public final void rule__Apariencia__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:771:1: ( ( 'FondoPrincipal' ) )
            // InternalParafarmacia.g:772:1: ( 'FondoPrincipal' )
            {
            // InternalParafarmacia.g:772:1: ( 'FondoPrincipal' )
            // InternalParafarmacia.g:773:2: 'FondoPrincipal'
            {
             before(grammarAccess.getAparienciaAccess().getFondoPrincipalKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getAparienciaAccess().getFondoPrincipalKeyword_2()); 

            }


            }

        }
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
    // InternalParafarmacia.g:782:1: rule__Apariencia__Group__3 : rule__Apariencia__Group__3__Impl rule__Apariencia__Group__4 ;
    public final void rule__Apariencia__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:786:1: ( rule__Apariencia__Group__3__Impl rule__Apariencia__Group__4 )
            // InternalParafarmacia.g:787:2: rule__Apariencia__Group__3__Impl rule__Apariencia__Group__4
            {
            pushFollow(FOLLOW_16);
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
    // InternalParafarmacia.g:794:1: rule__Apariencia__Group__3__Impl : ( '=' ) ;
    public final void rule__Apariencia__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:798:1: ( ( '=' ) )
            // InternalParafarmacia.g:799:1: ( '=' )
            {
            // InternalParafarmacia.g:799:1: ( '=' )
            // InternalParafarmacia.g:800:2: '='
            {
             before(grammarAccess.getAparienciaAccess().getEqualsSignKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getAparienciaAccess().getEqualsSignKeyword_3()); 

            }


            }

        }
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
    // InternalParafarmacia.g:809:1: rule__Apariencia__Group__4 : rule__Apariencia__Group__4__Impl rule__Apariencia__Group__5 ;
    public final void rule__Apariencia__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:813:1: ( rule__Apariencia__Group__4__Impl rule__Apariencia__Group__5 )
            // InternalParafarmacia.g:814:2: rule__Apariencia__Group__4__Impl rule__Apariencia__Group__5
            {
            pushFollow(FOLLOW_8);
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
    // InternalParafarmacia.g:821:1: rule__Apariencia__Group__4__Impl : ( ( rule__Apariencia__ColorFondo1Assignment_4 ) ) ;
    public final void rule__Apariencia__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:825:1: ( ( ( rule__Apariencia__ColorFondo1Assignment_4 ) ) )
            // InternalParafarmacia.g:826:1: ( ( rule__Apariencia__ColorFondo1Assignment_4 ) )
            {
            // InternalParafarmacia.g:826:1: ( ( rule__Apariencia__ColorFondo1Assignment_4 ) )
            // InternalParafarmacia.g:827:2: ( rule__Apariencia__ColorFondo1Assignment_4 )
            {
             before(grammarAccess.getAparienciaAccess().getColorFondo1Assignment_4()); 
            // InternalParafarmacia.g:828:2: ( rule__Apariencia__ColorFondo1Assignment_4 )
            // InternalParafarmacia.g:828:3: rule__Apariencia__ColorFondo1Assignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Apariencia__ColorFondo1Assignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAparienciaAccess().getColorFondo1Assignment_4()); 

            }


            }

        }
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
    // InternalParafarmacia.g:836:1: rule__Apariencia__Group__5 : rule__Apariencia__Group__5__Impl rule__Apariencia__Group__6 ;
    public final void rule__Apariencia__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:840:1: ( rule__Apariencia__Group__5__Impl rule__Apariencia__Group__6 )
            // InternalParafarmacia.g:841:2: rule__Apariencia__Group__5__Impl rule__Apariencia__Group__6
            {
            pushFollow(FOLLOW_17);
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
    // InternalParafarmacia.g:848:1: rule__Apariencia__Group__5__Impl : ( ';' ) ;
    public final void rule__Apariencia__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:852:1: ( ( ';' ) )
            // InternalParafarmacia.g:853:1: ( ';' )
            {
            // InternalParafarmacia.g:853:1: ( ';' )
            // InternalParafarmacia.g:854:2: ';'
            {
             before(grammarAccess.getAparienciaAccess().getSemicolonKeyword_5()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getAparienciaAccess().getSemicolonKeyword_5()); 

            }


            }

        }
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
    // InternalParafarmacia.g:863:1: rule__Apariencia__Group__6 : rule__Apariencia__Group__6__Impl rule__Apariencia__Group__7 ;
    public final void rule__Apariencia__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:867:1: ( rule__Apariencia__Group__6__Impl rule__Apariencia__Group__7 )
            // InternalParafarmacia.g:868:2: rule__Apariencia__Group__6__Impl rule__Apariencia__Group__7
            {
            pushFollow(FOLLOW_6);
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
    // InternalParafarmacia.g:875:1: rule__Apariencia__Group__6__Impl : ( 'FondoSecundario' ) ;
    public final void rule__Apariencia__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:879:1: ( ( 'FondoSecundario' ) )
            // InternalParafarmacia.g:880:1: ( 'FondoSecundario' )
            {
            // InternalParafarmacia.g:880:1: ( 'FondoSecundario' )
            // InternalParafarmacia.g:881:2: 'FondoSecundario'
            {
             before(grammarAccess.getAparienciaAccess().getFondoSecundarioKeyword_6()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getAparienciaAccess().getFondoSecundarioKeyword_6()); 

            }


            }

        }
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
    // InternalParafarmacia.g:890:1: rule__Apariencia__Group__7 : rule__Apariencia__Group__7__Impl rule__Apariencia__Group__8 ;
    public final void rule__Apariencia__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:894:1: ( rule__Apariencia__Group__7__Impl rule__Apariencia__Group__8 )
            // InternalParafarmacia.g:895:2: rule__Apariencia__Group__7__Impl rule__Apariencia__Group__8
            {
            pushFollow(FOLLOW_16);
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
    // InternalParafarmacia.g:902:1: rule__Apariencia__Group__7__Impl : ( '=' ) ;
    public final void rule__Apariencia__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:906:1: ( ( '=' ) )
            // InternalParafarmacia.g:907:1: ( '=' )
            {
            // InternalParafarmacia.g:907:1: ( '=' )
            // InternalParafarmacia.g:908:2: '='
            {
             before(grammarAccess.getAparienciaAccess().getEqualsSignKeyword_7()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getAparienciaAccess().getEqualsSignKeyword_7()); 

            }


            }

        }
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
    // InternalParafarmacia.g:917:1: rule__Apariencia__Group__8 : rule__Apariencia__Group__8__Impl rule__Apariencia__Group__9 ;
    public final void rule__Apariencia__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:921:1: ( rule__Apariencia__Group__8__Impl rule__Apariencia__Group__9 )
            // InternalParafarmacia.g:922:2: rule__Apariencia__Group__8__Impl rule__Apariencia__Group__9
            {
            pushFollow(FOLLOW_8);
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
    // InternalParafarmacia.g:929:1: rule__Apariencia__Group__8__Impl : ( ( rule__Apariencia__ColorFondo2Assignment_8 ) ) ;
    public final void rule__Apariencia__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:933:1: ( ( ( rule__Apariencia__ColorFondo2Assignment_8 ) ) )
            // InternalParafarmacia.g:934:1: ( ( rule__Apariencia__ColorFondo2Assignment_8 ) )
            {
            // InternalParafarmacia.g:934:1: ( ( rule__Apariencia__ColorFondo2Assignment_8 ) )
            // InternalParafarmacia.g:935:2: ( rule__Apariencia__ColorFondo2Assignment_8 )
            {
             before(grammarAccess.getAparienciaAccess().getColorFondo2Assignment_8()); 
            // InternalParafarmacia.g:936:2: ( rule__Apariencia__ColorFondo2Assignment_8 )
            // InternalParafarmacia.g:936:3: rule__Apariencia__ColorFondo2Assignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Apariencia__ColorFondo2Assignment_8();

            state._fsp--;


            }

             after(grammarAccess.getAparienciaAccess().getColorFondo2Assignment_8()); 

            }


            }

        }
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
    // InternalParafarmacia.g:944:1: rule__Apariencia__Group__9 : rule__Apariencia__Group__9__Impl rule__Apariencia__Group__10 ;
    public final void rule__Apariencia__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:948:1: ( rule__Apariencia__Group__9__Impl rule__Apariencia__Group__10 )
            // InternalParafarmacia.g:949:2: rule__Apariencia__Group__9__Impl rule__Apariencia__Group__10
            {
            pushFollow(FOLLOW_18);
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
    // InternalParafarmacia.g:956:1: rule__Apariencia__Group__9__Impl : ( ';' ) ;
    public final void rule__Apariencia__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:960:1: ( ( ';' ) )
            // InternalParafarmacia.g:961:1: ( ';' )
            {
            // InternalParafarmacia.g:961:1: ( ';' )
            // InternalParafarmacia.g:962:2: ';'
            {
             before(grammarAccess.getAparienciaAccess().getSemicolonKeyword_9()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getAparienciaAccess().getSemicolonKeyword_9()); 

            }


            }

        }
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
    // InternalParafarmacia.g:971:1: rule__Apariencia__Group__10 : rule__Apariencia__Group__10__Impl rule__Apariencia__Group__11 ;
    public final void rule__Apariencia__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:975:1: ( rule__Apariencia__Group__10__Impl rule__Apariencia__Group__11 )
            // InternalParafarmacia.g:976:2: rule__Apariencia__Group__10__Impl rule__Apariencia__Group__11
            {
            pushFollow(FOLLOW_6);
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
    // InternalParafarmacia.g:983:1: rule__Apariencia__Group__10__Impl : ( 'Texto' ) ;
    public final void rule__Apariencia__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:987:1: ( ( 'Texto' ) )
            // InternalParafarmacia.g:988:1: ( 'Texto' )
            {
            // InternalParafarmacia.g:988:1: ( 'Texto' )
            // InternalParafarmacia.g:989:2: 'Texto'
            {
             before(grammarAccess.getAparienciaAccess().getTextoKeyword_10()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getAparienciaAccess().getTextoKeyword_10()); 

            }


            }

        }
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
    // InternalParafarmacia.g:998:1: rule__Apariencia__Group__11 : rule__Apariencia__Group__11__Impl rule__Apariencia__Group__12 ;
    public final void rule__Apariencia__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:1002:1: ( rule__Apariencia__Group__11__Impl rule__Apariencia__Group__12 )
            // InternalParafarmacia.g:1003:2: rule__Apariencia__Group__11__Impl rule__Apariencia__Group__12
            {
            pushFollow(FOLLOW_16);
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
    // InternalParafarmacia.g:1010:1: rule__Apariencia__Group__11__Impl : ( '=' ) ;
    public final void rule__Apariencia__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:1014:1: ( ( '=' ) )
            // InternalParafarmacia.g:1015:1: ( '=' )
            {
            // InternalParafarmacia.g:1015:1: ( '=' )
            // InternalParafarmacia.g:1016:2: '='
            {
             before(grammarAccess.getAparienciaAccess().getEqualsSignKeyword_11()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getAparienciaAccess().getEqualsSignKeyword_11()); 

            }


            }

        }
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
    // InternalParafarmacia.g:1025:1: rule__Apariencia__Group__12 : rule__Apariencia__Group__12__Impl rule__Apariencia__Group__13 ;
    public final void rule__Apariencia__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:1029:1: ( rule__Apariencia__Group__12__Impl rule__Apariencia__Group__13 )
            // InternalParafarmacia.g:1030:2: rule__Apariencia__Group__12__Impl rule__Apariencia__Group__13
            {
            pushFollow(FOLLOW_8);
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
    // InternalParafarmacia.g:1037:1: rule__Apariencia__Group__12__Impl : ( ( rule__Apariencia__ColorTextoAssignment_12 ) ) ;
    public final void rule__Apariencia__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:1041:1: ( ( ( rule__Apariencia__ColorTextoAssignment_12 ) ) )
            // InternalParafarmacia.g:1042:1: ( ( rule__Apariencia__ColorTextoAssignment_12 ) )
            {
            // InternalParafarmacia.g:1042:1: ( ( rule__Apariencia__ColorTextoAssignment_12 ) )
            // InternalParafarmacia.g:1043:2: ( rule__Apariencia__ColorTextoAssignment_12 )
            {
             before(grammarAccess.getAparienciaAccess().getColorTextoAssignment_12()); 
            // InternalParafarmacia.g:1044:2: ( rule__Apariencia__ColorTextoAssignment_12 )
            // InternalParafarmacia.g:1044:3: rule__Apariencia__ColorTextoAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__Apariencia__ColorTextoAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getAparienciaAccess().getColorTextoAssignment_12()); 

            }


            }

        }
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
    // InternalParafarmacia.g:1052:1: rule__Apariencia__Group__13 : rule__Apariencia__Group__13__Impl rule__Apariencia__Group__14 ;
    public final void rule__Apariencia__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:1056:1: ( rule__Apariencia__Group__13__Impl rule__Apariencia__Group__14 )
            // InternalParafarmacia.g:1057:2: rule__Apariencia__Group__13__Impl rule__Apariencia__Group__14
            {
            pushFollow(FOLLOW_14);
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
    // InternalParafarmacia.g:1064:1: rule__Apariencia__Group__13__Impl : ( ';' ) ;
    public final void rule__Apariencia__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:1068:1: ( ( ';' ) )
            // InternalParafarmacia.g:1069:1: ( ';' )
            {
            // InternalParafarmacia.g:1069:1: ( ';' )
            // InternalParafarmacia.g:1070:2: ';'
            {
             before(grammarAccess.getAparienciaAccess().getSemicolonKeyword_13()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getAparienciaAccess().getSemicolonKeyword_13()); 

            }


            }

        }
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
    // InternalParafarmacia.g:1079:1: rule__Apariencia__Group__14 : rule__Apariencia__Group__14__Impl rule__Apariencia__Group__15 ;
    public final void rule__Apariencia__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:1083:1: ( rule__Apariencia__Group__14__Impl rule__Apariencia__Group__15 )
            // InternalParafarmacia.g:1084:2: rule__Apariencia__Group__14__Impl rule__Apariencia__Group__15
            {
            pushFollow(FOLLOW_19);
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
    // InternalParafarmacia.g:1091:1: rule__Apariencia__Group__14__Impl : ( '}' ) ;
    public final void rule__Apariencia__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:1095:1: ( ( '}' ) )
            // InternalParafarmacia.g:1096:1: ( '}' )
            {
            // InternalParafarmacia.g:1096:1: ( '}' )
            // InternalParafarmacia.g:1097:2: '}'
            {
             before(grammarAccess.getAparienciaAccess().getRightCurlyBracketKeyword_14()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getAparienciaAccess().getRightCurlyBracketKeyword_14()); 

            }


            }

        }
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
    // InternalParafarmacia.g:1106:1: rule__Apariencia__Group__15 : rule__Apariencia__Group__15__Impl rule__Apariencia__Group__16 ;
    public final void rule__Apariencia__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:1110:1: ( rule__Apariencia__Group__15__Impl rule__Apariencia__Group__16 )
            // InternalParafarmacia.g:1111:2: rule__Apariencia__Group__15__Impl rule__Apariencia__Group__16
            {
            pushFollow(FOLLOW_4);
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
    // InternalParafarmacia.g:1118:1: rule__Apariencia__Group__15__Impl : ( 'Fuente' ) ;
    public final void rule__Apariencia__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:1122:1: ( ( 'Fuente' ) )
            // InternalParafarmacia.g:1123:1: ( 'Fuente' )
            {
            // InternalParafarmacia.g:1123:1: ( 'Fuente' )
            // InternalParafarmacia.g:1124:2: 'Fuente'
            {
             before(grammarAccess.getAparienciaAccess().getFuenteKeyword_15()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getAparienciaAccess().getFuenteKeyword_15()); 

            }


            }

        }
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
    // InternalParafarmacia.g:1133:1: rule__Apariencia__Group__16 : rule__Apariencia__Group__16__Impl rule__Apariencia__Group__17 ;
    public final void rule__Apariencia__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:1137:1: ( rule__Apariencia__Group__16__Impl rule__Apariencia__Group__17 )
            // InternalParafarmacia.g:1138:2: rule__Apariencia__Group__16__Impl rule__Apariencia__Group__17
            {
            pushFollow(FOLLOW_5);
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
    // InternalParafarmacia.g:1145:1: rule__Apariencia__Group__16__Impl : ( '{' ) ;
    public final void rule__Apariencia__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:1149:1: ( ( '{' ) )
            // InternalParafarmacia.g:1150:1: ( '{' )
            {
            // InternalParafarmacia.g:1150:1: ( '{' )
            // InternalParafarmacia.g:1151:2: '{'
            {
             before(grammarAccess.getAparienciaAccess().getLeftCurlyBracketKeyword_16()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getAparienciaAccess().getLeftCurlyBracketKeyword_16()); 

            }


            }

        }
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
    // InternalParafarmacia.g:1160:1: rule__Apariencia__Group__17 : rule__Apariencia__Group__17__Impl rule__Apariencia__Group__18 ;
    public final void rule__Apariencia__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:1164:1: ( rule__Apariencia__Group__17__Impl rule__Apariencia__Group__18 )
            // InternalParafarmacia.g:1165:2: rule__Apariencia__Group__17__Impl rule__Apariencia__Group__18
            {
            pushFollow(FOLLOW_4);
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
    // InternalParafarmacia.g:1172:1: rule__Apariencia__Group__17__Impl : ( 'Titulo' ) ;
    public final void rule__Apariencia__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:1176:1: ( ( 'Titulo' ) )
            // InternalParafarmacia.g:1177:1: ( 'Titulo' )
            {
            // InternalParafarmacia.g:1177:1: ( 'Titulo' )
            // InternalParafarmacia.g:1178:2: 'Titulo'
            {
             before(grammarAccess.getAparienciaAccess().getTituloKeyword_17()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getAparienciaAccess().getTituloKeyword_17()); 

            }


            }

        }
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
    // InternalParafarmacia.g:1187:1: rule__Apariencia__Group__18 : rule__Apariencia__Group__18__Impl rule__Apariencia__Group__19 ;
    public final void rule__Apariencia__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:1191:1: ( rule__Apariencia__Group__18__Impl rule__Apariencia__Group__19 )
            // InternalParafarmacia.g:1192:2: rule__Apariencia__Group__18__Impl rule__Apariencia__Group__19
            {
            pushFollow(FOLLOW_20);
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
    // InternalParafarmacia.g:1199:1: rule__Apariencia__Group__18__Impl : ( '{' ) ;
    public final void rule__Apariencia__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:1203:1: ( ( '{' ) )
            // InternalParafarmacia.g:1204:1: ( '{' )
            {
            // InternalParafarmacia.g:1204:1: ( '{' )
            // InternalParafarmacia.g:1205:2: '{'
            {
             before(grammarAccess.getAparienciaAccess().getLeftCurlyBracketKeyword_18()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getAparienciaAccess().getLeftCurlyBracketKeyword_18()); 

            }


            }

        }
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
    // InternalParafarmacia.g:1214:1: rule__Apariencia__Group__19 : rule__Apariencia__Group__19__Impl rule__Apariencia__Group__20 ;
    public final void rule__Apariencia__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:1218:1: ( rule__Apariencia__Group__19__Impl rule__Apariencia__Group__20 )
            // InternalParafarmacia.g:1219:2: rule__Apariencia__Group__19__Impl rule__Apariencia__Group__20
            {
            pushFollow(FOLLOW_6);
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
    // InternalParafarmacia.g:1226:1: rule__Apariencia__Group__19__Impl : ( 'SizeH1' ) ;
    public final void rule__Apariencia__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:1230:1: ( ( 'SizeH1' ) )
            // InternalParafarmacia.g:1231:1: ( 'SizeH1' )
            {
            // InternalParafarmacia.g:1231:1: ( 'SizeH1' )
            // InternalParafarmacia.g:1232:2: 'SizeH1'
            {
             before(grammarAccess.getAparienciaAccess().getSizeH1Keyword_19()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getAparienciaAccess().getSizeH1Keyword_19()); 

            }


            }

        }
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
    // InternalParafarmacia.g:1241:1: rule__Apariencia__Group__20 : rule__Apariencia__Group__20__Impl rule__Apariencia__Group__21 ;
    public final void rule__Apariencia__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:1245:1: ( rule__Apariencia__Group__20__Impl rule__Apariencia__Group__21 )
            // InternalParafarmacia.g:1246:2: rule__Apariencia__Group__20__Impl rule__Apariencia__Group__21
            {
            pushFollow(FOLLOW_21);
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
    // InternalParafarmacia.g:1253:1: rule__Apariencia__Group__20__Impl : ( '=' ) ;
    public final void rule__Apariencia__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:1257:1: ( ( '=' ) )
            // InternalParafarmacia.g:1258:1: ( '=' )
            {
            // InternalParafarmacia.g:1258:1: ( '=' )
            // InternalParafarmacia.g:1259:2: '='
            {
             before(grammarAccess.getAparienciaAccess().getEqualsSignKeyword_20()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getAparienciaAccess().getEqualsSignKeyword_20()); 

            }


            }

        }
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
    // InternalParafarmacia.g:1268:1: rule__Apariencia__Group__21 : rule__Apariencia__Group__21__Impl rule__Apariencia__Group__22 ;
    public final void rule__Apariencia__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:1272:1: ( rule__Apariencia__Group__21__Impl rule__Apariencia__Group__22 )
            // InternalParafarmacia.g:1273:2: rule__Apariencia__Group__21__Impl rule__Apariencia__Group__22
            {
            pushFollow(FOLLOW_22);
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
    // InternalParafarmacia.g:1280:1: rule__Apariencia__Group__21__Impl : ( ( rule__Apariencia__SizeFuenteH1Assignment_21 ) ) ;
    public final void rule__Apariencia__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:1284:1: ( ( ( rule__Apariencia__SizeFuenteH1Assignment_21 ) ) )
            // InternalParafarmacia.g:1285:1: ( ( rule__Apariencia__SizeFuenteH1Assignment_21 ) )
            {
            // InternalParafarmacia.g:1285:1: ( ( rule__Apariencia__SizeFuenteH1Assignment_21 ) )
            // InternalParafarmacia.g:1286:2: ( rule__Apariencia__SizeFuenteH1Assignment_21 )
            {
             before(grammarAccess.getAparienciaAccess().getSizeFuenteH1Assignment_21()); 
            // InternalParafarmacia.g:1287:2: ( rule__Apariencia__SizeFuenteH1Assignment_21 )
            // InternalParafarmacia.g:1287:3: rule__Apariencia__SizeFuenteH1Assignment_21
            {
            pushFollow(FOLLOW_2);
            rule__Apariencia__SizeFuenteH1Assignment_21();

            state._fsp--;


            }

             after(grammarAccess.getAparienciaAccess().getSizeFuenteH1Assignment_21()); 

            }


            }

        }
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
    // InternalParafarmacia.g:1295:1: rule__Apariencia__Group__22 : rule__Apariencia__Group__22__Impl rule__Apariencia__Group__23 ;
    public final void rule__Apariencia__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:1299:1: ( rule__Apariencia__Group__22__Impl rule__Apariencia__Group__23 )
            // InternalParafarmacia.g:1300:2: rule__Apariencia__Group__22__Impl rule__Apariencia__Group__23
            {
            pushFollow(FOLLOW_8);
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
    // InternalParafarmacia.g:1307:1: rule__Apariencia__Group__22__Impl : ( 'px' ) ;
    public final void rule__Apariencia__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:1311:1: ( ( 'px' ) )
            // InternalParafarmacia.g:1312:1: ( 'px' )
            {
            // InternalParafarmacia.g:1312:1: ( 'px' )
            // InternalParafarmacia.g:1313:2: 'px'
            {
             before(grammarAccess.getAparienciaAccess().getPxKeyword_22()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getAparienciaAccess().getPxKeyword_22()); 

            }


            }

        }
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
    // InternalParafarmacia.g:1322:1: rule__Apariencia__Group__23 : rule__Apariencia__Group__23__Impl rule__Apariencia__Group__24 ;
    public final void rule__Apariencia__Group__23() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:1326:1: ( rule__Apariencia__Group__23__Impl rule__Apariencia__Group__24 )
            // InternalParafarmacia.g:1327:2: rule__Apariencia__Group__23__Impl rule__Apariencia__Group__24
            {
            pushFollow(FOLLOW_23);
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
    // InternalParafarmacia.g:1334:1: rule__Apariencia__Group__23__Impl : ( ';' ) ;
    public final void rule__Apariencia__Group__23__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:1338:1: ( ( ';' ) )
            // InternalParafarmacia.g:1339:1: ( ';' )
            {
            // InternalParafarmacia.g:1339:1: ( ';' )
            // InternalParafarmacia.g:1340:2: ';'
            {
             before(grammarAccess.getAparienciaAccess().getSemicolonKeyword_23()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getAparienciaAccess().getSemicolonKeyword_23()); 

            }


            }

        }
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
    // InternalParafarmacia.g:1349:1: rule__Apariencia__Group__24 : rule__Apariencia__Group__24__Impl rule__Apariencia__Group__25 ;
    public final void rule__Apariencia__Group__24() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:1353:1: ( rule__Apariencia__Group__24__Impl rule__Apariencia__Group__25 )
            // InternalParafarmacia.g:1354:2: rule__Apariencia__Group__24__Impl rule__Apariencia__Group__25
            {
            pushFollow(FOLLOW_6);
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
    // InternalParafarmacia.g:1361:1: rule__Apariencia__Group__24__Impl : ( 'SizeH2' ) ;
    public final void rule__Apariencia__Group__24__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:1365:1: ( ( 'SizeH2' ) )
            // InternalParafarmacia.g:1366:1: ( 'SizeH2' )
            {
            // InternalParafarmacia.g:1366:1: ( 'SizeH2' )
            // InternalParafarmacia.g:1367:2: 'SizeH2'
            {
             before(grammarAccess.getAparienciaAccess().getSizeH2Keyword_24()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getAparienciaAccess().getSizeH2Keyword_24()); 

            }


            }

        }
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
    // InternalParafarmacia.g:1376:1: rule__Apariencia__Group__25 : rule__Apariencia__Group__25__Impl rule__Apariencia__Group__26 ;
    public final void rule__Apariencia__Group__25() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:1380:1: ( rule__Apariencia__Group__25__Impl rule__Apariencia__Group__26 )
            // InternalParafarmacia.g:1381:2: rule__Apariencia__Group__25__Impl rule__Apariencia__Group__26
            {
            pushFollow(FOLLOW_21);
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
    // InternalParafarmacia.g:1388:1: rule__Apariencia__Group__25__Impl : ( '=' ) ;
    public final void rule__Apariencia__Group__25__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:1392:1: ( ( '=' ) )
            // InternalParafarmacia.g:1393:1: ( '=' )
            {
            // InternalParafarmacia.g:1393:1: ( '=' )
            // InternalParafarmacia.g:1394:2: '='
            {
             before(grammarAccess.getAparienciaAccess().getEqualsSignKeyword_25()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getAparienciaAccess().getEqualsSignKeyword_25()); 

            }


            }

        }
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
    // InternalParafarmacia.g:1403:1: rule__Apariencia__Group__26 : rule__Apariencia__Group__26__Impl rule__Apariencia__Group__27 ;
    public final void rule__Apariencia__Group__26() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:1407:1: ( rule__Apariencia__Group__26__Impl rule__Apariencia__Group__27 )
            // InternalParafarmacia.g:1408:2: rule__Apariencia__Group__26__Impl rule__Apariencia__Group__27
            {
            pushFollow(FOLLOW_22);
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
    // InternalParafarmacia.g:1415:1: rule__Apariencia__Group__26__Impl : ( ( rule__Apariencia__SizeFuenteH2Assignment_26 ) ) ;
    public final void rule__Apariencia__Group__26__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:1419:1: ( ( ( rule__Apariencia__SizeFuenteH2Assignment_26 ) ) )
            // InternalParafarmacia.g:1420:1: ( ( rule__Apariencia__SizeFuenteH2Assignment_26 ) )
            {
            // InternalParafarmacia.g:1420:1: ( ( rule__Apariencia__SizeFuenteH2Assignment_26 ) )
            // InternalParafarmacia.g:1421:2: ( rule__Apariencia__SizeFuenteH2Assignment_26 )
            {
             before(grammarAccess.getAparienciaAccess().getSizeFuenteH2Assignment_26()); 
            // InternalParafarmacia.g:1422:2: ( rule__Apariencia__SizeFuenteH2Assignment_26 )
            // InternalParafarmacia.g:1422:3: rule__Apariencia__SizeFuenteH2Assignment_26
            {
            pushFollow(FOLLOW_2);
            rule__Apariencia__SizeFuenteH2Assignment_26();

            state._fsp--;


            }

             after(grammarAccess.getAparienciaAccess().getSizeFuenteH2Assignment_26()); 

            }


            }

        }
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
    // InternalParafarmacia.g:1430:1: rule__Apariencia__Group__27 : rule__Apariencia__Group__27__Impl rule__Apariencia__Group__28 ;
    public final void rule__Apariencia__Group__27() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:1434:1: ( rule__Apariencia__Group__27__Impl rule__Apariencia__Group__28 )
            // InternalParafarmacia.g:1435:2: rule__Apariencia__Group__27__Impl rule__Apariencia__Group__28
            {
            pushFollow(FOLLOW_8);
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
    // InternalParafarmacia.g:1442:1: rule__Apariencia__Group__27__Impl : ( 'px' ) ;
    public final void rule__Apariencia__Group__27__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:1446:1: ( ( 'px' ) )
            // InternalParafarmacia.g:1447:1: ( 'px' )
            {
            // InternalParafarmacia.g:1447:1: ( 'px' )
            // InternalParafarmacia.g:1448:2: 'px'
            {
             before(grammarAccess.getAparienciaAccess().getPxKeyword_27()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getAparienciaAccess().getPxKeyword_27()); 

            }


            }

        }
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
    // InternalParafarmacia.g:1457:1: rule__Apariencia__Group__28 : rule__Apariencia__Group__28__Impl rule__Apariencia__Group__29 ;
    public final void rule__Apariencia__Group__28() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:1461:1: ( rule__Apariencia__Group__28__Impl rule__Apariencia__Group__29 )
            // InternalParafarmacia.g:1462:2: rule__Apariencia__Group__28__Impl rule__Apariencia__Group__29
            {
            pushFollow(FOLLOW_14);
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
    // InternalParafarmacia.g:1469:1: rule__Apariencia__Group__28__Impl : ( ';' ) ;
    public final void rule__Apariencia__Group__28__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:1473:1: ( ( ';' ) )
            // InternalParafarmacia.g:1474:1: ( ';' )
            {
            // InternalParafarmacia.g:1474:1: ( ';' )
            // InternalParafarmacia.g:1475:2: ';'
            {
             before(grammarAccess.getAparienciaAccess().getSemicolonKeyword_28()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getAparienciaAccess().getSemicolonKeyword_28()); 

            }


            }

        }
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
    // InternalParafarmacia.g:1484:1: rule__Apariencia__Group__29 : rule__Apariencia__Group__29__Impl rule__Apariencia__Group__30 ;
    public final void rule__Apariencia__Group__29() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:1488:1: ( rule__Apariencia__Group__29__Impl rule__Apariencia__Group__30 )
            // InternalParafarmacia.g:1489:2: rule__Apariencia__Group__29__Impl rule__Apariencia__Group__30
            {
            pushFollow(FOLLOW_24);
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
    // InternalParafarmacia.g:1496:1: rule__Apariencia__Group__29__Impl : ( '}' ) ;
    public final void rule__Apariencia__Group__29__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:1500:1: ( ( '}' ) )
            // InternalParafarmacia.g:1501:1: ( '}' )
            {
            // InternalParafarmacia.g:1501:1: ( '}' )
            // InternalParafarmacia.g:1502:2: '}'
            {
             before(grammarAccess.getAparienciaAccess().getRightCurlyBracketKeyword_29()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getAparienciaAccess().getRightCurlyBracketKeyword_29()); 

            }


            }

        }
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
    // InternalParafarmacia.g:1511:1: rule__Apariencia__Group__30 : rule__Apariencia__Group__30__Impl rule__Apariencia__Group__31 ;
    public final void rule__Apariencia__Group__30() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:1515:1: ( rule__Apariencia__Group__30__Impl rule__Apariencia__Group__31 )
            // InternalParafarmacia.g:1516:2: rule__Apariencia__Group__30__Impl rule__Apariencia__Group__31
            {
            pushFollow(FOLLOW_4);
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
    // InternalParafarmacia.g:1523:1: rule__Apariencia__Group__30__Impl : ( 'Cuerpo' ) ;
    public final void rule__Apariencia__Group__30__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:1527:1: ( ( 'Cuerpo' ) )
            // InternalParafarmacia.g:1528:1: ( 'Cuerpo' )
            {
            // InternalParafarmacia.g:1528:1: ( 'Cuerpo' )
            // InternalParafarmacia.g:1529:2: 'Cuerpo'
            {
             before(grammarAccess.getAparienciaAccess().getCuerpoKeyword_30()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getAparienciaAccess().getCuerpoKeyword_30()); 

            }


            }

        }
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
    // InternalParafarmacia.g:1538:1: rule__Apariencia__Group__31 : rule__Apariencia__Group__31__Impl rule__Apariencia__Group__32 ;
    public final void rule__Apariencia__Group__31() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:1542:1: ( rule__Apariencia__Group__31__Impl rule__Apariencia__Group__32 )
            // InternalParafarmacia.g:1543:2: rule__Apariencia__Group__31__Impl rule__Apariencia__Group__32
            {
            pushFollow(FOLLOW_25);
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
    // InternalParafarmacia.g:1550:1: rule__Apariencia__Group__31__Impl : ( '{' ) ;
    public final void rule__Apariencia__Group__31__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:1554:1: ( ( '{' ) )
            // InternalParafarmacia.g:1555:1: ( '{' )
            {
            // InternalParafarmacia.g:1555:1: ( '{' )
            // InternalParafarmacia.g:1556:2: '{'
            {
             before(grammarAccess.getAparienciaAccess().getLeftCurlyBracketKeyword_31()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getAparienciaAccess().getLeftCurlyBracketKeyword_31()); 

            }


            }

        }
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
    // InternalParafarmacia.g:1565:1: rule__Apariencia__Group__32 : rule__Apariencia__Group__32__Impl rule__Apariencia__Group__33 ;
    public final void rule__Apariencia__Group__32() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:1569:1: ( rule__Apariencia__Group__32__Impl rule__Apariencia__Group__33 )
            // InternalParafarmacia.g:1570:2: rule__Apariencia__Group__32__Impl rule__Apariencia__Group__33
            {
            pushFollow(FOLLOW_6);
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
    // InternalParafarmacia.g:1577:1: rule__Apariencia__Group__32__Impl : ( 'Size' ) ;
    public final void rule__Apariencia__Group__32__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:1581:1: ( ( 'Size' ) )
            // InternalParafarmacia.g:1582:1: ( 'Size' )
            {
            // InternalParafarmacia.g:1582:1: ( 'Size' )
            // InternalParafarmacia.g:1583:2: 'Size'
            {
             before(grammarAccess.getAparienciaAccess().getSizeKeyword_32()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getAparienciaAccess().getSizeKeyword_32()); 

            }


            }

        }
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
    // InternalParafarmacia.g:1592:1: rule__Apariencia__Group__33 : rule__Apariencia__Group__33__Impl rule__Apariencia__Group__34 ;
    public final void rule__Apariencia__Group__33() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:1596:1: ( rule__Apariencia__Group__33__Impl rule__Apariencia__Group__34 )
            // InternalParafarmacia.g:1597:2: rule__Apariencia__Group__33__Impl rule__Apariencia__Group__34
            {
            pushFollow(FOLLOW_21);
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
    // InternalParafarmacia.g:1604:1: rule__Apariencia__Group__33__Impl : ( '=' ) ;
    public final void rule__Apariencia__Group__33__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:1608:1: ( ( '=' ) )
            // InternalParafarmacia.g:1609:1: ( '=' )
            {
            // InternalParafarmacia.g:1609:1: ( '=' )
            // InternalParafarmacia.g:1610:2: '='
            {
             before(grammarAccess.getAparienciaAccess().getEqualsSignKeyword_33()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getAparienciaAccess().getEqualsSignKeyword_33()); 

            }


            }

        }
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
    // InternalParafarmacia.g:1619:1: rule__Apariencia__Group__34 : rule__Apariencia__Group__34__Impl rule__Apariencia__Group__35 ;
    public final void rule__Apariencia__Group__34() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:1623:1: ( rule__Apariencia__Group__34__Impl rule__Apariencia__Group__35 )
            // InternalParafarmacia.g:1624:2: rule__Apariencia__Group__34__Impl rule__Apariencia__Group__35
            {
            pushFollow(FOLLOW_22);
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
    // InternalParafarmacia.g:1631:1: rule__Apariencia__Group__34__Impl : ( ( rule__Apariencia__SizeFuenteCuerpoAssignment_34 ) ) ;
    public final void rule__Apariencia__Group__34__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:1635:1: ( ( ( rule__Apariencia__SizeFuenteCuerpoAssignment_34 ) ) )
            // InternalParafarmacia.g:1636:1: ( ( rule__Apariencia__SizeFuenteCuerpoAssignment_34 ) )
            {
            // InternalParafarmacia.g:1636:1: ( ( rule__Apariencia__SizeFuenteCuerpoAssignment_34 ) )
            // InternalParafarmacia.g:1637:2: ( rule__Apariencia__SizeFuenteCuerpoAssignment_34 )
            {
             before(grammarAccess.getAparienciaAccess().getSizeFuenteCuerpoAssignment_34()); 
            // InternalParafarmacia.g:1638:2: ( rule__Apariencia__SizeFuenteCuerpoAssignment_34 )
            // InternalParafarmacia.g:1638:3: rule__Apariencia__SizeFuenteCuerpoAssignment_34
            {
            pushFollow(FOLLOW_2);
            rule__Apariencia__SizeFuenteCuerpoAssignment_34();

            state._fsp--;


            }

             after(grammarAccess.getAparienciaAccess().getSizeFuenteCuerpoAssignment_34()); 

            }


            }

        }
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
    // InternalParafarmacia.g:1646:1: rule__Apariencia__Group__35 : rule__Apariencia__Group__35__Impl rule__Apariencia__Group__36 ;
    public final void rule__Apariencia__Group__35() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:1650:1: ( rule__Apariencia__Group__35__Impl rule__Apariencia__Group__36 )
            // InternalParafarmacia.g:1651:2: rule__Apariencia__Group__35__Impl rule__Apariencia__Group__36
            {
            pushFollow(FOLLOW_8);
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
    // InternalParafarmacia.g:1658:1: rule__Apariencia__Group__35__Impl : ( 'px' ) ;
    public final void rule__Apariencia__Group__35__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:1662:1: ( ( 'px' ) )
            // InternalParafarmacia.g:1663:1: ( 'px' )
            {
            // InternalParafarmacia.g:1663:1: ( 'px' )
            // InternalParafarmacia.g:1664:2: 'px'
            {
             before(grammarAccess.getAparienciaAccess().getPxKeyword_35()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getAparienciaAccess().getPxKeyword_35()); 

            }


            }

        }
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
    // InternalParafarmacia.g:1673:1: rule__Apariencia__Group__36 : rule__Apariencia__Group__36__Impl rule__Apariencia__Group__37 ;
    public final void rule__Apariencia__Group__36() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:1677:1: ( rule__Apariencia__Group__36__Impl rule__Apariencia__Group__37 )
            // InternalParafarmacia.g:1678:2: rule__Apariencia__Group__36__Impl rule__Apariencia__Group__37
            {
            pushFollow(FOLLOW_14);
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
    // InternalParafarmacia.g:1685:1: rule__Apariencia__Group__36__Impl : ( ';' ) ;
    public final void rule__Apariencia__Group__36__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:1689:1: ( ( ';' ) )
            // InternalParafarmacia.g:1690:1: ( ';' )
            {
            // InternalParafarmacia.g:1690:1: ( ';' )
            // InternalParafarmacia.g:1691:2: ';'
            {
             before(grammarAccess.getAparienciaAccess().getSemicolonKeyword_36()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getAparienciaAccess().getSemicolonKeyword_36()); 

            }


            }

        }
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
    // InternalParafarmacia.g:1700:1: rule__Apariencia__Group__37 : rule__Apariencia__Group__37__Impl rule__Apariencia__Group__38 ;
    public final void rule__Apariencia__Group__37() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:1704:1: ( rule__Apariencia__Group__37__Impl rule__Apariencia__Group__38 )
            // InternalParafarmacia.g:1705:2: rule__Apariencia__Group__37__Impl rule__Apariencia__Group__38
            {
            pushFollow(FOLLOW_14);
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
    // InternalParafarmacia.g:1712:1: rule__Apariencia__Group__37__Impl : ( '}' ) ;
    public final void rule__Apariencia__Group__37__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:1716:1: ( ( '}' ) )
            // InternalParafarmacia.g:1717:1: ( '}' )
            {
            // InternalParafarmacia.g:1717:1: ( '}' )
            // InternalParafarmacia.g:1718:2: '}'
            {
             before(grammarAccess.getAparienciaAccess().getRightCurlyBracketKeyword_37()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getAparienciaAccess().getRightCurlyBracketKeyword_37()); 

            }


            }

        }
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
    // InternalParafarmacia.g:1727:1: rule__Apariencia__Group__38 : rule__Apariencia__Group__38__Impl ;
    public final void rule__Apariencia__Group__38() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:1731:1: ( rule__Apariencia__Group__38__Impl )
            // InternalParafarmacia.g:1732:2: rule__Apariencia__Group__38__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Apariencia__Group__38__Impl();

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
    // InternalParafarmacia.g:1738:1: rule__Apariencia__Group__38__Impl : ( '}' ) ;
    public final void rule__Apariencia__Group__38__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:1742:1: ( ( '}' ) )
            // InternalParafarmacia.g:1743:1: ( '}' )
            {
            // InternalParafarmacia.g:1743:1: ( '}' )
            // InternalParafarmacia.g:1744:2: '}'
            {
             before(grammarAccess.getAparienciaAccess().getRightCurlyBracketKeyword_38()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getAparienciaAccess().getRightCurlyBracketKeyword_38()); 

            }


            }

        }
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


    // $ANTLR start "rule__Pagina__Group__0"
    // InternalParafarmacia.g:1754:1: rule__Pagina__Group__0 : rule__Pagina__Group__0__Impl rule__Pagina__Group__1 ;
    public final void rule__Pagina__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:1758:1: ( rule__Pagina__Group__0__Impl rule__Pagina__Group__1 )
            // InternalParafarmacia.g:1759:2: rule__Pagina__Group__0__Impl rule__Pagina__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__Pagina__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pagina__Group__1();

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
    // $ANTLR end "rule__Pagina__Group__0"


    // $ANTLR start "rule__Pagina__Group__0__Impl"
    // InternalParafarmacia.g:1766:1: rule__Pagina__Group__0__Impl : ( 'Pagina' ) ;
    public final void rule__Pagina__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:1770:1: ( ( 'Pagina' ) )
            // InternalParafarmacia.g:1771:1: ( 'Pagina' )
            {
            // InternalParafarmacia.g:1771:1: ( 'Pagina' )
            // InternalParafarmacia.g:1772:2: 'Pagina'
            {
             before(grammarAccess.getPaginaAccess().getPaginaKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getPaginaAccess().getPaginaKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pagina__Group__0__Impl"


    // $ANTLR start "rule__Pagina__Group__1"
    // InternalParafarmacia.g:1781:1: rule__Pagina__Group__1 : rule__Pagina__Group__1__Impl rule__Pagina__Group__2 ;
    public final void rule__Pagina__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:1785:1: ( rule__Pagina__Group__1__Impl rule__Pagina__Group__2 )
            // InternalParafarmacia.g:1786:2: rule__Pagina__Group__1__Impl rule__Pagina__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Pagina__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pagina__Group__2();

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
    // $ANTLR end "rule__Pagina__Group__1"


    // $ANTLR start "rule__Pagina__Group__1__Impl"
    // InternalParafarmacia.g:1793:1: rule__Pagina__Group__1__Impl : ( ( rule__Pagina__NameAssignment_1 ) ) ;
    public final void rule__Pagina__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:1797:1: ( ( ( rule__Pagina__NameAssignment_1 ) ) )
            // InternalParafarmacia.g:1798:1: ( ( rule__Pagina__NameAssignment_1 ) )
            {
            // InternalParafarmacia.g:1798:1: ( ( rule__Pagina__NameAssignment_1 ) )
            // InternalParafarmacia.g:1799:2: ( rule__Pagina__NameAssignment_1 )
            {
             before(grammarAccess.getPaginaAccess().getNameAssignment_1()); 
            // InternalParafarmacia.g:1800:2: ( rule__Pagina__NameAssignment_1 )
            // InternalParafarmacia.g:1800:3: rule__Pagina__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Pagina__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPaginaAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pagina__Group__1__Impl"


    // $ANTLR start "rule__Pagina__Group__2"
    // InternalParafarmacia.g:1808:1: rule__Pagina__Group__2 : rule__Pagina__Group__2__Impl rule__Pagina__Group__3 ;
    public final void rule__Pagina__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:1812:1: ( rule__Pagina__Group__2__Impl rule__Pagina__Group__3 )
            // InternalParafarmacia.g:1813:2: rule__Pagina__Group__2__Impl rule__Pagina__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Pagina__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pagina__Group__3();

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
    // $ANTLR end "rule__Pagina__Group__2"


    // $ANTLR start "rule__Pagina__Group__2__Impl"
    // InternalParafarmacia.g:1820:1: rule__Pagina__Group__2__Impl : ( ';' ) ;
    public final void rule__Pagina__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:1824:1: ( ( ';' ) )
            // InternalParafarmacia.g:1825:1: ( ';' )
            {
            // InternalParafarmacia.g:1825:1: ( ';' )
            // InternalParafarmacia.g:1826:2: ';'
            {
             before(grammarAccess.getPaginaAccess().getSemicolonKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getPaginaAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pagina__Group__2__Impl"


    // $ANTLR start "rule__Pagina__Group__3"
    // InternalParafarmacia.g:1835:1: rule__Pagina__Group__3 : rule__Pagina__Group__3__Impl rule__Pagina__Group__4 ;
    public final void rule__Pagina__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:1839:1: ( rule__Pagina__Group__3__Impl rule__Pagina__Group__4 )
            // InternalParafarmacia.g:1840:2: rule__Pagina__Group__3__Impl rule__Pagina__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Pagina__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pagina__Group__4();

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
    // $ANTLR end "rule__Pagina__Group__3"


    // $ANTLR start "rule__Pagina__Group__3__Impl"
    // InternalParafarmacia.g:1847:1: rule__Pagina__Group__3__Impl : ( 'Titulo' ) ;
    public final void rule__Pagina__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:1851:1: ( ( 'Titulo' ) )
            // InternalParafarmacia.g:1852:1: ( 'Titulo' )
            {
            // InternalParafarmacia.g:1852:1: ( 'Titulo' )
            // InternalParafarmacia.g:1853:2: 'Titulo'
            {
             before(grammarAccess.getPaginaAccess().getTituloKeyword_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getPaginaAccess().getTituloKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pagina__Group__3__Impl"


    // $ANTLR start "rule__Pagina__Group__4"
    // InternalParafarmacia.g:1862:1: rule__Pagina__Group__4 : rule__Pagina__Group__4__Impl rule__Pagina__Group__5 ;
    public final void rule__Pagina__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:1866:1: ( rule__Pagina__Group__4__Impl rule__Pagina__Group__5 )
            // InternalParafarmacia.g:1867:2: rule__Pagina__Group__4__Impl rule__Pagina__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Pagina__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pagina__Group__5();

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
    // $ANTLR end "rule__Pagina__Group__4"


    // $ANTLR start "rule__Pagina__Group__4__Impl"
    // InternalParafarmacia.g:1874:1: rule__Pagina__Group__4__Impl : ( ( rule__Pagina__TituloAssignment_4 ) ) ;
    public final void rule__Pagina__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:1878:1: ( ( ( rule__Pagina__TituloAssignment_4 ) ) )
            // InternalParafarmacia.g:1879:1: ( ( rule__Pagina__TituloAssignment_4 ) )
            {
            // InternalParafarmacia.g:1879:1: ( ( rule__Pagina__TituloAssignment_4 ) )
            // InternalParafarmacia.g:1880:2: ( rule__Pagina__TituloAssignment_4 )
            {
             before(grammarAccess.getPaginaAccess().getTituloAssignment_4()); 
            // InternalParafarmacia.g:1881:2: ( rule__Pagina__TituloAssignment_4 )
            // InternalParafarmacia.g:1881:3: rule__Pagina__TituloAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Pagina__TituloAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getPaginaAccess().getTituloAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pagina__Group__4__Impl"


    // $ANTLR start "rule__Pagina__Group__5"
    // InternalParafarmacia.g:1889:1: rule__Pagina__Group__5 : rule__Pagina__Group__5__Impl rule__Pagina__Group__6 ;
    public final void rule__Pagina__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:1893:1: ( rule__Pagina__Group__5__Impl rule__Pagina__Group__6 )
            // InternalParafarmacia.g:1894:2: rule__Pagina__Group__5__Impl rule__Pagina__Group__6
            {
            pushFollow(FOLLOW_24);
            rule__Pagina__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pagina__Group__6();

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
    // $ANTLR end "rule__Pagina__Group__5"


    // $ANTLR start "rule__Pagina__Group__5__Impl"
    // InternalParafarmacia.g:1901:1: rule__Pagina__Group__5__Impl : ( ';' ) ;
    public final void rule__Pagina__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:1905:1: ( ( ';' ) )
            // InternalParafarmacia.g:1906:1: ( ';' )
            {
            // InternalParafarmacia.g:1906:1: ( ';' )
            // InternalParafarmacia.g:1907:2: ';'
            {
             before(grammarAccess.getPaginaAccess().getSemicolonKeyword_5()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getPaginaAccess().getSemicolonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pagina__Group__5__Impl"


    // $ANTLR start "rule__Pagina__Group__6"
    // InternalParafarmacia.g:1916:1: rule__Pagina__Group__6 : rule__Pagina__Group__6__Impl rule__Pagina__Group__7 ;
    public final void rule__Pagina__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:1920:1: ( rule__Pagina__Group__6__Impl rule__Pagina__Group__7 )
            // InternalParafarmacia.g:1921:2: rule__Pagina__Group__6__Impl rule__Pagina__Group__7
            {
            pushFollow(FOLLOW_4);
            rule__Pagina__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pagina__Group__7();

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
    // $ANTLR end "rule__Pagina__Group__6"


    // $ANTLR start "rule__Pagina__Group__6__Impl"
    // InternalParafarmacia.g:1928:1: rule__Pagina__Group__6__Impl : ( 'Cuerpo' ) ;
    public final void rule__Pagina__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:1932:1: ( ( 'Cuerpo' ) )
            // InternalParafarmacia.g:1933:1: ( 'Cuerpo' )
            {
            // InternalParafarmacia.g:1933:1: ( 'Cuerpo' )
            // InternalParafarmacia.g:1934:2: 'Cuerpo'
            {
             before(grammarAccess.getPaginaAccess().getCuerpoKeyword_6()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getPaginaAccess().getCuerpoKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pagina__Group__6__Impl"


    // $ANTLR start "rule__Pagina__Group__7"
    // InternalParafarmacia.g:1943:1: rule__Pagina__Group__7 : rule__Pagina__Group__7__Impl rule__Pagina__Group__8 ;
    public final void rule__Pagina__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:1947:1: ( rule__Pagina__Group__7__Impl rule__Pagina__Group__8 )
            // InternalParafarmacia.g:1948:2: rule__Pagina__Group__7__Impl rule__Pagina__Group__8
            {
            pushFollow(FOLLOW_27);
            rule__Pagina__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pagina__Group__8();

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
    // $ANTLR end "rule__Pagina__Group__7"


    // $ANTLR start "rule__Pagina__Group__7__Impl"
    // InternalParafarmacia.g:1955:1: rule__Pagina__Group__7__Impl : ( '{' ) ;
    public final void rule__Pagina__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:1959:1: ( ( '{' ) )
            // InternalParafarmacia.g:1960:1: ( '{' )
            {
            // InternalParafarmacia.g:1960:1: ( '{' )
            // InternalParafarmacia.g:1961:2: '{'
            {
             before(grammarAccess.getPaginaAccess().getLeftCurlyBracketKeyword_7()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getPaginaAccess().getLeftCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pagina__Group__7__Impl"


    // $ANTLR start "rule__Pagina__Group__8"
    // InternalParafarmacia.g:1970:1: rule__Pagina__Group__8 : rule__Pagina__Group__8__Impl rule__Pagina__Group__9 ;
    public final void rule__Pagina__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:1974:1: ( rule__Pagina__Group__8__Impl rule__Pagina__Group__9 )
            // InternalParafarmacia.g:1975:2: rule__Pagina__Group__8__Impl rule__Pagina__Group__9
            {
            pushFollow(FOLLOW_14);
            rule__Pagina__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pagina__Group__9();

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
    // $ANTLR end "rule__Pagina__Group__8"


    // $ANTLR start "rule__Pagina__Group__8__Impl"
    // InternalParafarmacia.g:1982:1: rule__Pagina__Group__8__Impl : ( ( rule__Pagina__CuerpoAssignment_8 ) ) ;
    public final void rule__Pagina__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:1986:1: ( ( ( rule__Pagina__CuerpoAssignment_8 ) ) )
            // InternalParafarmacia.g:1987:1: ( ( rule__Pagina__CuerpoAssignment_8 ) )
            {
            // InternalParafarmacia.g:1987:1: ( ( rule__Pagina__CuerpoAssignment_8 ) )
            // InternalParafarmacia.g:1988:2: ( rule__Pagina__CuerpoAssignment_8 )
            {
             before(grammarAccess.getPaginaAccess().getCuerpoAssignment_8()); 
            // InternalParafarmacia.g:1989:2: ( rule__Pagina__CuerpoAssignment_8 )
            // InternalParafarmacia.g:1989:3: rule__Pagina__CuerpoAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Pagina__CuerpoAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getPaginaAccess().getCuerpoAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pagina__Group__8__Impl"


    // $ANTLR start "rule__Pagina__Group__9"
    // InternalParafarmacia.g:1997:1: rule__Pagina__Group__9 : rule__Pagina__Group__9__Impl ;
    public final void rule__Pagina__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:2001:1: ( rule__Pagina__Group__9__Impl )
            // InternalParafarmacia.g:2002:2: rule__Pagina__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pagina__Group__9__Impl();

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
    // $ANTLR end "rule__Pagina__Group__9"


    // $ANTLR start "rule__Pagina__Group__9__Impl"
    // InternalParafarmacia.g:2008:1: rule__Pagina__Group__9__Impl : ( '}' ) ;
    public final void rule__Pagina__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:2012:1: ( ( '}' ) )
            // InternalParafarmacia.g:2013:1: ( '}' )
            {
            // InternalParafarmacia.g:2013:1: ( '}' )
            // InternalParafarmacia.g:2014:2: '}'
            {
             before(grammarAccess.getPaginaAccess().getRightCurlyBracketKeyword_9()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getPaginaAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pagina__Group__9__Impl"


    // $ANTLR start "rule__Cuerpo__Group_0__0"
    // InternalParafarmacia.g:2024:1: rule__Cuerpo__Group_0__0 : rule__Cuerpo__Group_0__0__Impl rule__Cuerpo__Group_0__1 ;
    public final void rule__Cuerpo__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:2028:1: ( rule__Cuerpo__Group_0__0__Impl rule__Cuerpo__Group_0__1 )
            // InternalParafarmacia.g:2029:2: rule__Cuerpo__Group_0__0__Impl rule__Cuerpo__Group_0__1
            {
            pushFollow(FOLLOW_8);
            rule__Cuerpo__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cuerpo__Group_0__1();

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
    // $ANTLR end "rule__Cuerpo__Group_0__0"


    // $ANTLR start "rule__Cuerpo__Group_0__0__Impl"
    // InternalParafarmacia.g:2036:1: rule__Cuerpo__Group_0__0__Impl : ( ( rule__Cuerpo__TextoAssignment_0_0 ) ) ;
    public final void rule__Cuerpo__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:2040:1: ( ( ( rule__Cuerpo__TextoAssignment_0_0 ) ) )
            // InternalParafarmacia.g:2041:1: ( ( rule__Cuerpo__TextoAssignment_0_0 ) )
            {
            // InternalParafarmacia.g:2041:1: ( ( rule__Cuerpo__TextoAssignment_0_0 ) )
            // InternalParafarmacia.g:2042:2: ( rule__Cuerpo__TextoAssignment_0_0 )
            {
             before(grammarAccess.getCuerpoAccess().getTextoAssignment_0_0()); 
            // InternalParafarmacia.g:2043:2: ( rule__Cuerpo__TextoAssignment_0_0 )
            // InternalParafarmacia.g:2043:3: rule__Cuerpo__TextoAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Cuerpo__TextoAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getCuerpoAccess().getTextoAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cuerpo__Group_0__0__Impl"


    // $ANTLR start "rule__Cuerpo__Group_0__1"
    // InternalParafarmacia.g:2051:1: rule__Cuerpo__Group_0__1 : rule__Cuerpo__Group_0__1__Impl ;
    public final void rule__Cuerpo__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:2055:1: ( rule__Cuerpo__Group_0__1__Impl )
            // InternalParafarmacia.g:2056:2: rule__Cuerpo__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Cuerpo__Group_0__1__Impl();

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
    // $ANTLR end "rule__Cuerpo__Group_0__1"


    // $ANTLR start "rule__Cuerpo__Group_0__1__Impl"
    // InternalParafarmacia.g:2062:1: rule__Cuerpo__Group_0__1__Impl : ( ';' ) ;
    public final void rule__Cuerpo__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:2066:1: ( ( ';' ) )
            // InternalParafarmacia.g:2067:1: ( ';' )
            {
            // InternalParafarmacia.g:2067:1: ( ';' )
            // InternalParafarmacia.g:2068:2: ';'
            {
             before(grammarAccess.getCuerpoAccess().getSemicolonKeyword_0_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getCuerpoAccess().getSemicolonKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cuerpo__Group_0__1__Impl"


    // $ANTLR start "rule__Producto__Group__0"
    // InternalParafarmacia.g:2078:1: rule__Producto__Group__0 : rule__Producto__Group__0__Impl rule__Producto__Group__1 ;
    public final void rule__Producto__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:2082:1: ( rule__Producto__Group__0__Impl rule__Producto__Group__1 )
            // InternalParafarmacia.g:2083:2: rule__Producto__Group__0__Impl rule__Producto__Group__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalParafarmacia.g:2090:1: rule__Producto__Group__0__Impl : ( 'Producto' ) ;
    public final void rule__Producto__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:2094:1: ( ( 'Producto' ) )
            // InternalParafarmacia.g:2095:1: ( 'Producto' )
            {
            // InternalParafarmacia.g:2095:1: ( 'Producto' )
            // InternalParafarmacia.g:2096:2: 'Producto'
            {
             before(grammarAccess.getProductoAccess().getProductoKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getProductoAccess().getProductoKeyword_0()); 

            }


            }

        }
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
    // InternalParafarmacia.g:2105:1: rule__Producto__Group__1 : rule__Producto__Group__1__Impl rule__Producto__Group__2 ;
    public final void rule__Producto__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:2109:1: ( rule__Producto__Group__1__Impl rule__Producto__Group__2 )
            // InternalParafarmacia.g:2110:2: rule__Producto__Group__1__Impl rule__Producto__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalParafarmacia.g:2117:1: rule__Producto__Group__1__Impl : ( ( rule__Producto__NameAssignment_1 ) ) ;
    public final void rule__Producto__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:2121:1: ( ( ( rule__Producto__NameAssignment_1 ) ) )
            // InternalParafarmacia.g:2122:1: ( ( rule__Producto__NameAssignment_1 ) )
            {
            // InternalParafarmacia.g:2122:1: ( ( rule__Producto__NameAssignment_1 ) )
            // InternalParafarmacia.g:2123:2: ( rule__Producto__NameAssignment_1 )
            {
             before(grammarAccess.getProductoAccess().getNameAssignment_1()); 
            // InternalParafarmacia.g:2124:2: ( rule__Producto__NameAssignment_1 )
            // InternalParafarmacia.g:2124:3: rule__Producto__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Producto__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProductoAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalParafarmacia.g:2132:1: rule__Producto__Group__2 : rule__Producto__Group__2__Impl rule__Producto__Group__3 ;
    public final void rule__Producto__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:2136:1: ( rule__Producto__Group__2__Impl rule__Producto__Group__3 )
            // InternalParafarmacia.g:2137:2: rule__Producto__Group__2__Impl rule__Producto__Group__3
            {
            pushFollow(FOLLOW_21);
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
    // InternalParafarmacia.g:2144:1: rule__Producto__Group__2__Impl : ( ( rule__Producto__NombreAssignment_2 ) ) ;
    public final void rule__Producto__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:2148:1: ( ( ( rule__Producto__NombreAssignment_2 ) ) )
            // InternalParafarmacia.g:2149:1: ( ( rule__Producto__NombreAssignment_2 ) )
            {
            // InternalParafarmacia.g:2149:1: ( ( rule__Producto__NombreAssignment_2 ) )
            // InternalParafarmacia.g:2150:2: ( rule__Producto__NombreAssignment_2 )
            {
             before(grammarAccess.getProductoAccess().getNombreAssignment_2()); 
            // InternalParafarmacia.g:2151:2: ( rule__Producto__NombreAssignment_2 )
            // InternalParafarmacia.g:2151:3: rule__Producto__NombreAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Producto__NombreAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getProductoAccess().getNombreAssignment_2()); 

            }


            }

        }
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
    // InternalParafarmacia.g:2159:1: rule__Producto__Group__3 : rule__Producto__Group__3__Impl rule__Producto__Group__4 ;
    public final void rule__Producto__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:2163:1: ( rule__Producto__Group__3__Impl rule__Producto__Group__4 )
            // InternalParafarmacia.g:2164:2: rule__Producto__Group__3__Impl rule__Producto__Group__4
            {
            pushFollow(FOLLOW_28);
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
    // InternalParafarmacia.g:2171:1: rule__Producto__Group__3__Impl : ( ( rule__Producto__PrecioAssignment_3 ) ) ;
    public final void rule__Producto__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:2175:1: ( ( ( rule__Producto__PrecioAssignment_3 ) ) )
            // InternalParafarmacia.g:2176:1: ( ( rule__Producto__PrecioAssignment_3 ) )
            {
            // InternalParafarmacia.g:2176:1: ( ( rule__Producto__PrecioAssignment_3 ) )
            // InternalParafarmacia.g:2177:2: ( rule__Producto__PrecioAssignment_3 )
            {
             before(grammarAccess.getProductoAccess().getPrecioAssignment_3()); 
            // InternalParafarmacia.g:2178:2: ( rule__Producto__PrecioAssignment_3 )
            // InternalParafarmacia.g:2178:3: rule__Producto__PrecioAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Producto__PrecioAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getProductoAccess().getPrecioAssignment_3()); 

            }


            }

        }
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
    // InternalParafarmacia.g:2186:1: rule__Producto__Group__4 : rule__Producto__Group__4__Impl rule__Producto__Group__5 ;
    public final void rule__Producto__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:2190:1: ( rule__Producto__Group__4__Impl rule__Producto__Group__5 )
            // InternalParafarmacia.g:2191:2: rule__Producto__Group__4__Impl rule__Producto__Group__5
            {
            pushFollow(FOLLOW_28);
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
    // InternalParafarmacia.g:2198:1: rule__Producto__Group__4__Impl : ( ( rule__Producto__Group_4__0 )? ) ;
    public final void rule__Producto__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:2202:1: ( ( ( rule__Producto__Group_4__0 )? ) )
            // InternalParafarmacia.g:2203:1: ( ( rule__Producto__Group_4__0 )? )
            {
            // InternalParafarmacia.g:2203:1: ( ( rule__Producto__Group_4__0 )? )
            // InternalParafarmacia.g:2204:2: ( rule__Producto__Group_4__0 )?
            {
             before(grammarAccess.getProductoAccess().getGroup_4()); 
            // InternalParafarmacia.g:2205:2: ( rule__Producto__Group_4__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==31) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalParafarmacia.g:2205:3: rule__Producto__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Producto__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProductoAccess().getGroup_4()); 

            }


            }

        }
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
    // InternalParafarmacia.g:2213:1: rule__Producto__Group__5 : rule__Producto__Group__5__Impl rule__Producto__Group__6 ;
    public final void rule__Producto__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:2217:1: ( rule__Producto__Group__5__Impl rule__Producto__Group__6 )
            // InternalParafarmacia.g:2218:2: rule__Producto__Group__5__Impl rule__Producto__Group__6
            {
            pushFollow(FOLLOW_28);
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
    // InternalParafarmacia.g:2225:1: rule__Producto__Group__5__Impl : ( ( rule__Producto__ConrecetaAssignment_5 )? ) ;
    public final void rule__Producto__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:2229:1: ( ( ( rule__Producto__ConrecetaAssignment_5 )? ) )
            // InternalParafarmacia.g:2230:1: ( ( rule__Producto__ConrecetaAssignment_5 )? )
            {
            // InternalParafarmacia.g:2230:1: ( ( rule__Producto__ConrecetaAssignment_5 )? )
            // InternalParafarmacia.g:2231:2: ( rule__Producto__ConrecetaAssignment_5 )?
            {
             before(grammarAccess.getProductoAccess().getConrecetaAssignment_5()); 
            // InternalParafarmacia.g:2232:2: ( rule__Producto__ConrecetaAssignment_5 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==35) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalParafarmacia.g:2232:3: rule__Producto__ConrecetaAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Producto__ConrecetaAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProductoAccess().getConrecetaAssignment_5()); 

            }


            }

        }
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
    // InternalParafarmacia.g:2240:1: rule__Producto__Group__6 : rule__Producto__Group__6__Impl rule__Producto__Group__7 ;
    public final void rule__Producto__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:2244:1: ( rule__Producto__Group__6__Impl rule__Producto__Group__7 )
            // InternalParafarmacia.g:2245:2: rule__Producto__Group__6__Impl rule__Producto__Group__7
            {
            pushFollow(FOLLOW_8);
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
    // InternalParafarmacia.g:2252:1: rule__Producto__Group__6__Impl : ( ( rule__Producto__Group_6__0 ) ) ;
    public final void rule__Producto__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:2256:1: ( ( ( rule__Producto__Group_6__0 ) ) )
            // InternalParafarmacia.g:2257:1: ( ( rule__Producto__Group_6__0 ) )
            {
            // InternalParafarmacia.g:2257:1: ( ( rule__Producto__Group_6__0 ) )
            // InternalParafarmacia.g:2258:2: ( rule__Producto__Group_6__0 )
            {
             before(grammarAccess.getProductoAccess().getGroup_6()); 
            // InternalParafarmacia.g:2259:2: ( rule__Producto__Group_6__0 )
            // InternalParafarmacia.g:2259:3: rule__Producto__Group_6__0
            {
            pushFollow(FOLLOW_2);
            rule__Producto__Group_6__0();

            state._fsp--;


            }

             after(grammarAccess.getProductoAccess().getGroup_6()); 

            }


            }

        }
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
    // InternalParafarmacia.g:2267:1: rule__Producto__Group__7 : rule__Producto__Group__7__Impl ;
    public final void rule__Producto__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:2271:1: ( rule__Producto__Group__7__Impl )
            // InternalParafarmacia.g:2272:2: rule__Producto__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Producto__Group__7__Impl();

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
    // InternalParafarmacia.g:2278:1: rule__Producto__Group__7__Impl : ( ';' ) ;
    public final void rule__Producto__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:2282:1: ( ( ';' ) )
            // InternalParafarmacia.g:2283:1: ( ';' )
            {
            // InternalParafarmacia.g:2283:1: ( ';' )
            // InternalParafarmacia.g:2284:2: ';'
            {
             before(grammarAccess.getProductoAccess().getSemicolonKeyword_7()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getProductoAccess().getSemicolonKeyword_7()); 

            }


            }

        }
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


    // $ANTLR start "rule__Producto__Group_4__0"
    // InternalParafarmacia.g:2294:1: rule__Producto__Group_4__0 : rule__Producto__Group_4__0__Impl rule__Producto__Group_4__1 ;
    public final void rule__Producto__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:2298:1: ( rule__Producto__Group_4__0__Impl rule__Producto__Group_4__1 )
            // InternalParafarmacia.g:2299:2: rule__Producto__Group_4__0__Impl rule__Producto__Group_4__1
            {
            pushFollow(FOLLOW_7);
            rule__Producto__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Producto__Group_4__1();

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
    // $ANTLR end "rule__Producto__Group_4__0"


    // $ANTLR start "rule__Producto__Group_4__0__Impl"
    // InternalParafarmacia.g:2306:1: rule__Producto__Group_4__0__Impl : ( 'imagen' ) ;
    public final void rule__Producto__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:2310:1: ( ( 'imagen' ) )
            // InternalParafarmacia.g:2311:1: ( 'imagen' )
            {
            // InternalParafarmacia.g:2311:1: ( 'imagen' )
            // InternalParafarmacia.g:2312:2: 'imagen'
            {
             before(grammarAccess.getProductoAccess().getImagenKeyword_4_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getProductoAccess().getImagenKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Producto__Group_4__0__Impl"


    // $ANTLR start "rule__Producto__Group_4__1"
    // InternalParafarmacia.g:2321:1: rule__Producto__Group_4__1 : rule__Producto__Group_4__1__Impl ;
    public final void rule__Producto__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:2325:1: ( rule__Producto__Group_4__1__Impl )
            // InternalParafarmacia.g:2326:2: rule__Producto__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Producto__Group_4__1__Impl();

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
    // $ANTLR end "rule__Producto__Group_4__1"


    // $ANTLR start "rule__Producto__Group_4__1__Impl"
    // InternalParafarmacia.g:2332:1: rule__Producto__Group_4__1__Impl : ( ( rule__Producto__ImagenAssignment_4_1 ) ) ;
    public final void rule__Producto__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:2336:1: ( ( ( rule__Producto__ImagenAssignment_4_1 ) ) )
            // InternalParafarmacia.g:2337:1: ( ( rule__Producto__ImagenAssignment_4_1 ) )
            {
            // InternalParafarmacia.g:2337:1: ( ( rule__Producto__ImagenAssignment_4_1 ) )
            // InternalParafarmacia.g:2338:2: ( rule__Producto__ImagenAssignment_4_1 )
            {
             before(grammarAccess.getProductoAccess().getImagenAssignment_4_1()); 
            // InternalParafarmacia.g:2339:2: ( rule__Producto__ImagenAssignment_4_1 )
            // InternalParafarmacia.g:2339:3: rule__Producto__ImagenAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Producto__ImagenAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getProductoAccess().getImagenAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Producto__Group_4__1__Impl"


    // $ANTLR start "rule__Producto__Group_6__0"
    // InternalParafarmacia.g:2348:1: rule__Producto__Group_6__0 : rule__Producto__Group_6__0__Impl rule__Producto__Group_6__1 ;
    public final void rule__Producto__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:2352:1: ( rule__Producto__Group_6__0__Impl rule__Producto__Group_6__1 )
            // InternalParafarmacia.g:2353:2: rule__Producto__Group_6__0__Impl rule__Producto__Group_6__1
            {
            pushFollow(FOLLOW_7);
            rule__Producto__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Producto__Group_6__1();

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
    // $ANTLR end "rule__Producto__Group_6__0"


    // $ANTLR start "rule__Producto__Group_6__0__Impl"
    // InternalParafarmacia.g:2360:1: rule__Producto__Group_6__0__Impl : ( 'descripcion' ) ;
    public final void rule__Producto__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:2364:1: ( ( 'descripcion' ) )
            // InternalParafarmacia.g:2365:1: ( 'descripcion' )
            {
            // InternalParafarmacia.g:2365:1: ( 'descripcion' )
            // InternalParafarmacia.g:2366:2: 'descripcion'
            {
             before(grammarAccess.getProductoAccess().getDescripcionKeyword_6_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getProductoAccess().getDescripcionKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Producto__Group_6__0__Impl"


    // $ANTLR start "rule__Producto__Group_6__1"
    // InternalParafarmacia.g:2375:1: rule__Producto__Group_6__1 : rule__Producto__Group_6__1__Impl ;
    public final void rule__Producto__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:2379:1: ( rule__Producto__Group_6__1__Impl )
            // InternalParafarmacia.g:2380:2: rule__Producto__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Producto__Group_6__1__Impl();

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
    // $ANTLR end "rule__Producto__Group_6__1"


    // $ANTLR start "rule__Producto__Group_6__1__Impl"
    // InternalParafarmacia.g:2386:1: rule__Producto__Group_6__1__Impl : ( ( rule__Producto__DescripcionAssignment_6_1 ) ) ;
    public final void rule__Producto__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:2390:1: ( ( ( rule__Producto__DescripcionAssignment_6_1 ) ) )
            // InternalParafarmacia.g:2391:1: ( ( rule__Producto__DescripcionAssignment_6_1 ) )
            {
            // InternalParafarmacia.g:2391:1: ( ( rule__Producto__DescripcionAssignment_6_1 ) )
            // InternalParafarmacia.g:2392:2: ( rule__Producto__DescripcionAssignment_6_1 )
            {
             before(grammarAccess.getProductoAccess().getDescripcionAssignment_6_1()); 
            // InternalParafarmacia.g:2393:2: ( rule__Producto__DescripcionAssignment_6_1 )
            // InternalParafarmacia.g:2393:3: rule__Producto__DescripcionAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Producto__DescripcionAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getProductoAccess().getDescripcionAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Producto__Group_6__1__Impl"


    // $ANTLR start "rule__Precio__Group__0"
    // InternalParafarmacia.g:2402:1: rule__Precio__Group__0 : rule__Precio__Group__0__Impl rule__Precio__Group__1 ;
    public final void rule__Precio__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:2406:1: ( rule__Precio__Group__0__Impl rule__Precio__Group__1 )
            // InternalParafarmacia.g:2407:2: rule__Precio__Group__0__Impl rule__Precio__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalParafarmacia.g:2414:1: rule__Precio__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__Precio__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:2418:1: ( ( RULE_INT ) )
            // InternalParafarmacia.g:2419:1: ( RULE_INT )
            {
            // InternalParafarmacia.g:2419:1: ( RULE_INT )
            // InternalParafarmacia.g:2420:2: RULE_INT
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
    // InternalParafarmacia.g:2429:1: rule__Precio__Group__1 : rule__Precio__Group__1__Impl rule__Precio__Group__2 ;
    public final void rule__Precio__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:2433:1: ( rule__Precio__Group__1__Impl rule__Precio__Group__2 )
            // InternalParafarmacia.g:2434:2: rule__Precio__Group__1__Impl rule__Precio__Group__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalParafarmacia.g:2441:1: rule__Precio__Group__1__Impl : ( '.' ) ;
    public final void rule__Precio__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:2445:1: ( ( '.' ) )
            // InternalParafarmacia.g:2446:1: ( '.' )
            {
            // InternalParafarmacia.g:2446:1: ( '.' )
            // InternalParafarmacia.g:2447:2: '.'
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
    // InternalParafarmacia.g:2456:1: rule__Precio__Group__2 : rule__Precio__Group__2__Impl ;
    public final void rule__Precio__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:2460:1: ( rule__Precio__Group__2__Impl )
            // InternalParafarmacia.g:2461:2: rule__Precio__Group__2__Impl
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
    // InternalParafarmacia.g:2467:1: rule__Precio__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__Precio__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:2471:1: ( ( RULE_INT ) )
            // InternalParafarmacia.g:2472:1: ( RULE_INT )
            {
            // InternalParafarmacia.g:2472:1: ( RULE_INT )
            // InternalParafarmacia.g:2473:2: RULE_INT
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


    // $ANTLR start "rule__Color__Group__0"
    // InternalParafarmacia.g:2483:1: rule__Color__Group__0 : rule__Color__Group__0__Impl rule__Color__Group__1 ;
    public final void rule__Color__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:2487:1: ( rule__Color__Group__0__Impl rule__Color__Group__1 )
            // InternalParafarmacia.g:2488:2: rule__Color__Group__0__Impl rule__Color__Group__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalParafarmacia.g:2495:1: rule__Color__Group__0__Impl : ( '#' ) ;
    public final void rule__Color__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:2499:1: ( ( '#' ) )
            // InternalParafarmacia.g:2500:1: ( '#' )
            {
            // InternalParafarmacia.g:2500:1: ( '#' )
            // InternalParafarmacia.g:2501:2: '#'
            {
             before(grammarAccess.getColorAccess().getNumberSignKeyword_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalParafarmacia.g:2510:1: rule__Color__Group__1 : rule__Color__Group__1__Impl ;
    public final void rule__Color__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:2514:1: ( rule__Color__Group__1__Impl )
            // InternalParafarmacia.g:2515:2: rule__Color__Group__1__Impl
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
    // InternalParafarmacia.g:2521:1: rule__Color__Group__1__Impl : ( ( ( rule__Color__Alternatives_1 ) ) ( ( rule__Color__Alternatives_1 )* ) ) ;
    public final void rule__Color__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:2525:1: ( ( ( ( rule__Color__Alternatives_1 ) ) ( ( rule__Color__Alternatives_1 )* ) ) )
            // InternalParafarmacia.g:2526:1: ( ( ( rule__Color__Alternatives_1 ) ) ( ( rule__Color__Alternatives_1 )* ) )
            {
            // InternalParafarmacia.g:2526:1: ( ( ( rule__Color__Alternatives_1 ) ) ( ( rule__Color__Alternatives_1 )* ) )
            // InternalParafarmacia.g:2527:2: ( ( rule__Color__Alternatives_1 ) ) ( ( rule__Color__Alternatives_1 )* )
            {
            // InternalParafarmacia.g:2527:2: ( ( rule__Color__Alternatives_1 ) )
            // InternalParafarmacia.g:2528:3: ( rule__Color__Alternatives_1 )
            {
             before(grammarAccess.getColorAccess().getAlternatives_1()); 
            // InternalParafarmacia.g:2529:3: ( rule__Color__Alternatives_1 )
            // InternalParafarmacia.g:2529:4: rule__Color__Alternatives_1
            {
            pushFollow(FOLLOW_31);
            rule__Color__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getColorAccess().getAlternatives_1()); 

            }

            // InternalParafarmacia.g:2532:2: ( ( rule__Color__Alternatives_1 )* )
            // InternalParafarmacia.g:2533:3: ( rule__Color__Alternatives_1 )*
            {
             before(grammarAccess.getColorAccess().getAlternatives_1()); 
            // InternalParafarmacia.g:2534:3: ( rule__Color__Alternatives_1 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=RULE_ID && LA7_0<=RULE_INT)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalParafarmacia.g:2534:4: rule__Color__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_31);
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


    // $ANTLR start "rule__Parafarmacia__TituloAssignment_4"
    // InternalParafarmacia.g:2544:1: rule__Parafarmacia__TituloAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Parafarmacia__TituloAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:2548:1: ( ( RULE_STRING ) )
            // InternalParafarmacia.g:2549:2: ( RULE_STRING )
            {
            // InternalParafarmacia.g:2549:2: ( RULE_STRING )
            // InternalParafarmacia.g:2550:3: RULE_STRING
            {
             before(grammarAccess.getParafarmaciaAccess().getTituloSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getParafarmaciaAccess().getTituloSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parafarmacia__TituloAssignment_4"


    // $ANTLR start "rule__Parafarmacia__DescripcionAssignment_8"
    // InternalParafarmacia.g:2559:1: rule__Parafarmacia__DescripcionAssignment_8 : ( RULE_STRING ) ;
    public final void rule__Parafarmacia__DescripcionAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:2563:1: ( ( RULE_STRING ) )
            // InternalParafarmacia.g:2564:2: ( RULE_STRING )
            {
            // InternalParafarmacia.g:2564:2: ( RULE_STRING )
            // InternalParafarmacia.g:2565:3: RULE_STRING
            {
             before(grammarAccess.getParafarmaciaAccess().getDescripcionSTRINGTerminalRuleCall_8_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getParafarmaciaAccess().getDescripcionSTRINGTerminalRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parafarmacia__DescripcionAssignment_8"


    // $ANTLR start "rule__Parafarmacia__AparienciaAssignment_10"
    // InternalParafarmacia.g:2574:1: rule__Parafarmacia__AparienciaAssignment_10 : ( ruleApariencia ) ;
    public final void rule__Parafarmacia__AparienciaAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:2578:1: ( ( ruleApariencia ) )
            // InternalParafarmacia.g:2579:2: ( ruleApariencia )
            {
            // InternalParafarmacia.g:2579:2: ( ruleApariencia )
            // InternalParafarmacia.g:2580:3: ruleApariencia
            {
             before(grammarAccess.getParafarmaciaAccess().getAparienciaAparienciaParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleApariencia();

            state._fsp--;

             after(grammarAccess.getParafarmaciaAccess().getAparienciaAparienciaParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parafarmacia__AparienciaAssignment_10"


    // $ANTLR start "rule__Parafarmacia__PaginasAssignment_13"
    // InternalParafarmacia.g:2589:1: rule__Parafarmacia__PaginasAssignment_13 : ( rulePagina ) ;
    public final void rule__Parafarmacia__PaginasAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:2593:1: ( ( rulePagina ) )
            // InternalParafarmacia.g:2594:2: ( rulePagina )
            {
            // InternalParafarmacia.g:2594:2: ( rulePagina )
            // InternalParafarmacia.g:2595:3: rulePagina
            {
             before(grammarAccess.getParafarmaciaAccess().getPaginasPaginaParserRuleCall_13_0()); 
            pushFollow(FOLLOW_2);
            rulePagina();

            state._fsp--;

             after(grammarAccess.getParafarmaciaAccess().getPaginasPaginaParserRuleCall_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parafarmacia__PaginasAssignment_13"


    // $ANTLR start "rule__Apariencia__ColorFondo1Assignment_4"
    // InternalParafarmacia.g:2604:1: rule__Apariencia__ColorFondo1Assignment_4 : ( ruleColor ) ;
    public final void rule__Apariencia__ColorFondo1Assignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:2608:1: ( ( ruleColor ) )
            // InternalParafarmacia.g:2609:2: ( ruleColor )
            {
            // InternalParafarmacia.g:2609:2: ( ruleColor )
            // InternalParafarmacia.g:2610:3: ruleColor
            {
             before(grammarAccess.getAparienciaAccess().getColorFondo1ColorParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleColor();

            state._fsp--;

             after(grammarAccess.getAparienciaAccess().getColorFondo1ColorParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Apariencia__ColorFondo1Assignment_4"


    // $ANTLR start "rule__Apariencia__ColorFondo2Assignment_8"
    // InternalParafarmacia.g:2619:1: rule__Apariencia__ColorFondo2Assignment_8 : ( ruleColor ) ;
    public final void rule__Apariencia__ColorFondo2Assignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:2623:1: ( ( ruleColor ) )
            // InternalParafarmacia.g:2624:2: ( ruleColor )
            {
            // InternalParafarmacia.g:2624:2: ( ruleColor )
            // InternalParafarmacia.g:2625:3: ruleColor
            {
             before(grammarAccess.getAparienciaAccess().getColorFondo2ColorParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleColor();

            state._fsp--;

             after(grammarAccess.getAparienciaAccess().getColorFondo2ColorParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Apariencia__ColorFondo2Assignment_8"


    // $ANTLR start "rule__Apariencia__ColorTextoAssignment_12"
    // InternalParafarmacia.g:2634:1: rule__Apariencia__ColorTextoAssignment_12 : ( ruleColor ) ;
    public final void rule__Apariencia__ColorTextoAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:2638:1: ( ( ruleColor ) )
            // InternalParafarmacia.g:2639:2: ( ruleColor )
            {
            // InternalParafarmacia.g:2639:2: ( ruleColor )
            // InternalParafarmacia.g:2640:3: ruleColor
            {
             before(grammarAccess.getAparienciaAccess().getColorTextoColorParserRuleCall_12_0()); 
            pushFollow(FOLLOW_2);
            ruleColor();

            state._fsp--;

             after(grammarAccess.getAparienciaAccess().getColorTextoColorParserRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Apariencia__ColorTextoAssignment_12"


    // $ANTLR start "rule__Apariencia__SizeFuenteH1Assignment_21"
    // InternalParafarmacia.g:2649:1: rule__Apariencia__SizeFuenteH1Assignment_21 : ( RULE_INT ) ;
    public final void rule__Apariencia__SizeFuenteH1Assignment_21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:2653:1: ( ( RULE_INT ) )
            // InternalParafarmacia.g:2654:2: ( RULE_INT )
            {
            // InternalParafarmacia.g:2654:2: ( RULE_INT )
            // InternalParafarmacia.g:2655:3: RULE_INT
            {
             before(grammarAccess.getAparienciaAccess().getSizeFuenteH1INTTerminalRuleCall_21_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getAparienciaAccess().getSizeFuenteH1INTTerminalRuleCall_21_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Apariencia__SizeFuenteH1Assignment_21"


    // $ANTLR start "rule__Apariencia__SizeFuenteH2Assignment_26"
    // InternalParafarmacia.g:2664:1: rule__Apariencia__SizeFuenteH2Assignment_26 : ( RULE_INT ) ;
    public final void rule__Apariencia__SizeFuenteH2Assignment_26() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:2668:1: ( ( RULE_INT ) )
            // InternalParafarmacia.g:2669:2: ( RULE_INT )
            {
            // InternalParafarmacia.g:2669:2: ( RULE_INT )
            // InternalParafarmacia.g:2670:3: RULE_INT
            {
             before(grammarAccess.getAparienciaAccess().getSizeFuenteH2INTTerminalRuleCall_26_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getAparienciaAccess().getSizeFuenteH2INTTerminalRuleCall_26_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Apariencia__SizeFuenteH2Assignment_26"


    // $ANTLR start "rule__Apariencia__SizeFuenteCuerpoAssignment_34"
    // InternalParafarmacia.g:2679:1: rule__Apariencia__SizeFuenteCuerpoAssignment_34 : ( RULE_INT ) ;
    public final void rule__Apariencia__SizeFuenteCuerpoAssignment_34() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:2683:1: ( ( RULE_INT ) )
            // InternalParafarmacia.g:2684:2: ( RULE_INT )
            {
            // InternalParafarmacia.g:2684:2: ( RULE_INT )
            // InternalParafarmacia.g:2685:3: RULE_INT
            {
             before(grammarAccess.getAparienciaAccess().getSizeFuenteCuerpoINTTerminalRuleCall_34_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getAparienciaAccess().getSizeFuenteCuerpoINTTerminalRuleCall_34_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Apariencia__SizeFuenteCuerpoAssignment_34"


    // $ANTLR start "rule__Pagina__NameAssignment_1"
    // InternalParafarmacia.g:2694:1: rule__Pagina__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Pagina__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:2698:1: ( ( RULE_ID ) )
            // InternalParafarmacia.g:2699:2: ( RULE_ID )
            {
            // InternalParafarmacia.g:2699:2: ( RULE_ID )
            // InternalParafarmacia.g:2700:3: RULE_ID
            {
             before(grammarAccess.getPaginaAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPaginaAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pagina__NameAssignment_1"


    // $ANTLR start "rule__Pagina__TituloAssignment_4"
    // InternalParafarmacia.g:2709:1: rule__Pagina__TituloAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Pagina__TituloAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:2713:1: ( ( RULE_STRING ) )
            // InternalParafarmacia.g:2714:2: ( RULE_STRING )
            {
            // InternalParafarmacia.g:2714:2: ( RULE_STRING )
            // InternalParafarmacia.g:2715:3: RULE_STRING
            {
             before(grammarAccess.getPaginaAccess().getTituloSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPaginaAccess().getTituloSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pagina__TituloAssignment_4"


    // $ANTLR start "rule__Pagina__CuerpoAssignment_8"
    // InternalParafarmacia.g:2724:1: rule__Pagina__CuerpoAssignment_8 : ( ruleCuerpo ) ;
    public final void rule__Pagina__CuerpoAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:2728:1: ( ( ruleCuerpo ) )
            // InternalParafarmacia.g:2729:2: ( ruleCuerpo )
            {
            // InternalParafarmacia.g:2729:2: ( ruleCuerpo )
            // InternalParafarmacia.g:2730:3: ruleCuerpo
            {
             before(grammarAccess.getPaginaAccess().getCuerpoCuerpoParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleCuerpo();

            state._fsp--;

             after(grammarAccess.getPaginaAccess().getCuerpoCuerpoParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pagina__CuerpoAssignment_8"


    // $ANTLR start "rule__Cuerpo__TextoAssignment_0_0"
    // InternalParafarmacia.g:2739:1: rule__Cuerpo__TextoAssignment_0_0 : ( RULE_STRING ) ;
    public final void rule__Cuerpo__TextoAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:2743:1: ( ( RULE_STRING ) )
            // InternalParafarmacia.g:2744:2: ( RULE_STRING )
            {
            // InternalParafarmacia.g:2744:2: ( RULE_STRING )
            // InternalParafarmacia.g:2745:3: RULE_STRING
            {
             before(grammarAccess.getCuerpoAccess().getTextoSTRINGTerminalRuleCall_0_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCuerpoAccess().getTextoSTRINGTerminalRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cuerpo__TextoAssignment_0_0"


    // $ANTLR start "rule__Cuerpo__ProductosAssignment_1"
    // InternalParafarmacia.g:2754:1: rule__Cuerpo__ProductosAssignment_1 : ( ruleProducto ) ;
    public final void rule__Cuerpo__ProductosAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:2758:1: ( ( ruleProducto ) )
            // InternalParafarmacia.g:2759:2: ( ruleProducto )
            {
            // InternalParafarmacia.g:2759:2: ( ruleProducto )
            // InternalParafarmacia.g:2760:3: ruleProducto
            {
             before(grammarAccess.getCuerpoAccess().getProductosProductoParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleProducto();

            state._fsp--;

             after(grammarAccess.getCuerpoAccess().getProductosProductoParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cuerpo__ProductosAssignment_1"


    // $ANTLR start "rule__Producto__NameAssignment_1"
    // InternalParafarmacia.g:2769:1: rule__Producto__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Producto__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:2773:1: ( ( RULE_ID ) )
            // InternalParafarmacia.g:2774:2: ( RULE_ID )
            {
            // InternalParafarmacia.g:2774:2: ( RULE_ID )
            // InternalParafarmacia.g:2775:3: RULE_ID
            {
             before(grammarAccess.getProductoAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getProductoAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Producto__NameAssignment_1"


    // $ANTLR start "rule__Producto__NombreAssignment_2"
    // InternalParafarmacia.g:2784:1: rule__Producto__NombreAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Producto__NombreAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:2788:1: ( ( RULE_STRING ) )
            // InternalParafarmacia.g:2789:2: ( RULE_STRING )
            {
            // InternalParafarmacia.g:2789:2: ( RULE_STRING )
            // InternalParafarmacia.g:2790:3: RULE_STRING
            {
             before(grammarAccess.getProductoAccess().getNombreSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getProductoAccess().getNombreSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Producto__NombreAssignment_2"


    // $ANTLR start "rule__Producto__PrecioAssignment_3"
    // InternalParafarmacia.g:2799:1: rule__Producto__PrecioAssignment_3 : ( rulePrecio ) ;
    public final void rule__Producto__PrecioAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:2803:1: ( ( rulePrecio ) )
            // InternalParafarmacia.g:2804:2: ( rulePrecio )
            {
            // InternalParafarmacia.g:2804:2: ( rulePrecio )
            // InternalParafarmacia.g:2805:3: rulePrecio
            {
             before(grammarAccess.getProductoAccess().getPrecioPrecioParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulePrecio();

            state._fsp--;

             after(grammarAccess.getProductoAccess().getPrecioPrecioParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Producto__PrecioAssignment_3"


    // $ANTLR start "rule__Producto__ImagenAssignment_4_1"
    // InternalParafarmacia.g:2814:1: rule__Producto__ImagenAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__Producto__ImagenAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:2818:1: ( ( RULE_STRING ) )
            // InternalParafarmacia.g:2819:2: ( RULE_STRING )
            {
            // InternalParafarmacia.g:2819:2: ( RULE_STRING )
            // InternalParafarmacia.g:2820:3: RULE_STRING
            {
             before(grammarAccess.getProductoAccess().getImagenSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getProductoAccess().getImagenSTRINGTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Producto__ImagenAssignment_4_1"


    // $ANTLR start "rule__Producto__ConrecetaAssignment_5"
    // InternalParafarmacia.g:2829:1: rule__Producto__ConrecetaAssignment_5 : ( ( 'con receta' ) ) ;
    public final void rule__Producto__ConrecetaAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:2833:1: ( ( ( 'con receta' ) ) )
            // InternalParafarmacia.g:2834:2: ( ( 'con receta' ) )
            {
            // InternalParafarmacia.g:2834:2: ( ( 'con receta' ) )
            // InternalParafarmacia.g:2835:3: ( 'con receta' )
            {
             before(grammarAccess.getProductoAccess().getConrecetaConRecetaKeyword_5_0()); 
            // InternalParafarmacia.g:2836:3: ( 'con receta' )
            // InternalParafarmacia.g:2837:4: 'con receta'
            {
             before(grammarAccess.getProductoAccess().getConrecetaConRecetaKeyword_5_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getProductoAccess().getConrecetaConRecetaKeyword_5_0()); 

            }

             after(grammarAccess.getProductoAccess().getConrecetaConRecetaKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Producto__ConrecetaAssignment_5"


    // $ANTLR start "rule__Producto__DescripcionAssignment_6_1"
    // InternalParafarmacia.g:2848:1: rule__Producto__DescripcionAssignment_6_1 : ( RULE_STRING ) ;
    public final void rule__Producto__DescripcionAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParafarmacia.g:2852:1: ( ( RULE_STRING ) )
            // InternalParafarmacia.g:2853:2: ( RULE_STRING )
            {
            // InternalParafarmacia.g:2853:2: ( RULE_STRING )
            // InternalParafarmacia.g:2854:3: RULE_STRING
            {
             before(grammarAccess.getProductoAccess().getDescripcionSTRINGTerminalRuleCall_6_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getProductoAccess().getDescripcionSTRINGTerminalRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Producto__DescripcionAssignment_6_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000020040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000040000040L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000980000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000032L});

}