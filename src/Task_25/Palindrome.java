package Task_25;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        {
            System.out.println("Enter a number");
            Scanner sc= new Scanner(System.in);
            String num= sc.nextLine();

            String revnum="";
            for(int i = num.length() - 1 ; i>=0 ; i--){
                revnum = revnum + num.charAt(i);

            }
            System.out.println( "This is revers Number: " + revnum);

            if(num.equals(revnum)){
                System.out.println("Given input is palindrome");

            }
            else {
                System.out.println("Given input is not palindrome");
            }

        }
        }
    }

