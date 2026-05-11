package jdbc;

import java.sql.*;

public class DisplayStudent_Ex {

    public static void main(String[] args) {

        try {

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/Employees_DB",
                    "root",
                    "pass");

            Statement st = con.createStatement();

            String query = "SELECT * FROM student";

            ResultSet rs = st.executeQuery(query);

            System.out.println("ID\tNAME\tMARKS");

            while (rs.next()) {

                int id = rs.getInt("id");
                String name = rs.getString("name");
                int marks = rs.getInt("marks");

                System.out.println(id + "\t" + name + "\t" + marks);
            }

            con.close();

        } catch (Exception e) {

            System.out.println(e);
        }
    }
}