package Task_25;

import java.util.Scanner;

/*Electricity Bill Calculation (Based on Units Consumed)
Define the rate structure for calculating the bill based on the number of units consumed.
First 100 units: 0.50Rs per unit
 Next 100 units (101-200): 0.75Rs per unit
Next 100 units (201-300): 1.20Rs per unit
Above 300 units: 1.50Rs per unit*/
public class Electricity_bill {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Units");
        int unit = scanner.nextInt();

        double rate;

        if (unit <= 100) {
            rate = unit * 0.50;
        } else if (unit <= 200) {
            rate =(unit*0.75);
        } else if (unit <= 300) {
            rate = (unit*1.20);
        } else {
            rate = (unit * 1.50);
        }
        System.out.println("Electricity Bill: " +rate);
    }
}