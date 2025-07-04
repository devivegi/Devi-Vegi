package Task_25;
/* - If years of experience is less than 1 year: No bonus.
If years of experience is between 1 and 3 years: Bonus is 5% of the salary.
If years of experience is between 4 and 6 years: Bonus is 10% of the salary.
If years of experience is greater than 6 years: Bonus is 15% of the salary.*/

import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {

        System.out.println("Enter the experience");
        Scanner scanner = new Scanner(System.in);
        double experience = scanner.nextDouble();
        System.out.println("Enter salary");
        double salary = scanner.nextDouble();

        double bonus =0;
        double updatedsal = 0;

        if(experience < 1){
            System.out.println("NO Bonus for " +experience);
            updatedsal = salary;
        }
        else if (experience <= 3) {
            bonus = (salary * 5)/100;
            updatedsal = salary + bonus;
        }
        else if (experience <= 6) {
            bonus = (salary * 10) / 100;
            updatedsal = salary + bonus;
        }

        else if (experience >= 6) {
            bonus = (salary * 15) / 100;
            updatedsal = salary + bonus;
        }
        System.out.println("Salary "+ salary );
        System.out.println("Bonus "+ bonus );
        System.out.println("Updated Salary "+ updatedsal );

    }
}
