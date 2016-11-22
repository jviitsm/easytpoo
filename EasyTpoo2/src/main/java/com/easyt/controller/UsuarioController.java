package com.easyt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.easyt.model.Usuario;
import com.easyt.model.UsuarioRepository;

@Controller
public class UsuarioController {

	
	@Autowired
	private UsuarioRepository ur;
	
	
	@RequestMapping(value= "/usuario/cadastro")
	public String formUsuarioCadastro(){
		return "usuario/cadastro";	
	}
	
	@RequestMapping(value="/usuario/adicionaUsuario")
	public String adicionaUsuario(Usuario usu){
		ur.save(usu);
		return "/usuario/usuarioCadastrado";

				
	}
	@RequestMapping(value= "usuario/ok")
	public String ok(){
		return "/usuario/ok";
	}
	
	
	
	
	
	
	
}
