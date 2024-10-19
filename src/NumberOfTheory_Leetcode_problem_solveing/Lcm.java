package NumberOfTheory_Leetcode_problem_solveing;

public class Lcm {
    public static void main(String[] args) {
        int first = 15;
        int last = 20;
        System.out.println("LCM of " + first + " and " + last + " is: " + findLCM(first, last));
    }

    public static int findLCM(int first, int last) {
        int factor;
        for (int i = 1;i<=first ; i++) {
            factor = last * i;
            if (factor % first == 0) {
                return factor;
            }
        }
        return 0;
    }
}
