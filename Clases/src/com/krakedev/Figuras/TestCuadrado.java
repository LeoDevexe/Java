package com.krakedev.Figuras;

public class TestCuadrado {

	public static void main(String[] args) {
		Cuadrado c1 = new Cuadrado();
		Cuadrado c2 = new Cuadrado();
		Cuadrado c3 = new Cuadrado();

		c1.lado = 4;
		c2.lado = 5;
		c3.lado = 8;

		double perimetro;
		double perimetroc2;
		double perimetroc3;
		double area;
		double areac2;
		double areac3;

		perimetro = c1.calcularPerimetro();
		perimetroc2 = c2.calcularPerimetro();
		perimetroc3 = c3.calcularPerimetro();
		
		 area=  c1.calcularArea(); 
		 areac2=c2.calcularArea(); 
		 areac3=c3.calcularArea();

		System.out.println("Area de c1 : " +area +" Perimetro : "+perimetro);
		System.out.println("Area de c2 : " + areac2+" Perimetro : "+perimetroc2);
		System.out.println("Area de c3 : " + areac3+" Perimetro : "+perimetroc3);

	}

}
