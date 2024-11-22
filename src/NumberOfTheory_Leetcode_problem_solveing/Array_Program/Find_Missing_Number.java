package NumberOfTheory_Leetcode_problem_solveing.Array_Program;

public class Find_Missing_Number {
    /*Logic
    1.First the find the length of the array
    2.use length*(length+1)/2
    3.sum the nu  of the the array
    4.exatvalue-sumvalue
     */
    public static void main(String[] args) {

    int[] nu ={0,1,2,4};
    int sum=0;
    int length= nu.length;
    int exatvalue=length*(length+1)/2;
    for(int nums:nu)
    {
        sum+=nums;
    }
    System.out.println(exatvalue-sum);
}
}
