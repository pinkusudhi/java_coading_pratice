package NumberOfTheory_Leetcode_problem_solveing;

public class Repeating_Gcd {
    public static void main(String[] args) {
        Repeating_Gcd repeatingGcd=new Repeating_Gcd();
        int nu=repeatingGcd.Gcd(15,60);
        System.out.println(nu);
    }
    public static int Gcd(int x, int y)
    {
        int gcd=1;
        int gcdmethodcall=gcd(x,y);
        for (int i=1;i<=gcdmethodcall;i++)
        {
            if (x%i==0 && y%i==0)
            {
                gcd=i;
            }
        }
return gcd;
    }
    public static int gcd(int num1,int num2)
    {
        int min=Math.min(num1,num2);
        return min;
    }

}
