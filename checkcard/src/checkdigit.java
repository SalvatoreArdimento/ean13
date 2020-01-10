import CardNumber.CardNumber;

public class checkdigit {
    public static void main(String[] args) {
        String carteInput[] = new String[4];
        String carteOutput[] = new String[4];
        int y = 0;
        CardNumber cardnumber = new CardNumber("");
        carteInput[0] = "101010101010";
        carteInput[1] = "010101010101";
        carteInput[2] = "001002003004";
        carteInput[3] = "123456789012";

        for (String i : carteInput) {
            cardnumber.setCardNo(i);
            if (cardnumber.isLengthCorrect())
                carteOutput[y] = cardnumber.getFullCardNumber();
            y++;
        }

        for (String x : carteOutput) {
            System.out.println(x + "\n");
        }

        for (int i=0; i<carteInput.length; i++) {
            System.out.println(" | " + carteInput[i] + " | " + carteOutput[i] + " | " );
        }

    }


}




