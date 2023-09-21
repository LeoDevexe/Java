package com.krakedev.Figuras;

public class TestRectangulo {

	public static void main(String[] args) {
		Rectangulo r1 = new Rectangulo();
		
		r1.base1 = 4;
		r1.base2 = r1.base1;	
		r1.altura1 = 2;
		r1.altura2=r1.altura1;

		double areaR1;
		
		

		
		areaR1 = r1.calcularPerimetro();
	
		System.out.println("Area de r1 : " + areaR1);


	}

}
