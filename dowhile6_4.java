import java.util.Scanner;

 class dowhile6_4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();
       
	   System.out.print("Enter your number: ");
        int numb = sc.nextInt();

        int i = 1;

        do {
            System.out.println(i + ". " + name);
			System.out.println(i + ". " + numb);
            i++;
        } while (i <= 10);

        sc.close();
    }
}