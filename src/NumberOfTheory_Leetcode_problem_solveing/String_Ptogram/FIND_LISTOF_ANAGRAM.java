package NumberOfTheory_Leetcode_problem_solveing.String_Ptogram;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FIND_LISTOF_ANAGRAM {
    public static void main(String[] args) {
        String s = "listen";
        List<String>list=new ArrayList<>();
        List<String>words =new ArrayList<>();
        words.add("enlist");
        words.add("google");
        words.add("inlets");
        words.add("banana");
        System.out.println(words);
        HashMap<Character,Integer>map=new HashMap<>();

        for (char ch:s.toCharArray())
        {
           map.put(ch, map.getOrDefault(ch,0)+1);
        }
        System.out.println(map);

        for (String k:words)
        {
            HashMap<Character,Integer>map1=new HashMap<>(map);
            boolean b=true;
           for (char ch:k.toCharArray())
           {
               if (map1.containsKey(ch)) {
                   map1.put(ch, map1.get(ch) - 1);
                   if (map1.get(ch)== 0) // for negative purpose this condition
                   {
                       b = true;
                       break;
                   }
               }
                   else {
                       b=false;
                       break;// for not found logic
                   }
           }
            if (b)
            {
                list.add(k);
            }
        }
        System.out.println(list);
    }
}
