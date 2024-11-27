package main.LeetCode;

public class Palindrome {
    public static void main(String[] args) {
        int x = 121;
        int y = -121;
        System.out.println("is Palindrome 1: " + isPalindrome(x));
        System.out.println("is Palindrome 2: " + isPalindrome(y));
    }

    public static boolean isPalindrome(int x) {
        if (x < 0 || x % 10 == 0 && x != 0) {
            return false;
        }
        int reverseNum = 0;

        while (x > reverseNum) {
            reverseNum = reverseNum * 10 + x % 10;
            x /= 10;
        }
        return x == reverseNum || x == reverseNum / 10;
    }
}
