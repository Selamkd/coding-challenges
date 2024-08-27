package com.selamkd.August.duplicate_encoder;

import java.util.HashMap;
import java.util.HashSet;

public class DuplicateEncoder {
    public static void main(String[] args) {
        System.out.println(encode("Prespecialized"));
    }
   public static String encode(String word){
        String wordLower = word.toLowerCase();
        HashMap<Character, Integer> wordMap = new HashMap<>();
        StringBuilder result = new StringBuilder();
        for(char ch : wordLower.toCharArray()){
            wordMap.put(ch, wordMap.getOrDefault(ch, 0) + 1);
        }
        for(char ch : wordLower.toCharArray()) {
            if (wordMap.get(ch) > 1) {
                result.append(')');
            } else {
                result.append('(');
            }
        }
        return result.toString();
    }
}
