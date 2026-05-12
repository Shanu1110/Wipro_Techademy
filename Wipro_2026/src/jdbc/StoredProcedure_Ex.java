package jdbc;

import java.sql.*;
import java.util.Scanner;

public class StoredProcedure_Ex {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/Employees_DB",
                    "root",
                    "Shanu@sql44150");

            CallableStatement cs =
                    con.prepareCall("{call SearchEmp(?)}");

            System.out.println("Enter Emp_ID:");

            int id = sc.nextInt();

            cs.setInt(1, id);

            ResultSet rs = cs.executeQuery();

            while (rs.next()) {

                System.out.println(
                        rs.getInt("id") + " "
                        + rs.getString("name") + " "
                        + rs.getString("department") + " "
                        + rs.getDouble("salary"));
            }

            con.close();
            sc.close();

        } catch (Exception e) {

            System.out.println(e);
        }
    }
}