package Task_08_july;
//Compare Wrapper objects using == and equals()
//📘 Description:Compare two Integer objects using == and .equals() and print the results.
//Expected Output:
//a == b: true
//c == d: false
//a.equals(b): true
//c.equals(d): true
public class Compare_wrapper {
    public static void main(String[] args) {


        Integer a = 100;
        Integer b = 100;
        Integer c = 200;
        Integer d = 200;

        //equal to
        System.out.println("a == b: " +(a==b));
        System.out.println("c == d: " +(c==d));

        //comparision

        System.out.println("a.equals(b):" +a.equals(b));
        System.out.println("c.equals(d):" +c.equals(d));

    }


}
