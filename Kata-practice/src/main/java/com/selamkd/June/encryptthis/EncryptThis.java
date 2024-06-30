package com.selamkd.June.encryptthis;

public class EncryptThis {

    public static String encrypt(String input) {
         if(input.isEmpty()){
             return input;
         }
        String[] strArr = input.split(" ");

        for (int i = 0; i < strArr.length; i++) {
            String word = strArr[i];
            int ascii = word.charAt(0);
            if(word.length() > 1) {
                StringBuilder newWord = new StringBuilder(word);
                char secondChar = newWord.charAt(1);
                char lastChar = newWord.charAt(newWord.length() - 1);
                newWord.setCharAt(1, lastChar);
                newWord.setCharAt(newWord.length()  - 1, secondChar);

                word = ascii + newWord.substring(1);
            }else{
                word = String.valueOf(ascii);
            }

            strArr[i] = word;
        }


        return String.join(" ", strArr);
    }
}
