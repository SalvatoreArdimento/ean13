package db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class selectdb {
    public static void main( String args[] ) {
        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager
                    .getConnection("jdbc:postgresql://172.17.0.2:5432/checkcard",
                            "postgres", "developer2");
            c.setAutoCommit(false);
            System.out.println("connessione al db riuscita");

            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery( "SELECT * FROM cards;" );
            while ( rs.next() ) {
                int id = rs.getInt("id");
                String  cardNo = rs.getString("cardNo");
                System.out.println( "ID = " + id );
                System.out.println( "CardNo = " + cardNo );

            }
            rs.close();
            stmt.close();
            c.close();
        } catch ( Exception e ) {
            System.err.println( e.getClass().getName()+": "+ e.getMessage() );
            System.exit(0);
        }
        System.out.println("operazione conclusa con successo");
    }
}