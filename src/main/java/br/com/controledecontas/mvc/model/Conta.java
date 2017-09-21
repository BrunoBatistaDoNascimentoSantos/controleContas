package br.com.controledecontas.mvc.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Conta {
	
	@Id 
    @GeneratedValue(strategy=GenerationType.AUTO) 
	@Column(name="id", nullable=false, unique=true)
	private Long id;
	
	@Column(name="idJuridicaFisica", nullable=false, unique=true)
	private Long idJuridicaFisica;
	
	@Column(name="idPai", nullable=false, unique=true)
	private Long idPai;
	
	@Column(name="nome", nullable=false)
	private String nome;
	
	@Column(name="dataCriação", nullable=false)
	private String dataCriação;	
	
	@Column(name="statusConta")
	private String statusConta;	
	
	
	private List<Conta> contas;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataCriação() {
		return dataCriação;
	}

	public void setDataCriação(String dataCriação) {
		this.dataCriação = dataCriação;
	}

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

	public Long getIdJuridicaFisica() {
		return idJuridicaFisica;
	}

	public void setIdJuridicaFisica(Long idJuridicaFisica) {
		this.idJuridicaFisica = idJuridicaFisica;
	}

	public Long getIdPai() {
		return idPai;
	}

	public void setIdPai(Long idPai) {
		this.idPai = idPai;
	}

	public String getStatusConta() {
		return statusConta;
	}

	public void setStatusConta(String statusConta) {
		this.statusConta = statusConta;
	}
	
	
}
