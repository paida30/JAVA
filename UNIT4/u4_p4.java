public class TestTryCatch{
    public static void main(String[] args) {
        String studentName = "Vivan";
        System.out.println(studentName + "started math calculation...");

        try {
            int totalMarks = 100;
            int subjects = 0;//risky divide by zero
            int result = totalMarks /subjects;

            System.err.println("Result " + result);
        } catch  (ArithmeticException e) {

            System.out.println("Exception Caught: Division by zero is not allowed for"+ studentName +"!");
            
            
            System.out.println("System Error detail :"+ e.getMessage());
        }
          System.out.println(studentName +"'s program continues execution smoothly !");
    }
}