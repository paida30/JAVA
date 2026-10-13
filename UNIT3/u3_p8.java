\\Write a java program to implement Exception Propagation

public class ExceptionPropagationDemo {

    static void method3() {
        int a = 10;
        int b = 0;

        int result = a / b;   // Exception occurs here
        System.out.println(result);
    }

    static void method2() {
        method3();            // Exception propagates to method2
    }

    static void method1() {
        method2();            // Exception propagates to method1
    }

    public static void main(String[] args) {

        try {
            method1();        // Exception is handled here
        }
        catch (ArithmeticException e) {
            System.out.println("Exception handled: Cannot divide by zero.");
        }
    }
}
