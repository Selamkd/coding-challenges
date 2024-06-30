package com.selamkd.May;

public class ConsonantsToUpperCase {

    public static String consonantsToUpperCase(String str){
        StringBuilder result = new StringBuilder();
        for(char ch : str.toCharArray()){
            if(isVowel(ch)){
                result.append(ch);
            }else if(Character.isLetter(ch)){
                char upper = Character.toUpperCase(ch);
                result.append(upper);
            }else{
                result.append(ch);
            }
        }
        return result.toString();
    }

    private static boolean isVowel(char letter){
        return "[aeiouAEIOU]".indexOf(letter) != -1;
    }
}
