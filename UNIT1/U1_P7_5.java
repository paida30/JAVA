//7.5 Write a java program to use IF()  ELSE IF() ELSE condition.
   
   import java.util.Scanner;
   
   public class U1_P7_5
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
		   
		    else
		   {
			  System.out.println("Negative number");  
		   }
		   
		    if (num>10)
		   {
			  System.out.println("The number is greater than 10");  
		   }
		   
		    else
		   {
			  System.out.println("The number is less than 10");  
		   }
		   
		   scn.close();
	   }
   }   
