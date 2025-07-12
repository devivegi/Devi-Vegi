package Task_11July;

import java.util.ArrayList;
import java.util.List;

//Create an ArrayList of student names. Add the following 5 students:
//Dipak, Ravi, Sneha, Priya, Anjali.
//Then display all names using a loop.
public class addelementinarray {
    public static void main(String[] args) {


        List l = new ArrayList();
        l.add("Dipak");
        l.add("Ravi");
        l.add("Sneha");
        l.add("Priya");
        l.add("Anjali");

        //System.out.println(l);

        for (int i = 0; i <l.size(); i++) {
            System.out.println(l.get(i));
        }

    }
}