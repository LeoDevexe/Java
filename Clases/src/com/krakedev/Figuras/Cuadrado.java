package com.krakedev.Figuras;

public class Cuadrado {
    private int lado;



    // Getter para el campo 'lado'
    public int getLado() {
        return lado;
    }

    // Setter para el campo 'lado'
    public void setLado(int lado) {
        this.lado = lado;
    }

    // Método para calcular el área
    public double calcularArea() {
        double area = lado * lado;
        return area;
    }

    // Método para calcular el perímetro
    public double calcularPerimetro() {
        double perimetro = lado * 4;
        return perimetro;
    }
}
