package br.com.controledecontas.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.controledecontas.mvc.contaRepository.CadastroPessoaFisicaRepository;
import br.com.controledecontas.mvc.contaRepository.CadastroPessoaJuridicaRepository;
import br.com.controledecontas.mvc.model.FisicaModel;
import br.com.controledecontas.mvc.model.JuridicaModel;

@RequestMapping("/cadastrar")
public class CadastroPessoasController {
	
	@Autowired
	private CadastroPessoaFisicaRepository pessoaFisica;
	
	@Autowired CadastroPessoaJuridicaRepository pessoaJuridica;
	
	@RequestMapping("/cadastropfoupj")
	public String CadastroPessoaFisicaJuridica(Model model, FisicaModel fisica, JuridicaModel juridica){
		
		if(fisica != null){
			if(pessoaFisica.findByCpf(fisica.getCpf()) != null){
				//mensagem de error: já existe pessoa cadastrada
				return "index";
			}
			else{
				pessoaFisica.save(fisica);
			}
						
		}
		if(juridica != null){
			if(pessoaJuridica.findByCnpj(juridica.getCnpj()) != null){
				//mensagem de error: já existe pessoa cadastrada
				return "index";
			}
			else{
				pessoaJuridica.save(juridica);
			}
		}
		
		return "teladesucesso";
	}

}
