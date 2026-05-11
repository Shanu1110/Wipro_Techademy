package jdbc;

import java.sql.*;
import java.util.Scanner;

public class InsertStudent_Ex {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/Employees_DB",
                    "root",
                    "pass");

            String query = "INSERT INTO student VALUES(?,?,?)";

            PreparedStatement ps = con.prepareStatement(query);

            System.out.println("Enter Student ID:");
            int id = sc.nextInt();

            sc.nextLine();

            System.out.println("Enter Student Name:");
            String name = sc.nextLine();

            System.out.println("Enter Student Marks:");
            int marks = sc.nextInt();

            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setInt(3, marks);

            int rows = ps.executeUpdate();

            System.out.println(rows + " row inserted successfully");

            con.close();
            sc.close();

        } catch (Exception e) {

            System.out.println(e);
        }
    }
}