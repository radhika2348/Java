package com.marmin.app;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MultiTest{

    public  Multi test=new Multi();

    @Test

    void testMultiplyInt() {
        int expected = 35;
        int actual = test.multiply(5);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testMultiplyFloat() {
        float expected = 35.0f;
        float actual = test.multiply(5.0f);
        Assertions.assertEquals(expected, actual);  
    }

    @Test
    void testMultiplyDouble() {
        double expected = 35.0;
        double actual = test.multiply(5.0);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testMultiplyNegativeInt() {
        int expected = -35;
        int actual = test.multiply(-5);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testMultiplyNegativeFloat() {
        float expected = -35.0f;
        float actual = test.multiply(-5.0f);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testMultiplyNegativeDouble() {
        double expected = -35.0;
        double actual = test.multiply(-5.0);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testMultiplyZeroInt() {
        int expected = 0;
        int actual = test.multiply(0);
        Assertions.assertEquals(expected, actual);  
    }

}



        
    
