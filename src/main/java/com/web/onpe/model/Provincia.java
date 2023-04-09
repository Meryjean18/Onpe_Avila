package com.web.onpe.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Provincia {
	@Id
	int idProvincia, idDistrito ;		
	String Detalle;
	
	public int getIdProvincia() {
		return idProvincia;
	}
	public void setIdProvincia(int idProvincia) {
		this.idProvincia = idProvincia;
	}
	public int getIdDistrito() {
		return idDistrito;
	}
	public void setIdDistrito(int idDistrito) {
		this.idDistrito = idDistrito;
	}
	public String getDetalle() {
		return Detalle;
	}
	public void setDetalle(String detalle) {
		Detalle = detalle;
	}
	
	

}
