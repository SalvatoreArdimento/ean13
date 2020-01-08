package dbmanagement;

public class provareadfirst {
    public static void main(String []args){
        Db db = new Db();
        db.connect();
        Card card = new Card();
        card = db.readfirst();
        if (db.getStatus()==0L) {
            System.out.println("CardNo " + card.getCardNo());
            System.out.println("id " + card.getId());
            db.close();
        }
        else
            System.out.println("Errore : "+db.getStatusMsg());



    }
}
