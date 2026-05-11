package jdbc;

import java.sql.*;
import java.util.Scanner;

public class LoginValidation_Ex {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/Employees_DB",
                    "root",
                    "pass");

            String query =
                    "SELECT * FROM users WHERE username=? AND password=?";

            PreparedStatement ps = con.prepareStatement(query);

            System.out.println("Enter Username:");
            String username = sc.nextLine();

            System.out.println("Enter Password:");
            String password = sc.nextLine();

            ps.setString(1, username);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                System.out.println("Login Successful");

            } else {

                System.out.println("Invalid Username or Password");
            }

            con.close();
            sc.close();

        } catch (Exception e) {

            System.out.println(e);
        }
    }
}