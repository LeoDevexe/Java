package com.krakedev.demo;

//Constructor

//Getters and Setters 
public class Producto {

	public Producto(int codigo, String nombre) {
		this.codigo = codigo;
		this.nombre = nombre;

	}

	public void imprimir() {
		System.out.println("Codigo del producto: " + getCodigo());
		System.out.println("Nombre del producto: " + getNombre());
		System.out.println("Descripcion del producto: " + getDescripcion());
		System.out.println("Peso del producto : " + getPeso());
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	private int codigo;
	private String nombre;
	private String descripcion;
	private double peso;

}
