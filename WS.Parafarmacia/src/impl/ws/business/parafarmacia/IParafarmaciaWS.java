package impl.ws.business.parafarmacia;

import java.util.Vector;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import com.ws.model.Pedido;
import com.ws.model.Producto;
import com.ws.model.Usuario;


@WebService
@SOAPBinding(style = Style.DOCUMENT)
public interface IParafarmaciaWS {
	
	@WebMethod
	public Vector<Producto> getProductos() throws Exception;
	
	@WebMethod
	public Producto updateProducto(Producto producto) throws Exception;
	
	@WebMethod
	public Producto newProducto(Producto producto) throws Exception;
	
	@WebMethod
	public void removeProducto(int id) throws Exception;
	
	@WebMethod
	public Vector<Pedido> getPedidos() throws Exception;
	
	@WebMethod
	public Pedido updatePedido(Pedido pedido) throws Exception;
	
	@WebMethod
	public Pedido newPedido(Pedido pedido) throws Exception;
	
	@WebMethod
	public Vector<Usuario> getUsuarios() throws Exception;
	
	@WebMethod
	public Usuario updateUsuario(Usuario usuario) throws Exception;
	
	@WebMethod
	public Usuario newUsuario(Usuario usuario) throws Exception;


}
