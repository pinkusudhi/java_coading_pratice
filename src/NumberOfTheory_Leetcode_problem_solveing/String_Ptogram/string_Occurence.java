package NumberOfTheory_Leetcode_problem_solveing.String_Ptogram;

import java.util.HashMap;
import java.util.Map;

public class string_Occurence {
    public static void main(String[] args) {
        String s="sudhi ranjan samantray";
        s=s.trim().replaceAll(" ","");
        System.out.println(s);
        HashMap<Character,Integer>map=new HashMap<>();
        for (char ch:s.toCharArray())
        {
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}
