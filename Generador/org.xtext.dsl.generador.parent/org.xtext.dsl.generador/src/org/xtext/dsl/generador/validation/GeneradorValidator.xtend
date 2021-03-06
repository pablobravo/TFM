/*
 * generated by Xtext 2.12.0
 */
package org.xtext.dsl.generador.validation

import org.eclipse.xtext.validation.Check
import org.xtext.dsl.generador.generador.Apariencia
import org.xtext.dsl.generador.generador.GeneradorPackage

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class GeneradorValidator extends AbstractGeneradorValidator {
	
public static val INVALID_COLOR = 'invalidColor'
	public static val INVALID_SIZE_TEXT = 'invalidSizeText'

	@Check
	def checkFormatColor(Apariencia apariencia) {
		if (apariencia.principal.length > 7 || apariencia.principal.length < 3) {
			error('El color no puede tener m�s de 7 caracteres ni menos de 3', 
					GeneradorPackage.Literals.APARIENCIA__PRINCIPAL,
					INVALID_COLOR)
		}
		if (apariencia.principalClaro.length > 7 || apariencia.principalClaro.length < 3) {
			error('El color no puede tener m�s de 7 caracteres ni menos de 3', 
					GeneradorPackage.Literals.APARIENCIA__PRINCIPAL_CLARO,
					INVALID_COLOR)
		}
		if (apariencia.secundario.length > 7 || apariencia.secundario.length < 3) {
			error('El color no puede tener m�s de 7 caracteres ni menos de 3', 
					GeneradorPackage.Literals.APARIENCIA__SECUNDARIO,
					INVALID_COLOR)
		}
		if (apariencia.fondo.length > 7 || apariencia.fondo.length < 3) {
			error('El color no puede tener m�s de 7 caracteres ni menos de 3', 
					GeneradorPackage.Literals.APARIENCIA__FONDO,
					INVALID_COLOR)
		}
		if (apariencia.fondoProductos.length > 7 || apariencia.fondoProductos.length < 3) {
			error('El color no puede tener m�s de 7 caracteres ni menos de 3', 
					GeneradorPackage.Literals.APARIENCIA__FONDO_PRODUCTOS,
					INVALID_COLOR)
		}
		if (apariencia.precios.length > 7 || apariencia.precios.length < 3) {
			error('El color no puede tener m�s de 7 caracteres ni menos de 3', 
					GeneradorPackage.Literals.APARIENCIA__PRECIOS,
					INVALID_COLOR)
		}
		if (apariencia.texto.length > 7 || apariencia.texto.length < 3) {
			error('El color no puede tener m�s de 7 caracteres ni menos de 3', 
					GeneradorPackage.Literals.APARIENCIA__TEXTO,
					INVALID_COLOR)
		}
		if (apariencia.tituloColor.length > 7 || apariencia.tituloColor.length < 3) {
			error('El color no puede tener m�s de 7 caracteres ni menos de 3', 
					GeneradorPackage.Literals.APARIENCIA__TITULO_COLOR,
					INVALID_COLOR)
		}
		
	}
	
}
