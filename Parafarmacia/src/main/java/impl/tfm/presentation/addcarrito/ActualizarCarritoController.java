package impl.tfm.presentation.addcarrito;

import java.util.Vector;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.tfm.business.ProductoManagerService;
import com.tfm.model.Carrito;
import com.tfm.model.Producto;

@SessionAttributes({"carrito"})
@Controller
public class ActualizarCarritoController {
	
	@Autowired(required=true)
	ProductoManagerService productoManagerService;
	
	
	public void setProductoManagerService(ProductoManagerService productoManagerService) {
		this.productoManagerService = productoManagerService;
	}
	
	@RequestMapping ("/addcarrito")
	public synchronized String addProductoCarrito(Model model, HttpServletRequest request, @ModelAttribute("carrito") Carrito carrito)
	{
		try {
			if(request.getParameter("idproducto")!=null){
				Vector <Producto> productos = productoManagerService.getProductos();
				int idproducto = Integer.parseInt(request.getParameter("idproducto"));
	
				for(Producto p:productos){				
					if(idproducto == p.getId()){
						carrito.addProductos(p);
						request.getSession().setAttribute("carrito", carrito);
					}
				}
			}
			
		} catch (NumberFormatException e1) {
			e1.printStackTrace();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		
		return "redirect:" + request.getHeader("Referer");
	}
	
	@RequestMapping ("/removecarrito")
	public synchronized String removeProductoCarrito(Model model, HttpServletRequest request, @ModelAttribute("carrito") Carrito carrito)
	{
		try {
			if(request.getParameter("idproducto")!=null){
				Vector <Producto> productos = productoManagerService.getProductos();
				int idproducto = Integer.parseInt(request.getParameter("idproducto"));
	
				for(Producto p:productos){				
					if(idproducto == p.getId()){
						carrito.removeProductos(p);
						request.getSession().setAttribute("carrito", carrito);
					}
				}
			}
			
		} catch (NumberFormatException e1) {
			e1.printStackTrace();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		
		return "redirect:" + request.getHeader("Referer");
	}
	
	@ModelAttribute("carrito") 
	public Carrito getCarrito()
	{ 
		return new Carrito();
	}

}
