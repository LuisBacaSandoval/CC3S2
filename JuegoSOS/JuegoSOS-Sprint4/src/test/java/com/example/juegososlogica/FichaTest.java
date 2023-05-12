package com.example.juegososlogica;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FichaTest {
    //Prueba de creacion de ficha
    @Test
    public void testCreateFicha(){
        Ficha ficha1 = new Ficha();
        Ficha ficha2 = new Ficha();
        assertNotNull(ficha1);
        assertNotNull(ficha2);

        //Asignar valores a los atributos de ficha1
        ficha1.setColor("red");
        ficha1.setLetra("S");
        ficha1.setPosFila(5);
        ficha1.setPosColumna(4);

        //Asignar valores a los atributos de ficha2
        ficha2.setColor("blue");
        ficha2.setLetra("O");
        ficha2.setPosFila(2);
        ficha2.setPosColumna(2);

        assertEquals("red",ficha1.getColor());
        assertEquals("S",ficha1.getLetra());
        assertEquals(5,ficha1.getPosFila());
        assertEquals(4,ficha1.getPosColumna());

        /*assertEquals("red",ficha2.getColor());
        assertEquals("S",ficha2.getLetra());
        assertEquals(5,ficha2.getPosFila());
        assertEquals(4,ficha2.getPosColumna());*/

    }
}