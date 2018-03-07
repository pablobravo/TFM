package impl.ws.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

import com.ws.model.Pedido;

import impl.ws.persistence.conf.Conf;
import impl.ws.persistence.conf.util.Jdbc;

public class PedidoDAO {
	public Vector<Pedido> getPedidos() throws Exception {
		Vector<Pedido> pedidos = new Vector<Pedido>();

		PreparedStatement ps = null;
		ResultSet rs = null;
		Connection con = null;
		
		try {
			con = Jdbc.getConnection();
			
			ps = con.prepareStatement(Conf.get("SQL_PEDIDOS"));
			rs = ps.executeQuery();

			while (rs.next()){
				Pedido t = new Pedido();
				t.setId(rs.getInt("id"));
				t.setIdUsuario(rs.getInt("idusuario"));
				t.setIdProducto(rs.getInt("idproducto"));
				t.setUnidades(rs.getInt("unidades"));
				t.setFecha(rs.getDate("fecha"));
				t.setEstado(rs.getString("estado"));

				pedidos.add(t);
			}
			
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			throw (e);
		} finally {
			Jdbc.close(rs, ps, con);
		}
		
		return pedidos;
	}

	public Pedido newPedido(Pedido pedido) throws Exception {

		PreparedStatement ps = null;
		ResultSet rs = null;
		Connection con = null;
		
		try {
			con = Jdbc.getConnection();
			
		
			ps = con.prepareStatement(Conf.get("SQL_INSERT_PEDIDO"));
		
			ps.setInt(1,pedido.getIdUsuario());
			ps.setInt(2,pedido.getIdProducto());
			ps.setInt(3,pedido.getUnidades());
			ps.setDate(4,pedido.getFecha());
			ps.setString(5,pedido.getEstado());
		
			ps.executeUpdate();

			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			throw (e);
		} finally {
			Jdbc.close(rs, ps, con);
		}
		return pedido;
	}

	public Pedido updatePedido(Pedido pedido) throws Exception {
		PreparedStatement ps = null;
		Connection con = null;
		
		try {
			con = Jdbc.getConnection();
			
			ps = con.prepareStatement(Conf.get("SQL_UPDATE_PEDIDO"));
	
			ps.setInt(1,pedido.getIdUsuario());
			ps.setInt(2,pedido.getIdProducto());
			ps.setInt(3,pedido.getUnidades());
			ps.setDate(4,pedido.getFecha());
			ps.setString(5,pedido.getEstado());
			ps.setInt(6, pedido.getId());
			ps.executeUpdate();

			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			throw (e);
		} finally {
			Jdbc.close(ps, con);
		}
		return pedido;
	}
}
