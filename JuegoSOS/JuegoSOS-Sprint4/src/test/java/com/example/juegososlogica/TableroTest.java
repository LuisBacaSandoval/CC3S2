package com.example.juegososlogica;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TableroTest {
    //Prueba de creacion de tablero
    @Test
    public void testCreateTable(){
        //Asignamos el tamaño del tablero
        Tablero.setNroRow(5);
        Tablero.setNroColumn(5);

        assertEquals(5,Tablero.getNroRow());
        assertEquals(5,Tablero.getNroColumn());

        Ficha[][] tb = new Ficha[Tablero.getNroRow()][Tablero.getNroColumn()];
        Tablero.setTable(tb);

        //El metodo static inicializar(), inicializa el arreglo de fichas table con los siguientes valores:
        //100 para filas y columnas
        //"color" para el color de la ficha
        //"letra" para la letra  de la ficha
        Tablero.inicializar();

        for(int i=0;i<Tablero.getNroRow();i++){
            for(int j=0;j<Tablero.getNroColumn();j++){
                assertEquals(100,Tablero.getTable()[i][j].getPosFila());
                assertEquals(100,Tablero.getTable()[i][j].getPosColumna());
                assertEquals("color",Tablero.getTable()[i][j].getColor());
                assertEquals("letra",Tablero.getTable()[i][j].getLetra());
            }
        }
    }
    //Prueba de asignacion de ficha al tablero
    @Test
    public void testSetFicha(){
        Tablero.setNroRow(5);
        Tablero.setNroColumn(5);
        Ficha[][] tb = new Ficha[Tablero.getNroRow()][Tablero.getNroColumn()];
        assertNotNull(tb);

        Tablero.setTable(tb);

        int row = 2;
        int column = 3;
        Tablero.setFicha(row, column,"red","S");

        assertEquals("red",Tablero.getTable()[row][column].getColor());
        assertEquals("S",Tablero.getTable()[row][column].getColor());

        //assertEquals("blue",Tablero.getTable()[row][column].getColor());
    }
}