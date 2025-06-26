package Test_String_26;
//Write a program that demonstrates the performance difference between
// String concatenation, StringBuilder, and StringBuffer for multiple string operations.
public class Lab_03 {
    public static void main(String[] args) {
        String s= new String("Devi");
        System.out.println("String Concatenation:" +s.concat(" Vegi"));

        StringBuilder s1 =new StringBuilder("Hello");
        System.out.println("Append String Builder: "+s1.append(" Java"));

        StringBuffer s2 =new StringBuffer("Selenium");

        System.out.println("Length of s2: "+s2.length());
        System.out.println(s2.capacity());
        System.out.println("Character at second position: "+s2.charAt(2));
        System.out.println("Substring of s2: "+s2.substring(2));
        System.out.println(s2.isEmpty());





    }
}

