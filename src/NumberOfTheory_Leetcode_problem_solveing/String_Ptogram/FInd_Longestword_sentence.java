package NumberOfTheory_Leetcode_problem_solveing.String_Ptogram;

public class FInd_Longestword_sentence {
    public static void main(String[] args) {
        String s="The quick brown fox jumps over the lazy dog";
        String[] k=s.split(" ");
        String longestWord = "";
        int maxlength=0;
        for (String j:k)
        {
            if(j.length()>longestWord.length())
            {
                longestWord=j;
                maxlength=j.length();
            }
        }
        System.out.println(longestWord);
        System.out.println(maxlength);
    }
}
