import easy.CommonPrefix;
import easy.Palindrome;
import easy.Roman2Int;
import easy.TwoSum;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        TwoSum twoSum = new TwoSum();
        int[] nums = {-3,4,3,90};
        int target = 0;
        int[] result = twoSum.twoSum(nums, target);
        System.out.println("TwoSum Result: [" + result[0] + ", " + result[1] + "]");

        Palindrome palindrome = new Palindrome();
        System.out.println("Palindrome Result: " + palindrome.isPalindrome(-121));
        System.out.println("Palindrome Result: " + palindrome.isPalindrome(0));
        System.out.println("Palindrome Result: " + palindrome.isPalindrome(121));
        System.out.println("Palindrome Result: " + palindrome.isPalindrome(122));

        Roman2Int roman2Int = new Roman2Int();
        System.out.println("Roman2Int Result: " + roman2Int.romanToInt("III"));
        System.out.println("Roman2Int Result: " + roman2Int.romanToInt("IV"));
        System.out.println("Roman2Int Result: " + roman2Int.romanToInt("IX"));
        System.out.println("Roman2Int Result: " + roman2Int.romanToInt("LVIII"));
        System.out.println("Roman2Int Result: " + roman2Int.romanToInt("MCMXCIV"));

        CommonPrefix commonPrefix = new CommonPrefix();
        System.out.println("CommonPrefix Result: " + commonPrefix.longestCommonPrefix(new String[]{"ab","a"}));
        System.out.println("CommonPrefix Result: " + commonPrefix.longestCommonPrefix(new String[]{"flower","flow","flight"}));
        System.out.println("CommonPrefix Result: " + commonPrefix.longestCommonPrefix(new String[]{"dog","racecar","car"}));
    }
}