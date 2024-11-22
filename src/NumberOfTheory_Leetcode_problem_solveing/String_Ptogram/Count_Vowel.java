package NumberOfTheory_Leetcode_problem_solveing.String_Ptogram;

import java.util.HashSet;
import java.util.Set;

public class Count_Vowel {
    public static void main(String[] args) {
        String s="sudhi ranjan samantray";
        int count=0;
        Set<Character>vowels=new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        for (char ch:s.toCharArray())
        {
            if (vowels.contains(Character.toLowerCase(ch)))
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
