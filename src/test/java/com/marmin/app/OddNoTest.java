package com.marmin.app;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Random;

public class OddNoTest{

    public OddNo odd=new OddNo();

    Random randno=new Random();

    int num;

    @Test

    void countNoOfOddNumbers(){
        num=randno.nextInt(1,Integer.MAX_VALUE);
        int actual=odd.NoOfEvenNumbers(num);
        int expected=num/2;
        assertEquals(actual,expected);
    }


}