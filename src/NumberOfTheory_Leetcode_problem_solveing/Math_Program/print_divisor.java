package NumberOfTheory_Leetcode_problem_solveing.Math_Program;


import java.util.ArrayList;
import java.util.Arrays;

public class print_divisor {
    public static void main(String[] args) {
        int N=36;
        System.out.println(Arrays.toString(divisor(N)));
    }
    public static Integer[] divisor(int N)
    {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i * i <= N; i++) {
            if (N % i == 0) {
                list.add(i); // Add the divisor
                if (N / i != i) { // Add the paired divisor only if it's different
                    list.add(N / i);
                }
            }
        }
        return list.toArray(new Integer[0]);
    }
}
