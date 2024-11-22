package NumberOfTheory_Leetcode_problem_solveing.String_Ptogram;

import java.util.HashMap;

public class Non_Repeating_Character {
    public static void main(String[] args) {
        String s="pip";
        char result=character(s);
        if (result!='\0')
        {
            System.out.println(result);
        }
        else {
            System.out.println("-1");
        }
    }
    public static char character(String s)
    {
        HashMap<Character,Integer>map=new HashMap<>();
        for (char c:s.toCharArray())
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }
      for (char c:s.toCharArray())
      {
          if(map.get(c)==1)
          {
              return c;
          }
      }
        return '\0';
    }
}
