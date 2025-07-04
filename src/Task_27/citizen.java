package Task_27;
/* Find if a Person is Senior Citizen Based on Age.take the age input from the user.
Implement Age Category Logic:Define the criteria for different age categories:
Child: Age 0 to 12, Teenager: Age 13 to 19,Adult: Age 20 to 64,Senior Citizen: Age 65 and older*/

import java.util.Scanner;

public class citizen {
    public static void main(String[] args) {

        System.out.println("Enter the age");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if(age < 0){
            System.out.println("Enter data is invalid: " +age);
        }
       else if(age>=0 && age<=12){
            System.out.println("person is child: " +age);
        }
        else if(age>=13 && age<=19){
            System.out.println("person is Teenage: " +age);
        }
        else if(age>=20 && age<=64){
            System.out.println("person is Adult: " +age);
        }
        else {
            System.out.println("Person is Senior Citizen: " +age);
        }
    }
}
