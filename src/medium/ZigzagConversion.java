package medium;

/*
The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)
P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"
 */
public class ZigzagConversion {
    public String convert(String s, int numRows) {
        StringBuffer result = new StringBuffer();
        StringBuilder[] matrix = new StringBuilder[numRows];
        int iStep = 1;

        if(numRows <= 1) return s;

        for (int i = 0; i < numRows; i++) {
            matrix[i] = new StringBuilder();
        }

        for(int j = 0, i = 0; s.length() > j; j++, i+=iStep) {
            matrix[i].append(s.charAt(j));
            if(i <= 0) iStep = 1;
            if(i >= numRows-1) iStep = -1;
        }

        for(int i = 0; i < numRows; i++) {
            result.append(matrix[i]);
        }

        return result.toString();
    }
}