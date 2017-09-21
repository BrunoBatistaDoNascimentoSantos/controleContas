package br.com.controledecontas.mvc.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.boot.orm.jpa.EntityScan;

import br.com.controledecontas.mvc.model.Conta;

@Entity
@EntityScan(basePackages = {"br.com.controledecontas.mvc.model" })
public class ContaMatrizEntity extends Conta{
	
	@Id 
    @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id", nullable=false, unique=true)
	private Long id;
		
	private List<Conta> contas;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

	
	
	
	
}
