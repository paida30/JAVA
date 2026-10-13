public class TestFinally{
    public static void main(String[] args) {
        try {
            System.err.println("Vivaan opening database connection...");
            int data = 25/5;
            System.out.println("Data calculated:" + data);
            
        } catch (Exception e) {
            System.out.println("Exception caught.");
        } finally {
            System.out.println("FINALLY BLOCK :Closing Vivaan's database connection guaranteed!");
        }
    }
}