package com.selamkd.June.alphabetsymmetry;
import com.selamkd.June.highestscoringword.HighestScoringWord;
import java.util.ArrayList;


public class AlphabetSymmetry {
    public static int [] count_letters_in_position(String[] str){
        ArrayList<Integer> resultList = new ArrayList<>();
        for(String word : str){
            int count = 0;
            String strLower = word.toLowerCase();
            char[] wordCharArr = strLower.toCharArray();
            for(int i = 0; i < wordCharArr.length;  i++){
                int charPosition = HighestScoringWord.getCharPosition(wordCharArr[i]);
                if(i + 1 == charPosition){
                    count++;
                }
            }
            resultList.add(count);
        }

        return resultList.stream().mapToInt(i -> i ).toArray();
    }
}
