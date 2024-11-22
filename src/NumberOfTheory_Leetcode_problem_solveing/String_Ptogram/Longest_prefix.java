package NumberOfTheory_Leetcode_problem_solveing.String_Ptogram;

import java.util.Arrays;

public class Longest_prefix {
    public static void main(String[] args) {
        String[] k={"club","clow","clown","clone"};
        System.out.println(longestCommonPrefix(k));
    }
    public static String longestCommonPrefix(String[] strs) {
        StringBuilder s=new StringBuilder();
        // sort the array
        Arrays.sort(strs);
        // fetch the first indexcharacter and last indexcharacter

        char[]first=strs[0].toCharArray();
        char []last=strs[strs.length-1].toCharArray();
        for(int i=0;i<strs.length;i++)
        {
            if(first[i]!=last[i])
            {
                break;
            }
            s.append(first[i]);
        }
        return s.toString();
    }
}

