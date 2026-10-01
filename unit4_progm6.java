\\Write a java program to use Throws Keyword

public class ThrowsDemo {

    static void checkAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("Age is less than 18");
        } else {
            System.out.println("Eligible to vote");
        }
    }

    public static void main(String[] args) {

        try {
            checkAge(15);
        }
        catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
