package com.cmc.directorio.entidades;

public class AdminTelefono {
	public void activarMensajeria(Telefono telefono) {
		if(telefono.getOperadora() == "movi") {
			telefono.setTieneWhatsapp(true);
		}
	}
	
	public int contarMovi(Telefono telf1, Telefono telf2, Telefono telf3) {
		int operadoraMovi= 0;
		if(telf1.getOperadora() == "movi") {
			 operadoraMovi++;
		}
		if(telf2.getOperadora()  == "movi") {
			 operadoraMovi++;
		}
		if (telf3.getOperadora()  == "movi") {
			 operadoraMovi++;
		}
		return operadoraMovi;
	}
	
	public int contarClaro(Telefono telf1, Telefono telf2, Telefono telf3, Telefono telf4) {
		int operadoraClaro=0;
		
		if(telf1.getOperadora() == "claro") {
			operadoraClaro++;
		}
		if(telf2.getOperadora() == "claro") {
			operadoraClaro++;
		}
		if(telf3.getOperadora() == "claro") {
			operadoraClaro++;
		}
		if(telf4.getOperadora() == "claro") {
			operadoraClaro++;
		}
		return operadoraClaro;
		
	}
}
