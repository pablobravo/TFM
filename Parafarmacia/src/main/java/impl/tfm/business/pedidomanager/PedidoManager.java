package impl.tfm.business.pedidomanager;

import java.util.Vector;

import org.springframework.beans.factory.annotation.Autowired;

import com.tfm.business.PedidoManagerService;
import com.tfm.model.Pedido;
import com.tfm.persistence.PedidoDataService;

public class PedidoManager implements PedidoManagerService{
	
	@Autowired
	private PedidoDataService pedidoDataService;
	
	public void setPedidoDataService(PedidoDataService pedidoDataService) {
		this.pedidoDataService = pedidoDataService;
	}

	@Override
	public Vector<Pedido> getPedidos() throws Exception {
		return pedidoDataService.getPedidos();
	}

	@Override
	public Pedido newPedido(Pedido pedido) throws Exception {
		return pedidoDataService.newPedido(pedido);
	}

	@Override
	public Pedido updatePedido(Pedido pedido) throws Exception {
		return pedidoDataService.updatePedido(pedido);
	}

}
