package com.selamkd.July.snail;

import java.util.ArrayList;

public class Snail {

    public static int[] snail(int[][] array) {
        ArrayList<Integer> result = new ArrayList<>();
        // 1239

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[0][i]);
        }


        for(int i = 0; i < array.length; i++){
         System.out.println(array[i][array.length - 1]);

        }

        for (int i = 0; i < array.length; i++) {
            // reverse before adding
            System.out.println(array[array.length - 1][i]);
        }


        return result.stream().mapToInt(i -> i ).toArray();
    }
}
