package impl.tfm.business.pedidomanager;

import java.util.Vector;

import org.springframework.beans.factory.annotation.Autowired;

import com.tfm.business.PedidoManagerService;
import com.tfm.model.Pedido;

public class PedidoManagerEJBService implements PedidoManagerService{

	@Autowired
	private PedidoManager pedidoManager;
	
	public void setPedidoManager(PedidoManager pedidoManager) {
		this.pedidoManager = pedidoManager;
	}
	
	@Override
	public Vector<Pedido> getPedidos() throws Exception {
		return pedidoManager.getPedidos();
	}

	@Override
	public Pedido newPedido(Pedido pedido) throws Exception {
		return pedidoManager.newPedido(pedido);
	}

	@Override
	public Pedido updatePedido(Pedido pedido) throws Exception {
		return pedidoManager.updatePedido(pedido);
	}

}
