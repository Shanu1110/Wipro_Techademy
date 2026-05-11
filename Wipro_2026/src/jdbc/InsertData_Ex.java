package jdbc;
import java.sql.*;
public class InsertData_Ex {
public static void main(String[] args)
{
 
	try
	{
		String url="jdbc:mysql://localhost:3306/Employees_DB";
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Employees_DB", "root", "pass");
 
		Statement st=con.createStatement();
		String query="insert into emp values(5,'Deva', 105, 30000, 'shanukr@gmail.com', '2026-06-23')";
		
		int rows=st.executeUpdate(query);
		
		System.out.println(rows + " row inserted");
		
		con.close();
	}catch(Exception e)
	{
		System.out.println(e);
	}
	
}
 
}
 
 