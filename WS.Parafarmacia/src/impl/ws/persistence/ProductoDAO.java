package impl.ws.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

import com.ws.model.Producto;

import impl.ws.persistence.conf.Conf;
import impl.ws.persistence.conf.util.Jdbc;

public class ProductoDAO {
	public Vector<Producto> getProductos() throws Exception {
		Vector<Producto> resultado = new Vector<Producto>();

		PreparedStatement ps = null;
		ResultSet rs = null;
		Connection con = null;
		
		try {
			con = Jdbc.getConnection();
			
			ps = con.prepareStatement(Conf.get("SQL_PRODUCTOS"));
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

			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			throw (e);
		} finally {
			Jdbc.close(rs, ps, con);
		}
		
		return resultado;
	}

	public synchronized Producto updateProducto(Producto producto) throws Exception {
		PreparedStatement ps = null;
		Connection con = null;
		
		try {
			con = Jdbc.getConnection();
			
			ps = con.prepareStatement(Conf.get("SQL_UPDATE_PRODUCTO"));
			
			ps.setString(1, producto.getNombre());
			ps.setString(2, producto.getDescripcion());
			ps.setDouble(3, producto.getPrecio());
			ps.setInt(4, producto.getCantidad());
			ps.setString(5, producto.getCategoria());
			ps.setInt(6, producto.getId());
			ps.executeUpdate();


			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			throw (e);
		} finally {
			Jdbc.close(ps, con);
		}
		
		return producto;
	}

	public synchronized static Producto newProducto(Producto producto) throws Exception {
		PreparedStatement ps = null;
		ResultSet rs = null;
		Connection con = null;
		
		try {
			
			con = Jdbc.getConnection();
			
			ps = con.prepareStatement(Conf.get("SQL_INSERT_PRODUCTO"));
	
			ps.setString(1,producto.getNombre());
			ps.setString(2,producto.getDescripcion());
			ps.setDouble(3,producto.getPrecio());
			ps.setInt(4,producto.getCantidad());
			ps.setString(5,producto.getCategoria());
		
			ps.executeUpdate();
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			throw (e);
		} finally {
			Jdbc.close(rs, ps, con);
		}
		
		return producto;
	}

	
	public void removeProducto(int id) throws Exception {
		PreparedStatement ps = null;
		Connection con = null;
		
		try {
			con = Jdbc.getConnection();
			
			ps = con.prepareStatement(Conf.get("SQL_DELETE_PRODUCTO"));
			ps.setInt(1, id);
			ps.executeUpdate();

			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			throw (e);
		} finally {
			Jdbc.close(ps, con);
		}
		
		
	}
}
