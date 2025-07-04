package Task_24;

import java.util.Scanner;

/* Initialize the account balance with a fixed amount (e.g., ₹10,000).
2️⃣ Take user input for the amount they want to withdraw.
3️⃣ Check withdrawal conditions: The amount should be greater than zero.
The amount should be a multiple of 100 (common ATM rule).
The amount should not exceed the account balance.
4️⃣ Deduct the amount from the balance if conditions are met.
5️⃣ Display the updated balance or an error message if the withdrawal fails.*/
public class atm_withdrawl {

    public static void main(String[] args) {

        int balance=10000;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount");
        int amount = sc.nextInt();

        if (amount <= 0) {
            System.out.println("The amount should be greater than zero");
        }
        else if(amount % 100 !=0){
            System.out.println("The amount should be a multiple of 100");
            
        } else if (amount > balance) {
            System.out.println("The amount should not exceed the account balance");
            
        } else {
            balance -= amount;
            System.out.println("Sucessfull witdrawl");
            System.out.println("Remaing balance " + balance);
        }
        }

}