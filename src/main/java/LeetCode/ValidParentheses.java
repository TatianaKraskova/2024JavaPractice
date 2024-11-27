/*
20. Valid Parentheses
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
determine if the input string is valid.

An input string is valid if:
Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
 */
package main.LeetCode;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String s1 = "()";
        System.out.println(isValid(s1));
        String s2 = "(]";
        System.out.println(isValid(s2));
    }

    public static boolean isValid(String s) {
        if (s.isEmpty()) {
            return false; // An empty string is considered invalid
        }

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // If the character is an opening bracket, push it onto the stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            // If the character is a closing bracket, check if it matches the top of the stack
            else if (ch == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (ch == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (ch == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else {
                return false; // Either unmatched closing bracket or incorrect order
            }
        }

        // If the stack is empty, all opening brackets were matched and closed
        return stack.isEmpty();
    }
}



        //        boolean input = false;
//        if (s.isEmpty()) {
//            return false;
//        }
//
//        for (int i = 0; i < s.length(); i++) {
//            if (
//                    (s.charAt(i) == ('(') & s.charAt(i + 1) == (')')) ||
//                            (s.charAt(i) == ('{') & s.charAt(i + 1) == ('}')) ||
//                            (s.charAt(i) == ('[') & s.charAt(i + 1) == (']'))
//            ) {
//                return true;
//            } else
//                return false;
//
//        }
//        return input;
