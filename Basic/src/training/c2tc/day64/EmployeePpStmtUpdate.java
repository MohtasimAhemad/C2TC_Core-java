package training.c2tc.day64;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class EmployeePpStmtUpdate {

	public static void main(String[] args) 
	{
		Connection con = null;
		PreparedStatement pt = null;
		
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con =DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb","root","");
			
			pt= con.prepareStatement(" update user set name = 'Nikita' where id = 101");
	
			int i = pt.executeUpdate();
			
			System.out.println("No.of rows affected : "+i);
			System.out.println("\nRows updated successfully..!!");	
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally {}
		try 
		{
			if(pt!=null);
			pt.close();
			pt=null;
		}
		catch(Exception e) {}
		try 
		{
			if(con!=null);
			con.close();
			con=null;
		}
		catch(Exception e) {}	
	}
}
