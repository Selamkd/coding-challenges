package com.selamkd.August.alternate;

public class IsAlternate {
    public static void main(String[] args) {
        System.out.println(isAlt("banana"));
    }
    public static boolean isAlt(String word) {
        boolean result = false;
        String[] wordArr = word.split("");
        for(int i = 0; i < wordArr.length; i+=2){
            if(isVowel(wordArr[i + 1]) && !isVowel(wordArr[i])){
               result = true;
            } else if(isVowel(wordArr[i]) && !isVowel(wordArr[i + 1])){
                result = true;
            }else{
                result = false;
            }
        }
        return result;
    }

    private static boolean isVowel(String c){
        String VOWELS = "aeiouAEIOU";
        return VOWELS.contains(c);
    }
}
