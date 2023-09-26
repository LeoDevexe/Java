package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono3 {

	public static void main(String[] args) {
		int numeroMovi;
		Telefono telf1 = new Telefono("movi",  "0956231235", 50);
		Telefono telf2 = new Telefono("movi",  "0956447895", 20);
		Telefono telf3 = new Telefono("claro",  "0955663321", 10);
		
		AdminTelefono at = new AdminTelefono();
		
		numeroMovi = at.contarMovi(telf1, telf2, telf3);
		
		System.out.println("Cantidad de Movi : "+ numeroMovi);
		

	}

}
