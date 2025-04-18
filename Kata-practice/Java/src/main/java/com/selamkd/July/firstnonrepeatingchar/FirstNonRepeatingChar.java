package com.selamkd.July.firstnonrepeatingchar;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingChar {

    public static String firstNonRepeatingChar(String str) {
        HashMap<Character, Integer>  countDuplicates = new HashMap<>();
        char[] charArr = str.toCharArray();

        for(char ch : charArr){
            char lowerCh = Character.toLowerCase(ch);
            countDuplicates.put(lowerCh, countDuplicates.getOrDefault(lowerCh,0) + 1);
        }


        for(char ch: charArr) {
          char lowerCh = Character.toLowerCase(ch);
            if( countDuplicates.get(lowerCh) == 1){
               return String.valueOf(ch);
            }
        }
        return " ";
    }
}
