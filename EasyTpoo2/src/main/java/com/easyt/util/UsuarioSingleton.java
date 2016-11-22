package com.easyt.util;

import com.easyt.model.Usuario;

public class UsuarioSingleton {
	
	private static Usuario usuario;

	public static Usuario getUsuario() {
		if(usuario == null){
			usuario = new Usuario();
		}
		return usuario;
	}

	public static void setUsuario(Usuario usuario) {
		UsuarioSingleton.usuario = usuario;
	}
	

}
