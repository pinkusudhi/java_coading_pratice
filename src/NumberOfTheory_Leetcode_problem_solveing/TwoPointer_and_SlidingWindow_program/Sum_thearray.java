package NumberOfTheory_Leetcode_problem_solveing.TwoPointer_and_SlidingWindow_program;

public class Sum_thearray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,-1,5,2};
        int k=2;
        int maxsum=0;
        int sum=0;
        for(int start=0;start<k;start++)
        {
            sum=sum+arr[start];
        }
        maxsum=sum;
        System.out.println(maxsum);
        for (int i=k;i<arr.length;i++)
        {
            System.out.println(arr[i]);
            System.out.println(arr[k]);
            sum=sum-arr[i-k]+arr[i];
            maxsum=Math.max(maxsum,sum);
        }
        System.out.println(maxsum);
    }
}
