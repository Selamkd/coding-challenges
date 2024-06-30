package com.selamkd.June.maxdiff;

import java.util.Arrays;

public class MaxDiff {

    public static int maxDiff(int[] lst) {

        if(lst.length <= 1 ){
            return 0;
        }

        int max = Arrays.stream(lst).max().getAsInt();
        int min = Arrays.stream(lst).min().getAsInt();


        return max - min;
    }

}
