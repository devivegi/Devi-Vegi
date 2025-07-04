package Task_25;
/*Find if a Person Can Travel Based on Visa Status and Age.
  Age (integer) ,Visa Status (String or boolean).
Check Eligibility:
 If age is 18 or older and visa status is valid, the person can travel.
 Otherwise, the person cannot travel.
Validation Criteria
Age: - Must be a non-negative integer.
:- Should be greater than or equal to 18 to be eligible to travel.
Visa Status :- Must be a valid string indicating the visa status (e.g., "valid" or "invalid").
 You can also use a boolean where true indicates a valid visa and false indicates an invalid visa.*/

import java.util.Scanner;

public class Travel {
    public static void main(String[] args) {

        System.out.println("Enter the age");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        System.out.println("Status of visa");
        //String status = scanner.next();
       boolean status = scanner.hasNextBoolean();

        if(age >= 18 &&  status){
            System.out.println("Person can Travel ");
        }
        else{
            System.out.println("Person can not Travel");
        }
    }
}
