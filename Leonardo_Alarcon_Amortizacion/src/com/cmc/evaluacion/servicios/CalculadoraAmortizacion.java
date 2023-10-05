package com.cmc.evaluacion.servicios;

import java.util.ArrayList;

import com.cmc.evaluacion.entidades.Cuota;
import com.cmc.evaluacion.entidades.Prestamo;

public class CalculadoraAmortizacion {

	public static double calcularCuota(Prestamo préstamo) {
		double monto = préstamo.getMonto();
		double interesAnual = préstamo.getInteres() / 100;
		int plazo = préstamo.getPlazo();

		double interesMensual = interesAnual / 12;
		double cuota = (monto * interesMensual) / (1 - Math.pow(1 + interesMensual, -plazo));
		return cuota;
	}

	public static void generarTabla(Prestamo préstamo) {
		double cuota = calcularCuota(préstamo);
		ArrayList<Cuota> cuotas = préstamo.getCuotas();

		for (int i = 0; i < préstamo.getPlazo(); i++) {
			Cuota cuotaInfo = new Cuota(i + 1, cuota, 0, 0, 0, 0, 0);
			cuotas.add(cuotaInfo);
		}

		for (int i = 0; i < préstamo.getPlazo(); i++) {
			double inicio = (i == 0) ? préstamo.getMonto() : cuotas.get(i - 1).getSaldo();
			double interes = inicio * (préstamo.getInteres() / 100 / 12);
			double abonoCapital = cuota - interes;
			double saldo = inicio - abonoCapital;
			cuotas.get(i).setCapital(inicio);
			cuotas.get(i).setInicio(inicio);
			cuotas.get(i).setInteres(interes);
			cuotas.get(i).setAbonoCapital(abonoCapital);
			cuotas.get(i).setSaldo(saldo);
		}

		
		Cuota ultimaCuota = cuotas.get(préstamo.getPlazo() - 1);
		if (ultimaCuota.getSaldo() != 0) {
			double ajuste = ultimaCuota.getSaldo();
			ultimaCuota.setCuota(ultimaCuota.getCuota() + ajuste);
			ultimaCuota.setAbonoCapital(ultimaCuota.getAbonoCapital() + ajuste);
			ultimaCuota.setSaldo(0);
		}

		
	}

	public static void mostrarTabla(Prestamo préstamo) {
		ArrayList<Cuota> cuotas = préstamo.getCuotas();

		System.out.println("Número | Cuota | Inicio    | Interés | Abono | Saldo");
		for (Cuota cuota : cuotas) {
			System.out.println(cuota);
		}
	}
}
