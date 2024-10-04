package test;

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
    public void alphabetCountIT() {
        String word = "pizza";
        char alphabet = 'a';
        Teacher teacher = new Teacher();
        int count = teacher.countAlphabet(word, alphabet);
        System.out.println("count: " + count);
        assertEquals(1, count);
    }
}
