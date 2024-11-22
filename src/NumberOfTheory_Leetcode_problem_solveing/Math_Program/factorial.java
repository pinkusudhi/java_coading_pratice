package NumberOfTheory_Leetcode_problem_solveing.Math_Program;

public class factorial {
    public static void main(String[] args) {
        int N=6;
        System.out.println(factorial(6));
    }
    public static int factorial(int N)
    {
        int fact=1;
        for(int i=1;i<=N;i++)
        {
            fact*=i;
            if (fact==N)return 1;
            if(fact>N)break;
        }
        return 0;
    }
}
