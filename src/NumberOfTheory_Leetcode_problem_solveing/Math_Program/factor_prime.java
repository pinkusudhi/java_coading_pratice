package NumberOfTheory_Leetcode_problem_solveing.Math_Program;

import java.util.ArrayList;
import java.util.List;

public class factor_prime {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(primefact(n));
    }

    public static int primefact(int N) {
        int prod = 1;

        for (int i = 2; i*i<= N; i++) {
            if (N % i == 0) {
                prod *= i;
                while (N % i == 0) {
                    N /= i;

                }

                if (N > 1) {
                    prod *= N;
                }
            }

        }
        return prod;
    }
}
