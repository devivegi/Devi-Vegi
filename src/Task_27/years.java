package Task_27;
/*Convert Days into Years, Months, and Days.
Assume 1 year = 365 days.
Assume 1 month = 30 days
Convert the Days into Years, Month and days and Print it.*/

import java.sql.SQLOutput;
import java.util.Scanner;

public class years {
    public static void main(String[] args) {

        System.out.println("Enter the days");
        Scanner scanner = new Scanner(System.in);
        int days = scanner.nextInt();

        int year = days/365;
        int remainingday = days % 365;
        int months = remainingday/30;
        int remainingdays = remainingday % 30;

        System.out.println(year+ " Years," + months+ " Months, and " + remainingdays+ " Days");
    }
}
