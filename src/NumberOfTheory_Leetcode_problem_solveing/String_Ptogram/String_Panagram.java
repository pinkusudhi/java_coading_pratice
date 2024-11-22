package NumberOfTheory_Leetcode_problem_solveing.String_Ptogram;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

public class String_Panagram {
    public static void main(String[] args) {
        String panagram="The quick brown fox jumps over the lazy dog";
        HashSet<Character>set=new HashSet<>();
        String l=panagram.toLowerCase();
        System.out.println(l);
        for (int i=0;i<l.length();i++)
        {
            char ch=l.charAt(i);
            if(ch>='a' && ch<='z')
            {
                set.add(ch);
            }
        }
        if (set.size()==26)
        {
            System.out.println("String is panagram");
        }
        else {
            System.out.println("String is not a panagram");
        }
    }
}
