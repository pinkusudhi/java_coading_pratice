package NumberOfTheory_Leetcode_problem_solveing.Math_Program;

public class Palindrome {
    public static void main(String[] args) {
        int x=121;
        int k=x;
        int sum = 0;
        while (k != 0) {
            int rem = k % 10;
            sum = sum * 10+ rem;
            System.out.println(sum);
            k /= 10;
        }
        if (sum == x) {
            System.out.println("palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
    }
