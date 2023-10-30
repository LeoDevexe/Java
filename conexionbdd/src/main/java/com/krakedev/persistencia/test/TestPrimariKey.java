package com.krakedev.persistencia.test;

import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AdminPersonas;

public class TestPrimariKey {

	public static void main(String[] args) {
		Persona producto1 =new Persona();
		try {
			producto1 = AdminPersonas.buscarPorCodigo(782134);
			if (producto1 != null) {
				System.out.println(producto1);
			}else {
				System.out.println("No existe");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}


	}

}
