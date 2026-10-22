//7.6 Write a java program to use IF-IF ELSE-ELSE IF()ELSE condition.
   
   import java.util.Scanner;
   
   public class U1_P7_6
   {
	   public static void main(String args[])
	   {
		   Scanner scn = new Scanner(System.in);
		   
		    System.out.println("Enter marks:");
		   int marks = scn.nextInt();
		   
		   if(marks>=50)
		   {
			   if (marks>=75)
			   {
				    System.out.println("Distinction");
			   }
		      
			   else
			   {
				    System.out.println("Pass");
			   }
		   }
		   
		    else 
			{
				if(marks>=35)
				{
					System.out.println("Pass");
				}
				else
				{
					System.out.println("Fail");
				}
			}	
		   scn.close();
		   
		   
		  
	   }
   }   
