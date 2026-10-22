//7.4 Write a java program to use NESTED IF() IF() ELSE ELSE condition.
   
   import java.util.Scanner;
   
   public class U1_P7_4
   {
	   public static void main(String args[])
	   {
		   Scanner scn = new Scanner(System.in);
		   
		   System.out.println("Enter number:");
		   int num = scn.nextInt();
		   
		   if(num>=0)
		   {
			   if (num==0)
			   {
				    System.out.println("The number is zero");
			   }
		      
			   else
			   {
				    System.out.println("Positive number");
			   }
		   }
		   
		    else
		   {
			  System.out.println("The number is negative");  
		   }
		   
		   scn.close();
		   
		   
		   //8.2 Write a java program to find odd or even number uing user inputs. 
		   //9.2 trnary operators result
	   }
   }   
