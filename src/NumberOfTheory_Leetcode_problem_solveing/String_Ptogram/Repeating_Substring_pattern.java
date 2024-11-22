package NumberOfTheory_Leetcode_problem_solveing.String_Ptogram;

public class Repeating_Substring_pattern {
    public static void main(String[] args) {
        String s = "Hello world";
        int count=0;
        String[]sp=s.split(" ");
        for (String ch:sp)
        {
            System.out.println(ch);
            int len=ch.length();
            if(len%2==0 || len%2==1)
            {
                count=len;
            }
        }
        System.out.println(count);

    }
}
