package NumberOfTheory_Leetcode_problem_solveing.String_Ptogram;

public class String_contains_only_digit {
    public static void main(String[] args) {
        String s="12345";
        boolean digit=true;

        for (int i=0;i<s.length();i++)
        {
            if (!Character.isDigit(s.charAt(i)))
            {
                digit=false;
                break;
            }
        }
        if (digit)
        {
            System.out.println("all are digit");
        }
        else {
            System.out.println("not are digit");
        }
    }
}
