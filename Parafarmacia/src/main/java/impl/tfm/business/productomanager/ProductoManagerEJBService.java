package impl.tfm.business.productomanager;

import java.util.Vector;

import org.springframework.beans.factory.annotation.Autowired;

import com.tfm.business.ProductoManagerService;
import com.tfm.model.Producto;

public class ProductoManagerEJBService implements ProductoManagerService{

	@Autowired
	private ProductoManager productoManager;
	
	public void setProductoManager(ProductoManager productoManager) {
		this.productoManager = productoManager;
	}
	
	@Override
	public Vector<Producto> getProductos() throws Exception {
		return productoManager.getProductos();
	}

	@Override
	public Producto updateProducto(Producto producto) throws Exception {
		return productoManager.updateProducto(producto);
	}

	@Override
	public Producto newProducto(Producto producto) throws Exception {
		return productoManager.newProducto(producto);
	}

	@Override
	public void removeProducto(int id) throws Exception {
		productoManager.removeProducto(id);
		
	}

}
