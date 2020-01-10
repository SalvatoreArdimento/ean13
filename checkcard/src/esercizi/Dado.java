package esercizi;
import java.util.Random;

public class Dado {


    public int lancioDado(){
        Random random = new Random();
        Random random1 = new Random();
        return  random.nextInt(6)+1;

    }


}
