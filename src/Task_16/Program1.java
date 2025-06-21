package Task_16;
/*Triangle based on its side lengths. Given three input values representing the lengths of the sides,
determine if the triangle is equilateral (all sides are equal), isosceles (exactly two sides are equal),
or scalene (no sides are equal). Use an if-else statement to classify the triangle.
 */
public class Program1 {
    public static void main(String[] args) {
        int a=5,b=5,c=10;
        if(a==b & a==c) {
            System.out.println("The triangle is equilateral");
        }
            if(a==b || a==c ||b==c){
                System.out.println("The triangle is isosceles");

            }
            else
            {
                System.out.println("The triangle is scalene");
            }
            }
        }



