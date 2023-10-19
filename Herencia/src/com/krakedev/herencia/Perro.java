package com.krakedev.herencia;
//CLASE HIJA O SUBCLASE -- PERRO HEREDA DE LA CLASE ANIMAL CON LA PALABRA EXTENDS
public class Perro extends Animal {
	public void ladrar() {
		System.out.println("Perro ladrando");
	}
	@Override
	public void dormir() {
		//llamar al metodo del padre lo ejecuta y luego ejecuta el del hijo
		super.dormir();
		System.out.println("Perro durmiendo");
	}
}
