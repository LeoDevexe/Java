package com.krakedev;

public class TestCalculadora {

	public static void main(String[] args) {
		Calculadora calc;
		int resultadoSuma;
		double resultadoResta;
		double resultadoMultiplicacion;
		double rsultadoDivision;
		double resultadoPromedio;

		calc = new Calculadora();
		;
		resultadoSuma = calc.sumar(8, 7);
		resultadoResta = calc.restar(8, 7);
		resultadoMultiplicacion= calc.multiplicar(3.50,2.50);
		
		System.out.println("Resultado : " + resultadoSuma);
		System.out.println("Resultado : " + resultadoResta);
		System.out.println("Resultado : "+resultadoMultiplicacion);

	}

}
