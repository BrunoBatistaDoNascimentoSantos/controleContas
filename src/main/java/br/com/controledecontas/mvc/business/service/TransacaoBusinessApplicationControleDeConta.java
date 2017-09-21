package br.com.controledecontas.mvc.business.service;

import br.com.controledecontas.mvc.model.Conta;
import br.com.controledecontas.mvc.model.TransacaoModel;

public interface TransacaoBusinessApplicationControleDeConta {
	public Double creditarValores(Conta destino, TransacaoModel valor );
	public Double debitarValores(Conta origem, TransacaoModel valor );
	public Double aporteValores(Conta destino, TransacaoModel valor );
	
}
