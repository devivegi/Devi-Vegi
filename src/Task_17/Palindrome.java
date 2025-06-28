package Task_17;

import java.util.Scanner;

class test{
        public static void main(String[] args) {
            System.out.println("Hello enter your name");
            Scanner sc= new Scanner(System.in);
            String name= sc.nextLine();

           String revname="";
           for(int i = name.length() - 1 ; i>=0 ; i--){
               revname = revname + name.charAt(i);

           }
            System.out.println( "This is revers Name: " + revname);

           if(name.equals(revname)){
               System.out.println("Given input is palindrome");

           }
           else {
               System.out.println("Given input is not palindrome");
           }

        }
    }
