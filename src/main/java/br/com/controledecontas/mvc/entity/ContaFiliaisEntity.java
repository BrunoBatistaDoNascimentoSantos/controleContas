package br.com.controledecontas.mvc.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.boot.orm.jpa.EntityScan;

@Entity
@EntityScan(basePackages = {"br.com.controledecontas.mvc.model" })
public class ContaFiliaisEntity extends ContaMatrizEntity{
	
	@Id 
    @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id", nullable=false, unique=true)
	private Long id;
	
	@Column(name="idPai", nullable=false, unique=true)
	private Long idPai;
	
	private List<ContaFiliaisEntity> contasFilias;
		
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<ContaFiliaisEntity> getContasFilias() {
		return contasFilias;
	}

	public void setContasFilias(List<ContaFiliaisEntity> contasFilias) {
		this.contasFilias = contasFilias;
	}

	public Long getIdPai() {
		return idPai;
	}

	public void setIdPai(Long idPai) {
		this.idPai = idPai;
	}

	
}
