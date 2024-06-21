package com.selamkd.may;

public class CountVowelsAndConsonants {
  public static int [] countVowelsAndConsonants(String str){
    int[] result = new int[2];

    for(char ch : str.toCharArray()){
      if(String.valueOf(ch).matches("[aeiouAEIOU]")){
        result[0]++;
      }else{
        result[1]++;
      }

    }
    return result;
  }
}

