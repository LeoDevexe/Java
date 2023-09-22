package com.krakedev;

public class TestPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p1;
		p1 = new Persona();
		Persona p2 = new Persona("Pablo");
		Persona p3 = new Persona("Rocio",43,1.50);
		
		
		System.out.println("Nombre: "+p1.getNombre());
		System.out.println("Edad: "+p1.getEdad());
		System.out.println("Estatura: "+p1.getEstatura());
		
		p1.setNombre("Juan");
		p1.setEdad(20);
		p1.setEstatura(1.75);
		
		System.out.println("Nombre: "+p1.getNombre());
		System.out.println("Edad: "+p1.getEdad());
		System.out.println("Estatura: "+p1.getEstatura());
		
	}

}
