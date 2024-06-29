package com.selamkd.june.Simplecardgame;

import java.util.HashMap;

public class SimpleCardGame {
    public static void main(String[] args) {
        System.out.println(winner(new String[]{"A", "7", "8"}, new String[] {"K", "5", "9"}));
    }

    public static String winner(String[] deckSteve, String[] deckJosh){
        int scoreSteve = 0;
        int scoreJosh = 0;
        HashMap<Character, Integer> cardScoreMap = getCardScoreMap();
        for(int i = 0; i < deckSteve.length; i++){

            int steveCardScore = cardScoreMap.get(deckSteve[i].toUpperCase().charAt(0));
            int joshCardScore =  cardScoreMap.get(deckJosh[i].toUpperCase().charAt(0));


            if(steveCardScore > joshCardScore){
                scoreSteve++;
            }else if(joshCardScore > steveCardScore){
                scoreJosh++;
            }
        }

        if(scoreJosh == scoreSteve){
            return "Tie";
        }else if(scoreSteve > scoreJosh){
            return "Steve wins " + scoreSteve + " to " +  scoreJosh;
        }else{
            return "Josh wins " + scoreJosh + " to " +  scoreSteve;
        }

    }

    private static HashMap<Character, Integer> getCardScoreMap() {
        HashMap<Character, Integer> cardScoreMap = new HashMap<>();
        cardScoreMap.put('2', 2);
        cardScoreMap.put('3', 3);
        cardScoreMap.put('4', 4);
        cardScoreMap.put('5', 5);
        cardScoreMap.put('6', 6);
        cardScoreMap.put('7', 7);
        cardScoreMap.put('8', 8);
        cardScoreMap.put('9', 9);
        cardScoreMap.put('T', 10);
        cardScoreMap.put('J', 11);
        cardScoreMap.put('Q', 12);
        cardScoreMap.put('K', 13);
        cardScoreMap.put('A', 14);
        return cardScoreMap;
    }
}
