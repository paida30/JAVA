import java.sql.*;
import java.util.*;

class DisplayPre
{
   public static void main(String args[])
      {
	     try {
		      Class.forName("com.mysql.cj.jdbc.Driver");
			  Connection cn = DriverManager.getConnection(
			  "jdbc:mysql://localhost:3306/Test01","root","");
			  
			  String sql = "SELECT * FROM stud";
			  
			  PrepareStatement pstmt = cn.prepareStatement(sql);
			  ResultSet rs = pstmt.executeQuery();
			  
			  while (rs.next()){
			       System.out.println(rs.getInt("grno")+"  " +rs.getString("name"));
				   }
				   
				   
				   cn.close();
				 }
				 catch (Exception e)
			  {
			    System.oout.println("Ecepttion: "+ e);
				}
			}
		}