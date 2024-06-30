package com.selamkd.June.maxdiff;

import java.util.Arrays;

public class MaxDiff {

    public static int maxDiff(int[] lst) {
  //  finding max value from the array using Math.max
        // finding min value using Math.min

        // max - min =  result. return result

        //  if array is null or less than 2 items return 0

        if(lst.length <= 1 ){
            return 0;
        }

        int max = Arrays.stream(lst).max().getAsInt();
        int min = Arrays.stream(lst).min().getAsInt();


        return max - min;
    }

}
