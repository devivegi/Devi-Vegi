package Task_09July;
//: Try With Multiple StatementsDescription:
//Write multiple statements in a try block.
//Ensure if the first fails, the rest are not executed, and control goes to catch.
public class trywithmultiplestmts {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
            System.out.println("arithematic exception 10/0");
            int b = 10 / 2;
            System.out.println("arithematic exception 10/2");
            String s = "Devi";
            System.out.println("String is Devi");
        } catch (Exception e) {
            System.out.println("catch block exceuted");
        }
    }

}



