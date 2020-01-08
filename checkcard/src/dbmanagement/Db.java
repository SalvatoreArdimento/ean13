package dbmanagement;


import java.sql.*;

public class Db {
    private final String url = "jdbc:postgresql://localhost:5432/checkcard";
    private final String user = "postgres";
    private final String password = "developer2";
    private int status;
    private String statusMsg;
    private Connection conn = null;


    public Connection connect() {
        if (conn == null) {
            try {
                conn = DriverManager.getConnection(url, user, password);
                this.status = 0;
            } catch (SQLException e) {
                this.status = 1;
            }
        }
        return conn;
    }

    public String getStatusMsg() {
        return statusMsg;
    }

    public void close() throws SQLException {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        } else
            System.out.println("nessuna connessione da chiudere");
    }

    public Card read(int n) throws SQLException {
        Statement stmt = null;
        Card card = new Card();
        connect();
        stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ResultSet rs = stmt.executeQuery("SELECT * FROM cards;");
        rs.absolute(n);
        card.setId(rs.getInt("id"));
        card.setCardNo(rs.getString("cardNo"));
        rs.close();
        stmt.close();
        close();
        return card;

    }
}











