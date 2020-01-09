package dbmanagement;

public class provareadfirst {
    public static void main(String []args){
        Db db = new Db();
        db.connect();
        db.openResultSet();
        Card card = new Card();
        card = db.readFirst();
        if (db.getStatus().equals(0L)) {
            System.out.println("CardNo " + card.getCardNo());
            System.out.println("id " + card.getId());
            db.close();
            db.closeResultSet();
        }
        else
            System.out.println("Errore : "+db.getStatusMsg());



    }
}
