package NumberOfTheory_Leetcode_problem_solveing.Math_Program;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class prime_nu {
    public static void main(String[] args) {
        int n=10;
        System.out.println(prime(n));
    }
    public static List<Integer> prime(int n)
    {
        List<Integer> list=new ArrayList();

       for(int i=2;i<=n;i++)
       {
           boolean isprime=true;
           for(int j=2;j<=Math.sqrt(i);j++)
           {
               if (i%j==0)
               {
                   isprime=false;
                   break;
               }
           }
           if (isprime)
           {
               list.add(i);
           }
       }
       return list;
    }
}
