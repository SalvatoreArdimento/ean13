package esercizi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TombolaTest {

    @Test
    public void testElementi(){
        int array[] = new int[91];
        int i;
        Tombola tombola = new Tombola();
        for(i=0;i<90;i++){
            array[i] = tombola.estraiNum();
            System.out.println("Estrazione n  "+i+" ----> "+array[i]);
        }
        assertEquals(0, array[90]);
    }

}