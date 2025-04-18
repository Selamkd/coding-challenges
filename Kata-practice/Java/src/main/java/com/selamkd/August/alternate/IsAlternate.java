package com.selamkd.August.alternate;

import static com.selamkd.May.ConsonantsToUpperCase.isVowel;

public class IsAlternate {
    public static void main(String[] args) {
        System.out.println(isAlt("apple"));
    }

    public static boolean isAlt(String word) {

        char[] wordArr = word.toCharArray();
        for (int i = 0; i < wordArr.length - 1; i++) {
            for (int j = i + 1; j < wordArr.length; j++) {
                if(isVowel(wordArr[i]) && !isVowel(wordArr[j])){
                    return true;
                }
                if(isVowel(wordArr[j]) && !isVowel(wordArr[i])) {
                    return true;
                }
                break;
            }
        }
        return false;
    }

}
