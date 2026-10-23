import java.sql.*;
import java.util.*;

class UpdatePre
{
   public static void main(String args[])
      {
	     try {
		      Class.forName("com.mysql.cj.jdbc.Driver");
			  Connection cn = DriverManager.getConnection(
			  "jdbc:mysql://localhost:3306/Test01","root","");
			  
			  String sql = "UPDATE stud SET name = ?"WHERE grno =?;
			  PrepareStatement pstmt = cn.prepareStatement(sql);
			  
			  Scanner sc = new Scanner(System.in);
			  System.out.println("Enter grno.for which  you want to change the name:");
			   int grno = sc.nextInt();
			  System.outprintln("Enter new name:");
			  String name = sc.next();
			  
			  pstmt.setInt(1,name);
			  pstmt.setInt(2,grno);
			  
			  int x = pstmt.executeUpdate();
			  System.out.println("No of Rows Affected: "+ x);
			  
			  cn.close();
			  
			  }
			  catch (Exception e)
			  {
			    System.oout.println("Ecepttion: "+ e);
				}
			}
		}