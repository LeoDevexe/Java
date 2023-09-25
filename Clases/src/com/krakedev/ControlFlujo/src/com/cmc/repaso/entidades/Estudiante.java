package com.cmc.repaso.entidades;

public class Estudiante {
private String nombre ;
public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public double getNota() {
	return nota;
}

public void setNota(double nota) {
	this.nota = nota;
}

public String getResultado() {
	return resultado;
}

public void setResultado(String resultado) {
	this.resultado = resultado;
}
private double nota ;
private String resultado; 


public Estudiante (String nombre) {
	this.nombre= nombre ;
}

public void Calificar (double nota) {
	this.nota= 10 ;
	if (nota < 8) {
	 System.out.println("F");
	}else {
		if (nota>=8) {
			System.out.println("A");
		}
	}
}
public void imprimir(String resultado) {
	
	this.resultado="El estudiante "+nombre+" tiene una callificacion de : "+nota;
}
}
