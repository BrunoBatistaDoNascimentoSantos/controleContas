package br.com.controledecontas.mvc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class JuridicaModel {
	
	@Id 
    @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id", nullable=false, unique=true)
	private Long id;
	
	@Column(name="cnpj", nullable=false, unique=true)
	private String cnpj;
	
	@Column(name="razaoSocial", nullable=false, unique=true)
	private String razaoSocial;	
	
	@Column(name="nomeFantasia", nullable=false)
	private String nomeFantasia;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCNPJ(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	
	
}
