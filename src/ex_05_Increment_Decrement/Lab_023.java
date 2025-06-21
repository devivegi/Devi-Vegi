package ex_05_Increment_Decrement;
/*  int a = 5;

        int b = a++ + ++a;

        System.out.println("a: " + a); // Output: ?

        System.out.println("b: " + b); // Output: ?*/
public class Lab_023 {
    public static void main(String[]args){

        int a=5;
        int b= a++ + ++a;
        System.out.println("a:" +a);
        System.out.println("b:" +b);
    }
}
