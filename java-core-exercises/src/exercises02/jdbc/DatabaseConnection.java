package exercises02.jdbc;

import java.sql.*;

public class DatabaseConnection {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost/zoo?user=root&password=1234";
        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("select name from animal")) {
            while (rs.next())
                System.out.println(rs.getString(1));
        }
    }
}
