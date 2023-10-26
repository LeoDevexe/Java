package com.krakedev.demo.test;

import com.krakedev.demo.Producto;

public class TestProducto {

	public static void main(String[] args) {
		Producto producto1 = new Producto(1, "Pan");

		producto1.setDescripcion("Pan Blanco Bimbo Mediano 460g");
		producto1.setPeso(460);

		producto1.imprimir();
	}

}
