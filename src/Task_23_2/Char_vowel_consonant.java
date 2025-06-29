package Task_23_2;
// Check if a Character is a Vowel or Consonant.
public class Char_vowel_consonant {

    public static void main (String args[]) {


        char ch = 'e';
        ch = Character.toLowerCase(ch);


        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {

                System.out.println("Give character is vowel " + ch);
            } else

                System.out.println("Given character is consonant " + ch);
        }
        else
            System.out.println("Given character is invalid " +ch);
    }
}
