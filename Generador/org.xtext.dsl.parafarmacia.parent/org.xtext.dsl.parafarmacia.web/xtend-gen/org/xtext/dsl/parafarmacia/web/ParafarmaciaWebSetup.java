/**
 * generated by Xtext 2.12.0
 */
package org.xtext.dsl.parafarmacia.web;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.xtext.dsl.parafarmacia.ParafarmaciaRuntimeModule;
import org.xtext.dsl.parafarmacia.ParafarmaciaStandaloneSetup;
import org.xtext.dsl.parafarmacia.ide.ParafarmaciaIdeModule;
import org.xtext.dsl.parafarmacia.web.ParafarmaciaWebModule;

/**
 * Initialization support for running Xtext languages in web applications.
 */
@SuppressWarnings("all")
public class ParafarmaciaWebSetup extends ParafarmaciaStandaloneSetup {
  @Override
  public Injector createInjector() {
    ParafarmaciaRuntimeModule _parafarmaciaRuntimeModule = new ParafarmaciaRuntimeModule();
    ParafarmaciaIdeModule _parafarmaciaIdeModule = new ParafarmaciaIdeModule();
    ParafarmaciaWebModule _parafarmaciaWebModule = new ParafarmaciaWebModule();
    return Guice.createInjector(Modules2.mixin(_parafarmaciaRuntimeModule, _parafarmaciaIdeModule, _parafarmaciaWebModule));
  }
}
