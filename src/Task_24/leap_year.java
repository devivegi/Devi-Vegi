package Task_24;
//Check if a Year is a Leap Year.
public class leap_year {
    public static void main(String[] args) {

        int year = 2025;

        if(year % 4 ==0){
            System.out.println("Given year is leap year " +year);
        }
        else
            System.out.println("Given year is not leap year " +year);
    }
}
