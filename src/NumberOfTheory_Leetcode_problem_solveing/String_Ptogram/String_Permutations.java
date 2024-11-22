package NumberOfTheory_Leetcode_problem_solveing.String_Ptogram;

import java.util.HashMap;

public class String_Permutations {
    /*
    Input two strings from the user.
    If the lengths of the strings are not equal, they can't be permutations.
    If the lengths are equal, check the frequency of characters in both strings.
    If the character frequencies match, the strings are permutations of each other.
     */
    public static void main(String[] args) {
        HashMap<Character,Integer>map=new HashMap<>();
        String s= "listen";
        String g= "silent";

        if (s.length()!=g.length())
        {
            System.out.println("It is not string permutations");
            System.exit(0);
        }
        else {
            System.out.println("String is permutation");
        }
        for(char ch:s.toCharArray())
        {
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        System.out.println(map);
        for(char ch:g.toCharArray())
        {

            if (map.containsKey(ch))
            {
                map.put(ch,map.get(ch)-1);
            }
        }
        System.out.println(map);
        for (int value:map.values())
        {
            if(value!=0)
            {
                System.out.println("It is not a permutations");
            }

        }
        System.out.println("String is permutations");
    }
}
