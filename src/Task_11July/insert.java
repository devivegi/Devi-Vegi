package Task_11July;

import java.util.ArrayList;
import java.util.LinkedList;

//Create a LinkedList with fruits: Apple, Banana, Mango.
//Insert Orange at index 1 and print the final list.
public class insert {
    public static void main(String[] args) {

        LinkedList Li = new LinkedList();

        Li.add("Apple");
        Li.add("Bannana");
        Li.add("Mango");

        Li.add(1, "Orange");
        System.out.println("List of Fruits: "+Li);
    }
}
