package impl.tfm.presentation.productos;


import java.util.Vector;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tfm.business.ProductoManagerService;
import com.tfm.model.Producto;
@Controller
public class ProductosController {
	@Autowired
	private ServletContext context;

	public void setServletContext(ServletContext servletContext) {
	     this.context = servletContext;
	}
	@Autowired(required=true)
	ProductoManagerService productoManagerService;
	
	
	public void setProductoManagerService(ProductoManagerService productoManagerService) {
		this.productoManagerService = productoManagerService;
	}
	
	
	@RequestMapping("/productos")
	public String productos(HttpServletRequest request, Model m) throws Exception {
		System.out.println("Ejecutando controlador productos");
		Vector<Producto> productos = productoManagerService.getProductos();
		request.getSession().setAttribute("productos", productos);
		m.addAttribute("productos", productos);
		return "/productos";
	}
	
	@RequestMapping("/cosmetica")
	public String cosmetica(HttpServletRequest request, Model m) throws Exception {
		Vector<Producto> productos = productoManagerService.getProductos();
		Vector<Producto> productoscosmetica = new Vector<Producto>();
		for(Producto p:productos){
			if(p.getCategoria().toLowerCase().equals("cosmética")){
				productoscosmetica.add(p);
			}
		}
		m.addAttribute("categoria", "Cosmética");
		m.addAttribute("productos", productoscosmetica);

		return "/productos";
	}
	
	@RequestMapping("/higiene")
	public String higiene(HttpServletRequest request, Model m) throws Exception {
		Vector<Producto> productos = productoManagerService.getProductos();
		Vector<Producto> productoshigiene = new Vector<Producto>();
		for(Producto p:productos){
			if(p.getCategoria().toLowerCase().equals("higiene")){
				productoshigiene.add(p);
			}
		}
		m.addAttribute("categoria", "Higiene");
		m.addAttribute("productos", productoshigiene);

		return "/productos";
	}
	
	@RequestMapping("/salud")
	public String salud(HttpServletRequest request, Model m) throws Exception {
		Vector<Producto> productos = productoManagerService.getProductos();
		Vector<Producto> productossalud = new Vector<Producto>();
		for(Producto p:productos){
			if(p.getCategoria().toLowerCase().equals("salud")){
				productossalud.add(p);
			}
		}
		m.addAttribute("categoria", "Salud");
		m.addAttribute("productos", productossalud);

		return "/productos";
	}
	
	@RequestMapping("/dietetica")
	public String dietetica(HttpServletRequest request, Model m) throws Exception {
		Vector<Producto> productos = productoManagerService.getProductos();
		Vector<Producto> productoscosmetica = new Vector<Producto>();
		for(Producto p:productos){
			if(p.getCategoria().toLowerCase().equals("dietética")){
				productoscosmetica.add(p);
			}
		}
		m.addAttribute("categoria", "Dietética");
		m.addAttribute("productos", productoscosmetica);

		return "/productos";
	}
	
	@RequestMapping("/bebes")
	public String bebes(HttpServletRequest request, Model m) throws Exception {
		Vector<Producto> productos = productoManagerService.getProductos();
		Vector<Producto> productoscosmetica = new Vector<Producto>();
		for(Producto p:productos){
			if(p.getCategoria().toLowerCase().equals("bebes")){
				productoscosmetica.add(p);
			}
		}
		m.addAttribute("categoria", "Bebes");
		m.addAttribute("productos", productoscosmetica);

		return "/productos";
	}

	
}
