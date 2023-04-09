package com.web.onpe.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Departamento {
	@Id 
	int idDepartamento;		
	 String Detalle;
	 
	public int getIdDepartamento() {
		return idDepartamento;
	}
	public void setIdDepartamento(int idDepartamento) {
		this.idDepartamento = idDepartamento;
	}
	public String getDetalle() {
		return Detalle;
	}
	public void setDetalle(String detalle) {
		Detalle = detalle;
	}
	 
	 

}
