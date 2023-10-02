package com.entidades;

import java.util.ArrayList;

public class Naipe {
    private ArrayList<Numero> numerosPosibles;
    private ArrayList<Carta> cartas;

    public Naipe() {
        numerosPosibles = new ArrayList<>();
        numerosPosibles.add(new Numero("A", 11));
        numerosPosibles.add(new Numero("2", 2));
        numerosPosibles.add(new Numero("3", 3));
        numerosPosibles.add(new Numero("4", 4));
        numerosPosibles.add(new Numero("5", 5));
        numerosPosibles.add(new Numero("6", 6));
        numerosPosibles.add(new Numero("7", 7));
        numerosPosibles.add(new Numero("8", 8));
        numerosPosibles.add(new Numero("9", 9));
        numerosPosibles.add(new Numero("10", 10));
        numerosPosibles.add(new Numero("J", 10));
        numerosPosibles.add(new Numero("Q", 10));
        numerosPosibles.add(new Numero("K", 10));

        cartas = new ArrayList<>();
        for (Numero numero : numerosPosibles) {
            cartas.add(new Carta(numero, Palos.CORAZON_ROJO));
            cartas.add(new Carta(numero, Palos.CORAZON_NEGRO));
            cartas.add(new Carta(numero, Palos.DIAMANTE));
            cartas.add(new Carta(numero, Palos.TREBOL));
        }
    }

    public ArrayList<Carta> getCartas() {
        return cartas;
    }
    public ArrayList<Carta> barajar() {
        for (Carta carta : cartas) {
            carta.setEstado("N");
        }

        ArrayList<Carta> auxiliar = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            int posicion = Random.obtenerPosicion();
            Carta carta = cartas.get(posicion);

            if (carta.getEstado().equals("N")) {
                auxiliar.add(carta);
                carta.setEstado("C");
            }
        }

        for (Carta carta : cartas) {
            if (carta.getEstado().equals("N")) {
                auxiliar.add(carta);
            }
        }

        return auxiliar;
    }
}

