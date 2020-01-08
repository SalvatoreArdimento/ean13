package dbmanagement;

import java.sql.SQLException;

public class provaDbManagement {
    public static void main (String [] args)throws SQLException {
        Card card = new Card();
        Db db = new Db();
        // Controllo la connessione
        if (db.connect() == null) {
            System.out.println("Errore nella connessione al database: " + db.getStatusMsg());
            System.out.println("Esecuzione Interrotta");
            System.exit(1);
        }
        card=db.read(3);
        if (db.getStatus() != 0L) {
            System.out.println("Errore nel read " + db.getStatusMsg());
            System.out.println("Esecuzione Interrotta");
            System.exit(1);
        }
        System.out.println("cardNo = "+card.getCardNo());
        System.out.println("ID = "+card.getId());
        // Chiudo l'eventuale connessione
        db.close();




    }
}
