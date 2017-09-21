package br.com.controledecontas.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.controledecontas.mvc.business.service.CadastroBusinessApplicationServiceIn;
import br.com.controledecontas.mvc.contaRepository.ContaMatrizRepository;
import br.com.controledecontas.mvc.model.Conta;

@RequestMapping("/conta")
public class ContaController {
	
	@Autowired
	private ContaMatrizRepository matriz;
	
	@Autowired
	private CadastroBusinessApplicationServiceIn business;
	
	@RequestMapping("/cadastrarmatriz")
	public String cadastrarContaMatriz(Conta conta){
		
		//validar se existe
		if(matriz.findByCpfCnpj("") != null){
			//mensagem de erro
		}
		else{
			business.cadastrarMatriz(conta);
		}		
		
		
		return null;
	}	
	@RequestMapping("/cadastrarfiliais")
	public String cadastrarFilial(){
		return null;
	}
	@RequestMapping("/cadastrarconta")
	public String cadastrarConta(){
		return null;
	}
	
	@RequestMapping("/pesquisarconta")
	public String PesquisarConta(Model model){
		return null;
	}	
	
	@RequestMapping("/pesquisarmatriz")
	public String PesquisarContaMatriz(Model model){
		return null;
	}	
	@RequestMapping("/pesquisarfiliais")
	public String PesquisarContaFilial(Model model){
		return null;
	}	

}
