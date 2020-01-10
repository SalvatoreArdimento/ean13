package esercizi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuadratoTest {

    @Test
    void calcolaDiagonale() {
        Quadrato quadrato = new Quadrato();
        quadrato.setLato(6);
        int diagonale=(int)quadrato.calcolaDiagonale();
        System.out.println(diagonale);
        assertTrue(diagonale==8);
    }

    @Test
    void calcolaPerimetro(){
        Quadrato quadrato = new Quadrato();
        quadrato.setLato(8);
        assertTrue(quadrato.calcolaPerimetro()==32);
    }
    @Test
    void calcolaArea(){
        Quadrato quadrato = new Quadrato();
        quadrato.setLato(8);
        assertTrue(quadrato.calcolaArea()==64);
    }
}