package NumberOfTheory_Leetcode_problem_solveing.Math_Program;

import java.util.ArrayList;
import java.util.List;

public class LCM_GCD {
    public static void main(String[] args) {
        ArrayList<Integer>list=primefactor(780);
        System.out.println(list);
         // This should correctly print all 9 factors of 36
    }
    static ArrayList<Integer> primefactor(int N)
    {
        ArrayList list=new ArrayList();
        for(int i=2;i*i<=N;i++)
        {
            if(N%i==0)
            {
                list.add(i);
                while(N%i==0) {
                    N = N / i;
                }
            }
        }
        if (N>1)
        {
            list.add(N);
        }
        return list;
    }
}
