package NumberOfTheory_Leetcode_problem_solveing.Bitmanipulation;

public class BinaryToDecimal {
    public static void main(String[] args) {
        String nu="1000";
        int decimal=0,power=0;
        for (int i=nu.length()-1;i>=0;i--)
        {
            char ch=nu.charAt(i);
            if(ch=='1')
            {
                decimal= (int) (decimal+Math.pow(2,power));
            }
            power++;
        }
        System.out.println(decimal);
    }
}
