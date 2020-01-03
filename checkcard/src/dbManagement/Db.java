package dbManagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Db {
    private final String url = "jdbc:postgresql://localhost:5432/checkcard";
    private final String user = "postgres";
    private final String password = "developer2";
    private int status;
    private String statusMsg;
    private Connection conn = null;


    public Connection connect(){
        if (conn==null) {
            try {
                conn = DriverManager.getConnection(url, user, password);
                this.status = 0;
            } catch (SQLException e) {
                this.status=1 ;
            }
        }
        return conn;
    }

    public String getStatusMsg() {
        return statusMsg;
    }

    public void CloseConn()throws SQLException{
        conn.close();
    }

}
