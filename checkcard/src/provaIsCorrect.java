public class provaIsCorrect {
    public static void main(String[] args) {
        final String NUMERO = "1010101010104";
        CardNumber cardNumber = new CardNumber(NUMERO);
        System.out.println(cardNumber.checkSum());

        System.out.println(cardNumber.isCorrect());


    }
}
