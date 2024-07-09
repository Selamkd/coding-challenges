package com.selamkd.July.snail;

import java.util.ArrayList;

public class Snail {

    public static int[] snail(int[][] array) {
        ArrayList<Integer> result = new ArrayList<>();

        result.add(array[0][0]);
        result.add(array[0][1]);
        result.add(array[0][2]);
        result.add(array[1][2]);
        result.add(array[2][2]);
        result.add(array[2][1]);
        result.add(array[2][0]);
        result.add(array[1][0]);
        result.add(array[1][1]);

        return result.stream().mapToInt(i -> i ).toArray();
    }
}
