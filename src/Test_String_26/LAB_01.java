package Test_String_26;
//Write a Java program that demonstrates basic string operations including
// concatenation, length, substring, and character extraction.

public class LAB_01 {
    public static void main(String[] args) {
        String s1 ="Hello World";

        System.out.println("Length of the string: "+s1.length()); //length of string
        System.out.println("First Character of string: "+s1.charAt(0));
        System.out.println("Substring: " +s1.substring(6));
        System.out.println("Concatenation of string: " +s1.concat(" Java"));
        System.out.println("Character Extention: " +s1.lastIndexOf("W"));

    }
}
