package impl.tfm.persistence.producto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

import com.tfm.model.Producto;
import com.tfm.persistence.ProductoDataService;

public class ProductoDAO implements ProductoDataService{

	@Override
	public Vector<Producto> getProductos() throws Exception {
		Vector<Producto> resultado = new Vector<Producto>();

		PreparedStatement ps = null;
		ResultSet rs = null;
		Connection con = null;
 
		try {
			String SQL_DRV = "org.hsqldb.jdbcDriver";
			String SQL_URL = "jdbc:hsqldb:hsql://localhost/parafarmacia";

			Class.forName(SQL_DRV);
			con = DriverManager.getConnection(SQL_URL, "pbm", "pbm");

			ps = con.prepareStatement("select * from producto");
			rs = ps.executeQuery();

			while (rs.next()) {
				Producto producto = new Producto();
				producto.setId(rs.getInt("id"));
				producto.setNombre(rs.getString("nombre"));
				producto.setDescripcion(rs.getString("descripcion"));
				producto.setPrecio(rs.getDouble("precio"));
				producto.setCantidad(rs.getInt("cantidad"));
				producto.setCategoria(rs.getString("categoria"));
				resultado.add(producto);
			}

		} catch (Exception e) {
			e.printStackTrace();
			throw (e);
		} finally {
			try {
				ps.close();
				con.close();
			} catch (Exception e) {
			}
		}
		return resultado;
	}

	@Override
	public synchronized Producto updateProducto(Producto producto) throws Exception {
		PreparedStatement ps = null;
		Connection con = null;
 
		try {
			String SQL_DRV = "org.hsqldb.jdbcDriver";
			String SQL_URL = "jdbc:hsqldb:hsql://localhost/parafarmacia";

			Class.forName(SQL_DRV);
			con = DriverManager.getConnection(SQL_URL, "pbm", "pbm");

	
			ps = con.prepareStatement("UPDATE producto set nombre = ?, descripcion = ?,precio = ?,cantidad = ?, categoria = ? where id=?");
			ps.setString(1, producto.getNombre());
			ps.setString(2, producto.getDescripcion());
			ps.setDouble(3, producto.getPrecio());
			ps.setInt(4, producto.getCantidad());
			ps.setString(5, producto.getCategoria());
			ps.setInt(6, producto.getId());
			ps.executeUpdate();


		} catch (Exception e) {
			e.printStackTrace();
			throw (e);
		} finally {
			try {
				ps.close();
				con.close();
			} catch (Exception e) {
			}
		}
		return producto;
	}

	@SuppressWarnings("resource")
	@Override
	public synchronized Producto newProducto(Producto producto) throws Exception {
		PreparedStatement ps = null;
		ResultSet rs = null;
		Connection con = null;

		try {
			String SQL_DRV = "org.hsqldb.jdbcDriver";
			String SQL_URL = "jdbc:hsqldb:hsql://localhost/parafarmacia";

			Class.forName(SQL_DRV);
			con = DriverManager.getConnection(SQL_URL, "pbm", "pbm");

			ps = con.prepareStatement("select max(id) as maximo from producto");
			rs = ps.executeQuery();
			Integer id=0;
			while (rs.next()) {
				 id = rs.getInt("maximo");
			}
			
			producto.setId(id);
			ps = con.prepareStatement("insert into producto values (?,?,?,?,?,?)");
			ps.setInt(1, id+1);
			ps.setString(2,producto.getNombre());
			ps.setString(3,producto.getDescripcion());
			ps.setDouble(4,producto.getPrecio());
			ps.setInt(5,producto.getCantidad());
			ps.setString(6,producto.getCategoria());
		
			ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
			throw (e);
		} finally {
			try {
				ps.close();
				con.close();
			} catch (Exception e) {
			}
		}
		return producto;
	}

	@Override
	public void removeProducto(int id) throws Exception {
		PreparedStatement ps = null;
		Connection con = null;

		try {
			String SQL_DRV = "org.hsqldb.jdbcDriver";
			String SQL_URL = "jdbc:hsqldb:hsql://localhost/parafarmacia";

			Class.forName(SQL_DRV);
			con = DriverManager.getConnection(SQL_URL, "pbm", "pbm");
			
			ps = con.prepareStatement("DELETE FROM producto where id=?");
			ps.setInt(1, id);
			ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
			throw (e);
		} finally {
			try {
				ps.close();
				con.close();
			} catch (Exception e) {
			}
		}
		
	}

}
