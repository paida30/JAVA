//write a program that gets values from the use,comparing  using if statement

import java.util.Scanner;

 class ifdemo
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();
            
        if(num % 2 == 0){
              System.out.println("This is an even number!");  
             }

        sc.close();
    }
}