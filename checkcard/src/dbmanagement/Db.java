package dbmanagement;


import javax.swing.plaf.nimbus.State;
import java.sql.*;

public class Db {
    //private final String url = "jdbc:postgresql://10.99.88.154:5432/checkcard";
    private final String url = "jdbc:postgresql://localhost:5432/checkcard";
    private final String user = "postgres";
    private final String password = "developer2";
    private Long status;
    private String statusMsg;
    private Connection conn = null;
    private ResultSet rs = null;
    private String target;


    public Connection connect() {
        if (conn == null) {
            try {
                conn = DriverManager.getConnection(url, user, password);
                this.status = 0L;
            } catch (SQLException e) {
                this.status = Long.valueOf(e.getSQLState());
                this.statusMsg = e.getMessage();
            }
        }
        return conn;
    }

    public String getStatusMsg() {
        return statusMsg;
    }

    public Long getStatus() {
        return status;
    }

    ;

    /**
     * Chiude la connessione al Database, nel caso sia attiva
     */
    public void close() {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        } else
            System.out.println("nessuna connessione da chiudere");
    }

    public Card read(int n) {
        Statement stmt = null;
        Card card = new Card();
        connect();
        try {
            stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            boolean bPos = rs.absolute(n);
            card.setId(rs.getInt("id"));
            card.setCardNo(rs.getString("cardNo"));
            rs.close();
            stmt.close();
            setState(null);
        } catch (SQLException e) {
            setState(e);
        } finally {
            close();
        }

        return card;
    }


    private void setState(SQLException e) {
        if (e == null) {
            this.status = 0L;
            this.statusMsg = "";
        } else {
            this.status = Long.valueOf(e.getSQLState());
            this.statusMsg = e.getMessage();
        }
    }

    public Card readFirst() {
        try {
            rs.first();
            statusMsg = "Operazione riuscita";
            status = 0L;
            return read();


        } catch (SQLException e) {
            setState(e);
            return null;

        }

    }

    public Card readLast() {
        try {
            rs.last();
            statusMsg = "Operazione riuscita";
            status = 0L;
            return read();


        } catch (SQLException e) {
            setState(e);
            return null;

        }

    }

    public void readNext() {
        try {
            if (!rs.isLast())
                rs.next();
            status = 0L;
            statusMsg = "Operazione di scorrimento riuscita";

        } catch (SQLException e) {
            setState(e);
        }

    }

    public Card read() {
        try {
            Card card = new Card();
            card.setId(rs.getInt("id"));
            card.setCardNo(rs.getString("cardNo"));
            status = 0L;
            statusMsg = "Operazione di read riuscita";
            return card;


        } catch (SQLException e) {
            setState(e);
            return null;

        }
    }

    public void openResultSet() {
        if (conn != null) {
            try {
                Statement stmt = null;
                stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                rs = stmt.executeQuery(target);
                status = 0L;
                statusMsg = "Operazione di apertura ResultSet riuscita";
            } catch (SQLException e) {
                setState(e);
            }

        } else {
            statusMsg = "non connesso al db";
            status = 403L;
        }


    }

    public void closeResultSet() {
        try {
            rs.close();
            status = 0L;
            statusMsg = "Operazione di chiusura ResultSet riuscita";
        } catch (SQLException e) {
            setState(e);
        }
    }

    public boolean isLast() {
        try {
            status = 0L;
            return rs.isLast();
        } catch (SQLException e) {
            setState(e);
            return false;
        }


    }

    public boolean isFirst() {
        try {
            status = 0L;
            return rs.isFirst();
        } catch (SQLException e) {
            setState(e);
            return false;
        }


    }


    /**
     *
     * @param id
     */
    public Card find(int id) {
        Card card = new Card();
        target = "SELECT * FROM cards WHERE id=" + id + ";";
        openResultSet();
        readFirst();
        status = 0L;
        card=read();
            if (card!=null){
                statusMsg = "Operazione conclusa con successo";
                return card;
            }
            else{
                statusMsg = "Record non trovato";
                return card;
            }

    }

    /**
     * Ritorna un oggetto Card corrispondente al numero di carta `cardno`.
     * @param cardno
     * @return  <code>null</code> se non trova nulla
     */
    public Card find(String cardno) {
        Card card = new Card();
        target = "SELECT * FROM cards WHERE cardno= " + cardno + ";";
        openResultSet();
        readFirst();
        status = 0L;
        card=read();
        if (card!=null){
            statusMsg = "Operazione conclusa con successo";
            return card;
        }
        else{
            statusMsg = "Record non trovato";
            return card;
        }

    }


    public void update(int idTarget, String cardno) {
        try {
            connect();
            Statement stmt = null;
            stmt = conn.createStatement();
            stmt.executeUpdate("UPDATE cards set cardno=" + cardno + " where id =" + idTarget + ";");
            status = 0L;
            stmt.close();
            close();
        } catch (SQLException e) {
            setState(e);
        }

    }

    public void update(Card card) {
        try {
            connect();
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("UPDATE cards set cardno=" + card.getCardNo() + " where id =" + card.getId() + ";");
            status = 0L;
            statusMsg = "Record updated!";
            stmt.close();
            close();
        } catch (SQLException e) {
            setState(e);
        }

    }

    public void delete(int id) {
        try {
            connect();
            Statement stmt = null;
            stmt = conn.createStatement();
            stmt.executeUpdate("DELETE from cards WHERE id=" + id + ";");
            status = 0L;
            stmt.close();
            close();
        } catch (SQLException e) {
            setState(e);
        }

    }
}
