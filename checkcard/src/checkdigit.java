public class checkdigit {
    public static void main(String[] args) {
        CardNumber card = new CardNumber("012345678901");
        System.out.println(card.isLegal());
        System.out.println(card.checkSum());
    }

}
