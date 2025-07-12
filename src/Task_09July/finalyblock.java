package Task_09July;
//Try-Catch-Finally Description:
//Create a program with a try, a catch, and a finally block.
//Demonstrate that the finally block always executes.
public class finalyblock {
    public static void main(String[] args) {

        int a = 5;
        int result = 0;
        try
        {
            result =a/0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Arithematic operation number can not divide by zero");
        }
        finally {
            System.out.println("Final block got executed");
        }
    }
}
