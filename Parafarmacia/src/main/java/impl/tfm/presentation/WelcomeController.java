package impl.tfm.presentation;


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
public class WelcomeController {
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
	
	@RequestMapping("/")
	public String welcome(HttpServletRequest request, Model m) throws Exception {
		System.out.println("Ejecutando controlador inicio");
		Vector<Producto> productos = productoManagerService.getProductos();
		request.getSession().setAttribute("productos", productos);
		return "/inicio";
	}
	
	@RequestMapping("/inicio")
	public String inicio(HttpServletRequest request, Model m) throws Exception {
		System.out.println("Ejecutando controlador inicio");
		Vector<Producto> productos = productoManagerService.getProductos();
		request.getSession().setAttribute("productos", productos);

		return "/inicio";
	}

	
}
