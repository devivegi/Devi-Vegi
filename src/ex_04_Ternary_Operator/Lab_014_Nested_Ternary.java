package ex_04_Ternary_Operator;
//Description: Marks 90 = A+, 75 = A, 60 = B, 40 = C, below 40 Fail.
public class Lab_014_Nested_Ternary {
    public static void main(String[] args) {
        int marks=39;
        String value =(marks>=90) ? "A+":(marks<90 && marks>=75)? "A":(marks<75 && marks>=60)? "B":(marks<60 && marks>=40)? "C": "Fail";
        System.out.println(value);
    }
}
