//6.3 write a program to get personal information from user and print 10 times using loop
import java.util.Scanner;

public class dowhile6_3{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        int i = 1;

        do {
            System.out.println(num);
            i++;
        } while (i <= 10);

        sc.close();
    }
}