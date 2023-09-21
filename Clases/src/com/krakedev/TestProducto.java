package com.krakedev;

public class TestProducto {

    public static void main(String[] args) {

        Producto productoA;
        Producto productoB;
        Producto productoC;

        // Instanciamos 3 objetos de la clase Producto
        productoA = new Producto();
        productoB = new Producto();
        productoC = new Producto();

        // Modificamos los atributos de los productos utilizando los setters

        productoA.setNombre("Loratadina");
        productoA.setDescripcion("Antialérgico");
        productoA.setPrecio(1.50f);
        productoA.setStockActual(100);

        // Producto B
        productoB.setNombre("Complejo B");
        productoB.setDescripcion("Vitamina");
        productoB.setPrecio(3.50f);
        productoB.setStockActual(80);

        // Producto C
        productoC.setNombre("Enterogermina");
        productoC.setDescripcion("Estomacal");
        productoC.setPrecio(2.50f);
        productoC.setStockActual(140);

        // Mostrar valores de los atributos utilizando los getters
        // Producto A
        System.out.println("nombre: " + productoA.getNombre());
        System.out.println("descripcion: " + productoA.getDescripcion());
        System.out.println("precio: " + productoA.getPrecio());
        System.out.println("stock: " + productoA.getStockActual());

        System.out.println("-----------------------");

        // Producto B
        System.out.println("nombre: " + productoB.getNombre());
        System.out.println("descripcion: " + productoB.getDescripcion());
        System.out.println("precio: " + productoB.getPrecio());
        System.out.println("stock: " + productoB.getStockActual());

        System.out.println("-----------------------");

        // Producto C
        System.out.println("nombre: " + productoC.getNombre());
        System.out.println("descripcion: " + productoC.getDescripcion());
        System.out.println("precio: " + productoC.getPrecio());
        System.out.println("stock: " + productoC.getStockActual());
    }
}
