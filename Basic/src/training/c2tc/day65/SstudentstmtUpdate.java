package training.c2tc.day65;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;

public class SstudentstmtUpdate {

	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url ="jdbc:mysql://localhost:3306/sampledb";
		
		Properties p = new Properties();
		p.put("user", "root");
		p.put("password","1234");
		
		Connection con= DriverManager.getConnection(url,p);
		
		Statement st = con.createStatement();
		
		String query = "update student1 set studentName = 'mohtasim' where studentId = 1";
		int i = st.executeUpdate(query);
	
		System.out.println("No of rows affected : "+i);
		System.out.println("\nRows updated successfully.");
		
		st.close();
		con.close();
	}
}
