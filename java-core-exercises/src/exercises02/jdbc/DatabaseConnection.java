package exercises02.jdbc;

import java.sql.*;

public class DatabaseConnection {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost/zoo?user=root&password=root";
        try (Connection conn = DriverManager.getConnection(url);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select name from animal")) {
            while (rs.next())
                System.out.println(rs.getString(1));

            int count = stmt.executeUpdate(
                    "update animal set name = 'New Elsa' where name = 'Elsa'");

            System.out.println();

            ResultSet rs2 = stmt.executeQuery("select name from animal");
            while (rs2.next()) {
                System.out.println(rs2.getString(1));
            }
        }
    }
}
