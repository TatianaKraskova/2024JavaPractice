//Given a string s consisting of words and spaces,
// return the length of the last word in the string.

package main.LeetCode;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(lengthOfLastWord(s));
    }

    public static int lengthOfLastWord(String s) {
        int wordLength = 0;
        String trimmedString = s.trim();
        for (int i = trimmedString.length() - 1; i >= 0; i--) {
            if(trimmedString.charAt(i) == ' ') {
                break;
            }
            wordLength++;
        }
        return wordLength;
    }
}
