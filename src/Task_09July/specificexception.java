package Task_09July;
//Catch Specific vs Generic ExceptionDescription:
//Try the same code twice — once using catch(Exception e) and once using catch(NullPointerException e).
//Compare output and behavior.
public class specificexception {
    public static void main(String[] args) {


        try {
            String s= null;
            System.out.println(s.length());
        }
        catch (Exception e) {
            System.out.println("Caught generic exception:" +e);
        }


        try {
            String s= null;
            System.out.println(s.length());
        }
        catch (NullPointerException e) {
            System.out.println("Caught specific exception:" +e.getClass());
        }
    }
}