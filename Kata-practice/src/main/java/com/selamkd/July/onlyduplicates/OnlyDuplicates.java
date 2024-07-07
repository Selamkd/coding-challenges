package com.selamkd.July.onlyduplicates;


import java.util.HashMap;

public class OnlyDuplicates {

    public static String getOnlyDuplicates(String str) {

        char[] strChar = str.toCharArray();
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        StringBuilder result = new StringBuilder();

        for (char ch : strChar) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }
        for (char ch : strChar) {
            char lowerCh = Character.toLowerCase(ch);
            if (charCountMap.get(lowerCh) > 1) {
                result.append(ch);
            }
        }

        return result.toString();
    }
}
