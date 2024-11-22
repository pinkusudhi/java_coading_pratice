package NumberOfTheory_Leetcode_problem_solveing.Math_Program;

public class Check_prime {
    public static void main(String[] args) {
        int nu=37;
        System.out.println(prime(nu));
    }
    public static int prime(int N)
    {
        /*
        Brute force approach
         */
        int count=0;
        for (int i=1;i<=N;i++)
        {
            if (N%i==0)
            {
                System.out.println(i);
                count++;
            }
            if (count>2)
            {
                System.out.println("This is not prime");
            }
        }

        return count;
    }
}
