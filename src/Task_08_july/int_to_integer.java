package Task_08_july;
// Convert int to Integer using Autoboxing
//📘 Description:Declare an int, assign a value, and convert it to Integer using autoboxing.
//📤 Expected Output:Primitive value: 10
//Wrapper object: 10
public class int_to_integer {
    public static void main(String[] args) {

        int num = 10;
        System.out.println("Primitive Value: " + num);

        Integer wrapper = num;
        System.out.println("Wrapper object: " + wrapper);


    }
}
