package dbmanagement;

public class provareadnext {
    public static void main(String[] args) {
        Db db = new Db();
        int i;
        Card card = new Card();
        db.connect();
        db.find(2);
        db.openResultSet();
        for(i=0;i<2;i++) {
            db.readNext();
            card = db.read();
            if (card != null) {
                System.out.println("CardNo: "+card.getCardNo());
                System.out.println("ID: "+card.getId());

            } else {
                System.out.println("Errore: " + db.getStatusMsg());
                System.out.println("Codice errore: " + db.getStatus());
            }
        }
        db.closeResultSet();
        db.close();



    }
}
