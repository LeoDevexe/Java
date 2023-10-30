package com.krakedev.persistencia.test;

import java.util.ArrayList;

import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AdminPersonas;

public class TestInformacionVarios {

	public static void main(String[] args) {
		try {
			ArrayList<Persona> transacciones = AdminPersonas.buscarTransaccion("D");
			System.out.println(transacciones);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
