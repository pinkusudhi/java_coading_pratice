package NumberOfTheory_Leetcode_problem_solveing.String_Ptogram;

public class Check_String_isA_SubString {
    public static void main(String[] args) {
       String s1 = "hello", s2 = "helloworld";
       if (s2.contains(s1))
       {
           System.out.println("it is present ");
       }
       else {
           System.out.println("it is not present");
       }
    }
}
