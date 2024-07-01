package com.selamkd.July.firstnonrepeatingchar;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingChar {

    public static String firstNonRepeatingChar(String str) {
        HashMap<Character, Integer>  countDuplicates = new HashMap<>();
        String result = " ";
        char[] charArr = str.toCharArray();

        for(char ch : charArr){
            countDuplicates.put(ch, countDuplicates.getOrDefault(ch,0) + 1);
        }


        for(Map.Entry<Character, Integer> entry : countDuplicates.entrySet()) {
            int count = entry.getValue();
            char letter = entry.getKey();
            if(count <= 1){
                result = String.valueOf(letter);
            }
        }
        return result;
    }
}
