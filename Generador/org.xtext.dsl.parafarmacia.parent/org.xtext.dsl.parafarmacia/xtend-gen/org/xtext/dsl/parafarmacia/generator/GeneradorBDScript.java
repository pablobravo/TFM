package org.xtext.dsl.parafarmacia.generator;

import com.google.common.collect.Iterables;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.xtext.dsl.parafarmacia.parafarmacia.Producto;

@SuppressWarnings("all")
public class GeneradorBDScript {
  private Resource resource;
  
  private IFileSystemAccess fsa;
  
  public GeneradorBDScript(final Resource resource, final IFileSystemAccess fsa) {
    this.resource = resource;
    this.fsa = fsa;
  }
  
  public void compilar() {
    StringBuilder sb = new StringBuilder();
    Iterable<Producto> _filter = Iterables.<Producto>filter(IteratorExtensions.<EObject>toIterable(this.resource.getAllContents()), Producto.class);
    for (final Producto i : _filter) {
      sb.append(this.compilarTexto(i));
    }
    this.fsa.generateFile("productos.txt", sb.toString());
  }
  
  public CharSequence compilarTexto(final Producto p) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("INSERT INTO PRODUCTO VALUES (\'");
    String _nombre = p.getNombre();
    _builder.append(_nombre);
    _builder.append("\',\'");
    String _name = p.getName();
    _builder.append(_name);
    _builder.append("\',\'");
    String _precio = p.getPrecio();
    _builder.append(_precio);
    _builder.append("\',");
    {
      boolean _isConreceta = p.isConreceta();
      if (_isConreceta) {
        _builder.append("True");
      } else {
        _builder.append("False");
      }
    }
    _builder.append(",\'");
    String _descripcion = p.getDescripcion();
    _builder.append(_descripcion);
    _builder.append("\');");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    return _builder;
  }
}
