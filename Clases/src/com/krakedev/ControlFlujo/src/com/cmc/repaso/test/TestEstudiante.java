package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Estudiante;

public class TestEstudiante {

	public static void main(String[] args) {
		Estudiante calificar = new Estudiante("Leonardo");
		calificar.Calificar(10);
		
		calificar.imprimir("El estudiante"+calificar.getNombre()+"Tiene una calificación de :"+calificar.getNota());
	}

}
