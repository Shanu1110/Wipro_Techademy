package jdbc;

import java.sql.*;

public class InsertEmployee_Ex {

    public static void main(String[] args) {

        try {

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/Employees_DB",
                    "root",
                    "Shanu@sql44150");

            String query =
                    "INSERT INTO emp VALUES(?,?,?,?)";

            PreparedStatement ps =
                    con.prepareStatement(query);

            // Employee 1
            ps.setInt(1, 101);
            ps.setString(2, "Shanu");
            ps.setString(3, "IT");
            ps.setDouble(4, 70000);
            ps.executeUpdate();

            // Employee 2
            ps.setInt(1, 102);
            ps.setString(2, "Rahul");
            ps.setString(3, "HR");
            ps.setDouble(4, 45000);
            ps.executeUpdate();

            // Employee 3
            ps.setInt(1, 103);
            ps.setString(2, "Aman");
            ps.setString(3, "Finance");
            ps.setDouble(4, 55000);
            ps.executeUpdate();

            // Employee 4
            ps.setInt(1, 104);
            ps.setString(2, "Priya");
            ps.setString(3, "IT");
            ps.setDouble(4, 80000);
            ps.executeUpdate();

            // Employee 5
            ps.setInt(1, 105);
            ps.setString(2, "Neha");
            ps.setString(3, "Marketing");
            ps.setDouble(4, 60000);
            ps.executeUpdate();

            System.out.println("5 Records Inserted Successfully");

            con.close();

        } catch (Exception e) {

            System.out.println(e);
        }
    }
}