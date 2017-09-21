package br.com.controledecontas.mvc.contaRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.controledecontas.mvc.entity.ContaMatrizEntity;

public interface ContaMatrizRepository extends JpaRepository<ContaMatrizEntity, Long>{
	public ContaMatrizEntity findByCpfCnpj(String cpfCnpj);
}
