package com.tfm.persistence;

import java.util.Vector;

import com.tfm.model.Usuario;

public interface UsuarioDataService {
		public Vector<Usuario> getUsuarios() throws Exception;
		
		public Usuario newUsuario(Usuario usuario) throws Exception;
		
		public Usuario updateUsuario(Usuario usuario) throws Exception;
}
