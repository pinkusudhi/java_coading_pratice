package NumberOfTheory_Leetcode_problem_solveing.String_Ptogram;

import java.util.HashMap;

public class Longest_Substring_Without_Repeating_Characters {
    public static void main(String[] args) {
        String s = "abcabcbb";
        int maxLength = findLongestSubstringLength(s);
        System.out.println("Length of the longest substring without repeating characters: " + maxLength);
    }

    public static int findLongestSubstringLength(String s) {
        HashMap<Character, Integer> charIndexMap = new HashMap<>();
        int maxLength = 0;
        int start = 0;
        int k=1;// Left pointer for the sliding window

        for (int end = 0; end < s.length(); end++) {
            char currentChar = s.charAt(end);

            // If the character is already in the map, move the start pointer
            if (charIndexMap.containsKey(currentChar)) {
                // Move the start pointer to the right of the previous index of the character
                //start = Math.max(start, charIndexMap.get(currentChar) + 1);
                charIndexMap.put(currentChar,charIndexMap.get(currentChar)+1);
                start++;
            }

            // Update the character's index in the map
            charIndexMap.put(currentChar,end);
            System.out.println(currentChar);
            System.out.println(charIndexMap);

            // Calculate the max length
            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }
}
