// 11.3 Write a Java program of 2D array using individual value assignment

import java.util.Scanner;

public class U1_P11_3 {
    public static void main(String args[]) {

        Scanner scn = new Scanner(System.in);

        int score[][] = new int[3][3];
        for (int i = 0; i < 3; i++) {
            
            for (int j = 0; j < 3; j++) {
             System.out.print("Enter scores of Student " + (i + 1) + " in subject "+ (j + 1) +":");
			 score[i][j]=scn.nextInt();
            }
            
        }
		 System.out.println("\n Scores are:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(score[i][j] + " ");
            }
            System.out.println();
        }

        scn.close();
    }
}