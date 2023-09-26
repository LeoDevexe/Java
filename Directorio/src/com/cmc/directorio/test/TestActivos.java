package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestActivos {

	public static void main(String[] args) {
		//No tiene whathsapp
		Telefono telf1 = new Telefono("movi", "0956245325", 20);
		
		//Si tiene Whathsaap
		Telefono telf2 = new Telefono("claro","0954445325", 10);
		telf2.setTieneWhatsapp(true);
		
		Contacto c1 = new Contacto("Leonel", "Messi", telf1, 90);
		Contacto c2 = new Contacto("Cristiano", "Ronaldo", telf2, 95);
		
		AdminContactos ac = new AdminContactos();
		ac.activarUsuario(c2);
		
		System.out.println("Tiene Whatsapp : " + telf1.isTieneWhatsapp());
		System.out.println("Tiene Whatsapp : " + telf2.isTieneWhatsapp());
		
		System.out.println("Estado : " + c1.isActivo());
		System.out.println("Estado : " + c2.isActivo());
		
	}

}
