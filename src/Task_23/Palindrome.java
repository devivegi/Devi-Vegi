package Task_23;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        System.out.println("Enter the data");
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine().toLowerCase();

        String revname ="";
        for(int i=a.length() - 1;i>=0;i--){
            revname=revname+a.charAt(i);
        }
if(revname.equals(a)){
    System.out.println("It is palindrome");
}
else System.out.println("It is not Palindrome");
    }
}
