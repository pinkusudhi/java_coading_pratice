package NumberOfTheory_Leetcode_problem_solveing.String_Ptogram;

import java.util.HashMap;
import java.util.Map;

public class String_First_Non_Repeating_Character {
    public static void main(String[] args) {
        String s="sudhisud";
        HashMap<Character,Integer>map=new HashMap<>();
        for(char k:s.toCharArray())
        {
            map.put(k,map.getOrDefault(k,0)+1);
        }
        System.out.println(map);
        for (char ch:s.toCharArray())
        {
            if (map.get(ch)==1)
            {
                System.out.println(ch);
                break;
            }
        }
    }
}
