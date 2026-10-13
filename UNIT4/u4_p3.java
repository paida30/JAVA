class InvalidStudentMarkException extends Exception{

    public InvalidStudentMarksException(String message)
    {
        super(message;)
    }
}
public class testthrows2{
    static void validateVivaanMarks(double marks) throws InvalidStudentMarksException{
        if (marks< 0.0 || marks> 100.0){
            throw new InvalidStudentMarksException("Marks must be between 0 and 100! Input was :"+ marks);

        }else{
            System.out.println("Vivaan's Marks Validated Successfully: "+marks);

        }
    }
    public static void main(String[] args) {
        try {
            System.out.println("Submmitting Exam Score for Vivaan...");
            validateVivaanMarks(105.5);
        } catch (InvalidStudentMarksException e) {
            System.out.println("Custom Exception Caught: "+ e.getMessage);
        }
    }
}