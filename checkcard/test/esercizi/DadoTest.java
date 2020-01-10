package esercizi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DadoTest {

    @Test
    void getRisultatoLancio() {
        boolean TestResult;
        int count = 0;
        int risultatoLancio;
        Dado dado = new Dado();
        for(int i=0;i<100;i++){
            risultatoLancio = dado.getRisultatoLancio();
            if(risultatoLancio>0 && risultatoLancio<7){
                count++;

            }

        }
        assertTrue(count==100);
    }
}