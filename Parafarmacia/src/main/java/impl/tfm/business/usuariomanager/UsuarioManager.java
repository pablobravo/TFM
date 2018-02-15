package impl.tfm.business.usuariomanager;

import java.util.Vector;

import org.springframework.beans.factory.annotation.Autowired;

import com.tfm.business.UsuarioManagerService;
import com.tfm.model.Usuario;
import com.tfm.persistence.UsuarioDataService;

public class UsuarioManager implements UsuarioManagerService{
	
	@Autowired
	private UsuarioDataService usuarioDataService;
	
	public void setUsuarioDataService(UsuarioDataService usuarioDataService) {
		this.usuarioDataService = usuarioDataService;
	}

	@Override
	public Vector<Usuario> getUsuarios() throws Exception {
		return usuarioDataService.getUsuarios();
	}

	@Override
	public Usuario updateUsuario(Usuario usuario) throws Exception {
		return usuarioDataService.updateUsuario(usuario);
	}

	@Override
	public Usuario newUsuario(Usuario usuario) throws Exception {
		return usuarioDataService.newUsuario(usuario);
	}

}
