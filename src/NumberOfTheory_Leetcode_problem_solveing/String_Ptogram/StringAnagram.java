package NumberOfTheory_Leetcode_problem_solveing.String_Ptogram;

import java.util.HashMap;
/*
Step 1-check the length of the string is equal the prossed further
step 2-first find the frequency of first string
step 3-Second sstring frequency reduce
step 4-check the map is 0 that time that is anagram
 */import java.util.HashMap;

public class StringAnagram {
    public static void main(String[] args) {
        String s = "sudhi";
        String p = "suhdi";

        if(s.length() != p.length()) {
            System.out.println("Strings are not of equal length, so they are not anagrams.");
            return;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(map.containsKey(ch))
            {
                map.put(ch,map.get(ch)+1);
            }
            else
            {
                map.put(ch,1);
            }
        }
        System.out.println(map);
        for(int i=0;i<p.length();i++)
        {
            char ch=p.charAt(i);
            if(map.containsKey(ch))
            {
                map.put(ch,map.get(ch)-1);
            }
            else
            {
                System.out.println("Strings are not anagrams.");
                return;
            }
        }
        System.out.println(map);
        for (int value : map.values()) {
            if (value != 0) {
                System.out.println("Strings are not anagrams.");
                return;
            }
        }
        System.out.println(s + " and " + p + " are anagrams.");

    }
}
