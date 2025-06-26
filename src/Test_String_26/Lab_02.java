package Test_String_26;
//Create a program that demonstrates different ways to compare strings in Java,
// including == operator, equals(), equalsIgnoreCase(), and compareTo() methods.
public class Lab_02 {
    public static void main(String[] args) {
        String s1= "Hello";
        String s2="hello";
        String  s3 ="Hello";

        System.out.println("Using Equals to Method : " +s1==s2 && s2==s3); //equals()
        System.out.println("Using Equals ignores case Method: " +s2.equalsIgnoreCase(s2)); // equalsIgnoreCase()
        System.out.println("Using Compare method: "+s1.compareTo(s2)); //compareTo()
    }
}
