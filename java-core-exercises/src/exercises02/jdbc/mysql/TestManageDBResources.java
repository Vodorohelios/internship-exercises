package exercises02.jdbc.mysql;

import exercises02.jdbc.test.DBType;
import exercises02.jdbc.test.DBUtil;

import java.sql.Connection;
import java.sql.SQLException;

public class TestManageDBResources {

    public static void main(String[] args) throws SQLException {
        Connection conn = null;

        try {
            conn = DBUtil.getConnection(DBType.MYSQLDB);

            System.out.println("Connection Established to MYSQL Database");
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } finally {
            conn.close();
        }
    }
}
