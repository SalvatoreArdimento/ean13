import java.util.Scanner;

public class CardNumber {
    private String cardNo;


    public CardNumber(String cardNo) {
        this.cardNo = cardNo;
    }

    /**
     * Accetta in input una stringa numerica e restituisce il checkdigit EAN13
     * @param s
     * @return
     */
    public int checkSum(String s) {
        int i;
        int sum = 0;
        for (i = 0; i < s.length(); i++) {
            if ((i+1) % 2 != 0)
                sum += Integer.parseInt(String.valueOf(s.charAt(i)));           // Somma le cifre di posto pari
            else
                sum += Integer.parseInt(String.valueOf(s.charAt(i))) * 3;       // Somma le cifre di posto dispari moltiplicato 3
        }
        // System.out.print(sum + "\n");                // Solo DEBUG       TODO: Rimuovere

        if ((sum % 10) == 0)
            return 0;
        else
            return 10 - (sum % 10);

    }


    public int checkSum() {
        int i;
        int sum = 0;
        for (i = 0; i < cardNo.length(); i++) {
            if ((i+1) % 2 != 0)
                sum += Integer.parseInt(String.valueOf(cardNo.charAt(i)));           // Somma le cifre di posto pari
            else
                sum += Integer.parseInt(String.valueOf(cardNo.charAt(i))) * 3;       // Somma le cifre di posto dispari moltiplicato 3
        }
         System.out.print(sum + "\n");                // Solo DEBUG       TODO: Rimuovere

        if ((sum % 10) == 0)
            return 0;
        else
            return 10 - (sum % 10);

    }

    public boolean isLegal() {
        return cardNo.length() == 12;
    }

    /**
     * Ritorna il numero di carta completo di checkdigit alla fine
     * @return
     */
    public String getFullCardNumber() {
        return cardNo+this.checkSum();
    }


    public String getCardNo() { return cardNo; }
    public void setCardNo(String cardNo) { this.cardNo = cardNo; }

}





