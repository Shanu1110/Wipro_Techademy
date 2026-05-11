package jdbc;

import java.sql.*;
import java.util.Scanner;

public class UpdateStudent_Ex {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            // Database Connection
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/Employees_DB",
                    "root",
                    "pass");

            // Update Query
            String query =
                    "UPDATE student SET name=?, marks=? WHERE id=?";

            PreparedStatement ps = con.prepareStatement(query);

            // User Input
            System.out.println("Enter Student ID to Update:");
            int id = sc.nextInt();

            sc.nextLine();

            System.out.println("Enter New Student Name:");
            String name = sc.nextLine();

            System.out.println("Enter New Marks:");
            int marks = sc.nextInt();

            // Set Values
            ps.setString(1, name);
            ps.setInt(2, marks);
            ps.setInt(3, id);

            // Execute Update
            int rows = ps.executeUpdate();

            // Check Update Status
            if (rows > 0) {

                System.out.println("Record Updated Successfully");

            } else {

                System.out.println("Student ID Not Found");
            }

            // Close Connection
            con.close();
            sc.close();

        } catch (Exception e) {

            System.out.println(e);
        }
    }
}