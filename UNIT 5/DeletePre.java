
import java.sql.*;
import java.util.*;

class DeletePre
{
   public static void main(String args[])
      {
	     try {
		      Class.forName("com.mysql.cj.jdbc.Driver");
			  Connection cn = DriverManager.getConnection(
			  "jdbc:mysql://localhost:3306/Test01","root","");
			  
			  
			  String sql= "DELETE FROM stud   WHERE grno =?";
			  PreparedStatement pstmt = cn.prepareStatement(sql);
			  
			  Scanner sc = new Scanner(System.in);
			  System.out.println("Enter grno. for the record you wan to delete:");
			  
			  int grno = sc.nextInt();
			  
			  
			  pstmt.setInt(1,grno);
			  
			  
			  int x = pstmt.executeUpdate();
			  System.out.println("Number of rows inserted: "+ x);
			  
			  cn.close();
			  }
			  catch (Exception e)
			  {
			    System.oout.println("Ecepttion: "+ e);
				}
			}
		}