package exercises02.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class SetupMySqlDatabase {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost/zoo?user=root&password=root";
        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement()) {
            stmt.executeUpdate("CREATE TABLE species ("
                    + "id INTEGER PRIMARY KEY, "
                    + "name VARCHAR(255), "
                    + "num_acres DECIMAL)");
            stmt.executeUpdate(
                    "CREATE TABLE animal ("
                            + "id INTEGER PRIMARY KEY, "
                            + "species_id integer, "
                            + "name VARCHAR(255), "
                            + "date_born TIMESTAMP)");
            stmt.executeUpdate("INSERT INTO species VALUES (1, 'African Elephant', 7.5)");
            stmt.executeUpdate("INSERT INTO species VALUES (2, 'Zebra', 1.2)");
            stmt.executeUpdate("INSERT INTO animal VALUES (1, 1, 'Elsa', CURRENT_TIMESTAMP)");
            stmt.executeUpdate("INSERT INTO animal VALUES (2, 2, 'Zelda', CURRENT_TIMESTAMP)");
            stmt.executeUpdate("INSERT INTO animal VALUES (3, 1, 'Ester', CURRENT_TIMESTAMP)");
            stmt.executeUpdate("INSERT INTO animal VALUES (4, 1, 'Eddie', CURRENT_TIMESTAMP)");
            stmt.executeUpdate("INSERT INTO animal VALUES (5, 2, 'Zoe', CURRENT_TIMESTAMP)");
        }
    }
}
