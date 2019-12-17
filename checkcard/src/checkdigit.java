public class checkdigit {
    public static void main(String[] args) {
        String carteInput[] = new String[4];
        String carteOutput[] = new String[4];
        int y = 0;
        CardNumber Object = new CardNumber("");
        carteInput[0] = "101010101010";
        carteInput[1] = "010101010101";
        carteInput[2] = "001002003004";
        carteInput[3] = "123456789012";

        for (String i : carteInput) {
            Object.setCardNo(i);
            if (Object.isLegal())
                carteOutput[y] = Object.getFullCardNumber();
            y++;
        }

        for (String x : carteOutput
        ) {
            System.out.println(x + "\n");

        }
    }


}




