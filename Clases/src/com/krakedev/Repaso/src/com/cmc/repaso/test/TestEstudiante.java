package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Estudiante;

public class TestEstudiante {

	public static void main(String[] args) {
		Estudiante estudiante1 = new Estudiante("Jhon");
		Estudiante estudiante2 = new Estudiante("Jairo");
		
		estudiante1.setNota(9);
		estudiante2.setNota(4);
		
		estudiante1.calificar(estudiante1.getNota());
		estudiante2.calificar(estudiante2.getNota());
		
		System.out.println("Nombre Estudiante 1 : "+ estudiante1.getNombre());
		System.out.println("Nombre Estudiante 1 : "+ estudiante1.getNota());
		System.out.println("Nombre Estudiante 1 : "+ estudiante1.getResultado());
		
		System.out.println("Nombre Estudiante 2 : "+ estudiante2.getNombre());
		System.out.println("Nombre Estudiante 2 : "+ estudiante2.getNota());
		System.out.println("Nombre Estudiante 2 : "+ estudiante2.getResultado());
		
	}

}
