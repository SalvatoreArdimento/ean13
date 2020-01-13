package esercizi;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Tombola {
   private List<Integer> list = new ArrayList<Integer>();
   private Random random = new Random();


    public int estraiNum() {
        int num;
        if (list.size() < 90)
            while (list.size() < 90) {
                num = random.nextInt(90) + 1;
                if (!list.contains(num)) {
                    list.add(num);
                    return num;
                }
            }
                return 0;
    }
}






