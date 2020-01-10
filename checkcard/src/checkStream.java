import CardNumber.CardNumber;

import java.io.*;

public class checkStream {
    public static void main(String[] args) throws IOException {
        CardNumber cardNumber = new CardNumber("");
        int i;
        String s;
        File fileIn = new File("./in.txt");
        File fileOut = new File("./out.txt");
        BufferedReader reader = new BufferedReader(new FileReader(fileIn));
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileOut, true));
        do {
            s = reader.readLine();
            if (s != null) {
                cardNumber.setCardNo(s);
                if (cardNumber.isLengthCorrect()) {
                    writer.append(" ");
                    writer.append(cardNumber.getFullCardNumber());
                } else
                    System.out.println("Carta con CardNo: " + cardNumber.getCardNo() + " non è valida");
            }

        }while ((s != null));
        writer.close();
        reader.close();


    }
}
