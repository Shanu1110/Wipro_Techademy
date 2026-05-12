package jdbc;
import java.sql.*;
 
 
public class FetchData_Ex
{
public static void main(String[] args)
{
	try
{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Employees_DB", "root", "passs");
 
String query="insert into emp values(?, ?, ?, ?, ?, ?)";
	
PreparedStatement ps=con.prepareStatement(query);
 
ps.setInt(1, 6);
ps.setString(2, "Billu");
ps.setString(3, "ece");
ps.setDouble(4, 45000);
ps.setString(5, "shan@gmail.com");
ps.setString(6, "2026-02-05");
int rows=ps.executeUpdate();
 
System.out.println(rows + " row inserted ");
con.close();
}
	catch(Exception e)
	{
		System.out.println(e);
}
}
}
 
