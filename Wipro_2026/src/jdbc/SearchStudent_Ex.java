package jdbc;

import java.sql.*;
import java.util.Scanner;

public class SearchStudent_Ex {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/Employees_DB",
                    "root",
                    "pass");

            String query = "SELECT * FROM student WHERE id=?";

            PreparedStatement ps = con.prepareStatement(query);

            System.out.println("Enter Student ID:");
            int id = sc.nextInt();

            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Marks: " + rs.getInt("marks"));

            } else {

                System.out.println("Student Not Found");
            }

            con.close();
            sc.close();

        } catch (Exception e) {

            System.out.println(e);
        }
    }
}