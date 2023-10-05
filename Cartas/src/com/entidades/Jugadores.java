package com.entidades;

import java.util.ArrayList;
import com.servicios.Juego;

public class Jugadores {
    private ArrayList<String> jugadores;
    
    

    public ArrayList<String> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<String> jugadores) {
        this.jugadores = jugadores;
    }

    public void jugar() {
        ArrayList<String> jugadores = new ArrayList<>();
        jugadores.add("jugador 1");
        jugadores.add("jugador 2");
        jugadores.add("jugador 3");

        Juego juego = new Juego(jugadores);

        juego.entregarCartas(5);

        for (int i = 0; i < jugadores.size(); i++) {
            int total = juego.devolverTotal(i);
            System.out.println("Total de " + jugadores.get(i) + ": " + total);
        }

        String ganador = juego.determinarGanador();
        System.out.println("El ganador es: " + ganador);
    }
}
