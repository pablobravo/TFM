package impl.tfm.presentation.acceso;

import java.util.Vector;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tfm.business.ProductoManagerService;
import com.tfm.model.Producto;

@Controller
public class CerrarSesionController {
	@Autowired(required=true)
	ProductoManagerService productoManagerService;
	
	
	public void setProductoManagerService(ProductoManagerService productoManagerService) {
		this.productoManagerService = productoManagerService;
	}
	@RequestMapping ("/cerrarsesion")
	public String carrito(HttpServletRequest request, Model model) throws Exception
	{
		request.getSession().setAttribute("sesion", null);
		Vector<Producto> productos = productoManagerService.getProductos();
		request.getSession().setAttribute("productos", productos);
		return "redirect:" + request.getHeader("Referer");
	}
	

}
