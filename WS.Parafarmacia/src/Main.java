import com.ws.model.Producto;

import impl.ws.persistence.ProductoDAO;

public class Main {

	public static void main(String[] args) {
		try {
			Producto producto = new Producto();
			producto.setNombre("prueba");
			producto.setDescripcion("descripcion");
			producto.setPrecio(33.3);
			producto.setCantidad(44);
			producto.setCategoria("Higiene");
			ProductoDAO.newProducto(producto);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
