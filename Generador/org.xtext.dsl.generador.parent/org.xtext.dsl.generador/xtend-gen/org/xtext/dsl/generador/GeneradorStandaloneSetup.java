/**
 * generated by Xtext 2.12.0
 */
package org.xtext.dsl.generador;

import org.xtext.dsl.generador.GeneradorStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class GeneradorStandaloneSetup extends GeneradorStandaloneSetupGenerated {
  public static void doSetup() {
    new GeneradorStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}
