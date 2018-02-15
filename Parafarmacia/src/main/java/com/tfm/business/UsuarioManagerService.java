package com.tfm.business;

import java.util.Vector;

import com.tfm.model.Usuario;

public interface UsuarioManagerService {
	public Vector<Usuario> getUsuarios() throws Exception;
	
	public Usuario newUsuario(Usuario usuario) throws Exception;
	
	public Usuario updateUsuario(Usuario usuario) throws Exception;

}
