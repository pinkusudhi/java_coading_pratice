package NumberOfTheory_Leetcode_problem_solveing;

public class Reverse_Number {
    public static void main(String[] args) {
        int nu=123;
        int sum=0;
        int rem;
        while(nu!=0)
        {
            rem=nu%10;
            sum=sum*10+rem;
            nu/=10;
        }
        System.out.println(sum);
    }
}
