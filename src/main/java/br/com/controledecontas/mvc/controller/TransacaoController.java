package br.com.controledecontas.mvc.controller;

import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/operacao")
public class TransacaoController {
	
	@RequestMapping("/transferencia")
	public String depositarConta(){
		return null;
	}
	@RequestMapping("/aporte")
	public String transferenciaConta(){
		return null;
	}	
}
