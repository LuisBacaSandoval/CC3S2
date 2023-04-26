package com.example.juegososlogica;

public class Jugador {
    private String fichaColor;
    private Boolean ganador;

    public String getFichaColor() {
        return fichaColor;
    }

    public void setFichaColor(String fichaColor) {
        this.fichaColor = fichaColor;
    }

    public Boolean getGanador() {
        return ganador;
    }

    public void setGanador(Boolean ganador) {
        this.ganador = ganador;
    }
}
