package NumberOfTheory_Leetcode_problem_solveing.Math_Program;

public class GeekOfGeekMaths {
    public static void main(String[] args) {
        int N = 2;
        int x = 2;
        int y = 3;
        System.out.println(findGCDOfRepeatedNumbers(N,x,y));
    }
    public static String findGCDOfRepeatedNumbers(int N, int x, int y) {
        int gcdValue = gcd(x, y);  // Step 1: Calculate gcd of x and y
        return String.valueOf(N).repeat(gcdValue);  // Step 2: Repeat N gcd(x, y) times
    }

    // Helper method to calculate gcd using Euclid's algorithm
    public static int gcd(int a, int b) {
        int min=(a>b)?a:b;
        int g=0;
        for(int i=1;i<=min;i++)
        {
            if(a%i==0 && b%i==0)
            {
                g=i;
            }
        }
        return g;
    }
}
