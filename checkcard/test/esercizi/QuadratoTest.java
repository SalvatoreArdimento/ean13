package esercizi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuadratoTest {

    @Test
    void calcolaDiagonale() {
        Quadrato quadrato = new Quadrato();
        quadrato.setAltezza(6);
        int diagonale=(int)quadrato.diagonale();
        System.out.println(diagonale);
        assertTrue(diagonale==8);
    }

    @Test
    void calcolaPerimetro(){
        Quadrato quadrato = new Quadrato();
        quadrato.setAltezza(8);
        assertTrue(quadrato.perimetro()==32);
    }
    @Test
    void calcolaArea(){
        Quadrato quadrato = new Quadrato();
        quadrato.setAltezza(8);
        assertTrue(quadrato.area()==64);
    }
}