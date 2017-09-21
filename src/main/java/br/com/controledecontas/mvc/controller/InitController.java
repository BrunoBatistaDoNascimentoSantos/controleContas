package br.com.controledecontas.mvc.controller;

import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/controledecontas")
public class InitController {
	
	@RequestMapping("")
	public String init(){		
		return "index";
	}

}
