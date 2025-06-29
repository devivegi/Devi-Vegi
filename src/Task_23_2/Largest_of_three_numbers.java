package Task_23_2;
//Find the Largest of Three Numbers.
public class Largest_of_three_numbers {

    public static void main(String[] args){

        System.out.println("34, 46, 120");
        int num1 = 34, num2 = 46, num3 = 120;

        if(num1 == num2 && num2==num3);

        if(num1 >= num2){
            System.out.println("Number one largest " +num1);
        }

        else if (num2 >= num3) {
            System.out.println("Number two is largest " + num2);
        }

        else
            System.out.println("Number three is largest "+num3);
}
}
