package easy;

/*
Given an integer x, return true if x is a palindrome (it reads the same forward and backward), and false otherwise.
 */
public class Palindrome {
    public boolean isPalindrome(int x) {
        boolean result = false;

        if (!(x < 0 || (x % 10 == 0 && x != 0))) {
            int reversedHalf = 0;

            while(x > reversedHalf) {
                reversedHalf = reversedHalf * 10 + x % 10;
                x /= 10;
            }

            result = (x == reversedHalf || x == reversedHalf / 10);
        }

        return result;
    }
}
