package com.krakedev.persistencia.entidades;

import java.math.BigDecimal;
import java.util.Date;

public class Persona {
	private String cedula ;
	private String nombre;
	private String apellido;
	
	private EstadoCivil estadocivil;
	
	private int numeroHijos;
	private double estatura;
	private BigDecimal cantidadAhorrada;
	private Date fechaNaciemiento;
	private Date horaNaciemiento;
	
	public Persona() {}
	
	public Persona(String cedula, String nombre, String apellido, EstadoCivil estadocivil, int numeroHijos,
			double estatura, BigDecimal cantidadAhorrada, Date fechaNaciemiento, Date horaNaciemiento) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.estadocivil = estadocivil;
		this.numeroHijos = numeroHijos;
		this.estatura = estatura;
		this.cantidadAhorrada = cantidadAhorrada;
		this.fechaNaciemiento = fechaNaciemiento;
		this.horaNaciemiento = horaNaciemiento;
	}
	public Persona(String cedula, String nombre, String apellido, EstadoCivil estadocivil) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.estadocivil = estadocivil;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public EstadoCivil getEstadocivil() {
		return estadocivil;
	}
	public void setEstadocivil(EstadoCivil estadocivil) {
		this.estadocivil = estadocivil;
	}
	public int getNumeroHijos() {
		return numeroHijos;
	}
	public void setNumeroHijos(int numeroHijos) {
		this.numeroHijos = numeroHijos;
	}
	public double getEstatura() {
		return estatura;
	}
	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}
	public BigDecimal getCantidadAhorrada() {
		return cantidadAhorrada;
	}
	public void setCantidadAhorrada(BigDecimal cantidadAhorrada) {
		this.cantidadAhorrada = cantidadAhorrada;
	}
	public Date getFechaNaciemiento() {
		return fechaNaciemiento;
	}
	public void setFechaNaciemiento(Date fechaNaciemiento) {
		this.fechaNaciemiento = fechaNaciemiento;
	}
	public Date getHoraNaciemiento() {
		return horaNaciemiento;
	}
	public void setHoraNaciemiento(Date horaNaciemiento) {
		this.horaNaciemiento = horaNaciemiento;
	}

	@Override
	public String toString() {
		return "Persona [cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", estadocivil="
				+ estadocivil + ", numeroHijos=" + numeroHijos + ", estatura=" + estatura + ", cantidadAhorrada="
				+ cantidadAhorrada + ", fechaNaciemiento=" + fechaNaciemiento + ", horaNaciemiento=" + horaNaciemiento
				+ "]";
	}

	
}
