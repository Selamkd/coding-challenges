package com.selamkd.May;

public class GetSumOfNumsDivisibleByTwoAndThree {
    public static int getSumOfNumsDivisbleByTwoAndThree(int [] numbers){
        int sum = 0;
        for(int num : numbers){
            if(num % 6 == 0){
                sum+=num;
            }
        }

        return sum;
    }
}
