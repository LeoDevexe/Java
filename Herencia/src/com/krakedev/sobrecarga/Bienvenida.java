package com.krakedev.sobrecarga;
//SOBRE CARGA los metodos tienen el mismo nombre pero diferentes parametros
public class Bienvenida {
	public void saludar(String nombre) {
		System.out.println("HOLA "+ nombre );
	}
	public void saludar(String nombre, String apellido) {
		System.out.println("HOLA "+ nombre+" "+apellido );
	}
}
