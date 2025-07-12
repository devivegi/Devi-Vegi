package Task_09July;
//Throw Exception and Catch ItDescription:
//Manually throw an exception using throw new ArithmeticException() and catch it.
public class throwexception {
    public static void main(String[] args) {

        try{
            throw new ArithmeticException("Manually throw atithematic excpetion");
        } catch (ArithmeticException e) {
            System.out.println("exception using arithemtic exception :" +e.getMessage());
        }
    }
}
