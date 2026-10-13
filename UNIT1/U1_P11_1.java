//11.3 write a java program of 2d array and take value from user.



public class U1_P11_1 {
    public static void main(String args[]) {

        int age2[][] = new int[3][3];

        // Individual value assignment
        age2[0][0] = 5;
        age2[0][1] = 10;
        age2[0][2] = 15;
        age2[1][0] = 20;
        age2[1][1] = 25;
        age2[1][2] = 30;
        age2[2][0] = 35;
        age2[2][1] = 40;
        age2[2][2] = 45;

        // Display the array
        System.out.println("2D Array Elements:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(age2[i][j] + " ");
            }
            System.out.println();
        }
    }
}

		
 