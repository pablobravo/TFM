package org.xtext.dsl.parafarmacia.ui;

import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.nodemodel.BidiTreeIterator;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.ide.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ide.editor.syntaxcoloring.ISemanticHighlightingCalculator;
import org.xtext.dsl.parafarmacia.parafarmacia.Parafarmacia;

public class ParafarmaciaHighlightingCalculator implements ISemanticHighlightingCalculator {

	public void provideHighlightingFor(XtextResource resource, IHighlightedPositionAcceptor acceptor, CancelIndicator cancel) {
		if (resource == null) return;

		INode raiz = resource.getParseResult().getRootNode();
		BidiTreeIterator<INode> it = raiz.getAsTreeIterable().iterator();
		
		while (it.hasNext()) {
			INode node = it.next();
			
			if (node.getGrammarElement() instanceof Keyword) {
				Keyword k = (Keyword)node.getGrammarElement();
				if (k.getValue().equals("Parafarmacia") || k.getValue().equals("Productos")) {
					acceptor.addPosition(node.getOffset(), node.getLength(), ParafarmaciaHighlightingConfiguration.PALABRA_CLAVE_PRINCIPAL);
				} 
				else acceptor.addPosition(node.getOffset(), node.getLength(), ParafarmaciaHighlightingConfiguration.PALABRA_CLAVE);
			}
			else if (node.getGrammarElement() instanceof CrossReference) {
				//Completaremos...
			}
			else if (node.getGrammarElement() instanceof TerminalRule) { //reglas descolgadas del árbol
				//Completaremos...
			}
			else if (node.getGrammarElement() instanceof RuleCall) { //todas las reglas del árbol
				RuleCall r = (RuleCall)node.getGrammarElement();
				//Para Java 1.7 --> problemas al exportar plugin si usamos SWITCH
				if (r.getRule().getName().equals("STRING"))
					acceptor.addPosition(node.getOffset(), node.getLength(), ParafarmaciaHighlightingConfiguration.CADENA_TEXTO);
				//Completaremos...
				else acceptor.addPosition(node.getOffset(), node.getLength(), ParafarmaciaHighlightingConfiguration.NORMAL);
			}
			
			//Elementos semánticos
			if (node.getSemanticElement() instanceof Parafarmacia) {
				//Completaremos...
			} //if
			
		}
	}


}