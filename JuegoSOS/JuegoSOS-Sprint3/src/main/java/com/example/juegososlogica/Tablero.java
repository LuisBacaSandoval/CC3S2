package com.example.juegososlogica;

import java.io.LineNumberInputStream;

public class Tablero {
    private static int nroRow;
    private static int nroColumn;
    private static Jugador jugador1;
    private static Jugador jugador2;
    private static String turn;
    private static Ficha[][] table;
    private static String modeGame;

    public static Ficha[][] getTable() {
        return table;
    }

    public static void setTable(Ficha[][] table) {
        Tablero.table = table;
    }

    public static int getNroRow() {
        return nroRow;
    }

    public static void setNroRow(int nroRow) {
        Tablero.nroRow = nroRow;
    }

    public static int getNroColumn() {
        return nroColumn;
    }

    public static void setNroColumn(int nroColumn) {
        Tablero.nroColumn = nroColumn;
    }

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
    public static String getModeGame() {
        return modeGame;
    }
    public static void setModeGame(String modeGame) {
        Tablero.modeGame = modeGame;
    }

    //Metodo que asigna la posicion(row, column) de una ficha en el arreglo table
    public static void setFicha(int row, int column,String color, String letra){
        if(table[row][column]==null) {
            inicializar();
        }

        table[row][column] = new Ficha();
        table[row][column].setPosFila(row);
        table[row][column].setPosColumna(column);
        table[row][column].setColor(color);
        table[row][column].setLetra(letra);

    }
    //Metodo que inicializa el arreglo table
    public static void inicializar(){
        for(int i=0;i<nroRow;i++){
            for(int j=0;j<nroColumn;j++){
                table[i][j] = new Ficha();
                table[i][j].setPosFila(100);
                table[i][j].setPosColumna(100);
                table[i][j].setColor("color");
                table[i][j].setLetra("letra");
            }
        }
    }
    //Metodo que retorna quien ganó el juego
    public static String jugar(){
        String color="";
        if(table[0][0].getLetra()=="S" && table[0][1].getLetra()=="O" && table[0][2].getLetra()=="S"){
            if(table[0][0].getColor()=="red" && table[0][1].getColor()=="red" && table[0][2].getColor()=="red"){
                color = "red";
            }else if(table[0][0].getColor()=="blue" && table[0][1].getColor()=="blue" && table[0][2].getColor()=="blue"){
                color = "blue";
            }
        }else if(table[1][0].getLetra()=="S" && table[1][1].getLetra()=="O" && table[1][2].getLetra()=="S"){
            if(table[1][0].getColor()=="red" && table[1][1].getColor()=="red" && table[1][2].getColor()=="red"){
                color = "red";
            }else if(table[1][0].getColor()=="blue" && table[1][1].getColor()=="blue" && table[1][2].getColor()=="blue"){
                color = "blue";
            }
        }else if(table[2][0].getLetra()=="S" && table[2][1].getLetra()=="O" && table[2][2].getLetra()=="S"){
            if(table[2][0].getColor()=="red" && table[2][1].getColor()=="red" && table[2][2].getColor()=="red"){
                color = "red";
            }else if(table[2][0].getColor()=="blue" && table[2][1].getColor()=="blue" && table[2][2].getColor()=="blue"){
                color = "blue";
            }
        }else if(table[0][0].getLetra()=="S" && table[1][0].getLetra()=="O" && table[2][0].getLetra()=="S"){
            if(table[0][0].getColor()=="red" && table[1][0].getColor()=="red" && table[2][0].getColor()=="red"){
                color = "red";
            }else if(table[0][0].getColor()=="blue" && table[1][0].getColor()=="blue" && table[2][0].getColor()=="blue"){
                color = "blue";
            }
        }else if(table[0][1].getLetra()=="S" && table[1][1].getLetra()=="O" && table[2][1].getLetra()=="S"){
            if(table[0][1].getColor()=="red" && table[1][1].getColor()=="red" && table[2][1].getColor()=="red"){
                color = "red";
            }else if(table[0][1].getColor()=="blue" && table[1][1].getColor()=="blue" && table[2][1].getColor()=="blue"){
                color = "blue";
            }
        }else if(table[0][2].getLetra()=="S" && table[1][2].getLetra()=="O" && table[2][2].getLetra()=="S"){
            if(table[0][2].getColor()=="red" && table[1][2].getColor()=="red" && table[2][2].getColor()=="red"){
                color = "red";
            }else if(table[0][2].getColor()=="blue" && table[1][2].getColor()=="blue" && table[2][2].getColor()=="blue"){
                color = "blue";
            }
        }else if(table[0][0].getLetra()=="S" && table[1][1].getLetra()=="O" && table[2][2].getLetra()=="S"){
            if(table[0][0].getColor()=="red" && table[1][1].getColor()=="red" && table[2][2].getColor()=="red"){
                color = "red";
            }else if(table[0][0].getColor()=="blue" && table[1][1].getColor()=="blue" && table[2][2].getColor()=="blue"){
                color = "blue";
            }
        }else if(table[0][2].getLetra()=="S" && table[1][1].getLetra()=="O" && table[2][0].getLetra()=="S"){
            if(table[0][2].getColor()=="red" && table[1][1].getColor()=="red" && table[2][0].getColor()=="red"){
                color = "red";
            }else if(table[0][2].getColor()=="blue" && table[1][1].getColor()=="blue" && table[2][0].getColor()=="blue"){
                color = "blue";
            }
        }
        return color;
    }

}