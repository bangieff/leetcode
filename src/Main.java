import common.ListNode;
import easy.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        test2Sum();
//        testPalindrome();
//        testRoman2Int();
//        testCommonPrefix();
//        testvalidParentheses();
        testMerge2Lists();
    }

    private static void testMerge2Lists() {
        MergeTwoLists mergeTwoLists = new MergeTwoLists();
        System.out.println("MergeTwoLists Result: " + mergeTwoLists.mergeTwoLists(new ListNode(1, new ListNode(2, new ListNode(4))), new ListNode(1, new ListNode(3, new ListNode(4)))));
    }

    private static void testvalidParentheses() {
        ValidParentheses validParentheses = new ValidParentheses();
        System.out.println("ValidParentheses Result: " + validParentheses.isValid("(abc)"));
        System.out.println("ValidParentheses Result: " + validParentheses.isValid("(a)[c]{v}"));
        System.out.println("ValidParentheses Result: " + validParentheses.isValid("123(]asd"));
        System.out.println("ValidParentheses Result: " + validParentheses.isValid("(d[4)4]"));
        System.out.println("ValidParentheses Result: " + validParentheses.isValid("([])"));
        System.out.println("ValidParentheses Result: " + validParentheses.isValid("("));
    }

    private static void testCommonPrefix() {
        CommonPrefix commonPrefix = new CommonPrefix();
        System.out.println("CommonPrefix Result: " + commonPrefix.longestCommonPrefix(new String[]{"ab","a"}));
        System.out.println("CommonPrefix Result: " + commonPrefix.longestCommonPrefix(new String[]{"flower","flow","flight"}));
        System.out.println("CommonPrefix Result: " + commonPrefix.longestCommonPrefix(new String[]{"dog","racecar","car"}));
    }

    private static void testRoman2Int() {
        Roman2Int roman2Int = new Roman2Int();
        System.out.println("Roman2Int Result: " + roman2Int.romanToInt("III"));
        System.out.println("Roman2Int Result: " + roman2Int.romanToInt("IV"));
        System.out.println("Roman2Int Result: " + roman2Int.romanToInt("IX"));
        System.out.println("Roman2Int Result: " + roman2Int.romanToInt("LVIII"));
        System.out.println("Roman2Int Result: " + roman2Int.romanToInt("MCMXCIV"));
    }

    private static void testPalindrome() {
        Palindrome palindrome = new Palindrome();
        System.out.println("Palindrome Result: " + palindrome.isPalindrome(-121));
        System.out.println("Palindrome Result: " + palindrome.isPalindrome(0));
        System.out.println("Palindrome Result: " + palindrome.isPalindrome(121));
        System.out.println("Palindrome Result: " + palindrome.isPalindrome(122));
    }

    private static void test2Sum() {
        TwoSum twoSum = new TwoSum();
        int[] nums = {-3,4,3,90};
        int target = 0;
        int[] result = twoSum.twoSum(nums, target);
        System.out.println("TwoSum Result: [" + result[0] + ", " + result[1] + "]");
    }
}