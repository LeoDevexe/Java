package com.krakedev.Figuras;

public class Rectangulo {
    private int base1;
    private int base2;
    private int altura1;
    private int altura2;



    // Getter y Setter para el campo 'base1'
    public int getBase1() {
        return base1;
    }

    public void setBase1(int base1) {
        this.base1 = base1;
    }

    // Getter y Setter para el campo 'base2'
    public int getBase2() {
        return base2;
    }

    public void setBase2(int base2) {
        this.base2 = base2;
    }

    // Getter y Setter para el campo 'altura1'
    public int getAltura1() {
        return altura1;
    }

    public void setAltura1(int altura1) {
        this.altura1 = altura1;
    }

    // Getter y Setter para el campo 'altura2'
    public int getAltura2() {
        return altura2;
    }

    public void setAltura2(int altura2) {
        this.altura2 = altura2;
    }

    // Método para calcular el área
    public double calcularArea() {
        int area = base1 * base2 * altura1 * altura2;
        return area;
    }
}
