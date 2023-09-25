package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Item;

public class TestItem {

	public static void main(String[] args) {
		Item item1 = new Item();
		Item item2 = new Item();
		
		item1.setNombre("Blusa");
		item1.setProductosActuales(80);
		item1.imprimir();
		System.out.println("*****************");
		item1.vender(50);
		item1.imprimir();
		System.out.println("*****************");
		item1.devolver(30);
		item1.imprimir();
		System.out.println("----------------------------");
		item2.setNombre("Camisa");
		item2.setProductosActuales(100);
		item2.imprimir();
		System.out.println("*****************");
		item2.vender(40);
		item2.imprimir();
		System.out.println("*****************");
		item2.devolver(20);
		item2.imprimir();

	}

}
