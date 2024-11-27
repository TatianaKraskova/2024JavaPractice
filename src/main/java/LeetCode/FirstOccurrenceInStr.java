package main.LeetCode;

//28. Find the Index of the First Occurrence in a String

// Given two strings needle and haystack,
// return the index of the first occurrence of needle in haystack,
// or -1 if needle is not part of haystack.

public class FirstOccurrenceInStr {
    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";
        System.out.println(strStr(haystack,needle));
    }

    public static int strStr(String haystack, String needle) {
        if(needle.isEmpty()) {
            return 0;
        }
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}
