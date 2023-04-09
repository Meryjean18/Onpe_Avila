package com.web.onpe.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Partido {
	@Id
	int idPartido;		
	String RazonSocial, CandidatoPresidencial;
	
	public int getIdPartido() {
		return idPartido;
	}
	public void setIdPartido(int idPartido) {
		this.idPartido = idPartido;
	}
	public String getRazonSocial() {
		return RazonSocial;
	}
	public void setRazonSocial(String razonSocial) {
		RazonSocial = razonSocial;
	}
	public String getCandidatoPresidencial() {
		return CandidatoPresidencial;
	}
	public void setCandidatoPresidencial(String candidatoPresidencial) {
		CandidatoPresidencial = candidatoPresidencial;
	}
	
	

}
