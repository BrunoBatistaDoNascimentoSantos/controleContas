package br.com.controledecontas.mvc.contaRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.controledecontas.mvc.model.JuridicaModel;

public interface CadastroPessoaJuridicaRepository extends JpaRepository<JuridicaModel, Long>{
	public JuridicaModel findByCnpj(String cnpj);
}
