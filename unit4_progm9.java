\\Write a java program to implement Exception Chaining

public class ExceptionChainingDemo {

    public static void main(String[] args) {

        try {
            try {
                int a = 10;
                int b = 0;

                int result = a / b;
                System.out.println(result);
            }
            catch (ArithmeticException e) {
                throw new Exception("Calculation failed", e);
            }
        }
        catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
            System.out.println("Cause: " + e.getCause());
        }
    }
}
