package NumberOfTheory_Leetcode_problem_solveing.String_Ptogram;

import java.util.HashMap;
import java.util.Map;

public class Occurence_Each_word {
    public static void main(String[] args) {
        String s="Hello world";
        HashMap<String,Integer>map=new HashMap<>();
        String[]a=s.split(" ");
        System.out.println(map);
        for(String word:a)
        {
           map.put(word,map.getOrDefault(word,0)+1);
        }
        System.out.println(map);
        for (Map.Entry<String,Integer>stringIntegerEntry:map.entrySet())
        {
            System.out.println(stringIntegerEntry.getKey());
            System.out.println(stringIntegerEntry.getValue());
        }
    }
}
