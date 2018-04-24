/**
 * generated by Xtext 2.12.0
 */
package org.xtext.dsl.generador.generator;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.xtext.dsl.generador.generator.GeneradorCSS;
import org.xtext.dsl.generador.generator.GeneradorJSP;
import org.xtext.dsl.generador.generator.GeneradorProductosBD;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class GeneradorGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    GeneradorCSS generatorCSS = new GeneradorCSS(resource, fsa);
    generatorCSS.compilar();
    GeneradorProductosBD generatorProductosBD = new GeneradorProductosBD(resource, fsa);
    generatorProductosBD.compilar();
    GeneradorJSP generadorJSP = new GeneradorJSP(resource, fsa);
    generadorJSP.compilar();
  }
}
