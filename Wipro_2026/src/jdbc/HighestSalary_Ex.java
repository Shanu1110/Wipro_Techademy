package jdbc;

import java.sql.*;

public class HighestSalary_Ex {

    public static void main(String[] args) {

        try {

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/Employees_DB",
                    "root",
                    "Shanu@sql44150");

            String query =
                    "SELECT * FROM emp ORDER BY salary DESC LIMIT 1";

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(query);

            if (rs.next()) {

                System.out.println(
                        rs.getInt("emp_id") + " "
                        + rs.getString("emp_name") + " "
                        + rs.getDouble("salary"));
            }

            con.close();

        } catch (Exception e) {

            System.out.println(e);
        }
    }
}