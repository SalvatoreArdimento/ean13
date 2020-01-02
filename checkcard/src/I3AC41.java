import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class I3AC41 {
    public static void main(String[] args) throws IOException {
        String s;
        CardNumber cardNumber = new CardNumber("");
        File fileIn = new File("./in.txt");
        File fileOut = new File("./out.txt");
        BufferedReader reader = new BufferedReader(new FileReader(fileIn));
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileOut, true));
        while ((s = reader.readLine()) != null) {
            cardNumber.setCardNo(s);
            if (cardNumber.isLengthCorrect()) {
                writer.append(" ");
                writer.append(cardNumber.getFullCardNumber());
            }
            else
                if (cardNumber.getCardNo().length()==13)
                      if(cardNumber.isCorrect())
                           System.out.println("il codice "+s+" è corretto");
                         else
                           System.out.println("il codice "+s+" non è corretto");
                    else
                        System.out.println("il codice "+s+" non rispetta gli standard di lunghezza");



        }
        writer.close();
        reader.close();
    }
}