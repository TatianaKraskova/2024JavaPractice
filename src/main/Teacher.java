package main;

public class Teacher {
    public int countAlphabet(String word, char alphabet) {
       int result = 0;
       for(char c : word.toCharArray()) {
           if (c == alphabet) result++;
       }
        return result;
    }

    public String fetchWord() {
        return "pizza";
    }

    public String fetchClue(String word) {
        StringBuilder clue = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            clue.append("-");
        }
        return clue.toString();
    }
}
