package com.selamkd.june;

public class HighestScoringWord {

    public static void main(String[] args) {


    }
    public static String getHighestScoringWord (String str){
        str = str.toLowerCase();
        String[] strArr = str.split(" ");
        String highestScoringWord = "";
        int highestScore = 0;
        for (String s : strArr) {
            int score = 0;
            for (int j = 0; j < s.length(); j++) {
                score += getCharScore(s.charAt(j));
            }
            if (score > highestScore) {
                highestScore = score;
                highestScoringWord = s;
            }
        }
        return highestScoringWord;
    }

    private static int getCharScore(char letter){
        char letterLower = Character.toLowerCase(letter);
        if(letterLower >= 'a' && letter <= 'z'){

                return letterLower - 'a' + 1;

        }
        return 0;
    }

}
