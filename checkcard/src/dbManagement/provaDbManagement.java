package dbManagement;

import java.sql.SQLException;

public class provaDbManagement {
    public static void main (String [] args)throws SQLException {
        Db db = new Db();
        db.connect();
        db.CloseConn();





    }
}
