package Task_09July;
//Nested Try-Catch  Description:
//Write a program with a try-catch block inside another try-catch block.
//Example: Outer block for ArithmeticException, inner for ArrayIndexOutOfBoundsException
public class nestedtry {
    public static void main(String[] args) {

        try{
            int a = 10/0; //Arithematic exception
            int [] number = {1,2,3};
            System.out.println(number[3]); //index out of bound

        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Inner exception: ArrayIndexOutOfBoundsException");
        }
        catch (ArithmeticException e){
            System.out.println("Outer exception: Arithematic exception block");
        }
    }
}
