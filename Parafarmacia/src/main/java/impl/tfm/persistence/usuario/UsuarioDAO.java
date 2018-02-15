package impl.tfm.persistence.usuario;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;
import com.tfm.model.Usuario;
import com.tfm.persistence.UsuarioDataService;

public class UsuarioDAO implements UsuarioDataService{

	@Override
	public Vector<Usuario> getUsuarios() throws Exception {
		Vector<Usuario> resultado = new Vector<Usuario>();

		PreparedStatement ps = null;
		ResultSet rs = null;
		Connection con = null;
 
		try {
			String SQL_DRV = "org.hsqldb.jdbcDriver";
			String SQL_URL = "jdbc:hsqldb:hsql://localhost/parafarmacia";

			Class.forName(SQL_DRV);
			con = DriverManager.getConnection(SQL_URL, "pbm", "pbm");

			ps = con.prepareStatement("select * from usuario");
			rs = ps.executeQuery();

			while (rs.next()) {
				Usuario usuario = new Usuario();
				usuario.setId(rs.getInt("id"));
				usuario.setNombre(rs.getString("nombre"));
				usuario.setPassword(rs.getString("password"));
				usuario.setEmail(rs.getString("email"));
				usuario.setCodpostal(rs.getString("codpostal"));
				usuario.setDireccion(rs.getString("direccion"));
				usuario.setCiudad(rs.getString("ciudad"));
				usuario.setProvincia(rs.getString("provincia"));
				resultado.add(usuario);
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
	public synchronized Usuario newUsuario(Usuario usuario) throws Exception {
		PreparedStatement ps = null;
		ResultSet rs = null;
		Connection con = null;

		try {
			String SQL_DRV = "org.hsqldb.jdbcDriver";
			String SQL_URL = "jdbc:hsqldb:hsql://localhost/parafarmacia";

			Class.forName(SQL_DRV);
			con = DriverManager.getConnection(SQL_URL, "pbm", "pbm");

			ps = con.prepareStatement("select max(id) as maximo from usuario");
			rs = ps.executeQuery();
			Integer id=0;
			while (rs.next()) {
				 id = rs.getInt("maximo");
			}
			
			usuario.setId(id);
			ps = con.prepareStatement("insert into usuario values (?,?,?,?,?,?,?,?)");
			ps.setInt(1, id+1);
			ps.setString(2,usuario.getNombre());
			ps.setString(3,usuario.getPassword());
			ps.setString(4,usuario.getEmail());
			ps.setString(5,usuario.getCodpostal());
			ps.setString(6,usuario.getDireccion());
			ps.setString(7,usuario.getCiudad());
			ps.setString(8,usuario.getProvincia());
		
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
		return usuario;
	}

	@Override
	public Usuario updateUsuario(Usuario usuario) throws Exception {
		PreparedStatement ps = null;
		Connection con = null;
 
		try {
			String SQL_DRV = "org.hsqldb.jdbcDriver";
			String SQL_URL = "jdbc:hsqldb:hsql://localhost/parafarmacia";

			Class.forName(SQL_DRV);
			con = DriverManager.getConnection(SQL_URL, "pbm", "pbm");

	
			ps = con.prepareStatement("UPDATE usuario set nombre = ?, password = ?,email = ?,codpostal = ?, direccion = ?, ciudad = ?, provincia = ? where id=?");
			ps.setString(1, usuario.getNombre());
			ps.setString(2, usuario.getPassword());
			ps.setString(3, usuario.getEmail());
			ps.setString(4, usuario.getCodpostal());
			ps.setString(5, usuario.getDireccion());
			ps.setString(6, usuario.getCiudad());
			ps.setString(7, usuario.getProvincia());
			ps.setInt(8, usuario.getId());
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
		return usuario;
	}

}
