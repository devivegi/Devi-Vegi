package Task_11July;

import java.util.ArrayList;
import java.util.List;

//Create an ArrayList with these names: Amit, Neha, Suresh.
//Remove the name Neha and display the updated list.
public class removeelement {
    public static void main(String[] args) {

        List l = new ArrayList();
        l.add("Amit");
        l.add("Neha");
        l.add("Suresh");

        l.remove("Neha");
        System.out.println(l);
    }
}
