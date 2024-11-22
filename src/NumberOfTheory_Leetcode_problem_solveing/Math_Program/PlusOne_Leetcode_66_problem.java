package NumberOfTheory_Leetcode_problem_solveing.Math_Program;

public class PlusOne_Leetcode_66_problem {
    public static void main(String[] args) {
        // Example input to test the function
        int[] digits = {9};

        // Creating an instance of the class to call the plusOne method
        PlusOne_Leetcode_66_problem solution = new PlusOne_Leetcode_66_problem();
        int[] result = solution.plusOne(digits);

        // Printing the result
        for (int digit : result) {
            System.out.print(digit + " ");
        }
    }

    public int[] plusOne(int[] digits) {
        int n = digits.length;

        // Loop through the digits array from the end to the beginning
        for (int i = n - 1; i >= 0; i--) {
            // If the current digit is less than 9, increment it and return the array
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            // If the digit is 9, set it to 0
            digits[i] = 0;
        }

        // If all digits were 9, we need to create a new array with an extra digit
        int[] result = new int[n + 1];
        result[0] = 1; // The most significant digit will be 1, and the rest will be 0 by default

        return result;
    }
}
