import java.io.*;

public class checkStream {
    public static void main(String[] args) throws IOException {
        CardNumber cardNumber = new CardNumber("");
        int i;
        File fileIn = new File("/home/developer2/Scrivania/in.txt");
        File fileOut = new File("/home/developer2/Scrivania/out.txt");
        BufferedReader reader = new BufferedReader(new FileReader(fileIn));
        BufferedReader reader2 = new BufferedReader(new FileReader(fileIn));
        int lines = 0;
        while (reader.readLine() != null) lines++;      //Ricavo numero righe file
        reader.close();
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileOut, true));
        for (i = 0; i < lines; i++) {
            cardNumber.setCardNo(reader2.readLine());
            if (cardNumber.isLengthCorrect()) {
                writer.append(" ");
                writer.append(cardNumber.getFullCardNumber());
            } else
               System.out.println("Carta con CardNo: "+cardNumber.getCardNo() + " non è valida");


        }
        writer.close();
        reader2.close();


    }
}
