package NumberOfTheory_Leetcode_problem_solveing.Math_Program;

import java.util.Arrays;

public class Seive_Of_Eratosthenes_Algorithim {
    public static void main(String[] args) {
        boolean[]isPrime=prime(20);
        for (int i=0;i<=20;i++)
        {
            System.out.println(i+ " "+isPrime[i]);
        }
    }
    static boolean[] prime(int N)
    {
        boolean[] isPrime =new boolean[N+1];
        Arrays.fill(isPrime,true);
        isPrime[0]=false;
        isPrime[1]=false;
        System.out.println(isPrime);
        for (int i=2;i*i<=N;i++)
        {
            for (int j=i*2;j<=N;j+=i)
            {
                isPrime[j]=false;
            }
        }
        return isPrime;
    }
}
