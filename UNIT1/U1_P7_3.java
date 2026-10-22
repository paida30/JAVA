//7.3 Write a java program to use ELSE IF condition.
   
   import java.util.Scanner;
   
   public class U1_P7_3
   {
	   public static void main(String args[])
	   {
		   Scanner scn = new Scanner(System.in);
		   
		   System.out.println("Enter number:");
		   int num = scn.nextInt();
		   
		   if(num>0)
		   {
			  System.out.println("Positive number");  
		   }
		   
		    else if (num<0)
		   {
			  System.out.println("Negative number");  
		   }
		   
		    else
		   {
			  System.out.println("Zero");  
		   }
		   
		   
		   scn.close();
	   }
   }   
