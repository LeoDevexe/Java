package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContacto1 {

	public static void main(String[] args) {
		Telefono telef = new Telefono("movi","0953245625", 15);
		
		Contacto c = new Contacto("Leonardo", "Alarcon", telef, 1.60);
		
		System.out.println("-----------Contacto-----------");
		System.out.println("Nombre : " + c.getNombre());
		System.out.println("Apellido : " + c.getApellido());
		System.out.println("Operadora : " + c.getTelefono().getOperadora());
		System.out.println("Numero : " + c.getTelefono().getNumero());
		System.out.println("Peso : " + c.getPeso());
		

	}

}
