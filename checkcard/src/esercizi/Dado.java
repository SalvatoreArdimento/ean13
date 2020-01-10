package esercizi;
import java.util.Random;

public class Dado {
    private int risultatoLancio;

    private void lancioDado(){
        Random random = new Random();
        risultatoLancio = random.nextInt(6)+1;
    }

    public int getRisultatoLancio() {
       lancioDado();
        return risultatoLancio;
    }
}
