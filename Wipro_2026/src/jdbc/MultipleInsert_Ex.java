package jdbc;

import java.sql.*;
import java.util.Scanner;

public class MultipleInsert_Ex {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/Employees_DB",
                    "root",
                    "pass");

            String query = "INSERT INTO student VALUES(?,?,?)";

            PreparedStatement ps = con.prepareStatement(query);

            System.out.println("How many records you want to insert?");
            int n = sc.nextInt();

            for (int i = 1; i <= n; i++) {

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

                ps.executeUpdate();

                System.out.println("Record Inserted Successfully");
            }

            con.close();
            sc.close();

        } catch (Exception e) {

            System.out.println(e);
        }
    }
}