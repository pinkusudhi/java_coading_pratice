package NumberOfTheory_Leetcode_problem_solveing.Math_Program;

import java.util.ArrayList;
import java.util.List;

import static NumberOfTheory_Leetcode_problem_solveing.Factorial.factor;

public class Prime_factor {
    public static void main(String[] args) {
        int nu=10;
        System.out.println(getPrimesInRange(nu));

    }
    static List<Integer> getPrimesInRange(int range) {
        List<Integer> primeList = new ArrayList<>();

        for (int i = 2; i <= range; i++) {
            if (isPrime(i)) {
                primeList.add(i);
            }
        }

        return primeList;
    }
    static boolean isPrime(int num) {
        if (num <= 1) return false; // Numbers less than or equal to 1 are not prime

        for (int i = 2; i * i <= num; i++) {
            for(int j=i*2;j<=num;j=j+i) {
                if (num % i == 0) {
                    return false; // Found a divisor, so num is not prime
                }
            }
        }

        return true; // No divisors found, so num is prime
    }
}
