package impl.tfm.presentation.buscador;

import java.util.Vector;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tfm.business.ProductoManagerService;
import com.tfm.model.Producto;

@Controller
public class BuscadorController {
	@Autowired(required=true)
	ProductoManagerService productoManagerService;
	
	
	public void setProductoManagerService(ProductoManagerService productoManagerService) {
		this.productoManagerService = productoManagerService;
	}
	

	@RequestMapping("/buscar")
	public String inicio(HttpServletRequest request, Model m, @RequestParam(value = "search") String search) throws Exception {
		System.out.println("Ejecutando controlador buscar");
		Vector<Producto> productos = productoManagerService.getProductos();
		Vector<Producto> productosencontrados = new Vector<Producto>();
		for(Producto p: productos){
			if(p.getNombre().trim().toLowerCase().contains(search.toLowerCase().trim())){
				productosencontrados.add(p);
			}
		}
		request.getSession().setAttribute("productosencontrados", productosencontrados);

		return "/buscar";
	}
	
}
