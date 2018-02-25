/*
 * generated by Xtext 2.12.0
 */
package org.xtext.dsl.generador.ide

import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2
import org.xtext.dsl.generador.GeneradorRuntimeModule
import org.xtext.dsl.generador.GeneradorStandaloneSetup

/**
 * Initialization support for running Xtext languages as language servers.
 */
class GeneradorIdeSetup extends GeneradorStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new GeneradorRuntimeModule, new GeneradorIdeModule))
	}
	
}
