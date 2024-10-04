package main;

public class Teacher {
    public int countAlphabet(String word, char alphabet) {
       int result = 0;
       for(char c : word.toCharArray()) {
           if (c == alphabet) result++;
       }
        return result;
    }
}
