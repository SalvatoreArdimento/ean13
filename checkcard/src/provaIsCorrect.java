public class provaIsCorrect {
    public static void main (String[] args) {
        final String NUMERO = "101010101014";
        CardNumber cardNumber = new CardNumber(NUMERO);

        System.out.println("Metodo " + cardNumber.isCorrect());
        System.out.println("Metodo Statico " + CardNumber.isCorrect(NUMERO));
        System.out.println(cardNumber.checkSum());
    }
}
