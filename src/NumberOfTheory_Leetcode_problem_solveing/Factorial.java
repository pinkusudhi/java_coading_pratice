package NumberOfTheory_Leetcode_problem_solveing;

public class Factorial {
    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        int N = 6; // Example number
        int productOfFactors = factorial.factor(N);
        System.out.println(productOfFactors);

        Factorial factorial1=new Factorial();
        int number=25;
        int factors=factorial1.factor(number);
        System.out.println(factors);

    }
    public static int factor(int N)
    {
        // find the factor
        int fac=1;
        int sqrt=(int )Math.sqrt(N);
        for (int i=1;i<=sqrt;i++)
        {
            // when  i is a factor same case N/i is also a factorthat case you need to handle repeating things
            if(N%i==0)
            {
                if(i==N/i)
                {
                    fac=fac*i;
                }
                else {
                    fac=(fac*i*(N/i));
                }
            }
        }
        return fac;

    }
}
