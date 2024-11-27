package main;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static String reverseWord(String word) {
        StringBuilder reversedWord = new StringBuilder();

        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWord.append(word.charAt(i));
        }
        return reversedWord.toString();
    }
}