package br.com.controledecontas.mvc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TransacaoModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id", nullable=false, unique=true)
	private Long id;
	
	@Column(name="valorEmConta", nullable=false)
	private Double valorEmConta;
	
	@Column(name="aporte", nullable=false)
	private Double aporte;
	
	@Column(name="transferencia", nullable=false)
	private Double transferencia;
	
	@Column(name="idContaOrigem", nullable=false, unique=true)
	private Long idContaOrigem;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getValorEmConta() {
		return valorEmConta;
	}

	public void setValorEmConta(Double valorEmConta) {
		this.valorEmConta = valorEmConta;
	}

	public Double getAporte() {
		return aporte;
	}

	public void setAporte(Double aporte) {
		this.aporte = aporte;
	}

	public Double getTransferencia() {
		return transferencia;
	}

	public void setTransferencia(Double transferencia) {
		this.transferencia = transferencia;
	}

	public Long getIdContaOrigem() {
		return idContaOrigem;
	}

	public void setIdContaOrigem(Long idContaOrigem) {
		this.idContaOrigem = idContaOrigem;
	}	

}
