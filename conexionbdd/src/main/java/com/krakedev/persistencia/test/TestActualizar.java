package com.krakedev.persistencia.test;

import java.math.BigDecimal;
import java.util.Date;

import com.krakedev.persistencia.entidades.EstadoCivil;
import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AdminPersonas;
import com.krakedev.persistencia.utils.Convertidor;

public class TestActualizar {

	public static void main(String[] args) {
		EstadoCivil ec = new EstadoCivil("U","Union Libre");
		Persona p = new Persona ("1724879837","Andres","Morante",ec);
		Persona p1 = new Persona ("1724234576");
		try {
			Date fechaNac=Convertidor.convertirFecha("2022/12/23");
			Date horaNac=Convertidor.convertirHora("08:23:05");
			
			p.setFechaNacimiento(fechaNac);
			p.setHoraNacimiento(horaNac);
			p.setCantidadAhorrada(new BigDecimal(1230.45));
			p.setNumeroHijos(50);
			AdminPersonas.actualizar(p);
			AdminPersonas.eliminar(p1);
		} catch (Exception e) {
			System.out.println("error en el sistema: "+e.getMessage());
		}
		Persona prod1 = new Persona (321342,"Galleta","Amor de vainilla");
		Persona prod2 = new Persona (894213);
		try {
			prod1.setPrecio(new BigDecimal(234.45));
			prod1.setStock(50);
			AdminPersonas.actualizarProducto(prod1);
			AdminPersonas.eliminarProducto(prod2);
		} catch (Exception e) {
			System.out.println("error en el sistema: "+e.getMessage());
		}
		Persona trans1 = new Persona (12,"222056");
		Persona trans2 = new Persona (16);
		try {
			trans1.setMonto(new BigDecimal(4353.45));
			trans1.setTipo("C");
			Date fechaNac=Convertidor.convertirFecha("2022/12/23");
			Date horaNac=Convertidor.convertirHora("08:23:05");
			
			trans1.setFecha(fechaNac);
			trans1.setHora(horaNac);
			
			AdminPersonas.actualizarTransacciones(trans1);
			AdminPersonas.eliminarTransaccion(trans2);
		} catch (Exception e) {
			System.out.println("error en el sistema: "+e.getMessage());
		}
	}

}
