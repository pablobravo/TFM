package impl.tfm.presentation.pedidos;

import java.util.Collections;
import java.util.Vector;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tfm.business.PedidoManagerService;
import com.tfm.model.Pedido;
import com.tfm.model.Usuario;

@Controller
public class PedidosController {
	
	@Autowired
	private PedidoManagerService pedidoManagerService;
	
	public void setPedidoManagerService(PedidoManagerService pedidoManagerService) {
		this.pedidoManagerService = pedidoManagerService;
	}

	@RequestMapping ("/mispedidos")
	public String finalizarPedido(Model model, HttpServletRequest request) throws Exception 
	{
		Usuario usuario = (Usuario)request.getSession().getAttribute("sesion");
		Vector<Pedido> pedidos = pedidoManagerService.getPedidos();
		Collections.reverse(pedidos);
		Vector<Pedido> pedidosusuario = new Vector<Pedido>();
		for(Pedido p : pedidos){
			if(p.getIdUsuario()==usuario.getId()){
				pedidosusuario.add(p);
			}
		}
		
		model.addAttribute("pedidosusuario", pedidosusuario);
		return "/mispedidos";
	}

}
