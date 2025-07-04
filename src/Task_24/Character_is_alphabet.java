package Task_24;
//Check if a Character is an Alphabet.
public class Character_is_alphabet {

    public static void main(String[] args) {

        char ch = '*';
        //ch = Character.toLowerCase(ch);


        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            System.out.println("Character is Alphabet : " + ch);
        } else {
            System.out.println("Character is Not an Alphabet :" + ch);
        }
    }
}