package Task_09July;
//Task 1: Basic Try-Catch with ArithmeticException
//Description: Divide a number by zero and handle the exception.
//🧤 Expected Output: Catch ArithmeticException and print a friendly message.
public class Basictrycatch {

    public static void main(String[] args) {

        try{
            int  a = 5/0;

        } catch (ArithmeticException e) {
           System.out.println("5 is not divisib1e 0");

        }
    }

}
