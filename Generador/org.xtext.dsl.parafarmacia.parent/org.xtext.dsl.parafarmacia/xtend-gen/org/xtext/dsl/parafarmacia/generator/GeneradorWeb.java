package org.xtext.dsl.parafarmacia.generator;

import com.google.common.collect.Iterables;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.xtext.dsl.parafarmacia.parafarmacia.Apariencia;
import org.xtext.dsl.parafarmacia.parafarmacia.Pagina;
import org.xtext.dsl.parafarmacia.parafarmacia.Parafarmacia;
import org.xtext.dsl.parafarmacia.parafarmacia.Producto;

@SuppressWarnings("all")
public class GeneradorWeb {
  private Resource resource;
  
  private IFileSystemAccess fsa;
  
  public GeneradorWeb(final Resource resource, final IFileSystemAccess fsa) {
    this.resource = resource;
    this.fsa = fsa;
  }
  
  public void compilar() {
    Iterable<Parafarmacia> _filter = Iterables.<Parafarmacia>filter(IteratorExtensions.<EObject>toIterable(this.resource.getAllContents()), Parafarmacia.class);
    for (final Parafarmacia r : _filter) {
      this.compilarTexto(r);
    }
  }
  
  public CharSequence compilarTexto(final Parafarmacia p) {
    StringConcatenation _builder = new StringConcatenation();
    this.fsa.generateFile("css/style.css", this.compilarEstilos(p.getApariencia()));
    _builder.newLineIfNotEmpty();
    {
      EList<Pagina> _paginas = p.getPaginas();
      for(final Pagina pag : _paginas) {
        String _name = pag.getName();
        String _plus = (_name + ".html");
        this.fsa.generateFile(_plus, this.compilarPagina(p, pag));
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence compilarEstilos(final Apariencia ap) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("p{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("font-size: ");
    int _sizeFuenteCuerpo = ap.getSizeFuenteCuerpo();
    _builder.append(_sizeFuenteCuerpo, "\t");
    _builder.append("px;");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("color: ");
    String _colorTexto = ap.getColorTexto();
    _builder.append(_colorTexto, "\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    _builder.append("h1{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("font-size: ");
    int _sizeFuenteH1 = ap.getSizeFuenteH1();
    _builder.append(_sizeFuenteH1, "\t");
    _builder.append("px;");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("padding:10px;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("h2{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("font-size: ");
    int _sizeFuenteH2 = ap.getSizeFuenteH2();
    _builder.append(_sizeFuenteH2, "\t");
    _builder.append("px;");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("padding:10px");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("div.titulo{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("background-color:");
    String _colorFondo1 = ap.getColorFondo1();
    _builder.append(_colorFondo1, "\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("margin:0;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("padding:0;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("ul.menu{");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("list-style-type: none;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("margin: 0;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("padding: 0;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("overflow: hidden;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("background-color: #333333;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("ul.menu li {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("float: left;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("ul.menu li a {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("display: block;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("color: white;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("text-align: center;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("padding: 16px;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("text-decoration: none;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("ul.menu li a:hover {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("background-color: #111111;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("ul.producto{");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("list-style-type: none;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("margin: 0;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("padding: 0;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("ul.producto li {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("float: left;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("width: 30%;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("height: 200px;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("background-color:");
    String _colorFondo2 = ap.getColorFondo2();
    _builder.append(_colorFondo2, "    ");
    _builder.append(" ;");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("padding: 5px;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("margin:5px");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compilarPagina(final Parafarmacia p, final Pagina pag) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<!DOCTYPE html>");
    _builder.newLine();
    _builder.append("<html lang=\"es\">");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<head>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\" />");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<title>");
    String _titulo = pag.getTitulo();
    _builder.append(_titulo, "\t\t");
    _builder.append("</title>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\" />");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</head>");
    _builder.newLine();
    _builder.append("\t ");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<body>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<div class=\"titulo\">");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<h1>");
    String _titulo_1 = p.getTitulo();
    _builder.append(_titulo_1, "\t\t\t");
    _builder.append("</h1>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("<h2>");
    String _descripcion = p.getDescripcion();
    _builder.append(_descripcion, "\t\t\t");
    _builder.append("</h2>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<ul class=\"menu\">");
    _builder.newLine();
    {
      EList<Pagina> _paginas = p.getPaginas();
      for(final Pagina pg : _paginas) {
        _builder.append("\t\t\t");
        _builder.append("<li><a href=\"");
        String _name = pg.getName();
        _builder.append(_name, "\t\t\t");
        _builder.append(".html\">");
        String _name_1 = pg.getName();
        _builder.append(_name_1, "\t\t\t");
        _builder.append("</a></li>");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t");
    _builder.append("</ul>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<h3>");
    String _titulo_2 = pag.getTitulo();
    _builder.append(_titulo_2, "\t\t");
    _builder.append("</h3>");
    _builder.newLineIfNotEmpty();
    {
      int _length = ((Object[])Conversions.unwrapArray(pag.getCuerpo().getProductos(), Object.class)).length;
      boolean _greaterThan = (_length > 0);
      if (_greaterThan) {
        _builder.append("\t\t");
        _builder.append("<ul class=\"producto\">");
        _builder.newLine();
        {
          EList<Producto> _productos = pag.getCuerpo().getProductos();
          for(final Producto prod : _productos) {
            _builder.append("\t\t");
            _builder.append("<li><h4>");
            String _nombre = prod.getNombre();
            _builder.append(_nombre, "\t\t");
            _builder.append(" ");
            String _precio = prod.getPrecio();
            _builder.append(_precio, "\t\t");
            _builder.append("€</h4><p>");
            String _descripcion_1 = prod.getDescripcion();
            _builder.append(_descripcion_1, "\t\t");
            _builder.append("</p></li>");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t\t");
        _builder.append("</ul>");
        _builder.newLine();
      } else {
        _builder.append("\t\t");
        _builder.append("<p>");
        String _texto = pag.getCuerpo().getTexto();
        _builder.append(_texto, "\t\t");
        _builder.append("</p>");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("</body>");
    _builder.newLine();
    _builder.append("</html>");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
}
