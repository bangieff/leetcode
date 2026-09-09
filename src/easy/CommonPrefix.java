package easy;

/*
Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".
 */
public class CommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String result = "";

        for(int i = 0; i < strs[0].length(); i++) {
            Character currentChar = strs[0].charAt(i);
            for(int j = 1; j < strs.length; j++) {
                if(strs[j].length() <= i || strs[j].charAt(i) != currentChar) {
                    currentChar = null;
                    break;
                }
            }
            if(currentChar != null) {
                result += currentChar;
            }
            else {
                break;
            }
        }

        return result;
    }
}
