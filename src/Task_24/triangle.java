package Task_24;

import java.util.Scanner;

//Check if a Triangle is Valid Based on Three Sides.
public class triangle {
    public static void main(String[] args) {

        System.out.println("Enter the side1");
        Scanner sc=new Scanner(System.in);
        int side1 =sc.nextInt();
        System.out.println("Enter the side2");
        int side2 =sc.nextInt();
        System.out.println("Enter the side3");
        int side3 =sc.nextInt();

        if(side1+side2>=side3 && side2+side3>=side1 && side3+side1>=side2){
            System.out.println("This is vaid triangle");
        }
        else
            System.out.println("This is invalid triangle");
        }
    }
