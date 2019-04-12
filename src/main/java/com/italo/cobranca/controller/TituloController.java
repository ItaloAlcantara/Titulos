package com.italo.cobranca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.italo.cobranca.model.Titulo;
import com.italo.cobranca.repository.TituloRepository;

@Controller
@RequestMapping("/titulos")
public class TituloController {
	
	@Autowired
	private TituloRepository tituloRepository;
	
	
	
	@RequestMapping("/novo")	
	public String index() {
		return "CadastroTitulo";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView salvar(Titulo titulo) {
		tituloRepository.save(titulo);
		
		ModelAndView modelAndView = new ModelAndView("CadastroTitulo");
		modelAndView.addObject("mensagem","Salvo com sucesso!");
		return modelAndView;
	}
}
