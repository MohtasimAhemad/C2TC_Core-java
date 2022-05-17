package training.c2tc.day65;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentStmtResultSet {

	public static void main(String[] args) throws Exception
	{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb","root","");
			
			Statement st = con.createStatement();
			
			ResultSet rs = st.executeQuery("Select studentId, studentName, studentMarks from student");
			while(rs.next())
			{
				System.out.println(rs.getString(1)); // first column
				System.out.println(rs.getString(2)); // Second column
				System.out.println(rs.getString(3)); // Third  column
			}
			
			st.close();
			con.close();
	}
}
