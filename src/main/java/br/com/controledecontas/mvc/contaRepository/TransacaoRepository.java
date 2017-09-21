package br.com.controledecontas.mvc.contaRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.controledecontas.mvc.model.TransacaoModel;

public interface TransacaoRepository extends JpaRepository<TransacaoModel, Long>{

}
