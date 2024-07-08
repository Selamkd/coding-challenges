package com.selamkd.July.alternateCapitalization;


public class AlternateCapitalization {
    public static String[] capitalize(String str){
        StringBuilder evenIndexed = new StringBuilder();
        StringBuilder oddIndexed = new StringBuilder();
        String [] result = new String[2];
        for(int i = 0; i < str.length(); i++){
            if( i % 2 == 0){
              evenIndexed.append(Character.toUpperCase(str.charAt(i)));
              oddIndexed.append(str.charAt(i));
            }else{
                oddIndexed.append(Character.toUpperCase(str.charAt(i)));
                evenIndexed.append(str.charAt(i));
            }
        }
        result[0] = evenIndexed.toString();
        result[1] = oddIndexed.toString();

        return result;
    }
}
