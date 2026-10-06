package com.marmin.app;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class SquareNoTest {

    public SquareNo test=new SquareNo();

    @Test
    void testPositiveNumber() {
         boolean expected =true;
         boolean actual = test.square(5) == 25;
         Assertions.assertEquals(expected, actual);
    }
    
    @Test
    void testNegativeNumber() {
         boolean expected =true;
         boolean actual = test.square(-5) == 25;
         Assertions.assertEquals(expected, actual);
    }

    @Test 
    void testSquare(){
         boolean expected =true;
         boolean actual = test.square(0) == 0;
         Assertions.assertEquals(expected, actual);

    }

    @Test 
    void testOneSquare(){
        boolean expected =true;
        boolean actual = test.square(1) == 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testPositiveNumber1() {
         boolean expected =true;
         boolean actual = test.square(4) == 16;
         Assertions.assertEquals(expected, actual);
    }

    @Test
    void testPositiveNumber2() {
         int expected =64;
         int actual = test.square(8);
         Assertions.assertEquals(expected, actual);
    }



}