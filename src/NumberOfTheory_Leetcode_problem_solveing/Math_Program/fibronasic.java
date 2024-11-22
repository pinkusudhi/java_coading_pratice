package NumberOfTheory_Leetcode_problem_solveing.Math_Program;

class FibonacciMemoization {

    public static void main(String[] args) {
        int n = 10;
        int a = 0;
        int b = 1;
        int c = 0; // Declare 'c' outside the loop

        for (int i = 1; i < n; i++) { // Loop should run until 'n-1' iterations
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println("The " + n + "th Fibonacci number is: " + c);
    }
}
