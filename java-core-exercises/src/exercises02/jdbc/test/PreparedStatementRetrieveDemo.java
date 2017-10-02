package exercises02.jdbc.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedStatementRetrieveDemo {
    public static void main(String[] args) throws SQLException {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            conn = DBUtil.getConnection(DBType.ORADB);

            String sql = "select * from Employees where salary < ? and department_id = ?";

            pstmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);

            prepareStatement(pstmt, 10000, 50);
            System.out.println("------------------");
            prepareStatement(pstmt, 3000, 50);
        }
        catch(SQLException ex) {
            DBUtil.showErrorMessage(ex);
        }
    }

    private static void prepareStatement(PreparedStatement pstmt, double salary, int departmentId) throws SQLException {
        ResultSet rs;
        pstmt.setDouble(1, salary);
        pstmt.setInt(2, departmentId);

        rs = pstmt.executeQuery();

        String format = "%-4s%-20s%-25s%-10f\n";

        while (rs.next()) {
            System.out.format(format, rs.getString(
                    "Employee_id"), rs.getString("First_Name"),
                    rs.getString("Last_name"), rs.getFloat("Salary"));
        }

        rs.last();
        System.out.println("Total Employees : " + rs.getRow());
    }
}
