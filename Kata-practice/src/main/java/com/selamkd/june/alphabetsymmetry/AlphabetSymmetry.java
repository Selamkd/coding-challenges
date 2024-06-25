package com.selamkd.june.alphabetsymmetry;

import java.util.ArrayList;
import java.util.Arrays;

public class AlphabetSymmetry {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(count_letters_in_position(new String[]{"abode", "ABc", "xyzD"})));
    }




    public static int [] count_letters_in_position(String[] str){
        ArrayList<Integer> resultList = new ArrayList<>();

        for(String word : str){
            int count = 0;
            String strLower = word.toLowerCase();
            char[] wordCharArr = strLower.toCharArray();

            for(int i = 0; i < wordCharArr.length;  i++){
                int charPosition = getCharPosition(wordCharArr[i]);
                if(i + 1 == charPosition){
                    count++;
                }
            }
            resultList.add(count);
        }

        return resultList.stream().mapToInt(i -> i ).toArray();
    }

    private static int getCharPosition(char letter) {
        char letterLower = Character.toLowerCase(letter);
        if (letterLower >= 'a' && letter <= 'z') {

            return letterLower - 'a' + 1;

        }
        return 0;
    }
}
