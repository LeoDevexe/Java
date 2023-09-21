package com.krakedev;

public class TestAuto {

    public static void main(String[] args) {

        // 1.- Instanciamos los dos objetos auto 1 y auto 2
        Auto auto1;
        Auto auto2;
        auto1 = new Auto();
        auto2 = new Auto();

        // 2.- Modificar los atributos utilizando los setters
        auto1.setMarca("Chevrolet");
        auto1.setAnio(2018);
        auto1.setPrecio(15000.0f);
        System.out.println("-------------");

        // 2.- Modificar los atributos utilizando los setters
        auto2.setMarca("Suzuki");
        auto2.setAnio(2019);
        auto2.setPrecio(20000.0f);

        // 3.- Accedo a los atributos utilizando los getters
        // Auto 1
        System.out.println("marca: " + auto1.getMarca());
        System.out.println("año: " + auto1.getAnio());
        System.out.println("precio: " + auto1.getPrecio());

        System.out.println("-------------");
        // Auto 2
        System.out.println("marca: " + auto2.getMarca());
        System.out.println("año: " + auto2.getAnio());
        System.out.println("precio: " + auto2.getPrecio());
    }
}
