package br.com.controledecontas.mvc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FisicaModel {
	
	@Id 
    @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id", nullable=false, unique=true)
	private Long id;
	
	@Column(name="cpf", nullable=false, unique=true)
	private String cpf;
	
	@Column(name="nomeCompleto", nullable=false)
	private String nomeCompleto;
	
	@Column(name="dataNascimento", nullable=false)
	private String dataNascimento;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
}
