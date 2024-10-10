package main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Teacher {
    public static final int MAX_TRIALS = 10;
    public int remainingTrials;
    public List<String> wordsList = new ArrayList<>();
    public Set<String> usedWordsSet = new HashSet<>();

    public int countAlphabet(String word, char alphabet) {
       int result = 0;
       for(char c : word.toCharArray()) {
           if (c == alphabet) result++;
       }
        return result;
    }

    public String fetchWord(int requestedLength) {
        String result = null;
        remainingTrials = MAX_TRIALS;
        for (String word: wordsList) {
            if(word.length() != requestedLength) continue;
            else if (usedWordsSet.add(word)) {
                result = word;
                break;
            }
        }
        return result;
    }

    public String fetchClue(String word) {
        StringBuilder clue = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            clue.append("-");
        }
        return clue.toString();
    }
}
