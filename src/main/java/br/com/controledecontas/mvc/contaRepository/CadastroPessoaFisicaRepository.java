package br.com.controledecontas.mvc.contaRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.controledecontas.mvc.model.FisicaModel;

public interface CadastroPessoaFisicaRepository extends JpaRepository<FisicaModel, Long>{
	public FisicaModel findByCpf(String cpf);
}
