package Task_09July;
//Try Block Without ExceptionDescription:
//Write a try block that does not throw any exception.
//Verify that the catch block is skipped and finally still runs.
public class tryblockwithoutexcpetion {
    public static void main(String[] args) {

        try {
            int a = 10/2;
            System.out.println("Try block get exceuted");
            }
        catch (Exception e) {
            System.out.println("Catch block excepted ");
        }
        finally {
            System.out.println("Final block get executed");
        }
    }
}
