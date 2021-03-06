/**
 * generated by Xtext 2.12.0
 */
package org.xtext.dsl.generador.formatting2;

import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.formatting2.IHiddenRegionFormatter;
import org.eclipse.xtext.formatting2.regionaccess.ISemanticRegion;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.xtext.dsl.generador.generador.Parafarmacia;
import org.xtext.dsl.generador.generador.Producto;
import org.xtext.dsl.generador.services.GeneradorGrammarAccess;

@SuppressWarnings("all")
public class GeneradorFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private GeneradorGrammarAccess _generadorGrammarAccess;
  
  protected void _format(final Parafarmacia parafarmacia, @Extension final IFormattableDocument document) {
    ISemanticRegion open = this.textRegionExtensions.regionFor(parafarmacia).keyword("{");
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.append(open, _function);
    ISemanticRegion openelement = this.textRegionExtensions.regionFor(parafarmacia).keyword("<");
    final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(openelement, _function_1);
    final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it) -> {
      it.indent();
    };
    document.prepend(openelement, _function_2);
    ISemanticRegion close = this.textRegionExtensions.regionFor(parafarmacia).keyword("}");
    final Procedure1<IHiddenRegionFormatter> _function_3 = (IHiddenRegionFormatter it) -> {
      it.indent();
    };
    document.<ISemanticRegion, ISemanticRegion>interior(open, close, _function_3);
    EList<Producto> _productos = parafarmacia.getProductos();
    for (final Producto c : _productos) {
      {
        final Procedure1<IHiddenRegionFormatter> _function_4 = (IHiddenRegionFormatter it) -> {
          it.newLine();
        };
        document.prepend(this.textRegionExtensions.regionFor(c).keyword("["), _function_4);
        final Procedure1<IHiddenRegionFormatter> _function_5 = (IHiddenRegionFormatter it) -> {
          it.noSpace();
        };
        final Procedure1<IHiddenRegionFormatter> _function_6 = (IHiddenRegionFormatter it) -> {
          it.newLine();
        };
        document.append(document.prepend(this.textRegionExtensions.regionFor(c).keyword(";"), _function_5), _function_6);
      }
    }
  }
  
  public void format(final Object parafarmacia, final IFormattableDocument document) {
    if (parafarmacia instanceof XtextResource) {
      _format((XtextResource)parafarmacia, document);
      return;
    } else if (parafarmacia instanceof Parafarmacia) {
      _format((Parafarmacia)parafarmacia, document);
      return;
    } else if (parafarmacia instanceof EObject) {
      _format((EObject)parafarmacia, document);
      return;
    } else if (parafarmacia == null) {
      _format((Void)null, document);
      return;
    } else if (parafarmacia != null) {
      _format(parafarmacia, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(parafarmacia, document).toString());
    }
  }
}
