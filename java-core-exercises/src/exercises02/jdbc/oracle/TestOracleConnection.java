package exercises02.jdbc.oracle;
import java.sql.*;

public class TestOracleConnection {

    static final String dbUrl = "jdbc:oracle:thin:@localhost:1521:xe";
    static final String username = "hr";
    static final String password = "hr";

    public static void main(String[] args) throws SQLException {
        Connection conn = DriverManager.getConnection(dbUrl, username, password);

        System.out.println("Connection to Oracle Database Established Susccessfully.");
    }
}
