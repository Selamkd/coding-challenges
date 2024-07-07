package com.selamkd.July.alternateCapitalization;

import java.util.ArrayList;
import java.util.Arrays;

public class AlternateCapitilization {


    public static String[] captialize(String str){
        String [] result = new String[2];
        ArrayList<String> evenCaptializeList = new ArrayList<>();
        ArrayList<String> oddCaptializeList = new ArrayList<>();
        char[] charArr = str.toCharArray();
        for(int i = 0; i < charArr.length; i++){
            String charUpperCased = String.valueOf(Character.toUpperCase(charArr[i]));
            if( i % 2 == 0){
                evenCaptializeList.add(charUpperCased);
            }else{
                oddCaptializeList.add(charUpperCased);
            }
        }

        result[0] = Arrays.toString(evenCaptializeList.toArray(String[]::new));
        result[1] =  Arrays.toString(oddCaptializeList.toArray(String[]::new));
        return result;
    }
}
