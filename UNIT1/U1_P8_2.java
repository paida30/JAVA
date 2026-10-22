//8.2  Write a java program to find ODD or EVEN number without using command line argument.
   
   import java.util.Scanner;
   
   public class U1_P8_2
   {
	   public static void main(String args[])
	   {
		   Scanner scn = new Scanner(System.in);
		   
		   System.out.println("Enter number:");
		   int num = scn.nextInt();
		   
		   if(num%2==0)
		   {
			  System.out.println("Even number");  
		   }
		   
		    else
		   {
			  System.out.println("Odd number");  
		   }
		   
		   scn.close();
	   }
   }   
