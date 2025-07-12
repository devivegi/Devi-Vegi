package Task_09July;
//Try-Catch with Multiple Catch Blocks
//Description:Write code that may throw either ArithmeticException or ArrayIndexOutOfBoundsException and handle them with multiple catch blocks.
//🧤 Expected Output:Print which exception occurred.
public class multiplecatch {
    public static void main(String[] args) {
        int a[] ={12,34};
       int result = 0;

       try{

         result = a[12]/0;

        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException  cannot divide by 0");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");

        }
    }
}
