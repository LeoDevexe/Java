package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Producto;

public class TestProducto {

	public static void main(String[] args) {
		Producto p1 = new Producto("Gatorade", 1);
		Producto p2 = new Producto("V220", 1);
		
		p1.setPrecio(-50);
		p2.calcularPrecioPromo(10);
		
		System.out.println("Producto1 Precio : "+p1.getNombre());
		System.out.println("Producto1 Precio : "+p1.getPrecio());
		System.out.println("********************************");
		System.out.println("Producto1 Precio : "+p2.getNombre());
		System.out.println("Producto2 Precio : " +p2.getPrecio());
		System.out.println("Producto2 Precio con promocion  : "+ p2.calcularPrecioPromo(10));

	}

}
