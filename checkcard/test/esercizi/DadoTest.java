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
            risultatoLancio = dado.lancioDado();
            if(risultatoLancio>0 && risultatoLancio<7){
                count++;

            }
        }
        assertTrue(count==100);
    }

    @Test
    void TestSequenza(){
        Dado dado = new Dado();
        Dado dado1 = new Dado();
        for(int i=0;i<32;i++){
            System.out.println("Iterazione n "+(i+1));
            System.out.println("Randomizer 1---> "+dado.lancioDado());
            System.out.println("Randomizer 2---> "+dado1.lancioDado());
            System.out.println("");
        }
    }
}