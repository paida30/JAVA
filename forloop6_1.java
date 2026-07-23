//6.1 write a program to get  from user and print 10 times using loop

import java.util.Scanner;

public class forloop
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num);
        }

        sc.close();
    }
}