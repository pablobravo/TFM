package impl.tfm.presentation.finpedido;

import java.sql.Date;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tfm.business.PedidoManagerService;
import com.tfm.model.Carrito;
import com.tfm.model.Pedido;
import com.tfm.model.Producto;
import com.tfm.model.Usuario;

@Controller
public class FinalizarPedidoController {
	
	@Autowired
	private PedidoManagerService pedidoManagerService;
	
	public void setPedidoManagerService(PedidoManagerService pedidoManagerService) {
		this.pedidoManagerService = pedidoManagerService;
	}

	@SuppressWarnings("rawtypes")
	@RequestMapping ("/finalizar")
	public String finalizarPedido(Model model, HttpServletRequest request) throws Exception
	{
		Carrito carrito = (Carrito)request.getSession().getAttribute("carrito");
		if(carrito==null){
			return "inicio";
		}
		if(carrito.getProductos().size()==0){
			return "inicio";
		}
		if(request.getSession().getAttribute("sesion")==null){
			return "inicio";
		}
		Usuario usuario = (Usuario)request.getSession().getAttribute("sesion");
		Iterator it = carrito.getProductos().entrySet().iterator();
		while (it.hasNext()) {
		    Map.Entry e = (Map.Entry)it.next();
		    
		    Pedido pedido = new Pedido();
			pedido.setIdUsuario(usuario.getId());
			pedido.setIdProducto(((Producto)e.getKey()).getId());
			pedido.setUnidades((Integer)e.getValue());
			pedido.setFecha(new Date(Calendar.getInstance().getTime().getTime()));
			pedido.setEstado("aceptado");
			pedidoManagerService.newPedido(pedido);
		    
		}
		request.getSession().setAttribute("pedido", carrito);
		request.getSession().setAttribute("carrito", new Carrito());
		return "/finalizar";
	}
	
}
