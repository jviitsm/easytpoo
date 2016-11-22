package com.easyt.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class SituacaoEntity {

	@Id
	@GeneratedValue
	private Long id;
	
	private String situacao;
	
	@ManyToOne
	private Tomada tomada;
	@ManyToOne
	private Cena cena;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSituacao() {
		return situacao;
	}
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	public Tomada getTomada() {
		return tomada;
	}
	public void setTomada(Tomada tomada) {
		this.tomada = tomada;
	}
	public Cena getCena() {
		return cena;
	}
	public void setCena(Cena cena) {
		this.cena = cena;
	}
	
	
	
}
