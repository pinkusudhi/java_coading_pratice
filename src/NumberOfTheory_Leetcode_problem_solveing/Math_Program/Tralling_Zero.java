package NumberOfTheory_Leetcode_problem_solveing.Math_Program;

public class Tralling_Zero {
    public static void main(String[] args) {
        int res=0;
        int nu=25;
        for(int i=5;i<=nu;i=i*5)
        {
            res=res+nu/i;
        }
        System.out.println(res);
    }
}
