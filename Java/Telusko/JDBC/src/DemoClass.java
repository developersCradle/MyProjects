import java.sql.Connection;
import java.sql.DriverManager;

import com.mysql.jdbc.PreparedStatement;

public class DemoClass
{
	public static void main(String[] args) throws Exception
	{
		String url = "jdbc:mysql://localhost:3306/tododb";
		String uname = "root";
		String pass = "";
		
		int userid = 6;
		String username = "Ali";
		String query = "insert into user values (?,?)"; 
		//String query = "insert into user values ('"+ username +"', " + userid + ")"; //not the best way using dynamic variables 
		//String query = "insert into user values ('Teppo', 5)";
		//String query = "select * from user";
		
		Class.forName("com.mysql.jdbc.Driver"); //class forname telusko
		Connection connection = DriverManager.getConnection(url, uname, pass);
		PreparedStatement statement= connection.prepareStatement(query);
		int count = statement.executeUpdate(query);
		//ResultSet rs = statement.executeQuery(query); Languages in SQL -> DDL, DML, DQL
		 
		String userData = "";
		//7:30
		
		System.out.println(count + " row/s affected" );
		/*
		while (rs.next())// Shifts pointer to next row, fetching whole table
		{
			
			userData = rs.getInt(2) + " : " + rs.getString(1);
			
			System.out.println(userData);
			
		}
		
		*/
		
		
		statement.close();
		connection.close();
		
	}
}
