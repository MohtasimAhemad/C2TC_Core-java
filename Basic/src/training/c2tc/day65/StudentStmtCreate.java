package training.c2tc.day65;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;

public class StudentStmtCreate {

	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url ="jdbc:mysql://localhost:3306/sampledb";
		
		Properties p = new Properties();
		p.put("user", "root");
		p.put("password","");
		
		Connection con= DriverManager.getConnection(url,p);
		
		Statement st = con.createStatement();
		
		String query = "create table emp (empId int primary key, empName varchar(40), empSalary double)";
		int i = st.executeUpdate(query);

		System.out.println("No of rows affected : "+i);
		System.out.println("\nTable created successfully..!!");
		
		st.close();
		con.close();
	}

}
