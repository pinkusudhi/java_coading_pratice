package NumberOfTheory_Leetcode_problem_solveing.Math_Program;

import java.awt.print.PrinterGraphics;
import java.util.ArrayList;
import java.util.List;

public class Math_Problem {
    public static void main(String[] args) {
        List<Integer>list=primefactor(20);
        System.out.println(list);
    }
    static List<Integer>primefactor(int N)
    {
        List<Integer>list=new ArrayList<>();
        for(int i=2;i*i<=N;i++)
        {
            if(N%i==0)
            {

                while(N%i==0)
                {
                    list.add(i);
                    N=N/i;
                }
                if(N>1)
                    list.add(N);
            }

        }
        return list;
    }

}
