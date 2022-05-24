package training.c2tc.day66;
import java.sql.*;
import java.util.Scanner;
public class MainCon {

	public static void main(String[] args) {

		 try {
			 Scanner sc = new Scanner(System.in);
			Class.forName("com.mysql.cj.jdbc.Driver");
		    DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver() );

				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hiber","root","");
				System.out.println("connection establish");
				 /*insert from user
				System.out.println("enter user id ");
				int uid=sc.nextInt();
				System.out.println("enter user name ");
				String uname=sc.next();
				System.out.println("enter user id ");
				double usal=sc.nextDouble();
				String sql="insert into user(uid,uname,usal)values("+uid+",'"+uname+"',"+usal+")";
				
//				
//				  insert operation
				
				String sql="insert into user values(11,'mohtasom',90),(12,'maaz',90)";
				Statement stmt = con.createStatement();
				int i=stmt.executeUpdate(sql);
				if(i>0)
					System.out.println("record inserted"+i);
				else
					System.out.println("not insert");
				  */
				
				/*delete operation
				String sql="delete from user where uid=12";
				Statement stmt = con.createStatement();
				int i=stmt.executeUpdate(sql);
				if(i>0)
					System.out.println("record deleted"+i);
				else
					System.out.println("not deleted");*/
				
				/*update operation
//				String sql="update  user set uname='seeta',usal=676.8,uid=13";
				Statement stmt = con.createStatement();
				int i=stmt.executeUpdate(sql);
				if(i>0)
					System.out.println("record updated");
				else
					System.out.println("not update");*/
				
				/*
				 * select operation
				String sql="select *from user";//where uid=13;
				Statement stmt = con.createStatement();
				ResultSet rs=stmt.executeQuery(sql); //resultset which is used to the show the table record on console
				while(rs.next())  //method of resultset
				{
					System.out.println("uid"+rs.getInt(1));
					System.out.println("uname"+rs.getString(2));
					System.out.println("usal"+rs.getDouble(3));
				}
				 */
				
				
										// 	PreparedStatement //
				String sql="insert into user values(?,?,?)";
				PreparedStatement pst=con.prepareStatement(sql);
				pst.setInt(1, 101);
				pst.setString(2, "mohtasim");
				pst.setDouble(3, 1982.33);
				int i=pst.executeUpdate();
				if(i>0)
					System.out.println("record Inserted");
				else
					System.out.println("not Inserted");
				/*inserted operation 
				 */
				
				/*delete operation
				String sql="delete from user where uid=?";
				PreparedStatement pst=con.prepareStatement(sql);
				pst.setInt(1,101);
				int i=stmt.executeUpdate();
				if(i>0)
					System.out.println("record deleted"+i);
				else
					System.out.println("not deleted");
					*/
				
				/*update operation
				String sql="update  user set uname='seeta',usal=676.8,uid=13";
				PreparedStatement pst=con.prepareStatement(sql);
				pst.setInt(1, 103);
				pst.setString(2, "maaz");
				pst.setDouble(3, 1382.33);

				int i=pst.executeUpdate();
				if(i>0)
					System.out.println("record updated");
				else
					System.out.println("not update");
					*/
				/*select operation
				String sql="select *from user where uid=?";
				PreparedStatement pst=con.prepareStatement(sql);
				pst.setInt(1,13);
				ResultSet rs=pst.executeQuery(); //resultset which is used to the show the table record on console
				while(rs.next())  //method of resultset
				{
					System.out.println("uid"+rs.getInt(1));
					System.out.println("uname"+rs.getString(2));
					System.out.println("usal"+rs.getDouble(3));
				}
				 */
				
											// CallableStatement
				
				/*
				 select query
				CallableStatement cst = con.prepareCall("{call selectuser()}");
				ResultSet rs = cst.executeQuery();
				while(rs.next())
				{
					System.out.println("uid"+rs.getInt(1));
					System.out.println("uname"+rs.getString(2));
					System.out.println("usal"+rs.getDouble(3));
				}
				 */
				
				/*
				 * delete query
				CallableStatement cst = con.prepareCall("{call deleteuser(?)}");
				cst.setInt(1,13);
				int i=cst.executeUpdate();
				if(i>0)
					System.out.println("record deleted");
				else
					System.out.println("not deleted");
				 */
				/* 
				 update query
				CallableStatement cst = con.prepareCall("{call updateuser(?,?,?)}");
				cst.setInt(1, 103);
				cst.setString(2, "momo");
				cst.setDouble(3, 872.33);

				int i=cst.executeUpdate();
				if(i>0)
					System.out.println("record updated");
				else
					System.out.println("not updated");
				 */
				/* 
				 update query
				CallableStatement cst = con.prepareCall("{call insertuser(?,?,?)}");
				cst.setInt(1, 163);
				cst.setString(2, "veena");
				cst.setDouble(3, 7872.33);

				int i=cst.executeUpdate();
				if(i>0)
					System.out.println("record inserted"+i);
				else
					System.out.println("not inserted");
				 */
				
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
/*PreparedStatement interface is used for execute parameterize query it is beneficial of it compile at once only and after only execute.
difference between statement AND preparedStatement

*/
/* Transaction management:-
is a single unit of column ACID Describe the transaction management.
*/
