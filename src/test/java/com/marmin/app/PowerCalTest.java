package com.marmin.app;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Random;
import java.lang.Math.*;



    public class PowerCalTest{

        public PowerCal power=new PowerCal();

        Random randno=new Random();

        int base,exponent;

        @Test

        void calculatePowerOfaNumber(){
            base=randno.nextInt(1,39);
            exponent=randno.nextInt(1,10);
            double expected=Math.pow(base,exponent);

            double actual=power.CalculatePower(base,exponent);
            assertEquals(expected,actual);
            
        }

    }
