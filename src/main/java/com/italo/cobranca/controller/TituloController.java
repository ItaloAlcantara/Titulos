package com.italo.cobranca.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.italo.cobranca.model.TipoStatus;
import com.italo.cobranca.model.Titulo;
import com.italo.cobranca.repository.TituloRepository;

@Controller
@RequestMapping("/titulos")
public class TituloController {
	
	@Autowired
	private TituloRepository tituloRepository;
	
	
	
	@RequestMapping("/novo")	
	public ModelAndView index() {
		
		ModelAndView modelAndView = new ModelAndView("CadastroTitulo");
		modelAndView.addObject(new Titulo());
		return modelAndView;
	}
	
	@RequestMapping
	public ModelAndView pesquisar() {
		ModelAndView modelAndView = new ModelAndView("PesquisaTitulos");
		List<Titulo> titulos = (List<Titulo>) tituloRepository.findAll();
		modelAndView.addObject("titulos",titulos);
		return modelAndView;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String salvar(@Validated Titulo titulo, Errors errors, RedirectAttributes redirectAttributes) {
		if(errors.hasErrors()) {
			return "CadastroTitulo";
		}
		tituloRepository.save(titulo);
		redirectAttributes.addFlashAttribute("mensagem","Salvo com sucesso!");
			
		return "redirect:/titulos/novo";
	}
	
	@ModelAttribute("StatusTituloObj")
	public List<TipoStatus> listaStatusTitulo(){
		return Arrays.asList(TipoStatus.values());
	}
}
