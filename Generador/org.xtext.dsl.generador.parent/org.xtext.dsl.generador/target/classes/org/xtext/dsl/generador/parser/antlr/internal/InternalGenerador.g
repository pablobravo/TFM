/*
 * generated by Xtext 2.12.0
 */
grammar InternalGenerador;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.dsl.generador.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleParafarmacia
entryRuleParafarmacia returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getParafarmaciaRule()); }
	iv_ruleParafarmacia=ruleParafarmacia
	{ $current=$iv_ruleParafarmacia.current; }
	EOF;

// Rule Parafarmacia
ruleParafarmacia returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Parafarmacia'
		{
			newLeafNode(otherlv_0, grammarAccess.getParafarmaciaAccess().getParafarmaciaKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getParafarmaciaAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='<'
		{
			newLeafNode(otherlv_2, grammarAccess.getParafarmaciaAccess().getLessThanSignKeyword_2());
		}
		otherlv_3='Nombre'
		{
			newLeafNode(otherlv_3, grammarAccess.getParafarmaciaAccess().getNombreKeyword_3());
		}
		otherlv_4='='
		{
			newLeafNode(otherlv_4, grammarAccess.getParafarmaciaAccess().getEqualsSignKeyword_4());
		}
		(
			(
				lv_titulo_5_0=RULE_STRING
				{
					newLeafNode(lv_titulo_5_0, grammarAccess.getParafarmaciaAccess().getTituloSTRINGTerminalRuleCall_5_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getParafarmaciaRule());
					}
					setWithLastConsumed(
						$current,
						"titulo",
						lv_titulo_5_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_6=':'
		{
			newLeafNode(otherlv_6, grammarAccess.getParafarmaciaAccess().getColonKeyword_6());
		}
		(
			(
				lv_fuente_7_0=RULE_STRING
				{
					newLeafNode(lv_fuente_7_0, grammarAccess.getParafarmaciaAccess().getFuenteSTRINGTerminalRuleCall_7_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getParafarmaciaRule());
					}
					setWithLastConsumed(
						$current,
						"fuente",
						lv_fuente_7_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_8='>'
		{
			newLeafNode(otherlv_8, grammarAccess.getParafarmaciaAccess().getGreaterThanSignKeyword_8());
		}
		otherlv_9='<'
		{
			newLeafNode(otherlv_9, grammarAccess.getParafarmaciaAccess().getLessThanSignKeyword_9());
		}
		otherlv_10='Titular'
		{
			newLeafNode(otherlv_10, grammarAccess.getParafarmaciaAccess().getTitularKeyword_10());
		}
		otherlv_11='='
		{
			newLeafNode(otherlv_11, grammarAccess.getParafarmaciaAccess().getEqualsSignKeyword_11());
		}
		(
			(
				lv_nombre_12_0=RULE_STRING
				{
					newLeafNode(lv_nombre_12_0, grammarAccess.getParafarmaciaAccess().getNombreSTRINGTerminalRuleCall_12_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getParafarmaciaRule());
					}
					setWithLastConsumed(
						$current,
						"nombre",
						lv_nombre_12_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_13=':'
		{
			newLeafNode(otherlv_13, grammarAccess.getParafarmaciaAccess().getColonKeyword_13());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getParafarmaciaAccess().getDireccionDireccionParserRuleCall_14_0());
				}
				lv_direccion_14_0=ruleDireccion
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getParafarmaciaRule());
					}
					set(
						$current,
						"direccion",
						lv_direccion_14_0,
						"org.xtext.dsl.generador.Generador.Direccion");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_15=':'
		{
			newLeafNode(otherlv_15, grammarAccess.getParafarmaciaAccess().getColonKeyword_15());
		}
		(
			(
				lv_cif_16_0=RULE_STRING
				{
					newLeafNode(lv_cif_16_0, grammarAccess.getParafarmaciaAccess().getCifSTRINGTerminalRuleCall_16_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getParafarmaciaRule());
					}
					setWithLastConsumed(
						$current,
						"cif",
						lv_cif_16_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_17=':'
		{
			newLeafNode(otherlv_17, grammarAccess.getParafarmaciaAccess().getColonKeyword_17());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getParafarmaciaAccess().getRegistroRegistroParserRuleCall_18_0());
				}
				lv_registro_18_0=ruleRegistro
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getParafarmaciaRule());
					}
					set(
						$current,
						"registro",
						lv_registro_18_0,
						"org.xtext.dsl.generador.Generador.Registro");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_19=':'
		{
			newLeafNode(otherlv_19, grammarAccess.getParafarmaciaAccess().getColonKeyword_19());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getParafarmaciaAccess().getCorreoCorreoParserRuleCall_20_0());
				}
				lv_correo_20_0=ruleCorreo
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getParafarmaciaRule());
					}
					set(
						$current,
						"correo",
						lv_correo_20_0,
						"org.xtext.dsl.generador.Generador.Correo");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_21=':'
		{
			newLeafNode(otherlv_21, grammarAccess.getParafarmaciaAccess().getColonKeyword_21());
		}
		(
			(
				lv_telefono_22_0=RULE_INT
				{
					newLeafNode(lv_telefono_22_0, grammarAccess.getParafarmaciaAccess().getTelefonoINTTerminalRuleCall_22_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getParafarmaciaRule());
					}
					setWithLastConsumed(
						$current,
						"telefono",
						lv_telefono_22_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_23='>'
		{
			newLeafNode(otherlv_23, grammarAccess.getParafarmaciaAccess().getGreaterThanSignKeyword_23());
		}
		otherlv_24='<'
		{
			newLeafNode(otherlv_24, grammarAccess.getParafarmaciaAccess().getLessThanSignKeyword_24());
		}
		otherlv_25='Menu'
		{
			newLeafNode(otherlv_25, grammarAccess.getParafarmaciaAccess().getMenuKeyword_25());
		}
		otherlv_26='='
		{
			newLeafNode(otherlv_26, grammarAccess.getParafarmaciaAccess().getEqualsSignKeyword_26());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getParafarmaciaAccess().getTipoTipoParserRuleCall_27_0());
				}
				lv_tipo_27_0=ruleTipo
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getParafarmaciaRule());
					}
					set(
						$current,
						"tipo",
						lv_tipo_27_0,
						"org.xtext.dsl.generador.Generador.Tipo");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_28='>'
		{
			newLeafNode(otherlv_28, grammarAccess.getParafarmaciaAccess().getGreaterThanSignKeyword_28());
		}
		otherlv_29='<'
		{
			newLeafNode(otherlv_29, grammarAccess.getParafarmaciaAccess().getLessThanSignKeyword_29());
		}
		otherlv_30='Apariencia'
		{
			newLeafNode(otherlv_30, grammarAccess.getParafarmaciaAccess().getAparienciaKeyword_30());
		}
		otherlv_31='='
		{
			newLeafNode(otherlv_31, grammarAccess.getParafarmaciaAccess().getEqualsSignKeyword_31());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getParafarmaciaAccess().getAparienciaAparienciaParserRuleCall_32_0());
				}
				lv_apariencia_32_0=ruleApariencia
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getParafarmaciaRule());
					}
					set(
						$current,
						"apariencia",
						lv_apariencia_32_0,
						"org.xtext.dsl.generador.Generador.Apariencia");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_33='>'
		{
			newLeafNode(otherlv_33, grammarAccess.getParafarmaciaAccess().getGreaterThanSignKeyword_33());
		}
		otherlv_34='<'
		{
			newLeafNode(otherlv_34, grammarAccess.getParafarmaciaAccess().getLessThanSignKeyword_34());
		}
		otherlv_35='Categorias'
		{
			newLeafNode(otherlv_35, grammarAccess.getParafarmaciaAccess().getCategoriasKeyword_35());
		}
		otherlv_36='='
		{
			newLeafNode(otherlv_36, grammarAccess.getParafarmaciaAccess().getEqualsSignKeyword_36());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getParafarmaciaAccess().getCategoriasCategoriaParserRuleCall_37_0());
				}
				lv_categorias_37_0=ruleCategoria
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getParafarmaciaRule());
					}
					add(
						$current,
						"categorias",
						lv_categorias_37_0,
						"org.xtext.dsl.generador.Generador.Categoria");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_38='>'
		{
			newLeafNode(otherlv_38, grammarAccess.getParafarmaciaAccess().getGreaterThanSignKeyword_38());
		}
		otherlv_39='<'
		{
			newLeafNode(otherlv_39, grammarAccess.getParafarmaciaAccess().getLessThanSignKeyword_39());
		}
		otherlv_40='Productos'
		{
			newLeafNode(otherlv_40, grammarAccess.getParafarmaciaAccess().getProductosKeyword_40());
		}
		otherlv_41='='
		{
			newLeafNode(otherlv_41, grammarAccess.getParafarmaciaAccess().getEqualsSignKeyword_41());
		}
		(
			(
				lv_numProductosPorFila_42_0=RULE_INT
				{
					newLeafNode(lv_numProductosPorFila_42_0, grammarAccess.getParafarmaciaAccess().getNumProductosPorFilaINTTerminalRuleCall_42_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getParafarmaciaRule());
					}
					setWithLastConsumed(
						$current,
						"numProductosPorFila",
						lv_numProductosPorFila_42_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getParafarmaciaAccess().getProductosProductoParserRuleCall_43_0());
				}
				lv_productos_43_0=ruleProducto
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getParafarmaciaRule());
					}
					add(
						$current,
						"productos",
						lv_productos_43_0,
						"org.xtext.dsl.generador.Generador.Producto");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_44='>'
		{
			newLeafNode(otherlv_44, grammarAccess.getParafarmaciaAccess().getGreaterThanSignKeyword_44());
		}
		otherlv_45='<'
		{
			newLeafNode(otherlv_45, grammarAccess.getParafarmaciaAccess().getLessThanSignKeyword_45());
		}
		otherlv_46='Usuario'
		{
			newLeafNode(otherlv_46, grammarAccess.getParafarmaciaAccess().getUsuarioKeyword_46());
		}
		otherlv_47='='
		{
			newLeafNode(otherlv_47, grammarAccess.getParafarmaciaAccess().getEqualsSignKeyword_47());
		}
		(
			(
				lv_nombreUsuario_48_0=RULE_STRING
				{
					newLeafNode(lv_nombreUsuario_48_0, grammarAccess.getParafarmaciaAccess().getNombreUsuarioSTRINGTerminalRuleCall_48_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getParafarmaciaRule());
					}
					setWithLastConsumed(
						$current,
						"nombreUsuario",
						lv_nombreUsuario_48_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_49=':'
		{
			newLeafNode(otherlv_49, grammarAccess.getParafarmaciaAccess().getColonKeyword_49());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getParafarmaciaAccess().getEmailCorreoParserRuleCall_50_0());
				}
				lv_email_50_0=ruleCorreo
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getParafarmaciaRule());
					}
					set(
						$current,
						"email",
						lv_email_50_0,
						"org.xtext.dsl.generador.Generador.Correo");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_51=':'
		{
			newLeafNode(otherlv_51, grammarAccess.getParafarmaciaAccess().getColonKeyword_51());
		}
		(
			(
				lv_password_52_0=RULE_STRING
				{
					newLeafNode(lv_password_52_0, grammarAccess.getParafarmaciaAccess().getPasswordSTRINGTerminalRuleCall_52_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getParafarmaciaRule());
					}
					setWithLastConsumed(
						$current,
						"password",
						lv_password_52_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_53='>'
		{
			newLeafNode(otherlv_53, grammarAccess.getParafarmaciaAccess().getGreaterThanSignKeyword_53());
		}
		otherlv_54='}'
		{
			newLeafNode(otherlv_54, grammarAccess.getParafarmaciaAccess().getRightCurlyBracketKeyword_54());
		}
	)
;

// Entry rule entryRuleApariencia
entryRuleApariencia returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAparienciaRule()); }
	iv_ruleApariencia=ruleApariencia
	{ $current=$iv_ruleApariencia.current; }
	EOF;

// Rule Apariencia
ruleApariencia returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='['
		{
			newLeafNode(otherlv_0, grammarAccess.getAparienciaAccess().getLeftSquareBracketKeyword_0());
		}
		otherlv_1='Color'
		{
			newLeafNode(otherlv_1, grammarAccess.getAparienciaAccess().getColorKeyword_1());
		}
		otherlv_2='='
		{
			newLeafNode(otherlv_2, grammarAccess.getAparienciaAccess().getEqualsSignKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAparienciaAccess().getPrincipalColorParserRuleCall_3_0());
				}
				lv_principal_3_0=ruleColor
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAparienciaRule());
					}
					set(
						$current,
						"principal",
						lv_principal_3_0,
						"org.xtext.dsl.generador.Generador.Color");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4=':'
		{
			newLeafNode(otherlv_4, grammarAccess.getAparienciaAccess().getColonKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAparienciaAccess().getPrincipalClaroColorParserRuleCall_5_0());
				}
				lv_principalClaro_5_0=ruleColor
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAparienciaRule());
					}
					set(
						$current,
						"principalClaro",
						lv_principalClaro_5_0,
						"org.xtext.dsl.generador.Generador.Color");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_6=':'
		{
			newLeafNode(otherlv_6, grammarAccess.getAparienciaAccess().getColonKeyword_6());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAparienciaAccess().getSecundarioColorParserRuleCall_7_0());
				}
				lv_secundario_7_0=ruleColor
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAparienciaRule());
					}
					set(
						$current,
						"secundario",
						lv_secundario_7_0,
						"org.xtext.dsl.generador.Generador.Color");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_8=':'
		{
			newLeafNode(otherlv_8, grammarAccess.getAparienciaAccess().getColonKeyword_8());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAparienciaAccess().getFondoColorParserRuleCall_9_0());
				}
				lv_fondo_9_0=ruleColor
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAparienciaRule());
					}
					set(
						$current,
						"fondo",
						lv_fondo_9_0,
						"org.xtext.dsl.generador.Generador.Color");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_10=':'
		{
			newLeafNode(otherlv_10, grammarAccess.getAparienciaAccess().getColonKeyword_10());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAparienciaAccess().getFondoProductosColorParserRuleCall_11_0());
				}
				lv_fondoProductos_11_0=ruleColor
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAparienciaRule());
					}
					set(
						$current,
						"fondoProductos",
						lv_fondoProductos_11_0,
						"org.xtext.dsl.generador.Generador.Color");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_12=':'
		{
			newLeafNode(otherlv_12, grammarAccess.getAparienciaAccess().getColonKeyword_12());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAparienciaAccess().getPreciosColorParserRuleCall_13_0());
				}
				lv_precios_13_0=ruleColor
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAparienciaRule());
					}
					set(
						$current,
						"precios",
						lv_precios_13_0,
						"org.xtext.dsl.generador.Generador.Color");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_14=':'
		{
			newLeafNode(otherlv_14, grammarAccess.getAparienciaAccess().getColonKeyword_14());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAparienciaAccess().getTextoColorParserRuleCall_15_0());
				}
				lv_texto_15_0=ruleColor
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAparienciaRule());
					}
					set(
						$current,
						"texto",
						lv_texto_15_0,
						"org.xtext.dsl.generador.Generador.Color");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_16=':'
		{
			newLeafNode(otherlv_16, grammarAccess.getAparienciaAccess().getColonKeyword_16());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAparienciaAccess().getTituloColorColorParserRuleCall_17_0());
				}
				lv_tituloColor_17_0=ruleColor
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAparienciaRule());
					}
					set(
						$current,
						"tituloColor",
						lv_tituloColor_17_0,
						"org.xtext.dsl.generador.Generador.Color");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_18=']'
		{
			newLeafNode(otherlv_18, grammarAccess.getAparienciaAccess().getRightSquareBracketKeyword_18());
		}
		otherlv_19='['
		{
			newLeafNode(otherlv_19, grammarAccess.getAparienciaAccess().getLeftSquareBracketKeyword_19());
		}
		otherlv_20='Texto'
		{
			newLeafNode(otherlv_20, grammarAccess.getAparienciaAccess().getTextoKeyword_20());
		}
		otherlv_21='='
		{
			newLeafNode(otherlv_21, grammarAccess.getAparienciaAccess().getEqualsSignKeyword_21());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAparienciaAccess().getNormalMedidaParserRuleCall_22_0());
				}
				lv_normal_22_0=ruleMedida
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAparienciaRule());
					}
					set(
						$current,
						"normal",
						lv_normal_22_0,
						"org.xtext.dsl.generador.Generador.Medida");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_23=':'
		{
			newLeafNode(otherlv_23, grammarAccess.getAparienciaAccess().getColonKeyword_23());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAparienciaAccess().getGrandeMedidaParserRuleCall_24_0());
				}
				lv_grande_24_0=ruleMedida
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAparienciaRule());
					}
					set(
						$current,
						"grande",
						lv_grande_24_0,
						"org.xtext.dsl.generador.Generador.Medida");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_25=':'
		{
			newLeafNode(otherlv_25, grammarAccess.getAparienciaAccess().getColonKeyword_25());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAparienciaAccess().getTituloMedidaParserRuleCall_26_0());
				}
				lv_titulo_26_0=ruleMedida
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAparienciaRule());
					}
					set(
						$current,
						"titulo",
						lv_titulo_26_0,
						"org.xtext.dsl.generador.Generador.Medida");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_27=':'
		{
			newLeafNode(otherlv_27, grammarAccess.getAparienciaAccess().getColonKeyword_27());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAparienciaAccess().getMenuMedidaParserRuleCall_28_0());
				}
				lv_menu_28_0=ruleMedida
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAparienciaRule());
					}
					set(
						$current,
						"menu",
						lv_menu_28_0,
						"org.xtext.dsl.generador.Generador.Medida");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_29=']'
		{
			newLeafNode(otherlv_29, grammarAccess.getAparienciaAccess().getRightSquareBracketKeyword_29());
		}
		otherlv_30='['
		{
			newLeafNode(otherlv_30, grammarAccess.getAparienciaAccess().getLeftSquareBracketKeyword_30());
		}
		otherlv_31='Margen'
		{
			newLeafNode(otherlv_31, grammarAccess.getAparienciaAccess().getMargenKeyword_31());
		}
		otherlv_32='='
		{
			newLeafNode(otherlv_32, grammarAccess.getAparienciaAccess().getEqualsSignKeyword_32());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAparienciaAccess().getLateralMedidaParserRuleCall_33_0());
				}
				lv_lateral_33_0=ruleMedida
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAparienciaRule());
					}
					set(
						$current,
						"lateral",
						lv_lateral_33_0,
						"org.xtext.dsl.generador.Generador.Medida");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_34=']'
		{
			newLeafNode(otherlv_34, grammarAccess.getAparienciaAccess().getRightSquareBracketKeyword_34());
		}
	)
;

// Entry rule entryRuleProducto
entryRuleProducto returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getProductoRule()); }
	iv_ruleProducto=ruleProducto
	{ $current=$iv_ruleProducto.current; }
	EOF;

// Rule Producto
ruleProducto returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='['
		{
			newLeafNode(otherlv_0, grammarAccess.getProductoAccess().getLeftSquareBracketKeyword_0());
		}
		otherlv_1='Producto'
		{
			newLeafNode(otherlv_1, grammarAccess.getProductoAccess().getProductoKeyword_1());
		}
		otherlv_2='='
		{
			newLeafNode(otherlv_2, grammarAccess.getProductoAccess().getEqualsSignKeyword_2());
		}
		(
			(
				lv_nombreProducto_3_0=RULE_STRING
				{
					newLeafNode(lv_nombreProducto_3_0, grammarAccess.getProductoAccess().getNombreProductoSTRINGTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getProductoRule());
					}
					setWithLastConsumed(
						$current,
						"nombreProducto",
						lv_nombreProducto_3_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_4=':'
		{
			newLeafNode(otherlv_4, grammarAccess.getProductoAccess().getColonKeyword_4());
		}
		(
			(
				lv_descripcion_5_0=RULE_STRING
				{
					newLeafNode(lv_descripcion_5_0, grammarAccess.getProductoAccess().getDescripcionSTRINGTerminalRuleCall_5_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getProductoRule());
					}
					setWithLastConsumed(
						$current,
						"descripcion",
						lv_descripcion_5_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_6=':'
		{
			newLeafNode(otherlv_6, grammarAccess.getProductoAccess().getColonKeyword_6());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getProductoAccess().getPrecioPrecioParserRuleCall_7_0());
				}
				lv_precio_7_0=rulePrecio
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getProductoRule());
					}
					set(
						$current,
						"precio",
						lv_precio_7_0,
						"org.xtext.dsl.generador.Generador.Precio");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_8=':'
		{
			newLeafNode(otherlv_8, grammarAccess.getProductoAccess().getColonKeyword_8());
		}
		(
			(
				lv_cantidad_9_0=RULE_INT
				{
					newLeafNode(lv_cantidad_9_0, grammarAccess.getProductoAccess().getCantidadINTTerminalRuleCall_9_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getProductoRule());
					}
					setWithLastConsumed(
						$current,
						"cantidad",
						lv_cantidad_9_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_10=':'
		{
			newLeafNode(otherlv_10, grammarAccess.getProductoAccess().getColonKeyword_10());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getProductoAccess().getCategoriaCategoriaParserRuleCall_11_0());
				}
				lv_categoria_11_0=ruleCategoria
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getProductoRule());
					}
					set(
						$current,
						"categoria",
						lv_categoria_11_0,
						"org.xtext.dsl.generador.Generador.Categoria");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_12=']'
		{
			newLeafNode(otherlv_12, grammarAccess.getProductoAccess().getRightSquareBracketKeyword_12());
		}
	)
;

// Entry rule entryRulePrecio
entryRulePrecio returns [String current=null]:
	{ newCompositeNode(grammarAccess.getPrecioRule()); }
	iv_rulePrecio=rulePrecio
	{ $current=$iv_rulePrecio.current.getText(); }
	EOF;

// Rule Precio
rulePrecio returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_INT_0=RULE_INT
		{
			$current.merge(this_INT_0);
		}
		{
			newLeafNode(this_INT_0, grammarAccess.getPrecioAccess().getINTTerminalRuleCall_0());
		}
		kw='.'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getPrecioAccess().getFullStopKeyword_1());
		}
		this_INT_2=RULE_INT
		{
			$current.merge(this_INT_2);
		}
		{
			newLeafNode(this_INT_2, grammarAccess.getPrecioAccess().getINTTerminalRuleCall_2());
		}
	)
;

// Entry rule entryRuleCategoria
entryRuleCategoria returns [String current=null]:
	{ newCompositeNode(grammarAccess.getCategoriaRule()); }
	iv_ruleCategoria=ruleCategoria
	{ $current=$iv_ruleCategoria.current.getText(); }
	EOF;

// Rule Categoria
ruleCategoria returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='Cosmetica'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getCategoriaAccess().getCosmeticaKeyword_0());
		}
		    |
		kw='Higiene'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getCategoriaAccess().getHigieneKeyword_1());
		}
		    |
		kw='Salud'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getCategoriaAccess().getSaludKeyword_2());
		}
		    |
		kw='Dietetica'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getCategoriaAccess().getDieteticaKeyword_3());
		}
		    |
		kw='Bebes'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getCategoriaAccess().getBebesKeyword_4());
		}
	)
;

// Entry rule entryRuleTipo
entryRuleTipo returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTipoRule()); }
	iv_ruleTipo=ruleTipo
	{ $current=$iv_ruleTipo.current; }
	EOF;

// Rule Tipo
ruleTipo returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getTipoAccess().getDesplegableDesplegableParserRuleCall_0_0());
				}
				lv_desplegable_0_0=ruleDesplegable
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTipoRule());
					}
					set(
						$current,
						"desplegable",
						lv_desplegable_0_0,
						"org.xtext.dsl.generador.Generador.Desplegable");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getTipoAccess().getPermanentePermanenteParserRuleCall_1_0());
				}
				lv_permanente_1_0=rulePermanente
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTipoRule());
					}
					set(
						$current,
						"permanente",
						lv_permanente_1_0,
						"org.xtext.dsl.generador.Generador.Permanente");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleDesplegable
entryRuleDesplegable returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDesplegableRule()); }
	iv_ruleDesplegable=ruleDesplegable
	{ $current=$iv_ruleDesplegable.current; }
	EOF;

// Rule Desplegable
ruleDesplegable returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Desplegable'
		{
			newLeafNode(otherlv_0, grammarAccess.getDesplegableAccess().getDesplegableKeyword_0());
		}
		otherlv_1=':'
		{
			newLeafNode(otherlv_1, grammarAccess.getDesplegableAccess().getColonKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDesplegableAccess().getColorColorParserRuleCall_2_0());
				}
				lv_color_2_0=ruleColor
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDesplegableRule());
					}
					set(
						$current,
						"color",
						lv_color_2_0,
						"org.xtext.dsl.generador.Generador.Color");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRulePermanente
entryRulePermanente returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPermanenteRule()); }
	iv_rulePermanente=rulePermanente
	{ $current=$iv_rulePermanente.current; }
	EOF;

// Rule Permanente
rulePermanente returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Permanente'
		{
			newLeafNode(otherlv_0, grammarAccess.getPermanenteAccess().getPermanenteKeyword_0());
		}
		otherlv_1=':'
		{
			newLeafNode(otherlv_1, grammarAccess.getPermanenteAccess().getColonKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getPermanenteAccess().getColorColorParserRuleCall_2_0());
				}
				lv_color_2_0=ruleColor
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPermanenteRule());
					}
					set(
						$current,
						"color",
						lv_color_2_0,
						"org.xtext.dsl.generador.Generador.Color");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3=':'
		{
			newLeafNode(otherlv_3, grammarAccess.getPermanenteAccess().getColonKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getPermanenteAccess().getAlturaMedidaParserRuleCall_4_0());
				}
				lv_altura_4_0=ruleMedida
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPermanenteRule());
					}
					set(
						$current,
						"altura",
						lv_altura_4_0,
						"org.xtext.dsl.generador.Generador.Medida");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleColor
entryRuleColor returns [String current=null]:
	{ newCompositeNode(grammarAccess.getColorRule()); }
	iv_ruleColor=ruleColor
	{ $current=$iv_ruleColor.current.getText(); }
	EOF;

// Rule Color
ruleColor returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='#'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getColorAccess().getNumberSignKeyword_0());
		}
		(
			this_ID_1=RULE_ID
			{
				$current.merge(this_ID_1);
			}
			{
				newLeafNode(this_ID_1, grammarAccess.getColorAccess().getIDTerminalRuleCall_1_0());
			}
			    |
			this_INT_2=RULE_INT
			{
				$current.merge(this_INT_2);
			}
			{
				newLeafNode(this_INT_2, grammarAccess.getColorAccess().getINTTerminalRuleCall_1_1());
			}
		)+
	)
;

// Entry rule entryRuleMedida
entryRuleMedida returns [String current=null]:
	{ newCompositeNode(grammarAccess.getMedidaRule()); }
	iv_ruleMedida=ruleMedida
	{ $current=$iv_ruleMedida.current.getText(); }
	EOF;

// Rule Medida
ruleMedida returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			this_INT_0=RULE_INT
			{
				$current.merge(this_INT_0);
			}
			{
				newLeafNode(this_INT_0, grammarAccess.getMedidaAccess().getINTTerminalRuleCall_0_0());
			}
			kw='px'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getMedidaAccess().getPxKeyword_0_1());
			}
		)
		    |
		(
			this_INT_2=RULE_INT
			{
				$current.merge(this_INT_2);
			}
			{
				newLeafNode(this_INT_2, grammarAccess.getMedidaAccess().getINTTerminalRuleCall_1_0());
			}
			kw='%'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getMedidaAccess().getPercentSignKeyword_1_1());
			}
		)
	)
;

// Entry rule entryRuleCorreo
entryRuleCorreo returns [String current=null]:
	{ newCompositeNode(grammarAccess.getCorreoRule()); }
	iv_ruleCorreo=ruleCorreo
	{ $current=$iv_ruleCorreo.current.getText(); }
	EOF;

// Rule Correo
ruleCorreo returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_ID_0=RULE_ID
		{
			$current.merge(this_ID_0);
		}
		{
			newLeafNode(this_ID_0, grammarAccess.getCorreoAccess().getIDTerminalRuleCall_0());
		}
		kw='@'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getCorreoAccess().getCommercialAtKeyword_1());
		}
		this_ID_2=RULE_ID
		{
			$current.merge(this_ID_2);
		}
		{
			newLeafNode(this_ID_2, grammarAccess.getCorreoAccess().getIDTerminalRuleCall_2());
		}
		kw='.'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getCorreoAccess().getFullStopKeyword_3());
		}
		this_ID_4=RULE_ID
		{
			$current.merge(this_ID_4);
		}
		{
			newLeafNode(this_ID_4, grammarAccess.getCorreoAccess().getIDTerminalRuleCall_4());
		}
	)
;

// Entry rule entryRuleRegistro
entryRuleRegistro returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRegistroRule()); }
	iv_ruleRegistro=ruleRegistro
	{ $current=$iv_ruleRegistro.current; }
	EOF;

// Rule Registro
ruleRegistro returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='['
		{
			newLeafNode(otherlv_0, grammarAccess.getRegistroAccess().getLeftSquareBracketKeyword_0());
		}
		otherlv_1='Registro'
		{
			newLeafNode(otherlv_1, grammarAccess.getRegistroAccess().getRegistroKeyword_1());
		}
		otherlv_2='='
		{
			newLeafNode(otherlv_2, grammarAccess.getRegistroAccess().getEqualsSignKeyword_2());
		}
		(
			(
				lv_tomo_3_0=RULE_INT
				{
					newLeafNode(lv_tomo_3_0, grammarAccess.getRegistroAccess().getTomoINTTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRegistroRule());
					}
					setWithLastConsumed(
						$current,
						"tomo",
						lv_tomo_3_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_4=':'
		{
			newLeafNode(otherlv_4, grammarAccess.getRegistroAccess().getColonKeyword_4());
		}
		(
			(
				lv_folio_5_0=RULE_INT
				{
					newLeafNode(lv_folio_5_0, grammarAccess.getRegistroAccess().getFolioINTTerminalRuleCall_5_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRegistroRule());
					}
					setWithLastConsumed(
						$current,
						"folio",
						lv_folio_5_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_6=':'
		{
			newLeafNode(otherlv_6, grammarAccess.getRegistroAccess().getColonKeyword_6());
		}
		(
			(
				lv_seccion_7_0=RULE_INT
				{
					newLeafNode(lv_seccion_7_0, grammarAccess.getRegistroAccess().getSeccionINTTerminalRuleCall_7_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRegistroRule());
					}
					setWithLastConsumed(
						$current,
						"seccion",
						lv_seccion_7_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_8=':'
		{
			newLeafNode(otherlv_8, grammarAccess.getRegistroAccess().getColonKeyword_8());
		}
		(
			(
				lv_hoja_9_0=RULE_INT
				{
					newLeafNode(lv_hoja_9_0, grammarAccess.getRegistroAccess().getHojaINTTerminalRuleCall_9_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRegistroRule());
					}
					setWithLastConsumed(
						$current,
						"hoja",
						lv_hoja_9_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_10=']'
		{
			newLeafNode(otherlv_10, grammarAccess.getRegistroAccess().getRightSquareBracketKeyword_10());
		}
	)
;

// Entry rule entryRuleDireccion
entryRuleDireccion returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDireccionRule()); }
	iv_ruleDireccion=ruleDireccion
	{ $current=$iv_ruleDireccion.current; }
	EOF;

// Rule Direccion
ruleDireccion returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='['
		{
			newLeafNode(otherlv_0, grammarAccess.getDireccionAccess().getLeftSquareBracketKeyword_0());
		}
		otherlv_1='Direccion'
		{
			newLeafNode(otherlv_1, grammarAccess.getDireccionAccess().getDireccionKeyword_1());
		}
		otherlv_2='='
		{
			newLeafNode(otherlv_2, grammarAccess.getDireccionAccess().getEqualsSignKeyword_2());
		}
		(
			(
				lv_calle_3_0=RULE_STRING
				{
					newLeafNode(lv_calle_3_0, grammarAccess.getDireccionAccess().getCalleSTRINGTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDireccionRule());
					}
					setWithLastConsumed(
						$current,
						"calle",
						lv_calle_3_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_4=':'
		{
			newLeafNode(otherlv_4, grammarAccess.getDireccionAccess().getColonKeyword_4());
		}
		(
			(
				lv_ciudad_5_0=RULE_STRING
				{
					newLeafNode(lv_ciudad_5_0, grammarAccess.getDireccionAccess().getCiudadSTRINGTerminalRuleCall_5_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDireccionRule());
					}
					setWithLastConsumed(
						$current,
						"ciudad",
						lv_ciudad_5_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_6=':'
		{
			newLeafNode(otherlv_6, grammarAccess.getDireccionAccess().getColonKeyword_6());
		}
		(
			(
				lv_pais_7_0=RULE_STRING
				{
					newLeafNode(lv_pais_7_0, grammarAccess.getDireccionAccess().getPaisSTRINGTerminalRuleCall_7_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDireccionRule());
					}
					setWithLastConsumed(
						$current,
						"pais",
						lv_pais_7_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_8=']'
		{
			newLeafNode(otherlv_8, grammarAccess.getDireccionAccess().getRightSquareBracketKeyword_8());
		}
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
