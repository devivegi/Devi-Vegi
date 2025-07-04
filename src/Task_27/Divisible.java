package Task_27;

import java.util.Scanner;

//Check if a Number is Divisible by 5 and 11
public class Divisible {
    public static void main(String[] args) {
        //  int a = 55;
        System.out.println("Enter the number");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if(a % 5==0 && a % 11 ==0){
            System.out.println("number is Divisble by 5 and 11: " +a);
        }
else{
            System.out.println("number is not Divisble by 5 and 11:" +a);
        }
    }
}
