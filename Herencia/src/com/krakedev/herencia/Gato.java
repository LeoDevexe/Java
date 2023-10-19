package com.krakedev.herencia;

public class Gato extends Animal  {
	@Override
	public void dormir() {
		super.dormir();
		System.out.println("Gatito roncando!!!");
	}
	
	public void maullar() {
		System.out.println("Gato lloron!!!");
	}
	
	public void maullar(String adjetivo) {
		System.out.println("Gato maullando "+adjetivo );
	}
}
