/**
 * generated by Xtext 2.12.0
 */
package org.xtext.dsl.parafarmacia.generator;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.xtext.dsl.parafarmacia.generator.GeneradorBDScript;
import org.xtext.dsl.parafarmacia.generator.GeneradorWeb;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class ParafarmaciaGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    GeneradorBDScript generatorTexto = new GeneradorBDScript(resource, fsa);
    generatorTexto.compilar();
    GeneradorWeb generatorWeb = new GeneradorWeb(resource, fsa);
    generatorWeb.compilar();
  }
}