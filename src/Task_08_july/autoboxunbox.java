package Task_08_july;
//Description:
//Demonstrate automatic conversion from int to Integer (Autoboxing)
// and back from Integer to int (Unboxing).
//📤 Expected Output:Primitive: 50
//Wrapper: 50
//Unboxed again: 50
public class autoboxunbox {
    public static void main(String[] args) {
         int num = 50;
        System.out.println("Primitive: " +num);

        Integer wrapper = num;
        System.out.println("wrapper: " +wrapper);

        int unbox = wrapper;
        System.out.println("Unboxed again: " +unbox);


    }
}
