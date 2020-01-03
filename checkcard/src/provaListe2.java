import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class provaListe2 {
    public static void main(String[] args) throws IOException {
        String s = "";
        int i;
        CardNumber cardNumber = new CardNumber("");
        File fileIn = new File("./in.txt");
        File fileOut = new File("./out.txt");
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileOut, true));
        BufferedReader reader = new BufferedReader(new FileReader(fileIn));
        List<String> listIn = new ArrayList<String>();
        List<String> listOut = new ArrayList<String>();
        								//Prendo i codici dal file e li inserisco nella lista listIn
        while ((s = reader.readLine()) != null) listIn.add(s);
        reader.close();
        for (i = 0; i < listIn.size(); i++) {                        //Utilizzo l'oggetto 'cardnumber' usando i codici di listaIn e inserisco i codici completi in listOut
            cardNumber.setCardNo(listIn.get(i));
            if (cardNumber.isLengthCorrect())
                listOut.add(cardNumber.getFullCardNumber());
            //System.out.println(i);
        }
        for (i = 0; i < listOut.size(); i++) {                      //Stampo listOut su file
            writer.append(" ");
            writer.append(listOut.get(i));
            // System.out.println(i);
        }
        writer.close();
    }
}

