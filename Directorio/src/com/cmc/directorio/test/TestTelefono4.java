package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono4 {

	public static void main(String[] args) {
		int numeroClaro;
		Telefono telf1 = new Telefono("claro",  "0956231235", 50);
		Telefono telf2 = new Telefono("movi",  "0956447895", 20);
		Telefono telf3 = new Telefono("claro",  "0955663321", 10);
		Telefono telf4 = new Telefono("claro",  "0955663355", 15);
		
		AdminTelefono at = new AdminTelefono();
		
		numeroClaro = at.contarClaro(telf1, telf2, telf3, telf4);
		
		System.out.println("Cantidad de Claro : "+ numeroClaro);
		
	}

}
