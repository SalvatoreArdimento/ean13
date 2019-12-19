public class provaIsCorrect {
    public static void main (String[] args) {
        CardNumber cardNumber = new CardNumber("101010101014");
        System.out.print(CardNumber.isCorrect(cardNumber.getCardNo()));
        System.out.print(cardNumber.checkSum());
    }
}
