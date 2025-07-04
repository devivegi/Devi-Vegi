package Task_01July;
//parameterized constructor
public class parameter {
    public static void main(String[] args) {

        details d= new details("Devi", 25 ,"Nov 22" );
        d.showdetails();
    }
}

class details {
    String name;
    int age;
    String dob;

    details(String username, int Userage, String Userdob) {
        name = username;
        age = Userage;
        dob = Userdob;
    }

    void showdetails(){
        System.out.println( "User_name = "+name + " User_age = "+age + " User_dob = "+dob);
    }

}