package impl.tfm.business.usuariomanager;

import java.util.Vector;

import org.springframework.beans.factory.annotation.Autowired;

import com.tfm.business.UsuarioManagerService;
import com.tfm.model.Usuario;

public class UsuarioManagerEJBService implements UsuarioManagerService{

	@Autowired
	private UsuarioManager usuarioManager;
	
	public void setUsuarioManager(UsuarioManager usuarioManager) {
		this.usuarioManager = usuarioManager;
	}
	
	@Override
	public Vector<Usuario> getUsuarios() throws Exception {
		return usuarioManager.getUsuarios();
	}

	@Override
	public Usuario newUsuario(Usuario usuario) throws Exception {
		return usuarioManager.newUsuario(usuario);
	}

	@Override
	public Usuario updateUsuario(Usuario usuario) throws Exception {
		return usuarioManager.updateUsuario(usuario);
	}

}
