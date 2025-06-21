package ex_05_Increment_Decrement;

/*int x = 5;

int y = x++ + ++x + x++ + ++x;

System.out.println("x = " + x + ", y = " + y);*/
public class Lab_24 {
    public static void main(String[] args) {
        int x = 5;

        int y = x++ + ++x + x++ + ++x;

        System.out.println("x = " + x + ", y = " + y);
    }
}
