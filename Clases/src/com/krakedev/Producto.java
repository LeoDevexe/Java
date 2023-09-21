package com.krakedev;

public class Producto {

	private String nombre;
	private String descripcion;
	private float precio;
	private int stockActual;

	// Getter para el campo 'nombre'
	public String getNombre() {
		return nombre;
	}

	// Setter para el campo 'nombre'
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	// Getter para el campo 'descripcion'
	public String getDescripcion() {
		return descripcion;
	}

	// Setter para el campo 'descripcion'
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	// Getter para el campo 'precio'
	public float getPrecio() {
		return precio;
	}

	// Setter para el campo 'precio'
	public void setPrecio(float precio) {
		this.precio = precio;
	}

	// Getter para el campo 'stockActual'
	public int getStockActual() {
		return stockActual;
	}

	// Setter para el campo 'stockActual'
	public void setStockActual(int stockActual) {
		this.stockActual = stockActual;
	}
}
