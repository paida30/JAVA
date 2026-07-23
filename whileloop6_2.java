//6.2 write a program to get  from user and print 10 times using loopimport java.util.Scanner;
 
 import java.util.Scanner;

 class whileloop6_2{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        int i = 1;

        while (i <= 10) {
            System.out.println(num);
            i++;
        }

        sc.close();
    }
}