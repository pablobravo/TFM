/**
 * generated by Xtext 2.12.0
 */
package org.xtext.dsl.generador.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.xtext.dsl.generador.GeneradorRuntimeModule;
import org.xtext.dsl.generador.GeneradorStandaloneSetup;
import org.xtext.dsl.generador.ide.GeneradorIdeModule;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class GeneradorIdeSetup extends GeneradorStandaloneSetup {
  @Override
  public Injector createInjector() {
    GeneradorRuntimeModule _generadorRuntimeModule = new GeneradorRuntimeModule();
    GeneradorIdeModule _generadorIdeModule = new GeneradorIdeModule();
    return Guice.createInjector(Modules2.mixin(_generadorRuntimeModule, _generadorIdeModule));
  }
}
