package Task_11July;

import java.util.LinkedList;

//Create a LinkedList and add the following numbers:
//10, 20, 30, 40.
//Reverse the list and print the output.
public class reverselinkedlist {
    public static void main(String[] args) {

        LinkedList li = new LinkedList();
        li.add(10);
        li.add(20);
        li.add(30);
        li.add(40);


        System.out.println(li.reversed());
    }
}
