package Task_24;
//Check if a Number is Prime
public class prime_number {
    public static void main(String[] args) {

        int num = 9;

        if (num <= 1) {
            System.out.println("Number is not valid");
        }
        else {
            for(int i = 2;i<=num/2; i++) {
                if (num % i == 0) {
                    System.out.println("Number is not prime");
                } else
                    System.out.println("number is  prime");
            }
        }
    }

}
