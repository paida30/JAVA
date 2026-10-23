import java.sql.*;
import java.util.*;

class InsertPre
{
   public static void main(String args[])
      {
	     try {
		      Class.forName("com.mysql.cj.jdbc.Driver");
			  Connection cn = DriverManager.getConnection(
			  "jdbc:mysql://localhost:3306/Test01","root","");
			  
			  String sql= "INSERT INTO stud  (grno,name) VALUES (?,?)";
			  PreparedStatement pstmt = cn.prepareStatement(sql);
			  
			  Scanner sc = new Scanner(System.in);
			  int grno = 0;
			  String name ="";
			  System.out.println("Enter grno:");
			  grno = sc.nextInt();
			  System.outprintln("Enter name:");
			  name = sc.next();
			  pstmt.setInt(1,grno);
			  pstmt.setInt(2,name);
			  
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