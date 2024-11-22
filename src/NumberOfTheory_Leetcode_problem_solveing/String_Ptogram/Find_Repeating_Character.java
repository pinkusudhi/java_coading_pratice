package NumberOfTheory_Leetcode_problem_solveing.String_Ptogram;

import java.util.HashMap;

                            /* find repeting character*/
public class Find_Repeating_Character {

    public static void main(String[] args) {
        String s="pip";
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for (int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if (map.get(ch)!=1)
            {
                System.out.println(ch);
                break;
            }
        }
    }
}
