/**
 * generated by Xtext 2.12.0
 */
package org.xtext.dsl.generador.ui.wizard;

import com.google.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.resource.FileExtensionProvider;

@SuppressWarnings("all")
public class GeneradorNewProjectWizardInitialContents {
  @Inject
  private FileExtensionProvider fileExtensionProvider;
  
  public void generateInitialContents(final IFileSystemAccess2 fsa) {
    String _primaryFileExtension = this.fileExtensionProvider.getPrimaryFileExtension();
    String _plus = ("src/model/Model." + _primaryFileExtension);
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/*");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* This is an example model");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("Hello Xtext!");
    _builder.newLine();
    fsa.generateFile(_plus, _builder);
  }
}
