package jdbc;

import java.sql.*;
import java.util.Scanner;

public class DeleteStudent_Ex {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/Employees_DB",
                    "root",
                    "pass");

            String query = "DELETE FROM student WHERE id=?";

            PreparedStatement ps = con.prepareStatement(query);

            System.out.println("Enter Student ID to Delete:");
            int id = sc.nextInt();

            ps.setInt(1, id);

            int rows = ps.executeUpdate();

            if (rows > 0) {

                System.out.println("Record Deleted Successfully");

            } else {

                System.out.println("Student ID Not Found");
            }

            con.close();
            sc.close();

        } catch (Exception e) {

            System.out.println(e);
        }
    }
}