package com.servicios;

import java.util.ArrayList;
import com.entidades.Carta;
import com.entidades.Naipe;

public class Juego {
    private Naipe naipe;
    private ArrayList<Carta> naipeBarajado;
    private ArrayList<ArrayList<Carta>> cartasJugadores;

    public Juego(ArrayList<String> jugadores) {
        naipe = new Naipe();
        naipeBarajado = naipe.barajar();
        cartasJugadores = new ArrayList<>();

        for (int i = 0; i < jugadores.size(); i++) {
            cartasJugadores.add(new ArrayList<>());
        }
    }

    public void entregarCartas(int cartasPorJugador) {
        int numJugadores = cartasJugadores.size();
        int numCartas = cartasPorJugador * numJugadores;

        int jugadorIndex = 0;
        for (int i = 0; i < numCartas; i++) {
            Carta carta = naipeBarajado.get(i);
            cartasJugadores.get(jugadorIndex).add(carta);

            jugadorIndex = (jugadorIndex + 1) % numJugadores;
        }
    }

    public int devolverTotal(int jugadorIndex) {
        int total = 0;
        ArrayList<Carta> cartas = cartasJugadores.get(jugadorIndex);

        for (Carta carta : cartas) {
            total += carta.getNumero().getValor();
        }

        return total;
    }

    public String determinarGanador() {
        int sumaGanador = 0;
        int ganadorIndex = -1;

        for (int i = 0; i < cartasJugadores.size(); i++) {
            int suma = devolverTotal(i);

            if (suma > sumaGanador) {
                ganadorIndex = i;
                sumaGanador = suma;
            }
        }

        if (ganadorIndex != -1) {
            return "Jugador " + (ganadorIndex + 1);
        } else {
            return "No hay ganador";
        }
    }
}
