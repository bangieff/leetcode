package easy;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
 */
public class ValidParentheses {
    public boolean isValid(String s) {
        boolean result = true;

        Deque<Character> queue = new ArrayDeque<>();

        for(char c : s.toCharArray()) {
            switch (c) {
                case '(':
                case '{':
                case '[':
                    queue.add(c);
                    break;
                case ')':
                    if (queue.isEmpty() || queue.pollLast() != '(') {
                        result = false;
                    }
                    break;
                case '}':
                    if (queue.isEmpty() || queue.pollLast() != '{') {
                        result = false;
                    }
                    break;
                case ']':
                    if (queue.isEmpty() || queue.pollLast() != '[') {
                        result = false;
                    }
                    break;
            }

            if (result == false) {
                break;
            }
        }

        if(result && !queue.isEmpty()) {
            result = false;
        }

        return result;
    }
}
