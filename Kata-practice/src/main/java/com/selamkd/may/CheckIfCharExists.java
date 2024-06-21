package com.selamkd.may;

public class CheckIfCharExists {
    public static boolean charExists(String str, char letter){
        if(str == null){
            return false;
        }
        for(char ch : str.toCharArray()){
            if(letter == ch){
                return true;
            }
        }
        return false;
        // return str.indexOf(letter) != - 1;
    }
}
