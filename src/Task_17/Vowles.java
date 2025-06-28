package Task_17;

public class Vowles {
    public static void main(String[] args) {

        String s ="Devi Vegi is Learning Java";
int Vowels=0;
int Consonants=0;

s=s.toLowerCase();
      //  System.out.println(input);
        for(int i=0; i<s.length(); i++){
            char c=s.charAt(i);
            if(c=='a' || c=='e' ||c=='i' || c=='o' || c=='u'){
                Vowels++;
            }
            else{
                Consonants++;
            }
        }
        System.out.println("No of Vowels: " +Vowels);
        System.out.println("No of Consonants: " +Consonants);

    }
}
