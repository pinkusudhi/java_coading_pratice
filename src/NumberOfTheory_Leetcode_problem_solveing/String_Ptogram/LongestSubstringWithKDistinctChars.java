package NumberOfTheory_Leetcode_problem_solveing.String_Ptogram;

import java.util.HashMap;

public class LongestSubstringWithKDistinctChars {
    public static int longestSubstringKDistinct(String s, int k) {
        if (s == null || s.length() == 0 || k == 0) {
            return 0;
        }

        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0;
        int maxLength = 0;

        // Sliding window: right pointer expands the window
        for (int right = 0; right < s.length(); right++) {
            char rightChar = s.charAt(right);
            map.put(rightChar, map.getOrDefault(rightChar, 0) + 1);

            // Track pattern as we expand
            System.out.println(rightChar + "=" + right);

            // Shrink the window if there are more than 'k' distinct characters
            while (map.size() > k) {
                char leftChar = s.charAt(left);
                System.out.println(leftChar + "=" + left);  // Track as we shrink
                map.put(leftChar, map.get(leftChar) - 1);

                // Remove the character if its count drops to zero
                if (map.get(leftChar) == 0) {
                    map.remove(leftChar);
                }
                left++;  // Move the left pointer to shrink the window
            }

            // Update the max length of the substring
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String s = "eceba";
        int k = 2;
        System.out.println("Longest substring length: " + longestSubstringKDistinct(s, k));  // Output: 3
    }
}
