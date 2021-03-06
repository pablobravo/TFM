/*
 * generated by Xtext 2.12.0
 */
package org.xtext.dsl.generador.formatting2

import com.google.inject.Inject
import org.xtext.dsl.generador.generador.Parafarmacia
import org.xtext.dsl.generador.generador.Producto
import org.xtext.dsl.generador.services.GeneradorGrammarAccess
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument

class GeneradorFormatter extends AbstractFormatter2 {
	
	@Inject extension GeneradorGrammarAccess
	
	
	def dispatch void format(Parafarmacia parafarmacia, extension IFormattableDocument document) {
		var open = parafarmacia.regionFor.keyword("{")
		open.append[newLine]
		
		var openelement = parafarmacia.regionFor.keyword("<")
		openelement.prepend[newLine]
		openelement.prepend[indent]

		
		var close = parafarmacia.regionFor.keyword("}")
		interior(open, close)[indent]


		for (Producto c : parafarmacia.productos) {
			c.regionFor.keyword("[").prepend[newLine]
			c.regionFor.keyword(";").prepend[noSpace].append[newLine]
		}
	}
}
