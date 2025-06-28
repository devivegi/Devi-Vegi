package Task_18;

import java.util.Scanner;
//Create a program that determines whether a given year is a leap year.
// A leap year is divisible by 4, but not by 100 unless it is also divisible by 400. Use an if-else statement to make this determination.
public class Leap_year {
    public static void main(String[] args) {
        System.out.println("Enter the year");
        Scanner a=new Scanner(System.in);
        int b=a.nextInt();

        if(b%4==0) {
            System.out.println("This is leap year");
        }
        else{
            System.out.println("This is not Leap Year");
        }
    }
}
