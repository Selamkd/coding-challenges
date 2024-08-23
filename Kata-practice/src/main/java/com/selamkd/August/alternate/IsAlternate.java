package com.selamkd.August.alternate;

public class IsAlternate {
    public static void main(String[] args) {
        System.out.println(isAlt("banana"));
    }
    public static boolean isAlt(String word) {
        String firstLetter = String.valueOf(word.charAt(0));
        String lastLetter =   String.valueOf(word.charAt(word.length() - 1));
        if(isVowel(firstLetter) && !isVowel(lastLetter) || !isVowel(firstLetter) && isVowel(lastLetter)){
            return true;
        }
        return false;
    }

    private static boolean isVowel(String c){
        String VOWELS = "aeiouAEIOU";
        return VOWELS.contains(c);
    }
}
