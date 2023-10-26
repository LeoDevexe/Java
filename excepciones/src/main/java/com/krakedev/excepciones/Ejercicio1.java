package com.krakedev.excepciones;

public class Ejercicio1 {

	public static void main(String[] args) {
		System.out.println("inicio");
		String a ="sadas";
		try {
			a.substring(3);
			System.out.println("fin");
		}catch(Exception e){
		System.out.println("Entra al catch");	
		}finally {
			System.out.println("Ingresa al finally");
		
	
	}
		System.out.println("Fuera del catch");	
	}

}
