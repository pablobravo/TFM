package impl.tfm.persistence.pedido;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

import com.tfm.model.Pedido;
import com.tfm.persistence.PedidoDataService;

public class PedidoDAO implements PedidoDataService{

	@Override
	public Vector<Pedido> getPedidos() throws Exception {
		Vector<Pedido> resultado = new Vector<Pedido>();

		PreparedStatement ps = null;
		ResultSet rs = null;
		Connection con = null;
 
		try {
			String SQL_DRV = "org.hsqldb.jdbcDriver";
			String SQL_URL = "jdbc:hsqldb:hsql://localhost/parafarmacia";

			Class.forName(SQL_DRV);
			con = DriverManager.getConnection(SQL_URL, "pbm", "pbm");

			ps = con.prepareStatement("select * from pedido");
			rs = ps.executeQuery();

			while (rs.next()) {
				Pedido pedido = new Pedido();
				pedido.setId(rs.getInt("id"));
				pedido.setIdUsuario(rs.getInt("idusuario"));
				pedido.setIdProducto(rs.getInt("idproducto"));
				pedido.setUnidades(rs.getInt("unidades"));
				pedido.setFecha(rs.getDate("fecha"));
				pedido.setEstado(rs.getString("estado"));
				resultado.add(pedido);
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

	@SuppressWarnings("resource")
	@Override
	public Pedido newPedido(Pedido pedido) throws Exception {
		PreparedStatement ps = null;
		ResultSet rs = null;
		Connection con = null;

		try {
			String SQL_DRV = "org.hsqldb.jdbcDriver";
			String SQL_URL = "jdbc:hsqldb:hsql://localhost/parafarmacia";

			Class.forName(SQL_DRV);
			con = DriverManager.getConnection(SQL_URL, "pbm", "pbm");

			ps = con.prepareStatement("select max(id) as maximo from pedido");
			rs = ps.executeQuery();
			Integer id=0;
			while (rs.next()) {
				 id = rs.getInt("maximo");
			}
			
			pedido.setId(id);
			ps = con.prepareStatement("insert into pedido values (?,?,?,?,?,?)");
			ps.setInt(1, id+1);
			ps.setInt(2,pedido.getIdUsuario());
			ps.setInt(3,pedido.getIdProducto());
			ps.setInt(4,pedido.getUnidades());
			ps.setDate(5,pedido.getFecha());
			ps.setString(6,pedido.getEstado());
		
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
		return pedido;
	}

	@Override
	public Pedido updatePedido(Pedido pedido) throws Exception {
		PreparedStatement ps = null;
		Connection con = null;
 
		try {
			String SQL_DRV = "org.hsqldb.jdbcDriver";
			String SQL_URL = "jdbc:hsqldb:hsql://localhost/parafarmacia";

			Class.forName(SQL_DRV);
			con = DriverManager.getConnection(SQL_URL, "pbm", "pbm");

	
			ps = con.prepareStatement("UPDATE pedido set estado = ? where id=?");
			ps.setString(1, pedido.getEstado());
			ps.setInt(2, pedido.getId());
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
		return pedido;
	}

}
