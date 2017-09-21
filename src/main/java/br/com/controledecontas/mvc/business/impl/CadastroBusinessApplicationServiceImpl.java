package br.com.controledecontas.mvc.business.impl;

import java.util.ArrayList;
import java.util.List;

import br.com.controledecontas.mvc.business.service.CadastroBusinessApplicationServiceIn;
import br.com.controledecontas.mvc.entity.ContaFiliaisEntity;
import br.com.controledecontas.mvc.entity.ContaMatrizEntity;
import br.com.controledecontas.mvc.model.Conta;

public class CadastroBusinessApplicationServiceImpl implements CadastroBusinessApplicationServiceIn{

	@Override
	public ContaMatrizEntity cadastrarMatriz(Conta conta) {
		
		
		ContaMatrizEntity contaMatriz = new ContaMatrizEntity();
		contaMatriz.setNome(nome);
			
		
		return null;
	}

	@Override
	public ContaMatrizEntity cadastrarContaFilhaMatriz(Conta conta) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ContaFiliaisEntity cadastrarFilial(Conta conta) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ContaFiliaisEntity cadastrarFilhaFilial(Conta conta) {
		// TODO Auto-generated method stub
		return null;
	}

}
