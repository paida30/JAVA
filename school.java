import java.util.Scanner;

class school
 {
   public static void main ( String args[])
   {
     Scanner scn = new Scanner(System.in);

     System.out.println("enter your name");
	 String name = scn.nextLine();
	 
	 System.out.println("enter your age");
	 int age =  scn.nextInt();
	 
	 System.out.println("enter your mobilenumber");
	 String mobilenumber =  scn.nextLine();
	 
	  System.out.println("enter your email");
	 String email =  scn.nextLine();
	 
	 
	 
	
     System.out.println("You entered your name: " +name);
     System.out.println("You entered your age: " +age);
	 System.out.println("You entered your mobile number: " +mobilenumber);
	 System.out.println("You entered your email: " +email);
	 
	 
	 
   }
}