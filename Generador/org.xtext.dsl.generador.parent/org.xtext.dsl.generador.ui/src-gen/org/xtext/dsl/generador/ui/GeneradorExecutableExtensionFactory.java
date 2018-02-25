/*
 * generated by Xtext 2.12.0
 */
package org.xtext.dsl.generador.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.xtext.dsl.generador.ui.internal.GeneradorActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class GeneradorExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return GeneradorActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return GeneradorActivator.getInstance().getInjector(GeneradorActivator.ORG_XTEXT_DSL_GENERADOR_GENERADOR);
	}
	
}