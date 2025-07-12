package Task_09July;
//Catch Using Exception (Generic Catch)Description:
//Use only catch(Exception e) to catch any exception.
//Throw a NullPointerException or ArithmeticException inside try.
public class catchexception {
    public static void main(String[] args) {

        try {
            int a = 10/0;
            System.out.println("Number is divisible");
        } catch (Exception e) {
            System.out.println("Catch an generic exception");
            }
        }

}
