package com.selamkd.August.rowweights;

import java.util.Arrays;

public class RowWeights {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(rowWeights(new int[]{13, 27, 49})));
    }
    public static int[] rowWeights (final int[] weights)
    {
        int team1weight = 0;
        int team2weight = 0;

        for(int i = 0; i < weights.length; i++){
            if(i % 2 != 0){
                team2weight+=weights[i];
            }else{
                team1weight+=weights[i];
            }
        }
        return new int[]{team1weight, team2weight};
    }

}
