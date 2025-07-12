package Task_11July;

import java.util.ArrayList;
import java.util.List;

//Create an ArrayList of cities: Mumbai, Delhi, Pune.
//Check if Pune is present in the list. Print a message accordingly.
// (you can use If Condition to check the Pune city and you can take the City name from User)
public class findelement {
    public static void main(String[] args) {

        List l = new ArrayList();
        l.add("Mumabi");
        l.add("Delhi");
        l.add("Pune");

        if(l.contains("Pune")){
            System.out.println("Pune is in the list");
        }
        else
            System.out.println("Pune is not in the list");
    }
}
