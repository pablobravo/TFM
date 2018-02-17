package impl.ws.business.parafarmacia;

import java.util.Vector;

import javax.jws.WebService;

import com.ws.model.Pedido;
import com.ws.model.Producto;
import com.ws.model.Usuario;

import impl.ws.persistence.PedidoDAO;
import impl.ws.persistence.ProductoDAO;
import impl.ws.persistence.UsuarioDAO;

@WebService(endpointInterface = "impl.ws.business.parafarmacia.IParafarmaciaWS")
public class ParafarmaciaWS implements IParafarmaciaWS{
	
	private ProductoDAO productoDAO = new ProductoDAO();
	private PedidoDAO pedidoDAO = new PedidoDAO();
	private UsuarioDAO usuarioDAO = new UsuarioDAO();

	@Override
	public Vector<Producto> getProductos() throws Exception {
		return productoDAO.getProductos();
	}

	@Override
	public Producto updateProducto(Producto producto) throws Exception {
		return productoDAO.updateProducto(producto);
	}

	@Override
	public Producto newProducto(Producto producto) throws Exception {
		return productoDAO.newProducto(producto);
	}

	@Override
	public void removeProducto(int id) throws Exception {
		productoDAO.removeProducto(id);
		
	}

	@Override
	public Vector<Pedido> getPedidos() throws Exception {
		return pedidoDAO.getPedidos();
	}

	@Override
	public Pedido updatePedido(Pedido pedido) throws Exception {
		return pedidoDAO.updatePedido(pedido);
	}

	@Override
	public Pedido newPedido(Pedido pedido) throws Exception {
		return pedidoDAO.newPedido(pedido);
	}

	@Override
	public Vector<Usuario> getUsuarios() throws Exception {
		return usuarioDAO.getUsuarios();
	}

	@Override
	public Usuario updateUsuario(Usuario usuario) throws Exception {
		return usuarioDAO.updateUsuario(usuario);
	}

	@Override
	public Usuario newUsuario(Usuario usuario) throws Exception {
		return usuarioDAO.newUsuario(usuario);
	}

}
