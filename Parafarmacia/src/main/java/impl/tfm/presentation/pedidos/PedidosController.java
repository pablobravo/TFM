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
		Vector<Vector<Pedido>> pedidosusuario = new Vector<Vector<Pedido>>();
		/*for(Pedido p : pedidos){
			if(p.getIdUsuario()==usuario.getId()){
				pedidosusuario.add(p);
			}
		}
*/
		
		int z = 0;
        for(int i=0; i<pedidos.size(); i++){
        	if(pedidos.get(i).getIdUsuario()==usuario.getId()){
        		pedidosusuario.add(new Vector<Pedido>());
                pedidosusuario.get(z).add(pedidos.get(i));
                int j=i+1;
                while(j<pedidos.size()){
                    if(pedidos.get(i).getIdUsuario()==pedidos.get(j).getIdUsuario() && pedidos.get(i).getFecha().equals(pedidos.get(j).getFecha()))
                    {
                        pedidosusuario.get(z).add(pedidos.get(j));
                        pedidos.remove(pedidos.get(j));
                        j--;
                    }
                    j++;
                }
                z++;
        	}
        }
		
		
		model.addAttribute("pedidosusuario", pedidosusuario);
		return "/mispedidos";
	}

}
