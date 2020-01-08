package dbmanagement;

public class provareadnext {
    public static void main(String[] args) {
        Db db = new Db();
        Card card = new Card();
        db.readnext();
        card=db.read();
        System.out.println(card.getCardNo());



    }
}
