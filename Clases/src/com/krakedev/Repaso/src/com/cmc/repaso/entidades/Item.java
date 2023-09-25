package com.cmc.repaso.entidades;

public class Item {
	private String nombre;
	private int productosActuales;
	private int productosDevueltos;
	private int productosVendidos;
	
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getProductosActuales() {
		return productosActuales;
	}

	public void setProductosActuales(int productosActuales) {
		this.productosActuales = productosActuales;
	}

	public int getProductosDevueltos() {
		return productosDevueltos;
	}

	public void setProductosDevueltos(int productosDevueltos) {
		this.productosDevueltos = productosDevueltos;
	}

	public int getProductosVendidos() {
		return productosVendidos;
	}

	public void setProductosVendidos(int productosVendidos) {
		this.productosVendidos = productosVendidos;
	}

	public void imprimir() {
		System.out.println("Nombre Producto 1 :"+ nombre);
		System.out.println("Productos Actuales : " + productosActuales);
		System.out.println("Productos Devueltos : " + productosDevueltos);
		System.out.println("Productos Vendidos : " + productosVendidos);
	}
	
	public void vender(int cantidadProductosVendidos){
		if(cantidadProductosVendidos > productosActuales) {
			System.out.println("Stock insuficiente");
		}else {
			productosActuales = productosActuales - cantidadProductosVendidos;
			productosVendidos = productosVendidos + cantidadProductosVendidos;	
		}
	}
	
	public void devolver(int cantidadProductosDevueltos){
		if(cantidadProductosDevueltos > productosVendidos) {
			System.out.println("No es posible devolver mas productos de lo que ha comprado");
		}else {
			productosActuales = productosActuales + cantidadProductosDevueltos;
			productosDevueltos = productosDevueltos + cantidadProductosDevueltos;
			productosVendidos = productosVendidos - cantidadProductosDevueltos;
		}
		
	}
}
