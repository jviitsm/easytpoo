package com.easyt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.easyt.model.LoginRepository;
import com.easyt.model.Usuario;
import com.easyt.util.UsuarioSingleton;

@Controller
@RequestMapping(value="/login")
public class LoginController {
	
	@Autowired
	private LoginRepository lr;
	

	@RequestMapping(value = "/login")
	public String login(){
		return "login/login";
	}
	
	@RequestMapping(value="/efetuaLogin")
	public ModelAndView efetuaLogin(String login, String senha){
		List<Usuario> usuario = lr.findByLoginAndSenha(login, senha);
		if(usuario.size()> 0 ){
			Usuario usu = usuario.get(0);
			UsuarioSingleton.setUsuario(usu);
			ModelAndView mv = new ModelAndView("/tomada/cadastro");
			return mv;
		}
		else
		{
			ModelAndView mv = new ModelAndView("/usuario/ok");
			return mv;
		}
		
	}
	
	
}
