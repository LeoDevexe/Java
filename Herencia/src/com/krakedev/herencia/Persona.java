package com.krakedev.herencia;

public class Persona {
	private String cedula;
	private String nombre;
	//Constructor
	public Persona(String cedula, String nombre) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
	}
	//getters y setters
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
	//SOBRE ESCRIBIR EL METODO
	/*public String toString() {
		return "Nombre: "+nombre+" Cedula: "+cedula;
	}*/
	@Override
	public String toString() {
		return "Persona [cedula=" + cedula + ", nombre=" + nombre + "]";
	}
	
	
}
