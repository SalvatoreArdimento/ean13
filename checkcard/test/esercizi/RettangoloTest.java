package esercizi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RettangoloTest {

    @Test
    void calcolaPerimetro() {
        Rettangolo rettangolo = new Rettangolo();
        rettangolo.setLato(4);
        rettangolo.setBase(6);
        assertTrue(rettangolo.perimetro()==20);
    }

    @Test
    void calcolaArea() {
        Rettangolo rettangolo = new Rettangolo();
        rettangolo.setLato(4);
        rettangolo.setBase(6);

        assertTrue(rettangolo.area()==24);

    }
    @Test
    void calcolaDiametro(){
        Rettangolo rettangolo = new Rettangolo();
        rettangolo.setBase(15);
        rettangolo.setLato(8);
        assertTrue(rettangolo.diagonale()==17);
    }
}