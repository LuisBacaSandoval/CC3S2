package com.example.juegososlogica;

public class Tablero {
    private static Jugador jugador1;
    private static Jugador jugador2;
    private static String turn;

    public static Jugador getJugador1() {
        return jugador1;
    }

    public static void setJugador1(String color) {
        jugador1 = new Jugador();
        jugador1.setFichaColor(color);
    }

    public static Jugador getJugador2() {
        return jugador2;
    }

    public static void setJugador2(String color) {
        jugador2 = new Jugador();
        jugador2.setFichaColor(color);
    }

    public static String getTurn() {
        return turn;
    }

    public static void setTurn(String turn) {
        Tablero.turn = turn;
    }
}
