package Task_09July;

import java.io.FileNotFoundException;
import java.io.FileReader;

// Handle Checked Exception using Try-CatchDescription:
//Open a file using FileReader and handle FileNotFoundException using try-catch
public class checkedexception {

    public static void main(String[] args) throws FileNotFoundException {

        try{
            FileReader fileReader = new FileReader("fileread.txt");
            System.out.println("File found");
        } catch (FileNotFoundException e) {
            System.out.println("File not found:" +e.getMessage());
        }
    }
}
