package dbmanagement;

import java.sql.SQLException;

public class provaDbManagement {
    public static void main (String [] args)throws SQLException {
        Card card = new Card();
        Db db = new Db();
        card=db.read(3);
        System.out.println("cardNo = "+card.getCardNo());
        System.out.println("ID = "+card.getId());





    }
}
