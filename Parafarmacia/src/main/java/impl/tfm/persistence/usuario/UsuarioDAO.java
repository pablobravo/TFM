package impl.tfm.persistence.usuario;

import impl.tfm.persistence.conf.Conf;
import impl.tfm.persistence.conf.util.Jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

import com.tfm.model.Usuario;
import com.tfm.persistence.UsuarioDataService;

public class UsuarioDAO implements UsuarioDataService{
	@Override
	public Vector<Usuario> getUsuarios() throws Exception {
		Vector<Usuario> usuarios = new Vector<Usuario>();

		PreparedStatement ps = null;
		ResultSet rs = null;
		Connection con = null;
		
		try {
			con = Jdbc.getConnection();
			
			ps = con.prepareStatement(Conf.get("SQL_USUARIOS"));
			rs = ps.executeQuery();

			while (rs.next()){
				Usuario t = new Usuario();
				t.setId(rs.getInt("id"));
				t.setNombre(rs.getString("nombre"));
				t.setPassword(rs.getString("password"));
				t.setEmail(rs.getString("email"));
				t.setCodpostal(rs.getString("codpostal"));
				t.setCiudad(rs.getString("ciudad"));
				t.setDireccion(rs.getString("direccion"));
				t.setProvincia(rs.getString("provincia"));

				usuarios.add(t);
			}
			
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			throw (e);
		} finally {
			Jdbc.close(rs, ps, con);
		}
		
		return usuarios;
	}

	@Override
	public synchronized Usuario newUsuario(Usuario usuario) throws Exception {
		PreparedStatement ps = null;
		ResultSet rs = null;
		Connection con = null;
		
		try {
			con = Jdbc.getConnection();
		
			ps = con.prepareStatement(Conf.get("SQL_INSERT_USUARIO"));
			ps.setString(1,usuario.getNombre());
			ps.setString(2,usuario.getPassword());
			ps.setString(3,usuario.getEmail());
			ps.setString(4,usuario.getCodpostal());
			ps.setString(5,usuario.getDireccion());
			ps.setString(6,usuario.getCiudad());
			ps.setString(7,usuario.getProvincia());
		
			ps.executeUpdate();

			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			throw (e);
		} finally {
			Jdbc.close(rs, ps, con);
		}
		return usuario;
	}

	@Override
	public Usuario updateUsuario(Usuario usuario) throws Exception {
		PreparedStatement ps = null;
		Connection con = null;
		
		try {
			con = Jdbc.getConnection();
			
			ps = con.prepareStatement(Conf.get("SQL_UPDATE_USUARIO"));
	
			
			ps.setString(1,usuario.getNombre());
			ps.setString(2,usuario.getPassword());
			ps.setString(3,usuario.getEmail());
			ps.setString(4,usuario.getCodpostal());
			ps.setString(5,usuario.getDireccion());
			ps.setString(6,usuario.getCiudad());
			ps.setString(7,usuario.getProvincia());
			ps.setInt(8, usuario.getId());
			ps.executeUpdate();

			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			throw (e);
		} finally {
			Jdbc.close(ps, con);
		}
		return usuario;
	}
}