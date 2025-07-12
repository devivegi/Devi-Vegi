package Task_02July;

//Create a class User with a method login().
//Extend it with a class AdminUser that adds a method accessAdminPanel().
//Then create a SuperAdmin class that extends AdminUser and adds a method shutdownSystem().
//Use an object of SuperAdmin to call all three
public class multilevelinherit {
    public static void main(String[] args) {

        SuperAdmin sa = new SuperAdmin();
        sa.login();
        sa.accessAdminpanel();
        sa.shutdownSystem();

        }
    }


class User{
void login(){
    System.out.println("Login to the user");
}
}

class AdminUser extends User{

    void accessAdminpanel(){
        System.out.println("Access to the admin panel");
    }
}

class SuperAdmin extends AdminUser{
void shutdownSystem(){
    System.out.println("Then shout down the system");
}
}