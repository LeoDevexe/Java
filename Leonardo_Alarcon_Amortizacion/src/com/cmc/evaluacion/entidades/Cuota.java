package com.cmc.evaluacion.entidades;

import com.cmc.evaluacion.servicios.Utilitario;

public class Cuota {
    public double getCuota() {
		return cuota;
	}

	public void setCuota(double cuota) {
		this.cuota = cuota;
	}

	public double getCapital() {
		return capital;
	}

	public void setCapital(double capital) {
		this.capital = capital;
	}

	public double getInicio() {
		return inicio;
	}

	public void setInicio(double inicio) {
		this.inicio = inicio;
	}

	public double getInteres() {
		return interes;
	}

	public void setInteres(double interes) {
		this.interes = interes;
	}

	public double getAbonoCapital() {
		return abonoCapital;
	}

	public void setAbonoCapital(double abonoCapital) {
		this.abonoCapital = abonoCapital;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}


	private int numero;
    private double cuota;
    private double capital;
    private double inicio;
    private double interes;
    private double abonoCapital;
    private double saldo;

    public Cuota(int numero, double cuota, double capital, double inicio, double interes, double abonoCapital, double saldo) {
        this.numero = numero;
        this.cuota = cuota;
        this.capital = capital;
        this.inicio = inicio;
        this.interes = interes;
        this.abonoCapital = abonoCapital;
        this.saldo = saldo;
    }

    public Cuota(int numero) {
		// TODO Auto-generated constructor stub
    	this.numero=numero;
	}

	public int getNumero() {
        return numero;
    }
    

    @Override
	public String toString() {
		return Utilitario.redondear(numero)+"    |" + Utilitario.redondear(cuota) + " | " + Utilitario.redondear(capital) + "    |" + Utilitario.redondear(interes)
				+ "    |" + Utilitario.redondear(abonoCapital) + "   |" +Utilitario.redondear(saldo) + "]";
	}
}
