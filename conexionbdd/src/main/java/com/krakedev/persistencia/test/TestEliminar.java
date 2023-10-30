package com.krakedev.persistencia.test;

import com.krakedev.persistencia.servicios.AdminUsuario;

public class TestEliminar {

	public static void main(String[] args) {
		try {
			String cedulaAEliminar = "1716231379";

			AdminUsuario.eliminar(cedulaAEliminar);;
		} catch (Exception e) {
			System.out.println("Error en el sistema: " + e.getMessage());
		}
	}

}
