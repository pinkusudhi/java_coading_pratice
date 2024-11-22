package NumberOfTheory_Leetcode_problem_solveing.Bitmanipulation;

public class DecimalToBinary {
    public static void main(String[] args) {
        StringBuilder s=new StringBuilder();
        // Decimal to binary
        int k = 8;
        while (k!=1) {
            if (k % 2 == 1) {
                s.append('1');
            } else {
                s.append('0');
            }
            k = k / 2;
        }
        s.append('1');
        s.reverse();
        System.out.println(s);
    }
}
