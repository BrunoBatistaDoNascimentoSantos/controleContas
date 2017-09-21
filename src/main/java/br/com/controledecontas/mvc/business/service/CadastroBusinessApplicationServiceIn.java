package br.com.controledecontas.mvc.business.service;

import br.com.controledecontas.mvc.entity.ContaFiliaisEntity;
import br.com.controledecontas.mvc.entity.ContaMatrizEntity;
import br.com.controledecontas.mvc.model.Conta;

public interface CadastroBusinessApplicationServiceIn {
	public ContaMatrizEntity cadastrarMatriz(Conta conta);
	public ContaMatrizEntity cadastrarContaFilhaMatriz(Conta conta);
	public ContaFiliaisEntity cadastrarFilial(Conta conta);
	public ContaFiliaisEntity cadastrarFilhaFilial(Conta conta);
	
}
