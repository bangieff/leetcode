package medium;

import java.util.HashMap;
import java.util.Map;

/*
Given a string s, find the length of the longest substring without duplicate characters.
 */
public class LongestUniqueSubstring {
    public int lengthOfLongestSubstring(String s) {
        int left = 0, result = 0;

        if(s !=null && !s.isEmpty()) {
            Map<Character, Integer> lastSeen = new HashMap<>();

            for (int right = 0; right < s.length(); right++) {
                char c = s.charAt(right);

                if (lastSeen.containsKey(c)) {
                    left = Math.max(left, lastSeen.get(c) + 1);
                }

                result = Math.max(result, right - left + 1);
                lastSeen.put(c, right);
            }
        }
        return result;
    }
}