package medium;

import common.ListNode;
import easy.*;

public class TestMedium {
    public void runTests() {
        this.testAdd2Numbers();
        this.testLongestUniqueSubstring();
    }

    private void testAdd2Numbers() {
        Add2Numbers add2Numbers = new Add2Numbers();
        System.out.println("Add2Numbers: " + add2Numbers.addTwoNumbers(new ListNode(0, new ListNode(8)), new ListNode(6, new ListNode(7))));
    }

    private void testLongestUniqueSubstring() {
        LongestUniqueSubstring longestUniqueSubstring = new LongestUniqueSubstring();
        System.out.println("longestUniqueSubstring: " + longestUniqueSubstring.lengthOfLongestSubstring(""));
        System.out.println("longestUniqueSubstring: " + longestUniqueSubstring.lengthOfLongestSubstring("bbb"));
        System.out.println("longestUniqueSubstring: " + longestUniqueSubstring.lengthOfLongestSubstring("abcabcbb"));
        System.out.println("longestUniqueSubstring: " + longestUniqueSubstring.lengthOfLongestSubstring("pwwkew"));
    }
}
