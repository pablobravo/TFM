package impl.tfm.business.productomanager;

import java.util.Vector;

import org.springframework.beans.factory.annotation.Autowired;

import com.tfm.business.ProductoManagerService;
import com.tfm.model.Producto;
import com.tfm.persistence.ProductoDataService;

public class ProductoManager implements ProductoManagerService{
	
	@Autowired
	private ProductoDataService productoDataService;
	
	public void setProductoDataService(ProductoDataService productoDataService) {
		this.productoDataService = productoDataService;
	}

	@Override
	public Vector<Producto> getProductos() throws Exception {
		return productoDataService.getProductos();
	}

	@Override
	public Producto updateProducto(Producto producto) throws Exception {
		return productoDataService.updateProducto(producto);
	}

	@Override
	public Producto newProducto(Producto producto) throws Exception {
		return productoDataService.newProducto(producto);
	}

	@Override
	public void removeProducto(int id) throws Exception {
		productoDataService.removeProducto(id);
		
	}

}
