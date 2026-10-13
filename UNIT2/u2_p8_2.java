//6.2 write a program to get  from user and print 10 times using loopimport java.util.Scanner;
 
 import java.util.Scanner;

 class whileloop6_5{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
		System.out.print("Enter your name: ");
        String name = sc.nextLine();
       
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        int i = 1;

        while (i <= 10) {
            System.out.println(i + num);
            
            System.out.println(i + ". " + name);
			
            i++;
        }

        sc.close();
    }
}