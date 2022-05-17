package training.c2tc.day65;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class StudentTableCreate {

	public static void main(String[] args)
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/b3tns","root","1234");
			
			Statement st = con.createStatement();
			String s = "create table student (studentId int primary key, studentName varchar(25), studentMarks int )";
			int i = st.executeUpdate(s);
			
			boolean b = st.execute("create table student1 (studentId int primary key, studentName varchar(25), studentMarks int )");
			
			System.out.println("No of rows affected : "+i);
			System.out.println("\nQuery executed : "+b);
			System.out.println("\nTable created successfully..!!");
			
			st.close();
			con.close();	
		}
		catch(Exception e) 
		{
			System.out.println(e);
		}
	}

}
