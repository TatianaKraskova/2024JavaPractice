package test;

import main.Main;
import main.Teacher;
import org.junit.Test;
import static org.junit.Assert.*;

public class FirstTestIT {

    @Test
    public void testAddition() {
        int result = 2+4;
        assertEquals(6, result);
    }

    @Test
    public void alphabetCount() {
        String word = "pizza";
        char alphabet = 'a';
        Teacher teacher = new Teacher();
        int count = teacher.countAlphabet(word, alphabet);
        System.out.println("count: " + count);
        assertEquals(1, count);
    }

    @Test
    public void lengthOfFetchedWord(){
        Teacher teacher = new Teacher();
        String word = teacher.fetchWord(5);
        assertTrue(word.length() == 5);
    }

    @Test
    public void fetchClueBeforeGuess() {
        Teacher teacher = new Teacher();
        String clue = teacher.fetchClue("pizza");
        assertEquals( "-----", clue);
    }

    @Test
    public void getReversedWord() {
        new Main();
        String word = Main.reverseWord("pizza");
        System.out.println("reversed word: " + word);
        assertEquals("azzip", word);
    }

    @Test
    public void remainingTrialsBeforeAnyGuess() {
        Teacher teacher = new Teacher();
        int requestedLength = 0;
        teacher.fetchWord(requestedLength);
        assertEquals(Teacher.MAX_TRIALS, teacher.remainingTrials);
    }
}
