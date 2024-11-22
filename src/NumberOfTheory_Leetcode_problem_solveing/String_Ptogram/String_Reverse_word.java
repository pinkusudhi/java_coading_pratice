package NumberOfTheory_Leetcode_problem_solveing.String_Ptogram;

public class String_Reverse_word {
    public static void main(String[] args) {
        String s="Hello world";
        StringBuilder stringBuilder=new StringBuilder();
        String[]words=s.split(" ");
        for(String word:words)
        {
            StringBuilder stringBuilder1=new StringBuilder(word);
           stringBuilder.append(stringBuilder1.reverse().append(" "));
        }
        System.out.println(stringBuilder.toString().trim());
    }
}
