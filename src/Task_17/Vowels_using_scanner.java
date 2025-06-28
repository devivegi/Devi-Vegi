package Task_17;

import java.util.Scanner;

public class Vowels_using_scanner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        char c = scanner.next().toLowerCase().charAt(1);
        if (c =='a' || c=='e' ||c=='i' ||c=='o' ||c=='u'){
            System.out.println("Vowels "+c);
        } else if (c>='a' && c<='z') {
            System.out.println("Consonants "+c);

        } else{
            System.out.println("Invalid "+c);
        }

    }
}
