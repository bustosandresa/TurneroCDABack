package com.cda.turnero.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TipoUsuario {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer tipoUsuarioId;
	
	//modificador
	private Date fechaAlta;
	private Date fechaBaja;
	private Date fechaModificacion;
	private String detalle;
	
	
	public Integer getTipoUsuarioId() {
		return tipoUsuarioId;
	}
	public void setTipoUsuarioId(Integer tipoUsuarioId) {
		this.tipoUsuarioId = tipoUsuarioId;
	}
	public Date getFechaAlta() {
		return fechaAlta;
	}
	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}
	public Date getFechaBaja() {
		return fechaBaja;
	}
	public void setFechaBaja(Date fechaBaja) {
		this.fechaBaja = fechaBaja;
	}
	public Date getFechaModificacion() {
		return fechaModificacion;
	}
	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}
	public String getDetalle() {
		return detalle;
	}
	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}


}