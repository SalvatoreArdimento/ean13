package dbmanagement;


import java.sql.*;

public class Db {
    private final String url = "jdbc:postgresql://10.99.88.154:5432/checkcard";
    private final String user = "postgres";
    private final String password = "developer2";
    private Long status;
    private String statusMsg;
    private Connection conn = null;


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
    public Long getStatus() { return status; } ;

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
            ResultSet rs = stmt.executeQuery("SELECT * FROM cards;");
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


    private void setState (SQLException e) {
        if (e == null) {
            this.status = 0L;
            this.statusMsg = "";
        } else {
            this.status = Long.valueOf(e.getSQLState());
            this.statusMsg = e.getMessage();
        }

    }
}











