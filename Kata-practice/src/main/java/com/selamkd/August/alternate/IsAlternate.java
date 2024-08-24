package com.selamkd.August.alternate;

public class IsAlternate {
    public static void main(String[] args) {
        System.out.println(isAlt("banana"));
    }

    public static boolean isAlt(String word) {
        StringBuilder evenIndexed = new StringBuilder();
        StringBuilder oddIndexed = new StringBuilder();
        char[] wordArr = word.toCharArray();
        for (int i = 0; i < wordArr.length; i++) {
           if(i % 2 == 0){
               evenIndexed.append(wordArr[i]);
           }else{
               oddIndexed.append(wordArr[i]);
           }
        }
        if(evenIndexed.chars().allMatch(c -> "[aeiouAEIOU]".indexOf(c) >= 0)){
            return true;
        } else return evenIndexed.chars().allMatch(c -> "(?i)[b-df-hj-np-tv-z]".indexOf(c) >= 0);
    }
}
