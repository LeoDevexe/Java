package com.servicios;


import java.util.ArrayList;
import java.util.HashMap;
import com.entidades.Carta;
import com.entidades.Naipe;


public class Juego {
    private Naipe naipe;
    private ArrayList<Carta> naipeBarajado;
    private HashMap<String, ArrayList<Carta>> cartasJugadores;

    public Juego(String[] jugadores) {
        naipe = new Naipe();
        naipeBarajado = naipe.barajar();
        cartasJugadores = new HashMap<>();

        for (String jugador : jugadores) {
            cartasJugadores.put(jugador, new ArrayList<>());
        }
    }

    public HashMap<String, ArrayList<Carta>> getCartasJugadores() {
        return cartasJugadores;
    }


    public void entregarCartas(int cartasPorJugador) {
        int numJugadores = cartasJugadores.size();
        int numCartas = cartasPorJugador * numJugadores;



        int jugadorIndex = 0;
        for (int i = 0; i < numCartas; i++) {
            String idJugador = "jugador " + (jugadorIndex + 1);
            Carta carta = naipeBarajado.get(i);
            cartasJugadores.get(idJugador).add(carta);

            jugadorIndex = (jugadorIndex + 1) % numJugadores;
        }
    }
        public int devolverTotal(String idJugador) {
            int total = 0;
            ArrayList<Carta> cartas = cartasJugadores.get(idJugador);

            for (Carta carta : cartas) {
                total += carta.getNumero().getValor();
            }

            return total;
        }

public String determinarGanador() {
    String idGanador = "";
    int sumaGanador = 0;

    for (String idJugador : cartasJugadores.keySet()) {
        int suma = devolverTotal(idJugador);

        if (suma > sumaGanador) {
            idGanador = idJugador;
            sumaGanador = suma;
        }
    }
    return idGanador;
}
}
