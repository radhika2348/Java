package com.marmin.app;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CompareTest {

    public Compare test=new Compare();

    @Test
    void testCompareGreater() {
        int expected = 1;
        int actual = test.compareNum(5, 3);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testCompareLesser() {
        int expected = -1;
        int actual = test.compareNum(2, 4);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testCompareEqual() {
        int expected = 0;
        int actual = test.compareNum(7, 7);
        Assertions.assertEquals(expected, actual);
    }
}