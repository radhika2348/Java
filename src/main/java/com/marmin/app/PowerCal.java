package com.marmin.app;

class PowerCal{

    public static int CalculatePower(int base,int exponent){

        int sum=1;

        for(int i=1;i<=exponent;i++){
            sum*=base;
        }
        return sum;

    }
}
