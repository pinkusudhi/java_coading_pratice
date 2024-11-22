package NumberOfTheory_Leetcode_problem_solveing.Math_Program;

class Solution {
    public static void main(String[] args) {
        System.out.println(convertToTitle(2)); // Example output: "B"
    }

    public static String convertToTitle(int columnNumber) {
        StringBuilder st = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber--; // Decrement to handle 0-based index
            char ch = (char) (columnNumber % 26 + 'A');
            st.append(ch); // Append character
            columnNumber = columnNumber / 26; // Move to next digit
        }

        return st.reverse().toString(); // Reverse and return the result
    }
}
