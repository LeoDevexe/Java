package com.krakedev;

public class TestCalculadora {

	public static void main(String[] args) {
		Calculadora calc;
		int resultadoSuma;
		double resultadoResta;
		double resultadoMultiplicacion;
		double resultadoDivision;
		double resultadoPromediar;
		
		
		

		calc = new Calculadora();
		;
		resultadoSuma = calc.sumar(8, 7);
		resultadoResta = calc.restar(8, 7);
		resultadoMultiplicacion= (int)calc.multiplicar(10,5);
		resultadoDivision=calc.dividir(10,2);
		resultadoPromediar=calc.promediar(10, 8, 9);
		
		
		System.out.println("Resultado suma: " + resultadoSuma);
		System.out.println("Resultado  resta : " + resultadoResta);
		System.out.println("Resultado multiplicacion: "+resultadoMultiplicacion);
		System.out.println("Resultado division: "+resultadoDivision);
		System.out.println("Resultado promedio: "+resultadoPromediar);
		calc.mostrarResultado();
		

	}

}
