package com.selamkd.August.theoffice;

public class TheOffice_BrokenPhotocopier {

    public static String broken(final String x) {
        StringBuilder result = new StringBuilder();
        for(char ch : x.toCharArray()){
            if(ch == '0'){
                result.append("1");
            }else{
                result.append("0");
            }
        }
        return result.toString();
    }
}
