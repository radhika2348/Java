package com.marmin.app;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Random;

class ScoreTest {
    public  Score test = new Score();
    Random randomGenerator = new Random();
    int score;

    @Test
    void testShouldReturnTrueForScoreGreaterThan40() {
        score = randomGenerator.nextInt(40, Integer.MAX_VALUE);

        boolean expected = true;
        boolean actual = test.isGreaterThan(score);

        assertEquals(expected, actual);
    }

    @Test
    void testShouldReturnFalseForScoreLessThan40() {
        score = randomGenerator.nextInt(Integer.MIN_VALUE, 40);

        boolean expected = false;
        boolean actual = test.isGreaterThan(score);

        assertEquals(expected, actual);
    }

    @Test
    void testShouldReturnTrueForScoreExactly40() {
        score = 40;

        boolean expected = true;
        boolean actual = test.isGreaterThan(score);

        assertEquals(expected, actual);
    }

    @Test
    void testShouldNotReturnTrueForScoreLessThan40() {
        score = randomGenerator.nextInt(Integer.MIN_VALUE, 40);

        boolean expected = true;
        boolean actual = test.isGreaterThan(score);

        assertNotEquals(expected, actual);
    }

    @Test
    void testShouldNotReturnFalseForScoreGreaterThan40() {
        score = randomGenerator.nextInt(40, Integer.MAX_VALUE);

        boolean expected = false;
        boolean actual = test.isGreaterThan(score);

        assertNotEquals(expected, actual);
    }

}