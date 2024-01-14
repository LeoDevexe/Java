package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContactos1 {

	public static void main(String[] args) {
		Contacto masPesado;
		boolean compararOperadora;
		Telefono telf1 = new Telefono("claro", "0956321236", 15);
		Telefono telf2 = new Telefono("claro","0956321556", 20);
		
		Contacto c1 = new Contacto("Leonardo", "Alarcon", telf1, 100);
		Contacto c2 = new Contacto("Javier", "Burrai", telf2, 90);
		
		AdminContactos ac = new AdminContactos();
		
		masPesado = ac.buscarMasPesado(c1, c2);
		
		if(masPesado == c1) {
			System.out.println("Nombre : " + c1.getNombre());
			System.out.println("Apellido : " + c1.getApellido());
			System.out.println("Operadora : " + c1.getTelefono().getOperadora());
			System.out.println("Numero : " + c1.getTelefono().getNumero());
			System.out.println("Peso  : " + c1.getPeso());
		}else {
			System.out.println("Nombre : " + c2.getNombre());
			System.out.println("Apellido : " + c2.getApellido());
			System.out.println("Operadora : " + c2.getTelefono().getOperadora());
			System.out.println("Numero : " + c2.getTelefono().getNumero());
			System.out.println("Peso  : " + c2.getPeso());
		}
		
		
		compararOperadora = ac.compararOperadora(c1, c2);
		
		System.out.println("Comparar Operadora : " + compararOperadora);

	}

}
