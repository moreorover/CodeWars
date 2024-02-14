package kata.kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClassResultsTests {
    @Test
    void tests() {
        assertTrue(ClassResults.betterThanAverage(new int[]{2, 3}, 5));
        assertTrue(ClassResults.betterThanAverage(new int[]{100, 40, 34, 57, 29, 72, 57, 88}, 75));
        assertTrue(ClassResults.betterThanAverage(new int[] {12, 23, 34, 45, 56, 67, 78, 89, 90}, 69));
        assertFalse(ClassResults.betterThanAverage(new int[]{100, 90}, 11));
    }
}
