package Task_18;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
//Write a program that calculates and displays the letter grade for a given numerical score (e.g., A, B, C, D, or F) based on the following grading scale:
//
//A: 90-100
//
//B: 80-89
//
//C: 70-79
//
//D: 60-69
//
//F: 0-59
        System.out.println("Enter number between 1-100");
        Scanner sc=new Scanner(System.in);
        int grade=sc.nextInt();

        if(grade>=90 && grade<=100){
            System.out.println("A");
        }
        else if (grade>=80 && grade<=89) {
            System.out.println("B");
        }
        else if (grade>=70 && grade<=79) {
            System.out.println("C");
        }
        else if (grade>=60 && grade<=69 ){
            System.out.println("D");

        }
        else if (grade>=0 && grade<=59) {
            System.out.println("F");
        }
    }
}
