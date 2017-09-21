package br.com.controledecontas.mvc.contaRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.controledecontas.mvc.entity.ContaFiliaisEntity;


public interface ContaRepository extends JpaRepository<ContaFiliaisEntity, Long>{

}
