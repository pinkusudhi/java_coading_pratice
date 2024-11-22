package NumberOfTheory_Leetcode_problem_solveing.Math_Program;

import java.util.Arrays;

public class hyf {
    public static void main(String[] args) {
        int nu=10;
        Boolean[] isprime=prime(nu);
        for (int i=1;i<=nu;i++) {
            System.out.println(i+" "+isprime[i]);
        }
    }
    static Boolean[] prime(int nu)
    {

        Boolean[]primen=new Boolean[nu+1];
        Arrays.fill(primen,true);
        primen[0]=false;
        primen[1]=false;
            for (int i=2;i*i<=nu;i++)
            {
                for (int j=i*2;j<=nu;j+=i)
                {
                    primen[j]=false;
                }
            }
            return primen;
        }
    }

