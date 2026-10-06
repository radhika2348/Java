package com.marmin.app;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ScoreTest {
    public  Score score = new Score();

    @Test
    void isPassingGreater() {
        boolean expected = true;
        boolean actual = score.isGreaterThan(50);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void isPassinglesser(){
        boolean expected=false;
        boolean actual=score.isGreaterThan(30);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void isPassingEqual(){
        boolean expected=true;
        boolean actual=score.isGreaterThan(40);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void isPassingless(){
        boolean expected=false;
        boolean actual=score.isGreaterThan(39);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void isPassingZero(){
        boolean expected=false;
        boolean actual=score.isGreaterThan(0);
        Assertions.assertEquals(expected,actual);
    }



}