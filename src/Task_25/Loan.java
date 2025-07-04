package Task_25;

import java.util.Scanner;

/*Check if a Person is Eligible for a Loan (Based on Age, Salary, and Credit Score)
Take the below User info and store it into the variables:
Age (integer), Salary (double or float) ,Credit Score (integer)
Age Validation:- Check if the age is a positive integer.
  :- Ensure the age is at least 18 years old.
:- Max age can be 80.
Salary Validation: :- Check if the salary is a positive number.
:- Define a minimum salary threshold (e.g., 30,000).
Credit Score Validation: :- Check if the credit score is a positive integer.
:- Define a minimum credit score threshold (e.g., 650).
:- Max credit score threshold (e.g., 850).*/
public class Loan {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter age");
        int age = scanner.nextInt();

        System.out.println("Enter Salary");
        double salary = scanner.nextDouble();

        System.out.println("Enter Credit Score");
        int creditscore = scanner.nextInt();

        boolean agevalidation = age >= 18 && age <= 80;
        boolean salaryvalidation = salary >= 30000;
        boolean creditvalidation = creditscore >= 650 && creditscore <= 850;

        if (agevalidation && salaryvalidation && creditvalidation) {
            System.out.println("Person is elgible for loan");
        } else {
            System.out.println("Person is not elgible for loan");
        }
    }
}