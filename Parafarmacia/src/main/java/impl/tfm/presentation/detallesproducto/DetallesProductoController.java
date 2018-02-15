package impl.tfm.presentation.detallesproducto;

import java.util.Vector;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tfm.business.ProductoManagerService;
import com.tfm.model.Producto;

@Controller
public class DetallesProductoController {
	
	@Autowired(required=true)
	ProductoManagerService productoManagerService;
	
	
	public void setProductoManagerService(ProductoManagerService productoManagerService) {
		this.productoManagerService = productoManagerService;
	}
	
	@RequestMapping ("/detalles")
	public String detalles(Model model, HttpServletRequest request)
	{
		try {
			if(request.getParameter("idproducto")!=null){
				Vector <Producto> productos = productoManagerService.getProductos();
				int idproducto = Integer.parseInt(request.getParameter("idproducto"));
	
				for(Producto p:productos){				
					if(idproducto == p.getId()){
						model.addAttribute("producto", p);
					}
				}
			}
			
		} catch (NumberFormatException e1) {
			e1.printStackTrace();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		
		return "/detalles";
	}
	

}
