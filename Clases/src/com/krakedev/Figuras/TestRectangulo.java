package com.krakedev.Figuras;

public class TestRectangulo {

    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo();
        
        r1.setBase1(4);
        r1.setBase2(r1.getBase1());
        r1.setAltura1(2);
        r1.setAltura2(r1.getAltura1());

        double areaR1;

        areaR1 = r1.calcularArea();

        System.out.println("Area de r1 : " + areaR1);
    }
}
