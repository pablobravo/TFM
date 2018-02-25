/*
 * generated by Xtext 2.12.0
 */
package org.xtext.dsl.parafarmacia.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.dsl.parafarmacia.ide.contentassist.antlr.internal.InternalParafarmaciaParser;
import org.xtext.dsl.parafarmacia.services.ParafarmaciaGrammarAccess;

public class ParafarmaciaParser extends AbstractContentAssistParser {

	@Inject
	private ParafarmaciaGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalParafarmaciaParser createParser() {
		InternalParafarmaciaParser result = new InternalParafarmaciaParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getCuerpoAccess().getAlternatives(), "rule__Cuerpo__Alternatives");
					put(grammarAccess.getColorAccess().getAlternatives_1(), "rule__Color__Alternatives_1");
					put(grammarAccess.getParafarmaciaAccess().getGroup(), "rule__Parafarmacia__Group__0");
					put(grammarAccess.getAparienciaAccess().getGroup(), "rule__Apariencia__Group__0");
					put(grammarAccess.getPaginaAccess().getGroup(), "rule__Pagina__Group__0");
					put(grammarAccess.getCuerpoAccess().getGroup_0(), "rule__Cuerpo__Group_0__0");
					put(grammarAccess.getProductoAccess().getGroup(), "rule__Producto__Group__0");
					put(grammarAccess.getProductoAccess().getGroup_4(), "rule__Producto__Group_4__0");
					put(grammarAccess.getProductoAccess().getGroup_6(), "rule__Producto__Group_6__0");
					put(grammarAccess.getPrecioAccess().getGroup(), "rule__Precio__Group__0");
					put(grammarAccess.getColorAccess().getGroup(), "rule__Color__Group__0");
					put(grammarAccess.getParafarmaciaAccess().getTituloAssignment_4(), "rule__Parafarmacia__TituloAssignment_4");
					put(grammarAccess.getParafarmaciaAccess().getDescripcionAssignment_8(), "rule__Parafarmacia__DescripcionAssignment_8");
					put(grammarAccess.getParafarmaciaAccess().getAparienciaAssignment_10(), "rule__Parafarmacia__AparienciaAssignment_10");
					put(grammarAccess.getParafarmaciaAccess().getPaginasAssignment_13(), "rule__Parafarmacia__PaginasAssignment_13");
					put(grammarAccess.getAparienciaAccess().getColorFondo1Assignment_4(), "rule__Apariencia__ColorFondo1Assignment_4");
					put(grammarAccess.getAparienciaAccess().getColorFondo2Assignment_8(), "rule__Apariencia__ColorFondo2Assignment_8");
					put(grammarAccess.getAparienciaAccess().getColorTextoAssignment_12(), "rule__Apariencia__ColorTextoAssignment_12");
					put(grammarAccess.getAparienciaAccess().getSizeFuenteH1Assignment_21(), "rule__Apariencia__SizeFuenteH1Assignment_21");
					put(grammarAccess.getAparienciaAccess().getSizeFuenteH2Assignment_26(), "rule__Apariencia__SizeFuenteH2Assignment_26");
					put(grammarAccess.getAparienciaAccess().getSizeFuenteCuerpoAssignment_34(), "rule__Apariencia__SizeFuenteCuerpoAssignment_34");
					put(grammarAccess.getPaginaAccess().getNameAssignment_1(), "rule__Pagina__NameAssignment_1");
					put(grammarAccess.getPaginaAccess().getTituloAssignment_4(), "rule__Pagina__TituloAssignment_4");
					put(grammarAccess.getPaginaAccess().getCuerpoAssignment_8(), "rule__Pagina__CuerpoAssignment_8");
					put(grammarAccess.getCuerpoAccess().getTextoAssignment_0_0(), "rule__Cuerpo__TextoAssignment_0_0");
					put(grammarAccess.getCuerpoAccess().getProductosAssignment_1(), "rule__Cuerpo__ProductosAssignment_1");
					put(grammarAccess.getProductoAccess().getNameAssignment_1(), "rule__Producto__NameAssignment_1");
					put(grammarAccess.getProductoAccess().getNombreAssignment_2(), "rule__Producto__NombreAssignment_2");
					put(grammarAccess.getProductoAccess().getPrecioAssignment_3(), "rule__Producto__PrecioAssignment_3");
					put(grammarAccess.getProductoAccess().getImagenAssignment_4_1(), "rule__Producto__ImagenAssignment_4_1");
					put(grammarAccess.getProductoAccess().getConrecetaAssignment_5(), "rule__Producto__ConrecetaAssignment_5");
					put(grammarAccess.getProductoAccess().getDescripcionAssignment_6_1(), "rule__Producto__DescripcionAssignment_6_1");
				}
			};
		}
		return nameMappings.get(element);
	}
			
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public ParafarmaciaGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(ParafarmaciaGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
