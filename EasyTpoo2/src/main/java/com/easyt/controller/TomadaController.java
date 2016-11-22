package com.easyt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.easyt.model.Tomada;
import com.easyt.model.TomadaRepository;
import com.easyt.model.Usuario;
import com.easyt.util.UsuarioSingleton;

@Controller

public class TomadaController {

	@Autowired
	private TomadaRepository tr;
	
	
	
	@RequestMapping(value= "/tomada/cadastro")
	public String cadastroTomada(){
		return "tomada/cadastro";	
	}
	@RequestMapping(value="/login/adicionaTomada")
	public String adicionaTomada(Tomada tom){
		
		Usuario usuario = UsuarioSingleton.getUsuario() ;
		tom.setUsuario(usuario);
		tr.save(tom);
		return cadastroTomada();
	}
}
