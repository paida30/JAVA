\\Write a java program to use Multiple Catch Block

public class MultipleCatchDemo {
    public static void main(String[] args) {

        try {
            int a = 10;
            int b = 0;

            int result = a / b;

            int arr[] = {10, 20, 30};
            System.out.println(arr[5]);
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: Cannot divide by zero.");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Exception: Invalid array index.");
        }
        catch (Exception e) {
            System.out.println("General Exception occurred.");
        }
    }
}
