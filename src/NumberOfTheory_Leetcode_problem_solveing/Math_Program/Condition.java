package NumberOfTheory_Leetcode_problem_solveing.Math_Program;

import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {
        System.out.println(reverse(12, 6));
    }

    public static int reverse(int a, int b) {
        while (b != 0) { // Continue until b becomes 0
            int temp = b; // Store the current value of b
            b = a % b; // Update b to a mod b
            a = temp; // Update a to the previous value of b
        }
        return a;
    }
}
